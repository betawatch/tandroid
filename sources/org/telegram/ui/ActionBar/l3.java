package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ n3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3 n3Var, n3 n3Var2) {
        super(n3Var2);
        this.q = n3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        k3 c3;
        n3 n3Var = this.q;
        if (!n3Var.b) {
            return -1;
        }
        ArrayList<m3> tabs = n3Var.getTabs();
        if (tabs.isEmpty() || (c3 = n3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c10 = c3.c();
        RectF rectF = this.o;
        n3Var.d(rectF, c10);
        Rect bounds = c3.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        n3 n3Var = this.q;
        if (n3Var.b) {
            ArrayList<m3> tabs = n3Var.getTabs();
            if (tabs.isEmpty() || n3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            n3 n3Var = this.q;
            ArrayList<m3> tabs = n3Var.getTabs();
            if (!tabs.isEmpty()) {
                m3 m3Var = tabs.get(0);
                if (i10 == 1) {
                    n3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    n3Var.g(m3Var, new gg.h(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.e eVar) {
        String str;
        String str2;
        n3 n3Var = this.q;
        ArrayList<m3> tabs = n3Var.getTabs();
        m3 m3Var = tabs.isEmpty() ? null : tabs.get(0);
        k3 c3 = m3Var != null ? n3Var.c(m3Var) : null;
        eVar.i("android.widget.Button");
        eVar.b(s0.c.c);
        Rect rect = this.p;
        if (c3 == null) {
            rect.set(0, 0, 1, 1);
            eVar.h(rect);
            eVar.j("");
            eVar.p(false);
            return;
        }
        float c10 = c3.c();
        RectF rectF = this.o;
        n3Var.d(rectF, c10);
        String b10 = m3Var.b() != null ? m3Var.b() : "";
        if (i10 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            eVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = LocaleController.getString(R.string.Open);
            } else {
                str = LocaleController.getString(R.string.Open) + ", " + b10;
            }
            eVar.j(str);
            return;
        }
        Rect bounds = c3.k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        eVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = LocaleController.getString(R.string.Close);
        } else {
            str2 = LocaleController.getString(R.string.Close) + ", " + b10;
        }
        eVar.j(str2);
    }
}
