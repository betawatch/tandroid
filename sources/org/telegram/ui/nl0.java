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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275 A[LOOP:1: B:128:0x026f->B:130:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.h6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i11;
        org.telegram.ui.ActionBar.f6 k10;
        qp0 qp0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        jk jkVar;
        int i13 = 16;
        switch (this.a) {
            case 0:
                ((PasscodeActivity) ((be0) this.b).n).n0();
                break;
            case 1:
                PasskeysActivity.W((PasskeysActivity) this.b);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                } else {
                    SharedConfig.getCountryLangs();
                    break;
                }
            case 3:
                ((sm0) this.b).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.e5.x0(((wm0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                ci.o2 o2Var = (ci.o2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                gn0 gn0Var = (gn0) o2Var.b;
                double d = currentTimeMillis - gn0Var.G;
                gn0Var.G = currentTimeMillis;
                int i14 = (int) (gn0Var.E - d);
                gn0Var.E = i14;
                if (i14 <= 1000) {
                    gn0Var.r.setVisibility(0);
                    gn0Var.n.setVisibility(8);
                    gn0Var.r();
                    break;
                }
                break;
            case 6:
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
                    gn0Var2.s();
                    int i20 = gn0Var2.L;
                    if (i20 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(gn0Var2, NotificationCenter.didReceiveCall);
                        gn0Var2.I = false;
                        gn0Var2.r();
                        gn0Var2.u();
                        break;
                    } else if (i20 == 2 || i20 == 4) {
                        int i21 = gn0Var2.M;
                        if (i21 != 4 && i21 != 2) {
                            if (i21 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(gn0Var2, NotificationCenter.didReceiveSmsCode);
                                gn0Var2.I = false;
                                gn0Var2.r();
                                gn0Var2.u();
                                break;
                            }
                        } else {
                            if (i21 == 4) {
                                dn0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                dn0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            gn0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = gn0Var2.a;
                            tL_auth_resendCode.phone_code_hash = gn0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.n2) gn0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(fn0Var, i13), 2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                nf.f.s(((co0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                so0 so0Var = ((ho0) this.b).a;
                so0Var.t0();
                so0Var.H0(true, false);
                so0Var.D0(false);
                break;
            case 9:
                nf.f.s(((lo0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                wp0 wp0Var = (wp0) this.b;
                wp0Var.S = !wp0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string) == null || org.telegram.ui.ActionBar.i6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string2) == null || !org.telegram.ui.ActionBar.i6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
                if (string.equals(string2)) {
                    if (h6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !wp0Var.S ? org.telegram.ui.ActionBar.i6.N0(str2) : org.telegram.ui.ActionBar.i6.N0(str);
                        wp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.i6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.i6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.i6.nl;
                        if (iArr != null) {
                            for (int i22 = 0; i22 < iArr.length; i22++) {
                                wp0Var.v.put(i22, iArr[i22]);
                            }
                        }
                        for (i11 = 0; i11 < Q0.size(); i11++) {
                            wp0Var.v.put(Q0.keyAt(i11), Q0.valueAt(i11));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, wp0Var.v);
                        }
                        qp0Var = wp0Var.h;
                        if (qp0Var != null && qp0Var.v != null) {
                            cf.c H = org.telegram.ui.ActionBar.i6.H(N0, wp0Var.v, strArr[0], 0, true);
                            lp0 lp0Var = wp0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            lp0Var.setOverrideBackground(drawable);
                        }
                        z10 = wp0Var.S;
                        if (wp0Var.a0 != z10) {
                            wp0Var.a0 = z10;
                            org.telegram.ui.Components.kj0 kj0Var = wp0Var.T;
                            kj0Var.P(z10 ? kj0Var.e[0] : 0);
                            org.telegram.ui.Components.kj0 kj0Var2 = wp0Var.T;
                            if (kj0Var2 != null) {
                                kj0Var2.start();
                            }
                        }
                        wp0Var.E0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!wp0Var.S) {
                }
                wp0Var.v.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.i6.nl;
                if (iArr != null) {
                }
                while (i11 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                qp0Var = wp0Var.h;
                if (qp0Var != null) {
                    cf.c H2 = org.telegram.ui.ActionBar.i6.H(N0, wp0Var.v, strArr[0], 0, true);
                    lp0 lp0Var2 = wp0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    lp0Var2.setOverrideBackground(drawable);
                }
                z10 = wp0Var.S;
                if (wp0Var.a0 != z10) {
                }
                wp0Var.E0();
                break;
            case 11:
                op0 op0Var = (op0) this.b;
                qp0 qp0Var2 = op0Var.c;
                vp0 vp0Var = qp0Var2.E;
                wp0 wp0Var2 = qp0Var2.p0;
                if (vp0Var != null && qp0Var2.L.size() > 1) {
                    vp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) qp0Var2.M.get(1);
                    qp0Var2.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = qp0Var2.J;
                        if (v3Var != null) {
                            v3Var.f();
                            qp0Var2.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = qp0Var2.J;
                        if (v3Var2 == null || v3Var2.b != starGift.id) {
                            i12 = ((org.telegram.ui.ActionBar.n2) wp0Var2).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(qp0Var2.K.id, i12, new t3(op0Var, i13));
                            qp0Var2.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    qp0.a(qp0Var2);
                    (wp0Var2.I.getCurrentPosition() == 1 ? wp0Var2.n : wp0Var2.h).e();
                    break;
                }
                break;
            case 12:
                wq0 wq0Var = ((nq0) this.b).h;
                wq0Var.b0(wq0Var.P.getSearchField());
                break;
            case 13:
                ((oq0) this.b).z0.L.l();
                break;
            case 14:
                ((qu0) this.b).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) this.b;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j3 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = vVar.a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((zs0) this.b).a;
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
            case 17:
                yn ynVar = ((bt0) this.b).Z0.l4;
                if (ynVar != null && (jkVar = ynVar.W) != null) {
                    jkVar.H0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.cl0 cl0Var = (org.telegram.ui.Components.cl0) ((ap0) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) cl0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.e81 e81Var = photoViewer3.F2;
                if (e81Var != null) {
                    e81Var.C();
                }
                ((PhotoViewer) cl0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((os0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.e81 e81Var2 = photoViewer4.F2;
                if (e81Var2 != null) {
                    e81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                au0 au0Var = (au0) ((ap0) this.b).b;
                au0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = au0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((dt0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((lu0) this.b).s.d(true);
                break;
            case 23:
                ((pu0) this.b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((ww0) this.b).c;
                premiumPreviewFragment.showDialog(new z31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.mk) this.b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.b);
                break;
            case 27:
                ((ci.e4) this.b).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) this.b));
                break;
            default:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.G.getNotificationCenter().onAnimationFinish(zy0Var.F);
                break;
        }
    }
}
