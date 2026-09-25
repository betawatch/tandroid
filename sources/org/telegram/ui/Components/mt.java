package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements nt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.nt
    public final void a(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((pt) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((nt) obj).a(i10, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
