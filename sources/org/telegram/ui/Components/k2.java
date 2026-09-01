package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements uc0, org.telegram.ui.ActionBar.c2, y4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, ug.b, hv0, iv0, r0.o {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 9:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z4, i10, false, 0L);
                break;
        }
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return r0.m1.b;
    }

    @Override // ug.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 19:
                cd0 cd0Var = (cd0) obj;
                cd0Var.f = f10;
                if (!cd0Var.y || cd0Var.C) {
                    cd0Var.c.setStrokeWidth(AndroidUtilities.lerp(cd0Var.v, cd0Var.w, f10));
                    cd0Var.f();
                }
                cd0Var.invalidate();
                break;
            case 21:
                cd0 cd0Var2 = (cd0) obj;
                cd0Var2.n = f10;
                if (!cd0Var2.y || cd0Var2.C) {
                    cd0Var2.f();
                }
                cd0Var2.invalidate();
                break;
            case 23:
                cd0 cd0Var3 = (cd0) obj;
                cd0Var3.s = f10;
                cd0Var3.f();
                break;
            case 27:
                ng0 ng0Var = (ng0) obj;
                WindowManager.LayoutParams layoutParams = ng0Var.c;
                ng0Var.H = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var.b, ng0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    ng0Var.J.c();
                    return;
                }
            default:
                ng0 ng0Var2 = (ng0) obj;
                WindowManager.LayoutParams layoutParams2 = ng0Var2.c;
                ng0Var2.I = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var2.b, ng0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    ng0Var2.K.c();
                }
        }
    }

    @Override // p.a
    public ic c(qc qcVar) {
        return qcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ij0 lottieAnimation;
        switch (this.a) {
            case 11:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof ij0) {
                    ij0 ij0Var = (ij0) drawable;
                    ij0Var.N(0);
                    ij0Var.stop();
                    ij0Var.Q(0.0f, false);
                    break;
                }
                break;
            default:
                if (z4 && !z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return l.d.j(i10, "");
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 6:
            default:
                switch (i10) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 7:
                return l.d.j(i10, "");
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        switch (this.a) {
            case 18:
                return ((cd0) obj).f;
            case 20:
                return ((cd0) obj).n;
            case 22:
                return ((cd0) obj).s;
            case 26:
                return ((ng0) obj).H;
            default:
                return ((ng0) obj).I;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                Pattern pattern = z4.a;
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 12:
                return CheckBoxBase.I;
            default:
                int i10 = mz.L2;
                return 0;
        }
    }
}
