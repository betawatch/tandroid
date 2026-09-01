package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                a61 a61Var = (a61) this.b;
                a61Var.getClass();
                if (!ng.g0.b && a61Var.getParent() != null) {
                    ((View) a61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
