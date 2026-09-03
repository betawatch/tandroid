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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements tc0, org.telegram.ui.ActionBar.c2, y4, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, tg.b, gv0, hv0, r0.o {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
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

    @Override // tg.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 19:
                bd0 bd0Var = (bd0) obj;
                bd0Var.f = f10;
                if (!bd0Var.y || bd0Var.C) {
                    bd0Var.c.setStrokeWidth(AndroidUtilities.lerp(bd0Var.v, bd0Var.w, f10));
                    bd0Var.f();
                }
                bd0Var.invalidate();
                break;
            case 21:
                bd0 bd0Var2 = (bd0) obj;
                bd0Var2.n = f10;
                if (!bd0Var2.y || bd0Var2.C) {
                    bd0Var2.f();
                }
                bd0Var2.invalidate();
                break;
            case 23:
                bd0 bd0Var3 = (bd0) obj;
                bd0Var3.s = f10;
                bd0Var3.f();
                break;
            case 27:
                mg0 mg0Var = (mg0) obj;
                WindowManager.LayoutParams layoutParams = mg0Var.c;
                mg0Var.H = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var.b, mg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    mg0Var.J.c();
                    return;
                }
            default:
                mg0 mg0Var2 = (mg0) obj;
                WindowManager.LayoutParams layoutParams2 = mg0Var2.c;
                mg0Var2.I = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var2.b, mg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    mg0Var2.K.c();
                }
        }
    }

    @Override // p.a
    public ic c(qc qcVar) {
        return qcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        switch (this.a) {
            case 11:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof gj0) {
                    gj0 gj0Var = (gj0) drawable;
                    gj0Var.N(0);
                    gj0Var.stop();
                    gj0Var.Q(0.0f, false);
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

    @Override // org.telegram.ui.Components.tc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return kf.k0.j(i10, "");
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
                return kf.k0.j(i10, "");
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 18:
                return ((bd0) obj).f;
            case 20:
                return ((bd0) obj).n;
            case 22:
                return ((bd0) obj).s;
            case 26:
                return ((mg0) obj).H;
            default:
                return ((mg0) obj).I;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
                int i10 = kz.L2;
                return 0;
        }
    }
}
