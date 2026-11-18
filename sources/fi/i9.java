package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i9 extends tg.m0 {
    public final /* synthetic */ j9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(j9 j9Var, Context context, float f10) {
        super(context, f10);
        this.R = j9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
