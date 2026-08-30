package m;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.bs;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements NativeInstance.AudioLevelsCallback, gv0, hv0, org.telegram.ui.ActionBar.c2, o3.n, j3.f, v2.e, tv0, Utilities.Callback2Return, ug.g, hl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ j0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 f(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // v2.e
    public Object apply(Object obj) {
        o9.a.b.getClass();
        return l9.a.a.e((k9.e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 4:
                nh.j1 j1Var = (nh.j1) obj;
                WindowManager.LayoutParams layoutParams = j1Var.c;
                j1Var.K = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, layoutParams);
                break;
            case 6:
                nh.j1 j1Var2 = (nh.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var2.c;
                j1Var2.L = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(j1Var2.b, j1Var2.d, layoutParams2);
                break;
            case 26:
                bs bsVar = (bs) obj;
                bsVar.b = f10;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                bs bsVar2 = (bs) obj;
                bsVar2.c = f10;
                if (bsVar2.getParent() != null) {
                    ((View) bsVar2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        s8.i0 s6;
        switch (this.a) {
            case 11:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(o4.s0.f);
                if (parcelableArrayList == null) {
                    s8.t tVar = s8.v.b;
                    s6 = s8.i0.e;
                } else {
                    s6 = h5.a.s(j3.n0.G0, parcelableArrayList);
                }
                return new o4.s0(bundle.getString(o4.s0.h, ""), (j3.n0[]) s6.toArray(new j3.n0[0]));
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o4.t0.e);
                return parcelableArrayList2 == null ? new o4.t0(new o4.s0[0]) : new o4.t0((o4.s0[]) h5.a.s(o4.s0.n, parcelableArrayList2).toArray(new o4.s0[0]));
        }
    }

    @Override // ug.g
    public void d(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 3:
                return ((nh.j1) obj).K;
            case 5:
                return ((nh.j1) obj).L;
            case 25:
                return ((bs) obj).b;
            case 27:
                return ((bs) obj).c;
            default:
                return ((bs) obj).d;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 7:
                d2Var.dismiss();
                break;
            case 8:
                d2Var.dismiss();
                break;
            case 15:
                d2Var.dismiss();
                break;
            case 20:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 18:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
    }

    @Override // o3.n
    public void release() {
    }
}
