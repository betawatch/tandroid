package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ tr(as asVar, int i7) {
        this.a = i7;
        this.b = asVar;
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
        as asVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                zr zrVar = asVar.f2;
                zr zrVar2 = asVar.h2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = asVar.r2;
                if (asVar.X1 != null) {
                    arrayList.add(o41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(o41.u(org.telegram.messenger.gd.N0(2131751581, null)));
                    asVar.g1(arrayList, asVar.e2);
                    int i11 = 9;
                    if (asVar.v2) {
                        zrVar.i();
                        int i12 = (asVar.y2 ? 1 : 0) + (asVar.z2 ? 1 : 0);
                        String str = zrVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        o41 A = o41.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = asVar.x2;
                        A.E = new m8(i11, asVar, c51Var);
                        arrayList.add(A);
                        if (!asVar.x2) {
                            o41 z10 = o41.z(101, org.telegram.messenger.gd.N0(2131745863, null));
                            z10.L(asVar.y2);
                            z10.i = 1;
                            arrayList.add(z10);
                            o41 z11 = o41.z(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.N0(2131745862, null));
                            z11.L(asVar.z2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        f10 = 12.0f;
                        asVar.g1(arrayList, zrVar);
                        asVar.g1(arrayList, asVar.g2);
                    }
                    asVar.g1(arrayList, zrVar2);
                    if (!asVar.d2 && zrVar2.e()) {
                        if (asVar.c2) {
                            arrayList.add(o41.C(null));
                            if (zrVar2.d()) {
                                String G = org.telegram.messenger.gd.G(zrVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                o41 o41Var = new o41(42);
                                o41Var.d = 0;
                                o41Var.p = G;
                                arrayList.add(o41Var);
                            } else {
                                String N0 = org.telegram.messenger.gd.N0(2131743480, null);
                                o41 o41Var2 = new o41(42);
                                o41Var2.d = 0;
                                o41Var2.p = N0;
                                arrayList.add(o41Var2);
                            }
                            o41 F = o41.F(0, org.telegram.messenger.gd.N0(2131743448, null));
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
                            String N02 = org.telegram.messenger.gd.N0(2131743447, null);
                            Locale locale2 = Locale.US;
                            o41 o4 = o41.o(1, N02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.u = asVar.f1();
                            o4.f = asVar.u2;
                            o4.E = new bi.i5(asVar, i13, c51Var, 12);
                            arrayList.add(o4);
                            if (!asVar.u2) {
                                o41 z12 = o41.z(6, org.telegram.messenger.gd.N0(2131745411, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.u = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                o41 z13 = o41.z(7, org.telegram.messenger.gd.N0(2131745408, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.u = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                o41 z14 = o41.z(8, org.telegram.messenger.gd.N0(2131745413, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.u = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                o41 z15 = o41.z(9, org.telegram.messenger.gd.N0(2131745412, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.u = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                o41 z16 = o41.z(10, org.telegram.messenger.gd.N0(2131745407, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.u = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                o41 z17 = o41.z(11, org.telegram.messenger.gd.N0(2131745410, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.u = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                o41 z18 = o41.z(12, org.telegram.messenger.gd.N0(2131745409, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.u = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                o41 z19 = o41.z(13, org.telegram.messenger.gd.N0(2131745406, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.u = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                o41 z20 = o41.z(14, org.telegram.messenger.gd.N0(2131743469, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.u = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                o41 z21 = o41.z(15, org.telegram.messenger.gd.N0(2131743444, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.u = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            o41 F2 = o41.F(2, org.telegram.messenger.gd.N0(2131743468, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            o41 F3 = o41.F(3, org.telegram.messenger.gd.N0(2131743449, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            o41 F4 = o41.F(4, org.telegram.messenger.gd.N0(2131743473, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (asVar.W1) {
                                o41 F5 = o41.F(5, org.telegram.messenger.gd.N0(2131751688, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (asVar.k2) {
                            String N03 = org.telegram.messenger.gd.N0(!zrVar2.d() ? asVar.c2 ? 2131751467 : 2131751465 : asVar.c2 ? 2131751466 : 2131751464, null);
                            o41 o41Var3 = new o41(38);
                            o41Var3.d = 1;
                            o41Var3.p = N03;
                            o41Var3.f = !asVar.c2;
                            o41Var3.r = true;
                            arrayList.add(o41Var3);
                            objArr = false;
                            if (asVar.m2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(o41.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String N04 = org.telegram.messenger.gd.N0(2131751951, null);
                                o41 o41Var4 = new o41(39);
                                o41Var4.d = org.telegram.messenger.ks.o1;
                                o41Var4.m = N04;
                                o41Var4.A = 0;
                                o41Var4.L(asVar.l2);
                                arrayList.add(o41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = asVar.n2;
                                arrayList.add(o41.B(org.telegram.messenger.ks.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new ur(asVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (asVar.m2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    asVar.getClass();
                    break;
                } else {
                    asVar.n2 = participantJoinedChats2;
                    asVar.T1.O(true);
                    break;
                }
        }
    }
}
