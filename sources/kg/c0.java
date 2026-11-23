package kg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.f3;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c0 extends v4.d0 {
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        return f3.B(8.0f, ((h0) this.r.V).s.getPaddingTop() - org.telegram.messenger.g0.m, super.k(i7, view));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
