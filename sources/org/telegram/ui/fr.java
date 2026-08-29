package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fr extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ jr d;

    public fr(jr jrVar, Context context) {
        this.d = jrVar;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.H0) goto L42;
     */
    @Override // org.telegram.ui.Components.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 != 16) {
            jr jrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(jrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.z4) n1Var.a).getCurrentObject();
                if (jrVar.K != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = n1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == jrVar.t0) {
                            return ChatObject.canUserDoAdminAction(jrVar.r, 13);
                        }
                        if (b10 == jrVar.F0) {
                            return ChatObject.canUserDoAdminAction(jrVar.r, 2);
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
        jr jrVar = this.d;
        int i11 = jrVar.A0;
        if (i10 >= i11 && i10 < jrVar.B0) {
            return (TLObject) jrVar.B.get(i10 - i11);
        }
        int i12 = jrVar.Q0;
        if (i10 >= i12 && i10 < jrVar.R0) {
            return (TLObject) jrVar.D.get(i10 - i12);
        }
        int i13 = jrVar.T0;
        if (i10 < i13 || i10 >= jrVar.U0) {
            return null;
        }
        return (TLObject) jrVar.C.get(i10 - i13);
    }

    @Override // f2.p0
    public final int h() {
        return this.d.Z0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        jr jrVar = this.d;
        if (i10 == jrVar.v0 || i10 == jrVar.w0 || i10 == jrVar.r0 || i10 == jrVar.p0) {
            return 2;
        }
        if ((i10 >= jrVar.A0 && i10 < jrVar.B0) || ((i10 >= jrVar.T0 && i10 < jrVar.U0) || (i10 >= jrVar.Q0 && i10 < jrVar.R0))) {
            return 0;
        }
        if (i10 == jrVar.y0 || i10 == jrVar.C0 || i10 == jrVar.D0) {
            return 3;
        }
        if (i10 == jrVar.z0 || i10 == jrVar.O || i10 == jrVar.J0 || i10 == jrVar.o0 || i10 == jrVar.l0) {
            return 5;
        }
        if (i10 == jrVar.X0 || i10 == jrVar.L0 || i10 == jrVar.N0 || i10 == jrVar.q0 || i10 == jrVar.u0 || i10 == jrVar.G0 || i10 == jrVar.I0 || i10 == jrVar.f1 || i10 == jrVar.k0 || i10 == jrVar.n0) {
            return 1;
        }
        if (i10 == jrVar.Y0) {
            return 4;
        }
        if (i10 == jrVar.x0) {
            return 6;
        }
        if (i10 == jrVar.c0 || i10 == jrVar.d0 || i10 == jrVar.i0 || i10 == jrVar.e0 || i10 == jrVar.f0 || i10 == jrVar.P || i10 == jrVar.a0 || i10 == jrVar.b0 || i10 == jrVar.h0 || i10 == jrVar.M0) {
            return 7;
        }
        if (i10 == jrVar.V0 || i10 == jrVar.P0 || i10 == jrVar.S0 || i10 == jrVar.c1) {
            return 8;
        }
        if (i10 == jrVar.K0) {
            return 9;
        }
        if (i10 == jrVar.W0) {
            return 10;
        }
        if (i10 == jrVar.b1) {
            return 11;
        }
        if (i10 == jrVar.t0 || i10 == jrVar.F0 || i10 == jrVar.H0) {
            return 12;
        }
        if (jrVar.p0(i10)) {
            return 13;
        }
        if (i10 == jrVar.Q) {
            return 14;
        }
        if (i10 == jrVar.O0) {
            return 15;
        }
        if (i10 == jrVar.d1 || i10 == jrVar.e1 || i10 == jrVar.j0) {
            return 16;
        }
        return i10 == jrVar.m0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e5, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e7, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x07fd, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Removed duplicated region for block: B:472:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0871  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        CharSequence charSequence;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        long j13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        TLObject chat;
        CharSequence charSequence2;
        TLRPC.User user;
        TLRPC.User user2;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        jr jrVar = this.d;
        ArrayList arrayList = jrVar.B;
        boolean z16 = jrVar.w;
        boolean z17 = jrVar.v;
        int i14 = jrVar.K;
        int i15 = n1Var.f;
        View view = n1Var.a;
        int i16 = 0;
        r13 = false;
        boolean z18 = false;
        r13 = false;
        r13 = false;
        boolean z19 = false;
        r13 = false;
        r13 = false;
        boolean z20 = false;
        r14 = true;
        r14 = true;
        boolean z21 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
                z4Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < jrVar.A0 || i10 >= (i11 = jrVar.B0)) {
                    if (i10 >= jrVar.Q0 && i10 < (i11 = jrVar.R0)) {
                        if (ChatObject.isChannel(jrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = jrVar.U0;
                    }
                    z10 = false;
                } else {
                    if (ChatObject.isChannel(jrVar.r)) {
                        break;
                    }
                    z10 = false;
                }
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z12 = false;
                    z11 = false;
                    tL_chatBannedRights = null;
                    j12 = 0;
                    j13 = 0;
                    j10 = 0;
                } else if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    j11 = MessageObject.getPeerId(channelParticipant.peer);
                    charSequence = "";
                    long j14 = channelParticipant.kicked_by;
                    long j15 = channelParticipant.promoted_by;
                    j10 = 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                    int i17 = channelParticipant.date;
                    z13 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i16 = i17;
                    j12 = j14;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j13 = j15;
                    if (j11 <= j10) {
                        z14 = z12;
                        z15 = z11;
                        chat = jrVar.getMessagesController().getUser(Long.valueOf(j11));
                        i12 = i11;
                    } else {
                        z14 = z12;
                        z15 = z11;
                        i12 = i11;
                        chat = jrVar.getMessagesController().getChat(Long.valueOf(-j11));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        z4Var.b(chat, null, (!z10 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z14) {
                                        if (!z15 || (user = jrVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j11) {
                                            charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                        } else {
                                            charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                        }
                                        z4Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    z4Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                }
                            } else {
                                z4Var.b(chat, null, (!z13 || (user2 = jrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb2 = charSequence;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                boolean z22 = tL_chatBannedRights.view_messages;
                                if (z22 && jrVar.A.view_messages != z22) {
                                    sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && jrVar.A.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z23 = tL_chatBannedRights.send_media;
                                if (!z23 || jrVar.A.send_media == z23) {
                                    boolean z24 = tL_chatBannedRights.send_photos;
                                    if (z24 && jrVar.A.send_photos != z24) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_videos;
                                    if (z25 && jrVar.A.send_videos != z25) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_audios;
                                    if (z26 && jrVar.A.send_audios != z26) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_docs;
                                    if (z27 && jrVar.A.send_docs != z27) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_voices;
                                    if (z28 && jrVar.A.send_voices != z28) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z29 = tL_chatBannedRights.send_roundvideos;
                                    if (z29 && jrVar.A.send_roundvideos != z29) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                } else {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
                                }
                                boolean z30 = tL_chatBannedRights.send_stickers;
                                if (z30 && jrVar.A.send_stickers != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z31 = tL_chatBannedRights.send_polls;
                                if (z31 && jrVar.A.send_polls != z31) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z32 = tL_chatBannedRights.embed_links;
                                if (z32 && !tL_chatBannedRights.send_plain && jrVar.A.embed_links != z32) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z33 = tL_chatBannedRights.invite_users;
                                if (z33 && jrVar.A.invite_users != z33) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z34 = tL_chatBannedRights.pin_messages;
                                if (z34 && jrVar.A.pin_messages != z34) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z35 = tL_chatBannedRights.edit_rank;
                                if (z35 && jrVar.A.edit_rank != z35) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z36 = tL_chatBannedRights.send_reactions;
                                if (z36 && jrVar.A.send_reactions != z36) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z37 = tL_chatBannedRights.change_info;
                                if (z37 && jrVar.A.change_info != z37) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                }
                                if (sb3.length() != 0) {
                                    sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                    sb3.append('.');
                                }
                                sb2 = sb3.toString();
                            }
                            z4Var.b(chat, null, sb2, i10 != i12 + (-1));
                            break;
                        }
                    }
                } else {
                    charSequence = "";
                    j10 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j11 = chatParticipant.user_id;
                        int i18 = chatParticipant.date;
                        boolean z38 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z11 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z12 = z38;
                        j12 = 0;
                        j13 = 0;
                        tL_chatBannedRights = null;
                    }
                }
                z13 = false;
                if (j11 <= j10) {
                }
                if (chat == null) {
                }
                break;
            case 1:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 != jrVar.u0) {
                    if (i10 != jrVar.X0) {
                        if (i10 != jrVar.L0) {
                            if (i10 != jrVar.k0) {
                                if (i10 != jrVar.n0) {
                                    if (i10 != jrVar.G0) {
                                        if (i10 != jrVar.I0) {
                                            if (i10 != jrVar.q0) {
                                                if (i10 != jrVar.N0) {
                                                    if (i10 == jrVar.f1) {
                                                        y8Var.setText(LocaleController.getString(jrVar.r1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!jrVar.n1) {
                                                    y8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    y8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                y8Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            y8Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        y8Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    y8Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, ph.j.G0(jrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((jrVar.w1 * (jrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * jrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                y8Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = jr.m0(jrVar.l1);
                            if (jrVar.s != null && m0 != 0) {
                                y8Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                y8Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || jrVar.a1 != 0) {
                                    y8Var.setText("");
                                    break;
                                } else {
                                    y8Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (jrVar.v0 == -1) {
                            y8Var.setText("");
                            break;
                        } else if (!z17) {
                            y8Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            y8Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            y8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            y8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        y8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    y8Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
                w4Var.a(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                if (i10 != jrVar.v0) {
                    if (i10 != jrVar.r0) {
                        if (i10 != jrVar.w0) {
                            if (i10 == jrVar.p0) {
                                w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                                w4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                            if ((!jrVar.M || jrVar.N) && jrVar.V0 == -1 && !arrayList.isEmpty()) {
                                z20 = true;
                            }
                            w4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z20);
                            break;
                        }
                    } else {
                        w4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, jrVar.t0 > jrVar.r0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                                if (jrVar.w0 != -1 || ((!jrVar.M || jrVar.N) && jrVar.V0 == -1 && !arrayList.isEmpty())) {
                                    z19 = true;
                                }
                                if (!z17) {
                                    w4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                } else {
                                    w4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                }
                            }
                        } else {
                            w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                            w4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !jrVar.M || jrVar.N);
                            break;
                        }
                    } else {
                        w4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    w4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                    w4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, jrVar.A0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 != jrVar.z0) {
                    if (i10 != jrVar.O) {
                        if (i10 != jrVar.J0) {
                            if (i10 != jrVar.o0) {
                                if (i10 == jrVar.l0) {
                                    k4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                k4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            k4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        k4Var.setText(LocaleController.getString(z16 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    k4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = jrVar.s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        k4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        k4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = jrVar.s;
                y9Var.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = p8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.g6.r7;
                int i20 = org.telegram.ui.ActionBar.g6.V6;
                int i21 = org.telegram.ui.ActionBar.g6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z39 = p8Var.getTag() != null && ((Integer) p8Var.getTag()).intValue() == i10;
                p8Var.setTag(Integer.valueOf(i10));
                if (i10 == jrVar.c0) {
                    p8Var.d(LocaleController.getString(z16 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (jrVar.A.change_info || ChatObject.isPublic(jrVar.r)) ? false : true, jrVar.h0 != -1, z39);
                } else if (i10 == jrVar.i0) {
                    p8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !jrVar.A.manage_linked_peers, false, z39);
                } else if (i10 == jrVar.d0) {
                    p8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !jrVar.A.invite_users, true, z39);
                } else if (i10 == jrVar.e0) {
                    p8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (jrVar.A.pin_messages || ChatObject.isPublic(jrVar.r)) ? false : true, true, z39);
                } else if (i10 == jrVar.f0) {
                    p8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !jrVar.A.edit_rank, true, z39);
                } else if (i10 == jrVar.P) {
                    p8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !jrVar.A.send_plain, true, z39);
                } else if (i10 == jrVar.M0) {
                    p8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), jrVar.n1, false, z39);
                    p8Var.getCheckBox().setDrawIconType(0);
                    p8Var.getCheckBox().d(org.telegram.ui.ActionBar.g6.M6, org.telegram.ui.ActionBar.g6.N6, i21, i21);
                } else if (i10 == jrVar.Q) {
                    int n02 = jr.n0(jrVar.A);
                    p8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z39);
                    Locale locale = Locale.US;
                    p8Var.a(new od.i(2, this, p8Var), u3.c.d(n02, "/10"), !jrVar.h1);
                } else if (i10 == jrVar.a0) {
                    p8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !jrVar.A.send_stickers, true, z39);
                } else if (i10 == jrVar.b0) {
                    p8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !jrVar.A.embed_links, true, z39);
                } else if (i10 == jrVar.Z) {
                    p8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !jrVar.A.send_polls, true, false);
                } else if (i10 == jrVar.h0) {
                    p8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !jrVar.A.manage_topics, false, z39);
                }
                if (i10 == jrVar.e0 || i10 == jrVar.c0) {
                    i13 = ((org.telegram.ui.ActionBar.o2) jrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, jrVar.J)) {
                        p8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(jrVar.r)) {
                    p8Var.setIcon(0);
                    break;
                } else if ((i10 == jrVar.d0 && !ChatObject.canUserDoAdminAction(jrVar.r, 3)) || ((i10 == jrVar.e0 && !ChatObject.canUserDoAdminAction(jrVar.r, 0)) || ((i10 == jrVar.c0 && !ChatObject.canUserDoAdminAction(jrVar.r, 1)) || ((i10 == jrVar.h0 && !ChatObject.canManageTopics(jrVar.r)) || (ChatObject.isPublic(jrVar.r) && (i10 == jrVar.e0 || i10 == jrVar.c0)))))) {
                    p8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    p8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                if (i10 != jrVar.V0) {
                    if (i10 != jrVar.S0) {
                        if (i10 != jrVar.P0) {
                            if (i10 == jrVar.c1) {
                                s3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
                            s3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            s3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        s3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
                    s3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    s3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.p00 p00Var = (org.telegram.ui.Components.p00) view;
                if (i14 != 0) {
                    p00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = jrVar.s;
                    p00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (i10 != jrVar.t0) {
                    if (i10 != jrVar.F0) {
                        if (i10 == jrVar.H0) {
                            m8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = jrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z21 = false;
                            }
                            m8Var.j(string2, z21, false);
                            break;
                        }
                    } else {
                        m8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 2) && ((chatFull = jrVar.s) == null || chatFull.participants_hidden || jrVar.l0() >= jrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = jrVar.s;
                        m8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    m8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 13) && ((chatFull2 = jrVar.s) == null || chatFull2.antispam || jrVar.l0() >= jrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = jrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z18 = true;
                    }
                    m8Var.l(R.drawable.msg_policy, string4, z18);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z40 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 != jrVar.R) {
                    if (i10 != jrVar.S) {
                        if (i10 != jrVar.T) {
                            if (i10 != jrVar.U) {
                                if (i10 != jrVar.V) {
                                    if (i10 != jrVar.W) {
                                        if (i10 != jrVar.X) {
                                            if (i10 != jrVar.Y) {
                                                if (i10 != jrVar.g0) {
                                                    if (i10 != jrVar.Z) {
                                                        y1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        y1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !jrVar.A.send_polls, true, z40);
                                                        break;
                                                    }
                                                } else {
                                                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !jrVar.A.send_reactions, false, z40);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = jrVar.A;
                                                y1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z40);
                                                break;
                                            }
                                        } else {
                                            y1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !jrVar.A.send_roundvideos, true, z40);
                                            break;
                                        }
                                    } else {
                                        y1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !jrVar.A.send_voices, true, z40);
                                        break;
                                    }
                                } else {
                                    y1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !jrVar.A.send_docs, true, z40);
                                    break;
                                }
                            } else {
                                y1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !jrVar.A.send_audios, true, z40);
                                break;
                            }
                        } else {
                            y1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !jrVar.A.send_stickers, true, z40);
                            break;
                        }
                    } else {
                        y1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !jrVar.A.send_videos, true, z40);
                        break;
                    }
                } else {
                    y1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !jrVar.A.send_photos, true, z40);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i10 != jrVar.d1) {
                    if (i10 != jrVar.e1) {
                        if (i10 == jrVar.j0) {
                            q8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), jrVar.u1, false);
                            break;
                        }
                    } else {
                        q8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), jrVar.s1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z41 = jrVar.r1;
                    q8Var.f(string6, z41, z41);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                if (i10 == jrVar.m0) {
                    int[] a2 = org.telegram.ui.Cells.v7.a((int) jrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(jrVar.w1, jrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    m4.a aVar = new m4.a(19);
                    org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7();
                    u7Var.c = a2;
                    u7Var.d = 20;
                    u7Var.e = aVar;
                    v7Var.d(clamp, u7Var, new x3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View view;
        View view2;
        Context context = this.c;
        jr jrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = jrVar.K;
                org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, jrVar.a1 == 0);
                z4Var.setDelegate(new er(this, 0));
                view2 = z4Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.w4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                if (!jrVar.v) {
                    if (!jrVar.w) {
                        y8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = y8Var;
                        break;
                    } else {
                        y8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = y8Var;
                        break;
                    }
                } else {
                    y8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = y8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                k4Var.setHeight(43);
                view2 = k4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.y9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
                View s3Var = new org.telegram.ui.Cells.s3(context, 26, c6Var);
                s3Var.setBackground(null);
                view = s3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
                lv0Var.b(jrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                lv0Var.setCallback(new er(this, 1));
                view = lv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.q4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(6);
                p00Var.w = false;
                p00Var.setUseHeaderOffset(false);
                p00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.x0 x0Var = new f2.x0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(30.0f);
                p00Var.setLayoutParams(x0Var);
                view = p00Var;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.c, jrVar.getResourceProvider(), false, true);
                m8Var.v = 50;
                view = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.c, jrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.g7, org.telegram.ui.ActionBar.g6.k7);
                y1Var.setEnabled(true);
                view = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = jrVar.o1;
                lv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                lv0Var2.setCallback(new er(this, 2));
                view2 = lv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.q8(context, jrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.v7(context, jrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
