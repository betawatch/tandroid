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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l7 extends g7 {
    public final ArrayList n;
    public final /* synthetic */ s7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(s7 s7Var) {
        super(s7Var, 2);
        this.r = s7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.g7, org.telegram.ui.f7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((m7) arrayList2.get(i10)).d.a.getPath(), 0, ((m7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) k7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        ih.a aVar = ((m7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        f7Var.d(z11, aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), 0, LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null);
        if (!z10) {
            f7Var.setPhoto(file.getPath());
        }
        f7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        k7Var.d = z11;
        k7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        k7Var.a.a(this.r.f.j.contains(aVar), z10);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.e = 2;
        k7Var.b.addView(new org.telegram.ui.Cells.f7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.lk0(k7Var);
    }
}
