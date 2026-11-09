package l2;

import android.os.Bundle;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.le0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h2.o, p.a, k9, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
    }

    @Override // p.a
    public cc a(hc hcVar) {
        return hcVar.k(this.b);
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
        le0 le0Var = new le0();
        le0Var.r0(k10);
        return le0Var;
    }
}
