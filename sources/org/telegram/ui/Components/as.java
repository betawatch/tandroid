package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ as(hs hsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
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
                l61 l61Var = (l61) obj2;
                hs hsVar = this.b;
                gs gsVar = hsVar.j0;
                gs gsVar2 = hsVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = hsVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = hsVar.v0;
                if (hsVar.b0 != null) {
                    arrayList.add(x51.C(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.n(R.string.DeleteAdditionalActions, arrayList);
                    hsVar.T(arrayList, hsVar.i0);
                    if (hsVar.z0) {
                        gsVar.g();
                        int i10 = (hsVar.C0 ? 1 : 0) + (hsVar.D0 ? 1 : 0);
                        String str = gsVar.b;
                        Locale locale = Locale.US;
                        x51 z11 = x51.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = hsVar.B0;
                        z11.D = new org.telegram.ui.pf(29, hsVar, l61Var);
                        arrayList.add(z11);
                        if (!hsVar.B0) {
                            x51 y3 = x51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(hsVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            x51 y10 = x51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(hsVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        hsVar.T(arrayList, gsVar);
                        hsVar.T(arrayList, hsVar.k0);
                    }
                    hsVar.T(arrayList, gsVar2);
                    if (!hsVar.h0 && gsVar2.c()) {
                        if (hsVar.g0) {
                            arrayList.add(x51.B(null));
                            if (gsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", gsVar2.i, new Object[0]);
                                x51 x51Var = new x51(42);
                                x51Var.d = 0;
                                x51Var.o = formatPluralString;
                                arrayList.add(x51Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                x51 x51Var2 = new x51(42);
                                x51Var2.d = 0;
                                x51Var2.o = string;
                                arrayList.add(x51Var2);
                            }
                            x51 E = x51.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            x51 m10 = x51.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = hsVar.S();
                            m10.f = hsVar.y0;
                            m10.D = new org.telegram.ui.Cells.ua(hsVar, i11, l61Var, 6);
                            arrayList.add(m10);
                            if (!hsVar.y0) {
                                x51 y11 = x51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                x51 y12 = x51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                x51 y13 = x51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                x51 y14 = x51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                x51 y15 = x51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                x51 y16 = x51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                x51 y17 = x51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                x51 y18 = x51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                x51 y19 = x51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                x51 y20 = x51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            x51 E2 = x51.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            x51 E3 = x51.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            x51 E4 = x51.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (hsVar.a0) {
                                x51 E5 = x51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (hsVar.o0) {
                            String string3 = LocaleController.getString(!gsVar2.b() ? hsVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : hsVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            x51 x51Var3 = new x51(38);
                            x51Var3.d = 1;
                            x51Var3.o = string3;
                            x51Var3.f = !hsVar.g0;
                            x51Var3.q = true;
                            arrayList.add(x51Var3);
                            z10 = false;
                            if (hsVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(x51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                x51 x51Var4 = new x51(39);
                                x51Var4.d = 103;
                                x51Var4.l = string4;
                                x51Var4.z = 0;
                                x51Var4.K(hsVar.p0);
                                arrayList.add(x51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = hsVar.r0;
                                arrayList.add(x51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new bs(hsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (hsVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                hs hsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    hsVar2.getClass();
                    break;
                } else {
                    hsVar2.r0 = participantJoinedChats2;
                    hsVar2.X.N(true);
                    break;
                }
        }
    }
}
