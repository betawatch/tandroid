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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ pr d;

    public lr(pr prVar, Context context) {
        this.d = prVar;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.I0) goto L42;
     */
    @Override // org.telegram.ui.Components.rl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 != 16) {
            pr prVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(prVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) l1Var.a).getCurrentObject();
                if (prVar.L != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = l1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == prVar.u0) {
                            return ChatObject.canUserDoAdminAction(prVar.r, 13);
                        }
                        if (b10 == prVar.G0) {
                            return ChatObject.canUserDoAdminAction(prVar.r, 2);
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
        int i11 = prVar.B0;
        if (i10 >= i11 && i10 < prVar.C0) {
            return (TLObject) prVar.C.get(i10 - i11);
        }
        int i12 = prVar.R0;
        if (i10 >= i12 && i10 < prVar.S0) {
            return (TLObject) prVar.E.get(i10 - i12);
        }
        int i13 = prVar.U0;
        if (i10 < i13 || i10 >= prVar.V0) {
            return null;
        }
        return (TLObject) prVar.D.get(i10 - i13);
    }

    @Override // f2.o0
    public final int h() {
        return this.d.a1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        pr prVar = this.d;
        if (i10 == prVar.w0 || i10 == prVar.x0 || i10 == prVar.s0 || i10 == prVar.q0) {
            return 2;
        }
        if ((i10 >= prVar.B0 && i10 < prVar.C0) || ((i10 >= prVar.U0 && i10 < prVar.V0) || (i10 >= prVar.R0 && i10 < prVar.S0))) {
            return 0;
        }
        if (i10 == prVar.z0 || i10 == prVar.D0 || i10 == prVar.E0) {
            return 3;
        }
        if (i10 == prVar.A0 || i10 == prVar.P || i10 == prVar.K0 || i10 == prVar.p0 || i10 == prVar.m0) {
            return 5;
        }
        if (i10 == prVar.Y0 || i10 == prVar.M0 || i10 == prVar.O0 || i10 == prVar.r0 || i10 == prVar.v0 || i10 == prVar.H0 || i10 == prVar.J0 || i10 == prVar.g1 || i10 == prVar.l0 || i10 == prVar.o0) {
            return 1;
        }
        if (i10 == prVar.Z0) {
            return 4;
        }
        if (i10 == prVar.y0) {
            return 6;
        }
        if (i10 == prVar.d0 || i10 == prVar.e0 || i10 == prVar.j0 || i10 == prVar.f0 || i10 == prVar.g0 || i10 == prVar.Q || i10 == prVar.b0 || i10 == prVar.c0 || i10 == prVar.i0 || i10 == prVar.N0) {
            return 7;
        }
        if (i10 == prVar.W0 || i10 == prVar.Q0 || i10 == prVar.T0 || i10 == prVar.d1) {
            return 8;
        }
        if (i10 == prVar.L0) {
            return 9;
        }
        if (i10 == prVar.X0) {
            return 10;
        }
        if (i10 == prVar.c1) {
            return 11;
        }
        if (i10 == prVar.u0 || i10 == prVar.G0 || i10 == prVar.I0) {
            return 12;
        }
        if (prVar.p0(i10)) {
            return 13;
        }
        if (i10 == prVar.R) {
            return 14;
        }
        if (i10 == prVar.P0) {
            return 15;
        }
        if (i10 == prVar.e1 || i10 == prVar.f1 || i10 == prVar.k0) {
            return 16;
        }
        return i10 == prVar.n0 ? 17 : 0;
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
        pr prVar = this.d;
        ArrayList arrayList = prVar.C;
        boolean z15 = prVar.w;
        boolean z16 = prVar.v;
        int i14 = prVar.L;
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
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < prVar.B0 || i10 >= (i11 = prVar.C0)) {
                    if (i10 >= prVar.R0 && i10 < (i11 = prVar.S0)) {
                        if (ChatObject.isChannel(prVar.r)) {
                            break;
                        }
                    } else {
                        i11 = prVar.V0;
                    }
                    z4 = false;
                } else {
                    if (ChatObject.isChannel(prVar.r)) {
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
                        chat = prVar.getMessagesController().getUser(Long.valueOf(j11));
                        i12 = i11;
                    } else {
                        z13 = z11;
                        z14 = z10;
                        i12 = i11;
                        chat = prVar.getMessagesController().getChat(Long.valueOf(-j11));
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
                                        if (!z14 || (user = prVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
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
                                b5Var.b(chat, null, (!z12 || (user2 = prVar.getMessagesController().getUser(Long.valueOf(j12))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb = charSequence;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                boolean z21 = tL_chatBannedRights.view_messages;
                                if (z21 && prVar.B.view_messages != z21) {
                                    sb2.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && prVar.B.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z22 = tL_chatBannedRights.send_media;
                                if (!z22 || prVar.B.send_media == z22) {
                                    boolean z23 = tL_chatBannedRights.send_photos;
                                    if (z23 && prVar.B.send_photos != z23) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z24 = tL_chatBannedRights.send_videos;
                                    if (z24 && prVar.B.send_videos != z24) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_audios;
                                    if (z25 && prVar.B.send_audios != z25) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_docs;
                                    if (z26 && prVar.B.send_docs != z26) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_voices;
                                    if (z27 && prVar.B.send_voices != z27) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_roundvideos;
                                    if (z28 && prVar.B.send_roundvideos != z28) {
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
                                if (z29 && prVar.B.send_stickers != z29) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z30 = tL_chatBannedRights.send_polls;
                                if (z30 && prVar.B.send_polls != z30) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z31 = tL_chatBannedRights.embed_links;
                                if (z31 && !tL_chatBannedRights.send_plain && prVar.B.embed_links != z31) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z32 = tL_chatBannedRights.invite_users;
                                if (z32 && prVar.B.invite_users != z32) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z33 = tL_chatBannedRights.pin_messages;
                                if (z33 && prVar.B.pin_messages != z33) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z34 = tL_chatBannedRights.edit_rank;
                                if (z34 && prVar.B.edit_rank != z34) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z35 = tL_chatBannedRights.send_reactions;
                                if (z35 && prVar.B.send_reactions != z35) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z36 = tL_chatBannedRights.change_info;
                                if (z36 && prVar.B.change_info != z36) {
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
                if (i10 != prVar.v0) {
                    if (i10 != prVar.Y0) {
                        if (i10 != prVar.M0) {
                            if (i10 != prVar.l0) {
                                if (i10 != prVar.o0) {
                                    if (i10 != prVar.H0) {
                                        if (i10 != prVar.J0) {
                                            if (i10 != prVar.r0) {
                                                if (i10 != prVar.O0) {
                                                    if (i10 == prVar.g1) {
                                                        a9Var.setText(LocaleController.getString(prVar.s1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!prVar.o1) {
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
                                    a9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, rh.k.G0(prVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((prVar.x1 * (prVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * prVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                a9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = pr.m0(prVar.m1);
                            if (prVar.s != null && m0 != 0) {
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
                                if (!z16 || prVar.b1 != 0) {
                                    a9Var.setText("");
                                    break;
                                } else {
                                    a9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (prVar.w0 == -1) {
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
                y4Var.a(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                if (i10 != prVar.w0) {
                    if (i10 != prVar.s0) {
                        if (i10 != prVar.x0) {
                            if (i10 == prVar.q0) {
                                y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            if ((!prVar.N || prVar.O) && prVar.W0 == -1 && !arrayList.isEmpty()) {
                                z19 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z19);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, prVar.u0 > prVar.s0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                if (prVar.x0 != -1 || ((!prVar.N || prVar.O) && prVar.W0 == -1 && !arrayList.isEmpty())) {
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
                            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !prVar.N || prVar.O);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, prVar.B0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != prVar.A0) {
                    if (i10 != prVar.P) {
                        if (i10 != prVar.K0) {
                            if (i10 != prVar.p0) {
                                if (i10 == prVar.m0) {
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
                    TLRPC.ChatFull chatFull3 = prVar.s;
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
                TLRPC.ChatFull chatFull4 = prVar.s;
                aaVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = r8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.j6.r7;
                int i20 = org.telegram.ui.ActionBar.j6.V6;
                int i21 = org.telegram.ui.ActionBar.j6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z38 = r8Var.getTag() != null && ((Integer) r8Var.getTag()).intValue() == i10;
                r8Var.setTag(Integer.valueOf(i10));
                if (i10 == prVar.d0) {
                    r8Var.d(LocaleController.getString(z15 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (prVar.B.change_info || ChatObject.isPublic(prVar.r)) ? false : true, prVar.i0 != -1, z38);
                } else if (i10 == prVar.j0) {
                    r8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !prVar.B.manage_linked_peers, false, z38);
                } else if (i10 == prVar.e0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !prVar.B.invite_users, true, z38);
                } else if (i10 == prVar.f0) {
                    r8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (prVar.B.pin_messages || ChatObject.isPublic(prVar.r)) ? false : true, true, z38);
                } else if (i10 == prVar.g0) {
                    r8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !prVar.B.edit_rank, true, z38);
                } else if (i10 == prVar.Q) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !prVar.B.send_plain, true, z38);
                } else if (i10 == prVar.N0) {
                    r8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), prVar.o1, false, z38);
                    r8Var.getCheckBox().setDrawIconType(0);
                    r8Var.getCheckBox().d(org.telegram.ui.ActionBar.j6.M6, org.telegram.ui.ActionBar.j6.N6, i21, i21);
                } else if (i10 == prVar.R) {
                    int n02 = pr.n0(prVar.B);
                    r8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z38);
                    Locale locale = Locale.US;
                    r8Var.a(new androidx.biometric.k(29, this, r8Var), android.support.v4.media.a.l(n02, "/10"), !prVar.i1);
                } else if (i10 == prVar.b0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !prVar.B.send_stickers, true, z38);
                } else if (i10 == prVar.c0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !prVar.B.embed_links, true, z38);
                } else if (i10 == prVar.a0) {
                    r8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !prVar.B.send_polls, true, false);
                } else if (i10 == prVar.i0) {
                    r8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !prVar.B.manage_topics, false, z38);
                }
                if (i10 == prVar.f0 || i10 == prVar.d0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) prVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, prVar.K)) {
                        r8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(prVar.r)) {
                    r8Var.setIcon(0);
                    break;
                } else if ((i10 == prVar.e0 && !ChatObject.canUserDoAdminAction(prVar.r, 3)) || ((i10 == prVar.f0 && !ChatObject.canUserDoAdminAction(prVar.r, 0)) || ((i10 == prVar.d0 && !ChatObject.canUserDoAdminAction(prVar.r, 1)) || ((i10 == prVar.i0 && !ChatObject.canManageTopics(prVar.r)) || (ChatObject.isPublic(prVar.r) && (i10 == prVar.f0 || i10 == prVar.d0)))))) {
                    r8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    r8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                if (i10 != prVar.W0) {
                    if (i10 != prVar.T0) {
                        if (i10 != prVar.Q0) {
                            if (i10 == prVar.d1) {
                                u3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(prVar.r) && !prVar.r.megagroup) {
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
                } else if (ChatObject.isChannel(prVar.r) && !prVar.r.megagroup) {
                    u3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    u3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = (org.telegram.ui.Components.t00) view;
                if (i14 != 0) {
                    t00Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = prVar.s;
                    t00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                if (i10 != prVar.u0) {
                    if (i10 != prVar.G0) {
                        if (i10 == prVar.I0) {
                            o8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = prVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z20 = false;
                            }
                            o8Var.j(string2, z20, false);
                            break;
                        }
                    } else {
                        o8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(prVar.r, 2) && ((chatFull = prVar.s) == null || chatFull.participants_hidden || prVar.l0() >= prVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = prVar.s;
                        o8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    o8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(prVar.r, 13) && ((chatFull2 = prVar.s) == null || chatFull2.antispam || prVar.l0() >= prVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = prVar.s;
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
                if (i10 != prVar.S) {
                    if (i10 != prVar.T) {
                        if (i10 != prVar.U) {
                            if (i10 != prVar.V) {
                                if (i10 != prVar.W) {
                                    if (i10 != prVar.X) {
                                        if (i10 != prVar.Y) {
                                            if (i10 != prVar.Z) {
                                                if (i10 != prVar.h0) {
                                                    if (i10 != prVar.a0) {
                                                        z1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        z1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !prVar.B.send_polls, true, z39);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !prVar.B.send_reactions, false, z39);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = prVar.B;
                                                z1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z39);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !prVar.B.send_roundvideos, true, z39);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !prVar.B.send_voices, true, z39);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !prVar.B.send_docs, true, z39);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !prVar.B.send_audios, true, z39);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !prVar.B.send_stickers, true, z39);
                            break;
                        }
                    } else {
                        z1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !prVar.B.send_videos, true, z39);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !prVar.B.send_photos, true, z39);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i10 != prVar.e1) {
                    if (i10 != prVar.f1) {
                        if (i10 == prVar.k0) {
                            s8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), prVar.v1, false);
                            break;
                        }
                    } else {
                        s8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), prVar.t1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z40 = prVar.s1;
                    s8Var.f(string6, z40, z40);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                if (i10 == prVar.n0) {
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) prVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(prVar.x1, prVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    m.j0 j0Var = new m.j0(24);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = j0Var;
                    x7Var.d(clamp, w7Var, new w3(this, 3));
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
        pr prVar = this.d;
        switch (i10) {
            case 0:
                int i11 = prVar.L;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, prVar.b1 == 0);
                b5Var.setDelegate(new kr(this, 0));
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
                if (!prVar.v) {
                    if (!prVar.w) {
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
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
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
                f6Var = ((org.telegram.ui.ActionBar.p2) prVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                view = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                uv0Var.b(prVar.m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var.setCallback(new kr(this, 1));
                view = uv0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.w0 w0Var = new f2.w0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(w0Var);
                view = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, this.c, prVar.getResourceProvider(), false, true);
                o8Var.v = 50;
                view = o8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, prVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                z1Var.setEnabled(true);
                view = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = prVar.p1;
                uv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                uv0Var2.setCallback(new kr(this, 2));
                view2 = uv0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.s8(context, prVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.x7(context, prVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
