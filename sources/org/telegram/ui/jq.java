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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jq(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
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
        int i9;
        ArrayList arrayList2;
        a0.h hVar2;
        ArrayList arrayList3;
        int size;
        int i10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i11;
        int i12;
        a0.h hVar3;
        TLRPC.UserFull userFull;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.a;
        int i18 = 2;
        int i19 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i17) {
            case 0:
                jr jrVar = (jr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar4 = jrVar.H;
                a0.h hVar5 = jrVar.I;
                int i20 = jrVar.a1;
                a0.h hVar6 = jrVar.G;
                int i21 = jrVar.K;
                ArrayList arrayList6 = jrVar.B;
                int i22 = 0;
                int i23 = 0;
                while (i23 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i23);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i23);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        hVar = hVar4;
                        arrayList = arrayList6;
                        i9 = i23;
                    } else {
                        if (i21 == i19) {
                            arrayList2 = arrayList6;
                            jrVar.getMessagesController().processLoadedAdminsResponse(jrVar.J, tL_channels_channelParticipants);
                        } else {
                            arrayList2 = arrayList6;
                        }
                        jrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        jrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = jrVar.getUserConfig().getClientUserId();
                        if (i20 != 0) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i24).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i24);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                        if (i21 == 2) {
                            jrVar.g1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = jrVar.D;
                                hVar2 = hVar5;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = jrVar.C;
                                hVar2 = hVar4;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                int i25 = i10;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar2.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i10 = i25 + 1;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            int size2 = arrayList3.size() + i22;
                            if (i21 == 2) {
                                int size3 = arrayList2.size();
                                int i26 = 0;
                                while (i26 < size3) {
                                    ArrayList arrayList7 = arrayList2;
                                    TLObject tLObject = (TLObject) arrayList7.get(i26);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        i11 = i23;
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar5.f(peerId) == null && hVar4.f(peerId) == null) {
                                            hVar3 = hVar4;
                                            if (i20 == 1 && peerId > 0) {
                                                i12 = size3;
                                                break;
                                            } else {
                                                i12 = size3;
                                            }
                                            size3 = i12;
                                        } else {
                                            i12 = size3;
                                            hVar3 = hVar4;
                                        }
                                        arrayList7.remove(i26);
                                        hVar6.l(peerId);
                                        i26--;
                                        size3 = i12 - 1;
                                    } else {
                                        arrayList7.remove(i26);
                                        i26--;
                                        size3--;
                                        hVar3 = hVar4;
                                        i11 = i23;
                                    }
                                    i26++;
                                    i23 = i11;
                                    hVar4 = hVar3;
                                    arrayList2 = arrayList7;
                                }
                            }
                            i9 = i23;
                            arrayList = arrayList2;
                            hVar = hVar4;
                            if ((i21 != 0 || i21 == 3 || i21 == 2) && (chat = jrVar.r) != null && chat.megagroup) {
                                chatFull = jrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    jrVar.y0(arrayList3);
                                    i22 = size2;
                                }
                            }
                            if (i21 == 1) {
                                try {
                                    Collections.sort(arrayList, new j9.a(20));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            i22 = size2;
                        } else {
                            hVar6.b();
                        }
                        hVar2 = hVar6;
                        arrayList3 = arrayList2;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        int size22 = arrayList3.size() + i22;
                        if (i21 == 2) {
                        }
                        i9 = i23;
                        arrayList = arrayList2;
                        hVar = hVar4;
                        if (i21 != 0) {
                        }
                        chatFull = jrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            jrVar.y0(arrayList3);
                            i22 = size22;
                        }
                        if (i21 == 1) {
                        }
                        i22 = size22;
                    }
                    i23 = i9 + 1;
                    arrayList6 = arrayList;
                    hVar4 = hVar;
                    i19 = 1;
                }
                if (i21 != 2 || jrVar.g1 <= 0) {
                    er erVar = jrVar.a;
                    jrVar.x0(erVar != null ? erVar.d.Z0 : 0);
                    jrVar.M = false;
                    jrVar.N = true;
                    org.telegram.ui.ActionBar.w0 w0Var = jrVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i21 != 0 || i22 > 5) ? 0 : 8);
                    }
                }
                jrVar.A0();
                er erVar2 = jrVar.a;
                if (erVar2 != null) {
                    gh.f1 f1Var = jrVar.c;
                    f1Var.U1 = jrVar.x1;
                    f1Var.V1 = 0;
                    erVar2.l();
                    org.telegram.ui.Components.gw0 gw0Var = jrVar.b;
                    if (gw0Var != null && jrVar.a.d.Z0 == 0 && jrVar.N) {
                        gw0Var.e(false, true);
                    }
                }
                jrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((dy) obj3).removeSelfFromStack();
                ((id) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) obj).finishFragment();
                break;
            case 2:
                dy dyVar = (dy) obj3;
                int length = ((Object[]) obj).length;
                dyVar.u4((cy) obj2);
                cw cwVar = dyVar.v0;
                if (cwVar != null && cwVar.getVisibility() == 0) {
                    dyVar.v0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dy dyVar2 = ((dw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    a00.R(dyVar2, dialogFilter, null);
                    break;
                } else {
                    dyVar2.presentFragment(new lz(dialogFilter, null));
                    break;
                }
            case 4:
                py pyVar = (py) obj3;
                pyVar.getClass();
                pyVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList8 = ExternalActionActivity.x;
                try {
                    c2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.c2 x02 = org.telegram.ui.Components.y4.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new bg.j(10, externalActionActivity, tL_error));
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
            case 6:
                n00 n00Var = (n00) obj3;
                TLObject tLObject2 = (TLObject) obj;
                n00.q0((TLRPC.TL_error) obj2, n00Var, org.telegram.ui.Components.oc.a0(n00Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    n00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    lz lzVar = new lz(n00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    lzVar.y = new oz(n00Var, i19);
                    lzVar.x = new oz(n00Var, i18);
                    n00Var.presentFragment(lzVar);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(24, n00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                a00 a00Var = (a00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.o2 o2Var = a00Var.n;
                n00.q0((TLRPC.TL_error) obj2, o2Var, new org.telegram.ui.Components.oc(a00Var.V, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    a00Var.dismiss();
                    o2Var.getMessagesController().loadRemoteFilters(true);
                    o2Var.presentFragment(new lz(a00Var.T, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                g00 g00Var = (g00) obj3;
                f00 f00Var = (f00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.oc.a0(g00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(f00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((l10) obj3).e;
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
                i60 i60Var = (i60) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                k60 k60Var = i60Var.E;
                of.v1 v1Var = i60Var.f;
                if (i60Var.n) {
                    i60Var.h = null;
                    i60Var.d = arrayList9;
                    i60Var.e = arrayList10;
                    v1Var.f(arrayList9, null);
                    k60Var.p0(i60Var.D);
                    i60Var.l();
                    if (i60Var.n && !v1Var.e() && i60Var.h() == 0) {
                        k60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                i70 i70Var = (i70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!i70Var.I) {
                    i70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                m70 m70Var = (m70) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (m70Var.h) {
                    m70Var.d = arrayList11;
                    m70Var.e = arrayList12;
                    m70Var.l();
                    m70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.x1;
                MessagesController.getInstance(((LaunchActivity) obj3).K).putUser(user, true);
                ((k90) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                x20 x20Var = (x20) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    x20Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.y4.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                x20 x20Var2 = (x20) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    x20Var2.run();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.y4.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Pattern pattern4 = LaunchActivity.x1;
                e6Var.d((File) obj, e6Var.c);
                AndroidUtilities.runOnUIThread(new l80((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.x1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.O0 = e6Var2;
                    launchActivity3.M0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.N0 = tL_wallPaper;
                    FileLoader.getInstance(e6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.x1;
                launchActivity4.getClass();
                int i27 = iArr[0] - 1;
                iArr[0] = i27;
                if (i27 == 0) {
                    NotificationCenter.getInstance(launchActivity4.K).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                kb0 kb0Var = (kb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                kb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.h0(password, false)) {
                        org.telegram.ui.Components.y4.x0(kb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    fb0 fb0Var = new fb0(kb0Var, str2, 0);
                    if (!password.has_password) {
                        ag1 ag1Var = new ag1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        ag1Var.f0 = fb0Var;
                        kb0Var.n(ag1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.E = password;
                        twoStepVerificationActivity.F = false;
                        kb0Var.n(twoStepVerificationActivity, false);
                        fb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                hb0 hb0Var = (hb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    hb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    hb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.e2.n(user2, false, userFull != null && userFull.video_calls_available, hb0Var.getParentActivity(), userFull, hb0Var.getAccountInstance());
                break;
            case 21:
                pc0 pc0Var = (pc0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(pc0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new jq(pc0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                pc0 pc0Var2 = (pc0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                pc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                pc0Var2.I = true;
                pc0Var2.finishFragment();
                break;
            case 23:
                pc0 pc0Var3 = (pc0) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                pc0Var3.getClass();
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                pc0Var3.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                pc0Var3.finishFragment();
                break;
            case 24:
                fg0 fg0Var = (fg0) obj3;
                fg0Var.getClass();
                fg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                fh.t4 t4Var = (fh.t4) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                t4Var.getClass();
                editText.removeTextChangedListener(t4Var);
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
                qe0 qe0Var = (qe0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                fg0 fg0Var3 = qe0Var.K;
                qe0Var.D = false;
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
                                qe0Var.c(true);
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
                    qe0Var.o();
                    fg0Var3.v1(false, true);
                    qe0Var.postDelayed(new x20(26, qe0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                qe0 qe0Var2 = (qe0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                qe0Var2.I = fileLocation;
                qe0Var2.J = ((TLRPC.PhotoSize) obj).location;
                qe0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", qe0Var2.f, null);
                break;
            default:
                jf0 jf0Var = (jf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i28 = jf0Var.b0;
                fg0 fg0Var4 = jf0Var.o0;
                jf0Var.z(false);
                jf0Var.W = false;
                if (tL_error4 != null) {
                    jf0Var.a0 = tL_error4.text;
                    if ((i28 == 3 && ((i16 = jf0Var.c0) == 4 || i16 == 2 || i16 == 17 || i16 == 16)) || ((i28 == 2 && ((i14 = jf0Var.c0) == 4 || i14 == 3)) || (i28 == 4 && ((i13 = jf0Var.c0) == 2 || i13 == 17 || i13 == 16)))) {
                        jf0Var.t();
                    }
                    if (i28 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveCall);
                    }
                    jf0Var.V = true;
                    if (i28 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.o2) fg0Var4).currentAccount;
                        org.telegram.ui.Components.y4.f0(i15, tL_error4, fg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            jf0Var.c(true);
                            fg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        jf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = fg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        jf0Var.q(new x20(29, jf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
