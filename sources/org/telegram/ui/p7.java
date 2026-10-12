package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p7 extends k7 {
    public final ArrayList n;
    public final /* synthetic */ w7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(w7 w7Var) {
        super(w7Var, 2);
        this.r = w7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.k7, org.telegram.ui.j7
    public final void F() {
        super.F();
        ArrayList arrayList = this.n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((q7) arrayList2.get(i10)).d.a.getPath(), 0, ((q7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) o7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        ai.b bVar = ((q7) arrayList.get(i10)).d;
        boolean z10 = bVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(bVar);
        File file = bVar.a;
        k7Var.d(bVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            k7Var.setPhoto(file.getPath());
        }
        k7Var.getImageView().setRoundRadius(AndroidUtilities.dp(bVar.h == 5 ? 20.0f : 4.0f));
        o7Var.d = z11;
        o7Var.c.setText(AndroidUtilities.formatFileSize(bVar.c));
        o7Var.a.a(this.r.f.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.b.addView(new org.telegram.ui.Cells.k7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.wl0(o7Var);
    }
}
