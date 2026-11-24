// default package

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm1 implements q8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q8c
    public final Object a(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj3;
                View view = (View) obj2;
                mu1Var.d6((URLSpan) obj, false, mu1Var.v5, view instanceof gb2 ? (gb2) view : null);
                return Boolean.TRUE;
            default:
                return od8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}
