// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e93 extends FrameLayout {
    public final ema a;
    public long b;

    public e93(Context context, vnb vnbVar) {
        super(context);
        ema emaVar = new ema(context);
        emaVar.setTextSize(16);
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.a = emaVar2;
        emaVar2.setTextSize(16);
        yob.W(emaVar2, aob.L6, vnbVar);
        emaVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(emaVar2);
        emaVar.l(ob6.a0("BoostingDateAndTime", null, 2131753532, new Object[0]), false);
        boolean z = ob6.a0;
        emaVar.setLayoutParams(tre.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 0.0f : 21.0f, 0.0f, z ? 21.0f : 0.0f, 0.0f));
        boolean z2 = ob6.a0;
        emaVar2.setLayoutParams(tre.d(-1, -2.0f, (z2 ? 3 : 5) | 16, z2 ? 21.0f : 0.0f, 0.0f, z2 ? 0.0f : 21.0f, 0.0f));
        yob.h(aob.h5, vnbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().p0().format(date), ob6.D0().o0().format(date)), false);
    }
}
