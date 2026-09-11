package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final int g(float f7, float f10) {
        l3 c10;
        o3 o3Var = this.q;
        if (!o3Var.b) {
            return -1;
        }
        ArrayList<n3> tabs = o3Var.getTabs();
        if (tabs.isEmpty() || (c10 = o3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        o3Var.d(rectF, c11);
        Rect bounds = c10.k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()))) {
            return rectF.contains(f7, f10) ? 1 : -1;
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
                    o3Var.g(n3Var, new j3(1));
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
        o3 o3Var = this.q;
        ArrayList<n3> tabs = o3Var.getTabs();
        n3 n3Var = tabs.isEmpty() ? null : tabs.get(0);
        l3 c10 = n3Var != null ? o3Var.c(n3Var) : null;
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
        o3Var.d(rectF, c11);
        String b10 = n3Var.b() != null ? n3Var.b() : "";
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
        Rect bounds = c10.k.getBounds();
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
