package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qg(f1 f1Var, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.e = obj;
        this.c = z10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        boolean z10 = this.c;
        Object obj = this.e;
        f1 f1Var = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                ui uiVar = (ui) f1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    uiVar.p0[z10 ? 1 : 0] = j10;
                }
                uiVar.w0[z10 ? 1 : 0] = false;
                uiVar.K0(z10, false);
                break;
            case 1:
                ui uiVar2 = (ui) f1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.c;
                if (!z11) {
                    boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j11 = this.d;
                    if (!z13) {
                        uiVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        i0.g3(new rf(uiVar2, z12, currentTimeMillis, i11));
                        uiVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    uiVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                vp vpVar = (vp) f1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        vpVar.V3(arrayList, false);
                        wo woVar = new wo();
                        woVar.a = z10;
                        woVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            woVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!vpVar.getUserConfig().q()) {
                            boolean z14 = v2.a;
                        }
                        vpVar.Z7.put(Long.valueOf(j10), woVar);
                        vpVar.getNotificationCenter().k(zs.f3, Long.valueOf(j10));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    vpVar.P3(arrayList2, false);
                    wo woVar2 = new wo();
                    woVar2.a = z10;
                    woVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        woVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!vpVar.getUserConfig().q()) {
                        boolean z15 = v2.a;
                    }
                    vpVar.Z7.put(Long.valueOf(j10), woVar2);
                    vpVar.getNotificationCenter().k(zs.f3, Long.valueOf(j10));
                    break;
                }
                break;
            case 3:
                vp vpVar2 = (vp) f1Var;
                vpVar2.x1.k((a0.h) obj, j10);
                if (z10) {
                    vpVar2.y1.delete(j10);
                    vpVar2.Q2(j10, false);
                    vpVar2.getNotificationCenter().k(zs.u1, Long.valueOf(j10));
                    break;
                }
                break;
            case 4:
                vp vpVar3 = (vp) f1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    vpVar3.getNotificationCenter().k(2, 64);
                }
                vpVar3.i5(0, j10, arrayList3);
                vpVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((hs) f1Var).getMessagesController().w4(null, (org.telegram.ui.ActionBar.m6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ qg(ui uiVar, ArrayList arrayList, long j10, boolean z10) {
        this.a = 0;
        this.b = uiVar;
        this.e = arrayList;
        this.d = j10;
        this.c = z10;
    }

    public /* synthetic */ qg(vp vpVar, long j10, a0.h hVar, boolean z10) {
        this.a = 3;
        this.b = vpVar;
        this.d = j10;
        this.e = hVar;
        this.c = z10;
    }

    public /* synthetic */ qg(vp vpVar, boolean z10, long j10, ArrayList arrayList) {
        this.a = 4;
        this.b = vpVar;
        this.c = z10;
        this.d = j10;
        this.e = arrayList;
    }
}
