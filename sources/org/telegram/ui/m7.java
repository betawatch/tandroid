package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m7 extends e7 {
    public org.telegram.ui.Cells.o7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.jq s;
    public final /* synthetic */ q7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(q7 q7Var) {
        super(q7Var, 1);
        this.v = q7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.e7, org.telegram.ui.d7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((k7) arrayList2.get(i10)).d.a.getPath(), 0, ((k7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.s = jqVar;
            jqVar.w = true;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) n1Var.a;
        kh.a aVar = ((k7) this.e.get(i10)).d;
        Object tag = p7Var.getTag();
        ImageReceiver imageReceiver = p7Var.c;
        boolean z10 = aVar == tag;
        p7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.k(max, "_", max), this.s, null, null, 0);
            p7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.k(max, "_", max), this.s, null, null, 0);
            p7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        p7Var.i(this.v.f.j.contains(aVar), z10);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.o7(viewGroup.getContext(), null);
        }
        l7 l7Var = new l7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        l7Var.setStyle(1);
        return new org.telegram.ui.Components.vk0(l7Var);
    }
}
