package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ml(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        boolean z10 = false;
        boolean z11 = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    MediaController.PhotoEntry photoEntry = u5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    u5Var.setHasSpoiler(z10);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                if (view2 instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var2 = (org.telegram.ui.Cells.u5) view2;
                    MediaController.PhotoEntry photoEntry2 = u5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    u5Var2.setHighQuality(z10);
                    break;
                }
                break;
            default:
                Float f7 = (Float) obj;
                nb nbVar = ((ib) obj2).b.p;
                if (nbVar != null && !z11) {
                    nbVar.c(r0.e.getHeight() - f7.floatValue());
                    break;
                }
                break;
        }
    }
}
