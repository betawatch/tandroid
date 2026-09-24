package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gd1 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final ArrayList d;

    public gd1(Context context) {
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2();
        n2Var.a = LocaleController.getString(R.string.ThemePreviewDialog1);
        n2Var.b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        n2Var.c = 0;
        n2Var.d = 0;
        n2Var.e = true;
        n2Var.f = false;
        n2Var.g = 0;
        n2Var.h = currentTimeMillis;
        n2Var.i = false;
        n2Var.j = false;
        n2Var.k = 2;
        arrayList.add(n2Var);
        org.telegram.ui.Cells.n2 n2Var2 = new org.telegram.ui.Cells.n2();
        n2Var2.a = LocaleController.getString(R.string.ThemePreviewDialog2);
        n2Var2.b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        n2Var2.c = 1;
        n2Var2.d = 2;
        n2Var2.e = false;
        n2Var2.f = false;
        n2Var2.g = 0;
        n2Var2.h = currentTimeMillis - 3600;
        n2Var2.i = false;
        n2Var2.j = false;
        n2Var2.k = -1;
        arrayList.add(n2Var2);
        org.telegram.ui.Cells.n2 n2Var3 = new org.telegram.ui.Cells.n2();
        n2Var3.a = LocaleController.getString(R.string.ThemePreviewDialog3);
        n2Var3.b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        n2Var3.c = 2;
        n2Var3.d = 3;
        n2Var3.e = false;
        n2Var3.f = true;
        n2Var3.g = 0;
        n2Var3.h = currentTimeMillis - 7200;
        n2Var3.i = false;
        n2Var3.j = true;
        n2Var3.k = -1;
        arrayList.add(n2Var3);
        org.telegram.ui.Cells.n2 n2Var4 = new org.telegram.ui.Cells.n2();
        n2Var4.a = LocaleController.getString(R.string.ThemePreviewDialog4);
        n2Var4.b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        n2Var4.c = 3;
        n2Var4.d = 0;
        n2Var4.e = false;
        n2Var4.f = false;
        n2Var4.g = 2;
        n2Var4.h = currentTimeMillis - 10800;
        n2Var4.i = false;
        n2Var4.j = false;
        n2Var4.k = -1;
        arrayList.add(n2Var4);
        org.telegram.ui.Cells.n2 n2Var5 = new org.telegram.ui.Cells.n2();
        n2Var5.a = LocaleController.getString(R.string.ThemePreviewDialog5);
        n2Var5.b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        n2Var5.c = 4;
        n2Var5.d = 0;
        n2Var5.e = false;
        n2Var5.f = false;
        n2Var5.g = 1;
        n2Var5.h = currentTimeMillis - 14400;
        n2Var5.i = false;
        n2Var5.j = false;
        n2Var5.k = 2;
        arrayList.add(n2Var5);
        org.telegram.ui.Cells.n2 n2Var6 = new org.telegram.ui.Cells.n2();
        n2Var6.a = LocaleController.getString(R.string.ThemePreviewDialog6);
        n2Var6.b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        n2Var6.c = 5;
        n2Var6.d = 0;
        n2Var6.e = false;
        n2Var6.f = false;
        n2Var6.g = 0;
        n2Var6.h = currentTimeMillis - 18000;
        n2Var6.i = false;
        n2Var6.j = false;
        n2Var6.k = -1;
        arrayList.add(n2Var6);
        org.telegram.ui.Cells.n2 n2Var7 = new org.telegram.ui.Cells.n2();
        n2Var7.a = LocaleController.getString(R.string.ThemePreviewDialog7);
        n2Var7.b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        n2Var7.c = 6;
        n2Var7.d = 0;
        n2Var7.e = false;
        n2Var7.f = false;
        n2Var7.g = 0;
        n2Var7.h = currentTimeMillis - 21600;
        n2Var7.i = true;
        n2Var7.j = false;
        n2Var7.k = -1;
        arrayList.add(n2Var7);
        org.telegram.ui.Cells.n2 n2Var8 = new org.telegram.ui.Cells.n2();
        n2Var8.a = LocaleController.getString(R.string.ThemePreviewDialog8);
        n2Var8.b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        n2Var8.c = 0;
        n2Var8.d = 0;
        n2Var8.e = false;
        n2Var8.f = false;
        n2Var8.g = 0;
        n2Var8.h = currentTimeMillis - 25200;
        n2Var8.i = true;
        n2Var8.j = false;
        n2Var8.k = -1;
        arrayList.add(n2Var8);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.a;
            ArrayList arrayList = this.d;
            s2Var.s2 = i10 != arrayList.size() - 1;
            s2Var.setDialog((org.telegram.ui.Cells.n2) arrayList.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View s2Var = i10 == 0 ? new org.telegram.ui.Cells.s2(context, false) : new org.telegram.ui.Cells.s4(context);
        s2Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(s2Var);
    }
}
