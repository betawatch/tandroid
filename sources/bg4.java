// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bg4 extends v46 {
    public final /* synthetic */ jg2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg4(jg2 jg2Var, Context context) {
        super(context);
        this.r = jg2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((gm.L(21.0f) + r6.getRight()) > ((ig4) r5.r.J).getMeasuredWidth()) goto L12;
     */
    @Override // v46, q69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, p69 p69Var) {
        int j = j(o(), view);
        if (j > 0 || (j == 0 && view.getLeft() - gm.L(21.0f) < 0)) {
            j += gm.L(60.0f);
        } else {
            if (j >= 0) {
                if (j == 0) {
                }
            }
            j -= gm.L(60.0f);
        }
        int k = k(p(), view);
        int max = Math.max(nm7.J2, m((int) Math.sqrt((k * k) + (j * j))));
        if (max > 0) {
            p69Var.b(-j, -k, max, this.j);
        }
    }
}
