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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class er extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ jr d;

    public er(jr jrVar, Context context) {
        this.d = jrVar;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.H0) goto L42;
     */
    @Override // org.telegram.ui.Components.vk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 != 16) {
            jr jrVar = this.d;
            if (i9 == 7 || i9 == 14) {
                return ChatObject.canBlockUsers(jrVar.r);
            }
            if (i9 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) q1Var.a).getCurrentObject();
                if (jrVar.K != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = q1Var.b();
                if (i9 != 0 && i9 != 2 && i9 != 6) {
                    if (i9 == 12) {
                        if (b10 == jrVar.t0) {
                            return ChatObject.canUserDoAdminAction(jrVar.r, 13);
                        }
                        if (b10 == jrVar.F0) {
                            return ChatObject.canUserDoAdminAction(jrVar.r, 2);
                        }
                    }
                    if (i9 != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i9) {
        jr jrVar = this.d;
        int i10 = jrVar.A0;
        if (i9 >= i10 && i9 < jrVar.B0) {
            return (TLObject) jrVar.B.get(i9 - i10);
        }
        int i11 = jrVar.Q0;
        if (i9 >= i11 && i9 < jrVar.R0) {
            return (TLObject) jrVar.D.get(i9 - i11);
        }
        int i12 = jrVar.T0;
        if (i9 < i12 || i9 >= jrVar.U0) {
            return null;
        }
        return (TLObject) jrVar.C.get(i9 - i12);
    }

    @Override // f2.r0
    public final int h() {
        return this.d.Z0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        jr jrVar = this.d;
        if (i9 == jrVar.v0 || i9 == jrVar.w0 || i9 == jrVar.r0 || i9 == jrVar.p0) {
            return 2;
        }
        if ((i9 >= jrVar.A0 && i9 < jrVar.B0) || ((i9 >= jrVar.T0 && i9 < jrVar.U0) || (i9 >= jrVar.Q0 && i9 < jrVar.R0))) {
            return 0;
        }
        if (i9 == jrVar.y0 || i9 == jrVar.C0 || i9 == jrVar.D0) {
            return 3;
        }
        if (i9 == jrVar.z0 || i9 == jrVar.O || i9 == jrVar.J0 || i9 == jrVar.o0 || i9 == jrVar.l0) {
            return 5;
        }
        if (i9 == jrVar.X0 || i9 == jrVar.L0 || i9 == jrVar.N0 || i9 == jrVar.q0 || i9 == jrVar.u0 || i9 == jrVar.G0 || i9 == jrVar.I0 || i9 == jrVar.f1 || i9 == jrVar.k0 || i9 == jrVar.n0) {
            return 1;
        }
        if (i9 == jrVar.Y0) {
            return 4;
        }
        if (i9 == jrVar.x0) {
            return 6;
        }
        if (i9 == jrVar.c0 || i9 == jrVar.d0 || i9 == jrVar.i0 || i9 == jrVar.e0 || i9 == jrVar.f0 || i9 == jrVar.P || i9 == jrVar.a0 || i9 == jrVar.b0 || i9 == jrVar.h0 || i9 == jrVar.M0) {
            return 7;
        }
        if (i9 == jrVar.V0 || i9 == jrVar.P0 || i9 == jrVar.S0 || i9 == jrVar.c1) {
            return 8;
        }
        if (i9 == jrVar.K0) {
            return 9;
        }
        if (i9 == jrVar.W0) {
            return 10;
        }
        if (i9 == jrVar.b1) {
            return 11;
        }
        if (i9 == jrVar.t0 || i9 == jrVar.F0 || i9 == jrVar.H0) {
            return 12;
        }
        if (jrVar.o0(i9)) {
            return 13;
        }
        if (i9 == jrVar.Q) {
            return 14;
        }
        if (i9 == jrVar.O0) {
            return 15;
        }
        if (i9 == jrVar.d1 || i9 == jrVar.e1 || i9 == jrVar.j0) {
            return 16;
        }
        return i9 == jrVar.m0 ? 17 : 0;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
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
        int i11;
        TLObject chat;
        CharSequence charSequence2;
        TLRPC.User user;
        TLRPC.User user2;
        CharSequence sb2;
        int i12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        jr jrVar = this.d;
        ArrayList arrayList = jrVar.B;
        boolean z16 = jrVar.w;
        boolean z17 = jrVar.v;
        int i13 = jrVar.K;
        int i14 = q1Var.f;
        View view = q1Var.a;
        int i15 = 0;
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
        switch (i14) {
            case 0:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i9));
                TLObject E = E(i9);
                if (i9 < jrVar.A0 || i9 >= (i10 = jrVar.B0)) {
                    if (i9 >= jrVar.Q0 && i9 < (i10 = jrVar.R0)) {
                        if (ChatObject.isChannel(jrVar.r)) {
                            break;
                        }
                    } else {
                        i10 = jrVar.U0;
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
                    int i16 = channelParticipant.date;
                    z13 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i15 = i16;
                    j12 = j14;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j13 = j15;
                    if (j11 <= j10) {
                        z14 = z12;
                        z15 = z11;
                        chat = jrVar.getMessagesController().getUser(Long.valueOf(j11));
                        i11 = i10;
                    } else {
                        z14 = z12;
                        z15 = z11;
                        i11 = i10;
                        chat = jrVar.getMessagesController().getChat(Long.valueOf(-j11));
                    }
                    if (chat == null) {
                        if (i13 != 3) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        b5Var.b(chat, null, (!z10 || i15 == 0) ? null : LocaleController.formatJoined(i15), i9 != i11 + (-1));
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
                                        b5Var.b(chat, null, charSequence2, i9 == i11 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    b5Var.b(chat, null, charSequence2, i9 == i11 + (-1));
                                }
                            } else {
                                b5Var.b(chat, null, (!z13 || (user2 = jrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i9 != i11 + (-1));
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
                            b5Var.b(chat, null, sb2, i9 != i11 + (-1));
                            break;
                        }
                    }
                } else {
                    charSequence = "";
                    j10 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j11 = chatParticipant.user_id;
                        int i17 = chatParticipant.date;
                        boolean z38 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z11 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i15 = i17;
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
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 != jrVar.u0) {
                    if (i9 != jrVar.X0) {
                        if (i9 != jrVar.L0) {
                            if (i9 != jrVar.k0) {
                                if (i9 != jrVar.n0) {
                                    if (i9 != jrVar.G0) {
                                        if (i9 != jrVar.I0) {
                                            if (i9 != jrVar.q0) {
                                                if (i9 != jrVar.N0) {
                                                    if (i9 == jrVar.f1) {
                                                        b9Var.setText(LocaleController.getString(jrVar.r1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!jrVar.n1) {
                                                    b9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    b9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                b9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            b9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        b9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    b9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, mh.l.F0(jrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((jrVar.w1 * (jrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * jrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                b9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int l02 = jr.l0(jrVar.l1);
                            if (jrVar.s != null && l02 != 0) {
                                b9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, l02 < 60 ? LocaleController.formatPluralString("Seconds", l02, new Object[0]) : l02 < 3600 ? LocaleController.formatPluralString("Minutes", l02 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (l02 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                b9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i13 != 0 && i13 != 3) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (!z17 || jrVar.a1 != 0) {
                                    b9Var.setText("");
                                    break;
                                } else {
                                    b9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (jrVar.v0 == -1) {
                            b9Var.setText("");
                            break;
                        } else if (!z17) {
                            b9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            b9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            b9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            b9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    b9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.f6.m6, org.telegram.ui.ActionBar.f6.G6);
                if (i9 != jrVar.v0) {
                    if (i9 != jrVar.r0) {
                        if (i9 != jrVar.w0) {
                            if (i9 == jrVar.p0) {
                                y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                            if ((!jrVar.M || jrVar.N) && jrVar.V0 == -1 && !arrayList.isEmpty()) {
                                z20 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z20);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, jrVar.t0 > jrVar.r0);
                        break;
                    }
                } else if (i13 != 3) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                                if (jrVar.w0 != -1 || ((!jrVar.M || jrVar.N) && jrVar.V0 == -1 && !arrayList.isEmpty())) {
                                    z19 = true;
                                }
                                if (!z17) {
                                    y4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                } else {
                                    y4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                }
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !jrVar.M || jrVar.N);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, jrVar.A0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 != jrVar.z0) {
                    if (i9 != jrVar.O) {
                        if (i9 != jrVar.J0) {
                            if (i9 != jrVar.o0) {
                                if (i9 == jrVar.l0) {
                                    m4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                m4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        m4Var.setText(LocaleController.getString(z16 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i13 != 0) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = jrVar.s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        m4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        m4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = jrVar.s;
                baVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = s8Var.getCheckBox();
                int i18 = org.telegram.ui.ActionBar.f6.r7;
                int i19 = org.telegram.ui.ActionBar.f6.V6;
                int i20 = org.telegram.ui.ActionBar.f6.d6;
                checkBox.d(i18, i19, i20, i20);
                boolean z39 = s8Var.getTag() != null && ((Integer) s8Var.getTag()).intValue() == i9;
                s8Var.setTag(Integer.valueOf(i9));
                if (i9 == jrVar.c0) {
                    s8Var.d(LocaleController.getString(z16 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (jrVar.A.change_info || ChatObject.isPublic(jrVar.r)) ? false : true, jrVar.h0 != -1, z39);
                } else if (i9 == jrVar.i0) {
                    s8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !jrVar.A.manage_linked_peers, false, z39);
                } else if (i9 == jrVar.d0) {
                    s8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !jrVar.A.invite_users, true, z39);
                } else if (i9 == jrVar.e0) {
                    s8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (jrVar.A.pin_messages || ChatObject.isPublic(jrVar.r)) ? false : true, true, z39);
                } else if (i9 == jrVar.f0) {
                    s8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !jrVar.A.edit_rank, true, z39);
                } else if (i9 == jrVar.P) {
                    s8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !jrVar.A.send_plain, true, z39);
                } else if (i9 == jrVar.M0) {
                    s8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), jrVar.n1, false, z39);
                    s8Var.getCheckBox().setDrawIconType(0);
                    s8Var.getCheckBox().d(org.telegram.ui.ActionBar.f6.M6, org.telegram.ui.ActionBar.f6.N6, i20, i20);
                } else if (i9 == jrVar.Q) {
                    int m0 = jr.m0(jrVar.A);
                    s8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), m0 > 0, true, z39);
                    Locale locale = Locale.US;
                    s8Var.a(new fm(1, this, s8Var), ta.b.c(m0, "/10"), !jrVar.h1);
                } else if (i9 == jrVar.a0) {
                    s8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !jrVar.A.send_stickers, true, z39);
                } else if (i9 == jrVar.b0) {
                    s8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !jrVar.A.embed_links, true, z39);
                } else if (i9 == jrVar.Z) {
                    s8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !jrVar.A.send_polls, true, false);
                } else if (i9 == jrVar.h0) {
                    s8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !jrVar.A.manage_topics, false, z39);
                }
                if (i9 == jrVar.e0 || i9 == jrVar.c0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) jrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i12, jrVar.J)) {
                        s8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(jrVar.r)) {
                    s8Var.setIcon(0);
                    break;
                } else if ((i9 == jrVar.d0 && !ChatObject.canUserDoAdminAction(jrVar.r, 3)) || ((i9 == jrVar.e0 && !ChatObject.canUserDoAdminAction(jrVar.r, 0)) || ((i9 == jrVar.c0 && !ChatObject.canUserDoAdminAction(jrVar.r, 1)) || ((i9 == jrVar.h0 && !ChatObject.canManageTopics(jrVar.r)) || (ChatObject.isPublic(jrVar.r) && (i9 == jrVar.e0 || i9 == jrVar.c0)))))) {
                    s8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    s8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (i9 != jrVar.V0) {
                    if (i9 != jrVar.S0) {
                        if (i9 != jrVar.P0) {
                            if (i9 == jrVar.c1) {
                                v3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
                            v3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            v3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        v3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
                    v3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    v3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.e00 e00Var = (org.telegram.ui.Components.e00) view;
                if (i13 != 0) {
                    e00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = jrVar.s;
                    e00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i9 != jrVar.t0) {
                    if (i9 != jrVar.F0) {
                        if (i9 == jrVar.H0) {
                            p8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = jrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z21 = false;
                            }
                            p8Var.j(string2, z21, false);
                            break;
                        }
                    } else {
                        p8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 2) && ((chatFull = jrVar.s) == null || chatFull.participants_hidden || jrVar.k0() >= jrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = jrVar.s;
                        p8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    p8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 13) && ((chatFull2 = jrVar.s) == null || chatFull2.antispam || jrVar.k0() >= jrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = jrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z18 = true;
                    }
                    p8Var.l(R.drawable.msg_policy, string4, z18);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z40 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i9;
                z1Var.setTag(Integer.valueOf(i9));
                if (i9 != jrVar.R) {
                    if (i9 != jrVar.S) {
                        if (i9 != jrVar.T) {
                            if (i9 != jrVar.U) {
                                if (i9 != jrVar.V) {
                                    if (i9 != jrVar.W) {
                                        if (i9 != jrVar.X) {
                                            if (i9 != jrVar.Y) {
                                                if (i9 != jrVar.g0) {
                                                    if (i9 != jrVar.Z) {
                                                        z1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        z1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !jrVar.A.send_polls, true, z40);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !jrVar.A.send_reactions, false, z40);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = jrVar.A;
                                                z1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z40);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !jrVar.A.send_roundvideos, true, z40);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !jrVar.A.send_voices, true, z40);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !jrVar.A.send_docs, true, z40);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !jrVar.A.send_audios, true, z40);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !jrVar.A.send_stickers, true, z40);
                            break;
                        }
                    } else {
                        z1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !jrVar.A.send_videos, true, z40);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !jrVar.A.send_photos, true, z40);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                if (i9 != jrVar.d1) {
                    if (i9 != jrVar.e1) {
                        if (i9 == jrVar.j0) {
                            t8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), jrVar.u1, false);
                            break;
                        }
                    } else {
                        t8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), jrVar.s1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z41 = jrVar.r1;
                    t8Var.f(string6, z41, z41);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                if (i9 == jrVar.m0) {
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) jrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(jrVar.w1, jrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    mg.b bVar = new mg.b(25);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = bVar;
                    x7Var.d(clamp, w7Var, new w3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        View view;
        View view2;
        Context context = this.c;
        jr jrVar = this.d;
        switch (i9) {
            case 0:
                int i10 = jrVar.K;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i10 == 0 || i10 == 3) ? 7 : 6, (i10 == 0 || i10 == 3) ? 6 : 2, this.c, null, jrVar.a1 == 0);
                b5Var.setDelegate(new dr(this, 0));
                view2 = b5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                if (!jrVar.v) {
                    if (!jrVar.w) {
                        b9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = b9Var;
                        break;
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = b9Var;
                        break;
                    }
                } else {
                    b9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = b9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                view2 = m4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.ba(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, b6Var);
                v3Var.setBackground(null);
                view = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
                bv0Var.b(jrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                bv0Var.setCallback(new dr(this, 1));
                view = bv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(6);
                e00Var.w = false;
                e00Var.setUseHeaderOffset(false);
                e00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.a1 a1Var = new f2.a1(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) a1Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) a1Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(30.0f);
                e00Var.setLayoutParams(a1Var);
                view = e00Var;
                break;
            case 12:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, this.c, jrVar.getResourceProvider(), false, true);
                p8Var.v = 50;
                view = p8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, jrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.g7, org.telegram.ui.ActionBar.f6.k7);
                z1Var.setEnabled(true);
                view = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i11 = jrVar.o1;
                bv0Var2.b(i11 > 0 ? i11 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                bv0Var2.setCallback(new dr(this, 2));
                view2 = bv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.t8(context, jrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.x7(context, jrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
