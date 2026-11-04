package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jg(c1 c1Var, Object obj, boolean z10, long j10, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.e = obj;
        this.c = z10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.d;
        boolean z10 = this.c;
        Object obj = this.e;
        c1 c1Var = this.b;
        int i10 = 0;
        switch (i3) {
            case 0:
                li liVar = (li) c1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    liVar.q0[z10 ? 1 : 0] = j10;
                }
                liVar.x0[z10 ? 1 : 0] = false;
                liVar.K0(z10, false);
                break;
            case 1:
                li liVar2 = (li) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.c;
                if (!z11) {
                    boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j11 = this.d;
                    if (!z13) {
                        liVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        g0.h3(new lf(liVar2, z12, currentTimeMillis, i10));
                        liVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    liVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                hp hpVar = (hp) c1Var;
                hpVar.y1.k((a0.h) obj, j10);
                if (z10) {
                    hpVar.z1.delete(j10);
                    hpVar.S2(j10, false);
                    hpVar.getNotificationCenter().k(hs.u1, Long.valueOf(j10));
                    break;
                }
                break;
            case 3:
                hp hpVar2 = (hp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        hpVar2.Y3(arrayList, false);
                        io ioVar = new io();
                        ioVar.a = z10;
                        ioVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            ioVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!hpVar2.getUserConfig().q()) {
                            boolean z14 = r2.a;
                        }
                        hpVar2.Y7.put(Long.valueOf(j10), ioVar);
                        hpVar2.getNotificationCenter().k(hs.f3, Long.valueOf(j10));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    hpVar2.S3(arrayList2, false);
                    io ioVar2 = new io();
                    ioVar2.a = z10;
                    ioVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        ioVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!hpVar2.getUserConfig().q()) {
                        boolean z15 = r2.a;
                    }
                    hpVar2.Y7.put(Long.valueOf(j10), ioVar2);
                    hpVar2.getNotificationCenter().k(hs.f3, Long.valueOf(j10));
                    break;
                }
                break;
            case 4:
                hp hpVar3 = (hp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    hpVar3.getNotificationCenter().k(2, 64);
                }
                hpVar3.l5(0, j10, arrayList3);
                hpVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((qr) c1Var).getMessagesController().z4(null, (org.telegram.ui.ActionBar.b6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ jg(li liVar, ArrayList arrayList, long j10, boolean z10) {
        this.a = 0;
        this.b = liVar;
        this.e = arrayList;
        this.d = j10;
        this.c = z10;
    }

    public /* synthetic */ jg(hp hpVar, long j10, a0.h hVar, boolean z10) {
        this.a = 2;
        this.b = hpVar;
        this.d = j10;
        this.e = hVar;
        this.c = z10;
    }

    public /* synthetic */ jg(hp hpVar, boolean z10, long j10, ArrayList arrayList) {
        this.a = 4;
        this.b = hpVar;
        this.c = z10;
        this.d = j10;
        this.e = arrayList;
    }
}
