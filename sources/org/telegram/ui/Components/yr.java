package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ yr(gs gsVar, int i10) {
        this.a = i10;
        this.b = gsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x03fd  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z4;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                gs gsVar = this.b;
                fs fsVar = gsVar.g0;
                fs fsVar2 = gsVar.i0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.t0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = gsVar.s0;
                if (gsVar.Y != null) {
                    arrayList.add(h51.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.yh.r(R.string.DeleteAdditionalActions, arrayList);
                    gsVar.T(arrayList, gsVar.f0);
                    if (gsVar.w0) {
                        fsVar.g();
                        int i10 = (gsVar.z0 ? 1 : 0) + (gsVar.A0 ? 1 : 0);
                        String str = fsVar.b;
                        Locale locale = Locale.US;
                        h51 z10 = h51.z(i10 + "/2", str, 100);
                        z10.K(i10 == 2);
                        z10.f = gsVar.y0;
                        z10.D = new w2(14, gsVar, w51Var);
                        arrayList.add(z10);
                        if (!gsVar.y0) {
                            h51 y10 = h51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y10.K(gsVar.z0);
                            y10.i = 1;
                            arrayList.add(y10);
                            h51 y11 = h51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y11.K(gsVar.A0);
                            y11.i = 1;
                            arrayList.add(y11);
                        }
                    } else {
                        gsVar.T(arrayList, fsVar);
                        gsVar.T(arrayList, gsVar.h0);
                    }
                    gsVar.T(arrayList, fsVar2);
                    if (!gsVar.e0 && fsVar2.c()) {
                        if (gsVar.d0) {
                            arrayList.add(h51.B(null));
                            if (fsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", fsVar2.i, new Object[0]);
                                h51 h51Var = new h51(42);
                                h51Var.d = 0;
                                h51Var.o = formatPluralString;
                                arrayList.add(h51Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                h51 h51Var2 = new h51(42);
                                h51Var2.d = 0;
                                h51Var2.o = string;
                                arrayList.add(h51Var2);
                            }
                            h51 E = h51.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            h51 m9 = h51.m(1, string2, i11 + "/10");
                            m9.K(i11 > 0);
                            m9.t = gsVar.S();
                            m9.f = gsVar.v0;
                            m9.D = new eg.k2(gsVar, i11, w51Var, 10);
                            arrayList.add(m9);
                            if (!gsVar.v0) {
                                h51 y12 = h51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y12.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_photos;
                                y12.i = 1;
                                arrayList.add(y12);
                                h51 y13 = h51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y13.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y13.t = tL_chatBannedRights2.send_videos;
                                y13.i = 1;
                                arrayList.add(y13);
                                h51 y14 = h51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y14.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y14.t = tL_chatBannedRights2.send_docs;
                                y14.i = 1;
                                arrayList.add(y14);
                                h51 y15 = h51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y15.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y15.t = tL_chatBannedRights2.send_audios;
                                y15.i = 1;
                                arrayList.add(y15);
                                h51 y16 = h51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y16.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y16.t = tL_chatBannedRights2.send_voices;
                                y16.i = 1;
                                arrayList.add(y16);
                                h51 y17 = h51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y17.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y17.t = tL_chatBannedRights2.send_roundvideos;
                                y17.i = 1;
                                arrayList.add(y17);
                                h51 y18 = h51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y18.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y18.t = tL_chatBannedRights2.send_stickers;
                                y18.i = 1;
                                arrayList.add(y18);
                                h51 y19 = h51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y19.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y19.t = tL_chatBannedRights2.send_polls;
                                y19.i = 1;
                                arrayList.add(y19);
                                h51 y20 = h51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y20.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y20.t = tL_chatBannedRights2.embed_links;
                                y20.i = 1;
                                arrayList.add(y20);
                                h51 y21 = h51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y21.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y21.t = tL_chatBannedRights2.send_reactions;
                                y21.i = 1;
                                arrayList.add(y21);
                            }
                            h51 E2 = h51.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            h51 E3 = h51.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            h51 E4 = h51.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (gsVar.X) {
                                h51 E5 = h51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (gsVar.l0) {
                            String string3 = LocaleController.getString(!fsVar2.b() ? gsVar.d0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : gsVar.d0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            h51 h51Var3 = new h51(38);
                            h51Var3.d = 1;
                            h51Var3.o = string3;
                            h51Var3.f = !gsVar.d0;
                            h51Var3.q = true;
                            arrayList.add(h51Var3);
                            z4 = false;
                            if (gsVar.n0 == 0) {
                                if (z4) {
                                    arrayList.add(h51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                h51 h51Var4 = new h51(39);
                                h51Var4.d = 103;
                                h51Var4.l = string4;
                                h51Var4.z = 0;
                                h51Var4.K(gsVar.m0);
                                arrayList.add(h51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = gsVar.o0;
                                arrayList.add(h51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new zr(gsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z4 = true;
                    if (gsVar.n0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                gs gsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    gsVar2.getClass();
                    break;
                } else {
                    gsVar2.o0 = participantJoinedChats2;
                    gsVar2.U.N(true);
                    break;
                }
        }
    }
}
