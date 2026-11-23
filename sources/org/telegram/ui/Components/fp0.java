package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ fp0(it0 it0Var, int i7) {
        this.a = i7;
        this.b = it0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 7;
        it0 it0Var = this.b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new sh0(i10, it0Var, i6Var), 100L);
                break;
            default:
                int[] iArr = it0.t2;
                org.telegram.messenger.g0.h3(new sh0(i10, it0Var, i6Var), 100L);
                break;
        }
    }
}
