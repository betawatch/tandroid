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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hf0(Object obj, int i7) {
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
        org.telegram.ui.ActionBar.l6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.j6 k10;
        em0 em0Var;
        boolean z9;
        Drawable drawable;
        int i11;
        sj sjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.bi) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.K3(((bh0) this.b).a.J1);
                break;
            case 2:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b);
                break;
            case 3:
                ((PasscodeActivity) ((ob0) this.b).n).v0();
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
                ((nj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.u4.u0(((sj0) this.b).e.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                break;
            case 8:
                fi.h2 h2Var = (fi.h2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                ak0 ak0Var = (ak0) h2Var.b;
                double d = currentTimeMillis - ak0Var.G;
                ak0Var.G = currentTimeMillis;
                int i13 = (int) (ak0Var.E - d);
                ak0Var.E = i13;
                if (i13 <= 1000) {
                    ak0Var.r.setVisibility(0);
                    ak0Var.n.setVisibility(8);
                    ak0Var.q();
                    break;
                }
                break;
            case 9:
                zj0 zj0Var = (zj0) this.b;
                ak0 ak0Var2 = zj0Var.a;
                int i14 = ak0Var2.D;
                bk0 bk0Var = ak0Var2.s;
                pb0 pb0Var = ak0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = ak0Var2.M;
                    if (i18 == 4 || i18 == 3) {
                        pb0Var.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        pb0Var.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (bk0Var != null) {
                        bk0Var.c = 1.0f - (ak0Var2.D / ak0Var2.P);
                        bk0Var.invalidate();
                        break;
                    }
                } else {
                    if (bk0Var != null) {
                        bk0Var.c = 1.0f;
                        bk0Var.invalidate();
                    }
                    ak0Var2.r();
                    int i19 = ak0Var2.L;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.D3(false);
                        org.telegram.messenger.qs.e().n(ak0Var2, org.telegram.messenger.qs.h4);
                        ak0Var2.I = false;
                        ak0Var2.q();
                        ak0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = ak0Var2.M;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.E3(false);
                                org.telegram.messenger.qs.e().n(ak0Var2, org.telegram.messenger.qs.g4);
                                ak0Var2.I = false;
                                ak0Var2.q();
                                ak0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                pb0Var.setText(org.telegram.messenger.id.M0(2131752597, null));
                            } else {
                                pb0Var.setText(org.telegram.messenger.id.M0(2131745577, null));
                            }
                            ak0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ak0Var2.a;
                            tL_auth_resendCode.phone_code_hash = ak0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.f2) ak0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new l(zj0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                vf.c.t(((xk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                kl0 kl0Var = (kl0) ((f) this.b).b;
                kl0Var.z0();
                kl0Var.N0(true, false);
                kl0Var.J0(false);
                break;
            case 12:
                vf.c.t(((xk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                km0 km0Var = (km0) this.b;
                km0Var.S = !km0Var.S;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string) == null || org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string2) == null || !org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
                if (string.equals(string2)) {
                    if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !km0Var.S ? org.telegram.ui.ActionBar.m6.Q0(str3) : org.telegram.ui.ActionBar.m6.Q0(str2);
                        km0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.m6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.m6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.m6.em;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                km0Var.w.put(i21, iArr[i21]);
                            }
                        }
                        for (i10 = 0; i10 < T0.size(); i10++) {
                            km0Var.w.put(T0.keyAt(i10), T0.valueAt(i10));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, km0Var.w);
                        }
                        em0Var = km0Var.h;
                        if (em0Var != null && em0Var.w != null) {
                            a8.r7 I = org.telegram.ui.ActionBar.m6.I(Q0, km0Var.w, strArr[0], 0, true);
                            zl0 zl0Var = km0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            zl0Var.setOverrideBackground(drawable);
                        }
                        z9 = km0Var.S;
                        if (km0Var.a0 != z9) {
                            km0Var.a0 = z9;
                            org.telegram.ui.Components.zg0 zg0Var = km0Var.T;
                            zg0Var.P(z9 ? zg0Var.e[0] : 0);
                            org.telegram.ui.Components.zg0 zg0Var2 = km0Var.T;
                            if (zg0Var2 != null) {
                                zg0Var2.start();
                            }
                        }
                        km0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!km0Var.S) {
                }
                km0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.m6.em;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                em0Var = km0Var.h;
                if (em0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.m6.I(Q0, km0Var.w, strArr[0], 0, true);
                    zl0 zl0Var2 = km0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    zl0Var2.setOverrideBackground(drawable);
                }
                z9 = km0Var.S;
                if (km0Var.a0 != z9) {
                }
                km0Var.J0();
                break;
            case 14:
                cm0 cm0Var = (cm0) this.b;
                em0 em0Var2 = cm0Var.c;
                jm0 jm0Var = em0Var2.E;
                km0 km0Var2 = em0Var2.p0;
                if (jm0Var != null && em0Var2.L.size() > 1) {
                    jm0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) em0Var2.M.get(1);
                    em0Var2.K = starGift;
                    if (starGift == null) {
                        zh.c3 c3Var = em0Var2.J;
                        if (c3Var != null) {
                            c3Var.f();
                            em0Var2.J = null;
                        }
                    } else {
                        zh.c3 c3Var2 = em0Var2.J;
                        if (c3Var2 == null || c3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.f2) km0Var2).currentAccount;
                            zh.c3 c3Var3 = new zh.c3(i11, em0Var2.K.id, new r3(cm0Var, 18));
                            em0Var2.J = c3Var3;
                            c3Var3.g(false);
                        }
                    }
                    em0.a(em0Var2);
                    (km0Var2.I.getCurrentPosition() == 1 ? km0Var2.n : km0Var2.h).e();
                    break;
                }
                break;
            case 15:
                an0 an0Var = (an0) ((fi.u2) this.b).c;
                an0Var.g0(an0Var.P.getSearchField());
                break;
            case 16:
                ((wm0) this.b).i0.L.f();
                break;
            case 17:
                ((sq0) this.b).invalidate();
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
                PhotoViewer photoViewer2 = ((fp0) this.b).a;
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
                cn cnVar = ((hp0) this.b).W2.k4;
                if (cnVar != null && (sjVar = cnVar.Z) != null) {
                    sjVar.H0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.v50 v50Var = (org.telegram.ui.Components.v50) ((g30) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) v50Var.c;
                photoViewer3.G2 = false;
                org.telegram.ui.Components.t51 t51Var = photoViewer3.F2;
                if (t51Var != null) {
                    t51Var.h0();
                }
                ((PhotoViewer) v50Var.c).H2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((uo0) this.b).a;
                photoViewer4.G2 = false;
                org.telegram.ui.Components.t51 t51Var2 = photoViewer4.F2;
                if (t51Var2 != null) {
                    t51Var2.h0();
                }
                photoViewer4.H2 = null;
                break;
            case 23:
                cq0 cq0Var = (cq0) ((g30) this.b).b;
                cq0Var.r.k7.e();
                PhotoViewer photoViewer5 = cq0Var.r;
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.v2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((jp0) this.b).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    break;
                }
                break;
            case 25:
                ((nq0) this.b).y.f(true);
                break;
            case 26:
                ((rq0) this.b).d = true;
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((ss0) this.b).c;
                premiumPreviewFragment.showDialog(new wy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                xt0 xt0Var = (xt0) this.b;
                RectF rectF = ProfileActivity.V6;
                xt0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.t10.n(user));
                break;
        }
    }
}
