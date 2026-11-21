package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;

    public /* synthetic */ is(js jsVar, int i7) {
        this.a = i7;
        this.b = jsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                js jsVar = this.b;
                jsVar.c = false;
                jsVar.b.run();
                ArrayList arrayList = jsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jsVar.f > 3600000) {
                    arrayList.clear();
                    jsVar.e = false;
                    jsVar.g = null;
                    jsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
