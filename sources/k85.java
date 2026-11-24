// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k85 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o85 b;

    public /* synthetic */ k85(o85 o85Var, byte b) {
        this.a = b;
        this.b = o85Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o85 o85Var = this.b;
        switch (b) {
            case 0:
                o85Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o85Var.i();
                m85 m85Var = o85Var.a;
                if (m85Var.getParent() != null) {
                    o85Var.n.updateViewLayout(m85Var, o85Var.s);
                    break;
                }
                break;
            default:
                o85Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m85 m85Var2 = o85Var.a;
                if (m85Var2.getParent() != null) {
                    o85Var.n.updateViewLayout(m85Var2, o85Var.s);
                    break;
                }
                break;
        }
    }
}
