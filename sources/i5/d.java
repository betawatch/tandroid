package i5;

import a8.p0;
import ab.c0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
