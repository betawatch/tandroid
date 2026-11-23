package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p3(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new aa.c0((t3) this.c, this.b, tLObject, (TL_phone.getGroupParticipants) this.d, 9));
                break;
            case 1:
                g0.g3(new aa.c0((ri) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 2:
                g0.g3(new aa.c0((ri) this.c, tLObject, (SharedPreferences) this.d, this.b, 16));
                break;
            case 3:
                mp mpVar = (mp) this.c;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                mpVar.getClass();
                g0.g3(new aa.c0(mpVar, tLObject, this.b, tL_contacts_getBlocked, 18));
                break;
            default:
                g0.g3(new aa.c0((po) this.c, (int[]) this.d, tLObject, this.b, 20));
                break;
        }
    }

    public /* synthetic */ p3(Object obj, boolean z10, TLObject tLObject, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = tLObject;
    }
}
