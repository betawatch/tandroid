package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bd1 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final ArrayList d;

    public bd1(Context context) {
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.l2 l2Var = new org.telegram.ui.Cells.l2();
        l2Var.a = LocaleController.getString(R.string.ThemePreviewDialog1);
        l2Var.b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        l2Var.c = 0;
        l2Var.d = 0;
        l2Var.e = true;
        l2Var.f = false;
        l2Var.g = 0;
        l2Var.h = currentTimeMillis;
        l2Var.i = false;
        l2Var.j = false;
        l2Var.k = 2;
        arrayList.add(l2Var);
        org.telegram.ui.Cells.l2 l2Var2 = new org.telegram.ui.Cells.l2();
        l2Var2.a = LocaleController.getString(R.string.ThemePreviewDialog2);
        l2Var2.b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        l2Var2.c = 1;
        l2Var2.d = 2;
        l2Var2.e = false;
        l2Var2.f = false;
        l2Var2.g = 0;
        l2Var2.h = currentTimeMillis - 3600;
        l2Var2.i = false;
        l2Var2.j = false;
        l2Var2.k = -1;
        arrayList.add(l2Var2);
        org.telegram.ui.Cells.l2 l2Var3 = new org.telegram.ui.Cells.l2();
        l2Var3.a = LocaleController.getString(R.string.ThemePreviewDialog3);
        l2Var3.b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        l2Var3.c = 2;
        l2Var3.d = 3;
        l2Var3.e = false;
        l2Var3.f = true;
        l2Var3.g = 0;
        l2Var3.h = currentTimeMillis - 7200;
        l2Var3.i = false;
        l2Var3.j = true;
        l2Var3.k = -1;
        arrayList.add(l2Var3);
        org.telegram.ui.Cells.l2 l2Var4 = new org.telegram.ui.Cells.l2();
        l2Var4.a = LocaleController.getString(R.string.ThemePreviewDialog4);
        l2Var4.b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        l2Var4.c = 3;
        l2Var4.d = 0;
        l2Var4.e = false;
        l2Var4.f = false;
        l2Var4.g = 2;
        l2Var4.h = currentTimeMillis - 10800;
        l2Var4.i = false;
        l2Var4.j = false;
        l2Var4.k = -1;
        arrayList.add(l2Var4);
        org.telegram.ui.Cells.l2 l2Var5 = new org.telegram.ui.Cells.l2();
        l2Var5.a = LocaleController.getString(R.string.ThemePreviewDialog5);
        l2Var5.b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        l2Var5.c = 4;
        l2Var5.d = 0;
        l2Var5.e = false;
        l2Var5.f = false;
        l2Var5.g = 1;
        l2Var5.h = currentTimeMillis - 14400;
        l2Var5.i = false;
        l2Var5.j = false;
        l2Var5.k = 2;
        arrayList.add(l2Var5);
        org.telegram.ui.Cells.l2 l2Var6 = new org.telegram.ui.Cells.l2();
        l2Var6.a = LocaleController.getString(R.string.ThemePreviewDialog6);
        l2Var6.b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        l2Var6.c = 5;
        l2Var6.d = 0;
        l2Var6.e = false;
        l2Var6.f = false;
        l2Var6.g = 0;
        l2Var6.h = currentTimeMillis - 18000;
        l2Var6.i = false;
        l2Var6.j = false;
        l2Var6.k = -1;
        arrayList.add(l2Var6);
        org.telegram.ui.Cells.l2 l2Var7 = new org.telegram.ui.Cells.l2();
        l2Var7.a = LocaleController.getString(R.string.ThemePreviewDialog7);
        l2Var7.b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        l2Var7.c = 6;
        l2Var7.d = 0;
        l2Var7.e = false;
        l2Var7.f = false;
        l2Var7.g = 0;
        l2Var7.h = currentTimeMillis - 21600;
        l2Var7.i = true;
        l2Var7.j = false;
        l2Var7.k = -1;
        arrayList.add(l2Var7);
        org.telegram.ui.Cells.l2 l2Var8 = new org.telegram.ui.Cells.l2();
        l2Var8.a = LocaleController.getString(R.string.ThemePreviewDialog8);
        l2Var8.b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        l2Var8.c = 0;
        l2Var8.d = 0;
        l2Var8.e = false;
        l2Var8.f = false;
        l2Var8.g = 0;
        l2Var8.h = currentTimeMillis - 25200;
        l2Var8.i = true;
        l2Var8.j = false;
        l2Var8.k = -1;
        arrayList.add(l2Var8);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f != 1;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.a;
            ArrayList arrayList = this.d;
            q2Var.p2 = i10 != arrayList.size() - 1;
            q2Var.setDialog((org.telegram.ui.Cells.l2) arrayList.get(i10));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View q2Var = i10 == 0 ? new org.telegram.ui.Cells.q2(context, false) : new org.telegram.ui.Cells.r4(context);
        q2Var.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.dl0(q2Var);
    }
}
