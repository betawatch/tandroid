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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements mc0, org.telegram.ui.ActionBar.b2, b5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, rg.b, yu0, zu0, r0.o {
    public final /* synthetic */ int a;

    public /* synthetic */ r2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 4:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return r0.m1.b;
    }

    @Override // rg.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.zu0
    public void b(Object obj, float f9) {
        switch (this.a) {
            case 14:
                uc0 uc0Var = (uc0) obj;
                uc0Var.f = f9;
                if (!uc0Var.y || uc0Var.B) {
                    uc0Var.c.setStrokeWidth(AndroidUtilities.lerp(uc0Var.v, uc0Var.w, f9));
                    uc0Var.f();
                }
                uc0Var.invalidate();
                break;
            case 16:
                uc0 uc0Var2 = (uc0) obj;
                uc0Var2.n = f9;
                if (!uc0Var2.y || uc0Var2.B) {
                    uc0Var2.f();
                }
                uc0Var2.invalidate();
                break;
            case 18:
                uc0 uc0Var3 = (uc0) obj;
                uc0Var3.s = f9;
                uc0Var3.f();
                break;
            case 22:
                bg0 bg0Var = (bg0) obj;
                WindowManager.LayoutParams layoutParams = bg0Var.c;
                bg0Var.G = f9;
                layoutParams.x = (int) f9;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var.b, bg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    bg0Var.I.c();
                    return;
                }
            case 24:
                bg0 bg0Var2 = (bg0) obj;
                WindowManager.LayoutParams layoutParams2 = bg0Var2.c;
                bg0Var2.H = f9;
                layoutParams2.y = (int) f9;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var2.b, bg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    bg0Var2.J.c();
                    return;
                }
            default:
                qo0 qo0Var = (qo0) obj;
                qo0Var.n = f9;
                qo0Var.invalidate();
                break;
        }
    }

    @Override // p.a
    public mc c(tc tcVar) {
        return tcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        switch (this.a) {
            case 6:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof xi0) {
                    xi0 xi0Var = (xi0) drawable;
                    xi0Var.N(0);
                    xi0Var.stop();
                    xi0Var.Q(0.0f, false);
                    break;
                }
                break;
            default:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 1:
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
            case 2:
                return j7.l1.k(i10, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                Pattern pattern = c5.a;
                break;
            case 11:
                c2Var.dismiss();
                break;
            case 26:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public float get(Object obj) {
        switch (this.a) {
            case 13:
                return ((uc0) obj).f;
            case 15:
                return ((uc0) obj).n;
            case 17:
                return ((uc0) obj).s;
            case 21:
                return ((bg0) obj).G;
            case 23:
                return ((bg0) obj).H;
            default:
                return ((qo0) obj).n;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 7:
                return CheckBoxBase.I;
            default:
                int i10 = fz.K2;
                return 0;
        }
    }
}
