package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;

    public /* synthetic */ os(vs vsVar, int i10) {
        this.a = i10;
        this.b = vsVar;
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
                c71 c71Var = (c71) obj2;
                vs vsVar = this.b;
                us usVar = vsVar.j0;
                us usVar2 = vsVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = vsVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = vsVar.v0;
                if (vsVar.b0 != null) {
                    arrayList.add(p61.C(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.n(R.string.DeleteAdditionalActions, arrayList);
                    vsVar.U(arrayList, vsVar.i0);
                    if (vsVar.z0) {
                        usVar.g();
                        int i10 = (vsVar.C0 ? 1 : 0) + (vsVar.D0 ? 1 : 0);
                        String str = usVar.b;
                        Locale locale = Locale.US;
                        p61 z10 = p61.z(i10 + "/2", str, 100);
                        z10.K(i10 == 2);
                        z10.f = vsVar.B0;
                        z10.D = new org.telegram.ui.sf(29, vsVar, c71Var);
                        arrayList.add(z10);
                        if (!vsVar.B0) {
                            p61 y3 = p61.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(vsVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            p61 y10 = p61.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(vsVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        vsVar.U(arrayList, usVar);
                        vsVar.U(arrayList, vsVar.k0);
                    }
                    vsVar.U(arrayList, usVar2);
                    if (!vsVar.h0 && usVar2.c()) {
                        if (vsVar.g0) {
                            arrayList.add(p61.B(null));
                            if (usVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", usVar2.i, new Object[0]);
                                p61 p61Var = new p61(42);
                                p61Var.d = 0;
                                p61Var.o = formatPluralString;
                                arrayList.add(p61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                p61 p61Var2 = new p61(42);
                                p61Var2.d = 0;
                                p61Var2.o = string;
                                arrayList.add(p61Var2);
                            }
                            p61 E = p61.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            p61 m10 = p61.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = vsVar.T();
                            m10.f = vsVar.y0;
                            m10.D = new org.telegram.ui.Cells.sa(vsVar, i11, c71Var, 7);
                            arrayList.add(m10);
                            if (!vsVar.y0) {
                                p61 y11 = p61.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                p61 y12 = p61.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                p61 y13 = p61.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                p61 y14 = p61.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                p61 y15 = p61.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                p61 y16 = p61.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                p61 y17 = p61.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                p61 y18 = p61.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                p61 y19 = p61.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                p61 y20 = p61.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            p61 E2 = p61.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            p61 E3 = p61.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            p61 E4 = p61.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (vsVar.a0) {
                                p61 E5 = p61.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (vsVar.o0) {
                            String string3 = LocaleController.getString(!usVar2.b() ? vsVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : vsVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            p61 p61Var3 = new p61(38);
                            p61Var3.d = 1;
                            p61Var3.o = string3;
                            p61Var3.f = !vsVar.g0;
                            p61Var3.q = true;
                            arrayList.add(p61Var3);
                            objArr = false;
                            if (vsVar.q0 == 0) {
                                if (objArr != false) {
                                    arrayList.add(p61.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                p61 p61Var4 = new p61(39);
                                p61Var4.d = 103;
                                p61Var4.l = string4;
                                p61Var4.z = 0;
                                p61Var4.K(vsVar.p0);
                                arrayList.add(p61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = vsVar.r0;
                                arrayList.add(p61.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new ps(vsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (vsVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                vs vsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    vsVar2.getClass();
                    break;
                } else {
                    vsVar2.r0 = participantJoinedChats2;
                    vsVar2.X.N(true);
                    break;
                }
        }
    }
}
