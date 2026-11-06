package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rg(c1 c1Var, Object obj, boolean z9, long j3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.e = obj;
        this.c = z9;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        boolean z9 = this.c;
        Object obj = this.e;
        c1 c1Var = this.b;
        int i10 = 0;
        switch (i7) {
            case 0:
                ui uiVar = (ui) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    uiVar.p0[z9 ? 1 : 0] = j3;
                }
                uiVar.w0[z9 ? 1 : 0] = false;
                uiVar.K0(z9, false);
                break;
            case 1:
                ui uiVar2 = (ui) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z11 = this.c;
                if (!z10) {
                    boolean z12 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                    long j10 = this.d;
                    if (!z12) {
                        uiVar2.t1(z11, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                        break;
                    } else {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        g0.h3(new tf(uiVar2, z11, currentTimeMillis, i10));
                        uiVar2.G1(z11, null, null, currentTimeMillis, j10, false);
                        break;
                    }
                } else {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    uiVar2.t1(z11, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    break;
                }
            case 2:
                qp qpVar = (qp) c1Var;
                qpVar.x1.k((a0.h) obj, j3);
                if (z9) {
                    qpVar.y1.delete(j3);
                    qpVar.S2(j3, false);
                    qpVar.getNotificationCenter().k(qs.u1, Long.valueOf(j3));
                    break;
                }
                break;
            case 3:
                qp qpVar2 = (qp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.messages_Chats)) {
                    if (tLObject2 instanceof TLRPC.Users) {
                        ArrayList<TLRPC.User> arrayList = ((TLRPC.Users) tLObject2).users;
                        qpVar2.Y3(arrayList, false);
                        ro roVar = new ro();
                        roVar.a = z9;
                        roVar.b.addAll(arrayList);
                        if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                            roVar.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList.size());
                        } else if (!qpVar2.getUserConfig().q()) {
                            boolean z13 = r2.a;
                        }
                        qpVar2.Y7.put(Long.valueOf(j3), roVar);
                        qpVar2.getNotificationCenter().k(qs.f3, Long.valueOf(j3));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Chat> arrayList2 = ((TLRPC.messages_Chats) tLObject2).chats;
                    qpVar2.S3(arrayList2, false);
                    ro roVar2 = new ro();
                    roVar2.a = z9;
                    roVar2.b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        roVar2.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList2.size());
                    } else if (!qpVar2.getUserConfig().q()) {
                        boolean z14 = r2.a;
                    }
                    qpVar2.Y7.put(Long.valueOf(j3), roVar2);
                    qpVar2.getNotificationCenter().k(qs.f3, Long.valueOf(j3));
                    break;
                }
                break;
            case 4:
                qp qpVar3 = (qp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z9) {
                    qpVar3.getNotificationCenter().k(2, 64);
                }
                qpVar3.l5(0, j3, arrayList3);
                qpVar3.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                ((yr) c1Var).getMessagesController().z4(null, (org.telegram.ui.ActionBar.c6) obj, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ rg(ui uiVar, ArrayList arrayList, long j3, boolean z9) {
        this.a = 0;
        this.b = uiVar;
        this.e = arrayList;
        this.d = j3;
        this.c = z9;
    }

    public /* synthetic */ rg(qp qpVar, long j3, a0.h hVar, boolean z9) {
        this.a = 2;
        this.b = qpVar;
        this.d = j3;
        this.e = hVar;
        this.c = z9;
    }

    public /* synthetic */ rg(qp qpVar, boolean z9, long j3, ArrayList arrayList) {
        this.a = 4;
        this.b = qpVar;
        this.c = z9;
        this.d = j3;
        this.e = arrayList;
    }
}
