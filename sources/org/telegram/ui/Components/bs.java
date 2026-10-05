package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ bs(is isVar, int i10) {
        this.a = i10;
        this.b = isVar;
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
                w61 w61Var = (w61) obj2;
                is isVar = this.b;
                hs hsVar = isVar.j0;
                hs hsVar2 = isVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = isVar.v0;
                if (isVar.b0 != null) {
                    arrayList.add(h61.D(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.n(R.string.DeleteAdditionalActions, arrayList);
                    isVar.R(arrayList, isVar.i0);
                    if (isVar.z0) {
                        hsVar.g();
                        int i10 = (isVar.C0 ? 1 : 0) + (isVar.D0 ? 1 : 0);
                        String str = hsVar.b;
                        Locale locale = Locale.US;
                        h61 A = h61.A(i10 + "/2", str, 100);
                        A.L(i10 == 2);
                        A.f = isVar.B0;
                        A.D = new org.telegram.ui.qf(29, isVar, w61Var);
                        arrayList.add(A);
                        if (!isVar.B0) {
                            h61 z11 = h61.z(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            z11.L(isVar.C0);
                            z11.i = 1;
                            arrayList.add(z11);
                            h61 z12 = h61.z(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            z12.L(isVar.D0);
                            z12.i = 1;
                            arrayList.add(z12);
                        }
                    } else {
                        isVar.R(arrayList, hsVar);
                        isVar.R(arrayList, isVar.k0);
                    }
                    isVar.R(arrayList, hsVar2);
                    if (!isVar.h0 && hsVar2.c()) {
                        if (isVar.g0) {
                            arrayList.add(h61.C(null));
                            if (hsVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", hsVar2.i, new Object[0]);
                                h61 h61Var = new h61(42);
                                h61Var.d = 0;
                                h61Var.o = formatPluralString;
                                arrayList.add(h61Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                h61 h61Var2 = new h61(42);
                                h61Var2.d = 0;
                                h61Var2.o = string;
                                arrayList.add(h61Var2);
                            }
                            h61 F = h61.F(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            h61 o9 = h61.o(1, string2, i11 + "/10");
                            o9.L(i11 > 0);
                            o9.t = isVar.Q();
                            o9.f = isVar.y0;
                            o9.D = new org.telegram.ui.Cells.ua(isVar, i11, w61Var, 6);
                            arrayList.add(o9);
                            if (!isVar.y0) {
                                h61 z13 = h61.z(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                z13.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z13.t = tL_chatBannedRights2.send_photos;
                                z13.i = 1;
                                arrayList.add(z13);
                                h61 z14 = h61.z(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                z14.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z14.t = tL_chatBannedRights2.send_videos;
                                z14.i = 1;
                                arrayList.add(z14);
                                h61 z15 = h61.z(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                z15.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z15.t = tL_chatBannedRights2.send_docs;
                                z15.i = 1;
                                arrayList.add(z15);
                                h61 z16 = h61.z(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                z16.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z16.t = tL_chatBannedRights2.send_audios;
                                z16.i = 1;
                                arrayList.add(z16);
                                h61 z17 = h61.z(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                z17.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z17.t = tL_chatBannedRights2.send_voices;
                                z17.i = 1;
                                arrayList.add(z17);
                                h61 z18 = h61.z(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                z18.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z18.t = tL_chatBannedRights2.send_roundvideos;
                                z18.i = 1;
                                arrayList.add(z18);
                                h61 z19 = h61.z(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                z19.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z19.t = tL_chatBannedRights2.send_stickers;
                                z19.i = 1;
                                arrayList.add(z19);
                                h61 z20 = h61.z(13, LocaleController.getString(R.string.SendMediaPolls));
                                z20.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z20.t = tL_chatBannedRights2.send_polls;
                                z20.i = 1;
                                arrayList.add(z20);
                                h61 z21 = h61.z(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                z21.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z21.t = tL_chatBannedRights2.embed_links;
                                z21.i = 1;
                                arrayList.add(z21);
                                h61 z22 = h61.z(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                z22.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z22.t = tL_chatBannedRights2.send_reactions;
                                z22.i = 1;
                                arrayList.add(z22);
                            }
                            h61 F2 = h61.F(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            h61 F3 = h61.F(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            h61 F4 = h61.F(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (isVar.a0) {
                                h61 F5 = h61.F(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (isVar.o0) {
                            String string3 = LocaleController.getString(!hsVar2.b() ? isVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : isVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            h61 h61Var3 = new h61(38);
                            h61Var3.d = 1;
                            h61Var3.o = string3;
                            h61Var3.f = !isVar.g0;
                            h61Var3.q = true;
                            arrayList.add(h61Var3);
                            z10 = false;
                            if (isVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(h61.D(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                h61 h61Var4 = new h61(39);
                                h61Var4.d = 103;
                                h61Var4.l = string4;
                                h61Var4.z = 0;
                                h61Var4.L(isVar.p0);
                                arrayList.add(h61Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = isVar.r0;
                                arrayList.add(h61.B(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new cs(isVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (isVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                is isVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    isVar2.getClass();
                    break;
                } else {
                    isVar2.r0 = participantJoinedChats2;
                    isVar2.X.N(true);
                    break;
                }
        }
    }
}
