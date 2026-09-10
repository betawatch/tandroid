package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ q3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, q3 q3Var2) {
        super(q3Var2);
        this.q = q3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        n3 c10;
        q3 q3Var = this.q;
        if (!q3Var.b) {
            return -1;
        }
        ArrayList<p3> tabs = q3Var.getTabs();
        if (tabs.isEmpty() || (c10 = q3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        q3Var.d(rectF, c11);
        Rect bounds = c10.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()))) {
            return rectF.contains(f7, f10) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        q3 q3Var = this.q;
        if (q3Var.b) {
            ArrayList<p3> tabs = q3Var.getTabs();
            if (tabs.isEmpty() || q3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            q3 q3Var = this.q;
            ArrayList<p3> tabs = q3Var.getTabs();
            if (!tabs.isEmpty()) {
                p3 p3Var = tabs.get(0);
                if (i10 == 1) {
                    q3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    q3Var.g(p3Var, new l3(1));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        String str;
        String str2;
        q3 q3Var = this.q;
        ArrayList<p3> tabs = q3Var.getTabs();
        p3 p3Var = tabs.isEmpty() ? null : tabs.get(0);
        n3 c10 = p3Var != null ? q3Var.c(p3Var) : null;
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
        q3Var.d(rectF, c11);
        String b10 = p3Var.b() != null ? p3Var.b() : "";
        if (i10 != 2) {
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
