package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pg(c1 c1Var, Object obj, boolean z10, long j3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.e = obj;
        this.c = z10;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        boolean z10 = this.c;
        Object obj = this.e;
        c1 c1Var = this.b;
        int i10 = 0;
        switch (i7) {
            case 0:
                ri riVar = (ri) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    riVar.q0[z10 ? 1 : 0] = j3;
                }
                riVar.x0[z10 ? 1 : 0] = false;
                riVar.N0(z10, false);
                break;
            case 1:
                ri riVar2 = (ri) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.c;
                if (!z11) {
                    boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j10 = this.d;
                    if (!z13) {
                        riVar2.w1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        g0.g3(new sf(riVar2, z12, currentTimeMillis, i10));
                        riVar2.L1(z12, null, null, currentTimeMillis, j10, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    riVar2.w1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                mp mpVar = (mp) c1Var;
                mpVar.A1.k((a0.h) obj, j3);
                if (z10) {
                    mpVar.B1.delete(j3);
                    mpVar.Y2(j3, false);
                    mpVar.getNotificationCenter().k(ks.u1, Long.valueOf(j3));
                    break;
                }
                break;
            case 3:
                mp mpVar2 = (mp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        mpVar2.f4(arrayList, false);
                        no noVar = new no();
                        noVar.a = z10;
                        noVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            noVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!mpVar2.getUserConfig().q()) {
                            boolean z14 = s2.a;
                        }
                        mpVar2.e8.put(Long.valueOf(j3), noVar);
                        mpVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    mpVar2.Z3(arrayList2, false);
                    no noVar2 = new no();
                    noVar2.a = z10;
                    noVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        noVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!mpVar2.getUserConfig().q()) {
                        boolean z15 = s2.a;
                    }
                    mpVar2.e8.put(Long.valueOf(j3), noVar2);
                    mpVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                    break;
                }
                break;
            case 4:
                mp mpVar3 = (mp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    mpVar3.getNotificationCenter().k(2, 64);
                }
                mpVar3.x5(0, j3, arrayList3);
                mpVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((tr) c1Var).getMessagesController().J4(null, (org.telegram.ui.ActionBar.e6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ pg(ri riVar, ArrayList arrayList, long j3, boolean z10) {
        this.a = 0;
        this.b = riVar;
        this.e = arrayList;
        this.d = j3;
        this.c = z10;
    }

    public /* synthetic */ pg(mp mpVar, long j3, a0.h hVar, boolean z10) {
        this.a = 2;
        this.b = mpVar;
        this.d = j3;
        this.e = hVar;
        this.c = z10;
    }

    public /* synthetic */ pg(mp mpVar, boolean z10, long j3, ArrayList arrayList) {
        this.a = 4;
        this.b = mpVar;
        this.c = z10;
        this.d = j3;
        this.e = arrayList;
    }
}
