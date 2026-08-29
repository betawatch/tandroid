package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class al0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        Bitmap bitmap;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                kp0 kp0Var = (kp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (kp0Var.c != null && !kp0Var.f) {
                            ip0 ip0Var = kp0Var.d;
                            float f9 = ip0Var.f - ip0Var.x;
                            float f10 = ip0Var.v;
                            float f11 = (ip0Var.h - ip0Var.y) / ip0Var.w;
                            float f12 = ip0Var.d / f10;
                            float f13 = ip0Var.e / f10;
                            kp0 kp0Var2 = ip0Var.D;
                            int width = (int) ((f9 / f10) * kp0Var2.a.getWidth());
                            int height = (int) (f11 * kp0Var2.a.getHeight());
                            int width2 = (int) (f12 * kp0Var2.a.getWidth());
                            int width3 = (int) (f13 * kp0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > kp0Var2.a.getWidth()) {
                                width2 = kp0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > kp0Var2.a.getHeight()) {
                                width3 = kp0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(kp0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(kp0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == kp0Var.a) {
                                kp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.s40) kp0Var.c).s(false, bitmap, null);
                            kp0Var.f = true;
                        }
                        kp0Var.finishFragment();
                        break;
                    }
                } else {
                    kp0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                zp0 zp0Var = (zp0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            yp0 yp0Var = zp0Var.o0;
                            if (yp0Var != null) {
                                yp0Var.g();
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
            case 3:
                if (i10 == -1) {
                    ((eq0) obj).finishFragment();
                    break;
                }
                break;
            case 4:
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
            case 5:
                pv0 pv0Var = (pv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        pv0Var.Y();
                        break;
                    }
                } else if (pv0Var.onBackPressed(true)) {
                    pv0Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 7:
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
            case 8:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((bx0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((c21) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((i21) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((b31) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                b81 b81Var = (b81) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        b81Var.l0(new hg0(null));
                        break;
                    }
                } else {
                    b81Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((t91) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 20:
                vc1 vc1Var = (vc1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        vc1.Y(vc1Var);
                        break;
                    }
                } else {
                    vc1Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((md1) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((ff1) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.T < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.x0();
                        break;
                    }
                }
                break;
            case 24:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.c0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 25:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.X();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                if (i10 == -1) {
                    lVar = ((org.telegram.ui.ActionBar.o2) d1Var).actionBar;
                    if (!lVar.s()) {
                        d1Var.finishFragment();
                        break;
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) d1Var).actionBar;
                        lVar2.r();
                        d1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) d1Var.a, (f5.d) new l4.x0(15));
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((ph.r) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((ph.p2) obj).q();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((ph.x3) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
