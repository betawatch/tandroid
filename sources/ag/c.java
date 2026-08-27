package ag;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c extends b {
    public e d;

    @Override // ag.b
    public final f2.q0 a() {
        e eVar = new e(UserConfig.selectedAccount, this.a);
        this.d = eVar;
        eVar.r = this;
        return eVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e eVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = eVar.f;
        g gVar = new g(context, eVar.c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            gVar.a((f) arrayList.get(i13));
            gVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((f) arrayList.get(i13)).e = i12;
            i12 += gVar.getMeasuredHeight();
        }
        eVar.n = i12;
    }
}
