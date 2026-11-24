// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iv5 extends FrameLayout implements tjb {
    public final jia a;
    public final hc0 b;
    public boolean c;
    public int d;
    public final /* synthetic */ jv5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv5(jv5 jv5Var, Context context) {
        super(context);
        this.e = jv5Var;
        int i = bkb.h6;
        this.d = bkb.w0(null, i, false);
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setRightPadding(gl.L(68.0f));
        zkb.W(jiaVar, bkb.i5, null);
        addView(jiaVar, nme.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        hc0 hc0Var = new hc0(context, false);
        this.b = hc0Var;
        hc0Var.a.a = true;
        hc0Var.setStyle(11);
        hc0Var.setAvatarsTextSize(gl.L(22.0f));
        addView(hc0Var, nme.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(bkb.Y(bkb.w0(null, i, false), 0, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.c = true;
        jia jiaVar = this.a;
        jiaVar.setVisibility(8);
        super.onMeasure(i, i2);
        jiaVar.setVisibility(0);
        jiaVar.getLayoutParams().width = getMeasuredWidth();
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

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.h6, false);
            if (w0 != this.d) {
                this.d = w0;
                bkb.F1(getBackground(), w0, true);
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
