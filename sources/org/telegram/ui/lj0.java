package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lj0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024f A[LOOP:1: B:124:0x0249->B:126:0x024f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0217  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.x6 P0;
        String[] strArr;
        SparseIntArray S0;
        int[] iArr;
        int i11;
        org.telegram.ui.ActionBar.w6 k10;
        lp0 lp0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        hk hkVar;
        int i13 = 17;
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((oj0) ((f) this.b).b).P);
                break;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b);
                break;
            case 2:
                ((PasscodeActivity) ((ld0) this.b).n).r0();
                break;
            case 3:
                PasskeysActivity.Y((PasskeysActivity) this.b);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                } else {
                    SharedConfig.getCountryLangs();
                    break;
                }
            case 5:
                ((qm0) this.b).a.finishFragment();
                break;
            case 6:
                org.telegram.ui.Components.g5.w0(((um0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 7:
                f6.r rVar = (f6.r) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                en0 en0Var = (en0) rVar.b;
                double d = currentTimeMillis - en0Var.G;
                en0Var.G = currentTimeMillis;
                int i14 = (int) (en0Var.E - d);
                en0Var.E = i14;
                if (i14 <= 1000) {
                    en0Var.r.setVisibility(0);
                    en0Var.n.setVisibility(8);
                    en0Var.q();
                    break;
                }
                break;
            case 8:
                dn0 dn0Var = (dn0) this.b;
                en0 en0Var2 = dn0Var.a;
                int i15 = en0Var2.y;
                fn0 fn0Var = en0Var2.s;
                bn0 bn0Var = en0Var2.n;
                if (i15 >= 1000) {
                    int i16 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    int i19 = en0Var2.M;
                    if (i19 == 4 || i19 == 3) {
                        bn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i17), Integer.valueOf(i18)));
                    } else if (i19 == 2) {
                        bn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i17), Integer.valueOf(i18)));
                    }
                    if (fn0Var != null) {
                        fn0Var.c = 1.0f - (en0Var2.y / en0Var2.P);
                        fn0Var.invalidate();
                        break;
                    }
                } else {
                    if (fn0Var != null) {
                        fn0Var.c = 1.0f;
                        fn0Var.invalidate();
                    }
                    en0Var2.r();
                    int i20 = en0Var2.L;
                    if (i20 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveCall);
                        en0Var2.I = false;
                        en0Var2.q();
                        en0Var2.s();
                        break;
                    } else if (i20 == 2 || i20 == 4) {
                        int i21 = en0Var2.M;
                        if (i21 != 4 && i21 != 2) {
                            if (i21 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveSmsCode);
                                en0Var2.I = false;
                                en0Var2.q();
                                en0Var2.s();
                                break;
                            }
                        } else {
                            if (i21 == 4) {
                                bn0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                bn0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            en0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = en0Var2.a;
                            tL_auth_resendCode.phone_code_hash = en0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.r2) en0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new l(dn0Var, i13), 2);
                            break;
                        }
                    }
                }
                break;
            case 9:
                qf.d.r(((zn0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                po0 po0Var = ((eo0) this.b).a;
                po0Var.u0();
                po0Var.I0(true, false);
                po0Var.E0(false);
                break;
            case 11:
                qf.d.r(((io0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                rp0 rp0Var = (rp0) this.b;
                rp0Var.S = !rp0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string) == null || org.telegram.ui.ActionBar.y6.P0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string2) == null || !org.telegram.ui.ActionBar.y6.P0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
                if (string.equals(string2)) {
                    if (x6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        P0 = !rp0Var.S ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
                        rp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = P0.d;
                        S0 = str3 == null ? org.telegram.ui.ActionBar.y6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.y6.S0(new File(P0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.y6.ql;
                        if (iArr != null) {
                            for (int i22 = 0; i22 < iArr.length; i22++) {
                                rp0Var.v.put(i22, iArr[i22]);
                            }
                        }
                        for (i11 = 0; i11 < S0.size(); i11++) {
                            rp0Var.v.put(S0.keyAt(i11), S0.valueAt(i11));
                        }
                        k10 = P0.k(false);
                        if (k10 != null) {
                            k10.c(S0, rp0Var.v);
                        }
                        lp0Var = rp0Var.h;
                        if (lp0Var != null && lp0Var.v != null) {
                            a8.me H = org.telegram.ui.ActionBar.y6.H(P0, rp0Var.v, strArr[0], 0, true);
                            gp0 gp0Var = rp0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            gp0Var.setOverrideBackground(drawable);
                        }
                        z10 = rp0Var.S;
                        if (rp0Var.a0 != z10) {
                            rp0Var.a0 = z10;
                            org.telegram.ui.Components.xj0 xj0Var = rp0Var.T;
                            xj0Var.P(z10 ? xj0Var.e[0] : 0);
                            org.telegram.ui.Components.xj0 xj0Var2 = rp0Var.T;
                            if (xj0Var2 != null) {
                                xj0Var2.start();
                            }
                        }
                        rp0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!rp0Var.S) {
                }
                rp0Var.v.clear();
                strArr = new String[1];
                String str32 = P0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.y6.ql;
                if (iArr != null) {
                }
                while (i11 < S0.size()) {
                }
                k10 = P0.k(false);
                if (k10 != null) {
                }
                lp0Var = rp0Var.h;
                if (lp0Var != null) {
                    a8.me H2 = org.telegram.ui.ActionBar.y6.H(P0, rp0Var.v, strArr[0], 0, true);
                    gp0 gp0Var2 = rp0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    gp0Var2.setOverrideBackground(drawable);
                }
                z10 = rp0Var.S;
                if (rp0Var.a0 != z10) {
                }
                rp0Var.F0();
                break;
            case 13:
                jp0 jp0Var = (jp0) this.b;
                lp0 lp0Var2 = jp0Var.c;
                qp0 qp0Var = lp0Var2.E;
                rp0 rp0Var2 = lp0Var2.p0;
                if (qp0Var != null && lp0Var2.L.size() > 1) {
                    qp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) lp0Var2.M.get(1);
                    lp0Var2.K = starGift;
                    if (starGift == null) {
                        zh.u3 u3Var = lp0Var2.J;
                        if (u3Var != null) {
                            u3Var.a();
                            lp0Var2.J = null;
                        }
                    } else {
                        zh.u3 u3Var2 = lp0Var2.J;
                        if (u3Var2 == null || u3Var2.b != starGift.id) {
                            i12 = ((org.telegram.ui.ActionBar.r2) rp0Var2).currentAccount;
                            zh.u3 u3Var3 = new zh.u3(lp0Var2.K.id, i12, new t3(jp0Var, i13));
                            lp0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    lp0.a(lp0Var2);
                    (rp0Var2.I.getCurrentPosition() == 1 ? rp0Var2.n : rp0Var2.h).e();
                    break;
                }
                break;
            case 14:
                rq0 rq0Var = ((iq0) this.b).b;
                rq0Var.c0(rq0Var.P.getSearchField());
                break;
            case 15:
                ((jq0) this.b).o0.L.l();
                break;
            case 16:
                ((iu0) this.b).invalidate();
                break;
            case 17:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) this.b;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                long j10 = uVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.v2(j10);
                if (photoViewer.c2 == 1) {
                    long j11 = uVar.a;
                    photoViewer.X7 = j11;
                    if (photoViewer.W7 != j11) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.c = null;
                break;
            case 18:
                PhotoViewer photoViewer2 = ((rs0) this.b).a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 19:
                un unVar = ((ts0) this.b).c1.l4;
                if (unVar != null && (hkVar = unVar.Y) != null) {
                    hkVar.F0();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) ((i50) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ll0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.s81 s81Var = photoViewer3.F2;
                if (s81Var != null) {
                    s81Var.C();
                }
                ((PhotoViewer) ll0Var.c).I2 = null;
                break;
            case 21:
                PhotoViewer photoViewer4 = ((gs0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.s81 s81Var2 = photoViewer4.F2;
                if (s81Var2 != null) {
                    s81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 22:
                st0 st0Var = (st0) ((i50) this.b).b;
                st0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = st0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.A2(true);
                break;
            case 23:
                PhotoViewer photoViewer6 = ((vs0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 24:
                ((du0) this.b).x.d(true);
                break;
            case 25:
                ((hu0) this.b).d = true;
                break;
            case 26:
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) this.b).c;
                premiumPreviewFragment.showDialog(new a31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 27:
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.b;
                int i23 = ProfileActivity.R6;
                kkVar.run(0);
                break;
            case 28:
                String str4 = (String) this.b;
                int i24 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard(str4);
                break;
            default:
                ((fi.v3) this.b).e(true);
                break;
        }
    }
}
