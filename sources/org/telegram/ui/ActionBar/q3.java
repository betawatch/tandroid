package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q3 extends j1.b {
    public static final /* synthetic */ int r = 0;
    public final RectF o;
    public final Rect p;
    public final /* synthetic */ s3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(s3 s3Var, s3 s3Var2) {
        super(s3Var2);
        this.q = s3Var;
        this.o = new RectF();
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        p3 c10;
        s3 s3Var = this.q;
        if (!s3Var.b) {
            return -1;
        }
        ArrayList<r3> tabs = s3Var.getTabs();
        if (tabs.isEmpty() || (c10 = s3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float c11 = c10.c();
        RectF rectF = this.o;
        s3Var.d(rectF, c11);
        Rect bounds = c10.l.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()))) {
            return rectF.contains(f7, f10) ? 1 : -1;
        }
        return 2;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        s3 s3Var = this.q;
        if (s3Var.b) {
            ArrayList<r3> tabs = s3Var.getTabs();
            if (tabs.isEmpty() || s3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            s3 s3Var = this.q;
            ArrayList<r3> tabs = s3Var.getTabs();
            if (!tabs.isEmpty()) {
                r3 r3Var = tabs.get(0);
                if (i10 == 1) {
                    s3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    s3Var.g(r3Var, new di.e(7));
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
        s3 s3Var = this.q;
        ArrayList<r3> tabs = s3Var.getTabs();
        r3 r3Var = tabs.isEmpty() ? null : tabs.get(0);
        p3 c10 = r3Var != null ? s3Var.c(r3Var) : null;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.e);
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
        s3Var.d(rectF, c11);
        String b10 = r3Var.b() != null ? r3Var.b() : "";
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
        Rect bounds = c10.l.getBounds();
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
