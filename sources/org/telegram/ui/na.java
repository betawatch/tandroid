package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ ob a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;

    public /* synthetic */ na(ob obVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f9, float f10) {
        this.a = obVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f9;
        this.h = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ob.V(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
