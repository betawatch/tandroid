package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cd0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        Bitmap bitmap;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                fg0 fg0Var = (fg0) obj;
                if (i9 != 1) {
                    if (i9 == -1 && fg0Var.onBackPressed(true)) {
                        fg0Var.finishFragment();
                        break;
                    }
                } else {
                    fg0Var.p1();
                    break;
                }
                break;
            case 1:
                if (i9 == -1) {
                    ((hg0) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i9 == -1) {
                    ((hh0) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i9 == -1) {
                    ((ih0) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                ti0 ti0Var = (ti0) obj;
                if (i9 != -1) {
                    if (i9 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", ti0Var.b);
                        ti0Var.presentFragment(new s91(bundle));
                        break;
                    }
                } else {
                    ti0Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i9 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i9 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i9 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i9 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                lp0 lp0Var = (lp0) obj;
                if (i9 != -1) {
                    if (i9 == 1) {
                        if (lp0Var.c != null && !lp0Var.f) {
                            jp0 jp0Var = lp0Var.d;
                            float f10 = jp0Var.f - jp0Var.x;
                            float f11 = jp0Var.v;
                            float f12 = (jp0Var.h - jp0Var.y) / jp0Var.w;
                            float f13 = jp0Var.d / f11;
                            float f14 = jp0Var.e / f11;
                            lp0 lp0Var2 = jp0Var.D;
                            int width = (int) ((f10 / f11) * lp0Var2.a.getWidth());
                            int height = (int) (f12 * lp0Var2.a.getHeight());
                            int width2 = (int) (f13 * lp0Var2.a.getWidth());
                            int width3 = (int) (f14 * lp0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > lp0Var2.a.getWidth()) {
                                width2 = lp0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > lp0Var2.a.getHeight()) {
                                width3 = lp0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(lp0Var2.a, width, height, width2, width3);
                            } catch (Throwable th) {
                                FileLog.e(th);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(lp0Var2.a, width, height, width2, width3);
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == lp0Var.a) {
                                lp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.e40) lp0Var.c).s(false, bitmap, null);
                            lp0Var.f = true;
                        }
                        lp0Var.finishFragment();
                        break;
                    }
                } else {
                    lp0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                zp0 zp0Var = (zp0) obj;
                if (i9 != -1) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            yp0 yp0Var = zp0Var.o0;
                            if (yp0Var != null) {
                                yp0Var.h();
                            }
                            zp0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = zp0Var.U;
                        zp0Var.U = !z10;
                        if (z10) {
                            zp0Var.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            zp0Var.G.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        zp0Var.G.B0();
                        zp0Var.I.h1(0, 0);
                        zp0Var.H.l();
                        break;
                    }
                } else {
                    zp0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i9 == -1) {
                    ((eq0) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i9 != -1) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int i11 = PopupNotificationActivity.X;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i12 = PopupNotificationActivity.X;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 13:
                pv0 pv0Var = (pv0) obj;
                if (i9 != -1) {
                    if (i9 == 1) {
                        pv0Var.X();
                        break;
                    }
                } else if (pv0Var.onBackPressed(true)) {
                    pv0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i9 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i9 != -1) {
                    if (i9 == 1) {
                        privacyControlActivity.y0();
                        break;
                    }
                } else if (privacyControlActivity.u0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i9 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i9 == -1) {
                    ((cx0) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i9 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i9 == -1) {
                    ((b21) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i9 == -1) {
                    ((h21) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i9 == -1) {
                    ((b31) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i9 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i9 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 24:
                if (i9 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                z71 z71Var = (z71) obj;
                if (i9 != -1) {
                    if (i9 == 2) {
                        z71Var.k0(new hg0(null));
                        break;
                    }
                } else {
                    z71Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i9 == -1) {
                    ((s91) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i9 != -1) {
                    StickersActivity.c0(stickersActivity, i9);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 28:
                tc1 tc1Var = (tc1) obj;
                if (i9 != -1) {
                    if (i9 == 1) {
                        tc1.X(tc1Var);
                        break;
                    }
                } else {
                    tc1Var.finishFragment();
                    break;
                }
                break;
            default:
                if (i9 == -1) {
                    ((kd1) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
