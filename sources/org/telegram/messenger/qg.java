package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qg(c1 c1Var, Object obj, boolean z10, long j3, int i7) {
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
                si siVar = (si) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    siVar.q0[z10 ? 1 : 0] = j3;
                }
                siVar.x0[z10 ? 1 : 0] = false;
                siVar.K0(z10, false);
                break;
            case 1:
                si siVar2 = (si) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.c;
                if (!z11) {
                    boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j10 = this.d;
                    if (!z13) {
                        siVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        g0.h3(new sf(siVar2, z12, currentTimeMillis, i10));
                        siVar2.G1(z12, null, null, currentTimeMillis, j10, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    siVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                np npVar = (np) c1Var;
                npVar.y1.k((a0.h) obj, j3);
                if (z10) {
                    npVar.z1.delete(j3);
                    npVar.S2(j3, false);
                    npVar.getNotificationCenter().k(ns.u1, Long.valueOf(j3));
                    break;
                }
                break;
            case 3:
                np npVar2 = (np) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        npVar2.Y3(arrayList, false);
                        oo ooVar = new oo();
                        ooVar.a = z10;
                        ooVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            ooVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!npVar2.getUserConfig().q()) {
                            boolean z14 = r2.a;
                        }
                        npVar2.Z7.put(Long.valueOf(j3), ooVar);
                        npVar2.getNotificationCenter().k(ns.f3, Long.valueOf(j3));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    npVar2.S3(arrayList2, false);
                    oo ooVar2 = new oo();
                    ooVar2.a = z10;
                    ooVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        ooVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!npVar2.getUserConfig().q()) {
                        boolean z15 = r2.a;
                    }
                    npVar2.Z7.put(Long.valueOf(j3), ooVar2);
                    npVar2.getNotificationCenter().k(ns.f3, Long.valueOf(j3));
                    break;
                }
                break;
            case 4:
                np npVar3 = (np) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    npVar3.getNotificationCenter().k(2, 64);
                }
                npVar3.m5(0, j3, arrayList3);
                npVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((vr) c1Var).getMessagesController().z4(null, (org.telegram.ui.ActionBar.b6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ qg(si siVar, ArrayList arrayList, long j3, boolean z10) {
        this.a = 0;
        this.b = siVar;
        this.e = arrayList;
        this.d = j3;
        this.c = z10;
    }

    public /* synthetic */ qg(np npVar, long j3, a0.h hVar, boolean z10) {
        this.a = 2;
        this.b = npVar;
        this.d = j3;
        this.e = hVar;
        this.c = z10;
    }

    public /* synthetic */ qg(np npVar, boolean z10, long j3, ArrayList arrayList) {
        this.a = 4;
        this.b = npVar;
        this.c = z10;
        this.d = j3;
        this.e = arrayList;
    }
}
