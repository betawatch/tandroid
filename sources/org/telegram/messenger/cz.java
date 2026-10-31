package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class cz {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public HashMap E;
    public long F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Object K;
    public final /* synthetic */ qz L;
    public final long a;
    public ArrayList b;
    public TLObject c;
    public TLObject d;
    public int e;
    public String f;
    public TLRPC.PhotoSize g;
    public TLObject h;
    public TLRPC.PhotoSize i;
    public TLRPC.InputFile j;
    public boolean k;
    public String l;
    public jj m;
    public TLRPC.EncryptedChat n;
    public x20 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean[] s;
    public TLRPC.InputMedia t;
    public ArrayList u;
    public ArrayList v;
    public ArrayList w;
    public ArrayList x;
    public ArrayList y;
    public ArrayList z;

    public cz(qz qzVar, long j10) {
        this.L = qzVar;
        this.a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, cz czVar, boolean z10) {
        dz dzVar = new dz();
        dzVar.a = tLObject;
        dzVar.c = arrayList;
        dzVar.e = arrayList2;
        dzVar.g = czVar;
        dzVar.f = arrayList3;
        dzVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(dzVar);
    }

    public final void b(long j10) {
        this.e = 4;
        this.F = j10;
        this.x = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.y = new ArrayList();
        this.E = new HashMap();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i10 = this.e;
        int i11 = zs.M;
        qz qzVar = this.L;
        if (i10 == 4) {
            for (int i12 = 0; i12 < this.x.size(); i12++) {
                jj jjVar = (jj) this.x.get(i12);
                qzVar.getMessagesStorage().N0(jjVar.p1 ? 1 : 0, jjVar.k);
                TLRPC.Message message = jjVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                qzVar.getNotificationCenter().k(i11, Integer.valueOf(jjVar.f1()));
                qzVar.d0(jjVar.f1());
                qzVar.j0(jjVar.f1(), this.H);
            }
            qzVar.a.remove("group_" + this.F);
        } else {
            hs messagesStorage = qzVar.getMessagesStorage();
            jj jjVar2 = this.m;
            messagesStorage.N0(jjVar2.p1 ? 1 : 0, jjVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            qzVar.getNotificationCenter().k(i11, Integer.valueOf(this.m.f1()));
            qzVar.d0(this.m.f1());
            qzVar.j0(this.m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int i10 = this.e;
            if (i10 == 4 || i10 == 0) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    dz dzVar = (dz) this.b.get(i11);
                    TLObject tLObject = dzVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    qz qzVar = this.L;
                    if (z10) {
                        qzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) dzVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        qzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, dzVar.c, dzVar.e, dzVar.f, dzVar.g, dzVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                qzVar.P(tL_messages_sendMedia, dzVar.c, dzVar.e, dzVar.f, dzVar.g, dzVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                qzVar.P(tL_messages_sendMedia2, dzVar.c, dzVar.e, dzVar.f, dzVar.g, dzVar.i);
                            }
                        }
                        qzVar.N(tLObject, dzVar.b, dzVar.d, dzVar.g, dzVar.h, null, dzVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
