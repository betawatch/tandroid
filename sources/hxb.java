// default package

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hxb extends View {
    public final HashMap a;
    public final /* synthetic */ ixb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxb(ixb ixbVar, Activity activity) {
        super(activity);
        this.b = ixbVar;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sxb sxbVar = this.b.d;
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(64.0f);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < sxbVar.b.size(); i5++) {
            if (sxbVar.b.get(i5) != null && ((jxb) sxbVar.b.get(i5)).c != null) {
                String str = ((jxb) sxbVar.b.get(i5)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    bool = Boolean.valueOf(cmb.A0[0].measureText(str) <= ((float) (((size - gm.L(jb6.a0 ? 18.0f : (sxbVar.isInPreviewMode() ? 11 : 50) + 4)) - (jb6.a0 ? gm.L((sxbVar.isInPreviewMode() ? 11 : 50) + 13) : gm.L(22.0f))) - ((int) Math.ceil((double) cmb.H0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L2 = gm.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((jxb) sxbVar.b.get(i5)).c.id == 1) {
                    L = L2;
                }
                if (((jxb) sxbVar.b.get(i5)).c.hidden) {
                    i3++;
                }
                i4 += L2;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i3 > 0 ? (((sxbVar.O.getMeasuredHeight() - sxbVar.O.getPaddingTop()) - sxbVar.O.getPaddingBottom()) - i4) + L : 0), TLObject.FLAG_30));
    }
}
