package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n40 implements org.telegram.ui.Components.l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n40(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.l5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((o40) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                s21 s21Var = (s21) this.b;
                s21Var.getClass();
                if (!sg.e0.b && s21Var.getParent() != null) {
                    ((View) s21Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
