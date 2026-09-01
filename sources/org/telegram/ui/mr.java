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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final /* synthetic */ qr d;

    public mr(qr qrVar, Context context) {
        this.d = qrVar;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.I0) goto L42;
     */
    @Override // org.telegram.ui.Components.sl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        if (i10 != 16) {
            qr qrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(qrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) m1Var.a).getCurrentObject();
                if (qrVar.L != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = m1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == qrVar.u0) {
                            return ChatObject.canUserDoAdminAction(qrVar.r, 13);
                        }
                        if (b10 == qrVar.G0) {
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
        int i11 = qrVar.B0;
        if (i10 >= i11 && i10 < qrVar.C0) {
            return (TLObject) qrVar.C.get(i10 - i11);
        }
        int i12 = qrVar.R0;
        if (i10 >= i12 && i10 < qrVar.S0) {
            return (TLObject) qrVar.E.get(i10 - i12);
        }
        int i13 = qrVar.U0;
        if (i10 < i13 || i10 >= qrVar.V0) {
            return null;
        }
        return (TLObject) qrVar.D.get(i10 - i13);
    }

    @Override // f2.p0
    public final int h() {
        return this.d.a1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        qr qrVar = this.d;
        if (i10 == qrVar.w0 || i10 == qrVar.x0 || i10 == qrVar.s0 || i10 == qrVar.q0) {
            return 2;
        }
        if ((i10 >= qrVar.B0 && i10 < qrVar.C0) || ((i10 >= qrVar.U0 && i10 < qrVar.V0) || (i10 >= qrVar.R0 && i10 < qrVar.S0))) {
            return 0;
        }
        if (i10 == qrVar.z0 || i10 == qrVar.D0 || i10 == qrVar.E0) {
            return 3;
        }
        if (i10 == qrVar.A0 || i10 == qrVar.P || i10 == qrVar.K0 || i10 == qrVar.p0 || i10 == qrVar.m0) {
            return 5;
        }
        if (i10 == qrVar.Y0 || i10 == qrVar.M0 || i10 == qrVar.O0 || i10 == qrVar.r0 || i10 == qrVar.v0 || i10 == qrVar.H0 || i10 == qrVar.J0 || i10 == qrVar.g1 || i10 == qrVar.l0 || i10 == qrVar.o0) {
            return 1;
        }
        if (i10 == qrVar.Z0) {
            return 4;
        }
        if (i10 == qrVar.y0) {
            return 6;
        }
        if (i10 == qrVar.d0 || i10 == qrVar.e0 || i10 == qrVar.j0 || i10 == qrVar.f0 || i10 == qrVar.g0 || i10 == qrVar.Q || i10 == qrVar.b0 || i10 == qrVar.c0 || i10 == qrVar.i0 || i10 == qrVar.N0) {
            return 7;
        }
        if (i10 == qrVar.W0 || i10 == qrVar.Q0 || i10 == qrVar.T0 || i10 == qrVar.d1) {
            return 8;
        }
        if (i10 == qrVar.L0) {
            return 9;
        }
        if (i10 == qrVar.X0) {
            return 10;
        }
        if (i10 == qrVar.c1) {
            return 11;
        }
        if (i10 == qrVar.u0 || i10 == qrVar.G0 || i10 == qrVar.I0) {
            return 12;
        }
        if (qrVar.p0(i10)) {
            return 13;
        }
        if (i10 == qrVar.R) {
            return 14;
        }
        if (i10 == qrVar.P0) {
            return 15;
        }
        if (i10 == qrVar.e1 || i10 == qrVar.f1 || i10 == qrVar.k0) {
            return 16;
        }
        return i10 == qrVar.n0 ? 17 : 0;
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        CharSequence charSequence;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        long j12;
        long j13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        TLObject chat;
        CharSequence charSequence2;
        TLRPC.User user;
        TLRPC.User user2;
        CharSequence sb;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        qr qrVar = this.d;
        ArrayList arrayList = qrVar.C;
        boolean z15 = qrVar.w;
        boolean z16 = qrVar.v;
        int i14 = qrVar.L;
        int i15 = m1Var.f;
        View view = m1Var.a;
        int i16 = 0;
        r13 = false;
        boolean z17 = false;
        r13 = false;
        r13 = false;
        boolean z18 = false;
        r13 = false;
        r13 = false;
        boolean z19 = false;
        r14 = true;
        r14 = true;
        boolean z20 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < qrVar.B0 || i10 >= (i11 = qrVar.C0)) {
                    if (i10 >= qrVar.R0 && i10 < (i11 = qrVar.S0)) {
                        if (ChatObject.isChannel(qrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = qrVar.V0;
                    }
                    z4 = false;
                } else {
                    if (ChatObject.isChannel(qrVar.r)) {
                        break;
                    }
                    z4 = false;
                }
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z11 = false;
                    z10 = false;
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
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z10 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i16 = i17;
                    j12 = j14;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j13 = j15;
                    if (j11 <= j10) {
                        z13 = z11;
                        z14 = z10;
                        chat = qrVar.getMessagesController().getUser(Long.valueOf(j11));
                        i12 = i11;
                    } else {
                        z13 = z11;
                        z14 = z10;
                        i12 = i11;
                        chat = qrVar.getMessagesController().getChat(Long.valueOf(-j11));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        b5Var.b(chat, null, (!z4 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z13) {
                                        if (!z14 || (user = qrVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j11) {
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
                                b5Var.b(chat, null, (!z12 || (user2 = qrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb = charSequence;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                boolean z21 = tL_chatBannedRights.view_messages;
                                if (z21 && qrVar.B.view_messages != z21) {
                                    sb2.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && qrVar.B.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z22 = tL_chatBannedRights.send_media;
                                if (!z22 || qrVar.B.send_media == z22) {
                                    boolean z23 = tL_chatBannedRights.send_photos;
                                    if (z23 && qrVar.B.send_photos != z23) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z24 = tL_chatBannedRights.send_videos;
                                    if (z24 && qrVar.B.send_videos != z24) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_audios;
                                    if (z25 && qrVar.B.send_audios != z25) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_docs;
                                    if (z26 && qrVar.B.send_docs != z26) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_voices;
                                    if (z27 && qrVar.B.send_voices != z27) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_roundvideos;
                                    if (z28 && qrVar.B.send_roundvideos != z28) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                } else {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
                                }
                                boolean z29 = tL_chatBannedRights.send_stickers;
                                if (z29 && qrVar.B.send_stickers != z29) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z30 = tL_chatBannedRights.send_polls;
                                if (z30 && qrVar.B.send_polls != z30) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z31 = tL_chatBannedRights.embed_links;
                                if (z31 && !tL_chatBannedRights.send_plain && qrVar.B.embed_links != z31) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z32 = tL_chatBannedRights.invite_users;
                                if (z32 && qrVar.B.invite_users != z32) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z33 = tL_chatBannedRights.pin_messages;
                                if (z33 && qrVar.B.pin_messages != z33) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z34 = tL_chatBannedRights.edit_rank;
                                if (z34 && qrVar.B.edit_rank != z34) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z35 = tL_chatBannedRights.send_reactions;
                                if (z35 && qrVar.B.send_reactions != z35) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z36 = tL_chatBannedRights.change_info;
                                if (z36 && qrVar.B.change_info != z36) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                }
                                if (sb2.length() != 0) {
                                    sb2.replace(0, 1, sb2.substring(0, 1).toUpperCase());
                                    sb2.append('.');
                                }
                                sb = sb2.toString();
                            }
                            b5Var.b(chat, null, sb, i10 != i12 + (-1));
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
                        boolean z37 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z10 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z11 = z37;
                        j12 = 0;
                        j13 = 0;
                        tL_chatBannedRights = null;
                    }
                }
                z12 = false;
                if (j11 <= j10) {
                }
                if (chat == null) {
                }
                break;
            case 1:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 != qrVar.v0) {
                    if (i10 != qrVar.Y0) {
                        if (i10 != qrVar.M0) {
                            if (i10 != qrVar.l0) {
                                if (i10 != qrVar.o0) {
                                    if (i10 != qrVar.H0) {
                                        if (i10 != qrVar.J0) {
                                            if (i10 != qrVar.r0) {
                                                if (i10 != qrVar.O0) {
                                                    if (i10 == qrVar.g1) {
                                                        a9Var.setText(LocaleController.getString(qrVar.s1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!qrVar.o1) {
                                                    a9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    a9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                a9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            a9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        a9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    a9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, sh.j.G0(qrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((qrVar.x1 * (qrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * qrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                a9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = qr.m0(qrVar.m1);
                            if (qrVar.s != null && m0 != 0) {
                                a9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                a9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z16 || qrVar.b1 != 0) {
                                    a9Var.setText("");
                                    break;
                                } else {
                                    a9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (qrVar.w0 == -1) {
                            a9Var.setText("");
                            break;
                        } else if (!z16) {
                            a9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            a9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z16) {
                        if (!z15) {
                            a9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            a9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    a9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                if (i10 != qrVar.w0) {
                    if (i10 != qrVar.s0) {
                        if (i10 != qrVar.x0) {
                            if (i10 == qrVar.q0) {
                                y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            if ((!qrVar.N || qrVar.O) && qrVar.W0 == -1 && !arrayList.isEmpty()) {
                                z19 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z19);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, qrVar.u0 > qrVar.s0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                if (qrVar.x0 != -1 || ((!qrVar.N || qrVar.O) && qrVar.W0 == -1 && !arrayList.isEmpty())) {
                                    z18 = true;
                                }
                                if (!z16) {
                                    y4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z18);
                                    break;
                                } else {
                                    y4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z18);
                                    break;
                                }
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !qrVar.N || qrVar.O);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, qrVar.B0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != qrVar.A0) {
                    if (i10 != qrVar.P) {
                        if (i10 != qrVar.K0) {
                            if (i10 != qrVar.p0) {
                                if (i10 == qrVar.m0) {
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
                        m4Var.setText(LocaleController.getString(z15 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
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
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = qrVar.s;
                aaVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = r8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.k6.r7;
                int i20 = org.telegram.ui.ActionBar.k6.V6;
                int i21 = org.telegram.ui.ActionBar.k6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z38 = r8Var.getTag() != null && ((Integer) r8Var.getTag()).intValue() == i10;
                r8Var.setTag(Integer.valueOf(i10));
                if (i10 == qrVar.d0) {
                    r8Var.d(LocaleController.getString(z15 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (qrVar.B.change_info || ChatObject.isPublic(qrVar.r)) ? false : true, qrVar.i0 != -1, z38);
                } else if (i10 == qrVar.j0) {
                    r8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !qrVar.B.manage_linked_peers, false, z38);
                } else if (i10 == qrVar.e0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !qrVar.B.invite_users, true, z38);
                } else if (i10 == qrVar.f0) {
                    r8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (qrVar.B.pin_messages || ChatObject.isPublic(qrVar.r)) ? false : true, true, z38);
                } else if (i10 == qrVar.g0) {
                    r8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !qrVar.B.edit_rank, true, z38);
                } else if (i10 == qrVar.Q) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !qrVar.B.send_plain, true, z38);
                } else if (i10 == qrVar.N0) {
                    r8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), qrVar.o1, false, z38);
                    r8Var.getCheckBox().setDrawIconType(0);
                    r8Var.getCheckBox().d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, i21, i21);
                } else if (i10 == qrVar.R) {
                    int n02 = qr.n0(qrVar.B);
                    r8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z38);
                    Locale locale = Locale.US;
                    r8Var.a(new androidx.biometric.k(29, this, r8Var), android.support.v4.media.a.l(n02, "/10"), !qrVar.i1);
                } else if (i10 == qrVar.b0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !qrVar.B.send_stickers, true, z38);
                } else if (i10 == qrVar.c0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !qrVar.B.embed_links, true, z38);
                } else if (i10 == qrVar.a0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !qrVar.B.send_polls, true, false);
                } else if (i10 == qrVar.i0) {
                    r8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !qrVar.B.manage_topics, false, z38);
                }
                if (i10 == qrVar.f0 || i10 == qrVar.d0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) qrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, qrVar.K)) {
                        r8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(qrVar.r)) {
                    r8Var.setIcon(0);
                    break;
                } else if ((i10 == qrVar.e0 && !ChatObject.canUserDoAdminAction(qrVar.r, 3)) || ((i10 == qrVar.f0 && !ChatObject.canUserDoAdminAction(qrVar.r, 0)) || ((i10 == qrVar.d0 && !ChatObject.canUserDoAdminAction(qrVar.r, 1)) || ((i10 == qrVar.i0 && !ChatObject.canManageTopics(qrVar.r)) || (ChatObject.isPublic(qrVar.r) && (i10 == qrVar.f0 || i10 == qrVar.d0)))))) {
                    r8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    r8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                if (i10 != qrVar.W0) {
                    if (i10 != qrVar.T0) {
                        if (i10 != qrVar.Q0) {
                            if (i10 == qrVar.d1) {
                                u3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(qrVar.r) && !qrVar.r.megagroup) {
                            u3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            u3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        u3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(qrVar.r) && !qrVar.r.megagroup) {
                    u3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    u3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
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
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                if (i10 != qrVar.u0) {
                    if (i10 != qrVar.G0) {
                        if (i10 == qrVar.I0) {
                            o8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = qrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z20 = false;
                            }
                            o8Var.j(string2, z20, false);
                            break;
                        }
                    } else {
                        o8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(qrVar.r, 2) && ((chatFull = qrVar.s) == null || chatFull.participants_hidden || qrVar.l0() >= qrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = qrVar.s;
                        o8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    o8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(qrVar.r, 13) && ((chatFull2 = qrVar.s) == null || chatFull2.antispam || qrVar.l0() >= qrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = qrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z17 = true;
                    }
                    o8Var.l(R.drawable.msg_policy, string4, z17);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z39 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != qrVar.S) {
                    if (i10 != qrVar.T) {
                        if (i10 != qrVar.U) {
                            if (i10 != qrVar.V) {
                                if (i10 != qrVar.W) {
                                    if (i10 != qrVar.X) {
                                        if (i10 != qrVar.Y) {
                                            if (i10 != qrVar.Z) {
                                                if (i10 != qrVar.h0) {
                                                    if (i10 != qrVar.a0) {
                                                        z1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        z1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !qrVar.B.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !qrVar.B.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = qrVar.B;
                                                z1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !qrVar.B.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !qrVar.B.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !qrVar.B.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !qrVar.B.send_audios, true, z39);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !qrVar.B.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        z1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !qrVar.B.send_videos, true, z39);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !qrVar.B.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i10 != qrVar.e1) {
                    if (i10 != qrVar.f1) {
                        if (i10 == qrVar.k0) {
                            s8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), qrVar.v1, false);
                            break;
                        }
                    } else {
                        s8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), qrVar.t1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z40 = qrVar.s1;
                    s8Var.f(string6, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                if (i10 == qrVar.n0) {
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) qrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(qrVar.x1, qrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    mh.c3 c3Var = new mh.c3(24);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = c3Var;
                    x7Var.d(clamp, w7Var, new w3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        View view;
        View view2;
        Context context = this.c;
        qr qrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = qrVar.L;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, qrVar.b1 == 0);
                b5Var.setDelegate(new lr(this, 0));
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
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                if (!qrVar.v) {
                    if (!qrVar.w) {
                        a9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = a9Var;
                        break;
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = a9Var;
                        break;
                    }
                } else {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                view2 = m4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.aa(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.p2) qrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, g6Var);
                u3Var.setBackground(null);
                view = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.vv0 vv0Var = new org.telegram.ui.Components.vv0(context, null);
                vv0Var.b(qrVar.m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                vv0Var.setCallback(new lr(this, 1));
                view = vv0Var;
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
                f2.x0 x0Var = new f2.x0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(x0Var);
                view = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, this.c, qrVar.getResourceProvider(), false, true);
                o8Var.v = 50;
                view = o8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, qrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                z1Var.setEnabled(true);
                view = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.vv0 vv0Var2 = new org.telegram.ui.Components.vv0(context, null);
                Drawable[] drawableArr = {qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = qrVar.p1;
                vv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                vv0Var2.setCallback(new lr(this, 2));
                view2 = vv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.s8(context, qrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.x7(context, qrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
