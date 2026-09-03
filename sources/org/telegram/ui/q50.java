package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements org.telegram.ui.Components.r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.r5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((r50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                f61 f61Var = (f61) this.b;
                f61Var.getClass();
                if (!mg.g0.b && f61Var.getParent() != null) {
                    ((View) f61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
