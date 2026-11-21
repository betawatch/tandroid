package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class ly {
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
    public final /* synthetic */ zy L;
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
    public fj m;
    public TLRPC.EncryptedChat n;
    public e20 o;
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

    public ly(zy zyVar, long j3) {
        this.L = zyVar;
        this.a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ly lyVar, boolean z10) {
        my myVar = new my();
        myVar.a = tLObject;
        myVar.c = arrayList;
        myVar.e = arrayList2;
        myVar.g = lyVar;
        myVar.f = arrayList3;
        myVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(myVar);
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
        int i10 = ks.M;
        zy zyVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                fj fjVar = (fj) this.x.get(i11);
                zyVar.getMessagesStorage().N0(fjVar.r1 ? 1 : 0, fjVar.k);
                TLRPC.Message message = fjVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                zyVar.getNotificationCenter().k(i10, Integer.valueOf(fjVar.e1()));
                zyVar.d0(fjVar.e1());
                zyVar.j0(fjVar.e1(), this.H);
            }
            zyVar.a.remove("group_" + this.F);
        } else {
            tr messagesStorage = zyVar.getMessagesStorage();
            fj fjVar2 = this.m;
            messagesStorage.N0(fjVar2.r1 ? 1 : 0, fjVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            zyVar.getNotificationCenter().k(i10, Integer.valueOf(this.m.e1()));
            zyVar.d0(this.m.e1());
            zyVar.j0(this.m.e1(), this.H);
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
                    my myVar = (my) this.b.get(i10);
                    TLObject tLObject = myVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    zy zyVar = this.L;
                    if (z10) {
                        zyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        zyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, myVar.c, myVar.e, myVar.f, myVar.g, myVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                zyVar.P(tL_messages_sendMedia, myVar.c, myVar.e, myVar.f, myVar.g, myVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                zyVar.P(tL_messages_sendMedia2, myVar.c, myVar.e, myVar.f, myVar.g, myVar.i);
                            }
                        }
                        zyVar.N(tLObject, myVar.b, myVar.d, myVar.g, myVar.h, null, myVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
