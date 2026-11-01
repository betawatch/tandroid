package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rg(f1 f1Var, Object obj, boolean z10, long j10, int i10) {
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
                vi viVar = (vi) f1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    viVar.p0[z10 ? 1 : 0] = j10;
                }
                viVar.w0[z10 ? 1 : 0] = false;
                viVar.K0(z10, false);
                break;
            case 1:
                vi viVar2 = (vi) f1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.c;
                if (!z11) {
                    boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j11 = this.d;
                    if (!z13) {
                        viVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        i0.g3(new sf(viVar2, z12, currentTimeMillis, i11));
                        viVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    viVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                wp wpVar = (wp) f1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        wpVar.V3(arrayList, false);
                        xo xoVar = new xo();
                        xoVar.a = z10;
                        xoVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            xoVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!wpVar.getUserConfig().q()) {
                            boolean z14 = v2.a;
                        }
                        wpVar.Z7.put(Long.valueOf(j10), xoVar);
                        wpVar.getNotificationCenter().k(at.f3, Long.valueOf(j10));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    wpVar.P3(arrayList2, false);
                    xo xoVar2 = new xo();
                    xoVar2.a = z10;
                    xoVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        xoVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!wpVar.getUserConfig().q()) {
                        boolean z15 = v2.a;
                    }
                    wpVar.Z7.put(Long.valueOf(j10), xoVar2);
                    wpVar.getNotificationCenter().k(at.f3, Long.valueOf(j10));
                    break;
                }
                break;
            case 3:
                wp wpVar2 = (wp) f1Var;
                wpVar2.x1.k((a0.h) obj, j10);
                if (z10) {
                    wpVar2.y1.delete(j10);
                    wpVar2.Q2(j10, false);
                    wpVar2.getNotificationCenter().k(at.u1, Long.valueOf(j10));
                    break;
                }
                break;
            case 4:
                wp wpVar3 = (wp) f1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    wpVar3.getNotificationCenter().k(2, 64);
                }
                wpVar3.i5(0, j10, arrayList3);
                wpVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((is) f1Var).getMessagesController().w4(null, (org.telegram.ui.ActionBar.m6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ rg(vi viVar, ArrayList arrayList, long j10, boolean z10) {
        this.a = 0;
        this.b = viVar;
        this.e = arrayList;
        this.d = j10;
        this.c = z10;
    }

    public /* synthetic */ rg(wp wpVar, long j10, a0.h hVar, boolean z10) {
        this.a = 3;
        this.b = wpVar;
        this.d = j10;
        this.e = hVar;
        this.c = z10;
    }

    public /* synthetic */ rg(wp wpVar, boolean z10, long j10, ArrayList arrayList) {
        this.a = 4;
        this.b = wpVar;
        this.c = z10;
        this.d = j10;
        this.e = arrayList;
    }
}
