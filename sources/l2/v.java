package l2;

import android.os.Bundle;
import org.telegram.messenger.i9;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.me0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements h2.o, p.a, i9, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ v(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    @Override // p.a
    public gc a(lc lcVar) {
        return lcVar.k(this.b);
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((p4.i1) obj).X(this.b);
                break;
            case 5:
                ((p4.i1) obj).r0(this.b);
                break;
            default:
                ((p4.i1) obj).x(this.b);
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

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        Bundle k10 = a8.p0.k("afterSignup", this.b);
        me0 me0Var = new me0();
        me0Var.r0(k10);
        return me0Var;
    }
}
