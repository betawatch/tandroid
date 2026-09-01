package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                up0 up0Var = (up0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (up0Var.c != null && !up0Var.f) {
                            sp0 sp0Var = up0Var.d;
                            float f10 = sp0Var.f - sp0Var.x;
                            float f11 = sp0Var.v;
                            float f12 = (sp0Var.h - sp0Var.y) / sp0Var.w;
                            float f13 = sp0Var.d / f11;
                            float f14 = sp0Var.e / f11;
                            up0 up0Var2 = sp0Var.E;
                            int width = (int) ((f10 / f11) * up0Var2.a.getWidth());
                            int height = (int) (f12 * up0Var2.a.getHeight());
                            int width2 = (int) (f13 * up0Var2.a.getWidth());
                            int width3 = (int) (f14 * up0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > up0Var2.a.getWidth()) {
                                width2 = up0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > up0Var2.a.getHeight()) {
                                width3 = up0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(up0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(up0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == up0Var.a) {
                                up0Var.e = true;
                            }
                            ((org.telegram.ui.Components.y40) up0Var.c).s(false, bitmap, null);
                            up0Var.f = true;
                        }
                        up0Var.finishFragment();
                        break;
                    }
                } else {
                    up0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                hq0 hq0Var = (hq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            gq0 gq0Var = hq0Var.p0;
                            if (gq0Var != null) {
                                gq0Var.d();
                            }
                            hq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z4 = hq0Var.V;
                        hq0Var.V = !z4;
                        if (z4) {
                            hq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            hq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        hq0Var.H.B0();
                        hq0Var.J.h1(0, 0);
                        hq0Var.I.l();
                        break;
                    }
                } else {
                    hq0Var.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((mq0) obj).finishFragment();
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
                aw0 aw0Var = (aw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        aw0Var.Y();
                        break;
                    }
                } else if (aw0Var.onBackPressed(true)) {
                    aw0Var.finishFragment();
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
                    ((ox0) obj).finishFragment();
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
                    ((q21) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((w21) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((p31) obj).finishFragment();
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
                p81 p81Var = (p81) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        p81Var.l0(new qg0(null));
                        break;
                    }
                } else {
                    p81Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((ha1) obj).finishFragment();
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
                jd1 jd1Var = (jd1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        jd1.Y(jd1Var);
                        break;
                    }
                } else {
                    jd1Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((be1) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((sf1) obj).finishFragment();
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
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) obj;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.p2) f1Var).actionBar;
                    if (!kVar.s()) {
                        f1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) f1Var).actionBar;
                        kVar2.r();
                        f1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) f1Var.a, (h5.d) new ag.d(17));
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((sh.r) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((sh.p2) obj).q();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((sh.x3) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
