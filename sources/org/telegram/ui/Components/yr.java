package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ yr(fs fsVar, int i10) {
        this.a = i10;
        this.b = fsVar;
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
                l61 l61Var = (l61) obj2;
                fs fsVar = this.b;
                es esVar = fsVar.j0;
                es esVar2 = fsVar.l0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.w0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = fsVar.v0;
                if (fsVar.b0 != null) {
                    arrayList.add(x51.C(AndroidUtilities.dp(12.0f)));
                    com.google.android.gms.internal.vision.e2.n(R.string.DeleteAdditionalActions, arrayList);
                    fsVar.T(arrayList, fsVar.i0);
                    if (fsVar.z0) {
                        esVar.g();
                        int i10 = (fsVar.C0 ? 1 : 0) + (fsVar.D0 ? 1 : 0);
                        String str = esVar.b;
                        Locale locale = Locale.US;
                        x51 z11 = x51.z(i10 + "/2", str, 100);
                        z11.K(i10 == 2);
                        z11.f = fsVar.B0;
                        z11.D = new org.telegram.ui.sf(29, fsVar, l61Var);
                        arrayList.add(z11);
                        if (!fsVar.B0) {
                            x51 y3 = x51.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            y3.K(fsVar.C0);
                            y3.i = 1;
                            arrayList.add(y3);
                            x51 y10 = x51.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            y10.K(fsVar.D0);
                            y10.i = 1;
                            arrayList.add(y10);
                        }
                    } else {
                        fsVar.T(arrayList, esVar);
                        fsVar.T(arrayList, fsVar.k0);
                    }
                    fsVar.T(arrayList, esVar2);
                    if (!fsVar.h0 && esVar2.c()) {
                        if (fsVar.g0) {
                            arrayList.add(x51.B(null));
                            if (esVar2.b()) {
                                String formatPluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", esVar2.i, new Object[0]);
                                x51 x51Var = new x51(42);
                                x51Var.d = 0;
                                x51Var.o = formatPluralString;
                                arrayList.add(x51Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                x51 x51Var2 = new x51(42);
                                x51Var2.d = 0;
                                x51Var2.o = string;
                                arrayList.add(x51Var2);
                            }
                            x51 E = x51.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
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
                            x51 m10 = x51.m(1, string2, i11 + "/10");
                            m10.K(i11 > 0);
                            m10.t = fsVar.S();
                            m10.f = fsVar.y0;
                            m10.D = new org.telegram.ui.Cells.ua(fsVar, i11, l61Var, 6);
                            arrayList.add(m10);
                            if (!fsVar.y0) {
                                x51 y11 = x51.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                y11.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                y11.t = tL_chatBannedRights2.send_photos;
                                y11.i = 1;
                                arrayList.add(y11);
                                x51 y12 = x51.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                y12.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                y12.t = tL_chatBannedRights2.send_videos;
                                y12.i = 1;
                                arrayList.add(y12);
                                x51 y13 = x51.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                y13.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                y13.t = tL_chatBannedRights2.send_docs;
                                y13.i = 1;
                                arrayList.add(y13);
                                x51 y14 = x51.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                y14.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                y14.t = tL_chatBannedRights2.send_audios;
                                y14.i = 1;
                                arrayList.add(y14);
                                x51 y15 = x51.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                y15.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                y15.t = tL_chatBannedRights2.send_voices;
                                y15.i = 1;
                                arrayList.add(y15);
                                x51 y16 = x51.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                y16.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                y16.t = tL_chatBannedRights2.send_roundvideos;
                                y16.i = 1;
                                arrayList.add(y16);
                                x51 y17 = x51.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                y17.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                y17.t = tL_chatBannedRights2.send_stickers;
                                y17.i = 1;
                                arrayList.add(y17);
                                x51 y18 = x51.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                y18.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                y18.t = tL_chatBannedRights2.send_polls;
                                y18.i = 1;
                                arrayList.add(y18);
                                x51 y19 = x51.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                y19.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                y19.t = tL_chatBannedRights2.embed_links;
                                y19.i = 1;
                                arrayList.add(y19);
                                x51 y20 = x51.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                y20.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                y20.t = tL_chatBannedRights2.send_reactions;
                                y20.i = 1;
                                arrayList.add(y20);
                            }
                            x51 E2 = x51.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            E2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            E2.t = tL_chatBannedRights2.invite_users;
                            arrayList.add(E2);
                            x51 E3 = x51.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            E3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            E3.t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(E3);
                            x51 E4 = x51.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            E4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            E4.t = tL_chatBannedRights2.change_info;
                            arrayList.add(E4);
                            if (fsVar.a0) {
                                x51 E5 = x51.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                E5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                E5.t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(E5);
                            }
                        }
                        if (fsVar.o0) {
                            String string3 = LocaleController.getString(!esVar2.b() ? fsVar.g0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser : fsVar.g0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers);
                            x51 x51Var3 = new x51(38);
                            x51Var3.d = 1;
                            x51Var3.o = string3;
                            x51Var3.f = !fsVar.g0;
                            x51Var3.q = true;
                            arrayList.add(x51Var3);
                            z10 = false;
                            if (fsVar.q0 == 0) {
                                if (z10) {
                                    arrayList.add(x51.C(AndroidUtilities.dp(12.0f)));
                                }
                                String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                                x51 x51Var4 = new x51(39);
                                x51Var4.d = 103;
                                x51Var4.l = string4;
                                x51Var4.z = 0;
                                x51Var4.K(fsVar.p0);
                                arrayList.add(x51Var4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = fsVar.r0;
                                arrayList.add(x51.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new zr(fsVar, 1)), true)));
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (fsVar.q0 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                fs fsVar2 = this.b;
                if (participantJoinedChats2 == null) {
                    fsVar2.getClass();
                    break;
                } else {
                    fsVar2.r0 = participantJoinedChats2;
                    fsVar2.X.N(true);
                    break;
                }
        }
    }
}
