package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.c = y9Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ab abVar = (ab) this.c;
                za zaVar = (za) this.d;
                return abVar.b(zaVar.h, this.b);
            default:
                ai.y9 y9Var = (ai.y9) this.c;
                Runnable runnable = (Runnable) this.d;
                y9Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ ya(ab abVar, za zaVar, int i10) {
        this.c = abVar;
        this.d = zaVar;
        this.b = i10;
    }
}
