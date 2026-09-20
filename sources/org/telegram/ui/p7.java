package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class p7 extends h7 {
    public org.telegram.ui.Cells.t7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.pq s;
    public final /* synthetic */ t7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(t7 t7Var) {
        super(t7Var, 1);
        this.v = t7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.h7, org.telegram.ui.g7
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((n7) arrayList2.get(i10)).d.a.getPath(), 0, ((n7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.s = pqVar;
            pqVar.w = true;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) c1Var.a;
        zh.a aVar = ((n7) this.e.get(i10)).d;
        Object tag = u7Var.getTag();
        ImageReceiver imageReceiver = u7Var.c;
        boolean z10 = aVar == tag;
        u7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        u7Var.i(this.v.f.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.t7(viewGroup.getContext(), null);
        }
        o7 o7Var = new o7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        o7Var.setStyle(1);
        return new org.telegram.ui.Components.fl0(o7Var);
    }
}
