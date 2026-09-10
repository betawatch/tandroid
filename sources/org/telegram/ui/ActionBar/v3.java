package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v3 extends j1.b {
    public final Rect o;
    public final /* synthetic */ z3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(z3 z3Var, z3 z3Var2) {
        super(z3Var2);
        this.p = z3Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        z3 z3Var = this.p;
        ArrayList arrayList = z3Var.R;
        if (z3Var.V < 0.5f) {
            return -1;
        }
        org.telegram.ui.Cells.z zVar = z3Var.i0;
        if (zVar != null && zVar.getBounds().contains((int) f7, (int) f10)) {
            return 1;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y3 y3Var = (y3) arrayList.get(size);
            float f11 = y3Var.i;
            RectF rectF = y3Var.a;
            if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                Rect bounds = y3Var.d.k.getBounds();
                return (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) ((f10 - rectF.top) - ((float) AndroidUtilities.dp(24.0f))))) ? size + MediaDataController.MAX_STYLE_RUNS_COUNT : size + 2000;
            }
        }
        return -1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        z3 z3Var = this.p;
        ArrayList arrayList2 = z3Var.R;
        if (z3Var.V < 0.5f) {
            return;
        }
        org.telegram.ui.Cells.z zVar = z3Var.i0;
        if (zVar != null && !zVar.getBounds().isEmpty()) {
            arrayList.add(1);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            y3 y3Var = (y3) arrayList2.get(i10);
            if (Math.abs(y3Var.i) < 0.4f && !y3Var.a.isEmpty()) {
                arrayList.add(Integer.valueOf(i10 + MediaDataController.MAX_STYLE_RUNS_COUNT));
                n3 n3Var = y3Var.d;
                if (n3Var != null && !n3Var.k.getBounds().isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 2000));
                }
            }
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        z3 z3Var = this.p;
        ArrayList arrayList = z3Var.R;
        if (i11 == 16) {
            if (i10 == 1) {
                q3 q3Var = z3Var.a;
                if (q3Var != null) {
                    q3Var.f();
                }
                z3Var.a(false);
                return true;
            }
            if (i10 >= 2000) {
                i12 = i10 - 2000;
                z10 = true;
            } else if (i10 >= 1000) {
                i12 = i10 - MediaDataController.MAX_STYLE_RUNS_COUNT;
                z10 = false;
            }
            if (i12 >= 0 && i12 < arrayList.size()) {
                y3 y3Var = (y3) arrayList.get(i12);
                if (z10) {
                    q3 q3Var2 = z3Var.a;
                    if (q3Var2 != null) {
                        q3Var2.g(y3Var.c, new bi.y2(25, this, y3Var));
                        return true;
                    }
                } else if (z3Var.a != null) {
                    z3Var.a(false);
                    y3Var.getClass();
                    z3Var.a.e(y3Var.c);
                }
                return true;
            }
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        int i11;
        boolean z10;
        String str;
        String str2;
        z3 z3Var = this.p;
        ArrayList arrayList = z3Var.R;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.c);
        Rect rect = this.o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = z3Var.i0;
            if (zVar != null) {
                rect.set(zVar.getBounds());
            } else {
                rect.set(0, 0, 1, 1);
                dVar.p(false);
            }
            dVar.h(rect);
            dVar.j(LocaleController.getString(R.string.BotCloseAllTabs));
            return;
        }
        if (i10 >= 2000) {
            i11 = i10 - 2000;
            z10 = true;
        } else {
            if (i10 < 1000) {
                rect.set(0, 0, 1, 1);
                dVar.h(rect);
                dVar.p(false);
                return;
            }
            i11 = i10 - MediaDataController.MAX_STYLE_RUNS_COUNT;
            z10 = false;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            return;
        }
        y3 y3Var = (y3) arrayList.get(i11);
        p3 p3Var = y3Var.c;
        RectF rectF = y3Var.a;
        String b10 = (p3Var == null || p3Var.b() == null) ? "" : y3Var.c.b();
        if (!z10) {
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
        Rect bounds = y3Var.d.k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
        dVar.h(rect);
        if (TextUtils.isEmpty(b10)) {
            str2 = LocaleController.getString(R.string.Close);
        } else {
            str2 = LocaleController.getString(R.string.Close) + ", " + b10;
        }
        dVar.j(str2);
    }
}
