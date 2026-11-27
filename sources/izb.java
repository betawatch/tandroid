// default package

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class izb extends View {
    public final HashMap a;
    public final /* synthetic */ jzb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izb(jzb jzbVar, Activity activity) {
        super(activity);
        this.b = jzbVar;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        tzb tzbVar = this.b.d;
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(64.0f);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < tzbVar.b.size(); i5++) {
            if (tzbVar.b.get(i5) != null && ((kzb) tzbVar.b.get(i5)).c != null) {
                String str = ((kzb) tzbVar.b.get(i5)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    bool = Boolean.valueOf(aob.A0[0].measureText(str) <= ((float) (((size - hl.L(ob6.a0 ? 18.0f : (tzbVar.isInPreviewMode() ? 11 : 50) + 4)) - (ob6.a0 ? hl.L((tzbVar.isInPreviewMode() ? 11 : 50) + 13) : hl.L(22.0f))) - ((int) Math.ceil((double) aob.H0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L2 = hl.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((kzb) tzbVar.b.get(i5)).c.id == 1) {
                    L = L2;
                }
                if (((kzb) tzbVar.b.get(i5)).c.hidden) {
                    i3++;
                }
                i4 += L2;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i3 > 0 ? (((tzbVar.O.getMeasuredHeight() - tzbVar.O.getPaddingTop()) - tzbVar.O.getPaddingBottom()) - i4) + L : 0), TLObject.FLAG_30));
    }
}
