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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements le.d, m80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xv0, org.telegram.ui.Components.nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ c6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.m80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.b.b);
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 0:
                a7.W(this.b, f7);
                break;
            default:
                a7 a7Var = this.b;
                a7Var.u0();
                a7Var.fragmentView.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public int b() {
        return this.b.R;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        a7 a7Var = this.b;
        ArrayList arrayList = a7Var.g0;
        if (a7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            w6 w6Var = (w6) arrayList.get(i10);
            int i11 = 0;
            if (w6Var.a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = w6Var.f;
                if (i12 < 0) {
                    a7Var.L = !a7Var.L;
                    a7Var.v0(true);
                    a7Var.t0();
                    return;
                }
                boolean[] zArr = a7Var.d;
                if (i12 < 0) {
                    a7Var.s0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && a7Var.r0(i14) > 0) {
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
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (w6Var.i) {
                    while (true) {
                        if (i11 >= a7Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = a7Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            a7Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((w6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(a7Var.o0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                a7Var.t0();
                return;
            }
            if (w6Var.c >= 0) {
                o80 o80Var = new o80(view.getContext(), a7Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(a7Var, o80Var, view, f7, f10);
                int i16 = ((w6) arrayList.get(i10)).c;
                o80Var.c0 = i16;
                FrameLayout frameLayout = o80Var.h0;
                org.telegram.ui.ActionBar.f1 f1Var = o80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = o80Var.W;
                org.telegram.ui.Components.q90 q90Var = o80Var.T;
                org.telegram.ui.Components.o00 o00Var = o80Var.b0;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    o00Var.setVisibility(8);
                    q90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    o00Var.setVisibility(0);
                    q90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = o80Var.d0.getKeepMediaExceptions(i16);
                o80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                int i17 = 2;
                org.telegram.ui.ActionBar.n2 n2Var = o80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) o00Var.c;
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) o00Var.d;
                    i5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.i5) o00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, n2Var.getCurrentAccount());
                    k9Var.b(1, null, n2Var.getCurrentAccount());
                    k9Var.b(2, null, n2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, o80Var.f0.size());
                    org.telegram.ui.ActionBar.i5 i5Var2 = (org.telegram.ui.ActionBar.i5) o00Var.c;
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) o00Var.d;
                    i5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.i5) o00Var.c).l(LocaleController.formatPluralString("ExceptionShort", o80Var.f0.size(), Integer.valueOf(o80Var.f0.size())), false);
                    for (int i18 = 0; i18 < min; i18++) {
                        k9Var2.b(i18, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) o80Var.f0.get(i18)).dialogId), n2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                o80Var.U.setVisibility(8);
                q90Var.setVisibility(8);
                o80Var.f();
                o80Var.setParentWindow(Q);
                o80Var.setCallback(new c6(a7Var, i17));
            }
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a7 a7Var = this.b;
        zh.b bVar = a7Var.e0;
        LongSparseArray longSparseArray = bVar.c;
        u6 u6Var = new u6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            u6Var.a(aVar, aVar.d);
            u6 u6Var2 = (u6) longSparseArray.get(aVar.b);
            if (u6Var2 != null) {
                u6Var2.b(aVar);
                if (u6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(u6Var2);
                }
                ArrayList e7 = bVar.e(aVar.d);
                if (e7 != null) {
                    e7.remove(aVar);
                }
            }
        }
        if (u6Var.c > 0) {
            a7Var.i0(u6Var, null, null);
        }
        a7Var.e0.d();
        k6 k6Var = a7Var.M;
        if (k6Var != null) {
            k6Var.d();
            a7Var.M.f(false);
        }
        a7Var.v0(true);
        a7Var.t0();
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    private final /* synthetic */ void e(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
