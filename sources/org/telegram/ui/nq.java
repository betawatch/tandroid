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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nq extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
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
            rq rqVar = this.d;
            if (i7 == 7 || i7 == 14) {
                return org.telegram.messenger.t3.w(2, rqVar.n);
            }
            if (i7 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject();
                if (rqVar.N != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = d1Var.b();
                if (i7 != 0 && i7 != 2 && i7 != 6) {
                    if (i7 == 12) {
                        if (b10 == rqVar.w0) {
                            return org.telegram.messenger.t3.y(13, rqVar.n);
                        }
                        if (b10 == rqVar.I0) {
                            return org.telegram.messenger.t3.y(2, rqVar.n);
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
        rq rqVar = this.d;
        int i10 = rqVar.D0;
        if (i7 >= i10 && i7 < rqVar.E0) {
            return (TLObject) rqVar.E.get(i7 - i10);
        }
        int i11 = rqVar.T0;
        if (i7 >= i11 && i7 < rqVar.U0) {
            return (TLObject) rqVar.G.get(i7 - i11);
        }
        int i12 = rqVar.W0;
        if (i7 < i12 || i7 >= rqVar.X0) {
            return null;
        }
        return (TLObject) rqVar.F.get(i7 - i12);
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 == rqVar.y0 || i7 == rqVar.z0 || i7 == rqVar.u0 || i7 == rqVar.s0) {
            return 2;
        }
        if ((i7 >= rqVar.D0 && i7 < rqVar.E0) || ((i7 >= rqVar.W0 && i7 < rqVar.X0) || (i7 >= rqVar.T0 && i7 < rqVar.U0))) {
            return 0;
        }
        if (i7 == rqVar.B0 || i7 == rqVar.F0 || i7 == rqVar.G0) {
            return 3;
        }
        if (i7 == rqVar.C0 || i7 == rqVar.R || i7 == rqVar.M0 || i7 == rqVar.r0 || i7 == rqVar.o0) {
            return 5;
        }
        if (i7 == rqVar.a1 || i7 == rqVar.O0 || i7 == rqVar.Q0 || i7 == rqVar.t0 || i7 == rqVar.x0 || i7 == rqVar.J0 || i7 == rqVar.L0 || i7 == rqVar.i1 || i7 == rqVar.n0 || i7 == rqVar.q0) {
            return 1;
        }
        if (i7 == rqVar.b1) {
            return 4;
        }
        if (i7 == rqVar.A0) {
            return 6;
        }
        if (i7 == rqVar.f0 || i7 == rqVar.g0 || i7 == rqVar.l0 || i7 == rqVar.h0 || i7 == rqVar.i0 || i7 == rqVar.S || i7 == rqVar.d0 || i7 == rqVar.e0 || i7 == rqVar.k0 || i7 == rqVar.P0) {
            return 7;
        }
        if (i7 == rqVar.Y0 || i7 == rqVar.S0 || i7 == rqVar.V0 || i7 == rqVar.f1) {
            return 8;
        }
        if (i7 == rqVar.N0) {
            return 9;
        }
        if (i7 == rqVar.Z0) {
            return 10;
        }
        if (i7 == rqVar.e1) {
            return 11;
        }
        if (i7 == rqVar.w0 || i7 == rqVar.I0 || i7 == rqVar.K0) {
            return 12;
        }
        if (rqVar.u0(i7)) {
            return 13;
        }
        if (i7 == rqVar.T) {
            return 14;
        }
        if (i7 == rqVar.R0) {
            return 15;
        }
        if (i7 == rqVar.g1 || i7 == rqVar.h1 || i7 == rqVar.m0) {
            return 16;
        }
        return i7 == rqVar.p0 ? 17 : 0;
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
        rq rqVar = this.d;
        ArrayList arrayList = rqVar.E;
        boolean z15 = rqVar.w;
        boolean z16 = rqVar.s;
        int i14 = rqVar.N;
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
                if (i7 < rqVar.D0 || i7 >= (i10 = rqVar.E0)) {
                    if (i7 >= rqVar.T0 && i7 < (i10 = rqVar.U0)) {
                        if (org.telegram.messenger.t3.T(rqVar.n)) {
                            break;
                        }
                    } else {
                        i10 = rqVar.X0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.t3.T(rqVar.n)) {
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
                    M0 = rqVar.getMessagesController().a2(Long.valueOf(j10));
                    objArr2 = objArr;
                } else {
                    z12 = z9;
                    i12 = i10;
                    objArr2 = objArr;
                    M0 = rqVar.getMessagesController().M0(Long.valueOf(-j10));
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
                                    if (!z12 || (a22 = rqVar.getMessagesController().a2(Long.valueOf(j11))) == null) {
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
                            if (!z11 || (a23 = rqVar.getMessagesController().a2(Long.valueOf(j12))) == null) {
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
                            if (z21 && rqVar.D.view_messages != z21) {
                                sb3.append(org.telegram.messenger.id.M0(2131743705, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && rqVar.D.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743695, "UserRestrictionsNoSendText"));
                            }
                            boolean z22 = tL_chatBannedRights.send_media;
                            if (!z22 || rqVar.D.send_media == z22) {
                                boolean z23 = tL_chatBannedRights.send_photos;
                                if (z23 && rqVar.D.send_photos != z23) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743700, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z24 = tL_chatBannedRights.send_videos;
                                if (z24 && rqVar.D.send_videos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743694, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_audios;
                                if (z25 && rqVar.D.send_audios != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743701, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z26 = tL_chatBannedRights.send_docs;
                                if (z26 && rqVar.D.send_docs != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743703, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z27 = tL_chatBannedRights.send_voices;
                                if (z27 && rqVar.D.send_voices != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.id.M0(2131743693, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z28 = tL_chatBannedRights.send_roundvideos;
                                if (z28 && rqVar.D.send_roundvideos != z28) {
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
                            if (z29 && rqVar.D.send_stickers != z29) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743696, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z30 = tL_chatBannedRights.send_polls;
                            if (z30 && rqVar.D.send_polls != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743699, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z31 = tL_chatBannedRights.embed_links;
                            if (z31 && !tL_chatBannedRights.send_plain && rqVar.D.embed_links != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743708, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z32 = tL_chatBannedRights.invite_users;
                            if (z32 && rqVar.D.invite_users != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743707, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z33 = tL_chatBannedRights.pin_messages;
                            if (z33 && rqVar.D.pin_messages != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743706, null));
                            }
                            boolean z34 = tL_chatBannedRights.edit_rank;
                            if (z34 && rqVar.D.edit_rank != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743709, null));
                            }
                            boolean z35 = tL_chatBannedRights.send_reactions;
                            if (z35 && rqVar.D.send_reactions != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.id.M0(2131743698, null));
                            }
                            boolean z36 = tL_chatBannedRights.change_info;
                            if (z36 && rqVar.D.change_info != z36) {
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
                if (i7 != rqVar.x0) {
                    if (i7 != rqVar.a1) {
                        if (i7 != rqVar.O0) {
                            if (i7 != rqVar.n0) {
                                if (i7 != rqVar.q0) {
                                    if (i7 != rqVar.J0) {
                                        if (i7 != rqVar.L0) {
                                            if (i7 != rqVar.t0) {
                                                if (i7 != rqVar.Q0) {
                                                    if (i7 == rqVar.i1) {
                                                        z8Var.setText(org.telegram.messenger.id.M0(rqVar.u1 ? 2131752292 : 2131752296, null));
                                                        break;
                                                    }
                                                } else if (!rqVar.q1) {
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
                                    z8Var.setText(org.telegram.messenger.id.a0(null, null, 2131749423, hi.j.J0(rqVar.getMessagesController().J6), String.valueOf(((int) (((rqVar.z1 * (rqVar.getMessagesController().J6 / 1000.0f)) / 1000.0d) * rqVar.getMessagesController().c6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                z8Var.setText(org.telegram.messenger.id.M0(2131749425, null));
                                break;
                            }
                        } else {
                            int r02 = rq.r0(rqVar.o1);
                            if (rqVar.r != null && r02 != 0) {
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
                                if (!z16 || rqVar.d1 != 0) {
                                    z8Var.setText("");
                                    break;
                                } else {
                                    z8Var.setText(org.telegram.messenger.id.M0(2131752376, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (rqVar.y0 == -1) {
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
                x4Var.a(org.telegram.ui.ActionBar.m6.m6, org.telegram.ui.ActionBar.m6.G6);
                if (i7 != rqVar.y0) {
                    if (i7 != rqVar.u0) {
                        if (i7 != rqVar.z0) {
                            if (i7 == rqVar.s0) {
                                x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                                x4Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.id.M0(2131752883, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                            if ((!rqVar.P || rqVar.Q) && rqVar.Y0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            x4Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.id.M0(2131752402, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_log, 5, org.telegram.messenger.id.M0(2131751079, null), rqVar.w0 > rqVar.u0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                                if (rqVar.z0 != -1 || ((!rqVar.P || rqVar.Q) && rqVar.Y0 == -1 && !arrayList.isEmpty())) {
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
                            x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                            x4Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.id.M0(2131752528, "ChannelAddAdmin"), !rqVar.P || rqVar.Q);
                            break;
                        }
                    } else {
                        x4Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.id.M0(2131752452, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                    x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.id.M0(2131752527, "ChannelAddException"), rqVar.D0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != rqVar.C0) {
                    if (i7 != rqVar.R) {
                        if (i7 != rqVar.M0) {
                            if (i7 != rqVar.r0) {
                                if (i7 == rqVar.o0) {
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
                    TLRPC.ChatFull chatFull3 = rqVar.r;
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
                TLRPC.ChatFull chatFull4 = rqVar.r;
                w9Var.c(M03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = q8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.m6.r7;
                int i19 = org.telegram.ui.ActionBar.m6.V6;
                int i20 = org.telegram.ui.ActionBar.m6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z37 = q8Var.getTag() != null && ((Integer) q8Var.getTag()).intValue() == i7;
                q8Var.setTag(Integer.valueOf(i7));
                if (i7 == rqVar.f0) {
                    q8Var.d(org.telegram.messenger.id.M0(z15 ? 2131751967 : 2131743716, null), (rqVar.D.change_info || org.telegram.messenger.t3.t0(rqVar.n)) ? false : true, rqVar.k0 != -1, z37);
                } else if (i7 == rqVar.l0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131751966, null), !rqVar.D.manage_linked_peers, false, z37);
                } else if (i7 == rqVar.g0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743711, "UserRestrictionsInviteUsers"), !rqVar.D.invite_users, true, z37);
                } else if (i7 == rqVar.h0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743692, null), (rqVar.D.pin_messages || org.telegram.messenger.t3.t0(rqVar.n)) ? false : true, true, z37);
                } else if (i7 == rqVar.i0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743713, null), !rqVar.D.edit_rank, true, z37);
                } else if (i7 == rqVar.S) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743685, "UserRestrictionsSendText"), !rqVar.D.send_plain, true, z37);
                } else if (i7 == rqVar.P0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131749409, null), rqVar.q1, false, z37);
                    q8Var.getCheckBox().setDrawIconType(0);
                    q8Var.getCheckBox().d(org.telegram.ui.ActionBar.m6.M6, org.telegram.ui.ActionBar.m6.N6, i20, i20);
                } else if (i7 == rqVar.T) {
                    int s02 = rq.s0(rqVar.D);
                    q8Var.d(org.telegram.messenger.id.M0(2131743690, "UserRestrictionsSendMedia"), s02 > 0, true, z37);
                    Locale locale = Locale.US;
                    q8Var.a(new m9.u(this, q8Var, false, 29), com.google.android.recaptcha.internal.a.i(s02, "/10"), !rqVar.k1);
                } else if (i7 == rqVar.d0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743686, "UserRestrictionsSendStickers"), !rqVar.D.send_stickers, true, z37);
                } else if (i7 == rqVar.e0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743712, "UserRestrictionsEmbedLinks"), !rqVar.D.embed_links, true, z37);
                } else if (i7 == rqVar.c0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131743688, "UserRestrictionsSendPollsShort"), !rqVar.D.send_polls, true, false);
                } else if (i7 == rqVar.k0) {
                    q8Var.d(org.telegram.messenger.id.M0(2131751700, "CreateTopicsPermission"), !rqVar.D.manage_topics, false, z37);
                }
                if (i7 == rqVar.h0 || i7 == rqVar.f0) {
                    i13 = ((org.telegram.ui.ActionBar.f2) rqVar).currentAccount;
                    if (org.telegram.messenger.t3.Z(i13, rqVar.M)) {
                        q8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.t3.w(2, rqVar.n)) {
                    q8Var.setIcon(0);
                    break;
                } else if ((i7 == rqVar.g0 && !org.telegram.messenger.t3.y(3, rqVar.n)) || ((i7 == rqVar.h0 && !org.telegram.messenger.t3.y(0, rqVar.n)) || ((i7 == rqVar.f0 && !org.telegram.messenger.t3.y(1, rqVar.n)) || ((i7 == rqVar.k0 && !org.telegram.messenger.t3.y(15, rqVar.n)) || (org.telegram.messenger.t3.t0(rqVar.n) && (i7 == rqVar.h0 || i7 == rqVar.f0)))))) {
                    q8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    q8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                if (i7 != rqVar.Y0) {
                    if (i7 != rqVar.V0) {
                        if (i7 != rqVar.S0) {
                            if (i7 == rqVar.f1) {
                                x3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.t3.T(rqVar.n) && !rqVar.n.megagroup) {
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
                } else if (org.telegram.messenger.t3.T(rqVar.n) && !rqVar.n.megagroup) {
                    x3Var.setText(org.telegram.messenger.id.M0(2131752334, "ChannelOtherSubscribers"));
                    break;
                } else {
                    x3Var.setText(org.telegram.messenger.id.M0(2131752336, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.lz lzVar = (org.telegram.ui.Components.lz) view;
                if (i14 != 0) {
                    lzVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = rqVar.r;
                    lzVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (i7 != rqVar.w0) {
                    if (i7 != rqVar.I0) {
                        if (i7 == rqVar.K0) {
                            m8Var.getCheckBox().setIcon(0);
                            String M04 = org.telegram.messenger.id.M0(2131752379, null);
                            TLRPC.Chat chat = rqVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z17 = false;
                            }
                            m8Var.l(M04, z17, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = m8Var.getCheckBox();
                        if (org.telegram.messenger.t3.y(2, rqVar.n) && ((chatFull = rqVar.r) == null || chatFull.participants_hidden || rqVar.q0() >= rqVar.getMessagesController().g5)) {
                            i16 = 0;
                        }
                        checkBox2.setIcon(i16);
                        String M05 = org.telegram.messenger.id.M0(2131752405, null);
                        TLRPC.ChatFull chatFull6 = rqVar.r;
                        m8Var.l(M05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = m8Var.getCheckBox();
                    if (org.telegram.messenger.t3.y(13, rqVar.n) && ((chatFull2 = rqVar.r) == null || chatFull2.antispam || rqVar.q0() >= rqVar.getMessagesController().f5)) {
                        i16 = 0;
                    }
                    checkBox3.setIcon(i16);
                    String M06 = org.telegram.messenger.id.M0(2131752467, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = rqVar.r;
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
                if (i7 != rqVar.U) {
                    if (i7 != rqVar.V) {
                        if (i7 != rqVar.W) {
                            if (i7 != rqVar.X) {
                                if (i7 != rqVar.Y) {
                                    if (i7 != rqVar.Z) {
                                        if (i7 != rqVar.a0) {
                                            if (i7 != rqVar.b0) {
                                                if (i7 != rqVar.j0) {
                                                    if (i7 != rqVar.c0) {
                                                        c2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.id.M0(2131745602, "SendMediaPolls"), "", !rqVar.D.send_polls, true, z38);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.id.M0(2131743687, null), "", !rqVar.D.send_reactions, false, z38);
                                                    break;
                                                }
                                            } else {
                                                String M07 = org.telegram.messenger.id.M0(2131745610, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = rqVar.D;
                                                c2Var.e(M07, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z38);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.id.M0(2131745606, "SendMediaPermissionRound"), "", !rqVar.D.send_roundvideos, true, z38);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.id.M0(2131745603, "SendMediaPermissionVoice"), "", !rqVar.D.send_voices, true, z38);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.id.M0(2131745609, "SendMediaPermissionFiles"), "", !rqVar.D.send_docs, true, z38);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.id.M0(2131745608, "SendMediaPermissionMusic"), "", !rqVar.D.send_audios, true, z38);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.id.M0(2131745605, "SendMediaPermissionStickersGifs"), "", !rqVar.D.send_stickers, true, z38);
                            break;
                        }
                    } else {
                        c2Var.e(org.telegram.messenger.id.M0(2131745604, "SendMediaPermissionVideos"), "", !rqVar.D.send_videos, true, z38);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.id.M0(2131745607, "SendMediaPermissionPhotos"), "", !rqVar.D.send_photos, true, z38);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 != rqVar.g1) {
                    if (i7 != rqVar.h1) {
                        if (i7 == rqVar.m0) {
                            r8Var.f(org.telegram.messenger.id.M0(2131749426, null), rqVar.x1, false);
                            break;
                        }
                    } else {
                        r8Var.f(org.telegram.messenger.id.M0(2131752293, null), rqVar.v1, false);
                        break;
                    }
                } else {
                    String M08 = org.telegram.messenger.id.M0(2131752295, null);
                    boolean z39 = rqVar.u1;
                    r8Var.f(M08, z39, z39);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                if (i7 == rqVar.p0) {
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) rqVar.getMessagesController().I6);
                    int k10 = (int) Utilities.k(rqVar.z1, rqVar.getMessagesController().I6, 1L);
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
        org.telegram.ui.ActionBar.h6 h6Var;
        View view;
        View view2;
        int i10 = 1;
        Context context = this.c;
        rq rqVar = this.d;
        switch (i7) {
            case 0:
                int i11 = rqVar.N;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, (i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, rqVar.d1 == 0, null);
                a5Var.setDelegate(new mq(this, r8));
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
                if (!rqVar.s) {
                    if (!rqVar.w) {
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
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
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
                h6Var = ((org.telegram.ui.ActionBar.f2) rqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, h6Var);
                x3Var.setBackground(null);
                view = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context, null);
                wt0Var.b(rqVar.o1, null, org.telegram.messenger.id.M0(2131745305, "SlowmodeOff"), org.telegram.messenger.id.a0(null, null, 2131745304, 5), org.telegram.messenger.id.a0(null, null, 2131745304, 10), org.telegram.messenger.id.a0(null, null, 2131745304, 30), org.telegram.messenger.id.a0(null, null, 2131745306, 1), org.telegram.messenger.id.a0(null, null, 2131745306, 5), org.telegram.messenger.id.a0(null, null, 2131745306, 15), org.telegram.messenger.id.a0(null, null, 2131745309, 1));
                wt0Var.setCallback(new mq(this, i10));
                view = wt0Var;
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
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.c, rqVar.getResourceProvider(), false, true);
                m8Var.w = 50;
                view = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, rqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                c2Var.setEnabled(true);
                view = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = rqVar.r1;
                wt0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                wt0Var2.setCallback(new mq(this, r5));
                view2 = wt0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.r8(context, rqVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.t7(context, rqVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
