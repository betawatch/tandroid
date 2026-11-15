package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class qy {
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
    public final /* synthetic */ ez L;
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
    public gj m;
    public TLRPC.EncryptedChat n;
    public g20 o;
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

    public qy(ez ezVar, long j3) {
        this.L = ezVar;
        this.a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, qy qyVar, boolean z10) {
        ry ryVar = new ry();
        ryVar.a = tLObject;
        ryVar.c = arrayList;
        ryVar.e = arrayList2;
        ryVar.g = qyVar;
        ryVar.f = arrayList3;
        ryVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(ryVar);
    }

    public final void b(long j3) {
        this.e = 4;
        this.F = j3;
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
        int i7 = this.e;
        int i10 = ns.M;
        ez ezVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                gj gjVar = (gj) this.x.get(i11);
                ezVar.getMessagesStorage().N0(gjVar.r1 ? 1 : 0, gjVar.k);
                TLRPC.Message message = gjVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                ezVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                ezVar.d0(gjVar.e1());
                ezVar.j0(gjVar.e1(), this.H);
            }
            ezVar.a.remove("group_" + this.F);
        } else {
            vr messagesStorage = ezVar.getMessagesStorage();
            gj gjVar2 = this.m;
            messagesStorage.N0(gjVar2.r1 ? 1 : 0, gjVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            ezVar.getNotificationCenter().k(i10, Integer.valueOf(this.m.e1()));
            ezVar.d0(this.m.e1());
            ezVar.j0(this.m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int i7 = this.e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ry ryVar = (ry) this.b.get(i10);
                    TLObject tLObject = ryVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    ez ezVar = this.L;
                    if (z10) {
                        ezVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) ryVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        ezVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, ryVar.c, ryVar.e, ryVar.f, ryVar.g, ryVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                ezVar.P(tL_messages_sendMedia, ryVar.c, ryVar.e, ryVar.f, ryVar.g, ryVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                ezVar.P(tL_messages_sendMedia2, ryVar.c, ryVar.e, ryVar.f, ryVar.g, ryVar.i);
                            }
                        }
                        ezVar.N(tLObject, ryVar.b, ryVar.d, ryVar.g, ryVar.h, null, ryVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
