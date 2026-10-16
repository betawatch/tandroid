package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                zb0 zb0Var = (zb0) obj;
                if (i10 == -1) {
                    zb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(zb0Var.F);
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((qc0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                ah0 ah0Var = (ah0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && ah0Var.onBackPressed(true)) {
                        ah0Var.finishFragment();
                        break;
                    }
                } else {
                    ah0Var.p1();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((dh0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((di0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((ei0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                pj0 pj0Var = (pj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", pj0Var.b);
                        pj0Var.presentFragment(new hb1(bundle));
                        break;
                    }
                } else {
                    pj0Var.finishFragment();
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
                rq0 rq0Var = (rq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (rq0Var.c != null && !rq0Var.f) {
                            pq0 pq0Var = rq0Var.d;
                            float f7 = pq0Var.f - pq0Var.x;
                            float f10 = pq0Var.v;
                            float f11 = (pq0Var.h - pq0Var.y) / pq0Var.w;
                            float f12 = pq0Var.d / f10;
                            float f13 = pq0Var.e / f10;
                            rq0 rq0Var2 = pq0Var.H;
                            int width = (int) ((f7 / f10) * rq0Var2.a.getWidth());
                            int height = (int) (f11 * rq0Var2.a.getHeight());
                            int width2 = (int) (f12 * rq0Var2.a.getWidth());
                            int width3 = (int) (f13 * rq0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > rq0Var2.a.getWidth()) {
                                width2 = rq0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > rq0Var2.a.getHeight()) {
                                width3 = rq0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(rq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(rq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == rq0Var.a) {
                                rq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.i50) rq0Var.c).r(false, bitmap, null);
                            rq0Var.f = true;
                        }
                        rq0Var.finishFragment();
                        break;
                    }
                } else {
                    rq0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                fr0 fr0Var = (fr0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            er0 er0Var = fr0Var.s0;
                            if (er0Var != null) {
                                er0Var.g();
                            }
                            fr0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = fr0Var.Y;
                        fr0Var.Y = !z10;
                        if (z10) {
                            fr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            fr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        fr0Var.K.B0();
                        fr0Var.M.h1(0, 0);
                        fr0Var.L.l();
                        break;
                    }
                } else {
                    fr0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((kr0) obj).finishFragment();
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
