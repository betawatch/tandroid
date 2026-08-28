package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dl(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.b = obj;
        this.c = z10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i9 = this.a;
        boolean z10 = false;
        boolean z11 = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    t5Var.setHasSpoiler(z10);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.m1;
                if (view2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) view2;
                    MediaController.PhotoEntry photoEntry2 = t5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    t5Var2.setHighQuality(z10);
                    break;
                }
                break;
            default:
                Float f10 = (Float) obj;
                fb fbVar = ((ab) obj2).b.p;
                if (fbVar != null && !z11) {
                    fbVar.c(r0.e.getHeight() - f10.floatValue());
                    break;
                }
                break;
        }
    }
}
