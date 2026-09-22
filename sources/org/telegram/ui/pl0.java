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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        mk mkVar;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((PasscodeActivity) ((de0) obj).n).h0();
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
                ((wm0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.c5.x0(((an0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                kn0 kn0Var = (kn0) ((ci.p2) obj).b;
                double d = currentTimeMillis - kn0Var.G;
                kn0Var.G = currentTimeMillis;
                int i14 = (int) (kn0Var.E - d);
                kn0Var.E = i14;
                if (i14 <= 1000) {
                    kn0Var.r.setVisibility(0);
                    kn0Var.n.setVisibility(8);
                    kn0Var.r();
                    break;
                }
                break;
            case 6:
                jn0 jn0Var = (jn0) obj;
                kn0 kn0Var2 = jn0Var.a;
                int i15 = kn0Var2.y;
                ln0 ln0Var = kn0Var2.s;
                hn0 hn0Var = kn0Var2.n;
                if (i15 < 1000) {
                    if (ln0Var != null) {
                        ln0Var.c = 1.0f;
                        ln0Var.invalidate();
                    }
                    kn0Var2.s();
                    int i16 = kn0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = kn0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(kn0Var2, NotificationCenter.didReceiveSmsCode);
                                    kn0Var2.I = false;
                                    kn0Var2.r();
                                    kn0Var2.u();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    hn0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    hn0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                kn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = kn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = kn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) kn0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(jn0Var, 16), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(kn0Var2, NotificationCenter.didReceiveCall);
                        kn0Var2.I = false;
                        kn0Var2.r();
                        kn0Var2.u();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = kn0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        hn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        hn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (ln0Var != null) {
                        ln0Var.c = 1.0f - (kn0Var2.y / kn0Var2.P);
                        ln0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                nf.f.s(((go0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                wo0 wo0Var = ((lo0) obj).a;
                wo0Var.t0();
                wo0Var.H0(true, false);
                wo0Var.D0(false);
                break;
            case 9:
                nf.f.s(((po0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                sp0 sp0Var = (sp0) obj;
                up0 up0Var = sp0Var.c;
                zp0 zp0Var = up0Var.E;
                aq0 aq0Var = up0Var.p0;
                if (zp0Var != null && up0Var.L.size() > 1) {
                    zp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) up0Var.M.get(1);
                    up0Var.K = starGift;
                    if (starGift == null) {
                        xh.u3 u3Var = up0Var.J;
                        if (u3Var != null) {
                            u3Var.f();
                            up0Var.J = null;
                        }
                    } else {
                        xh.u3 u3Var2 = up0Var.J;
                        if (u3Var2 == null || u3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                            xh.u3 u3Var3 = new xh.u3(up0Var.K.id, i11, new s3(sp0Var, 13));
                            up0Var.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    up0.a(up0Var);
                    (aq0Var.I.getCurrentPosition() == 1 ? aq0Var.n : aq0Var.h).e();
                    break;
                }
                break;
            case 11:
                ar0 ar0Var = ((rq0) obj).h;
                ar0Var.b0(ar0Var.P.getSearchField());
                break;
            case 12:
                ((sq0) obj).z0.L.l();
                break;
            case 13:
                ((vu0) obj).invalidate();
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
                PhotoViewer photoViewer2 = ((et0) obj).a;
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
                bo boVar = ((gt0) obj).d1.l4;
                if (boVar != null && (mkVar = boVar.Y) != null) {
                    mkVar.I0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) ((cr0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) pk0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.g71 g71Var = photoViewer3.F2;
                if (g71Var != null) {
                    g71Var.C();
                }
                ((PhotoViewer) pk0Var.c).I2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((ts0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.g71 g71Var2 = photoViewer4.F2;
                if (g71Var2 != null) {
                    g71Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 19:
                fu0 fu0Var = (fu0) ((cr0) obj).b;
                fu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = fu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.x2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((it0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 21:
                ((qu0) obj).s.d(true);
                break;
            case 22:
                ((uu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).c;
                premiumPreviewFragment.showDialog(new i41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                break;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 26:
                ((ci.f4) obj).e(true);
                break;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 28:
                hz0 hz0Var = (hz0) obj;
                hz0Var.G.getNotificationCenter().onAnimationFinish(hz0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    qz0 qz0Var = profileActivity.n0;
                    while (qz0Var.D0.k(i13) != qz0Var.getRealCount() - 1) {
                        i13++;
                    }
                    qz0Var.x(i13, true);
                    break;
                }
                break;
        }
    }
}
