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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class m7 extends h7 {
    public final ArrayList n;
    public final /* synthetic */ t7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(t7 t7Var) {
        super(t7Var, 2);
        this.r = t7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.h7, org.telegram.ui.g7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((n7) arrayList2.get(i10)).d.a.getPath(), 0, ((n7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        l7 l7Var = (l7) view;
        org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) l7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        zh.a aVar = ((n7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        l7Var2.d(aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            l7Var2.setPhoto(file.getPath());
        }
        l7Var2.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        l7Var.d = z11;
        l7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        l7Var.a.a(this.r.f.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 0);
        l7Var.e = 2;
        l7Var.b.addView(new org.telegram.ui.Cells.l7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.fl0(l7Var);
    }
}
