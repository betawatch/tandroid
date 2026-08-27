package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fc1 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final ArrayList d;

    public fc1(Context context) {
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2();
        k2Var.a = LocaleController.getString(R.string.ThemePreviewDialog1);
        k2Var.b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        k2Var.c = 0;
        k2Var.d = 0;
        k2Var.e = true;
        k2Var.f = false;
        k2Var.g = 0;
        k2Var.h = currentTimeMillis;
        k2Var.i = false;
        k2Var.j = false;
        k2Var.k = 2;
        arrayList.add(k2Var);
        org.telegram.ui.Cells.k2 k2Var2 = new org.telegram.ui.Cells.k2();
        k2Var2.a = LocaleController.getString(R.string.ThemePreviewDialog2);
        k2Var2.b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        k2Var2.c = 1;
        k2Var2.d = 2;
        k2Var2.e = false;
        k2Var2.f = false;
        k2Var2.g = 0;
        k2Var2.h = currentTimeMillis - 3600;
        k2Var2.i = false;
        k2Var2.j = false;
        k2Var2.k = -1;
        arrayList.add(k2Var2);
        org.telegram.ui.Cells.k2 k2Var3 = new org.telegram.ui.Cells.k2();
        k2Var3.a = LocaleController.getString(R.string.ThemePreviewDialog3);
        k2Var3.b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        k2Var3.c = 2;
        k2Var3.d = 3;
        k2Var3.e = false;
        k2Var3.f = true;
        k2Var3.g = 0;
        k2Var3.h = currentTimeMillis - 7200;
        k2Var3.i = false;
        k2Var3.j = true;
        k2Var3.k = -1;
        arrayList.add(k2Var3);
        org.telegram.ui.Cells.k2 k2Var4 = new org.telegram.ui.Cells.k2();
        k2Var4.a = LocaleController.getString(R.string.ThemePreviewDialog4);
        k2Var4.b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        k2Var4.c = 3;
        k2Var4.d = 0;
        k2Var4.e = false;
        k2Var4.f = false;
        k2Var4.g = 2;
        k2Var4.h = currentTimeMillis - 10800;
        k2Var4.i = false;
        k2Var4.j = false;
        k2Var4.k = -1;
        arrayList.add(k2Var4);
        org.telegram.ui.Cells.k2 k2Var5 = new org.telegram.ui.Cells.k2();
        k2Var5.a = LocaleController.getString(R.string.ThemePreviewDialog5);
        k2Var5.b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        k2Var5.c = 4;
        k2Var5.d = 0;
        k2Var5.e = false;
        k2Var5.f = false;
        k2Var5.g = 1;
        k2Var5.h = currentTimeMillis - 14400;
        k2Var5.i = false;
        k2Var5.j = false;
        k2Var5.k = 2;
        arrayList.add(k2Var5);
        org.telegram.ui.Cells.k2 k2Var6 = new org.telegram.ui.Cells.k2();
        k2Var6.a = LocaleController.getString(R.string.ThemePreviewDialog6);
        k2Var6.b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        k2Var6.c = 5;
        k2Var6.d = 0;
        k2Var6.e = false;
        k2Var6.f = false;
        k2Var6.g = 0;
        k2Var6.h = currentTimeMillis - 18000;
        k2Var6.i = false;
        k2Var6.j = false;
        k2Var6.k = -1;
        arrayList.add(k2Var6);
        org.telegram.ui.Cells.k2 k2Var7 = new org.telegram.ui.Cells.k2();
        k2Var7.a = LocaleController.getString(R.string.ThemePreviewDialog7);
        k2Var7.b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        k2Var7.c = 6;
        k2Var7.d = 0;
        k2Var7.e = false;
        k2Var7.f = false;
        k2Var7.g = 0;
        k2Var7.h = currentTimeMillis - 21600;
        k2Var7.i = true;
        k2Var7.j = false;
        k2Var7.k = -1;
        arrayList.add(k2Var7);
        org.telegram.ui.Cells.k2 k2Var8 = new org.telegram.ui.Cells.k2();
        k2Var8.a = LocaleController.getString(R.string.ThemePreviewDialog8);
        k2Var8.b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        k2Var8.c = 0;
        k2Var8.d = 0;
        k2Var8.e = false;
        k2Var8.f = false;
        k2Var8.g = 0;
        k2Var8.h = currentTimeMillis - 25200;
        k2Var8.i = true;
        k2Var8.j = false;
        k2Var8.k = -1;
        arrayList.add(k2Var8);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f != 1;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) o1Var.a;
            ArrayList arrayList = this.d;
            p2Var.o2 = i10 != arrayList.size() - 1;
            p2Var.setDialog((org.telegram.ui.Cells.k2) arrayList.get(i10));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View p2Var = i10 == 0 ? new org.telegram.ui.Cells.p2(context, false) : new org.telegram.ui.Cells.p4(context);
        p2Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(p2Var);
    }
}
