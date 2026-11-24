// default package

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gvb extends View {
    public final HashMap a;
    public final /* synthetic */ hvb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvb(hvb hvbVar, Activity activity) {
        super(activity);
        this.b = hvbVar;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        qvb qvbVar = this.b.d;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(64.0f);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < qvbVar.b.size(); i5++) {
            if (qvbVar.b.get(i5) != null && ((ivb) qvbVar.b.get(i5)).c != null) {
                String str = ((ivb) qvbVar.b.get(i5)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    bool = Boolean.valueOf(bkb.A0[0].measureText(str) <= ((float) (((size - gl.L(k96.a0 ? 18.0f : (qvbVar.isInPreviewMode() ? 11 : 50) + 4)) - (k96.a0 ? gl.L((qvbVar.isInPreviewMode() ? 11 : 50) + 13) : gl.L(22.0f))) - ((int) Math.ceil((double) bkb.H0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L2 = gl.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((ivb) qvbVar.b.get(i5)).c.id == 1) {
                    L = L2;
                }
                if (((ivb) qvbVar.b.get(i5)).c.hidden) {
                    i3++;
                }
                i4 += L2;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i3 > 0 ? (((qvbVar.O.getMeasuredHeight() - qvbVar.O.getPaddingTop()) - qvbVar.O.getPaddingBottom()) - i4) + L : 0), TLObject.FLAG_30));
    }
}
