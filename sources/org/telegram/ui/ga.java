package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ga extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        org.telegram.ui.ActionBar.r5 r5Var;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ta taVar = (ta) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ta.Z(taVar);
                        ta.a0(taVar);
                        break;
                    }
                } else {
                    taVar.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((wb) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                bd bdVar = (bd) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        bdVar.L.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        bdVar.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        bdVar.L.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        bdVar.m0 = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        bdVar.n0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bdVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(bdVar, i13));
                        bdVar.o0.addListener(new kg.e(bdVar, 24));
                        bdVar.o0.setDuration(400L);
                        bdVar.o0.setInterpolator(org.telegram.ui.Components.ut.e);
                        bdVar.o0.start();
                        frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new hc(bdVar, 0));
                        break;
                    }
                } else if (bdVar.b >= bdVar.V0() && bdVar.T0()) {
                    bdVar.Y0();
                    break;
                } else {
                    bdVar.finishFragment();
                    break;
                }
                break;
            case 3:
                mo moVar = (mo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        moVar.k0();
                        break;
                    }
                } else if (moVar.f0(true)) {
                    moVar.finishFragment();
                    break;
                }
                break;
            case 4:
                ap apVar = (ap) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        org.telegram.ui.ActionBar.u5 u5Var = apVar.r;
                        if (u5Var == null || !u5Var.x.f) {
                            apVar.a0();
                            break;
                        }
                    }
                } else {
                    apVar.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((np) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((vp) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                gq gqVar = (gq) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        gqVar.s0(true);
                        break;
                    }
                } else if (gqVar.n0(true)) {
                    gqVar.finishFragment();
                    break;
                }
                break;
            case 8:
                kr krVar = (kr) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        krVar.v0();
                        break;
                    }
                } else if (krVar.h0(true)) {
                    krVar.finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj;
                if (i10 != -1) {
                    m8Var.A0(i10);
                    break;
                } else {
                    m8Var.dismiss();
                    break;
                }
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (i10 != -1) {
                    tiVar.B0.v(i10);
                    break;
                } else if (!tiVar.B0.j()) {
                    tiVar.dismiss();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m40) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                if (i10 != -1) {
                    if (i10 == 10) {
                        org.telegram.ui.Components.sa0 sa0Var = ta0Var.R;
                        sa0Var.l1(sa0Var.getClosestTab(), false);
                        break;
                    }
                } else if (!ta0Var.R.S(true)) {
                    ta0Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.fg0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.nh0) obj).dismiss();
                    break;
                }
                break;
            case 16:
                ((org.telegram.ui.Components.mr0) obj).onBackPressed();
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m71) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((ih1) obj).a(false, false);
                    break;
                }
                break;
            case 20:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 != -1) {
                    if (i10 != 100) {
                        if (i10 == 1) {
                            SharedConfig.toggleSortContactsByName();
                            contactsActivity.r = SharedConfig.sortContactsByName;
                            org.telegram.ui.ActionBar.y5 y5Var = contactsActivity.n;
                            if (y5Var != null) {
                                AndroidUtilities.updateImageViewImageAnimated(y5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                            }
                            ViewPropertyAnimator viewPropertyAnimator = contactsActivity.e0;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                            }
                            contactsActivity.a.b();
                            ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.ds.g).withEndAction(new ls(contactsActivity, i12));
                            contactsActivity.e0 = withEndAction;
                            withEndAction.start();
                            break;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
                        a0.h hVar = contactsActivity.Z;
                        int m10 = hVar.m();
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        if (m10 == 1) {
                            e2Var.R = LocaleController.getString(R.string.DeleteContactTitle);
                            e2Var.T = LocaleController.getString(R.string.DeleteContactSubtitle);
                        } else {
                            e2Var.R = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                            e2Var.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ms(contactsActivity));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(3));
                        e2Var.show();
                        e2Var.i();
                        break;
                    }
                } else {
                    r5Var = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                    if (!r5Var.o()) {
                        contactsActivity.finishFragment();
                        break;
                    } else {
                        contactsActivity.i0();
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((ot) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((lu) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((zu) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((uy) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                lz lzVar = (lz) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        lzVar.d0();
                        break;
                    }
                } else if (lzVar.X(true)) {
                    lzVar.finishFragment();
                    break;
                }
                break;
            case 28:
                o00 o00Var = (o00) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        o00Var.s0();
                        break;
                    }
                } else if (o00Var.j0(true)) {
                    o00Var.finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
