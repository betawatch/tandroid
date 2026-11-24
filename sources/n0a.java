// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n0a implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ a8 c;
    public final /* synthetic */ a8 d;
    public final /* synthetic */ a8 e;
    public final /* synthetic */ a8 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ a8 n;
    public final /* synthetic */ a8 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ n0a(a8 a8Var, ava avaVar, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.b = a8Var;
        this.s = avaVar;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a8 a8Var = this.r;
        a8 a8Var2 = this.n;
        boolean z = this.h;
        a8 a8Var3 = this.f;
        a8 a8Var4 = this.e;
        a8 a8Var5 = this.d;
        a8 a8Var6 = this.c;
        Object obj = this.s;
        a8 a8Var7 = this.b;
        switch (b) {
            case 0:
                ava avaVar = ((o0a) obj).c.T1;
                a8Var7.j(jb6.M0(avaVar.e ? 2131750130 : 2131750131, null), avaVar.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                a8Var6.setChecked(TLObject.hasFlag(avaVar.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(avaVar.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(avaVar.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(avaVar.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(avaVar.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(avaVar.g, 512));
                    break;
                }
                break;
            default:
                ava avaVar2 = (ava) obj;
                if (a8Var7 != null) {
                    a8Var7.j(jb6.M0(avaVar2.e ? 2131750130 : 2131750131, null), avaVar2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                a8Var6.setChecked(TLObject.hasFlag(avaVar2.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(avaVar2.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(avaVar2.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(avaVar2.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(avaVar2.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(avaVar2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n0a(o0a o0aVar, a8 a8Var, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.s = o0aVar;
        this.b = a8Var;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }
}
