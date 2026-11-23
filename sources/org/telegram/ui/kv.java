package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kv extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ bx Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(bx bxVar, Context context, bx bxVar2, int i7) {
        super(context, bxVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = bxVar;
                super(context, bxVar2, false);
                break;
            default:
                this.Z0 = bxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                bx bxVar = this.Z0;
                bxVar.L1.j(bxVar.I1, i7 == 0, true);
                break;
            default:
                bx bxVar2 = this.Z0;
                bxVar2.L1.j(bxVar2.K1, i7 == 0, true);
                break;
        }
    }
}
