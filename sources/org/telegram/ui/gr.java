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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gr extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ kr d;

    public gr(kr krVar, Context context) {
        this.d = krVar;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.K0) goto L42;
     */
    @Override // org.telegram.ui.Components.lm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 != 16) {
            kr krVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(krVar.n);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.f5) e1Var.a).getCurrentObject();
                if (krVar.N != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = e1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == krVar.w0) {
                            return ChatObject.canUserDoAdminAction(krVar.n, 13);
                        }
                        if (b10 == krVar.I0) {
                            return ChatObject.canUserDoAdminAction(krVar.n, 2);
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
        kr krVar = this.d;
        int i11 = krVar.D0;
        if (i10 >= i11 && i10 < krVar.E0) {
            return (TLObject) krVar.E.get(i10 - i11);
        }
        int i12 = krVar.T0;
        if (i10 >= i12 && i10 < krVar.U0) {
            return (TLObject) krVar.G.get(i10 - i12);
        }
        int i13 = krVar.W0;
        if (i10 < i13 || i10 >= krVar.X0) {
            return null;
        }
        return (TLObject) krVar.F.get(i10 - i13);
    }

    @Override // s4.h0
    public final int h() {
        return this.d.c1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        kr krVar = this.d;
        if (i10 == krVar.y0 || i10 == krVar.z0 || i10 == krVar.u0 || i10 == krVar.s0) {
            return 2;
        }
        if ((i10 >= krVar.D0 && i10 < krVar.E0) || ((i10 >= krVar.W0 && i10 < krVar.X0) || (i10 >= krVar.T0 && i10 < krVar.U0))) {
            return 0;
        }
        if (i10 == krVar.B0 || i10 == krVar.F0 || i10 == krVar.G0) {
            return 3;
        }
        if (i10 == krVar.C0 || i10 == krVar.R || i10 == krVar.M0 || i10 == krVar.r0 || i10 == krVar.o0) {
            return 5;
        }
        if (i10 == krVar.a1 || i10 == krVar.O0 || i10 == krVar.Q0 || i10 == krVar.t0 || i10 == krVar.x0 || i10 == krVar.J0 || i10 == krVar.L0 || i10 == krVar.i1 || i10 == krVar.n0 || i10 == krVar.q0) {
            return 1;
        }
        if (i10 == krVar.b1) {
            return 4;
        }
        if (i10 == krVar.A0) {
            return 6;
        }
        if (i10 == krVar.f0 || i10 == krVar.g0 || i10 == krVar.l0 || i10 == krVar.h0 || i10 == krVar.i0 || i10 == krVar.S || i10 == krVar.d0 || i10 == krVar.e0 || i10 == krVar.k0 || i10 == krVar.P0) {
            return 7;
        }
        if (i10 == krVar.Y0 || i10 == krVar.S0 || i10 == krVar.V0 || i10 == krVar.f1) {
            return 8;
        }
        if (i10 == krVar.N0) {
            return 9;
        }
        if (i10 == krVar.Z0) {
            return 10;
        }
        if (i10 == krVar.e1) {
            return 11;
        }
        if (i10 == krVar.w0 || i10 == krVar.I0 || i10 == krVar.K0) {
            return 12;
        }
        if (krVar.q0(i10)) {
            return 13;
        }
        if (i10 == krVar.T) {
            return 14;
        }
        if (i10 == krVar.R0) {
            return 15;
        }
        if (i10 == krVar.g1 || i10 == krVar.h1 || i10 == krVar.m0) {
            return 16;
        }
        return i10 == krVar.p0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e4, code lost:
    
        if (r3.n.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e6, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x07fc, code lost:
    
        if (r3.n.megagroup == false) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0b33  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
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
        kr krVar = this.d;
        ArrayList arrayList = krVar.E;
        boolean z17 = krVar.v;
        boolean z18 = krVar.s;
        int i14 = krVar.N;
        int i15 = e1Var.f;
        View view = e1Var.a;
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
                org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
                f5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < krVar.D0 || i10 >= (i11 = krVar.E0)) {
                    if (i10 >= krVar.T0 && i10 < (i11 = krVar.U0)) {
                        if (ChatObject.isChannel(krVar.n)) {
                            break;
                        }
                    } else {
                        i11 = krVar.X0;
                    }
                    objArr = false;
                } else {
                    if (ChatObject.isChannel(krVar.n)) {
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
                    chat = krVar.getMessagesController().getUser(Long.valueOf(j11));
                    i12 = i11;
                } else {
                    z13 = z11;
                    z14 = z10;
                    i12 = i11;
                    chat = krVar.getMessagesController().getChat(Long.valueOf(-j11));
                }
                if (chat != null) {
                    if (i14 != 3) {
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    f5Var.c(chat, null, (!objArr == true || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                    break;
                                }
                            } else {
                                if (!z13) {
                                    if (!z14 || (user = krVar.getMessagesController().getUser(Long.valueOf(j13))) == null) {
                                        z15 = false;
                                        charSequence2 = null;
                                    } else if (user.id == j11) {
                                        charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        z15 = false;
                                        charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                    }
                                    f5Var.c(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                                    break;
                                } else {
                                    charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                }
                                z15 = false;
                                f5Var.c(chat, null, charSequence2, i10 == i12 + (-1) ? true : z15);
                            }
                        } else {
                            if (!z12 || (user2 = krVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                z16 = true;
                                charSequence3 = null;
                            } else {
                                z16 = true;
                                charSequence3 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                            }
                            f5Var.c(chat, null, charSequence3, i10 != i12 + (-1) ? z16 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights == null) {
                            sb2 = charSequence;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z24 = tL_chatBannedRights.view_messages;
                            if (z24 && krVar.y.view_messages != z24) {
                                sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                            }
                            if (tL_chatBannedRights.send_messages && krVar.y.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                            }
                            boolean z25 = tL_chatBannedRights.send_media;
                            if (!z25 || krVar.y.send_media == z25) {
                                boolean z26 = tL_chatBannedRights.send_photos;
                                if (z26 && krVar.y.send_photos != z26) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                }
                                boolean z27 = tL_chatBannedRights.send_videos;
                                if (z27 && krVar.y.send_videos != z27) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                }
                                boolean z28 = tL_chatBannedRights.send_audios;
                                if (z28 && krVar.y.send_audios != z28) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                }
                                boolean z29 = tL_chatBannedRights.send_docs;
                                if (z29 && krVar.y.send_docs != z29) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                }
                                boolean z30 = tL_chatBannedRights.send_voices;
                                if (z30 && krVar.y.send_voices != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                }
                                boolean z31 = tL_chatBannedRights.send_roundvideos;
                                if (z31 && krVar.y.send_roundvideos != z31) {
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
                            if (z32 && krVar.y.send_stickers != z32) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                            }
                            boolean z33 = tL_chatBannedRights.send_polls;
                            if (z33 && krVar.y.send_polls != z33) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                            }
                            boolean z34 = tL_chatBannedRights.embed_links;
                            if (z34 && !tL_chatBannedRights.send_plain && krVar.y.embed_links != z34) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                            }
                            boolean z35 = tL_chatBannedRights.invite_users;
                            if (z35 && krVar.y.invite_users != z35) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                            }
                            boolean z36 = tL_chatBannedRights.pin_messages;
                            if (z36 && krVar.y.pin_messages != z36) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                            }
                            boolean z37 = tL_chatBannedRights.edit_rank;
                            if (z37 && krVar.y.edit_rank != z37) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                            }
                            boolean z38 = tL_chatBannedRights.send_reactions;
                            if (z38 && krVar.y.send_reactions != z38) {
                                if (sb3.length() != 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                            }
                            boolean z39 = tL_chatBannedRights.change_info;
                            if (z39 && krVar.y.change_info != z39) {
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
                        f5Var.c(chat, null, sb2, i10 != i12 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 != krVar.x0) {
                    if (i10 != krVar.a1) {
                        if (i10 != krVar.O0) {
                            if (i10 != krVar.n0) {
                                if (i10 != krVar.q0) {
                                    if (i10 != krVar.J0) {
                                        if (i10 != krVar.L0) {
                                            if (i10 != krVar.t0) {
                                                if (i10 != krVar.Q0) {
                                                    if (i10 == krVar.i1) {
                                                        i9Var.setText(LocaleController.getString(krVar.u1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!krVar.q1) {
                                                    i9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    i9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                i9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            i9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        i9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    i9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, hi.k.F0(krVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((krVar.z1 * (krVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * krVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                i9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int n02 = kr.n0(krVar.o1);
                            if (krVar.r != null && n02 != 0) {
                                i9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, n02 < 60 ? LocaleController.formatPluralString("Seconds", n02, new Object[0]) : n02 < 3600 ? LocaleController.formatPluralString("Minutes", n02 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (n02 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                i9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z18 || krVar.d1 != 0) {
                                    i9Var.setText("");
                                    break;
                                } else {
                                    i9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (krVar.y0 == -1) {
                            i9Var.setText("");
                            break;
                        } else if (!z18) {
                            i9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            i9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z18) {
                        if (!z17) {
                            i9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            i9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        i9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    i9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                c5Var.a(org.telegram.ui.ActionBar.y6.m6, org.telegram.ui.ActionBar.y6.G6);
                if (i10 != krVar.y0) {
                    if (i10 != krVar.u0) {
                        if (i10 != krVar.z0) {
                            if (i10 == krVar.s0) {
                                c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                                c5Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                            if ((!krVar.P || krVar.Q) && krVar.Y0 == -1 && !arrayList.isEmpty()) {
                                z21 = true;
                            }
                            c5Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z21);
                            break;
                        }
                    } else {
                        c5Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, krVar.w0 > krVar.u0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                                if (krVar.z0 != -1 || ((!krVar.P || krVar.Q) && krVar.Y0 == -1 && !arrayList.isEmpty())) {
                                    z20 = true;
                                }
                                if (!z18) {
                                    c5Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                } else {
                                    c5Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z20);
                                    break;
                                }
                            }
                        } else {
                            c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                            c5Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !krVar.P || krVar.Q);
                            break;
                        }
                    } else {
                        c5Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                    c5Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, krVar.D0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 != krVar.C0) {
                    if (i10 != krVar.R) {
                        if (i10 != krVar.M0) {
                            if (i10 != krVar.r0) {
                                if (i10 == krVar.o0) {
                                    q4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                q4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        q4Var.setText(LocaleController.getString(z17 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = krVar.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        q4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        q4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = krVar.r;
                gaVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = z8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.y6.r7;
                int i20 = org.telegram.ui.ActionBar.y6.V6;
                int i21 = org.telegram.ui.ActionBar.y6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z40 = z8Var.getTag() != null && ((Integer) z8Var.getTag()).intValue() == i10;
                z8Var.setTag(Integer.valueOf(i10));
                if (i10 == krVar.f0) {
                    z8Var.d(LocaleController.getString(z17 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (krVar.y.change_info || ChatObject.isPublic(krVar.n)) ? false : true, krVar.k0 != -1, z40);
                } else if (i10 == krVar.l0) {
                    z8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !krVar.y.manage_linked_peers, false, z40);
                } else if (i10 == krVar.g0) {
                    z8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !krVar.y.invite_users, true, z40);
                } else if (i10 == krVar.h0) {
                    z8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (krVar.y.pin_messages || ChatObject.isPublic(krVar.n)) ? false : true, true, z40);
                } else if (i10 == krVar.i0) {
                    z8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !krVar.y.edit_rank, true, z40);
                } else if (i10 == krVar.S) {
                    z8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !krVar.y.send_plain, true, z40);
                } else if (i10 == krVar.P0) {
                    z8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), krVar.q1, false, z40);
                    z8Var.getCheckBox().setDrawIconType(0);
                    z8Var.getCheckBox().d(org.telegram.ui.ActionBar.y6.M6, org.telegram.ui.ActionBar.y6.N6, i21, i21);
                } else if (i10 == krVar.T) {
                    int o02 = kr.o0(krVar.y);
                    z8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), o02 > 0, true, z40);
                    Locale locale = Locale.US;
                    z8Var.a(new k9.u(this, z8Var, false, 23), a1.g.m(o02, "/10"), !krVar.k1);
                } else if (i10 == krVar.d0) {
                    z8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !krVar.y.send_stickers, true, z40);
                } else if (i10 == krVar.e0) {
                    z8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !krVar.y.embed_links, true, z40);
                } else if (i10 == krVar.c0) {
                    z8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !krVar.y.send_polls, true, false);
                } else if (i10 == krVar.k0) {
                    z8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !krVar.y.manage_topics, false, z40);
                }
                if (i10 == krVar.h0 || i10 == krVar.f0) {
                    i13 = ((org.telegram.ui.ActionBar.r2) krVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, krVar.M)) {
                        z8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(krVar.n)) {
                    z8Var.setIcon(0);
                    break;
                } else if ((i10 == krVar.g0 && !ChatObject.canUserDoAdminAction(krVar.n, 3)) || ((i10 == krVar.h0 && !ChatObject.canUserDoAdminAction(krVar.n, 0)) || ((i10 == krVar.f0 && !ChatObject.canUserDoAdminAction(krVar.n, 1)) || ((i10 == krVar.k0 && !ChatObject.canManageTopics(krVar.n)) || (ChatObject.isPublic(krVar.n) && (i10 == krVar.h0 || i10 == krVar.f0)))))) {
                    z8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    z8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                if (i10 != krVar.Y0) {
                    if (i10 != krVar.V0) {
                        if (i10 != krVar.S0) {
                            if (i10 == krVar.f1) {
                                z3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(krVar.n) && !krVar.n.megagroup) {
                            z3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            z3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        z3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(krVar.n) && !krVar.n.megagroup) {
                    z3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    z3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.c10 c10Var = (org.telegram.ui.Components.c10) view;
                if (i14 != 0) {
                    c10Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = krVar.r;
                    c10Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (i10 != krVar.w0) {
                    if (i10 != krVar.I0) {
                        if (i10 == krVar.K0) {
                            v8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = krVar.n;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z22 = false;
                            }
                            v8Var.l(string2, z22, false);
                            break;
                        }
                    } else {
                        v8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(krVar.n, 2) && ((chatFull = krVar.r) == null || chatFull.participants_hidden || krVar.m0() >= krVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = krVar.r;
                        v8Var.l(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    v8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(krVar.n, 13) && ((chatFull2 = krVar.r) == null || chatFull2.antispam || krVar.m0() >= krVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = krVar.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z19 = true;
                    }
                    v8Var.n(R.drawable.msg_policy, string4, z19);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z41 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 != krVar.U) {
                    if (i10 != krVar.V) {
                        if (i10 != krVar.W) {
                            if (i10 != krVar.X) {
                                if (i10 != krVar.Y) {
                                    if (i10 != krVar.Z) {
                                        if (i10 != krVar.a0) {
                                            if (i10 != krVar.b0) {
                                                if (i10 != krVar.j0) {
                                                    if (i10 != krVar.c0) {
                                                        y1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        y1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !krVar.y.send_polls, true, z41);
                                                        break;
                                                    }
                                                } else {
                                                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !krVar.y.send_reactions, false, z41);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = krVar.y;
                                                y1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z41);
                                                break;
                                            }
                                        } else {
                                            y1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !krVar.y.send_roundvideos, true, z41);
                                            break;
                                        }
                                    } else {
                                        y1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !krVar.y.send_voices, true, z41);
                                        break;
                                    }
                                } else {
                                    y1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !krVar.y.send_docs, true, z41);
                                    break;
                                }
                            } else {
                                y1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !krVar.y.send_audios, true, z41);
                                break;
                            }
                        } else {
                            y1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !krVar.y.send_stickers, true, z41);
                            break;
                        }
                    } else {
                        y1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !krVar.y.send_videos, true, z41);
                        break;
                    }
                } else {
                    y1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !krVar.y.send_photos, true, z41);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 != krVar.g1) {
                    if (i10 != krVar.h1) {
                        if (i10 == krVar.m0) {
                            a9Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), krVar.x1, false);
                            break;
                        }
                    } else {
                        a9Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), krVar.v1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z42 = krVar.u1;
                    a9Var.f(string6, z42, z42);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
                if (i10 == krVar.p0) {
                    int[] a2 = org.telegram.ui.Cells.c8.a((int) krVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(krVar.z1, krVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    cg cgVar = new cg(3);
                    org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
                    b8Var.c = a2;
                    b8Var.d = 20;
                    b8Var.e = cgVar;
                    c8Var.d(clamp, b8Var, new t3(this, 4));
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        View view;
        View view2;
        Context context = this.c;
        kr krVar = this.d;
        switch (i10) {
            case 0:
                int i11 = krVar.N;
                org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, krVar.d1 == 0);
                f5Var.setDelegate(new fr(this, 0));
                view2 = f5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.c5(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
                if (!krVar.s) {
                    if (!krVar.v) {
                        i9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = i9Var;
                        break;
                    } else {
                        i9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = i9Var;
                        break;
                    }
                } else {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = i9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 21, 11, false, null);
                q4Var.setHeight(43);
                view2 = q4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.ga(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) krVar).resourceProvider;
                View z3Var = new org.telegram.ui.Cells.z3(context, 26, u6Var);
                z3Var.setBackground(null);
                view = z3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, null);
                zw0Var.b(krVar.o1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                zw0Var.setCallback(new fr(this, 1));
                view = zw0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.w4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(6);
                c10Var.w = false;
                c10Var.setUseHeaderOffset(false);
                c10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                c10Var.setLayoutParams(q0Var);
                view = c10Var;
                break;
            case 12:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, this.c, krVar.getResourceProvider(), false, true);
                v8Var.v = 50;
                view = v8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.c, krVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
                y1Var.setEnabled(true);
                view = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.zw0 zw0Var2 = new org.telegram.ui.Components.zw0(context, null);
                Drawable[] drawableArr = {krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = krVar.r1;
                zw0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                zw0Var2.setCallback(new fr(this, 2));
                view2 = zw0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.a9(context, krVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.c8(context, krVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.vl0(view);
    }
}
