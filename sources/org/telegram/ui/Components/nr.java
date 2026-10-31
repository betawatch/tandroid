package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ nr(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0416  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Object[] objArr;
        int i10 = this.a;
        vr vrVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                ur urVar = vrVar.b2;
                ur urVar2 = vrVar.d2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.o2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = vrVar.n2;
                if (vrVar.T1 != null) {
                    arrayList.add(a51.D(org.telegram.messenger.i0.L(12.0f)));
                    arrayList.add(a51.u(org.telegram.messenger.cd.L0(2131751594, null)));
                    vrVar.f1(arrayList, vrVar.a2);
                    int i12 = 0;
                    if (vrVar.r2) {
                        urVar.i();
                        int i13 = (vrVar.u2 ? 1 : 0) + (vrVar.v2 ? 1 : 0);
                        String str = urVar.b;
                        Locale locale = Locale.US;
                        a51 A = a51.A(i13 + "/2", str, 100);
                        A.L(i13 == 2);
                        A.f = vrVar.t2;
                        A.D = new sr(i12, vrVar, p51Var);
                        arrayList.add(A);
                        if (!vrVar.t2) {
                            a51 z10 = a51.z(101, org.telegram.messenger.cd.L0(2131746076, null));
                            z10.L(vrVar.u2);
                            z10.i = 1;
                            arrayList.add(z10);
                            a51 z11 = a51.z(org.telegram.messenger.zs.n1, org.telegram.messenger.cd.L0(2131746075, null));
                            z11.L(vrVar.v2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        vrVar.f1(arrayList, urVar);
                        vrVar.f1(arrayList, vrVar.c2);
                    }
                    vrVar.f1(arrayList, urVar2);
                    if (!vrVar.Z1 && urVar2.e()) {
                        if (vrVar.Y1) {
                            arrayList.add(a51.C(null));
                            if (urVar2.d()) {
                                String G = org.telegram.messenger.cd.G(urVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                a51 a51Var = new a51(42);
                                a51Var.d = 0;
                                a51Var.o = G;
                                arrayList.add(a51Var);
                            } else {
                                String L0 = org.telegram.messenger.cd.L0(2131743749, null);
                                a51 a51Var2 = new a51(42);
                                a51Var2.d = 0;
                                a51Var2.o = L0;
                                arrayList.add(a51Var2);
                            }
                            a51 F = a51.F(0, org.telegram.messenger.cd.L0(2131743717, null));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.t = tL_chatBannedRights2.send_plain;
                            arrayList.add(F);
                            int i14 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i14++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i14++;
                            }
                            String L02 = org.telegram.messenger.cd.L0(2131743716, null);
                            Locale locale2 = Locale.US;
                            a51 o10 = a51.o(1, L02, i14 + "/10");
                            o10.L(i14 > 0);
                            o10.t = vrVar.e1();
                            o10.f = vrVar.q2;
                            o10.D = new jg.w1(vrVar, i14, p51Var, 9);
                            arrayList.add(o10);
                            if (!vrVar.q2) {
                                a51 z12 = a51.z(6, org.telegram.messenger.cd.L0(2131745624, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                a51 z13 = a51.z(7, org.telegram.messenger.cd.L0(2131745621, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.t = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                a51 z14 = a51.z(8, org.telegram.messenger.cd.L0(2131745626, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.t = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                a51 z15 = a51.z(9, org.telegram.messenger.cd.L0(2131745625, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.t = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                a51 z16 = a51.z(10, org.telegram.messenger.cd.L0(2131745620, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.t = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                a51 z17 = a51.z(11, org.telegram.messenger.cd.L0(2131745623, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.t = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                a51 z18 = a51.z(12, org.telegram.messenger.cd.L0(2131745622, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.t = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                a51 z19 = a51.z(13, org.telegram.messenger.cd.L0(2131745619, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.t = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                a51 z20 = a51.z(14, org.telegram.messenger.cd.L0(2131743738, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.t = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                a51 z21 = a51.z(15, org.telegram.messenger.cd.L0(2131743713, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.t = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            a51 F2 = a51.F(2, org.telegram.messenger.cd.L0(2131743737, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            a51 F3 = a51.F(3, org.telegram.messenger.cd.L0(2131743718, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            a51 F4 = a51.F(4, org.telegram.messenger.cd.L0(2131743742, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (vrVar.S1) {
                                a51 F5 = a51.F(5, org.telegram.messenger.cd.L0(2131751701, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (vrVar.g2) {
                            String L03 = org.telegram.messenger.cd.L0(!urVar2.d() ? vrVar.Y1 ? 2131751480 : 2131751478 : vrVar.Y1 ? 2131751479 : 2131751477, null);
                            a51 a51Var3 = new a51(38);
                            a51Var3.d = 1;
                            a51Var3.o = L03;
                            a51Var3.f = !vrVar.Y1;
                            a51Var3.q = true;
                            arrayList.add(a51Var3);
                            objArr = false;
                            if (vrVar.i2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(a51.D(org.telegram.messenger.i0.L(12.0f)));
                                }
                                String L04 = org.telegram.messenger.cd.L0(2131751963, null);
                                a51 a51Var4 = new a51(39);
                                a51Var4.d = org.telegram.messenger.zs.o1;
                                a51Var4.l = L04;
                                a51Var4.z = 0;
                                a51Var4.L(vrVar.h2);
                                arrayList.add(a51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = vrVar.j2;
                                arrayList.add(a51.B(org.telegram.messenger.zs.p1, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new or(vrVar, i11)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (vrVar.i2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    vrVar.getClass();
                    break;
                } else {
                    vrVar.j2 = participantJoinedChats2;
                    vrVar.P1.O(true);
                    break;
                }
        }
    }
}
