package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es b;

    public /* synthetic */ wr(es esVar, int i10) {
        this.a = i10;
        this.b = esVar;
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
                es esVar = this.b;
                ds dsVar = esVar.g0;
                ds dsVar2 = esVar.i0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = esVar.t0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = esVar.s0;
                if (esVar.Y != null) {
                    arrayList.add(i51.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.yh.r(R.string.DeleteAdditionalActions, arrayList);
                    esVar.T(arrayList, esVar.f0);
                    if (esVar.w0) {
                        dsVar.g();
                        int i10 = (esVar.z0 ? 1 : 0) + (esVar.A0 ? 1 : 0);
                        String str = dsVar.b;
                        Locale locale = Locale.US;
                        i51 z10 = i51.z(i10 + "/2", str, 100);
                        z10.K(i10 == 2);
                        z10.f = esVar.y0;
                        z10.D = new w2(14, esVar, w51Var);
                        arrayList.add(z10);
                        if (!esVar.y0) {
                            i51 y10 = i51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y10.K(esVar.z0);
                            y10.i = 1;
                            arrayList.add(y10);
                            i51 y11 = i51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y11.K(esVar.A0);
                            y11.i = 1;
                            arrayList.add(y11);
                        }
                    } else {
                        esVar.T(arrayList, dsVar);
                        esVar.T(arrayList, esVar.h0);
                    }
                    esVar.T(arrayList, dsVar2);
                    if (!esVar.e0 && dsVar2.c()) {
                        if (esVar.d0) {
                            arrayList.add(i51.B(null));
                            if (dsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", dsVar2.i, new Object[0]);
                                i51 i51Var = new i51(42);
                                i51Var.d = 0;
                                i51Var.o = formatPluralString;
                                arrayList.add(i51Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                i51 i51Var2 = new i51(42);
                                i51Var2.d = 0;
                                i51Var2.o = string;
                                arrayList.add(i51Var2);
                            }
                            i51 E = i51.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            i51 m9 = i51.m(1, string2, i11 + "/10");
                            m9.K(i11 > 0);
                            m9.t = esVar.S();
                            m9.f = esVar.v0;
                            m9.D = new dg.m2(esVar, i11, w51Var, 10);
                            arrayList.add(m9);
                            if (!esVar.v0) {
                                i51 y12 = i51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y12.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_photos;
                                y12.i = 1;
                                arrayList.add(y12);
                                i51 y13 = i51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y13.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y13.t = tL_chatBannedRights2.send_videos;
                                y13.i = 1;
                                arrayList.add(y13);
                                i51 y14 = i51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y14.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y14.t = tL_chatBannedRights2.send_docs;
                                y14.i = 1;
                                arrayList.add(y14);
                                i51 y15 = i51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y15.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y15.t = tL_chatBannedRights2.send_audios;
                                y15.i = 1;
                                arrayList.add(y15);
                                i51 y16 = i51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y16.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y16.t = tL_chatBannedRights2.send_voices;
                                y16.i = 1;
                                arrayList.add(y16);
                                i51 y17 = i51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y17.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y17.t = tL_chatBannedRights2.send_roundvideos;
                                y17.i = 1;
                                arrayList.add(y17);
                                i51 y18 = i51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y18.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y18.t = tL_chatBannedRights2.send_stickers;
                                y18.i = 1;
                                arrayList.add(y18);
                                i51 y19 = i51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y19.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y19.t = tL_chatBannedRights2.send_polls;
                                y19.i = 1;
                                arrayList.add(y19);
                                i51 y20 = i51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y20.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y20.t = tL_chatBannedRights2.embed_links;
                                y20.i = 1;
                                arrayList.add(y20);
                                i51 y21 = i51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y21.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y21.t = tL_chatBannedRights2.send_reactions;
                                y21.i = 1;
                                arrayList.add(y21);
                            }
                            i51 E2 = i51.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            i51 E3 = i51.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            i51 E4 = i51.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (esVar.X) {
                                i51 E5 = i51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (esVar.l0) {
                            String string3 = LocaleController.getString(!dsVar2.b() ? esVar.d0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : esVar.d0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            i51 i51Var3 = new i51(38);
                            i51Var3.d = 1;
                            i51Var3.o = string3;
                            i51Var3.f = !esVar.d0;
                            i51Var3.q = true;
                            arrayList.add(i51Var3);
                            z4 = false;
                            if (esVar.n0 == 0) {
                                if (z4) {
                                    arrayList.add(i51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                i51 i51Var4 = new i51(39);
                                i51Var4.d = 103;
                                i51Var4.l = string4;
                                i51Var4.z = 0;
                                i51Var4.K(esVar.m0);
                                arrayList.add(i51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = esVar.o0;
                                arrayList.add(i51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new xr(esVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z4 = true;
                    if (esVar.n0 == 0) {
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
                    esVar2.o0 = participantJoinedChats2;
                    esVar2.U.N(true);
                    break;
                }
        }
    }
}
