package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es b;

    public /* synthetic */ xr(es esVar, int i10) {
        this.a = i10;
        this.b = esVar;
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
                v51 v51Var = (v51) obj2;
                es esVar = this.b;
                ds dsVar = esVar.j0;
                ds dsVar2 = esVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = esVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = esVar.v0;
                if (esVar.b0 != null) {
                    arrayList.add(h51.C(AndroidUtilities.dp(12.0f)));
                    i2.g.p(R.string.DeleteAdditionalActions, arrayList);
                    esVar.T(arrayList, esVar.i0);
                    if (esVar.z0) {
                        dsVar.g();
                        int i10 = (esVar.C0 ? 1 : 0) + (esVar.D0 ? 1 : 0);
                        String str = dsVar.b;
                        Locale locale = Locale.US;
                        h51 z11 = h51.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = esVar.B0;
                        z11.D = new org.telegram.ui.rf(29, esVar, v51Var);
                        arrayList.add(z11);
                        if (!esVar.B0) {
                            h51 y3 = h51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(esVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            h51 y10 = h51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(esVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        esVar.T(arrayList, dsVar);
                        esVar.T(arrayList, esVar.k0);
                    }
                    esVar.T(arrayList, dsVar2);
                    if (!esVar.h0 && dsVar2.c()) {
                        if (esVar.g0) {
                            arrayList.add(h51.B(null));
                            if (dsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", dsVar2.i, new Object[0]);
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
                            h51 m10 = h51.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = esVar.S();
                            m10.f = esVar.y0;
                            m10.D = new org.telegram.ui.Cells.ua(esVar, i11, v51Var, 6);
                            arrayList.add(m10);
                            if (!esVar.y0) {
                                h51 y11 = h51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                h51 y12 = h51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                h51 y13 = h51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                h51 y14 = h51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                h51 y15 = h51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                h51 y16 = h51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                h51 y17 = h51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                h51 y18 = h51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                h51 y19 = h51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                h51 y20 = h51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
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
                            if (esVar.a0) {
                                h51 E5 = h51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (esVar.o0) {
                            String string3 = LocaleController.getString(!dsVar2.b() ? esVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : esVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            h51 h51Var3 = new h51(38);
                            h51Var3.d = 1;
                            h51Var3.o = string3;
                            h51Var3.f = !esVar.g0;
                            h51Var3.q = true;
                            arrayList.add(h51Var3);
                            z10 = false;
                            if (esVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(h51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                h51 h51Var4 = new h51(39);
                                h51Var4.d = 103;
                                h51Var4.l = string4;
                                h51Var4.z = 0;
                                h51Var4.K(esVar.p0);
                                arrayList.add(h51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = esVar.r0;
                                arrayList.add(h51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new yr(esVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (esVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                es esVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    esVar2.getClass();
                    break;
                } else {
                    esVar2.r0 = participantJoinedChats2;
                    esVar2.X.N(true);
                    break;
                }
        }
    }
}
