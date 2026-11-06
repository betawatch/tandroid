package i5;

import a8.p0;
import y7.i6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ i6 e;

    static {
        ze.a aVar = new ze.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        ui.e b10 = ze.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        com.google.android.recaptcha.internal.a.t(ze.a.b(t.h, tVar, tVar));
        return p0.n(tVar.f.length, "]", sb2);
    }
}
