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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ rr d;

    public nr(rr rrVar, Context context) {
        this.d = rrVar;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.I0) goto L42;
     */
    @Override // org.telegram.ui.Components.ql0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 != 16) {
            rr rrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(rrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) l1Var.a).getCurrentObject();
                if (rrVar.L != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = l1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == rrVar.u0) {
                            return ChatObject.canUserDoAdminAction(rrVar.r, 13);
                        }
                        if (b10 == rrVar.G0) {
                            return ChatObject.canUserDoAdminAction(rrVar.r, 2);
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
        rr rrVar = this.d;
        int i11 = rrVar.B0;
        if (i10 >= i11 && i10 < rrVar.C0) {
            return (TLObject) rrVar.C.get(i10 - i11);
        }
        int i12 = rrVar.R0;
        if (i10 >= i12 && i10 < rrVar.S0) {
            return (TLObject) rrVar.E.get(i10 - i12);
        }
        int i13 = rrVar.U0;
        if (i10 < i13 || i10 >= rrVar.V0) {
            return null;
        }
        return (TLObject) rrVar.D.get(i10 - i13);
    }

    @Override // f2.o0
    public final int h() {
        return this.d.a1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        rr rrVar = this.d;
        if (i10 == rrVar.w0 || i10 == rrVar.x0 || i10 == rrVar.s0 || i10 == rrVar.q0) {
            return 2;
        }
        if ((i10 >= rrVar.B0 && i10 < rrVar.C0) || ((i10 >= rrVar.U0 && i10 < rrVar.V0) || (i10 >= rrVar.R0 && i10 < rrVar.S0))) {
            return 0;
        }
        if (i10 == rrVar.z0 || i10 == rrVar.D0 || i10 == rrVar.E0) {
            return 3;
        }
        if (i10 == rrVar.A0 || i10 == rrVar.P || i10 == rrVar.K0 || i10 == rrVar.p0 || i10 == rrVar.m0) {
            return 5;
        }
        if (i10 == rrVar.Y0 || i10 == rrVar.M0 || i10 == rrVar.O0 || i10 == rrVar.r0 || i10 == rrVar.v0 || i10 == rrVar.H0 || i10 == rrVar.J0 || i10 == rrVar.g1 || i10 == rrVar.l0 || i10 == rrVar.o0) {
            return 1;
        }
        if (i10 == rrVar.Z0) {
            return 4;
        }
        if (i10 == rrVar.y0) {
            return 6;
        }
        if (i10 == rrVar.d0 || i10 == rrVar.e0 || i10 == rrVar.j0 || i10 == rrVar.f0 || i10 == rrVar.g0 || i10 == rrVar.Q || i10 == rrVar.b0 || i10 == rrVar.c0 || i10 == rrVar.i0 || i10 == rrVar.N0) {
            return 7;
        }
        if (i10 == rrVar.W0 || i10 == rrVar.Q0 || i10 == rrVar.T0 || i10 == rrVar.d1) {
            return 8;
        }
        if (i10 == rrVar.L0) {
            return 9;
        }
        if (i10 == rrVar.X0) {
            return 10;
        }
        if (i10 == rrVar.c1) {
            return 11;
        }
        if (i10 == rrVar.u0 || i10 == rrVar.G0 || i10 == rrVar.I0) {
            return 12;
        }
        if (rrVar.p0(i10)) {
            return 13;
        }
        if (i10 == rrVar.R) {
            return 14;
        }
        if (i10 == rrVar.P0) {
            return 15;
        }
        if (i10 == rrVar.e1 || i10 == rrVar.f1 || i10 == rrVar.k0) {
            return 16;
        }
        return i10 == rrVar.n0 ? 17 : 0;
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
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
        rr rrVar = this.d;
        ArrayList arrayList = rrVar.C;
        boolean z15 = rrVar.w;
        boolean z16 = rrVar.v;
        int i14 = rrVar.L;
        int i15 = l1Var.f;
        View view = l1Var.a;
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
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                a5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < rrVar.B0 || i10 >= (i11 = rrVar.C0)) {
                    if (i10 >= rrVar.R0 && i10 < (i11 = rrVar.S0)) {
                        if (ChatObject.isChannel(rrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = rrVar.V0;
                    }
                    z4 = false;
                } else {
                    if (ChatObject.isChannel(rrVar.r)) {
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
                        chat = rrVar.getMessagesController().getUser(Long.valueOf(j11));
                        i12 = i11;
                    } else {
                        z13 = z11;
                        z14 = z10;
                        i12 = i11;
                        chat = rrVar.getMessagesController().getChat(Long.valueOf(-j11));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        a5Var.b(chat, null, (!z4 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z13) {
                                        if (!z14 || (user = rrVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j11) {
                                            charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                        } else {
                                            charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                        }
                                        a5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    a5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                }
                            } else {
                                a5Var.b(chat, null, (!z12 || (user2 = rrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb = charSequence;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                boolean z21 = tL_chatBannedRights.view_messages;
                                if (z21 && rrVar.B.view_messages != z21) {
                                    sb2.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && rrVar.B.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z22 = tL_chatBannedRights.send_media;
                                if (!z22 || rrVar.B.send_media == z22) {
                                    boolean z23 = tL_chatBannedRights.send_photos;
                                    if (z23 && rrVar.B.send_photos != z23) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z24 = tL_chatBannedRights.send_videos;
                                    if (z24 && rrVar.B.send_videos != z24) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_audios;
                                    if (z25 && rrVar.B.send_audios != z25) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_docs;
                                    if (z26 && rrVar.B.send_docs != z26) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_voices;
                                    if (z27 && rrVar.B.send_voices != z27) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_roundvideos;
                                    if (z28 && rrVar.B.send_roundvideos != z28) {
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
                                if (z29 && rrVar.B.send_stickers != z29) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z30 = tL_chatBannedRights.send_polls;
                                if (z30 && rrVar.B.send_polls != z30) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z31 = tL_chatBannedRights.embed_links;
                                if (z31 && !tL_chatBannedRights.send_plain && rrVar.B.embed_links != z31) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z32 = tL_chatBannedRights.invite_users;
                                if (z32 && rrVar.B.invite_users != z32) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z33 = tL_chatBannedRights.pin_messages;
                                if (z33 && rrVar.B.pin_messages != z33) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z34 = tL_chatBannedRights.edit_rank;
                                if (z34 && rrVar.B.edit_rank != z34) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z35 = tL_chatBannedRights.send_reactions;
                                if (z35 && rrVar.B.send_reactions != z35) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z36 = tL_chatBannedRights.change_info;
                                if (z36 && rrVar.B.change_info != z36) {
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
                            a5Var.b(chat, null, sb, i10 != i12 + (-1));
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
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 != rrVar.v0) {
                    if (i10 != rrVar.Y0) {
                        if (i10 != rrVar.M0) {
                            if (i10 != rrVar.l0) {
                                if (i10 != rrVar.o0) {
                                    if (i10 != rrVar.H0) {
                                        if (i10 != rrVar.J0) {
                                            if (i10 != rrVar.r0) {
                                                if (i10 != rrVar.O0) {
                                                    if (i10 == rrVar.g1) {
                                                        z8Var.setText(LocaleController.getString(rrVar.s1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!rrVar.o1) {
                                                    z8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    z8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                z8Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            z8Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        z8Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    z8Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, rh.j.G0(rrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((rrVar.x1 * (rrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * rrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                z8Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = rr.m0(rrVar.m1);
                            if (rrVar.s != null && m0 != 0) {
                                z8Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                z8Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z16 || rrVar.b1 != 0) {
                                    z8Var.setText("");
                                    break;
                                } else {
                                    z8Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (rrVar.w0 == -1) {
                            z8Var.setText("");
                            break;
                        } else if (!z16) {
                            z8Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            z8Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z16) {
                        if (!z15) {
                            z8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            z8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        z8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    z8Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                if (i10 != rrVar.w0) {
                    if (i10 != rrVar.s0) {
                        if (i10 != rrVar.x0) {
                            if (i10 == rrVar.q0) {
                                x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                x4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            if ((!rrVar.N || rrVar.O) && rrVar.W0 == -1 && !arrayList.isEmpty()) {
                                z19 = true;
                            }
                            x4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z19);
                            break;
                        }
                    } else {
                        x4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, rrVar.u0 > rrVar.s0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                if (rrVar.x0 != -1 || ((!rrVar.N || rrVar.O) && rrVar.W0 == -1 && !arrayList.isEmpty())) {
                                    z18 = true;
                                }
                                if (!z16) {
                                    x4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z18);
                                    break;
                                } else {
                                    x4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z18);
                                    break;
                                }
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            x4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !rrVar.N || rrVar.O);
                            break;
                        }
                    } else {
                        x4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                    x4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, rrVar.B0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != rrVar.A0) {
                    if (i10 != rrVar.P) {
                        if (i10 != rrVar.K0) {
                            if (i10 != rrVar.p0) {
                                if (i10 == rrVar.m0) {
                                    l4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                l4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            l4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        l4Var.setText(LocaleController.getString(z15 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = rrVar.s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        l4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        l4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = rrVar.s;
                z9Var.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = q8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.j6.r7;
                int i20 = org.telegram.ui.ActionBar.j6.V6;
                int i21 = org.telegram.ui.ActionBar.j6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z38 = q8Var.getTag() != null && ((Integer) q8Var.getTag()).intValue() == i10;
                q8Var.setTag(Integer.valueOf(i10));
                if (i10 == rrVar.d0) {
                    q8Var.d(LocaleController.getString(z15 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (rrVar.B.change_info || ChatObject.isPublic(rrVar.r)) ? false : true, rrVar.i0 != -1, z38);
                } else if (i10 == rrVar.j0) {
                    q8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !rrVar.B.manage_linked_peers, false, z38);
                } else if (i10 == rrVar.e0) {
                    q8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !rrVar.B.invite_users, true, z38);
                } else if (i10 == rrVar.f0) {
                    q8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (rrVar.B.pin_messages || ChatObject.isPublic(rrVar.r)) ? false : true, true, z38);
                } else if (i10 == rrVar.g0) {
                    q8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !rrVar.B.edit_rank, true, z38);
                } else if (i10 == rrVar.Q) {
                    q8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !rrVar.B.send_plain, true, z38);
                } else if (i10 == rrVar.N0) {
                    q8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), rrVar.o1, false, z38);
                    q8Var.getCheckBox().setDrawIconType(0);
                    q8Var.getCheckBox().d(org.telegram.ui.ActionBar.j6.M6, org.telegram.ui.ActionBar.j6.N6, i21, i21);
                } else if (i10 == rrVar.R) {
                    int n02 = rr.n0(rrVar.B);
                    q8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z38);
                    Locale locale = Locale.US;
                    q8Var.a(new androidx.biometric.j(29, this, q8Var), android.support.v4.media.a.l(n02, "/10"), !rrVar.i1);
                } else if (i10 == rrVar.b0) {
                    q8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !rrVar.B.send_stickers, true, z38);
                } else if (i10 == rrVar.c0) {
                    q8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !rrVar.B.embed_links, true, z38);
                } else if (i10 == rrVar.a0) {
                    q8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !rrVar.B.send_polls, true, false);
                } else if (i10 == rrVar.i0) {
                    q8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !rrVar.B.manage_topics, false, z38);
                }
                if (i10 == rrVar.f0 || i10 == rrVar.d0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) rrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, rrVar.K)) {
                        q8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(rrVar.r)) {
                    q8Var.setIcon(0);
                    break;
                } else if ((i10 == rrVar.e0 && !ChatObject.canUserDoAdminAction(rrVar.r, 3)) || ((i10 == rrVar.f0 && !ChatObject.canUserDoAdminAction(rrVar.r, 0)) || ((i10 == rrVar.d0 && !ChatObject.canUserDoAdminAction(rrVar.r, 1)) || ((i10 == rrVar.i0 && !ChatObject.canManageTopics(rrVar.r)) || (ChatObject.isPublic(rrVar.r) && (i10 == rrVar.f0 || i10 == rrVar.d0)))))) {
                    q8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    q8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
                if (i10 != rrVar.W0) {
                    if (i10 != rrVar.T0) {
                        if (i10 != rrVar.Q0) {
                            if (i10 == rrVar.d1) {
                                t3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(rrVar.r) && !rrVar.r.megagroup) {
                            t3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            t3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        t3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(rrVar.r) && !rrVar.r.megagroup) {
                    t3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    t3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = (org.telegram.ui.Components.u00) view;
                if (i14 != 0) {
                    u00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = rrVar.s;
                    u00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                if (i10 != rrVar.u0) {
                    if (i10 != rrVar.G0) {
                        if (i10 == rrVar.I0) {
                            n8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = rrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z20 = false;
                            }
                            n8Var.j(string2, z20, false);
                            break;
                        }
                    } else {
                        n8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(rrVar.r, 2) && ((chatFull = rrVar.s) == null || chatFull.participants_hidden || rrVar.l0() >= rrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = rrVar.s;
                        n8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    n8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(rrVar.r, 13) && ((chatFull2 = rrVar.s) == null || chatFull2.antispam || rrVar.l0() >= rrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = rrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z17 = true;
                    }
                    n8Var.l(R.drawable.msg_policy, string4, z17);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z39 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 != rrVar.S) {
                    if (i10 != rrVar.T) {
                        if (i10 != rrVar.U) {
                            if (i10 != rrVar.V) {
                                if (i10 != rrVar.W) {
                                    if (i10 != rrVar.X) {
                                        if (i10 != rrVar.Y) {
                                            if (i10 != rrVar.Z) {
                                                if (i10 != rrVar.h0) {
                                                    if (i10 != rrVar.a0) {
                                                        y1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        y1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !rrVar.B.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !rrVar.B.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = rrVar.B;
                                                y1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            y1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !rrVar.B.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        y1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !rrVar.B.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    y1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !rrVar.B.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                y1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !rrVar.B.send_audios, true, z39);
                                break;
                            }
                        } else {
                            y1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !rrVar.B.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        y1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !rrVar.B.send_videos, true, z39);
                        break;
                    }
                } else {
                    y1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !rrVar.B.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i10 != rrVar.e1) {
                    if (i10 != rrVar.f1) {
                        if (i10 == rrVar.k0) {
                            r8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), rrVar.v1, false);
                            break;
                        }
                    } else {
                        r8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), rrVar.t1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z40 = rrVar.s1;
                    r8Var.f(string6, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                if (i10 == rrVar.n0) {
                    int[] a2 = org.telegram.ui.Cells.w7.a((int) rrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(rrVar.x1, rrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    m.j0 j0Var = new m.j0(24);
                    org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7();
                    v7Var.c = a2;
                    v7Var.d = 20;
                    v7Var.e = j0Var;
                    w7Var.d(clamp, v7Var, new y3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View view;
        View view2;
        Context context = this.c;
        rr rrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = rrVar.L;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, rrVar.b1 == 0);
                a5Var.setDelegate(new mr(this, 0));
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
                view = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (!rrVar.v) {
                    if (!rrVar.w) {
                        z8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = z8Var;
                        break;
                    } else {
                        z8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = z8Var;
                        break;
                    }
                } else {
                    z8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                view2 = l4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.z9(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) rrVar).resourceProvider;
                View t3Var = new org.telegram.ui.Cells.t3(context, 26, f6Var);
                t3Var.setBackground(null);
                view = t3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                uv0Var.b(rrVar.m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var.setCallback(new mr(this, 1));
                view = uv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.w0 w0Var = new f2.w0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(w0Var);
                view = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, this.c, rrVar.getResourceProvider(), false, true);
                n8Var.v = 50;
                view = n8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.c, rrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                y1Var.setEnabled(true);
                view = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = rrVar.p1;
                uv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                uv0Var2.setCallback(new mr(this, 2));
                view2 = uv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.r8(context, rrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.w7(context, rrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.dl0(view);
    }
}
