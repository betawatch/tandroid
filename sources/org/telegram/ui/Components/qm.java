package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;

    public /* synthetic */ qm(qn qnVar, int i7, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.c) obj);
                break;
            default:
                qn qnVar = this.b;
                qnVar.getClass();
                qnVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
