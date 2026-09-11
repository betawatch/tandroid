package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o70(Object obj, int i10) {
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
                    ((u70) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((w70) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((l80) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                xb0 xb0Var = (xb0) obj;
                if (i10 == -1) {
                    xb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(xb0Var.F);
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((nc0) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                wg0 wg0Var = (wg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && wg0Var.onBackPressed(true)) {
                        wg0Var.finishFragment();
                        break;
                    }
                } else {
                    wg0Var.p1();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((yg0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((yh0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                lj0 lj0Var = (lj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", lj0Var.b);
                        lj0Var.presentFragment(new bb1(bundle));
                        break;
                    }
                } else {
                    lj0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                nq0 nq0Var = (nq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (nq0Var.c != null && !nq0Var.f) {
                            lq0 lq0Var = nq0Var.d;
                            float f7 = lq0Var.f - lq0Var.x;
                            float f10 = lq0Var.v;
                            float f11 = (lq0Var.h - lq0Var.y) / lq0Var.w;
                            float f12 = lq0Var.d / f10;
                            float f13 = lq0Var.e / f10;
                            nq0 nq0Var2 = lq0Var.H;
                            int width = (int) ((f7 / f10) * nq0Var2.a.getWidth());
                            int height = (int) (f11 * nq0Var2.a.getHeight());
                            int width2 = (int) (f12 * nq0Var2.a.getWidth());
                            int width3 = (int) (f13 * nq0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > nq0Var2.a.getWidth()) {
                                width2 = nq0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > nq0Var2.a.getHeight()) {
                                width3 = nq0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(nq0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(nq0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == nq0Var.a) {
                                nq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.u40) nq0Var.c).s(false, bitmap, null);
                            nq0Var.f = true;
                        }
                        nq0Var.finishFragment();
                        break;
                    }
                } else {
                    nq0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                br0 br0Var = (br0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ar0 ar0Var = br0Var.s0;
                            if (ar0Var != null) {
                                ar0Var.g();
                            }
                            br0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = br0Var.Y;
                        br0Var.Y = !z10;
                        if (z10) {
                            br0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            br0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        br0Var.K.B0();
                        br0Var.M.h1(0, 0);
                        br0Var.L.l();
                        break;
                    }
                } else {
                    br0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((gr0) obj).finishFragment();
                    break;
                }
                break;
            case 18:
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
            case 19:
                tw0 tw0Var = (tw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        tw0Var.Y();
                        break;
                    }
                } else if (tw0Var.onBackPressed(true)) {
                    tw0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 21:
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
            case 22:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((hy0) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((i31) obj).finishFragment();
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
                    ((h41) obj).finishFragment();
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
