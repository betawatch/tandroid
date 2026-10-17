package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps b;

    public /* synthetic */ is(ps psVar, int i10) {
        this.a = i10;
        this.b = psVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fd  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        Object[] objArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                ps psVar = this.b;
                os osVar = psVar.j0;
                os osVar2 = psVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = psVar.v0;
                if (psVar.b0 != null) {
                    arrayList.add(f61.C(AndroidUtilities.dp(12.0f)));
                    i0.a.p(R.string.DeleteAdditionalActions, arrayList);
                    psVar.U(arrayList, psVar.i0);
                    if (psVar.z0) {
                        osVar.g();
                        int i10 = (psVar.C0 ? 1 : 0) + (psVar.D0 ? 1 : 0);
                        String str = osVar.b;
                        Locale locale = Locale.US;
                        f61 z10 = f61.z(i10 + "/2", str, 100);
                        z10.K(i10 == 2);
                        z10.f = psVar.B0;
                        z10.D = new ca(9, psVar, s61Var);
                        arrayList.add(z10);
                        if (!psVar.B0) {
                            f61 y3 = f61.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(psVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            f61 y10 = f61.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(psVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        psVar.U(arrayList, osVar);
                        psVar.U(arrayList, psVar.k0);
                    }
                    psVar.U(arrayList, osVar2);
                    if (!psVar.h0 && osVar2.c()) {
                        if (psVar.g0) {
                            arrayList.add(f61.B(null));
                            if (osVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", osVar2.i, new Object[0]);
                                f61 f61Var = new f61(42);
                                f61Var.d = 0;
                                f61Var.o = formatPluralString;
                                arrayList.add(f61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                f61 f61Var2 = new f61(42);
                                f61Var2.d = 0;
                                f61Var2.o = string;
                                arrayList.add(f61Var2);
                            }
                            f61 E = f61.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            f61 m10 = f61.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = psVar.T();
                            m10.f = psVar.y0;
                            m10.D = new ai.ga(psVar, i11, s61Var, 8);
                            arrayList.add(m10);
                            if (!psVar.y0) {
                                f61 y11 = f61.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                f61 y12 = f61.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                f61 y13 = f61.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                f61 y14 = f61.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                f61 y15 = f61.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                f61 y16 = f61.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                f61 y17 = f61.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                f61 y18 = f61.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                f61 y19 = f61.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                f61 y20 = f61.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            f61 E2 = f61.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            f61 E3 = f61.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            f61 E4 = f61.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (psVar.a0) {
                                f61 E5 = f61.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (psVar.o0) {
                            String string3 = LocaleController.getString(!osVar2.b() ? psVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : psVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            f61 f61Var3 = new f61(38);
                            f61Var3.d = 1;
                            f61Var3.o = string3;
                            f61Var3.f = !psVar.g0;
                            f61Var3.q = true;
                            arrayList.add(f61Var3);
                            objArr = false;
                            if (psVar.q0 == 0) {
                                if (objArr != false) {
                                    arrayList.add(f61.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                f61 f61Var4 = new f61(39);
                                f61Var4.d = 103;
                                f61Var4.l = string4;
                                f61Var4.z = 0;
                                f61Var4.K(psVar.p0);
                                arrayList.add(f61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = psVar.r0;
                                arrayList.add(f61.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new js(psVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (psVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                ps psVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    psVar2.getClass();
                    break;
                } else {
                    psVar2.r0 = participantJoinedChats2;
                    psVar2.X.N(true);
                    break;
                }
        }
    }
}
