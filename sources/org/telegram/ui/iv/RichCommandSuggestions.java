package org.telegram.ui.iv;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.iv.RichCommand;

/* loaded from: classes3.dex */
public class RichCommandSuggestions {
    private RichTextCell backgroundCell;
    private RichTextCell cell;
    private LinearLayout content;
    private final MenuFactory menuFactory;
    private ItemOptions options;
    private final Theme.ResourcesProvider resourcesProvider;
    private ArrayList shown;

    public interface MenuFactory {
        ItemOptions make(View view);
    }

    public RichCommandSuggestions(MenuFactory menuFactory, Theme.ResourcesProvider resourcesProvider) {
        this.menuFactory = menuFactory;
        this.resourcesProvider = resourcesProvider;
    }

    public void update(RichTextCell richTextCell, String str) {
        ItemOptions itemOptions;
        ItemOptions itemOptions2;
        if (str == null) {
            hide();
            return;
        }
        ArrayList match = RichCommand.match(str);
        if (match.isEmpty()) {
            hide();
            return;
        }
        setBackgroundCell(richTextCell);
        if (this.cell == richTextCell && match.equals(this.shown) && (itemOptions2 = this.options) != null && itemOptions2.isShown()) {
            return;
        }
        if (this.cell == richTextCell && (itemOptions = this.options) != null && itemOptions.isShown() && this.content != null) {
            this.shown = match;
            populate(richTextCell, match);
            this.options.reposition();
        } else {
            hide();
            setBackgroundCell(richTextCell);
            this.cell = richTextCell;
            this.shown = match;
            show(richTextCell, match);
        }
    }

    private void show(RichTextCell richTextCell, ArrayList arrayList) {
        LinearLayout linearLayout = new LinearLayout(richTextCell.getContext());
        this.content = linearLayout;
        linearLayout.setOrientation(1);
        populate(richTextCell, arrayList);
        ItemOptions drawScrim = this.menuFactory.make(richTextCell.getEditText()).dontFocus().setDimAlpha(0).setDrawScrim(false);
        drawScrim.addView(this.content, LayoutHelper.createLinear(NotificationCenter.starGiveawayOptionsLoaded, -2));
        drawScrim.setMaxHeight(AndroidUtilities.dp(240.0f));
        drawScrim.setGravity(3);
        drawScrim.translate(-AndroidUtilities.dp(12.0f), 0.0f);
        drawScrim.setOnDismiss(new Runnable() { // from class: org.telegram.ui.iv.RichCommandSuggestions$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichCommandSuggestions.this.lambda$show$0();
            }
        });
        drawScrim.followScrimView();
        drawScrim.show();
        this.options = drawScrim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.options = null;
        this.content = null;
        this.shown = null;
        this.cell = null;
        setBackgroundCell(null);
    }

    private void populate(final RichTextCell richTextCell, ArrayList arrayList) {
        LinearLayout linearLayout = this.content;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final RichCommand richCommand = (RichCommand) it.next();
            RichCommand.View view = new RichCommand.View(richTextCell.getContext(), richCommand, this.resourcesProvider);
            view.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            view.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 0));
            view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichCommandSuggestions$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RichCommandSuggestions.this.lambda$populate$1(richTextCell, richCommand, view2);
                }
            });
            this.content.addView(view, LayoutHelper.createLinear(-1, 48));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$populate$1(RichTextCell richTextCell, RichCommand richCommand, View view) {
        hide();
        richTextCell.selectCommand(richCommand);
    }

    public void hide() {
        setBackgroundCell(null);
        ItemOptions itemOptions = this.options;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.options = null;
        }
        this.content = null;
        this.shown = null;
        this.cell = null;
    }

    private void setBackgroundCell(RichTextCell richTextCell) {
        RichTextCell richTextCell2 = this.backgroundCell;
        if (richTextCell2 == richTextCell) {
            return;
        }
        if (richTextCell2 != null) {
            richTextCell2.setShowCommandBackground(false);
        }
        this.backgroundCell = richTextCell;
        if (richTextCell != null) {
            richTextCell.setShowCommandBackground(true);
        }
    }
}
