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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf0(Object obj, int i7) {
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
        org.telegram.ui.ActionBar.m6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.k6 k10;
        dm0 dm0Var;
        boolean z10;
        Drawable drawable;
        int i11;
        rj rjVar;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.si) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.g0.I3(((bh0) this.b).a.K1);
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
                    org.telegram.messenger.bz.j0 = null;
                    org.telegram.messenger.bz.i0 = str;
                    org.telegram.messenger.bz.k0 = i12;
                    org.telegram.messenger.bz.y();
                    org.telegram.messenger.bz.n();
                    break;
                } else {
                    org.telegram.messenger.bz.n();
                    break;
                }
            case 6:
                ((oj0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.b5.u0(((tj0) this.b).e.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
                break;
            case 8:
                h6.s sVar = (h6.s) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                bk0 bk0Var = (bk0) sVar.b;
                double d = currentTimeMillis - bk0Var.H;
                bk0Var.H = currentTimeMillis;
                int i13 = (int) (bk0Var.F - d);
                bk0Var.F = i13;
                if (i13 <= 1000) {
                    bk0Var.r.setVisibility(0);
                    bk0Var.n.setVisibility(8);
                    bk0Var.q();
                    break;
                }
                break;
            case 9:
                ak0 ak0Var = (ak0) this.b;
                bk0 bk0Var2 = ak0Var.a;
                int i14 = bk0Var2.E;
                ck0 ck0Var = bk0Var2.s;
                mb0 mb0Var = bk0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / 1000;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = bk0Var2.N;
                    if (i18 == 4 || i18 == 3) {
                        mb0Var.setText(org.telegram.messenger.gd.a0("CallText", null, 2131752589, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        mb0Var.setText(org.telegram.messenger.gd.a0("SmsText", null, 2131745099, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (ck0Var != null) {
                        ck0Var.c = 1.0f - (bk0Var2.E / bk0Var2.Q);
                        ck0Var.invalidate();
                        break;
                    }
                } else {
                    if (ck0Var != null) {
                        ck0Var.c = 1.0f;
                        ck0Var.invalidate();
                    }
                    bk0Var2.r();
                    int i19 = bk0Var2.M;
                    if (i19 == 3) {
                        org.telegram.messenger.g0.B3(false);
                        org.telegram.messenger.ks.e().n(bk0Var2, org.telegram.messenger.ks.k4);
                        bk0Var2.J = false;
                        bk0Var2.q();
                        bk0Var2.s();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = bk0Var2.N;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                org.telegram.messenger.g0.C3(false);
                                org.telegram.messenger.ks.e().n(bk0Var2, org.telegram.messenger.ks.j4);
                                bk0Var2.J = false;
                                bk0Var2.q();
                                bk0Var2.s();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                mb0Var.setText(org.telegram.messenger.gd.N0(2131752585, null));
                            } else {
                                mb0Var.setText(org.telegram.messenger.gd.N0(2131745381, null));
                            }
                            bk0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = bk0Var2.a;
                            tL_auth_resendCode.phone_code_hash = bk0Var2.b;
                            i7 = ((org.telegram.ui.ActionBar.g2) bk0Var2.R).currentAccount;
                            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new l(ak0Var, 16), 2);
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
                if (org.telegram.ui.ActionBar.n6.Q0(string) == null || org.telegram.ui.ActionBar.n6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string2) == null || !org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.n6.I;
                if (string.equals(string2)) {
                    if (m6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !jm0Var.T ? org.telegram.ui.ActionBar.n6.Q0(str3) : org.telegram.ui.ActionBar.n6.Q0(str2);
                        jm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.n6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.n6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.n6.hm;
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
                            a8.r7 I = org.telegram.ui.ActionBar.n6.I(Q0, jm0Var.w, strArr[0], 0, true);
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
                            org.telegram.ui.Components.nh0 nh0Var = jm0Var.U;
                            nh0Var.P(z10 ? nh0Var.e[0] : 0);
                            org.telegram.ui.Components.nh0 nh0Var2 = jm0Var.U;
                            if (nh0Var2 != null) {
                                nh0Var2.start();
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
                iArr = org.telegram.ui.ActionBar.n6.hm;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                dm0Var = jm0Var.h;
                if (dm0Var != null) {
                    a8.r7 I2 = org.telegram.ui.ActionBar.n6.I(Q0, jm0Var.w, strArr[0], 0, true);
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
                        bi.a8 a8Var = dm0Var2.K;
                        if (a8Var != null) {
                            a8Var.i();
                            dm0Var2.K = null;
                        }
                    } else {
                        bi.a8 a8Var2 = dm0Var2.K;
                        if (a8Var2 == null || a8Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.g2) jm0Var2).currentAccount;
                            bi.a8 a8Var3 = new bi.a8(i11, dm0Var2.L.id, new r3(bm0Var, 19));
                            a8Var3.w = true;
                            dm0Var2.K = a8Var3;
                            a8Var3.l(false);
                        }
                    }
                    dm0.a(dm0Var2);
                    (jm0Var2.J.getCurrentPosition() == 1 ? jm0Var2.n : jm0Var2.h).e();
                    break;
                }
                break;
            case 15:
                an0 an0Var = (an0) ((hi.b3) this.b).c;
                an0Var.g0(an0Var.Q.getSearchField());
                break;
            case 16:
                ((wm0) this.b).j0.M.f();
                break;
            case 17:
                ((qq0) this.b).invalidate();
                break;
            case 18:
                com.google.android.gms.common.api.internal.t tVar = (com.google.android.gms.common.api.internal.t) this.b;
                PhotoViewer photoViewer = (PhotoViewer) tVar.d;
                long j3 = tVar.a;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.s2(j3);
                if (photoViewer.d2 == 1) {
                    long j10 = tVar.a;
                    photoViewer.d8 = j10;
                    if (photoViewer.c8 != j10) {
                        photoViewer.c8 = -1L;
                    }
                }
                tVar.c = null;
                break;
            case 19:
                PhotoViewer photoViewer2 = ((cp0) this.b).a;
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
                bn bnVar = ((ep0) this.b).X2.l4;
                if (bnVar != null && (rjVar = bnVar.a0) != null) {
                    rjVar.j1();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.f10 f10Var = (org.telegram.ui.Components.f10) ((zx) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) f10Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.h61 h61Var = photoViewer3.G2;
                if (h61Var != null) {
                    h61Var.h0();
                }
                ((PhotoViewer) f10Var.c).I2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((fo0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.h61 h61Var2 = photoViewer4.G2;
                if (h61Var2 != null) {
                    h61Var2.h0();
                }
                photoViewer4.I2 = null;
                break;
            case 23:
                aq0 aq0Var = (aq0) ((zx) this.b).b;
                aq0Var.r.r7.e();
                PhotoViewer photoViewer5 = aq0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.x2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((gp0) this.b).b;
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
                PremiumPreviewFragment premiumPreviewFragment = ((ps0) this.b).c;
                premiumPreviewFragment.showDialog(new ty0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                tt0 tt0Var = (tt0) this.b;
                RectF rectF = ProfileActivity.Z6;
                tt0Var.a(0);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.n10.o(user));
                break;
        }
    }
}
