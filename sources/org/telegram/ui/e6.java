package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements e80, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.jl0 {
    public final /* synthetic */ b7 a;

    public /* synthetic */ e6(b7 b7Var) {
        this.a = b7Var;
    }

    @Override // org.telegram.ui.e80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.a.b);
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        b7 b7Var = this.a;
        ArrayList arrayList = b7Var.X;
        if (b7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = w6Var.f;
                if (i12 < 0) {
                    b7Var.J = !b7Var.J;
                    b7Var.w0(true);
                    b7Var.v0();
                    return;
                }
                boolean[] zArr = b7Var.e;
                if (i12 < 0) {
                    b7Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && b7Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = w6Var.f;
                boolean z4 = !zArr[i15];
                zArr[i15] = z4;
                ((org.telegram.ui.Cells.z1) view).c(z4, true);
                if (w6Var.i) {
                    while (true) {
                        if (i11 >= b7Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = b7Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            b7Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((w6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(b7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                b7Var.v0();
                return;
            }
            if (w6Var.c >= 0) {
                g80 g80Var = new g80(view.getContext(), b7Var);
                org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.z4.Q(b7Var, g80Var, view, f10, f11);
                int i16 = ((w6) arrayList.get(i10)).c;
                g80Var.W = i16;
                FrameLayout frameLayout = g80Var.e0;
                org.telegram.ui.ActionBar.g1 g1Var = g80Var.S;
                org.telegram.ui.ActionBar.g1 g1Var2 = g80Var.T;
                org.telegram.ui.Components.e90 e90Var = g80Var.Q;
                org.telegram.ui.Components.k00 k00Var = g80Var.V;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    k00Var.setVisibility(8);
                    e90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    k00Var.setVisibility(0);
                    e90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = g80Var.a0.getKeepMediaExceptions(i16);
                g80Var.c0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.p2 p2Var = g80Var.d0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) k00Var.c;
                    org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) k00Var.d;
                    k5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.k5) k00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    d9Var.b(0, null, p2Var.getCurrentAccount());
                    d9Var.b(1, null, p2Var.getCurrentAccount());
                    d9Var.b(2, null, p2Var.getCurrentAccount());
                    d9Var.a(false);
                } else {
                    int min = Math.min(3, g80Var.c0.size());
                    org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) k00Var.c;
                    org.telegram.ui.Components.d9 d9Var2 = (org.telegram.ui.Components.d9) k00Var.d;
                    k5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.k5) k00Var.c).l(LocaleController.formatPluralString("ExceptionShort", g80Var.c0.size(), Integer.valueOf(g80Var.c0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        d9Var2.b(i17, p2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) g80Var.c0.get(i17)).dialogId), p2Var.getCurrentAccount());
                    }
                    d9Var2.a(false);
                }
                g80Var.R.setVisibility(8);
                e90Var.setVisibility(8);
                g80Var.f();
                g80Var.setParentWindow(Q);
                g80Var.setCallback(new e6(b7Var));
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        b7 b7Var = this.a;
        mh.b bVar = b7Var.V;
        LongSparseArray longSparseArray = bVar.c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            mh.a aVar = (mh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(u6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (u6Var.c > 0) {
            b7Var.l0(u6Var, null, null);
        }
        b7Var.V.d();
        y6 y6Var = b7Var.K;
        if (y6Var != null) {
            y6Var.c();
            b7Var.K.e(false);
        }
        b7Var.w0(true);
        b7Var.v0();
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
