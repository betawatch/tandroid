package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ j9(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(LaunchActivity.T());
                break;
            case 1:
                org.telegram.messenger.g0.h3(new j9(this.b, 3));
                break;
            case 2:
                this.b.a(null);
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
