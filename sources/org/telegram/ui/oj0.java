package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        gk gkVar;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                AndroidUtilities.showKeyboard(((rj0) ((f) obj).b).P);
                break;
            case 1:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
            case 2:
                ((PasscodeActivity) ((od0) obj).n).k0();
                break;
            case 3:
                PasskeysActivity.X((PasskeysActivity) obj);
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    SharedConfig.getCountryLangs();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                }
            case 5:
                ((im0) obj).a.finishFragment();
                break;
            case 6:
                org.telegram.ui.Components.f5.x0(((mm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 7:
                double currentTimeMillis = System.currentTimeMillis();
                wm0 wm0Var = (wm0) ((e6.r) obj).b;
                double d = currentTimeMillis - wm0Var.G;
                wm0Var.G = currentTimeMillis;
                int i13 = (int) (wm0Var.E - d);
                wm0Var.E = i13;
                if (i13 <= 1000) {
                    wm0Var.r.setVisibility(0);
                    wm0Var.n.setVisibility(8);
                    wm0Var.q();
                    break;
                }
                break;
            case 8:
                vm0 vm0Var = (vm0) obj;
                wm0 wm0Var2 = vm0Var.a;
                int i14 = wm0Var2.y;
                xm0 xm0Var = wm0Var2.s;
                tm0 tm0Var = wm0Var2.n;
                if (i14 < 1000) {
                    if (xm0Var != null) {
                        xm0Var.c = 1.0f;
                        xm0Var.invalidate();
                    }
                    wm0Var2.r();
                    int i15 = wm0Var2.L;
                    if (i15 != 3) {
                        if (i15 == 2 || i15 == 4) {
                            int i16 = wm0Var2.M;
                            if (i16 != 4 && i16 != 2) {
                                if (i16 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(wm0Var2, NotificationCenter.didReceiveSmsCode);
                                    wm0Var2.I = false;
                                    wm0Var2.q();
                                    wm0Var2.s();
                                    break;
                                }
                            } else {
                                if (i16 == 4) {
                                    tm0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    tm0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                wm0Var2.o();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = wm0Var2.a;
                                tL_auth_resendCode.phone_code_hash = wm0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.o2) wm0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new l(vm0Var, 17), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(wm0Var2, NotificationCenter.didReceiveCall);
                        wm0Var2.I = false;
                        wm0Var2.q();
                        wm0Var2.s();
                        break;
                    }
                } else {
                    int i17 = i14 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    int i20 = wm0Var2.M;
                    if (i20 == 4 || i20 == 3) {
                        tm0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i18), Integer.valueOf(i19)));
                    } else if (i20 == 2) {
                        tm0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i18), Integer.valueOf(i19)));
                    }
                    if (xm0Var != null) {
                        xm0Var.c = 1.0f - (wm0Var2.y / wm0Var2.P);
                        xm0Var.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                pf.d.r(((sn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                io0 io0Var = ((xn0) obj).a;
                io0Var.t0();
                io0Var.H0(true, false);
                io0Var.D0(false);
                break;
            case 11:
                pf.d.r(((bo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                dp0 dp0Var = (dp0) obj;
                fp0 fp0Var = dp0Var.c;
                kp0 kp0Var = fp0Var.E;
                lp0 lp0Var = fp0Var.p0;
                if (kp0Var != null && fp0Var.L.size() > 1) {
                    kp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) fp0Var.M.get(1);
                    fp0Var.K = starGift;
                    if (starGift == null) {
                        yh.s3 s3Var = fp0Var.J;
                        if (s3Var != null) {
                            s3Var.f();
                            fp0Var.J = null;
                        }
                    } else {
                        yh.s3 s3Var2 = fp0Var.J;
                        if (s3Var2 == null || s3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                            yh.s3 s3Var3 = new yh.s3(fp0Var.K.id, i11, new u3(dp0Var, 16));
                            fp0Var.J = s3Var3;
                            s3Var3.g(false);
                        }
                    }
                    fp0.a(fp0Var);
                    (lp0Var.I.getCurrentPosition() == 1 ? lp0Var.n : lp0Var.h).e();
                    break;
                }
                break;
            case 13:
                mq0 mq0Var = ((dq0) obj).s;
                mq0Var.b0(mq0Var.P.getSearchField());
                break;
            case 14:
                ((eq0) obj).z0.L.l();
                break;
            case 15:
                ((eu0) obj).invalidate();
                break;
            case 16:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                long j10 = uVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.v2(j10);
                if (photoViewer.c2 == 1) {
                    long j11 = uVar.a;
                    photoViewer.X7 = j11;
                    if (photoViewer.W7 != j11) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.c = null;
                break;
            case 17:
                PhotoViewer photoViewer2 = ((ns0) obj).a;
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
            case 18:
                sn snVar = ((ps0) obj).g1.l4;
                if (snVar != null && (gkVar = snVar.Y) != null) {
                    gkVar.F0();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((v70) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.j81 j81Var = photoViewer3.F2;
                if (j81Var != null) {
                    j81Var.C();
                }
                ((PhotoViewer) ql0Var.c).I2 = null;
                break;
            case 20:
                PhotoViewer photoViewer4 = ((cs0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.j81 j81Var2 = photoViewer4.F2;
                if (j81Var2 != null) {
                    j81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 21:
                ot0 ot0Var = (ot0) ((v70) obj).b;
                ot0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = ot0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.A2(true);
                break;
            case 22:
                PhotoViewer photoViewer6 = ((rs0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 23:
                ((zt0) obj).x.d(true);
                break;
            case 24:
                ((du0) obj).d = true;
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = ((kw0) obj).c;
                premiumPreviewFragment.showDialog(new x21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 26:
                ((org.telegram.messenger.hk) obj).run(0);
                break;
            case 27:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 28:
                ((ei.x3) obj).e(true);
                break;
            default:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
        }
    }
}
