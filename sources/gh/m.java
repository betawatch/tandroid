package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.in0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class m extends LinearLayout {
    public static float b = 1.0f;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 6:
                if (!(getParent() instanceof in0)) {
                    return super.drawChild(canvas, view, j10);
                }
                in0 in0Var = (in0) getParent();
                canvas.save();
                LinearLayout linearLayout = in0Var.b;
                Path path = in0Var.n;
                if (view != null && in0.e(view)) {
                    int indexOfChild = linearLayout.indexOfChild(view);
                    int i9 = indexOfChild - 1;
                    View childAt = i9 < 0 ? null : linearLayout.getChildAt(i9);
                    int i10 = indexOfChild + 1;
                    View childAt2 = i10 < linearLayout.getChildCount() ? linearLayout.getChildAt(i10) : null;
                    boolean z10 = childAt != null && in0.e(childAt);
                    boolean z11 = childAt2 != null && in0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(in0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + in0Var.getScrollY() + in0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z10 && z11) {
                        z10 = view.getY() >= rectF.top;
                        boolean z12 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z10 || !z12) {
                            z11 = z12;
                        }
                    }
                    if (!z10 && !z11) {
                        path.rewind();
                        float f10 = in0Var.c;
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, in0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z11) {
                        path.rewind();
                        path.addRoundRect(rectF, in0Var.e, Path.Direction.CW);
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onLayout(z10, i9, i10, i11, i12);
                setPivotX(getWidth());
                break;
            case 5:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 6:
                super.onLayout(z10, i9, i10, i11, i12);
                if (getParent() instanceof in0) {
                    ((in0) getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 4:
            case 6:
            case 7:
            default:
                super.onMeasure(i9, i10);
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i9)), View.MeasureSpec.getMode(i9)), i10);
                break;
            case 8:
                super.onMeasure(i9, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 9:
                super.onMeasure(i9, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(600.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(800.0f)), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        this.a = 6;
        setWillNotDraw(false);
    }
}
