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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nq extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r7 == r4.L0) goto L41;
     */
    @Override // org.telegram.ui.Components.dk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 != 16) {
            rq rqVar = this.d;
            if (i7 == 7 || i7 == 14) {
                return org.telegram.messenger.v3.w(2, rqVar.n);
            }
            if (i7 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) f1Var.a).getCurrentObject();
                if (rqVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = f1Var.b();
                if (i7 != 0 && i7 != 2 && i7 != 6) {
                    if (i7 == 12) {
                        if (b10 == rqVar.x0) {
                            return org.telegram.messenger.v3.y(13, rqVar.n);
                        }
                        if (b10 == rqVar.J0) {
                            return org.telegram.messenger.v3.y(2, rqVar.n);
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
        int i10 = rqVar.E0;
        if (i7 >= i10 && i7 < rqVar.F0) {
            return (TLObject) rqVar.F.get(i7 - i10);
        }
        int i11 = rqVar.U0;
        if (i7 >= i11 && i7 < rqVar.V0) {
            return (TLObject) rqVar.H.get(i7 - i11);
        }
        int i12 = rqVar.X0;
        if (i7 < i12 || i7 >= rqVar.Y0) {
            return null;
        }
        return (TLObject) rqVar.G.get(i7 - i12);
    }

    @Override // v4.i0
    public final int b() {
        return this.d.d1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 == rqVar.z0 || i7 == rqVar.A0 || i7 == rqVar.v0 || i7 == rqVar.t0) {
            return 2;
        }
        if ((i7 >= rqVar.E0 && i7 < rqVar.F0) || ((i7 >= rqVar.X0 && i7 < rqVar.Y0) || (i7 >= rqVar.U0 && i7 < rqVar.V0))) {
            return 0;
        }
        if (i7 == rqVar.C0 || i7 == rqVar.G0 || i7 == rqVar.H0) {
            return 3;
        }
        if (i7 == rqVar.D0 || i7 == rqVar.S || i7 == rqVar.N0 || i7 == rqVar.s0 || i7 == rqVar.p0) {
            return 5;
        }
        if (i7 == rqVar.b1 || i7 == rqVar.P0 || i7 == rqVar.R0 || i7 == rqVar.u0 || i7 == rqVar.y0 || i7 == rqVar.K0 || i7 == rqVar.M0 || i7 == rqVar.j1 || i7 == rqVar.o0 || i7 == rqVar.r0) {
            return 1;
        }
        if (i7 == rqVar.c1) {
            return 4;
        }
        if (i7 == rqVar.B0) {
            return 6;
        }
        if (i7 == rqVar.g0 || i7 == rqVar.h0 || i7 == rqVar.m0 || i7 == rqVar.i0 || i7 == rqVar.j0 || i7 == rqVar.T || i7 == rqVar.e0 || i7 == rqVar.f0 || i7 == rqVar.l0 || i7 == rqVar.Q0) {
            return 7;
        }
        if (i7 == rqVar.Z0 || i7 == rqVar.T0 || i7 == rqVar.W0 || i7 == rqVar.g1) {
            return 8;
        }
        if (i7 == rqVar.O0) {
            return 9;
        }
        if (i7 == rqVar.a1) {
            return 10;
        }
        if (i7 == rqVar.f1) {
            return 11;
        }
        if (i7 == rqVar.x0 || i7 == rqVar.J0 || i7 == rqVar.L0) {
            return 12;
        }
        if (rqVar.u0(i7)) {
            return 13;
        }
        if (i7 == rqVar.U) {
            return 14;
        }
        if (i7 == rqVar.S0) {
            return 15;
        }
        if (i7 == rqVar.h1 || i7 == rqVar.i1 || i7 == rqVar.n0) {
            return 16;
        }
        return i7 == rqVar.q0 ? 17 : 0;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        Object[] objArr;
        long j3;
        CharSequence charSequence;
        int i11;
        boolean z10;
        long j10;
        boolean z11;
        long j11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z12;
        boolean z13;
        int i12;
        Object[] objArr2;
        TLObject O0;
        boolean z14;
        CharSequence charSequence2;
        TLRPC.User c22;
        CharSequence N0;
        boolean z15;
        CharSequence charSequence3;
        CharSequence charSequence4;
        TLRPC.User c23;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        rq rqVar = this.d;
        ArrayList arrayList = rqVar.F;
        boolean z16 = rqVar.w;
        boolean z17 = rqVar.s;
        int i14 = rqVar.O;
        int i15 = f1Var.f;
        View view = f1Var.a;
        int i16 = R.drawable.permission_locked;
        r10 = true;
        r10 = true;
        boolean z18 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i7));
                TLObject E = E(i7);
                if (i7 < rqVar.E0 || i7 >= (i10 = rqVar.F0)) {
                    if (i7 >= rqVar.U0 && i7 < (i10 = rqVar.V0)) {
                        if (org.telegram.messenger.v3.T(rqVar.n)) {
                            break;
                        }
                    } else {
                        i10 = rqVar.Y0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.v3.T(rqVar.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j3 = 0;
                    long j13 = ((TLRPC.User) E).id;
                    tL_chatBannedRights = null;
                    i11 = 0;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    j10 = j13;
                    j12 = 0;
                    charSequence = "";
                    j11 = 0;
                } else {
                    j3 = 0;
                    if (E instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                        long B1 = org.telegram.messenger.fj.B1(channelParticipant.peer);
                        j12 = channelParticipant.kicked_by;
                        charSequence = "";
                        j11 = channelParticipant.promoted_by;
                        tL_chatBannedRights = channelParticipant.banned_rights;
                        int i17 = channelParticipant.date;
                        boolean z19 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        boolean z20 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z10 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z11 = z20;
                        z12 = z19;
                        i11 = i17;
                        j10 = B1;
                    } else {
                        charSequence = "";
                        if (E instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                            long j14 = chatParticipant.user_id;
                            i11 = chatParticipant.date;
                            boolean z21 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z10 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            j10 = j14;
                            z11 = z21;
                            j11 = 0;
                            j12 = 0;
                            tL_chatBannedRights = null;
                            z12 = false;
                        }
                    }
                }
                if (j10 > j3) {
                    z13 = z10;
                    i12 = i10;
                    O0 = rqVar.getMessagesController().c2(Long.valueOf(j10));
                    objArr2 = objArr;
                } else {
                    z13 = z10;
                    i12 = i10;
                    objArr2 = objArr;
                    O0 = rqVar.getMessagesController().O0(Long.valueOf(-j10));
                }
                if (O0 != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    b5Var.c(O0, null, (!objArr2 == true || i11 == 0) ? null : org.telegram.messenger.gd.B(i11), i7 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z11) {
                                    if (!z13 || (c22 = rqVar.getMessagesController().c2(Long.valueOf(j11))) == null) {
                                        z14 = false;
                                        charSequence2 = null;
                                    } else if (c22.id == j10) {
                                        N0 = org.telegram.messenger.gd.N0(2131752506, null);
                                    } else {
                                        z14 = false;
                                        charSequence2 = org.telegram.messenger.gd.a0(null, null, 2131751296, org.telegram.messenger.o10.q(c22));
                                    }
                                    b5Var.c(O0, null, charSequence2, i7 == i12 + (-1) ? true : z14);
                                    break;
                                } else {
                                    N0 = org.telegram.messenger.gd.N0(2131752411, null);
                                }
                                charSequence2 = N0;
                                z14 = false;
                                b5Var.c(O0, null, charSequence2, i7 == i12 + (-1) ? true : z14);
                            }
                        } else {
                            if (!z12 || (c23 = rqVar.getMessagesController().c2(Long.valueOf(j12))) == null) {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = null;
                            } else {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = org.telegram.messenger.gd.a0(null, null, 2131743489, org.telegram.messenger.o10.q(c23));
                            }
                            b5Var.c(O0, charSequence3, charSequence4, i7 != i12 + (-1) ? z15 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z22 = tL_chatBannedRights.view_messages;
                            if (z22 && rqVar.E.view_messages != z22) {
                                sb3.append(org.telegram.messenger.gd.N0(2131743462, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && rqVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743452, "UserRestrictionsNoSendText"));
                            }
                            boolean z23 = tL_chatBannedRights.send_media;
                            if (!z23 || rqVar.E.send_media == z23) {
                                boolean z24 = tL_chatBannedRights.send_photos;
                                if (z24 && rqVar.E.send_photos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743457, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_videos;
                                if (z25 && rqVar.E.send_videos != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743451, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z26 = tL_chatBannedRights.send_audios;
                                if (z26 && rqVar.E.send_audios != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743458, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z27 = tL_chatBannedRights.send_docs;
                                if (z27 && rqVar.E.send_docs != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743460, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z28 = tL_chatBannedRights.send_voices;
                                if (z28 && rqVar.E.send_voices != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743450, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z29 = tL_chatBannedRights.send_roundvideos;
                                if (z29 && rqVar.E.send_roundvideos != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.gd.N0(2131743454, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743459, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z30 = tL_chatBannedRights.send_stickers;
                            if (z30 && rqVar.E.send_stickers != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743453, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z31 = tL_chatBannedRights.send_polls;
                            if (z31 && rqVar.E.send_polls != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743456, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z32 = tL_chatBannedRights.embed_links;
                            if (z32 && !tL_chatBannedRights.send_plain && rqVar.E.embed_links != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743465, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z33 = tL_chatBannedRights.invite_users;
                            if (z33 && rqVar.E.invite_users != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743464, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z34 = tL_chatBannedRights.pin_messages;
                            if (z34 && rqVar.E.pin_messages != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743463, null));
                            }
                            boolean z35 = tL_chatBannedRights.edit_rank;
                            if (z35 && rqVar.E.edit_rank != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743466, null));
                            }
                            boolean z36 = tL_chatBannedRights.send_reactions;
                            if (z36 && rqVar.E.send_reactions != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743455, null));
                            }
                            boolean z37 = tL_chatBannedRights.change_info;
                            if (z37 && rqVar.E.change_info != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.gd.N0(2131743467, null));
                            }
                            if (sb3.length() != 0) {
                                sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                sb3.append('.');
                            }
                            sb2 = sb3.toString();
                        }
                        b5Var.c(O0, null, sb2, i7 != i12 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 != rqVar.y0) {
                    if (i7 != rqVar.b1) {
                        if (i7 != rqVar.P0) {
                            if (i7 != rqVar.o0) {
                                if (i7 != rqVar.r0) {
                                    if (i7 != rqVar.K0) {
                                        if (i7 != rqVar.M0) {
                                            if (i7 != rqVar.u0) {
                                                if (i7 != rqVar.R0) {
                                                    if (i7 == rqVar.j1) {
                                                        a9Var.setText(org.telegram.messenger.gd.N0(rqVar.v1 ? 2131752280 : 2131752284, null));
                                                        break;
                                                    }
                                                } else if (!rqVar.r1) {
                                                    a9Var.setText(org.telegram.messenger.gd.N0(2131749215, null));
                                                    break;
                                                } else {
                                                    a9Var.setText(org.telegram.messenger.gd.N0(2131749214, null));
                                                    break;
                                                }
                                            } else {
                                                a9Var.setText(org.telegram.messenger.gd.N0(2131752870, null));
                                                break;
                                            }
                                        } else {
                                            a9Var.setText(org.telegram.messenger.gd.N0(2131752366, null));
                                            break;
                                        }
                                    } else {
                                        a9Var.setText(org.telegram.messenger.gd.N0(2131752392, null));
                                        break;
                                    }
                                } else {
                                    a9Var.setText(org.telegram.messenger.gd.a0(null, null, 2131749230, ki.j.J0(rqVar.getMessagesController().M6), String.valueOf(((int) (((rqVar.A1 * (rqVar.getMessagesController().M6 / 1000.0f)) / 1000.0d) * rqVar.getMessagesController().f6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                a9Var.setText(org.telegram.messenger.gd.N0(2131749232, null));
                                break;
                            }
                        } else {
                            int r02 = rq.r0(rqVar.p1);
                            if (rqVar.r != null && r02 != 0) {
                                a9Var.setText(org.telegram.messenger.gd.a0(null, null, 2131745111, r02 < 60 ? org.telegram.messenger.gd.G(r02, "Seconds", new Object[0]) : r02 < 3600 ? org.telegram.messenger.gd.G(r02 / 60, "Minutes", new Object[0]) : org.telegram.messenger.gd.G((r02 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                a9Var.setText(org.telegram.messenger.gd.N0(2131745112, null));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || rqVar.e1 != 0) {
                                    a9Var.setText("");
                                    break;
                                } else {
                                    a9Var.setText(org.telegram.messenger.gd.N0(2131752364, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (rqVar.z0 == -1) {
                            a9Var.setText("");
                            break;
                        } else if (!z17) {
                            a9Var.setText(org.telegram.messenger.gd.N0(2131748452, "MegaAdminsInfo"));
                            break;
                        } else {
                            a9Var.setText(org.telegram.messenger.gd.N0(2131752503, "ChannelAdminsInfo"));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            a9Var.setText(org.telegram.messenger.gd.N0(2131748043, null));
                            break;
                        } else {
                            a9Var.setText(org.telegram.messenger.gd.N0(2131748044, null));
                            break;
                        }
                    } else {
                        a9Var.setText(org.telegram.messenger.gd.N0(2131748045, null));
                        break;
                    }
                } else {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131752450, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.m6.m6, org.telegram.ui.ActionBar.m6.G6);
                if (i7 != rqVar.z0) {
                    if (i7 != rqVar.v0) {
                        if (i7 != rqVar.A0) {
                            if (i7 == rqVar.t0) {
                                y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                                y4Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.gd.N0(2131752871, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                            if ((!rqVar.Q || rqVar.R) && rqVar.Z0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            y4Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.gd.N0(2131752390, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        y4Var.b(R.drawable.msg_log, 5, org.telegram.messenger.gd.N0(2131751067, null), rqVar.x0 > rqVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                                if (rqVar.A0 != -1 || ((!rqVar.Q || rqVar.R) && rqVar.Z0 == -1 && !arrayList.isEmpty())) {
                                    r15 = true;
                                }
                                if (!z17) {
                                    y4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.gd.N0(2131754398, null), r15);
                                    break;
                                } else {
                                    y4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.gd.N0(2131754380, null), r15);
                                    break;
                                }
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                            y4Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.gd.N0(2131752516, "ChannelAddAdmin"), !rqVar.Q || rqVar.R);
                            break;
                        }
                    } else {
                        y4Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.gd.N0(2131752440, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                    y4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.gd.N0(2131752515, "ChannelAddException"), rqVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 != rqVar.D0) {
                    if (i7 != rqVar.S) {
                        if (i7 != rqVar.N0) {
                            if (i7 != rqVar.s0) {
                                if (i7 == rqVar.p0) {
                                    o4Var.setText(org.telegram.messenger.gd.N0(2131749231, null));
                                    break;
                                }
                            } else {
                                o4Var.setText(org.telegram.messenger.gd.N0(2131752872, null));
                                break;
                            }
                        } else {
                            o4Var.setText(org.telegram.messenger.gd.N0(2131745114, null));
                            break;
                        }
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.N0(z16 ? 2131751873 : 2131752320, null));
                        break;
                    }
                } else if (i14 != 0) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131752296, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = rqVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131752439, null));
                        break;
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String N02 = org.telegram.messenger.gd.N0(2131752441, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = rqVar.r;
                x9Var.c(N02, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = r8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.m6.r7;
                int i19 = org.telegram.ui.ActionBar.m6.V6;
                int i20 = org.telegram.ui.ActionBar.m6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z38 = r8Var.getTag() != null && ((Integer) r8Var.getTag()).intValue() == i7;
                r8Var.setTag(Integer.valueOf(i7));
                if (i7 == rqVar.g0) {
                    r8Var.d(org.telegram.messenger.gd.N0(z16 ? 2131751955 : 2131743473, null), (rqVar.E.change_info || org.telegram.messenger.v3.t0(rqVar.n)) ? false : true, rqVar.l0 != -1, z38);
                } else if (i7 == rqVar.m0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131751954, null), !rqVar.E.manage_linked_peers, false, z38);
                } else if (i7 == rqVar.h0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743468, "UserRestrictionsInviteUsers"), !rqVar.E.invite_users, true, z38);
                } else if (i7 == rqVar.i0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743449, null), (rqVar.E.pin_messages || org.telegram.messenger.v3.t0(rqVar.n)) ? false : true, true, z38);
                } else if (i7 == rqVar.j0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743470, null), !rqVar.E.edit_rank, true, z38);
                } else if (i7 == rqVar.T) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743442, "UserRestrictionsSendText"), !rqVar.E.send_plain, true, z38);
                } else if (i7 == rqVar.Q0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131749216, null), rqVar.r1, false, z38);
                    r8Var.getCheckBox().setDrawIconType(0);
                    r8Var.getCheckBox().d(org.telegram.ui.ActionBar.m6.M6, org.telegram.ui.ActionBar.m6.N6, i20, i20);
                } else if (i7 == rqVar.U) {
                    int s02 = rq.s0(rqVar.E);
                    r8Var.d(org.telegram.messenger.gd.N0(2131743447, "UserRestrictionsSendMedia"), s02 > 0, true, z38);
                    Locale locale = Locale.US;
                    r8Var.a(new m9.u(this, r8Var, false, 28), com.google.android.gms.internal.vision.e2.i(s02, "/10"), !rqVar.l1);
                } else if (i7 == rqVar.e0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743443, "UserRestrictionsSendStickers"), !rqVar.E.send_stickers, true, z38);
                } else if (i7 == rqVar.f0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743469, "UserRestrictionsEmbedLinks"), !rqVar.E.embed_links, true, z38);
                } else if (i7 == rqVar.d0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131743445, "UserRestrictionsSendPollsShort"), !rqVar.E.send_polls, true, false);
                } else if (i7 == rqVar.l0) {
                    r8Var.d(org.telegram.messenger.gd.N0(2131751688, "CreateTopicsPermission"), !rqVar.E.manage_topics, false, z38);
                }
                if (i7 == rqVar.i0 || i7 == rqVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.g2) rqVar).currentAccount;
                    if (org.telegram.messenger.v3.Z(i13, rqVar.N)) {
                        r8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.v3.w(2, rqVar.n)) {
                    r8Var.setIcon(0);
                    break;
                } else if ((i7 == rqVar.h0 && !org.telegram.messenger.v3.y(3, rqVar.n)) || ((i7 == rqVar.i0 && !org.telegram.messenger.v3.y(0, rqVar.n)) || ((i7 == rqVar.g0 && !org.telegram.messenger.v3.y(1, rqVar.n)) || ((i7 == rqVar.l0 && !org.telegram.messenger.v3.y(15, rqVar.n)) || (org.telegram.messenger.v3.t0(rqVar.n) && (i7 == rqVar.i0 || i7 == rqVar.g0)))))) {
                    r8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    r8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                if (i7 != rqVar.Z0) {
                    if (i7 != rqVar.W0) {
                        if (i7 != rqVar.T0) {
                            if (i7 == rqVar.g1) {
                                y3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.v3.T(rqVar.n) && !rqVar.n.megagroup) {
                            y3Var.setText(org.telegram.messenger.gd.N0(2131752412, "ChannelContacts"));
                            break;
                        } else {
                            y3Var.setText(org.telegram.messenger.gd.N0(2131749263, "GroupContacts"));
                            break;
                        }
                    } else {
                        y3Var.setText(org.telegram.messenger.gd.N0(2131752436, "ChannelBots"));
                        break;
                    }
                } else if (org.telegram.messenger.v3.T(rqVar.n) && !rqVar.n.megagroup) {
                    y3Var.setText(org.telegram.messenger.gd.N0(2131752322, "ChannelOtherSubscribers"));
                    break;
                } else {
                    y3Var.setText(org.telegram.messenger.gd.N0(2131752324, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.yz yzVar = (org.telegram.ui.Components.yz) view;
                if (i14 != 0) {
                    yzVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = rqVar.r;
                    yzVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                if (i7 != rqVar.x0) {
                    if (i7 != rqVar.J0) {
                        if (i7 == rqVar.L0) {
                            n8Var.getCheckBox().setIcon(0);
                            String N03 = org.telegram.messenger.gd.N0(2131752367, null);
                            TLRPC.Chat chat = rqVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z18 = false;
                            }
                            n8Var.l(N03, z18, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = n8Var.getCheckBox();
                        if (org.telegram.messenger.v3.y(2, rqVar.n) && ((chatFull = rqVar.r) == null || chatFull.participants_hidden || rqVar.q0() >= rqVar.getMessagesController().j5)) {
                            i16 = 0;
                        }
                        checkBox2.setIcon(i16);
                        String N04 = org.telegram.messenger.gd.N0(2131752393, null);
                        TLRPC.ChatFull chatFull6 = rqVar.r;
                        n8Var.l(N04, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = n8Var.getCheckBox();
                    if (org.telegram.messenger.v3.y(13, rqVar.n) && ((chatFull2 = rqVar.r) == null || chatFull2.antispam || rqVar.q0() >= rqVar.getMessagesController().i5)) {
                        i16 = 0;
                    }
                    checkBox3.setIcon(i16);
                    String N05 = org.telegram.messenger.gd.N0(2131752455, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = rqVar.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r15 = true;
                    }
                    n8Var.n(R.drawable.msg_policy, N05, r15);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                boolean z39 = d2Var.getTag() != null && ((Integer) d2Var.getTag()).intValue() == i7;
                d2Var.setTag(Integer.valueOf(i7));
                if (i7 != rqVar.V) {
                    if (i7 != rqVar.W) {
                        if (i7 != rqVar.X) {
                            if (i7 != rqVar.Y) {
                                if (i7 != rqVar.Z) {
                                    if (i7 != rqVar.a0) {
                                        if (i7 != rqVar.b0) {
                                            if (i7 != rqVar.c0) {
                                                if (i7 != rqVar.k0) {
                                                    if (i7 != rqVar.d0) {
                                                        d2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        d2Var.e(org.telegram.messenger.gd.N0(2131745406, "SendMediaPolls"), "", !rqVar.E.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    d2Var.e(org.telegram.messenger.gd.N0(2131743444, null), "", !rqVar.E.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String N06 = org.telegram.messenger.gd.N0(2131745414, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = rqVar.E;
                                                d2Var.e(N06, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            d2Var.e(org.telegram.messenger.gd.N0(2131745410, "SendMediaPermissionRound"), "", !rqVar.E.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        d2Var.e(org.telegram.messenger.gd.N0(2131745407, "SendMediaPermissionVoice"), "", !rqVar.E.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    d2Var.e(org.telegram.messenger.gd.N0(2131745413, "SendMediaPermissionFiles"), "", !rqVar.E.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                d2Var.e(org.telegram.messenger.gd.N0(2131745412, "SendMediaPermissionMusic"), "", !rqVar.E.send_audios, true, z39);
                                break;
                            }
                        } else {
                            d2Var.e(org.telegram.messenger.gd.N0(2131745409, "SendMediaPermissionStickersGifs"), "", !rqVar.E.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        d2Var.e(org.telegram.messenger.gd.N0(2131745408, "SendMediaPermissionVideos"), "", !rqVar.E.send_videos, true, z39);
                        break;
                    }
                } else {
                    d2Var.e(org.telegram.messenger.gd.N0(2131745411, "SendMediaPermissionPhotos"), "", !rqVar.E.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i7 != rqVar.h1) {
                    if (i7 != rqVar.i1) {
                        if (i7 == rqVar.n0) {
                            s8Var.f(org.telegram.messenger.gd.N0(2131749233, null), rqVar.y1, false);
                            break;
                        }
                    } else {
                        s8Var.f(org.telegram.messenger.gd.N0(2131752281, null), rqVar.w1, false);
                        break;
                    }
                } else {
                    String N07 = org.telegram.messenger.gd.N0(2131752283, null);
                    boolean z40 = rqVar.v1;
                    s8Var.f(N07, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                if (i7 == rqVar.q0) {
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.ks.e3, org.telegram.messenger.ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) rqVar.getMessagesController().L6);
                    int k10 = (int) Utilities.k(rqVar.A1, rqVar.getMessagesController().L6, 1L);
                    org.telegram.messenger.ed edVar = new org.telegram.messenger.ed(29);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a10;
                    t7Var.d = 20;
                    t7Var.e = edVar;
                    u7Var.d(k10, t7Var, new r3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.h6 h6Var;
        View view;
        View view2;
        int i10 = 1;
        Context context = this.c;
        rq rqVar = this.d;
        switch (i7) {
            case 0:
                int i11 = rqVar.O;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.c, (i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, rqVar.e1 == 0, null);
                b5Var.setDelegate(new mq(this, r8));
                view2 = b5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                if (!rqVar.s) {
                    if (!rqVar.w) {
                        a9Var.setText(org.telegram.messenger.gd.N0(2131748043, null));
                        view = a9Var;
                        break;
                    } else {
                        a9Var.setText(org.telegram.messenger.gd.N0(2131748044, null));
                        view = a9Var;
                        break;
                    }
                } else {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131748045, null));
                    view = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                o4Var.setHeight(43);
                view2 = o4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.g2) rqVar).resourceProvider;
                View y3Var = new org.telegram.ui.Cells.y3(26, context, h6Var);
                y3Var.setBackground(null);
                view = y3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.hu0 hu0Var = new org.telegram.ui.Components.hu0(context, null);
                hu0Var.b(rqVar.p1, null, org.telegram.messenger.gd.N0(2131745109, "SlowmodeOff"), org.telegram.messenger.gd.a0(null, null, 2131745108, 5), org.telegram.messenger.gd.a0(null, null, 2131745108, 10), org.telegram.messenger.gd.a0(null, null, 2131745108, 30), org.telegram.messenger.gd.a0(null, null, 2131745110, 1), org.telegram.messenger.gd.a0(null, null, 2131745110, 5), org.telegram.messenger.gd.a0(null, null, 2131745110, 15), org.telegram.messenger.gd.a0(null, null, 2131745113, 1));
                hu0Var.setCallback(new mq(this, i10));
                view = hu0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.u4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(6);
                yzVar.x = false;
                yzVar.setUseHeaderOffset(false);
                yzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.q0 q0Var = new v4.q0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                yzVar.setLayoutParams(q0Var);
                view = yzVar;
                break;
            case 12:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, this.c, rqVar.getResourceProvider(), false, true);
                n8Var.w = 50;
                view = n8Var;
                break;
            case 13:
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.c, 4, 21, false, rqVar.getResourceProvider());
                d2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                d2Var.setEnabled(true);
                view = d2Var;
                break;
            case 15:
                org.telegram.ui.Components.hu0 hu0Var2 = new org.telegram.ui.Components.hu0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rqVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = rqVar.s1;
                hu0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                hu0Var2.setCallback(new mq(this, r5));
                view2 = hu0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.s8(context, rqVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.u7(context, rqVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
