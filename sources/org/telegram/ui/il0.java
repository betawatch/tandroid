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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il0(Object obj, int i10) {
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
                ((PasscodeActivity) ((xd0) obj).n).h0();
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
                ((om0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.e5.x0(((sm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                cn0 cn0Var = (cn0) ((ci.o2) obj).b;
                double d = currentTimeMillis - cn0Var.G;
                cn0Var.G = currentTimeMillis;
                int i15 = (int) (cn0Var.E - d);
                cn0Var.E = i15;
                if (i15 <= 1000) {
                    cn0Var.r.setVisibility(0);
                    cn0Var.n.setVisibility(8);
                    cn0Var.r();
                    break;
                }
                break;
            case 6:
                bn0 bn0Var = (bn0) obj;
                cn0 cn0Var2 = bn0Var.a;
                int i16 = cn0Var2.y;
                dn0 dn0Var = cn0Var2.s;
                zm0 zm0Var = cn0Var2.n;
                if (i16 < 1000) {
                    if (dn0Var != null) {
                        dn0Var.c = 1.0f;
                        dn0Var.invalidate();
                    }
                    cn0Var2.s();
                    int i17 = cn0Var2.L;
                    if (i17 != 3) {
                        if (i17 == 2 || i17 == 4) {
                            int i18 = cn0Var2.M;
                            if (i18 != 4 && i18 != 2) {
                                if (i18 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(cn0Var2, NotificationCenter.didReceiveSmsCode);
                                    cn0Var2.I = false;
                                    cn0Var2.r();
                                    cn0Var2.u();
                                    break;
                                }
                            } else {
                                if (i18 == 4) {
                                    zm0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    zm0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                cn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = cn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = cn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.m2) cn0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(bn0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(cn0Var2, NotificationCenter.didReceiveCall);
                        cn0Var2.I = false;
                        cn0Var2.r();
                        cn0Var2.u();
                        break;
                    }
                } else {
                    int i19 = i16 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i20 = i19 / 60;
                    int i21 = i19 - (i20 * 60);
                    int i22 = cn0Var2.M;
                    if (i22 == 4 || i22 == 3) {
                        zm0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i20), Integer.valueOf(i21)));
                    } else if (i22 == 2) {
                        zm0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i20), Integer.valueOf(i21)));
                    }
                    if (dn0Var != null) {
                        dn0Var.c = 1.0f - (cn0Var2.y / cn0Var2.P);
                        dn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                nf.f.s(((yn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                oo0 oo0Var = ((do0) obj).a;
                oo0Var.t0();
                oo0Var.H0(true, false);
                oo0Var.D0(false);
                break;
            case 9:
                nf.f.s(((ho0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                lp0 lp0Var = (lp0) obj;
                np0 np0Var = lp0Var.c;
                sp0 sp0Var = np0Var.E;
                tp0 tp0Var = np0Var.p0;
                if (sp0Var != null && np0Var.L.size() > 1) {
                    sp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) np0Var.M.get(1);
                    np0Var.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = np0Var.J;
                        if (v3Var != null) {
                            v3Var.f();
                            np0Var.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = np0Var.J;
                        if (v3Var2 == null || v3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(np0Var.K.id, i11, new t3(lp0Var, i13));
                            np0Var.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    np0.a(np0Var);
                    (tp0Var.I.getCurrentPosition() == 1 ? tp0Var.n : tp0Var.h).e();
                    break;
                }
                break;
            case 11:
                tq0 tq0Var = ((kq0) obj).h;
                tq0Var.b0(tq0Var.P.getSearchField());
                break;
            case 12:
                ((lq0) obj).z0.L.l();
                break;
            case 13:
                ((nu0) obj).invalidate();
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
                PhotoViewer photoViewer2 = ((ws0) obj).a;
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
                wn wnVar = ((ys0) obj).d1.l4;
                if (wnVar != null && (jkVar = wnVar.Y) != null) {
                    jkVar.H0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.al0 al0Var = (org.telegram.ui.Components.al0) ((xo0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) al0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.s71 s71Var = photoViewer3.F2;
                if (s71Var != null) {
                    s71Var.C();
                }
                ((PhotoViewer) al0Var.c).I2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((ls0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.s71 s71Var2 = photoViewer4.F2;
                if (s71Var2 != null) {
                    s71Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 19:
                xt0 xt0Var = (xt0) ((xo0) obj).b;
                xt0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = xt0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.x2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((at0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 21:
                ((iu0) obj).s.d(true);
                break;
            case 22:
                ((mu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((tw0) obj).c;
                premiumPreviewFragment.showDialog(new z31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.lk) obj).run(0);
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
                xy0 xy0Var = (xy0) obj;
                xy0Var.G.getNotificationCenter().onAnimationFinish(xy0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    gz0 gz0Var = profileActivity.n0;
                    while (gz0Var.D0.k(i14) != gz0Var.getRealCount() - 1) {
                        i14++;
                    }
                    gz0Var.x(i14, true);
                    break;
                }
                break;
        }
    }
}
