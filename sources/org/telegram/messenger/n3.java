package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n3(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new ci.u8((r3) this.c, this.b, tLObject, (TL_phone.getGroupParticipants) this.d));
                break;
            case 1:
                g0.h3(new ci.u8((li) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 2:
                g0.h3(new ci.u8(this.c, tLObject, this.d, this.b, 16));
                break;
            case 3:
                hp hpVar = (hp) this.c;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                hpVar.getClass();
                g0.h3(new ci.u8(hpVar, tLObject, this.b, tL_contacts_getBlocked));
                break;
            default:
                g0.h3(new ci.u8((ko) this.c, (int[]) this.d, tLObject, this.b, 20));
                break;
        }
    }

    public /* synthetic */ n3(Object obj, boolean z10, TLObject tLObject, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = tLObject;
    }
}
