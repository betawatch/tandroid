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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jq(Object obj, Object obj2, Object obj3, int i10) {
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
                hr hrVar = (hr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar2 = hrVar.L;
                a0.h hVar3 = hrVar.M;
                int i16 = hrVar.e1;
                a0.h hVar4 = hrVar.K;
                int i17 = hrVar.O;
                ArrayList arrayList6 = hrVar.F;
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
                            hrVar.getMessagesController().processLoadedAdminsResponse(hrVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList5;
                            arrayList2 = arrayList4;
                        }
                        hrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, z10);
                        hrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, z10);
                        long clientUserId = hrVar.getUserConfig().getClientUserId();
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
                            hrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = hrVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = hrVar.G;
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
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i16 == i20 && peerId > 0 && UserObject.isDeleted(hrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
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
                            if ((i17 != 0 || i17 == 3 || i17 == 2) && (chat = hrVar.r) != null && chat.megagroup) {
                                chatFull = hrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    hrVar.z0(arrayList3);
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
                        chatFull = hrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            hrVar.z0(arrayList3);
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
                if (i17 != i14 || hrVar.k1 <= 0) {
                    dr drVar = hrVar.a;
                    hrVar.y0(drVar != null ? drVar.d.d1 : 0);
                    hrVar.Q = false;
                    hrVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = hrVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i17 != 0 || i18 > 5) ? 0 : 8);
                    }
                }
                hrVar.B0();
                dr drVar2 = hrVar.a;
                if (drVar2 != null) {
                    ai.u1 u1Var = hrVar.c;
                    u1Var.W1 = hrVar.B1;
                    u1Var.X1 = 0;
                    drVar2.l();
                    org.telegram.ui.Components.tx0 tx0Var = hrVar.b;
                    if (tx0Var != null && hrVar.a.d.d1 == 0 && hrVar.R) {
                        tx0Var.e(false, true);
                    }
                }
                hrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((cy) obj3).removeSelfFromStack();
                ((md) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                cy cyVar = (cy) obj3;
                int length = ((Object[]) obj).length;
                cyVar.s4((ay) obj2);
                aw awVar = cyVar.z0;
                if (awVar != null && awVar.getVisibility() == 0) {
                    cyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                cy cyVar2 = ((bw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    a00.T(cyVar2, dialogFilter, null);
                    break;
                } else {
                    cyVar2.presentFragment(new lz(dialogFilter, null));
                    break;
                }
            case 4:
                oy oyVar = (oy) obj3;
                oyVar.getClass();
                oyVar.o((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
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
                            w02.setOnDismissListener(new ai.z3(10, externalActionActivity, tL_error));
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
                n00 n00Var = (n00) obj3;
                TLObject tLObject2 = (TLObject) obj;
                n00.r0((TLRPC.TL_error) obj2, n00Var, org.telegram.ui.Components.xc.a0(n00Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    n00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    lz lzVar = new lz(n00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    lzVar.y = new oz(n00Var, i15);
                    lzVar.x = new oz(n00Var, i14);
                    n00Var.presentFragment(lzVar);
                    AndroidUtilities.runOnUIThread(new lt(17, n00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                a00 a00Var = (a00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = a00Var.n;
                n00.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.xc(a00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    a00Var.dismiss();
                    n2Var.getMessagesController().loadRemoteFilters(true);
                    n2Var.presentFragment(new lz(a00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                g00 g00Var = (g00) obj3;
                f00 f00Var = (f00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.xc.a0(g00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(f00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((l10) obj3).e;
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
                j60 j60Var = (j60) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                l60 l60Var = j60Var.I;
                hg.a2 a2Var = j60Var.f;
                if (j60Var.n) {
                    j60Var.h = null;
                    j60Var.d = arrayList8;
                    j60Var.e = arrayList9;
                    a2Var.f(arrayList8, null);
                    l60Var.q0(j60Var.H);
                    j60Var.l();
                    if (j60Var.n && !a2Var.e() && j60Var.h() == 0) {
                        l60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                j70 j70Var = (j70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!j70Var.M) {
                    j70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                n70 n70Var = (n70) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                if (n70Var.h) {
                    n70Var.d = arrayList10;
                    n70Var.e = arrayList11;
                    n70Var.l();
                    n70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                qn qnVar = (qn) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                Pattern pattern = LaunchActivity.C1;
                if (tL_error2 == null) {
                    if (user != null && !UserObject.isUserSelf(user)) {
                        org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NoPaidMessagesTokenImported, UserObject.getFirstName(user)))).j();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.xc.a0(qnVar).f0(tL_error2, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                z70 z70Var = (z70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    z70Var.run();
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
                z70 z70Var2 = (z70) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    z70Var2.run();
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
                AndroidUtilities.runOnUIThread(new j80((LaunchActivity) obj3, i13));
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
                ((m90) obj).run(user2);
                break;
            case 20:
                ib0 ib0Var = (ib0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                ib0Var.c();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(ib0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    eb0 eb0Var = new eb0(ib0Var, str2, 2);
                    if (!password.has_password) {
                        vf1 vf1Var = new vf1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        vf1Var.j0 = eb0Var;
                        ib0Var.u(vf1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ib0Var.u(twoStepVerificationActivity, false);
                        eb0Var.run();
                        break;
                    }
                }
                break;
            case 21:
                fb0 fb0Var = (fb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    fb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    fb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.d2.m(user3, false, userFull2 != null && userFull2.video_calls_available, fb0Var.getParentActivity(), userFull2, fb0Var.getAccountInstance());
                break;
            case 22:
                nc0 nc0Var = (nc0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(nc0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                AndroidUtilities.runOnUIThread(new jq(nc0Var, viewGroup, gLSurfaceView, 23), 100L);
                break;
            case 23:
                nc0 nc0Var2 = (nc0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                nc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                nc0Var2.M = true;
                nc0Var2.finishFragment();
                break;
            case 24:
                nc0 nc0Var3 = (nc0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                nc0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                nc0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                nc0Var3.finishFragment();
                break;
            case 25:
                dg0 dg0Var = (dg0) obj3;
                dg0Var.getClass();
                dg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
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
                dg0 dg0Var2 = ((md0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || dg0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            dg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        dg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    dg0Var2.finishFragment();
                    dg0Var2.d0.run();
                    break;
                }
                break;
            case 28:
                ne0 ne0Var = (ne0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                dg0 dg0Var3 = ne0Var.O;
                ne0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    dg0Var3.k1(false, true);
                    if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error4.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error4.text.contains("LASTNAME_INVALID")) {
                                        dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error4.text);
                                        break;
                                    } else {
                                        dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                ne0Var.c(true);
                                dg0Var3.u1(0, true, null, true);
                                dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        dg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    ne0Var.o();
                    dg0Var3.v1(false, true);
                    ne0Var.postDelayed(new z70(19, ne0Var, tLObject9), 150L);
                    break;
                }
            default:
                ne0 ne0Var2 = (ne0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                ne0Var2.M = fileLocation;
                ne0Var2.N = ((TLRPC.PhotoSize) obj).location;
                ne0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ne0Var2.f, null);
                break;
        }
    }
}
