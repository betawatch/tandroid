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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements n80, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ y6 a;

    public /* synthetic */ c6(y6 y6Var) {
        this.a = y6Var;
    }

    @Override // org.telegram.ui.n80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.a.b);
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        y6 y6Var = this.a;
        ArrayList arrayList = y6Var.a0;
        if (y6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i10);
            int i11 = 0;
            if (t6Var.a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i12 = t6Var.f;
                if (i12 < 0) {
                    y6Var.M = !y6Var.M;
                    y6Var.w0(true);
                    y6Var.v0();
                    return;
                }
                boolean[] zArr = y6Var.e;
                if (i12 < 0) {
                    y6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && y6Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = t6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (t6Var.i) {
                    while (true) {
                        if (i11 >= y6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            y6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(y6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                y6Var.v0();
                return;
            }
            if (t6Var.c >= 0) {
                p80 p80Var = new p80(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.d5.Q(y6Var, p80Var, view, f7, f10);
                int i16 = ((t6) arrayList.get(i10)).c;
                p80Var.c0 = i16;
                FrameLayout frameLayout = p80Var.h0;
                org.telegram.ui.ActionBar.g1 g1Var = p80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = p80Var.W;
                org.telegram.ui.Components.m90 m90Var = p80Var.T;
                org.telegram.ui.Components.s00 s00Var = p80Var.b0;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    s00Var.setVisibility(8);
                    m90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    s00Var.setVisibility(0);
                    m90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = p80Var.d0.getKeepMediaExceptions(i16);
                p80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.p2 p2Var = p80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) s00Var.c;
                    org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) s00Var.d;
                    l5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.l5) s00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    j9Var.b(0, null, p2Var.getCurrentAccount());
                    j9Var.b(1, null, p2Var.getCurrentAccount());
                    j9Var.b(2, null, p2Var.getCurrentAccount());
                    j9Var.a(false);
                } else {
                    int min = Math.min(3, p80Var.f0.size());
                    org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) s00Var.c;
                    org.telegram.ui.Components.j9 j9Var2 = (org.telegram.ui.Components.j9) s00Var.d;
                    l5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.l5) s00Var.c).l(LocaleController.formatPluralString("ExceptionShort", p80Var.f0.size(), Integer.valueOf(p80Var.f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        j9Var2.b(i17, p2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) p80Var.f0.get(i17)).dialogId), p2Var.getCurrentAccount());
                    }
                    j9Var2.a(false);
                }
                p80Var.U.setVisibility(8);
                m90Var.setVisibility(8);
                p80Var.f();
                p80Var.setParentWindow(Q);
                p80Var.setCallback(new c6(y6Var));
            }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        y6 y6Var = this.a;
        yh.b bVar = y6Var.Y;
        LongSparseArray longSparseArray = bVar.c;
        r6 r6Var = new r6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            yh.a aVar = (yh.a) it.next();
            r6Var.a(aVar, aVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(aVar.b);
            if (r6Var2 != null) {
                r6Var2.b(aVar);
                if (r6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(r6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (r6Var.c > 0) {
            y6Var.l0(r6Var, null, null);
        }
        y6Var.Y.d();
        v6 v6Var = y6Var.N;
        if (v6Var != null) {
            v6Var.c();
            y6Var.N.e(false);
        }
        y6Var.w0(true);
        y6Var.v0();
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
