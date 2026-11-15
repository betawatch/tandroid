package i5;

import a8.p0;
import ab.c0;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class d extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ff e;

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
        c.u(ze.a.b(u.h, uVar, uVar));
        return p0.n(uVar.f.length, "]", sb2);
    }
}
