package kh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y6 extends j1.b {
    public final Rect o;
    public final /* synthetic */ z6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, z6 z6Var2) {
        super(z6Var2);
        this.p = z6Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        z6 z6Var = this.p;
        if (Math.abs(f10 - z6Var.g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - z6Var.f0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.q0) {
            return 0;
        }
        if (Math.abs(f10 - z6Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - z6Var.f0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.q0) {
            return 2;
        }
        if (Math.abs(f10 - z6Var.e0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - z6Var.f0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        z6 z6Var = this.p;
        if (!z6Var.b() && !z6Var.q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (z6Var.b() || z6Var.q0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i9, int i10) {
        z6 z6Var = this.p;
        if (z6Var.a != null && !z6Var.q0 && i10 == 16) {
            if (i9 != 0) {
                if (i9 == 1) {
                    if (z6Var.b()) {
                        ((ra) z6Var.a).a();
                        return true;
                    }
                    if (z6Var.n0) {
                        z6Var.n0 = false;
                        z6Var.v0 = false;
                        z6Var.r0 = SystemClock.elapsedRealtime();
                        z6Var.q0 = true;
                        ((ra) z6Var.a).d(false);
                        z6Var.invalidate();
                        return true;
                    }
                    if (!z6Var.k0) {
                        ((ra) z6Var.a).c();
                        return true;
                    }
                    if (wb.d(((ra) z6Var.a).a)) {
                        z6Var.N = 0L;
                        z6Var.M = System.currentTimeMillis();
                        z6Var.w0 = false;
                        ((ra) z6Var.a).e(new f1(this, 9), false);
                        return true;
                    }
                    return true;
                }
                if (i9 == 2 && !z6Var.b()) {
                    z6Var.d(180.0f);
                    ((ra) z6Var.a).b();
                    return true;
                }
            } else if (!z6Var.b()) {
                if (!z6Var.n0 || !z6Var.w0) {
                    wb wbVar = ((ra) z6Var.a).a;
                    if (wbVar.b0 == 0 && !wbVar.L1 && !wbVar.M1 && wb.b(wbVar)) {
                        wbVar.f(true);
                    }
                    return true;
                }
                z6Var.v0 = false;
                z6Var.C0.d(1.0f, true);
                v3 v3Var = ((ra) z6Var.a).a.P0;
                v3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                v3Var.invalidate();
                z6Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i9, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.o;
        z6 z6Var = this.p;
        if (i9 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = z6Var.g0;
            float f11 = dp;
            float f12 = z6Var.f0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            dVar.h(rect);
            dVar.j((z6Var.n0 && z6Var.w0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!z6Var.q0 && !z6Var.b()) {
                z10 = true;
            }
            accessibilityNodeInfo.setEnabled(z10);
            if (z10) {
                dVar.b(s0.c.c);
                return;
            }
            return;
        }
        if (i9 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f13 = z6Var.e0;
            float f14 = dp2;
            float f15 = z6Var.f0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            dVar.h(rect);
            dVar.j(z6Var.b() ? LocaleController.getString(R.string.Send) : z6Var.n0 ? LocaleController.getString(R.string.AccDescrStopRecording) : z6Var.k0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!z6Var.q0);
            if (z6Var.q0) {
                return;
            }
            dVar.b(s0.c.c);
            return;
        }
        if (i9 != 2) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            dVar.j("");
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f16 = z6Var.h0;
        float f17 = dp3;
        float f18 = z6Var.f0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!z6Var.q0 && !z6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.c);
        }
    }
}
