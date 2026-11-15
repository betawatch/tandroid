package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ il(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i7 = this.a;
        boolean z10 = false;
        boolean z11 = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    org.telegram.messenger.ff photoEntry = q5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    q5Var.setHasSpoiler(z10);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                if (view2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) view2;
                    org.telegram.messenger.ff photoEntry2 = q5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    q5Var2.setHighQuality(z10);
                    break;
                }
                break;
            default:
                Float f10 = (Float) obj;
                wa waVar = ((ra) obj2).b.p;
                if (waVar != null && !z11) {
                    waVar.c(r0.e.getHeight() - f10.floatValue());
                    break;
                }
                break;
        }
    }
}
