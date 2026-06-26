package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes3.dex */
public class RichTableCellGrid extends ViewGroup {
    private final RectF arcRect;
    private boolean bottomBulge;
    private int bulgeColLeft;
    private int bulgeColRight;
    private final Paint bulgeFillPaint;
    private final Path bulgePath;
    private int bulgeRowBot;
    private int bulgeRowTop;
    private int[] colStarts;
    private int[] colWidths;
    private int dotColor;
    private int dotOnSelectionColor;
    private final Paint dotPaint;
    private final Paint headerPaint;
    private boolean leftBulge;
    private final Paint linePaint;
    private TableModel model;
    private Theme.ResourcesProvider resourcesProvider;
    private int[] rowHeights;
    private int[] rowStarts;
    private final RectF selRect;
    private int selectedFillBaseAlpha;
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
        Paint paint2 = new Paint(1);
        this.selectedStrokePaint = paint2;
        this.dotPaint = new Paint(1);
        this.bulgeFillPaint = new Paint(1);
        this.selRect = new RectF();
        this.arcRect = new RectF();
        this.bulgePath = new Path();
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
        this.selectedFillBaseAlpha = 80;
        this.selectedStrokeBaseAlpha = NotificationCenter.didReceiveSmsCode;
        Paint paint = this.selectedStrokePaint;
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        Paint paint2 = this.dotPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.dotColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7, this.resourcesProvider);
        this.dotOnSelectionColor = Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider);
        this.dotPaint.setColor(this.dotColor);
        this.bulgeFillPaint.setStyle(style);
        this.bulgeFillPaint.setColor(Theme.getColor(i, this.resourcesProvider));
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
        int i4;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(20.0f);
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), dp2 + dp4);
            this.colWidths = new int[0];
            this.rowHeights = new int[0];
            this.colStarts = new int[0];
            this.rowStarts = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - dp) - dp3;
        TableModel tableModel2 = this.model;
        int i5 = tableModel2.rowCount;
        int i6 = tableModel2.colCount;
        this.colWidths = new int[i6];
        this.rowHeights = new int[i5];
        int max = Math.max(AndroidUtilities.dp(80.0f), size / Math.max(i6, 1));
        for (int i7 = 0; i7 < i6; i7++) {
            this.colWidths[i7] = max;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int anchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int anchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                int spanCol = TableModel.spanCol(richTableCellHost.cell);
                i4 = size;
                int i9 = 0;
                for (int i10 = anchorColOf; i10 < anchorColOf + spanCol && i10 < i6; i10++) {
                    i9 += this.colWidths[i10];
                }
                richTableCellHost.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), makeMeasureSpec);
                if (TableModel.spanRow(richTableCellHost.cell) == 1) {
                    int measuredHeight = richTableCellHost.getMeasuredHeight();
                    int[] iArr = this.rowHeights;
                    if (measuredHeight > iArr[anchorRowOf]) {
                        iArr[anchorRowOf] = richTableCellHost.getMeasuredHeight();
                    }
                }
            } else {
                i4 = size;
            }
            i8++;
            size = i4;
        }
        int i11 = size;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost2 = (RichTableCellHost) childAt2;
                int anchorRowOf2 = this.model.anchorRowOf(richTableCellHost2.cell);
                int spanRow = TableModel.spanRow(richTableCellHost2.cell);
                if (spanRow > 1) {
                    int i13 = anchorRowOf2;
                    int i14 = 0;
                    while (true) {
                        i3 = anchorRowOf2 + spanRow;
                        if (i13 >= i3 || i13 >= i5) {
                            break;
                        }
                        i14 += this.rowHeights[i13];
                        i13++;
                    }
                    int measuredHeight2 = richTableCellHost2.getMeasuredHeight();
                    if (measuredHeight2 > i14) {
                        int i15 = measuredHeight2 - i14;
                        int max2 = i15 / Math.max(spanRow, 1);
                        int max3 = i15 % Math.max(spanRow, 1);
                        while (anchorRowOf2 < i3 && anchorRowOf2 < i5) {
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
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt3 = getChildAt(i16);
            if (childAt3 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost3 = (RichTableCellHost) childAt3;
                int anchorRowOf3 = this.model.anchorRowOf(richTableCellHost3.cell);
                int anchorColOf2 = this.model.anchorColOf(richTableCellHost3.cell);
                int spanCol2 = TableModel.spanCol(richTableCellHost3.cell);
                int spanRow2 = TableModel.spanRow(richTableCellHost3.cell);
                int i17 = 0;
                for (int i18 = anchorColOf2; i18 < anchorColOf2 + spanCol2 && i18 < i6; i18++) {
                    i17 += this.colWidths[i18];
                }
                int i19 = 0;
                for (int i20 = anchorRowOf3; i20 < anchorRowOf3 + spanRow2 && i20 < i5; i20++) {
                    i19 += this.rowHeights[i20];
                }
                richTableCellHost3.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
            }
        }
        int[] iArr3 = new int[i6 + 1];
        this.colStarts = iArr3;
        iArr3[0] = dp;
        int i21 = 0;
        while (i21 < i6) {
            int[] iArr4 = this.colStarts;
            int i22 = i21 + 1;
            iArr4[i22] = iArr4[i21] + this.colWidths[i21];
            i21 = i22;
        }
        int[] iArr5 = new int[i5 + 1];
        this.rowStarts = iArr5;
        iArr5[0] = dp2;
        int i23 = 0;
        while (i23 < i5) {
            int[] iArr6 = this.rowStarts;
            int i24 = i23 + 1;
            iArr6[i24] = iArr6[i23] + this.rowHeights[i23];
            i23 = i24;
        }
        setMeasuredDimension(Math.max(this.colStarts[i6] + dp3, i11 + dp + dp3), this.rowStarts[i5] + dp4);
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
        computeHandlesState();
        drawCellBackgrounds(canvas);
        super.dispatchDraw(canvas);
        drawBulgeFills(canvas);
        TableModel tableModel = this.model;
        if (tableModel != null && (pageblocktable = tableModel.block) != null && pageblocktable.bordered) {
            drawBorders(canvas);
        }
        drawSelectionOutline(canvas);
        drawHandleDots(canvas);
    }

    private TL_iv.pageTableCell activeCell() {
        TableModel tableModel = this.model;
        TL_iv.pageTableCell pagetablecell = null;
        if (tableModel != null && tableModel.rowCount != 0 && tableModel.colCount != 0) {
            TL_iv.pageTableCell findFocusedCell = findFocusedCell();
            if (findFocusedCell != null) {
                return findFocusedCell;
            }
            if (this.selectionProvider == null) {
                return null;
            }
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (TL_iv.pageTableCell pagetablecell2 : this.model.anchors()) {
                if (this.selectionProvider.isSelected(pagetablecell2)) {
                    int anchorRowOf = this.model.anchorRowOf(pagetablecell2);
                    int anchorColOf = this.model.anchorColOf(pagetablecell2);
                    if (anchorRowOf < i || (anchorRowOf == i && anchorColOf < i2)) {
                        pagetablecell = pagetablecell2;
                        i = anchorRowOf;
                        i2 = anchorColOf;
                    }
                }
            }
        }
        return pagetablecell;
    }

    private boolean isRowFullySelected(int i) {
        if (i < 0 || i >= this.model.rowCount) {
            return false;
        }
        for (int i2 = 0; i2 < this.model.colCount; i2++) {
            if (!isSelected(i, i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isColFullySelected(int i) {
        if (i < 0 || i >= this.model.colCount) {
            return false;
        }
        for (int i2 = 0; i2 < this.model.rowCount; i2++) {
            if (!isSelected(i2, i)) {
                return false;
            }
        }
        return true;
    }

    private void computeHandlesState() {
        this.bottomBulge = false;
        this.leftBulge = false;
        TL_iv.pageTableCell activeCell = activeCell();
        if (activeCell == null) {
            return;
        }
        int anchorRowOf = this.model.anchorRowOf(activeCell);
        int anchorColOf = this.model.anchorColOf(activeCell);
        if (anchorRowOf < 0 || anchorColOf < 0) {
            return;
        }
        int spanRow = TableModel.spanRow(activeCell);
        int spanCol = TableModel.spanCol(activeCell);
        if (isRowFullySelected(anchorRowOf)) {
            this.leftBulge = true;
            int[] iArr = this.rowStarts;
            this.bulgeRowTop = iArr[anchorRowOf];
            this.bulgeRowBot = iArr[Math.min(anchorRowOf + spanRow, this.model.rowCount)];
        }
        if (isColFullySelected(anchorColOf)) {
            this.bottomBulge = true;
            int[] iArr2 = this.colStarts;
            this.bulgeColLeft = iArr2[anchorColOf];
            this.bulgeColRight = iArr2[Math.min(anchorColOf + spanCol, this.model.colCount)];
        }
    }

    private void drawBulgeFills(Canvas canvas) {
        if (this.leftBulge) {
            float dpf2 = this.bulgeRowTop - AndroidUtilities.dpf2(1.0f);
            float dpf22 = this.bulgeRowBot + AndroidUtilities.dpf2(1.0f);
            float dp = this.colStarts[0] - AndroidUtilities.dp(16.0f);
            float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
            float cornerRadiusFor = cornerRadiusFor(this.colStarts[0], this.bulgeRowTop);
            float cornerRadiusFor2 = cornerRadiusFor(this.colStarts[0], this.bulgeRowBot);
            this.bulgePath.rewind();
            this.bulgePath.moveTo(this.colStarts[0] + cornerRadiusFor, dpf2);
            this.bulgePath.lineTo(dp + min, dpf2);
            float f = min * 2.0f;
            float f2 = dp + f;
            this.arcRect.set(dp, dpf2, f2, dpf2 + f);
            this.bulgePath.arcTo(this.arcRect, 270.0f, -90.0f);
            this.bulgePath.lineTo(dp, dpf22 - min);
            this.arcRect.set(dp, dpf22 - f, f2, dpf22);
            this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
            this.bulgePath.lineTo(this.colStarts[0] + cornerRadiusFor2, dpf22);
            if (cornerRadiusFor2 > 0.0f) {
                RectF rectF = this.arcRect;
                float f3 = this.colStarts[0];
                float f4 = cornerRadiusFor2 * 2.0f;
                rectF.set(f3, dpf22 - f4, f4 + f3, dpf22);
                this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(this.colStarts[0], dpf22);
            }
            this.bulgePath.lineTo(this.colStarts[0], dpf2 + cornerRadiusFor);
            if (cornerRadiusFor > 0.0f) {
                RectF rectF2 = this.arcRect;
                float f5 = this.colStarts[0];
                float f6 = cornerRadiusFor * 2.0f;
                rectF2.set(f5, dpf2, f5 + f6, f6 + dpf2);
                this.bulgePath.arcTo(this.arcRect, 180.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(this.colStarts[0], dpf2);
            }
            this.bulgePath.close();
            canvas.drawPath(this.bulgePath, this.bulgeFillPaint);
        }
        if (this.bottomBulge) {
            float dpf23 = this.bulgeColLeft - AndroidUtilities.dpf2(1.0f);
            float dpf24 = this.bulgeColRight + AndroidUtilities.dpf2(1.0f);
            float f7 = this.rowStarts[this.model.rowCount];
            float dp2 = AndroidUtilities.dp(16.0f) + f7;
            float min2 = Math.min(AndroidUtilities.dpf2(10.0f), (dpf24 - dpf23) / 2.0f);
            float cornerRadiusFor3 = cornerRadiusFor(this.bulgeColLeft, this.rowStarts[this.model.rowCount]);
            float cornerRadiusFor4 = cornerRadiusFor(this.bulgeColRight, this.rowStarts[this.model.rowCount]);
            this.bulgePath.rewind();
            this.bulgePath.moveTo(dpf23, f7 - cornerRadiusFor3);
            this.bulgePath.lineTo(dpf23, dp2 - min2);
            float f8 = min2 * 2.0f;
            float f9 = dp2 - f8;
            this.arcRect.set(dpf23, f9, dpf23 + f8, dp2);
            this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
            this.bulgePath.lineTo(dpf24 - min2, dp2);
            this.arcRect.set(dpf24 - f8, f9, dpf24, dp2);
            this.bulgePath.arcTo(this.arcRect, 90.0f, -90.0f);
            this.bulgePath.lineTo(dpf24, f7 - cornerRadiusFor4);
            if (cornerRadiusFor4 > 0.0f) {
                float f10 = cornerRadiusFor4 * 2.0f;
                this.arcRect.set(dpf24 - f10, f7 - f10, dpf24, f7);
                this.bulgePath.arcTo(this.arcRect, 0.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(dpf24, f7);
            }
            this.bulgePath.lineTo(dpf23 + cornerRadiusFor3, f7);
            if (cornerRadiusFor3 > 0.0f) {
                float f11 = cornerRadiusFor3 * 2.0f;
                this.arcRect.set(dpf23, f7 - f11, f11 + dpf23, f7);
                this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(dpf23, f7);
            }
            this.bulgePath.close();
            canvas.drawPath(this.bulgePath, this.bulgeFillPaint);
        }
    }

    private void drawHandleDots(Canvas canvas) {
        TL_iv.pageTableCell activeCell = activeCell();
        if (activeCell == null) {
            return;
        }
        int anchorRowOf = this.model.anchorRowOf(activeCell);
        int anchorColOf = this.model.anchorColOf(activeCell);
        if (anchorRowOf < 0 || anchorColOf < 0) {
            return;
        }
        int spanRow = TableModel.spanRow(activeCell);
        int spanCol = TableModel.spanCol(activeCell);
        float dpf2 = AndroidUtilities.dpf2(3.0f) / 2.0f;
        float dp = AndroidUtilities.dp(8.0f);
        int[] iArr = this.rowStarts;
        float f = (iArr[anchorRowOf] + iArr[Math.min(anchorRowOf + spanRow, this.model.rowCount)]) / 2.0f;
        float dp2 = (this.colStarts[0] - AndroidUtilities.dp(6.0f)) - dpf2;
        this.dotPaint.setColor(this.leftBulge ? this.dotOnSelectionColor : this.dotColor);
        for (int i = -1; i <= 1; i++) {
            canvas.drawCircle(dp2, (i * dp) + f, dpf2, this.dotPaint);
        }
        int[] iArr2 = this.colStarts;
        float f2 = (iArr2[anchorColOf] + iArr2[Math.min(anchorColOf + spanCol, this.model.colCount)]) / 2.0f;
        float dp3 = this.rowStarts[this.model.rowCount] + AndroidUtilities.dp(6.0f) + dpf2;
        this.dotPaint.setColor(this.bottomBulge ? this.dotOnSelectionColor : this.dotColor);
        for (int i2 = -1; i2 <= 1; i2++) {
            canvas.drawCircle((i2 * dp) + f2, dp3, dpf2, this.dotPaint);
        }
    }

    public int rowHandleAtGrid(int i, int i2) {
        int anchorRowOf;
        TL_iv.pageTableCell activeCell = activeCell();
        if (activeCell == null || (anchorRowOf = this.model.anchorRowOf(activeCell)) < 0) {
            return -1;
        }
        int spanRow = TableModel.spanRow(activeCell);
        int[] iArr = this.rowStarts;
        int i3 = iArr[anchorRowOf];
        int i4 = iArr[Math.min(spanRow + anchorRowOf, this.model.rowCount)];
        if (i < (this.colStarts[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || i >= this.colStarts[0] || i2 < i3 || i2 >= i4) {
            return -1;
        }
        return anchorRowOf;
    }

    public int colHandleAtGrid(int i, int i2) {
        int anchorColOf;
        TL_iv.pageTableCell activeCell = activeCell();
        if (activeCell == null || (anchorColOf = this.model.anchorColOf(activeCell)) < 0) {
            return -1;
        }
        int spanCol = TableModel.spanCol(activeCell);
        int[] iArr = this.colStarts;
        int i3 = iArr[anchorColOf];
        int i4 = iArr[Math.min(spanCol + anchorColOf, this.model.colCount)];
        int i5 = this.rowStarts[this.model.rowCount];
        if (i2 < i5 || i2 >= i5 + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) || i < i3 || i >= i4) {
            return -1;
        }
        return anchorColOf;
    }

    public TL_iv.pageTableCell findFocusedCell() {
        View findFocus = findFocus();
        for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
            if (parent instanceof RichTableCellHost) {
                return ((RichTableCellHost) parent).cell;
            }
        }
        return null;
    }

    private void drawCellBackgrounds(Canvas canvas) {
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = tableModel.block;
        boolean z = pageblocktable != null && pageblocktable.striped;
        canvas.save();
        RectF rectF = this.selRect;
        float f = this.colStarts[0];
        float f2 = this.rowStarts[0];
        TableModel tableModel2 = this.model;
        rectF.set(f, f2, r3[tableModel2.colCount], r5[tableModel2.rowCount]);
        this.bulgePath.rewind();
        this.bulgePath.addRoundRect(this.selRect, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
        canvas.clipPath(this.bulgePath);
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
        canvas.restore();
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

    private void drawSelectionOutline(Canvas canvas) {
        int i;
        int i2;
        if (this.model == null) {
            return;
        }
        float f = this.selectionFade.set(hasAnySelection() ? 1.0f : 0.0f);
        if (f <= 0.001f) {
            return;
        }
        this.selectedStrokePaint.setAlpha((int) (this.selectedStrokeBaseAlpha * f));
        this.selectedStrokePaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f) * Math.max(0.4f, f));
        int i3 = 0;
        while (true) {
            int i4 = this.model.rowCount;
            if (i3 > i4) {
                break;
            }
            int i5 = i3 < i4 ? this.rowStarts[i3] : this.rowStarts[i4];
            int i6 = 0;
            int i7 = -1;
            while (true) {
                i2 = this.model.colCount;
                if (i6 >= i2) {
                    break;
                }
                if (isSelected(i3 - 1, i6) != isSelected(i3, i6)) {
                    if (i7 < 0) {
                        i7 = this.colStarts[i6];
                    }
                } else if (i7 >= 0) {
                    drawSelHLine(canvas, i7, this.colStarts[i6], i5);
                    i7 = -1;
                }
                i6++;
            }
            if (i7 >= 0) {
                drawSelHLine(canvas, i7, this.colStarts[i2], i5);
            }
            i3++;
        }
        int i8 = 0;
        while (true) {
            TableModel tableModel = this.model;
            int i9 = tableModel.colCount;
            if (i8 <= i9) {
                int i10 = i8 < i9 ? this.colStarts[i8] : this.colStarts[i9];
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    i = this.model.rowCount;
                    if (i11 >= i) {
                        break;
                    }
                    if (isSelected(i11, i8 - 1) != isSelected(i11, i8)) {
                        if (i12 < 0) {
                            i12 = this.rowStarts[i11];
                        }
                    } else if (i12 >= 0) {
                        drawSelVLine(canvas, i10, i12, this.rowStarts[i11]);
                        i12 = -1;
                    }
                    i11++;
                }
                if (i12 >= 0) {
                    drawSelVLine(canvas, i10, i12, this.rowStarts[i]);
                }
                i8++;
            } else {
                int i13 = tableModel.rowCount;
                drawSelCornerArc(canvas, this.colStarts[0], this.rowStarts[0], 180.0f);
                drawSelCornerArc(canvas, this.colStarts[i9], this.rowStarts[0], 270.0f);
                drawSelCornerArc(canvas, this.colStarts[0], this.rowStarts[i13], 90.0f);
                drawSelCornerArc(canvas, this.colStarts[i9], this.rowStarts[i13], 0.0f);
                return;
            }
        }
    }

    private float cornerRadiusFor(int i, int i2) {
        int i3;
        int i4;
        TableModel tableModel = this.model;
        int i5 = tableModel.colCount;
        int i6 = tableModel.rowCount;
        int[] iArr = this.colStarts;
        if (i != iArr[0]) {
            i3 = i == iArr[i5] ? i5 - 1 : 0;
            return 0.0f;
        }
        int[] iArr2 = this.rowStarts;
        if (i2 != iArr2[0]) {
            i4 = i2 == iArr2[i6] ? i6 - 1 : 0;
            return 0.0f;
        }
        if (i3 >= 0 && i4 >= 0 && isSelected(i4, i3)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.colWidths[i3], this.rowHeights[i4]) / 2.0f);
        }
        return 0.0f;
    }

    private void drawSelHLine(Canvas canvas, int i, int i2, int i3) {
        if (i2 <= i) {
            return;
        }
        float cornerRadiusFor = i + cornerRadiusFor(i, i3);
        float cornerRadiusFor2 = i2 - cornerRadiusFor(i2, i3);
        if (cornerRadiusFor2 > cornerRadiusFor) {
            float f = i3;
            canvas.drawLine(cornerRadiusFor, f, cornerRadiusFor2, f, this.selectedStrokePaint);
        }
    }

    private void drawSelVLine(Canvas canvas, int i, int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        float cornerRadiusFor = i2 + cornerRadiusFor(i, i2);
        float cornerRadiusFor2 = i3 - cornerRadiusFor(i, i3);
        if (cornerRadiusFor2 > cornerRadiusFor) {
            float f = i;
            canvas.drawLine(f, cornerRadiusFor, f, cornerRadiusFor2, this.selectedStrokePaint);
        }
    }

    private void drawSelCornerArc(Canvas canvas, int i, int i2, float f) {
        float cornerRadiusFor = cornerRadiusFor(i, i2);
        if (cornerRadiusFor <= 0.0f) {
            return;
        }
        float f2 = i == this.colStarts[0] ? i + cornerRadiusFor : i - cornerRadiusFor;
        float f3 = i2 == this.rowStarts[0] ? i2 + cornerRadiusFor : i2 - cornerRadiusFor;
        this.arcRect.set(f2 - cornerRadiusFor, f3 - cornerRadiusFor, f2 + cornerRadiusFor, f3 + cornerRadiusFor);
        canvas.drawArc(this.arcRect, f, 90.0f, false, this.selectedStrokePaint);
    }

    private void drawBorders(Canvas canvas) {
        float strokeWidth = this.linePaint.getStrokeWidth() / 2.0f;
        float dpf2 = AndroidUtilities.dpf2(10.0f);
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
