package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class dz {
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
    public final /* synthetic */ rz L;
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
    public kj m;
    public TLRPC.EncryptedChat n;
    public y20 o;
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

    public dz(rz rzVar, long j10) {
        this.L = rzVar;
        this.a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, dz dzVar, boolean z10) {
        ez ezVar = new ez();
        ezVar.a = tLObject;
        ezVar.c = arrayList;
        ezVar.e = arrayList2;
        ezVar.g = dzVar;
        ezVar.f = arrayList3;
        ezVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(ezVar);
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
        int i11 = at.M;
        rz rzVar = this.L;
        if (i10 == 4) {
            for (int i12 = 0; i12 < this.x.size(); i12++) {
                kj kjVar = (kj) this.x.get(i12);
                rzVar.getMessagesStorage().N0(kjVar.p1 ? 1 : 0, kjVar.k);
                TLRPC.Message message = kjVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                rzVar.getNotificationCenter().k(i11, Integer.valueOf(kjVar.f1()));
                rzVar.d0(kjVar.f1());
                rzVar.j0(kjVar.f1(), this.H);
            }
            rzVar.a.remove("group_" + this.F);
        } else {
            is messagesStorage = rzVar.getMessagesStorage();
            kj kjVar2 = this.m;
            messagesStorage.N0(kjVar2.p1 ? 1 : 0, kjVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            rzVar.getNotificationCenter().k(i11, Integer.valueOf(this.m.f1()));
            rzVar.d0(this.m.f1());
            rzVar.j0(this.m.f1(), this.H);
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
                    ez ezVar = (ez) this.b.get(i11);
                    TLObject tLObject = ezVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    rz rzVar = this.L;
                    if (z10) {
                        rzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) ezVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        rzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, ezVar.c, ezVar.e, ezVar.f, ezVar.g, ezVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                rzVar.P(tL_messages_sendMedia, ezVar.c, ezVar.e, ezVar.f, ezVar.g, ezVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                rzVar.P(tL_messages_sendMedia2, ezVar.c, ezVar.e, ezVar.f, ezVar.g, ezVar.i);
                            }
                        }
                        rzVar.N(tLObject, ezVar.b, ezVar.d, ezVar.g, ezVar.h, null, ezVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
