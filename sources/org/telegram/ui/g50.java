package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g50 implements org.telegram.ui.Components.z5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.z5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((h50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                l51 l51Var = (l51) this.b;
                l51Var.getClass();
                if (!bh.m0.b && l51Var.getParent() != null) {
                    ((View) l51Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
