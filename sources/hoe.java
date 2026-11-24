// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hoe implements z6d {
    public Object a;

    public final void a(int i, Object obj, uif uifVar) {
        igf igfVar = (igf) this.a;
        igfVar.i(i, 3);
        uifVar.d((kff) obj, igfVar.a);
        igfVar.i(i, 4);
    }

    public final void b(int i, Object obj, uif uifVar) {
        kff kffVar = (kff) obj;
        igf igfVar = (igf) this.a;
        igfVar.j((i << 3) | 2);
        igfVar.j(kffVar.a(uifVar));
        uifVar.d(kffVar, igfVar.a);
    }

    @Override // z6d
    public final void d(Bitmap bitmap) {
        ((lif) this.a).e(3, bitmap);
    }
}
