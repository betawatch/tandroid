package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ v60(float f10, float f11, int i7, View view) {
        this.a = i7;
        this.d = view;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((w60) this.d).y.addPath((Path) obj, this.b, this.c);
                break;
            default:
                ((org.telegram.ui.Cells.p7) this.d).n(this.b, this.c);
                break;
        }
    }
}
