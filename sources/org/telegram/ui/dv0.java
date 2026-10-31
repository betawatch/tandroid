package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ org.telegram.messenger.us d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dv0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f = user;
        this.g = chatParticipant;
        this.b = z10;
        this.c = str;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i10 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        org.telegram.messenger.us usVar = this.d;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) usVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                boolean z10 = this.b;
                if (channelParticipant != null) {
                    profileActivity.N4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    break;
                } else {
                    profileActivity.N4(num.intValue(), user, chatParticipant, null, null, this.c, z10);
                    break;
                }
            default:
                i31 i31Var = (i31) usVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i11 = i31Var.V;
                boolean z11 = this.b;
                String str = this.c;
                if (z11) {
                    ArrayList s02 = org.telegram.messenger.ui.b0(i11).s0(5);
                    for (int i12 = 0; i12 < s02.size(); i12++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents) != null) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                String V = org.telegram.messenger.jj.V(arrayList2.get(i13), null, null);
                                long j10 = arrayList2.get(i13).id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(i11).s0[1];
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        if ((arrayList4.get(i14) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).documents) != null) {
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                String V2 = org.telegram.messenger.jj.V(arrayList.get(i15), null, null);
                                long j11 = arrayList.get(i15).id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                } else {
                    org.telegram.messenger.ui.b0(i11).V(i31.b2, str, false, new f1.a(i31Var, linkedHashSet, hashMap, arrayList3, runnable), true, i31Var.W == 3, false, false, 30);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dv0(i31 i31Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = i31Var;
        this.b = z10;
        this.e = linkedHashSet;
        this.c = str;
        this.f = hashMap;
        this.g = arrayList;
    }
}
