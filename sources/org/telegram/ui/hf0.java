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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hf0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025f A[LOOP:1: B:122:0x0259->B:124:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0227  */
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
        fm0 fm0Var;
        boolean z10;
        Drawable drawable;
        int i11;
        rj rjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ti) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.I3(((dh0) this.b).a.K1);
                break;
            case 2:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b);
                break;
            case 3:
                ((PasscodeActivity) ((mb0) this.b).n).v0();
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
                    org.telegram.messenger.cz.j0 = null;
                    org.telegram.messenger.cz.i0 = str;
                    org.telegram.messenger.cz.k0 = i12;
                    org.telegram.messenger.cz.y();
                    org.telegram.messenger.cz.n();
                    break;
                } else {
                    org.telegram.messenger.cz.n();
                    break;
                }
            case 6:
                ((qj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.c5.u0(((vj0) this.b).e.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, null), true);
                break;
            case 8:
                h6.r rVar = (h6.r) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                dk0 dk0Var = (dk0) rVar.b;
                double d = currentTimeMillis - dk0Var.H;
                dk0Var.H = currentTimeMillis;
                int i13 = (int) (dk0Var.F - d);
                dk0Var.F = i13;
                if (i13 <= 1000) {
                    dk0Var.r.setVisibility(0);
                    dk0Var.n.setVisibility(8);
                    dk0Var.q();
                    break;
                }
                break;
            case 9:
                ck0 ck0Var = (ck0) this.b;
                dk0 dk0Var2 = ck0Var.a;
                int i14 = dk0Var2.E;
                ek0 ek0Var = dk0Var2.s;
                nb0 nb0Var = dk0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = dk0Var2.N;
                    if (i18 == 4 || i18 == 3) {
                        nb0Var.setText(org.telegram.messenger.hd.a0("CallText", null, 2131752589, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        nb0Var.setText(org.telegram.messenger.hd.a0("SmsText", null, 2131745099, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (ek0Var != null) {
                        ek0Var.c = 1.0f - (dk0Var2.E / dk0Var2.Q);
                        ek0Var.invalidate();
                        break;
                    }
                } else {
                    if (ek0Var != null) {
                        ek0Var.c = 1.0f;
                        ek0Var.invalidate();
                    }
                    dk0Var2.r();
                    int i19 = dk0Var2.M;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.B3(false);
                        org.telegram.messenger.ls.e().n(dk0Var2, org.telegram.messenger.ls.k4);
                        dk0Var2.J = false;
                        dk0Var2.q();
                        dk0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = dk0Var2.N;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.C3(false);
                                org.telegram.messenger.ls.e().n(dk0Var2, org.telegram.messenger.ls.j4);
                                dk0Var2.J = false;
                                dk0Var2.q();
                                dk0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                nb0Var.setText(org.telegram.messenger.hd.N0(2131752585, null));
                            } else {
                                nb0Var.setText(org.telegram.messenger.hd.N0(2131745381, null));
                            }
                            dk0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = dk0Var2.a;
                            tL_auth_resendCode.phone_code_hash = dk0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.g2) dk0Var2.R).currentAccount;
                            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new l(ck0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                vf.c.t(((zk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                ml0 ml0Var = (ml0) ((f) this.b).b;
                ml0Var.z0();
                ml0Var.N0(true, false);
                ml0Var.J0(false);
                break;
            case 12:
                vf.c.t(((zk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                lm0 lm0Var = (lm0) this.b;
                lm0Var.T = !lm0Var.T;
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
                        Q0 = !lm0Var.T ? org.telegram.ui.ActionBar.m6.Q0(str3) : org.telegram.ui.ActionBar.m6.Q0(str2);
                        lm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.m6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.m6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.m6.hm;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                lm0Var.w.put(i21, iArr[i21]);
                            }
                        }
                        for (i10 = 0; i10 < T0.size(); i10++) {
                            lm0Var.w.put(T0.keyAt(i10), T0.valueAt(i10));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, lm0Var.w);
                        }
                        fm0Var = lm0Var.h;
                        if (fm0Var != null && fm0Var.w != null) {
                            a8.r7 I = org.telegram.ui.ActionBar.m6.I(Q0, lm0Var.w, strArr[0], 0, true);
                            am0 am0Var = lm0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            am0Var.setOverrideBackground(drawable);
                        }
                        z10 = lm0Var.T;
                        if (lm0Var.b0 != z10) {
                            lm0Var.b0 = z10;
                            org.telegram.ui.Components.oh0 oh0Var = lm0Var.U;
                            oh0Var.P(z10 ? oh0Var.e[0] : 0);
                            org.telegram.ui.Components.oh0 oh0Var2 = lm0Var.U;
                            if (oh0Var2 != null) {
                                oh0Var2.start();
                            }
                        }
                        lm0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!lm0Var.T) {
                }
                lm0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.m6.hm;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                fm0Var = lm0Var.h;
                if (fm0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.m6.I(Q0, lm0Var.w, strArr[0], 0, true);
                    am0 am0Var2 = lm0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    am0Var2.setOverrideBackground(drawable);
                }
                z10 = lm0Var.T;
                if (lm0Var.b0 != z10) {
                }
                lm0Var.J0();
                break;
            case 14:
                dm0 dm0Var = (dm0) this.b;
                fm0 fm0Var2 = dm0Var.c;
                km0 km0Var = fm0Var2.F;
                lm0 lm0Var2 = fm0Var2.q0;
                if (km0Var != null && fm0Var2.M.size() > 1) {
                    km0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) fm0Var2.N.get(1);
                    fm0Var2.L = starGift;
                    if (starGift == null) {
                        bi.x7 x7Var = fm0Var2.K;
                        if (x7Var != null) {
                            x7Var.i();
                            fm0Var2.K = null;
                        }
                    } else {
                        bi.x7 x7Var2 = fm0Var2.K;
                        if (x7Var2 == null || x7Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.g2) lm0Var2).currentAccount;
                            bi.x7 x7Var3 = new bi.x7(i11, fm0Var2.L.id, new r3(dm0Var, 19));
                            x7Var3.w = true;
                            fm0Var2.K = x7Var3;
                            x7Var3.l(false);
                        }
                    }
                    fm0.a(fm0Var2);
                    (lm0Var2.J.getCurrentPosition() == 1 ? lm0Var2.n : lm0Var2.h).e();
                    break;
                }
                break;
            case 15:
                cn0 cn0Var = (cn0) ((hi.s2) this.b).c;
                cn0Var.g0(cn0Var.Q.getSearchField());
                break;
            case 16:
                ((ym0) this.b).j0.M.f();
                break;
            case 17:
                ((qq0) this.b).invalidate();
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
                PhotoViewer photoViewer2 = ((dp0) this.b).a;
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
                bn bnVar = ((fp0) this.b).X2.l4;
                if (bnVar != null && (rjVar = bnVar.a0) != null) {
                    rjVar.i1();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) ((ay) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) h10Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.i61 i61Var = photoViewer3.G2;
                if (i61Var != null) {
                    i61Var.h0();
                }
                ((PhotoViewer) h10Var.c).I2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((so0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.i61 i61Var2 = photoViewer4.G2;
                if (i61Var2 != null) {
                    i61Var2.h0();
                }
                photoViewer4.I2 = null;
                break;
            case 23:
                aq0 aq0Var = (aq0) ((ay) this.b).b;
                aq0Var.r.l7.e();
                PhotoViewer photoViewer5 = aq0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.w2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((hp0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 25:
                ((lq0) this.b).y.f(true);
                break;
            case 26:
                ((pq0) this.b).d = true;
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((qs0) this.b).c;
                premiumPreviewFragment.showDialog(new uy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                ut0 ut0Var = (ut0) this.b;
                RectF rectF = ProfileActivity.Z6;
                ut0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.p10.o(user));
                break;
        }
    }
}
