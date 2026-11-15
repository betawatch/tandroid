package hi;

import org.telegram.messenger.z10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ h9(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(LaunchActivity.T());
                break;
            case 1:
                org.telegram.messenger.g0.h3(new h9(this.b, 3));
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
