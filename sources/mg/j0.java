package mg;

import java.util.HashMap;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ j0(r20 r20Var, HashMap hashMap, int i10) {
        this.a = i10;
        this.b = r20Var;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
