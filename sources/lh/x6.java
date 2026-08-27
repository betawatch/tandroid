package lh;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x6 extends j1.b {
    public final Rect o;
    public final /* synthetic */ y6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var, y6 y6Var2) {
        super(y6Var2);
        this.p = y6Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        y6 y6Var = this.p;
        if (Math.abs(f10 - y6Var.g0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - y6Var.f0) <= AndroidUtilities.dp(30.0f) && !y6Var.b() && !y6Var.q0) {
            return 0;
        }
        if (Math.abs(f10 - y6Var.h0) <= AndroidUtilities.dp(30.0f) && Math.abs(f11 - y6Var.f0) <= AndroidUtilities.dp(30.0f) && !y6Var.b() && !y6Var.q0) {
            return 2;
        }
        if (Math.abs(f10 - y6Var.e0) > AndroidUtilities.dp(60.0f) || Math.abs(f11 - y6Var.f0) > AndroidUtilities.dp(60.0f)) {
            return TLObject.FLAG_31;
        }
        return 1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        y6 y6Var = this.p;
        if (!y6Var.b() && !y6Var.q0) {
            arrayList.add(0);
        }
        arrayList.add(1);
        if (y6Var.b() || y6Var.q0) {
            return;
        }
        arrayList.add(2);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        y6 y6Var = this.p;
        if (y6Var.a != null && !y6Var.q0 && i11 == 16) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (y6Var.b()) {
                        ((oa) y6Var.a).a();
                        return true;
                    }
                    if (y6Var.n0) {
                        y6Var.n0 = false;
                        y6Var.v0 = false;
                        y6Var.r0 = SystemClock.elapsedRealtime();
                        y6Var.q0 = true;
                        ((oa) y6Var.a).d(false);
                        y6Var.invalidate();
                        return true;
                    }
                    if (!y6Var.k0) {
                        ((oa) y6Var.a).c();
                        return true;
                    }
                    if (sb.d(((oa) y6Var.a).a)) {
                        y6Var.N = 0L;
                        y6Var.M = System.currentTimeMillis();
                        y6Var.w0 = false;
                        ((oa) y6Var.a).e(new kh.c(this, 16), false);
                        return true;
                    }
                    return true;
                }
                if (i10 == 2 && !y6Var.b()) {
                    y6Var.d(180.0f);
                    ((oa) y6Var.a).b();
                    return true;
                }
            } else if (!y6Var.b()) {
                if (!y6Var.n0 || !y6Var.w0) {
                    sb sbVar = ((oa) y6Var.a).a;
                    if (sbVar.b0 == 0 && !sbVar.L1 && !sbVar.M1 && sb.b(sbVar)) {
                        sbVar.f(true);
                    }
                    return true;
                }
                y6Var.v0 = false;
                y6Var.C0.d(1.0f, true);
                u3 u3Var = ((oa) y6Var.a).a.P0;
                u3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                u3Var.invalidate();
                y6Var.invalidate();
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
        y6 y6Var = this.p;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(22.0f);
            float f10 = y6Var.g0;
            float f11 = dp;
            float f12 = y6Var.f0;
            rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
            cVar.h(rect);
            cVar.j((y6Var.n0 && y6Var.w0) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
            if (!y6Var.q0 && !y6Var.b()) {
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
            float f13 = y6Var.e0;
            float f14 = dp2;
            float f15 = y6Var.f0;
            rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
            cVar.h(rect);
            cVar.j(y6Var.b() ? LocaleController.getString(R.string.Send) : y6Var.n0 ? LocaleController.getString(R.string.AccDescrStopRecording) : y6Var.k0 ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto));
            accessibilityNodeInfo.setEnabled(!y6Var.q0);
            if (y6Var.q0) {
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
        float f16 = y6Var.h0;
        float f17 = dp3;
        float f18 = y6Var.f0;
        rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
        cVar.h(rect);
        cVar.j(LocaleController.getString(R.string.AccDescrSwitchCamera));
        if (!y6Var.q0 && !y6Var.b()) {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (z10) {
            cVar.b(s0.b.c);
        }
    }
}
