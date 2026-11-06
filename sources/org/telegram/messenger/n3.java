package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n3(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new aa.d0((r3) this.c, this.b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                break;
            case 1:
                g0.h3(new aa.d0((ui) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 2:
                g0.h3(new aa.d0((ui) this.c, tLObject, (SharedPreferences) this.d, this.b, 16));
                break;
            case 3:
                qp qpVar = (qp) this.c;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                qpVar.getClass();
                g0.h3(new aa.d0(qpVar, tLObject, this.b, tL_contacts_getBlocked, 18));
                break;
            default:
                g0.h3(new aa.d0((to) this.c, (int[]) this.d, tLObject, this.b, 20));
                break;
        }
    }

    public /* synthetic */ n3(Object obj, boolean z9, TLObject tLObject, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = tLObject;
    }
}
