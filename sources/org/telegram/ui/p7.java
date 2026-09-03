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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) o7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        mh.a aVar = ((q7) arrayList.get(i10)).d;
        boolean z4 = aVar == view.getTag();
        boolean z10 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        h7Var.d(aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z10);
        if (!z4) {
            h7Var.setPhoto(file.getPath());
        }
        h7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        o7Var.d = z10;
        o7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        o7Var.a.a(this.r.f.j.contains(aVar), z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.b.addView(new org.telegram.ui.Cells.h7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.dl0(o7Var);
    }
}
