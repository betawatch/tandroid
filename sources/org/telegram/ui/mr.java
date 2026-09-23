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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ qr d;

    public mr(qr qrVar, Context context) {
        this.d = qrVar;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.L0) goto L42;
     */
    @Override // org.telegram.ui.Components.ll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 16) {
            qr qrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(qrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) c1Var.a).getCurrentObject();
                if (qrVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = c1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == qrVar.x0) {
                            return ChatObject.canUserDoAdminAction(qrVar.r, 13);
                        }
                        if (b10 == qrVar.J0) {
                            return ChatObject.canUserDoAdminAction(qrVar.r, 2);
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
        qr qrVar = this.d;
        int i11 = qrVar.E0;
        if (i10 >= i11 && i10 < qrVar.F0) {
            return (TLObject) qrVar.F.get(i10 - i11);
        }
        int i12 = qrVar.U0;
        if (i10 >= i12 && i10 < qrVar.V0) {
            return (TLObject) qrVar.H.get(i10 - i12);
        }
        int i13 = qrVar.X0;
        if (i10 < i13 || i10 >= qrVar.Y0) {
            return null;
        }
        return (TLObject) qrVar.G.get(i10 - i13);
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        qr qrVar = this.d;
        if (i10 == qrVar.z0 || i10 == qrVar.A0 || i10 == qrVar.v0 || i10 == qrVar.t0) {
            return 2;
        }
        if ((i10 >= qrVar.E0 && i10 < qrVar.F0) || ((i10 >= qrVar.X0 && i10 < qrVar.Y0) || (i10 >= qrVar.U0 && i10 < qrVar.V0))) {
            return 0;
        }
        if (i10 == qrVar.C0 || i10 == qrVar.G0 || i10 == qrVar.H0) {
            return 3;
        }
        if (i10 == qrVar.D0 || i10 == qrVar.S || i10 == qrVar.N0 || i10 == qrVar.s0 || i10 == qrVar.p0) {
            return 5;
        }
        if (i10 == qrVar.b1 || i10 == qrVar.P0 || i10 == qrVar.R0 || i10 == qrVar.u0 || i10 == qrVar.y0 || i10 == qrVar.K0 || i10 == qrVar.M0 || i10 == qrVar.j1 || i10 == qrVar.o0 || i10 == qrVar.r0) {
            return 1;
        }
        if (i10 == qrVar.c1) {
            return 4;
        }
        if (i10 == qrVar.B0) {
            return 6;
        }
        if (i10 == qrVar.g0 || i10 == qrVar.h0 || i10 == qrVar.m0 || i10 == qrVar.i0 || i10 == qrVar.j0 || i10 == qrVar.T || i10 == qrVar.e0 || i10 == qrVar.f0 || i10 == qrVar.l0 || i10 == qrVar.Q0) {
            return 7;
        }
        if (i10 == qrVar.Z0 || i10 == qrVar.T0 || i10 == qrVar.W0 || i10 == qrVar.g1) {
            return 8;
        }
        if (i10 == qrVar.O0) {
            return 9;
        }
        if (i10 == qrVar.a1) {
            return 10;
        }
        if (i10 == qrVar.f1) {
            return 11;
        }
        if (i10 == qrVar.x0 || i10 == qrVar.J0 || i10 == qrVar.L0) {
            return 12;
        }
        if (qrVar.p0(i10)) {
            return 13;
        }
        if (i10 == qrVar.U) {
            return 14;
        }
        if (i10 == qrVar.S0) {
            return 15;
        }
        if (i10 == qrVar.h1 || i10 == qrVar.i1 || i10 == qrVar.n0) {
            return 16;
        }
        return i10 == qrVar.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e7, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x07ff, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0873  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        CharSequence charSequence;
        long j3;
        long j10;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
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
        qr qrVar = this.d;
        ArrayList arrayList = qrVar.F;
        boolean z16 = qrVar.w;
        boolean z17 = qrVar.v;
        int i14 = qrVar.O;
        int i15 = c1Var.f;
        View view = c1Var.a;
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
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < qrVar.E0 || i10 >= (i11 = qrVar.F0)) {
                    if (i10 >= qrVar.U0 && i10 < (i11 = qrVar.V0)) {
                        if (ChatObject.isChannel(qrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = qrVar.Y0;
                    }
                    z10 = false;
                } else {
                    if (ChatObject.isChannel(qrVar.r)) {
                        break;
                    }
                    z10 = false;
                }
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z12 = false;
                    z11 = false;
                    tL_chatBannedRights = null;
                    j11 = 0;
                    j12 = 0;
                    j3 = 0;
                } else if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    j10 = MessageObject.getPeerId(channelParticipant.peer);
                    charSequence = "";
                    long j13 = channelParticipant.kicked_by;
                    long j14 = channelParticipant.promoted_by;
                    j3 = 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                    int i17 = channelParticipant.date;
                    z13 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i16 = i17;
                    j11 = j13;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j12 = j14;
                    if (j10 <= j3) {
                        z14 = z12;
                        z15 = z11;
                        chat = qrVar.getMessagesController().getUser(Long.valueOf(j10));
                        i12 = i11;
                    } else {
                        z14 = z12;
                        z15 = z11;
                        i12 = i11;
                        chat = qrVar.getMessagesController().getChat(Long.valueOf(-j10));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        b5Var.b(chat, null, (!z10 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z14) {
                                        if (!z15 || (user = qrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j10) {
                                            charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                        } else {
                                            charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                        }
                                        b5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    b5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                }
                            } else {
                                b5Var.b(chat, null, (!z13 || (user2 = qrVar.getMessagesController().getUser(Long.valueOf(j11))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb2 = charSequence;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                boolean z22 = tL_chatBannedRights.view_messages;
                                if (z22 && qrVar.E.view_messages != z22) {
                                    sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && qrVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z23 = tL_chatBannedRights.send_media;
                                if (!z23 || qrVar.E.send_media == z23) {
                                    boolean z24 = tL_chatBannedRights.send_photos;
                                    if (z24 && qrVar.E.send_photos != z24) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_videos;
                                    if (z25 && qrVar.E.send_videos != z25) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_audios;
                                    if (z26 && qrVar.E.send_audios != z26) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_docs;
                                    if (z27 && qrVar.E.send_docs != z27) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_voices;
                                    if (z28 && qrVar.E.send_voices != z28) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z29 = tL_chatBannedRights.send_roundvideos;
                                    if (z29 && qrVar.E.send_roundvideos != z29) {
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
                                if (z30 && qrVar.E.send_stickers != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z31 = tL_chatBannedRights.send_polls;
                                if (z31 && qrVar.E.send_polls != z31) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z32 = tL_chatBannedRights.embed_links;
                                if (z32 && !tL_chatBannedRights.send_plain && qrVar.E.embed_links != z32) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z33 = tL_chatBannedRights.invite_users;
                                if (z33 && qrVar.E.invite_users != z33) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z34 = tL_chatBannedRights.pin_messages;
                                if (z34 && qrVar.E.pin_messages != z34) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z35 = tL_chatBannedRights.edit_rank;
                                if (z35 && qrVar.E.edit_rank != z35) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z36 = tL_chatBannedRights.send_reactions;
                                if (z36 && qrVar.E.send_reactions != z36) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z37 = tL_chatBannedRights.change_info;
                                if (z37 && qrVar.E.change_info != z37) {
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
                            b5Var.b(chat, null, sb2, i10 != i12 + (-1));
                            break;
                        }
                    }
                } else {
                    charSequence = "";
                    j3 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j10 = chatParticipant.user_id;
                        int i18 = chatParticipant.date;
                        boolean z38 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z11 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z12 = z38;
                        j11 = 0;
                        j12 = 0;
                        tL_chatBannedRights = null;
                    }
                }
                z13 = false;
                if (j10 <= j3) {
                }
                if (chat == null) {
                }
                break;
            case 1:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 != qrVar.y0) {
                    if (i10 != qrVar.b1) {
                        if (i10 != qrVar.P0) {
                            if (i10 != qrVar.o0) {
                                if (i10 != qrVar.r0) {
                                    if (i10 != qrVar.K0) {
                                        if (i10 != qrVar.M0) {
                                            if (i10 != qrVar.u0) {
                                                if (i10 != qrVar.R0) {
                                                    if (i10 == qrVar.j1) {
                                                        f9Var.setText(LocaleController.getString(qrVar.v1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!qrVar.r1) {
                                                    f9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    f9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                f9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            f9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        f9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    f9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, ei.l.G0(qrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((qrVar.A1 * (qrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * qrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                f9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = qr.m0(qrVar.p1);
                            if (qrVar.s != null && m0 != 0) {
                                f9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                f9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || qrVar.e1 != 0) {
                                    f9Var.setText("");
                                    break;
                                } else {
                                    f9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (qrVar.z0 == -1) {
                            f9Var.setText("");
                            break;
                        } else if (!z17) {
                            f9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            f9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                if (i10 != qrVar.z0) {
                    if (i10 != qrVar.v0) {
                        if (i10 != qrVar.A0) {
                            if (i10 == qrVar.t0) {
                                y4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                            if ((!qrVar.Q || qrVar.R) && qrVar.Z0 == -1 && !arrayList.isEmpty()) {
                                z20 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z20);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, qrVar.x0 > qrVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                                if (qrVar.A0 != -1 || ((!qrVar.Q || qrVar.R) && qrVar.Z0 == -1 && !arrayList.isEmpty())) {
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
                            y4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !qrVar.Q || qrVar.R);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, qrVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != qrVar.D0) {
                    if (i10 != qrVar.S) {
                        if (i10 != qrVar.N0) {
                            if (i10 != qrVar.s0) {
                                if (i10 == qrVar.p0) {
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
                } else if (i14 != 0) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = qrVar.s;
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
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = qrVar.s;
                faVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                w8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = w8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.h6.r7;
                int i20 = org.telegram.ui.ActionBar.h6.V6;
                int i21 = org.telegram.ui.ActionBar.h6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z39 = w8Var.getTag() != null && ((Integer) w8Var.getTag()).intValue() == i10;
                w8Var.setTag(Integer.valueOf(i10));
                if (i10 == qrVar.g0) {
                    w8Var.d(LocaleController.getString(z16 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (qrVar.E.change_info || ChatObject.isPublic(qrVar.r)) ? false : true, qrVar.l0 != -1, z39);
                } else if (i10 == qrVar.m0) {
                    w8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !qrVar.E.manage_linked_peers, false, z39);
                } else if (i10 == qrVar.h0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !qrVar.E.invite_users, true, z39);
                } else if (i10 == qrVar.i0) {
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (qrVar.E.pin_messages || ChatObject.isPublic(qrVar.r)) ? false : true, true, z39);
                } else if (i10 == qrVar.j0) {
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !qrVar.E.edit_rank, true, z39);
                } else if (i10 == qrVar.T) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !qrVar.E.send_plain, true, z39);
                } else if (i10 == qrVar.Q0) {
                    w8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), qrVar.r1, false, z39);
                    w8Var.getCheckBox().setDrawIconType(0);
                    w8Var.getCheckBox().d(org.telegram.ui.ActionBar.h6.M6, org.telegram.ui.ActionBar.h6.N6, i21, i21);
                } else if (i10 == qrVar.U) {
                    int n02 = qr.n0(qrVar.E);
                    w8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z39);
                    Locale locale = Locale.US;
                    w8Var.a(new i9.s(this, w8Var, false, 22), a4.a.n(n02, "/10"), !qrVar.l1);
                } else if (i10 == qrVar.e0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !qrVar.E.send_stickers, true, z39);
                } else if (i10 == qrVar.f0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !qrVar.E.embed_links, true, z39);
                } else if (i10 == qrVar.d0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !qrVar.E.send_polls, true, false);
                } else if (i10 == qrVar.l0) {
                    w8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !qrVar.E.manage_topics, false, z39);
                }
                if (i10 == qrVar.i0 || i10 == qrVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) qrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, qrVar.N)) {
                        w8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(qrVar.r)) {
                    w8Var.setIcon(0);
                    break;
                } else if ((i10 == qrVar.h0 && !ChatObject.canUserDoAdminAction(qrVar.r, 3)) || ((i10 == qrVar.i0 && !ChatObject.canUserDoAdminAction(qrVar.r, 0)) || ((i10 == qrVar.g0 && !ChatObject.canUserDoAdminAction(qrVar.r, 1)) || ((i10 == qrVar.l0 && !ChatObject.canManageTopics(qrVar.r)) || (ChatObject.isPublic(qrVar.r) && (i10 == qrVar.i0 || i10 == qrVar.g0)))))) {
                    w8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    w8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (i10 != qrVar.Z0) {
                    if (i10 != qrVar.W0) {
                        if (i10 != qrVar.T0) {
                            if (i10 == qrVar.g1) {
                                v3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(qrVar.r) && !qrVar.r.megagroup) {
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
                } else if (ChatObject.isChannel(qrVar.r) && !qrVar.r.megagroup) {
                    v3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    v3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = (org.telegram.ui.Components.u00) view;
                if (i14 != 0) {
                    u00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = qrVar.s;
                    u00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i10 != qrVar.x0) {
                    if (i10 != qrVar.J0) {
                        if (i10 == qrVar.L0) {
                            s8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = qrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z21 = false;
                            }
                            s8Var.j(string2, z21, false);
                            break;
                        }
                    } else {
                        s8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(qrVar.r, 2) && ((chatFull = qrVar.s) == null || chatFull.participants_hidden || qrVar.l0() >= qrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = qrVar.s;
                        s8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    s8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(qrVar.r, 13) && ((chatFull2 = qrVar.s) == null || chatFull2.antispam || qrVar.l0() >= qrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = qrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z18 = true;
                    }
                    s8Var.l(R.drawable.msg_policy, string4, z18);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z40 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != qrVar.V) {
                    if (i10 != qrVar.W) {
                        if (i10 != qrVar.X) {
                            if (i10 != qrVar.Y) {
                                if (i10 != qrVar.Z) {
                                    if (i10 != qrVar.a0) {
                                        if (i10 != qrVar.b0) {
                                            if (i10 != qrVar.c0) {
                                                if (i10 != qrVar.k0) {
                                                    if (i10 != qrVar.d0) {
                                                        z1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        z1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !qrVar.E.send_polls, true, z40);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !qrVar.E.send_reactions, false, z40);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = qrVar.E;
                                                z1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z40);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !qrVar.E.send_roundvideos, true, z40);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !qrVar.E.send_voices, true, z40);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !qrVar.E.send_docs, true, z40);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !qrVar.E.send_audios, true, z40);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !qrVar.E.send_stickers, true, z40);
                            break;
                        }
                    } else {
                        z1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !qrVar.E.send_videos, true, z40);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !qrVar.E.send_photos, true, z40);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 != qrVar.h1) {
                    if (i10 != qrVar.i1) {
                        if (i10 == qrVar.n0) {
                            x8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), qrVar.y1, false);
                            break;
                        }
                    } else {
                        x8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), qrVar.w1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z41 = qrVar.v1;
                    x8Var.f(string6, z41, z41);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                if (i10 == qrVar.q0) {
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) qrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(qrVar.A1, qrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7(6);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.c = a2;
                    z7Var.d = 20;
                    z7Var.e = y7Var;
                    a8Var.d(clamp, z7Var, new t3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        View view;
        View view2;
        Context context = this.c;
        qr qrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = qrVar.O;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, qrVar.e1 == 0);
                b5Var.setDelegate(new lr(this, 0));
                view2 = b5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                if (!qrVar.v) {
                    if (!qrVar.w) {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = f9Var;
                        break;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = f9Var;
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = f9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                view2 = m4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.fa(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) qrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                view = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.tv0 tv0Var = new org.telegram.ui.Components.tv0(context, null);
                tv0Var.b(qrVar.p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                tv0Var.setCallback(new lr(this, 1));
                view = tv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(p0Var);
                view = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, this.c, qrVar.getResourceProvider(), false, true);
                s8Var.v = 50;
                view = s8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, qrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                z1Var.setEnabled(true);
                view = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.tv0 tv0Var2 = new org.telegram.ui.Components.tv0(context, null);
                Drawable[] drawableArr = {qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = qrVar.s1;
                tv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                tv0Var2.setCallback(new lr(this, 2));
                view2 = tv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.x8(context, qrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.a8(context, qrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
