package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ or(wr wrVar, int i9) {
        this.a = i9;
        this.b = wrVar;
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
                z41 z41Var = (z41) obj2;
                wr wrVar = this.b;
                vr vrVar = wrVar.f0;
                vr vrVar2 = wrVar.h0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = wrVar.s0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = wrVar.r0;
                if (wrVar.X != null) {
                    arrayList.add(l41.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.Cells.j2.l(R.string.DeleteAdditionalActions, arrayList);
                    wrVar.S(arrayList, wrVar.e0);
                    if (wrVar.v0) {
                        vrVar.g();
                        int i9 = (wrVar.y0 ? 1 : 0) + (wrVar.z0 ? 1 : 0);
                        String str = vrVar.b;
                        Locale locale = Locale.US;
                        l41 z11 = l41.z(i9 + "/2", str, 100);
                        z11.K(i9 == 2);
                        z11.f = wrVar.x0;
                        z11.D = new s2(16, wrVar, z41Var);
                        arrayList.add(z11);
                        if (!wrVar.x0) {
                            l41 y10 = l41.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y10.K(wrVar.y0);
                            y10.i = 1;
                            arrayList.add(y10);
                            l41 y11 = l41.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y11.K(wrVar.z0);
                            y11.i = 1;
                            arrayList.add(y11);
                        }
                    } else {
                        wrVar.S(arrayList, vrVar);
                        wrVar.S(arrayList, wrVar.g0);
                    }
                    wrVar.S(arrayList, vrVar2);
                    if (!wrVar.d0 && vrVar2.c()) {
                        if (wrVar.c0) {
                            arrayList.add(l41.B(null));
                            if (vrVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", vrVar2.i, new Object[0]);
                                l41 l41Var = new l41(42);
                                l41Var.d = 0;
                                l41Var.o = formatPluralString;
                                arrayList.add(l41Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                l41 l41Var2 = new l41(42);
                                l41Var2.d = 0;
                                l41Var2.o = string;
                                arrayList.add(l41Var2);
                            }
                            l41 E = l41.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
                            E.K((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            E.t = tL_chatBannedRights2.send_plain;
                            arrayList.add(E);
                            int i10 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i10++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i10++;
                            }
                            String string2 = LocaleController.getString(R.string.UserRestrictionsSendMedia);
                            Locale locale2 = Locale.US;
                            l41 m10 = l41.m(1, string2, i10 + "/10");
                            m10.K(i10 > 0);
                            m10.t = wrVar.R();
                            m10.f = wrVar.u0;
                            m10.D = new fh.a3(wrVar, i10, z41Var, 9);
                            arrayList.add(m10);
                            if (!wrVar.u0) {
                                l41 y12 = l41.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y12.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_photos;
                                y12.i = 1;
                                arrayList.add(y12);
                                l41 y13 = l41.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y13.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y13.t = tL_chatBannedRights2.send_videos;
                                y13.i = 1;
                                arrayList.add(y13);
                                l41 y14 = l41.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y14.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y14.t = tL_chatBannedRights2.send_docs;
                                y14.i = 1;
                                arrayList.add(y14);
                                l41 y15 = l41.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y15.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y15.t = tL_chatBannedRights2.send_audios;
                                y15.i = 1;
                                arrayList.add(y15);
                                l41 y16 = l41.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y16.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y16.t = tL_chatBannedRights2.send_voices;
                                y16.i = 1;
                                arrayList.add(y16);
                                l41 y17 = l41.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y17.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y17.t = tL_chatBannedRights2.send_roundvideos;
                                y17.i = 1;
                                arrayList.add(y17);
                                l41 y18 = l41.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y18.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y18.t = tL_chatBannedRights2.send_stickers;
                                y18.i = 1;
                                arrayList.add(y18);
                                l41 y19 = l41.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y19.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y19.t = tL_chatBannedRights2.send_polls;
                                y19.i = 1;
                                arrayList.add(y19);
                                l41 y20 = l41.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y20.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y20.t = tL_chatBannedRights2.embed_links;
                                y20.i = 1;
                                arrayList.add(y20);
                                l41 y21 = l41.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y21.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y21.t = tL_chatBannedRights2.send_reactions;
                                y21.i = 1;
                                arrayList.add(y21);
                            }
                            l41 E2 = l41.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            l41 E3 = l41.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            l41 E4 = l41.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (wrVar.W) {
                                l41 E5 = l41.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (wrVar.k0) {
                            String string3 = LocaleController.getString(!vrVar2.b() ? wrVar.c0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : wrVar.c0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            l41 l41Var3 = new l41(38);
                            l41Var3.d = 1;
                            l41Var3.o = string3;
                            l41Var3.f = !wrVar.c0;
                            l41Var3.q = true;
                            arrayList.add(l41Var3);
                            z10 = false;
                            if (wrVar.m0 == 0) {
                                if (z10) {
                                    arrayList.add(l41.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                l41 l41Var4 = new l41(39);
                                l41Var4.d = 103;
                                l41Var4.l = string4;
                                l41Var4.z = 0;
                                l41Var4.K(wrVar.l0);
                                arrayList.add(l41Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = wrVar.n0;
                                arrayList.add(l41.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new pr(wrVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (wrVar.m0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                wr wrVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    wrVar2.getClass();
                    break;
                } else {
                    wrVar2.n0 = participantJoinedChats2;
                    wrVar2.T.N(true);
                    break;
                }
        }
    }
}
