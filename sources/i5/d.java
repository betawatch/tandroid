package i5;

import a8.p0;
import ab.c0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class d extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ze.b e;

    static {
        ze.a aVar = new ze.a(d.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        c0 b10 = ze.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        u uVar = (u) this;
        c.w(ze.a.b(u.h, uVar, uVar));
        return p0.n(uVar.f.length, "]", sb2);
    }
}
