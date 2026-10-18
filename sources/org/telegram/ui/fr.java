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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fr extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ jr d;

    public fr(jr jrVar, Context context) {
        this.d = jrVar;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.L0) goto L42;
     */
    @Override // org.telegram.ui.Components.hm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 != 16) {
            jr jrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(jrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.a5) b1Var.a).getCurrentObject();
                if (jrVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = b1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == jrVar.x0) {
                            return ChatObject.canUserDoAdminAction(jrVar.r, 13);
                        }
                        if (b10 == jrVar.J0) {
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
        int i11 = jrVar.E0;
        if (i10 >= i11 && i10 < jrVar.F0) {
            return (TLObject) jrVar.F.get(i10 - i11);
        }
        int i12 = jrVar.U0;
        if (i10 >= i12 && i10 < jrVar.V0) {
            return (TLObject) jrVar.H.get(i10 - i12);
        }
        int i13 = jrVar.X0;
        if (i10 < i13 || i10 >= jrVar.Y0) {
            return null;
        }
        return (TLObject) jrVar.G.get(i10 - i13);
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        jr jrVar = this.d;
        if (i10 == jrVar.z0 || i10 == jrVar.A0 || i10 == jrVar.v0 || i10 == jrVar.t0) {
            return 2;
        }
        if ((i10 >= jrVar.E0 && i10 < jrVar.F0) || ((i10 >= jrVar.X0 && i10 < jrVar.Y0) || (i10 >= jrVar.U0 && i10 < jrVar.V0))) {
            return 0;
        }
        if (i10 == jrVar.C0 || i10 == jrVar.G0 || i10 == jrVar.H0) {
            return 3;
        }
        if (i10 == jrVar.D0 || i10 == jrVar.S || i10 == jrVar.N0 || i10 == jrVar.s0 || i10 == jrVar.p0) {
            return 5;
        }
        if (i10 == jrVar.b1 || i10 == jrVar.P0 || i10 == jrVar.R0 || i10 == jrVar.u0 || i10 == jrVar.y0 || i10 == jrVar.K0 || i10 == jrVar.M0 || i10 == jrVar.j1 || i10 == jrVar.o0 || i10 == jrVar.r0) {
            return 1;
        }
        if (i10 == jrVar.c1) {
            return 4;
        }
        if (i10 == jrVar.B0) {
            return 6;
        }
        if (i10 == jrVar.g0 || i10 == jrVar.h0 || i10 == jrVar.m0 || i10 == jrVar.i0 || i10 == jrVar.j0 || i10 == jrVar.T || i10 == jrVar.e0 || i10 == jrVar.f0 || i10 == jrVar.l0 || i10 == jrVar.Q0) {
            return 7;
        }
        if (i10 == jrVar.Z0 || i10 == jrVar.T0 || i10 == jrVar.W0 || i10 == jrVar.g1) {
            return 8;
        }
        if (i10 == jrVar.O0) {
            return 9;
        }
        if (i10 == jrVar.a1) {
            return 10;
        }
        if (i10 == jrVar.f1) {
            return 11;
        }
        if (i10 == jrVar.x0 || i10 == jrVar.J0 || i10 == jrVar.L0) {
            return 12;
        }
        if (jrVar.p0(i10)) {
            return 13;
        }
        if (i10 == jrVar.U) {
            return 14;
        }
        if (i10 == jrVar.S0) {
            return 15;
        }
        if (i10 == jrVar.h1 || i10 == jrVar.i1 || i10 == jrVar.n0) {
            return 16;
        }
        return i10 == jrVar.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e6, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e8, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x07fe, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0b35  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        Object[] objArr;
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
        jr jrVar = this.d;
        ArrayList arrayList = jrVar.F;
        boolean z17 = jrVar.w;
        boolean z18 = jrVar.v;
        int i14 = jrVar.O;
        int i15 = b1Var.f;
        View view = b1Var.a;
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
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                a5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < jrVar.E0 || i10 >= (i11 = jrVar.F0)) {
                    if (i10 >= jrVar.U0 && i10 < (i11 = jrVar.V0)) {
                        if (ChatObject.isChannel(jrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = jrVar.Y0;
                    }
                    objArr = false;
                } else {
                    if (ChatObject.isChannel(jrVar.r)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z11 = false;
                    z10 = false;
                    z12 = false;
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
                } else {
                    charSequence = "";
                    j10 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j11 = chatParticipant.user_id;
                        int i18 = chatParticipant.date;
                        boolean z23 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z10 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z11 = z23;
                        j12 = 0;
                        j13 = 0;
                        tL_chatBannedRights = null;
                        z12 = false;
                    }
                }
                if (j11 > j10) {
                    z13 = z11;
                    z14 = z10;
                    chat = jrVar.getMessagesController().getUser(Long.valueOf(j11));
                    i12 = i11;
                } else {
                    z13 = z11;
                    z14 = z10;
                    i12 = i11;
                    chat = jrVar.getMessagesController().getChat(Long.valueOf(-j11));
                }
                if (chat != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    a5Var.b(chat, null, (!objArr == true || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z13) {
                                    if (!z14 || (user = jrVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                        z15 = false;
                                        charSequence2 = null;
                                    } else if (user.id == j11) {
                                        charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        z15 = false;
                                        charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                    }
                                    a5Var.b(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                                    break;
                                } else {
                                    charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                }
                                z15 = false;
                                a5Var.b(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                            }
                        } else {
                            if (!z12 || (user2 = jrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                z16 = true;
                                charSequence3 = null;
                            } else {
                                z16 = true;
                                charSequence3 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                            }
                            a5Var.b(chat, null, charSequence3, i10 != i12 + (-1) ? z16 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z24 = tL_chatBannedRights.view_messages;
                            if (z24 && jrVar.E.view_messages != z24) {
                                sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                            }
                            if (tL_chatBannedRights.send_messages && jrVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                            }
                            boolean z25 = tL_chatBannedRights.send_media;
                            if (!z25 || jrVar.E.send_media == z25) {
                                boolean z26 = tL_chatBannedRights.send_photos;
                                if (z26 && jrVar.E.send_photos != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                }
                                boolean z27 = tL_chatBannedRights.send_videos;
                                if (z27 && jrVar.E.send_videos != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                }
                                boolean z28 = tL_chatBannedRights.send_audios;
                                if (z28 && jrVar.E.send_audios != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                }
                                boolean z29 = tL_chatBannedRights.send_docs;
                                if (z29 && jrVar.E.send_docs != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                }
                                boolean z30 = tL_chatBannedRights.send_voices;
                                if (z30 && jrVar.E.send_voices != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                }
                                boolean z31 = tL_chatBannedRights.send_roundvideos;
                                if (z31 && jrVar.E.send_roundvideos != z31) {
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
                            if (z32 && jrVar.E.send_stickers != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                            }
                            boolean z33 = tL_chatBannedRights.send_polls;
                            if (z33 && jrVar.E.send_polls != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                            }
                            boolean z34 = tL_chatBannedRights.embed_links;
                            if (z34 && !tL_chatBannedRights.send_plain && jrVar.E.embed_links != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                            }
                            boolean z35 = tL_chatBannedRights.invite_users;
                            if (z35 && jrVar.E.invite_users != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                            }
                            boolean z36 = tL_chatBannedRights.pin_messages;
                            if (z36 && jrVar.E.pin_messages != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                            }
                            boolean z37 = tL_chatBannedRights.edit_rank;
                            if (z37 && jrVar.E.edit_rank != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                            }
                            boolean z38 = tL_chatBannedRights.send_reactions;
                            if (z38 && jrVar.E.send_reactions != z38) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                            }
                            boolean z39 = tL_chatBannedRights.change_info;
                            if (z39 && jrVar.E.change_info != z39) {
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
                        a5Var.b(chat, null, sb2, i10 != i12 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (i10 != jrVar.y0) {
                    if (i10 != jrVar.b1) {
                        if (i10 != jrVar.P0) {
                            if (i10 != jrVar.o0) {
                                if (i10 != jrVar.r0) {
                                    if (i10 != jrVar.K0) {
                                        if (i10 != jrVar.M0) {
                                            if (i10 != jrVar.u0) {
                                                if (i10 != jrVar.R0) {
                                                    if (i10 == jrVar.j1) {
                                                        d9Var.setText(LocaleController.getString(jrVar.v1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!jrVar.r1) {
                                                    d9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    d9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                d9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            d9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        d9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    d9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, gi.l.H0(jrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((jrVar.A1 * (jrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * jrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                d9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = jr.m0(jrVar.p1);
                            if (jrVar.s != null && m0 != 0) {
                                d9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                d9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z18 || jrVar.e1 != 0) {
                                    d9Var.setText("");
                                    break;
                                } else {
                                    d9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (jrVar.z0 == -1) {
                            d9Var.setText("");
                            break;
                        } else if (!z18) {
                            d9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            d9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z18) {
                        if (!z17) {
                            d9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            d9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        d9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    d9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                if (i10 != jrVar.z0) {
                    if (i10 != jrVar.v0) {
                        if (i10 != jrVar.A0) {
                            if (i10 == jrVar.t0) {
                                x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                                x4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                            if ((!jrVar.Q || jrVar.R) && jrVar.Z0 == -1 && !arrayList.isEmpty()) {
                                z21 = true;
                            }
                            x4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z21);
                            break;
                        }
                    } else {
                        x4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, jrVar.x0 > jrVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                                if (jrVar.A0 != -1 || ((!jrVar.Q || jrVar.R) && jrVar.Z0 == -1 && !arrayList.isEmpty())) {
                                    z20 = true;
                                }
                                if (!z18) {
                                    x4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                } else {
                                    x4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                }
                            }
                        } else {
                            x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                            x4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !jrVar.Q || jrVar.R);
                            break;
                        }
                    } else {
                        x4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    x4Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                    x4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, jrVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != jrVar.D0) {
                    if (i10 != jrVar.S) {
                        if (i10 != jrVar.N0) {
                            if (i10 != jrVar.s0) {
                                if (i10 == jrVar.p0) {
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
                        l4Var.setText(LocaleController.getString(z17 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = jrVar.s;
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
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = jrVar.s;
                baVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                u8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = u8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.h6.r7;
                int i20 = org.telegram.ui.ActionBar.h6.V6;
                int i21 = org.telegram.ui.ActionBar.h6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z40 = u8Var.getTag() != null && ((Integer) u8Var.getTag()).intValue() == i10;
                u8Var.setTag(Integer.valueOf(i10));
                if (i10 == jrVar.g0) {
                    u8Var.d(LocaleController.getString(z17 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (jrVar.E.change_info || ChatObject.isPublic(jrVar.r)) ? false : true, jrVar.l0 != -1, z40);
                } else if (i10 == jrVar.m0) {
                    u8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !jrVar.E.manage_linked_peers, false, z40);
                } else if (i10 == jrVar.h0) {
                    u8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !jrVar.E.invite_users, true, z40);
                } else if (i10 == jrVar.i0) {
                    u8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (jrVar.E.pin_messages || ChatObject.isPublic(jrVar.r)) ? false : true, true, z40);
                } else if (i10 == jrVar.j0) {
                    u8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !jrVar.E.edit_rank, true, z40);
                } else if (i10 == jrVar.T) {
                    u8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !jrVar.E.send_plain, true, z40);
                } else if (i10 == jrVar.Q0) {
                    u8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), jrVar.r1, false, z40);
                    u8Var.getCheckBox().setDrawIconType(0);
                    u8Var.getCheckBox().d(org.telegram.ui.ActionBar.h6.M6, org.telegram.ui.ActionBar.h6.N6, i21, i21);
                } else if (i10 == jrVar.U) {
                    int n02 = jr.n0(jrVar.E);
                    u8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z40);
                    Locale locale = Locale.US;
                    u8Var.a(new j9.u(this, u8Var, false, 23), a1.g.m(n02, "/10"), !jrVar.l1);
                } else if (i10 == jrVar.e0) {
                    u8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !jrVar.E.send_stickers, true, z40);
                } else if (i10 == jrVar.f0) {
                    u8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !jrVar.E.embed_links, true, z40);
                } else if (i10 == jrVar.d0) {
                    u8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !jrVar.E.send_polls, true, false);
                } else if (i10 == jrVar.l0) {
                    u8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !jrVar.E.manage_topics, false, z40);
                }
                if (i10 == jrVar.i0 || i10 == jrVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) jrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, jrVar.N)) {
                        u8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(jrVar.r)) {
                    u8Var.setIcon(0);
                    break;
                } else if ((i10 == jrVar.h0 && !ChatObject.canUserDoAdminAction(jrVar.r, 3)) || ((i10 == jrVar.i0 && !ChatObject.canUserDoAdminAction(jrVar.r, 0)) || ((i10 == jrVar.g0 && !ChatObject.canUserDoAdminAction(jrVar.r, 1)) || ((i10 == jrVar.l0 && !ChatObject.canManageTopics(jrVar.r)) || (ChatObject.isPublic(jrVar.r) && (i10 == jrVar.i0 || i10 == jrVar.g0)))))) {
                    u8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    u8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                if (i10 != jrVar.Z0) {
                    if (i10 != jrVar.W0) {
                        if (i10 != jrVar.T0) {
                            if (i10 == jrVar.g1) {
                                u3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
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
                } else if (ChatObject.isChannel(jrVar.r) && !jrVar.r.megagroup) {
                    u3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    u3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.b10 b10Var = (org.telegram.ui.Components.b10) view;
                if (i14 != 0) {
                    b10Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = jrVar.s;
                    b10Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i10 != jrVar.x0) {
                    if (i10 != jrVar.J0) {
                        if (i10 == jrVar.L0) {
                            q8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = jrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z22 = false;
                            }
                            q8Var.j(string2, z22, false);
                            break;
                        }
                    } else {
                        q8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 2) && ((chatFull = jrVar.s) == null || chatFull.participants_hidden || jrVar.l0() >= jrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = jrVar.s;
                        q8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    q8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(jrVar.r, 13) && ((chatFull2 = jrVar.s) == null || chatFull2.antispam || jrVar.l0() >= jrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = jrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z19 = true;
                    }
                    q8Var.l(R.drawable.msg_policy, string4, z19);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                boolean z41 = a2Var.getTag() != null && ((Integer) a2Var.getTag()).intValue() == i10;
                a2Var.setTag(Integer.valueOf(i10));
                if (i10 != jrVar.V) {
                    if (i10 != jrVar.W) {
                        if (i10 != jrVar.X) {
                            if (i10 != jrVar.Y) {
                                if (i10 != jrVar.Z) {
                                    if (i10 != jrVar.a0) {
                                        if (i10 != jrVar.b0) {
                                            if (i10 != jrVar.c0) {
                                                if (i10 != jrVar.k0) {
                                                    if (i10 != jrVar.d0) {
                                                        a2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        a2Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !jrVar.E.send_polls, true, z41);
                                                        break;
                                                    }
                                                } else {
                                                    a2Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !jrVar.E.send_reactions, false, z41);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = jrVar.E;
                                                a2Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z41);
                                                break;
                                            }
                                        } else {
                                            a2Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !jrVar.E.send_roundvideos, true, z41);
                                            break;
                                        }
                                    } else {
                                        a2Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !jrVar.E.send_voices, true, z41);
                                        break;
                                    }
                                } else {
                                    a2Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !jrVar.E.send_docs, true, z41);
                                    break;
                                }
                            } else {
                                a2Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !jrVar.E.send_audios, true, z41);
                                break;
                            }
                        } else {
                            a2Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !jrVar.E.send_stickers, true, z41);
                            break;
                        }
                    } else {
                        a2Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !jrVar.E.send_videos, true, z41);
                        break;
                    }
                } else {
                    a2Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !jrVar.E.send_photos, true, z41);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (i10 != jrVar.h1) {
                    if (i10 != jrVar.i1) {
                        if (i10 == jrVar.n0) {
                            v8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), jrVar.y1, false);
                            break;
                        }
                    } else {
                        v8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), jrVar.w1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z42 = jrVar.v1;
                    v8Var.f(string6, z42, z42);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                if (i10 == jrVar.q0) {
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) jrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(jrVar.A1, jrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    m4.v0 v0Var = new m4.v0(25);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.c = a2;
                    x7Var.d = 20;
                    x7Var.e = v0Var;
                    y7Var.d(clamp, x7Var, new v3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        View view;
        View view2;
        Context context = this.c;
        jr jrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = jrVar.O;
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, jrVar.e1 == 0);
                a5Var.setDelegate(new er(this, 0));
                view2 = a5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
                if (!jrVar.v) {
                    if (!jrVar.w) {
                        d9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = d9Var;
                        break;
                    } else {
                        d9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = d9Var;
                        break;
                    }
                } else {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = d9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                view2 = l4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.ba(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.u8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) jrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, d6Var);
                u3Var.setBackground(null);
                view = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.nw0 nw0Var = new org.telegram.ui.Components.nw0(context, null);
                nw0Var.b(jrVar.p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                nw0Var.setCallback(new er(this, 1));
                view = nw0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(6);
                b10Var.w = false;
                b10Var.setUseHeaderOffset(false);
                b10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(30.0f);
                b10Var.setLayoutParams(o0Var);
                view = b10Var;
                break;
            case 12:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(23, this.c, jrVar.getResourceProvider(), false, true);
                q8Var.v = 50;
                view = q8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.c, jrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                a2Var.setEnabled(true);
                view = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.nw0 nw0Var2 = new org.telegram.ui.Components.nw0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = jrVar.s1;
                nw0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                nw0Var2.setCallback(new er(this, 2));
                view2 = nw0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.v8(context, jrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.y7(context, jrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
