package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.ImageLocation;
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
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oe0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:411:0x0a3d, code lost:
    
        if (r5 != 16) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a47, code lost:
    
        if (r5 == 3) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a53, code lost:
    
        if (r5 == 16) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0b7b, code lost:
    
        if (r8 != 16) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0b85, code lost:
    
        if (r8 == 3) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b91, code lost:
    
        if (r8 == 16) goto L439;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ba8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        jt jtVar;
        int i19;
        ArrayList arrayList;
        int i20;
        String[] strArr;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        int i21;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TLRPC.Message message;
        int i28 = 5;
        int i29 = 2;
        kn knVar = null;
        int i30 = 0;
        int i31 = 1;
        switch (this.a) {
            case 0:
                re0 re0Var = (re0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                re0Var.M = fileLocation;
                re0Var.N = photoSize2.location;
                re0Var.e.h(ImageLocation.getForLocal(fileLocation), "50_50", re0Var.f, null);
                break;
            case 1:
                jf0 jf0Var = (jf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                int i32 = jf0Var.h0;
                gg0 gg0Var = jf0Var.u0;
                jf0Var.y(false);
                jf0Var.f0 = false;
                if (tL_error == null) {
                    Activity parentActivity = gg0Var.getParentActivity();
                    if (parentActivity != null) {
                        jf0Var.p(new wb0(9, jf0Var, parentActivity));
                        break;
                    }
                } else {
                    jf0Var.g0 = tL_error.text;
                    if (i32 == 3) {
                        int i33 = jf0Var.i0;
                        if (i33 != 4) {
                            i10 = 2;
                            if (i33 != 2) {
                                if (i33 != 17) {
                                }
                            }
                        }
                        jf0Var.s();
                        if (i32 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i32 == 2) {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z10 = true;
                            if (i32 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(jf0Var, NotificationCenter.didReceiveCall);
                            }
                        }
                        jf0Var.e0 = z10;
                        if (i32 != 3) {
                            i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                            org.telegram.ui.Components.g5.e0(i11, tL_error, gg0Var, confirmphone, new Object[0]);
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            jf0Var.x();
                            break;
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            jf0Var.c(true);
                            gg0Var.z1(0, true, null, true);
                            break;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i32 == i10) {
                        int i34 = jf0Var.i0;
                        if (i34 != 4) {
                        }
                        jf0Var.s();
                        if (i32 == 15) {
                        }
                        jf0Var.e0 = z10;
                        if (i32 != 3) {
                        }
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        jf0Var.x();
                    }
                    if (i32 == 4) {
                        int i35 = jf0Var.i0;
                        if (i35 != i10) {
                            if (i35 != 17) {
                            }
                        }
                        jf0Var.s();
                    }
                    if (i32 == 15) {
                    }
                    jf0Var.e0 = z10;
                    if (i32 != 3) {
                    }
                    if (!tL_error.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    jf0Var.x();
                }
                break;
            case 2:
                jf0 jf0Var2 = (jf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i36 = jf0Var2.h0;
                gg0 gg0Var2 = jf0Var2.u0;
                jf0Var2.y(false);
                jf0Var2.f0 = false;
                if (tL_error2 == null) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    jf0Var2.v();
                    jf0Var2.t();
                    i13 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                    UserConfig.getInstance(i13).setCurrentUser(user);
                    i14 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                    UserConfig.getInstance(i14).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    i15 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                    MessagesStorage.getInstance(i15).putUsersAndChats(arrayList2, null, true, true);
                    i16 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                    MessagesController.getInstance(i16).putUser(user, false);
                    i17 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    gg0Var2.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i36 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    jf0Var2.p(new we0(jf0Var2, i28));
                    break;
                } else {
                    jf0Var2.g0 = tL_error2.text;
                    jf0Var2.f0 = false;
                    gg0Var2.A1(false, true);
                    if (i36 == 3) {
                        int i37 = jf0Var2.i0;
                        if (i37 != 4) {
                            i12 = 2;
                            if (i37 != 2) {
                                if (i37 != 17) {
                                }
                            }
                        }
                        jf0Var2.s();
                        if (i36 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                            z11 = true;
                        } else if (i36 == 2) {
                            z11 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z11 = true;
                            if (i36 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveCall);
                            }
                        }
                        jf0Var2.e0 = z11;
                        if (i36 != 3) {
                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                jf0Var2.x();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                jf0Var2.c(true);
                                gg0Var2.z1(0, true, null, true);
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                            }
                            int i38 = 0;
                            while (true) {
                                vr vrVar = jf0Var2.f;
                                xr[] xrVarArr = vrVar.f;
                                if (i38 >= xrVarArr.length) {
                                    vrVar.e = false;
                                    xrVarArr[0].requestFocus();
                                    break;
                                } else {
                                    xrVarArr[i38].setText("");
                                    i38++;
                                }
                            }
                        }
                    } else {
                        i12 = 2;
                    }
                    if (i36 == i12) {
                        int i39 = jf0Var2.i0;
                        if (i39 != 4) {
                        }
                        jf0Var2.s();
                        if (i36 == 15) {
                        }
                        jf0Var2.e0 = z11;
                        if (i36 != 3) {
                        }
                    }
                    if (i36 == 4) {
                        int i40 = jf0Var2.i0;
                        if (i40 != i12) {
                            if (i40 != 17) {
                            }
                        }
                        jf0Var2.s();
                    }
                    if (i36 == 15) {
                    }
                    jf0Var2.e0 = z11;
                    if (i36 != 3) {
                    }
                }
                break;
            case 3:
                jf0 jf0Var3 = (jf0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                jf0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                jf0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    jf0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    jf0Var3.i0 = 16;
                }
                jf0Var3.u0.l1(bundle, tL_auth_sentCode, true);
                break;
            case 4:
                of0 of0Var = (of0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                fi.d dVar = of0Var.b;
                gg0 gg0Var3 = of0Var.v;
                of0Var.s = -1;
                if (tLObject3 instanceof TLRPC.auth_SentCode) {
                    of0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.j5 parentLayout = gg0Var3.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i41 = 0;
                        while (i41 < size) {
                            Object obj = arrayList3.get(i41);
                            i41++;
                            org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                            if ((r2Var2 instanceof po0) && r2Var2 != r2Var) {
                                r2Var2.removeSelfFromStack();
                            }
                        }
                        if (r2Var instanceof po0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            gg0Var3.l1(of0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                            break;
                        }
                    }
                    z12 = true;
                    gg0Var3.l1(of0Var.d, (TLRPC.auth_SentCode) tLObject3, z12);
                } else if (tL_error3 != null) {
                    String str2 = tL_error3.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error3.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            of0Var.e = tL_error3.text;
                            of0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.wc(gg0Var3.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error3.text));
                            break;
                        } else {
                            gg0Var3.z1(0, true, null, true);
                            gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new lf0(of0Var, 2), Integer.parseInt(tL_error3.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 5:
                of0 of0Var2 = (of0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                gg0 gg0Var4 = of0Var2.v;
                gg0Var4.e = true;
                gg0 gg0Var5 = (gg0) LaunchActivity.N();
                if (gg0Var5 == null) {
                    i18 = ((org.telegram.ui.ActionBar.r2) gg0Var4).currentAccount;
                    gg0Var5 = new gg0(i18);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(gg0Var5);
                    }
                }
                gg0Var5.v1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 6:
                fg0 fg0Var = (fg0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                mj0 mj0Var = fg0Var.a;
                if (tLObject4 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject4;
                    if (mj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = fg0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i42 = 0;
                            while (true) {
                                if (i42 >= arrayList4.size()) {
                                    jtVar = null;
                                } else if (arrayList4.get(i42) == null || !((jt) arrayList4.get(i42)).a.equals(upperCase)) {
                                    i42++;
                                } else {
                                    jtVar = (jt) arrayList4.get(i42);
                                }
                            }
                            if (jtVar != null) {
                                mj0Var.setText(jtVar.c);
                                fg0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                jh0 jh0Var = (jh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error4 != null) {
                    jh0Var.getClass();
                    break;
                } else {
                    jh0 jh0Var2 = jh0Var.s0.a;
                    int i43 = 0;
                    while (true) {
                        ArrayList arrayList5 = jh0Var2.j0;
                        if (i43 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i43)).link.equals(tL_chatInviteExported.link)) {
                            ah0 h02 = jh0Var2.h0();
                            arrayList5.remove(i43);
                            jh0Var2.j0(h02);
                            break;
                        } else {
                            i43++;
                        }
                    }
                }
            case 8:
                AndroidUtilities.runOnUIThread(new wb0(21, (org.telegram.ui.Components.oy) this.d, MessagesStorage.getInstance(((oj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 9:
                oj0.m((oj0) this.b, (TLObject) this.c, (org.telegram.ui.Components.oy) this.d);
                break;
            case 10:
                xj0 xj0Var = (xj0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = (TL_feed.TL_feed_setInterestCategories) this.d;
                HashSet hashSet = xj0Var.e;
                vj0[] vj0VarArr = xj0Var.b;
                if (!xj0Var.h) {
                    xj0Var.f = false;
                    if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                        hashSet.clear();
                        hashSet.addAll(tL_feed_setInterestCategories.category_ids);
                        xj0Var.s = true;
                        for (int size2 = vj0VarArr[0].a.size() - 1; size2 >= 0; size2--) {
                            if (vj0VarArr[0].a.get(size2) instanceof TL_feed.TL_feedItemInterestCategories) {
                                vj0VarArr[0].a.remove(size2);
                            }
                        }
                        xj0.o0(vj0VarArr[0]);
                        org.telegram.ui.Components.wc.b0(xj0Var).P(R.raw.contact_check, LocaleController.getString(R.string.NewsInterestsSaved)).j();
                    } else {
                        org.telegram.messenger.vh.n(R.string.NewsInterestsError, org.telegram.ui.Components.wc.b0(xj0Var), null);
                    }
                    xj0Var.p0(true);
                    break;
                }
                break;
            case 11:
                lk0 lk0Var = (lk0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = lk0Var.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ag0(lk0Var, new ArrayList(), new ArrayList(), new ArrayList(), 2));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i44 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i44];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr4 = new String[2];
                    int i45 = 0;
                    while (i45 < arrayList6.size()) {
                        ok0 ok0Var = (ok0) arrayList6.get(i45);
                        if (DialogObject.isEncryptedDialog(ok0Var.d)) {
                            i19 = i30;
                            arrayList = arrayList6;
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(notificationsCustomSettingsActivity2.getMessagesController(), ok0Var.d);
                            if (m10 != null) {
                                i20 = i31;
                                strArr = strArr3;
                                TLRPC.User user2 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(m10.user_id));
                                if (user2 != null) {
                                    strArr4[i19] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr4[i20] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                i20 = i31;
                                strArr = strArr3;
                            }
                        } else {
                            i19 = i30;
                            arrayList = arrayList6;
                            i20 = i31;
                            strArr = strArr3;
                            if (DialogObject.isUserDialog(ok0Var.d)) {
                                TLRPC.User user3 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(ok0Var.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr4[i19] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr4[i20] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr4[i19];
                                    strArr4[i19] = str5.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                                    str = strArr4[i19];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i22 = i19;
                                    int i46 = i22;
                                    while (i22 < i44) {
                                        int i47 = i20;
                                        String str6 = strArr[i22];
                                        i21 = i19;
                                        String str7 = strArr4[i21];
                                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                        if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.vh.u(" ", str6, strArr4[i21]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.vh.u(" ", str6, translitString)))) {
                                            String str8 = strArr4[i47];
                                            i23 = (str8 == null || !str8.startsWith(str6)) ? i46 : 2;
                                        } else {
                                            i23 = i47;
                                        }
                                        if (i23 != 0) {
                                            if (i23 == i47) {
                                                arrayList9.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                            } else {
                                                arrayList9.add(AndroidUtilities.generateSearchName("@" + strArr4[i47], null, "@" + str6));
                                            }
                                            arrayList8.add(ok0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i22++;
                                            i46 = i23;
                                            i19 = i21;
                                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                                            i20 = 1;
                                        }
                                    }
                                }
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                i21 = i19;
                            } else {
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity2.getMessagesController().getChat(Long.valueOf(-ok0Var.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr4[i19] = chat2.title;
                                        strArr4[i20] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr4[i19];
                                        strArr4[i19] = str52.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                                        str = strArr4[i19];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i22 = i19;
                                        int i462 = i22;
                                        while (i22 < i44) {
                                        }
                                    }
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                    i21 = i19;
                                }
                            }
                            i45++;
                            arrayList6 = arrayList;
                            strArr3 = strArr;
                            i30 = i21;
                            notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                            i31 = 1;
                        }
                        chat = null;
                        String str522 = strArr4[i19];
                        strArr4[i19] = str522.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr4[i19]);
                        str = strArr4[i19];
                        if (str != null) {
                        }
                        i22 = i19;
                        int i4622 = i22;
                        while (i22 < i44) {
                        }
                        notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                        i21 = i19;
                        i45++;
                        arrayList6 = arrayList;
                        strArr3 = strArr;
                        i30 = i21;
                        notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                        i31 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new ag0(lk0Var, arrayList8, arrayList9, arrayList7, 2));
                    break;
                }
                break;
            case 12:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 13:
                in0 in0Var = (in0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                in0Var.x1();
                if (tL_error5 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject6;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new af0(i28, in0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = in0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    in0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    in0Var.M1(LocaleController.getString(R.string.AppName), tL_error5.text);
                    break;
                }
                break;
            case 14:
                ((wm0) this.b).d(((TLRPC.TL_error) this.c).text, (String) this.d);
                break;
            case 15:
                um0 um0Var = (um0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.random;
                in0 in0Var2 = um0Var.e;
                secureRandom.setSeed(in0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = in0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = in0.p1();
                in0Var2.c1 = p12;
                in0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = in0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    in0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(in0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = in0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = in0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = in0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i24 = ((org.telegram.ui.ActionBar.r2) in0Var2).currentAccount;
                ConnectionsManager.getInstance(i24).sendRequest(updatepasswordsettings, new sm0(um0Var, i29));
                break;
            case 16:
                en0 en0Var = (en0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
                int i48 = en0Var.L;
                in0 in0Var3 = en0Var.Q;
                in0Var3.x1();
                en0Var.J = false;
                if (tL_error6 == null) {
                    en0Var.r();
                    en0Var.q();
                    ((lm0) in0Var3.B1).c(in0Var3.E, (String) in0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new sl0(in0Var3, 6), null);
                    break;
                } else {
                    en0Var.K = tL_error6.text;
                    if ((i48 == 3 && ((i27 = en0Var.M) == 4 || i27 == 2)) || ((i48 == 2 && ((i25 = en0Var.M) == 4 || i25 == 3)) || (i48 == 4 && en0Var.M == 2))) {
                        en0Var.p();
                    }
                    if (i48 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(en0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i48 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(en0Var, NotificationCenter.didReceiveCall);
                    }
                    en0Var.I = true;
                    if (i48 != 3) {
                        i26 = ((org.telegram.ui.ActionBar.r2) in0Var3).currentAccount;
                        org.telegram.ui.Components.g5.e0(i26, tL_error6, in0Var3, verifyphone, new Object[0]);
                    }
                    in0Var3.N1(true, false);
                    if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            en0Var.c(true);
                            in0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i49 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = en0Var.d;
                            if (i49 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i49].setText("");
                                i49++;
                            }
                        }
                    }
                }
                break;
            case 17:
                po0.V((po0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 18:
                po0.c0((po0) this.b, (TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
                break;
            case 19:
                po0 po0Var = (po0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                yl0 yl0Var = (yl0) this.d;
                po0Var.E0 = tL_payments_validatedRequestedInfo;
                yl0Var.run();
                po0Var.E0(false);
                po0Var.I0(true, false);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                bitmapHolder.release();
                if (str10.equals(photoViewer.C4.getImageKey())) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                xq0 xq0Var = (xq0) this.d;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.c3(true, true);
                AndroidUtilities.cancelRunOnUIThread(xq0Var);
                AndroidUtilities.runOnUIThread(xq0Var, 800L);
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                sr0 sr0Var = (sr0) this.d;
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
                    sr0Var.run();
                    break;
                }
                break;
            case 23:
                wt0 wt0Var = (wt0) this.b;
                wt0 wt0Var2 = (wt0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = wt0Var.d;
                if (photoViewer4.y != null && wt0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = wt0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = wt0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.F3();
                        if (wt0Var.d.Y7 > wt0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = wt0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = wt0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.f81 f81Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = wt0Var.d;
                            f81Var.a(Math.min(photoViewer9.e8, wt0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(wt0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(wt0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(wt0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.t.o(wt0Var.d.b8, sb2);
                        }
                        wt0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = wt0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, wt0Var.d.f8), false, photoViewer10.r);
                        }
                        wt0Var.d.Z7 = 0;
                    }
                    wt0Var.d.D3();
                    wt0Var.d.z3();
                    break;
                }
                break;
            case 24:
                xv0 xv0Var = (xv0) this.b;
                un unVar = (un) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                MessageObject messageObject = xv0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    knVar = new kn();
                    knVar.a = messageObject;
                    knVar.b = -1;
                    knVar.c = -1;
                    knVar.h = true;
                    knVar.e = bArr5;
                    knVar.f();
                }
                unVar.Ob(messageObject, knVar);
                xv0Var.c(false);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error7 != null) {
                    org.telegram.ui.Components.wc.e0(tL_error7);
                    break;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                HashSet hashSet2 = (HashSet) this.d;
                int i50 = ProfileActivity.R6;
                profileActivity.getClass();
                int size3 = arrayList10.size();
                for (int i51 = 0; i51 < size3; i51++) {
                    TLRPC.User user4 = (TLRPC.User) arrayList10.get(i51);
                    if (!hashSet2.contains(Long.valueOf(user4.id))) {
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
                profileActivity.p5(true, false);
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                org.telegram.ui.Components.po poVar = (org.telegram.ui.Components.po) this.c;
                un unVar2 = (un) this.d;
                int i52 = ProfileActivity.R6;
                org.telegram.ui.Components.lo loVar = poVar.e;
                ViewGroup viewGroup = (ViewGroup) unVar2.fragmentView;
                RectF rectF = jh.k.h;
                jh.k.c(loVar, viewGroup, rectF);
                profileActivity2.V5 = rectF.left;
                profileActivity2.W3();
                break;
            case 28:
                org.telegram.ui.Components.wc.D((wb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                bh.p pVar = secretMediaViewer.e;
                if (pVar != null) {
                    pVar.setLayerType(0, null);
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
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
        }
    }
}
