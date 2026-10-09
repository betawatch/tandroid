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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pr extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ tr d;

    public pr(tr trVar, Context context) {
        this.d = trVar;
        this.c = context;
    }

    @Override // s4.i0
    public final void A(s4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.L0) goto L42;
     */
    @Override // org.telegram.ui.Components.pm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        if (i10 != 16) {
            tr trVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(trVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) d1Var.a).getCurrentObject();
                if (trVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = d1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == trVar.x0) {
                            return ChatObject.canUserDoAdminAction(trVar.r, 13);
                        }
                        if (b10 == trVar.J0) {
                            return ChatObject.canUserDoAdminAction(trVar.r, 2);
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
        tr trVar = this.d;
        int i11 = trVar.E0;
        if (i10 >= i11 && i10 < trVar.F0) {
            return (TLObject) trVar.F.get(i10 - i11);
        }
        int i12 = trVar.U0;
        if (i10 >= i12 && i10 < trVar.V0) {
            return (TLObject) trVar.H.get(i10 - i12);
        }
        int i13 = trVar.X0;
        if (i10 < i13 || i10 >= trVar.Y0) {
            return null;
        }
        return (TLObject) trVar.G.get(i10 - i13);
    }

    @Override // s4.i0
    public final int h() {
        return this.d.d1;
    }

    @Override // s4.i0
    public final int j(int i10) {
        tr trVar = this.d;
        if (i10 == trVar.z0 || i10 == trVar.A0 || i10 == trVar.v0 || i10 == trVar.t0) {
            return 2;
        }
        if ((i10 >= trVar.E0 && i10 < trVar.F0) || ((i10 >= trVar.X0 && i10 < trVar.Y0) || (i10 >= trVar.U0 && i10 < trVar.V0))) {
            return 0;
        }
        if (i10 == trVar.C0 || i10 == trVar.G0 || i10 == trVar.H0) {
            return 3;
        }
        if (i10 == trVar.D0 || i10 == trVar.S || i10 == trVar.N0 || i10 == trVar.s0 || i10 == trVar.p0) {
            return 5;
        }
        if (i10 == trVar.b1 || i10 == trVar.P0 || i10 == trVar.R0 || i10 == trVar.u0 || i10 == trVar.y0 || i10 == trVar.K0 || i10 == trVar.M0 || i10 == trVar.j1 || i10 == trVar.o0 || i10 == trVar.r0) {
            return 1;
        }
        if (i10 == trVar.c1) {
            return 4;
        }
        if (i10 == trVar.B0) {
            return 6;
        }
        if (i10 == trVar.g0 || i10 == trVar.h0 || i10 == trVar.m0 || i10 == trVar.i0 || i10 == trVar.j0 || i10 == trVar.T || i10 == trVar.e0 || i10 == trVar.f0 || i10 == trVar.l0 || i10 == trVar.Q0) {
            return 7;
        }
        if (i10 == trVar.Z0 || i10 == trVar.T0 || i10 == trVar.W0 || i10 == trVar.g1) {
            return 8;
        }
        if (i10 == trVar.O0) {
            return 9;
        }
        if (i10 == trVar.a1) {
            return 10;
        }
        if (i10 == trVar.f1) {
            return 11;
        }
        if (i10 == trVar.x0 || i10 == trVar.J0 || i10 == trVar.L0) {
            return 12;
        }
        if (trVar.p0(i10)) {
            return 13;
        }
        if (i10 == trVar.U) {
            return 14;
        }
        if (i10 == trVar.S0) {
            return 15;
        }
        if (i10 == trVar.h1 || i10 == trVar.i1 || i10 == trVar.n0) {
            return 16;
        }
        return i10 == trVar.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e4, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e6, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x07fc, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0b33  */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        Object[] objArr;
        CharSequence charSequence;
        long j3;
        long j10;
        boolean z10;
        boolean z11;
        long j11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        TLObject chat;
        boolean z15;
        CharSequence charSequence2;
        TLRPC.User user;
        boolean z16;
        CharSequence charSequence3;
        TLRPC.User user2;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        tr trVar = this.d;
        ArrayList arrayList = trVar.F;
        boolean z17 = trVar.w;
        boolean z18 = trVar.v;
        int i14 = trVar.O;
        int i15 = d1Var.f;
        View view = d1Var.a;
        int i16 = 0;
        r13 = false;
        boolean z19 = false;
        r13 = false;
        r13 = false;
        boolean z20 = false;
        r13 = false;
        r13 = false;
        boolean z21 = false;
        r14 = true;
        r14 = true;
        boolean z22 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < trVar.E0 || i10 >= (i11 = trVar.F0)) {
                    if (i10 >= trVar.U0 && i10 < (i11 = trVar.V0)) {
                        if (ChatObject.isChannel(trVar.r)) {
                            break;
                        }
                    } else {
                        i11 = trVar.Y0;
                    }
                    objArr = false;
                } else {
                    if (ChatObject.isChannel(trVar.r)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z11 = false;
                    z10 = false;
                    z12 = false;
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
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z10 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i16 = i17;
                    j11 = j13;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j12 = j14;
                } else {
                    charSequence = "";
                    j3 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j10 = chatParticipant.user_id;
                        int i18 = chatParticipant.date;
                        boolean z23 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z10 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z11 = z23;
                        j11 = 0;
                        j12 = 0;
                        tL_chatBannedRights = null;
                        z12 = false;
                    }
                }
                if (j10 > j3) {
                    z13 = z11;
                    z14 = z10;
                    chat = trVar.getMessagesController().getUser(Long.valueOf(j10));
                    i12 = i11;
                } else {
                    z13 = z11;
                    z14 = z10;
                    i12 = i11;
                    chat = trVar.getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (chat != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    b5Var.b(chat, null, (!objArr == true || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z13) {
                                    if (!z14 || (user = trVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                        z15 = false;
                                        charSequence2 = null;
                                    } else if (user.id == j10) {
                                        charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        z15 = false;
                                        charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                    }
                                    b5Var.b(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                                    break;
                                } else {
                                    charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                }
                                z15 = false;
                                b5Var.b(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                            }
                        } else {
                            if (!z12 || (user2 = trVar.getMessagesController().getUser(Long.valueOf(j11))) == null) {
                                z16 = true;
                                charSequence3 = null;
                            } else {
                                z16 = true;
                                charSequence3 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                            }
                            b5Var.b(chat, null, charSequence3, i10 != i12 + (-1) ? z16 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z24 = tL_chatBannedRights.view_messages;
                            if (z24 && trVar.E.view_messages != z24) {
                                sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                            }
                            if (tL_chatBannedRights.send_messages && trVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                            }
                            boolean z25 = tL_chatBannedRights.send_media;
                            if (!z25 || trVar.E.send_media == z25) {
                                boolean z26 = tL_chatBannedRights.send_photos;
                                if (z26 && trVar.E.send_photos != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                }
                                boolean z27 = tL_chatBannedRights.send_videos;
                                if (z27 && trVar.E.send_videos != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                }
                                boolean z28 = tL_chatBannedRights.send_audios;
                                if (z28 && trVar.E.send_audios != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                }
                                boolean z29 = tL_chatBannedRights.send_docs;
                                if (z29 && trVar.E.send_docs != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                }
                                boolean z30 = tL_chatBannedRights.send_voices;
                                if (z30 && trVar.E.send_voices != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                }
                                boolean z31 = tL_chatBannedRights.send_roundvideos;
                                if (z31 && trVar.E.send_roundvideos != z31) {
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
                            boolean z32 = tL_chatBannedRights.send_stickers;
                            if (z32 && trVar.E.send_stickers != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                            }
                            boolean z33 = tL_chatBannedRights.send_polls;
                            if (z33 && trVar.E.send_polls != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                            }
                            boolean z34 = tL_chatBannedRights.embed_links;
                            if (z34 && !tL_chatBannedRights.send_plain && trVar.E.embed_links != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                            }
                            boolean z35 = tL_chatBannedRights.invite_users;
                            if (z35 && trVar.E.invite_users != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                            }
                            boolean z36 = tL_chatBannedRights.pin_messages;
                            if (z36 && trVar.E.pin_messages != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                            }
                            boolean z37 = tL_chatBannedRights.edit_rank;
                            if (z37 && trVar.E.edit_rank != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                            }
                            boolean z38 = tL_chatBannedRights.send_reactions;
                            if (z38 && trVar.E.send_reactions != z38) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                            }
                            boolean z39 = tL_chatBannedRights.change_info;
                            if (z39 && trVar.E.change_info != z39) {
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
                break;
            case 1:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 != trVar.y0) {
                    if (i10 != trVar.b1) {
                        if (i10 != trVar.P0) {
                            if (i10 != trVar.o0) {
                                if (i10 != trVar.r0) {
                                    if (i10 != trVar.K0) {
                                        if (i10 != trVar.M0) {
                                            if (i10 != trVar.u0) {
                                                if (i10 != trVar.R0) {
                                                    if (i10 == trVar.j1) {
                                                        e9Var.setText(LocaleController.getString(trVar.v1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!trVar.r1) {
                                                    e9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    e9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                e9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            e9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        e9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    e9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, ei.l.H0(trVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((trVar.A1 * (trVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * trVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                e9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = tr.m0(trVar.p1);
                            if (trVar.s != null && m0 != 0) {
                                e9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                e9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z18 || trVar.e1 != 0) {
                                    e9Var.setText("");
                                    break;
                                } else {
                                    e9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (trVar.z0 == -1) {
                            e9Var.setText("");
                            break;
                        } else if (!z18) {
                            e9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            e9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z18) {
                        if (!z17) {
                            e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    e9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.i6.m6, org.telegram.ui.ActionBar.i6.G6);
                if (i10 != trVar.z0) {
                    if (i10 != trVar.v0) {
                        if (i10 != trVar.A0) {
                            if (i10 == trVar.t0) {
                                y4Var.a(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                            if ((!trVar.Q || trVar.R) && trVar.Z0 == -1 && !arrayList.isEmpty()) {
                                z21 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z21);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, trVar.x0 > trVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                                if (trVar.A0 != -1 || ((!trVar.Q || trVar.R) && trVar.Z0 == -1 && !arrayList.isEmpty())) {
                                    z20 = true;
                                }
                                if (!z18) {
                                    y4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                } else {
                                    y4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                }
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !trVar.Q || trVar.R);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, trVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != trVar.D0) {
                    if (i10 != trVar.S) {
                        if (i10 != trVar.N0) {
                            if (i10 != trVar.s0) {
                                if (i10 == trVar.p0) {
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
                        m4Var.setText(LocaleController.getString(z17 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = trVar.s;
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
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = trVar.s;
                caVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                v8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = v8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.i6.r7;
                int i20 = org.telegram.ui.ActionBar.i6.V6;
                int i21 = org.telegram.ui.ActionBar.i6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z40 = v8Var.getTag() != null && ((Integer) v8Var.getTag()).intValue() == i10;
                v8Var.setTag(Integer.valueOf(i10));
                if (i10 == trVar.g0) {
                    v8Var.d(LocaleController.getString(z17 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (trVar.E.change_info || ChatObject.isPublic(trVar.r)) ? false : true, trVar.l0 != -1, z40);
                } else if (i10 == trVar.m0) {
                    v8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !trVar.E.manage_linked_peers, false, z40);
                } else if (i10 == trVar.h0) {
                    v8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !trVar.E.invite_users, true, z40);
                } else if (i10 == trVar.i0) {
                    v8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (trVar.E.pin_messages || ChatObject.isPublic(trVar.r)) ? false : true, true, z40);
                } else if (i10 == trVar.j0) {
                    v8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !trVar.E.edit_rank, true, z40);
                } else if (i10 == trVar.T) {
                    v8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !trVar.E.send_plain, true, z40);
                } else if (i10 == trVar.Q0) {
                    v8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), trVar.r1, false, z40);
                    v8Var.getCheckBox().setDrawIconType(0);
                    v8Var.getCheckBox().d(org.telegram.ui.ActionBar.i6.M6, org.telegram.ui.ActionBar.i6.N6, i21, i21);
                } else if (i10 == trVar.U) {
                    int n02 = tr.n0(trVar.E);
                    v8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z40);
                    Locale locale = Locale.US;
                    v8Var.a(new i9.s(this, v8Var, false, 23), a1.g.n(n02, "/10"), !trVar.l1);
                } else if (i10 == trVar.e0) {
                    v8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !trVar.E.send_stickers, true, z40);
                } else if (i10 == trVar.f0) {
                    v8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !trVar.E.embed_links, true, z40);
                } else if (i10 == trVar.d0) {
                    v8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !trVar.E.send_polls, true, false);
                } else if (i10 == trVar.l0) {
                    v8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !trVar.E.manage_topics, false, z40);
                }
                if (i10 == trVar.i0 || i10 == trVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) trVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, trVar.N)) {
                        v8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(trVar.r)) {
                    v8Var.setIcon(0);
                    break;
                } else if ((i10 == trVar.h0 && !ChatObject.canUserDoAdminAction(trVar.r, 3)) || ((i10 == trVar.i0 && !ChatObject.canUserDoAdminAction(trVar.r, 0)) || ((i10 == trVar.g0 && !ChatObject.canUserDoAdminAction(trVar.r, 1)) || ((i10 == trVar.l0 && !ChatObject.canManageTopics(trVar.r)) || (ChatObject.isPublic(trVar.r) && (i10 == trVar.i0 || i10 == trVar.g0)))))) {
                    v8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    v8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (i10 != trVar.Z0) {
                    if (i10 != trVar.W0) {
                        if (i10 != trVar.T0) {
                            if (i10 == trVar.g1) {
                                v3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(trVar.r) && !trVar.r.megagroup) {
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
                } else if (ChatObject.isChannel(trVar.r) && !trVar.r.megagroup) {
                    v3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    v3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.j10 j10Var = (org.telegram.ui.Components.j10) view;
                if (i14 != 0) {
                    j10Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = trVar.s;
                    j10Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i10 != trVar.x0) {
                    if (i10 != trVar.J0) {
                        if (i10 == trVar.L0) {
                            r8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = trVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z22 = false;
                            }
                            r8Var.j(string2, z22, false);
                            break;
                        }
                    } else {
                        r8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(trVar.r, 2) && ((chatFull = trVar.s) == null || chatFull.participants_hidden || trVar.l0() >= trVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = trVar.s;
                        r8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    r8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(trVar.r, 13) && ((chatFull2 = trVar.s) == null || chatFull2.antispam || trVar.l0() >= trVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = trVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z19 = true;
                    }
                    r8Var.l(R.drawable.msg_policy, string4, z19);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                boolean z41 = a2Var.getTag() != null && ((Integer) a2Var.getTag()).intValue() == i10;
                a2Var.setTag(Integer.valueOf(i10));
                if (i10 != trVar.V) {
                    if (i10 != trVar.W) {
                        if (i10 != trVar.X) {
                            if (i10 != trVar.Y) {
                                if (i10 != trVar.Z) {
                                    if (i10 != trVar.a0) {
                                        if (i10 != trVar.b0) {
                                            if (i10 != trVar.c0) {
                                                if (i10 != trVar.k0) {
                                                    if (i10 != trVar.d0) {
                                                        a2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        a2Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !trVar.E.send_polls, true, z41);
                                                        break;
                                                    }
                                                } else {
                                                    a2Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !trVar.E.send_reactions, false, z41);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = trVar.E;
                                                a2Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z41);
                                                break;
                                            }
                                        } else {
                                            a2Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !trVar.E.send_roundvideos, true, z41);
                                            break;
                                        }
                                    } else {
                                        a2Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !trVar.E.send_voices, true, z41);
                                        break;
                                    }
                                } else {
                                    a2Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !trVar.E.send_docs, true, z41);
                                    break;
                                }
                            } else {
                                a2Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !trVar.E.send_audios, true, z41);
                                break;
                            }
                        } else {
                            a2Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !trVar.E.send_stickers, true, z41);
                            break;
                        }
                    } else {
                        a2Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !trVar.E.send_videos, true, z41);
                        break;
                    }
                } else {
                    a2Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !trVar.E.send_photos, true, z41);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (i10 != trVar.h1) {
                    if (i10 != trVar.i1) {
                        if (i10 == trVar.n0) {
                            w8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), trVar.y1, false);
                            break;
                        }
                    } else {
                        w8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), trVar.w1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z42 = trVar.v1;
                    w8Var.f(string6, z42, z42);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                if (i10 == trVar.q0) {
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) trVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(trVar.A1, trVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    nr nrVar = new nr(0);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = nrVar;
                    z7Var.d(clamp, y7Var, new t3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        View view;
        View view2;
        Context context = this.c;
        tr trVar = this.d;
        switch (i10) {
            case 0:
                int i11 = trVar.O;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, trVar.e1 == 0);
                b5Var.setDelegate(new or(this, 0));
                view2 = b5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (!trVar.v) {
                    if (!trVar.w) {
                        e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = e9Var;
                        break;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = e9Var;
                        break;
                    }
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                view2 = m4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) trVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, e6Var);
                v3Var.setBackground(null);
                view = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ww0 ww0Var = new org.telegram.ui.Components.ww0(context, null);
                ww0Var.b(trVar.p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ww0Var.setCallback(new or(this, 1));
                view = ww0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(6);
                j10Var.w = false;
                j10Var.setUseHeaderOffset(false);
                j10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                j10Var.setLayoutParams(q0Var);
                view = j10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.c, trVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                view = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.c, trVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.g7, org.telegram.ui.ActionBar.i6.k7);
                a2Var.setEnabled(true);
                view = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.ww0 ww0Var2 = new org.telegram.ui.Components.ww0(context, null);
                Drawable[] drawableArr = {trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = trVar.s1;
                ww0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                ww0Var2.setCallback(new or(this, 2));
                view2 = ww0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.w8(context, trVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.z7(context, trVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.am0(view);
    }
}
