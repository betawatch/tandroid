package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements org.telegram.ui.ActionBar.q1, cq {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ e8(q8 q8Var, int i7) {
        this.a = i7;
        this.b = q8Var;
    }

    @Override // org.telegram.ui.Components.cq
    public void c(int i7, int i10, boolean z10) {
        q8 q8Var = this.b;
        if (i10 == 0) {
            m8 m8Var = q8Var.Z;
            int i11 = m8Var.c;
            if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                m8 a10 = m8Var.a();
                q8Var.Z = a10;
                q8Var.a.b(a10, true);
                q8Var.s0();
            }
            q8Var.Z.c = i7;
        } else if (i10 == 1) {
            m8 m8Var2 = q8Var.Z;
            int i12 = m8Var2.d;
            if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                m8 a11 = m8Var2.a();
                q8Var.Z = a11;
                q8Var.a.b(a11, true);
                q8Var.s0();
            }
            q8Var.Z.d = i7;
        } else if (i10 == 2) {
            m8 m8Var3 = q8Var.Z;
            int i13 = m8Var3.e;
            if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                m8 a12 = m8Var3.a();
                q8Var.Z = a12;
                q8Var.a.b(a12, true);
                q8Var.s0();
            }
            q8Var.Z.e = i7;
        } else if (i10 == 3) {
            m8 m8Var4 = q8Var.Z;
            int i14 = m8Var4.f;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                m8 a13 = m8Var4.a();
                q8Var.Z = a13;
                q8Var.a.b(a13, true);
                q8Var.s0();
            }
            q8Var.Z.f = i7;
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
        q8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.cq
    public /* synthetic */ int d(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cq
    public /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cq
    public /* synthetic */ void b() {
    }
}
