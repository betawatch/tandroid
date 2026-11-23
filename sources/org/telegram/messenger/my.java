package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class my {
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
    public final /* synthetic */ az L;
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
    public f20 o;
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

    public my(az azVar, long j3) {
        this.L = azVar;
        this.a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, my myVar, boolean z10) {
        ny nyVar = new ny();
        nyVar.a = tLObject;
        nyVar.c = arrayList;
        nyVar.e = arrayList2;
        nyVar.g = myVar;
        nyVar.f = arrayList3;
        nyVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(nyVar);
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
        int i10 = ls.M;
        az azVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                gj gjVar = (gj) this.x.get(i11);
                azVar.getMessagesStorage().N0(gjVar.r1 ? 1 : 0, gjVar.k);
                TLRPC.Message message = gjVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                azVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                azVar.d0(gjVar.e1());
                azVar.j0(gjVar.e1(), this.H);
            }
            azVar.a.remove("group_" + this.F);
        } else {
            ur messagesStorage = azVar.getMessagesStorage();
            gj gjVar2 = this.m;
            messagesStorage.N0(gjVar2.r1 ? 1 : 0, gjVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            azVar.getNotificationCenter().k(i10, Integer.valueOf(this.m.e1()));
            azVar.d0(this.m.e1());
            azVar.j0(this.m.e1(), this.H);
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
                    ny nyVar = (ny) this.b.get(i10);
                    TLObject tLObject = nyVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    az azVar = this.L;
                    if (z10) {
                        azVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) nyVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        azVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, nyVar.c, nyVar.e, nyVar.f, nyVar.g, nyVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                azVar.P(tL_messages_sendMedia, nyVar.c, nyVar.e, nyVar.f, nyVar.g, nyVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                azVar.P(tL_messages_sendMedia2, nyVar.c, nyVar.e, nyVar.f, nyVar.g, nyVar.i);
                            }
                        }
                        azVar.N(tLObject, nyVar.b, nyVar.d, nyVar.g, nyVar.h, null, nyVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
