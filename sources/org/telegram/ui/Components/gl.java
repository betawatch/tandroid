package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gl(int i10, Object obj, boolean z10) {
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
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    org.telegram.messenger.ef photoEntry = v5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    v5Var.setHasSpoiler(z10);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                if (view2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) view2;
                    org.telegram.messenger.ef photoEntry2 = v5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    v5Var2.setHighQuality(z10);
                    break;
                }
                break;
            default:
                Float f7 = (Float) obj;
                ua uaVar = ((pa) obj2).b.p;
                if (uaVar != null && !z11) {
                    uaVar.c(r0.e.getHeight() - f7.floatValue());
                    break;
                }
                break;
        }
    }
}
