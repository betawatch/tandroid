package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ t60(float f10, float f11, int i7, View view) {
        this.a = i7;
        this.d = view;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((u60) this.d).y.addPath((Path) obj, this.b, this.c);
                break;
            default:
                ((org.telegram.ui.Cells.o7) this.d).n(this.b, this.c);
                break;
        }
    }
}
