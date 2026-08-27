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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements w70, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qk0 {
    public final /* synthetic */ z6 a;

    public /* synthetic */ b6(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // org.telegram.ui.w70
    public void a(int i10) {
        AndroidUtilities.updateVisibleRows(this.a.b);
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        z6 z6Var = this.a;
        ArrayList arrayList = z6Var.W;
        if (z6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.a == 11 && (view instanceof org.telegram.ui.Cells.y1)) {
                int i12 = u6Var.f;
                if (i12 < 0) {
                    z6Var.I = !z6Var.I;
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
                int i15 = u6Var.f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                if (u6Var.i) {
                    while (true) {
                        if (i11 >= z6Var.b.getChildCount()) {
                            break;
                        }
                        View childAt = z6Var.b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            z6Var.b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f < 0) {
                                ((org.telegram.ui.Cells.y1) childAt).c(z6Var.r0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                z6Var.v0();
                return;
            }
            if (u6Var.c >= 0) {
                y70 y70Var = new y70(view.getContext(), z6Var);
                org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.y4.Q(z6Var, y70Var, view, f10, f11);
                int i16 = ((u6) arrayList.get(i10)).c;
                y70Var.V = i16;
                FrameLayout frameLayout = y70Var.d0;
                org.telegram.ui.ActionBar.f1 f1Var = y70Var.R;
                org.telegram.ui.ActionBar.f1 f1Var2 = y70Var.S;
                org.telegram.ui.Components.p80 p80Var = y70Var.P;
                org.telegram.ui.Components.zz zzVar = y70Var.U;
                if (i16 == 3) {
                    f1Var2.setVisibility(0);
                    f1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    zzVar.setVisibility(8);
                    p80Var.setVisibility(8);
                } else {
                    f1Var2.setVisibility(8);
                    f1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    zzVar.setVisibility(0);
                    p80Var.setVisibility(0);
                }
                ArrayList<CacheByChatsController.KeepMediaException> keepMediaExceptions = y70Var.W.getKeepMediaExceptions(i16);
                y70Var.b0 = keepMediaExceptions;
                boolean isEmpty = keepMediaExceptions.isEmpty();
                org.telegram.ui.ActionBar.n2 n2Var = y70Var.c0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) zzVar.c;
                    org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) zzVar.d;
                    h5Var.l(LocaleController.getString(R.string.AddAnException), false);
                    ((org.telegram.ui.ActionBar.h5) zzVar.c).setRightPadding(AndroidUtilities.dp(8.0f));
                    b9Var.b(0, null, n2Var.getCurrentAccount());
                    b9Var.b(1, null, n2Var.getCurrentAccount());
                    b9Var.b(2, null, n2Var.getCurrentAccount());
                    b9Var.a(false);
                } else {
                    int min = Math.min(3, y70Var.b0.size());
                    org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) zzVar.c;
                    org.telegram.ui.Components.b9 b9Var2 = (org.telegram.ui.Components.b9) zzVar.d;
                    h5Var2.setRightPadding(AndroidUtilities.dp((Math.max(0, min - 1) * 12) + 64));
                    ((org.telegram.ui.ActionBar.h5) zzVar.c).l(LocaleController.formatPluralString("ExceptionShort", y70Var.b0.size(), Integer.valueOf(y70Var.b0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        b9Var2.b(i17, n2Var.getMessagesController().getUserOrChat(((CacheByChatsController.KeepMediaException) y70Var.b0.get(i17)).dialogId), n2Var.getCurrentAccount());
                    }
                    b9Var2.a(false);
                }
                y70Var.Q.setVisibility(8);
                p80Var.setVisibility(8);
                y70Var.f();
                y70Var.setParentWindow(Q);
                y70Var.setCallback(new b6(z6Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z6 z6Var = this.a;
        ih.b bVar = z6Var.U;
        LongSparseArray longSparseArray = bVar.c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.j.iterator();
        while (it.hasNext()) {
            ih.a aVar = (ih.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.c <= 0) {
                    longSparseArray.remove(aVar.b);
                    bVar.b.remove(s6Var2);
                }
                ArrayList e9 = bVar.e(aVar.d);
                if (e9 != null) {
                    e9.remove(aVar);
                }
            }
        }
        if (s6Var.c > 0) {
            z6Var.l0(s6Var, null, null);
        }
        z6Var.U.d();
        w6 w6Var = z6Var.J;
        if (w6Var != null) {
            w6Var.c();
            z6Var.J.e(false);
        }
        z6Var.w0(true);
        z6Var.v0();
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
