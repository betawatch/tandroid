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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0756, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r4.getMessagesController().getUser(java.lang.Long.valueOf(r11))) != false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a0.h hVar;
        ArrayList arrayList;
        int i10;
        char c10;
        ArrayList arrayList2;
        int i11;
        a0.h hVar2;
        ArrayList arrayList3;
        int size;
        int i12;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i13;
        int i14;
        a0.h hVar3;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.a;
        int i20 = 8;
        int i21 = 2;
        int i22 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i19) {
            case 0:
                yr yrVar = (yr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar4 = yrVar.L;
                a0.h hVar5 = yrVar.M;
                int i23 = yrVar.e1;
                a0.h hVar6 = yrVar.K;
                int i24 = yrVar.O;
                ArrayList arrayList6 = yrVar.F;
                int i25 = 0;
                int i26 = 0;
                while (i26 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i26);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i26);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        hVar = hVar4;
                        arrayList = arrayList6;
                        i10 = i26;
                        c10 = 3;
                    } else {
                        if (i24 == i22) {
                            i11 = i22;
                            arrayList2 = arrayList6;
                            yrVar.getMessagesController().processLoadedAdminsResponse(yrVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList2 = arrayList6;
                            i11 = i22;
                        }
                        yrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        yrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = yrVar.getUserConfig().getClientUserId();
                        if (i23 != 0) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i27).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i27);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                        if (i24 == 2) {
                            yrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = yrVar.H;
                                hVar2 = hVar5;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = yrVar.G;
                                hVar2 = hVar4;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i12 = 0;
                            while (i12 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                int i28 = i12;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar2.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i12 = i28 + 1;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            int size2 = arrayList3.size() + i25;
                            if (i24 == 2) {
                                int size3 = arrayList2.size();
                                int i29 = 0;
                                while (i29 < size3) {
                                    ArrayList arrayList7 = arrayList2;
                                    TLObject tLObject = (TLObject) arrayList7.get(i29);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        i13 = i26;
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar5.f(peerId) == null && hVar4.f(peerId) == null) {
                                            hVar3 = hVar4;
                                            if (i23 == i11 && peerId > 0) {
                                                i14 = size3;
                                                break;
                                            } else {
                                                i14 = size3;
                                            }
                                            size3 = i14;
                                        } else {
                                            i14 = size3;
                                            hVar3 = hVar4;
                                        }
                                        arrayList7.remove(i29);
                                        hVar6.l(peerId);
                                        i29--;
                                        size3 = i14 - 1;
                                    } else {
                                        arrayList7.remove(i29);
                                        i29--;
                                        size3--;
                                        hVar3 = hVar4;
                                        i13 = i26;
                                    }
                                    i29++;
                                    i26 = i13;
                                    hVar4 = hVar3;
                                    i11 = 1;
                                    arrayList2 = arrayList7;
                                }
                            }
                            i10 = i26;
                            arrayList = arrayList2;
                            hVar = hVar4;
                            c10 = 3;
                            if ((i24 != 0 || i24 == 3 || i24 == 2) && (chat = yrVar.r) != null && chat.megagroup) {
                                chatFull = yrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    yrVar.z0(arrayList3);
                                    i25 = size2;
                                }
                            }
                            if (i24 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        i25 = size2;
                                        i26 = i10 + 1;
                                        arrayList6 = arrayList;
                                        hVar4 = hVar;
                                        i21 = 2;
                                        i22 = 1;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                }
                                i25 = size2;
                            }
                            i25 = size2;
                        } else {
                            hVar6.b();
                        }
                        hVar2 = hVar6;
                        arrayList3 = arrayList2;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                        int size22 = arrayList3.size() + i25;
                        if (i24 == 2) {
                        }
                        i10 = i26;
                        arrayList = arrayList2;
                        hVar = hVar4;
                        c10 = 3;
                        if (i24 != 0) {
                        }
                        chatFull = yrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            yrVar.z0(arrayList3);
                            i25 = size22;
                        }
                        if (i24 == 1) {
                        }
                        i25 = size22;
                    }
                    i26 = i10 + 1;
                    arrayList6 = arrayList;
                    hVar4 = hVar;
                    i21 = 2;
                    i22 = 1;
                }
                if (i24 != i21 || yrVar.k1 <= 0) {
                    ur urVar = yrVar.a;
                    yrVar.y0(urVar != null ? urVar.d.d1 : 0);
                    yrVar.Q = false;
                    yrVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = yrVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i24 != 0 || i25 > 5) ? 0 : 8);
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
                yyVar.s4((xy) obj2);
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
                    w00.T(yyVar2, dialogFilter, null);
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
                            w02.setOnDismissListener(new fi.d0(i20, externalActionActivity, tL_error));
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
                break;
            case 6:
                k10 k10Var = (k10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                k10.r0((TLRPC.TL_error) obj2, k10Var, org.telegram.ui.Components.zc.a0(k10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    k10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    h00 h00Var = new h00(k10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    h00Var.y = new k00(k10Var, i22);
                    h00Var.x = new k00(k10Var, i21);
                    k10Var.presentFragment(h00Var);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(29, k10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                w00 w00Var = (w00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.m2 m2Var = w00Var.n;
                k10.r0((TLRPC.TL_error) obj2, m2Var, new org.telegram.ui.Components.zc(w00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    w00Var.dismiss();
                    m2Var.getMessagesController().loadRemoteFilters(true);
                    m2Var.presentFragment(new h00(w00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                d10 d10Var = (d10) obj3;
                c10 c10Var = (c10) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.zc.a0(d10Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(c10Var);
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
                d20 d20Var = (d20) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    d20Var.run();
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
                d20 d20Var2 = (d20) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    d20Var2.run();
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
                int i30 = iArr[0] - 1;
                iArr[0] = i30;
                if (i30 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                ic0 ic0Var = (ic0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                ic0Var.c();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ic0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    dc0 dc0Var = new dc0(ic0Var, str2, 2);
                    if (!password.has_password) {
                        oh1 oh1Var = new oh1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        oh1Var.j0 = dc0Var;
                        ic0Var.u(oh1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ic0Var.u(twoStepVerificationActivity, false);
                        dc0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                fc0 fc0Var = (fc0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    fc0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    fc0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, fc0Var.getParentActivity(), userFull, fc0Var.getAccountInstance());
                break;
            case 21:
                ld0 ld0Var = (ld0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(ld0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new br(ld0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                ld0 ld0Var2 = (ld0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                ld0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                ld0Var2.M = true;
                ld0Var2.finishFragment();
                break;
            case 23:
                ld0 ld0Var3 = (ld0) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                ld0Var3.getClass();
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                ld0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                ld0Var3.finishFragment();
                break;
            case 24:
                ah0 ah0Var = (ah0) obj3;
                ah0Var.getClass();
                ah0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
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
                ah0 ah0Var2 = ((je0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || ah0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            ah0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        ah0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    ah0Var2.finishFragment();
                    ah0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                lf0 lf0Var = (lf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ah0 ah0Var3 = lf0Var.O;
                lf0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    ah0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                lf0Var.c(true);
                                ah0Var3.u1(0, true, null, true);
                                ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        ah0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    lf0Var.o();
                    ah0Var3.v1(false, true);
                    lf0Var.postDelayed(new se0(i22, lf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                lf0 lf0Var2 = (lf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                lf0Var2.M = fileLocation;
                lf0Var2.N = ((TLRPC.PhotoSize) obj).location;
                lf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", lf0Var2.f, null);
                break;
            default:
                dg0 dg0Var = (dg0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i31 = dg0Var.f0;
                ah0 ah0Var4 = dg0Var.s0;
                dg0Var.z(false);
                dg0Var.d0 = false;
                int i32 = 4;
                if (tL_error4 != null) {
                    dg0Var.e0 = tL_error4.text;
                    if ((i31 == 3 && ((i18 = dg0Var.g0) == 4 || i18 == 2 || i18 == 17 || i18 == 16)) || ((i31 == 2 && ((i16 = dg0Var.g0) == 4 || i16 == 3)) || (i31 == 4 && ((i15 = dg0Var.g0) == 2 || i15 == 17 || i15 == 16)))) {
                        dg0Var.t();
                    }
                    if (i31 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i31 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i31 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(dg0Var, NotificationCenter.didReceiveCall);
                    }
                    dg0Var.c0 = true;
                    if (i31 != 3) {
                        i17 = ((org.telegram.ui.ActionBar.m2) ah0Var4).currentAccount;
                        org.telegram.ui.Components.g5.e0(i17, tL_error4, ah0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            dg0Var.c(true);
                            ah0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        dg0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = ah0Var4.getParentActivity();
                    if (parentActivity != null) {
                        dg0Var.q(new se0(i32, dg0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
