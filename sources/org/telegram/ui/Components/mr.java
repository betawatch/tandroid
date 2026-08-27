package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ mr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
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
                b51 b51Var = (b51) obj2;
                ur urVar = this.b;
                tr trVar = urVar.f0;
                tr trVar2 = urVar.h0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = urVar.s0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = urVar.r0;
                if (urVar.X != null) {
                    arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.Cells.pa.o(R.string.DeleteAdditionalActions, arrayList);
                    urVar.T(arrayList, urVar.e0);
                    if (urVar.v0) {
                        trVar.g();
                        int i10 = (urVar.y0 ? 1 : 0) + (urVar.z0 ? 1 : 0);
                        String str = trVar.b;
                        Locale locale = Locale.US;
                        n41 z11 = n41.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = urVar.x0;
                        z11.D = new q2(17, urVar, b51Var);
                        arrayList.add(z11);
                        if (!urVar.x0) {
                            n41 y10 = n41.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y10.K(urVar.y0);
                            y10.i = 1;
                            arrayList.add(y10);
                            n41 y11 = n41.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y11.K(urVar.z0);
                            y11.i = 1;
                            arrayList.add(y11);
                        }
                    } else {
                        urVar.T(arrayList, trVar);
                        urVar.T(arrayList, urVar.g0);
                    }
                    urVar.T(arrayList, trVar2);
                    if (!urVar.d0 && trVar2.c()) {
                        if (urVar.c0) {
                            arrayList.add(n41.B(null));
                            if (trVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", trVar2.i, new Object[0]);
                                n41 n41Var = new n41(42);
                                n41Var.d = 0;
                                n41Var.o = formatPluralString;
                                arrayList.add(n41Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                n41 n41Var2 = new n41(42);
                                n41Var2.d = 0;
                                n41Var2.o = string;
                                arrayList.add(n41Var2);
                            }
                            n41 E = n41.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            n41 m10 = n41.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = urVar.S();
                            m10.f = urVar.u0;
                            m10.D = new gh.v2(urVar, i11, b51Var, 9);
                            arrayList.add(m10);
                            if (!urVar.u0) {
                                n41 y12 = n41.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y12.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_photos;
                                y12.i = 1;
                                arrayList.add(y12);
                                n41 y13 = n41.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y13.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y13.t = tL_chatBannedRights2.send_videos;
                                y13.i = 1;
                                arrayList.add(y13);
                                n41 y14 = n41.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y14.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y14.t = tL_chatBannedRights2.send_docs;
                                y14.i = 1;
                                arrayList.add(y14);
                                n41 y15 = n41.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y15.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y15.t = tL_chatBannedRights2.send_audios;
                                y15.i = 1;
                                arrayList.add(y15);
                                n41 y16 = n41.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y16.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y16.t = tL_chatBannedRights2.send_voices;
                                y16.i = 1;
                                arrayList.add(y16);
                                n41 y17 = n41.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y17.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y17.t = tL_chatBannedRights2.send_roundvideos;
                                y17.i = 1;
                                arrayList.add(y17);
                                n41 y18 = n41.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y18.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y18.t = tL_chatBannedRights2.send_stickers;
                                y18.i = 1;
                                arrayList.add(y18);
                                n41 y19 = n41.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y19.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y19.t = tL_chatBannedRights2.send_polls;
                                y19.i = 1;
                                arrayList.add(y19);
                                n41 y20 = n41.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y20.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y20.t = tL_chatBannedRights2.embed_links;
                                y20.i = 1;
                                arrayList.add(y20);
                                n41 y21 = n41.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y21.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y21.t = tL_chatBannedRights2.send_reactions;
                                y21.i = 1;
                                arrayList.add(y21);
                            }
                            n41 E2 = n41.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            n41 E3 = n41.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            n41 E4 = n41.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (urVar.W) {
                                n41 E5 = n41.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (urVar.k0) {
                            String string3 = LocaleController.getString(!trVar2.b() ? urVar.c0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : urVar.c0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            n41 n41Var3 = new n41(38);
                            n41Var3.d = 1;
                            n41Var3.o = string3;
                            n41Var3.f = !urVar.c0;
                            n41Var3.q = true;
                            arrayList.add(n41Var3);
                            z10 = false;
                            if (urVar.m0 == 0) {
                                if (z10) {
                                    arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                n41 n41Var4 = new n41(39);
                                n41Var4.d = 103;
                                n41Var4.l = string4;
                                n41Var4.z = 0;
                                n41Var4.K(urVar.l0);
                                arrayList.add(n41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = urVar.n0;
                                arrayList.add(n41.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new nr(urVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (urVar.m0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                ur urVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    urVar2.getClass();
                    break;
                } else {
                    urVar2.n0 = participantJoinedChats2;
                    urVar2.T.N(true);
                    break;
                }
        }
    }
}
