package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class sy {
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
    public final /* synthetic */ gz L;
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
    public ij m;
    public TLRPC.EncryptedChat n;
    public j20 o;
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

    public sy(gz gzVar, long j3) {
        this.L = gzVar;
        this.a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sy syVar, boolean z9) {
        ty tyVar = new ty();
        tyVar.a = tLObject;
        tyVar.c = arrayList;
        tyVar.e = arrayList2;
        tyVar.g = syVar;
        tyVar.f = arrayList3;
        tyVar.i = z9;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(tyVar);
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
        int i10 = qs.M;
        gz gzVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                ij ijVar = (ij) this.x.get(i11);
                gzVar.getMessagesStorage().N0(ijVar.p1 ? 1 : 0, ijVar.k);
                TLRPC.Message message = ijVar.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                gzVar.getNotificationCenter().k(i10, Integer.valueOf(ijVar.e1()));
                gzVar.d0(ijVar.e1());
                gzVar.j0(ijVar.e1(), this.H);
            }
            gzVar.a.remove("group_" + this.F);
        } else {
            yr messagesStorage = gzVar.getMessagesStorage();
            ij ijVar2 = this.m;
            messagesStorage.N0(ijVar2.p1 ? 1 : 0, ijVar2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            gzVar.getNotificationCenter().k(i10, Integer.valueOf(this.m.e1()));
            gzVar.d0(this.m.e1());
            gzVar.j0(this.m.e1(), this.H);
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
                    ty tyVar = (ty) this.b.get(i10);
                    TLObject tLObject = tyVar.a;
                    boolean z9 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    gz gzVar = this.L;
                    if (z9) {
                        gzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) tyVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        gzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, tyVar.c, tyVar.e, tyVar.f, tyVar.g, tyVar.i);
                    } else {
                        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                gzVar.P(tL_messages_sendMedia, tyVar.c, tyVar.e, tyVar.f, tyVar.g, tyVar.i);
                            }
                        }
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                gzVar.P(tL_messages_sendMedia2, tyVar.c, tyVar.e, tyVar.f, tyVar.g, tyVar.i);
                            }
                        }
                        gzVar.N(tLObject, tyVar.b, tyVar.d, tyVar.g, tyVar.h, null, tyVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
