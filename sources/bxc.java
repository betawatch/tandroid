// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bxc implements View.OnApplyWindowInsetsListener {
    public final twc a;
    public vxc b;

    public bxc(FrameLayout frameLayout, twc twcVar) {
        vxc vxcVar;
        this.a = twcVar;
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(frameLayout);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            vxcVar = (i >= 34 ? new kxc(a) : i >= 30 ? new jxc(a) : i >= 29 ? new ixc(a) : new hxc(a)).b();
        } else {
            vxcVar = null;
        }
        this.b = vxcVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = vxc.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        vxc h = vxc.h(view, windowInsets);
        sxc sxcVar = h.a;
        vxc vxcVar = this.b;
        if (vxcVar == null) {
            WeakHashMap weakHashMap = jdc.a;
            vxcVar = cdc.a(view);
            this.b = vxcVar;
        }
        if (vxcVar == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            twc i = cxc.i(view);
            if (i == null || !Objects.equals(i.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                vxc vxcVar2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    io5 f = sxcVar.f(i2);
                    io5 f2 = vxcVar2.a.f(i2);
                    int i3 = f.a;
                    int i4 = f.d;
                    int i5 = f.c;
                    int i6 = f.b;
                    int i7 = f2.a;
                    int i8 = f2.d;
                    int i9 = f2.c;
                    int i10 = f2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr2;
                        z = true;
                    } else {
                        iArr = iArr2;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr[0] = iArr[0] | i2;
                        } else {
                            iArr3[0] = iArr3[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr;
                }
                boolean z2 = false;
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    vxc vxcVar3 = this.b;
                    gxc gxcVar = new gxc(i13, (i11 & 8) != 0 ? cxc.e : (i12 & 8) != 0 ? cxc.f : (i11 & 519) != 0 ? cxc.g : (i12 & 519) != 0 ? cxc.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    gxcVar.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(gxcVar.a.a());
                    io5 f3 = sxcVar.f(i13);
                    io5 f4 = vxcVar3.a.f(i13);
                    int min = Math.min(f3.a, f4.a);
                    int i14 = f3.b;
                    int i15 = f4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = f3.c;
                    int i17 = f4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = f3.d;
                    int i19 = f4.d;
                    v8b v8bVar = new v8b(io5.b(min, min2, min3, Math.min(i18, i19)), io5.b(Math.max(f3.a, f4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)), z2, (byte) 7);
                    cxc.f(view, h, false);
                    duration.addUpdateListener(new axc(gxcVar, h, vxcVar3, i13, view));
                    duration.addListener(new eh8((Object) gxcVar, view, (byte) 24));
                    ey1 ey1Var = new ey1(view, gxcVar, v8bVar, duration);
                    if (view != null) {
                        kq7 kq7Var = new kq7(view, ey1Var);
                        view.getViewTreeObserver().addOnPreDrawListener(kq7Var);
                        view.addOnAttachStateChangeListener(kq7Var);
                    } else {
                        fvc.f("view == null");
                    }
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
