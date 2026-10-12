package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((s70) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((y70) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((a80) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((p80) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                ac0 ac0Var = (ac0) obj;
                if (i10 == -1) {
                    ac0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ac0Var.F);
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((rc0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                bh0 bh0Var = (bh0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && bh0Var.onBackPressed(true)) {
                        bh0Var.finishFragment();
                        break;
                    }
                } else {
                    bh0Var.p1();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((eh0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((ei0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((fi0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                qj0 qj0Var = (qj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", qj0Var.b);
                        qj0Var.presentFragment(new hb1(bundle));
                        break;
                    }
                } else {
                    qj0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                tq0 tq0Var = (tq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (tq0Var.c != null && !tq0Var.f) {
                            rq0 rq0Var = tq0Var.d;
                            float f7 = rq0Var.f - rq0Var.x;
                            float f10 = rq0Var.v;
                            float f11 = (rq0Var.h - rq0Var.y) / rq0Var.w;
                            float f12 = rq0Var.d / f10;
                            float f13 = rq0Var.e / f10;
                            tq0 tq0Var2 = rq0Var.H;
                            int width = (int) ((f7 / f10) * tq0Var2.a.getWidth());
                            int height = (int) (f11 * tq0Var2.a.getHeight());
                            int width2 = (int) (f12 * tq0Var2.a.getWidth());
                            int width3 = (int) (f13 * tq0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > tq0Var2.a.getWidth()) {
                                width2 = tq0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > tq0Var2.a.getHeight()) {
                                width3 = tq0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(tq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(tq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == tq0Var.a) {
                                tq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.i50) tq0Var.c).r(false, bitmap, null);
                            tq0Var.f = true;
                        }
                        tq0Var.finishFragment();
                        break;
                    }
                } else {
                    tq0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                hr0 hr0Var = (hr0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            gr0 gr0Var = hr0Var.s0;
                            if (gr0Var != null) {
                                gr0Var.g();
                            }
                            hr0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = hr0Var.Y;
                        hr0Var.Y = !z10;
                        if (z10) {
                            hr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            hr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        hr0Var.K.B0();
                        hr0Var.M.h1(0, 0);
                        hr0Var.L.l();
                        break;
                    }
                } else {
                    hr0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((mr0) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i16 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i17 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 20:
                zw0 zw0Var = (zw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        zw0Var.Y();
                        break;
                    }
                } else if (zw0Var.onBackPressed(true)) {
                    zw0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        privacyControlActivity.z0();
                        break;
                    }
                } else if (privacyControlActivity.v0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((my0) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((n31) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((s31) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((l41) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((t41) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
