package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ dr(lr lrVar, int i3) {
        this.a = i3;
        this.b = lrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0424  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        Object[] objArr;
        int i3 = this.a;
        lr lrVar = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                kr krVar = lrVar.c2;
                kr krVar2 = lrVar.e2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.p2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar.o2;
                if (lrVar.U1 != null) {
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(r31.u(org.telegram.messenger.bd.M0(2131751594, null)));
                    lrVar.f1(arrayList, lrVar.b2);
                    int i11 = 13;
                    if (lrVar.s2) {
                        krVar.i();
                        int i12 = (lrVar.v2 ? 1 : 0) + (lrVar.w2 ? 1 : 0);
                        String str = krVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        r31 A = r31.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = lrVar.u2;
                        A.D = new q2(i11, lrVar, f41Var);
                        arrayList.add(A);
                        if (!lrVar.u2) {
                            r31 z10 = r31.z(101, org.telegram.messenger.bd.M0(2131746069, null));
                            z10.L(lrVar.v2);
                            z10.i = 1;
                            arrayList.add(z10);
                            r31 z11 = r31.z(org.telegram.messenger.hs.n1, org.telegram.messenger.bd.M0(2131746068, null));
                            z11.L(lrVar.w2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        f10 = 12.0f;
                        lrVar.f1(arrayList, krVar);
                        lrVar.f1(arrayList, lrVar.d2);
                    }
                    lrVar.f1(arrayList, krVar2);
                    if (!lrVar.a2 && krVar2.e()) {
                        if (lrVar.Z1) {
                            arrayList.add(r31.C(null));
                            if (krVar2.d()) {
                                String G = org.telegram.messenger.bd.G(krVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                r31 r31Var = new r31(42);
                                r31Var.d = 0;
                                r31Var.o = G;
                                arrayList.add(r31Var);
                            } else {
                                String M0 = org.telegram.messenger.bd.M0(2131743733, null);
                                r31 r31Var2 = new r31(42);
                                r31Var2.d = 0;
                                r31Var2.o = M0;
                                arrayList.add(r31Var2);
                            }
                            r31 F = r31.F(0, org.telegram.messenger.bd.M0(2131743701, null));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.t = tL_chatBannedRights2.send_plain;
                            arrayList.add(F);
                            int i13 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i13++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i13++;
                            }
                            String M02 = org.telegram.messenger.bd.M0(2131743700, null);
                            Locale locale2 = Locale.US;
                            r31 o10 = r31.o(1, M02, i13 + "/10");
                            o10.L(i13 > 0);
                            o10.t = lrVar.e1();
                            o10.f = lrVar.r2;
                            o10.D = new ai.h3(lrVar, i13, f41Var, 11);
                            arrayList.add(o10);
                            if (!lrVar.r2) {
                                r31 z12 = r31.z(6, org.telegram.messenger.bd.M0(2131745617, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                r31 z13 = r31.z(7, org.telegram.messenger.bd.M0(2131745614, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.t = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                r31 z14 = r31.z(8, org.telegram.messenger.bd.M0(2131745619, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.t = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                r31 z15 = r31.z(9, org.telegram.messenger.bd.M0(2131745618, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.t = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                r31 z16 = r31.z(10, org.telegram.messenger.bd.M0(2131745613, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.t = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                r31 z17 = r31.z(11, org.telegram.messenger.bd.M0(2131745616, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.t = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                r31 z18 = r31.z(12, org.telegram.messenger.bd.M0(2131745615, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.t = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                r31 z19 = r31.z(13, org.telegram.messenger.bd.M0(2131745612, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.t = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                r31 z20 = r31.z(14, org.telegram.messenger.bd.M0(2131743722, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.t = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                r31 z21 = r31.z(15, org.telegram.messenger.bd.M0(2131743697, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.t = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            r31 F2 = r31.F(2, org.telegram.messenger.bd.M0(2131743721, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            r31 F3 = r31.F(3, org.telegram.messenger.bd.M0(2131743702, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            r31 F4 = r31.F(4, org.telegram.messenger.bd.M0(2131743726, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (lrVar.T1) {
                                r31 F5 = r31.F(5, org.telegram.messenger.bd.M0(2131751701, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (lrVar.h2) {
                            String M03 = org.telegram.messenger.bd.M0(!krVar2.d() ? lrVar.Z1 ? 2131751480 : 2131751478 : lrVar.Z1 ? 2131751479 : 2131751477, null);
                            r31 r31Var3 = new r31(38);
                            r31Var3.d = 1;
                            r31Var3.o = M03;
                            r31Var3.f = !lrVar.Z1;
                            r31Var3.q = true;
                            arrayList.add(r31Var3);
                            objArr = false;
                            if (lrVar.j2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(r31.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String M04 = org.telegram.messenger.bd.M0(2131751963, null);
                                r31 r31Var4 = new r31(39);
                                r31Var4.d = org.telegram.messenger.hs.o1;
                                r31Var4.l = M04;
                                r31Var4.z = 0;
                                r31Var4.L(lrVar.i2);
                                arrayList.add(r31Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = lrVar.k2;
                                arrayList.add(r31.B(org.telegram.messenger.hs.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new er(lrVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (lrVar.j2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    lrVar.getClass();
                    break;
                } else {
                    lrVar.k2 = participantJoinedChats2;
                    lrVar.Q1.O(true);
                    break;
                }
        }
    }
}
