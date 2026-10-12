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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ br(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0799 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        char c10;
        int i11;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i12;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.a;
        int i18 = 4;
        int i19 = 2;
        int i20 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i17) {
            case 0:
                yr yrVar = (yr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar2 = yrVar.L;
                a0.h hVar3 = yrVar.M;
                int i21 = yrVar.e1;
                a0.h hVar4 = yrVar.K;
                int i22 = yrVar.O;
                ArrayList arrayList6 = yrVar.F;
                int i23 = 0;
                int i24 = 0;
                while (i24 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i24);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i24);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                        i10 = i24;
                        c10 = 3;
                    } else {
                        if (i22 == i20) {
                            i11 = i20;
                            i10 = i24;
                            yrVar.getMessagesController().processLoadedAdminsResponse(yrVar.N, tL_channels_channelParticipants);
                        } else {
                            i10 = i24;
                            i11 = i20;
                        }
                        yrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        yrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = yrVar.getUserConfig().getClientUserId();
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
                            yrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = yrVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = yrVar.G;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList5;
                            i12 = 0;
                            while (i12 < size) {
                                ArrayList arrayList7 = arrayList4;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                long j10 = clientUserId;
                                if (channelParticipant.user_id == j10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i12++;
                                arrayList4 = arrayList7;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                                clientUserId = j10;
                            }
                            arrayList2 = arrayList4;
                            int size2 = arrayList3.size() + i23;
                            if (i22 == 2) {
                                int size3 = arrayList6.size();
                                int i26 = 0;
                                while (i26 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i26);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i21 == i11 && peerId > 0 && UserObject.isDeleted(yrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList6.remove(i26);
                                            hVar4.l(peerId);
                                            i26--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList6.remove(i26);
                                        i26--;
                                        size3--;
                                    }
                                    i26++;
                                    i11 = 1;
                                }
                            }
                            c10 = 3;
                            if ((i22 != 0 || i22 == 3 || i22 == 2) && (chat = yrVar.r) != null && chat.megagroup) {
                                chatFull = yrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    yrVar.z0(arrayList3);
                                    i23 = size2;
                                }
                            }
                            if (i22 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList6, new org.telegram.ui.ActionBar.l5(8));
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        i23 = size2;
                                        i24 = i10 + 1;
                                        arrayList5 = arrayList;
                                        arrayList4 = arrayList2;
                                        i19 = 2;
                                        i20 = 1;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                }
                                i23 = size2;
                            }
                            i23 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList5;
                        i12 = 0;
                        while (i12 < size) {
                        }
                        arrayList2 = arrayList4;
                        int size22 = arrayList3.size() + i23;
                        if (i22 == 2) {
                        }
                        c10 = 3;
                        if (i22 != 0) {
                        }
                        chatFull = yrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            yrVar.z0(arrayList3);
                            i23 = size22;
                        }
                        if (i22 == 1) {
                        }
                        i23 = size22;
                    }
                    i24 = i10 + 1;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    i19 = 2;
                    i20 = 1;
                }
                if (i22 != i19 || yrVar.k1 <= 0) {
                    ur urVar = yrVar.a;
                    yrVar.y0(urVar != null ? urVar.d.d1 : 0);
                    yrVar.Q = false;
                    yrVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = yrVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i22 != 0 || i23 > 5) ? 0 : 8);
                    }
                }
                yrVar.B0();
                ur urVar2 = yrVar.a;
                if (urVar2 != null) {
                    bi.o0 o0Var = yrVar.c;
                    o0Var.W1 = yrVar.B1;
                    o0Var.X1 = 0;
                    urVar2.l();
                    org.telegram.ui.Components.wx0 wx0Var = yrVar.b;
                    if (wx0Var != null && yrVar.a.d.d1 == 0 && yrVar.R) {
                        wx0Var.e(false, true);
                    }
                }
                yrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((yy) obj3).removeSelfFromStack();
                ((sd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) obj).finishFragment();
                break;
            case 2:
                yy yyVar = (yy) obj3;
                int length = ((Object[]) obj).length;
                yyVar.r4((xy) obj2);
                ww wwVar = yyVar.z0;
                if (wwVar != null && wwVar.getVisibility() == 0) {
                    yyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                yy yyVar2 = ((xw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    x00.T(yyVar2, dialogFilter, null);
                    break;
                } else {
                    yyVar2.presentFragment(new h00(dialogFilter, null));
                    break;
                }
            case 4:
                kz kzVar = (kz) obj3;
                kzVar.getClass();
                kzVar.o((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList8 = ExternalActionActivity.x;
                try {
                    a2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.a2 w02 = org.telegram.ui.Components.g5.w0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new fi.d0(8, externalActionActivity, tL_error));
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
                l10 l10Var = (l10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                l10.r0((TLRPC.TL_error) obj2, l10Var, org.telegram.ui.Components.zc.a0(l10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    l10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    h00 h00Var = new h00(l10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    h00Var.y = new k00(l10Var, i20);
                    h00Var.x = new k00(l10Var, i19);
                    l10Var.presentFragment(h00Var);
                    AndroidUtilities.runOnUIThread(new o00(i18, l10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                x00 x00Var = (x00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.m2 m2Var = x00Var.n;
                l10.r0((TLRPC.TL_error) obj2, m2Var, new org.telegram.ui.Components.zc(x00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    x00Var.dismiss();
                    m2Var.getMessagesController().loadRemoteFilters(true);
                    m2Var.presentFragment(new h00(x00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                e10 e10Var = (e10) obj3;
                d10 d10Var = (d10) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.zc.a0(e10Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(d10Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((i20) obj3).e;
                if (a2Var2 != null) {
                    try {
                        a2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                h70 h70Var = (h70) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                j70 j70Var = h70Var.I;
                hg.a2 a2Var3 = h70Var.f;
                if (h70Var.n) {
                    h70Var.h = null;
                    h70Var.d = arrayList9;
                    h70Var.e = arrayList10;
                    a2Var3.f(arrayList9, null);
                    j70Var.q0(h70Var.H);
                    h70Var.l();
                    if (h70Var.n && !a2Var3.e() && h70Var.h() == 0) {
                        j70Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                h80 h80Var = (h80) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!h80Var.M) {
                    h80Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                l80 l80Var = (l80) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (l80Var.h) {
                    l80Var.d = arrayList11;
                    l80Var.e = arrayList12;
                    l80Var.l();
                    l80Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(((LaunchActivity) obj3).O).putUser(user, true);
                ((ja0) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                o00 o00Var = (o00) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    o00Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.g5.w0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                o00 o00Var2 = (o00) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    o00Var2.run();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.g5.w0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                f6Var.d((File) obj, f6Var.c);
                AndroidUtilities.runOnUIThread(new k90((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.B1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.S0 = f6Var2;
                    launchActivity3.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.R0 = tL_wallPaper;
                    FileLoader.getInstance(f6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.B1;
                launchActivity4.getClass();
                int i27 = iArr[0] - 1;
                iArr[0] = i27;
                if (i27 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                jc0 jc0Var = (jc0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                jc0Var.c();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(jc0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    ec0 ec0Var = new ec0(jc0Var, str2, 2);
                    if (!password.has_password) {
                        oh1 oh1Var = new oh1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        oh1Var.j0 = ec0Var;
                        jc0Var.u(oh1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        jc0Var.u(twoStepVerificationActivity, false);
                        ec0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                gc0 gc0Var = (gc0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    gc0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    gc0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, gc0Var.getParentActivity(), userFull, gc0Var.getAccountInstance());
                break;
            case 21:
                nd0 nd0Var = (nd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(nd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new br(nd0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                nd0 nd0Var2 = (nd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                nd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                nd0Var2.M = true;
                nd0Var2.finishFragment();
                break;
            case 23:
                nd0 nd0Var3 = (nd0) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                nd0Var3.getClass();
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                nd0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                nd0Var3.finishFragment();
                break;
            case 24:
                bh0 bh0Var = (bh0) obj3;
                bh0Var.getClass();
                bh0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                eoVar.getClass();
                editText.removeTextChangedListener(eoVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                bh0 bh0Var2 = ((le0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || bh0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            bh0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        bh0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    bh0Var2.finishFragment();
                    bh0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                mf0 mf0Var = (mf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                bh0 bh0Var3 = mf0Var.O;
                mf0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    bh0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                mf0Var.c(true);
                                bh0Var3.u1(0, true, null, true);
                                bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        bh0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    mf0Var.o();
                    bh0Var3.v1(false, true);
                    mf0Var.postDelayed(new wc0(6, mf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                mf0 mf0Var2 = (mf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                mf0Var2.M = fileLocation;
                mf0Var2.N = ((TLRPC.PhotoSize) obj).location;
                mf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", mf0Var2.f, null);
                break;
            default:
                eg0 eg0Var = (eg0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i28 = eg0Var.f0;
                bh0 bh0Var4 = eg0Var.s0;
                eg0Var.z(false);
                eg0Var.d0 = false;
                if (tL_error4 != null) {
                    eg0Var.e0 = tL_error4.text;
                    if ((i28 == 3 && ((i16 = eg0Var.g0) == 4 || i16 == 2 || i16 == 17 || i16 == 16)) || ((i28 == 2 && ((i14 = eg0Var.g0) == 4 || i14 == 3)) || (i28 == 4 && ((i13 = eg0Var.g0) == 2 || i13 == 17 || i13 == 16)))) {
                        eg0Var.t();
                    }
                    if (i28 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(eg0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(eg0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(eg0Var, NotificationCenter.didReceiveCall);
                    }
                    eg0Var.c0 = true;
                    if (i28 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.m2) bh0Var4).currentAccount;
                        org.telegram.ui.Components.g5.e0(i15, tL_error4, bh0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            eg0Var.c(true);
                            bh0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        eg0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = bh0Var4.getParentActivity();
                    if (parentActivity != null) {
                        eg0Var.q(new wc0(9, eg0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
