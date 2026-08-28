package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements xb0, org.telegram.ui.ActionBar.b2, x4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, og.b, nu0, ou0, r0.o {
    public final /* synthetic */ int a;

    public /* synthetic */ g2(int i9) {
        this.a = i9;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 10:
                MediaController.getInstance().stopRecording(1, z10, i9, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i9, false, 0L);
                break;
        }
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return r0.m1.b;
    }

    @Override // og.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 20:
                fc0 fc0Var = (fc0) obj;
                fc0Var.f = f10;
                if (!fc0Var.y || fc0Var.B) {
                    fc0Var.c.setStrokeWidth(AndroidUtilities.lerp(fc0Var.v, fc0Var.w, f10));
                    fc0Var.f();
                }
                fc0Var.invalidate();
                break;
            case 21:
            case 23:
            default:
                pf0 pf0Var = (pf0) obj;
                WindowManager.LayoutParams layoutParams = pf0Var.c;
                pf0Var.G = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    pf0Var.I.c();
                }
            case 22:
                fc0 fc0Var2 = (fc0) obj;
                fc0Var2.n = f10;
                if (!fc0Var2.y || fc0Var2.B) {
                    fc0Var2.f();
                }
                fc0Var2.invalidate();
                break;
            case 24:
                fc0 fc0Var3 = (fc0) obj;
                fc0Var3.s = f10;
                fc0Var3.f();
                break;
        }
    }

    @Override // p.a
    public gc c(oc ocVar) {
        return ocVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        switch (this.a) {
            case 12:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof mi0) {
                    mi0 mi0Var = (mi0) drawable;
                    mi0Var.N(0);
                    mi0Var.stop();
                    mi0Var.Q(0.0f, false);
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
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 7:
                Pattern pattern = y4.a;
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i9);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) != i10) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 1:
                return String.format("%02d", Integer.valueOf(i9));
            case 2:
                return String.format("%02d", Integer.valueOf(i9));
            case 3:
                return j3.r0.l(i9, "");
            case 4:
                return String.format("%02d", Integer.valueOf(i9));
            case 5:
                return String.format("%02d", Integer.valueOf(i9));
            case 6:
                return i9 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i9 < 1 || i9 >= 16) ? i9 == 16 ? LocaleController.formatTTLString(30) : i9 == 17 ? LocaleController.formatTTLString(60) : i9 == 18 ? LocaleController.formatTTLString(3600) : i9 == 19 ? LocaleController.formatTTLString(86400) : i9 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i9);
            case 7:
            default:
                switch (i9) {
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
            case 8:
                return j3.r0.l(i9, "");
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        switch (this.a) {
            case 19:
                return ((fc0) obj).f;
            case 21:
                return ((fc0) obj).n;
            case 23:
                return ((fc0) obj).s;
            case 27:
                return ((pf0) obj).G;
            default:
                return ((pf0) obj).H;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 13:
                return CheckBoxBase.I;
            default:
                int i9 = wy.K2;
                return 0;
        }
    }
}
