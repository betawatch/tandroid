package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ bs(is isVar, int i10) {
        this.a = i10;
        this.b = isVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x03fc  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                is isVar = this.b;
                hs hsVar = isVar.j0;
                hs hsVar2 = isVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = isVar.v0;
                if (isVar.b0 != null) {
                    arrayList.add(g61.C(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.n(R.string.DeleteAdditionalActions, arrayList);
                    isVar.R(arrayList, isVar.i0);
                    if (isVar.z0) {
                        hsVar.g();
                        int i10 = (isVar.C0 ? 1 : 0) + (isVar.D0 ? 1 : 0);
                        String str = hsVar.b;
                        Locale locale = Locale.US;
                        g61 z11 = g61.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = isVar.B0;
                        z11.D = new org.telegram.ui.qf(29, isVar, u61Var);
                        arrayList.add(z11);
                        if (!isVar.B0) {
                            g61 y3 = g61.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(isVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            g61 y10 = g61.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(isVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        isVar.R(arrayList, hsVar);
                        isVar.R(arrayList, isVar.k0);
                    }
                    isVar.R(arrayList, hsVar2);
                    if (!isVar.h0 && hsVar2.c()) {
                        if (isVar.g0) {
                            arrayList.add(g61.B(null));
                            if (hsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", hsVar2.i, new Object[0]);
                                g61 g61Var = new g61(42);
                                g61Var.d = 0;
                                g61Var.o = formatPluralString;
                                arrayList.add(g61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                g61 g61Var2 = new g61(42);
                                g61Var2.d = 0;
                                g61Var2.o = string;
                                arrayList.add(g61Var2);
                            }
                            g61 E = g61.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
                            E.K((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            E.t = tL_chatBannedRights2.send_plain;
                            arrayList.add(E);
                            int i11 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i11++;
                            }
                            String string2 = LocaleController.getString(R.string.UserRestrictionsSendMedia);
                            Locale locale2 = Locale.US;
                            g61 n10 = g61.n(1, string2, i11 + "/10");
                            n10.K(i11 > 0);
                            n10.t = isVar.Q();
                            n10.f = isVar.y0;
                            n10.D = new org.telegram.ui.Cells.ua(isVar, i11, u61Var, 6);
                            arrayList.add(n10);
                            if (!isVar.y0) {
                                g61 y11 = g61.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                g61 y12 = g61.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                g61 y13 = g61.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                g61 y14 = g61.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                g61 y15 = g61.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                g61 y16 = g61.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                g61 y17 = g61.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                g61 y18 = g61.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                g61 y19 = g61.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                g61 y20 = g61.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            g61 E2 = g61.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            g61 E3 = g61.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            g61 E4 = g61.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (isVar.a0) {
                                g61 E5 = g61.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (isVar.o0) {
                            String string3 = LocaleController.getString(!hsVar2.b() ? isVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : isVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            g61 g61Var3 = new g61(38);
                            g61Var3.d = 1;
                            g61Var3.o = string3;
                            g61Var3.f = !isVar.g0;
                            g61Var3.q = true;
                            arrayList.add(g61Var3);
                            z10 = false;
                            if (isVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(g61.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                g61 g61Var4 = new g61(39);
                                g61Var4.d = 103;
                                g61Var4.l = string4;
                                g61Var4.z = 0;
                                g61Var4.K(isVar.p0);
                                arrayList.add(g61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = isVar.r0;
                                arrayList.add(g61.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new cs(isVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (isVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                is isVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    isVar2.getClass();
                    break;
                } else {
                    isVar2.r0 = participantJoinedChats2;
                    isVar2.X.N(true);
                    break;
                }
        }
    }
}
