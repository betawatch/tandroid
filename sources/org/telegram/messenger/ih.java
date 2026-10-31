package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ ih(ri riVar, ArrayList arrayList, String str, int i10) {
        this.a = i10;
        this.b = riVar;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new ih(this.b, this.c, this.d, 2));
                break;
            case 1:
                ArrayList arrayList = this.c;
                this.b.c(this.d, arrayList);
                break;
            default:
                ArrayList arrayList2 = this.c;
                this.b.c(this.d, arrayList2);
                break;
        }
    }
}
