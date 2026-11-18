package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;

    public /* synthetic */ rr(yr yrVar, int i7) {
        this.a = i7;
        this.b = yrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0424  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        Object[] objArr;
        int i7 = this.a;
        yr yrVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                xr xrVar = yrVar.f2;
                xr xrVar2 = yrVar.h2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.s2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = yrVar.r2;
                if (yrVar.X1 != null) {
                    arrayList.add(l41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(l41.u(org.telegram.messenger.gd.M0(2131751582, null)));
                    yrVar.g1(arrayList, yrVar.e2);
                    int i11 = 10;
                    if (yrVar.v2) {
                        xrVar.i();
                        int i12 = (yrVar.y2 ? 1 : 0) + (yrVar.z2 ? 1 : 0);
                        String str = xrVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        l41 A = l41.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = yrVar.x2;
                        A.E = new y7(i11, yrVar, z41Var);
                        arrayList.add(A);
                        if (!yrVar.x2) {
                            l41 z10 = l41.z(101, org.telegram.messenger.gd.M0(2131745864, null));
                            z10.L(yrVar.y2);
                            z10.i = 1;
                            arrayList.add(z10);
                            l41 z11 = l41.z(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.M0(2131745863, null));
                            z11.L(yrVar.z2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        f10 = 12.0f;
                        yrVar.g1(arrayList, xrVar);
                        yrVar.g1(arrayList, yrVar.g2);
                    }
                    yrVar.g1(arrayList, xrVar2);
                    if (!yrVar.d2 && xrVar2.e()) {
                        if (yrVar.c2) {
                            arrayList.add(l41.C(null));
                            if (xrVar2.d()) {
                                String G = org.telegram.messenger.gd.G(xrVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                l41 l41Var = new l41(42);
                                l41Var.d = 0;
                                l41Var.p = G;
                                arrayList.add(l41Var);
                            } else {
                                String M0 = org.telegram.messenger.gd.M0(2131743486, null);
                                l41 l41Var2 = new l41(42);
                                l41Var2.d = 0;
                                l41Var2.p = M0;
                                arrayList.add(l41Var2);
                            }
                            l41 F = l41.F(0, org.telegram.messenger.gd.M0(2131743454, null));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.u = tL_chatBannedRights2.send_plain;
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
                            String M02 = org.telegram.messenger.gd.M0(2131743453, null);
                            Locale locale2 = Locale.US;
                            l41 o4 = l41.o(1, M02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.u = yrVar.f1();
                            o4.f = yrVar.u2;
                            o4.E = new bi.e5(yrVar, i13, z41Var, 12);
                            arrayList.add(o4);
                            if (!yrVar.u2) {
                                l41 z12 = l41.z(6, org.telegram.messenger.gd.M0(2131745412, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.u = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                l41 z13 = l41.z(7, org.telegram.messenger.gd.M0(2131745409, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.u = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                l41 z14 = l41.z(8, org.telegram.messenger.gd.M0(2131745414, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.u = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                l41 z15 = l41.z(9, org.telegram.messenger.gd.M0(2131745413, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.u = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                l41 z16 = l41.z(10, org.telegram.messenger.gd.M0(2131745408, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.u = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                l41 z17 = l41.z(11, org.telegram.messenger.gd.M0(2131745411, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.u = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                l41 z18 = l41.z(12, org.telegram.messenger.gd.M0(2131745410, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.u = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                l41 z19 = l41.z(13, org.telegram.messenger.gd.M0(2131745407, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.u = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                l41 z20 = l41.z(14, org.telegram.messenger.gd.M0(2131743475, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.u = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                l41 z21 = l41.z(15, org.telegram.messenger.gd.M0(2131743450, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.u = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            l41 F2 = l41.F(2, org.telegram.messenger.gd.M0(2131743474, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            l41 F3 = l41.F(3, org.telegram.messenger.gd.M0(2131743455, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            l41 F4 = l41.F(4, org.telegram.messenger.gd.M0(2131743479, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (yrVar.W1) {
                                l41 F5 = l41.F(5, org.telegram.messenger.gd.M0(2131751689, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (yrVar.k2) {
                            String M03 = org.telegram.messenger.gd.M0(!xrVar2.d() ? yrVar.c2 ? 2131751468 : 2131751466 : yrVar.c2 ? 2131751467 : 2131751465, null);
                            l41 l41Var3 = new l41(38);
                            l41Var3.d = 1;
                            l41Var3.p = M03;
                            l41Var3.f = !yrVar.c2;
                            l41Var3.r = true;
                            arrayList.add(l41Var3);
                            objArr = false;
                            if (yrVar.m2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(l41.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String M04 = org.telegram.messenger.gd.M0(2131751952, null);
                                l41 l41Var4 = new l41(39);
                                l41Var4.d = org.telegram.messenger.ks.o1;
                                l41Var4.m = M04;
                                l41Var4.A = 0;
                                l41Var4.L(yrVar.l2);
                                arrayList.add(l41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = yrVar.n2;
                                arrayList.add(l41.B(org.telegram.messenger.ks.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new sr(yrVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (yrVar.m2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    yrVar.getClass();
                    break;
                } else {
                    yrVar.n2 = participantJoinedChats2;
                    yrVar.T1.O(true);
                    break;
                }
        }
    }
}
