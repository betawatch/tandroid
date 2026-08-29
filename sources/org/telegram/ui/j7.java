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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j7 extends e7 {
    public final ArrayList n;
    public final /* synthetic */ q7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(q7 q7Var) {
        super(q7Var, 2);
        this.r = q7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.e7, org.telegram.ui.d7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((k7) arrayList2.get(i10)).d.a.getPath(), 0, ((k7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
        i7 i7Var = (i7) view;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) i7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        kh.a aVar = ((k7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        g7Var.d(z11, aVar.h == 5 ? LocaleController.getString(R.string.AttachRound) : file.getName(), 0, LocaleController.formatDateAudio(file.lastModified() / 1000, true), Utilities.getExtension(file.getName()), null);
        if (!z10) {
            g7Var.setPhoto(file.getPath());
        }
        g7Var.getImageView().setRoundRadius(AndroidUtilities.dp(aVar.h == 5 ? 20.0f : 4.0f));
        i7Var.d = z11;
        i7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        i7Var.a.a(this.r.f.j.contains(aVar), z10);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var = new i7(this, viewGroup.getContext(), 0);
        i7Var.e = 2;
        i7Var.b.addView(new org.telegram.ui.Cells.g7(viewGroup.getContext(), 3, null));
        return new org.telegram.ui.Components.vk0(i7Var);
    }
}
