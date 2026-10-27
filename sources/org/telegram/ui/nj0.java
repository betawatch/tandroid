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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj0(Object obj, int i10) {
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
        np0 np0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        jk jkVar;
        int i13 = 17;
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((qj0) ((f) this.b).b).P);
                break;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.b);
                break;
            case 2:
                ((PasscodeActivity) ((nd0) this.b).n).r0();
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
                ((sm0) this.b).a.finishFragment();
                break;
            case 6:
                org.telegram.ui.Components.g5.w0(((wm0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 7:
                f6.r rVar = (f6.r) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                gn0 gn0Var = (gn0) rVar.b;
                double d = currentTimeMillis - gn0Var.G;
                gn0Var.G = currentTimeMillis;
                int i14 = (int) (gn0Var.E - d);
                gn0Var.E = i14;
                if (i14 <= 1000) {
                    gn0Var.r.setVisibility(0);
                    gn0Var.n.setVisibility(8);
                    gn0Var.q();
                    break;
                }
                break;
            case 8:
                fn0 fn0Var = (fn0) this.b;
                gn0 gn0Var2 = fn0Var.a;
                int i15 = gn0Var2.y;
                hn0 hn0Var = gn0Var2.s;
                dn0 dn0Var = gn0Var2.n;
                if (i15 >= 1000) {
                    int i16 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    int i19 = gn0Var2.M;
                    if (i19 == 4 || i19 == 3) {
                        dn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i17), Integer.valueOf(i18)));
                    } else if (i19 == 2) {
                        dn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i17), Integer.valueOf(i18)));
                    }
                    if (hn0Var != null) {
                        hn0Var.c = 1.0f - (gn0Var2.y / gn0Var2.P);
                        hn0Var.invalidate();
                        break;
                    }
                } else {
                    if (hn0Var != null) {
                        hn0Var.c = 1.0f;
                        hn0Var.invalidate();
                    }
                    gn0Var2.r();
                    int i20 = gn0Var2.L;
                    if (i20 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(gn0Var2, NotificationCenter.didReceiveCall);
                        gn0Var2.I = false;
                        gn0Var2.q();
                        gn0Var2.s();
                        break;
                    } else if (i20 == 2 || i20 == 4) {
                        int i21 = gn0Var2.M;
                        if (i21 != 4 && i21 != 2) {
                            if (i21 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(gn0Var2, NotificationCenter.didReceiveSmsCode);
                                gn0Var2.I = false;
                                gn0Var2.q();
                                gn0Var2.s();
                                break;
                            }
                        } else {
                            if (i21 == 4) {
                                dn0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                dn0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            gn0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = gn0Var2.a;
                            tL_auth_resendCode.phone_code_hash = gn0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.r2) gn0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new l(fn0Var, i13), 2);
                            break;
                        }
                    }
                }
                break;
            case 9:
                qf.d.r(((bo0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                ro0 ro0Var = ((go0) this.b).a;
                ro0Var.u0();
                ro0Var.I0(true, false);
                ro0Var.E0(false);
                break;
            case 11:
                qf.d.r(((ko0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                tp0 tp0Var = (tp0) this.b;
                tp0Var.S = !tp0Var.S;
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
                        P0 = !tp0Var.S ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
                        tp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = P0.d;
                        S0 = str3 == null ? org.telegram.ui.ActionBar.y6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.y6.S0(new File(P0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.y6.ql;
                        if (iArr != null) {
                            for (int i22 = 0; i22 < iArr.length; i22++) {
                                tp0Var.v.put(i22, iArr[i22]);
                            }
                        }
                        for (i11 = 0; i11 < S0.size(); i11++) {
                            tp0Var.v.put(S0.keyAt(i11), S0.valueAt(i11));
                        }
                        k10 = P0.k(false);
                        if (k10 != null) {
                            k10.c(S0, tp0Var.v);
                        }
                        np0Var = tp0Var.h;
                        if (np0Var != null && np0Var.v != null) {
                            a8.me H = org.telegram.ui.ActionBar.y6.H(P0, tp0Var.v, strArr[0], 0, true);
                            ip0 ip0Var = tp0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            ip0Var.setOverrideBackground(drawable);
                        }
                        z10 = tp0Var.S;
                        if (tp0Var.a0 != z10) {
                            tp0Var.a0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = tp0Var.T;
                            yj0Var.P(z10 ? yj0Var.e[0] : 0);
                            org.telegram.ui.Components.yj0 yj0Var2 = tp0Var.T;
                            if (yj0Var2 != null) {
                                yj0Var2.start();
                            }
                        }
                        tp0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!tp0Var.S) {
                }
                tp0Var.v.clear();
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
                np0Var = tp0Var.h;
                if (np0Var != null) {
                    a8.me H2 = org.telegram.ui.ActionBar.y6.H(P0, tp0Var.v, strArr[0], 0, true);
                    ip0 ip0Var2 = tp0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    ip0Var2.setOverrideBackground(drawable);
                }
                z10 = tp0Var.S;
                if (tp0Var.a0 != z10) {
                }
                tp0Var.F0();
                break;
            case 13:
                lp0 lp0Var = (lp0) this.b;
                np0 np0Var2 = lp0Var.c;
                sp0 sp0Var = np0Var2.E;
                tp0 tp0Var2 = np0Var2.p0;
                if (sp0Var != null && np0Var2.L.size() > 1) {
                    sp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) np0Var2.M.get(1);
                    np0Var2.K = starGift;
                    if (starGift == null) {
                        zh.u3 u3Var = np0Var2.J;
                        if (u3Var != null) {
                            u3Var.a();
                            np0Var2.J = null;
                        }
                    } else {
                        zh.u3 u3Var2 = np0Var2.J;
                        if (u3Var2 == null || u3Var2.b != starGift.id) {
                            i12 = ((org.telegram.ui.ActionBar.r2) tp0Var2).currentAccount;
                            zh.u3 u3Var3 = new zh.u3(np0Var2.K.id, i12, new t3(lp0Var, i13));
                            np0Var2.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    np0.a(np0Var2);
                    (tp0Var2.I.getCurrentPosition() == 1 ? tp0Var2.n : tp0Var2.h).e();
                    break;
                }
                break;
            case 14:
                tq0 tq0Var = ((kq0) this.b).b;
                tq0Var.c0(tq0Var.P.getSearchField());
                break;
            case 15:
                ((lq0) this.b).o0.L.l();
                break;
            case 16:
                ((ku0) this.b).invalidate();
                break;
            case 17:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) this.b;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                long j10 = uVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.w2(j10);
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
                PhotoViewer photoViewer2 = ((ts0) this.b).a;
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
                wn wnVar = ((vs0) this.b).c1.l4;
                if (wnVar != null && (jkVar = wnVar.Y) != null) {
                    jkVar.E0();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) ((k50) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ml0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.t81 t81Var = photoViewer3.F2;
                if (t81Var != null) {
                    t81Var.C();
                }
                ((PhotoViewer) ml0Var.c).I2 = null;
                break;
            case 21:
                PhotoViewer photoViewer4 = ((is0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.t81 t81Var2 = photoViewer4.F2;
                if (t81Var2 != null) {
                    t81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 22:
                ut0 ut0Var = (ut0) ((k50) this.b).b;
                ut0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = ut0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.B2(true);
                break;
            case 23:
                PhotoViewer photoViewer6 = ((xs0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 24:
                ((fu0) this.b).x.d(true);
                break;
            case 25:
                ((ju0) this.b).d = true;
                break;
            case 26:
                PremiumPreviewFragment premiumPreviewFragment = ((qw0) this.b).c;
                premiumPreviewFragment.showDialog(new c31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 27:
                org.telegram.messenger.lk lkVar = (org.telegram.messenger.lk) this.b;
                int i23 = ProfileActivity.R6;
                lkVar.run(0);
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
