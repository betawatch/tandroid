// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class czc implements View.OnApplyWindowInsetsListener {
    public final uyc a;
    public wzc b;

    public czc(FrameLayout frameLayout, uyc uycVar) {
        wzc wzcVar;
        this.a = uycVar;
        WeakHashMap weakHashMap = kfc.a;
        wzc a = dfc.a(frameLayout);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            wzcVar = (i >= 34 ? new lzc(a) : i >= 30 ? new kzc(a) : i >= 29 ? new jzc(a) : new izc(a)).b();
        } else {
            wzcVar = null;
        }
        this.b = wzcVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = wzc.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        wzc h = wzc.h(view, windowInsets);
        tzc tzcVar = h.a;
        wzc wzcVar = this.b;
        if (wzcVar == null) {
            WeakHashMap weakHashMap = kfc.a;
            wzcVar = dfc.a(view);
            this.b = wzcVar;
        }
        if (wzcVar == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            uyc i = dzc.i(view);
            if (i == null || !Objects.equals(i.a, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                wzc wzcVar2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    iq5 f = tzcVar.f(i2);
                    iq5 f2 = wzcVar2.a.f(i2);
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
                    wzc wzcVar3 = this.b;
                    hzc hzcVar = new hzc(i13, (i11 & 8) != 0 ? dzc.e : (i12 & 8) != 0 ? dzc.f : (i11 & 519) != 0 ? dzc.g : (i12 & 519) != 0 ? dzc.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    hzcVar.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(hzcVar.a.a());
                    iq5 f3 = tzcVar.f(i13);
                    iq5 f4 = wzcVar3.a.f(i13);
                    int min = Math.min(f3.a, f4.a);
                    int i14 = f3.b;
                    int i15 = f4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = f3.c;
                    int i17 = f4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = f3.d;
                    int i19 = f4.d;
                    xab xabVar = new xab(iq5.b(min, min2, min3, Math.min(i18, i19)), iq5.b(Math.max(f3.a, f4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)), z2, (byte) 7);
                    dzc.f(view, h, false);
                    duration.addUpdateListener(new bzc(hzcVar, h, wzcVar3, i13, view));
                    duration.addListener(new ic8((Object) hzcVar, view, (byte) 25));
                    rz1 rz1Var = new rz1(view, hzcVar, xabVar, duration);
                    if (view != null) {
                        ns7 ns7Var = new ns7(view, rz1Var);
                        view.getViewTreeObserver().addOnPreDrawListener(ns7Var);
                        view.addOnAttachStateChangeListener(ns7Var);
                    } else {
                        gxc.d("view == null");
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
