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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k7 extends f7 {
    public final ArrayList n;
    public final /* synthetic */ r7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(r7 r7Var) {
        super(r7Var, 2);
        this.r = r7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.f7, org.telegram.ui.e7
    public final void F() {
        super.F();
        ArrayList arrayList = this.n;
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
        View view = q1Var.a;
        j7 j7Var = (j7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) j7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        hh.a aVar = ((l7) arrayList.get(i9)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i9 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        i7Var.d(z11, aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), 0, LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        i7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        j7Var.d = z11;
        j7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        j7Var.a.a(this.r.f.j.contains(aVar), z10);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 0);
        j7Var.e = 2;
        j7Var.b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.ik0(j7Var);
    }
}
