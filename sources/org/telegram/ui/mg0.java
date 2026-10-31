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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024b A[LOOP:1: B:122:0x0245->B:124:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0213  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.s6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i11;
        org.telegram.ui.ActionBar.r6 k10;
        nn0 nn0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        mk mkVar;
        int i13 = 17;
        switch (this.a) {
            case 0:
                ((ih.e) this.b).setVisibility(8);
                break;
            case 1:
                org.telegram.messenger.i0.J3(((ei0) this.b).a.G1);
                break;
            case 2:
                NotificationsSettingsActivity.Z((NotificationsSettingsActivity) this.b);
                break;
            case 3:
                ((PasscodeActivity) ((uc0) this.b).n).u0();
                break;
            case 4:
                PasskeysActivity.b0((PasskeysActivity) this.b);
                break;
            case 5:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i14 = tL_help_passportConfig.hash;
                    org.telegram.messenger.tz.j0 = null;
                    org.telegram.messenger.tz.i0 = str;
                    org.telegram.messenger.tz.k0 = i14;
                    org.telegram.messenger.tz.y();
                    org.telegram.messenger.tz.n();
                    break;
                } else {
                    org.telegram.messenger.tz.n();
                    break;
                }
            case 6:
                ((tk0) this.b).a.finishFragment();
                break;
            case 7:
                org.telegram.ui.Components.s4.w0(((yk0) this.b).e.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                break;
            case 8:
                e6.r rVar = (e6.r) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                hl0 hl0Var = (hl0) rVar.b;
                double d = currentTimeMillis - hl0Var.G;
                hl0Var.G = currentTimeMillis;
                int i15 = (int) (hl0Var.E - d);
                hl0Var.E = i15;
                if (i15 <= 1000) {
                    hl0Var.r.setVisibility(0);
                    hl0Var.n.setVisibility(8);
                    hl0Var.q();
                    break;
                }
                break;
            case 9:
                gl0 gl0Var = (gl0) this.b;
                hl0 hl0Var2 = gl0Var.a;
                int i16 = hl0Var2.D;
                il0 il0Var = hl0Var2.s;
                ag.j3 j3Var = hl0Var2.n;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    int i20 = hl0Var2.M;
                    if (i20 == 4 || i20 == 3) {
                        j3Var.setText(org.telegram.messenger.cd.a0("CallText", null, 2131752601, Integer.valueOf(i18), Integer.valueOf(i19)));
                    } else if (i20 == 2) {
                        j3Var.setText(org.telegram.messenger.cd.a0("SmsText", null, 2131745313, Integer.valueOf(i18), Integer.valueOf(i19)));
                    }
                    if (il0Var != null) {
                        il0Var.c = 1.0f - (hl0Var2.D / hl0Var2.P);
                        il0Var.invalidate();
                        break;
                    }
                } else {
                    if (il0Var != null) {
                        il0Var.c = 1.0f;
                        il0Var.invalidate();
                    }
                    hl0Var2.r();
                    int i21 = hl0Var2.L;
                    if (i21 == 3) {
                        org.telegram.messenger.i0.C3(false);
                        org.telegram.messenger.zs.e().n(hl0Var2, org.telegram.messenger.zs.h4);
                        hl0Var2.I = false;
                        hl0Var2.q();
                        hl0Var2.s();
                        break;
                    } else if (i21 == 2 || i21 == 4) {
                        int i22 = hl0Var2.M;
                        if (i22 != 4 && i22 != 2) {
                            if (i22 == 3) {
                                org.telegram.messenger.i0.D3(false);
                                org.telegram.messenger.zs.e().n(hl0Var2, org.telegram.messenger.zs.g4);
                                hl0Var2.I = false;
                                hl0Var2.q();
                                hl0Var2.s();
                                break;
                            }
                        } else {
                            if (i22 == 4) {
                                j3Var.setText(org.telegram.messenger.cd.L0(2131752597, null));
                            } else {
                                j3Var.setText(org.telegram.messenger.cd.L0(2131745594, null));
                            }
                            hl0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = hl0Var2.a;
                            tL_auth_resendCode.phone_code_hash = hl0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.k2) hl0Var2.Q).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new k(gl0Var, i13), 2);
                            break;
                        }
                    }
                }
                break;
            case 10:
                gf.f.r(((em0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                sm0 sm0Var = (sm0) ((e) this.b).b;
                sm0Var.y0();
                sm0Var.M0(true, false);
                sm0Var.I0(false);
                break;
            case 12:
                gf.f.r(((em0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                tn0 tn0Var = (tn0) this.b;
                tn0Var.S = !tn0Var.S;
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
                if (string.equals(string2)) {
                    if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !tn0Var.S ? org.telegram.ui.ActionBar.t6.Q0(str3) : org.telegram.ui.ActionBar.t6.Q0(str2);
                        tn0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.t6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.t6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.t6.em;
                        if (iArr != null) {
                            for (int i23 = 0; i23 < iArr.length; i23++) {
                                tn0Var.w.put(i23, iArr[i23]);
                            }
                        }
                        for (i11 = 0; i11 < T0.size(); i11++) {
                            tn0Var.w.put(T0.keyAt(i11), T0.valueAt(i11));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, tn0Var.w);
                        }
                        nn0Var = tn0Var.h;
                        if (nn0Var != null && nn0Var.w != null) {
                            bh.d I = org.telegram.ui.ActionBar.t6.I(Q0, tn0Var.w, strArr[0], 0, true);
                            in0 in0Var = tn0Var.h.w;
                            drawable = (BitmapDrawable) I.b;
                            if (drawable == null) {
                                drawable = (Drawable) I.a;
                            }
                            in0Var.setOverrideBackground(drawable);
                        }
                        z10 = tn0Var.S;
                        if (tn0Var.a0 != z10) {
                            tn0Var.a0 = z10;
                            org.telegram.ui.Components.bi0 bi0Var = tn0Var.T;
                            bi0Var.P(z10 ? bi0Var.e[0] : 0);
                            org.telegram.ui.Components.bi0 bi0Var2 = tn0Var.T;
                            if (bi0Var2 != null) {
                                bi0Var2.start();
                            }
                        }
                        tn0Var.I0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!tn0Var.S) {
                }
                tn0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.t6.em;
                if (iArr != null) {
                }
                while (i11 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                nn0Var = tn0Var.h;
                if (nn0Var != null) {
                    bh.d I2 = org.telegram.ui.ActionBar.t6.I(Q0, tn0Var.w, strArr[0], 0, true);
                    in0 in0Var2 = tn0Var.h.w;
                    drawable = (BitmapDrawable) I2.b;
                    if (drawable == null) {
                    }
                    in0Var2.setOverrideBackground(drawable);
                }
                z10 = tn0Var.S;
                if (tn0Var.a0 != z10) {
                }
                tn0Var.I0();
                break;
            case 14:
                ln0 ln0Var = (ln0) this.b;
                nn0 nn0Var2 = ln0Var.c;
                sn0 sn0Var = nn0Var2.E;
                tn0 tn0Var2 = nn0Var2.p0;
                if (sn0Var != null && nn0Var2.L.size() > 1) {
                    sn0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) nn0Var2.M.get(1);
                    nn0Var2.K = starGift;
                    if (starGift == null) {
                        ph.h3 h3Var = nn0Var2.J;
                        if (h3Var != null) {
                            h3Var.f();
                            nn0Var2.J = null;
                        }
                    } else {
                        ph.h3 h3Var2 = nn0Var2.J;
                        if (h3Var2 == null || h3Var2.b != starGift.id) {
                            i12 = ((org.telegram.ui.ActionBar.k2) tn0Var2).currentAccount;
                            ph.h3 h3Var3 = new ph.h3(i12, nn0Var2.K.id, new s3(ln0Var, i13));
                            nn0Var2.J = h3Var3;
                            h3Var3.g(false);
                        }
                    }
                    nn0.a(nn0Var2);
                    (tn0Var2.I.getCurrentPosition() == 1 ? tn0Var2.n : tn0Var2.h).e();
                    break;
                }
                break;
            case 15:
                lo0 lo0Var = (lo0) ((go0) this.b).c;
                lo0Var.f0(lo0Var.P.getSearchField());
                break;
            case 16:
                ((ho0) this.b).i0.L.f();
                break;
            case 17:
                ((as0) this.b).invalidate();
                break;
            case 18:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) this.b;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j10 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.w2(j10);
                if (photoViewer.c2 == 1) {
                    long j11 = vVar.a;
                    photoViewer.X7 = j11;
                    if (photoViewer.W7 != j11) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 19:
                PhotoViewer photoViewer2 = ((mq0) this.b).a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        org.telegram.messenger.i0.z2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 20:
                un unVar = ((oq0) this.b).T2.l4;
                if (unVar != null && (mkVar = unVar.Z) != null) {
                    mkVar.F0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.iw0 iw0Var = (org.telegram.ui.Components.iw0) ((org.telegram.ui.Components.voip.h2) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) iw0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.u61 u61Var = photoViewer3.F2;
                if (u61Var != null) {
                    u61Var.h0();
                }
                ((PhotoViewer) iw0Var.c).I2 = null;
                break;
            case 22:
                PhotoViewer photoViewer4 = ((bq0) this.b).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.u61 u61Var2 = photoViewer4.F2;
                if (u61Var2 != null) {
                    u61Var2.h0();
                }
                photoViewer4.I2 = null;
                break;
            case 23:
                jr0 jr0Var = (jr0) ((org.telegram.ui.Components.voip.h2) this.b).b;
                jr0Var.r.l7.e();
                PhotoViewer photoViewer5 = jr0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.B2(true);
                break;
            case 24:
                PhotoViewer photoViewer6 = ((qq0) this.b).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 25:
                ((vr0) this.b).y.f(true);
                break;
            case 26:
                ((zr0) this.b).d = true;
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = ((yt0) this.b).c;
                premiumPreviewFragment.showDialog(new g01(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 28:
                dv0 dv0Var = (dv0) this.b;
                RectF rectF = ProfileActivity.R6;
                dv0Var.a(0);
                break;
            default:
                String str5 = (String) this.b;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.messenger.i0.g(str5);
                break;
        }
    }
}
