// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class aq8 extends zb3 {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public aq8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // zb3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // zb3
    public final void N() {
        hl.c3(new uk8(this, (byte) 6));
    }

    @Override // zb3
    public final void P(f89 f89Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.J3();
    }

    @Override // zb3, o79
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pv7(this, (byte) 16));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().p(null, this.F, true);
        }
        super.m();
    }
}
