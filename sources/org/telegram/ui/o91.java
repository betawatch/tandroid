package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o91 extends View {
    public final HashMap a;
    public final /* synthetic */ p91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(p91 p91Var, Activity activity) {
        super(activity);
        this.b = p91Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        p91 p91Var = this.b;
        y91 y91Var = p91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < p91Var.F().size(); i14++) {
            if (p91Var.F().get(i14) != null && ((q91) p91Var.F().get(i14)).c != null) {
                String str = ((q91) p91Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.id.a0 ? 18.0f : (y91Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.id.a0) {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L((y91Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.l6.B0[0].measureText(str) <= ((float) ((i11 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.l6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.g0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((q91) p91Var.F().get(i14)).c.id == 1) {
                    L2 = L4;
                }
                if (((q91) p91Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += L4;
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((y91Var.N.getMeasuredHeight() - y91Var.N.getPaddingTop()) - y91Var.N.getPaddingBottom()) - i13) + L2 : 0), TLObject.FLAG_30));
    }
}
