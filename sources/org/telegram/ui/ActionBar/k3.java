package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final int g(float f10, float f11) {
        j3 c10;
        m3 m3Var = this.q;
        if (!m3Var.b) {
            return -1;
        }
        ArrayList<l3> tabs = m3Var.getTabs();
        if (tabs.isEmpty() || (c10 = m3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        m3Var.d(rectF, c11);
        Rect bounds = c10.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
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
    public final boolean k(int i9, int i10) {
        if (i10 == 16) {
            m3 m3Var = this.q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i9 == 1) {
                    m3Var.b();
                    return true;
                }
                if (i9 == 2) {
                    m3Var.g(l3Var, new bg.k(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i9, s0.d dVar) {
        String str;
        String str2;
        m3 m3Var = this.q;
        ArrayList<l3> tabs = m3Var.getTabs();
        l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
        j3 c10 = l3Var != null ? m3Var.c(l3Var) : null;
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
        m3Var.d(rectF, c11);
        String b10 = l3Var.b() != null ? l3Var.b() : "";
        if (i9 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = LocaleController.getString(R.string.Open);
            } else {
                str = LocaleController.getString(R.string.Open) + ", " + b10;
            }
            dVar.j(str);
            return;
        }
        Rect bounds = c10.k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        dVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = LocaleController.getString(R.string.Close);
        } else {
            str2 = LocaleController.getString(R.string.Close) + ", " + b10;
        }
        dVar.j(str2);
    }
}
