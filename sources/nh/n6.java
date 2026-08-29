package nh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n6 extends j1.b {
    public final Rect o;
    public final /* synthetic */ o6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, o6 o6Var2) {
        super(o6Var2);
        this.p = o6Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f9, float f10) {
        o6 o6Var = this.p;
        if (Math.abs(f9 - o6Var.g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - o6Var.f0) <= AndroidUtilities.dp(30.0f) && !o6Var.b() && !o6Var.q0) {
            return 0;
        }
        if (Math.abs(f9 - o6Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - o6Var.f0) <= AndroidUtilities.dp(30.0f) && !o6Var.b() && !o6Var.q0) {
            return 2;
        }
        if (Math.abs(f9 - o6Var.e0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - o6Var.f0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        o6 o6Var = this.p;
        if (!o6Var.b() && !o6Var.q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (o6Var.b() || o6Var.q0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        o6 o6Var = this.p;
        if (o6Var.a != null && !o6Var.q0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (o6Var.b()) {
                        ((ca) o6Var.a).a();
                        return true;
                    }
                    if (o6Var.n0) {
                        o6Var.n0 = false;
                        o6Var.v0 = false;
                        o6Var.r0 = SystemClock.elapsedRealtime();
                        o6Var.q0 = true;
                        ((ca) o6Var.a).d(false);
                        o6Var.invalidate();
                        return true;
                    }
                    if (!o6Var.k0) {
                        ((ca) o6Var.a).c();
                        return true;
                    }
                    if (gb.d(((ca) o6Var.a).a)) {
                        o6Var.N = 0L;
                        o6Var.M = System.currentTimeMillis();
                        o6Var.w0 = false;
                        ((ca) o6Var.a).e(new m6(this, 0), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !o6Var.b()) {
                    o6Var.d(180.0f);
                    ((ca) o6Var.a).b();
                    return true;
                }
            } else if (!o6Var.b()) {
                if (!o6Var.n0 || !o6Var.w0) {
                    gb gbVar = ((ca) o6Var.a).a;
                    if (gbVar.b0 == 0 && !gbVar.L1 && !gbVar.M1 && gb.b(gbVar)) {
                        gbVar.f(true);
                    }
                    return true;
                }
                o6Var.v0 = false;
                o6Var.C0.d(1.0f, true);
                s3 s3Var = ((ca) o6Var.a).a.P0;
                s3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                s3Var.invalidate();
                o6Var.invalidate();
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
        o6 o6Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f9 = o6Var.g0;
            float f10 = dp;
            float f11 = o6Var.f0;
            rect.set((int) (f9 - f10), (int) (f11 - f10), (int) (f9 + f10), (int) (f11 + f10));
            cVar.h(rect);
            cVar.j((o6Var.n0 && o6Var.w0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!o6Var.q0 && !o6Var.b()) {
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
            float f12 = o6Var.e0;
            float f13 = dp2;
            float f14 = o6Var.f0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            cVar.j(o6Var.b() ? LocaleController.getString(R.string.Send) : o6Var.n0 ? LocaleController.getString(R.string.AccDescrStopRecording) : o6Var.k0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!o6Var.q0);
            if (o6Var.q0) {
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
        float f15 = o6Var.h0;
        float f16 = dp3;
        float f17 = o6Var.f0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!o6Var.q0 && !o6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.c);
        }
    }
}
