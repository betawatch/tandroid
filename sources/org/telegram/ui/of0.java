package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ of0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a74, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a7e, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a8a, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a9e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        ut utVar;
        int i17;
        String[] strArr;
        ArrayList arrayList;
        int i18;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        TLRPC.Message message;
        int i25 = 2;
        pn pnVar = null;
        int i26 = 5;
        int i27 = 0;
        int i28 = 1;
        switch (this.a) {
            case 0:
                zf0 zf0Var = (zf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i29 = zf0Var.f0;
                wg0 wg0Var = zf0Var.s0;
                zf0Var.z(false);
                zf0Var.d0 = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    zf0Var.w();
                    zf0Var.v();
                    i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    wg0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i29 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    zf0Var.q(new lf0(zf0Var, i26));
                    break;
                } else {
                    zf0Var.e0 = tL_error.text;
                    zf0Var.d0 = false;
                    wg0Var.v1(false, true);
                    if (i29 == 3) {
                        int i30 = zf0Var.g0;
                        if (i30 != 4) {
                            i10 = 2;
                            if (i30 != 2) {
                                if (i30 != 17) {
                                    break;
                                }
                            }
                        }
                        zf0Var.t();
                        if (i29 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i29 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i29 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        zf0Var.c0 = z10;
                        if (i29 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                zf0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                zf0Var.c(true);
                                wg0Var.u1(0, true, null, true);
                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i31 = 0;
                            while (true) {
                                cs csVar = zf0Var.f;
                                es[] esVarArr = csVar.f;
                                if (i31 >= esVarArr.length) {
                                    csVar.e = false;
                                    esVarArr[0].requestFocus();
                                    break;
                                } else {
                                    esVarArr[i31].setText("");
                                    i31++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i29 == i10) {
                        int i32 = zf0Var.g0;
                        if (i32 != 4) {
                        }
                        zf0Var.t();
                        if (i29 == 15) {
                        }
                        zf0Var.c0 = z10;
                        if (i29 != 3) {
                        }
                    }
                    if (i29 == 4) {
                        int i33 = zf0Var.g0;
                        if (i33 != i10) {
                            if (i33 != 17) {
                                break;
                            }
                        }
                        zf0Var.t();
                    }
                    if (i29 == 15) {
                    }
                    zf0Var.c0 = z10;
                    if (i29 != 3) {
                    }
                }
                break;
            case 1:
                zf0 zf0Var2 = (zf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                zf0Var2.o0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                zf0Var2.p0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    zf0Var2.g0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    zf0Var2.g0 = 16;
                }
                zf0Var2.s0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                fg0 fg0Var = (fg0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                ci.d dVar = fg0Var.b;
                wg0 wg0Var2 = fg0Var.v;
                fg0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    fg0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.d5 parentLayout = wg0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.n2) sc.v.h(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i34 = 0;
                        while (i34 < size) {
                            Object obj = arrayList3.get(i34);
                            i34++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                            if ((n2Var2 instanceof vo0) && n2Var2 != n2Var) {
                                n2Var2.removeSelfFromStack();
                            }
                        }
                        if (n2Var instanceof vo0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            wg0Var2.g1(fg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    wg0Var2.g1(fg0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            fg0Var.e = tL_error2.text;
                            fg0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.ad(wg0Var2.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            wg0Var2.u1(0, true, null, true);
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new bg0(fg0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                fg0 fg0Var2 = (fg0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                wg0 wg0Var3 = fg0Var2.v;
                wg0Var3.e = true;
                wg0 wg0Var4 = (wg0) LaunchActivity.N();
                if (wg0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.n2) wg0Var3).currentAccount;
                    wg0Var4 = new wg0(i16);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(wg0Var4);
                    }
                }
                wg0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                vg0 vg0Var = (vg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                bk0 bk0Var = vg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (bk0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = vg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i35 = 0;
                            while (true) {
                                if (i35 >= arrayList4.size()) {
                                    utVar = null;
                                } else if (arrayList4.get(i35) == null || !((ut) arrayList4.get(i35)).a.equals(upperCase)) {
                                    i35++;
                                } else {
                                    utVar = (ut) arrayList4.get(i35);
                                }
                            }
                            if (utVar != null) {
                                bk0Var.setText(utVar.c);
                                vg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                zh0 zh0Var = (zh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    zh0Var.getClass();
                    break;
                } else {
                    zh0 zh0Var2 = zh0Var.s0.a;
                    int i36 = 0;
                    while (true) {
                        ArrayList arrayList5 = zh0Var2.j0;
                        if (i36 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i36)).link.equals(tL_chatInviteExported.link)) {
                            qh0 f02 = zh0Var2.f0();
                            arrayList5.remove(i36);
                            zh0Var2.h0(f02);
                            break;
                        } else {
                            i36++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new tf0(10, (ft) this.c, MessagesStorage.getInstance(((dk0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                dk0.o((dk0) this.b, (TLObject) this.c, (ft) this.d);
                break;
            case 8:
                rk0 rk0Var = (rk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = rk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0(rk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 26));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i37 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i37];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i38 = 0;
                    while (i38 < arrayList6.size()) {
                        vk0 vk0Var = (vk0) arrayList6.get(i38);
                        if (DialogObject.isEncryptedDialog(vk0Var.d)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(notificationsCustomSettingsActivity.getMessagesController(), vk0Var.d);
                            if (l4 != null) {
                                i17 = i27;
                                strArr = strArr2;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(l4.user_id));
                                if (user2 != null) {
                                    strArr3[i17] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i28] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                i17 = i27;
                                strArr = strArr2;
                            }
                        } else {
                            i17 = i27;
                            strArr = strArr2;
                            if (DialogObject.isUserDialog(vk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(vk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[i17] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i28] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[i17];
                                    strArr3[i17] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                                    str = strArr3[i17];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i19 = i17;
                                    int i39 = i19;
                                    while (i19 < i37) {
                                        i18 = i17;
                                        String str6 = strArr[i19];
                                        int i40 = i28;
                                        String str7 = strArr3[i18];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.bi.w(" ", str6, strArr3[i18]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.bi.w(" ", str6, translitString)))) {
                                            String str8 = strArr3[i40];
                                            i20 = (str8 == null || !str8.startsWith(str6)) ? i39 : 2;
                                        } else {
                                            i20 = i40;
                                        }
                                        if (i20 != 0) {
                                            if (i20 == i40) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[i40], null, "@" + str6));
                                            }
                                            arrayList8.add(vk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i19++;
                                            i39 = i20;
                                            i17 = i18;
                                            arrayList6 = arrayList;
                                            i28 = 1;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                                i18 = i17;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-vk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[i17] = chat2.title;
                                        strArr3[i28] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[i17];
                                        strArr3[i17] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                                        str = strArr3[i17];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i19 = i17;
                                        int i392 = i19;
                                        while (i19 < i37) {
                                        }
                                    }
                                    arrayList = arrayList6;
                                    i18 = i17;
                                }
                            }
                            i38++;
                            strArr2 = strArr;
                            i27 = i18;
                            arrayList6 = arrayList;
                            i28 = 1;
                        }
                        chat = null;
                        String str522 = strArr3[i17];
                        strArr3[i17] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i17]);
                        str = strArr3[i17];
                        if (str != null) {
                        }
                        i19 = i17;
                        int i3922 = i19;
                        while (i19 < i37) {
                        }
                        arrayList = arrayList6;
                        i18 = i17;
                        i38++;
                        strArr2 = strArr;
                        i27 = i18;
                        arrayList6 = arrayList;
                        i28 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0(rk0Var, arrayList8, arrayList9, arrayList7, 26));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                nn0 nn0Var = (nn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                nn0Var.w1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rw(25, nn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = nn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    nn0Var.L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    nn0Var.L1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((bn0) this.b).c(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                zm0 zm0Var = (zm0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                nn0 nn0Var2 = zm0Var.e;
                secureRandom.setSeed(nn0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = nn0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] o12 = nn0.o1();
                nn0Var2.c1 = o12;
                nn0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(o12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = nn0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    nn0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(nn0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = nn0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = nn0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = nn0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i21 = ((org.telegram.ui.ActionBar.n2) nn0Var2).currentAccount;
                ConnectionsManager.getInstance(i21).sendRequest(updatepasswordsettings, new xm0(zm0Var, i25));
                break;
            case 13:
                jn0 jn0Var = (jn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i41 = jn0Var.L;
                nn0 nn0Var3 = jn0Var.Q;
                nn0Var3.w1();
                jn0Var.J = false;
                if (tL_error5 == null) {
                    jn0Var.s();
                    jn0Var.r();
                    ((qm0) nn0Var3.B1).c(nn0Var3.E, (String) nn0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new yl0(nn0Var3, 6), null);
                    break;
                } else {
                    jn0Var.K = tL_error5.text;
                    if ((i41 == 3 && ((i24 = jn0Var.M) == 4 || i24 == 2)) || ((i41 == 2 && ((i22 = jn0Var.M) == 4 || i22 == 3)) || (i41 == 4 && jn0Var.M == 2))) {
                        jn0Var.q();
                    }
                    if (i41 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(jn0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i41 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(jn0Var, NotificationCenter.didReceiveCall);
                    }
                    jn0Var.I = true;
                    if (i41 != 3) {
                        i23 = ((org.telegram.ui.ActionBar.n2) nn0Var3).currentAccount;
                        org.telegram.ui.Components.g5.e0(i23, tL_error5, nn0Var3, verifyphone, new Object[0]);
                    }
                    nn0Var3.M1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            jn0Var.c(true);
                            nn0Var3.J1(null, 0, true);
                            break;
                        }
                    } else {
                        int i42 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = jn0Var.d;
                            if (i42 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i42].setText("");
                                i42++;
                            }
                        }
                    }
                }
                break;
            case 14:
                vo0.U((vo0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                vo0.b0((vo0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                vo0 vo0Var = (vo0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                tf0 tf0Var = (tf0) this.c;
                vo0Var.E0 = tL_payments_validatedRequestedInfo;
                tf0Var.run();
                vo0Var.D0(false);
                vo0Var.H0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.C4.getImageKey())) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                ir0 ir0Var = (ir0) this.c;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(ir0Var);
                AndroidUtilities.runOnUIThread(ir0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                es0 es0Var = (es0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    es0Var.run();
                    break;
                }
                break;
            case 20:
                ku0 ku0Var = (ku0) this.b;
                ku0 ku0Var2 = (ku0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = ku0Var.d;
                if (photoViewer4.y != null && ku0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = ku0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = ku0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.D3();
                        if (ku0Var.d.Y7 > ku0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = ku0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = ku0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.x71 x71Var = photoViewer8.j1;
                            boolean z12 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = ku0Var.d;
                            x71Var.a(Math.min(photoViewer9.e8, ku0Var.d.f8), z12, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(ku0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(ku0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(ku0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.q.o(ku0Var.d.b8, sb2);
                        }
                        ku0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = ku0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, ku0Var.d.f8), false, photoViewer10.r);
                        }
                        ku0Var.d.Z7 = 0;
                    }
                    ku0Var.d.B3();
                    ku0Var.d.x3();
                    break;
                }
                break;
            case 21:
                mw0 mw0Var = (mw0) this.b;
                zn znVar = (zn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = mw0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    pnVar = new pn();
                    pnVar.a = messageObject;
                    pnVar.b = -1;
                    pnVar.c = -1;
                    pnVar.h = true;
                    pnVar.e = bArr5;
                    pnVar.e();
                }
                znVar.Gb(messageObject, pnVar);
                mw0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.ad.d0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.bi.q(R.string.UnknownError, org.telegram.ui.Components.ad.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i43 = 0; i43 < size2; i43++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i43);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.u2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.E2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.u2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.u2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.u2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) this.d;
                zn znVar2 = (zn) this.c;
                org.telegram.ui.Components.qo qoVar = uoVar.e;
                ViewGroup viewGroup = (ViewGroup) znVar2.fragmentView;
                RectF rectF = hh.j.h;
                hh.j.c(qoVar, viewGroup, rectF);
                profileActivity2.O5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.ad.D((vb) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.c;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ci.m6 m6Var = secretMediaViewer.e;
                if (m6Var != null) {
                    m6Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    d51 d51Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    d51Var.e = false;
                    d51Var.f = j3;
                    d51Var.h = j10;
                    d51Var.n.start();
                    d51Var.invalidate();
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                q81 q81Var = (q81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = q81Var.f0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    u81 u81Var = sessionsActivity.a;
                    if (u81Var != null) {
                        u81Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                r81 r81Var = (r81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = r81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    u81 u81Var2 = sessionsActivity2.a;
                    if (u81Var2 != null) {
                        u81Var2.l();
                        break;
                    }
                }
                break;
            default:
                t81 t81Var = (t81) this.b;
                String str11 = (String) this.d;
                k9 k9Var = (k9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    t81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ac0(21, t81Var, k9Var));
                    break;
                } catch (Exception e7) {
                    FileLog.e("Failed to pass qr code auth", e7);
                    AndroidUtilities.runOnUIThread(new s81(t81Var, i28));
                    k9Var.run();
                }
        }
    }

    public /* synthetic */ of0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
