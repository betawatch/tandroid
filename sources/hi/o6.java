package hi;

import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ o6(s6 s6Var, int i7) {
        this.a = i7;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                s6 s6Var = this.b;
                s6Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(kr.h).setDuration(280L).start();
                s6Var.c = System.currentTimeMillis();
                s6Var.invalidate();
                try {
                    s6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(s6Var.h, 59500L);
                break;
        }
    }
}
