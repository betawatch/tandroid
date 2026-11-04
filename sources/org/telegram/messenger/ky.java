package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ky {
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
    public final /* synthetic */ yy L;
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
    public zi m;
    public TLRPC.EncryptedChat n;
    public b20 o;
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

    public ky(yy yyVar, long j10) {
        this.L = yyVar;
        this.a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ky kyVar, boolean z10) {
        ly lyVar = new ly();
        lyVar.a = tLObject;
        lyVar.c = arrayList;
        lyVar.e = arrayList2;
        lyVar.g = kyVar;
        lyVar.f = arrayList3;
        lyVar.i = z10;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(lyVar);
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
        int i3 = this.e;
        int i10 = hs.M;
        yy yyVar = this.L;
        if (i3 == 4) {
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                zi ziVar = (zi) this.x.get(i11);
                yyVar.getMessagesStorage().N0(ziVar.p1 ? 1 : 0, ziVar.k);
                TLRPC.Message message = ziVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                yyVar.getNotificationCenter().k(i10, Integer.valueOf(ziVar.f1()));
                yyVar.d0(ziVar.f1());
                yyVar.j0(ziVar.f1(), this.H);
            }
            yyVar.a.remove("group_" + this.F);
        } else {
            qr messagesStorage = yyVar.getMessagesStorage();
            zi ziVar2 = this.m;
            messagesStorage.N0(ziVar2.p1 ? 1 : 0, ziVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            yyVar.getNotificationCenter().k(i10, Integer.valueOf(this.m.f1()));
            yyVar.d0(this.m.f1());
            yyVar.j0(this.m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int i3 = this.e;
            if (i3 == 4 || i3 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ly lyVar = (ly) this.b.get(i10);
                    TLObject tLObject = lyVar.a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    yy yyVar = this.L;
                    if (z10) {
                        yyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        yyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, lyVar.c, lyVar.e, lyVar.f, lyVar.g, lyVar.i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                yyVar.P(tL_messages_sendMedia, lyVar.c, lyVar.e, lyVar.f, lyVar.g, lyVar.i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                yyVar.P(tL_messages_sendMedia2, lyVar.c, lyVar.e, lyVar.f, lyVar.g, lyVar.i);
                            }
                        }
                        yyVar.N(tLObject, lyVar.b, lyVar.d, lyVar.g, lyVar.h, null, lyVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
