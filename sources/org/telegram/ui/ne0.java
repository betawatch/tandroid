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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ne0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.d;
        int i10 = ProfileActivity.R6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            if (!hashSet.contains(Long.valueOf(user.id))) {
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
                    channelParticipant.peer.user_id = user.id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.id;
                    profileActivity.u2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                    profileActivity.u2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.u2.participants_count++;
                profileActivity.getMessagesController().putUser(user, false);
            }
        }
        profileActivity.p5(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:383:0x0964, code lost:
    
        if (r11 != 16) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0970, code lost:
    
        if (r5 != 3) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0981, code lost:
    
        if (r5 == 16) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0aa9, code lost:
    
        if (r6 != 16) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0ab5, code lost:
    
        if (r6 != 3) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0ac5, code lost:
    
        if (r6 == 16) goto L425;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0add  */
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
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        int i21;
        lt ltVar;
        nk0 nk0Var;
        int i22;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i23;
        String[] strArr;
        int i24;
        TLRPC.Chat chat;
        String translitString;
        String str;
        int i25;
        int i26;
        int i27;
        int i28;
        qk0 qk0Var;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        TLRPC.Message message;
        int i34 = 7;
        int i35 = 2;
        int i36 = 5;
        mn mnVar = null;
        int i37 = 0;
        int i38 = 1;
        switch (this.a) {
            case 0:
                te0 te0Var = (te0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ig0 ig0Var = te0Var.O;
                te0Var.H = false;
                if (tLObject instanceof TLRPC.TL_auth_authorization) {
                    te0Var.n();
                    ig0Var.A1(false, true);
                    te0Var.postDelayed(new kb0(i34, te0Var, tLObject), 150L);
                    break;
                } else {
                    ig0Var.p1(false, true);
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            te0Var.c(true);
                            ig0Var.z1(0, true, null, true);
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            break;
                        } else if (tL_error.text.contains("FIRSTNAME_INVALID")) {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                            break;
                        } else if (tL_error.text.contains("LASTNAME_INVALID")) {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                            break;
                        } else {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                            break;
                        }
                    } else {
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        break;
                    }
                }
                break;
            case 1:
                te0 te0Var2 = (te0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                te0Var2.M = fileLocation;
                te0Var2.N = photoSize2.location;
                te0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", te0Var2.f, null);
                break;
            case 2:
                lf0 lf0Var = (lf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.c;
                int i39 = lf0Var.h0;
                ig0 ig0Var2 = lf0Var.u0;
                lf0Var.y(false);
                lf0Var.f0 = false;
                if (tL_error2 == null) {
                    Activity parentActivity = ig0Var2.getParentActivity();
                    if (parentActivity != null) {
                        lf0Var.p(new kb0(10, lf0Var, parentActivity));
                        break;
                    }
                } else {
                    lf0Var.g0 = tL_error2.text;
                    if (i39 == 3) {
                        int i40 = lf0Var.i0;
                        if (i40 != 4) {
                            i10 = 2;
                            if (i40 != 2) {
                                if (i40 != 17) {
                                    break;
                                }
                            }
                        }
                        lf0Var.s();
                        if (i39 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(lf0Var, NotificationCenter.didReceiveSmsCode);
                            z10 = true;
                        } else if (i39 != 2) {
                            z10 = true;
                            i11 = 3;
                            if (i39 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(lf0Var, NotificationCenter.didReceiveCall);
                            }
                            lf0Var.e0 = z10;
                            if (i39 != i11) {
                                i12 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                org.telegram.ui.Components.g5.e0(i12, tL_error2, ig0Var2, confirmphone, new Object[0]);
                            }
                            if (!tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                lf0Var.x();
                                break;
                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                lf0Var.c(true);
                                ig0Var2.z1(0, true, null, true);
                                break;
                            }
                        } else {
                            z10 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(lf0Var, NotificationCenter.didReceiveSmsCode);
                        }
                        i11 = 3;
                        lf0Var.e0 = z10;
                        if (i39 != i11) {
                        }
                        if (!tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        lf0Var.x();
                    } else {
                        i10 = 2;
                    }
                    if (i39 == i10) {
                        int i41 = lf0Var.i0;
                        i13 = 4;
                        if (i41 != 4) {
                            break;
                        }
                        lf0Var.s();
                        if (i39 == 15) {
                        }
                        i11 = 3;
                        lf0Var.e0 = z10;
                        if (i39 != i11) {
                        }
                        if (!tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        lf0Var.x();
                    } else {
                        i13 = 4;
                    }
                    if (i39 == i13) {
                        int i42 = lf0Var.i0;
                        if (i42 != i10) {
                            if (i42 != 17) {
                                break;
                            }
                        }
                        lf0Var.s();
                    }
                    if (i39 == 15) {
                    }
                    i11 = 3;
                    lf0Var.e0 = z10;
                    if (i39 != i11) {
                    }
                    if (!tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    lf0Var.x();
                }
                break;
            case 3:
                lf0 lf0Var2 = (lf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                int i43 = lf0Var2.h0;
                ig0 ig0Var3 = lf0Var2.u0;
                lf0Var2.y(false);
                lf0Var2.f0 = false;
                if (tL_error3 == null) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    lf0Var2.v();
                    lf0Var2.t();
                    i16 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                    UserConfig.getInstance(i16).setCurrentUser(user);
                    i17 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                    UserConfig.getInstance(i17).saveConfig(true);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(user);
                    i18 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                    MessagesStorage.getInstance(i18).putUsersAndChats(arrayList3, null, true, true);
                    i19 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                    MessagesController.getInstance(i19).putUser(user, false);
                    i20 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ig0Var3.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i43 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    lf0Var2.p(new ye0(lf0Var2, 5));
                    break;
                } else {
                    lf0Var2.g0 = tL_error3.text;
                    lf0Var2.f0 = false;
                    ig0Var3.A1(false, true);
                    if (i43 == 3) {
                        int i44 = lf0Var2.i0;
                        if (i44 != 4) {
                            i14 = 2;
                            if (i44 != 2) {
                                if (i44 != 17) {
                                    break;
                                }
                            }
                        }
                        lf0Var2.s();
                        if (i43 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                            z11 = true;
                        } else if (i43 == 2) {
                            z11 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z11 = true;
                            if (i43 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveCall);
                            }
                        }
                        lf0Var2.e0 = z11;
                        if (i43 != 3) {
                            if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                                ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            } else if (tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                                lf0Var2.x();
                                break;
                            } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                lf0Var2.c(true);
                                ig0Var3.z1(0, true, null, true);
                                ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error3.text);
                            }
                            int i45 = 0;
                            while (true) {
                                xr xrVar = lf0Var2.f;
                                zr[] zrVarArr = xrVar.f;
                                if (i45 >= zrVarArr.length) {
                                    xrVar.e = false;
                                    zrVarArr[0].requestFocus();
                                    break;
                                } else {
                                    zrVarArr[i45].setText("");
                                    i45++;
                                }
                            }
                        }
                    } else {
                        i14 = 2;
                    }
                    if (i43 == i14) {
                        int i46 = lf0Var2.i0;
                        i15 = 4;
                        if (i46 != 4) {
                            break;
                        }
                        lf0Var2.s();
                        if (i43 == 15) {
                        }
                        lf0Var2.e0 = z11;
                        if (i43 != 3) {
                        }
                    } else {
                        i15 = 4;
                    }
                    if (i43 == i15) {
                        int i47 = lf0Var2.i0;
                        if (i47 != 2) {
                            if (i47 != 17) {
                                break;
                            }
                        }
                        lf0Var2.s();
                    }
                    if (i43 == 15) {
                    }
                    lf0Var2.e0 = z11;
                    if (i43 != 3) {
                    }
                }
                break;
            case 4:
                lf0 lf0Var3 = (lf0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                lf0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                lf0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    lf0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    lf0Var3.i0 = 16;
                }
                lf0Var3.u0.l1(bundle, tL_auth_sentCode, true);
                break;
            case 5:
                qf0 qf0Var = (qf0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                fi.d dVar = qf0Var.b;
                ig0 ig0Var4 = qf0Var.v;
                qf0Var.s = -1;
                if (tLObject4 instanceof TLRPC.auth_SentCode) {
                    qf0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.j5 parentLayout = ig0Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(1, fragmentStack);
                        ArrayList arrayList4 = new ArrayList(fragmentStack);
                        int size = arrayList4.size();
                        int i48 = 0;
                        while (i48 < size) {
                            Object obj = arrayList4.get(i48);
                            i48++;
                            org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                            if ((r2Var2 instanceof ro0) && r2Var2 != r2Var) {
                                r2Var2.removeSelfFromStack();
                            }
                        }
                        if (r2Var instanceof ro0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            ig0Var4.l1(qf0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                            break;
                        }
                    }
                    z12 = true;
                    ig0Var4.l1(qf0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                } else if (tL_error4 != null) {
                    String str2 = tL_error4.text;
                    if (str2 == null || !str2.startsWith("FLOOD_WAIT_")) {
                        String str3 = tL_error4.text;
                        if (str3 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                            qf0Var.e = tL_error4.text;
                            qf0Var.f = false;
                            dVar.setLoading(false);
                            new org.telegram.ui.Components.wc(ig0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error4.text));
                            break;
                        } else {
                            ig0Var4.z1(0, true, null, true);
                            ig0Var4.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new nf0(qf0Var, 2), Integer.parseInt(tL_error4.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                        break;
                    }
                }
                break;
            case 6:
                qf0 qf0Var2 = (qf0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                ig0 ig0Var5 = qf0Var2.v;
                ig0Var5.e = true;
                ig0 ig0Var6 = (ig0) LaunchActivity.N();
                if (ig0Var6 == null) {
                    i21 = ((org.telegram.ui.ActionBar.r2) ig0Var5).currentAccount;
                    ig0Var6 = new ig0(i21);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ig0Var6);
                    }
                }
                ig0Var6.v1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 7:
                hg0 hg0Var = (hg0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                oj0 oj0Var = hg0Var.a;
                if (tLObject5 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject5;
                    if (oj0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList5 = hg0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList5 != null) {
                            int i49 = 0;
                            while (true) {
                                if (i49 >= arrayList5.size()) {
                                    ltVar = null;
                                } else if (arrayList5.get(i49) == null || !((lt) arrayList5.get(i49)).a.equals(upperCase)) {
                                    i49++;
                                } else {
                                    ltVar = (lt) arrayList5.get(i49);
                                }
                            }
                            if (ltVar != null) {
                                oj0Var.setText(ltVar.c);
                                hg0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                lh0 lh0Var = (lh0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error5 != null) {
                    lh0Var.getClass();
                    break;
                } else {
                    lh0 lh0Var2 = lh0Var.s0.a;
                    int i50 = 0;
                    while (true) {
                        ArrayList arrayList6 = lh0Var2.j0;
                        if (i50 >= arrayList6.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList6.get(i50)).link.equals(tL_chatInviteExported.link)) {
                            ch0 h02 = lh0Var2.h0();
                            arrayList6.remove(i50);
                            lh0Var2.j0(h02);
                            break;
                        } else {
                            i50++;
                        }
                    }
                }
            case 9:
                AndroidUtilities.runOnUIThread(new kb0(22, (org.telegram.ui.Components.oy) this.d, MessagesStorage.getInstance(((qj0) this.b).currentAccount).getUser(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 10:
                qj0.m((qj0) this.b, (TLObject) this.c, (org.telegram.ui.Components.oy) this.d);
                break;
            case 11:
                zj0 zj0Var = (zj0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = (TL_feed.TL_feed_setInterestCategories) this.d;
                HashSet hashSet = zj0Var.e;
                xj0[] xj0VarArr = zj0Var.b;
                if (!zj0Var.h) {
                    zj0Var.f = false;
                    if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                        hashSet.clear();
                        hashSet.addAll(tL_feed_setInterestCategories.category_ids);
                        zj0Var.s = true;
                        for (int size2 = xj0VarArr[0].a.size() - 1; size2 >= 0; size2--) {
                            if (xj0VarArr[0].a.get(size2) instanceof TL_feed.TL_feedItemInterestCategories) {
                                xj0VarArr[0].a.remove(size2);
                            }
                        }
                        zj0.o0(xj0VarArr[0]);
                        org.telegram.ui.Components.wc.b0(zj0Var).P(R.raw.contact_check, LocaleController.getString(R.string.NewsInterestsSaved)).j();
                    } else {
                        org.telegram.messenger.wh.n(R.string.NewsInterestsError, org.telegram.ui.Components.wc.b0(zj0Var), null);
                    }
                    zj0Var.p0(true);
                    break;
                }
                break;
            case 12:
                nk0 nk0Var2 = (nk0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = nk0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new cg0(nk0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 2));
                    break;
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i51 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i51];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i52 = 0;
                    while (i52 < arrayList7.size()) {
                        qk0 qk0Var2 = (qk0) arrayList7.get(i52);
                        int i53 = i38;
                        if (DialogObject.isEncryptedDialog(qk0Var2.d)) {
                            ArrayList arrayList11 = arrayList7;
                            nk0Var = nk0Var2;
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(notificationsCustomSettingsActivity.getMessagesController(), qk0Var2.d);
                            if (m10 != null) {
                                i28 = i37;
                                qk0Var = qk0Var2;
                                TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(m10.user_id));
                                if (user2 != null) {
                                    strArr3[i28] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[i53] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                i28 = i37;
                                qk0Var = qk0Var2;
                            }
                            i22 = i28;
                            arrayList = arrayList11;
                            qk0Var2 = qk0Var;
                        } else {
                            ArrayList arrayList12 = arrayList7;
                            nk0Var = nk0Var2;
                            int i54 = i37;
                            if (DialogObject.isUserDialog(qk0Var2.d)) {
                                i22 = i54;
                                arrayList = arrayList12;
                                TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(qk0Var2.d));
                                if (user3 != null && !user3.deleted) {
                                    strArr3[i22] = ContactsController.formatName(user3.first_name, user3.last_name);
                                    strArr3[i53] = UserObject.getPublicUsername(user3);
                                    chat = user3;
                                    String str5 = strArr3[i22];
                                    strArr3[i22] = str5.toLowerCase();
                                    i24 = i22;
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[i24]);
                                    str = strArr3[i24];
                                    if (str != null && str.equals(translitString)) {
                                        translitString = null;
                                    }
                                    i25 = i24;
                                    i26 = i25;
                                    while (true) {
                                        arrayList2 = arrayList;
                                        if (i25 < i51) {
                                            String str6 = strArr2[i25];
                                            i23 = i51;
                                            String str7 = strArr3[i24];
                                            strArr = strArr2;
                                            if ((str7 == null || !(str7.startsWith(str6) || org.telegram.messenger.wh.u(" ", str6, strArr3[i24]))) && (translitString == null || !(translitString.startsWith(str6) || org.telegram.messenger.wh.u(" ", str6, translitString)))) {
                                                String str8 = strArr3[i53];
                                                i27 = (str8 == null || !str8.startsWith(str6)) ? i26 : 2;
                                            } else {
                                                i27 = i53;
                                            }
                                            if (i27 != 0) {
                                                int i55 = i53;
                                                if (i27 == i55) {
                                                    arrayList10.add(AndroidUtilities.generateSearchName(str5, null, str6));
                                                } else {
                                                    arrayList10.add(AndroidUtilities.generateSearchName("@" + strArr3[i55], null, "@" + str6));
                                                }
                                                arrayList9.add(qk0Var2);
                                                if (chat != null) {
                                                    arrayList8.add(chat);
                                                }
                                            } else {
                                                i25++;
                                                i26 = i27;
                                                arrayList = arrayList2;
                                                i51 = i23;
                                                strArr2 = strArr;
                                                i53 = 1;
                                            }
                                        } else {
                                            i23 = i51;
                                            strArr = strArr2;
                                        }
                                    }
                                }
                                arrayList2 = arrayList;
                                i23 = i51;
                                strArr = strArr2;
                                i24 = i22;
                            } else {
                                i22 = i54;
                                arrayList = arrayList12;
                                TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-qk0Var2.d));
                                if (chat2 != null) {
                                    if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        strArr3[i22] = chat2.title;
                                        strArr3[i53] = ChatObject.getPublicUsername(chat2);
                                        chat = chat2;
                                        String str52 = strArr3[i22];
                                        strArr3[i22] = str52.toLowerCase();
                                        i24 = i22;
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i24]);
                                        str = strArr3[i24];
                                        if (str != null) {
                                            translitString = null;
                                        }
                                        i25 = i24;
                                        i26 = i25;
                                        while (true) {
                                            arrayList2 = arrayList;
                                            if (i25 < i51) {
                                            }
                                            i25++;
                                            i26 = i27;
                                            arrayList = arrayList2;
                                            i51 = i23;
                                            strArr2 = strArr;
                                            i53 = 1;
                                        }
                                    }
                                    arrayList2 = arrayList;
                                    i23 = i51;
                                    strArr = strArr2;
                                    i24 = i22;
                                }
                            }
                            i52++;
                            nk0Var2 = nk0Var;
                            i37 = i24;
                            arrayList7 = arrayList2;
                            i51 = i23;
                            strArr2 = strArr;
                            i38 = 1;
                        }
                        chat = null;
                        String str522 = strArr3[i22];
                        strArr3[i22] = str522.toLowerCase();
                        i24 = i22;
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[i24]);
                        str = strArr3[i24];
                        if (str != null) {
                        }
                        i25 = i24;
                        i26 = i25;
                        while (true) {
                            arrayList2 = arrayList;
                            if (i25 < i51) {
                            }
                            i25++;
                            i26 = i27;
                            arrayList = arrayList2;
                            i51 = i23;
                            strArr2 = strArr;
                            i53 = 1;
                        }
                        i52++;
                        nk0Var2 = nk0Var;
                        i37 = i24;
                        arrayList7 = arrayList2;
                        i51 = i23;
                        strArr2 = strArr;
                        i38 = 1;
                    }
                    AndroidUtilities.runOnUIThread(new cg0(nk0Var2, arrayList9, arrayList10, arrayList8, 2));
                    break;
                }
                break;
            case 13:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 14:
                kn0 kn0Var = (kn0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                kn0Var.x1();
                if (tL_error6 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject7;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                    alertDialog$Builder.a.T = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new cf0(i36, kn0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = kn0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                    kn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    break;
                } else {
                    kn0Var.M1(LocaleController.getString(R.string.AppName), tL_error6.text);
                    break;
                }
                break;
            case 15:
                ((ym0) this.b).d(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 16:
                wm0 wm0Var = (wm0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.random;
                kn0 kn0Var2 = wm0Var.e;
                secureRandom.setSeed(kn0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = kn0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] p12 = kn0.p1();
                kn0Var2.c1 = p12;
                kn0Var2.b1 = Utilities.bytesToLong(Utilities.computeSHA256(p12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = kn0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    kn0Var2.e1 = computePBKDF2;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(kn0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = kn0Var2.c1;
                    Utilities.aesCbcEncryptionByteArraySafe(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = kn0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = kn0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i29 = ((org.telegram.ui.ActionBar.r2) kn0Var2).currentAccount;
                ConnectionsManager.getInstance(i29).sendRequest(updatepasswordsettings, new um0(wm0Var, i35));
                break;
            case 17:
                gn0 gn0Var = (gn0) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i56 = gn0Var.L;
                kn0 kn0Var3 = gn0Var.Q;
                kn0Var3.x1();
                gn0Var.J = false;
                if (tL_error7 == null) {
                    gn0Var.r();
                    gn0Var.q();
                    ((nm0) kn0Var3.B1).c(kn0Var3.E, (String) kn0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new ul0(kn0Var3, 6), null);
                    break;
                } else {
                    gn0Var.K = tL_error7.text;
                    if ((i56 == 3 && ((i33 = gn0Var.M) == 4 || i33 == 2)) || ((i56 == 2 && ((i30 = gn0Var.M) == 4 || i30 == 3)) || (i56 == 4 && gn0Var.M == 2))) {
                        gn0Var.p();
                    }
                    if (i56 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(gn0Var, NotificationCenter.didReceiveSmsCode);
                        i31 = 3;
                    } else {
                        i31 = 3;
                        if (i56 == 3) {
                            AndroidUtilities.setWaitingForCall(true);
                            NotificationCenter.getGlobalInstance().addObserver(gn0Var, NotificationCenter.didReceiveCall);
                        }
                    }
                    gn0Var.I = true;
                    if (i56 != i31) {
                        i32 = ((org.telegram.ui.ActionBar.r2) kn0Var3).currentAccount;
                        org.telegram.ui.Components.g5.e0(i32, tL_error7, kn0Var3, verifyphone, new Object[0]);
                    }
                    kn0Var3.N1(true, false);
                    if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            gn0Var.c(true);
                            kn0Var3.K1(null, 0, true);
                            break;
                        }
                    } else {
                        int i57 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = gn0Var.d;
                            if (i57 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i57].setText("");
                                i57++;
                            }
                        }
                    }
                }
                break;
            case 18:
                ro0.V((ro0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 19:
                ro0.c0((ro0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 20:
                ro0 ro0Var = (ro0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                am0 am0Var = (am0) this.d;
                ro0Var.E0 = tL_payments_validatedRequestedInfo;
                am0Var.run();
                ro0Var.E0(false);
                ro0Var.I0(true, false);
                break;
            case 21:
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
            case 22:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                zq0 zq0Var = (zq0) this.d;
                photoViewer2.C4.setImageBitmap(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.d3(true, true);
                AndroidUtilities.cancelRunOnUIThread(zq0Var);
                AndroidUtilities.runOnUIThread(zq0Var, 800L);
                break;
            case 23:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ur0 ur0Var = (ur0) this.d;
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
                    ur0Var.run();
                    break;
                }
                break;
            case 24:
                yt0 yt0Var = (yt0) this.b;
                yt0 yt0Var2 = (yt0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = yt0Var.d;
                if (photoViewer4.y != null && yt0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = yt0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = yt0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.G3();
                        if (yt0Var.d.Y7 > yt0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = yt0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = yt0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.g81 g81Var = photoViewer8.j1;
                            boolean z13 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = yt0Var.d;
                            g81Var.a(Math.min(photoViewer9.e8, yt0Var.d.f8), z13, photoViewer9.r);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("compressionsCount = ");
                            sb2.append(yt0Var.d.Z7);
                            sb2.append(" w = ");
                            sb2.append(yt0Var.d.c8);
                            sb2.append(" h = ");
                            sb2.append(yt0Var.d.d8);
                            sb2.append(" r = ");
                            org.telegram.messenger.t.o(yt0Var.d.b8, sb2);
                        }
                        yt0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = yt0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, yt0Var.d.f8), false, photoViewer10.r);
                        }
                        yt0Var.d.Z7 = 0;
                    }
                    yt0Var.d.E3();
                    yt0Var.d.A3();
                    break;
                }
                break;
            case 25:
                zv0 zv0Var = (zv0) this.b;
                wn wnVar = (wn) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                MessageObject messageObject = zv0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    messageObject.getDialogId();
                    mnVar = new mn();
                    mnVar.a = messageObject;
                    mnVar.b = -1;
                    mnVar.c = -1;
                    mnVar.h = true;
                    mnVar.e = bArr5;
                    mnVar.f();
                }
                wnVar.Sb(messageObject, mnVar);
                zv0Var.c(false);
                break;
            case 26:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                if (tL_error8 != null) {
                    org.telegram.ui.Components.wc.e0(tL_error8);
                    break;
                } else if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(premiumPreviewFragment), null);
                    break;
                }
                break;
            case 27:
                a();
                break;
            case 28:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                org.telegram.ui.Components.po poVar = (org.telegram.ui.Components.po) this.c;
                wn wnVar2 = (wn) this.d;
                int i58 = ProfileActivity.R6;
                org.telegram.ui.Components.lo loVar = poVar.e;
                ViewGroup viewGroup = (ViewGroup) wnVar2.fragmentView;
                RectF rectF = jh.k.h;
                jh.k.c(loVar, viewGroup, rectF);
                profileActivity.V5 = rectF.left;
                profileActivity.W3();
                break;
            default:
                org.telegram.ui.Components.wc.D((wb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
        }
    }

    public /* synthetic */ ne0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
