package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a3 extends k1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ c3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(c3 c3Var, c3 c3Var2) {
        super(c3Var2);
        this.q = c3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        z2 c10;
        c3 c3Var = this.q;
        if (!c3Var.b) {
            return -1;
        }
        ArrayList<b3> tabs = c3Var.getTabs();
        if (tabs.isEmpty() || (c10 = c3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        c3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        c3 c3Var = this.q;
        if (c3Var.b) {
            ArrayList<b3> tabs = c3Var.getTabs();
            if (tabs.isEmpty() || c3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            c3 c3Var = this.q;
            ArrayList<b3> tabs = c3Var.getTabs();
            if (!tabs.isEmpty()) {
                b3 b3Var = tabs.get(0);
                if (i7 == 1) {
                    c3Var.b();
                    return true;
                }
                if (i7 == 2) {
                    c3Var.g(b3Var, new fi.e(7));
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
        c3 c3Var = this.q;
        ArrayList<b3> tabs = c3Var.getTabs();
        b3 b3Var = tabs.isEmpty() ? null : tabs.get(0);
        z2 c10 = b3Var == null ? null : c3Var.c(b3Var);
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
        c3Var.d(rectF, c11);
        String b10 = b3Var.b() != null ? b3Var.b() : "";
        if (i7 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(b10)) {
                str = hd.M0(2131747817, null);
            } else {
                str = hd.M0(2131747817, null) + ", " + b10;
            }
            cVar.j(str);
            return;
        }
        Rect bounds = c10.l.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = hd.M0(2131752041, null);
        } else {
            str2 = hd.M0(2131752041, null) + ", " + b10;
        }
        cVar.j(str2);
    }
}
