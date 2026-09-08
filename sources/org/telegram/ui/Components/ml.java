package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    s5Var.setHasSpoiler(z10);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                if (view2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) view2;
                    MediaController.PhotoEntry photoEntry2 = s5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    s5Var2.setHighQuality(z10);
                    break;
                }
                break;
            default:
                Float f7 = (Float) obj;
                ob obVar = ((jb) obj2).b.p;
                if (obVar != null && !z11) {
                    obVar.c(r0.e.getHeight() - f7.floatValue());
                    break;
                }
                break;
        }
    }
}
