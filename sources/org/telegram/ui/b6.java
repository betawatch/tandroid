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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements v70, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.al0 {
    public final /* synthetic */ x6 a;

    public /* synthetic */ b6(x6 x6Var) {
        this.a = x6Var;
    }

    @Override // org.telegram.ui.v70
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.a.b);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        x6 x6Var = this.a;
        ArrayList arrayList = x6Var.W;
        if (x6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            s6 s6Var = (s6) arrayList.get(i10);
            int i11 = 0;
            if (s6Var.a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i12 = s6Var.f;
                if (i12 < 0) {
                    x6Var.I = !x6Var.I;
                    x6Var.w0(true);
                    x6Var.v0();
                    return;
                }
                boolean[] zArr = x6Var.e;
                if (i12 < 0) {
                    x6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && x6Var.t0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                }
                int i15 = s6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (s6Var.i) {
                    while (true) {
                        if (i11 >= x6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            x6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((s6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(x6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                x6Var.v0();
                return;
            }
            if (s6Var.c >= 0) {
                x70 x70Var = new x70(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(x6Var, x70Var, view, f9, f10);
                int i16 = ((s6) arrayList.get(i10)).c;
                x70Var.V = i16;
                FrameLayout frameLayout = x70Var.d0;
                org.telegram.ui.ActionBar.g1 g1Var = x70Var.R;
                org.telegram.ui.ActionBar.g1 g1Var2 = x70Var.S;
                org.telegram.ui.Components.y80 y80Var = x70Var.P;
                org.telegram.ui.Components.g00 g00Var = x70Var.U;
                if (i16 == 3) {
                    g1Var2.setVisibility(0);
                    g1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    g00Var.setVisibility(8);
                    y80Var.setVisibility(8);
                } else {
                    g1Var2.setVisibility(8);
                    g1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    g00Var.setVisibility(0);
                    y80Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = x70Var.W.getKeepMediaExceptions(i16);
                x70Var.b0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.o2 o2Var = x70Var.c0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) g00Var.c;
                    org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) g00Var.d;
                    h5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) g00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    h9Var.b(0, null, o2Var.getCurrentAccount());
                    h9Var.b(1, null, o2Var.getCurrentAccount());
                    h9Var.b(2, null, o2Var.getCurrentAccount());
                    h9Var.a(false);
                } else {
                    int min = Math.min(3, x70Var.b0.size());
                    org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) g00Var.c;
                    org.telegram.ui.Components.h9 h9Var2 = (org.telegram.ui.Components.h9) g00Var.d;
                    h5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) g00Var.c).l(LocaleController.formatPluralString("ExceptionShort", x70Var.b0.size(), Integer.valueOf(x70Var.b0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        h9Var2.b(i17, o2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) x70Var.b0.get(i17)).dialogId), o2Var.getCurrentAccount());
                    }
                    h9Var2.a(false);
                }
                x70Var.Q.setVisibility(8);
                y80Var.setVisibility(8);
                x70Var.f();
                x70Var.setParentWindow(Q);
                x70Var.setCallback(new b6(x6Var));
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        x6 x6Var = this.a;
        kh.b bVar = x6Var.U;
        LongSparseArray longSparseArray = bVar.c;
        q6 q6Var = new q6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            kh.a aVar = (kh.a) it.next();
            q6Var.a(aVar, aVar.d);
            q6 q6Var2 = (q6) longSparseArray.get(aVar.b);
            if (q6Var2 != null) {
                q6Var2.b(aVar);
                if (q6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(q6Var2);
                }
                ArrayList e10 = bVar.e(aVar.d);
                if (e10 != null) {
                    e10.remove(aVar);
                }
            }
        }
        if (q6Var.c > 0) {
            x6Var.l0(q6Var, null, null);
        }
        x6Var.U.d();
        u6 u6Var = x6Var.J;
        if (u6Var != null) {
            u6Var.c();
            x6Var.J.e(false);
        }
        x6Var.w0(true);
        x6Var.v0();
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
