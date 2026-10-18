package org.telegram.ui;

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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0703 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        a0.h hVar;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i12 = this.a;
        int i13 = 8;
        int i14 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i15 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                jr jrVar = (jr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar2 = jrVar.L;
                a0.h hVar3 = jrVar.M;
                int i16 = jrVar.e1;
                a0.h hVar4 = jrVar.K;
                int i17 = jrVar.O;
                ArrayList arrayList6 = jrVar.F;
                int i18 = 0;
                int i19 = 0;
                while (i19 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i19);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i19);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        i10 = i19;
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                    } else {
                        int i20 = i15;
                        if (i17 == i15) {
                            arrayList = arrayList5;
                            arrayList2 = arrayList4;
                            jrVar.getMessagesController().processLoadedAdminsResponse(jrVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList5;
                            arrayList2 = arrayList4;
                        }
                        jrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, z10);
                        jrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, z10);
                        long clientUserId = jrVar.getUserConfig().getClientUserId();
                        if (i16 != 0) {
                            ?? r12 = z10;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(r12).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i17 == 2) {
                            jrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = jrVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = jrVar.G;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i11 = 0;
                            while (i11 < size) {
                                int i21 = i19;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                long j10 = clientUserId;
                                if (channelParticipant.user_id == j10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11++;
                                i19 = i21;
                                clientUserId = j10;
                            }
                            i10 = i19;
                            int size2 = arrayList3.size() + i18;
                            if (i17 == 2) {
                                int size3 = arrayList6.size();
                                int i22 = 0;
                                while (i22 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i22);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i16 == i20 && peerId > 0 && UserObject.isDeleted(jrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList6.remove(i22);
                                            hVar4.l(peerId);
                                            i22--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList6.remove(i22);
                                        i22--;
                                        size3--;
                                    }
                                    i22++;
                                    i20 = 1;
                                }
                            }
                            if ((i17 != 0 || i17 == 3 || i17 == 2) && (chat = jrVar.r) != null && chat.megagroup) {
                                chatFull = jrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    jrVar.z0(arrayList3);
                                    i18 = size2;
                                }
                            }
                            if (i17 == 1) {
                                try {
                                    Collections.sort(arrayList6, new org.telegram.ui.ActionBar.i4(11));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            i18 = size2;
                        } else {
                            hVar4.b();
                        }
                        arrayList3 = arrayList6;
                        hVar = hVar4;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        i10 = i19;
                        int size22 = arrayList3.size() + i18;
                        if (i17 == 2) {
                        }
                        if (i17 != 0) {
                        }
                        chatFull = jrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            jrVar.z0(arrayList3);
                            i18 = size22;
                        }
                        if (i17 == 1) {
                        }
                        i18 = size22;
                    }
                    i19 = i10 + 1;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList;
                    i14 = 2;
                    z10 = false;
                    i15 = 1;
                }
                if (i17 != i14 || jrVar.k1 <= 0) {
                    fr frVar = jrVar.a;
                    jrVar.y0(frVar != null ? frVar.d.d1 : 0);
                    jrVar.Q = false;
                    jrVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = jrVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i17 != 0 || i18 > 5) ? 0 : 8);
                    }
                }
                jrVar.B0();
                fr frVar2 = jrVar.a;
                if (frVar2 != null) {
                    ai.u1 u1Var = jrVar.c;
                    u1Var.W1 = jrVar.B1;
                    u1Var.X1 = 0;
                    frVar2.l();
                    org.telegram.ui.Components.rx0 rx0Var = jrVar.b;
                    if (rx0Var != null && jrVar.a.d.d1 == 0 && jrVar.R) {
                        rx0Var.e(false, true);
                    }
                }
                jrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((ey) obj3).removeSelfFromStack();
                ((od) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                ey eyVar = (ey) obj3;
                int length = ((Object[]) obj).length;
                eyVar.s4((dy) obj2);
                cw cwVar = eyVar.z0;
                if (cwVar != null && cwVar.getVisibility() == 0) {
                    eyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                ey eyVar2 = ((dw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    c00.T(eyVar2, dialogFilter, null);
                    break;
                } else {
                    eyVar2.presentFragment(new nz(dialogFilter, null));
                    break;
                }
            case 4:
                qy qyVar = (qy) obj3;
                qyVar.getClass();
                qyVar.o((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList7 = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.b2 w02 = org.telegram.ui.Components.f5.w0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new ai.v3(10, externalActionActivity, tL_error));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 6:
                p00 p00Var = (p00) obj3;
                TLObject tLObject2 = (TLObject) obj;
                p00.r0((TLRPC.TL_error) obj2, p00Var, org.telegram.ui.Components.xc.a0(p00Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    p00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    nz nzVar = new nz(p00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    nzVar.y = new qz(p00Var, i15);
                    nzVar.x = new qz(p00Var, i14);
                    p00Var.presentFragment(nzVar);
                    AndroidUtilities.runOnUIThread(new nt(17, p00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                c00 c00Var = (c00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = c00Var.n;
                p00.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.xc(c00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    c00Var.dismiss();
                    n2Var.getMessagesController().loadRemoteFilters(true);
                    n2Var.presentFragment(new nz(c00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                i00 i00Var = (i00) obj3;
                h00 h00Var = (h00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.xc.a0(i00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(h00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((n10) obj3).e;
                if (b2Var2 != null) {
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                l60 l60Var = (l60) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                n60 n60Var = l60Var.I;
                hg.a2 a2Var = l60Var.f;
                if (l60Var.n) {
                    l60Var.h = null;
                    l60Var.d = arrayList8;
                    l60Var.e = arrayList9;
                    a2Var.f(arrayList8, null);
                    n60Var.q0(l60Var.H);
                    l60Var.l();
                    if (l60Var.n && !a2Var.e() && l60Var.h() == 0) {
                        n60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                l70 l70Var = (l70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!l70Var.M) {
                    l70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                p70 p70Var = (p70) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                if (p70Var.h) {
                    p70Var.d = arrayList10;
                    p70Var.e = arrayList11;
                    p70Var.l();
                    p70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                sn snVar = (sn) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                Pattern pattern = LaunchActivity.C1;
                if (tL_error2 == null) {
                    if (user != null && !UserObject.isUserSelf(user)) {
                        org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NoPaidMessagesTokenImported, UserObject.getFirstName(user)))).j();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.xc.a0(snVar).f0(tL_error2, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                b80 b80Var = (b80) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    b80Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.f5.w0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                b80 b80Var2 = (b80) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    b80Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.f5.w0(launchActivity2, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.f5.M(launchActivity2, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error3.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 16:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                Pattern pattern4 = LaunchActivity.C1;
                g6Var.d((File) obj, g6Var.c);
                AndroidUtilities.runOnUIThread(new l80((LaunchActivity) obj3, i13));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern5 = LaunchActivity.C1;
                launchActivity3.getClass();
                int i23 = iArr[0] - 1;
                iArr[0] = i23;
                if (i23 == 0) {
                    NotificationCenter.getInstance(launchActivity3.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity3.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern6 = LaunchActivity.C1;
                    launchActivity4.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity4.S0 = g6Var2;
                    launchActivity4.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity4.R0 = tL_wallPaper;
                    FileLoader.getInstance(g6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                TLRPC.User user2 = (TLRPC.User) obj2;
                Pattern pattern7 = LaunchActivity.C1;
                MessagesController.getInstance(((LaunchActivity) obj3).O).putUser(user2, true);
                ((o90) obj).run(user2);
                break;
            case 20:
                kb0 kb0Var = (kb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                kb0Var.c();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(kb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    gb0 gb0Var = new gb0(kb0Var, str2, 2);
                    if (!password.has_password) {
                        xf1 xf1Var = new xf1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        xf1Var.j0 = gb0Var;
                        kb0Var.u(xf1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        kb0Var.u(twoStepVerificationActivity, false);
                        gb0Var.run();
                        break;
                    }
                }
                break;
            case 21:
                hb0 hb0Var = (hb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    hb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    hb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.d2.m(user3, false, userFull2 != null && userFull2.video_calls_available, hb0Var.getParentActivity(), userFull2, hb0Var.getAccountInstance());
                break;
            case 22:
                pc0 pc0Var = (pc0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(pc0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                AndroidUtilities.runOnUIThread(new lq(pc0Var, viewGroup, gLSurfaceView, 23), 100L);
                break;
            case 23:
                pc0 pc0Var2 = (pc0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                pc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                pc0Var2.M = true;
                pc0Var2.finishFragment();
                break;
            case 24:
                pc0 pc0Var3 = (pc0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                pc0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                pc0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                pc0Var3.finishFragment();
                break;
            case 25:
                fg0 fg0Var = (fg0) obj3;
                fg0Var.getClass();
                fg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 26:
                org.telegram.ui.Components.ao aoVar = (org.telegram.ui.Components.ao) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                aoVar.getClass();
                editText.removeTextChangedListener(aoVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 27:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                fg0 fg0Var2 = ((od0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || fg0Var2.F != 3) {
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
                    fg0Var2.d0.run();
                    break;
                }
                break;
            case 28:
                pe0 pe0Var = (pe0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                fg0 fg0Var3 = pe0Var.O;
                pe0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    fg0Var3.k1(false, true);
                    if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error4.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error4.text.contains("LASTNAME_INVALID")) {
                                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error4.text);
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
                    pe0Var.postDelayed(new b80(19, pe0Var, tLObject9), 150L);
                    break;
                }
            default:
                pe0 pe0Var2 = (pe0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                pe0Var2.M = fileLocation;
                pe0Var2.N = ((TLRPC.PhotoSize) obj).location;
                pe0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", pe0Var2.f, null);
                break;
        }
    }
}
