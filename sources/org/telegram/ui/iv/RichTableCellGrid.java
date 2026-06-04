package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes3.dex */
public class RichTableCellGrid extends ViewGroup {
    private int[] colStarts;
    private int[] colWidths;
    private final Paint headerPaint;
    private final Paint linePaint;
    private TableModel model;
    private Theme.ResourcesProvider resourcesProvider;
    private int[] rowHeights;
    private int[] rowStarts;
    private final RectF selRect;
    private int selectedFillBaseAlpha;
    private final Paint selectedPaint;
    private int selectedStrokeBaseAlpha;
    private final Paint selectedStrokePaint;
    private AnimatedFloat selectionFade;
    private CellSelectionProvider selectionProvider;
    private final Paint stripPaint;

    public interface CellSelectionProvider {
        boolean isSelected(TL_iv.pageTableCell pagetablecell);
    }

    public void setSelectionProvider(CellSelectionProvider cellSelectionProvider) {
        this.selectionProvider = cellSelectionProvider;
        invalidate();
    }

    public RichTableCellGrid(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.colWidths = new int[0];
        this.rowHeights = new int[0];
        this.colStarts = new int[0];
        this.rowStarts = new int[0];
        Paint paint = new Paint(1);
        this.linePaint = paint;
        this.headerPaint = new Paint(1);
        this.stripPaint = new Paint(1);
        this.selectedPaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.selectedStrokePaint = paint2;
        this.selRect = new RectF();
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.selectionFade = new AnimatedFloat(this, 0L, 220L, CubicBezierInterpolator.EASE_OUT_QUINT);
        applyColors();
    }

