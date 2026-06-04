package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellGrid;

/* loaded from: classes3.dex */
public class RichTableCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final TextView addColumnButton;
    private final TextView addRowButton;
    private CellSelectionListener cellSelectionListener;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichTableCellGrid grid;
    private boolean hijackingSelection;
    private TableModel model;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ScrollContent scrollContent;
    private final HorizontalScrollView scrollView;
    private final LinkedHashSet selectedCells;
    private final ArrayList tmpBlocks;

    public interface CellSelectionListener {
        void onCellSelectionChanged(RichTableCell richTableCell);
    }

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void onTextChanged(BlockRow blockRow);
    }

    public RichTableCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.selectedCells = new LinkedHashSet();
        this.resourcesProvider = resourcesProvider;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) { // from class: org.telegram.ui.iv.RichTableCell.1
            @Override // android.view.View
            protected void onScrollChanged(int i, int i2, int i3, int i4) {
                TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
                super.onScrollChanged(i, i2, i3, i4);
                if (RichTableCell.this.delegate != null && (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode()) {
                    selectionHelper.invalidate();
                }
                invalidate();
            }
        };
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 6.0f));
        RichTableCellGrid richTableCellGrid = new RichTableCellGrid(context, resourcesProvider);
        this.grid = richTableCellGrid;
        TextView makeAddButton = makeAddButton(context, new View.OnClickListener() { // from class: org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichTableCell.this.lambda$new$0(view);
            }
        });
        this.addRowButton = makeAddButton;
        TextView makeAddButton2 = makeAddButton(context, new View.OnClickListener() { // from class: org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichTableCell.this.lambda$new$1(view);
            }
        });
        this.addColumnButton = makeAddButton2;
        ScrollContent scrollContent = new ScrollContent(context);
        this.scrollContent = scrollContent;
        scrollContent.addView(richTableCellGrid);
        scrollContent.addView(makeAddButton2);
        scrollContent.addView(makeAddButton);
        horizontalScrollView.addView(scrollContent, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        addRow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        addColumn();
    }

    private TextView makeAddButton(Context context, View.OnClickListener onClickListener) {
        TextView textView = new TextView(context);
        textView.setText("+");
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
        textView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 2));
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    private final class ScrollContent extends ViewGroup {
        ScrollContent(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int dp = AndroidUtilities.dp(32.0f);
            RichTableCell.this.grid.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - dp), TLObject.FLAG_31), i2);
            int measuredWidth = RichTableCell.this.grid.getMeasuredWidth();
            int measuredHeight = RichTableCell.this.grid.getMeasuredHeight();
            RichTableCell.this.addColumnButton.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
            RichTableCell.this.addRowButton.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
            setMeasuredDimension(measuredWidth + dp, measuredHeight + dp);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth = RichTableCell.this.grid.getMeasuredWidth();
            int measuredHeight = RichTableCell.this.grid.getMeasuredHeight();
            RichTableCell.this.grid.layout(0, 0, measuredWidth, measuredHeight);
            RichTableCell.this.addColumnButton.layout(measuredWidth, 0, RichTableCell.this.addColumnButton.getMeasuredWidth() + measuredWidth, measuredHeight);
            RichTableCell.this.addRowButton.layout(0, measuredHeight, measuredWidth, RichTableCell.this.addRowButton.getMeasuredHeight() + measuredHeight);
        }
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TableModel tableModel = new TableModel((TL_iv.pageBlockTable) pageBlock);
            this.model = tableModel;
            this.grid.setModel(tableModel);
            RichTableCellGrid richTableCellGrid = this.grid;
            final LinkedHashSet linkedHashSet = this.selectedCells;
            Objects.requireNonNull(linkedHashSet);
            richTableCellGrid.setSelectionProvider(new RichTableCellGrid.CellSelectionProvider() { // from class: org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.iv.RichTableCellGrid.CellSelectionProvider
                public final boolean isSelected(TL_iv.pageTableCell pagetablecell) {
                    return linkedHashSet.contains(pagetablecell);
                }
            });
            wireCellListeners();
            updateColors();
            this.scrollContent.requestLayout();
        }
    }

    public void addRow() {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        tableModel.addRow();
        refreshAfterModelChange();
    }

    public void addColumn() {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        tableModel.addColumn();
        refreshAfterModelChange();
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.selectedCells;
    }

    public boolean hasCellSelection() {
        return !this.selectedCells.isEmpty();
    }

    public void clearCellSelection() {
        if (this.selectedCells.isEmpty()) {
            return;
        }
        this.selectedCells.clear();
        this.grid.invalidate();
        notifyCellSelectionChanged();
    }

    public void toggleCellSelection(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell == null) {
            return;
        }
        if (!this.selectedCells.remove(pagetablecell)) {
            this.selectedCells.add(pagetablecell);
        }
        this.grid.invalidate();
        notifyCellSelectionChanged();
    }

    public void addCellToSelection(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell != null && this.selectedCells.add(pagetablecell)) {
            this.grid.invalidate();
            notifyCellSelectionChanged();
        }
    }

    public void setCellSelectionListener(CellSelectionListener cellSelectionListener) {
        this.cellSelectionListener = cellSelectionListener;
    }

    private void notifyCellSelectionChanged() {
        CellSelectionListener cellSelectionListener = this.cellSelectionListener;
        if (cellSelectionListener != null) {
            cellSelectionListener.onCellSelectionChanged(this);
        }
    }

    public TL_iv.pageTableCell findCellAt(int i, int i2) {
        if (this.model == null) {
            return null;
        }
        int left = ((i - this.scrollView.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = (i2 - this.scrollView.getTop()) - this.grid.getTop();
        for (int i3 = 0; i3 < this.grid.getChildCount(); i3++) {
            View childAt = this.grid.getChildAt(i3);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (left >= richTableCellHost.getLeft() && left < richTableCellHost.getRight() && top >= richTableCellHost.getTop() && top < richTableCellHost.getBottom()) {
                    return richTableCellHost.cell;
                }
            }
        }
        return null;
    }

    public boolean isPressOnText(int i, int i2) {
        RichTableCellHost hostForAnchor;
        int lineForVertical;
        TL_iv.pageTableCell findCellAt = findCellAt(i, i2);
        if (findCellAt == null || (hostForAnchor = this.grid.hostForAnchor(findCellAt)) == null) {
            return false;
        }
        int left = ((i - this.scrollView.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = (i2 - this.scrollView.getTop()) - this.grid.getTop();
        int left2 = (left - hostForAnchor.getLeft()) - hostForAnchor.editText.getLeft();
        int top2 = (top - hostForAnchor.getTop()) - hostForAnchor.editText.getTop();
        Layout layout = hostForAnchor.editText.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingTop = top2 - hostForAnchor.editText.getPaddingTop();
        int paddingLeft = left2 - hostForAnchor.editText.getPaddingLeft();
        if (paddingTop < 0 || paddingTop >= layout.getHeight() || (lineForVertical = layout.getLineForVertical(paddingTop)) < 0 || lineForVertical >= layout.getLineCount()) {
            return false;
        }
        float f = paddingLeft;
        return f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical);
    }

    public void applyHeaderToggle(boolean z) {
        BlockRow blockRow;
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            TableModel.setHeader(pagetablecell, z);
            RichTableCellHost hostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (hostForAnchor != null) {
                hostForAnchor.refreshFromCell();
            }
        }
        this.grid.invalidate();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public void refreshAfterModelChange() {
        BlockRow blockRow;
        this.grid.rebindAfterModelChange();
        wireCellListeners();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public boolean applyMergeFromSelection() {
        if (this.model == null || this.selectedCells.size() < 2) {
            return false;
        }
        HashSet hashSet = new HashSet(this.selectedCells);
        this.selectedCells.clear();
        boolean mergeCells = this.model.mergeCells(hashSet);
        if (mergeCells) {
            refreshAfterModelChange();
            this.grid.invalidate();
            notifyCellSelectionChanged();
        } else {
            this.selectedCells.addAll(hashSet);
        }
        return mergeCells;
    }

    public boolean applyUnmergeFromSelection() {
        boolean z = false;
        if (this.model != null && this.selectedCells.size() == 1) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.selectedCells.iterator().next();
            if (TableModel.spanCol(pagetablecell) <= 1 && TableModel.spanRow(pagetablecell) <= 1) {
                return false;
            }
            this.selectedCells.clear();
            z = this.model.unmergeCell(pagetablecell);
            if (z) {
                refreshAfterModelChange();
                this.grid.invalidate();
                notifyCellSelectionChanged();
            } else {
                this.selectedCells.add(pagetablecell);
            }
        }
        return z;
    }

    public boolean applyDeleteRowsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(this.model.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        this.selectedCells.clear();
        boolean deleteRows = this.model.deleteRows(hashSet);
        refreshAfterModelChange();
        return deleteRows;
    }

    public boolean applyDeleteColumnsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(this.model.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        this.selectedCells.clear();
        boolean deleteColumns = this.model.deleteColumns(hashSet);
        refreshAfterModelChange();
        return deleteColumns;
    }

    public boolean isEmpty() {
        TableModel tableModel = this.model;
        return tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0;
    }

    public boolean allSelectedHeader() {
        if (this.selectedCells.isEmpty()) {
            return false;
        }
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            if (!((TL_iv.pageTableCell) it.next()).header) {
                return false;
            }
        }
        return true;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public TableModel getModel() {
        return this.model;
    }

    public RichTableCellGrid getGrid() {
        return this.grid;
    }

    public void setLocked(boolean z) {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).setLocked(z);
            }
        }
    }

    private void wireCellListeners() {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                richTableCellHost.editText.setListener(new 2(richTableCellHost));
            }
        }
    }

    class 2 implements RichEditText.Listener {
        final /* synthetic */ RichTableCellHost val$host;

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public /* synthetic */ boolean onBackspaceAtStart(RichEditText richEditText) {
            return RichEditText.Listener.-CC.$default$onBackspaceAtStart(this, richEditText);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public /* synthetic */ void onBackspaceOnEmpty(RichEditText richEditText) {
            RichEditText.Listener.-CC.$default$onBackspaceOnEmpty(this, richEditText);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public /* synthetic */ void onEnterPressed(RichEditText richEditText) {
            RichEditText.Listener.-CC.$default$onEnterPressed(this, richEditText);
        }

        2(RichTableCellHost richTableCellHost) {
            this.val$host = richTableCellHost;
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            TL_iv.pageTableCell pagetablecell = this.val$host.cell;
            if (pagetablecell != null) {
                TableModel.applyPlainText(pagetablecell, editable.toString());
            }
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return;
            }
            RichTableCell.this.delegate.onTextChanged(RichTableCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichTableCell.this.moveFocusByTab(this.val$host, z);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTableCell.this.delegate != null) {
                RichTableCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTableCell.this.hijackingSelection || i == i2 || RichTableCell.this.delegate == null || (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTableCell.this) {
                return;
            }
            final int flatIndexOfAnchor = RichTableCell.this.model == null ? 0 : RichTableCell.this.model.flatIndexOfAnchor(this.val$host.cell);
            if (flatIndexOfAnchor < 0) {
                return;
            }
            RichTableCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTableCell$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RichTableCell.2.this.lambda$onSelectionChanged$0(richEditText, i2, selectionHelper, flatIndexOfAnchor, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSelectionChanged$0(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2, int i3) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichTableCell.this, i2, i3, i)) {
                return;
            }
            RichTableCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichTableCell.this.hijackingSelection = false;
        }
    }

    public boolean moveFocusByTab(RichTableCellHost richTableCellHost, boolean z) {
        int indexOf;
        RichTableCellHost hostForAnchor;
        TableModel tableModel = this.model;
        if (tableModel == null || (indexOf = tableModel.anchors().indexOf(richTableCellHost.cell)) < 0) {
            return false;
        }
        int i = z ? indexOf - 1 : indexOf + 1;
        if (i < 0 || i >= this.model.anchors().size() || (hostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchors().get(i))) == null) {
            return false;
        }
        hostForAnchor.editText.requestEditFocus();
        RichEditText richEditText = hostForAnchor.editText;
        richEditText.setSelection(richEditText.length());
        return true;
    }

    public RichTableCellHost findHostContaining(View view) {
        if (view == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCellHost) {
                return (RichTableCellHost) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).editText.applyColors();
            }
        }
        this.grid.applyColors();
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout;
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        int size = tableModel.anchors().size();
        for (int i = 0; i < size; i++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchors().get(i);
            RichTableCellHost hostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (hostForAnchor != null && (layout = hostForAnchor.editText.getLayout()) != null) {
                final int left = ((this.scrollView.getLeft() + this.grid.getLeft()) - this.scrollView.getScrollX()) + hostForAnchor.getLeft() + hostForAnchor.editText.getLeft() + hostForAnchor.editText.getPaddingLeft();
                final int top = this.scrollView.getTop() + this.grid.getTop() + hostForAnchor.getTop() + hostForAnchor.editText.getTop() + hostForAnchor.editText.getPaddingTop();
                final int anchorRowOf = this.model.anchorRowOf(pagetablecell) + 10;
                arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichTableCell.3
                    @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                    public /* synthetic */ CharSequence getPrefix() {
                        return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
                    }

                    @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                    public Layout getLayout() {
                        return layout;
                    }

                    @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                    public int getX() {
                        return left;
                    }

                    @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                    public int getY() {
                        return top;
                    }

                    @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                    public int getRow() {
                        return anchorRowOf;
                    }
                });
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.model == null) {
            return;
        }
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper == null) {
            return;
        }
        this.tmpBlocks.clear();
        fillTextLayoutBlocks(this.tmpBlocks);
        for (int i = 0; i < this.tmpBlocks.size(); i++) {
            TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) this.tmpBlocks.get(i);
            canvas.save();
            canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
            selectionHelper.draw(canvas, this, i);
            canvas.restore();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
    public void invalidate() {
        super.invalidate();
        RichTableCellGrid richTableCellGrid = this.grid;
        if (richTableCellGrid != null) {
            richTableCellGrid.invalidate();
        }
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
        public RichTableCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichTableCell(context, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichTableCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = blockRow;
            ofFactory.object2 = delegate;
            return ofFactory;
        }
    }
}
