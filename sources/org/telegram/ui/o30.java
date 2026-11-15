package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o30 implements org.telegram.ui.Components.m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.m5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((p30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                x01 x01Var = (x01) this.b;
                x01Var.getClass();
                if (!ch.f0.b && x01Var.getParent() != null) {
                    ((View) x01Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
