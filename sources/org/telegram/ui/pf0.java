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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
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
        vt vtVar;
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
        rn rnVar = null;
        int i23 = 1;
        switch (this.a) {
            case 0:
                zf0 zf0Var = (zf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i24 = zf0Var.f0;
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
                    if (i24 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    zf0Var.q(new mf0(zf0Var, 5));
                    break;
                } else {
                    zf0Var.e0 = tL_error.text;
                    zf0Var.d0 = false;
                    wg0Var.v1(false, true);
                    if (i24 == 3) {
                        int i25 = zf0Var.g0;
                        if (i25 != 4) {
                            i10 = 2;
                            if (i25 != 2) {
                                if (i25 != 17) {
                                    break;
                                }
                            }
                        }
                        zf0Var.u();
                        if (i24 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i24 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i24 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        zf0Var.c0 = z10;
                        if (i24 != 3) {
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
                            int i26 = 0;
                            while (true) {
                                ds dsVar = zf0Var.f;
                                gs[] gsVarArr = dsVar.f;
                                if (i26 >= gsVarArr.length) {
                                    dsVar.e = false;
                                    gsVarArr[0].requestFocus();
                                    break;
                                } else {
                                    gsVarArr[i26].setText("");
                                    i26++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i24 == i10) {
                        int i27 = zf0Var.g0;
                        if (i27 != 4) {
                        }
                        zf0Var.u();
                        if (i24 == 15) {
                        }
                        zf0Var.c0 = z10;
                        if (i24 != 3) {
                        }
                    }
                    if (i24 == 4) {
                        int i28 = zf0Var.g0;
                        if (i28 != i10) {
                            if (i28 != 17) {
                                break;
                            }
                        }
                        zf0Var.u();
                    }
                    if (i24 == 15) {
                    }
                    zf0Var.c0 = z10;
                    if (i24 != 3) {
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
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj = arrayList3.get(i29);
                            i29++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                            if ((n2Var2 instanceof wo0) && n2Var2 != n2Var) {
                                n2Var2.removeSelfFromStack();
                            }
                        }
                        if (n2Var instanceof wo0) {
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
                            new org.telegram.ui.Components.vc(wg0Var2.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
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
                ak0 ak0Var = vg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (ak0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = vg0Var.E;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= arrayList4.size()) {
                                    vtVar = null;
                                } else if (arrayList4.get(i30) == null || !((vt) arrayList4.get(i30)).a.equals(upperCase)) {
                                    i30++;
                                } else {
                                    vtVar = (vt) arrayList4.get(i30);
                                }
                            }
                            if (vtVar != null) {
                                ak0Var.setText(vtVar.c);
                                vg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                yh0 yh0Var = (yh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    yh0Var.getClass();
                    break;
                } else {
                    yh0 yh0Var2 = yh0Var.s0.a;
                    int i31 = 0;
                    while (true) {
                        ArrayList arrayList5 = yh0Var2.j0;
                        if (i31 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i31)).link.equals(tL_chatInviteExported.link)) {
                            ph0 f02 = yh0Var2.f0();
                            arrayList5.remove(i31);
                            yh0Var2.h0(f02);
                            break;
                        } else {
                            i31++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ma0(27, (mj0) this.c, MessagesStorage.getInstance(((ck0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                ck0.m((ck0) this.b, (TLObject) this.c, (mj0) this.d);
                break;
            case 8:
                qk0 qk0Var = (qk0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0(qk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 25));
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
                        tk0 tk0Var = (tk0) arrayList6.get(i33);
                        if (DialogObject.isEncryptedDialog(tk0Var.d)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.y0.l(notificationsCustomSettingsActivity.getMessagesController(), tk0Var.d);
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
                            if (DialogObject.isUserDialog(tk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(tk0Var.d));
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
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.y0.w(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.y0.w(" ", str6, translitString)))) {
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
                                            arrayList8.add(tk0Var);
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
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-tk0Var.d));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0(qk0Var, arrayList8, arrayList9, arrayList7, 25));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                on0 on0Var = (on0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                on0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new d20(23, on0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = on0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    on0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    on0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((cn0) this.b).b(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                an0 an0Var = (an0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                on0 on0Var2 = an0Var.e;
                secureRandom.setSeed(on0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = on0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = on0.p1();
                on0Var2.c1 = p12;
                on0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = on0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    on0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(on0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = on0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = on0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = on0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i18 = ((org.telegram.ui.ActionBar.n2) on0Var2).currentAccount;
                ConnectionsManager.getInstance(i18).sendRequest(updatepasswordsettings, new ym0(an0Var, i22));
                break;
            case 13:
                kn0 kn0Var = (kn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i34 = kn0Var.L;
                on0 on0Var3 = kn0Var.Q;
                on0Var3.x1();
                kn0Var.J = false;
                if (tL_error5 == null) {
                    kn0Var.s();
                    kn0Var.r();
                    ((rm0) on0Var3.B1).c(on0Var3.E, (String) on0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new xl0(on0Var3, 6), null);
                    break;
                } else {
                    kn0Var.K = tL_error5.text;
                    if ((i34 == 3 && ((i21 = kn0Var.M) == 4 || i21 == 2)) || ((i34 == 2 && ((i19 = kn0Var.M) == 4 || i19 == 3)) || (i34 == 4 && kn0Var.M == 2))) {
                        kn0Var.q();
                    }
                    if (i34 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(kn0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i34 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(kn0Var, NotificationCenter.didReceiveCall);
                    }
                    kn0Var.I = true;
                    if (i34 != 3) {
                        i20 = ((org.telegram.ui.ActionBar.n2) on0Var3).currentAccount;
                        org.telegram.ui.Components.c5.f0(i20, tL_error5, on0Var3, verifyphone, new Object[0]);
                    }
                    on0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            kn0Var.c(true);
                            on0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i35 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = kn0Var.d;
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
                wo0.U((wo0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                wo0.b0((wo0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                wo0 wo0Var = (wo0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                ml0 ml0Var = (ml0) this.c;
                wo0Var.E0 = tL_payments_validatedRequestedInfo;
                ml0Var.run();
                wo0Var.D0(false);
                wo0Var.H0(true, false);
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
                photoViewer2.Z2(true, true);
                AndroidUtilities.cancelRunOnUIThread(ir0Var);
                AndroidUtilities.runOnUIThread(ir0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                ds0 ds0Var = (ds0) this.c;
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
                    ds0Var.run();
                    break;
                }
                break;
            case 20:
                ju0 ju0Var = (ju0) this.b;
                ju0 ju0Var2 = (ju0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = ju0Var.d;
                if (photoViewer4.y != null && ju0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = ju0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = ju0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.C3();
                        if (ju0Var.d.Y7 > ju0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = ju0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = ju0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.s61 s61Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = ju0Var.d;
                            s61Var.a(Math.min(photoViewer9.e8, ju0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(ju0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(ju0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(ju0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.y0.n(ju0Var.d.b8, sb2);
                        }
                        ju0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = ju0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, ju0Var.d.f8), false, photoViewer10.r);
                        }
                        ju0Var.d.Z7 = 0;
                    }
                    ju0Var.d.A3();
                    ju0Var.d.w3();
                    break;
                }
                break;
            case 21:
                mw0 mw0Var = (mw0) this.b;
                bo boVar = (bo) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = mw0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    rnVar = new rn();
                    rnVar.a = messageObject;
                    rnVar.b = -1;
                    rnVar.c = -1;
                    rnVar.h = true;
                    rnVar.e = bArr5;
                    rnVar.e();
                }
                boVar.Cb(messageObject, rnVar);
                mw0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.vc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.y0.p(R.string.UnknownError, org.telegram.ui.Components.vc.a0(premiumPreviewFragment), null);
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
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) this.d;
                bo boVar2 = (bo) this.c;
                org.telegram.ui.Components.zn znVar = eoVar.e;
                ViewGroup viewGroup = (ViewGroup) boVar2.fragmentView;
                RectF rectF = hh.k.h;
                hh.k.c(znVar, viewGroup, rectF);
                profileActivity2.O5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.vc.D((ub) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
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
                ci.n6 n6Var = secretMediaViewer.e;
                if (n6Var != null) {
                    n6Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    b51 b51Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j3 = message2.destroyTimeMillis;
                    long j10 = message2.ttl;
                    b51Var.e = false;
                    b51Var.f = j3;
                    b51Var.h = j10;
                    b51Var.n.start();
                    b51Var.invalidate();
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
                m81 m81Var = (m81) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = m81Var.f0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    q81 q81Var = sessionsActivity.a;
                    if (q81Var != null) {
                        q81Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                n81 n81Var = (n81) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = n81Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    q81 q81Var2 = sessionsActivity2.a;
                    if (q81Var2 != null) {
                        q81Var2.l();
                        break;
                    }
                }
                break;
            default:
                p81 p81Var = (p81) this.b;
                String str11 = (String) this.d;
                l9 l9Var = (l9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    p81Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new bc0(21, p81Var, l9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new o81(p81Var, i23));
                    l9Var.run();
                }
        }
    }

    public /* synthetic */ pf0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
