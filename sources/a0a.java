// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class a0a extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0a(c0a c0aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = c0aVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        c0a c0aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(c0aVar.d.e), TLObject.FLAG_30));
                break;
            default:
                g0a g0aVar = c0aVar.d;
                int i3 = g0aVar.y.J;
                if (i3 >= g0aVar.r.getPaddingTop() && !g0aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
                break;
        }
    }
}
