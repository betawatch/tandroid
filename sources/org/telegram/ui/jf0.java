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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a6a, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a74, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a80, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a94  */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v53 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        ut utVar;
        String[] strArr;
        char c3;
        ArrayList arrayList;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i17;
        ?? r32;
        int i18;
        int i19;
        int i20;
        int i21;
        TLRPC.Message message;
        int i22 = 2;
        pn pnVar = null;
        int i23 = 1;
        switch (this.a) {
            case 0:
                tf0 tf0Var = (tf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i24 = tf0Var.c0;
                pg0 pg0Var = tf0Var.p0;
                tf0Var.z(false);
                tf0Var.a0 = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    tf0Var.w();
                    tf0Var.v();
                    i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    pg0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i24 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    tf0Var.q(new gf0(tf0Var, 5));
                    break;
                } else {
                    tf0Var.b0 = tL_error.text;
                    tf0Var.a0 = false;
                    pg0Var.v1(false, true);
                    if (i24 == 3) {
                        int i25 = tf0Var.d0;
                        if (i25 != 4) {
                            i10 = 2;
                            if (i25 != 2) {
                                if (i25 != 17) {
                                    break;
                                }
                            }
                        }
                        tf0Var.t();
                        if (i24 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                            z4 = true;
                        } else if (i24 == 2) {
                            z4 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z4 = true;
                            if (i24 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        tf0Var.W = z4;
                        if (i24 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                tf0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                tf0Var.c(true);
                                pg0Var.u1(0, true, null, true);
                                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i26 = 0;
                            while (true) {
                                as asVar = tf0Var.f;
                                ds[] dsVarArr = asVar.f;
                                if (i26 >= dsVarArr.length) {
                                    asVar.e = false;
                                    dsVarArr[0].requestFocus();
                                    break;
                                } else {
                                    dsVarArr[i26].setText("");
                                    i26++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i24 == i10) {
                        int i27 = tf0Var.d0;
                        if (i27 != 4) {
                        }
                        tf0Var.t();
                        if (i24 == 15) {
                        }
                        tf0Var.W = z4;
                        if (i24 != 3) {
                        }
                    }
                    if (i24 == 4) {
                        int i28 = tf0Var.d0;
                        if (i28 != i10) {
                            if (i28 != 17) {
                                break;
                            }
                        }
                        tf0Var.t();
                    }
                    if (i24 == 15) {
                    }
                    tf0Var.W = z4;
                    if (i24 != 3) {
                    }
                }
                break;
            case 1:
                tf0 tf0Var2 = (tf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                tf0Var2.l0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                tf0Var2.m0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    tf0Var2.d0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    tf0Var2.d0 = 16;
                }
                tf0Var2.p0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                yf0 yf0Var = (yf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                ph.d dVar = yf0Var.b;
                pg0 pg0Var2 = yf0Var.v;
                yf0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    yf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.e5 parentLayout = pg0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.p2) ai.j(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj = arrayList3.get(i29);
                            i29++;
                            org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                            if ((p2Var2 instanceof lo0) && p2Var2 != p2Var) {
                                p2Var2.removeSelfFromStack();
                            }
                        }
                        if (p2Var instanceof lo0) {
                            z10 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            pg0Var2.g1(yf0Var.d, (TLRPC.auth_SentCode) tLObject3, z10);
                            break;
                        }
                    }
                    z10 = true;
                    pg0Var2.g1(yf0Var.d, (TLRPC.auth_SentCode) tLObject3, z10);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            yf0Var.e = tL_error2.text;
                            yf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.qc(pg0Var2.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            pg0Var2.u1(0, true, null, true);
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new vf0(yf0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                yf0 yf0Var2 = (yf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                pg0 pg0Var3 = yf0Var2.v;
                pg0Var3.e = true;
                pg0 pg0Var4 = (pg0) LaunchActivity.N();
                if (pg0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                    pg0Var4 = new pg0(i16);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(pg0Var4);
                    }
                }
                pg0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                og0 og0Var = (og0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                sj0 sj0Var = og0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (sj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = og0Var.B;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= arrayList4.size()) {
                                    utVar = null;
                                } else if (arrayList4.get(i30) == null || !((ut) arrayList4.get(i30)).a.equals(upperCase)) {
                                    i30++;
                                } else {
                                    utVar = (ut) arrayList4.get(i30);
                                }
                            }
                            if (utVar != null) {
                                sj0Var.setText(utVar.c);
                                og0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                rh0 rh0Var = (rh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    rh0Var.getClass();
                    break;
                } else {
                    rh0 rh0Var2 = rh0Var.p0.a;
                    int i31 = 0;
                    while (true) {
                        ArrayList arrayList5 = rh0Var2.g0;
                        if (i31 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i31)).link.equals(tL_chatInviteExported.link)) {
                            ih0 f02 = rh0Var2.f0();
                            arrayList5.remove(i31);
                            rh0Var2.h0(f02);
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ie0(14, (org.telegram.ui.Components.vk) this.c, MessagesStorage.getInstance(((uj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                uj0.m((uj0) this.b, (TLObject) this.c, (org.telegram.ui.Components.vk) this.d);
                break;
            case 8:
                ik0 ik0Var = (ik0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ik0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new c30(ik0Var, new ArrayList(), new ArrayList(), new ArrayList(), 16));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i32 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i32];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i33 = 0;
                    while (i33 < arrayList6.size()) {
                        lk0 lk0Var = (lk0) arrayList6.get(i33);
                        if (DialogObject.isEncryptedDialog(lk0Var.d)) {
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(notificationsCustomSettingsActivity.getMessagesController(), lk0Var.d);
                            if (n10 != null) {
                                strArr = strArr2;
                                c3 = 0;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(n10.user_id));
                                if (user2 != null) {
                                    strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                strArr = strArr2;
                                c3 = 0;
                            }
                        } else {
                            strArr = strArr2;
                            c3 = 0;
                            if (DialogObject.isUserDialog(lk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(lk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[0] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[c3];
                                    strArr3[c3] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c3]);
                                    str = strArr3[c3];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i17 = 0;
                                    boolean z11 = false;
                                    while (i17 < i32) {
                                        String str6 = strArr[i17];
                                        String str7 = strArr3[0];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.y3.w(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.y3.w(" ", str6, translitString)))) {
                                            String str8 = strArr3[1];
                                            r32 = (str8 == null || !str8.startsWith(str6)) ? z11 : 2;
                                        } else {
                                            r32 = 1;
                                        }
                                        if (r32 != 0) {
                                            if (r32 == 1) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str6));
                                            }
                                            arrayList8.add(lk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i17++;
                                            z11 = r32;
                                            arrayList6 = arrayList;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-lk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[0] = chat2.title;
                                        strArr3[i23] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[c3];
                                        strArr3[c3] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c3]);
                                        str = strArr3[c3];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i17 = 0;
                                        boolean z112 = false;
                                        while (i17 < i32) {
                                        }
                                    }
                                    arrayList = arrayList6;
                                }
                            }
                            i33++;
                            strArr2 = strArr;
                            arrayList6 = arrayList;
                            i23 = 1;
                        }
                        chat = null;
                        String str522 = strArr3[c3];
                        strArr3[c3] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c3]);
                        str = strArr3[c3];
                        if (str != null) {
                        }
                        i17 = 0;
                        boolean z1122 = false;
                        while (i17 < i32) {
                        }
                        arrayList = arrayList6;
                        i33++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i23 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new c30(ik0Var, arrayList8, arrayList9, arrayList7, 16));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                fn0 fn0Var = (fn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                fn0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                    alertDialog$Builder.a.Q = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vl0(i22, fn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = fn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    fn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    fn0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((tm0) this.b).D(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                rm0 rm0Var = (rm0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                fn0 fn0Var2 = rm0Var.e;
                secureRandom.setSeed(fn0Var2.G.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = fn0Var2.G;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = fn0.p1();
                fn0Var2.Z0 = p12;
                fn0Var2.Y0 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = fn0Var2.G.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    fn0Var2.b1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(fn0Var2.b1, 32, bArr3, 0, 16);
                    byte[] bArr4 = fn0Var2.Z0;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = fn0Var2.Z0;
                    tL_secureSecretSettings.secure_secret_id = fn0Var2.Y0;
                    passwordinputsettings.flags |= 4;
                }
                i18 = ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount;
                ConnectionsManager.getInstance(i18).sendRequest(updatepasswordsettings, new pm0(rm0Var, i22));
                break;
            case 13:
                bn0 bn0Var = (bn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i34 = bn0Var.I;
                fn0 fn0Var3 = bn0Var.N;
                fn0Var3.x1();
                bn0Var.G = false;
                if (tL_error5 == null) {
                    bn0Var.s();
                    bn0Var.r();
                    ((im0) fn0Var3.y1).c(fn0Var3.B, (String) fn0Var3.p1.get("phone"), null, null, null, null, null, null, null, null, new pl0(fn0Var3, 6), null);
                    break;
                } else {
                    bn0Var.H = tL_error5.text;
                    if ((i34 == 3 && ((i21 = bn0Var.J) == 4 || i21 == 2)) || ((i34 == 2 && ((i19 = bn0Var.J) == 4 || i19 == 3)) || (i34 == 4 && bn0Var.J == 2))) {
                        bn0Var.q();
                    }
                    if (i34 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(bn0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i34 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(bn0Var, NotificationCenter.didReceiveCall);
                    }
                    bn0Var.F = true;
                    if (i34 != 3) {
                        i20 = ((org.telegram.ui.ActionBar.p2) fn0Var3).currentAccount;
                        org.telegram.ui.Components.z4.f0(i20, tL_error5, fn0Var3, verifyphone, new Object[0]);
                    }
                    fn0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            bn0Var.c(true);
                            fn0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i35 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = bn0Var.d;
                            if (i35 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i35].setText("");
                                i35++;
                            }
                        }
                    }
                }
                break;
            case 14:
                lo0.U((lo0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                lo0.b0((lo0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                lo0 lo0Var = (lo0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                ie0 ie0Var = (ie0) this.c;
                lo0Var.B0 = tL_payments_validatedRequestedInfo;
                ie0Var.run();
                lo0Var.D0(false);
                lo0Var.H0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.z4.getImageKey())) {
                    photoViewer.t4 = 2;
                    photoViewer.u4 = str10;
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                tq0 tq0Var = (tq0) this.c;
                photoViewer2.z4.setImageBitmap(bitmap);
                photoViewer2.q5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(tq0Var);
                AndroidUtilities.runOnUIThread(tq0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                qr0 qr0Var = (qr0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.u3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.z2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    qr0Var.run();
                    break;
                }
                break;
            case 20:
                vt0 vt0Var = (vt0) this.b;
                vt0 vt0Var2 = (vt0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = vt0Var.d;
                if (photoViewer4.y != null && vt0Var2 == photoViewer4.t8) {
                    photoViewer4.t8 = null;
                    photoViewer4.m8 = iArr[5];
                    photoViewer4.e8 = iArr[4];
                    photoViewer4.f8 = iArr[7];
                    float f10 = photoViewer4.c8 / 8;
                    PhotoViewer photoViewer5 = vt0Var.d;
                    photoViewer4.n8 = (long) ((f10 * photoViewer5.e8) / 1000.0f);
                    if (photoViewer5.g8) {
                        PhotoViewer photoViewer6 = vt0Var.d;
                        photoViewer6.X7 = iArr[8];
                        photoViewer6.D3();
                        if (vt0Var.d.U7 > vt0Var.d.V7 - 1) {
                            PhotoViewer photoViewer7 = vt0Var.d;
                            photoViewer7.U7 = photoViewer7.V7 - 1;
                        }
                        PhotoViewer photoViewer8 = vt0Var.d;
                        if (!photoViewer8.G4) {
                            org.telegram.ui.Components.u61 u61Var = photoViewer8.g1;
                            boolean z12 = photoViewer8.V7 > 1;
                            PhotoViewer photoViewer9 = vt0Var.d;
                            u61Var.a(Math.min(photoViewer9.a8, vt0Var.d.b8), z12, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb = new StringBuilder("compressionsCount = ");
                            sb.append(vt0Var.d.V7);
                            sb.append(" w = ");
                            sb.append(vt0Var.d.Y7);
                            sb.append(" h = ");
                            sb.append(vt0Var.d.Z7);
                            sb.append(" r = ");
                            kf.k0.t(vt0Var.d.X7, sb);
                        }
                        vt0Var.d.K7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = vt0Var.d;
                        if (!photoViewer10.G4) {
                            photoViewer10.g1.a(Math.min(photoViewer10.a8, vt0Var.d.b8), false, photoViewer10.r);
                        }
                        vt0Var.d.V7 = 0;
                    }
                    vt0Var.d.B3();
                    vt0Var.d.x3();
                    break;
                }
                break;
            case 21:
                yv0 yv0Var = (yv0) this.b;
                zn znVar = (zn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = yv0Var.E;
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
                znVar.Cb(messageObject, pnVar);
                yv0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.qc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i36 = 0; i36 < size2; i36++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i36);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.r2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.B2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.r2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.r2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.r2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.yn ynVar = (org.telegram.ui.Components.yn) this.d;
                zn znVar2 = (zn) this.c;
                org.telegram.ui.Components.un unVar = ynVar.e;
                ViewGroup viewGroup = (ViewGroup) znVar2.fragmentView;
                RectF rectF = ug.i.h;
                ug.i.c(unVar, viewGroup, rectF);
                profileActivity2.L5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.qc.D((ub) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.c;
                secretMediaViewer.j0 = 0;
                secretMediaViewer.H0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ah.e eVar = secretMediaViewer.e;
                if (eVar != null) {
                    eVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    p41 p41Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    p41Var.e = false;
                    p41Var.f = j10;
                    p41Var.h = j11;
                    p41Var.n.start();
                    p41Var.invalidate();
                    if (secretMediaViewer.e1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.n1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                e81 e81Var = (e81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = e81Var.c0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    i81 i81Var = sessionsActivity.a;
                    if (i81Var != null) {
                        i81Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                f81 f81Var = (f81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = f81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    i81 i81Var2 = sessionsActivity2.a;
                    if (i81Var2 != null) {
                        i81Var2.l();
                        break;
                    }
                }
                break;
            default:
                h81 h81Var = (h81) this.b;
                String str11 = (String) this.d;
                o9 o9Var = (o9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    h81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ub0(21, h81Var, o9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new g81(h81Var, i23));
                    o9Var.run();
                }
        }
    }

    public /* synthetic */ jf0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
