package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                eg0 eg0Var = (eg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && eg0Var.onBackPressed(true)) {
                        eg0Var.finishFragment();
                        break;
                    }
                } else {
                    eg0Var.p1();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((hg0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((jh0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                vi0 vi0Var = (vi0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", vi0Var.b);
                        vi0Var.presentFragment(new r91(bundle));
                        break;
                    }
                } else {
                    vi0Var.finishFragment();
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
                xp0 xp0Var = (xp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (xp0Var.c != null && !xp0Var.f) {
                            vp0 vp0Var = xp0Var.d;
                            float f7 = vp0Var.f - vp0Var.x;
                            float f10 = vp0Var.v;
                            float f11 = (vp0Var.h - vp0Var.y) / vp0Var.w;
                            float f12 = vp0Var.d / f10;
                            float f13 = vp0Var.e / f10;
                            xp0 xp0Var2 = vp0Var.H;
                            int width = (int) ((f7 / f10) * xp0Var2.a.getWidth());
                            int height = (int) (f11 * xp0Var2.a.getHeight());
                            int width2 = (int) (f12 * xp0Var2.a.getWidth());
                            int width3 = (int) (f13 * xp0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > xp0Var2.a.getWidth()) {
                                width2 = xp0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > xp0Var2.a.getHeight()) {
                                width3 = xp0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(xp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(xp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == xp0Var.a) {
                                xp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.e50) xp0Var.c).r(false, bitmap, null);
                            xp0Var.f = true;
                        }
                        xp0Var.finishFragment();
                        break;
                    }
                } else {
                    xp0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                lq0 lq0Var = (lq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kq0 kq0Var = lq0Var.s0;
                            if (kq0Var != null) {
                                kq0Var.g();
                            }
                            lq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = lq0Var.Y;
                        lq0Var.Y = !z10;
                        if (z10) {
                            lq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            lq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        lq0Var.K.B0();
                        lq0Var.M.h1(0, 0);
                        lq0Var.L.l();
                        break;
                    }
                } else {
                    lq0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((qq0) obj).finishFragment();
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
