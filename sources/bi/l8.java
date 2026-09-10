package bi;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l8 extends j1.b {
    public final Rect o;
    public final /* synthetic */ m8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(m8 m8Var, m8 m8Var2) {
        super(m8Var2);
        this.p = m8Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        m8 m8Var = this.p;
        if (Math.abs(f7 - m8Var.k0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - m8Var.j0) <= AndroidUtilities.dp(30.0f) && !m8Var.b() && !m8Var.u0) {
            return 0;
        }
        if (Math.abs(f7 - m8Var.l0) <= AndroidUtilities.dp(30.0f) && Math.abs(f10 - m8Var.j0) <= AndroidUtilities.dp(30.0f) && !m8Var.b() && !m8Var.u0) {
            return 2;
        }
        if (Math.abs(f7 - m8Var.i0) > AndroidUtilities.dp(60.0f) || Math.abs(f10 - m8Var.j0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        m8 m8Var = this.p;
        if (!m8Var.b() && !m8Var.u0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (m8Var.b() || m8Var.u0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        m8 m8Var = this.p;
        if (m8Var.a != null && !m8Var.u0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (m8Var.b()) {
                        ((sc) m8Var.a).a();
                        return true;
                    }
                    if (m8Var.r0) {
                        m8Var.r0 = false;
                        m8Var.z0 = false;
                        m8Var.v0 = SystemClock.elapsedRealtime();
                        m8Var.u0 = true;
                        ((sc) m8Var.a).d(false);
                        m8Var.invalidate();
                        return true;
                    }
                    if (!m8Var.o0) {
                        ((sc) m8Var.a).c();
                        return true;
                    }
                    if (ce.d(((sc) m8Var.a).a)) {
                        m8Var.R = 0L;
                        m8Var.Q = System.currentTimeMillis();
                        m8Var.A0 = false;
                        ((sc) m8Var.a).e(new a3.d(this, 25), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !m8Var.b()) {
                    m8Var.d(180.0f);
                    ((sc) m8Var.a).b();
                    return true;
                }
            } else if (!m8Var.b()) {
                if (!m8Var.r0 || !m8Var.A0) {
                    ce ceVar = ((sc) m8Var.a).a;
                    if (ceVar.f0 == 0 && !ceVar.P1 && !ceVar.Q1 && ce.b(ceVar)) {
                        ceVar.f(true);
                    }
                    return true;
                }
                m8Var.z0 = false;
                m8Var.G0.d(1.0f, true);
                u4 u4Var = ((sc) m8Var.a).a.T0;
                u4Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                u4Var.invalidate();
                m8Var.invalidate();
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
        m8 m8Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f7 = m8Var.k0;
            float f10 = dp;
            float f11 = m8Var.j0;
            rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
            dVar.h(rect);
            dVar.j((m8Var.r0 && m8Var.A0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!m8Var.u0 && !m8Var.b()) {
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
            float f12 = m8Var.i0;
            float f13 = dp2;
            float f14 = m8Var.j0;
            rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
            dVar.h(rect);
            dVar.j(m8Var.b() ? LocaleController.getString(R.string.Send) : m8Var.r0 ? LocaleController.getString(R.string.AccDescrStopRecording) : m8Var.o0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!m8Var.u0);
            if (m8Var.u0) {
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
        float f15 = m8Var.l0;
        float f16 = dp3;
        float f17 = m8Var.j0;
        rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
        dVar.h(rect);
        dVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!m8Var.u0 && !m8Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            dVar.b(s0.c.c);
        }
    }
}
