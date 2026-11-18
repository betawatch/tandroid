package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;

    public /* synthetic */ ep0(gt0 gt0Var, int i7) {
        this.a = i7;
        this.b = gt0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 3;
        gt0 gt0Var = this.b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new hn0(i10, gt0Var, i6Var), 100L);
                break;
            default:
                int[] iArr = gt0.t2;
                org.telegram.messenger.g0.h3(new hn0(i10, gt0Var, i6Var), 100L);
                break;
        }
    }
}
