package g;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.t3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.k1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i implements r0.m, l.w {
    public final /* synthetic */ s a;

    public /* synthetic */ i(s sVar) {
        this.a = sVar;
    }

    @Override // l.w
    public boolean A(l.k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        s sVar = this.a;
        if (!sVar.O || (callback = sVar.f.getCallback()) == null || sVar.Z) {
            return true;
        }
        callback.onMenuOpened(qs.t1, kVar);
        return true;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        boolean z9;
        boolean z10;
        int d = k1Var.d();
        s sVar = this.a;
        Context context = sVar.e;
        int d2 = k1Var.d();
        ActionBarContextView actionBarContextView = sVar.D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.D.getLayoutParams();
            if (sVar.D.isShown()) {
                if (sVar.l0 == null) {
                    sVar.l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.l0;
                Rect rect2 = sVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = t3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i7 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = sVar.J;
                WeakHashMap weakHashMap = i0.a;
                k1 a10 = r0.b0.a(viewGroup2);
                int b10 = a10 == null ? 0 : a10.b();
                int c10 = a10 == null ? 0 : a10.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                if (i7 <= 0 || sVar.L != null) {
                    View view2 = sVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                }
                View view4 = sVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & TLObject.FLAG_13) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!sVar.Q && r9) {
                    d2 = 0;
                }
                z9 = r9;
                r9 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                r9 = false;
            }
            if (r9) {
                sVar.D.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sVar.L;
        if (view6 != null) {
            view6.setVisibility(z9 ? 0 : 8);
        }
        return i0.g(view, d != d2 ? k1Var.f(k1Var.b(), d2, k1Var.c(), k1Var.a()) : k1Var);
    }

    @Override // l.w
    public void c(l.k kVar, boolean z9) {
        r rVar;
        l.k k10 = kVar.k();
        int i7 = 0;
        boolean z10 = k10 != kVar;
        if (z10) {
            kVar = k10;
        }
        s sVar = this.a;
        r[] rVarArr = sVar.U;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i7 < length) {
                rVar = rVarArr[i7];
                if (rVar != null && rVar.h == kVar) {
                    break;
                } else {
                    i7++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z10) {
                sVar.h(rVar, z9);
            } else {
                sVar.f(rVar.a, rVar, k10);
                sVar.h(rVar, true);
            }
        }
    }
}
