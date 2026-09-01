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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n7 extends i7 {
    public final ArrayList n;
    public final /* synthetic */ u7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(u7 u7Var) {
        super(u7Var, 2);
        this.r = u7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.i7, org.telegram.ui.h7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((o7) arrayList2.get(i10)).d.a.getPath(), 0, ((o7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) m7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        nh.a aVar = ((o7) arrayList.get(i10)).d;
        boolean z4 = aVar == view.getTag();
        boolean z10 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        i7Var.d(aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z10);
        if (!z4) {
            i7Var.setPhoto(file.getPath());
        }
        i7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        m7Var.d = z10;
        m7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        m7Var.a.a(this.r.f.j.contains(aVar), z4);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.e = 2;
        m7Var.b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.fl0(m7Var);
    }
}
