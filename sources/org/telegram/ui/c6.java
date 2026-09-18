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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements le.d, p80, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ c6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 0:
                a7 a7Var = this.b;
                a7Var.x0();
                a7Var.fragmentView.invalidate();
                break;
            default:
                a7.V(this.b, f7);
                break;
        }
    }

    @Override // org.telegram.ui.p80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.b.b);
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        a7 a7Var = this.b;
        ArrayList arrayList = a7Var.e0;
        if (a7Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            v6 v6Var = (v6) arrayList.get(i10);
            int i11 = 0;
            int i12 = 1;
            if (v6Var.a == 11 && (view instanceof org.telegram.ui.Cells.z1)) {
                int i13 = v6Var.f;
                if (i13 < 0) {
                    a7Var.L = !a7Var.L;
                    a7Var.y0(true);
                    a7Var.w0();
                    return;
                }
                boolean[] zArr = a7Var.d;
                if (i13 < 0) {
                    a7Var.v0(view);
                    return;
                }
                if (zArr[i13]) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < 10; i15++) {
                        if (zArr[i15] && a7Var.u0(i15) > 0) {
                            i14++;
                        }
                    }
                    if (i14 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i16 = v6Var.f;
                boolean z10 = !zArr[i16];
                zArr[i16] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                if (v6Var.i) {
                    while (true) {
                        if (i11 >= a7Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = a7Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.z1) {
                            a7Var.b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((v6) arrayList.get(S)).f < 0) {
                                ((org.telegram.ui.Cells.z1) childAt).c(a7Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                a7Var.w0();
                return;
            }
            if (v6Var.c >= 0) {
                r80 r80Var = new r80(view.getContext(), a7Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(a7Var, r80Var, view, f7, f10);
                int i17 = ((v6) arrayList.get(i10)).c;
                r80Var.c0 = i17;
                FrameLayout frameLayout = r80Var.h0;
                org.telegram.ui.ActionBar.g1 g1Var = r80Var.V;
                org.telegram.ui.ActionBar.g1 g1Var2 = r80Var.W;
                org.telegram.ui.Components.c90 c90Var = r80Var.T;
                org.telegram.ui.Components.l00 l00Var = r80Var.b0;
                if (i17 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    c90Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    c90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = r80Var.d0.getKeepMediaExceptions(i17);
                r80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = r80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) l00Var.c;
                    org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) l00Var.d;
                    k5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.k5) l00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    i9Var.b(0, null, o2Var.getCurrentAccount());
                    i9Var.b(1, null, o2Var.getCurrentAccount());
                    i9Var.b(2, null, o2Var.getCurrentAccount());
                    i9Var.a(false);
                } else {
                    int min = Math.min(3, r80Var.f0.size());
                    org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) l00Var.c;
                    org.telegram.ui.Components.i9 i9Var2 = (org.telegram.ui.Components.i9) l00Var.d;
                    k5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.k5) l00Var.c).l(LocaleController.formatPluralString("ExceptionShort", r80Var.f0.size(), Integer.valueOf(r80Var.f0.size())), false);
                    for (int i18 = 0; i18 < min; i18++) {
                        i9Var2.b(i18, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) r80Var.f0.get(i18)).dialogId), o2Var.getCurrentAccount());
                    }
                    i9Var2.a(false);
                }
                r80Var.U.setVisibility(8);
                c90Var.setVisibility(8);
                r80Var.f();
                r80Var.setParentWindow(Q);
                r80Var.setCallback(new c6(a7Var, i12));
            }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        a7 a7Var = this.b;
        zh.b bVar = a7Var.c0;
        LongSparseArray longSparseArray = bVar.c;
        t6 t6Var = new t6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            t6Var.a(aVar, aVar.d);
            t6 t6Var2 = (t6) longSparseArray.get(aVar.b);
            if (t6Var2 != null) {
                t6Var2.b(aVar);
                if (t6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(t6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (t6Var.c > 0) {
            a7Var.l0(t6Var, null, null);
        }
        a7Var.c0.d();
        x6 x6Var = a7Var.M;
        if (x6Var != null) {
            x6Var.d();
            a7Var.M.f(false);
        }
        a7Var.y0(true);
        a7Var.w0();
    }

    private final /* synthetic */ void b(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
