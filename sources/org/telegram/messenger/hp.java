package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class hp {
    public final int a;
    public final long b;
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public boolean f;

    public hp(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public final TLRPC.Document a() {
        gj gjVar;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty() || (gjVar = (gj) arrayList.get(0)) == null) {
            return null;
        }
        return gjVar.F0();
    }

    public final void b() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
        int i7 = this.a;
        tL_getSavedMusic.id = np.s1(i7).o1(this.b);
        tL_getSavedMusic.offset = this.c.size();
        tL_getSavedMusic.limit = 30;
        ConnectionsManager.getInstance(i7).sendRequest(tL_getSavedMusic, new s1(this, 6));
    }

    public final void c(int i7, int i10) {
        TLRPC.Document a10 = a();
        ArrayList arrayList = this.c;
        gj gjVar = (gj) arrayList.get(i10);
        gj gjVar2 = (gj) arrayList.get(i7);
        arrayList.set(i7, gjVar);
        arrayList.set(i10, gjVar2);
        if (a() != a10) {
            e();
        }
        gj gjVar3 = i10 == 0 ? null : (gj) arrayList.get(i10 - 1);
        TLRPC.Document F0 = gjVar2.F0();
        TLRPC.Document F02 = gjVar3 == null ? null : gjVar3.F0();
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

    public final gj d(TLRPC.Document document) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = gz.p();
        int i7 = this.a;
        np s12 = np.s1(i7);
        long j3 = this.b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.from_id = np.s1(i7).z1(j3);
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.document = document;
        gj gjVar = new gj(i7, tL_message, false, false);
        gjVar.K(true);
        return gjVar;
    }

    public final void e() {
        TLRPC.Document a10 = a();
        int i7 = this.a;
        np s12 = np.s1(i7);
        long j3 = this.b;
        TLRPC.UserFull b22 = s12.b2(j3);
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
        vr.a0(i7).j2(b22, false);
        m10.i(i7).v(true);
        ns.f(i7).k(ns.V3, Long.valueOf(j3));
    }
}
