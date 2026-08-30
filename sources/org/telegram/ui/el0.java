package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ el0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x028f A[LOOP:2: B:137:0x0289->B:139:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.i6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i11;
        org.telegram.ui.ActionBar.h6 k10;
        bp0 bp0Var;
        boolean z4;
        Drawable drawable;
        int i12;
        jk jkVar;
        switch (this.a) {
            case 0:
                ((PasscodeActivity) ((vd0) this.b).n).h0();
                break;
            case 1:
                PasskeysActivity.X((PasskeysActivity) this.b);
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
                ((lm0) this.b).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.z4.x0(((pm0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                org.telegram.ui.Components.g50 g50Var = (org.telegram.ui.Components.g50) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                zm0 zm0Var = (zm0) g50Var.b;
                double d = currentTimeMillis - zm0Var.D;
                zm0Var.D = currentTimeMillis;
                int i13 = (int) (zm0Var.B - d);
                zm0Var.B = i13;
                if (i13 <= 1000) {
                    zm0Var.r.setVisibility(0);
                    zm0Var.n.setVisibility(8);
                    zm0Var.r();
                    break;
                }
                break;
            case 6:
                ym0 ym0Var = (ym0) this.b;
                zm0 zm0Var2 = ym0Var.a;
                int i14 = zm0Var2.y;
                an0 an0Var = zm0Var2.s;
                gg.q qVar = zm0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = zm0Var2.J;
                    if (i18 == 4 || i18 == 3) {
                        qVar.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (an0Var != null) {
                        an0Var.c = 1.0f - (zm0Var2.y / zm0Var2.M);
                        an0Var.invalidate();
                        break;
                    }
                } else {
                    if (an0Var != null) {
                        an0Var.c = 1.0f;
                        an0Var.invalidate();
                    }
                    zm0Var2.s();
                    int i19 = zm0Var2.I;
                    if (i19 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(zm0Var2, NotificationCenter.didReceiveCall);
                        zm0Var2.F = false;
                        zm0Var2.r();
                        zm0Var2.t();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = zm0Var2.J;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(zm0Var2, NotificationCenter.didReceiveSmsCode);
                                zm0Var2.F = false;
                                zm0Var2.r();
                                zm0Var2.t();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                qVar.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                qVar.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            zm0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = zm0Var2.a;
                            tL_auth_resendCode.phone_code_hash = zm0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.p2) zm0Var2.N).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new o(ym0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                af.g.s(((un0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                jo0 jo0Var = ((yn0) this.b).a;
                jo0Var.t0();
                jo0Var.H0(true, false);
                jo0Var.D0(false);
                break;
            case 9:
                af.g.s(((co0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                gp0 gp0Var = (gp0) this.b;
                gp0Var.G = !gp0Var.G;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !gp0Var.G ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
                        gp0Var.s.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.j6.nl;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                gp0Var.s.put(i21, iArr[i21]);
                            }
                        }
                        for (i11 = 0; i11 < Q0.size(); i11++) {
                            gp0Var.s.put(Q0.keyAt(i11), Q0.valueAt(i11));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, gp0Var.s);
                        }
                        bp0Var = gp0Var.f;
                        if (bp0Var != null && bp0Var.w != null) {
                            c5.j H = org.telegram.ui.ActionBar.j6.H(N0, gp0Var.s, strArr[0], 0, true);
                            org.telegram.ui.Cells.ea eaVar = gp0Var.f.w;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            eaVar.setOverrideBackground(drawable);
                        }
                        z4 = gp0Var.G;
                        if (gp0Var.O != z4) {
                            gp0Var.O = z4;
                            org.telegram.ui.Components.gj0 gj0Var = gp0Var.H;
                            gj0Var.N(z4 ? gj0Var.e[0] : 0);
                            org.telegram.ui.Components.gj0 gj0Var2 = gp0Var.H;
                            if (gj0Var2 != null) {
                                gj0Var2.start();
                            }
                        }
                        gp0Var.z0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!gp0Var.G) {
                }
                gp0Var.s.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.j6.nl;
                if (iArr != null) {
                }
                while (i11 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                bp0Var = gp0Var.f;
                if (bp0Var != null) {
                    c5.j H2 = org.telegram.ui.ActionBar.j6.H(N0, gp0Var.s, strArr[0], 0, true);
                    org.telegram.ui.Cells.ea eaVar2 = gp0Var.f.w;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    eaVar2.setOverrideBackground(drawable);
                }
                z4 = gp0Var.G;
                if (gp0Var.O != z4) {
                }
                gp0Var.z0();
                break;
            case 11:
                zo0 zo0Var = (zo0) this.b;
                bp0 bp0Var2 = zo0Var.c;
                to0 to0Var = bp0Var2.b;
                kh.g2 g2Var = null;
                int i22 = 0;
                while (true) {
                    gp0 gp0Var2 = bp0Var2.g0;
                    if (i22 < to0Var.getChildCount()) {
                        View childAt = to0Var.getChildAt(i22);
                        if (childAt instanceof kh.g2) {
                            g2Var = (kh.g2) childAt;
                        }
                        i22++;
                    } else if (g2Var != null && bp0Var2.D.size() > 1) {
                        g2Var.b = 1;
                        g2Var.a.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) bp0Var2.E.get(1);
                        bp0Var2.C = starGift;
                        if (starGift == null) {
                            kh.b5 b5Var = bp0Var2.B;
                            if (b5Var != null) {
                                b5Var.f();
                                bp0Var2.B = null;
                            }
                        } else {
                            kh.b5 b5Var2 = bp0Var2.B;
                            if (b5Var2 == null || b5Var2.b != starGift.id) {
                                i12 = ((org.telegram.ui.ActionBar.p2) gp0Var2).currentAccount;
                                kh.b5 b5Var3 = new kh.b5(bp0Var2.C.id, i12, new w3(zo0Var, 13));
                                bp0Var2.B = b5Var3;
                                b5Var3.g(false);
                            }
                        }
                        bp0Var2.e();
                        (gp0Var2.y.getCurrentPosition() == 1 ? gp0Var2.h : gp0Var2.f).e();
                        break;
                    }
                }
                break;
            case 12:
                fq0 fq0Var = ((xp0) this.b).h;
                fq0Var.b0(fq0Var.M.getSearchField());
                break;
            case 13:
                ((yp0) this.b).w0.I.l();
                break;
            case 14:
                ((bu0) this.b).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) this.b;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j10 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.t2(j10);
                if (photoViewer.Z1 == 1) {
                    long j11 = vVar.a;
                    photoViewer.T7 = j11;
                    if (photoViewer.S7 != j11) {
                        photoViewer.S7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((is0) this.b).a;
                ImageView imageView = photoViewer2.B3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.B3.getParent()).removeView(photoViewer2.B3);
                    if (photoViewer2.A3 != null) {
                        ImageView imageView2 = photoViewer2.B3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.A3);
                        photoViewer2.A3 = null;
                    }
                    photoViewer2.B3 = null;
                    break;
                }
                break;
            case 17:
                xn xnVar = ((ks0) this.b).a1.i4;
                if (xnVar != null && (jkVar = xnVar.V) != null) {
                    jkVar.H0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) ((ls0) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ex0Var.c;
                photoViewer3.E2 = false;
                org.telegram.ui.Components.i71 i71Var = photoViewer3.C2;
                if (i71Var != null) {
                    i71Var.C();
                }
                ((PhotoViewer) ex0Var.c).F2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((xr0) this.b).a;
                photoViewer4.E2 = false;
                org.telegram.ui.Components.i71 i71Var2 = photoViewer4.C2;
                if (i71Var2 != null) {
                    i71Var2.C();
                }
                photoViewer4.F2 = null;
                break;
            case 20:
                kt0 kt0Var = (kt0) ((ls0) this.b).b;
                kt0Var.r.i7.unlock();
                PhotoViewer photoViewer5 = kt0Var.r;
                Runnable runnable = photoViewer5.m4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.m4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((ns0) this.b).b;
                Runnable runnable2 = photoViewer6.m4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.m4 = null;
                    break;
                }
                break;
            case 22:
                ((vt0) this.b).s.d(true);
                break;
            case 23:
                ((au0) this.b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((hw0) this.b).c;
                premiumPreviewFragment.showDialog(new p31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.ok) this.b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.b);
                break;
            case 27:
                ((ph.f3) this.b).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) this.b));
                break;
            default:
                ny0 ny0Var = (ny0) this.b;
                ny0Var.G.getNotificationCenter().onAnimationFinish(ny0Var.F);
                break;
        }
    }
}
