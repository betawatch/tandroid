package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0756, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r15.getMessagesController().getUser(java.lang.Long.valueOf(r10))) != false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a0.h hVar;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        a0.h hVar2;
        ArrayList arrayList3;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i12;
        int i13;
        a0.h hVar3;
        TLRPC.UserFull userFull;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.a;
        int i19 = 2;
        int i20 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i18) {
            case 0:
                lr lrVar = (lr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar4 = lrVar.H;
                a0.h hVar5 = lrVar.I;
                int i21 = lrVar.a1;
                a0.h hVar6 = lrVar.G;
                int i22 = lrVar.K;
                ArrayList arrayList6 = lrVar.B;
                int i23 = 0;
                int i24 = 0;
                while (i24 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i24);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i24);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        hVar = hVar4;
                        arrayList = arrayList6;
                        i10 = i24;
                    } else {
                        if (i22 == i20) {
                            arrayList2 = arrayList6;
                            lrVar.getMessagesController().processLoadedAdminsResponse(lrVar.J, tL_channels_channelParticipants);
                        } else {
                            arrayList2 = arrayList6;
                        }
                        lrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        lrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = lrVar.getUserConfig().getClientUserId();
                        if (i21 != 0) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i25).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i25);
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                        }
                        if (i22 == 2) {
                            lrVar.g1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = lrVar.D;
                                hVar2 = hVar5;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = lrVar.C;
                                hVar2 = hVar4;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i11 = 0;
                            while (i11 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                int i26 = i11;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar2.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11 = i26 + 1;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            int size2 = arrayList3.size() + i23;
                            if (i22 == 2) {
                                int size3 = arrayList2.size();
                                int i27 = 0;
                                while (i27 < size3) {
                                    ArrayList arrayList7 = arrayList2;
                                    TLObject tLObject = (TLObject) arrayList7.get(i27);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        i12 = i24;
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar5.f(peerId) == null && hVar4.f(peerId) == null) {
                                            hVar3 = hVar4;
                                            if (i21 == 1 && peerId > 0) {
                                                i13 = size3;
                                                break;
                                            } else {
                                                i13 = size3;
                                            }
                                            size3 = i13;
                                        } else {
                                            i13 = size3;
                                            hVar3 = hVar4;
                                        }
                                        arrayList7.remove(i27);
                                        hVar6.l(peerId);
                                        i27--;
                                        size3 = i13 - 1;
                                    } else {
                                        arrayList7.remove(i27);
                                        i27--;
                                        size3--;
                                        hVar3 = hVar4;
                                        i12 = i24;
                                    }
                                    i27++;
                                    i24 = i12;
                                    hVar4 = hVar3;
                                    arrayList2 = arrayList7;
                                }
                            }
                            i10 = i24;
                            arrayList = arrayList2;
                            hVar = hVar4;
                            if ((i22 != 0 || i22 == 3 || i22 == 2) && (chat = lrVar.r) != null && chat.megagroup) {
                                chatFull = lrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    lrVar.z0(arrayList3);
                                    i23 = size2;
                                }
                            }
                            if (i22 == 1) {
                                try {
                                    Collections.sort(arrayList, new k9.a(18));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                            i23 = size2;
                        } else {
                            hVar6.b();
                        }
                        hVar2 = hVar6;
                        arrayList3 = arrayList2;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        int size22 = arrayList3.size() + i23;
                        if (i22 == 2) {
                        }
                        i10 = i24;
                        arrayList = arrayList2;
                        hVar = hVar4;
                        if (i22 != 0) {
                        }
                        chatFull = lrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            lrVar.z0(arrayList3);
                            i23 = size22;
                        }
                        if (i22 == 1) {
                        }
                        i23 = size22;
                    }
                    i24 = i10 + 1;
                    arrayList6 = arrayList;
                    hVar4 = hVar;
                    i20 = 1;
                }
                if (i22 != 2 || lrVar.g1 <= 0) {
                    hr hrVar = lrVar.a;
                    lrVar.y0(hrVar != null ? hrVar.d.Z0 : 0);
                    lrVar.M = false;
                    lrVar.N = true;
                    org.telegram.ui.ActionBar.v0 v0Var = lrVar.f;
                    if (v0Var != null) {
                        v0Var.setVisibility((i22 != 0 || i23 > 5) ? 0 : 8);
                    }
                }
                lrVar.B0();
                hr hrVar2 = lrVar.a;
                if (hrVar2 != null) {
                    hh.f1 f1Var = lrVar.c;
                    f1Var.U1 = lrVar.x1;
                    f1Var.V1 = 0;
                    hrVar2.l();
                    org.telegram.ui.Components.iw0 iw0Var = lrVar.b;
                    if (iw0Var != null && lrVar.a.d.Z0 == 0 && lrVar.N) {
                        iw0Var.e(false, true);
                    }
                }
                lrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((gy) obj3).removeSelfFromStack();
                ((id) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                gy gyVar = (gy) obj3;
                int length = ((Object[]) obj).length;
                gyVar.u4((fy) obj2);
                fw fwVar = gyVar.v0;
                if (fwVar != null && fwVar.getVisibility() == 0) {
                    gyVar.v0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                gy gyVar2 = ((gw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    d00.S(gyVar2, dialogFilter, null);
                    break;
                } else {
                    gyVar2.presentFragment(new oz(dialogFilter, null));
                    break;
                }
            case 4:
                sy syVar = (sy) obj3;
                syVar.getClass();
                syVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList8 = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.b2 x02 = org.telegram.ui.Components.y4.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new cg.g(9, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else {
                        if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                            externalActionActivity.setResult(0);
                            externalActionActivity.finish();
                        }
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 6:
                q00 q00Var = (q00) obj3;
                TLObject tLObject2 = (TLObject) obj;
                q00.r0((TLRPC.TL_error) obj2, q00Var, org.telegram.ui.Components.mc.a0(q00Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    q00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    oz ozVar = new oz(q00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    ozVar.y = new rz(q00Var, i20);
                    ozVar.x = new rz(q00Var, i19);
                    q00Var.presentFragment(ozVar);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(24, q00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                d00 d00Var = (d00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = d00Var.n;
                q00.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.mc(d00Var.V, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    d00Var.dismiss();
                    n2Var.getMessagesController().loadRemoteFilters(true);
                    n2Var.presentFragment(new oz(d00Var.T, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                j00 j00Var = (j00) obj3;
                i00 i00Var = (i00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.mc.a0(j00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(i00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((o10) obj3).e;
                if (b2Var2 != null) {
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                m60 m60Var = (m60) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                o60 o60Var = m60Var.E;
                pf.j1 j1Var = m60Var.f;
                if (m60Var.n) {
                    m60Var.h = null;
                    m60Var.d = arrayList9;
                    m60Var.e = arrayList10;
                    j1Var.f(arrayList9, null);
                    o60Var.q0(m60Var.D);
                    m60Var.l();
                    if (m60Var.n && !j1Var.e() && m60Var.h() == 0) {
                        o60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                l70 l70Var = (l70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!l70Var.I) {
                    l70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                p70 p70Var = (p70) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (p70Var.h) {
                    p70Var.d = arrayList11;
                    p70Var.e = arrayList12;
                    p70Var.l();
                    p70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.x1;
                MessagesController.getInstance(((LaunchActivity) obj3).K).putUser(user, true);
                ((o90) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                a30 a30Var = (a30) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    a30Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.y4.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                a30 a30Var2 = (a30) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    a30Var2.run();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.y4.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                Pattern pattern4 = LaunchActivity.x1;
                f6Var.d((File) obj, f6Var.c);
                AndroidUtilities.runOnUIThread(new p80((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.x1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.O0 = f6Var2;
                    launchActivity3.M0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.N0 = tL_wallPaper;
                    FileLoader.getInstance(f6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.x1;
                launchActivity4.getClass();
                int i28 = iArr[0] - 1;
                iArr[0] = i28;
                if (i28 == 0) {
                    NotificationCenter.getInstance(launchActivity4.K).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                ob0 ob0Var = (ob0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                ob0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.y4.x0(ob0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    jb0 jb0Var = new jb0(ob0Var, str2, 0);
                    if (!password.has_password) {
                        zf1 zf1Var = new zf1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        zf1Var.f0 = jb0Var;
                        ob0Var.n(zf1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.E = password;
                        twoStepVerificationActivity.F = false;
                        ob0Var.n(twoStepVerificationActivity, false);
                        jb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                lb0 lb0Var = (lb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    lb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    lb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.e2.n(user2, false, userFull != null && userFull.video_calls_available, lb0Var.getParentActivity(), userFull, lb0Var.getAccountInstance());
                break;
            case 21:
                tc0 tc0Var = (tc0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(tc0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new lq(tc0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                tc0 tc0Var2 = (tc0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                tc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                tc0Var2.I = true;
                tc0Var2.finishFragment();
                break;
            case 23:
                tc0 tc0Var3 = (tc0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                tc0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                tc0Var3.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                tc0Var3.finishFragment();
                break;
            case 24:
                ig0 ig0Var = (ig0) obj3;
                ig0Var.getClass();
                ig0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                gh.n4 n4Var = (gh.n4) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                n4Var.getClass();
                editText.removeTextChangedListener(n4Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                ig0 ig0Var2 = ((sd0) obj3).S;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || ig0Var2.B != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            ig0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        ig0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    ig0Var2.finishFragment();
                    ig0Var2.Z.run();
                    break;
                }
                break;
            case 27:
                te0 te0Var = (te0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ig0 ig0Var3 = te0Var.K;
                te0Var.D = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    ig0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                te0Var.c(true);
                                ig0Var3.u1(0, true, null, true);
                                ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    te0Var.o();
                    ig0Var3.v1(false, true);
                    te0Var.postDelayed(new a30(26, te0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                te0 te0Var2 = (te0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                te0Var2.I = fileLocation;
                te0Var2.J = ((TLRPC.PhotoSize) obj).location;
                te0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", te0Var2.f, null);
                break;
            default:
                mf0 mf0Var = (mf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i29 = mf0Var.b0;
                ig0 ig0Var4 = mf0Var.o0;
                mf0Var.z(false);
                mf0Var.W = false;
                if (tL_error4 != null) {
                    mf0Var.a0 = tL_error4.text;
                    if ((i29 == 3 && ((i17 = mf0Var.c0) == 4 || i17 == 2 || i17 == 17 || i17 == 16)) || ((i29 == 2 && ((i15 = mf0Var.c0) == 4 || i15 == 3)) || (i29 == 4 && ((i14 = mf0Var.c0) == 2 || i14 == 17 || i14 == 16)))) {
                        mf0Var.t();
                    }
                    if (i29 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                    }
                    mf0Var.V = true;
                    if (i29 != 3) {
                        i16 = ((org.telegram.ui.ActionBar.n2) ig0Var4).currentAccount;
                        org.telegram.ui.Components.y4.f0(i16, tL_error4, ig0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            mf0Var.c(true);
                            ig0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        mf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = ig0Var4.getParentActivity();
                    if (parentActivity != null) {
                        mf0Var.q(new a30(29, mf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
