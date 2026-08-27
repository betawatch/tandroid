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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a69, code lost:
    
        if (r7 != 16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a73, code lost:
    
        if (r7 == 3) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a7f, code lost:
    
        if (r7 == 16) goto L378;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a93  */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v50 */
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
        nt ntVar;
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
        int i22 = 3;
        int i23 = 2;
        hn hnVar = null;
        int i24 = 1;
        switch (this.a) {
            case 0:
                mf0 mf0Var = (mf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                int i25 = mf0Var.b0;
                ig0 ig0Var = mf0Var.o0;
                mf0Var.z(false);
                mf0Var.W = false;
                if (tL_error == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    mf0Var.w();
                    mf0Var.u();
                    i11 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    UserConfig.getInstance(i11).setCurrentUser(user);
                    i12 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    UserConfig.getInstance(i12).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i13 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    MessagesStorage.getInstance(i13).putUsersAndChats(arrayList2, null, true, true);
                    i14 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    MessagesController.getInstance(i14).putUser(user, false);
                    i15 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ig0Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i25 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    mf0Var.q(new ye0(mf0Var, 5));
                    break;
                } else {
                    mf0Var.a0 = tL_error.text;
                    mf0Var.W = false;
                    ig0Var.v1(false, true);
                    if (i25 == 3) {
                        int i26 = mf0Var.c0;
                        if (i26 != 4) {
                            i10 = 2;
                            if (i26 != 2) {
                                if (i26 != 17) {
                                    break;
                                }
                            }
                        }
                        mf0Var.t();
                        if (i25 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i25 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i25 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(mf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        mf0Var.V = z10;
                        if (i25 != 3) {
                            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                mf0Var.y();
                                break;
                            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                mf0Var.c(true);
                                ig0Var.u1(0, true, null, true);
                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                            int i27 = 0;
                            while (true) {
                                ur urVar = mf0Var.f;
                                wr[] wrVarArr = urVar.f;
                                if (i27 >= wrVarArr.length) {
                                    urVar.e = false;
                                    wrVarArr[0].requestFocus();
                                    break;
                                } else {
                                    wrVarArr[i27].setText("");
                                    i27++;
                                }
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i25 == i10) {
                        int i28 = mf0Var.c0;
                        if (i28 != 4) {
                        }
                        mf0Var.t();
                        if (i25 == 15) {
                        }
                        mf0Var.V = z10;
                        if (i25 != 3) {
                        }
                    }
                    if (i25 == 4) {
                        int i29 = mf0Var.c0;
                        if (i29 != i10) {
                            if (i29 != 17) {
                                break;
                            }
                        }
                        mf0Var.t();
                    }
                    if (i25 == 15) {
                    }
                    mf0Var.V = z10;
                    if (i25 != 3) {
                    }
                }
                break;
            case 1:
                mf0 mf0Var2 = (mf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                mf0Var2.k0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                mf0Var2.l0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    mf0Var2.c0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    mf0Var2.c0 = 16;
                }
                mf0Var2.o0.g1(bundle, tL_auth_sentCode, true);
                break;
            case 2:
                rf0 rf0Var = (rf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                lh.d dVar = rf0Var.b;
                ig0 ig0Var2 = rf0Var.v;
                rf0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    rf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.b5 parentLayout = ig0Var2.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.n2) i0.a.j(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i30 = 0;
                        while (i30 < size) {
                            Object obj = arrayList3.get(i30);
                            i30++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                            if ((n2Var2 instanceof do0) && n2Var2 != n2Var) {
                                n2Var2.removeSelfFromStack();
                            }
                        }
                        if (n2Var instanceof do0) {
                            z11 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ig0Var2.g1(rf0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                            break;
                        }
                    }
                    z11 = true;
                    ig0Var2.g1(rf0Var.d, (TLRPC.auth_SentCode) tLObject3, z11);
                } else if (tL_error2 != null) {
                    String str2 = tL_error2.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error2.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            rf0Var.e = tL_error2.text;
                            rf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.mc(ig0Var2.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error2.text));
                            break;
                        } else {
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new of0(rf0Var, 2), Integer.parseInt(tL_error2.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 3:
                rf0 rf0Var2 = (rf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.c;
                ig0 ig0Var3 = rf0Var2.v;
                ig0Var3.e = true;
                ig0 ig0Var4 = (ig0) LaunchActivity.N();
                if (ig0Var4 == null) {
                    i16 = ((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount;
                    ig0Var4 = new ig0(i16);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ig0Var4);
                    }
                }
                ig0Var4.q1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 4:
                hg0 hg0Var = (hg0) this.b;
                mj0 mj0Var = hg0Var.a;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (mj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = hg0Var.A;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i31 = 0;
                            while (true) {
                                if (i31 >= arrayList4.size()) {
                                    ntVar = null;
                                } else if (arrayList4.get(i31) == null || !((nt) arrayList4.get(i31)).a.equals(upperCase)) {
                                    i31++;
                                } else {
                                    ntVar = (nt) arrayList4.get(i31);
                                }
                            }
                            if (ntVar != null) {
                                mj0Var.setText(ntVar.c);
                                hg0Var.x = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                kh0 kh0Var = (kh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error3 != null) {
                    kh0Var.getClass();
                    break;
                } else {
                    kh0 kh0Var2 = kh0Var.o0.a;
                    int i32 = 0;
                    while (true) {
                        ArrayList arrayList5 = kh0Var2.f0;
                        if (i32 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i32)).link.equals(tL_chatInviteExported.link)) {
                            bh0 f02 = kh0Var2.f0();
                            arrayList5.remove(i32);
                            kh0Var2.h0(f02);
                            break;
                        } else {
                            i32++;
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ff0(9, (ib0) this.c, MessagesStorage.getInstance(((oj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.d).user_id)));
                break;
            case 7:
                oj0.m((oj0) this.b, (TLObject) this.c, (ib0) this.d);
                break;
            case 8:
                ck0 ck0Var = (ck0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ck0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(ck0Var, new ArrayList(), new ArrayList(), new ArrayList(), 20));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i33 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i33];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i34 = 0;
                    while (i34 < arrayList6.size()) {
                        fk0 fk0Var = (fk0) arrayList6.get(i34);
                        if (DialogObject.isEncryptedDialog(fk0Var.d)) {
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(notificationsCustomSettingsActivity.getMessagesController(), fk0Var.d);
                            if (n10 != null) {
                                strArr = strArr2;
                                c10 = 0;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(n10.user_id));
                                if (user2 != null) {
                                    strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i24] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                strArr = strArr2;
                                c10 = 0;
                            }
                        } else {
                            strArr = strArr2;
                            c10 = 0;
                            if (DialogObject.isUserDialog(fk0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(fk0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[0] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i24] = UserObject.getPublicUsername(user3);
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
                                    while (i17 < i33) {
                                        String str6 = strArr[i17];
                                        String str7 = strArr3[0];
                                        arrayList = arrayList6;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.y1.x(" ", str6, strArr3[0]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.y1.x(" ", str6, translitString)))) {
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
                                            arrayList8.add(fk0Var);
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
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-fk0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[0] = chat2.title;
                                        strArr3[i24] = ChatObject.getPublicUsername(chat2);
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
                                        while (i17 < i33) {
                                        }
                                    }
                                    arrayList = arrayList6;
                                }
                            }
                            i34++;
                            strArr2 = strArr;
                            arrayList6 = arrayList;
                            i24 = 1;
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
                        while (i17 < i33) {
                        }
                        arrayList = arrayList6;
                        i34++;
                        strArr2 = strArr;
                        arrayList6 = arrayList;
                        i24 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(ck0Var, arrayList8, arrayList9, arrayList7, 20));
                    break;
                }
                break;
            case 9:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b, (ArrayList) this.d, (Runnable) this.c);
                break;
            case 10:
                xm0 xm0Var = (xm0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                xm0Var.x1();
                if (tL_error4 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject5;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                    alertDialog$Builder.a.P = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(i22, xm0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = xm0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                    xm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    break;
                }
                break;
            case 11:
                ((mm0) this.b).S(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 12:
                km0 km0Var = (km0) this.b;
                byte[] bArr = (byte[]) this.d;
                String str9 = (String) this.c;
                SecureRandom secureRandom = Utilities.random;
                xm0 xm0Var2 = km0Var.e;
                secureRandom.setSeed(xm0Var2.F.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = xm0Var2.F;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = xm0.p1();
                xm0Var2.Y0 = p12;
                xm0Var2.X0 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xm0Var2.F.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    xm0Var2.a1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(xm0Var2.a1, 32, bArr3, 0, 16);
                    byte[] bArr4 = xm0Var2.Y0;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = xm0Var2.Y0;
                    tL_secureSecretSettings.secure_secret_id = xm0Var2.X0;
                    passwordinputsettings.flags |= 4;
                }
                i18 = ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount;
                ConnectionsManager.getInstance(i18).sendRequest(updatepasswordsettings, new im0(km0Var, i23));
                break;
            case 13:
                tm0 tm0Var = (tm0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i35 = tm0Var.H;
                xm0 xm0Var3 = tm0Var.M;
                xm0Var3.x1();
                tm0Var.F = false;
                if (tL_error5 == null) {
                    tm0Var.s();
                    tm0Var.r();
                    ((bm0) xm0Var3.x1).c(xm0Var3.A, (String) xm0Var3.o1.get("phone"), null, null, null, null, null, null, null, null, new hl0(xm0Var3, 6), null);
                    break;
                } else {
                    tm0Var.G = tL_error5.text;
                    if ((i35 == 3 && ((i21 = tm0Var.I) == 4 || i21 == 2)) || ((i35 == 2 && ((i19 = tm0Var.I) == 4 || i19 == 3)) || (i35 == 4 && tm0Var.I == 2))) {
                        tm0Var.q();
                    }
                    if (i35 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i35 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(tm0Var, NotificationCenter.didReceiveCall);
                    }
                    tm0Var.E = true;
                    if (i35 != 3) {
                        i20 = ((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount;
                        org.telegram.ui.Components.y4.f0(i20, tL_error5, xm0Var3, verifyphone, new Object[0]);
                    }
                    xm0Var3.N1(true, false);
                    if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            tm0Var.c(true);
                            xm0Var3.K1(0, true, null);
                            break;
                        }
                    } else {
                        int i36 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = tm0Var.d;
                            if (i36 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i36].setText("");
                                i36++;
                            }
                        }
                    }
                }
                break;
            case 14:
                do0.U((do0) this.b, (TL_account.Password) this.d, (byte[]) this.c);
                break;
            case 15:
                do0.b0((do0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 16:
                do0 do0Var = (do0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.d;
                ff0 ff0Var = (ff0) this.c;
                do0Var.A0 = tL_payments_validatedRequestedInfo;
                ff0Var.run();
                do0Var.D0(false);
                do0Var.H0(true, false);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                String str10 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.y4.getImageKey())) {
                    photoViewer.s4 = 2;
                    photoViewer.t4 = str10;
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                hq0 hq0Var = (hq0) this.c;
                photoViewer2.y4.setImageBitmap(bitmap);
                photoViewer2.p5.setUndoCutState(true);
                photoViewer2.a3(true, true);
                AndroidUtilities.cancelRunOnUIThread(hq0Var);
                AndroidUtilities.runOnUIThread(hq0Var, 800L);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.d;
                dr0 dr0Var = (dr0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer3.t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer3.y2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    dr0Var.run();
                    break;
                }
                break;
            case 20:
                it0 it0Var = (it0) this.b;
                it0 it0Var2 = (it0) this.d;
                int[] iArr = (int[]) this.c;
                PhotoViewer photoViewer4 = it0Var.d;
                if (photoViewer4.y != null && it0Var2 == photoViewer4.s8) {
                    photoViewer4.s8 = null;
                    photoViewer4.l8 = iArr[5];
                    photoViewer4.d8 = iArr[4];
                    photoViewer4.e8 = iArr[7];
                    float f10 = photoViewer4.b8 / 8;
                    PhotoViewer photoViewer5 = it0Var.d;
                    photoViewer4.m8 = (long) ((f10 * photoViewer5.d8) / 1000.0f);
                    if (photoViewer5.f8) {
                        PhotoViewer photoViewer6 = it0Var.d;
                        photoViewer6.W7 = iArr[8];
                        photoViewer6.D3();
                        if (it0Var.d.T7 > it0Var.d.U7 - 1) {
                            PhotoViewer photoViewer7 = it0Var.d;
                            photoViewer7.T7 = photoViewer7.U7 - 1;
                        }
                        PhotoViewer photoViewer8 = it0Var.d;
                        if (!photoViewer8.F4) {
                            org.telegram.ui.Components.y51 y51Var = photoViewer8.f1;
                            boolean z13 = photoViewer8.U7 > 1;
                            PhotoViewer photoViewer9 = it0Var.d;
                            y51Var.a(Math.min(photoViewer9.Z7, it0Var.d.a8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(it0Var.d.U7);
                            sb2.append(" w = ");
                            sb2.append(it0Var.d.X7);
                            sb2.append(" h = ");
                            sb2.append(it0Var.d.Y7);
                            sb2.append(" r = ");
                            i0.a.v(it0Var.d.W7, sb2);
                        }
                        it0Var.d.J7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = it0Var.d;
                        if (!photoViewer10.F4) {
                            photoViewer10.f1.a(Math.min(photoViewer10.Z7, it0Var.d.a8), false, photoViewer10.r);
                        }
                        it0Var.d.U7 = 0;
                    }
                    it0Var.d.B3();
                    it0Var.d.x3();
                    break;
                }
                break;
            case 21:
                jv0 jv0Var = (jv0) this.b;
                rn rnVar = (rn) this.d;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                MessageObject messageObject = jv0Var.D;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    hnVar = new hn();
                    hnVar.a = messageObject;
                    hnVar.b = -1;
                    hnVar.c = -1;
                    hnVar.h = true;
                    hnVar.e = bArr5;
                    hnVar.e();
                }
                rnVar.Cb(messageObject, hnVar);
                jv0Var.c(false);
                break;
            case 22:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                if (tL_error6 != null) {
                    org.telegram.ui.Components.mc.b0(tL_error6);
                    break;
                } else if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.c;
                profileActivity.getClass();
                int size2 = arrayList10.size();
                for (int i37 = 0; i37 < size2; i37++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i37);
                    if (!hashSet.contains(Long.valueOf(user4.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.q2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.A2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user4.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user4.id;
                            profileActivity.q2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user4.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.q2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.q2.participants_count++;
                        profileActivity.getMessagesController().putUser(user4, false);
                    }
                }
                profileActivity.e5(true, false);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.rn rnVar2 = (org.telegram.ui.Components.rn) this.d;
                rn rnVar3 = (rn) this.c;
                org.telegram.ui.Components.nn nnVar = rnVar2.e;
                ViewGroup viewGroup = (ViewGroup) rnVar3.fragmentView;
                RectF rectF = qg.j.h;
                qg.j.c(nnVar, viewGroup, rectF);
                profileActivity2.K5 = rectF.left;
                profileActivity2.N3();
                break;
            case 25:
                org.telegram.ui.Components.mc.D((qb) this.b, (TLRPC.User) this.d, ((TLRPC.Chat) this.c).title).j();
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.d;
                MessageObject messageObject2 = (MessageObject) this.c;
                secretMediaViewer.i0 = 0;
                secretMediaViewer.G0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ag.y1 y1Var = secretMediaViewer.e;
                if (y1Var != null) {
                    y1Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    v31 v31Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    v31Var.e = false;
                    v31Var.f = j10;
                    v31Var.h = j11;
                    v31Var.n.start();
                    v31Var.invalidate();
                    if (secretMediaViewer.d1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.m1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 27:
                f71 f71Var = (f71) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity = f71Var.b0;
                if (tL_error7 == null) {
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.f.remove(tL_authorization);
                    sessionsActivity.m0();
                    j71 j71Var = sessionsActivity.a;
                    if (j71Var != null) {
                        j71Var.l();
                    }
                    sessionsActivity.k0(true);
                    break;
                }
                break;
            case 28:
                g71 g71Var = (g71) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.c;
                SessionsActivity sessionsActivity2 = g71Var.a;
                if (tL_error8 == null) {
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.f.remove(tL_authorization2);
                    sessionsActivity2.m0();
                    j71 j71Var2 = sessionsActivity2.a;
                    if (j71Var2 != null) {
                        j71Var2.l();
                        break;
                    }
                }
                break;
            default:
                i71 i71Var = (i71) this.b;
                String str11 = (String) this.d;
                k9 k9Var = (k9) this.c;
                try {
                    byte[] decode = Base64.decode(str11.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    i71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new v80(25, i71Var, k9Var));
                    break;
                } catch (Exception e9) {
                    FileLog.e("Failed to pass qr code auth", e9);
                    AndroidUtilities.runOnUIThread(new h71(i71Var, i24));
                    k9Var.run();
                }
        }
    }

    public /* synthetic */ bf0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
