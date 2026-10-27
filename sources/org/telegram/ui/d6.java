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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements oe.d, a80, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.iw0, org.telegram.ui.Components.bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ d6(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        switch (this.a) {
            case 0:
                c7 c7Var = this.b;
                c7Var.v0();
                c7Var.fragmentView.invalidate();
                break;
            default:
                c7.W(this.b, f7);
                break;
        }
    }

    @Override // org.telegram.ui.a80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.b.b);
    }

    @Override // org.telegram.ui.Components.iw0
    public int c() {
        return this.b.R;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        c7 c7Var = this.b;
        ArrayList arrayList = c7Var.g0;
        if (c7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            y6 y6Var = (y6) arrayList.get(i10);
            int i11 = 0;
            int i12 = 1;
            if (y6Var.a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i13 = y6Var.f;
                if (i13 < 0) {
                    c7Var.L = !c7Var.L;
                    c7Var.w0(true);
                    c7Var.u0();
                    return;
                }
                boolean[] zArr = c7Var.d;
                if (i13 < 0) {
                    c7Var.t0(view);
                    return;
                }
                if (zArr[i13]) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < 10; i15++) {
                        if (zArr[i15] && c7Var.s0(i15) > 0) {
                            i14++;
                        }
                    }
                    if (i14 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i16 = y6Var.f;
                boolean z10 = !zArr[i16];
                zArr[i16] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (y6Var.i) {
                    while (true) {
                        if (i11 >= c7Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = c7Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            c7Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((y6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(c7Var.p0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                c7Var.u0();
                return;
            }
            if (y6Var.c >= 0) {
                d80 d80Var = new d80(view.getContext(), c7Var);
                org.telegram.ui.ActionBar.o1 P = org.telegram.ui.Components.g5.P(c7Var, d80Var, view, f7, f10);
                int i17 = ((y6) arrayList.get(i10)).c;
                d80Var.c0 = i17;
                FrameLayout frameLayout = d80Var.h0;
                org.telegram.ui.ActionBar.g1 g1Var = d80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = d80Var.W;
                org.telegram.ui.Components.aa0 aa0Var = d80Var.T;
                c80 c80Var = d80Var.b0;
                if (i17 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c80Var.setVisibility(8);
                    aa0Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c80Var.setVisibility(0);
                    aa0Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = d80Var.d0.getKeepMediaExceptions(i17);
                d80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.r2 r2Var = d80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.b6 b6Var = c80Var.a;
                    org.telegram.ui.Components.m9 m9Var = c80Var.b;
                    b6Var.l(LocaleController.getString(R.string.AddAnException), false);
                    c80Var.a.setRightPadding(AndroidUtilities.dp(8.0f));
                    m9Var.b(0, null, r2Var.getCurrentAccount());
                    m9Var.b(1, null, r2Var.getCurrentAccount());
                    m9Var.b(2, null, r2Var.getCurrentAccount());
                    m9Var.a(false);
                } else {
                    int min = Math.min(3, d80Var.f0.size());
                    org.telegram.ui.ActionBar.b6 b6Var2 = c80Var.a;
                    org.telegram.ui.Components.m9 m9Var2 = c80Var.b;
                    b6Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    c80Var.a.l(LocaleController.formatPluralString("ExceptionShort", d80Var.f0.size(), Integer.valueOf(d80Var.f0.size())), false);
                    for (int i18 = 0; i18 < min; i18++) {
                        m9Var2.b(i18, r2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) d80Var.f0.get(i18)).dialogId), r2Var.getCurrentAccount());
                    }
                    m9Var2.a(false);
                }
                d80Var.U.setVisibility(8);
                aa0Var.setVisibility(8);
                d80Var.g();
                d80Var.setParentWindow(P);
                d80Var.setCallback(new d6(c7Var, i12));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        c7 c7Var = this.b;
        ci.b bVar = c7Var.e0;
        LongSparseArray longSparseArray = bVar.c;
        w6 w6Var = new w6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            ci.a aVar = (ci.a) it.next();
            w6Var.a(aVar, aVar.d);
            w6 w6Var2 = (w6) longSparseArray.get(aVar.b);
            if (w6Var2 != null) {
                w6Var2.b(aVar);
                if (w6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(w6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (w6Var.c > 0) {
            c7Var.k0(w6Var, null, null);
        }
        c7Var.e0.d();
        m6 m6Var = c7Var.M;
        if (m6Var != null) {
            m6Var.d();
            c7Var.M.f(false);
        }
        c7Var.w0(true);
        c7Var.u0();
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
        int i11 = this.a;
    }

    private final /* synthetic */ void b(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
