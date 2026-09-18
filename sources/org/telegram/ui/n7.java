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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) m7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        zh.a aVar = ((o7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        j7Var.d(aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            j7Var.setPhoto(file.getPath());
        }
        j7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        m7Var.d = z11;
        m7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        m7Var.a.a(this.r.f.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.e = 2;
        m7Var.b.addView(new org.telegram.ui.Cells.j7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.wk0(m7Var);
    }
}
