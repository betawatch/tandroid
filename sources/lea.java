// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lea extends vs8 {
    public final /* synthetic */ nha W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lea(nha nhaVar, d dVar, Context context, int i, long j, ylb ylbVar, km0 km0Var) {
        super(dVar, context, i, j, ylbVar, km0Var);
        this.W = nhaVar;
    }

    @Override // vs8
    public final void q(boolean z) {
        nha nhaVar = this.W;
        TextView textView = nhaVar.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new n28((byte) 13, (Object) this, z)).start();
        nhaVar.G1(true);
        nhaVar.Q0();
    }
}
