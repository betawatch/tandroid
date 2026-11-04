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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iq extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ nq d;

    public iq(nq nqVar, Context context) {
        this.d = nqVar;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r7 == r4.L0) goto L41;
     */
    @Override // org.telegram.ui.Components.sj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 != 16) {
            nq nqVar = this.d;
            if (i3 == 7 || i3 == 14) {
                return org.telegram.messenger.t3.w(2, nqVar.n);
            }
            if (i3 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject();
                if (nqVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = d1Var.b();
                if (i3 != 0 && i3 != 2 && i3 != 6) {
                    if (i3 == 12) {
                        if (b10 == nqVar.x0) {
                            return org.telegram.messenger.t3.y(13, nqVar.n);
                        }
                        if (b10 == nqVar.J0) {
                            return org.telegram.messenger.t3.y(2, nqVar.n);
                        }
                    }
                    if (i3 != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i3) {
        nq nqVar = this.d;
        int i10 = nqVar.E0;
        if (i3 >= i10 && i3 < nqVar.F0) {
            return (TLObject) nqVar.F.get(i3 - i10);
        }
        int i11 = nqVar.U0;
        if (i3 >= i11 && i3 < nqVar.V0) {
            return (TLObject) nqVar.H.get(i3 - i11);
        }
        int i12 = nqVar.X0;
        if (i3 < i12 || i3 >= nqVar.Y0) {
            return null;
        }
        return (TLObject) nqVar.G.get(i3 - i12);
    }

    @Override // u4.h0
    public final int b() {
        return this.d.d1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        nq nqVar = this.d;
        if (i3 == nqVar.z0 || i3 == nqVar.A0 || i3 == nqVar.v0 || i3 == nqVar.t0) {
            return 2;
        }
        if ((i3 >= nqVar.E0 && i3 < nqVar.F0) || ((i3 >= nqVar.X0 && i3 < nqVar.Y0) || (i3 >= nqVar.U0 && i3 < nqVar.V0))) {
            return 0;
        }
        if (i3 == nqVar.C0 || i3 == nqVar.G0 || i3 == nqVar.H0) {
            return 3;
        }
        if (i3 == nqVar.D0 || i3 == nqVar.S || i3 == nqVar.N0 || i3 == nqVar.s0 || i3 == nqVar.p0) {
            return 5;
        }
        if (i3 == nqVar.b1 || i3 == nqVar.P0 || i3 == nqVar.R0 || i3 == nqVar.u0 || i3 == nqVar.y0 || i3 == nqVar.K0 || i3 == nqVar.M0 || i3 == nqVar.j1 || i3 == nqVar.o0 || i3 == nqVar.r0) {
            return 1;
        }
        if (i3 == nqVar.c1) {
            return 4;
        }
        if (i3 == nqVar.B0) {
            return 6;
        }
        if (i3 == nqVar.g0 || i3 == nqVar.h0 || i3 == nqVar.m0 || i3 == nqVar.i0 || i3 == nqVar.j0 || i3 == nqVar.T || i3 == nqVar.e0 || i3 == nqVar.f0 || i3 == nqVar.l0 || i3 == nqVar.Q0) {
            return 7;
        }
        if (i3 == nqVar.Z0 || i3 == nqVar.T0 || i3 == nqVar.W0 || i3 == nqVar.g1) {
            return 8;
        }
        if (i3 == nqVar.O0) {
            return 9;
        }
        if (i3 == nqVar.a1) {
            return 10;
        }
        if (i3 == nqVar.f1) {
            return 11;
        }
        if (i3 == nqVar.x0 || i3 == nqVar.J0 || i3 == nqVar.L0) {
            return 12;
        }
        if (nqVar.u0(i3)) {
            return 13;
        }
        if (i3 == nqVar.U) {
            return 14;
        }
        if (i3 == nqVar.S0) {
            return 15;
        }
        if (i3 == nqVar.h1 || i3 == nqVar.i1 || i3 == nqVar.n0) {
            return 16;
        }
        return i3 == nqVar.q0 ? 17 : 0;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        Object[] objArr;
        long j10;
        CharSequence charSequence;
        int i11;
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        long j13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z12;
        boolean z13;
        int i12;
        Object[] objArr2;
        TLObject M0;
        boolean z14;
        CharSequence charSequence2;
        TLRPC.User a22;
        CharSequence M02;
        boolean z15;
        CharSequence charSequence3;
        CharSequence charSequence4;
        TLRPC.User a23;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        nq nqVar = this.d;
        ArrayList arrayList = nqVar.F;
        boolean z16 = nqVar.w;
        boolean z17 = nqVar.s;
        int i14 = nqVar.O;
        int i15 = d1Var.f;
        View view = d1Var.a;
        int i16 = R.drawable.permission_locked;
        r10 = true;
        r10 = true;
        boolean z18 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                a5Var.setTag(Integer.valueOf(i3));
                TLObject E = E(i3);
                if (i3 < nqVar.E0 || i3 >= (i10 = nqVar.F0)) {
                    if (i3 >= nqVar.U0 && i3 < (i10 = nqVar.V0)) {
                        if (org.telegram.messenger.t3.T(nqVar.n)) {
                            break;
                        }
                    } else {
                        i10 = nqVar.Y0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.t3.T(nqVar.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j10 = 0;
                    long j14 = ((TLRPC.User) E).id;
                    tL_chatBannedRights = null;
                    i11 = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    j11 = j14;
                    j13 = 0;
                    charSequence = "";
                    j12 = 0;
                } else {
                    j10 = 0;
                    if (E instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        long C1 = org.telegram.messenger.zi.C1(channelParticipant.peer);
                        j13 = channelParticipant.kicked_by;
                        charSequence = "";
                        j12 = channelParticipant.promoted_by;
                        tL_chatBannedRights = channelParticipant.banned_rights;
                        int i17 = channelParticipant.date;
                        boolean z19 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        boolean z20 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z10 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z11 = z20;
                        z12 = z19;
                        i11 = i17;
                        j11 = C1;
                    } else {
                        charSequence = "";
                        if (E instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                            long j15 = chatParticipant.user_id;
                            i11 = chatParticipant.date;
                            boolean z21 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z10 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            j11 = j15;
                            z11 = z21;
                            j12 = 0;
                            j13 = 0;
                            tL_chatBannedRights = null;
                            z12 = false;
                        }
                    }
                }
                if (j11 > j10) {
                    z13 = z10;
                    i12 = i10;
                    M0 = nqVar.getMessagesController().a2(Long.valueOf(j11));
                    objArr2 = objArr;
                } else {
                    z13 = z10;
                    i12 = i10;
                    objArr2 = objArr;
                    M0 = nqVar.getMessagesController().M0(Long.valueOf(-j11));
                }
                if (M0 != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    a5Var.c(M0, null, (!objArr2 == true || i11 == 0) ? null : org.telegram.messenger.bd.B(i11), i3 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z11) {
                                    if (!z13 || (a22 = nqVar.getMessagesController().a2(Long.valueOf(j12))) == null) {
                                        z14 = false;
                                        charSequence2 = null;
                                    } else if (a22.id == j11) {
                                        M02 = org.telegram.messenger.bd.M0(2131752518, null);
                                    } else {
                                        z14 = false;
                                        charSequence2 = org.telegram.messenger.bd.a0(null, null, 2131751309, org.telegram.messenger.l10.p(a22));
                                    }
                                    a5Var.c(M0, null, charSequence2, i3 == i12 + (-1) ? true : z14);
                                    break;
                                } else {
                                    M02 = org.telegram.messenger.bd.M0(2131752423, null);
                                }
                                charSequence2 = M02;
                                z14 = false;
                                a5Var.c(M0, null, charSequence2, i3 == i12 + (-1) ? true : z14);
                            }
                        } else {
                            if (!z12 || (a23 = nqVar.getMessagesController().a2(Long.valueOf(j13))) == null) {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = null;
                            } else {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = org.telegram.messenger.bd.a0(null, null, 2131743742, org.telegram.messenger.l10.p(a23));
                            }
                            a5Var.c(M0, charSequence3, charSequence4, i3 != i12 + (-1) ? z15 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z22 = tL_chatBannedRights.view_messages;
                            if (z22 && nqVar.E.view_messages != z22) {
                                sb3.append(org.telegram.messenger.bd.M0(2131743715, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && nqVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743705, "UserRestrictionsNoSendText"));
                            }
                            boolean z23 = tL_chatBannedRights.send_media;
                            if (!z23 || nqVar.E.send_media == z23) {
                                boolean z24 = tL_chatBannedRights.send_photos;
                                if (z24 && nqVar.E.send_photos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743710, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_videos;
                                if (z25 && nqVar.E.send_videos != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743704, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z26 = tL_chatBannedRights.send_audios;
                                if (z26 && nqVar.E.send_audios != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743711, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z27 = tL_chatBannedRights.send_docs;
                                if (z27 && nqVar.E.send_docs != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743713, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z28 = tL_chatBannedRights.send_voices;
                                if (z28 && nqVar.E.send_voices != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743703, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z29 = tL_chatBannedRights.send_roundvideos;
                                if (z29 && nqVar.E.send_roundvideos != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.bd.M0(2131743707, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743712, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z30 = tL_chatBannedRights.send_stickers;
                            if (z30 && nqVar.E.send_stickers != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743706, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z31 = tL_chatBannedRights.send_polls;
                            if (z31 && nqVar.E.send_polls != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743709, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z32 = tL_chatBannedRights.embed_links;
                            if (z32 && !tL_chatBannedRights.send_plain && nqVar.E.embed_links != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743718, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z33 = tL_chatBannedRights.invite_users;
                            if (z33 && nqVar.E.invite_users != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743717, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z34 = tL_chatBannedRights.pin_messages;
                            if (z34 && nqVar.E.pin_messages != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743716, null));
                            }
                            boolean z35 = tL_chatBannedRights.edit_rank;
                            if (z35 && nqVar.E.edit_rank != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743719, null));
                            }
                            boolean z36 = tL_chatBannedRights.send_reactions;
                            if (z36 && nqVar.E.send_reactions != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743708, null));
                            }
                            boolean z37 = tL_chatBannedRights.change_info;
                            if (z37 && nqVar.E.change_info != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.bd.M0(2131743720, null));
                            }
                            if (sb3.length() != 0) {
                                sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                sb3.append('.');
                            }
                            sb2 = sb3.toString();
                        }
                        a5Var.c(M0, null, sb2, i3 != i12 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 != nqVar.y0) {
                    if (i3 != nqVar.b1) {
                        if (i3 != nqVar.P0) {
                            if (i3 != nqVar.o0) {
                                if (i3 != nqVar.r0) {
                                    if (i3 != nqVar.K0) {
                                        if (i3 != nqVar.M0) {
                                            if (i3 != nqVar.u0) {
                                                if (i3 != nqVar.R0) {
                                                    if (i3 == nqVar.j1) {
                                                        y8Var.setText(org.telegram.messenger.bd.M0(nqVar.v1 ? 2131752292 : 2131752296, null));
                                                        break;
                                                    }
                                                } else if (!nqVar.r1) {
                                                    y8Var.setText(org.telegram.messenger.bd.M0(2131749416, null));
                                                    break;
                                                } else {
                                                    y8Var.setText(org.telegram.messenger.bd.M0(2131749415, null));
                                                    break;
                                                }
                                            } else {
                                                y8Var.setText(org.telegram.messenger.bd.M0(2131752882, null));
                                                break;
                                            }
                                        } else {
                                            y8Var.setText(org.telegram.messenger.bd.M0(2131752378, null));
                                            break;
                                        }
                                    } else {
                                        y8Var.setText(org.telegram.messenger.bd.M0(2131752404, null));
                                        break;
                                    }
                                } else {
                                    y8Var.setText(org.telegram.messenger.bd.a0(null, null, 2131749431, ii.k.J0(nqVar.getMessagesController().J6), String.valueOf(((int) (((nqVar.A1 * (nqVar.getMessagesController().J6 / 1000.0f)) / 1000.0d) * nqVar.getMessagesController().c6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                y8Var.setText(org.telegram.messenger.bd.M0(2131749433, null));
                                break;
                            }
                        } else {
                            int r02 = nq.r0(nqVar.p1);
                            if (nqVar.r != null && r02 != 0) {
                                y8Var.setText(org.telegram.messenger.bd.a0(null, null, 2131745317, r02 < 60 ? org.telegram.messenger.bd.G(r02, "Seconds", new Object[0]) : r02 < 3600 ? org.telegram.messenger.bd.G(r02 / 60, "Minutes", new Object[0]) : org.telegram.messenger.bd.G((r02 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                y8Var.setText(org.telegram.messenger.bd.M0(2131745318, null));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || nqVar.e1 != 0) {
                                    y8Var.setText("");
                                    break;
                                } else {
                                    y8Var.setText(org.telegram.messenger.bd.M0(2131752376, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (nqVar.z0 == -1) {
                            y8Var.setText("");
                            break;
                        } else if (!z17) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131748653, "MegaAdminsInfo"));
                            break;
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131752515, "ChannelAdminsInfo"));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131748244, null));
                            break;
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131748245, null));
                            break;
                        }
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131748246, null));
                        break;
                    }
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131752462, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                if (i3 != nqVar.z0) {
                    if (i3 != nqVar.v0) {
                        if (i3 != nqVar.A0) {
                            if (i3 == nqVar.t0) {
                                x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                x4Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.bd.M0(2131752883, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            if ((!nqVar.Q || nqVar.R) && nqVar.Z0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            x4Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.bd.M0(2131752402, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_log, 5, org.telegram.messenger.bd.M0(2131751080, null), nqVar.x0 > nqVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                if (nqVar.A0 != -1 || ((!nqVar.Q || nqVar.R) && nqVar.Z0 == -1 && !arrayList.isEmpty())) {
                                    r15 = true;
                                }
                                if (!z17) {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.bd.M0(2131754401, null), r15);
                                    break;
                                } else {
                                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.bd.M0(2131754383, null), r15);
                                    break;
                                }
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            x4Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.bd.M0(2131752528, "ChannelAddAdmin"), !nqVar.Q || nqVar.R);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.bd.M0(2131752452, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.bd.M0(2131752527, "ChannelAddException"), nqVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 != nqVar.D0) {
                    if (i3 != nqVar.S) {
                        if (i3 != nqVar.N0) {
                            if (i3 != nqVar.s0) {
                                if (i3 == nqVar.p0) {
                                    n4Var.setText(org.telegram.messenger.bd.M0(2131749432, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.bd.M0(2131752884, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131745320, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(z16 ? 2131751885 : 2131752332, null));
                        break;
                    }
                } else if (i14 != 0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131752308, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = nqVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131752451, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                String M03 = org.telegram.messenger.bd.M0(2131752453, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = nqVar.r;
                v9Var.c(M03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = p8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.k6.r7;
                int i19 = org.telegram.ui.ActionBar.k6.V6;
                int i20 = org.telegram.ui.ActionBar.k6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z38 = p8Var.getTag() != null && ((Integer) p8Var.getTag()).intValue() == i3;
                p8Var.setTag(Integer.valueOf(i3));
                if (i3 == nqVar.g0) {
                    p8Var.d(org.telegram.messenger.bd.M0(z16 ? 2131751967 : 2131743726, null), (nqVar.E.change_info || org.telegram.messenger.t3.t0(nqVar.n)) ? false : true, nqVar.l0 != -1, z38);
                } else if (i3 == nqVar.m0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131751966, null), !nqVar.E.manage_linked_peers, false, z38);
                } else if (i3 == nqVar.h0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743721, "UserRestrictionsInviteUsers"), !nqVar.E.invite_users, true, z38);
                } else if (i3 == nqVar.i0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743702, null), (nqVar.E.pin_messages || org.telegram.messenger.t3.t0(nqVar.n)) ? false : true, true, z38);
                } else if (i3 == nqVar.j0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743723, null), !nqVar.E.edit_rank, true, z38);
                } else if (i3 == nqVar.T) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743695, "UserRestrictionsSendText"), !nqVar.E.send_plain, true, z38);
                } else if (i3 == nqVar.Q0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131749417, null), nqVar.r1, false, z38);
                    p8Var.getCheckBox().setDrawIconType(0);
                    p8Var.getCheckBox().d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, i20, i20);
                } else if (i3 == nqVar.U) {
                    int s02 = nq.s0(nqVar.E);
                    p8Var.d(org.telegram.messenger.bd.M0(2131743700, "UserRestrictionsSendMedia"), s02 > 0, true, z38);
                    Locale locale = Locale.US;
                    p8Var.a(new l9.u(this, p8Var, false, 27), com.google.android.recaptcha.internal.a.h(s02, "/10"), !nqVar.l1);
                } else if (i3 == nqVar.e0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743696, "UserRestrictionsSendStickers"), !nqVar.E.send_stickers, true, z38);
                } else if (i3 == nqVar.f0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743722, "UserRestrictionsEmbedLinks"), !nqVar.E.embed_links, true, z38);
                } else if (i3 == nqVar.d0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131743698, "UserRestrictionsSendPollsShort"), !nqVar.E.send_polls, true, false);
                } else if (i3 == nqVar.l0) {
                    p8Var.d(org.telegram.messenger.bd.M0(2131751701, "CreateTopicsPermission"), !nqVar.E.manage_topics, false, z38);
                }
                if (i3 == nqVar.i0 || i3 == nqVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.d2) nqVar).currentAccount;
                    if (org.telegram.messenger.t3.Z(i13, nqVar.N)) {
                        p8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.t3.w(2, nqVar.n)) {
                    p8Var.setIcon(0);
                    break;
                } else if ((i3 == nqVar.h0 && !org.telegram.messenger.t3.y(3, nqVar.n)) || ((i3 == nqVar.i0 && !org.telegram.messenger.t3.y(0, nqVar.n)) || ((i3 == nqVar.g0 && !org.telegram.messenger.t3.y(1, nqVar.n)) || ((i3 == nqVar.l0 && !org.telegram.messenger.t3.y(15, nqVar.n)) || (org.telegram.messenger.t3.t0(nqVar.n) && (i3 == nqVar.i0 || i3 == nqVar.g0)))))) {
                    p8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    p8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                if (i3 != nqVar.Z0) {
                    if (i3 != nqVar.W0) {
                        if (i3 != nqVar.T0) {
                            if (i3 == nqVar.g1) {
                                x3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.t3.T(nqVar.n) && !nqVar.n.megagroup) {
                            x3Var.setText(org.telegram.messenger.bd.M0(2131752424, "ChannelContacts"));
                            break;
                        } else {
                            x3Var.setText(org.telegram.messenger.bd.M0(2131749464, "GroupContacts"));
                            break;
                        }
                    } else {
                        x3Var.setText(org.telegram.messenger.bd.M0(2131752448, "ChannelBots"));
                        break;
                    }
                } else if (org.telegram.messenger.t3.T(nqVar.n) && !nqVar.n.megagroup) {
                    x3Var.setText(org.telegram.messenger.bd.M0(2131752334, "ChannelOtherSubscribers"));
                    break;
                } else {
                    x3Var.setText(org.telegram.messenger.bd.M0(2131752336, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.iz izVar = (org.telegram.ui.Components.iz) view;
                if (i14 != 0) {
                    izVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = nqVar.r;
                    izVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (i3 != nqVar.x0) {
                    if (i3 != nqVar.J0) {
                        if (i3 == nqVar.L0) {
                            l8Var.getCheckBox().setIcon(0);
                            String M04 = org.telegram.messenger.bd.M0(2131752379, null);
                            TLRPC.Chat chat = nqVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z18 = false;
                            }
                            l8Var.l(M04, z18, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = l8Var.getCheckBox();
                        if (org.telegram.messenger.t3.y(2, nqVar.n) && ((chatFull = nqVar.r) == null || chatFull.participants_hidden || nqVar.q0() >= nqVar.getMessagesController().g5)) {
                            i16 = 0;
                        }
                        checkBox2.setIcon(i16);
                        String M05 = org.telegram.messenger.bd.M0(2131752405, null);
                        TLRPC.ChatFull chatFull6 = nqVar.r;
                        l8Var.l(M05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = l8Var.getCheckBox();
                    if (org.telegram.messenger.t3.y(13, nqVar.n) && ((chatFull2 = nqVar.r) == null || chatFull2.antispam || nqVar.q0() >= nqVar.getMessagesController().f5)) {
                        i16 = 0;
                    }
                    checkBox3.setIcon(i16);
                    String M06 = org.telegram.messenger.bd.M0(2131752467, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = nqVar.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r15 = true;
                    }
                    l8Var.n(R.drawable.msg_policy, M06, r15);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z39 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i3;
                c2Var.setTag(Integer.valueOf(i3));
                if (i3 != nqVar.V) {
                    if (i3 != nqVar.W) {
                        if (i3 != nqVar.X) {
                            if (i3 != nqVar.Y) {
                                if (i3 != nqVar.Z) {
                                    if (i3 != nqVar.a0) {
                                        if (i3 != nqVar.b0) {
                                            if (i3 != nqVar.c0) {
                                                if (i3 != nqVar.k0) {
                                                    if (i3 != nqVar.d0) {
                                                        c2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.bd.M0(2131745612, "SendMediaPolls"), "", !nqVar.E.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.bd.M0(2131743697, null), "", !nqVar.E.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String M07 = org.telegram.messenger.bd.M0(2131745620, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = nqVar.E;
                                                c2Var.e(M07, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.bd.M0(2131745616, "SendMediaPermissionRound"), "", !nqVar.E.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.bd.M0(2131745613, "SendMediaPermissionVoice"), "", !nqVar.E.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.bd.M0(2131745619, "SendMediaPermissionFiles"), "", !nqVar.E.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.bd.M0(2131745618, "SendMediaPermissionMusic"), "", !nqVar.E.send_audios, true, z39);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.bd.M0(2131745615, "SendMediaPermissionStickersGifs"), "", !nqVar.E.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        c2Var.e(org.telegram.messenger.bd.M0(2131745614, "SendMediaPermissionVideos"), "", !nqVar.E.send_videos, true, z39);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.bd.M0(2131745617, "SendMediaPermissionPhotos"), "", !nqVar.E.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i3 != nqVar.h1) {
                    if (i3 != nqVar.i1) {
                        if (i3 == nqVar.n0) {
                            q8Var.f(org.telegram.messenger.bd.M0(2131749434, null), nqVar.y1, false);
                            break;
                        }
                    } else {
                        q8Var.f(org.telegram.messenger.bd.M0(2131752293, null), nqVar.w1, false);
                        break;
                    }
                } else {
                    String M08 = org.telegram.messenger.bd.M0(2131752295, null);
                    boolean z40 = nqVar.v1;
                    q8Var.f(M08, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                if (i3 == nqVar.q0) {
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.hs.e3, org.telegram.messenger.hs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) nqVar.getMessagesController().I6);
                    int k10 = (int) Utilities.k(nqVar.A1, nqVar.getMessagesController().I6, 1L);
                    org.telegram.messenger.go goVar = new org.telegram.messenger.go(21);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.c = a10;
                    r7Var.d = 20;
                    r7Var.e = goVar;
                    s7Var.d(k10, r7Var, new s3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        View view;
        View view2;
        int i10 = 1;
        Context context = this.c;
        nq nqVar = this.d;
        switch (i3) {
            case 0:
                int i11 = nqVar.O;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, (i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, nqVar.e1 == 0, null);
                a5Var.setDelegate(new hq(this, r8));
                view2 = a5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                if (!nqVar.s) {
                    if (!nqVar.w) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131748244, null));
                        view = y8Var;
                        break;
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131748245, null));
                        view = y8Var;
                        break;
                    }
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131748246, null));
                    view = y8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                view2 = n4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.v9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) nqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, e6Var);
                x3Var.setBackground(null);
                view = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context, null);
                ut0Var.b(nqVar.p1, null, org.telegram.messenger.bd.M0(2131745315, "SlowmodeOff"), org.telegram.messenger.bd.a0(null, null, 2131745314, 5), org.telegram.messenger.bd.a0(null, null, 2131745314, 10), org.telegram.messenger.bd.a0(null, null, 2131745314, 30), org.telegram.messenger.bd.a0(null, null, 2131745316, 1), org.telegram.messenger.bd.a0(null, null, 2131745316, 5), org.telegram.messenger.bd.a0(null, null, 2131745316, 15), org.telegram.messenger.bd.a0(null, null, 2131745319, 1));
                ut0Var.setCallback(new hq(this, i10));
                view = ut0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
                izVar.setIsSingleCell(true);
                izVar.setViewType(6);
                izVar.x = false;
                izVar.setUseHeaderOffset(false);
                izVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                u4.p0 p0Var = new u4.p0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                izVar.setLayoutParams(p0Var);
                view = izVar;
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, this.c, nqVar.getResourceProvider(), false, true);
                l8Var.w = 50;
                view = l8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, nqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                c2Var.setEnabled(true);
                view = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context, null);
                Drawable[] drawableArr = {nqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), nqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), nqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), nqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), nqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = nqVar.s1;
                ut0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                ut0Var2.setCallback(new hq(this, r5));
                view2 = ut0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.q8(context, nqVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.s7(context, nqVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
