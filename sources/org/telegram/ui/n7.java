package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n7 extends f7 {
    public org.telegram.ui.Cells.t7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.vq s;
    public final /* synthetic */ r7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(r7 r7Var) {
        super(r7Var, 1);
        this.v = r7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.f7, org.telegram.ui.e7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((l7) arrayList2.get(i10)).d.a.getPath(), 0, ((l7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.s = vqVar;
            vqVar.w = true;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) c1Var.a;
        yh.a aVar = ((l7) this.e.get(i10)).d;
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
        m7 m7Var = new m7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new org.telegram.ui.Components.fl0(m7Var);
    }
}
