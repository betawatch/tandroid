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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mq extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ qq d;

    public mq(qq qqVar, Context context) {
        this.d = qqVar;
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
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 != 16) {
            qq qqVar = this.d;
            if (i7 == 7 || i7 == 14) {
                return org.telegram.messenger.t3.w(2, qqVar.n);
            }
            if (i7 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject();
                if (qqVar.N != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = d1Var.b();
                if (i7 != 0 && i7 != 2 && i7 != 6) {
                    if (i7 == 12) {
                        if (b10 == qqVar.w0) {
                            return org.telegram.messenger.t3.y(13, qqVar.n);
                        }
                        if (b10 == qqVar.I0) {
                            return org.telegram.messenger.t3.y(2, qqVar.n);
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
        qq qqVar = this.d;
        int i10 = qqVar.D0;
        if (i7 >= i10 && i7 < qqVar.E0) {
            return (TLObject) qqVar.E.get(i7 - i10);
        }
        int i11 = qqVar.T0;
        if (i7 >= i11 && i7 < qqVar.U0) {
            return (TLObject) qqVar.G.get(i7 - i11);
        }
        int i12 = qqVar.W0;
        if (i7 < i12 || i7 >= qqVar.X0) {
            return null;
        }
        return (TLObject) qqVar.F.get(i7 - i12);
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        qq qqVar = this.d;
        if (i7 == qqVar.y0 || i7 == qqVar.z0 || i7 == qqVar.u0 || i7 == qqVar.s0) {
            return 2;
        }
        if ((i7 >= qqVar.D0 && i7 < qqVar.E0) || ((i7 >= qqVar.W0 && i7 < qqVar.X0) || (i7 >= qqVar.T0 && i7 < qqVar.U0))) {
            return 0;
        }
        if (i7 == qqVar.B0 || i7 == qqVar.F0 || i7 == qqVar.G0) {
            return 3;
        }
        if (i7 == qqVar.C0 || i7 == qqVar.R || i7 == qqVar.M0 || i7 == qqVar.r0 || i7 == qqVar.o0) {
            return 5;
        }
        if (i7 == qqVar.a1 || i7 == qqVar.O0 || i7 == qqVar.Q0 || i7 == qqVar.t0 || i7 == qqVar.x0 || i7 == qqVar.J0 || i7 == qqVar.L0 || i7 == qqVar.i1 || i7 == qqVar.n0 || i7 == qqVar.q0) {
            return 1;
        }
        if (i7 == qqVar.b1) {
            return 4;
        }
        if (i7 == qqVar.A0) {
            return 6;
        }
        if (i7 == qqVar.f0 || i7 == qqVar.g0 || i7 == qqVar.l0 || i7 == qqVar.h0 || i7 == qqVar.i0 || i7 == qqVar.S || i7 == qqVar.d0 || i7 == qqVar.e0 || i7 == qqVar.k0 || i7 == qqVar.P0) {
            return 7;
        }
        if (i7 == qqVar.Y0 || i7 == qqVar.S0 || i7 == qqVar.V0 || i7 == qqVar.f1) {
            return 8;
        }
        if (i7 == qqVar.N0) {
            return 9;
        }
        if (i7 == qqVar.Z0) {
            return 10;
        }
        if (i7 == qqVar.e1) {
            return 11;
        }
        if (i7 == qqVar.w0 || i7 == qqVar.I0 || i7 == qqVar.K0) {
            return 12;
        }
        if (qqVar.u0(i7)) {
            return 13;
        }
        if (i7 == qqVar.T) {
            return 14;
        }
        if (i7 == qqVar.R0) {
            return 15;
        }
        if (i7 == qqVar.g1 || i7 == qqVar.h1 || i7 == qqVar.m0) {
            return 16;
        }
        return i7 == qqVar.p0 ? 17 : 0;
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
        qq qqVar = this.d;
        ArrayList arrayList = qqVar.E;
        boolean z15 = qqVar.w;
        boolean z16 = qqVar.s;
        int i14 = qqVar.N;
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
                if (i7 < qqVar.D0 || i7 >= (i10 = qqVar.E0)) {
                    if (i7 >= qqVar.T0 && i7 < (i10 = qqVar.U0)) {
                        if (org.telegram.messenger.t3.T(qqVar.n)) {
                            break;
                        }
                    } else {
                        i10 = qqVar.X0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.t3.T(qqVar.n)) {
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
                        long B1 = org.telegram.messenger.ij.B1(channelParticipant.peer);
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
                        j10 = B1;
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
                    M0 = qqVar.getMessagesController().a2(Long.valueOf(j10));
                    objArr2 = objArr;
                } else {
                    z12 = z9;
                    i12 = i10;
                    objArr2 = objArr;
                    M0 = qqVar.getMessagesController().M0(Long.valueOf(-j10));
                }
                if (M0 != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    a5Var.c(M0, null, (!objArr2 == true || i11 == 0) ? null : org.telegram.messenger.id.B(i11), i7 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z10) {
                                    if (!z12 || (a22 = qqVar.getMessagesController().a2(Long.valueOf(j11))) == null) {
                                        z13 = false;
                                        charSequence2 = null;
                                    } else if (a22.id == j10) {
                                        M02 = org.telegram.messenger.id.M0(2131752518, null);
                                    } else {
                                        z13 = false;
                                        charSequence2 = org.telegram.messenger.id.a0(null, null, 2131751308, org.telegram.messenger.t10.p(a22));
                                    }
                                    a5Var.c(M0, null, charSequence2, i7 == i12 + (-1) ? true : z13);
                                    break;
                                } else {
                                    M02 = org.telegram.messenger.id.M0(2131752423, null);
                                }
                                charSequence2 = M02;
                                z13 = false;
                                a5Var.c(M0, null, charSequence2, i7 == i12 + (-1) ? true : z13);
                            }
                        } else {
                            if (!z11 || (a23 = qqVar.getMessagesController().a2(Long.valueOf(j12))) == null) {
                                z14 = true;
                                charSequence3 = null;
                                charSequence4 = null;
                            } else {
                                z14 = true;
                                charSequence3 = null;
                                charSequence4 = org.telegram.messenger.id.a0(null, null, 2131743732, org.telegram.messenger.t10.p(a23));
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
                            if (z21 && qqVar.D.view_messages != z21) {
                                sb3.append(org.telegram.messenger.id.M0(2131743705, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && qqVar.D.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743695, "UserRestrictionsNoSendText"));
                            }
                            boolean z22 = tL_chatBannedRights.send_media;
                            if (!z22 || qqVar.D.send_media == z22) {
                                boolean z23 = tL_chatBannedRights.send_photos;
                                if (z23 && qqVar.D.send_photos != z23) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743700, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z24 = tL_chatBannedRights.send_videos;
                                if (z24 && qqVar.D.send_videos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743694, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_audios;
                                if (z25 && qqVar.D.send_audios != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743701, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z26 = tL_chatBannedRights.send_docs;
                                if (z26 && qqVar.D.send_docs != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743703, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z27 = tL_chatBannedRights.send_voices;
                                if (z27 && qqVar.D.send_voices != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743693, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z28 = tL_chatBannedRights.send_roundvideos;
                                if (z28 && qqVar.D.send_roundvideos != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743697, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743702, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z29 = tL_chatBannedRights.send_stickers;
                            if (z29 && qqVar.D.send_stickers != z29) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743696, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z30 = tL_chatBannedRights.send_polls;
                            if (z30 && qqVar.D.send_polls != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743699, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z31 = tL_chatBannedRights.embed_links;
                            if (z31 && !tL_chatBannedRights.send_plain && qqVar.D.embed_links != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743708, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z32 = tL_chatBannedRights.invite_users;
                            if (z32 && qqVar.D.invite_users != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743707, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z33 = tL_chatBannedRights.pin_messages;
                            if (z33 && qqVar.D.pin_messages != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743706, null));
                            }
                            boolean z34 = tL_chatBannedRights.edit_rank;
                            if (z34 && qqVar.D.edit_rank != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743709, null));
                            }
                            boolean z35 = tL_chatBannedRights.send_reactions;
                            if (z35 && qqVar.D.send_reactions != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743698, null));
                            }
                            boolean z36 = tL_chatBannedRights.change_info;
                            if (z36 && qqVar.D.change_info != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743710, null));
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
                if (i7 != qqVar.x0) {
                    if (i7 != qqVar.a1) {
                        if (i7 != qqVar.O0) {
                            if (i7 != qqVar.n0) {
                                if (i7 != qqVar.q0) {
                                    if (i7 != qqVar.J0) {
                                        if (i7 != qqVar.L0) {
                                            if (i7 != qqVar.t0) {
                                                if (i7 != qqVar.Q0) {
                                                    if (i7 == qqVar.i1) {
                                                        z8Var.setText(org.telegram.messenger.id.M0(qqVar.u1 ? 2131752292 : 2131752296, null));
                                                        break;
                                                    }
                                                } else if (!qqVar.q1) {
                                                    z8Var.setText(org.telegram.messenger.id.M0(2131749408, null));
                                                    break;
                                                } else {
                                                    z8Var.setText(org.telegram.messenger.id.M0(2131749407, null));
                                                    break;
                                                }
                                            } else {
                                                z8Var.setText(org.telegram.messenger.id.M0(2131752882, null));
                                                break;
                                            }
                                        } else {
                                            z8Var.setText(org.telegram.messenger.id.M0(2131752378, null));
                                            break;
                                        }
                                    } else {
                                        z8Var.setText(org.telegram.messenger.id.M0(2131752404, null));
                                        break;
                                    }
                                } else {
                                    z8Var.setText(org.telegram.messenger.id.a0(null, null, 2131749423, hi.j.J0(qqVar.getMessagesController().J6), String.valueOf(((int) (((qqVar.z1 * (qqVar.getMessagesController().J6 / 1000.0f)) / 1000.0d) * qqVar.getMessagesController().c6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                z8Var.setText(org.telegram.messenger.id.M0(2131749425, null));
                                break;
                            }
                        } else {
                            int r02 = qq.r0(qqVar.o1);
                            if (qqVar.r != null && r02 != 0) {
                                z8Var.setText(org.telegram.messenger.id.a0(null, null, 2131745307, r02 < 60 ? org.telegram.messenger.id.G(r02, "Seconds", new Object[0]) : r02 < 3600 ? org.telegram.messenger.id.G(r02 / 60, "Minutes", new Object[0]) : org.telegram.messenger.id.G((r02 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                z8Var.setText(org.telegram.messenger.id.M0(2131745308, null));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z16 || qqVar.d1 != 0) {
                                    z8Var.setText("");
                                    break;
                                } else {
                                    z8Var.setText(org.telegram.messenger.id.M0(2131752376, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (qqVar.y0 == -1) {
                            z8Var.setText("");
                            break;
                        } else if (!z16) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131748645, "MegaAdminsInfo"));
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.id.M0(2131752515, "ChannelAdminsInfo"));
                            break;
                        }
                    } else if (!z16) {
                        if (!z15) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131748236, null));
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.id.M0(2131748237, null));
                            break;
                        }
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131748238, null));
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131752462, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.l6.m6, org.telegram.ui.ActionBar.l6.G6);
                if (i7 != qqVar.y0) {
                    if (i7 != qqVar.u0) {
                        if (i7 != qqVar.z0) {
                            if (i7 == qqVar.s0) {
                                x4Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                                x4Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.id.M0(2131752883, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                            if ((!qqVar.P || qqVar.Q) && qqVar.Y0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            x4Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.id.M0(2131752402, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_log, 5, org.telegram.messenger.id.M0(2131751079, null), qqVar.w0 > qqVar.u0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                                if (qqVar.z0 != -1 || ((!qqVar.P || qqVar.Q) && qqVar.Y0 == -1 && !arrayList.isEmpty())) {
                                    r15 = true;
                                }
                                if (!z16) {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.id.M0(2131754401, null), r15);
                                    break;
                                } else {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.id.M0(2131754383, null), r15);
                                    break;
                                }
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                            x4Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.id.M0(2131752528, "ChannelAddAdmin"), !qqVar.P || qqVar.Q);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.id.M0(2131752452, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.id.M0(2131752527, "ChannelAddException"), qqVar.D0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != qqVar.C0) {
                    if (i7 != qqVar.R) {
                        if (i7 != qqVar.M0) {
                            if (i7 != qqVar.r0) {
                                if (i7 == qqVar.o0) {
                                    n4Var.setText(org.telegram.messenger.id.M0(2131749424, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.id.M0(2131752884, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.id.M0(2131745310, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.id.M0(z15 ? 2131751885 : 2131752332, null));
                        break;
                    }
                } else if (i14 != 0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131752308, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = qqVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131752451, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.id.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String M03 = org.telegram.messenger.id.M0(2131752453, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = qqVar.r;
                w9Var.c(M03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = q8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.l6.r7;
                int i19 = org.telegram.ui.ActionBar.l6.V6;
                int i20 = org.telegram.ui.ActionBar.l6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z37 = q8Var.getTag() != null && ((Integer) q8Var.getTag()).intValue() == i7;
                q8Var.setTag(Integer.valueOf(i7));
                if (i7 == qqVar.f0) {
                    q8Var.d(org.telegram.messenger.id.M0(z15 ? 2131751967 : 2131743716, null), (qqVar.D.change_info || org.telegram.messenger.t3.t0(qqVar.n)) ? false : true, qqVar.k0 != -1, z37);
                } else if (i7 == qqVar.l0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131751966, null), !qqVar.D.manage_linked_peers, false, z37);
                } else if (i7 == qqVar.g0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743711, "UserRestrictionsInviteUsers"), !qqVar.D.invite_users, true, z37);
                } else if (i7 == qqVar.h0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743692, null), (qqVar.D.pin_messages || org.telegram.messenger.t3.t0(qqVar.n)) ? false : true, true, z37);
                } else if (i7 == qqVar.i0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743713, null), !qqVar.D.edit_rank, true, z37);
                } else if (i7 == qqVar.S) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743685, "UserRestrictionsSendText"), !qqVar.D.send_plain, true, z37);
                } else if (i7 == qqVar.P0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131749409, null), qqVar.q1, false, z37);
                    q8Var.getCheckBox().setDrawIconType(0);
                    q8Var.getCheckBox().d(org.telegram.ui.ActionBar.l6.M6, org.telegram.ui.ActionBar.l6.N6, i20, i20);
                } else if (i7 == qqVar.T) {
                    int s02 = qq.s0(qqVar.D);
                    q8Var.d(org.telegram.messenger.id.M0(2131743690, "UserRestrictionsSendMedia"), s02 > 0, true, z37);
                    Locale locale = Locale.US;
                    q8Var.a(new m9.u(this, q8Var, false, 29), com.google.android.recaptcha.internal.a.i(s02, "/10"), !qqVar.k1);
                } else if (i7 == qqVar.d0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743686, "UserRestrictionsSendStickers"), !qqVar.D.send_stickers, true, z37);
                } else if (i7 == qqVar.e0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743712, "UserRestrictionsEmbedLinks"), !qqVar.D.embed_links, true, z37);
                } else if (i7 == qqVar.c0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743688, "UserRestrictionsSendPollsShort"), !qqVar.D.send_polls, true, false);
                } else if (i7 == qqVar.k0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131751700, "CreateTopicsPermission"), !qqVar.D.manage_topics, false, z37);
                }
                if (i7 == qqVar.h0 || i7 == qqVar.f0) {
                    i13 = ((org.telegram.ui.ActionBar.f2) qqVar).currentAccount;
                    if (org.telegram.messenger.t3.Z(i13, qqVar.M)) {
                        q8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.t3.w(2, qqVar.n)) {
                    q8Var.setIcon(0);
                    break;
                } else if ((i7 == qqVar.g0 && !org.telegram.messenger.t3.y(3, qqVar.n)) || ((i7 == qqVar.h0 && !org.telegram.messenger.t3.y(0, qqVar.n)) || ((i7 == qqVar.f0 && !org.telegram.messenger.t3.y(1, qqVar.n)) || ((i7 == qqVar.k0 && !org.telegram.messenger.t3.y(15, qqVar.n)) || (org.telegram.messenger.t3.t0(qqVar.n) && (i7 == qqVar.h0 || i7 == qqVar.f0)))))) {
                    q8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    q8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                if (i7 != qqVar.Y0) {
                    if (i7 != qqVar.V0) {
                        if (i7 != qqVar.S0) {
                            if (i7 == qqVar.f1) {
                                x3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.t3.T(qqVar.n) && !qqVar.n.megagroup) {
                            x3Var.setText(org.telegram.messenger.id.M0(2131752424, "ChannelContacts"));
                            break;
                        } else {
                            x3Var.setText(org.telegram.messenger.id.M0(2131749456, "GroupContacts"));
                            break;
                        }
                    } else {
                        x3Var.setText(org.telegram.messenger.id.M0(2131752448, "ChannelBots"));
                        break;
                    }
                } else if (org.telegram.messenger.t3.T(qqVar.n) && !qqVar.n.megagroup) {
                    x3Var.setText(org.telegram.messenger.id.M0(2131752334, "ChannelOtherSubscribers"));
                    break;
                } else {
                    x3Var.setText(org.telegram.messenger.id.M0(2131752336, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.mz mzVar = (org.telegram.ui.Components.mz) view;
                if (i14 != 0) {
                    mzVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = qqVar.r;
                    mzVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (i7 != qqVar.w0) {
                    if (i7 != qqVar.I0) {
                        if (i7 == qqVar.K0) {
                            m8Var.getCheckBox().setIcon(0);
                            String M04 = org.telegram.messenger.id.M0(2131752379, null);
                            TLRPC.Chat chat = qqVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z17 = false;
                            }
                            m8Var.l(M04, z17, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = m8Var.getCheckBox();
                        if (org.telegram.messenger.t3.y(2, qqVar.n) && ((chatFull = qqVar.r) == null || chatFull.participants_hidden || qqVar.q0() >= qqVar.getMessagesController().g5)) {
                            i16 = 0;
                        }
                        checkBox2.setIcon(i16);
                        String M05 = org.telegram.messenger.id.M0(2131752405, null);
                        TLRPC.ChatFull chatFull6 = qqVar.r;
                        m8Var.l(M05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = m8Var.getCheckBox();
                    if (org.telegram.messenger.t3.y(13, qqVar.n) && ((chatFull2 = qqVar.r) == null || chatFull2.antispam || qqVar.q0() >= qqVar.getMessagesController().f5)) {
                        i16 = 0;
                    }
                    checkBox3.setIcon(i16);
                    String M06 = org.telegram.messenger.id.M0(2131752467, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = qqVar.r;
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
                if (i7 != qqVar.U) {
                    if (i7 != qqVar.V) {
                        if (i7 != qqVar.W) {
                            if (i7 != qqVar.X) {
                                if (i7 != qqVar.Y) {
                                    if (i7 != qqVar.Z) {
                                        if (i7 != qqVar.a0) {
                                            if (i7 != qqVar.b0) {
                                                if (i7 != qqVar.j0) {
                                                    if (i7 != qqVar.c0) {
                                                        c2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.id.M0(2131745602, "SendMediaPolls"), "", !qqVar.D.send_polls, true, z38);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.id.M0(2131743687, null), "", !qqVar.D.send_reactions, false, z38);
                                                    break;
                                                }
                                            } else {
                                                String M07 = org.telegram.messenger.id.M0(2131745610, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = qqVar.D;
                                                c2Var.e(M07, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z38);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.id.M0(2131745606, "SendMediaPermissionRound"), "", !qqVar.D.send_roundvideos, true, z38);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.id.M0(2131745603, "SendMediaPermissionVoice"), "", !qqVar.D.send_voices, true, z38);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.id.M0(2131745609, "SendMediaPermissionFiles"), "", !qqVar.D.send_docs, true, z38);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.id.M0(2131745608, "SendMediaPermissionMusic"), "", !qqVar.D.send_audios, true, z38);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.id.M0(2131745605, "SendMediaPermissionStickersGifs"), "", !qqVar.D.send_stickers, true, z38);
                            break;
                        }
                    } else {
                        c2Var.e(org.telegram.messenger.id.M0(2131745604, "SendMediaPermissionVideos"), "", !qqVar.D.send_videos, true, z38);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.id.M0(2131745607, "SendMediaPermissionPhotos"), "", !qqVar.D.send_photos, true, z38);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 != qqVar.g1) {
                    if (i7 != qqVar.h1) {
                        if (i7 == qqVar.m0) {
                            r8Var.f(org.telegram.messenger.id.M0(2131749426, null), qqVar.x1, false);
                            break;
                        }
                    } else {
                        r8Var.f(org.telegram.messenger.id.M0(2131752293, null), qqVar.v1, false);
                        break;
                    }
                } else {
                    String M08 = org.telegram.messenger.id.M0(2131752295, null);
                    boolean z39 = qqVar.u1;
                    r8Var.f(M08, z39, z39);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                if (i7 == qqVar.p0) {
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) qqVar.getMessagesController().I6);
                    int k10 = (int) Utilities.k(qqVar.z1, qqVar.getMessagesController().I6, 1L);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        View view;
        View view2;
        int i10 = 1;
        Context context = this.c;
        qq qqVar = this.d;
        switch (i7) {
            case 0:
                int i11 = qqVar.N;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, (i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, qqVar.d1 == 0, null);
                a5Var.setDelegate(new lq(this, r8));
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
                if (!qqVar.s) {
                    if (!qqVar.w) {
                        z8Var.setText(org.telegram.messenger.id.M0(2131748236, null));
                        view = z8Var;
                        break;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131748237, null));
                        view = z8Var;
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748238, null));
                    view = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.l6.L6, 21, 11, false, null);
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
                g6Var = ((org.telegram.ui.ActionBar.f2) qqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, g6Var);
                x3Var.setBackground(null);
                view = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.xt0 xt0Var = new org.telegram.ui.Components.xt0(context, null);
                xt0Var.b(qqVar.o1, null, org.telegram.messenger.id.M0(2131745305, "SlowmodeOff"), org.telegram.messenger.id.a0(null, null, 2131745304, 5), org.telegram.messenger.id.a0(null, null, 2131745304, 10), org.telegram.messenger.id.a0(null, null, 2131745304, 30), org.telegram.messenger.id.a0(null, null, 2131745306, 1), org.telegram.messenger.id.a0(null, null, 2131745306, 5), org.telegram.messenger.id.a0(null, null, 2131745306, 15), org.telegram.messenger.id.a0(null, null, 2131745309, 1));
                xt0Var.setCallback(new lq(this, i10));
                view = xt0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(6);
                mzVar.x = false;
                mzVar.setUseHeaderOffset(false);
                mzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.o0 o0Var = new v4.o0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                mzVar.setLayoutParams(o0Var);
                view = mzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.c, qqVar.getResourceProvider(), false, true);
                m8Var.w = 50;
                view = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, qqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.l6.V6, org.telegram.ui.ActionBar.l6.g7, org.telegram.ui.ActionBar.l6.k7);
                c2Var.setEnabled(true);
                view = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.xt0 xt0Var2 = new org.telegram.ui.Components.xt0(context, null);
                Drawable[] drawableArr = {qqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = qqVar.r1;
                xt0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                xt0Var2.setCallback(new lq(this, r5));
                view2 = xt0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.r8(context, qqVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.t7(context, qqVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.yi0(view);
    }
}
