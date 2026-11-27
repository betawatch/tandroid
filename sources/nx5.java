// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nx5 extends FrameLayout implements snb {
    public final ema a;
    public final jc0 b;
    public boolean c;
    public int d;
    public final /* synthetic */ ox5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx5(ox5 ox5Var, Context context) {
        super(context);
        this.e = ox5Var;
        int i = aob.i6;
        this.d = aob.w0(null, i, false);
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(16);
        emaVar.setEllipsizeByGradient(true);
        emaVar.setRightPadding(hl.L(68.0f));
        yob.W(emaVar, aob.j5, null);
        addView(emaVar, tre.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        jc0 jc0Var = new jc0(context, false);
        this.b = jc0Var;
        jc0Var.a.a = true;
        jc0Var.setStyle(11);
        jc0Var.setAvatarsTextSize(hl.L(22.0f));
        addView(jc0Var, tre.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(aob.Y(aob.w0(null, i, false), 0, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.c = true;
        ema emaVar = this.a;
        emaVar.setVisibility(8);
        super.onMeasure(i, i2);
        emaVar.setVisibility(0);
        emaVar.getLayoutParams().width = getMeasuredWidth();
        this.c = false;
        this.e.g();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // snb
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.i6, false);
            if (w0 != this.d) {
                this.d = w0;
                aob.F1(getBackground(), w0, true);
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
