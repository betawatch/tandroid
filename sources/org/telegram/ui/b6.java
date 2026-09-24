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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements i80, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ z6 a;

    public /* synthetic */ b6(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // org.telegram.ui.i80
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.a.b);
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        z6 z6Var = this.a;
        ArrayList arrayList = z6Var.a0;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i10);
            int i11 = 0;
            if (t6Var.a == 11 && (view instanceof org.telegram.ui.Cells.a2)) {
                int i12 = t6Var.f;
                if (i12 < 0) {
                    z6Var.M = !z6Var.M;
                    z6Var.w0(true);
                    z6Var.v0();
                    return;
                }
                boolean[] zArr = z6Var.e;
                if (i12 < 0) {
                    z6Var.u0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && z6Var.t0(i14) > 0) {
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
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                if (t6Var.i) {
                    while (true) {
                        if (i11 >= z6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.a2) {
                            z6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.a2) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.v0();
                return;
            }
            if (t6Var.c >= 0) {
                k80 k80Var = new k80(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.m1 Q = org.telegram.ui.Components.e5.Q(z6Var, k80Var, view, f7, f10);
                int i16 = ((t6) arrayList.get(i10)).c;
                k80Var.c0 = i16;
                FrameLayout frameLayout = k80Var.h0;
                org.telegram.ui.ActionBar.e1 e1Var = k80Var.V;
                org.telegram.ui.ActionBar.e1 e1Var2 = k80Var.W;
                org.telegram.ui.Components.n90 n90Var = k80Var.T;
                org.telegram.ui.Components.m00 m00Var = k80Var.b0;
                if (i16 == 3) {
                    e1Var2.setVisibility(0);
                    e1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    m00Var.setVisibility(8);
                    n90Var.setVisibility(8);
                } else {
                    e1Var2.setVisibility(8);
                    e1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    m00Var.setVisibility(0);
                    n90Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = k80Var.d0.getKeepMediaExceptions(i16);
                k80Var.f0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.m2 m2Var = k80Var.g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) m00Var.c;
                    org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) m00Var.d;
                    h5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) m00Var.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    k9Var.b(0, null, m2Var.getCurrentAccount());
                    k9Var.b(1, null, m2Var.getCurrentAccount());
                    k9Var.b(2, null, m2Var.getCurrentAccount());
                    k9Var.a(false);
                } else {
                    int min = Math.min(3, k80Var.f0.size());
                    org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) m00Var.c;
                    org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) m00Var.d;
                    h5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) m00Var.c).l(LocaleController.formatPluralString("ExceptionShort", k80Var.f0.size(), Integer.valueOf(k80Var.f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        k9Var2.b(i17, m2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) k80Var.f0.get(i17)).dialogId), m2Var.getCurrentAccount());
                    }
                    k9Var2.a(false);
                }
                k80Var.U.setVisibility(8);
                n90Var.setVisibility(8);
                k80Var.f();
                k80Var.setParentWindow(Q);
                k80Var.setCallback(new b6(z6Var));
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        z6 z6Var = this.a;
        zh.b bVar = z6Var.Y;
        LongSparseArray longSparseArray = bVar.c;
        r6 r6Var = new r6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            zh.a aVar = (zh.a) it.next();
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
            z6Var.l0(r6Var, null, null);
        }
        z6Var.Y.d();
        w6 w6Var = z6Var.N;
        if (w6Var != null) {
            w6Var.c();
            z6Var.N.e(false);
        }
        z6Var.w0(true);
        z6Var.v0();
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
