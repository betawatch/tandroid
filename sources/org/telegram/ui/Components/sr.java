package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ sr(as asVar, int i10) {
        this.a = i10;
        this.b = asVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x03fd  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                as asVar = this.b;
                zr zrVar = asVar.f0;
                zr zrVar2 = asVar.h0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = asVar.r0;
                if (asVar.X != null) {
                    arrayList.add(w41.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.th.p(R.string.DeleteAdditionalActions, arrayList);
                    asVar.T(arrayList, asVar.e0);
                    if (asVar.v0) {
                        zrVar.g();
                        int i10 = (asVar.y0 ? 1 : 0) + (asVar.z0 ? 1 : 0);
                        String str = zrVar.b;
                        Locale locale = Locale.US;
                        w41 z11 = w41.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = asVar.x0;
                        z11.D = new t2(17, asVar, k51Var);
                        arrayList.add(z11);
                        if (!asVar.x0) {
                            w41 y8 = w41.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y8.K(asVar.y0);
                            y8.i = 1;
                            arrayList.add(y8);
                            w41 y10 = w41.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(asVar.z0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        asVar.T(arrayList, zrVar);
                        asVar.T(arrayList, asVar.g0);
                    }
                    asVar.T(arrayList, zrVar2);
                    if (!asVar.d0 && zrVar2.c()) {
                        if (asVar.c0) {
                            arrayList.add(w41.B(null));
                            if (zrVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", zrVar2.i, new Object[0]);
                                w41 w41Var = new w41(42);
                                w41Var.d = 0;
                                w41Var.o = formatPluralString;
                                arrayList.add(w41Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                w41 w41Var2 = new w41(42);
                                w41Var2.d = 0;
                                w41Var2.o = string;
                                arrayList.add(w41Var2);
                            }
                            w41 E = w41.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            w41 m10 = w41.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = asVar.S();
                            m10.f = asVar.u0;
                            m10.D = new bg.p2(asVar, i11, k51Var, 10);
                            arrayList.add(m10);
                            if (!asVar.u0) {
                                w41 y11 = w41.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                w41 y12 = w41.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                w41 y13 = w41.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                w41 y14 = w41.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                w41 y15 = w41.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                w41 y16 = w41.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                w41 y17 = w41.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                w41 y18 = w41.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                w41 y19 = w41.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                w41 y20 = w41.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            w41 E2 = w41.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            w41 E3 = w41.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            w41 E4 = w41.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (asVar.W) {
                                w41 E5 = w41.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (asVar.k0) {
                            String string3 = LocaleController.getString(!zrVar2.b() ? asVar.c0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : asVar.c0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            w41 w41Var3 = new w41(38);
                            w41Var3.d = 1;
                            w41Var3.o = string3;
                            w41Var3.f = !asVar.c0;
                            w41Var3.q = true;
                            arrayList.add(w41Var3);
                            z10 = false;
                            if (asVar.m0 == 0) {
                                if (z10) {
                                    arrayList.add(w41.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                w41 w41Var4 = new w41(39);
                                w41Var4.d = 103;
                                w41Var4.l = string4;
                                w41Var4.z = 0;
                                w41Var4.K(asVar.l0);
                                arrayList.add(w41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = asVar.n0;
                                arrayList.add(w41.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new tr(asVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (asVar.m0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                as asVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    asVar2.getClass();
                    break;
                } else {
                    asVar2.n0 = participantJoinedChats2;
                    asVar2.T.N(true);
                    break;
                }
        }
    }
}
