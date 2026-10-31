package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ i3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, i3 i3Var2) {
        super(i3Var2);
        this.q = i3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        f3 c10;
        i3 i3Var = this.q;
        if (!i3Var.b) {
            return -1;
        }
        ArrayList<h3> tabs = i3Var.getTabs();
        if (tabs.isEmpty() || (c10 = i3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        i3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()))) {
            return rectF.contains(f7, f10) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        i3 i3Var = this.q;
        if (i3Var.b) {
            ArrayList<h3> tabs = i3Var.getTabs();
            if (tabs.isEmpty() || i3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            i3 i3Var = this.q;
            ArrayList<h3> tabs = i3Var.getTabs();
            if (!tabs.isEmpty()) {
                h3 h3Var = tabs.get(0);
                if (i10 == 1) {
                    i3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    i3Var.g(h3Var, new ag.z0(6));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.c cVar) {
        String str;
        String str2;
        i3 i3Var = this.q;
        ArrayList<h3> tabs = i3Var.getTabs();
        h3 h3Var = tabs.isEmpty() ? null : tabs.get(0);
        f3 c10 = h3Var == null ? null : i3Var.c(h3Var);
        cVar.i("android.widget.Button");
        cVar.b(s0.b.c);
        Rect rect = this.p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        i3Var.d(rectF, c11);
        String b10 = h3Var.b() != null ? h3Var.b() : "";
        if (i10 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = cd.L0(2131747833, null);
            } else {
                str = cd.L0(2131747833, null) + ", " + b10;
            }
            cVar.j(str);
            return;
        }
        Rect bounds = c10.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = cd.L0(2131752041, null);
        } else {
            str2 = cd.L0(2131752041, null) + ", " + b10;
        }
        cVar.j(str2);
    }
}
