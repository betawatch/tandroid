package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c3 extends k1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ e3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(e3 e3Var, e3 e3Var2) {
        super(e3Var2);
        this.q = e3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        b3 c10;
        e3 e3Var = this.q;
        if (!e3Var.b) {
            return -1;
        }
        ArrayList<d3> tabs = e3Var.getTabs();
        if (tabs.isEmpty() || (c10 = e3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        e3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        e3 e3Var = this.q;
        if (e3Var.b) {
            ArrayList<d3> tabs = e3Var.getTabs();
            if (tabs.isEmpty() || e3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            e3 e3Var = this.q;
            ArrayList<d3> tabs = e3Var.getTabs();
            if (!tabs.isEmpty()) {
                d3 d3Var = tabs.get(0);
                if (i7 == 1) {
                    e3Var.b();
                    return true;
                }
                if (i7 == 2) {
                    e3Var.g(d3Var, new di.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k1.b
    public final void l(int i7, s0.d dVar) {
        String str;
        String str2;
        e3 e3Var = this.q;
        ArrayList<d3> tabs = e3Var.getTabs();
        d3 d3Var = tabs.isEmpty() ? null : tabs.get(0);
        b3 c10 = d3Var == null ? null : e3Var.c(d3Var);
        dVar.i("android.widget.Button");
        dVar.b(s0.c.c);
        Rect rect = this.p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        e3Var.d(rectF, c11);
        String b10 = d3Var.b() != null ? d3Var.b() : "";
        if (i7 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = id.M0(2131747817, null);
            } else {
                str = id.M0(2131747817, null) + ", " + b10;
            }
            dVar.j(str);
            return;
        }
        Rect bounds = c10.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        dVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = id.M0(2131752041, null);
        } else {
            str2 = id.M0(2131752041, null) + ", " + b10;
        }
        dVar.j(str2);
    }
}
