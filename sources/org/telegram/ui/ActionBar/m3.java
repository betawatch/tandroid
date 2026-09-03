package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ o3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, o3 o3Var2) {
        super(o3Var2);
        this.q = o3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        l3 c3;
        o3 o3Var = this.q;
        if (!o3Var.b) {
            return -1;
        }
        ArrayList<n3> tabs = o3Var.getTabs();
        if (tabs.isEmpty() || (c3 = o3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c10 = c3.c();
        RectF rectF = this.o;
        o3Var.d(rectF, c10);
        Rect bounds = c3.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        o3 o3Var = this.q;
        if (o3Var.b) {
            ArrayList<n3> tabs = o3Var.getTabs();
            if (tabs.isEmpty() || o3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            o3 o3Var = this.q;
            ArrayList<n3> tabs = o3Var.getTabs();
            if (!tabs.isEmpty()) {
                n3 n3Var = tabs.get(0);
                if (i10 == 1) {
                    o3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    o3Var.g(n3Var, new hg.h(2));
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
        o3 o3Var = this.q;
        ArrayList<n3> tabs = o3Var.getTabs();
        n3 n3Var = tabs.isEmpty() ? null : tabs.get(0);
        l3 c3 = n3Var != null ? o3Var.c(n3Var) : null;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.c);
        Rect rect = this.p;
        if (c3 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = c3.c();
        RectF rectF = this.o;
        o3Var.d(rectF, c10);
        String b10 = n3Var.b() != null ? n3Var.b() : "";
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
        Rect bounds = c3.k.getBounds();
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
