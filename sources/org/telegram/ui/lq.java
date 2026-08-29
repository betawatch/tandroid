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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0747, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r5.getMessagesController().getUser(java.lang.Long.valueOf(r11))) != false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0788 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i12;
        TLRPC.UserFull userFull;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.a;
        int i18 = 7;
        int i19 = 2;
        int i20 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i17) {
            case 0:
                jr jrVar = (jr) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                a0.h hVar2 = jrVar.H;
                a0.h hVar3 = jrVar.I;
                int i21 = jrVar.a1;
                a0.h hVar4 = jrVar.G;
                int i22 = jrVar.K;
                ArrayList arrayList4 = jrVar.B;
                int i23 = 0;
                int i24 = 0;
                while (i24 < arrayList2.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList2.get(i24);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList3.get(i24);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        i10 = i24;
                    } else {
                        if (i22 == i20) {
                            i10 = i24;
                            jrVar.getMessagesController().processLoadedAdminsResponse(jrVar.J, tL_channels_channelParticipants);
                        } else {
                            i10 = i24;
                        }
                        jrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        jrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = jrVar.getUserConfig().getClientUserId();
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
                            jrVar.g1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList = jrVar.D;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList = jrVar.C;
                                hVar = hVar2;
                            }
                            arrayList.clear();
                            arrayList.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i11 = 0;
                            while (i11 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                int i26 = i11;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11 = i26 + 1;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            int size2 = arrayList.size() + i23;
                            if (i22 == 2) {
                                int size3 = arrayList4.size();
                                int i27 = 0;
                                while (i27 < size3) {
                                    TLObject tLObject = (TLObject) arrayList4.get(i27);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) == null && hVar2.f(peerId) == null) {
                                            if (i21 == 1 && peerId > 0) {
                                                i12 = size3;
                                                break;
                                            } else {
                                                i12 = size3;
                                            }
                                            size3 = i12;
                                        } else {
                                            i12 = size3;
                                        }
                                        arrayList4.remove(i27);
                                        hVar4.l(peerId);
                                        i27--;
                                        size3 = i12 - 1;
                                    } else {
                                        arrayList4.remove(i27);
                                        i27--;
                                        size3--;
                                    }
                                    i27++;
                                }
                            }
                            if ((i22 != 0 || i22 == 3 || i22 == 2) && (chat = jrVar.r) != null && chat.megagroup) {
                                chatFull = jrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    jrVar.z0(arrayList);
                                    i23 = size2;
                                }
                            }
                            if (i22 == 1) {
                                try {
                                    Collections.sort(arrayList4, new lh.e4(18));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            i23 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList = arrayList4;
                        arrayList.clear();
                        arrayList.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        int size22 = arrayList.size() + i23;
                        if (i22 == 2) {
                        }
                        if (i22 != 0) {
                        }
                        chatFull = jrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            jrVar.z0(arrayList);
                            i23 = size22;
                        }
                        if (i22 == 1) {
                        }
                        i23 = size22;
                    }
                    i24 = i10 + 1;
                    i20 = 1;
                }
                if (i22 != 2 || jrVar.g1 <= 0) {
                    fr frVar = jrVar.a;
                    jrVar.y0(frVar != null ? frVar.d.Z0 : 0);
                    jrVar.M = false;
                    jrVar.N = true;
                    org.telegram.ui.ActionBar.w0 w0Var = jrVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i22 != 0 || i23 > 5) ? 0 : 8);
                    }
                }
                jrVar.B0();
                fr frVar2 = jrVar.a;
                if (frVar2 != null) {
                    jh.e1 e1Var = jrVar.c;
                    e1Var.U1 = jrVar.x1;
                    e1Var.V1 = 0;
                    frVar2.l();
                    org.telegram.ui.Components.qw0 qw0Var = jrVar.b;
                    if (qw0Var != null && jrVar.a.d.Z0 == 0 && jrVar.N) {
                        qw0Var.e(false, true);
                    }
                }
                jrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((fy) obj3).removeSelfFromStack();
                ((hd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) obj).finishFragment();
                break;
            case 2:
                fy fyVar = (fy) obj3;
                int length = ((Object[]) obj).length;
                fyVar.u4((ey) obj2);
                ew ewVar = fyVar.v0;
                if (ewVar != null && ewVar.getVisibility() == 0) {
                    fyVar.v0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                fy fyVar2 = ((fw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    c00.S(fyVar2, dialogFilter, null);
                    break;
                } else {
                    fyVar2.presentFragment(new nz(dialogFilter, null));
                    break;
                }
            case 4:
                ry ryVar = (ry) obj3;
                ryVar.getClass();
                ryVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList5 = ExternalActionActivity.x;
                try {
                    c2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.c2 x02 = org.telegram.ui.Components.c5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new eg.g(i18, externalActionActivity, tL_error));
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
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 6:
                p00 p00Var = (p00) obj3;
                TLObject tLObject2 = (TLObject) obj;
                p00.r0((TLRPC.TL_error) obj2, p00Var, org.telegram.ui.Components.tc.a0(p00Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    p00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    nz nzVar = new nz(p00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    nzVar.y = new qz(p00Var, i20);
                    nzVar.x = new qz(p00Var, i19);
                    p00Var.presentFragment(nzVar);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(21, p00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                c00 c00Var = (c00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.o2 o2Var = c00Var.n;
                p00.r0((TLRPC.TL_error) obj2, o2Var, new org.telegram.ui.Components.tc(c00Var.V, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    c00Var.dismiss();
                    o2Var.getMessagesController().loadRemoteFilters(true);
                    o2Var.presentFragment(new nz(c00Var.T, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                i00 i00Var = (i00) obj3;
                h00 h00Var = (h00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.tc.a0(i00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(h00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((n10) obj3).e;
                if (c2Var2 != null) {
                    try {
                        c2Var2.dismiss();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                k60 k60Var = (k60) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                m60 m60Var = k60Var.E;
                rf.k1 k1Var = k60Var.f;
                if (k60Var.n) {
                    k60Var.h = null;
                    k60Var.d = arrayList6;
                    k60Var.e = arrayList7;
                    k1Var.f(arrayList6, null);
                    m60Var.q0(k60Var.D);
                    k60Var.l();
                    if (k60Var.n && !k1Var.e() && k60Var.h() == 0) {
                        m60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                k70 k70Var = (k70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!k70Var.I) {
                    k70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                o70 o70Var = (o70) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                if (o70Var.h) {
                    o70Var.d = arrayList8;
                    o70Var.e = arrayList9;
                    o70Var.l();
                    o70Var.n.r.e(false, true);
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
                x60 x60Var = (x60) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    x60Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.c5.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                x60 x60Var2 = (x60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    x60Var2.run();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.c5.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                Pattern pattern4 = LaunchActivity.x1;
                f6Var.d((File) obj, f6Var.c);
                AndroidUtilities.runOnUIThread(new o80((LaunchActivity) obj3, i18));
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
                mb0 mb0Var = (mb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                mb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(mb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    hb0 hb0Var = new hb0(mb0Var, str2, 0);
                    if (!password.has_password) {
                        cg1 cg1Var = new cg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        cg1Var.f0 = hb0Var;
                        mb0Var.n(cg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.E = password;
                        twoStepVerificationActivity.F = false;
                        mb0Var.n(twoStepVerificationActivity, false);
                        hb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                jb0 jb0Var = (jb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    jb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    jb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.h2.n(user2, false, userFull != null && userFull.video_calls_available, jb0Var.getParentActivity(), userFull, jb0Var.getAccountInstance());
                break;
            case 21:
                rc0 rc0Var = (rc0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(rc0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new lq(rc0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                rc0 rc0Var2 = (rc0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                rc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                rc0Var2.I = true;
                rc0Var2.finishFragment();
                break;
            case 23:
                rc0 rc0Var3 = (rc0) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                rc0Var3.getClass();
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                rc0Var3.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                rc0Var3.finishFragment();
                break;
            case 24:
                fg0 fg0Var = (fg0) obj3;
                fg0Var.getClass();
                fg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                ag.c0 c0Var = (ag.c0) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                c0Var.getClass();
                editText.removeTextChangedListener(c0Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                fg0 fg0Var2 = ((pd0) obj3).S;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || fg0Var2.B != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            fg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        fg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    fg0Var2.finishFragment();
                    fg0Var2.Z.run();
                    break;
                }
                break;
            case 27:
                pe0 pe0Var = (pe0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                fg0 fg0Var3 = pe0Var.K;
                pe0Var.D = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    fg0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                pe0Var.c(true);
                                fg0Var3.u1(0, true, null, true);
                                fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    pe0Var.o();
                    fg0Var3.v1(false, true);
                    pe0Var.postDelayed(new x60(23, pe0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                pe0 pe0Var2 = (pe0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                pe0Var2.I = fileLocation;
                pe0Var2.J = ((TLRPC.PhotoSize) obj).location;
                pe0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", pe0Var2.f, null);
                break;
            default:
                if0 if0Var = (if0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i29 = if0Var.b0;
                fg0 fg0Var4 = if0Var.o0;
                if0Var.z(false);
                if0Var.W = false;
                if (tL_error4 != null) {
                    if0Var.a0 = tL_error4.text;
                    if ((i29 == 3 && ((i16 = if0Var.c0) == 4 || i16 == 2 || i16 == 17 || i16 == 16)) || ((i29 == 2 && ((i14 = if0Var.c0) == 4 || i14 == 3)) || (i29 == 4 && ((i13 = if0Var.c0) == 2 || i13 == 17 || i13 == 16)))) {
                        if0Var.t();
                    }
                    if (i29 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(if0Var, NotificationCenter.didReceiveCall);
                    }
                    if0Var.V = true;
                    if (i29 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.o2) fg0Var4).currentAccount;
                        org.telegram.ui.Components.c5.f0(i15, tL_error4, fg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            if0Var.c(true);
                            fg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        if0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = fg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        if0Var.q(new x60(26, if0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
