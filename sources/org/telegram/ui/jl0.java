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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        jk jkVar;
        int i12 = this.a;
        int i13 = 16;
        int i14 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((PasscodeActivity) ((yd0) obj).n).h0();
                break;
            case 1:
                PasskeysActivity.X((PasskeysActivity) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    SharedConfig.getCountryLangs();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                }
            case 3:
                ((qm0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.e5.x0(((um0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                en0 en0Var = (en0) ((ci.o2) obj).b;
                double d = currentTimeMillis - en0Var.G;
                en0Var.G = currentTimeMillis;
                int i15 = (int) (en0Var.E - d);
                en0Var.E = i15;
                if (i15 <= 1000) {
                    en0Var.r.setVisibility(0);
                    en0Var.n.setVisibility(8);
                    en0Var.r();
                    break;
                }
                break;
            case 6:
                dn0 dn0Var = (dn0) obj;
                en0 en0Var2 = dn0Var.a;
                int i16 = en0Var2.y;
                fn0 fn0Var = en0Var2.s;
                bn0 bn0Var = en0Var2.n;
                if (i16 < 1000) {
                    if (fn0Var != null) {
                        fn0Var.c = 1.0f;
                        fn0Var.invalidate();
                    }
                    en0Var2.s();
                    int i17 = en0Var2.L;
                    if (i17 != 3) {
                        if (i17 == 2 || i17 == 4) {
                            int i18 = en0Var2.M;
                            if (i18 != 4 && i18 != 2) {
                                if (i18 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveSmsCode);
                                    en0Var2.I = false;
                                    en0Var2.r();
                                    en0Var2.u();
                                    break;
                                }
                            } else {
                                if (i18 == 4) {
                                    bn0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    bn0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                en0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = en0Var2.a;
                                tL_auth_resendCode.phone_code_hash = en0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) en0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(dn0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(en0Var2, NotificationCenter.didReceiveCall);
                        en0Var2.I = false;
                        en0Var2.r();
                        en0Var2.u();
                        break;
                    }
                } else {
                    int i19 = i16 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i20 = i19 / 60;
                    int i21 = i19 - (i20 * 60);
                    int i22 = en0Var2.M;
                    if (i22 == 4 || i22 == 3) {
                        bn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i20), Integer.valueOf(i21)));
                    } else if (i22 == 2) {
                        bn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i20), Integer.valueOf(i21)));
                    }
                    if (fn0Var != null) {
                        fn0Var.c = 1.0f - (en0Var2.y / en0Var2.P);
                        fn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                nf.f.s(((ao0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                qo0 qo0Var = ((fo0) obj).a;
                qo0Var.t0();
                qo0Var.H0(true, false);
                qo0Var.D0(false);
                break;
            case 9:
                nf.f.s(((jo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                mp0 mp0Var = (mp0) obj;
                op0 op0Var = mp0Var.c;
                tp0 tp0Var = op0Var.E;
                up0 up0Var = op0Var.p0;
                if (tp0Var != null && op0Var.L.size() > 1) {
                    tp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) op0Var.M.get(1);
                    op0Var.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = op0Var.J;
                        if (v3Var != null) {
                            v3Var.f();
                            op0Var.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = op0Var.J;
                        if (v3Var2 == null || v3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(op0Var.K.id, i11, new t3(mp0Var, i13));
                            op0Var.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    op0.a(op0Var);
                    (up0Var.I.getCurrentPosition() == 1 ? up0Var.n : up0Var.h).e();
                    break;
                }
                break;
            case 11:
                uq0 uq0Var = ((lq0) obj).h;
                uq0Var.b0(uq0Var.P.getSearchField());
                break;
            case 12:
                ((mq0) obj).z0.L.l();
                break;
            case 13:
                ((ou0) obj).invalidate();
                break;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j3 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = vVar.a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 15:
                PhotoViewer photoViewer2 = ((xs0) obj).a;
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
            case 16:
                xn xnVar = ((zs0) obj).d1.l4;
                if (xnVar != null && (jkVar = xnVar.Y) != null) {
                    jkVar.I0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) ((wq0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) qk0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.f71 f71Var = photoViewer3.F2;
                if (f71Var != null) {
                    f71Var.C();
                }
                ((PhotoViewer) qk0Var.c).I2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((ms0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.f71 f71Var2 = photoViewer4.F2;
                if (f71Var2 != null) {
                    f71Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 19:
                yt0 yt0Var = (yt0) ((wq0) obj).b;
                yt0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = yt0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.x2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((bt0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 21:
                ((ju0) obj).s.d(true);
                break;
            case 22:
                ((nu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((vw0) obj).c;
                premiumPreviewFragment.showDialog(new a41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.mk) obj).run(0);
                break;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 26:
                ((ci.e4) obj).e(true);
                break;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 28:
                zy0 zy0Var = (zy0) obj;
                zy0Var.G.getNotificationCenter().onAnimationFinish(zy0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    iz0 iz0Var = profileActivity.n0;
                    while (iz0Var.D0.k(i14) != iz0Var.getRealCount() - 1) {
                        i14++;
                    }
                    iz0Var.x(i14, true);
                    break;
                }
                break;
        }
    }
}
