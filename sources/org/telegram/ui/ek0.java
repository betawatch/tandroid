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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ek0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        hk hkVar;
        int i12 = this.a;
        int i13 = 16;
        Object obj = this.b;
        switch (i12) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
            case 1:
                ((PasscodeActivity) ((kd0) obj).n).k0();
                break;
            case 2:
                PasskeysActivity.X((PasskeysActivity) obj);
                break;
            case 3:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    SharedConfig.getCountryLangs();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                }
            case 4:
                ((gm0) obj).a.finishFragment();
                break;
            case 5:
                org.telegram.ui.Components.f5.w0(((km0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                tm0 tm0Var = (tm0) ((e6.r) obj).b;
                double d = currentTimeMillis - tm0Var.G;
                tm0Var.G = currentTimeMillis;
                int i14 = (int) (tm0Var.E - d);
                tm0Var.E = i14;
                if (i14 <= 1000) {
                    tm0Var.r.setVisibility(0);
                    tm0Var.n.setVisibility(8);
                    tm0Var.r();
                    break;
                }
                break;
            case 7:
                sm0 sm0Var = (sm0) obj;
                tm0 tm0Var2 = sm0Var.a;
                int i15 = tm0Var2.y;
                um0 um0Var = tm0Var2.s;
                md0 md0Var = tm0Var2.n;
                if (i15 < 1000) {
                    if (um0Var != null) {
                        um0Var.c = 1.0f;
                        um0Var.invalidate();
                    }
                    tm0Var2.s();
                    int i16 = tm0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = tm0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveSmsCode);
                                    tm0Var2.I = false;
                                    tm0Var2.r();
                                    tm0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    md0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    md0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                tm0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = tm0Var2.a;
                                tL_auth_resendCode.phone_code_hash = tm0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) tm0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(sm0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveCall);
                        tm0Var2.I = false;
                        tm0Var2.r();
                        tm0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = tm0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        md0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        md0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (um0Var != null) {
                        um0Var.c = 1.0f - (tm0Var2.y / tm0Var2.P);
                        um0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                pf.d.r(((pn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                fo0 fo0Var = ((un0) obj).a;
                fo0Var.t0();
                fo0Var.H0(true, false);
                fo0Var.D0(false);
                break;
            case 10:
                pf.d.r(((yn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                bp0 bp0Var = (bp0) obj;
                dp0 dp0Var = bp0Var.c;
                ip0 ip0Var = dp0Var.E;
                jp0 jp0Var = dp0Var.p0;
                if (ip0Var != null && dp0Var.L.size() > 1) {
                    ip0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) dp0Var.M.get(1);
                    dp0Var.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = dp0Var.J;
                        if (t3Var != null) {
                            t3Var.f();
                            dp0Var.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = dp0Var.J;
                        if (t3Var2 == null || t3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(dp0Var.K.id, i11, new v3(bp0Var, i13));
                            dp0Var.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    dp0.a(dp0Var);
                    (jp0Var.I.getCurrentPosition() == 1 ? jp0Var.n : jp0Var.h).e();
                    break;
                }
                break;
            case 12:
                kq0 kq0Var = ((bq0) obj).s;
                kq0Var.b0(kq0Var.P.getSearchField());
                break;
            case 13:
                ((cq0) obj).z0.L.l();
                break;
            case 14:
                ((du0) obj).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) obj;
                PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                long j10 = uVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(j10);
                if (photoViewer.c2 == 1) {
                    long j11 = uVar.a;
                    photoViewer.X7 = j11;
                    if (photoViewer.W7 != j11) {
                        photoViewer.W7 = -1L;
                    }
                }
                uVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((ms0) obj).a;
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
                sn snVar = ((os0) obj).d1.l4;
                if (snVar != null && (hkVar = snVar.Y) != null) {
                    hkVar.F0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) ((bc0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ml0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.a81 a81Var = photoViewer3.F2;
                if (a81Var != null) {
                    a81Var.C();
                }
                ((PhotoViewer) ml0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((bs0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.a81 a81Var2 = photoViewer4.F2;
                if (a81Var2 != null) {
                    a81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                nt0 nt0Var = (nt0) ((bc0) obj).b;
                nt0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = nt0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((qs0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((yt0) obj).x.d(true);
                break;
            case 23:
                ((cu0) obj).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((iw0) obj).c;
                premiumPreviewFragment.showDialog(new v21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.fk) obj).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 27:
                ((ei.x3) obj).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            default:
                ky0 ky0Var = (ky0) obj;
                ky0Var.G.getNotificationCenter().onAnimationFinish(ky0Var.F);
                break;
        }
    }
}
