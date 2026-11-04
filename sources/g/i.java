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
import m.r3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements r0.m, l.w {
    public final /* synthetic */ s a;

    public /* synthetic */ i(s sVar) {
        this.a = sVar;
    }

    @Override // l.w
    public boolean E(l.k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        s sVar = this.a;
        if (!sVar.P || (callback = sVar.f.getCallback()) == null || sVar.a0) {
            return true;
        }
        callback.onMenuOpened(hs.t1, kVar);
        return true;
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        boolean z10;
        boolean z11;
        int d = k1Var.d();
        s sVar = this.a;
        Context context = sVar.e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = sVar.E;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.E.getLayoutParams();
            if (sVar.E.isShown()) {
                if (sVar.m0 == null) {
                    sVar.m0 = new Rect();
                    sVar.n0 = new Rect();
                }
                Rect rect = sVar.m0;
                Rect rect2 = sVar.n0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = sVar.K;
                Method method = r3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i3 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = sVar.K;
                WeakHashMap weakHashMap = i0.a;
                k1 a10 = r0.b0.a(viewGroup2);
                int b10 = a10 == null ? 0 : a10.b();
                int c2 = a10 == null ? 0 : a10.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z11 = true;
                }
                if (i3 <= 0 || sVar.M != null) {
                    View view2 = sVar.M;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c2;
                            sVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sVar.M = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c2;
                    sVar.K.addView(sVar.M, -1, layoutParams);
                }
                View view4 = sVar.M;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = sVar.M;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & TLObject.FLAG_13) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!sVar.R && r9) {
                    d10 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                sVar.E.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sVar.M;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.g(view, d != d10 ? k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a()) : k1Var);
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
        r rVar;
        l.k k10 = kVar.k();
        int i3 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        s sVar = this.a;
        r[] rVarArr = sVar.V;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i3 < length) {
                rVar = rVarArr[i3];
                if (rVar != null && rVar.h == kVar) {
                    break;
                } else {
                    i3++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z11) {
                sVar.i(rVar, z10);
            } else {
                sVar.g(rVar.a, rVar, k10);
                sVar.i(rVar, true);
            }
        }
    }
}
