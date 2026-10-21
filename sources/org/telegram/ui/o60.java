package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o60 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o60(Object obj, int i10) {
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
                    ((s60) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((u60) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((a70) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((c70) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((r70) obj).finishFragment();
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
                ab0 ab0Var = (ab0) obj;
                if (i10 == -1) {
                    ab0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ab0Var.F);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((qb0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                dg0 dg0Var = (dg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && dg0Var.onBackPressed(true)) {
                        dg0Var.finishFragment();
                        break;
                    }
                } else {
                    dg0Var.p1();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((gg0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((ih0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((jh0) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                ui0 ui0Var = (ui0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", ui0Var.b);
                        ui0Var.presentFragment(new p91(bundle));
                        break;
                    }
                } else {
                    ui0Var.finishFragment();
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
                vp0 vp0Var = (vp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (vp0Var.c != null && !vp0Var.f) {
                            tp0 tp0Var = vp0Var.d;
                            float f7 = tp0Var.f - tp0Var.x;
                            float f10 = tp0Var.v;
                            float f11 = (tp0Var.h - tp0Var.y) / tp0Var.w;
                            float f12 = tp0Var.d / f10;
                            float f13 = tp0Var.e / f10;
                            vp0 vp0Var2 = tp0Var.H;
                            int width = (int) ((f7 / f10) * vp0Var2.a.getWidth());
                            int height = (int) (f11 * vp0Var2.a.getHeight());
                            int width2 = (int) (f12 * vp0Var2.a.getWidth());
                            int width3 = (int) (f13 * vp0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > vp0Var2.a.getWidth()) {
                                width2 = vp0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > vp0Var2.a.getHeight()) {
                                width3 = vp0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(vp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(vp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == vp0Var.a) {
                                vp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.e50) vp0Var.c).r(false, bitmap, null);
                            vp0Var.f = true;
                        }
                        vp0Var.finishFragment();
                        break;
                    }
                } else {
                    vp0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                jq0 jq0Var = (jq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            iq0 iq0Var = jq0Var.s0;
                            if (iq0Var != null) {
                                iq0Var.g();
                            }
                            jq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = jq0Var.Y;
                        jq0Var.Y = !z10;
                        if (z10) {
                            jq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            jq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        jq0Var.K.B0();
                        jq0Var.M.h1(0, 0);
                        jq0Var.L.l();
                        break;
                    }
                } else {
                    jq0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((oq0) obj).finishFragment();
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
                xv0 xv0Var = (xv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        xv0Var.Y();
                        break;
                    }
                } else if (xv0Var.onBackPressed(true)) {
                    xv0Var.finishFragment();
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
                    ((kx0) obj).finishFragment();
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
                    ((u11) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((z11) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((r21) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
