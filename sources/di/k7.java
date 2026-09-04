package di;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k7 extends j1.b {
    public final Rect o;
    public final /* synthetic */ l7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(l7 l7Var, l7 l7Var2) {
        super(l7Var2);
        this.p = l7Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        l7 l7Var = this.p;
        if (Math.abs(f7 - l7Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - l7Var.j0) <= AndroidUtilities.dp(30.0f) && !l7Var.b() && !l7Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - l7Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - l7Var.j0) <= AndroidUtilities.dp(30.0f) && !l7Var.b() && !l7Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - l7Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - l7Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        l7 l7Var = this.p;
        if (!l7Var.b() && !l7Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (l7Var.b() || l7Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        l7 l7Var = this.p;
        if (l7Var.a != null && !l7Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (l7Var.b()) {
                        ((jb) l7Var.a).a();
                        return true;
                    }
                    if (l7Var.r0) {
                        l7Var.r0 = false;
                        l7Var.z0 = false;
                        l7Var.v0 = SystemClock.elapsedRealtime();
                        l7Var.u0 = true;
                        ((jb) l7Var.a).d(false);
                        l7Var.invalidate();
                        return true;
                    }
                    if (!l7Var.o0) {
                        ((jb) l7Var.a).c();
                        return true;
                    }
                    if (pc.d(((jb) l7Var.a).a)) {
                        l7Var.R = 0L;
                        l7Var.Q = System.currentTimeMillis();
                        l7Var.A0 = false;
                        ((jb) l7Var.a).e(new bi.oa(this, 25), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !l7Var.b()) {
                    l7Var.d(180.0f);
                    ((jb) l7Var.a).b();
                    return true;
                }
            } else if (!l7Var.b()) {
                if (!l7Var.r0 || !l7Var.A0) {
                    pc pcVar = ((jb) l7Var.a).a;
                    if (pcVar.f0 == 0 && !pcVar.P1 && !pcVar.Q1 && pc.b(pcVar)) {
                        pcVar.f(true);
                    }
                    return true;
                }
                l7Var.z0 = false;
                l7Var.G0.d(1.0f, true);
                c4 c4Var = ((jb) l7Var.a).a.T0;
                c4Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                c4Var.invalidate();
                l7Var.invalidate();
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
        l7 l7Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = l7Var.k0;
            float f10 = dp;
            float f11 = l7Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            cVar.h(rect);
            cVar.j((l7Var.r0 && l7Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!l7Var.u0 && !l7Var.b()) {
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
            float f12 = l7Var.i0;
            float f13 = dp2;
            float f14 = l7Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            cVar.h(rect);
            cVar.j(l7Var.b() ? LocaleController.getString(R.string.Send) : l7Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : l7Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!l7Var.u0);
            if (l7Var.u0) {
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
        float f15 = l7Var.l0;
        float f16 = dp3;
        float f17 = l7Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        cVar.h(rect);
        cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!l7Var.u0 && !l7Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.c);
        }
    }
}
