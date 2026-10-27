package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x085c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i13;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i14 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i15 = 1;
        switch (this.a) {
            case 0:
                int i16 = 3;
                mr mrVar = (mr) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                a0.h hVar2 = mrVar.K;
                a0.h hVar3 = mrVar.L;
                int i17 = mrVar.d1;
                a0.h hVar4 = mrVar.J;
                int i18 = mrVar.N;
                ArrayList arrayList6 = mrVar.E;
                int i19 = 0;
                int i20 = 0;
                while (i20 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i20);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i20);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i10 = i20;
                        i11 = i16;
                    } else {
                        if (i18 == i15) {
                            i12 = i15;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            mrVar.getMessagesController().processLoadedAdminsResponse(mrVar.M, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            i12 = i15;
                        }
                        mrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, z10);
                        mrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, z10);
                        long clientUserId = mrVar.getUserConfig().getClientUserId();
                        if (i17 != 0) {
                            ?? r10 = z10;
                            while (true) {
                                if (r10 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(r10).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove((int) r10);
                                    } else {
                                        r10++;
                                    }
                                }
                            }
                        }
                        if (i18 == 2) {
                            mrVar.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = mrVar.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = mrVar.F;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i13 = 0;
                            while (i13 < size) {
                                long j10 = clientUserId;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i13);
                                int i21 = i20;
                                int i22 = size;
                                if (channelParticipant.user_id == j10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i13++;
                                i20 = i21;
                                clientUserId = j10;
                                size = i22;
                            }
                            i10 = i20;
                            int size2 = arrayList3.size() + i19;
                            if (i18 == 2) {
                                int size3 = arrayList6.size();
                                int i23 = 0;
                                while (i23 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i23);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i17 == i12 && peerId > 0 && UserObject.isDeleted(mrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList6.remove(i23);
                                            hVar4.l(peerId);
                                            i23--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList6.remove(i23);
                                        i23--;
                                        size3--;
                                    }
                                    i23++;
                                    i12 = 1;
                                }
                            }
                            i11 = i16;
                            if ((i18 != 0 || i18 == i11 || i18 == 2) && (chat = mrVar.n) != null && chat.megagroup) {
                                chatFull = mrVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    mrVar.A0(arrayList3);
                                    i19 = size2;
                                }
                            }
                            if (i18 == 1) {
                                try {
                                    Collections.sort(arrayList6, new org.telegram.ui.ActionBar.n4(11));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            i19 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                        i10 = i20;
                        int size22 = arrayList3.size() + i19;
                        if (i18 == 2) {
                        }
                        i11 = i16;
                        if (i18 != 0) {
                        }
                        chatFull = mrVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            mrVar.A0(arrayList3);
                            i19 = size22;
                        }
                        if (i18 == 1) {
                        }
                        i19 = size22;
                    }
                    i20 = i10 + 1;
                    i16 = i11;
                    arrayList4 = arrayList;
                    arrayList5 = arrayList2;
                    z10 = false;
                    i15 = 1;
                }
                if (i18 != 2 || mrVar.j1 <= 0) {
                    ir irVar = mrVar.a;
                    mrVar.z0(irVar != null ? irVar.d.c1 : 0);
                    mrVar.P = false;
                    mrVar.Q = true;
                    org.telegram.ui.ActionBar.y5 y5Var = mrVar.f;
                    if (y5Var != null) {
                        y5Var.setVisibility((i18 != 0 || i19 > 5) ? 0 : 8);
                    }
                }
                mrVar.C0();
                ir irVar2 = mrVar.a;
                if (irVar2 != null) {
                    bi.r1 r1Var = mrVar.c;
                    r1Var.W1 = mrVar.A1;
                    r1Var.X1 = 0;
                    irVar2.l();
                    org.telegram.ui.Components.fy0 fy0Var = mrVar.b;
                    if (fy0Var != null && mrVar.a.d.c1 == 0 && mrVar.Q) {
                        fy0Var.e(false, true);
                    }
                }
                mrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ey eyVar = (ey) this.b;
                nd ndVar = (nd) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                eyVar.removeSelfFromStack();
                ndVar.removeSelfFromStack();
                r2Var.finishFragment();
                break;
            case 2:
                ey eyVar2 = (ey) this.b;
                dy dyVar = (dy) this.c;
                int length = ((Object[]) this.d).length;
                eyVar2.C4(dyVar);
                tx txVar = eyVar2.z0;
                if (txVar != null && txVar.getVisibility() == 0) {
                    eyVar2.z0.c();
                    break;
                }
                break;
            case 3:
                ux uxVar = (ux) this.b;
                boolean[] zArr = (boolean[]) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                ey eyVar3 = uxVar.b;
                if (!zArr[0]) {
                    d00.S(eyVar3, dialogFilter, null);
                    break;
                } else {
                    eyVar3.presentFragment(new oz(dialogFilter, null));
                    break;
                }
            case 4:
                qy qyVar = (qy) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                qyVar.getClass();
                qyVar.o((TLRPC.TL_messages_stickerSet) tLObject2, messageObject);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList7 = ExternalActionActivity.x;
                try {
                    e2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.e2 w02 = org.telegram.ui.Components.g5.w0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new bi.u3(10, externalActionActivity, tL_error));
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
                int i24 = 5;
                q00 q00Var = (q00) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                q00.t0(tL_error2, q00Var, org.telegram.ui.Components.wc.b0(q00Var));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    q00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    oz ozVar = new oz(q00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    ozVar.x = new rz(q00Var, i15);
                    ozVar.w = new rz(q00Var, i14);
                    q00Var.presentFragment(ozVar);
                    AndroidUtilities.runOnUIThread(new kz(i24, q00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                d00 d00Var = (d00) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = d00Var.n;
                q00.t0(tL_error3, r2Var2, new org.telegram.ui.Components.wc(d00Var.a0, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    d00Var.dismiss();
                    r2Var2.getMessagesController().loadRemoteFilters(true);
                    r2Var2.presentFragment(new oz(d00Var.Y, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                j00 j00Var = (j00) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                i00 i00Var = (i00) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.wc.b0(j00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(i00Var);
                    break;
                }
                break;
            case 9:
                r10 r10Var = (r10) this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.d;
                FiltersSetupActivity filtersSetupActivity = r10Var.e;
                if (e2Var2 != null) {
                    try {
                        e2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                r60 r60Var = (r60) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                t60 t60Var = r60Var.I;
                ig.a2 a2Var = r60Var.f;
                if (r60Var.n) {
                    r60Var.h = null;
                    r60Var.d = arrayList8;
                    r60Var.e = arrayList9;
                    a2Var.f(arrayList8, null);
                    t60Var.r0(r60Var.H);
                    r60Var.l();
                    if (r60Var.n && !a2Var.e() && r60Var.h() == 0) {
                        t60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                r70 r70Var = (r70) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!r70Var.M) {
                    r70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                v70 v70Var = (v70) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                if (v70Var.h) {
                    v70Var.d = arrayList10;
                    v70Var.e = arrayList11;
                    v70Var.l();
                    v70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                wn wnVar = (wn) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                Pattern pattern = LaunchActivity.D1;
                if (tL_error5 == null) {
                    if (user != null && !UserObject.isUserSelf(user)) {
                        org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NoPaidMessagesTokenImported, UserObject.getFirstName(user)))).j();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc.b0(wnVar).g0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                kz kzVar = (kz) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.g5.w0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                kz kzVar2 = (kz) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    kzVar2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.g5.w0(launchActivity2, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity2.G0(org.telegram.ui.Components.g5.M(launchActivity2, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.c;
                File file = (File) this.d;
                Pattern pattern4 = LaunchActivity.D1;
                x6Var.d(file, x6Var.c);
                AndroidUtilities.runOnUIThread(new p80(launchActivity3, 7));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity4.getClass();
                int i25 = iArr[0] - 1;
                iArr[0] = i25;
                if (i25 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.q0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern6 = LaunchActivity.D1;
                    launchActivity5.j0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.T0 = x6Var2;
                    launchActivity5.R0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity5.S0 = tL_wallPaper;
                    FileLoader.getInstance(x6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                r90 r90Var = (r90) this.d;
                Pattern pattern7 = LaunchActivity.D1;
                MessagesController.getInstance(launchActivity6.O).putUser(user2, true);
                r90Var.run(user2);
                break;
            case 20:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) gVar.b;
                Pattern pattern8 = LaunchActivity.D1;
                launchActivity7.getClass();
                if (!"rebuild".equals(str2)) {
                    if (!"keys".equals(str2)) {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                        String str4 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.y6.P0(string) != null && !org.telegram.ui.ActionBar.y6.P0(string).q()) {
                            str4 = string;
                        }
                        String str5 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.y6.P0(string2) != null && org.telegram.ui.ActionBar.y6.P0(string2).q()) {
                            str5 = string2;
                        }
                        boolean z11 = "night".equals(str2) || !("day".equals(str2) || org.telegram.ui.ActionBar.y6.I.q());
                        if (z11) {
                            str4 = str5;
                        }
                        org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(str4);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z11 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(P0.m());
                        sb2.append("), style ");
                        sb2.append(str3);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str3)) {
                            if (!"fade".equals(str3)) {
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, new int[]{launchActivity7.z0.getMeasuredWidth() / 2, launchActivity7.z0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z11), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y6.H1(P0, false, -1, null);
                                break;
                            }
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet s10 = org.telegram.ui.ActionBar.f7.s();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = s10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.m5.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + s10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.z0(true);
                        if (AndroidUtilities.isTablet() && (actionBarLayout = launchActivity7.s0) != null) {
                            actionBarLayout.W(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                }
                break;
            case 21:
                ob0 ob0Var = (ob0) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str6 = (String) this.d;
                ob0Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ob0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    jb0 jb0Var = new jb0(ob0Var, str6, 2);
                    if (!password.has_password) {
                        fg1 fg1Var = new fg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        fg1Var.j0 = jb0Var;
                        ob0Var.u(fg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ob0Var.u(twoStepVerificationActivity, false);
                        jb0Var.run();
                        break;
                    }
                }
                break;
            case 22:
                lb0 lb0Var = (lb0) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    lb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    lb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.g2.m(user3, false, userFull2 != null && userFull2.video_calls_available, lb0Var.getParentActivity(), userFull2, lb0Var.getAccountInstance());
                break;
            case 23:
                rc0 rc0Var = (rc0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(rc0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new pq(rc0Var, viewGroup, gLSurfaceView, 25), 100L);
                break;
            case 24:
                rc0 rc0Var2 = (rc0) this.b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                rc0Var2.getClass();
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                rc0Var2.E0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                rc0Var2.finishFragment();
                break;
            case 25:
                rc0 rc0Var3 = (rc0) this.b;
                ViewGroup viewGroup2 = (ViewGroup) this.c;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) this.d;
                rc0Var3.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                rc0Var3.M = true;
                rc0Var3.finishFragment();
                break;
            case 26:
                ((ig0) this.b).v1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                ig0 ig0Var = (ig0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                ig0Var.getClass();
                ig0Var.l1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                boVar.getClass();
                editText.removeTextChangedListener(boVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                qd0 qd0Var = (qd0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ig0 ig0Var2 = qd0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ig0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            ig0Var2.t1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        ig0Var2.l1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    ig0Var2.finishFragment();
                    ig0Var2.d0.run();
                    break;
                }
                break;
        }
    }
}
