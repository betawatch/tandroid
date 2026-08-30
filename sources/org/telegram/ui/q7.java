package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q7 extends i7 {
    public org.telegram.ui.Cells.q7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.nq s;
    public final /* synthetic */ u7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(u7 u7Var) {
        super(u7Var, 1);
        this.v = u7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.i7, org.telegram.ui.h7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((o7) arrayList2.get(i10)).d.a.getPath(), 0, ((o7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.s = nqVar;
            nqVar.w = true;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) l1Var.a;
        mh.a aVar = ((o7) this.e.get(i10)).d;
        Object tag = r7Var.getTag();
        ImageReceiver imageReceiver = r7Var.c;
        boolean z4 = aVar == tag;
        r7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        r7Var.i(this.v.f.j.contains(aVar), z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.q7(viewGroup.getContext(), null);
        }
        p7 p7Var = new p7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        p7Var.setStyle(1);
        return new org.telegram.ui.Components.el0(p7Var);
    }
}
