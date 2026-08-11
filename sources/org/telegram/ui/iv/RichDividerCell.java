package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
public class RichDividerCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private boolean blockRtl;
    private Delegate delegate;
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return Theme.Colorable.-CC.$default$getColorKeys(this);
    }

    public RichDividerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint(1);
        this.selectionPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.iv.RichBlockCell
    protected void onBlockInsetChanged(int i) {
        invalidate();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.blockRtl = RichBlockChrome.rtl();
        bindBlockInset(blockRow);
    }

    private int regionLo() {
        if (this.blockRtl) {
            return 0;
        }
        return blockInset();
    }

    private int regionHi() {
        return getMeasuredWidth() - (this.blockRtl ? blockInset() : 0);
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.paint.setColor(Theme.getColor(Theme.key_chat_inDivider, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        int regionLo = regionLo();
        int regionHi = (regionHi() - regionLo) / 4;
        arrayList.add(RichBlockSelection.of((regionLo + regionHi) - AndroidUtilities.dp(12.0f), 0, (regionHi() - regionHi) + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int regionLo = regionLo();
        int regionHi = (regionHi() - regionLo) / 4;
        int i = regionLo + regionHi;
        int regionHi2 = regionHi() - regionHi;
        if (isCellSelected()) {
            canvas.drawRoundRect(i - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + regionHi2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.selectionPaint);
        }
        float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i, dp, regionHi2, AndroidUtilities.dp(1.0f) + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.paint);
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
