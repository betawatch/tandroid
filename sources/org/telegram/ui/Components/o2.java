package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o2(int i10, int i11, long j10, Object obj, Object obj2) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = i10;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.n00(tLObject, this.c, (vh.d) this.d, (org.telegram.ui.ActionBar.z2) this.e, this.b, tL_error));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.n00((org.telegram.ui.rg0) this.d, tL_error, tLObject, this.b, this.c, (TLRPC.Chat) this.e, 3));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.e1((rh.r) this.d, (rh.q) this.e, this.c, tLObject, this.b, 2));
                break;
            case 3:
                vh.d dVar = (vh.d) this.d;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.e;
                org.telegram.messenger.i0.g3(new org.telegram.ui.z(this.c, 7, this.b, dVar, z2VarArr));
                break;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.e1((th.e5) this.d, tLObject, this.c, (String) this.e, this.b, 4));
                break;
        }
    }

    public /* synthetic */ o2(int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10) {
        this.a = 0;
        this.c = i10;
        this.d = dVar;
        this.e = z2Var;
        this.b = j10;
    }

    public /* synthetic */ o2(org.telegram.ui.rg0 rg0Var, long j10, int i10, TLRPC.Chat chat) {
        this.a = 1;
        this.d = rg0Var;
        this.b = j10;
        this.c = i10;
        this.e = chat;
    }

    public /* synthetic */ o2(th.e5 e5Var, int i10, String str, long j10) {
        this.a = 4;
        this.d = e5Var;
        this.c = i10;
        this.e = str;
        this.b = j10;
    }
}
