package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public final void a(int i10, boolean z4) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((jt) this.b).b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((gt) obj).a(i10, z4);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
