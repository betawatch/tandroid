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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf0(Object obj, int i7) {
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
        org.telegram.ui.ActionBar.k6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.i6 k10;
        dm0 dm0Var;
        boolean z9;
        Drawable drawable;
        int i11;
        sj sjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ci) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.K3(((ah0) this.b).a.G1);
                break;
            case 2:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b);
                break;
            case 3:
                ((PasscodeActivity) ((nb0) this.b).n).v0();
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
                ((mj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.v4.u0(((rj0) this.b).e.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                break;
            case 8:
                fi.h2 h2Var = (fi.h2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                zj0 zj0Var = (zj0) h2Var.b;
                double d = currentTimeMillis - zj0Var.G;
                zj0Var.G = currentTimeMillis;
                int i13 = (int) (zj0Var.E - d);
                zj0Var.E = i13;
                if (i13 <= 1000) {
                    zj0Var.r.setVisibility(0);
                    zj0Var.n.setVisibility(8);
                    zj0Var.q();
                    break;
                }
                break;
            case 9:
                yj0 yj0Var = (yj0) this.b;
                zj0 zj0Var2 = yj0Var.a;
                int i14 = zj0Var2.D;
                ak0 ak0Var = zj0Var2.s;
                ob0 ob0Var = zj0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = zj0Var2.M;
                    if (i18 == 4 || i18 == 3) {
                        ob0Var.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        ob0Var.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (ak0Var != null) {
                        ak0Var.c = 1.0f - (zj0Var2.D / zj0Var2.P);
                        ak0Var.invalidate();
                        break;
                    }
                } else {
                    if (ak0Var != null) {
                        ak0Var.c = 1.0f;
                        ak0Var.invalidate();
                    }
                    zj0Var2.r();
                    int i19 = zj0Var2.L;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.D3(false);
                        org.telegram.messenger.qs.e().n(zj0Var2, org.telegram.messenger.qs.h4);
                        zj0Var2.I = false;
                        zj0Var2.q();
                        zj0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = zj0Var2.M;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.E3(false);
                                org.telegram.messenger.qs.e().n(zj0Var2, org.telegram.messenger.qs.g4);
                                zj0Var2.I = false;
                                zj0Var2.q();
                                zj0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                ob0Var.setText(org.telegram.messenger.id.M0(2131752597, null));
                            } else {
                                ob0Var.setText(org.telegram.messenger.id.M0(2131745577, null));
                            }
                            zj0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = zj0Var2.a;
                            tL_auth_resendCode.phone_code_hash = zj0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.f2) zj0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new l(yj0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                vf.c.t(((wk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                jl0 jl0Var = (jl0) ((f) this.b).b;
                jl0Var.z0();
                jl0Var.N0(true, false);
                jl0Var.J0(false);
                break;
            case 12:
                vf.c.t(((wk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.S = !jm0Var.S;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.l6.Q0(string) == null || org.telegram.ui.ActionBar.l6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.l6.Q0(string2) == null || !org.telegram.ui.ActionBar.l6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.k6 k6Var = org.telegram.ui.ActionBar.l6.I;
                if (string.equals(string2)) {
                    if (k6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !jm0Var.S ? org.telegram.ui.ActionBar.l6.Q0(str3) : org.telegram.ui.ActionBar.l6.Q0(str2);
                        jm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.l6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.l6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.l6.em;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                jm0Var.w.put(i21, iArr[i21]);
                            }
                        }
                        for (i10 = 0; i10 < T0.size(); i10++) {
                            jm0Var.w.put(T0.keyAt(i10), T0.valueAt(i10));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, jm0Var.w);
                        }
                        dm0Var = jm0Var.h;
                        if (dm0Var != null && dm0Var.w != null) {
                            a8.r7 I = org.telegram.ui.ActionBar.l6.I(Q0, jm0Var.w, strArr[0], 0, true);
                            yl0 yl0Var = jm0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            yl0Var.setOverrideBackground(drawable);
                        }
                        z9 = jm0Var.S;
                        if (jm0Var.a0 != z9) {
                            jm0Var.a0 = z9;
                            org.telegram.ui.Components.ah0 ah0Var = jm0Var.T;
                            ah0Var.P(z9 ? ah0Var.e[0] : 0);
                            org.telegram.ui.Components.ah0 ah0Var2 = jm0Var.T;
                            if (ah0Var2 != null) {
                                ah0Var2.start();
                            }
                        }
                        jm0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!jm0Var.S) {
                }
                jm0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.l6.em;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                dm0Var = jm0Var.h;
                if (dm0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.l6.I(Q0, jm0Var.w, strArr[0], 0, true);
                    yl0 yl0Var2 = jm0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    yl0Var2.setOverrideBackground(drawable);
                }
                z9 = jm0Var.S;
                if (jm0Var.a0 != z9) {
                }
                jm0Var.J0();
                break;
            case 14:
                bm0 bm0Var = (bm0) this.b;
                dm0 dm0Var2 = bm0Var.c;
                im0 im0Var = dm0Var2.E;
                jm0 jm0Var2 = dm0Var2.p0;
                if (im0Var != null && dm0Var2.L.size() > 1) {
                    im0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) dm0Var2.M.get(1);
                    dm0Var2.K = starGift;
                    if (starGift == null) {
                        zh.c3 c3Var = dm0Var2.J;
                        if (c3Var != null) {
                            c3Var.f();
                            dm0Var2.J = null;
                        }
                    } else {
                        zh.c3 c3Var2 = dm0Var2.J;
                        if (c3Var2 == null || c3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.f2) jm0Var2).currentAccount;
                            zh.c3 c3Var3 = new zh.c3(i11, dm0Var2.K.id, new r3(bm0Var, 18));
                            dm0Var2.J = c3Var3;
                            c3Var3.g(false);
                        }
                    }
                    dm0.a(dm0Var2);
                    (jm0Var2.I.getCurrentPosition() == 1 ? jm0Var2.n : jm0Var2.h).e();
                    break;
                }
                break;
            case 15:
                zm0 zm0Var = (zm0) ((fi.u2) this.b).c;
                zm0Var.g0(zm0Var.P.getSearchField());
                break;
            case 16:
                ((vm0) this.b).i0.L.f();
                break;
            case 17:
                ((rq0) this.b).invalidate();
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
                PhotoViewer photoViewer2 = ((ep0) this.b).a;
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
                cn cnVar = ((gp0) this.b).T2.k4;
                if (cnVar != null && (sjVar = cnVar.Z) != null) {
                    sjVar.H0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.w50 w50Var = (org.telegram.ui.Components.w50) ((f30) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) w50Var.c;
                photoViewer3.G2 = false;
                org.telegram.ui.Components.u51 u51Var = photoViewer3.F2;
                if (u51Var != null) {
                    u51Var.h0();
                }
                ((PhotoViewer) w50Var.c).H2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((to0) this.b).a;
                photoViewer4.G2 = false;
                org.telegram.ui.Components.u51 u51Var2 = photoViewer4.F2;
                if (u51Var2 != null) {
                    u51Var2.h0();
                }
                photoViewer4.H2 = null;
                break;
            case 23:
                bq0 bq0Var = (bq0) ((f30) this.b).b;
                bq0Var.r.k7.e();
                PhotoViewer photoViewer5 = bq0Var.r;
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.v2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((ip0) this.b).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    break;
                }
                break;
            case 25:
                ((mq0) this.b).y.f(true);
                break;
            case 26:
                ((qq0) this.b).d = true;
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((rs0) this.b).c;
                premiumPreviewFragment.showDialog(new vy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                wt0 wt0Var = (wt0) this.b;
                RectF rectF = ProfileActivity.V6;
                wt0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.t10.n(user));
                break;
        }
    }
}
