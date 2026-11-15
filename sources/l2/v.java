package l2;

import android.os.Bundle;
import org.telegram.messenger.j9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.je0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements h2.o, p.a, j9, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ v(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    @Override // p.a
    public xb a(cc ccVar) {
        return ccVar.k(this.b);
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
                ((e2.a1) obj).c(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        Bundle k10 = a8.p0.k("afterSignup", this.b);
        je0 je0Var = new je0();
        je0Var.r0(k10);
        return je0Var;
    }
}
