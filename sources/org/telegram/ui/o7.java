package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o7 extends g7 {
    public org.telegram.ui.Cells.n7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.dq s;
    public final /* synthetic */ s7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(s7 s7Var) {
        super(s7Var, 1);
        this.v = s7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.g7, org.telegram.ui.f7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((m7) arrayList2.get(i10)).d.a.getPath(), 0, ((m7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.s = dqVar;
            dqVar.w = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) o1Var.a;
        ih.a aVar = ((m7) this.e.get(i10)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.c;
        boolean z10 = aVar == tag;
        o7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.l(max, "_", max), this.s, null, null, 0);
            o7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.l(max, "_", max), this.s, null, null, 0);
            o7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        o7Var.i(this.v.f.j.contains(aVar), z10);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.n7(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        n7Var.setStyle(1);
        return new org.telegram.ui.Components.lk0(n7Var);
    }
}
