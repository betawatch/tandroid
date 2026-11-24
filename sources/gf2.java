// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gf2 extends n39 {
    public final Context c;
    public final /* synthetic */ kf2 d;

    public gf2(kf2 kf2Var, Context context) {
        this.d = kf2Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r6 != r5.L0) goto L33;
     */
    @Override // n39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 16) {
            kf2 kf2Var = this.d;
            if (i == 7 || i == 14) {
                return hc2.w(2, kf2Var.n);
            }
            if (i == 0) {
                Object currentObject = ((gh6) s49Var.a).getCurrentObject();
                if (kf2Var.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b = s49Var.b();
                if (i != 0 && i != 2 && i != 6) {
                    if (i == 12) {
                        if (b == kf2Var.x0) {
                            return hc2.y(13, kf2Var.n);
                        }
                        if (b == kf2Var.J0) {
                            return hc2.y(2, kf2Var.n);
                        }
                    }
                    if (i != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i) {
        kf2 kf2Var = this.d;
        int i2 = kf2Var.E0;
        if (i >= i2 && i < kf2Var.F0) {
            return (TLObject) kf2Var.F.get(i - i2);
        }
        int i3 = kf2Var.U0;
        if (i >= i3 && i < kf2Var.V0) {
            return (TLObject) kf2Var.H.get(i - i3);
        }
        int i4 = kf2Var.X0;
        if (i < i4 || i >= kf2Var.Y0) {
            return null;
        }
        return (TLObject) kf2Var.G.get(i - i4);
    }

    @Override // w39
    public final int b() {
        return this.d.d1;
    }

    @Override // w39
    public final int d(int i) {
        kf2 kf2Var = this.d;
        if (i == kf2Var.z0 || i == kf2Var.A0 || i == kf2Var.v0 || i == kf2Var.t0) {
            return 2;
        }
        if (i >= kf2Var.E0 && i < kf2Var.F0) {
            return 0;
        }
        if (i >= kf2Var.X0 && i < kf2Var.Y0) {
            return 0;
        }
        if (i >= kf2Var.U0 && i < kf2Var.V0) {
            return 0;
        }
        if (i == kf2Var.C0 || i == kf2Var.G0 || i == kf2Var.H0) {
            return 3;
        }
        if (i == kf2Var.D0 || i == kf2Var.S || i == kf2Var.N0 || i == kf2Var.s0 || i == kf2Var.p0) {
            return 5;
        }
        if (i == kf2Var.b1 || i == kf2Var.P0 || i == kf2Var.R0 || i == kf2Var.u0 || i == kf2Var.y0 || i == kf2Var.K0 || i == kf2Var.M0 || i == kf2Var.j1 || i == kf2Var.o0 || i == kf2Var.r0) {
            return 1;
        }
        if (i == kf2Var.c1) {
            return 4;
        }
        if (i == kf2Var.B0) {
            return 6;
        }
        if (i == kf2Var.g0 || i == kf2Var.h0 || i == kf2Var.m0 || i == kf2Var.i0 || i == kf2Var.j0 || i == kf2Var.T || i == kf2Var.e0 || i == kf2Var.f0 || i == kf2Var.l0 || i == kf2Var.Q0) {
            return 7;
        }
        if (i == kf2Var.Z0 || i == kf2Var.T0 || i == kf2Var.W0 || i == kf2Var.g1) {
            return 8;
        }
        if (i == kf2Var.O0) {
            return 9;
        }
        if (i == kf2Var.a1) {
            return 10;
        }
        if (i == kf2Var.f1) {
            return 11;
        }
        if (i == kf2Var.x0 || i == kf2Var.J0 || i == kf2Var.L0) {
            return 12;
        }
        if (kf2Var.p0(i)) {
            return 13;
        }
        if (i == kf2Var.U) {
            return 14;
        }
        if (i == kf2Var.S0) {
            return 15;
        }
        if (i == kf2Var.h1 || i == kf2Var.i1 || i == kf2Var.n0) {
            return 16;
        }
        return i == kf2Var.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:472:0x0865, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x087e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x087c, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0bd4  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        Object[] objArr;
        long j;
        boolean z;
        long j2;
        int i3;
        boolean z2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z3;
        long j3;
        long j4;
        boolean z4;
        int i4;
        Object[] objArr2;
        TLObject K0;
        boolean z5;
        CharSequence charSequence;
        TLRPC.User V1;
        CharSequence M0;
        boolean z6;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TLRPC.User V12;
        int i5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        kf2 kf2Var = this.d;
        int i6 = s49Var.f;
        View view = s49Var.a;
        CharSequence charSequence4 = "";
        int i7 = R.drawable.permission_locked;
        r13 = true;
        r13 = true;
        boolean z7 = true;
        switch (i6) {
            case 0:
                gh6 gh6Var = (gh6) view;
                gh6Var.setTag(Integer.valueOf(i));
                TLObject E = E(i);
                if (i < kf2Var.E0 || i >= (i2 = kf2Var.F0)) {
                    if (i >= kf2Var.U0 && i < (i2 = kf2Var.V0)) {
                        if (hc2.T(kf2Var.n)) {
                            break;
                        }
                    } else {
                        i2 = kf2Var.Y0;
                    }
                    objArr = false;
                } else {
                    if (hc2.T(kf2Var.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    long j5 = ((TLRPC.User) E).id;
                    z = false;
                    z2 = false;
                    i3 = 0;
                    z3 = false;
                    j = 0;
                    j2 = 0;
                    tL_chatBannedRights = null;
                    j3 = j5;
                    j4 = 0;
                } else if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    long B1 = k27.B1(channelParticipant.peer);
                    j = 0;
                    long j6 = channelParticipant.kicked_by;
                    j4 = channelParticipant.promoted_by;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                    int i8 = channelParticipant.date;
                    boolean z8 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    boolean z9 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    z2 = z9;
                    j3 = B1;
                    j2 = j6;
                    i3 = i8;
                    z3 = z8;
                } else {
                    j = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        long j7 = chatParticipant.user_id;
                        int i9 = chatParticipant.date;
                        boolean z10 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        j2 = 0;
                        i3 = i9;
                        z2 = z10;
                        tL_chatBannedRights = null;
                        z3 = false;
                        j3 = j7;
                        j4 = 0;
                    }
                }
                if (j3 > j) {
                    z4 = z;
                    K0 = kf2Var.getMessagesController().V1(Long.valueOf(j3));
                    i4 = i2;
                    objArr2 = objArr;
                } else {
                    z4 = z;
                    i4 = i2;
                    objArr2 = objArr;
                    K0 = kf2Var.getMessagesController().K0(Long.valueOf(-j3));
                }
                if (K0 != null) {
                    int i10 = kf2Var.O;
                    if (i10 != 3) {
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    gh6Var.c(K0, null, (!objArr2 == true || i3 == 0) ? null : k96.B(i3), i != i4 + (-1));
                                    break;
                                }
                            } else {
                                if (!z2) {
                                    if (!z4 || (V1 = kf2Var.getMessagesController().V1(Long.valueOf(j4))) == null) {
                                        z5 = false;
                                        charSequence = null;
                                    } else if (V1.id == j3) {
                                        M0 = k96.M0(2131752506, null);
                                    } else {
                                        z5 = false;
                                        charSequence = k96.a0(null, null, 2131751296, l7c.q(V1));
                                    }
                                    gh6Var.c(K0, null, charSequence, i == i4 + (-1) ? true : z5);
                                    break;
                                } else {
                                    M0 = k96.M0(2131752411, null);
                                }
                                charSequence = M0;
                                z5 = false;
                                gh6Var.c(K0, null, charSequence, i == i4 + (-1) ? true : z5);
                            }
                        } else {
                            if (!z3 || (V12 = kf2Var.getMessagesController().V1(Long.valueOf(j2))) == null) {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = null;
                            } else {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = k96.a0(null, null, 2131743493, l7c.q(V12));
                            }
                            gh6Var.c(K0, charSequence2, charSequence3, i != i4 + (-1) ? z6 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights != null) {
                            StringBuilder sb = new StringBuilder();
                            boolean z11 = tL_chatBannedRights.view_messages;
                            if (z11 && kf2Var.E.view_messages != z11) {
                                sb.append(k96.M0(2131743466, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && kf2Var.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743456, "UserRestrictionsNoSendText"));
                            }
                            boolean z12 = tL_chatBannedRights.send_media;
                            if (!z12 || kf2Var.E.send_media == z12) {
                                boolean z13 = tL_chatBannedRights.send_photos;
                                if (z13 && kf2Var.E.send_photos != z13) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743461, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z14 = tL_chatBannedRights.send_videos;
                                if (z14 && kf2Var.E.send_videos != z14) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743455, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z15 = tL_chatBannedRights.send_audios;
                                if (z15 && kf2Var.E.send_audios != z15) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743462, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z16 = tL_chatBannedRights.send_docs;
                                if (z16 && kf2Var.E.send_docs != z16) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743464, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z17 = tL_chatBannedRights.send_voices;
                                if (z17 && kf2Var.E.send_voices != z17) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743454, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z18 = tL_chatBannedRights.send_roundvideos;
                                if (z18 && kf2Var.E.send_roundvideos != z18) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(k96.M0(2131743458, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743463, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z19 = tL_chatBannedRights.send_stickers;
                            if (z19 && kf2Var.E.send_stickers != z19) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743457, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z20 = tL_chatBannedRights.send_polls;
                            if (z20 && kf2Var.E.send_polls != z20) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743460, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z21 = tL_chatBannedRights.embed_links;
                            if (z21 && !tL_chatBannedRights.send_plain && kf2Var.E.embed_links != z21) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743469, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z22 = tL_chatBannedRights.invite_users;
                            if (z22 && kf2Var.E.invite_users != z22) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743468, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z23 = tL_chatBannedRights.pin_messages;
                            if (z23 && kf2Var.E.pin_messages != z23) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743467, null));
                            }
                            boolean z24 = tL_chatBannedRights.edit_rank;
                            if (z24 && kf2Var.E.edit_rank != z24) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743470, null));
                            }
                            boolean z25 = tL_chatBannedRights.send_reactions;
                            if (z25 && kf2Var.E.send_reactions != z25) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743459, null));
                            }
                            boolean z26 = tL_chatBannedRights.change_info;
                            if (z26 && kf2Var.E.change_info != z26) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(k96.M0(2131743471, null));
                            }
                            if (sb.length() != 0) {
                                sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
                                sb.append('.');
                            }
                            charSequence4 = sb.toString();
                        }
                        gh6Var.c(K0, null, charSequence4, i != i4 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                mhb mhbVar = (mhb) view;
                if (i != kf2Var.y0) {
                    if (i != kf2Var.b1) {
                        if (i != kf2Var.P0) {
                            if (i != kf2Var.o0) {
                                if (i != kf2Var.r0) {
                                    if (i != kf2Var.K0) {
                                        if (i != kf2Var.M0) {
                                            if (i != kf2Var.u0) {
                                                if (i != kf2Var.R0) {
                                                    if (i == kf2Var.j1) {
                                                        mhbVar.setText(k96.M0(kf2Var.v1 ? 2131752280 : 2131752284, null));
                                                        break;
                                                    }
                                                } else if (!kf2Var.r1) {
                                                    mhbVar.setText(k96.M0(2131749216, null));
                                                    break;
                                                } else {
                                                    mhbVar.setText(k96.M0(2131749215, null));
                                                    break;
                                                }
                                            } else {
                                                mhbVar.setText(k96.M0(2131752870, null));
                                                break;
                                            }
                                        } else {
                                            mhbVar.setText(k96.M0(2131752366, null));
                                            break;
                                        }
                                    } else {
                                        mhbVar.setText(k96.M0(2131752392, null));
                                        break;
                                    }
                                } else {
                                    mhbVar.setText(k96.a0(null, null, 2131749231, bc.I0(kf2Var.getMessagesController().k4.I1.f()), String.valueOf(((int) (kf2Var.getMessagesController().k4.s3.i * ((kf2Var.A1 * (kf2Var.getMessagesController().k4.I1.f() / 1000.0f)) / 1000.0d))) / 100.0d)));
                                    break;
                                }
                            } else {
                                mhbVar.setText(k96.M0(2131749233, null));
                                break;
                            }
                        } else {
                            int m0 = kf2.m0(kf2Var.p1);
                            if (kf2Var.r != null && m0 != 0) {
                                mhbVar.setText(k96.a0(null, null, 2131745115, m0 < 60 ? k96.G(m0, "Seconds", new Object[0]) : m0 < 3600 ? k96.G(m0 / 60, "Minutes", new Object[0]) : k96.G((m0 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                mhbVar.setText(k96.M0(2131745116, null));
                                break;
                            }
                        }
                    } else {
                        int i11 = kf2Var.O;
                        if (i11 != 0 && i11 != 3) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    if (!kf2Var.s || kf2Var.e1 != 0) {
                                        mhbVar.setText("");
                                        break;
                                    } else {
                                        mhbVar.setText(k96.M0(2131752364, "ChannelMembersInfo"));
                                        break;
                                    }
                                }
                            } else if (kf2Var.z0 == -1) {
                                mhbVar.setText("");
                                break;
                            } else if (!kf2Var.s) {
                                mhbVar.setText(k96.M0(2131748453, "MegaAdminsInfo"));
                                break;
                            } else {
                                mhbVar.setText(k96.M0(2131752503, "ChannelAdminsInfo"));
                                break;
                            }
                        } else if (!kf2Var.s) {
                            if (!kf2Var.w) {
                                mhbVar.setText(k96.M0(2131748044, null));
                                break;
                            } else {
                                mhbVar.setText(k96.M0(2131748045, null));
                                break;
                            }
                        } else {
                            mhbVar.setText(k96.M0(2131748046, null));
                            break;
                        }
                    }
                } else {
                    mhbVar.setText(k96.M0(2131752450, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                dh6 dh6Var = (dh6) view;
                dh6Var.a(bkb.l6, bkb.F6);
                if (i != kf2Var.z0) {
                    if (i != kf2Var.v0) {
                        if (i != kf2Var.A0) {
                            if (i == kf2Var.t0) {
                                dh6Var.a(bkb.u6, bkb.t6);
                                dh6Var.b(R.drawable.msg_channel, 5, k96.M0(2131752871, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            dh6Var.a(bkb.u6, bkb.t6);
                            if ((!kf2Var.Q || kf2Var.R) && kf2Var.Z0 == -1 && !kf2Var.F.isEmpty()) {
                                r12 = true;
                            }
                            dh6Var.b(R.drawable.msg_link2, 5, k96.M0(2131752390, "ChannelInviteViaLink"), r12);
                            break;
                        }
                    } else {
                        dh6Var.b(R.drawable.msg_log, 5, k96.M0(2131751067, null), kf2Var.x0 > kf2Var.v0);
                        break;
                    }
                } else {
                    int i12 = kf2Var.O;
                    if (i12 != 3) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    dh6Var.a(bkb.u6, bkb.t6);
                                    if (kf2Var.A0 != -1 || ((!kf2Var.Q || kf2Var.R) && kf2Var.Z0 == -1 && !kf2Var.F.isEmpty())) {
                                        r12 = true;
                                    }
                                    if (!kf2Var.s) {
                                        dh6Var.b(R.drawable.msg_contact_add, 5, k96.M0(2131754398, null), r12);
                                        break;
                                    } else {
                                        dh6Var.b(R.drawable.msg_contact_add, 5, k96.M0(2131754380, null), r12);
                                        break;
                                    }
                                }
                            } else {
                                dh6Var.a(bkb.u6, bkb.t6);
                                dh6Var.b(R.drawable.msg_admin_add, 5, k96.M0(2131752516, "ChannelAddAdmin"), !kf2Var.Q || kf2Var.R);
                                break;
                            }
                        } else {
                            dh6Var.b(R.drawable.msg_user_remove, 5, k96.M0(2131752440, "ChannelBlockUser"), false);
                            break;
                        }
                    } else {
                        dh6Var.a(bkb.u6, bkb.t6);
                        dh6Var.b(R.drawable.msg_contact_add, 5, k96.M0(2131752515, "ChannelAddException"), kf2Var.E0 != -1);
                        break;
                    }
                }
                break;
            case 5:
                ld5 ld5Var = (ld5) view;
                if (i != kf2Var.D0) {
                    if (i != kf2Var.S) {
                        if (i != kf2Var.N0) {
                            if (i != kf2Var.s0) {
                                if (i == kf2Var.p0) {
                                    ld5Var.setText(k96.M0(2131749232, null));
                                    break;
                                }
                            } else {
                                ld5Var.setText(k96.M0(2131752872, null));
                                break;
                            }
                        } else {
                            ld5Var.setText(k96.M0(2131745118, null));
                            break;
                        }
                    } else {
                        ld5Var.setText(k96.M0(kf2Var.w ? 2131751873 : 2131752320, null));
                        break;
                    }
                } else if (kf2Var.O != 0) {
                    ld5Var.setText(k96.M0(2131752296, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = kf2Var.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : kf2Var.F.size();
                    if (size == 0) {
                        ld5Var.setText(k96.M0(2131752439, null));
                        break;
                    } else {
                        ld5Var.setText(k96.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                uib uibVar = (uib) view;
                String M02 = k96.M0(2131752441, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = kf2Var.r;
                uibVar.c(M02, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                zgb zgbVar = (zgb) view;
                zgbVar.getCheckBox().setDrawIconType(1);
                Switch checkBox = zgbVar.getCheckBox();
                int i13 = bkb.q7;
                int i14 = bkb.U6;
                int i15 = bkb.c6;
                checkBox.d(i13, i14, i15, i15);
                boolean z27 = zgbVar.getTag() != null && ((Integer) zgbVar.getTag()).intValue() == i;
                zgbVar.setTag(Integer.valueOf(i));
                if (i == kf2Var.g0) {
                    zgbVar.d(k96.M0(kf2Var.w ? 2131751955 : 2131743477, null), (kf2Var.E.change_info || hc2.t0(kf2Var.n)) ? false : true, kf2Var.l0 != -1, z27);
                } else if (i == kf2Var.m0) {
                    zgbVar.d(k96.M0(2131751954, null), !kf2Var.E.manage_linked_peers, false, z27);
                } else if (i == kf2Var.h0) {
                    zgbVar.d(k96.M0(2131743472, "UserRestrictionsInviteUsers"), !kf2Var.E.invite_users, true, z27);
                } else if (i == kf2Var.i0) {
                    zgbVar.d(k96.M0(2131743453, null), (kf2Var.E.pin_messages || hc2.t0(kf2Var.n)) ? false : true, true, z27);
                } else if (i == kf2Var.j0) {
                    zgbVar.d(k96.M0(2131743474, null), !kf2Var.E.edit_rank, true, z27);
                } else if (i == kf2Var.T) {
                    zgbVar.d(k96.M0(2131743446, "UserRestrictionsSendText"), !kf2Var.E.send_plain, true, z27);
                } else if (i == kf2Var.Q0) {
                    zgbVar.d(k96.M0(2131749217, null), kf2Var.r1, false, z27);
                    zgbVar.getCheckBox().setDrawIconType(0);
                    zgbVar.getCheckBox().d(bkb.L6, bkb.M6, i15, i15);
                } else if (i == kf2Var.U) {
                    int n0 = kf2.n0(kf2Var.E);
                    zgbVar.d(k96.M0(2131743451, "UserRestrictionsSendMedia"), n0 > 0, true, z27);
                    Locale locale = Locale.US;
                    zgbVar.a(new tq4(this, zgbVar, false, (byte) 5), oo1.n(n0, "/10"), !kf2Var.l1);
                } else if (i == kf2Var.e0) {
                    zgbVar.d(k96.M0(2131743447, "UserRestrictionsSendStickers"), !kf2Var.E.send_stickers, true, z27);
                } else if (i == kf2Var.f0) {
                    zgbVar.d(k96.M0(2131743473, "UserRestrictionsEmbedLinks"), !kf2Var.E.embed_links, true, z27);
                } else if (i == kf2Var.d0) {
                    zgbVar.d(k96.M0(2131743449, "UserRestrictionsSendPollsShort"), !kf2Var.E.send_polls, true, false);
                } else if (i == kf2Var.l0) {
                    zgbVar.d(k96.M0(2131751688, "CreateTopicsPermission"), !kf2Var.E.manage_topics, false, z27);
                }
                if (i == kf2Var.i0 || i == kf2Var.g0) {
                    i5 = ((d) kf2Var).currentAccount;
                    if (hc2.Z(i5, kf2Var.N)) {
                        zgbVar.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!hc2.w(2, kf2Var.n)) {
                    zgbVar.setIcon(0);
                    break;
                } else if ((i == kf2Var.h0 && !hc2.y(3, kf2Var.n)) || ((i == kf2Var.i0 && !hc2.y(0, kf2Var.n)) || ((i == kf2Var.g0 && !hc2.y(1, kf2Var.n)) || ((i == kf2Var.l0 && !hc2.y(15, kf2Var.n)) || (hc2.t0(kf2Var.n) && (i == kf2Var.i0 || i == kf2Var.g0)))))) {
                    zgbVar.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    zgbVar.setIcon(0);
                    break;
                }
                break;
            case 8:
                l35 l35Var = (l35) view;
                if (i != kf2Var.Z0) {
                    if (i != kf2Var.W0) {
                        if (i != kf2Var.T0) {
                            if (i == kf2Var.g1) {
                                l35Var.setText("");
                                break;
                            }
                        } else if (hc2.T(kf2Var.n) && !kf2Var.n.megagroup) {
                            l35Var.setText(k96.M0(2131752412, "ChannelContacts"));
                            break;
                        } else {
                            l35Var.setText(k96.M0(2131749264, "GroupContacts"));
                            break;
                        }
                    } else {
                        l35Var.setText(k96.M0(2131752436, "ChannelBots"));
                        break;
                    }
                } else if (hc2.T(kf2Var.n) && !kf2Var.n.megagroup) {
                    l35Var.setText(k96.M0(2131752322, "ChannelOtherSubscribers"));
                    break;
                } else {
                    l35Var.setText(k96.M0(2131752324, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                pi4 pi4Var = (pi4) view;
                if (kf2Var.O != 0) {
                    pi4Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = kf2Var.r;
                    pi4Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                wgb wgbVar = (wgb) view;
                if (i != kf2Var.x0) {
                    if (i != kf2Var.J0) {
                        if (i == kf2Var.L0) {
                            wgbVar.getCheckBox().setIcon(0);
                            String M03 = k96.M0(2131752367, null);
                            TLRPC.Chat chat = kf2Var.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z7 = false;
                            }
                            wgbVar.l(M03, z7, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = wgbVar.getCheckBox();
                        if (hc2.y(2, kf2Var.n) && ((chatFull = kf2Var.r) == null || chatFull.participants_hidden || kf2Var.l0() >= kf2Var.getMessagesController().k4.r1.f())) {
                            i7 = 0;
                        }
                        checkBox2.setIcon(i7);
                        String M04 = k96.M0(2131752393, null);
                        TLRPC.ChatFull chatFull6 = kf2Var.r;
                        wgbVar.l(M04, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = wgbVar.getCheckBox();
                    if (hc2.y(13, kf2Var.n) && ((chatFull2 = kf2Var.r) == null || chatFull2.antispam || kf2Var.l0() >= kf2Var.getMessagesController().k4.q1.f())) {
                        i7 = 0;
                    }
                    checkBox3.setIcon(i7);
                    String M05 = k96.M0(2131752455, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = kf2Var.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r12 = true;
                    }
                    wgbVar.n(R.drawable.msg_policy, M05, r12);
                    break;
                }
                break;
            case 13:
                ag2 ag2Var = (ag2) view;
                boolean z28 = ag2Var.getTag() != null && ((Integer) ag2Var.getTag()).intValue() == i;
                ag2Var.setTag(Integer.valueOf(i));
                if (i != kf2Var.V) {
                    if (i != kf2Var.W) {
                        if (i != kf2Var.X) {
                            if (i != kf2Var.Y) {
                                if (i != kf2Var.Z) {
                                    if (i != kf2Var.a0) {
                                        if (i != kf2Var.b0) {
                                            if (i != kf2Var.c0) {
                                                if (i != kf2Var.k0) {
                                                    if (i != kf2Var.d0) {
                                                        ag2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        ag2Var.e(k96.M0(2131745410, "SendMediaPolls"), "", !kf2Var.E.send_polls, true, z28);
                                                        break;
                                                    }
                                                } else {
                                                    ag2Var.e(k96.M0(2131743448, null), "", !kf2Var.E.send_reactions, false, z28);
                                                    break;
                                                }
                                            } else {
                                                String M06 = k96.M0(2131745418, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = kf2Var.E;
                                                ag2Var.e(M06, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z28);
                                                break;
                                            }
                                        } else {
                                            ag2Var.e(k96.M0(2131745414, "SendMediaPermissionRound"), "", !kf2Var.E.send_roundvideos, true, z28);
                                            break;
                                        }
                                    } else {
                                        ag2Var.e(k96.M0(2131745411, "SendMediaPermissionVoice"), "", !kf2Var.E.send_voices, true, z28);
                                        break;
                                    }
                                } else {
                                    ag2Var.e(k96.M0(2131745417, "SendMediaPermissionFiles"), "", !kf2Var.E.send_docs, true, z28);
                                    break;
                                }
                            } else {
                                ag2Var.e(k96.M0(2131745416, "SendMediaPermissionMusic"), "", !kf2Var.E.send_audios, true, z28);
                                break;
                            }
                        } else {
                            ag2Var.e(k96.M0(2131745413, "SendMediaPermissionStickersGifs"), "", !kf2Var.E.send_stickers, true, z28);
                            break;
                        }
                    } else {
                        ag2Var.e(k96.M0(2131745412, "SendMediaPermissionVideos"), "", !kf2Var.E.send_videos, true, z28);
                        break;
                    }
                } else {
                    ag2Var.e(k96.M0(2131745415, "SendMediaPermissionPhotos"), "", !kf2Var.E.send_photos, true, z28);
                    break;
                }
                break;
            case 16:
                ahb ahbVar = (ahb) view;
                if (i != kf2Var.h1) {
                    if (i != kf2Var.i1) {
                        if (i == kf2Var.n0) {
                            ahbVar.f(k96.M0(2131749234, null), kf2Var.y1, false);
                            break;
                        }
                    } else {
                        ahbVar.f(k96.M0(2131752281, null), kf2Var.w1, false);
                        break;
                    }
                } else {
                    String M07 = k96.M0(2131752283, null);
                    boolean z29 = kf2Var.v1;
                    ahbVar.f(M07, z29, z29);
                    break;
                }
                break;
            case 17:
                ija ijaVar = (ija) view;
                if (i == kf2Var.q0) {
                    int[] a = ija.a(new int[]{1, 10, 50, 100, kk7.d3, kk7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) kf2Var.getMessagesController().k4.H1.f());
                    int k = (int) Utilities.k(kf2Var.A1, kf2Var.getMessagesController().k4.H1.f(), 1L);
                    k32 k32Var = new k32((byte) 3);
                    hja hjaVar = new hja();
                    hjaVar.c = a;
                    hjaVar.d = (byte) 20;
                    hjaVar.e = k32Var;
                    ijaVar.d(k, hjaVar, new be2(this, (byte) 23));
                    break;
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        View view;
        View view2;
        byte b = 1;
        Context context = this.c;
        kf2 kf2Var = this.d;
        switch (i) {
            case 0:
                int i2 = kf2Var.O;
                gh6 gh6Var = new gh6(this.c, (i2 == 0 || i2 == 3) ? 7 : 6, (i2 == 0 || i2 == 3) ? (byte) 6 : (byte) 2, kf2Var.e1 == 0, null);
                gh6Var.setDelegate(new ff2(this, false ? 1 : 0));
                view2 = gh6Var;
                view = view2;
                break;
            case 1:
                view = new mhb(context);
                break;
            case 2:
                view = new dh6(context);
                break;
            case 3:
                view = new b9a(context, (de9) null);
                break;
            case 4:
                mhb mhbVar = new mhb(context);
                if (!kf2Var.s) {
                    if (!kf2Var.w) {
                        mhbVar.setText(k96.M0(2131748044, null));
                        view = mhbVar;
                        break;
                    } else {
                        mhbVar.setText(k96.M0(2131748045, null));
                        view = mhbVar;
                        break;
                    }
                } else {
                    mhbVar.setText(k96.M0(2131748046, null));
                    view = mhbVar;
                    break;
                }
            case 5:
                ld5 ld5Var = new ld5(this.c, bkb.K6, 21, 11, false, null);
                ld5Var.setHeight(43);
                view2 = ld5Var;
                view = view2;
                break;
            case 6:
                view = new uib(context);
                break;
            case 7:
            case 14:
                view = new zgb(context);
                break;
            case 8:
                wjbVar = ((d) kf2Var).resourceProvider;
                View l35Var = new l35(26, wjbVar, context);
                l35Var.setBackground(null);
                view = l35Var;
                break;
            case 9:
            default:
                fja fjaVar = new fja(context, null);
                fjaVar.b(kf2Var.p1, null, k96.M0(2131745113, "SlowmodeOff"), k96.a0(null, null, 2131745112, 5), k96.a0(null, null, 2131745112, 10), k96.a0(null, null, 2131745112, 30), k96.a0(null, null, 2131745114, 1), k96.a0(null, null, 2131745114, 5), k96.a0(null, null, 2131745114, 15), k96.a0(null, null, 2131745117, 1));
                fjaVar.setCallback(new ff2(this, b));
                view = fjaVar;
                break;
            case 10:
                view = new q86(context, gl.L(40.0f), gl.L(120.0f));
                break;
            case 11:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(6);
                pi4Var.x = false;
                pi4Var.setUseHeaderOffset(false);
                pi4Var.setPaddingLeft(gl.L(5.0f));
                e49 e49Var = new e49(-1, -1);
                int L = gl.L(12.0f);
                ((ViewGroup.MarginLayoutParams) e49Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) e49Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(30.0f);
                pi4Var.setLayoutParams(e49Var);
                view = pi4Var;
                break;
            case 12:
                wgb wgbVar = new wgb(23, kf2Var.getResourceProvider(), this.c, false, true);
                wgbVar.w = (byte) 50;
                view = wgbVar;
                break;
            case 13:
                ag2 ag2Var = new ag2(this.c, 4, 21, false, kf2Var.getResourceProvider());
                ag2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                ag2Var.setEnabled(true);
                view = ag2Var;
                break;
            case 15:
                fja fjaVar2 = new fja(context, null);
                Drawable[] drawableArr = {kf2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), kf2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), kf2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), kf2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), kf2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i3 = kf2Var.s1;
                fjaVar2.b(i3 > 0 ? i3 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                fjaVar2.setCallback(new ff2(this, r5));
                view2 = fjaVar2;
                view = view2;
                break;
            case 16:
                view = new ahb(context, kf2Var.getResourceProvider());
                break;
            case 17:
                view = new ija(context, kf2Var.getResourceProvider());
                break;
        }
        return new y29(view);
    }
}
