package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z2 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ b3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b3 b3Var, b3 b3Var2) {
        super(b3Var2);
        this.q = b3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        y2 c2;
        b3 b3Var = this.q;
        if (!b3Var.b) {
            return -1;
        }
        ArrayList<a3> tabs = b3Var.getTabs();
        if (tabs.isEmpty() || (c2 = b3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c10 = c2.c();
        RectF rectF = this.o;
        b3Var.d(rectF, c10);
        Rect bounds = c2.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        b3 b3Var = this.q;
        if (b3Var.b) {
            ArrayList<a3> tabs = b3Var.getTabs();
            if (tabs.isEmpty() || b3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i3, int i10) {
        if (i10 == 16) {
            b3 b3Var = this.q;
            ArrayList<a3> tabs = b3Var.getTabs();
            if (!tabs.isEmpty()) {
                a3 a3Var = tabs.get(0);
                if (i3 == 1) {
                    b3Var.b();
                    return true;
                }
                if (i3 == 2) {
                    b3Var.g(a3Var, new ei.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i3, s0.d dVar) {
        String str;
        String str2;
        b3 b3Var = this.q;
        ArrayList<a3> tabs = b3Var.getTabs();
        a3 a3Var = tabs.isEmpty() ? null : tabs.get(0);
        y2 c2 = a3Var == null ? null : b3Var.c(a3Var);
        dVar.i("android.widget.Button");
        dVar.b(s0.c.c);
        Rect rect = this.p;
        if (c2 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = c2.c();
        RectF rectF = this.o;
        b3Var.d(rectF, c10);
        String b10 = a3Var.b() != null ? a3Var.b() : "";
        if (i3 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = bd.M0(2131747825, null);
            } else {
                str = bd.M0(2131747825, null) + ", " + b10;
            }
            dVar.j(str);
            return;
        }
        Rect bounds = c2.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        dVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = bd.M0(2131752041, null);
        } else {
            str2 = bd.M0(2131752041, null) + ", " + b10;
        }
        dVar.j(str2);
    }
}
