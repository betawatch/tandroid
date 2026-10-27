package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs b;

    public /* synthetic */ ks(rs rsVar, int i10) {
        this.a = i10;
        this.b = rsVar;
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
                k71 k71Var = (k71) obj2;
                rs rsVar = this.b;
                qs qsVar = rsVar.j0;
                qs qsVar2 = rsVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rsVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rsVar.v0;
                if (rsVar.b0 != null) {
                    arrayList.add(u61.D(AndroidUtilities.dp(12.0f)));
                    ic.a.p(R.string.DeleteAdditionalActions, arrayList);
                    rsVar.T(arrayList, rsVar.i0);
                    if (rsVar.z0) {
                        qsVar.g();
                        int i10 = (rsVar.C0 ? 1 : 0) + (rsVar.D0 ? 1 : 0);
                        String str = qsVar.b;
                        Locale locale = Locale.US;
                        u61 A = u61.A(i10 + "/2", str, 100);
                        A.L(i10 == 2);
                        A.f = rsVar.B0;
                        A.D = new ga(11, rsVar, k71Var);
                        arrayList.add(A);
                        if (!rsVar.B0) {
                            u61 z10 = u61.z(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            z10.L(rsVar.C0);
                            z10.i = 1;
                            arrayList.add(z10);
                            u61 z11 = u61.z(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            z11.L(rsVar.D0);
                            z11.i = 1;
                            arrayList.add(z11);
                        }
                    } else {
                        rsVar.T(arrayList, qsVar);
                        rsVar.T(arrayList, rsVar.k0);
                    }
                    rsVar.T(arrayList, qsVar2);
                    if (!rsVar.h0 && qsVar2.c()) {
                        if (rsVar.g0) {
                            arrayList.add(u61.C(null));
                            if (qsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", qsVar2.i, new Object[0]);
                                u61 u61Var = new u61(42);
                                u61Var.d = 0;
                                u61Var.o = formatPluralString;
                                arrayList.add(u61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                u61 u61Var2 = new u61(42);
                                u61Var2.d = 0;
                                u61Var2.o = string;
                                arrayList.add(u61Var2);
                            }
                            u61 F = u61.F(0, LocaleController.getString(R.string.UserRestrictionsSend));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.t = tL_chatBannedRights2.send_plain;
                            arrayList.add(F);
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
                            u61 o10 = u61.o(1, string2, i11 + "/10");
                            o10.L(i11 > 0);
                            o10.t = rsVar.S();
                            o10.f = rsVar.y0;
                            o10.D = new bi.pa(rsVar, i11, k71Var, 9);
                            arrayList.add(o10);
                            if (!rsVar.y0) {
                                u61 z12 = u61.z(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                z12.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z12.t = tL_chatBannedRights2.send_photos;
                                z12.i = 1;
                                arrayList.add(z12);
                                u61 z13 = u61.z(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                z13.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z13.t = tL_chatBannedRights2.send_videos;
                                z13.i = 1;
                                arrayList.add(z13);
                                u61 z14 = u61.z(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                z14.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z14.t = tL_chatBannedRights2.send_docs;
                                z14.i = 1;
                                arrayList.add(z14);
                                u61 z15 = u61.z(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                z15.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z15.t = tL_chatBannedRights2.send_audios;
                                z15.i = 1;
                                arrayList.add(z15);
                                u61 z16 = u61.z(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                z16.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z16.t = tL_chatBannedRights2.send_voices;
                                z16.i = 1;
                                arrayList.add(z16);
                                u61 z17 = u61.z(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                z17.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z17.t = tL_chatBannedRights2.send_roundvideos;
                                z17.i = 1;
                                arrayList.add(z17);
                                u61 z18 = u61.z(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                z18.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z18.t = tL_chatBannedRights2.send_stickers;
                                z18.i = 1;
                                arrayList.add(z18);
                                u61 z19 = u61.z(13, LocaleController.getString(R.string.SendMediaPolls));
                                z19.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z19.t = tL_chatBannedRights2.send_polls;
                                z19.i = 1;
                                arrayList.add(z19);
                                u61 z20 = u61.z(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                z20.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z20.t = tL_chatBannedRights2.embed_links;
                                z20.i = 1;
                                arrayList.add(z20);
                                u61 z21 = u61.z(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                z21.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z21.t = tL_chatBannedRights2.send_reactions;
                                z21.i = 1;
                                arrayList.add(z21);
                            }
                            u61 F2 = u61.F(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            u61 F3 = u61.F(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            u61 F4 = u61.F(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (rsVar.a0) {
                                u61 F5 = u61.F(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (rsVar.o0) {
                            String string3 = LocaleController.getString(!qsVar2.b() ? rsVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : rsVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            u61 u61Var3 = new u61(38);
                            u61Var3.d = 1;
                            u61Var3.o = string3;
                            u61Var3.f = !rsVar.g0;
                            u61Var3.q = true;
                            arrayList.add(u61Var3);
                            objArr = false;
                            if (rsVar.q0 == 0) {
                                if (objArr != false) {
                                    arrayList.add(u61.D(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                u61 u61Var4 = new u61(39);
                                u61Var4.d = 103;
                                u61Var4.l = string4;
                                u61Var4.z = 0;
                                u61Var4.L(rsVar.p0);
                                arrayList.add(u61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = rsVar.r0;
                                arrayList.add(u61.B(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new ls(rsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (rsVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                rs rsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    rsVar2.getClass();
                    break;
                } else {
                    rsVar2.r0 = participantJoinedChats2;
                    rsVar2.X.O(true);
                    break;
                }
        }
    }
}
