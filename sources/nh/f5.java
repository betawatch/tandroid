package nh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f5 extends i4 {
    public final /* synthetic */ i9 K;
    public final /* synthetic */ m5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(Context context, m5 m5Var, i9 i9Var) {
        super(context);
        this.L = m5Var;
        this.K = i9Var;
        this.w = -1;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.F = new GestureDetector(new fg.e(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.E = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override // nh.i4
    public final void b(int i10) {
        e9 e9Var;
        m5 m5Var = this.L;
        g5 g5Var = m5Var.B;
        if (m5Var.w) {
            return;
        }
        if (g5Var.getCurrentItem() != i10) {
            try {
                g5Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                g5Var.getAdapter().g();
                g5Var.x(i10, false);
            }
        }
        i9 i9Var = this.K;
        if (i9Var.L0 == null || (e9Var = i9Var.q0) == null) {
            return;
        }
        if (i10 < 10) {
            e9Var.b(false);
        } else if (i10 >= this.B.size() - 10) {
            i9Var.q0.b(true);
        }
    }
}
