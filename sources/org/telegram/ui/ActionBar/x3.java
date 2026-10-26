package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x3 extends j1.b {
    public final Rect o;
    public final /* synthetic */ b4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(b4 b4Var, b4 b4Var2) {
        super(b4Var2);
        this.p = b4Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        b4 b4Var = this.p;
        ArrayList arrayList = b4Var.R;
        if (b4Var.V < 0.5f) {
            return -1;
        }
        org.telegram.ui.Cells.y yVar = b4Var.i0;
        if (yVar != null && yVar.getBounds().contains((int) f7, (int) f10)) {
            return 1;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a4 a4Var = (a4) arrayList.get(size);
            float f11 = a4Var.i;
            RectF rectF = a4Var.a;
            if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                Rect bounds = a4Var.d.l.getBounds();
                return (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) ((f10 - rectF.top) - ((float) AndroidUtilities.dp(24.0f))))) ? size + MediaDataController.MAX_STYLE_RUNS_COUNT : size + 2000;
            }
        }
        return -1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        b4 b4Var = this.p;
        ArrayList arrayList2 = b4Var.R;
        if (b4Var.V < 0.5f) {
            return;
        }
        org.telegram.ui.Cells.y yVar = b4Var.i0;
        if (yVar != null && !yVar.getBounds().isEmpty()) {
            arrayList.add(1);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a4 a4Var = (a4) arrayList2.get(i10);
            if (Math.abs(a4Var.i) < 0.4f && !a4Var.a.isEmpty()) {
                arrayList.add(Integer.valueOf(i10 + MediaDataController.MAX_STYLE_RUNS_COUNT));
                p3 p3Var = a4Var.d;
                if (p3Var != null && !p3Var.l.getBounds().isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 2000));
                }
            }
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        b4 b4Var = this.p;
        ArrayList arrayList = b4Var.R;
        if (i11 == 16) {
            if (i10 == 1) {
                s3 s3Var = b4Var.a;
                if (s3Var != null) {
                    s3Var.f();
                }
                b4Var.a(false);
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
                a4 a4Var = (a4) arrayList.get(i12);
                if (z10) {
                    s3 s3Var2 = b4Var.a;
                    if (s3Var2 != null) {
                        s3Var2.g(a4Var.c, new li.s2(4, this, a4Var));
                        return true;
                    }
                } else if (b4Var.a != null) {
                    b4Var.a(false);
                    a4Var.getClass();
                    b4Var.a.e(a4Var.c);
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
        b4 b4Var = this.p;
        ArrayList arrayList = b4Var.R;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.e);
        Rect rect = this.o;
        if (i10 == 1) {
            org.telegram.ui.Cells.y yVar = b4Var.i0;
            if (yVar != null) {
                rect.set(yVar.getBounds());
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
        a4 a4Var = (a4) arrayList.get(i11);
        r3 r3Var = a4Var.c;
        RectF rectF = a4Var.a;
        String b10 = (r3Var == null || r3Var.b() == null) ? "" : a4Var.c.b();
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
        Rect bounds = a4Var.d.l.getBounds();
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