    public void applyColors() {
        this.linePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider));
        int color = Theme.getColor(Theme.key_switchTrack, this.resourcesProvider);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        this.headerPaint.setColor(Color.argb(34, red, green, blue));
        this.stripPaint.setColor(Color.argb(20, red, green, blue));
        int color2 = Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider);
        this.selectedFillBaseAlpha = 80;
        this.selectedStrokeBaseAlpha = NotificationCenter.dialogPhotosUpdate;
        this.selectedPaint.setColor(Color.argb(80, Color.red(color2), Color.green(color2), Color.blue(color2)));
        this.selectedStrokePaint.setColor(Color.argb(this.selectedStrokeBaseAlpha, Color.red(color2), Color.green(color2), Color.blue(color2)));
        invalidate();
    }

    public void setModel(TableModel tableModel) {
        this.model = tableModel;
        rebuildHosts();
    }

    public TableModel getModel() {
        return this.model;
    }

    public RichTableCellHost hostForAnchor(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (richTableCellHost.cell == pagetablecell) {
                    return richTableCellHost;
                }
            }
        }
        return null;
    }

    private void rebuildHosts() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof RichTableCellHost) {
                removeViewAt(childCount);
            }
        }
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        int size = tableModel.anchors().size();
        for (int i = 0; i < size; i++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchors().get(i);
            RichTableCellHost richTableCellHost = new RichTableCellHost(getContext(), this.resourcesProvider);
            richTableCellHost.bind(pagetablecell);
            addView(richTableCellHost);
        }
    }

    public void rebindAfterModelChange() {
        rebuildHosts();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int dp = AndroidUtilities.dp(4.0f);
        TableModel tableModel = this.model;
        int i4 = 0;
        if (tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), dp * 2);
            this.colWidths = new int[0];
            this.rowHeights = new int[0];
            this.colStarts = new int[0];
            this.rowStarts = new int[0];
            return;
        }
        int i5 = dp * 2;
        int size = View.MeasureSpec.getSize(i) - i5;
        TableModel tableModel2 = this.model;
        int i6 = tableModel2.rowCount;
        int i7 = tableModel2.colCount;
        this.colWidths = new int[i7];
        this.rowHeights = new int[i6];
        int max = Math.max(AndroidUtilities.dp(80.0f), size / Math.max(i7, 1));
        for (int i8 = 0; i8 < i7; i8++) {
            this.colWidths[i8] = max;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i9 = 0;
        while (i9 < getChildCount()) {
            View childAt = getChildAt(i9);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int anchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int anchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                int spanCol = TableModel.spanCol(richTableCellHost.cell);
                for (int i10 = anchorColOf; i10 < anchorColOf + spanCol && i10 < i7; i10++) {
                    i4 += this.colWidths[i10];
                }
                richTableCellHost.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), makeMeasureSpec);
                if (TableModel.spanRow(richTableCellHost.cell) == 1) {
                    int measuredHeight = richTableCellHost.getMeasuredHeight();
                    int[] iArr = this.rowHeights;
                    if (measuredHeight > iArr[anchorRowOf]) {
                        iArr[anchorRowOf] = richTableCellHost.getMeasuredHeight();
                    }
                }
            }
            i9++;
            i4 = 0;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost2 = (RichTableCellHost) childAt2;
                int anchorRowOf2 = this.model.anchorRowOf(richTableCellHost2.cell);
                int spanRow = TableModel.spanRow(richTableCellHost2.cell);
                if (spanRow > 1) {
                    int i12 = anchorRowOf2;
                    int i13 = 0;
                    while (true) {
                        i3 = anchorRowOf2 + spanRow;
                        if (i12 >= i3 || i12 >= i6) {
                            break;
                        }
                        i13 += this.rowHeights[i12];
                        i12++;
                    }
                    int measuredHeight2 = richTableCellHost2.getMeasuredHeight();
                    if (measuredHeight2 > i13) {
                        int i14 = measuredHeight2 - i13;
                        int max2 = i14 / Math.max(spanRow, 1);
                        int max3 = i14 % Math.max(spanRow, 1);
                        while (anchorRowOf2 < i3 && anchorRowOf2 < i6) {
                            int[] iArr2 = this.rowHeights;
                            iArr2[anchorRowOf2] = iArr2[anchorRowOf2] + (max3 > 0 ? 1 : 0) + max2;
                            if (max3 > 0) {
                                max3--;
                            }
                            anchorRowOf2++;
                        }
                    }
                }
            }
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost3 = (RichTableCellHost) childAt3;
                int anchorRowOf3 = this.model.anchorRowOf(richTableCellHost3.cell);
                int anchorColOf2 = this.model.anchorColOf(richTableCellHost3.cell);
                int spanCol2 = TableModel.spanCol(richTableCellHost3.cell);
                int spanRow2 = TableModel.spanRow(richTableCellHost3.cell);
                int i16 = 0;
                for (int i17 = anchorColOf2; i17 < anchorColOf2 + spanCol2 && i17 < i7; i17++) {
                    i16 += this.colWidths[i17];
                }
                int i18 = 0;
                for (int i19 = anchorRowOf3; i19 < anchorRowOf3 + spanRow2 && i19 < i6; i19++) {
                    i18 += this.rowHeights[i19];
                }
                richTableCellHost3.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
        }
        int[] iArr3 = new int[i7 + 1];
        this.colStarts = iArr3;
        iArr3[0] = dp;
        int i20 = 0;
        while (i20 < i7) {
            int[] iArr4 = this.colStarts;
            int i21 = i20 + 1;
            iArr4[i21] = iArr4[i20] + this.colWidths[i20];
            i20 = i21;
        }
        int[] iArr5 = new int[i6 + 1];
        this.rowStarts = iArr5;
        iArr5[0] = dp;
        int i22 = 0;
        while (i22 < i6) {
            int[] iArr6 = this.rowStarts;
            int i23 = i22 + 1;
            iArr6[i23] = iArr6[i22] + this.rowHeights[i22];
            i22 = i23;
        }
        setMeasuredDimension(Math.max(this.colStarts[i7] + dp, size + i5), this.rowStarts[i6] + dp);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.model == null) {
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int anchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int anchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                if (anchorRowOf >= 0 && anchorColOf >= 0) {
                    int i6 = this.colStarts[anchorColOf];
                    int i7 = this.rowStarts[anchorRowOf];
                    richTableCellHost.layout(i6, i7, richTableCellHost.getMeasuredWidth() + i6, richTableCellHost.getMeasuredHeight() + i7);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        TL_iv.pageBlockTable pageblocktable;
        drawCellBackgrounds(canvas);
        drawSelectionFill(canvas);
        super.dispatchDraw(canvas);
        TableModel tableModel = this.model;
        if (tableModel != null && (pageblocktable = tableModel.block) != null && pageblocktable.bordered) {
            drawBorders(canvas);
        }
        drawSelectionOutline(canvas);
    }

    private void drawCellBackgrounds(Canvas canvas) {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = tableModel.block;
        boolean z = pageblocktable != null && pageblocktable.striped;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int anchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int anchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                if (anchorRowOf >= 0 && anchorColOf >= 0) {
                    int spanCol = TableModel.spanCol(richTableCellHost.cell);
                    int spanRow = TableModel.spanRow(richTableCellHost.cell);
                    int[] iArr = this.colStarts;
                    int i2 = iArr[anchorColOf];
                    int i3 = this.rowStarts[anchorRowOf];
                    int i4 = iArr[Math.min(anchorColOf + spanCol, this.model.colCount)];
                    int i5 = this.rowStarts[Math.min(spanRow + anchorRowOf, this.model.rowCount)];
                    if (richTableCellHost.cell.header) {
                        canvas.drawRect(i2, i3, i4, i5, this.headerPaint);
                    } else if (z && anchorRowOf % 2 == 0) {
                        canvas.drawRect(i2, i3, i4, i5, this.stripPaint);
                    }
                }
            }
        }
    }

    private boolean isSelected(int i, int i2) {
        CellSelectionProvider cellSelectionProvider;
        TableModel tableModel = this.model;
        if (tableModel == null || (cellSelectionProvider = this.selectionProvider) == null || i < 0 || i >= tableModel.rowCount || i2 < 0 || i2 >= tableModel.colCount) {
            return false;
        }
        return cellSelectionProvider.isSelected(tableModel.grid[i][i2]);
    }

    private boolean hasAnySelection() {
        TableModel tableModel = this.model;
        if (tableModel != null && this.selectionProvider != null) {
            Iterator it = tableModel.anchors().iterator();
            while (it.hasNext()) {
                if (this.selectionProvider.isSelected((TL_iv.pageTableCell) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void drawSelectionFill(Canvas canvas) {
        if (this.model == null) {
            return;
        }
        float f = this.selectionFade.set(hasAnySelection() ? 1.0f : 0.0f);
        if (f <= 0.001f) {
            return;
        }
        this.selectedPaint.setAlpha((int) (this.selectedFillBaseAlpha * f));
        for (TL_iv.pageTableCell pagetablecell : this.model.anchors()) {
            CellSelectionProvider cellSelectionProvider = this.selectionProvider;
            if (cellSelectionProvider != null && cellSelectionProvider.isSelected(pagetablecell)) {
                int anchorRowOf = this.model.anchorRowOf(pagetablecell);
                int anchorColOf = this.model.anchorColOf(pagetablecell);
                if (anchorRowOf >= 0 && anchorColOf >= 0) {
                    int spanCol = TableModel.spanCol(pagetablecell);
                    int spanRow = TableModel.spanRow(pagetablecell);
                    int[] iArr = this.colStarts;
                    canvas.drawRect(iArr[anchorColOf], this.rowStarts[anchorRowOf], iArr[Math.min(anchorColOf + spanCol, this.model.colCount)], this.rowStarts[Math.min(anchorRowOf + spanRow, this.model.rowCount)], this.selectedPaint);
                }
            }
        }
    }

    private void drawSelectionOutline(Canvas canvas) {
        if (this.model == null) {
            return;
        }
        float f = this.selectionFade.get();
        if (f <= 0.001f) {
            return;
        }
        this.selectedStrokePaint.setAlpha((int) (this.selectedStrokeBaseAlpha * f));
        this.selectedStrokePaint.setStrokeWidth(AndroidUtilities.dp(2.0f) * Math.max(0.4f, f));
        int i = 0;
        while (true) {
            int i2 = this.model.rowCount;
            if (i > i2) {
                break;
            }
            int i3 = i < i2 ? this.rowStarts[i] : this.rowStarts[i2];
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= this.model.colCount) {
                    break;
                }
                if (isSelected(i - 1, i4) != isSelected(i, i4)) {
                    if (i5 < 0) {
                        i5 = this.colStarts[i4];
                    }
                } else if (i5 >= 0) {
                    float f2 = i3;
                    canvas.drawLine(i5, f2, this.colStarts[i4], f2, this.selectedStrokePaint);
                    i5 = -1;
                }
                i4++;
            }
            if (i5 >= 0) {
                float f3 = i3;
                canvas.drawLine(i5, f3, this.colStarts[r6], f3, this.selectedStrokePaint);
            }
            i++;
        }
        int i6 = 0;
        while (true) {
            int i7 = this.model.colCount;
            if (i6 > i7) {
                return;
            }
            int i8 = i6 < i7 ? this.colStarts[i6] : this.colStarts[i7];
            int i9 = 0;
            int i10 = -1;
            while (true) {
                if (i9 >= this.model.rowCount) {
                    break;
                }
                if (isSelected(i9, i6 - 1) != isSelected(i9, i6)) {
                    if (i10 < 0) {
                        i10 = this.rowStarts[i9];
                    }
                } else if (i10 >= 0) {
                    float f4 = i8;
                    canvas.drawLine(f4, i10, f4, this.rowStarts[i9], this.selectedStrokePaint);
                    i10 = -1;
                }
                i9++;
            }
            if (i10 >= 0) {
                float f5 = i8;
                canvas.drawLine(f5, i10, f5, this.rowStarts[r6], this.selectedStrokePaint);
            }
            i6++;
        }
    }

    private void drawBorders(Canvas canvas) {
        float strokeWidth = this.linePaint.getStrokeWidth() / 2.0f;
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        RectF rectF = this.selRect;
        int[] iArr = this.colStarts;
        int[] iArr2 = this.rowStarts;
        TableModel tableModel = this.model;
        rectF.set(iArr[0] + strokeWidth, iArr2[0] + strokeWidth, iArr[tableModel.colCount] - strokeWidth, iArr2[tableModel.rowCount] - strokeWidth);
        canvas.drawRoundRect(this.selRect, dpf2, dpf2, this.linePaint);
        for (int i = 1; i < this.model.colCount; i++) {
            int i2 = this.colStarts[i];
            int i3 = 0;
            int i4 = -1;
            while (true) {
                TableModel tableModel2 = this.model;
                if (i3 >= tableModel2.rowCount) {
                    break;
                }
                TL_iv.pageTableCell[] pagetablecellArr = tableModel2.grid[i3];
                if (pagetablecellArr[i - 1] != pagetablecellArr[i]) {
                    if (i4 < 0) {
                        i4 = this.rowStarts[i3];
                    }
                } else if (i4 >= 0) {
                    float f = i2;
                    canvas.drawLine(f, i4, f, this.rowStarts[i3], this.linePaint);
                    i4 = -1;
                }
                i3++;
            }
            if (i4 >= 0) {
                float f2 = i2;
                canvas.drawLine(f2, i4, f2, this.rowStarts[r8], this.linePaint);
            }
        }
        for (int i5 = 1; i5 < this.model.rowCount; i5++) {
            int i6 = this.rowStarts[i5];
            int i7 = 0;
            int i8 = -1;
            while (true) {
                TableModel tableModel3 = this.model;
                if (i7 >= tableModel3.colCount) {
                    break;
                }
                TL_iv.pageTableCell[][] pagetablecellArr2 = tableModel3.grid;
                if (pagetablecellArr2[i5 - 1][i7] != pagetablecellArr2[i5][i7]) {
                    if (i8 < 0) {
                        i8 = this.colStarts[i7];
                    }
                } else if (i8 >= 0) {
                    float f3 = i6;
                    canvas.drawLine(i8, f3, this.colStarts[i7], f3, this.linePaint);
                    i8 = -1;
                }
                i7++;
            }
            if (i8 >= 0) {
                float f4 = i6;
                canvas.drawLine(i8, f4, this.colStarts[r7], f4, this.linePaint);
            }
        }
    }
}
