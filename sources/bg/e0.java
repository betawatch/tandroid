package bg;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ e0(Utilities.Callback callback, HashMap hashMap, int i9) {
        this.a = i9;
        this.b = callback;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
