// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class md3 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sd3 b;

    public /* synthetic */ md3(sd3 sd3Var, byte b) {
        this.a = b;
        this.b = sd3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0410  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Object[] objArr;
        byte b = this.a;
        sd3 sd3Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                rd3 rd3Var = sd3Var.e2;
                rd3 rd3Var2 = sd3Var.g2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = sd3Var.r2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = sd3Var.q2;
                if (sd3Var.W1 != null) {
                    arrayList.add(c4c.D(gl.L(12.0f)));
                    arrayList.add(c4c.u(k96.M0(2131751581, null)));
                    sd3Var.Z0(arrayList, sd3Var.d2);
                    if (sd3Var.u2) {
                        rd3Var.i();
                        int i = (sd3Var.x2 ? 1 : 0) + (sd3Var.y2 ? 1 : 0);
                        String str = rd3Var.b;
                        Locale locale = Locale.US;
                        c4c A = c4c.A(i + "/2", str, 100);
                        A.L(i == 2);
                        A.f = sd3Var.w2;
                        A.E = new kb1((Object) sd3Var, (Object) l5cVar, (byte) 28);
                        arrayList.add(A);
                        if (!sd3Var.w2) {
                            c4c z = c4c.z(101, k96.M0(2131745866, null));
                            z.L(sd3Var.x2);
                            z.i = 1;
                            arrayList.add(z);
                            c4c z2 = c4c.z(kk7.m1, k96.M0(2131745865, null));
                            z2.L(sd3Var.y2);
                            z2.i = 1;
                            arrayList.add(z2);
                        }
                    } else {
                        sd3Var.Z0(arrayList, rd3Var);
                        sd3Var.Z0(arrayList, sd3Var.f2);
                    }
                    sd3Var.Z0(arrayList, rd3Var2);
                    if (!sd3Var.c2 && rd3Var2.e()) {
                        if (sd3Var.b2) {
                            arrayList.add(c4c.C(null));
                            if (rd3Var2.d()) {
                                String G = k96.G(rd3Var2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                c4c c4cVar = new c4c(42);
                                c4cVar.d = 0;
                                c4cVar.p = G;
                                arrayList.add(c4cVar);
                            } else {
                                String M0 = k96.M0(2131743484, null);
                                c4c c4cVar2 = new c4c(42);
                                c4cVar2.d = 0;
                                c4cVar2.p = M0;
                                arrayList.add(c4cVar2);
                            }
                            c4c F = c4c.F(0, k96.M0(2131743452, null));
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
                            String M02 = k96.M0(2131743451, null);
                            Locale locale2 = Locale.US;
                            c4c o = c4c.o(1, M02, i2 + "/10");
                            o.L(i2 > 0);
                            o.u = sd3Var.Y0();
                            o.f = sd3Var.t2;
                            o.E = new wg((Object) sd3Var, i2, (Object) l5cVar, (byte) 6);
                            arrayList.add(o);
                            if (!sd3Var.t2) {
                                c4c z3 = c4c.z(6, k96.M0(2131745415, null));
                                z3.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z3.u = tL_chatBannedRights2.send_photos;
                                z3.i = 1;
                                arrayList.add(z3);
                                c4c z4 = c4c.z(7, k96.M0(2131745412, null));
                                z4.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z4.u = tL_chatBannedRights2.send_videos;
                                z4.i = 1;
                                arrayList.add(z4);
                                c4c z5 = c4c.z(8, k96.M0(2131745417, null));
                                z5.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z5.u = tL_chatBannedRights2.send_docs;
                                z5.i = 1;
                                arrayList.add(z5);
                                c4c z6 = c4c.z(9, k96.M0(2131745416, null));
                                z6.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z6.u = tL_chatBannedRights2.send_audios;
                                z6.i = 1;
                                arrayList.add(z6);
                                c4c z7 = c4c.z(10, k96.M0(2131745411, null));
                                z7.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z7.u = tL_chatBannedRights2.send_voices;
                                z7.i = 1;
                                arrayList.add(z7);
                                c4c z8 = c4c.z(11, k96.M0(2131745414, null));
                                z8.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z8.u = tL_chatBannedRights2.send_roundvideos;
                                z8.i = 1;
                                arrayList.add(z8);
                                c4c z9 = c4c.z(12, k96.M0(2131745413, null));
                                z9.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z9.u = tL_chatBannedRights2.send_stickers;
                                z9.i = 1;
                                arrayList.add(z9);
                                c4c z10 = c4c.z(13, k96.M0(2131745410, null));
                                z10.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z10.u = tL_chatBannedRights2.send_polls;
                                z10.i = 1;
                                arrayList.add(z10);
                                c4c z11 = c4c.z(14, k96.M0(2131743473, null));
                                z11.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z11.u = tL_chatBannedRights2.embed_links;
                                z11.i = 1;
                                arrayList.add(z11);
                                c4c z12 = c4c.z(15, k96.M0(2131743448, null));
                                z12.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z12.u = tL_chatBannedRights2.send_reactions;
                                z12.i = 1;
                                arrayList.add(z12);
                            }
                            c4c F2 = c4c.F(2, k96.M0(2131743472, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            c4c F3 = c4c.F(3, k96.M0(2131743453, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            c4c F4 = c4c.F(4, k96.M0(2131743477, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (sd3Var.V1) {
                                c4c F5 = c4c.F(5, k96.M0(2131751688, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (sd3Var.j2) {
                            boolean d = rd3Var2.d();
                            boolean z13 = sd3Var.b2;
                            String M03 = k96.M0(!d ? z13 ? 2131751467 : 2131751465 : z13 ? 2131751466 : 2131751464, null);
                            c4c c4cVar3 = new c4c(38);
                            c4cVar3.d = 1;
                            c4cVar3.p = M03;
                            c4cVar3.f = !sd3Var.b2;
                            c4cVar3.r = true;
                            arrayList.add(c4cVar3);
                            objArr = false;
                            if (sd3Var.l2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(c4c.D(gl.L(12.0f)));
                                }
                                String M04 = k96.M0(2131751951, null);
                                c4c c4cVar4 = new c4c(39);
                                c4cVar4.d = kk7.n1;
                                c4cVar4.m = M04;
                                c4cVar4.A = 0;
                                c4cVar4.L(sd3Var.k2);
                                arrayList.add(c4cVar4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = sd3Var.m2;
                                arrayList.add(c4c.B(kk7.o1, gl.D2(gl.N2(k96.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), -1, 0, new nd3(sd3Var, b2), null), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (sd3Var.l2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 != null) {
                    sd3Var.m2 = participantJoinedChats2;
                    sd3Var.S1.O(true);
                    break;
                }
                break;
        }
    }
}
