package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                    ((r70) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((g80) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                rb0 rb0Var = (rb0) obj;
                if (i10 == -1) {
                    rb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(rb0Var.F);
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((hc0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                qg0 qg0Var = (qg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && qg0Var.onBackPressed(true)) {
                        qg0Var.finishFragment();
                        break;
                    }
                } else {
                    qg0Var.p1();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((sg0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((sh0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((th0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                ej0 ej0Var = (ej0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", ej0Var.b);
                        ej0Var.presentFragment(new sa1(bundle));
                        break;
                    }
                } else {
                    ej0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                fq0 fq0Var = (fq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (fq0Var.c != null && !fq0Var.f) {
                            dq0 dq0Var = fq0Var.d;
                            float f7 = dq0Var.f - dq0Var.x;
                            float f10 = dq0Var.v;
                            float f11 = (dq0Var.h - dq0Var.y) / dq0Var.w;
                            float f12 = dq0Var.d / f10;
                            float f13 = dq0Var.e / f10;
                            fq0 fq0Var2 = dq0Var.H;
                            int width = (int) ((f7 / f10) * fq0Var2.a.getWidth());
                            int height = (int) (f11 * fq0Var2.a.getHeight());
                            int width2 = (int) (f12 * fq0Var2.a.getWidth());
                            int width3 = (int) (f13 * fq0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > fq0Var2.a.getWidth()) {
                                width2 = fq0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > fq0Var2.a.getHeight()) {
                                width3 = fq0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(fq0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(fq0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == fq0Var.a) {
                                fq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.v40) fq0Var.c).s(false, bitmap, null);
                            fq0Var.f = true;
                        }
                        fq0Var.finishFragment();
                        break;
                    }
                } else {
                    fq0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                tq0 tq0Var = (tq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sq0 sq0Var = tq0Var.s0;
                            if (sq0Var != null) {
                                sq0Var.g();
                            }
                            tq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = tq0Var.Y;
                        tq0Var.Y = !z10;
                        if (z10) {
                            tq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            tq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        tq0Var.K.B0();
                        tq0Var.M.h1(0, 0);
                        tq0Var.L.l();
                        break;
                    }
                } else {
                    tq0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((yq0) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i12 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i13 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 18:
                kw0 kw0Var = (kw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        kw0Var.Y();
                        break;
                    }
                } else if (kw0Var.onBackPressed(true)) {
                    kw0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 20:
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
            case 21:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((yx0) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((y21) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((d31) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((w31) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((f41) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
        }
    }
}
