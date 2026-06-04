package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

/* loaded from: classes3.dex */
public class RichDividerCell extends View implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private BlockRow currentRow;
    private Delegate delegate;
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;
    private Layout stubLayout;
    private final TextPaint stubPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();
    }

    public RichDividerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint(1);
        this.selectionPaint = new Paint(1);
        TextPaint textPaint = new TextPaint();
        this.stubPaint = textPaint;
        this.resourcesProvider = resourcesProvider;
        textPaint.setTextSize(1.0f);
        updateColors();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        if (this.stubLayout == null) {
            this.stubLayout = new StaticLayout("•", this.stubPaint, Math.max(1, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        final Layout layout = this.stubLayout;
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichDividerCell.1
            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public /* synthetic */ CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getRow() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getX() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getY() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public Layout getLayout() {
                return layout;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(24.0f));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.stubLayout = null;
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (isCellSelected()) {
            canvas.drawRoundRect(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.selectionPaint);
        }
        int measuredHeight = getMeasuredHeight() / 2;
        canvas.drawRect(AndroidUtilities.dp(16.0f), measuredHeight - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), measuredHeight + 1, this.paint);
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public RichDividerCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDividerCell(context, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichDividerCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = blockRow;
            ofFactory.object2 = delegate;
            return ofFactory;
        }
    }
}
