package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n7 extends f7 {
    public org.telegram.ui.Cells.q7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.fq s;
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i9 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((l7) arrayList2.get(i9)).d.a.getPath(), 0, ((l7) arrayList2.get(i9)).d.d == 1, 0, 0, 0L));
            i9++;
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (this.s == null) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.X9, false)), org.telegram.ui.ActionBar.f6.R4);
            this.s = fqVar;
            fqVar.w = true;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) q1Var.a;
        hh.a aVar = ((l7) this.e.get(i9)).d;
        Object tag = r7Var.getTag();
        ImageReceiver imageReceiver = r7Var.c;
        boolean z10 = aVar == tag;
        r7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i10 = aVar.d;
        File file = aVar.a;
        if (i10 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.l(max, "_", max), this.s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.l(max, "_", max), this.s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        r7Var.i(this.v.f.j.contains(aVar), z10);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.q7(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new org.telegram.ui.Components.ik0(m7Var);
    }
}
