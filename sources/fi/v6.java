package fi;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v6 extends j1.b {
    public final Rect o;
    public final /* synthetic */ w6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, w6 w6Var2) {
        super(w6Var2);
        this.p = w6Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        w6 w6Var = this.p;
        if (Math.abs(f7 - w6Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - w6Var.j0) <= AndroidUtilities.dp(30.0f) && !w6Var.b() && !w6Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - w6Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - w6Var.j0) <= AndroidUtilities.dp(30.0f) && !w6Var.b() && !w6Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - w6Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - w6Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        w6 w6Var = this.p;
        if (!w6Var.b() && !w6Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (w6Var.b() || w6Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        w6 w6Var = this.p;
        if (w6Var.a != null && !w6Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (w6Var.b()) {
                        ((ma) w6Var.a).a();
                        return true;
                    }
                    if (w6Var.r0) {
                        w6Var.r0 = false;
                        w6Var.z0 = false;
                        w6Var.v0 = SystemClock.elapsedRealtime();
                        w6Var.u0 = true;
                        ((ma) w6Var.a).e(false);
                        w6Var.invalidate();
                        return true;
                    }
                    if (!w6Var.o0) {
                        ((ma) w6Var.a).d();
                        return true;
                    }
                    if (sb.c(((ma) w6Var.a).a)) {
                        w6Var.R = 0L;
                        w6Var.Q = System.currentTimeMillis();
                        w6Var.A0 = false;
                        ((ma) w6Var.a).f(new di.s8(this, 23), false);
                    }
                    return true;
                }
                if (i10 == 2 && !w6Var.b()) {
                    w6Var.d(180.0f);
                    ((ma) w6Var.a).b();
                    return true;
                }
            } else if (!w6Var.b()) {
                if (!w6Var.r0 || !w6Var.A0) {
                    ((ma) w6Var.a).c();
                    return true;
                }
                w6Var.z0 = false;
                w6Var.G0.d(1.0f, true);
                t3 t3Var = ((ma) w6Var.a).a.T0;
                t3Var.a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                t3Var.invalidate();
                w6Var.invalidate();
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
        w6 w6Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = w6Var.k0;
            float f10 = dp;
            float f11 = w6Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            dVar.h(rect);
            dVar.j((w6Var.r0 && w6Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!w6Var.u0 && !w6Var.b()) {
                z10 = true;
            }
            accessibilityNodeInfo.setEnabled(z10);
            if (z10) {
                dVar.b(s0.c.e);
                return;
            }
            return;
        }
        if (i10 == 1) {
            int dp2 = AndroidUtilities.dp(40.0f);
            float f12 = w6Var.i0;
            float f13 = dp2;
            float f14 = w6Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            dVar.j(w6Var.b() ? LocaleController.getString(R.string.Send) : w6Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : w6Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!w6Var.u0);
            if (w6Var.u0) {
                return;
            }
            dVar.b(s0.c.e);
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
        float f15 = w6Var.l0;
        float f16 = dp3;
        float f17 = w6Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!w6Var.u0 && !w6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.e);
        }
    }
}
