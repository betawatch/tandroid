package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ org.telegram.messenger.cs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f = user;
        this.g = chatParticipant;
        this.b = z10;
        this.c = str;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i3 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        org.telegram.messenger.cs csVar = this.d;
        switch (i3) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) csVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                boolean z10 = this.b;
                if (channelParticipant != null) {
                    profileActivity.O4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    break;
                } else {
                    profileActivity.O4(num.intValue(), user, chatParticipant, null, null, this.c, z10);
                    break;
                }
            default:
                g11 g11Var = (g11) csVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = g11Var.W;
                boolean z11 = this.b;
                String str = this.c;
                if (z11) {
                    ArrayList s02 = org.telegram.messenger.li.b0(i10).s0(5);
                    for (int i11 = 0; i11 < s02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.zi.V(arrayList2.get(i12), null, null);
                                long j10 = arrayList2.get(i12).id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.li.b0(i10).t0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.zi.V(arrayList.get(i14), null, null);
                                long j11 = arrayList.get(i14).id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                } else {
                    org.telegram.messenger.li.b0(i10).V(g11.c2, str, false, new ci.r6(g11Var, linkedHashSet, hashMap, arrayList3, runnable), true, g11Var.a0 == 3, false, false, 30);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kt0(g11 g11Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = g11Var;
        this.b = z10;
        this.e = linkedHashSet;
        this.c = str;
        this.f = hashMap;
        this.g = arrayList;
    }
}
