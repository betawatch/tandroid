package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ so0(zs0 zs0Var, int i7) {
        this.a = i7;
        this.b = zs0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 13;
        zs0 zs0Var = this.b;
        di.s6 s6Var = (di.s6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new w80(i10, zs0Var, s6Var), 100L);
                break;
            default:
                int[] iArr = zs0.s2;
                org.telegram.messenger.g0.i3(new w80(i10, zs0Var, s6Var), 100L);
                break;
        }
    }
}
