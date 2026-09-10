package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ es(ls lsVar, int i10) {
        this.a = i10;
        this.b = lsVar;
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
                j61 j61Var = (j61) obj2;
                ls lsVar = this.b;
                ks ksVar = lsVar.j0;
                ks ksVar2 = lsVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lsVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lsVar.v0;
                if (lsVar.b0 != null) {
                    arrayList.add(v51.C(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.m(R.string.DeleteAdditionalActions, arrayList);
                    lsVar.T(arrayList, lsVar.i0);
                    if (lsVar.z0) {
                        ksVar.g();
                        int i10 = (lsVar.C0 ? 1 : 0) + (lsVar.D0 ? 1 : 0);
                        String str = ksVar.b;
                        Locale locale = Locale.US;
                        v51 z11 = v51.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = lsVar.B0;
                        z11.D = new org.telegram.ui.sh(26, lsVar, j61Var);
                        arrayList.add(z11);
                        if (!lsVar.B0) {
                            v51 y3 = v51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(lsVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            v51 y10 = v51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(lsVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        lsVar.T(arrayList, ksVar);
                        lsVar.T(arrayList, lsVar.k0);
                    }
                    lsVar.T(arrayList, ksVar2);
                    if (!lsVar.h0 && ksVar2.c()) {
                        if (lsVar.g0) {
                            arrayList.add(v51.B(null));
                            if (ksVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", ksVar2.i, new Object[0]);
                                v51 v51Var = new v51(42);
                                v51Var.d = 0;
                                v51Var.o = formatPluralString;
                                arrayList.add(v51Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                v51 v51Var2 = new v51(42);
                                v51Var2.d = 0;
                                v51Var2.o = string;
                                arrayList.add(v51Var2);
                            }
                            v51 E = v51.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            v51 m10 = v51.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = lsVar.S();
                            m10.f = lsVar.y0;
                            m10.D = new org.telegram.ui.Cells.wa(lsVar, i11, j61Var, 6);
                            arrayList.add(m10);
                            if (!lsVar.y0) {
                                v51 y11 = v51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                v51 y12 = v51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                v51 y13 = v51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                v51 y14 = v51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                v51 y15 = v51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                v51 y16 = v51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                v51 y17 = v51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                v51 y18 = v51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                v51 y19 = v51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                v51 y20 = v51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            v51 E2 = v51.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            v51 E3 = v51.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            v51 E4 = v51.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (lsVar.a0) {
                                v51 E5 = v51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (lsVar.o0) {
                            String string3 = LocaleController.getString(!ksVar2.b() ? lsVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : lsVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            v51 v51Var3 = new v51(38);
                            v51Var3.d = 1;
                            v51Var3.o = string3;
                            v51Var3.f = !lsVar.g0;
                            v51Var3.q = true;
                            arrayList.add(v51Var3);
                            z10 = false;
                            if (lsVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(v51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                v51 v51Var4 = new v51(39);
                                v51Var4.d = 103;
                                v51Var4.l = string4;
                                v51Var4.z = 0;
                                v51Var4.K(lsVar.p0);
                                arrayList.add(v51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = lsVar.r0;
                                arrayList.add(v51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new fs(lsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (lsVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                ls lsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    lsVar2.getClass();
                    break;
                } else {
                    lsVar2.r0 = participantJoinedChats2;
                    lsVar2.X.N(true);
                    break;
                }
        }
    }
}
