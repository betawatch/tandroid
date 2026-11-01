package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new bi.n4((u3) this.c, this.b, tLObject, (TL_phone.getGroupParticipants) this.d, 7));
                break;
            case 1:
                i0.g3(new bi.n4((vi) this.c, tL_error, tLObject, (String) this.d, this.b));
                break;
            case 2:
                i0.g3(new bi.n4((vi) this.c, tLObject, (SharedPreferences) this.d, this.b, 14));
                break;
            case 3:
                wp wpVar = (wp) this.c;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                wpVar.getClass();
                i0.g3(new bi.n4(wpVar, tLObject, this.b, tL_contacts_getBlocked, 16));
                break;
            default:
                i0.g3(new bi.n4((zo) this.c, (int[]) this.d, tLObject, this.b, 18));
                break;
        }
    }

    public /* synthetic */ q3(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = tLObject;
    }
}
