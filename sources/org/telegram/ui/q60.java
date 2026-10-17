package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q60(Object obj, int i10) {
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
                    ((u60) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((w60) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((c70) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((e70) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((t70) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                cb0 cb0Var = (cb0) obj;
                if (i10 == -1) {
                    cb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(cb0Var.F);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((sb0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                fg0 fg0Var = (fg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && fg0Var.onBackPressed(true)) {
                        fg0Var.finishFragment();
                        break;
                    }
                } else {
                    fg0Var.p1();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((ig0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((lh0) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                wi0 wi0Var = (wi0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", wi0Var.b);
                        wi0Var.presentFragment(new r91(bundle));
                        break;
                    }
                } else {
                    wi0Var.finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                wp0 wp0Var = (wp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (wp0Var.c != null && !wp0Var.f) {
                            up0 up0Var = wp0Var.d;
                            float f7 = up0Var.f - up0Var.x;
                            float f10 = up0Var.v;
                            float f11 = (up0Var.h - up0Var.y) / up0Var.w;
                            float f12 = up0Var.d / f10;
                            float f13 = up0Var.e / f10;
                            wp0 wp0Var2 = up0Var.H;
                            int width = (int) ((f7 / f10) * wp0Var2.a.getWidth());
                            int height = (int) (f11 * wp0Var2.a.getHeight());
                            int width2 = (int) (f12 * wp0Var2.a.getWidth());
                            int width3 = (int) (f13 * wp0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > wp0Var2.a.getWidth()) {
                                width2 = wp0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > wp0Var2.a.getHeight()) {
                                width3 = wp0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(wp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(wp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == wp0Var.a) {
                                wp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.e50) wp0Var.c).r(false, bitmap, null);
                            wp0Var.f = true;
                        }
                        wp0Var.finishFragment();
                        break;
                    }
                } else {
                    wp0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                kq0 kq0Var = (kq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            jq0 jq0Var = kq0Var.s0;
                            if (jq0Var != null) {
                                jq0Var.g();
                            }
                            kq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = kq0Var.Y;
                        kq0Var.Y = !z10;
                        if (z10) {
                            kq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            kq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        kq0Var.K.B0();
                        kq0Var.M.h1(0, 0);
                        kq0Var.L.l();
                        break;
                    }
                } else {
                    kq0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((pq0) obj).finishFragment();
                    break;
                }
                break;
            case 20:
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
            case 21:
                zv0 zv0Var = (zv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        zv0Var.Y();
                        break;
                    }
                } else if (zv0Var.onBackPressed(true)) {
                    zv0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 23:
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
            case 24:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((mx0) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((w11) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((b21) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((t21) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
