// default package

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn1 implements rac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jn1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // rac
    public final Object a(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj3;
                View view = (View) obj2;
                yv1Var.m6((URLSpan) obj, false, yv1Var.v5, view instanceof rc2 ? (rc2) view : null);
                return Boolean.TRUE;
            default:
                return qf8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}
