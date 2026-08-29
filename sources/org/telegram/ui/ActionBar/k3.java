package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ m3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, m3 m3Var2) {
        super(m3Var2);
        this.q = m3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f9, float f10) {
        j3 c3;
        m3 m3Var = this.q;
        if (!m3Var.b) {
            return -1;
        }
        ArrayList<l3> tabs = m3Var.getTabs();
        if (tabs.isEmpty() || (c3 = m3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c6 = c3.c();
        RectF rectF = this.o;
        m3Var.d(rectF, c6);
        Rect bounds = c3.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f9 - rectF.left), (int) (f10 - rectF.centerY()))) {
            return rectF.contains(f9, f10) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        m3 m3Var = this.q;
        if (m3Var.b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (tabs.isEmpty() || m3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            m3 m3Var = this.q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i10 == 1) {
                    m3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    m3Var.g(l3Var, new eg.h(2));
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
        m3 m3Var = this.q;
        ArrayList<l3> tabs = m3Var.getTabs();
        l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
        j3 c3 = l3Var != null ? m3Var.c(l3Var) : null;
        cVar.i("android.widget.Button");
        cVar.b(s0.b.c);
        Rect rect = this.p;
        if (c3 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c6 = c3.c();
        RectF rectF = this.o;
        m3Var.d(rectF, c6);
        String b10 = l3Var.b() != null ? l3Var.b() : "";
        if (i10 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = LocaleController.getString(R.string.Open);
            } else {
                str = LocaleController.getString(R.string.Open) + ", " + b10;
            }
            cVar.j(str);
            return;
        }
        Rect bounds = c3.k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = LocaleController.getString(R.string.Close);
        } else {
            str2 = LocaleController.getString(R.string.Close) + ", " + b10;
        }
        cVar.j(str2);
    }
}
