package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pb0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb0(Object obj, int i10) {
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
                    ((xb0) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                ig0 ig0Var = (ig0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && ig0Var.onBackPressed(true)) {
                        ig0Var.finishFragment();
                        break;
                    }
                } else {
                    ig0Var.p1();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((kg0) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((lh0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                vi0 vi0Var = (vi0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", vi0Var.b);
                        vi0Var.presentFragment(new q91(bundle));
                        break;
                    }
                } else {
                    vi0Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                mp0 mp0Var = (mp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (mp0Var.c != null && !mp0Var.f) {
                            kp0 kp0Var = mp0Var.d;
                            float f10 = kp0Var.f - kp0Var.x;
                            float f11 = kp0Var.v;
                            float f12 = (kp0Var.h - kp0Var.y) / kp0Var.w;
                            float f13 = kp0Var.d / f11;
                            float f14 = kp0Var.e / f11;
                            mp0 mp0Var2 = kp0Var.D;
                            int width = (int) ((f10 / f11) * mp0Var2.a.getWidth());
                            int height = (int) (f12 * mp0Var2.a.getHeight());
                            int width2 = (int) (f13 * mp0Var2.a.getWidth());
                            int width3 = (int) (f14 * mp0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > mp0Var2.a.getWidth()) {
                                width2 = mp0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > mp0Var2.a.getHeight()) {
                                width3 = mp0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(mp0Var2.a, width, height, width2, width3);
                            } catch (Throwable th) {
                                FileLog.e(th);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(mp0Var2.a, width, height, width2, width3);
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == mp0Var.a) {
                                mp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.j40) mp0Var.c).s(false, bitmap, null);
                            mp0Var.f = true;
                        }
                        mp0Var.finishFragment();
                        break;
                    }
                } else {
                    mp0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                aq0 aq0Var = (aq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zp0 zp0Var = aq0Var.o0;
                            if (zp0Var != null) {
                                zp0Var.h();
                            }
                            aq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = aq0Var.U;
                        aq0Var.U = !z10;
                        if (z10) {
                            aq0Var.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            aq0Var.G.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        aq0Var.G.B0();
                        aq0Var.I.h1(0, 0);
                        aq0Var.H.l();
                        break;
                    }
                } else {
                    aq0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((fq0) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i12 = PopupNotificationActivity.X;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i13 = PopupNotificationActivity.X;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 14:
                qv0 qv0Var = (qv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qv0Var.Y();
                        break;
                    }
                } else if (qv0Var.onBackPressed(true)) {
                    qv0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 16:
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
            case 17:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((cx0) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((a21) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((g21) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((a31) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                x71 x71Var = (x71) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        x71Var.l0(new kg0(null));
                        break;
                    }
                } else {
                    x71Var.finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((q91) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            default:
                tc1 tc1Var = (tc1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        tc1.Y(tc1Var);
                        break;
                    }
                } else {
                    tc1Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
