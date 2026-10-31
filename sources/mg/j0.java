package mg;

import java.util.HashMap;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ j0(q20 q20Var, HashMap hashMap, int i10) {
        this.a = i10;
        this.b = q20Var;
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
