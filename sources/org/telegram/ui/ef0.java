package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ef0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025d A[LOOP:1: B:122:0x0257->B:124:0x025d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0225  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        org.telegram.ui.ActionBar.j6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.h6 k10;
        bm0 bm0Var;
        boolean z9;
        Drawable drawable;
        int i11;
        qj qjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ci) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.K3(((yg0) this.b).a.G1);
                break;
            case 2:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b);
                break;
            case 3:
                ((PasscodeActivity) ((lb0) this.b).n).v0();
                break;
            case 4:
                PasskeysActivity.c0((PasskeysActivity) this.b);
                break;
            case 5:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i12 = tL_help_passportConfig.hash;
                    org.telegram.messenger.iz.j0 = null;
                    org.telegram.messenger.iz.i0 = str;
                    org.telegram.messenger.iz.k0 = i12;
                    org.telegram.messenger.iz.y();
                    org.telegram.messenger.iz.n();
                    break;
                } else {
                    org.telegram.messenger.iz.n();
                    break;
                }
            case 6:
                ((kj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.v4.u0(((pj0) this.b).e.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                break;
            case 8:
                fi.h2 h2Var = (fi.h2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                xj0 xj0Var = (xj0) h2Var.b;
                double d = currentTimeMillis - xj0Var.G;
                xj0Var.G = currentTimeMillis;
                int i13 = (int) (xj0Var.E - d);
                xj0Var.E = i13;
                if (i13 <= 1000) {
                    xj0Var.r.setVisibility(0);
                    xj0Var.n.setVisibility(8);
                    xj0Var.q();
                    break;
                }
                break;
            case 9:
                wj0 wj0Var = (wj0) this.b;
                xj0 xj0Var2 = wj0Var.a;
                int i14 = xj0Var2.D;
                yj0 yj0Var = xj0Var2.s;
                mb0 mb0Var = xj0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = xj0Var2.M;
                    if (i18 == 4 || i18 == 3) {
                        mb0Var.setText(org.telegram.messenger.hd.a0("CallText", null, 2131752601, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        mb0Var.setText(org.telegram.messenger.hd.a0("SmsText", null, 2131745296, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (yj0Var != null) {
                        yj0Var.c = 1.0f - (xj0Var2.D / xj0Var2.P);
                        yj0Var.invalidate();
                        break;
                    }
                } else {
                    if (yj0Var != null) {
                        yj0Var.c = 1.0f;
                        yj0Var.invalidate();
                    }
                    xj0Var2.r();
                    int i19 = xj0Var2.L;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.D3(false);
                        org.telegram.messenger.qs.e().n(xj0Var2, org.telegram.messenger.qs.h4);
                        xj0Var2.I = false;
                        xj0Var2.q();
                        xj0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = xj0Var2.M;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.E3(false);
                                org.telegram.messenger.qs.e().n(xj0Var2, org.telegram.messenger.qs.g4);
                                xj0Var2.I = false;
                                xj0Var2.q();
                                xj0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                mb0Var.setText(org.telegram.messenger.hd.M0(2131752597, null));
                            } else {
                                mb0Var.setText(org.telegram.messenger.hd.M0(2131745578, null));
                            }
                            xj0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = xj0Var2.a;
                            tL_auth_resendCode.phone_code_hash = xj0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.f2) xj0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new l(wj0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                vf.c.t(((uk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                hl0 hl0Var = (hl0) ((f) this.b).b;
                hl0Var.z0();
                hl0Var.N0(true, false);
                hl0Var.J0(false);
                break;
            case 12:
                vf.c.t(((uk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                hm0 hm0Var = (hm0) this.b;
                hm0Var.S = !hm0Var.S;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !hm0Var.S ? org.telegram.ui.ActionBar.k6.Q0(str3) : org.telegram.ui.ActionBar.k6.Q0(str2);
                        hm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.k6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.k6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.k6.em;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                hm0Var.w.put(i21, iArr[i21]);
                            }
                        }
                        for (i10 = 0; i10 < T0.size(); i10++) {
                            hm0Var.w.put(T0.keyAt(i10), T0.valueAt(i10));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, hm0Var.w);
                        }
                        bm0Var = hm0Var.h;
                        if (bm0Var != null && bm0Var.w != null) {
                            a8.r7 I = org.telegram.ui.ActionBar.k6.I(Q0, hm0Var.w, strArr[0], 0, true);
                            wl0 wl0Var = hm0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            wl0Var.setOverrideBackground(drawable);
                        }
                        z9 = hm0Var.S;
                        if (hm0Var.a0 != z9) {
                            hm0Var.a0 = z9;
                            org.telegram.ui.Components.zg0 zg0Var = hm0Var.T;
                            zg0Var.P(z9 ? zg0Var.e[0] : 0);
                            org.telegram.ui.Components.zg0 zg0Var2 = hm0Var.T;
                            if (zg0Var2 != null) {
                                zg0Var2.start();
                            }
                        }
                        hm0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!hm0Var.S) {
                }
                hm0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.k6.em;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                bm0Var = hm0Var.h;
                if (bm0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.k6.I(Q0, hm0Var.w, strArr[0], 0, true);
                    wl0 wl0Var2 = hm0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    wl0Var2.setOverrideBackground(drawable);
                }
                z9 = hm0Var.S;
                if (hm0Var.a0 != z9) {
                }
                hm0Var.J0();
                break;
            case 14:
                zl0 zl0Var = (zl0) this.b;
                bm0 bm0Var2 = zl0Var.c;
                gm0 gm0Var = bm0Var2.E;
                hm0 hm0Var2 = bm0Var2.p0;
                if (gm0Var != null && bm0Var2.L.size() > 1) {
                    gm0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) bm0Var2.M.get(1);
                    bm0Var2.K = starGift;
                    if (starGift == null) {
                        zh.d3 d3Var = bm0Var2.J;
                        if (d3Var != null) {
                            d3Var.f();
                            bm0Var2.J = null;
                        }
                    } else {
                        zh.d3 d3Var2 = bm0Var2.J;
                        if (d3Var2 == null || d3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.f2) hm0Var2).currentAccount;
                            zh.d3 d3Var3 = new zh.d3(i11, bm0Var2.K.id, new r3(zl0Var, 18));
                            bm0Var2.J = d3Var3;
                            d3Var3.g(false);
                        }
                    }
                    bm0.a(bm0Var2);
                    (hm0Var2.I.getCurrentPosition() == 1 ? hm0Var2.n : hm0Var2.h).e();
                    break;
                }
                break;
            case 15:
                xm0 xm0Var = (xm0) ((fi.u2) this.b).c;
                xm0Var.g0(xm0Var.P.getSearchField());
                break;
            case 16:
                ((tm0) this.b).i0.L.f();
                break;
            case 17:
                ((oq0) this.b).invalidate();
                break;
            case 18:
                com.google.android.gms.common.api.internal.s sVar = (com.google.android.gms.common.api.internal.s) this.b;
                PhotoViewer photoViewer = (PhotoViewer) sVar.d;
                long j3 = sVar.a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.q2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = sVar.a;
                    photoViewer.W7 = j10;
                    if (photoViewer.V7 != j10) {
                        photoViewer.V7 = -1L;
                    }
                }
                sVar.c = null;
                break;
            case 19:
                PhotoViewer photoViewer2 = ((bp0) this.b).a;
                ImageView imageView = photoViewer2.D3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.D3.getParent()).removeView(photoViewer2.D3);
                    if (photoViewer2.C3 != null) {
                        ImageView imageView2 = photoViewer2.D3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        org.telegram.messenger.g0.z2(photoViewer2.C3);
                        photoViewer2.C3 = null;
                    }
                    photoViewer2.D3 = null;
                    break;
                }
                break;
            case 20:
                an anVar = ((dp0) this.b).T2.k4;
                if (anVar != null && (qjVar = anVar.Z) != null) {
                    qjVar.H0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.v50 v50Var = (org.telegram.ui.Components.v50) ((d30) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) v50Var.c;
                photoViewer3.G2 = false;
                org.telegram.ui.Components.n51 n51Var = photoViewer3.F2;
                if (n51Var != null) {
                    n51Var.h0();
                }
                ((PhotoViewer) v50Var.c).H2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((qo0) this.b).a;
                photoViewer4.G2 = false;
                org.telegram.ui.Components.n51 n51Var2 = photoViewer4.F2;
                if (n51Var2 != null) {
                    n51Var2.h0();
                }
                photoViewer4.H2 = null;
                break;
            case 23:
                yp0 yp0Var = (yp0) ((d30) this.b).b;
                yp0Var.r.k7.e();
                PhotoViewer photoViewer5 = yp0Var.r;
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.v2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((fp0) this.b).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    break;
                }
                break;
            case 25:
                ((jq0) this.b).y.f(true);
                break;
            case 26:
                ((nq0) this.b).d = true;
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((os0) this.b).c;
                premiumPreviewFragment.showDialog(new sy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                tt0 tt0Var = (tt0) this.b;
                RectF rectF = ProfileActivity.S6;
                tt0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.t10.n(user));
                break;
        }
    }
}
