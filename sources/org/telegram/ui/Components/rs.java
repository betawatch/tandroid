package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements ss {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rs(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ss
    public final void a(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((us) this.b).b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ss) obj).a(i7, z10);
                }
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
