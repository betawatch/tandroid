package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d3 extends k1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ f3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(f3 f3Var, f3 f3Var2) {
        super(f3Var2);
        this.q = f3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        c3 c10;
        f3 f3Var = this.q;
        if (!f3Var.b) {
            return -1;
        }
        ArrayList<e3> tabs = f3Var.getTabs();
        if (tabs.isEmpty() || (c10 = f3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        f3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        f3 f3Var = this.q;
        if (f3Var.b) {
            ArrayList<e3> tabs = f3Var.getTabs();
            if (tabs.isEmpty() || f3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            f3 f3Var = this.q;
            ArrayList<e3> tabs = f3Var.getTabs();
            if (!tabs.isEmpty()) {
                e3 e3Var = tabs.get(0);
                if (i7 == 1) {
                    f3Var.b();
                    return true;
                }
                if (i7 == 2) {
                    f3Var.g(e3Var, new fi.e(7));
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
        f3 f3Var = this.q;
        ArrayList<e3> tabs = f3Var.getTabs();
        e3 e3Var = tabs.isEmpty() ? null : tabs.get(0);
        c3 c10 = e3Var == null ? null : f3Var.c(e3Var);
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
        f3Var.d(rectF, c11);
        String b10 = e3Var.b() != null ? e3Var.b() : "";
        if (i7 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = hd.N0(2131747623, null);
            } else {
                str = hd.N0(2131747623, null) + ", " + b10;
            }
            cVar.j(str);
            return;
        }
        Rect bounds = c10.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = hd.N0(2131752029, null);
        } else {
            str2 = hd.N0(2131752029, null) + ", " + b10;
        }
        cVar.j(str2);
    }
}
