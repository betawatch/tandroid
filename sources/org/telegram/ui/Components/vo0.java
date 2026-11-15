package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ vo0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 7;
        ys0 ys0Var = this.b;
        fi.l6 l6Var = (fi.l6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new hh0(i10, ys0Var, l6Var), 100L);
                break;
            default:
                int[] iArr = ys0.t2;
                org.telegram.messenger.g0.i3(new hh0(i10, ys0Var, l6Var), 100L);
                break;
        }
    }
}
