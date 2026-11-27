// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n4b extends x2b {
    public final /* synthetic */ o4b P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4b(o4b o4bVar, Context context, vnb vnbVar) {
        super(vnbVar, context, false);
        this.P = o4bVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        s4b s4bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(s4bVar.I1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s4bVar.I1, TLObject.FLAG_30));
    }
}
