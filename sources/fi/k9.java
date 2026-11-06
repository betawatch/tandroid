package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ k9(c20 c20Var, int i7) {
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
                org.telegram.messenger.g0.h3(new k9(this.b, 3));
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
