package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b8(d8 d8Var, String str, int i7) {
        this.a = i7;
        this.b = d8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d8 d8Var = this.b;
                String str = this.c;
                d8Var.f = null;
                org.telegram.messenger.g0.g3(new b8(d8Var, str, 1));
                break;
            default:
                d8 d8Var2 = this.b;
                String str2 = this.c;
                d8Var2.getClass();
                Utilities.g.c(new c8(d8Var2, str2, new ArrayList(d8Var2.n.r2)));
                break;
        }
    }
}
