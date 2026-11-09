package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q30 implements org.telegram.ui.Components.o5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.o5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((r30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                c11 c11Var = (c11) this.b;
                c11Var.getClass();
                if (!ch.e0.b && c11Var.getParent() != null) {
                    ((View) c11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
