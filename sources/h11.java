// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class h11 extends q11 {
    private g11 button;
    private int childrenMeasuredWidth;
    wjb resourcesProvider;
    public f21 timerView;
    private boolean wrapWidth;

    public h11(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.resourcesProvider = wjbVar;
    }

    public g11 getButton() {
        return this.button;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        g11 g11Var = this.button;
        if (g11Var != null && view != g11Var) {
            i2 = b00.z(12.0f, g11Var.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31);
        }
        super.onMeasure(i, i2);
        if (this.button == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
    }

    public void setButton(g11 g11Var) {
        g11 g11Var2 = this.button;
        if (g11Var2 != null) {
            removeCallback(g11Var2);
            removeView(this.button);
        }
        this.button = g11Var;
        if (g11Var != null) {
            addCallback(g11Var);
            addView(g11Var, 0, nme.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        f21 f21Var = new f21(getContext(), this.resourcesProvider);
        this.timerView = f21Var;
        f21Var.b = 5000L;
        addView(f21Var, nme.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
