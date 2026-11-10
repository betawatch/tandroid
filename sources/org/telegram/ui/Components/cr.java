package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ cr(kr krVar, int i7) {
        this.a = i7;
        this.b = krVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0424  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        Object[] objArr;
        int i7 = this.a;
        kr krVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                jr jrVar = krVar.e2;
                jr jrVar2 = krVar.g2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = krVar.r2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = krVar.q2;
                if (krVar.W1 != null) {
                    arrayList.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(x31.u(org.telegram.messenger.id.M0(2131751593, null)));
                    krVar.f1(arrayList, krVar.d2);
                    int i11 = 7;
                    if (krVar.u2) {
                        jrVar.i();
                        int i12 = (krVar.x2 ? 1 : 0) + (krVar.y2 ? 1 : 0);
                        String str = jrVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        x31 A = x31.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = krVar.w2;
                        A.D = new kk(i11, krVar, m41Var);
                        arrayList.add(A);
                        if (!krVar.w2) {
                            x31 z9 = x31.z(101, org.telegram.messenger.id.M0(2131746059, null));
                            z9.L(krVar.x2);
                            z9.i = 1;
                            arrayList.add(z9);
                            x31 z10 = x31.z(org.telegram.messenger.qs.n1, org.telegram.messenger.id.M0(2131746058, null));
                            z10.L(krVar.y2);
                            z10.i = 1;
                            arrayList.add(z10);
                        }
                    } else {
                        f10 = 12.0f;
                        krVar.f1(arrayList, jrVar);
                        krVar.f1(arrayList, krVar.f2);
                    }
                    krVar.f1(arrayList, jrVar2);
                    if (!krVar.c2 && jrVar2.e()) {
                        if (krVar.b2) {
                            arrayList.add(x31.C(null));
                            if (jrVar2.d()) {
                                String G = org.telegram.messenger.id.G(jrVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                x31 x31Var = new x31(42);
                                x31Var.d = 0;
                                x31Var.o = G;
                                arrayList.add(x31Var);
                            } else {
                                String M0 = org.telegram.messenger.id.M0(2131743723, null);
                                x31 x31Var2 = new x31(42);
                                x31Var2.d = 0;
                                x31Var2.o = M0;
                                arrayList.add(x31Var2);
                            }
                            x31 F = x31.F(0, org.telegram.messenger.id.M0(2131743691, null));
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
                            String M02 = org.telegram.messenger.id.M0(2131743690, null);
                            Locale locale2 = Locale.US;
                            x31 o4 = x31.o(1, M02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.t = krVar.e1();
                            o4.f = krVar.t2;
                            o4.D = new bi.la(krVar, i13, m41Var, 9);
                            arrayList.add(o4);
                            if (!krVar.t2) {
                                x31 z11 = x31.z(6, org.telegram.messenger.id.M0(2131745607, null));
                                z11.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z11.t = tL_chatBannedRights2.send_photos;
                                z11.i = 1;
                                arrayList.add(z11);
                                x31 z12 = x31.z(7, org.telegram.messenger.id.M0(2131745604, null));
                                z12.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_videos;
                                z12.i = 1;
                                arrayList.add(z12);
                                x31 z13 = x31.z(8, org.telegram.messenger.id.M0(2131745609, null));
                                z13.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z13.t = tL_chatBannedRights2.send_docs;
                                z13.i = 1;
                                arrayList.add(z13);
                                x31 z14 = x31.z(9, org.telegram.messenger.id.M0(2131745608, null));
                                z14.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z14.t = tL_chatBannedRights2.send_audios;
                                z14.i = 1;
                                arrayList.add(z14);
                                x31 z15 = x31.z(10, org.telegram.messenger.id.M0(2131745603, null));
                                z15.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z15.t = tL_chatBannedRights2.send_voices;
                                z15.i = 1;
                                arrayList.add(z15);
                                x31 z16 = x31.z(11, org.telegram.messenger.id.M0(2131745606, null));
                                z16.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z16.t = tL_chatBannedRights2.send_roundvideos;
                                z16.i = 1;
                                arrayList.add(z16);
                                x31 z17 = x31.z(12, org.telegram.messenger.id.M0(2131745605, null));
                                z17.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z17.t = tL_chatBannedRights2.send_stickers;
                                z17.i = 1;
                                arrayList.add(z17);
                                x31 z18 = x31.z(13, org.telegram.messenger.id.M0(2131745602, null));
                                z18.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z18.t = tL_chatBannedRights2.send_polls;
                                z18.i = 1;
                                arrayList.add(z18);
                                x31 z19 = x31.z(14, org.telegram.messenger.id.M0(2131743712, null));
                                z19.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z19.t = tL_chatBannedRights2.embed_links;
                                z19.i = 1;
                                arrayList.add(z19);
                                x31 z20 = x31.z(15, org.telegram.messenger.id.M0(2131743687, null));
                                z20.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z20.t = tL_chatBannedRights2.send_reactions;
                                z20.i = 1;
                                arrayList.add(z20);
                            }
                            x31 F2 = x31.F(2, org.telegram.messenger.id.M0(2131743711, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            x31 F3 = x31.F(3, org.telegram.messenger.id.M0(2131743692, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            x31 F4 = x31.F(4, org.telegram.messenger.id.M0(2131743716, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (krVar.V1) {
                                x31 F5 = x31.F(5, org.telegram.messenger.id.M0(2131751700, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (krVar.j2) {
                            String M03 = org.telegram.messenger.id.M0(!jrVar2.d() ? krVar.b2 ? 2131751479 : 2131751477 : krVar.b2 ? 2131751478 : 2131751476, null);
                            x31 x31Var3 = new x31(38);
                            x31Var3.d = 1;
                            x31Var3.o = M03;
                            x31Var3.f = !krVar.b2;
                            x31Var3.q = true;
                            arrayList.add(x31Var3);
                            objArr = false;
                            if (krVar.l2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String M04 = org.telegram.messenger.id.M0(2131751963, null);
                                x31 x31Var4 = new x31(39);
                                x31Var4.d = org.telegram.messenger.qs.o1;
                                x31Var4.l = M04;
                                x31Var4.z = 0;
                                x31Var4.L(krVar.k2);
                                arrayList.add(x31Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = krVar.m2;
                                arrayList.add(x31.B(org.telegram.messenger.qs.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new dr(krVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (krVar.l2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    krVar.getClass();
                    break;
                } else {
                    krVar.m2 = participantJoinedChats2;
                    krVar.S1.O(true);
                    break;
                }
        }
    }
}
