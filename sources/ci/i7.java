package ci;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class i7 extends j1.b {
    public final Rect o;
    public final /* synthetic */ j7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(j7 j7Var, j7 j7Var2) {
        super(j7Var2);
        this.p = j7Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        j7 j7Var = this.p;
        if (Math.abs(f7 - j7Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - j7Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - j7Var.j0) <= AndroidUtilities.dp(30.0f) && !j7Var.b() && !j7Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - j7Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - j7Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        j7 j7Var = this.p;
        if (!j7Var.b() && !j7Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (j7Var.b() || j7Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        j7 j7Var = this.p;
        if (j7Var.a != null && !j7Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (j7Var.b()) {
                        ((gb) j7Var.a).a();
                        return true;
                    }
                    if (j7Var.r0) {
                        j7Var.r0 = false;
                        j7Var.z0 = false;
                        j7Var.v0 = SystemClock.elapsedRealtime();
                        j7Var.u0 = true;
                        ((gb) j7Var.a).d(false);
                        j7Var.invalidate();
                        return true;
                    }
                    if (!j7Var.o0) {
                        ((gb) j7Var.a).c();
                        return true;
                    }
                    if (lc.d(((gb) j7Var.a).a)) {
                        j7Var.R = 0L;
                        j7Var.Q = System.currentTimeMillis();
                        j7Var.A0 = false;
                        ((gb) j7Var.a).e(new androidx.fragment.app.a0(this, 19), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !j7Var.b()) {
                    j7Var.d(180.0f);
                    ((gb) j7Var.a).b();
                    return true;
                }
            } else if (!j7Var.b()) {
                if (!j7Var.r0 || !j7Var.A0) {
                    lc lcVar = ((gb) j7Var.a).a;
                    if (lcVar.f0 == 0 && !lcVar.P1 && !lcVar.Q1 && lc.b(lcVar)) {
                        lcVar.f(true);
                    }
                    return true;
                }
                j7Var.z0 = false;
                j7Var.G0.d(1.0f, true);
                b4 b4Var = ((gb) j7Var.a).a.T0;
                b4Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                b4Var.invalidate();
                j7Var.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        dVar.i("android.widget.Button");
        boolean z10 = false;
        Rect rect = this.o;
        j7 j7Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = j7Var.k0;
            float f10 = dp;
            float f11 = j7Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            dVar.h(rect);
            dVar.j((j7Var.r0 && j7Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!j7Var.u0 && !j7Var.b()) {
                z10 = true;
            }
            accessibilityNodeInfo.setEnabled(z10);
            if (z10) {
                dVar.b(s0.c.c);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = j7Var.i0;
            float f13 = dp2;
            float f14 = j7Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            dVar.j(j7Var.b() ? LocaleController.getString(R.string.Send) : j7Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : j7Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!j7Var.u0);
            if (j7Var.u0) {
                return;
            }
            dVar.b(s0.c.c);
            return;
        }
        if (i10 != 2) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            dVar.j("");
            return;
        }
        int dp3 = AndroidUtilities.dp(22.0f);
        float f15 = j7Var.l0;
        float f16 = dp3;
        float f17 = j7Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!j7Var.u0 && !j7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.c);
        }
    }
}
