package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e3 extends k1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ g3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g3 g3Var, g3 g3Var2) {
        super(g3Var2);
        this.q = g3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        d3 c10;
        g3 g3Var = this.q;
        if (!g3Var.b) {
            return -1;
        }
        ArrayList<f3> tabs = g3Var.getTabs();
        if (tabs.isEmpty() || (c10 = g3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        g3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        g3 g3Var = this.q;
        if (g3Var.b) {
            ArrayList<f3> tabs = g3Var.getTabs();
            if (tabs.isEmpty() || g3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            g3 g3Var = this.q;
            ArrayList<f3> tabs = g3Var.getTabs();
            if (!tabs.isEmpty()) {
                f3 f3Var = tabs.get(0);
                if (i7 == 1) {
                    g3Var.b();
                    return true;
                }
                if (i7 == 2) {
                    g3Var.g(f3Var, new fi.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k1.b
    public final void l(int i7, s0.c cVar) {
        String str;
        String str2;
        g3 g3Var = this.q;
        ArrayList<f3> tabs = g3Var.getTabs();
        f3 f3Var = tabs.isEmpty() ? null : tabs.get(0);
        d3 c10 = f3Var == null ? null : g3Var.c(f3Var);
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
        g3Var.d(rectF, c11);
        String b10 = f3Var.b() != null ? f3Var.b() : "";
        if (i7 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = gd.M0(2131747624, null);
            } else {
                str = gd.M0(2131747624, null) + ", " + b10;
            }
            cVar.j(str);
            return;
        }
        Rect bounds = c10.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = gd.M0(2131752030, null);
        } else {
            str2 = gd.M0(2131752030, null) + ", " + b10;
        }
        cVar.j(str2);
    }
}
