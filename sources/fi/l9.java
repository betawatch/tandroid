package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l9 extends tg.m0 {
    public final /* synthetic */ m9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.R = m9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
