package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ dr(lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
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
        lr lrVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                kr krVar = lrVar.b2;
                kr krVar2 = lrVar.d2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.o2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar.n2;
                if (lrVar.T1 != null) {
                    arrayList.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(x31.u(org.telegram.messenger.id.M0(2131751594, null)));
                    lrVar.f1(arrayList, lrVar.a2);
                    int i11 = 7;
                    if (lrVar.r2) {
                        krVar.i();
                        int i12 = (lrVar.u2 ? 1 : 0) + (lrVar.v2 ? 1 : 0);
                        String str = krVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        x31 A = x31.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = lrVar.t2;
                        A.D = new lk(i11, lrVar, l41Var);
                        arrayList.add(A);
                        if (!lrVar.t2) {
                            x31 z9 = x31.z(101, org.telegram.messenger.id.M0(2131746062, null));
                            z9.L(lrVar.u2);
                            z9.i = 1;
                            arrayList.add(z9);
                            x31 z10 = x31.z(org.telegram.messenger.qs.n1, org.telegram.messenger.id.M0(2131746061, null));
                            z10.L(lrVar.v2);
                            z10.i = 1;
                            arrayList.add(z10);
                        }
                    } else {
                        f10 = 12.0f;
                        lrVar.f1(arrayList, krVar);
                        lrVar.f1(arrayList, lrVar.c2);
                    }
                    lrVar.f1(arrayList, krVar2);
                    if (!lrVar.Z1 && krVar2.e()) {
                        if (lrVar.Y1) {
                            arrayList.add(x31.C(null));
                            if (krVar2.d()) {
                                String G = org.telegram.messenger.id.G(krVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                x31 x31Var = new x31(42);
                                x31Var.d = 0;
                                x31Var.o = G;
                                arrayList.add(x31Var);
                            } else {
                                String M0 = org.telegram.messenger.id.M0(2131743726, null);
                                x31 x31Var2 = new x31(42);
                                x31Var2.d = 0;
                                x31Var2.o = M0;
                                arrayList.add(x31Var2);
                            }
                            x31 F = x31.F(0, org.telegram.messenger.id.M0(2131743694, null));
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
                            String M02 = org.telegram.messenger.id.M0(2131743693, null);
                            Locale locale2 = Locale.US;
                            x31 o4 = x31.o(1, M02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.t = lrVar.e1();
                            o4.f = lrVar.q2;
                            o4.D = new bi.la(lrVar, i13, l41Var, 9);
                            arrayList.add(o4);
                            if (!lrVar.q2) {
                                x31 z11 = x31.z(6, org.telegram.messenger.id.M0(2131745610, null));
                                z11.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z11.t = tL_chatBannedRights2.send_photos;
                                z11.i = 1;
                                arrayList.add(z11);
                                x31 z12 = x31.z(7, org.telegram.messenger.id.M0(2131745607, null));
                                z12.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_videos;
                                z12.i = 1;
                                arrayList.add(z12);
                                x31 z13 = x31.z(8, org.telegram.messenger.id.M0(2131745612, null));
                                z13.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z13.t = tL_chatBannedRights2.send_docs;
                                z13.i = 1;
                                arrayList.add(z13);
                                x31 z14 = x31.z(9, org.telegram.messenger.id.M0(2131745611, null));
                                z14.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z14.t = tL_chatBannedRights2.send_audios;
                                z14.i = 1;
                                arrayList.add(z14);
                                x31 z15 = x31.z(10, org.telegram.messenger.id.M0(2131745606, null));
                                z15.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z15.t = tL_chatBannedRights2.send_voices;
                                z15.i = 1;
                                arrayList.add(z15);
                                x31 z16 = x31.z(11, org.telegram.messenger.id.M0(2131745609, null));
                                z16.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z16.t = tL_chatBannedRights2.send_roundvideos;
                                z16.i = 1;
                                arrayList.add(z16);
                                x31 z17 = x31.z(12, org.telegram.messenger.id.M0(2131745608, null));
                                z17.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z17.t = tL_chatBannedRights2.send_stickers;
                                z17.i = 1;
                                arrayList.add(z17);
                                x31 z18 = x31.z(13, org.telegram.messenger.id.M0(2131745605, null));
                                z18.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z18.t = tL_chatBannedRights2.send_polls;
                                z18.i = 1;
                                arrayList.add(z18);
                                x31 z19 = x31.z(14, org.telegram.messenger.id.M0(2131743715, null));
                                z19.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z19.t = tL_chatBannedRights2.embed_links;
                                z19.i = 1;
                                arrayList.add(z19);
                                x31 z20 = x31.z(15, org.telegram.messenger.id.M0(2131743690, null));
                                z20.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z20.t = tL_chatBannedRights2.send_reactions;
                                z20.i = 1;
                                arrayList.add(z20);
                            }
                            x31 F2 = x31.F(2, org.telegram.messenger.id.M0(2131743714, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            x31 F3 = x31.F(3, org.telegram.messenger.id.M0(2131743695, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            x31 F4 = x31.F(4, org.telegram.messenger.id.M0(2131743719, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (lrVar.S1) {
                                x31 F5 = x31.F(5, org.telegram.messenger.id.M0(2131751701, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (lrVar.g2) {
                            String M03 = org.telegram.messenger.id.M0(!krVar2.d() ? lrVar.Y1 ? 2131751480 : 2131751478 : lrVar.Y1 ? 2131751479 : 2131751477, null);
                            x31 x31Var3 = new x31(38);
                            x31Var3.d = 1;
                            x31Var3.o = M03;
                            x31Var3.f = !lrVar.Y1;
                            x31Var3.q = true;
                            arrayList.add(x31Var3);
                            objArr = false;
                            if (lrVar.i2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String M04 = org.telegram.messenger.id.M0(2131751963, null);
                                x31 x31Var4 = new x31(39);
                                x31Var4.d = org.telegram.messenger.qs.o1;
                                x31Var4.l = M04;
                                x31Var4.z = 0;
                                x31Var4.L(lrVar.h2);
                                arrayList.add(x31Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = lrVar.j2;
                                arrayList.add(x31.B(org.telegram.messenger.qs.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new er(lrVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (lrVar.i2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    lrVar.getClass();
                    break;
                } else {
                    lrVar.j2 = participantJoinedChats2;
                    lrVar.P1.O(true);
                    break;
                }
        }
    }
}
