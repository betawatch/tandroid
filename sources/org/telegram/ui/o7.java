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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o7 extends j7 {
    public final ArrayList n;
    public final /* synthetic */ v7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(v7 v7Var) {
        super(v7Var, 2);
        this.r = v7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.j7, org.telegram.ui.i7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((p7) arrayList2.get(i10)).d.a.getPath(), 0, ((p7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        n7 n7Var = (n7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) n7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        bi.b bVar = ((p7) arrayList.get(i10)).d;
        boolean z10 = bVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(bVar);
        File file = bVar.a;
        i7Var.d(bVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        i7Var.getImageView().setRoundRadius(AndroidUtilities.dp(bVar.h == 5 ? 20.0f : 4.0f));
        n7Var.d = z11;
        n7Var.c.setText(AndroidUtilities.formatFileSize(bVar.c));
        n7Var.a.a(this.r.f.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n7 n7Var = new n7(this, viewGroup.getContext(), 0);
        n7Var.e = 2;
        n7Var.b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.tl0(n7Var);
    }
}
