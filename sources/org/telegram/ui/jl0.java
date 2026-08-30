package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jl0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl0(Object obj, int i10) {
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
                sp0 sp0Var = (sp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (sp0Var.c != null && !sp0Var.f) {
                            qp0 qp0Var = sp0Var.d;
                            float f10 = qp0Var.f - qp0Var.x;
                            float f11 = qp0Var.v;
                            float f12 = (qp0Var.h - qp0Var.y) / qp0Var.w;
                            float f13 = qp0Var.d / f11;
                            float f14 = qp0Var.e / f11;
                            sp0 sp0Var2 = qp0Var.E;
                            int width = (int) ((f10 / f11) * sp0Var2.a.getWidth());
                            int height = (int) (f12 * sp0Var2.a.getHeight());
                            int width2 = (int) (f13 * sp0Var2.a.getWidth());
                            int width3 = (int) (f14 * sp0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > sp0Var2.a.getWidth()) {
                                width2 = sp0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > sp0Var2.a.getHeight()) {
                                width3 = sp0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(sp0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(sp0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == sp0Var.a) {
                                sp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.w40) sp0Var.c).s(false, bitmap, null);
                            sp0Var.f = true;
                        }
                        sp0Var.finishFragment();
                        break;
                    }
                } else {
                    sp0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                fq0 fq0Var = (fq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            eq0 eq0Var = fq0Var.p0;
                            if (eq0Var != null) {
                                eq0Var.c();
                            }
                            fq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z4 = fq0Var.V;
                        fq0Var.V = !z4;
                        if (z4) {
                            fq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            fq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        fq0Var.H.B0();
                        fq0Var.J.h1(0, 0);
                        fq0Var.I.l();
                        break;
                    }
                } else {
                    fq0Var.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((kq0) obj).finishFragment();
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
                yv0 yv0Var = (yv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        yv0Var.Y();
                        break;
                    }
                } else if (yv0Var.onBackPressed(true)) {
                    yv0Var.finishFragment();
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
                    ((mx0) obj).finishFragment();
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
                    ((o21) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((u21) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((n31) obj).finishFragment();
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
                o81 o81Var = (o81) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        o81Var.l0(new pg0(null));
                        break;
                    }
                } else {
                    o81Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((ga1) obj).finishFragment();
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
                hd1 hd1Var = (hd1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        hd1.Y(hd1Var);
                        break;
                    }
                } else {
                    hd1Var.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((yd1) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((qf1) obj).finishFragment();
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
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.p2) e1Var).actionBar;
                    if (!kVar.s()) {
                        e1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) e1Var).actionBar;
                        kVar2.r();
                        e1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) e1Var.a, (h5.d) new nh.e(16));
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((rh.s) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((rh.q2) obj).q();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((rh.y3) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
