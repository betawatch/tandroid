package ai;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class bc extends k0 {
    public final /* synthetic */ jc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(jc jcVar, Context context) {
        super(context);
        this.a = jcVar;
    }

    @Override // ai.k0, android.view.View
    public final void invalidate() {
        super.invalidate();
        e6 e6Var = this.a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
