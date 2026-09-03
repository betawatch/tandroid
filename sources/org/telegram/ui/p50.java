package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p50 implements org.telegram.ui.Components.r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.r5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((q50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                f61 f61Var = (f61) this.b;
                f61Var.getClass();
                if (!ng.g0.b && f61Var.getParent() != null) {
                    ((View) f61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
