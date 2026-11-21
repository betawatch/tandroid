package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class gp {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public gp(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public final TLRPC.Document a() {
        fj fjVar;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (fjVar = (fj) arrayList.get(0)) == null) {
            return null;
        }
        return fjVar.F0();
    }

    public final void b() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
        int i7 = this.a;
        tL_getSavedMusic.id = mp.u1(i7).q1(this.b);
        tL_getSavedMusic.offset = this.c.size();
        tL_getSavedMusic.limit = 30;
        ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
    }

    public final void c(int i7, int i10) {
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.c;
        fj fjVar = (fj) arrayList.get(i10);
        fj fjVar2 = (fj) arrayList.get(i7);
        arrayList.set(i7, fjVar);
        arrayList.set(i10, fjVar2);
        if (a() != a10) {
            e();
        }
        fj fjVar3 = i10 == 0 ? null : (fj) arrayList.get(i10 - 1);
        TLRPC.Document F0 = fjVar2.F0();
        TLRPC.Document F02 = fjVar3 == null ? null : fjVar3.F0();
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        if (F0 == null) {
            return;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = F0.id;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        if (F02 != null) {
            tL_account_saveMusic.flags |= 2;
            TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.after_id = tL_inputDocument2;
            tL_inputDocument2.id = F02.id;
            tL_inputDocument2.access_hash = F02.access_hash;
            byte[] bArr2 = F02.file_reference;
            tL_inputDocument2.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument2.file_reference = new byte[0];
            }
        }
        tL_account_saveMusic.unsave = false;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, null);
    }

    public final fj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = bz.p();
        int i7 = this.a;
        mp u12 = mp.u1(i7);
        long j3 = this.b;
        tL_message.peer_id = u12.B1(j3);
        tL_message.from_id = mp.u1(i7).B1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        fj fjVar = new fj(i7, tL_message, false, false);
        fjVar.K(true);
        return fjVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.a;
        mp u12 = mp.u1(i7);
        long j3 = this.b;
        TLRPC.UserFull d2 = u12.d2(j3);
        if (d2 == null) {
            return;
        }
        if (a10 == null) {
            d2.flags2 &= -2097153;
            d2.saved_music = null;
        } else {
            d2.flags2 |= TLObject.FLAG_21;
            d2.saved_music = a10;
        }
        tr.a0(i7).j2(d2, false);
        j10.i(i7).v(true);
        ks.f(i7).k(ks.Y3, Long.valueOf(j3));
    }
}
