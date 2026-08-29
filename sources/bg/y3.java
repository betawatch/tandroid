package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.un0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class y3 extends LinearLayout {
    public static float b = 1.0f;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 7:
                if (!(getParent() instanceof un0)) {
                    return super.drawChild(canvas, view, j10);
                }
                un0 un0Var = (un0) getParent();
                canvas.save();
                LinearLayout linearLayout = un0Var.b;
                Path path = un0Var.n;
                if (view != null && un0.e(view)) {
                    int indexOfChild = linearLayout.indexOfChild(view);
                    int i10 = indexOfChild - 1;
                    View childAt = i10 < 0 ? null : linearLayout.getChildAt(i10);
                    int i11 = indexOfChild + 1;
                    View childAt2 = i11 < linearLayout.getChildCount() ? linearLayout.getChildAt(i11) : null;
                    boolean z10 = childAt != null && un0.e(childAt);
                    boolean z11 = childAt2 != null && un0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(un0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + un0Var.getScrollY() + un0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z10 && z11) {
                        z10 = view.getY() >= rectF.top;
                        boolean z12 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z10 || !z12) {
                            z11 = z12;
                        }
                    }
                    if (!z10 && !z11) {
                        path.rewind();
                        float f9 = un0Var.c;
                        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, un0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z11) {
                        path.rewind();
                        path.addRoundRect(rectF, un0Var.e, Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                break;
            case 6:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof un0) {
                    ((un0) getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 5:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 9:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 10:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Context context) {
        super(context);
        this.a = 7;
        setWillNotDraw(false);
    }
}
