package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ll0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Bitmap bitmap;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
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
                zp0 zp0Var = (zp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (zp0Var.c != null && !zp0Var.f) {
                            xp0 xp0Var = zp0Var.d;
                            float f10 = xp0Var.f - xp0Var.x;
                            float f11 = xp0Var.v;
                            float f12 = (xp0Var.h - xp0Var.y) / xp0Var.w;
                            float f13 = xp0Var.d / f11;
                            float f14 = xp0Var.e / f11;
                            zp0 zp0Var2 = xp0Var.E;
                            int width = (int) ((f10 / f11) * zp0Var2.a.getWidth());
                            int height = (int) (f12 * zp0Var2.a.getHeight());
                            int width2 = (int) (f13 * zp0Var2.a.getWidth());
                            int width3 = (int) (f14 * zp0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > zp0Var2.a.getWidth()) {
                                width2 = zp0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > zp0Var2.a.getHeight()) {
                                width3 = zp0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(zp0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(zp0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == zp0Var.a) {
                                zp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.x40) zp0Var.c).s(false, bitmap, null);
                            zp0Var.f = true;
                        }
                        zp0Var.finishFragment();
                        break;
                    }
                } else {
                    zp0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                mq0 mq0Var = (mq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            lq0 lq0Var = mq0Var.p0;
                            if (lq0Var != null) {
                                lq0Var.d();
                            }
                            mq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z4 = mq0Var.V;
                        mq0Var.V = !z4;
                        if (z4) {
                            mq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            mq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        mq0Var.H.B0();
                        mq0Var.J.h1(0, 0);
                        mq0Var.I.l();
                        break;
                    }
                } else {
                    mq0Var.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((rq0) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i12 = PopupNotificationActivity.Y;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i13 = PopupNotificationActivity.Y;
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
                fw0 fw0Var = (fw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        fw0Var.Y();
                        break;
                    }
                } else if (fw0Var.onBackPressed(true)) {
                    fw0Var.finishFragment();
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
                    ((tx0) obj).finishFragment();
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
                    ((w21) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((b31) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((t31) obj).finishFragment();
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
                w81 w81Var = (w81) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        w81Var.l0(new rg0(null));
                        break;
                    }
                } else {
                    w81Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((oa1) obj).finishFragment();
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
                od1 od1Var = (od1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        od1.Y(od1Var);
                        break;
                    }
                } else {
                    od1Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((ge1) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((yf1) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.U < 0) {
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
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.p2) g1Var).actionBar;
                    if (!kVar.s()) {
                        g1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) g1Var).actionBar;
                        kVar2.r();
                        g1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) g1Var.a, (h5.d) new nh.e(16));
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((rh.r) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((rh.p2) obj).q();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((rh.x3) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
