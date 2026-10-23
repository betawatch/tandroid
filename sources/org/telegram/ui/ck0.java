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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ck0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        fk fkVar;
        int i12 = this.a;
        int i13 = 16;
        Object obj = this.b;
        switch (i12) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
            case 1:
                ((PasscodeActivity) ((id0) obj).n).k0();
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
                ((em0) obj).a.finishFragment();
                break;
            case 5:
                org.telegram.ui.Components.f5.w0(((im0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                rm0 rm0Var = (rm0) ((e6.r) obj).b;
                double d = currentTimeMillis - rm0Var.G;
                rm0Var.G = currentTimeMillis;
                int i14 = (int) (rm0Var.E - d);
                rm0Var.E = i14;
                if (i14 <= 1000) {
                    rm0Var.r.setVisibility(0);
                    rm0Var.n.setVisibility(8);
                    rm0Var.r();
                    break;
                }
                break;
            case 7:
                qm0 qm0Var = (qm0) obj;
                rm0 rm0Var2 = qm0Var.a;
                int i15 = rm0Var2.y;
                sm0 sm0Var = rm0Var2.s;
                kd0 kd0Var = rm0Var2.n;
                if (i15 < 1000) {
                    if (sm0Var != null) {
                        sm0Var.c = 1.0f;
                        sm0Var.invalidate();
                    }
                    rm0Var2.s();
                    int i16 = rm0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = rm0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveSmsCode);
                                    rm0Var2.I = false;
                                    rm0Var2.r();
                                    rm0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    kd0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    kd0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                rm0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = rm0Var2.a;
                                tL_auth_resendCode.phone_code_hash = rm0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) rm0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(qm0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveCall);
                        rm0Var2.I = false;
                        rm0Var2.r();
                        rm0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = rm0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        kd0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        kd0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (sm0Var != null) {
                        sm0Var.c = 1.0f - (rm0Var2.y / rm0Var2.P);
                        sm0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                pf.d.r(((on0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                eo0 eo0Var = ((tn0) obj).a;
                eo0Var.t0();
                eo0Var.H0(true, false);
                eo0Var.D0(false);
                break;
            case 10:
                pf.d.r(((xn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                ap0 ap0Var = (ap0) obj;
                cp0 cp0Var = ap0Var.c;
                hp0 hp0Var = cp0Var.E;
                ip0 ip0Var = cp0Var.p0;
                if (hp0Var != null && cp0Var.L.size() > 1) {
                    hp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) cp0Var.M.get(1);
                    cp0Var.K = starGift;
                    if (starGift == null) {
                        yh.s3 s3Var = cp0Var.J;
                        if (s3Var != null) {
                            s3Var.f();
                            cp0Var.J = null;
                        }
                    } else {
                        yh.s3 s3Var2 = cp0Var.J;
                        if (s3Var2 == null || s3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                            yh.s3 s3Var3 = new yh.s3(cp0Var.K.id, i11, new v3(ap0Var, i13));
                            cp0Var.J = s3Var3;
                            s3Var3.g(false);
                        }
                    }
                    cp0.a(cp0Var);
                    (ip0Var.I.getCurrentPosition() == 1 ? ip0Var.n : ip0Var.h).e();
                    break;
                }
                break;
            case 12:
                jq0 jq0Var = ((aq0) obj).s;
                jq0Var.b0(jq0Var.P.getSearchField());
                break;
            case 13:
                ((bq0) obj).z0.L.l();
                break;
            case 14:
                ((bu0) obj).invalidate();
                break;
            case 15:
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
            case 16:
                PhotoViewer photoViewer2 = ((ks0) obj).a;
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
                qn qnVar = ((ms0) obj).e1.l4;
                if (qnVar != null && (fkVar = qnVar.Y) != null) {
                    fkVar.F0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.nl0 nl0Var = (org.telegram.ui.Components.nl0) ((zb0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) nl0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.c81 c81Var = photoViewer3.F2;
                if (c81Var != null) {
                    c81Var.C();
                }
                ((PhotoViewer) nl0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((zr0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.c81 c81Var2 = photoViewer4.F2;
                if (c81Var2 != null) {
                    c81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                lt0 lt0Var = (lt0) ((zb0) obj).b;
                lt0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = lt0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.A2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((os0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((wt0) obj).x.d(true);
                break;
            case 23:
                ((au0) obj).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((gw0) obj).c;
                premiumPreviewFragment.showDialog(new t21(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.hk) obj).run(0);
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
                iy0 iy0Var = (iy0) obj;
                iy0Var.G.getNotificationCenter().onAnimationFinish(iy0Var.F);
                break;
        }
    }
}
