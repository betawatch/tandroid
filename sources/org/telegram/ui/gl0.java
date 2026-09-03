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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        lk lkVar;
        int i12 = this.a;
        int i13 = 0;
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
                ((nm0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.z4.x0(((rm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                bn0 bn0Var = (bn0) ((org.telegram.ui.Components.h50) obj).b;
                double d = currentTimeMillis - bn0Var.D;
                bn0Var.D = currentTimeMillis;
                int i14 = (int) (bn0Var.B - d);
                bn0Var.B = i14;
                if (i14 <= 1000) {
                    bn0Var.r.setVisibility(0);
                    bn0Var.n.setVisibility(8);
                    bn0Var.r();
                    break;
                }
                break;
            case 6:
                an0 an0Var = (an0) obj;
                bn0 bn0Var2 = an0Var.a;
                int i15 = bn0Var2.y;
                cn0 cn0Var = bn0Var2.s;
                gg.q qVar = bn0Var2.n;
                if (i15 < 1000) {
                    if (cn0Var != null) {
                        cn0Var.c = 1.0f;
                        cn0Var.invalidate();
                    }
                    bn0Var2.s();
                    int i16 = bn0Var2.I;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = bn0Var2.J;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveSmsCode);
                                    bn0Var2.F = false;
                                    bn0Var2.r();
                                    bn0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    qVar.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    qVar.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                bn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = bn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = bn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.p2) bn0Var2.N).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new o(an0Var, 16), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(bn0Var2, NotificationCenter.didReceiveCall);
                        bn0Var2.F = false;
                        bn0Var2.r();
                        bn0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = bn0Var2.J;
                    if (i21 == 4 || i21 == 3) {
                        qVar.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (cn0Var != null) {
                        cn0Var.c = 1.0f - (bn0Var2.y / bn0Var2.M);
                        cn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                ze.d.s(((wn0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                lo0 lo0Var = ((ao0) obj).a;
                lo0Var.t0();
                lo0Var.H0(true, false);
                lo0Var.D0(false);
                break;
            case 9:
                ze.d.s(((eo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                fp0 fp0Var = (fp0) obj;
                hp0 hp0Var = fp0Var.c;
                mp0 mp0Var = hp0Var.B;
                np0 np0Var = hp0Var.m0;
                if (mp0Var != null && hp0Var.I.size() > 1) {
                    mp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) hp0Var.J.get(1);
                    hp0Var.H = starGift;
                    if (starGift == null) {
                        kh.a5 a5Var = hp0Var.G;
                        if (a5Var != null) {
                            a5Var.f();
                            hp0Var.G = null;
                        }
                    } else {
                        kh.a5 a5Var2 = hp0Var.G;
                        if (a5Var2 == null || a5Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                            kh.a5 a5Var3 = new kh.a5(hp0Var.H.id, i11, new y3(fp0Var, 13));
                            hp0Var.G = a5Var3;
                            a5Var3.g(false);
                        }
                    }
                    hp0.a(hp0Var);
                    (np0Var.F.getCurrentPosition() == 1 ? np0Var.n : np0Var.h).e();
                    break;
                }
                break;
            case 11:
                mq0 mq0Var = ((eq0) obj).h;
                mq0Var.b0(mq0Var.M.getSearchField());
                break;
            case 12:
                ((fq0) obj).w0.I.l();
                break;
            case 13:
                ((iu0) obj).invalidate();
                break;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
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
            case 15:
                PhotoViewer photoViewer2 = ((ps0) obj).a;
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
            case 16:
                zn znVar = ((rs0) obj).a1.i4;
                if (znVar != null && (lkVar = znVar.V) != null) {
                    lkVar.H0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) ((ss0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ex0Var.c;
                photoViewer3.E2 = false;
                org.telegram.ui.Components.i71 i71Var = photoViewer3.C2;
                if (i71Var != null) {
                    i71Var.C();
                }
                ((PhotoViewer) ex0Var.c).F2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((es0) obj).a;
                photoViewer4.E2 = false;
                org.telegram.ui.Components.i71 i71Var2 = photoViewer4.C2;
                if (i71Var2 != null) {
                    i71Var2.C();
                }
                photoViewer4.F2 = null;
                break;
            case 19:
                rt0 rt0Var = (rt0) ((ss0) obj).b;
                rt0Var.r.i7.unlock();
                PhotoViewer photoViewer5 = rt0Var.r;
                Runnable runnable = photoViewer5.m4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.m4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((us0) obj).b;
                Runnable runnable2 = photoViewer6.m4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.m4 = null;
                    break;
                }
                break;
            case 21:
                ((cu0) obj).s.d(true);
                break;
            case 22:
                ((hu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ow0) obj).c;
                premiumPreviewFragment.showDialog(new w31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.ok) obj).run(0);
                break;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 26:
                ((ph.f3) obj).e(true);
                break;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 28:
                uy0 uy0Var = (uy0) obj;
                uy0Var.G.getNotificationCenter().onAnimationFinish(uy0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.e) obj).c;
                if (profileActivity.k5 != 1.0f) {
                    dz0 dz0Var = profileActivity.k0;
                    while (dz0Var.A0.k(i13) != dz0Var.getRealCount() - 1) {
                        i13++;
                    }
                    dz0Var.x(i13, true);
                    break;
                }
                break;
        }
    }
}
