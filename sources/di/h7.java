package di;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h7 extends j1.b {
    public final Rect o;
    public final /* synthetic */ i7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(i7 i7Var, i7 i7Var2) {
        super(i7Var2);
        this.p = i7Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        i7 i7Var = this.p;
        if (Math.abs(f7 - i7Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - i7Var.j0) <= AndroidUtilities.dp(30.0f) && !i7Var.b() && !i7Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - i7Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - i7Var.j0) <= AndroidUtilities.dp(30.0f) && !i7Var.b() && !i7Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - i7Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - i7Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        i7 i7Var = this.p;
        if (!i7Var.b() && !i7Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (i7Var.b() || i7Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        i7 i7Var = this.p;
        if (i7Var.a != null && !i7Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (i7Var.b()) {
                        ((fb) i7Var.a).a();
                        return true;
                    }
                    if (i7Var.r0) {
                        i7Var.r0 = false;
                        i7Var.z0 = false;
                        i7Var.v0 = SystemClock.elapsedRealtime();
                        i7Var.u0 = true;
                        ((fb) i7Var.a).e(false);
                        i7Var.invalidate();
                        return true;
                    }
                    if (!i7Var.o0) {
                        ((fb) i7Var.a).d();
                        return true;
                    }
                    if (kc.c(((fb) i7Var.a).a)) {
                        i7Var.R = 0L;
                        i7Var.Q = System.currentTimeMillis();
                        i7Var.A0 = false;
                        ((fb) i7Var.a).f(new bi.la(this, 28), false);
                    }
                    return true;
                }
                if (i10 == 2 && !i7Var.b()) {
                    i7Var.d(180.0f);
                    ((fb) i7Var.a).b();
                    return true;
                }
            } else if (!i7Var.b()) {
                if (!i7Var.r0 || !i7Var.A0) {
                    ((fb) i7Var.a).c();
                    return true;
                }
                i7Var.z0 = false;
                i7Var.G0.d(1.0f, true);
                a4 a4Var = ((fb) i7Var.a).a.T0;
                a4Var.a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                a4Var.invalidate();
                i7Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        cVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.o;
        i7 i7Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = i7Var.k0;
            float f10 = dp;
            float f11 = i7Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            cVar.h(rect);
            cVar.j((i7Var.r0 && i7Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!i7Var.u0 && !i7Var.b()) {
                z10 = true;
            }
            accessibilityNodeInfo.setEnabled(z10);
            if (z10) {
                cVar.b(s0.b.c);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = i7Var.i0;
            float f13 = dp2;
            float f14 = i7Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            cVar.j(i7Var.b() ? LocaleController.getString(R.string.Send) : i7Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : i7Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!i7Var.u0);
            if (i7Var.u0) {
                return;
            }
            cVar.b(s0.b.c);
            return;
        }
        if (i10 != 2) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.p(false);
            cVar.j("");
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = i7Var.l0;
        float f16 = dp3;
        float f17 = i7Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!i7Var.u0 && !i7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.c);
        }
    }
}
