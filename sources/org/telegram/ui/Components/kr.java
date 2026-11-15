package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ kr(rr rrVar, int i7) {
        this.a = i7;
        this.b = rrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0424  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        Object[] objArr;
        int i7 = this.a;
        rr rrVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                qr qrVar = rrVar.f2;
                qr qrVar2 = rrVar.h2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rrVar.s2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rrVar.r2;
                if (rrVar.X1 != null) {
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(b41.u(org.telegram.messenger.hd.M0(2131751593, null)));
                    rrVar.f1(arrayList, rrVar.e2);
                    int i11 = 14;
                    if (rrVar.v2) {
                        qrVar.i();
                        int i12 = (rrVar.y2 ? 1 : 0) + (rrVar.z2 ? 1 : 0);
                        String str = qrVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        b41 A = b41.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = rrVar.x2;
                        A.D = new n2(i11, rrVar, p41Var);
                        arrayList.add(A);
                        if (!rrVar.x2) {
                            b41 z10 = b41.z(101, org.telegram.messenger.hd.M0(2131746059, null));
                            z10.L(rrVar.y2);
                            z10.i = 1;
                            arrayList.add(z10);
                            b41 z11 = b41.z(org.telegram.messenger.ns.n1, org.telegram.messenger.hd.M0(2131746058, null));
                            z11.L(rrVar.z2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        f10 = 12.0f;
                        rrVar.f1(arrayList, qrVar);
                        rrVar.f1(arrayList, rrVar.g2);
                    }
                    rrVar.f1(arrayList, qrVar2);
                    if (!rrVar.d2 && qrVar2.e()) {
                        if (rrVar.c2) {
                            arrayList.add(b41.C(null));
                            if (qrVar2.d()) {
                                String G = org.telegram.messenger.hd.G(qrVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                b41 b41Var = new b41(42);
                                b41Var.d = 0;
                                b41Var.o = G;
                                arrayList.add(b41Var);
                            } else {
                                String M0 = org.telegram.messenger.hd.M0(2131743723, null);
                                b41 b41Var2 = new b41(42);
                                b41Var2.d = 0;
                                b41Var2.o = M0;
                                arrayList.add(b41Var2);
                            }
                            b41 F = b41.F(0, org.telegram.messenger.hd.M0(2131743691, null));
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
                            String M02 = org.telegram.messenger.hd.M0(2131743690, null);
                            Locale locale2 = Locale.US;
                            b41 o4 = b41.o(1, M02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.t = rrVar.e1();
                            o4.f = rrVar.u2;
                            o4.D = new bi.x2(rrVar, i13, p41Var, 12);
                            arrayList.add(o4);
                            if (!rrVar.u2) {
                                b41 z12 = b41.z(6, org.telegram.messenger.hd.M0(2131745607, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                b41 z13 = b41.z(7, org.telegram.messenger.hd.M0(2131745604, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.t = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                b41 z14 = b41.z(8, org.telegram.messenger.hd.M0(2131745609, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.t = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                b41 z15 = b41.z(9, org.telegram.messenger.hd.M0(2131745608, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.t = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                b41 z16 = b41.z(10, org.telegram.messenger.hd.M0(2131745603, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.t = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                b41 z17 = b41.z(11, org.telegram.messenger.hd.M0(2131745606, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.t = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                b41 z18 = b41.z(12, org.telegram.messenger.hd.M0(2131745605, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.t = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                b41 z19 = b41.z(13, org.telegram.messenger.hd.M0(2131745602, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.t = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                b41 z20 = b41.z(14, org.telegram.messenger.hd.M0(2131743712, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.t = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                b41 z21 = b41.z(15, org.telegram.messenger.hd.M0(2131743687, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.t = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            b41 F2 = b41.F(2, org.telegram.messenger.hd.M0(2131743711, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            b41 F3 = b41.F(3, org.telegram.messenger.hd.M0(2131743692, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            b41 F4 = b41.F(4, org.telegram.messenger.hd.M0(2131743716, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (rrVar.W1) {
                                b41 F5 = b41.F(5, org.telegram.messenger.hd.M0(2131751700, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (rrVar.k2) {
                            String M03 = org.telegram.messenger.hd.M0(!qrVar2.d() ? rrVar.c2 ? 2131751479 : 2131751477 : rrVar.c2 ? 2131751478 : 2131751476, null);
                            b41 b41Var3 = new b41(38);
                            b41Var3.d = 1;
                            b41Var3.o = M03;
                            b41Var3.f = !rrVar.c2;
                            b41Var3.q = true;
                            arrayList.add(b41Var3);
                            objArr = false;
                            if (rrVar.m2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(b41.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String M04 = org.telegram.messenger.hd.M0(2131751963, null);
                                b41 b41Var4 = new b41(39);
                                b41Var4.d = org.telegram.messenger.ns.o1;
                                b41Var4.l = M04;
                                b41Var4.z = 0;
                                b41Var4.L(rrVar.l2);
                                arrayList.add(b41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = rrVar.n2;
                                arrayList.add(b41.B(org.telegram.messenger.ns.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new lr(rrVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (rrVar.m2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    rrVar.getClass();
                    break;
                } else {
                    rrVar.n2 = participantJoinedChats2;
                    rrVar.T1.O(true);
                    break;
                }
        }
    }
}
