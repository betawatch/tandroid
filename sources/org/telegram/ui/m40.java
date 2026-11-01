package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m40 implements org.telegram.ui.Components.l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m40(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.l5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((n40) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                q21 q21Var = (q21) this.b;
                q21Var.getClass();
                if (!sg.e0.b && q21Var.getParent() != null) {
                    ((View) q21Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
