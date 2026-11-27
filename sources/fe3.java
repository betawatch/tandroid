// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe3 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ me3 b;

    public /* synthetic */ fe3(me3 me3Var, byte b) {
        this.a = b;
        this.b = me3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040e  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Object[] objArr;
        byte b = this.a;
        me3 me3Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                le3 le3Var = me3Var.e2;
                le3 le3Var2 = me3Var.g2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = me3Var.r2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = me3Var.q2;
                if (me3Var.W1 != null) {
                    arrayList.add(b8c.D(hl.L(12.0f)));
                    arrayList.add(b8c.u(ob6.M0(2131751558, null)));
                    me3Var.a1(arrayList, me3Var.d2);
                    byte b3 = 0;
                    if (me3Var.u2) {
                        le3Var.i();
                        int i = (me3Var.x2 ? 1 : 0) + (me3Var.y2 ? 1 : 0);
                        String str = le3Var.b;
                        Locale locale = Locale.US;
                        b8c A = b8c.A(i + "/2", str, 100);
                        A.L(i == 2);
                        A.f = me3Var.w2;
                        A.E = new je3(me3Var, l9cVar, b3);
                        arrayList.add(A);
                        if (!me3Var.w2) {
                            b8c z = b8c.z(101, ob6.M0(2131745786, null));
                            z.L(me3Var.x2);
                            z.i = 1;
                            arrayList.add(z);
                            b8c z2 = b8c.z(jn7.m1, ob6.M0(2131745785, null));
                            z2.L(me3Var.y2);
                            z2.i = 1;
                            arrayList.add(z2);
                        }
                    } else {
                        me3Var.a1(arrayList, le3Var);
                        me3Var.a1(arrayList, me3Var.f2);
                    }
                    me3Var.a1(arrayList, le3Var2);
                    if (!me3Var.c2 && le3Var2.e()) {
                        if (me3Var.b2) {
                            arrayList.add(b8c.C(null));
                            if (le3Var2.d()) {
                                String G = ob6.G(le3Var2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                b8c b8cVar = new b8c(42);
                                b8cVar.d = 0;
                                b8cVar.p = G;
                                arrayList.add(b8cVar);
                            } else {
                                String M0 = ob6.M0(2131743378, null);
                                b8c b8cVar2 = new b8c(42);
                                b8cVar2.d = 0;
                                b8cVar2.p = M0;
                                arrayList.add(b8cVar2);
                            }
                            b8c F = b8c.F(0, ob6.M0(2131743346, null));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.u = tL_chatBannedRights2.send_plain;
                            arrayList.add(F);
                            int i2 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i2++;
                            }
                            String M02 = ob6.M0(2131743345, null);
                            Locale locale2 = Locale.US;
                            b8c o = b8c.o(1, M02, i2 + "/10");
                            o.L(i2 > 0);
                            o.u = me3Var.Z0();
                            o.f = me3Var.t2;
                            o.E = new ae((Object) me3Var, i2, (Object) l9cVar, (byte) 6);
                            arrayList.add(o);
                            if (!me3Var.t2) {
                                b8c z3 = b8c.z(6, ob6.M0(2131745335, null));
                                z3.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z3.u = tL_chatBannedRights2.send_photos;
                                z3.i = 1;
                                arrayList.add(z3);
                                b8c z4 = b8c.z(7, ob6.M0(2131745332, null));
                                z4.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z4.u = tL_chatBannedRights2.send_videos;
                                z4.i = 1;
                                arrayList.add(z4);
                                b8c z5 = b8c.z(8, ob6.M0(2131745337, null));
                                z5.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z5.u = tL_chatBannedRights2.send_docs;
                                z5.i = 1;
                                arrayList.add(z5);
                                b8c z6 = b8c.z(9, ob6.M0(2131745336, null));
                                z6.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z6.u = tL_chatBannedRights2.send_audios;
                                z6.i = 1;
                                arrayList.add(z6);
                                b8c z7 = b8c.z(10, ob6.M0(2131745331, null));
                                z7.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z7.u = tL_chatBannedRights2.send_voices;
                                z7.i = 1;
                                arrayList.add(z7);
                                b8c z8 = b8c.z(11, ob6.M0(2131745334, null));
                                z8.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z8.u = tL_chatBannedRights2.send_roundvideos;
                                z8.i = 1;
                                arrayList.add(z8);
                                b8c z9 = b8c.z(12, ob6.M0(2131745333, null));
                                z9.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z9.u = tL_chatBannedRights2.send_stickers;
                                z9.i = 1;
                                arrayList.add(z9);
                                b8c z10 = b8c.z(13, ob6.M0(2131745330, null));
                                z10.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z10.u = tL_chatBannedRights2.send_polls;
                                z10.i = 1;
                                arrayList.add(z10);
                                b8c z11 = b8c.z(14, ob6.M0(2131743367, null));
                                z11.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z11.u = tL_chatBannedRights2.embed_links;
                                z11.i = 1;
                                arrayList.add(z11);
                                b8c z12 = b8c.z(15, ob6.M0(2131743342, null));
                                z12.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z12.u = tL_chatBannedRights2.send_reactions;
                                z12.i = 1;
                                arrayList.add(z12);
                            }
                            b8c F2 = b8c.F(2, ob6.M0(2131743366, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            b8c F3 = b8c.F(3, ob6.M0(2131743347, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            b8c F4 = b8c.F(4, ob6.M0(2131743371, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (me3Var.V1) {
                                b8c F5 = b8c.F(5, ob6.M0(2131751665, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (me3Var.j2) {
                            boolean d = le3Var2.d();
                            boolean z13 = me3Var.b2;
                            String M03 = ob6.M0(!d ? z13 ? 2131751444 : 2131751442 : z13 ? 2131751443 : 2131751441, null);
                            b8c b8cVar3 = new b8c(38);
                            b8cVar3.d = 1;
                            b8cVar3.p = M03;
                            b8cVar3.f = !me3Var.b2;
                            b8cVar3.r = true;
                            arrayList.add(b8cVar3);
                            objArr = false;
                            if (me3Var.l2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(b8c.D(hl.L(12.0f)));
                                }
                                String M04 = ob6.M0(2131751928, null);
                                b8c b8cVar4 = new b8c(39);
                                b8cVar4.d = jn7.n1;
                                b8cVar4.m = M04;
                                b8cVar4.A = 0;
                                b8cVar4.L(me3Var.k2);
                                arrayList.add(b8cVar4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = me3Var.m2;
                                arrayList.add(b8c.B(jn7.o1, hl.D2(hl.N2(ob6.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), -1, 0, new ge3(me3Var, b2), null), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (me3Var.l2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 != null) {
                    me3Var.m2 = participantJoinedChats2;
                    me3Var.S1.O(true);
                    break;
                }
                break;
        }
    }
}
