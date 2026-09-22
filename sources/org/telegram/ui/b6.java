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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements le.d, n80, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ b6(z6 z6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.x0();
                z6Var.fragmentView.invalidate();
                break;
            default:
                z6.V(this.b, f7);
                break;
        }
    }

    @Override // org.telegram.ui.n80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.b.b);
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        z6 z6Var = this.b;
        ArrayList arrayList = z6Var.e0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            int i12 = 1;
            if (u6Var.a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i13 = u6Var.f;
                if (i13 < 0) {
                    z6Var.L = !z6Var.L;
                    z6Var.y0(true);
                    z6Var.w0();
                    return;
                }
                boolean[] zArr = z6Var.d;
                if (i13 < 0) {
                    z6Var.v0(view);
                    return;
                }
                if (zArr[i13]) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < 10; i15++) {
                        if (zArr[i15] && z6Var.u0(i15) > 0) {
                            i14++;
                        }
                    }
                    if (i14 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i16 = u6Var.f;
                boolean z10 = !zArr[i16];
                zArr[i16] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (u6Var.i) {
                    while (true) {
                        if (i11 >= z6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            z6Var.b.getClass();
                            int S = RecyclerView.S(childAt);
                            if (S >= 0 && S < arrayList.size() && ((u6) arrayList.get(S)).f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.w0();
                return;
            }
            if (u6Var.c >= 0) {
                p80 p80Var = new p80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.d5.Q(z6Var, p80Var, view, f7, f10);
                int i17 = ((u6) arrayList.get(i10)).c;
                p80Var.c0 = i17;
                FrameLayout frameLayout = p80Var.h0;
                org.telegram.ui.ActionBar.f1 f1Var = p80Var.V;
                org.telegram.ui.ActionBar.f1 f1Var2 = p80Var.W;
                org.telegram.ui.Components.n90 n90Var = p80Var.T;
                org.telegram.ui.Components.l00 l00Var = p80Var.b0;
                if (i17 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    l00Var.setVisibility(8);
                    n90Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    l00Var.setVisibility(0);
                    n90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = p80Var.d0.getKeepMediaExceptions(i17);
                p80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = p80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) l00Var.c;
                    org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) l00Var.d;
                    j5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.j5) l00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    j9Var.b(0, null, n2Var.getCurrentAccount());
                    j9Var.b(1, null, n2Var.getCurrentAccount());
                    j9Var.b(2, null, n2Var.getCurrentAccount());
                    j9Var.a(false);
                } else {
                    int min = Math.min(3, p80Var.f0.size());
                    org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) l00Var.c;
                    org.telegram.ui.Components.j9 j9Var2 = (org.telegram.ui.Components.j9) l00Var.d;
                    j5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.j5) l00Var.c).l(LocaleController.formatPluralString("ExceptionShort", p80Var.f0.size(), Integer.valueOf(p80Var.f0.size())), false);
                    for (int i18 = 0; i18 < min; i18++) {
                        j9Var2.b(i18, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) p80Var.f0.get(i18)).dialogId), n2Var.getCurrentAccount());
                    }
                    j9Var2.a(false);
                }
                p80Var.U.setVisibility(8);
                n90Var.setVisibility(8);
                p80Var.f();
                p80Var.setParentWindow(Q);
                p80Var.setCallback(new b6(z6Var, i12));
            }
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.b;
        zh.b bVar = z6Var.c0;
        LongSparseArray longSparseArray = bVar.c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.c > 0) {
            z6Var.l0(s6Var, null, null);
        }
        z6Var.c0.d();
        w6 w6Var = z6Var.M;
        if (w6Var != null) {
            w6Var.d();
            z6Var.M.f(false);
        }
        z6Var.y0(true);
        z6Var.w0();
    }

    private final /* synthetic */ void b(float f7, int i10) {
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
