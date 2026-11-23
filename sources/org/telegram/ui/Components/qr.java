package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr b;

    public /* synthetic */ qr(xr xrVar, int i7) {
        this.a = i7;
        this.b = xrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0424  */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        Object[] objArr;
        int i7 = this.a;
        xr xrVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                wr wrVar = xrVar.f2;
                wr wrVar2 = xrVar.h2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = xrVar.s2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = xrVar.r2;
                if (xrVar.X1 != null) {
                    arrayList.add(n41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList.add(n41.u(org.telegram.messenger.gd.N0(2131751581, null)));
                    xrVar.g1(arrayList, xrVar.e2);
                    int i11 = 9;
                    if (xrVar.v2) {
                        wrVar.i();
                        int i12 = (xrVar.y2 ? 1 : 0) + (xrVar.z2 ? 1 : 0);
                        String str = wrVar.b;
                        Locale locale = Locale.US;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        f10 = 12.0f;
                        sb2.append("/2");
                        n41 A = n41.A(sb2.toString(), str, 100);
                        A.L(i12 == 2);
                        A.f = xrVar.x2;
                        A.E = new l8(i11, xrVar, b51Var);
                        arrayList.add(A);
                        if (!xrVar.x2) {
                            n41 z10 = n41.z(101, org.telegram.messenger.gd.N0(2131745863, null));
                            z10.L(xrVar.y2);
                            z10.i = 1;
                            arrayList.add(z10);
                            n41 z11 = n41.z(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.N0(2131745862, null));
                            z11.L(xrVar.z2);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        f10 = 12.0f;
                        xrVar.g1(arrayList, wrVar);
                        xrVar.g1(arrayList, xrVar.g2);
                    }
                    xrVar.g1(arrayList, wrVar2);
                    if (!xrVar.d2 && wrVar2.e()) {
                        if (xrVar.c2) {
                            arrayList.add(n41.C(null));
                            if (wrVar2.d()) {
                                String G = org.telegram.messenger.gd.G(wrVar2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                n41 n41Var = new n41(42);
                                n41Var.d = 0;
                                n41Var.p = G;
                                arrayList.add(n41Var);
                            } else {
                                String N0 = org.telegram.messenger.gd.N0(2131743476, null);
                                n41 n41Var2 = new n41(42);
                                n41Var2.d = 0;
                                n41Var2.p = N0;
                                arrayList.add(n41Var2);
                            }
                            n41 F = n41.F(0, org.telegram.messenger.gd.N0(2131743444, null));
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
                            String N02 = org.telegram.messenger.gd.N0(2131743443, null);
                            Locale locale2 = Locale.US;
                            n41 o4 = n41.o(1, N02, i13 + "/10");
                            o4.L(i13 > 0);
                            o4.u = xrVar.f1();
                            o4.f = xrVar.u2;
                            o4.E = new bi.k5(xrVar, i13, b51Var, 12);
                            arrayList.add(o4);
                            if (!xrVar.u2) {
                                n41 z12 = n41.z(6, org.telegram.messenger.gd.N0(2131745411, null));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.u = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                n41 z13 = n41.z(7, org.telegram.messenger.gd.N0(2131745408, null));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.u = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                n41 z14 = n41.z(8, org.telegram.messenger.gd.N0(2131745413, null));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.u = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                n41 z15 = n41.z(9, org.telegram.messenger.gd.N0(2131745412, null));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.u = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                n41 z16 = n41.z(10, org.telegram.messenger.gd.N0(2131745407, null));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.u = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                n41 z17 = n41.z(11, org.telegram.messenger.gd.N0(2131745410, null));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.u = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                n41 z18 = n41.z(12, org.telegram.messenger.gd.N0(2131745409, null));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.u = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                n41 z19 = n41.z(13, org.telegram.messenger.gd.N0(2131745406, null));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.u = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                n41 z20 = n41.z(14, org.telegram.messenger.gd.N0(2131743465, null));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.u = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                n41 z21 = n41.z(15, org.telegram.messenger.gd.N0(2131743440, null));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.u = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            n41 F2 = n41.F(2, org.telegram.messenger.gd.N0(2131743464, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            n41 F3 = n41.F(3, org.telegram.messenger.gd.N0(2131743445, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            n41 F4 = n41.F(4, org.telegram.messenger.gd.N0(2131743469, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (xrVar.W1) {
                                n41 F5 = n41.F(5, org.telegram.messenger.gd.N0(2131751688, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (xrVar.k2) {
                            String N03 = org.telegram.messenger.gd.N0(!wrVar2.d() ? xrVar.c2 ? 2131751467 : 2131751465 : xrVar.c2 ? 2131751466 : 2131751464, null);
                            n41 n41Var3 = new n41(38);
                            n41Var3.d = 1;
                            n41Var3.p = N03;
                            n41Var3.f = !xrVar.c2;
                            n41Var3.r = true;
                            arrayList.add(n41Var3);
                            objArr = false;
                            if (xrVar.m2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(n41.D(org.telegram.messenger.g0.L(f10)));
                                }
                                String N04 = org.telegram.messenger.gd.N0(2131751951, null);
                                n41 n41Var4 = new n41(39);
                                n41Var4.d = org.telegram.messenger.ks.o1;
                                n41Var4.m = N04;
                                n41Var4.A = 0;
                                n41Var4.L(xrVar.l2);
                                arrayList.add(n41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = xrVar.n2;
                                arrayList.add(n41.B(org.telegram.messenger.ks.p1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), new rr(xrVar, i10)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (xrVar.m2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 == null) {
                    xrVar.getClass();
                    break;
                } else {
                    xrVar.n2 = participantJoinedChats2;
                    xrVar.T1.O(true);
                    break;
                }
        }
    }
}
