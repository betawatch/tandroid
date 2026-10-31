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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ pr d;

    public lr(pr prVar, Context context) {
        this.d = prVar;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r7 == r4.K0) goto L41;
     */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 16) {
            pr prVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return org.telegram.messenger.w3.w(2, prVar.n);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.e5) c1Var.a).getCurrentObject();
                if (prVar.N != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = c1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == prVar.w0) {
                            return org.telegram.messenger.w3.y(13, prVar.n);
                        }
                        if (b10 == prVar.I0) {
                            return org.telegram.messenger.w3.y(2, prVar.n);
                        }
                    }
                    if (i10 != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i10) {
        pr prVar = this.d;
        int i11 = prVar.D0;
        if (i10 >= i11 && i10 < prVar.E0) {
            return (TLObject) prVar.E.get(i10 - i11);
        }
        int i12 = prVar.T0;
        if (i10 >= i12 && i10 < prVar.U0) {
            return (TLObject) prVar.G.get(i10 - i12);
        }
        int i13 = prVar.W0;
        if (i10 < i13 || i10 >= prVar.X0) {
            return null;
        }
        return (TLObject) prVar.F.get(i10 - i13);
    }

    @Override // s4.g0
    public final int b() {
        return this.d.c1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        pr prVar = this.d;
        if (i10 == prVar.y0 || i10 == prVar.z0 || i10 == prVar.u0 || i10 == prVar.s0) {
            return 2;
        }
        if ((i10 >= prVar.D0 && i10 < prVar.E0) || ((i10 >= prVar.W0 && i10 < prVar.X0) || (i10 >= prVar.T0 && i10 < prVar.U0))) {
            return 0;
        }
        if (i10 == prVar.B0 || i10 == prVar.F0 || i10 == prVar.G0) {
            return 3;
        }
        if (i10 == prVar.C0 || i10 == prVar.R || i10 == prVar.M0 || i10 == prVar.r0 || i10 == prVar.o0) {
            return 5;
        }
        if (i10 == prVar.a1 || i10 == prVar.O0 || i10 == prVar.Q0 || i10 == prVar.t0 || i10 == prVar.x0 || i10 == prVar.J0 || i10 == prVar.L0 || i10 == prVar.i1 || i10 == prVar.n0 || i10 == prVar.q0) {
            return 1;
        }
        if (i10 == prVar.b1) {
            return 4;
        }
        if (i10 == prVar.A0) {
            return 6;
        }
        if (i10 == prVar.f0 || i10 == prVar.g0 || i10 == prVar.l0 || i10 == prVar.h0 || i10 == prVar.i0 || i10 == prVar.S || i10 == prVar.d0 || i10 == prVar.e0 || i10 == prVar.k0 || i10 == prVar.P0) {
            return 7;
        }
        if (i10 == prVar.Y0 || i10 == prVar.S0 || i10 == prVar.V0 || i10 == prVar.f1) {
            return 8;
        }
        if (i10 == prVar.N0) {
            return 9;
        }
        if (i10 == prVar.Z0) {
            return 10;
        }
        if (i10 == prVar.e1) {
            return 11;
        }
        if (i10 == prVar.w0 || i10 == prVar.I0 || i10 == prVar.K0) {
            return 12;
        }
        if (prVar.t0(i10)) {
            return 13;
        }
        if (i10 == prVar.T) {
            return 14;
        }
        if (i10 == prVar.R0) {
            return 15;
        }
        if (i10 == prVar.g1 || i10 == prVar.h1 || i10 == prVar.m0) {
            return 16;
        }
        return i10 == prVar.p0 ? 17 : 0;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        Object[] objArr;
        long j10;
        CharSequence charSequence;
        int i12;
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        long j13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z12;
        boolean z13;
        int i13;
        Object[] objArr2;
        TLObject L0;
        boolean z14;
        CharSequence charSequence2;
        TLRPC.User Z1;
        CharSequence L02;
        boolean z15;
        CharSequence charSequence3;
        CharSequence charSequence4;
        TLRPC.User Z12;
        CharSequence sb2;
        int i14;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        pr prVar = this.d;
        ArrayList arrayList = prVar.E;
        boolean z16 = prVar.w;
        boolean z17 = prVar.s;
        int i15 = prVar.N;
        int i16 = c1Var.f;
        View view = c1Var.a;
        int i17 = R.drawable.permission_locked;
        r10 = true;
        r10 = true;
        boolean z18 = true;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
                e5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < prVar.D0 || i10 >= (i11 = prVar.E0)) {
                    if (i10 >= prVar.T0 && i10 < (i11 = prVar.U0)) {
                        if (org.telegram.messenger.w3.T(prVar.n)) {
                            break;
                        }
                    } else {
                        i11 = prVar.X0;
                    }
                    objArr = false;
                } else {
                    if (org.telegram.messenger.w3.T(prVar.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j10 = 0;
                    long j14 = ((TLRPC.User) E).id;
                    tL_chatBannedRights = null;
                    i12 = 0;
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
                        long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        j13 = channelParticipant.kicked_by;
                        charSequence = "";
                        j12 = channelParticipant.promoted_by;
                        tL_chatBannedRights = channelParticipant.banned_rights;
                        int i18 = channelParticipant.date;
                        boolean z19 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        boolean z20 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z10 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z11 = z20;
                        z12 = z19;
                        i12 = i18;
                        j11 = C1;
                    } else {
                        charSequence = "";
                        if (E instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                            long j15 = chatParticipant.user_id;
                            i12 = chatParticipant.date;
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
                    i13 = i11;
                    L0 = prVar.getMessagesController().Z1(Long.valueOf(j11));
                    objArr2 = objArr;
                } else {
                    z13 = z10;
                    i13 = i11;
                    objArr2 = objArr;
                    L0 = prVar.getMessagesController().L0(Long.valueOf(-j11));
                }
                if (L0 != null) {
                    if (i15 != 3) {
                        if (i15 != 0) {
                            if (i15 != 1) {
                                if (i15 == 2) {
                                    e5Var.c(L0, null, (!objArr2 == true || i12 == 0) ? null : org.telegram.messenger.cd.B(i12), i10 != i13 + (-1));
                                    break;
                                }
                            } else {
                                if (!z11) {
                                    if (!z13 || (Z1 = prVar.getMessagesController().Z1(Long.valueOf(j12))) == null) {
                                        z14 = false;
                                        charSequence2 = null;
                                    } else if (Z1.id == j11) {
                                        L02 = org.telegram.messenger.cd.L0(2131752518, null);
                                    } else {
                                        z14 = false;
                                        charSequence2 = org.telegram.messenger.cd.a0(null, null, 2131751309, org.telegram.messenger.h20.p(Z1));
                                    }
                                    e5Var.c(L0, null, charSequence2, i10 == i13 + (-1) ? true : z14);
                                    break;
                                } else {
                                    L02 = org.telegram.messenger.cd.L0(2131752423, null);
                                }
                                charSequence2 = L02;
                                z14 = false;
                                e5Var.c(L0, null, charSequence2, i10 == i13 + (-1) ? true : z14);
                            }
                        } else {
                            if (!z12 || (Z12 = prVar.getMessagesController().Z1(Long.valueOf(j13))) == null) {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = null;
                            } else {
                                z15 = true;
                                charSequence3 = null;
                                charSequence4 = org.telegram.messenger.cd.a0(null, null, 2131743758, org.telegram.messenger.h20.p(Z12));
                            }
                            e5Var.c(L0, charSequence3, charSequence4, i10 != i13 + (-1) ? z15 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z22 = tL_chatBannedRights.view_messages;
                            if (z22 && prVar.D.view_messages != z22) {
                                sb3.append(org.telegram.messenger.cd.L0(2131743731, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && prVar.D.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743721, "UserRestrictionsNoSendText"));
                            }
                            boolean z23 = tL_chatBannedRights.send_media;
                            if (!z23 || prVar.D.send_media == z23) {
                                boolean z24 = tL_chatBannedRights.send_photos;
                                if (z24 && prVar.D.send_photos != z24) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743726, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z25 = tL_chatBannedRights.send_videos;
                                if (z25 && prVar.D.send_videos != z25) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743720, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z26 = tL_chatBannedRights.send_audios;
                                if (z26 && prVar.D.send_audios != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743727, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z27 = tL_chatBannedRights.send_docs;
                                if (z27 && prVar.D.send_docs != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743729, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z28 = tL_chatBannedRights.send_voices;
                                if (z28 && prVar.D.send_voices != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743719, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z29 = tL_chatBannedRights.send_roundvideos;
                                if (z29 && prVar.D.send_roundvideos != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(org.telegram.messenger.cd.L0(2131743723, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743728, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z30 = tL_chatBannedRights.send_stickers;
                            if (z30 && prVar.D.send_stickers != z30) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743722, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z31 = tL_chatBannedRights.send_polls;
                            if (z31 && prVar.D.send_polls != z31) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743725, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z32 = tL_chatBannedRights.embed_links;
                            if (z32 && !tL_chatBannedRights.send_plain && prVar.D.embed_links != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743734, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z33 = tL_chatBannedRights.invite_users;
                            if (z33 && prVar.D.invite_users != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743733, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z34 = tL_chatBannedRights.pin_messages;
                            if (z34 && prVar.D.pin_messages != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743732, null));
                            }
                            boolean z35 = tL_chatBannedRights.edit_rank;
                            if (z35 && prVar.D.edit_rank != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743735, null));
                            }
                            boolean z36 = tL_chatBannedRights.send_reactions;
                            if (z36 && prVar.D.send_reactions != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743724, null));
                            }
                            boolean z37 = tL_chatBannedRights.change_info;
                            if (z37 && prVar.D.change_info != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(org.telegram.messenger.cd.L0(2131743736, null));
                            }
                            if (sb3.length() != 0) {
                                sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                sb3.append('.');
                            }
                            sb2 = sb3.toString();
                        }
                        e5Var.c(L0, null, sb2, i10 != i13 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i10 != prVar.x0) {
                    if (i10 != prVar.a1) {
                        if (i10 != prVar.O0) {
                            if (i10 != prVar.n0) {
                                if (i10 != prVar.q0) {
                                    if (i10 != prVar.J0) {
                                        if (i10 != prVar.L0) {
                                            if (i10 != prVar.t0) {
                                                if (i10 != prVar.Q0) {
                                                    if (i10 == prVar.i1) {
                                                        b9Var.setText(org.telegram.messenger.cd.L0(prVar.u1 ? 2131752292 : 2131752296, null));
                                                        break;
                                                    }
                                                } else if (!prVar.q1) {
                                                    b9Var.setText(org.telegram.messenger.cd.L0(2131749417, null));
                                                    break;
                                                } else {
                                                    b9Var.setText(org.telegram.messenger.cd.L0(2131749416, null));
                                                    break;
                                                }
                                            } else {
                                                b9Var.setText(org.telegram.messenger.cd.L0(2131752882, null));
                                                break;
                                            }
                                        } else {
                                            b9Var.setText(org.telegram.messenger.cd.L0(2131752378, null));
                                            break;
                                        }
                                    } else {
                                        b9Var.setText(org.telegram.messenger.cd.L0(2131752404, null));
                                        break;
                                    }
                                } else {
                                    b9Var.setText(org.telegram.messenger.cd.a0(null, null, 2131749432, xh.i.I0(prVar.getMessagesController().K6), String.valueOf(((int) (((prVar.z1 * (prVar.getMessagesController().K6 / 1000.0f)) / 1000.0d) * prVar.getMessagesController().d6)) / 100.0d)));
                                    break;
                                }
                            } else {
                                b9Var.setText(org.telegram.messenger.cd.L0(2131749434, null));
                                break;
                            }
                        } else {
                            int q02 = pr.q0(prVar.o1);
                            if (prVar.r != null && q02 != 0) {
                                b9Var.setText(org.telegram.messenger.cd.a0(null, null, 2131745325, q02 < 60 ? org.telegram.messenger.cd.G(q02, "Seconds", new Object[0]) : q02 < 3600 ? org.telegram.messenger.cd.G(q02 / 60, "Minutes", new Object[0]) : org.telegram.messenger.cd.G((q02 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                b9Var.setText(org.telegram.messenger.cd.L0(2131745326, null));
                                break;
                            }
                        }
                    } else if (i15 != 0 && i15 != 3) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                if (!z17 || prVar.d1 != 0) {
                                    b9Var.setText("");
                                    break;
                                } else {
                                    b9Var.setText(org.telegram.messenger.cd.L0(2131752376, "ChannelMembersInfo"));
                                    break;
                                }
                            }
                        } else if (prVar.y0 == -1) {
                            b9Var.setText("");
                            break;
                        } else if (!z17) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131748660, "MegaAdminsInfo"));
                            break;
                        } else {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131752515, "ChannelAdminsInfo"));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131748253, null));
                            break;
                        } else {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131748254, null));
                            break;
                        }
                    } else {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131748255, null));
                        break;
                    }
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131752462, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.a(org.telegram.ui.ActionBar.t6.m6, org.telegram.ui.ActionBar.t6.G6);
                if (i10 != prVar.y0) {
                    if (i10 != prVar.u0) {
                        if (i10 != prVar.z0) {
                            if (i10 == prVar.s0) {
                                b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                                b5Var.b(R.drawable.msg_channel, 5, org.telegram.messenger.cd.L0(2131752883, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                            if ((!prVar.P || prVar.Q) && prVar.Y0 == -1 && !arrayList.isEmpty()) {
                                r15 = true;
                            }
                            b5Var.b(R.drawable.msg_link2, 5, org.telegram.messenger.cd.L0(2131752402, "ChannelInviteViaLink"), r15);
                            break;
                        }
                    } else {
                        b5Var.b(R.drawable.msg_log, 5, org.telegram.messenger.cd.L0(2131751080, null), prVar.w0 > prVar.u0);
                        break;
                    }
                } else if (i15 != 3) {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                                if (prVar.z0 != -1 || ((!prVar.P || prVar.Q) && prVar.Y0 == -1 && !arrayList.isEmpty())) {
                                    r15 = true;
                                }
                                if (!z17) {
                                    b5Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.cd.L0(2131754401, null), r15);
                                    break;
                                } else {
                                    b5Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.cd.L0(2131754383, null), r15);
                                    break;
                                }
                            }
                        } else {
                            b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                            b5Var.b(R.drawable.msg_admin_add, 5, org.telegram.messenger.cd.L0(2131752528, "ChannelAddAdmin"), !prVar.P || prVar.Q);
                            break;
                        }
                    } else {
                        b5Var.b(R.drawable.msg_user_remove, 5, org.telegram.messenger.cd.L0(2131752452, "ChannelBlockUser"), false);
                        break;
                    }
                } else {
                    b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                    b5Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.cd.L0(2131752527, "ChannelAddException"), prVar.D0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 != prVar.C0) {
                    if (i10 != prVar.R) {
                        if (i10 != prVar.M0) {
                            if (i10 != prVar.r0) {
                                if (i10 == prVar.o0) {
                                    p4Var.setText(org.telegram.messenger.cd.L0(2131749433, null));
                                    break;
                                }
                            } else {
                                p4Var.setText(org.telegram.messenger.cd.L0(2131752884, null));
                                break;
                            }
                        } else {
                            p4Var.setText(org.telegram.messenger.cd.L0(2131745328, null));
                            break;
                        }
                    } else {
                        p4Var.setText(org.telegram.messenger.cd.L0(z16 ? 2131751885 : 2131752332, null));
                        break;
                    }
                } else if (i15 != 0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131752308, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = prVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131752451, null));
                        break;
                    } else {
                        p4Var.setText(org.telegram.messenger.cd.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String L03 = org.telegram.messenger.cd.L0(2131752453, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = prVar.r;
                x9Var.c(L03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = s8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.t6.r7;
                int i20 = org.telegram.ui.ActionBar.t6.V6;
                int i21 = org.telegram.ui.ActionBar.t6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z38 = s8Var.getTag() != null && ((Integer) s8Var.getTag()).intValue() == i10;
                s8Var.setTag(Integer.valueOf(i10));
                if (i10 == prVar.f0) {
                    s8Var.d(org.telegram.messenger.cd.L0(z16 ? 2131751967 : 2131743742, null), (prVar.D.change_info || org.telegram.messenger.w3.t0(prVar.n)) ? false : true, prVar.k0 != -1, z38);
                } else if (i10 == prVar.l0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131751966, null), !prVar.D.manage_linked_peers, false, z38);
                } else if (i10 == prVar.g0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743737, "UserRestrictionsInviteUsers"), !prVar.D.invite_users, true, z38);
                } else if (i10 == prVar.h0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743718, null), (prVar.D.pin_messages || org.telegram.messenger.w3.t0(prVar.n)) ? false : true, true, z38);
                } else if (i10 == prVar.i0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743739, null), !prVar.D.edit_rank, true, z38);
                } else if (i10 == prVar.S) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743711, "UserRestrictionsSendText"), !prVar.D.send_plain, true, z38);
                } else if (i10 == prVar.P0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131749418, null), prVar.q1, false, z38);
                    s8Var.getCheckBox().setDrawIconType(0);
                    s8Var.getCheckBox().d(org.telegram.ui.ActionBar.t6.M6, org.telegram.ui.ActionBar.t6.N6, i21, i21);
                } else if (i10 == prVar.T) {
                    int r02 = pr.r0(prVar.D);
                    s8Var.d(org.telegram.messenger.cd.L0(2131743716, "UserRestrictionsSendMedia"), r02 > 0, true, z38);
                    Locale locale = Locale.US;
                    s8Var.a(new j9.u(this, s8Var, false, 26), a1.g.k(r02, "/10"), !prVar.k1);
                } else if (i10 == prVar.d0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743712, "UserRestrictionsSendStickers"), !prVar.D.send_stickers, true, z38);
                } else if (i10 == prVar.e0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743738, "UserRestrictionsEmbedLinks"), !prVar.D.embed_links, true, z38);
                } else if (i10 == prVar.c0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131743714, "UserRestrictionsSendPollsShort"), !prVar.D.send_polls, true, false);
                } else if (i10 == prVar.k0) {
                    s8Var.d(org.telegram.messenger.cd.L0(2131751701, "CreateTopicsPermission"), !prVar.D.manage_topics, false, z38);
                }
                if (i10 == prVar.h0 || i10 == prVar.f0) {
                    i14 = ((org.telegram.ui.ActionBar.k2) prVar).currentAccount;
                    if (org.telegram.messenger.w3.Z(i14, prVar.M)) {
                        s8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!org.telegram.messenger.w3.w(2, prVar.n)) {
                    s8Var.setIcon(0);
                    break;
                } else if ((i10 == prVar.g0 && !org.telegram.messenger.w3.y(3, prVar.n)) || ((i10 == prVar.h0 && !org.telegram.messenger.w3.y(0, prVar.n)) || ((i10 == prVar.f0 && !org.telegram.messenger.w3.y(1, prVar.n)) || ((i10 == prVar.k0 && !org.telegram.messenger.w3.y(15, prVar.n)) || (org.telegram.messenger.w3.t0(prVar.n) && (i10 == prVar.h0 || i10 == prVar.f0)))))) {
                    s8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    s8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                if (i10 != prVar.Y0) {
                    if (i10 != prVar.V0) {
                        if (i10 != prVar.S0) {
                            if (i10 == prVar.f1) {
                                z3Var.setText("");
                                break;
                            }
                        } else if (org.telegram.messenger.w3.T(prVar.n) && !prVar.n.megagroup) {
                            z3Var.setText(org.telegram.messenger.cd.L0(2131752424, "ChannelContacts"));
                            break;
                        } else {
                            z3Var.setText(org.telegram.messenger.cd.L0(2131749465, "GroupContacts"));
                            break;
                        }
                    } else {
                        z3Var.setText(org.telegram.messenger.cd.L0(2131752448, "ChannelBots"));
                        break;
                    }
                } else if (org.telegram.messenger.w3.T(prVar.n) && !prVar.n.megagroup) {
                    z3Var.setText(org.telegram.messenger.cd.L0(2131752334, "ChannelOtherSubscribers"));
                    break;
                } else {
                    z3Var.setText(org.telegram.messenger.cd.L0(2131752336, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.zz zzVar = (org.telegram.ui.Components.zz) view;
                if (i15 != 0) {
                    zzVar.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = prVar.r;
                    zzVar.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i10 != prVar.w0) {
                    if (i10 != prVar.I0) {
                        if (i10 == prVar.K0) {
                            p8Var.getCheckBox().setIcon(0);
                            String L04 = org.telegram.messenger.cd.L0(2131752379, null);
                            TLRPC.Chat chat = prVar.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z18 = false;
                            }
                            p8Var.l(L04, z18, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = p8Var.getCheckBox();
                        if (org.telegram.messenger.w3.y(2, prVar.n) && ((chatFull = prVar.r) == null || chatFull.participants_hidden || prVar.p0() >= prVar.getMessagesController().h5)) {
                            i17 = 0;
                        }
                        checkBox2.setIcon(i17);
                        String L05 = org.telegram.messenger.cd.L0(2131752405, null);
                        TLRPC.ChatFull chatFull6 = prVar.r;
                        p8Var.l(L05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = p8Var.getCheckBox();
                    if (org.telegram.messenger.w3.y(13, prVar.n) && ((chatFull2 = prVar.r) == null || chatFull2.antispam || prVar.p0() >= prVar.getMessagesController().g5)) {
                        i17 = 0;
                    }
                    checkBox3.setIcon(i17);
                    String L06 = org.telegram.messenger.cd.L0(2131752467, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = prVar.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r15 = true;
                    }
                    p8Var.n(R.drawable.msg_policy, L06, r15);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z39 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i10;
                c2Var.setTag(Integer.valueOf(i10));
                if (i10 != prVar.U) {
                    if (i10 != prVar.V) {
                        if (i10 != prVar.W) {
                            if (i10 != prVar.X) {
                                if (i10 != prVar.Y) {
                                    if (i10 != prVar.Z) {
                                        if (i10 != prVar.a0) {
                                            if (i10 != prVar.b0) {
                                                if (i10 != prVar.j0) {
                                                    if (i10 != prVar.c0) {
                                                        c2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.cd.L0(2131745619, "SendMediaPolls"), "", !prVar.D.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.cd.L0(2131743713, null), "", !prVar.D.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String L07 = org.telegram.messenger.cd.L0(2131745627, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = prVar.D;
                                                c2Var.e(L07, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.cd.L0(2131745623, "SendMediaPermissionRound"), "", !prVar.D.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.cd.L0(2131745620, "SendMediaPermissionVoice"), "", !prVar.D.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.cd.L0(2131745626, "SendMediaPermissionFiles"), "", !prVar.D.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.cd.L0(2131745625, "SendMediaPermissionMusic"), "", !prVar.D.send_audios, true, z39);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.cd.L0(2131745622, "SendMediaPermissionStickersGifs"), "", !prVar.D.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        c2Var.e(org.telegram.messenger.cd.L0(2131745621, "SendMediaPermissionVideos"), "", !prVar.D.send_videos, true, z39);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.cd.L0(2131745624, "SendMediaPermissionPhotos"), "", !prVar.D.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                if (i10 != prVar.g1) {
                    if (i10 != prVar.h1) {
                        if (i10 == prVar.m0) {
                            t8Var.f(org.telegram.messenger.cd.L0(2131749435, null), prVar.x1, false);
                            break;
                        }
                    } else {
                        t8Var.f(org.telegram.messenger.cd.L0(2131752293, null), prVar.v1, false);
                        break;
                    }
                } else {
                    String L08 = org.telegram.messenger.cd.L0(2131752295, null);
                    boolean z40 = prVar.u1;
                    t8Var.f(L08, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                if (i10 == prVar.p0) {
                    int[] a2 = org.telegram.ui.Cells.x7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) prVar.getMessagesController().J6);
                    int k10 = (int) Utilities.k(prVar.z1, prVar.getMessagesController().J6, 1L);
                    org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(8);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = m5Var;
                    x7Var.d(k10, w7Var, new s3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        View view;
        View view2;
        int i11 = 1;
        Context context = this.c;
        pr prVar = this.d;
        switch (i10) {
            case 0:
                int i12 = prVar.N;
                org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5((i12 == 0 || i12 == 3) ? 7 : 6, (i12 == 0 || i12 == 3) ? 6 : 2, this.c, null, prVar.d1 == 0);
                e5Var.setDelegate(new kr(this, r8));
                view2 = e5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.b5(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                if (!prVar.s) {
                    if (!prVar.w) {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131748253, null));
                        view = b9Var;
                        break;
                    } else {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131748254, null));
                        view = b9Var;
                        break;
                    }
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131748255, null));
                    view = b9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.c, org.telegram.ui.ActionBar.t6.L6, 21, 11, false, null);
                p4Var.setHeight(43);
                view2 = p4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) prVar).resourceProvider;
                View z3Var = new org.telegram.ui.Cells.z3(26, context, p6Var);
                z3Var.setBackground(null);
                view = z3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.yu0 yu0Var = new org.telegram.ui.Components.yu0(context, null);
                yu0Var.b(prVar.o1, null, org.telegram.messenger.cd.L0(2131745323, "SlowmodeOff"), org.telegram.messenger.cd.a0(null, null, 2131745322, 5), org.telegram.messenger.cd.a0(null, null, 2131745322, 10), org.telegram.messenger.cd.a0(null, null, 2131745322, 30), org.telegram.messenger.cd.a0(null, null, 2131745324, 1), org.telegram.messenger.cd.a0(null, null, 2131745324, 5), org.telegram.messenger.cd.a0(null, null, 2131745324, 15), org.telegram.messenger.cd.a0(null, null, 2131745327, 1));
                yu0Var.setCallback(new kr(this, i11));
                view = yu0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.v4(context, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(6);
                zzVar.x = false;
                zzVar.setUseHeaderOffset(false);
                zzVar.setPaddingLeft(org.telegram.messenger.i0.L(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int L = org.telegram.messenger.i0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(30.0f);
                zzVar.setLayoutParams(o0Var);
                view = zzVar;
                break;
            case 12:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, this.c, prVar.getResourceProvider(), false, true);
                p8Var.w = 50;
                view = p8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, this.c, prVar.getResourceProvider(), false);
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
                c2Var.setEnabled(true);
                view = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.yu0 yu0Var2 = new org.telegram.ui.Components.yu0(context, null);
                Drawable[] drawableArr = {prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i13 = prVar.r1;
                yu0Var2.b(i13 > 0 ? i13 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                yu0Var2.setCallback(new kr(this, r5));
                view2 = yu0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.t8(context, prVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.x7(context, prVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.ck0(view);
    }
}
