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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p7 extends k7 {
    public final ArrayList n;
    public final /* synthetic */ x7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(x7 x7Var) {
        super(x7Var, 2);
        this.r = x7Var;
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) o7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        ci.a aVar = ((q7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        o7Var2.d(aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            o7Var2.setPhoto(file.getPath());
        }
        o7Var2.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        o7Var.d = z11;
        o7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        o7Var.a.a(this.r.h.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.b.addView(new org.telegram.ui.Cells.o7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.wl0(o7Var);
    }
}
