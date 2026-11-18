package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
