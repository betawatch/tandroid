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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a6c, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a76, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a82, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a96  */
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
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        qt qtVar;
        String[] strArr;
        char c10;
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
        mn mnVar = null;
        int i23 = 1;
        switch (this.a) {
            case 0:
                tf0 tf0Var = (tf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i24 = tf0Var.f0;
                qg0 qg0Var = tf0Var.s0;
                tf0Var.z(false);
                tf0Var.d0 = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    tf0Var.w();
                    tf0Var.v();
                    i11 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    qg0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i24 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    tf0Var.q(new gf0(tf0Var, 5));
                    break;
                } else {
                    tf0Var.e0 = tL_error.text;
                    tf0Var.d0 = false;
                    qg0Var.v1(false, true);
                    if (i24 == 3) {
                        int i25 = tf0Var.g0;
                        if (i25 != 4) {
                            i10 = 2;
                            if (i25 != 2) {
                                if (i25 != 17) {
                                    break;
                                }
                            }
                        }
                        tf0Var.u();
                        if (i24 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i24 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i24 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        tf0Var.c0 = z10;
                        if (i24 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                tf0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                tf0Var.c(true);
                                qg0Var.u1(0, true, null, true);
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i26 = 0;
                            while (true) {
                                yr yrVar = tf0Var.f;
                                as[] asVarArr = yrVar.f;
                                if (i26 >= asVarArr.length) {
                                    yrVar.e = false;
                                    asVarArr[0].requestFocus();
                                    break;
                                } else {
                                    asVarArr[i26].setText("");
                                    i26++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i24 == i10) {
                        int i27 = tf0Var.g0;
                        if (i27 != 4) {
                        }
                        tf0Var.u();
                        if (i24 == 15) {
                        }
                        tf0Var.c0 = z10;
                        if (i24 != 3) {
                        }
                    }
                    if (i24 == 4) {
                        int i28 = tf0Var.g0;
                        if (i28 != i10) {
                            if (i28 != 17) {
                                break;
                            }
                        }
                        tf0Var.u();
                    }
                    if (i24 == 15) {
                    }
                    tf0Var.c0 = z10;
                    if (i24 != 3) {
                    }
                }
                break;
            case 1:
                tf0 tf0Var2 = (tf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                tf0Var2.o0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                tf0Var2.p0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    tf0Var2.g0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    tf0Var2.g0 = 16;
                }
                tf0Var2.s0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                zf0 zf0Var = (zf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                ci.d dVar = zf0Var.b;
                qg0 qg0Var2 = zf0Var.v;
                zf0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    zf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.b5 parentLayout = qg0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.m2) org.telegram.ui.Cells.c1.i(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj = arrayList3.get(i29);
                            i29++;
                            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                            if ((m2Var2 instanceof oo0) && m2Var2 != m2Var) {
                                m2Var2.removeSelfFromStack();
                            }
                        }
                        if (m2Var instanceof oo0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            qg0Var2.g1(zf0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    qg0Var2.g1(zf0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            zf0Var.e = tL_error2.text;
                            zf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.xc(qg0Var2.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            qg0Var2.u1(0, true, null, true);
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new vf0(zf0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                zf0 zf0Var2 = (zf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                qg0 qg0Var3 = zf0Var2.v;
                qg0Var3.e = true;
                qg0 qg0Var4 = (qg0) LaunchActivity.N();
                if (qg0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.m2) qg0Var3).currentAccount;
                    qg0Var4 = new qg0(i16);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(qg0Var4);
                    }
                }
                qg0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                pg0 pg0Var = (pg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                uj0 uj0Var = pg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (uj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = pg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= arrayList4.size()) {
                                    qtVar = null;
                                } else if (arrayList4.get(i30) == null || !((qt) arrayList4.get(i30)).a.equals(upperCase)) {
                                    i30++;
                                } else {
                                    qtVar = (qt) arrayList4.get(i30);
                                }
                            }
                            if (qtVar != null) {
                                uj0Var.setText(qtVar.c);
                                pg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                sh0 sh0Var = (sh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    sh0Var.getClass();
                    break;
                } else {
                    sh0 sh0Var2 = sh0Var.s0.a;
                    int i31 = 0;
                    while (true) {
                        ArrayList arrayList5 = sh0Var2.j0;
                        if (i31 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i31)).link.equals(tL_chatInviteExported.link)) {
                            jh0 f02 = sh0Var2.f0();
                            arrayList5.remove(i31);
                            sh0Var2.h0(f02);
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new sj0(2, (bt) this.c, MessagesStorage.getInstance(((wj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                wj0.m((wj0) this.b, (TLObject) this.c, (bt) this.d);
                break;
            case 8:
                kk0 kk0Var = (kk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = kk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(kk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 26));
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
                        nk0 nk0Var = (nk0) arrayList6.get(i33);
                        if (DialogObject.isEncryptedDialog(nk0Var.d)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.f0.l(notificationsCustomSettingsActivity.getMessagesController(), nk0Var.d);
                            if (l4 != null) {
                                strArr = strArr2;
                                c10 = 0;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(l4.user_id));
                                if (user2 != null) {
                                    strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                strArr = strArr2;
                                c10 = 0;
                            }
                        } else {
                            strArr = strArr2;
                            c10 = 0;
                            if (DialogObject.isUserDialog(nk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(nk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[0] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i23] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[c10];
                                    strArr3[c10] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                    str = strArr3[c10];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i17 = 0;
                                    boolean z12 = false;
                                    while (i17 < i32) {
                                        String str6 = strArr[i17];
                                        String str7 = strArr3[0];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, translitString)))) {
                                            String str8 = strArr3[1];
                                            r32 = (str8 == null || !str8.startsWith(str6)) ? z12 : 2;
                                        } else {
                                            r32 = 1;
                                        }
                                        if (r32 != 0) {
                                            if (r32 == 1) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr3[1], null, "@" + str6));
                                            }
                                            arrayList8.add(nk0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i17++;
                                            z12 = r32;
                                            arrayList6 = arrayList;
                                        }
                                    }
                                }
                                arrayList = arrayList6;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-nk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[0] = chat2.title;
                                        strArr3[i23] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[c10];
                                        strArr3[c10] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                                        str = strArr3[c10];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i17 = 0;
                                        boolean z122 = false;
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
                        String str522 = strArr3[c10];
                        strArr3[c10] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c10]);
                        str = strArr3[c10];
                        if (str != null) {
                        }
                        i17 = 0;
                        boolean z1222 = false;
                        while (i17 < i32) {
                        }
                        arrayList = arrayList6;
                        i33++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i23 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(kk0Var, arrayList8, arrayList9, arrayList7, 26));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                gn0 gn0Var = (gn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                gn0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ow(25, gn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = gn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    gn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    gn0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((um0) this.b).c(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                sm0 sm0Var = (sm0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                gn0 gn0Var2 = sm0Var.e;
                secureRandom.setSeed(gn0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = gn0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = gn0.p1();
                gn0Var2.c1 = p12;
                gn0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = gn0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    gn0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(gn0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = gn0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = gn0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = gn0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i18 = ((org.telegram.ui.ActionBar.m2) gn0Var2).currentAccount;
                ConnectionsManager.getInstance(i18).sendRequest(updatepasswordsettings, new qm0(sm0Var, i22));
                break;
            case 13:
                cn0 cn0Var = (cn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i34 = cn0Var.L;
                gn0 gn0Var3 = cn0Var.Q;
                gn0Var3.x1();
                cn0Var.J = false;
                if (tL_error5 == null) {
                    cn0Var.s();
                    cn0Var.r();
                    ((jm0) gn0Var3.B1).c(gn0Var3.E, (String) gn0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new ql0(gn0Var3, 6), null);
                    break;
                } else {
                    cn0Var.K = tL_error5.text;
                    if ((i34 == 3 && ((i21 = cn0Var.M) == 4 || i21 == 2)) || ((i34 == 2 && ((i19 = cn0Var.M) == 4 || i19 == 3)) || (i34 == 4 && cn0Var.M == 2))) {
                        cn0Var.q();
                    }
                    if (i34 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(cn0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i34 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(cn0Var, NotificationCenter.didReceiveCall);
                    }
                    cn0Var.I = true;
                    if (i34 != 3) {
                        i20 = ((org.telegram.ui.ActionBar.m2) gn0Var3).currentAccount;
                        org.telegram.ui.Components.e5.f0(i20, tL_error5, gn0Var3, verifyphone, new Object[0]);
                    }
                    gn0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            cn0Var.c(true);
                            gn0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i35 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = cn0Var.d;
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
                oo0.U((oo0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                oo0.b0((oo0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                oo0 oo0Var = (oo0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                sj0 sj0Var = (sj0) this.c;
                oo0Var.E0 = tL_payments_validatedRequestedInfo;
                sj0Var.run();
                oo0Var.D0(false);
                oo0Var.H0(true, false);
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
                ar0 ar0Var = (ar0) this.c;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.Z2(true, true);
                AndroidUtilities.cancelRunOnUIThread(ar0Var);
                AndroidUtilities.runOnUIThread(ar0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                wr0 wr0Var = (wr0) this.c;
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
                    wr0Var.run();
                    break;
                }
                break;
            case 20:
                bu0 bu0Var = (bu0) this.b;
                bu0 bu0Var2 = (bu0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = bu0Var.d;
                if (photoViewer4.y != null && bu0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = bu0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = bu0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.C3();
                        if (bu0Var.d.Y7 > bu0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = bu0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = bu0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.f71 f71Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = bu0Var.d;
                            f71Var.a(Math.min(photoViewer9.e8, bu0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(bu0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(bu0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(bu0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.f0.n(bu0Var.d.b8, sb2);
                        }
                        bu0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = bu0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, bu0Var.d.f8), false, photoViewer10.r);
                        }
                        bu0Var.d.Z7 = 0;
                    }
                    bu0Var.d.A3();
                    bu0Var.d.w3();
                    break;
                }
                break;
            case 21:
                dw0 dw0Var = (dw0) this.b;
                wn wnVar = (wn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = dw0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    mnVar = new mn();
                    mnVar.a = messageObject;
                    mnVar.b = -1;
                    mnVar.c = -1;
                    mnVar.h = true;
                    mnVar.e = bArr5;
                    mnVar.e();
                }
                wnVar.Cb(messageObject, mnVar);
                dw0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.xc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.ok.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(premiumPreviewFragment), null);
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
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) this.d;
                wn wnVar2 = (wn) this.c;
                org.telegram.ui.Components.ao aoVar = foVar.e;
                ViewGroup viewGroup = (ViewGroup) wnVar2.fragmentView;
                RectF rectF = hh.k.h;
                hh.k.c(aoVar, viewGroup, rectF);
                profileActivity2.O5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.xc.D((ub) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
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
                    u41 u41Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    u41Var.e = false;
                    u41Var.f = j3;
                    u41Var.h = j10;
                    u41Var.n.start();
                    u41Var.invalidate();
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
                g81 g81Var = (g81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = g81Var.f0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    k81 k81Var = sessionsActivity.a;
                    if (k81Var != null) {
                        k81Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                h81 h81Var = (h81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = h81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    k81 k81Var2 = sessionsActivity2.a;
                    if (k81Var2 != null) {
                        k81Var2.l();
                        break;
                    }
                }
                break;
            default:
                j81 j81Var = (j81) this.b;
                String str11 = (String) this.d;
                l9 l9Var = (l9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    j81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new vb0(21, j81Var, l9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new i81(j81Var, i23));
                    l9Var.run();
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
