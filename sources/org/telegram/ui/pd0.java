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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pd0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.S6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            if (!hashSet.contains(Long.valueOf(user.id))) {
                TLRPC.ChatFull chatFull = profileActivity.t2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (org.telegram.messenger.w3.T(profileActivity.D2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.id;
                    profileActivity.t2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.e20.i(profileActivity.getAccountInstance().a).n;
                    profileActivity.t2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.t2.participants_count++;
                profileActivity.getMessagesController().U3(user, false, false);
            }
        }
        profileActivity.D5(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0998, code lost:
    
        if (r9 != 16) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x09a2, code lost:
    
        if (r9 == 3) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x09b0, code lost:
    
        if (r9 == 16) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0ad5, code lost:
    
        if (r10 != 16) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0adf, code lost:
    
        if (r10 == 3) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0aed, code lost:
    
        if (r10 == 16) goto L424;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b02  */
    /* JADX WARN: Type inference failed for: r27v0 */
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
        mt mtVar;
        TLRPC.User user;
        int i19;
        boolean z13;
        boolean z14;
        ArrayList arrayList;
        qi0 qi0Var;
        int i20;
        TLRPC.Chat chat;
        String R0;
        String str;
        int i21;
        int i22;
        TLRPC.User Z1;
        int i23;
        int i24;
        int i25;
        int i26;
        TLRPC.Message message;
        int i27 = 6;
        int i28 = 5;
        int i29 = 2;
        kn knVar = null;
        switch (this.a) {
            case 0:
                vd0 vd0Var = (vd0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                gf0 gf0Var = vd0Var.O;
                vd0Var.H = false;
                if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
                    gf0Var.t1(false, true);
                    if (!tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error.text.contains("LASTNAME_INVALID")) {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
                                        break;
                                    } else {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749190, "InvalidLastName"));
                                        break;
                                    }
                                } else {
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749192, "InvalidFirstName"));
                                    break;
                                }
                            } else {
                                vd0Var.c(true);
                                gf0Var.D1(0, true, null, true);
                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                break;
                            }
                        } else {
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749193, "InvalidCode"));
                            break;
                        }
                    } else {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                        break;
                    }
                } else {
                    vd0Var.n();
                    gf0Var.E1(false, true);
                    vd0Var.postDelayed(new y60(21, vd0Var, tLObject), 150L);
                    break;
                }
                break;
            case 1:
                vd0 vd0Var2 = (vd0) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                vd0Var2.M = fileLocation;
                vd0Var2.N = photoSize2.location;
                vd0Var2.e.j(org.telegram.messenger.jc.e(fileLocation), "50_50", vd0Var2.f, null);
                break;
            case 2:
                le0 le0Var = (le0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.c;
                int i30 = le0Var.h0;
                gf0 gf0Var2 = le0Var.u0;
                le0Var.x(false);
                le0Var.f0 = false;
                if (tL_error2 == null) {
                    Activity parentActivity = gf0Var2.getParentActivity();
                    if (parentActivity != null) {
                        le0Var.p(new y60(24, le0Var, parentActivity));
                        break;
                    }
                } else {
                    le0Var.g0 = tL_error2.text;
                    if (i30 == 3) {
                        int i31 = le0Var.i0;
                        i10 = 2;
                        if (i31 != 4) {
                            if (i31 != 2) {
                                if (i31 != 17) {
                                    break;
                                }
                            }
                        }
                        le0Var.s();
                        if (i30 == 15) {
                            org.telegram.messenger.at.e().b(le0Var, org.telegram.messenger.at.g4);
                            z10 = true;
                        } else if (i30 == 2) {
                            z10 = true;
                            org.telegram.messenger.i0.D3(true);
                            org.telegram.messenger.at.e().b(le0Var, org.telegram.messenger.at.g4);
                        } else {
                            z10 = true;
                            if (i30 == 3) {
                                org.telegram.messenger.i0.C3(true);
                                org.telegram.messenger.at.e().b(le0Var, org.telegram.messenger.at.h4);
                            }
                        }
                        le0Var.e0 = z10;
                        if (i30 != 3) {
                            i11 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                            org.telegram.ui.Components.s4.e0(i11, tL_error2, gf0Var2, confirmphone, new Object[0]);
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                le0Var.c(true);
                                gf0Var2.D1(0, true, null, true);
                                break;
                            }
                        } else {
                            le0Var.w();
                            break;
                        }
                    } else {
                        i10 = 2;
                    }
                    if (i30 == i10) {
                        int i32 = le0Var.i0;
                        if (i32 != 4) {
                        }
                        le0Var.s();
                        if (i30 == 15) {
                        }
                        le0Var.e0 = z10;
                        if (i30 != 3) {
                        }
                        if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        le0Var.w();
                    }
                    if (i30 == 4) {
                        int i33 = le0Var.i0;
                        if (i33 != i10) {
                            if (i33 != 17) {
                                break;
                            }
                        }
                        le0Var.s();
                    }
                    if (i30 == 15) {
                    }
                    le0Var.e0 = z10;
                    if (i30 != 3) {
                    }
                    if (tL_error2.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    le0Var.w();
                }
                break;
            case 3:
                le0 le0Var2 = (le0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                int i34 = le0Var2.h0;
                gf0 gf0Var3 = le0Var2.u0;
                le0Var2.x(false);
                le0Var2.f0 = false;
                if (tL_error3 == null) {
                    TLRPC.User user2 = (TLRPC.User) tLObject2;
                    le0Var2.u();
                    le0Var2.t();
                    i13 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                    org.telegram.messenger.e20.i(i13).w(user2);
                    i14 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                    org.telegram.messenger.e20.i(i14).v(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user2);
                    i15 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                    org.telegram.messenger.is.a0(i15).m1(arrayList2, null, true, true);
                    i16 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                    org.telegram.messenger.wp.r1(i16).U3(user2, false, false);
                    i17 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                    org.telegram.messenger.at.f(i17).k(46, new Object[0]);
                    gf0Var3.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                    if (i34 == 3) {
                        org.telegram.messenger.i0.T();
                    }
                    le0Var2.p(new zd0(le0Var2, i28));
                    break;
                } else {
                    le0Var2.g0 = tL_error3.text;
                    le0Var2.f0 = false;
                    gf0Var3.E1(false, true);
                    if (i34 == 3) {
                        int i35 = le0Var2.i0;
                        if (i35 != 4) {
                            i12 = 2;
                            if (i35 != 2) {
                                if (i35 != 17) {
                                    break;
                                }
                            }
                        }
                        le0Var2.s();
                        if (i34 == 15) {
                            org.telegram.messenger.at.e().b(le0Var2, org.telegram.messenger.at.g4);
                            z11 = true;
                        } else if (i34 == 2) {
                            z11 = true;
                            org.telegram.messenger.i0.D3(true);
                            org.telegram.messenger.at.e().b(le0Var2, org.telegram.messenger.at.g4);
                        } else {
                            z11 = true;
                            if (i34 == 3) {
                                org.telegram.messenger.i0.C3(true);
                                org.telegram.messenger.at.e().b(le0Var2, org.telegram.messenger.at.h4);
                            }
                        }
                        le0Var2.e0 = z11;
                        if (i34 != 3) {
                            if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                                gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                            } else if (tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                                le0Var2.w();
                                break;
                            } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                le0Var2.c(true);
                                gf0Var3.D1(0, true, null, true);
                                gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                            } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                                gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                            } else {
                                String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                                sb2.append(tL_error3.text);
                                gf0Var3.u1(L0, sb2.toString());
                            }
                            int i36 = 0;
                            while (true) {
                                zr zrVar = le0Var2.f;
                                bs[] bsVarArr = zrVar.f;
                                if (i36 >= bsVarArr.length) {
                                    zrVar.e = false;
                                    bsVarArr[0].requestFocus();
                                    break;
                                } else {
                                    bsVarArr[i36].setText("");
                                    i36++;
                                }
                            }
                        }
                    } else {
                        i12 = 2;
                    }
                    if (i34 == i12) {
                        int i37 = le0Var2.i0;
                        if (i37 != 4) {
                        }
                        le0Var2.s();
                        if (i34 == 15) {
                        }
                        le0Var2.e0 = z11;
                        if (i34 != 3) {
                        }
                    }
                    if (i34 == 4) {
                        int i38 = le0Var2.i0;
                        if (i38 != i12) {
                            if (i38 != 17) {
                                break;
                            }
                        }
                        le0Var2.s();
                    }
                    if (i34 == 15) {
                    }
                    le0Var2.e0 = z11;
                    if (i34 != 3) {
                    }
                }
                break;
            case 4:
                le0 le0Var3 = (le0) this.b;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                le0Var3.q0 = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                le0Var3.r0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    le0Var3.i0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    le0Var3.i0 = 16;
                }
                le0Var3.u0.p1(bundle, tL_auth_sentCode, true);
                break;
            case 5:
                re0 re0Var = (re0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                vh.d dVar = re0Var.b;
                gf0 gf0Var4 = re0Var.w;
                re0Var.s = -1;
                if (!(tLObject4 instanceof TLRPC.auth_SentCode)) {
                    if (tL_error4 != null) {
                        String str2 = tL_error4.text;
                        if (str2 != null && str2.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.i0.h3(new me0(re0Var, 0), Integer.parseInt(tL_error4.text.substring(11)) * 1000);
                            break;
                        } else {
                            String str3 = tL_error4.text;
                            if (str3 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str3)) {
                                gf0Var4.D1(0, true, null, true);
                                gf0Var4.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                                break;
                            } else {
                                re0Var.e = tL_error4.text;
                                re0Var.f = false;
                                dVar.setLoading(false);
                                new org.telegram.ui.Components.cc(gf0Var4.Z, null).H(R.raw.error, org.telegram.messenger.dd.a0(null, null, 2131743903, tL_error4.text));
                                break;
                            }
                        }
                    }
                } else {
                    re0Var.f = false;
                    dVar.setLoading(false);
                    org.telegram.ui.ActionBar.z4 parentLayout = gf0Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentStack.isEmpty() ? null : (org.telegram.ui.ActionBar.k2) sc.e.g(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i39 = 0;
                        while (i39 < size) {
                            Object obj = arrayList3.get(i39);
                            i39++;
                            org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                            if ((k2Var2 instanceof qm0) && k2Var2 != k2Var) {
                                k2Var2.removeSelfFromStack();
                            }
                        }
                        if (k2Var instanceof qm0) {
                            z12 = true;
                            ((ActionBarLayout) parentLayout).l(true, false);
                            gf0Var4.p1(re0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                            break;
                        }
                    }
                    z12 = true;
                    gf0Var4.p1(re0Var.d, (TLRPC.auth_SentCode) tLObject4, z12);
                }
                break;
            case 6:
                re0 re0Var2 = (re0) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                gf0 gf0Var5 = re0Var2.w;
                gf0Var5.e = true;
                gf0 gf0Var6 = (gf0) LaunchActivity.L();
                if (gf0Var6 == null) {
                    i18 = ((org.telegram.ui.ActionBar.k2) gf0Var5).currentAccount;
                    gf0Var6 = new gf0(i18);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(gf0Var6);
                    }
                }
                gf0Var6.z1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 7:
                ff0 ff0Var = (ff0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                HashMap hashMap = (HashMap) this.d;
                df0 df0Var = ff0Var.a;
                if (tLObject5 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject5;
                    if (df0Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = ff0Var.G;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i40 = 0;
                            while (true) {
                                if (i40 >= arrayList4.size()) {
                                    mtVar = null;
                                } else if (arrayList4.get(i40) == null || !((mt) arrayList4.get(i40)).a.equals(upperCase)) {
                                    i40++;
                                } else {
                                    mtVar = (mt) arrayList4.get(i40);
                                }
                            }
                            if (mtVar != null) {
                                df0Var.setText(mtVar.c);
                                ff0Var.E = 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                ig0 ig0Var = (ig0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                if (tL_error5 != null) {
                    ig0Var.getClass();
                    break;
                } else {
                    ig0 ig0Var2 = ig0Var.s0.a;
                    int i41 = 0;
                    while (true) {
                        ArrayList arrayList5 = ig0Var2.j0;
                        if (i41 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i41)).link.equals(tL_chatInviteExported.link)) {
                            zf0 l02 = ig0Var2.l0();
                            arrayList5.remove(i41);
                            ig0Var2.n0(l02);
                            break;
                        } else {
                            i41++;
                        }
                    }
                }
            case 9:
                org.telegram.messenger.i0.g3(new if0(i27, (org.telegram.ui.Components.vg) this.d, org.telegram.messenger.is.a0(((ei0) this.b).a).j0(((TLRPC.TL_contact) this.c).user_id)));
                break;
            case 10:
                ei0 ei0Var = (ei0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.Components.vg vgVar = (org.telegram.ui.Components.vg) this.d;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    org.telegram.messenger.wp.r1(ei0Var.a).V3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.wp.r1(ei0Var.a).P3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = org.telegram.messenger.o5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        user = org.telegram.messenger.wp.r1(ei0Var.a).Z1(Long.valueOf(o10));
                        vgVar.a(user);
                        break;
                    }
                }
                user = null;
                vgVar.a(user);
            case 11:
                qi0 qi0Var2 = (qi0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qi0Var2.n;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String R02 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R02) || R02.length() == 0) {
                        R02 = null;
                    }
                    int i42 = (R02 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i42];
                    strArr[0] = lowerCase;
                    if (R02 != null) {
                        strArr[1] = R02;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String[] strArr2 = new String[2];
                    int i43 = 0;
                    while (i43 < arrayList6.size()) {
                        si0 si0Var = (si0) arrayList6.get(i43);
                        if (org.telegram.messenger.o5.C(si0Var.d)) {
                            i19 = i43;
                            TLRPC.EncryptedChat Z0 = notificationsCustomSettingsActivity.getMessagesController().Z0(Integer.valueOf((int) (si0Var.d & 4294967295L)));
                            if (Z0 != null && (Z1 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(Z0.user_id))) != null) {
                                strArr2[0] = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                                strArr2[1] = org.telegram.messenger.i20.n(Z1);
                            }
                        } else {
                            i19 = i43;
                            if (org.telegram.messenger.o5.E(si0Var.d)) {
                                TLRPC.User Z12 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(si0Var.d));
                                if (Z12 != null && !Z12.deleted) {
                                    strArr2[0] = org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name);
                                    strArr2[1] = org.telegram.messenger.i20.n(Z12);
                                    z14 = true;
                                    z13 = false;
                                    chat = Z12;
                                    String str5 = strArr2[z13 ? 1 : 0];
                                    strArr2[z13 ? 1 : 0] = str5.toLowerCase();
                                    arrayList = arrayList6;
                                    R0 = org.telegram.messenger.dd.D0().R0(strArr2[z13 ? 1 : 0], z14, z13);
                                    str = strArr2[z13 ? 1 : 0];
                                    if (str != null && str.equals(R0)) {
                                        R0 = null;
                                    }
                                    int i44 = z13 ? 1 : 0;
                                    i21 = i44;
                                    while (i21 < i42) {
                                        ?? r27 = z13;
                                        String str6 = strArr[i21];
                                        qi0Var = qi0Var2;
                                        String str7 = strArr2[r27];
                                        i20 = i42;
                                        if ((str7 == null || !(str7.startsWith(str6) || sc.e.y(" ", str6, strArr2[r27]))) && (R0 == null || !(R0.startsWith(str6) || sc.e.y(" ", str6, R0)))) {
                                            i22 = 1;
                                            String str8 = strArr2[1];
                                            if (str8 != null && str8.startsWith(str6)) {
                                                i44 = 2;
                                            }
                                        } else {
                                            i22 = 1;
                                            i44 = 1;
                                        }
                                        if (i44 != 0) {
                                            if (i44 == i22) {
                                                arrayList9.add(org.telegram.messenger.i0.r0(str5, null, str6));
                                            } else {
                                                arrayList9.add(org.telegram.messenger.i0.r0("@" + strArr2[i22], null, "@" + str6));
                                            }
                                            arrayList8.add(si0Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i21++;
                                            qi0Var2 = qi0Var;
                                            i42 = i20;
                                            z13 = false;
                                        }
                                    }
                                    qi0Var = qi0Var2;
                                    i20 = i42;
                                }
                                arrayList = arrayList6;
                                qi0Var = qi0Var2;
                                i20 = i42;
                            } else {
                                TLRPC.Chat L02 = notificationsCustomSettingsActivity.getMessagesController().L0(Long.valueOf(-si0Var.d));
                                if (L02 != null) {
                                    if (!L02.left && !L02.kicked && L02.migrated_to == null) {
                                        z13 = false;
                                        strArr2[0] = L02.title;
                                        z14 = true;
                                        strArr2[1] = org.telegram.messenger.w3.K(L02, false);
                                        chat = L02;
                                        String str52 = strArr2[z13 ? 1 : 0];
                                        strArr2[z13 ? 1 : 0] = str52.toLowerCase();
                                        arrayList = arrayList6;
                                        R0 = org.telegram.messenger.dd.D0().R0(strArr2[z13 ? 1 : 0], z14, z13);
                                        str = strArr2[z13 ? 1 : 0];
                                        if (str != null) {
                                            R0 = null;
                                        }
                                        int i442 = z13 ? 1 : 0;
                                        i21 = i442;
                                        while (i21 < i42) {
                                        }
                                        qi0Var = qi0Var2;
                                        i20 = i42;
                                    }
                                    arrayList = arrayList6;
                                    qi0Var = qi0Var2;
                                    i20 = i42;
                                }
                            }
                            i43 = i19 + 1;
                            arrayList6 = arrayList;
                            qi0Var2 = qi0Var;
                            i42 = i20;
                        }
                        z14 = true;
                        z13 = false;
                        chat = null;
                        String str522 = strArr2[z13 ? 1 : 0];
                        strArr2[z13 ? 1 : 0] = str522.toLowerCase();
                        arrayList = arrayList6;
                        R0 = org.telegram.messenger.dd.D0().R0(strArr2[z13 ? 1 : 0], z14, z13);
                        str = strArr2[z13 ? 1 : 0];
                        if (str != null) {
                        }
                        int i4422 = z13 ? 1 : 0;
                        i21 = i4422;
                        while (i21 < i42) {
                        }
                        qi0Var = qi0Var2;
                        i20 = i42;
                        i43 = i19 + 1;
                        arrayList6 = arrayList;
                        qi0Var2 = qi0Var;
                        i42 = i20;
                    }
                    org.telegram.messenger.i0.g3(new v50(qi0Var2, arrayList8, arrayList9, arrayList7, 14));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new v50(qi0Var2, new ArrayList(), new ArrayList(), new ArrayList(), 14));
                    break;
                }
                break;
            case 12:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.b, (ArrayList) this.c, (Runnable) this.d);
                break;
            case 13:
                jl0 jl0Var = (jl0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                jl0Var.B1();
                if (tL_error6 != null) {
                    if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                        jl0Var.Q1(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error6.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        jl0Var.Q1(org.telegram.messenger.dd.L0(R.string.AppName, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject7;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                    alertDialog$Builder.a.T = org.telegram.messenger.dd.a0("RestoreEmailSent", null, 2131746097, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.R = org.telegram.messenger.dd.L0(2131746095, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new qv(28, jl0Var, tL_auth_passwordRecovery));
                    Dialog showDialog = jl0Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 14:
                ((xk0) this.b).d(((TLRPC.TL_error) this.d).text, (String) this.c);
                break;
            case 15:
                wk0 wk0Var = (wk0) this.b;
                byte[] bArr = (byte[]) this.c;
                String str9 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                jl0 jl0Var2 = wk0Var.e;
                secureRandom.setSeed(jl0Var2.J.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = jl0Var2.J;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = org.telegram.messenger.bw.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] t12 = jl0.t1();
                jl0Var2.c1 = t12;
                jl0Var2.b1 = Utilities.g(Utilities.o(32, t12));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = jl0Var2.J.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(org.telegram.messenger.i0.h1(str9), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    jl0Var2.e1 = m10;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m10, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(jl0Var2.e1, 32, bArr3, 0, 16);
                    byte[] bArr4 = jl0Var2.c1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = jl0Var2.c1;
                    tL_secureSecretSettings.secure_secret_id = jl0Var2.b1;
                    passwordinputsettings.flags |= 4;
                }
                i23 = ((org.telegram.ui.ActionBar.k2) jl0Var2).currentAccount;
                ConnectionsManager.getInstance(i23).sendRequest(updatepasswordsettings, new uk0(wk0Var, i29));
                break;
            case 16:
                fl0 fl0Var = (fl0) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.c;
                int i45 = fl0Var.L;
                jl0 jl0Var3 = fl0Var.Q;
                jl0Var3.B1();
                fl0Var.J = false;
                if (tL_error7 != null) {
                    fl0Var.K = tL_error7.text;
                    if ((i45 == 3 && ((i26 = fl0Var.M) == 4 || i26 == 2)) || ((i45 == 2 && ((i24 = fl0Var.M) == 4 || i24 == 3)) || (i45 == 4 && fl0Var.M == 2))) {
                        fl0Var.p();
                    }
                    if (i45 == 2) {
                        org.telegram.messenger.i0.D3(true);
                        org.telegram.messenger.at.e().b(fl0Var, org.telegram.messenger.at.g4);
                    } else if (i45 == 3) {
                        org.telegram.messenger.i0.C3(true);
                        org.telegram.messenger.at.e().b(fl0Var, org.telegram.messenger.at.h4);
                    }
                    fl0Var.I = true;
                    if (i45 != 3) {
                        i25 = ((org.telegram.ui.ActionBar.k2) jl0Var3).currentAccount;
                        org.telegram.ui.Components.s4.e0(i25, tL_error7, jl0Var3, verifyphone, new Object[0]);
                    }
                    jl0Var3.R1(true, false);
                    if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            fl0Var.c(true);
                            jl0Var3.O1(null, 0, true);
                            break;
                        }
                    } else {
                        int i46 = 0;
                        while (true) {
                            EditTextBoldCursor[] editTextBoldCursorArr = fl0Var.d;
                            if (i46 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                                break;
                            } else {
                                editTextBoldCursorArr[i46].setText("");
                                i46++;
                            }
                        }
                    }
                } else {
                    fl0Var.r();
                    fl0Var.q();
                    ((nk0) jl0Var3.B1).c(jl0Var3.E, (String) jl0Var3.s1.get("phone"), null, null, null, null, null, null, null, null, new vj0(jl0Var3, i27), null);
                    break;
                }
                break;
            case 17:
                qm0.Z((qm0) this.b, (TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 18:
                qm0.g0((qm0) this.b, (TLRPC.TL_error) this.d, (TLRPC.TL_payments_sendPaymentForm) this.c);
                break;
            case 19:
                qm0 qm0Var = (qm0) this.b;
                TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
                if0 if0Var = (if0) this.d;
                qm0Var.E0 = tL_payments_validatedRequestedInfo;
                if0Var.run();
                qm0Var.J0(false);
                qm0Var.N0(true, false);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.lc lcVar = (org.telegram.messenger.lc) this.c;
                String str10 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                lcVar.a();
                if (str10.equals(photoViewer.C4.Q)) {
                    photoViewer.w4 = 2;
                    photoViewer.x4 = str10;
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                oo0 oo0Var = (oo0) this.d;
                photoViewer2.C4.v0(bitmap);
                photoViewer2.t5.setUndoCutState(true);
                photoViewer2.d3(true, true);
                org.telegram.messenger.i0.r(oo0Var);
                org.telegram.messenger.i0.h3(oo0Var, 800L);
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                boolean[] zArr = (boolean[]) this.c;
                kp0 kp0Var = (kp0) this.d;
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
                    kp0Var.run();
                    break;
                }
                break;
            case 23:
                mr0 mr0Var = (mr0) this.b;
                mr0 mr0Var2 = (mr0) this.c;
                int[] iArr = (int[]) this.d;
                PhotoViewer photoViewer4 = mr0Var.d;
                if (photoViewer4.D != null && mr0Var2 == photoViewer4.x8) {
                    photoViewer4.x8 = null;
                    photoViewer4.q8 = iArr[5];
                    photoViewer4.i8 = iArr[4];
                    photoViewer4.j8 = iArr[7];
                    float f7 = photoViewer4.g8 / 8;
                    PhotoViewer photoViewer5 = mr0Var.d;
                    photoViewer4.r8 = (long) ((f7 * photoViewer5.i8) / 1000.0f);
                    if (photoViewer5.k8) {
                        PhotoViewer photoViewer6 = mr0Var.d;
                        photoViewer6.b8 = iArr[8];
                        photoViewer6.G3();
                        if (mr0Var.d.Y7 > mr0Var.d.Z7 - 1) {
                            PhotoViewer photoViewer7 = mr0Var.d;
                            photoViewer7.Y7 = photoViewer7.Z7 - 1;
                        }
                        PhotoViewer photoViewer8 = mr0Var.d;
                        if (!photoViewer8.J4) {
                            org.telegram.ui.Components.j61 j61Var = photoViewer8.j1;
                            boolean z15 = photoViewer8.Z7 > 1;
                            PhotoViewer photoViewer9 = mr0Var.d;
                            j61Var.a(Math.min(photoViewer9.e8, mr0Var.d.f8), z15, photoViewer9.r);
                        }
                        if (org.telegram.messenger.v2.a) {
                            StringBuilder sb3 = new StringBuilder("compressionsCount = ");
                            sb3.append(mr0Var.d.Z7);
                            sb3.append(" w = ");
                            sb3.append(mr0Var.d.c8);
                            sb3.append(" h = ");
                            sb3.append(mr0Var.d.d8);
                            sb3.append(" r = ");
                            i0.a.p(mr0Var.d.b8, sb3);
                        }
                        mr0Var.d.O7.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = mr0Var.d;
                        if (!photoViewer10.J4) {
                            photoViewer10.j1.a(Math.min(photoViewer10.e8, mr0Var.d.f8), false, photoViewer10.r);
                        }
                        mr0Var.d.Z7 = 0;
                    }
                    mr0Var.d.E3();
                    mr0Var.d.A3();
                    break;
                }
                break;
            case 24:
                jt0 jt0Var = (jt0) this.b;
                un unVar = (un) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
                org.telegram.messenger.kj kjVar = jt0Var.H;
                byte[] bArr5 = pollAnswer.option;
                if (kjVar != null && (message = kjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    org.telegram.messenger.kj.B0(message);
                    knVar = new kn();
                    knVar.a = kjVar;
                    knVar.b = -1;
                    knVar.c = -1;
                    knVar.h = true;
                    knVar.e = bArr5;
                    knVar.f();
                }
                unVar.ac(kjVar, knVar);
                jt0Var.c(false);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                if (tL_error8 == null) {
                    if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(premiumPreviewFragment), null);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cc.d0(tL_error8);
                    break;
                }
                break;
            case 26:
                a();
                break;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.c;
                un unVar2 = (un) this.d;
                RectF rectF = ProfileActivity.S6;
                org.telegram.ui.Components.on onVar = snVar.e;
                ViewGroup viewGroup = (ViewGroup) unVar2.fragmentView;
                RectF rectF2 = zg.h.h;
                zg.h.c(onVar, viewGroup, rectF2);
                profileActivity.e6 = rectF2.left;
                profileActivity.d4();
                break;
            case 28:
                org.telegram.ui.Components.cc.D((sb) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                break;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) this.d;
                secretMediaViewer.k0 = 0;
                secretMediaViewer.I0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                fg.i iVar = secretMediaViewer.e;
                if (iVar != null) {
                    iVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    a11 a11Var = secretMediaViewer.n;
                    TLRPC.Message message2 = kjVar2.k;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    a11Var.e = false;
                    a11Var.f = j10;
                    a11Var.h = j11;
                    a11Var.n.start();
                    a11Var.invalidate();
                    if (!secretMediaViewer.f1) {
                        if (secretMediaViewer.o1 && org.telegram.messenger.wp.d1().getInt("viewoncehint", 0) < 3) {
                            secretMediaViewer.m();
                            break;
                        }
                    } else {
                        secretMediaViewer.e(true, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pd0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
