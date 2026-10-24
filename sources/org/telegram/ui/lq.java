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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    /* JADX WARN: Code restructure failed: missing block: B:358:0x08ef, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r2.getMessagesController().getUser(java.lang.Long.valueOf(r0))) != false) goto L322;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:332:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0936 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [int] */
    /* JADX WARN: Type inference failed for: r11v18 */
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
        int i14;
        ArrayList arrayList4;
        ActionBarLayout actionBarLayout;
        int i15 = 8;
        int i16 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i17 = 1;
        switch (this.a) {
            case 0:
                int i18 = 3;
                jr jrVar = (jr) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                a0.h hVar2 = jrVar.L;
                a0.h hVar3 = jrVar.M;
                int i19 = jrVar.e1;
                a0.h hVar4 = jrVar.K;
                int i20 = jrVar.O;
                ArrayList arrayList7 = jrVar.F;
                int i21 = 0;
                int i22 = 0;
                while (i22 < arrayList5.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList5.get(i22);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList6.get(i22);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i10 = i18;
                        i21 = i21;
                    } else {
                        if (i20 == i17) {
                            i12 = i17;
                            i11 = i21;
                            jrVar.getMessagesController().processLoadedAdminsResponse(jrVar.N, tL_channels_channelParticipants);
                        } else {
                            i11 = i21;
                            i12 = i17;
                        }
                        jrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, z10);
                        jrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, z10);
                        long clientUserId = jrVar.getUserConfig().getClientUserId();
                        if (i19 != 0) {
                            ?? r11 = z10;
                            while (true) {
                                if (r11 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(r11).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove((int) r11);
                                    } else {
                                        r11++;
                                    }
                                }
                            }
                        }
                        if (i20 == 2) {
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
                            i13 = 0;
                            while (i13 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i13);
                                ArrayList arrayList8 = arrayList5;
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i13++;
                                arrayList5 = arrayList8;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            arrayList = arrayList5;
                            int size2 = arrayList3.size() + i11;
                            if (i20 == 2) {
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (i23 < size3) {
                                    TLObject tLObject = (TLObject) arrayList7.get(i23);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        int i24 = size3;
                                        i14 = size2;
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) == null && hVar2.f(peerId) == null) {
                                            if (i19 == i12 && peerId > 0) {
                                                arrayList4 = arrayList6;
                                                break;
                                            } else {
                                                arrayList4 = arrayList6;
                                            }
                                            size3 = i24;
                                        } else {
                                            arrayList4 = arrayList6;
                                        }
                                        arrayList7.remove(i23);
                                        hVar4.l(peerId);
                                        i23--;
                                        size3 = i24 - 1;
                                    } else {
                                        arrayList7.remove(i23);
                                        i23--;
                                        size3--;
                                        i14 = size2;
                                        arrayList4 = arrayList6;
                                    }
                                    i23++;
                                    size2 = i14;
                                    arrayList6 = arrayList4;
                                    i12 = 1;
                                }
                            }
                            int i25 = size2;
                            arrayList2 = arrayList6;
                            i10 = i18;
                            if ((i20 != 0 || i20 == i10 || i20 == 2) && (chat = jrVar.r) != null && chat.megagroup) {
                                chatFull = jrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    jrVar.z0(arrayList3);
                                    i21 = i25;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                    Collections.sort(arrayList7, new org.telegram.ui.ActionBar.l4(11));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            i21 = i25;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList7;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                        arrayList = arrayList5;
                        int size22 = arrayList3.size() + i11;
                        if (i20 == 2) {
                        }
                        int i252 = size22;
                        arrayList2 = arrayList6;
                        i10 = i18;
                        if (i20 != 0) {
                        }
                        chatFull = jrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            jrVar.z0(arrayList3);
                            i21 = i252;
                        }
                        if (i20 == 1) {
                        }
                        i21 = i252;
                    }
                    i22++;
                    i18 = i10;
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                    z10 = false;
                    i17 = 1;
                }
                int i26 = i21;
                if (i20 != 2 || jrVar.k1 <= 0) {
                    fr frVar = jrVar.a;
                    jrVar.y0(frVar != null ? frVar.d.d1 : 0);
                    jrVar.Q = false;
                    jrVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = jrVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i20 != 0 || i26 > 5) ? 0 : 8);
                    }
                }
                jrVar.B0();
                fr frVar2 = jrVar.a;
                if (frVar2 != null) {
                    ai.u1 u1Var = jrVar.c;
                    u1Var.W1 = jrVar.B1;
                    u1Var.X1 = 0;
                    frVar2.l();
                    org.telegram.ui.Components.wx0 wx0Var = jrVar.b;
                    if (wx0Var != null && jrVar.a.d.d1 == 0 && jrVar.R) {
                        wx0Var.e(false, true);
                    }
                }
                jrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ey eyVar = (ey) this.b;
                md mdVar = (md) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                eyVar.removeSelfFromStack();
                mdVar.removeSelfFromStack();
                o2Var.finishFragment();
                break;
            case 2:
                ey eyVar2 = (ey) this.b;
                dy dyVar = (dy) this.c;
                int length = ((Object[]) this.d).length;
                eyVar2.s4(dyVar);
                cw cwVar = eyVar2.z0;
                if (cwVar != null && cwVar.getVisibility() == 0) {
                    eyVar2.z0.c();
                    break;
                }
                break;
            case 3:
                dw dwVar = (dw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                ey eyVar3 = dwVar.b;
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
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList9 = ExternalActionActivity.x;
                try {
                    c2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.c2 x02 = org.telegram.ui.Components.f5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new ai.z3(10, externalActionActivity, tL_error));
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
                q00 q00Var = (q00) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                q00.r0(tL_error2, q00Var, org.telegram.ui.Components.xc.a0(q00Var));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    q00Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    oz ozVar = new oz(q00Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    ozVar.E = new rz(q00Var, i17);
                    ozVar.y = new rz(q00Var, i16);
                    q00Var.presentFragment(ozVar);
                    AndroidUtilities.runOnUIThread(new ot(17, q00Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                d00 d00Var = (d00) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = d00Var.n;
                q00.r0(tL_error3, o2Var2, new org.telegram.ui.Components.xc(d00Var.a0, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    d00Var.dismiss();
                    o2Var2.getMessagesController().loadRemoteFilters(true);
                    o2Var2.presentFragment(new oz(d00Var.Y, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                j00 j00Var = (j00) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                i00 i00Var = (i00) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.xc.a0(j00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(i00Var);
                    break;
                }
                break;
            case 9:
                p10 p10Var = (p10) this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.c;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.d;
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                if (c2Var2 != null) {
                    try {
                        c2Var2.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                n60 n60Var = (n60) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                p60 p60Var = n60Var.I;
                hg.a2 a2Var = n60Var.f;
                if (n60Var.n) {
                    n60Var.h = null;
                    n60Var.d = arrayList10;
                    n60Var.e = arrayList11;
                    a2Var.f(arrayList10, null);
                    p60Var.q0(n60Var.H);
                    n60Var.l();
                    if (n60Var.n && !a2Var.e() && n60Var.h() == 0) {
                        p60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                n70 n70Var = (n70) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!n70Var.M) {
                    n70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                s70 s70Var = (s70) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                if (s70Var.h) {
                    s70Var.d = arrayList12;
                    s70Var.e = arrayList13;
                    s70Var.l();
                    s70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                sn snVar = (sn) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                Pattern pattern = LaunchActivity.E1;
                if (tL_error5 == null) {
                    if (user != null && !UserObject.isUserSelf(user)) {
                        org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NoPaidMessagesTokenImported, UserObject.getFirstName(user)))).j();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.xc.a0(snVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                f80 f80Var = (f80) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                Pattern pattern2 = LaunchActivity.E1;
                try {
                    f80Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.f5.x0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                f80 f80Var2 = (f80) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                Pattern pattern3 = LaunchActivity.E1;
                try {
                    f80Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.f5.x0(launchActivity2, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity2.G0(org.telegram.ui.Components.f5.N(launchActivity2, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.c;
                File file = (File) this.d;
                Pattern pattern4 = LaunchActivity.E1;
                j6Var.d(file, j6Var.c);
                AndroidUtilities.runOnUIThread(new p80(launchActivity3, i15));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                Pattern pattern5 = LaunchActivity.E1;
                launchActivity4.getClass();
                int i27 = iArr[0] - 1;
                iArr[0] = i27;
                if (i27 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.q0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern6 = LaunchActivity.E1;
                    launchActivity5.j0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.T0 = j6Var2;
                    launchActivity5.R0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity5.S0 = tL_wallPaper;
                    FileLoader.getInstance(j6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                s90 s90Var = (s90) this.d;
                Pattern pattern7 = LaunchActivity.E1;
                MessagesController.getInstance(launchActivity6.O).putUser(user2, true);
                s90Var.run(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                Pattern pattern8 = LaunchActivity.E1;
                launchActivity7.getClass();
                if (!"rebuild".equals(str2)) {
                    if (!"keys".equals(str2)) {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                        String str4 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.k6.P0(string) != null && !org.telegram.ui.ActionBar.k6.P0(string).q()) {
                            str4 = string;
                        }
                        String str5 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.k6.P0(string2) != null && org.telegram.ui.ActionBar.k6.P0(string2).q()) {
                            str5 = string2;
                        }
                        boolean z11 = "night".equals(str2) || !("day".equals(str2) || org.telegram.ui.ActionBar.k6.I.q());
                        if (z11) {
                            str4 = str5;
                        }
                        org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(str4);
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
                                org.telegram.ui.ActionBar.k6.H1(P0, false, -1, null);
                                break;
                            }
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet s10 = org.telegram.ui.ActionBar.r6.s();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = s10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.k5.i(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + s10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.z0(true);
                        if (AndroidUtilities.isTablet() && (actionBarLayout = launchActivity7.s0) != null) {
                            actionBarLayout.V(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e13) {
                        FileLog.e(e13);
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
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.x0(ob0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    kb0 kb0Var = new kb0(ob0Var, str6, 2);
                    if (!password.has_password) {
                        bg1 bg1Var = new bg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        bg1Var.j0 = kb0Var;
                        ob0Var.u(bg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ob0Var.u(twoStepVerificationActivity, false);
                        kb0Var.run();
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
                org.telegram.ui.Components.voip.d2.m(user3, false, userFull != null && userFull.video_calls_available, lb0Var.getParentActivity(), userFull, lb0Var.getAccountInstance());
                break;
            case 23:
                sc0 sc0Var = (sc0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(sc0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new lq(sc0Var, viewGroup, gLSurfaceView, 24), 100L);
                break;
            case 24:
                sc0 sc0Var2 = (sc0) this.b;
                ViewGroup viewGroup2 = (ViewGroup) this.c;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) this.d;
                sc0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                sc0Var2.M = true;
                sc0Var2.finishFragment();
                break;
            case 25:
                sc0 sc0Var3 = (sc0) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                sc0Var3.getClass();
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                sc0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                sc0Var3.finishFragment();
                break;
            case 26:
                ig0 ig0Var = (ig0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                ig0Var.getClass();
                ig0Var.k1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 27:
                org.telegram.ui.Components.ao aoVar = (org.telegram.ui.Components.ao) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                aoVar.getClass();
                editText.removeTextChangedListener(aoVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 28:
                rd0 rd0Var = (rd0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ig0 ig0Var2 = rd0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ig0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            ig0Var2.s1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        ig0Var2.k1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    ig0Var2.finishFragment();
                    ig0Var2.d0.run();
                    break;
                }
                break;
            default:
                ue0 ue0Var = (ue0) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                ig0 ig0Var3 = ue0Var.O;
                ue0Var.H = false;
                if (!(tLObject11 instanceof TLRPC.TL_auth_authorization)) {
                    ig0Var3.o1(false, true);
                    if (!tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error7.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error7.text.contains("LASTNAME_INVALID")) {
                                        ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                                        break;
                                    } else {
                                        ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                ue0Var.c(true);
                                ig0Var3.y1(0, true, null, true);
                                ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        ig0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    ue0Var.n();
                    ig0Var3.z1(false, true);
                    ue0Var.postDelayed(new f80(19, ue0Var, tLObject11), 150L);
                    break;
                }
                break;
        }
    }
}
