package l2;

import android.os.Bundle;
import org.telegram.messenger.i9;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.le0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h2.o, p.a, i9, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    @Override // p.a
    public fc a(kc kcVar) {
        return kcVar.k(this.b);
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((p4.h1) obj).Y(this.b);
                break;
            case 5:
                ((p4.h1) obj).s0(this.b);
                break;
            default:
                ((p4.h1) obj).y(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        Bundle k10 = a8.p0.k("afterSignup", this.b);
        le0 le0Var = new le0();
        le0Var.r0(k10);
        return le0Var;
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
}
