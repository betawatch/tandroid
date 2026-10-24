package ei;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public final int g(float f7, float f10) {
        z6 z6Var = this.p;
        if (Math.abs(f7 - z6Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - z6Var.j0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - z6Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - z6Var.j0) <= AndroidUtilities.dp(30.0f) && !z6Var.b() && !z6Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - z6Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - z6Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        z6 z6Var = this.p;
        if (!z6Var.b() && !z6Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (z6Var.b() || z6Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        z6 z6Var = this.p;
        if (z6Var.a != null && !z6Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (z6Var.b()) {
                        ((qa) z6Var.a).a();
                        return true;
                    }
                    if (z6Var.r0) {
                        z6Var.r0 = false;
                        z6Var.z0 = false;
                        z6Var.v0 = SystemClock.elapsedRealtime();
                        z6Var.u0 = true;
                        ((qa) z6Var.a).e(false);
                        z6Var.invalidate();
                        return true;
                    }
                    if (!z6Var.o0) {
                        ((qa) z6Var.a).d();
                        return true;
                    }
                    if (vb.c(((qa) z6Var.a).a)) {
                        z6Var.R = 0L;
                        z6Var.Q = System.currentTimeMillis();
                        z6Var.A0 = false;
                        ((qa) z6Var.a).f(new com.google.firebase.messaging.s(this, 19), false);
                    }
                    return true;
                }
                if (i10 == 2 && !z6Var.b()) {
                    z6Var.d(180.0f);
                    ((qa) z6Var.a).b();
                    return true;
                }
            } else if (!z6Var.b()) {
                if (!z6Var.r0 || !z6Var.A0) {
                    ((qa) z6Var.a).c();
                    return true;
                }
                z6Var.z0 = false;
                z6Var.G0.d(1.0f, true);
                v3 v3Var = ((qa) z6Var.a).a.T0;
                v3Var.a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                v3Var.invalidate();
                z6Var.invalidate();
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
        z6 z6Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = z6Var.k0;
            float f10 = dp;
            float f11 = z6Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            dVar.h(rect);
            dVar.j((z6Var.r0 && z6Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!z6Var.u0 && !z6Var.b()) {
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
            float f12 = z6Var.i0;
            float f13 = dp2;
            float f14 = z6Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            dVar.j(z6Var.b() ? LocaleController.getString(R.string.Send) : z6Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : z6Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!z6Var.u0);
            if (z6Var.u0) {
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
        float f15 = z6Var.l0;
        float f16 = dp3;
        float f17 = z6Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!z6Var.u0 && !z6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.c);
        }
    }
}
