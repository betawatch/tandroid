package l2;

import android.os.Bundle;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.me0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h2.o, p.a, k9, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
    }

    @Override // p.a
    public bc a(gc gcVar) {
        return gcVar.k(this.b);
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((p4.g1) obj).X(this.b);
                break;
            case 5:
                ((p4.g1) obj).r0(this.b);
                break;
            default:
                ((p4.g1) obj).x(this.b);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((e2.a1) obj).t(this.b);
                break;
            default:
                ((e2.a1) obj).f(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        Bundle k10 = a8.p0.k("afterSignup", this.b);
        me0 me0Var = new me0();
        me0Var.r0(k10);
        return me0Var;
    }
}
