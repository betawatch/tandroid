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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hr extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ lr d;

    public hr(lr lrVar, Context context) {
        this.d = lrVar;
        this.c = context;
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.H0) goto L42;
     */
    @Override // org.telegram.ui.Components.yk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        if (i10 != 16) {
            lr lrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(lrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.y4) o1Var.a).getCurrentObject();
                if (lrVar.K != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = o1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == lrVar.t0) {
                            return ChatObject.canUserDoAdminAction(lrVar.r, 13);
                        }
                        if (b10 == lrVar.F0) {
                            return ChatObject.canUserDoAdminAction(lrVar.r, 2);
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
        lr lrVar = this.d;
        int i11 = lrVar.A0;
        if (i10 >= i11 && i10 < lrVar.B0) {
            return (TLObject) lrVar.B.get(i10 - i11);
        }
        int i12 = lrVar.Q0;
        if (i10 >= i12 && i10 < lrVar.R0) {
            return (TLObject) lrVar.D.get(i10 - i12);
        }
        int i13 = lrVar.T0;
        if (i10 < i13 || i10 >= lrVar.U0) {
            return null;
        }
        return (TLObject) lrVar.C.get(i10 - i13);
    }

    @Override // f2.q0
    public final int h() {
        return this.d.Z0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        lr lrVar = this.d;
        if (i10 == lrVar.v0 || i10 == lrVar.w0 || i10 == lrVar.r0 || i10 == lrVar.p0) {
            return 2;
        }
        if ((i10 >= lrVar.A0 && i10 < lrVar.B0) || ((i10 >= lrVar.T0 && i10 < lrVar.U0) || (i10 >= lrVar.Q0 && i10 < lrVar.R0))) {
            return 0;
        }
        if (i10 == lrVar.y0 || i10 == lrVar.C0 || i10 == lrVar.D0) {
            return 3;
        }
        if (i10 == lrVar.z0 || i10 == lrVar.O || i10 == lrVar.J0 || i10 == lrVar.o0 || i10 == lrVar.l0) {
            return 5;
        }
        if (i10 == lrVar.X0 || i10 == lrVar.L0 || i10 == lrVar.N0 || i10 == lrVar.q0 || i10 == lrVar.u0 || i10 == lrVar.G0 || i10 == lrVar.I0 || i10 == lrVar.f1 || i10 == lrVar.k0 || i10 == lrVar.n0) {
            return 1;
        }
        if (i10 == lrVar.Y0) {
            return 4;
        }
        if (i10 == lrVar.x0) {
            return 6;
        }
        if (i10 == lrVar.c0 || i10 == lrVar.d0 || i10 == lrVar.i0 || i10 == lrVar.e0 || i10 == lrVar.f0 || i10 == lrVar.P || i10 == lrVar.a0 || i10 == lrVar.b0 || i10 == lrVar.h0 || i10 == lrVar.M0) {
            return 7;
        }
        if (i10 == lrVar.V0 || i10 == lrVar.P0 || i10 == lrVar.S0 || i10 == lrVar.c1) {
            return 8;
        }
        if (i10 == lrVar.K0) {
            return 9;
        }
        if (i10 == lrVar.W0) {
            return 10;
        }
        if (i10 == lrVar.b1) {
            return 11;
        }
        if (i10 == lrVar.t0 || i10 == lrVar.F0 || i10 == lrVar.H0) {
            return 12;
        }
        if (lrVar.p0(i10)) {
            return 13;
        }
        if (i10 == lrVar.Q) {
            return 14;
        }
        if (i10 == lrVar.O0) {
            return 15;
        }
        if (i10 == lrVar.d1 || i10 == lrVar.e1 || i10 == lrVar.j0) {
            return 16;
        }
        return i10 == lrVar.m0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e3, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e5, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x07fb, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Removed duplicated region for block: B:472:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x086f  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
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
        lr lrVar = this.d;
        ArrayList arrayList = lrVar.B;
        boolean z16 = lrVar.w;
        boolean z17 = lrVar.v;
        int i14 = lrVar.K;
        int i15 = o1Var.f;
        View view = o1Var.a;
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
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < lrVar.A0 || i10 >= (i11 = lrVar.B0)) {
                    if (i10 >= lrVar.Q0 && i10 < (i11 = lrVar.R0)) {
                        if (ChatObject.isChannel(lrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = lrVar.U0;
                    }
                    z10 = false;
                } else {
                    if (ChatObject.isChannel(lrVar.r)) {
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
                        chat = lrVar.getMessagesController().getUser(Long.valueOf(j11));
                        i12 = i11;
                    } else {
                        z14 = z12;
                        z15 = z11;
                        i12 = i11;
                        chat = lrVar.getMessagesController().getChat(Long.valueOf(-j11));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        y4Var.b(chat, null, (!z10 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z14) {
                                        if (!z15 || (user = lrVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j11) {
                                            charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                        } else {
                                            charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                        }
                                        y4Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    y4Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                }
                            } else {
                                y4Var.b(chat, null, (!z13 || (user2 = lrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb2 = charSequence;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                boolean z22 = tL_chatBannedRights.view_messages;
                                if (z22 && lrVar.A.view_messages != z22) {
                                    sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && lrVar.A.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z23 = tL_chatBannedRights.send_media;
                                if (!z23 || lrVar.A.send_media == z23) {
                                    boolean z24 = tL_chatBannedRights.send_photos;
                                    if (z24 && lrVar.A.send_photos != z24) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_videos;
                                    if (z25 && lrVar.A.send_videos != z25) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_audios;
                                    if (z26 && lrVar.A.send_audios != z26) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_docs;
                                    if (z27 && lrVar.A.send_docs != z27) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_voices;
                                    if (z28 && lrVar.A.send_voices != z28) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z29 = tL_chatBannedRights.send_roundvideos;
                                    if (z29 && lrVar.A.send_roundvideos != z29) {
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
                                if (z30 && lrVar.A.send_stickers != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z31 = tL_chatBannedRights.send_polls;
                                if (z31 && lrVar.A.send_polls != z31) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z32 = tL_chatBannedRights.embed_links;
                                if (z32 && !tL_chatBannedRights.send_plain && lrVar.A.embed_links != z32) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z33 = tL_chatBannedRights.invite_users;
                                if (z33 && lrVar.A.invite_users != z33) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z34 = tL_chatBannedRights.pin_messages;
                                if (z34 && lrVar.A.pin_messages != z34) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z35 = tL_chatBannedRights.edit_rank;
                                if (z35 && lrVar.A.edit_rank != z35) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z36 = tL_chatBannedRights.send_reactions;
                                if (z36 && lrVar.A.send_reactions != z36) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z37 = tL_chatBannedRights.change_info;
                                if (z37 && lrVar.A.change_info != z37) {
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
                            y4Var.b(chat, null, sb2, i10 != i12 + (-1));
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
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 != lrVar.u0) {
                    if (i10 != lrVar.X0) {
                        if (i10 != lrVar.L0) {
                            if (i10 != lrVar.k0) {
                                if (i10 != lrVar.n0) {
                                    if (i10 != lrVar.G0) {
                                        if (i10 != lrVar.I0) {
                                            if (i10 != lrVar.q0) {
                                                if (i10 != lrVar.N0) {
                                                    if (i10 == lrVar.f1) {
                                                        x8Var.setText(LocaleController.getString(lrVar.r1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!lrVar.n1) {
                                                    x8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    x8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                x8Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            x8Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        x8Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    x8Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, nh.k.G0(lrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((lrVar.w1 * (lrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * lrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                x8Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = lr.m0(lrVar.l1);
                            if (lrVar.s != null && m0 != 0) {
                                x8Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                x8Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || lrVar.a1 != 0) {
                                    x8Var.setText("");
                                    break;
                                } else {
                                    x8Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (lrVar.v0 == -1) {
                            x8Var.setText("");
                            break;
                        } else if (!z17) {
                            x8Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            x8Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            x8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            x8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    x8Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
                v4Var.a(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                if (i10 != lrVar.v0) {
                    if (i10 != lrVar.r0) {
                        if (i10 != lrVar.w0) {
                            if (i10 == lrVar.p0) {
                                v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                                v4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                            if ((!lrVar.M || lrVar.N) && lrVar.V0 == -1 && !arrayList.isEmpty()) {
                                z20 = true;
                            }
                            v4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z20);
                            break;
                        }
                    } else {
                        v4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, lrVar.t0 > lrVar.r0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                                if (lrVar.w0 != -1 || ((!lrVar.M || lrVar.N) && lrVar.V0 == -1 && !arrayList.isEmpty())) {
                                    z19 = true;
                                }
                                if (!z17) {
                                    v4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                } else {
                                    v4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                }
                            }
                        } else {
                            v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                            v4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !lrVar.M || lrVar.N);
                            break;
                        }
                    } else {
                        v4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                    v4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, lrVar.A0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 != lrVar.z0) {
                    if (i10 != lrVar.O) {
                        if (i10 != lrVar.J0) {
                            if (i10 != lrVar.o0) {
                                if (i10 == lrVar.l0) {
                                    j4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                j4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            j4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        j4Var.setText(LocaleController.getString(z16 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = lrVar.s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        j4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        j4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = lrVar.s;
                x9Var.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = o8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.g6.r7;
                int i20 = org.telegram.ui.ActionBar.g6.V6;
                int i21 = org.telegram.ui.ActionBar.g6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z39 = o8Var.getTag() != null && ((Integer) o8Var.getTag()).intValue() == i10;
                o8Var.setTag(Integer.valueOf(i10));
                if (i10 == lrVar.c0) {
                    o8Var.d(LocaleController.getString(z16 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (lrVar.A.change_info || ChatObject.isPublic(lrVar.r)) ? false : true, lrVar.h0 != -1, z39);
                } else if (i10 == lrVar.i0) {
                    o8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !lrVar.A.manage_linked_peers, false, z39);
                } else if (i10 == lrVar.d0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !lrVar.A.invite_users, true, z39);
                } else if (i10 == lrVar.e0) {
                    o8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (lrVar.A.pin_messages || ChatObject.isPublic(lrVar.r)) ? false : true, true, z39);
                } else if (i10 == lrVar.f0) {
                    o8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !lrVar.A.edit_rank, true, z39);
                } else if (i10 == lrVar.P) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !lrVar.A.send_plain, true, z39);
                } else if (i10 == lrVar.M0) {
                    o8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), lrVar.n1, false, z39);
                    o8Var.getCheckBox().setDrawIconType(0);
                    o8Var.getCheckBox().d(org.telegram.ui.ActionBar.g6.M6, org.telegram.ui.ActionBar.g6.N6, i21, i21);
                } else if (i10 == lrVar.Q) {
                    int n02 = lr.n0(lrVar.A);
                    o8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z39);
                    Locale locale = Locale.US;
                    o8Var.a(new o0.m(this, o8Var, false, 2), s3.c.d(n02, "/10"), !lrVar.h1);
                } else if (i10 == lrVar.a0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !lrVar.A.send_stickers, true, z39);
                } else if (i10 == lrVar.b0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !lrVar.A.embed_links, true, z39);
                } else if (i10 == lrVar.Z) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !lrVar.A.send_polls, true, false);
                } else if (i10 == lrVar.h0) {
                    o8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !lrVar.A.manage_topics, false, z39);
                }
                if (i10 == lrVar.e0 || i10 == lrVar.c0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) lrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, lrVar.J)) {
                        o8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(lrVar.r)) {
                    o8Var.setIcon(0);
                    break;
                } else if ((i10 == lrVar.d0 && !ChatObject.canUserDoAdminAction(lrVar.r, 3)) || ((i10 == lrVar.e0 && !ChatObject.canUserDoAdminAction(lrVar.r, 0)) || ((i10 == lrVar.c0 && !ChatObject.canUserDoAdminAction(lrVar.r, 1)) || ((i10 == lrVar.h0 && !ChatObject.canManageTopics(lrVar.r)) || (ChatObject.isPublic(lrVar.r) && (i10 == lrVar.e0 || i10 == lrVar.c0)))))) {
                    o8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    o8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                if (i10 != lrVar.V0) {
                    if (i10 != lrVar.S0) {
                        if (i10 != lrVar.P0) {
                            if (i10 == lrVar.c1) {
                                s3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(lrVar.r) && !lrVar.r.megagroup) {
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
                } else if (ChatObject.isChannel(lrVar.r) && !lrVar.r.megagroup) {
                    s3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    s3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.h00 h00Var = (org.telegram.ui.Components.h00) view;
                if (i14 != 0) {
                    h00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = lrVar.s;
                    h00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (i10 != lrVar.t0) {
                    if (i10 != lrVar.F0) {
                        if (i10 == lrVar.H0) {
                            l8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = lrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z21 = false;
                            }
                            l8Var.j(string2, z21, false);
                            break;
                        }
                    } else {
                        l8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(lrVar.r, 2) && ((chatFull = lrVar.s) == null || chatFull.participants_hidden || lrVar.l0() >= lrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = lrVar.s;
                        l8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    l8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(lrVar.r, 13) && ((chatFull2 = lrVar.s) == null || chatFull2.antispam || lrVar.l0() >= lrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = lrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z18 = true;
                    }
                    l8Var.l(R.drawable.msg_policy, string4, z18);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z40 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 != lrVar.R) {
                    if (i10 != lrVar.S) {
                        if (i10 != lrVar.T) {
                            if (i10 != lrVar.U) {
                                if (i10 != lrVar.V) {
                                    if (i10 != lrVar.W) {
                                        if (i10 != lrVar.X) {
                                            if (i10 != lrVar.Y) {
                                                if (i10 != lrVar.g0) {
                                                    if (i10 != lrVar.Z) {
                                                        y1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        y1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !lrVar.A.send_polls, true, z40);
                                                        break;
                                                    }
                                                } else {
                                                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !lrVar.A.send_reactions, false, z40);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = lrVar.A;
                                                y1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z40);
                                                break;
                                            }
                                        } else {
                                            y1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !lrVar.A.send_roundvideos, true, z40);
                                            break;
                                        }
                                    } else {
                                        y1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !lrVar.A.send_voices, true, z40);
                                        break;
                                    }
                                } else {
                                    y1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !lrVar.A.send_docs, true, z40);
                                    break;
                                }
                            } else {
                                y1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !lrVar.A.send_audios, true, z40);
                                break;
                            }
                        } else {
                            y1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !lrVar.A.send_stickers, true, z40);
                            break;
                        }
                    } else {
                        y1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !lrVar.A.send_videos, true, z40);
                        break;
                    }
                } else {
                    y1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !lrVar.A.send_photos, true, z40);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i10 != lrVar.d1) {
                    if (i10 != lrVar.e1) {
                        if (i10 == lrVar.j0) {
                            p8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), lrVar.u1, false);
                            break;
                        }
                    } else {
                        p8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), lrVar.s1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z41 = lrVar.r1;
                    p8Var.f(string6, z41, z41);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                if (i10 == lrVar.m0) {
                    int[] a2 = org.telegram.ui.Cells.u7.a((int) lrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(lrVar.w1, lrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    fr frVar = new fr(0);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a2;
                    t7Var.d = 20;
                    t7Var.e = frVar;
                    u7Var.d(clamp, t7Var, new x3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View view;
        View view2;
        Context context = this.c;
        lr lrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = lrVar.K;
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, lrVar.a1 == 0);
                y4Var.setDelegate(new gr(this, 0));
                view2 = y4Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.v4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
                if (!lrVar.v) {
                    if (!lrVar.w) {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = x8Var;
                        break;
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = x8Var;
                        break;
                    }
                } else {
                    x8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = x8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                j4Var.setHeight(43);
                view2 = j4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.o8(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.n2) lrVar).resourceProvider;
                View s3Var = new org.telegram.ui.Cells.s3(context, 26, c6Var);
                s3Var.setBackground(null);
                view = s3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
                dv0Var.b(lrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                dv0Var.setCallback(new gr(this, 1));
                view = dv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.p4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(6);
                h00Var.w = false;
                h00Var.setUseHeaderOffset(false);
                h00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.y0 y0Var = new f2.y0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) y0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) y0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(30.0f);
                h00Var.setLayoutParams(y0Var);
                view = h00Var;
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, this.c, lrVar.getResourceProvider(), false, true);
                l8Var.v = 50;
                view = l8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.c, lrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.g7, org.telegram.ui.ActionBar.g6.k7);
                y1Var.setEnabled(true);
                view = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
                Drawable[] drawableArr = {lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = lrVar.o1;
                dv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                dv0Var2.setCallback(new gr(this, 2));
                view2 = dv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.p8(context, lrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.u7(context, lrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
