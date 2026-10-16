package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss b;

    public /* synthetic */ ls(ss ssVar, int i10) {
        this.a = i10;
        this.b = ssVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fc  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        Object[] objArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                ss ssVar = this.b;
                rs rsVar = ssVar.j0;
                rs rsVar2 = ssVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ssVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = ssVar.v0;
                if (ssVar.b0 != null) {
                    arrayList.add(m61.C(AndroidUtilities.dp(12.0f)));
                    i2.d.p(R.string.DeleteAdditionalActions, arrayList);
                    ssVar.U(arrayList, ssVar.i0);
                    if (ssVar.z0) {
                        rsVar.g();
                        int i10 = (ssVar.C0 ? 1 : 0) + (ssVar.D0 ? 1 : 0);
                        String str = rsVar.b;
                        Locale locale = Locale.US;
                        m61 z10 = m61.z(i10 + "/2", str, 100);
                        z10.K(i10 == 2);
                        z10.f = ssVar.B0;
                        z10.D = new org.telegram.ui.xf(29, ssVar, a71Var);
                        arrayList.add(z10);
                        if (!ssVar.B0) {
                            m61 y3 = m61.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(ssVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            m61 y10 = m61.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(ssVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        ssVar.U(arrayList, rsVar);
                        ssVar.U(arrayList, ssVar.k0);
                    }
                    ssVar.U(arrayList, rsVar2);
                    if (!ssVar.h0 && rsVar2.c()) {
                        if (ssVar.g0) {
                            arrayList.add(m61.B(null));
                            if (rsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", rsVar2.i, new Object[0]);
                                m61 m61Var = new m61(42);
                                m61Var.d = 0;
                                m61Var.o = formatPluralString;
                                arrayList.add(m61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                m61 m61Var2 = new m61(42);
                                m61Var2.d = 0;
                                m61Var2.o = string;
                                arrayList.add(m61Var2);
                            }
                            m61 E = m61.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            m61 m10 = m61.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = ssVar.T();
                            m10.f = ssVar.y0;
                            m10.D = new org.telegram.ui.Cells.sa(ssVar, i11, a71Var, 7);
                            arrayList.add(m10);
                            if (!ssVar.y0) {
                                m61 y11 = m61.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                m61 y12 = m61.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                m61 y13 = m61.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                m61 y14 = m61.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                m61 y15 = m61.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                m61 y16 = m61.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                m61 y17 = m61.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                m61 y18 = m61.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                m61 y19 = m61.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                m61 y20 = m61.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            m61 E2 = m61.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            m61 E3 = m61.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            m61 E4 = m61.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (ssVar.a0) {
                                m61 E5 = m61.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (ssVar.o0) {
                            String string3 = LocaleController.getString(!rsVar2.b() ? ssVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : ssVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            m61 m61Var3 = new m61(38);
                            m61Var3.d = 1;
                            m61Var3.o = string3;
                            m61Var3.f = !ssVar.g0;
                            m61Var3.q = true;
                            arrayList.add(m61Var3);
                            objArr = false;
                            if (ssVar.q0 == 0) {
                                if (objArr != false) {
                                    arrayList.add(m61.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                m61 m61Var4 = new m61(39);
                                m61Var4.d = 103;
                                m61Var4.l = string4;
                                m61Var4.z = 0;
                                m61Var4.K(ssVar.p0);
                                arrayList.add(m61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = ssVar.r0;
                                arrayList.add(m61.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new ms(ssVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (ssVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                ss ssVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    ssVar2.getClass();
                    break;
                } else {
                    ssVar2.r0 = participantJoinedChats2;
                    ssVar2.X.N(true);
                    break;
                }
        }
    }
}
