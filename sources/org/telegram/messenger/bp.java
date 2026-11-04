package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bp {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public bp(int i3, long j10) {
        this.a = i3;
        this.b = j10;
    }

    public final TLRPC.Document a() {
        zi ziVar;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (ziVar = (zi) arrayList.get(0)) == null) {
            return null;
        }
        return ziVar.F0();
    }

    public final void b() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
        int i3 = this.a;
        tL_getSavedMusic.id = hp.s1(i3).o1(this.b);
        tL_getSavedMusic.offset = this.c.size();
        tL_getSavedMusic.limit = 30;
        ConnectionsManager.getInstance(i3).sendRequest(tL_getSavedMusic, new s1(this, 6));
    }

    public final void c(int i3, int i10) {
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.c;
        zi ziVar = (zi) arrayList.get(i10);
        zi ziVar2 = (zi) arrayList.get(i3);
        arrayList.set(i3, ziVar);
        arrayList.set(i10, ziVar2);
        if (a() != a10) {
            e();
        }
        zi ziVar3 = i10 == 0 ? null : (zi) arrayList.get(i10 - 1);
        TLRPC.Document F0 = ziVar2.F0();
        TLRPC.Document F02 = ziVar3 == null ? null : ziVar3.F0();
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

    public final zi d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = az.p();
        int i3 = this.a;
        hp s12 = hp.s1(i3);
        long j10 = this.b;
        tL_message.peer_id = s12.z1(j10);
        tL_message.from_id = hp.s1(i3).z1(j10);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        zi ziVar = new zi(i3, tL_message, false, false);
        ziVar.K(true);
        return ziVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i3 = this.a;
        hp s12 = hp.s1(i3);
        long j10 = this.b;
        TLRPC.UserFull b22 = s12.b2(j10);
        if (b22 == null) {
            return;
        }
        if (a10 == null) {
            b22.flags2 &= -2097153;
            b22.saved_music = null;
        } else {
            b22.flags2 |= TLObject.FLAG_21;
            b22.saved_music = a10;
        }
        qr.a0(i3).j2(b22, false);
        h10.i(i3).v(true);
        hs.f(i3).k(hs.V3, Long.valueOf(j10));
    }
}
