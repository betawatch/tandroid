package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n3(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new aa.c0((r3) this.c, this.b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                break;
            case 1:
                g0.h3(new aa.c0((si) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 2:
                g0.h3(new aa.c0((si) this.c, tLObject, (SharedPreferences) this.d, this.b, 16));
                break;
            case 3:
                np npVar = (np) this.c;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                npVar.getClass();
                g0.h3(new aa.c0(npVar, tLObject, this.b, tL_contacts_getBlocked, 18));
                break;
            default:
                g0.h3(new aa.c0((qo) this.c, (int[]) this.d, tLObject, this.b, 20));
                break;
        }
    }

    public /* synthetic */ n3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = tLObject;
    }
}
