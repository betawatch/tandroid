// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l83 extends FrameLayout {
    public final jia a;
    public long b;

    public l83(Context context, wjb wjbVar) {
        super(context);
        jia jiaVar = new jia(context);
        jiaVar.setTextSize(16);
        zkb.W(jiaVar, bkb.i5, wjbVar);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.a = jiaVar2;
        jiaVar2.setTextSize(16);
        zkb.W(jiaVar2, bkb.K6, wjbVar);
        jiaVar2.setGravity(k96.a0 ? 3 : 5);
        addView(jiaVar2);
        jiaVar.l(k96.a0("BoostingDateAndTime", null, 2131753536, new Object[0]), false);
        boolean z = k96.a0;
        jiaVar.setLayoutParams(nme.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 0.0f : 21.0f, 0.0f, z ? 21.0f : 0.0f, 0.0f));
        boolean z2 = k96.a0;
        jiaVar2.setLayoutParams(nme.d(-1, -2.0f, (z2 ? 3 : 5) | 16, z2 ? 21.0f : 0.0f, 0.0f, z2 ? 0.0f : 21.0f, 0.0f));
        zkb.h(bkb.g5, wjbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(k96.a0("formatDateAtTime", null, 2131742520, k96.D0().p0().format(date), k96.D0().o0().format(date)), false);
    }
}
