package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kq extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ oq d;

    public kq(oq oqVar, Context context) {
        this.d = oqVar;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r7 == r4.K0) goto L41;
     */
    @Override // org.telegram.ui.Components.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 != 16) {
            oq oqVar = this.d;
            if (i7 == 7 || i7 == 14) {
                return org.telegram.messenger.t3.w(2, oqVar.n);
            }
            if (i7 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject();
                if (oqVar.N != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = d1Var.b();
                if (i7 != 0 && i7 != 2 && i7 != 6) {
                    if (i7 == 12) {
                        if (b10 == oqVar.w0) {
                            return org.telegram.messenger.t3.y(13, oqVar.n);
                        }
                        if (b10 == oqVar.I0) {
                            return org.telegram.messenger.t3.y(2, oqVar.n);
                        }
                    }
                    if (i7 != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i7) {
        oq oqVar = this.d;
        int i10 = oqVar.D0;
        if (i7 >= i10 && i7 < oqVar.E0) {
            return (TLObject) oqVar.E.get(i7 - i10);
        }
        int i11 = oqVar.T0;
        if (i7 >= i11 && i7 < oqVar.U0) {
            return (TLObject) oqVar.G.get(i7 - i11);
        }
        int i12 = oqVar.W0;
        if (i7 < i12 || i7 >= oqVar.X0) {
            return null;
        }
        return (TLObject) oqVar.F.get(i7 - i12);
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        oq oqVar = this.d;
        if (i7 == oqVar.y0 || i7 == oqVar.z0 || i7 == oqVar.u0 || i7 == oqVar.s0) {
            return 2;
        }
        if ((i7 >= oqVar.D0 && i7 < oqVar.E0) || ((i7 >= oqVar.W0 && i7 < oqVar.X0) || (i7 >= oqVar.T0 && i7 < oqVar.U0))) {
            return 0;
        }
        if (i7 == oqVar.B0 || i7 == oqVar.F0 || i7 == oqVar.G0) {
            return 3;
        }
        if (i7 == oqVar.C0 || i7 == oqVar.R || i7 == oqVar.M0 || i7 == oqVar.r0 || i7 == oqVar.o0) {
            return 5;
        }
        if (i7 == oqVar.a1 || i7 == oqVar.O0 || i7 == oqVar.Q0 || i7 == oqVar.t0 || i7 == oqVar.x0 || i7 == oqVar.J0 || i7 == oqVar.L0 || i7 == oqVar.i1 || i7 == oqVar.n0 || i7 == oqVar.q0) {
            return 1;
        }
        if (i7 == oqVar.b1) {
            return 4;
        }
        if (i7 == oqVar.A0) {
            return 6;
        }
        if (i7 == oqVar.f0 || i7 == oqVar.g0 || i7 == oqVar.l0 || i7 == oqVar.h0 || i7 == oqVar.i0 || i7 == oqVar.S || i7 == oqVar.d0 || i7 == oqVar.e0 || i7 == oqVar.k0 || i7 == oqVar.P0) {
            return 7;
        }
        if (i7 == oqVar.Y0 || i7 == oqVar.S0 || i7 == oqVar.V0 || i7 == oqVar.f1) {
            return 8;
        }
        if (i7 == oqVar.N0) {
            return 9;
        }
        if (i7 == oqVar.Z0) {
            return 10;
        }
        if (i7 == oqVar.e1) {
            return 11;
        }
        if (i7 == oqVar.w0 || i7 == oqVar.I0 || i7 == oqVar.K0) {
            return 12;
        }
        if (oqVar.u0(i7)) {
            return 13;
        }
        if (i7 == oqVar.T) {
            return 14;
        }
        if (i7 == oqVar.R0) {
            return 15;
        }
        if (i7 == oqVar.g1 || i7 == oqVar.h1 || i7 == oqVar.m0) {
            return 16;
        }
        return i7 == oqVar.p0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x082b, code lost:
    
        if (r3.n.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x082d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0843, code lost:
    
        if (r3.n.megagroup == false) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0b98  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        Object[] objArr;
        long j3;
        CharSequence charSequence;
        int i11;
        boolean z9;
        long j10;
        boolean z10;
        long j11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11;
        boolean z12;
        int i12;
        Object[] objArr2;
        TLObject M0;
        boolean z13;
        CharSequence charSequence2;
        TLRPC.User a22;
        CharSequence M02;
        boolean z14;
        CharSequence charSequence3;
        CharSequence charSequence4;
        TLRPC.User a23;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        oq oqVar = this.d;
        ArrayList arrayList = oqVar.E;
        boolean z15 = oqVar.w;
        boolean z16 = oqVar.s;
        int i14 = oqVar.N;
        int i15 = d1Var.f;
        View view = d1Var.a;
        int i16 = R.drawable.permission_locked;
        r10 = true;
        r10 = true;
        boolean z17 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                a5Var.setTag(Integer.valueOf(i7));
                TLObject E = E(i7);
                if (i7 < oqVar.D0 || i7 >= (i10 = oqVar.E0)) {
                    if (i7 >= oqVar.T0 && i7 < (i10 = oqVar.U0)) {
                        if (org.telegram.messenger.t3.T(oqVar.n)) {
                            break;
                        }
                    } else {
                        i10 = oqVar.X0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.t3.T(oqVar.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j3 = 0;
                    long j13 = ((TLRPC.User) E).id;
                    tL_chatBannedRights = null;
                    i11 = 0;
                    z9 = false;
                    z10 = false;
                    z11 = false;
                    j10 = j13;
                    j12 = 0;
                    charSequence = "";
                    j11 = 0;
                } else {
                    j3 = 0;
                    if (E instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        long C1 = org.telegram.messenger.ij.C1(channelParticipant.peer);
                        j12 = channelParticipant.kicked_by;
                        charSequence = "";
                        j11 = channelParticipant.promoted_by;
                        tL_chatBannedRights = channelParticipant.banned_rights;
                        int i17 = channelParticipant.date;
                        boolean z18 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        boolean z19 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z9 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z10 = z19;
                        z11 = z18;
                        i11 = i17;
                        j10 = C1;
                    } else {
                        charSequence = "";
                        if (E instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                            long j14 = chatParticipant.user_id;
                            i11 = chatParticipant.date;
                            boolean z20 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z9 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            j10 = j14;
                            z10 = z20;
                            j11 = 0;
                            j12 = 0;
                            tL_chatBannedRights = null;
                            z11 = false;
                        }
                    }
                }
                if (j10 > j3) {
                    z12 = z9;
                    i12 = i10;
                    M0 = oqVar.getMessagesController().a2(Long.valueOf(j10));
                    objArr2 = objArr;
                } else {
                    z12 = z9;
                    i12 = i10;
                    objArr2 = objArr;
                    M0 = oqVar.getMessagesController().M0(Long.valueOf(-j10));
                }
                if (M0 != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    a5Var.c(M0, null, (!objArr2 == true || i11 == 0) ? null : org.telegram.messenger.hd.B(i11), i7 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z10) {
                                    if (!z12 || (a22 = oqVar.getMessagesController().a2(Long.valueOf(j11))) == null) {
                                        z13 = false;
                                        charSequence2 = null;
                                    } else if (a22.id == j10) {
                                        M02 = org.telegram.messenger.hd.M0(2131752518, null);
                                    } else {
                                        z13 = false;
                                        charSequence2 = org.telegram.messenger.hd.a0(null, null, 2131751309, org.telegram.messenger.t10.p(a22));
                                    }
                                    a5Var.c(M0, null, charSequence2, i7 == i12 + (-1) ? true : z13);
                                    break;
                                } else {
                                    M02 = org.telegram.messenger.hd.M0(2131752423, null);
                                }
                                charSequence2 = M02;
                                z13 = false;
                                a5Var.c(M0, null, charSequence2, i7 == i12 + (-1) ? true : z13);
                            }
                        } else {
                            if (!z11 || (a23 = oqVar.getMessagesController().a2(Long.valueOf(j12))) == null) {
                                z14 = true;
                                charSequence3 = null;
                                charSequence4 = null;
                            } else {
                                z14 = true;
                                charSequence3 = null;
                                charSequence4 = org.telegram.messenger.hd.a0(null, null, 2131743733, org.telegram.messenger.t10.p(a23));
                            }
                            a5Var.c(M0, charSequence3, charSequence4, i7 != i12 + (-1) ? z14 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z21 = tL_chatBannedRights.view_messages;
                            if (z21 && oqVar.D.view_messages != z21) {
                                sb3.append(org.telegram.messenger.hd.M0(2131743706, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && oqVar.D.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743696, "UserRestrictionsNoSendText"));
                            }
                            boolean z22 = tL_chatBannedRights.send_media;
                            if (!z22 || oqVar.D.send_media == z22) {
                                boolean z23 = tL_chatBannedRights.send_photos;
                                if (z23 && oqVar.D.send_photos != z23) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743701, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z24 = tL_chatBannedRights.send_videos;
                                if (z24 && oqVar.D.send_videos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743695, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_audios;
                                if (z25 && oqVar.D.send_audios != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743702, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z26 = tL_chatBannedRights.send_docs;
                                if (z26 && oqVar.D.send_docs != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743704, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z27 = tL_chatBannedRights.send_voices;
                                if (z27 && oqVar.D.send_voices != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743694, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z28 = tL_chatBannedRights.send_roundvideos;
                                if (z28 && oqVar.D.send_roundvideos != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.hd.M0(2131743698, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743703, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z29 = tL_chatBannedRights.send_stickers;
                            if (z29 && oqVar.D.send_stickers != z29) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743697, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z30 = tL_chatBannedRights.send_polls;
                            if (z30 && oqVar.D.send_polls != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743700, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z31 = tL_chatBannedRights.embed_links;
                            if (z31 && !tL_chatBannedRights.send_plain && oqVar.D.embed_links != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743709, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z32 = tL_chatBannedRights.invite_users;
                            if (z32 && oqVar.D.invite_users != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743708, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z33 = tL_chatBannedRights.pin_messages;
                            if (z33 && oqVar.D.pin_messages != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743707, null));
                            }
                            boolean z34 = tL_chatBannedRights.edit_rank;
                            if (z34 && oqVar.D.edit_rank != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743710, null));
                            }
                            boolean z35 = tL_chatBannedRights.send_reactions;
                            if (z35 && oqVar.D.send_reactions != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743699, null));
                            }
                            boolean z36 = tL_chatBannedRights.change_info;
                            if (z36 && oqVar.D.change_info != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.hd.M0(2131743711, null));
                            }
                            if (sb3.length() != 0) {
                                sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                sb3.append('.');
                            }
                            sb2 = sb3.toString();
                        }
                        a5Var.c(M0, null, sb2, i7 != i12 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 != oqVar.x0) {
                    if (i7 != oqVar.a1) {
                        if (i7 != oqVar.O0) {
                            if (i7 != oqVar.n0) {
                                if (i7 != oqVar.q0) {
                                    if (i7 != oqVar.J0) {
                                        if (i7 != oqVar.L0) {
                                            if (i7 != oqVar.t0) {
                                                if (i7 != oqVar.Q0) {
                                                    if (i7 == oqVar.i1) {
                                                        z8Var.setText(org.telegram.messenger.hd.M0(oqVar.u1 ? 2131752292 : 2131752296, null));
                                                        break;
                                                    }
                                                } else if (!oqVar.q1) {
                                                    z8Var.setText(org.telegram.messenger.hd.M0(2131749407, null));
                                                    break;
                                                } else {
                                                    z8Var.setText(org.telegram.messenger.hd.M0(2131749406, null));
                                                    break;
                                                }
                                            } else {
                                                z8Var.setText(org.telegram.messenger.hd.M0(2131752882, null));
                                                break;
                                            }
                                        } else {
                                            z8Var.setText(org.telegram.messenger.hd.M0(2131752378, null));
                                            break;
                                        }
                                    } else {
                                        z8Var.setText(org.telegram.messenger.hd.M0(2131752404, null));
                                        break;
                                    }
                                } else {
                                    z8Var.setText(org.telegram.messenger.hd.a0(null, null, 2131749422, hi.j.J0(oqVar.getMessagesController().J6), String.valueOf(((int) (((oqVar.z1 * (oqVar.getMessagesController().J6 / 1000.0f)) / 1000.0d) * oqVar.getMessagesController().c6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                z8Var.setText(org.telegram.messenger.hd.M0(2131749424, null));
                                break;
                            }
                        } else {
                            int r02 = oq.r0(oqVar.o1);
                            if (oqVar.r != null && r02 != 0) {
                                z8Var.setText(org.telegram.messenger.hd.a0(null, null, 2131745308, r02 < 60 ? org.telegram.messenger.hd.G(r02, "Seconds", new Object[0]) : r02 < 3600 ? org.telegram.messenger.hd.G(r02 / 60, "Minutes", new Object[0]) : org.telegram.messenger.hd.G((r02 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                z8Var.setText(org.telegram.messenger.hd.M0(2131745309, null));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z16 || oqVar.d1 != 0) {
                                    z8Var.setText("");
                                    break;
                                } else {
                                    z8Var.setText(org.telegram.messenger.hd.M0(2131752376, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (oqVar.y0 == -1) {
                            z8Var.setText("");
                            break;
                        } else if (!z16) {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131748644, "MegaAdminsInfo"));
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131752515, "ChannelAdminsInfo"));
                            break;
                        }
                    } else if (!z16) {
                        if (!z15) {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131748235, null));
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131748236, null));
                            break;
                        }
                    } else {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131748237, null));
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131752462, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                if (i7 != oqVar.y0) {
                    if (i7 != oqVar.u0) {
                        if (i7 != oqVar.z0) {
                            if (i7 == oqVar.s0) {
                                x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                x4Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.hd.M0(2131752883, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            if ((!oqVar.P || oqVar.Q) && oqVar.Y0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            x4Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.hd.M0(2131752402, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_log, 5, org.telegram.messenger.hd.M0(2131751080, null), oqVar.w0 > oqVar.u0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                if (oqVar.z0 != -1 || ((!oqVar.P || oqVar.Q) && oqVar.Y0 == -1 && !arrayList.isEmpty())) {
                                    r15 = true;
                                }
                                if (!z16) {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.M0(2131754401, null), r15);
                                    break;
                                } else {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.M0(2131754383, null), r15);
                                    break;
                                }
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            x4Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.hd.M0(2131752528, "ChannelAddAdmin"), !oqVar.P || oqVar.Q);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.hd.M0(2131752452, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.M0(2131752527, "ChannelAddException"), oqVar.D0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != oqVar.C0) {
                    if (i7 != oqVar.R) {
                        if (i7 != oqVar.M0) {
                            if (i7 != oqVar.r0) {
                                if (i7 == oqVar.o0) {
                                    n4Var.setText(org.telegram.messenger.hd.M0(2131749423, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131752884, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131745311, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(z15 ? 2131751885 : 2131752332, null));
                        break;
                    }
                } else if (i14 != 0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131752308, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = oqVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131752451, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String M03 = org.telegram.messenger.hd.M0(2131752453, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = oqVar.r;
                w9Var.c(M03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = q8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.k6.r7;
                int i19 = org.telegram.ui.ActionBar.k6.V6;
                int i20 = org.telegram.ui.ActionBar.k6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z37 = q8Var.getTag() != null && ((Integer) q8Var.getTag()).intValue() == i7;
                q8Var.setTag(Integer.valueOf(i7));
                if (i7 == oqVar.f0) {
                    q8Var.d(org.telegram.messenger.hd.M0(z15 ? 2131751967 : 2131743717, null), (oqVar.D.change_info || org.telegram.messenger.t3.t0(oqVar.n)) ? false : true, oqVar.k0 != -1, z37);
                } else if (i7 == oqVar.l0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131751966, null), !oqVar.D.manage_linked_peers, false, z37);
                } else if (i7 == oqVar.g0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743712, "UserRestrictionsInviteUsers"), !oqVar.D.invite_users, true, z37);
                } else if (i7 == oqVar.h0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743693, null), (oqVar.D.pin_messages || org.telegram.messenger.t3.t0(oqVar.n)) ? false : true, true, z37);
                } else if (i7 == oqVar.i0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743714, null), !oqVar.D.edit_rank, true, z37);
                } else if (i7 == oqVar.S) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743686, "UserRestrictionsSendText"), !oqVar.D.send_plain, true, z37);
                } else if (i7 == oqVar.P0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131749408, null), oqVar.q1, false, z37);
                    q8Var.getCheckBox().setDrawIconType(0);
                    q8Var.getCheckBox().d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, i20, i20);
                } else if (i7 == oqVar.T) {
                    int s02 = oq.s0(oqVar.D);
                    q8Var.d(org.telegram.messenger.hd.M0(2131743691, "UserRestrictionsSendMedia"), s02 > 0, true, z37);
                    Locale locale = Locale.US;
                    q8Var.a(new m9.u(this, q8Var, false, 29), com.google.android.recaptcha.internal.a.i(s02, "/10"), !oqVar.k1);
                } else if (i7 == oqVar.d0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743687, "UserRestrictionsSendStickers"), !oqVar.D.send_stickers, true, z37);
                } else if (i7 == oqVar.e0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743713, "UserRestrictionsEmbedLinks"), !oqVar.D.embed_links, true, z37);
                } else if (i7 == oqVar.c0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131743689, "UserRestrictionsSendPollsShort"), !oqVar.D.send_polls, true, false);
                } else if (i7 == oqVar.k0) {
                    q8Var.d(org.telegram.messenger.hd.M0(2131751701, "CreateTopicsPermission"), !oqVar.D.manage_topics, false, z37);
                }
                if (i7 == oqVar.h0 || i7 == oqVar.f0) {
                    i13 = ((org.telegram.ui.ActionBar.f2) oqVar).currentAccount;
                    if (org.telegram.messenger.t3.Z(i13, oqVar.M)) {
                        q8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.t3.w(2, oqVar.n)) {
                    q8Var.setIcon(0);
                    break;
                } else if ((i7 == oqVar.g0 && !org.telegram.messenger.t3.y(3, oqVar.n)) || ((i7 == oqVar.h0 && !org.telegram.messenger.t3.y(0, oqVar.n)) || ((i7 == oqVar.f0 && !org.telegram.messenger.t3.y(1, oqVar.n)) || ((i7 == oqVar.k0 && !org.telegram.messenger.t3.y(15, oqVar.n)) || (org.telegram.messenger.t3.t0(oqVar.n) && (i7 == oqVar.h0 || i7 == oqVar.f0)))))) {
                    q8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    q8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                if (i7 != oqVar.Y0) {
                    if (i7 != oqVar.V0) {
                        if (i7 != oqVar.S0) {
                            if (i7 == oqVar.f1) {
                                x3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.t3.T(oqVar.n) && !oqVar.n.megagroup) {
                            x3Var.setText(org.telegram.messenger.hd.M0(2131752424, "ChannelContacts"));
                            break;
                        } else {
                            x3Var.setText(org.telegram.messenger.hd.M0(2131749455, "GroupContacts"));
                            break;
                        }
                    } else {
                        x3Var.setText(org.telegram.messenger.hd.M0(2131752448, "ChannelBots"));
                        break;
                    }
                } else if (org.telegram.messenger.t3.T(oqVar.n) && !oqVar.n.megagroup) {
                    x3Var.setText(org.telegram.messenger.hd.M0(2131752334, "ChannelOtherSubscribers"));
                    break;
                } else {
                    x3Var.setText(org.telegram.messenger.hd.M0(2131752336, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.lz lzVar = (org.telegram.ui.Components.lz) view;
                if (i14 != 0) {
                    lzVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = oqVar.r;
                    lzVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (i7 != oqVar.w0) {
                    if (i7 != oqVar.I0) {
                        if (i7 == oqVar.K0) {
                            m8Var.getCheckBox().setIcon(0);
                            String M04 = org.telegram.messenger.hd.M0(2131752379, null);
                            TLRPC.Chat chat = oqVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z17 = false;
                            }
                            m8Var.l(M04, z17, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = m8Var.getCheckBox();
                        if (org.telegram.messenger.t3.y(2, oqVar.n) && ((chatFull = oqVar.r) == null || chatFull.participants_hidden || oqVar.q0() >= oqVar.getMessagesController().g5)) {
                            i16 = 0;
                        }
                        checkBox2.setIcon(i16);
                        String M05 = org.telegram.messenger.hd.M0(2131752405, null);
                        TLRPC.ChatFull chatFull6 = oqVar.r;
                        m8Var.l(M05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = m8Var.getCheckBox();
                    if (org.telegram.messenger.t3.y(13, oqVar.n) && ((chatFull2 = oqVar.r) == null || chatFull2.antispam || oqVar.q0() >= oqVar.getMessagesController().f5)) {
                        i16 = 0;
                    }
                    checkBox3.setIcon(i16);
                    String M06 = org.telegram.messenger.hd.M0(2131752467, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = oqVar.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r15 = true;
                    }
                    m8Var.n(R.drawable.msg_policy, M06, r15);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z38 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i7;
                c2Var.setTag(Integer.valueOf(i7));
                if (i7 != oqVar.U) {
                    if (i7 != oqVar.V) {
                        if (i7 != oqVar.W) {
                            if (i7 != oqVar.X) {
                                if (i7 != oqVar.Y) {
                                    if (i7 != oqVar.Z) {
                                        if (i7 != oqVar.a0) {
                                            if (i7 != oqVar.b0) {
                                                if (i7 != oqVar.j0) {
                                                    if (i7 != oqVar.c0) {
                                                        c2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.hd.M0(2131745603, "SendMediaPolls"), "", !oqVar.D.send_polls, true, z38);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.hd.M0(2131743688, null), "", !oqVar.D.send_reactions, false, z38);
                                                    break;
                                                }
                                            } else {
                                                String M07 = org.telegram.messenger.hd.M0(2131745611, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = oqVar.D;
                                                c2Var.e(M07, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z38);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.hd.M0(2131745607, "SendMediaPermissionRound"), "", !oqVar.D.send_roundvideos, true, z38);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.hd.M0(2131745604, "SendMediaPermissionVoice"), "", !oqVar.D.send_voices, true, z38);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.hd.M0(2131745610, "SendMediaPermissionFiles"), "", !oqVar.D.send_docs, true, z38);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.hd.M0(2131745609, "SendMediaPermissionMusic"), "", !oqVar.D.send_audios, true, z38);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.hd.M0(2131745606, "SendMediaPermissionStickersGifs"), "", !oqVar.D.send_stickers, true, z38);
                            break;
                        }
                    } else {
                        c2Var.e(org.telegram.messenger.hd.M0(2131745605, "SendMediaPermissionVideos"), "", !oqVar.D.send_videos, true, z38);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.hd.M0(2131745608, "SendMediaPermissionPhotos"), "", !oqVar.D.send_photos, true, z38);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 != oqVar.g1) {
                    if (i7 != oqVar.h1) {
                        if (i7 == oqVar.m0) {
                            r8Var.f(org.telegram.messenger.hd.M0(2131749425, null), oqVar.x1, false);
                            break;
                        }
                    } else {
                        r8Var.f(org.telegram.messenger.hd.M0(2131752293, null), oqVar.v1, false);
                        break;
                    }
                } else {
                    String M08 = org.telegram.messenger.hd.M0(2131752295, null);
                    boolean z39 = oqVar.u1;
                    r8Var.f(M08, z39, z39);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                if (i7 == oqVar.p0) {
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) oqVar.getMessagesController().I6);
                    int k10 = (int) Utilities.k(oqVar.z1, oqVar.getMessagesController().I6, 1L);
                    org.telegram.messenger.ch chVar = new org.telegram.messenger.ch(24);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.c = a10;
                    s7Var.d = 20;
                    s7Var.e = chVar;
                    t7Var.d(k10, s7Var, new r3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View view;
        View view2;
        int i10 = 1;
        Context context = this.c;
        oq oqVar = this.d;
        switch (i7) {
            case 0:
                int i11 = oqVar.N;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, (i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, oqVar.d1 == 0, null);
                a5Var.setDelegate(new jq(this, r8));
                view2 = a5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (!oqVar.s) {
                    if (!oqVar.w) {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131748235, null));
                        view = z8Var;
                        break;
                    } else {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131748236, null));
                        view = z8Var;
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131748237, null));
                    view = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                view2 = n4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.w9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.f2) oqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, f6Var);
                x3Var.setBackground(null);
                view = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.vt0 vt0Var = new org.telegram.ui.Components.vt0(context, null);
                vt0Var.b(oqVar.o1, null, org.telegram.messenger.hd.M0(2131745306, "SlowmodeOff"), org.telegram.messenger.hd.a0(null, null, 2131745305, 5), org.telegram.messenger.hd.a0(null, null, 2131745305, 10), org.telegram.messenger.hd.a0(null, null, 2131745305, 30), org.telegram.messenger.hd.a0(null, null, 2131745307, 1), org.telegram.messenger.hd.a0(null, null, 2131745307, 5), org.telegram.messenger.hd.a0(null, null, 2131745307, 15), org.telegram.messenger.hd.a0(null, null, 2131745310, 1));
                vt0Var.setCallback(new jq(this, i10));
                view = vt0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(6);
                lzVar.x = false;
                lzVar.setUseHeaderOffset(false);
                lzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.o0 o0Var = new v4.o0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                lzVar.setLayoutParams(o0Var);
                view = lzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.c, oqVar.getResourceProvider(), false, true);
                m8Var.w = 50;
                view = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, oqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                c2Var.setEnabled(true);
                view = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.vt0 vt0Var2 = new org.telegram.ui.Components.vt0(context, null);
                Drawable[] drawableArr = {oqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), oqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), oqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), oqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), oqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = oqVar.r1;
                vt0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                vt0Var2.setCallback(new jq(this, r5));
                view2 = vt0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.r8(context, oqVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.t7(context, oqVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
