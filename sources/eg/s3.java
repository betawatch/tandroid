package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eo0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class s3 extends LinearLayout {
    public static float b = 1.0f;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 7:
                if (!(getParent() instanceof eo0)) {
                    return super.drawChild(canvas, view, j10);
                }
                eo0 eo0Var = (eo0) getParent();
                canvas.save();
                LinearLayout linearLayout = eo0Var.b;
                Path path = eo0Var.n;
                if (view != null && eo0.e(view)) {
                    int indexOfChild = linearLayout.indexOfChild(view);
                    int i10 = indexOfChild - 1;
                    View childAt = i10 < 0 ? null : linearLayout.getChildAt(i10);
                    int i11 = indexOfChild + 1;
                    View childAt2 = i11 < linearLayout.getChildCount() ? linearLayout.getChildAt(i11) : null;
                    boolean z4 = childAt != null && eo0.e(childAt);
                    boolean z10 = childAt2 != null && eo0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(eo0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + eo0Var.getScrollY() + eo0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z4 && z10) {
                        z4 = view.getY() >= rectF.top;
                        boolean z11 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z4 || !z11) {
                            z10 = z11;
                        }
                    }
                    if (!z4 && !z10) {
                        path.rewind();
                        float f10 = eo0Var.c;
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z4) {
                        path.rewind();
                        path.addRoundRect(rectF, eo0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, eo0Var.e, Path.Direction.CW);
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                setPivotX(getWidth());
                break;
            case 6:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                if (getParent() instanceof eo0) {
                    ((eo0) getParent()).invalidate();
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
    public s3(Context context) {
        super(context);
        this.a = 7;
        setWillNotDraw(false);
    }
}
