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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        org.telegram.ui.ActionBar.i6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.g6 k10;
        dm0 dm0Var;
        boolean z10;
        Drawable drawable;
        int i11;
        qj qjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ji) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.J3(((yg0) this.b).a.K1);
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
                    org.telegram.messenger.gz.j0 = null;
                    org.telegram.messenger.gz.i0 = str;
                    org.telegram.messenger.gz.k0 = i12;
                    org.telegram.messenger.gz.y();
                    org.telegram.messenger.gz.n();
                    break;
                } else {
                    org.telegram.messenger.gz.n();
                    break;
                }
            case 6:
                ((nj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.t4.u0(((sj0) this.b).e.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                break;
            case 8:
                h6.r rVar = (h6.r) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                ak0 ak0Var = (ak0) rVar.b;
                double d = currentTimeMillis - ak0Var.H;
                ak0Var.H = currentTimeMillis;
                int i13 = (int) (ak0Var.F - d);
                ak0Var.F = i13;
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
                int i14 = ak0Var2.E;
                bk0 bk0Var = ak0Var2.s;
                mb0 mb0Var = ak0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = ak0Var2.N;
                    if (i18 == 4 || i18 == 3) {
                        mb0Var.setText(org.telegram.messenger.hd.a0("CallText", null, 2131752601, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        mb0Var.setText(org.telegram.messenger.hd.a0("SmsText", null, 2131745295, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (bk0Var != null) {
                        bk0Var.c = 1.0f - (ak0Var2.E / ak0Var2.Q);
                        bk0Var.invalidate();
                        break;
                    }
                } else {
                    if (bk0Var != null) {
                        bk0Var.c = 1.0f;
                        bk0Var.invalidate();
                    }
                    ak0Var2.r();
                    int i19 = ak0Var2.M;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.C3(false);
                        org.telegram.messenger.ns.e().n(ak0Var2, org.telegram.messenger.ns.h4);
                        ak0Var2.J = false;
                        ak0Var2.q();
                        ak0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = ak0Var2.N;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.D3(false);
                                org.telegram.messenger.ns.e().n(ak0Var2, org.telegram.messenger.ns.g4);
                                ak0Var2.J = false;
                                ak0Var2.q();
                                ak0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                mb0Var.setText(org.telegram.messenger.hd.M0(2131752597, null));
                            } else {
                                mb0Var.setText(org.telegram.messenger.hd.M0(2131745577, null));
                            }
                            ak0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ak0Var2.a;
                            tL_auth_resendCode.phone_code_hash = ak0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.e2) ak0Var2.R).currentAccount;
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
                jm0 jm0Var = (jm0) this.b;
                jm0Var.T = !jm0Var.T;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string) == null || org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string2) == null || !org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !jm0Var.T ? org.telegram.ui.ActionBar.j6.Q0(str3) : org.telegram.ui.ActionBar.j6.Q0(str2);
                        jm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.j6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.j6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.j6.hm;
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
                            a8.r7 I = org.telegram.ui.ActionBar.j6.I(Q0, jm0Var.w, strArr[0], 0, true);
                            yl0 yl0Var = jm0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            yl0Var.setOverrideBackground(drawable);
                        }
                        z10 = jm0Var.T;
                        if (jm0Var.b0 != z10) {
                            jm0Var.b0 = z10;
                            org.telegram.ui.Components.ch0 ch0Var = jm0Var.U;
                            ch0Var.P(z10 ? ch0Var.e[0] : 0);
                            org.telegram.ui.Components.ch0 ch0Var2 = jm0Var.U;
                            if (ch0Var2 != null) {
                                ch0Var2.start();
                            }
                        }
                        jm0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!jm0Var.T) {
                }
                jm0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.j6.hm;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                dm0Var = jm0Var.h;
                if (dm0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.j6.I(Q0, jm0Var.w, strArr[0], 0, true);
                    yl0 yl0Var2 = jm0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    yl0Var2.setOverrideBackground(drawable);
                }
                z10 = jm0Var.T;
                if (jm0Var.b0 != z10) {
                }
                jm0Var.J0();
                break;
            case 14:
                bm0 bm0Var = (bm0) this.b;
                dm0 dm0Var2 = bm0Var.c;
                im0 im0Var = dm0Var2.F;
                jm0 jm0Var2 = dm0Var2.q0;
                if (im0Var != null && dm0Var2.M.size() > 1) {
                    im0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) dm0Var2.N.get(1);
                    dm0Var2.L = starGift;
                    if (starGift == null) {
                        bi.o5 o5Var = dm0Var2.K;
                        if (o5Var != null) {
                            o5Var.f();
                            dm0Var2.K = null;
                        }
                    } else {
                        bi.o5 o5Var2 = dm0Var2.K;
                        if (o5Var2 == null || o5Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.e2) jm0Var2).currentAccount;
                            bi.o5 o5Var3 = new bi.o5(i11, dm0Var2.L.id, new r3(bm0Var, 18));
                            dm0Var2.K = o5Var3;
                            o5Var3.g(false);
                        }
                    }
                    dm0.a(dm0Var2);
                    (jm0Var2.J.getCurrentPosition() == 1 ? jm0Var2.n : jm0Var2.h).e();
                    break;
                }
                break;
            case 15:
                zm0 zm0Var = (zm0) ((hi.s2) this.b).c;
                zm0Var.g0(zm0Var.Q.getSearchField());
                break;
            case 16:
                ((vm0) this.b).j0.M.f();
                break;
            case 17:
                ((oq0) this.b).invalidate();
                break;
            case 18:
                com.google.android.gms.common.api.internal.t tVar = (com.google.android.gms.common.api.internal.t) this.b;
                PhotoViewer photoViewer = (PhotoViewer) tVar.d;
                long j3 = tVar.a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.r2(j3);
                if (photoViewer.d2 == 1) {
                    long j10 = tVar.a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                tVar.c = null;
                break;
            case 19:
                PhotoViewer photoViewer2 = ((ap0) this.b).a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        org.telegram.messenger.g0.z2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 20:
                an anVar = ((cp0) this.b).X2.l4;
                if (anVar != null && (qjVar = anVar.a0) != null) {
                    qjVar.W0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.y50 y50Var = (org.telegram.ui.Components.y50) ((xx) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) y50Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.u51 u51Var = photoViewer3.G2;
                if (u51Var != null) {
                    u51Var.h0();
                }
                ((PhotoViewer) y50Var.c).I2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((po0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.u51 u51Var2 = photoViewer4.G2;
                if (u51Var2 != null) {
                    u51Var2.h0();
                }
                photoViewer4.I2 = null;
                break;
            case 23:
                yp0 yp0Var = (yp0) ((xx) this.b).b;
                yp0Var.r.l7.e();
                PhotoViewer photoViewer5 = yp0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.w2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((ep0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
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
                PremiumPreviewFragment premiumPreviewFragment = ((ms0) this.b).c;
                premiumPreviewFragment.showDialog(new qy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                rt0 rt0Var = (rt0) this.b;
                RectF rectF = ProfileActivity.X6;
                rt0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.q10.n(user));
                break;
        }
    }
}
