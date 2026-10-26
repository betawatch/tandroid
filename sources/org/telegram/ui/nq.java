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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:335:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x092f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        ArrayList arrayList4;
        a0.h hVar;
        ArrayList arrayList5;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i12 = 8;
        int i13 = 4;
        int i14 = 6;
        int i15 = 2;
        TLRPC.UserFull userFull = null;
        switch (this.a) {
            case 0:
                int i16 = 3;
                kr krVar = (kr) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                a0.h hVar2 = krVar.K;
                a0.h hVar3 = krVar.L;
                int i17 = krVar.d1;
                a0.h hVar4 = krVar.J;
                int i18 = krVar.N;
                ArrayList arrayList8 = krVar.E;
                int i19 = 0;
                int i20 = 0;
                while (i20 < arrayList6.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList6.get(i20);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList7.get(i20);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList8;
                        i10 = i16;
                    } else {
                        if (i18 == 1) {
                            arrayList4 = arrayList8;
                            krVar.getMessagesController().processLoadedAdminsResponse(krVar.M, tL_channels_channelParticipants);
                        } else {
                            arrayList4 = arrayList8;
                        }
                        krVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        krVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = krVar.getUserConfig().getClientUserId();
                        if (i17 != 0) {
                            int i21 = 0;
                            while (true) {
                                if (i21 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i21).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i21);
                                    } else {
                                        i21++;
                                    }
                                }
                            }
                        }
                        if (i18 == 2) {
                            krVar.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList5 = krVar.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList5 = krVar.F;
                                hVar = hVar2;
                            }
                            arrayList5.clear();
                            arrayList5.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList6;
                            i11 = 0;
                            while (i11 < size) {
                                ArrayList arrayList9 = arrayList7;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                long j10 = clientUserId;
                                if (channelParticipant.user_id == j10) {
                                    arrayList5.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11++;
                                arrayList7 = arrayList9;
                                clientUserId = j10;
                            }
                            arrayList2 = arrayList7;
                            int size2 = arrayList5.size() + i19;
                            if (i18 == 2) {
                                int size3 = arrayList4.size();
                                int i22 = 0;
                                while (i22 < size3) {
                                    ArrayList arrayList10 = arrayList4;
                                    TLObject tLObject = (TLObject) arrayList10.get(i22);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i17 == 1 && peerId > 0 && UserObject.isDeleted(krVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList10.remove(i22);
                                            hVar4.l(peerId);
                                        }
                                        i22++;
                                        arrayList4 = arrayList10;
                                    } else {
                                        arrayList10.remove(i22);
                                    }
                                    i22--;
                                    size3--;
                                    i22++;
                                    arrayList4 = arrayList10;
                                }
                            }
                            arrayList3 = arrayList4;
                            i10 = i16;
                            if ((i18 != 0 || i18 == i10 || i18 == 2) && (chat = krVar.n) != null && chat.megagroup) {
                                chatFull = krVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    krVar.A0(arrayList5);
                                    i19 = size2;
                                }
                            }
                            if (i18 == 1) {
                                try {
                                    Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(11));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            i19 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList5 = arrayList4;
                        arrayList5.clear();
                        arrayList5.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList6;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        arrayList2 = arrayList7;
                        int size22 = arrayList5.size() + i19;
                        if (i18 == 2) {
                        }
                        arrayList3 = arrayList4;
                        i10 = i16;
                        if (i18 != 0) {
                        }
                        chatFull = krVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            krVar.A0(arrayList5);
                            i19 = size22;
                        }
                        if (i18 == 1) {
                        }
                        i19 = size22;
                    }
                    i20++;
                    i16 = i10;
                    arrayList8 = arrayList3;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                }
                if (i18 != 2 || krVar.j1 <= 0) {
                    gr grVar = krVar.a;
                    krVar.z0(grVar != null ? grVar.d.c1 : 0);
                    krVar.P = false;
                    krVar.Q = true;
                    org.telegram.ui.ActionBar.y5 y5Var = krVar.f;
                    if (y5Var != null) {
                        y5Var.setVisibility((i18 != 0 || i19 > 5) ? 0 : 8);
                    }
                }
                krVar.C0();
                gr grVar2 = krVar.a;
                if (grVar2 != null) {
                    bi.r1 r1Var = krVar.c;
                    r1Var.W1 = krVar.A1;
                    r1Var.X1 = 0;
                    grVar2.l();
                    org.telegram.ui.Components.ey0 ey0Var = krVar.b;
                    if (ey0Var != null && krVar.a.d.c1 == 0 && krVar.Q) {
                        ey0Var.e(false, true);
                    }
                }
                krVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                cy cyVar = (cy) this.b;
                nd ndVar = (nd) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                cyVar.removeSelfFromStack();
                ndVar.removeSelfFromStack();
                r2Var.finishFragment();
                break;
            case 2:
                cy cyVar2 = (cy) this.b;
                ay ayVar = (ay) this.c;
                int length = ((Object[]) this.d).length;
                cyVar2.C4(ayVar);
                qx qxVar = cyVar2.z0;
                if (qxVar != null && qxVar.getVisibility() == 0) {
                    cyVar2.z0.c();
                    break;
                }
                break;
            case 3:
                rx rxVar = (rx) this.b;
                boolean[] zArr = (boolean[]) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                cy cyVar3 = rxVar.b;
                if (!zArr[0]) {
                    b00.S(cyVar3, dialogFilter, null);
                    break;
                } else {
                    cyVar3.presentFragment(new lz(dialogFilter, null));
                    break;
                }
            case 4:
                oy oyVar = (oy) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                oyVar.getClass();
                oyVar.o((TLRPC.TL_messages_stickerSet) tLObject2, messageObject);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList11 = ExternalActionActivity.x;
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
            case 6:
                o00 o00Var = (o00) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                o00.t0(tL_error2, o00Var, org.telegram.ui.Components.wc.b0(o00Var));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    o00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    lz lzVar = new lz(o00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    lzVar.x = new oz(o00Var, 1);
                    lzVar.w = new oz(o00Var, i15);
                    o00Var.presentFragment(lzVar);
                    AndroidUtilities.runOnUIThread(new sz(i13, o00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                b00 b00Var = (b00) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = b00Var.n;
                o00.t0(tL_error3, r2Var2, new org.telegram.ui.Components.wc(b00Var.a0, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    b00Var.dismiss();
                    r2Var2.getMessagesController().loadRemoteFilters(true);
                    r2Var2.presentFragment(new lz(b00Var.Y, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                h00 h00Var = (h00) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                g00 g00Var = (g00) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.wc.b0(h00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(g00Var);
                    break;
                }
                break;
            case 9:
                p10 p10Var = (p10) this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.d;
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
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
                p60 p60Var = (p60) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                r60 r60Var = p60Var.I;
                ig.a2 a2Var = p60Var.f;
                if (p60Var.n) {
                    p60Var.h = null;
                    p60Var.d = arrayList12;
                    p60Var.e = arrayList13;
                    a2Var.f(arrayList12, null);
                    r60Var.r0(p60Var.H);
                    p60Var.l();
                    if (p60Var.n && !a2Var.e() && p60Var.h() == 0) {
                        r60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                p70 p70Var = (p70) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!p70Var.M) {
                    p70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                t70 t70Var = (t70) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                if (t70Var.h) {
                    t70Var.d = arrayList14;
                    t70Var.e = arrayList15;
                    t70Var.l();
                    t70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                un unVar = (un) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                Pattern pattern = LaunchActivity.D1;
                if (tL_error5 == null) {
                    if (user != null && !UserObject.isUserSelf(user)) {
                        org.telegram.ui.Components.wc.b0(unVar).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NoPaidMessagesTokenImported, UserObject.getFirstName(user)))).j();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc.b0(unVar).g0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                sz szVar = (sz) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    szVar.run();
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
                sz szVar2 = (sz) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    szVar2.run();
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
                AndroidUtilities.runOnUIThread(new o80(launchActivity3, i12));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity4.getClass();
                int i23 = iArr[0] - 1;
                iArr[0] = i23;
                if (i23 == 0) {
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
                        boolean z10 = "night".equals(str2) || !("day".equals(str2) || org.telegram.ui.ActionBar.y6.I.q());
                        if (z10) {
                            str4 = str5;
                        }
                        org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(str4);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z10 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(P0.m());
                        sb2.append("), style ");
                        sb2.append(str3);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str3)) {
                            if (!"fade".equals(str3)) {
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, new int[]{launchActivity7.z0.getMeasuredWidth() / 2, launchActivity7.z0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z10), null);
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
                lb0 lb0Var = (lb0) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str6 = (String) this.d;
                lb0Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(lb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    hb0 hb0Var = new hb0(lb0Var, str6, 2);
                    if (!password.has_password) {
                        dg1 dg1Var = new dg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        dg1Var.j0 = hb0Var;
                        lb0Var.u(dg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        lb0Var.u(twoStepVerificationActivity, false);
                        hb0Var.run();
                        break;
                    }
                }
                break;
            case 22:
                ib0 ib0Var = (ib0) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    ib0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    ib0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.g2.m(user3, false, userFull2 != null && userFull2.video_calls_available, ib0Var.getParentActivity(), userFull2, ib0Var.getAccountInstance());
                break;
            case 23:
                pc0 pc0Var = (pc0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(pc0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new nq(pc0Var, viewGroup, gLSurfaceView, 25), 100L);
                break;
            case 24:
                pc0 pc0Var2 = (pc0) this.b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                pc0Var2.getClass();
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                pc0Var2.E0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                pc0Var2.finishFragment();
                break;
            case 25:
                pc0 pc0Var3 = (pc0) this.b;
                ViewGroup viewGroup2 = (ViewGroup) this.c;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) this.d;
                pc0Var3.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                pc0Var3.M = true;
                pc0Var3.finishFragment();
                break;
            case 26:
                gg0 gg0Var = (gg0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                gg0Var.getClass();
                gg0Var.l1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 27:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                boVar.getClass();
                editText.removeTextChangedListener(boVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 28:
                od0 od0Var = (od0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                gg0 gg0Var2 = od0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || gg0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            gg0Var2.t1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        gg0Var2.l1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    gg0Var2.finishFragment();
                    gg0Var2.d0.run();
                    break;
                }
                break;
            default:
                re0 re0Var = (re0) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                gg0 gg0Var3 = re0Var.O;
                re0Var.H = false;
                if (!(tLObject11 instanceof TLRPC.TL_auth_authorization)) {
                    gg0Var3.p1(false, true);
                    if (!tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error7.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error7.text.contains("LASTNAME_INVALID")) {
                                        gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                                        break;
                                    } else {
                                        gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                re0Var.c(true);
                                gg0Var3.z1(0, true, null, true);
                                gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    re0Var.n();
                    gg0Var3.A1(false, true);
                    re0Var.postDelayed(new wb0(i14, re0Var, tLObject11), 150L);
                    break;
                }
                break;
        }
    }
}
