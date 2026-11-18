package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ d8(f8 f8Var, String str, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f8 f8Var = this.b;
                String str = this.c;
                f8Var.f = null;
                org.telegram.messenger.g0.g3(new d8(f8Var, str, 1));
                break;
            default:
                f8 f8Var2 = this.b;
                String str2 = this.c;
                f8Var2.getClass();
                Utilities.g.c(new e8(f8Var2, str2, new ArrayList(f8Var2.n.r2)));
                break;
        }
    }
}
