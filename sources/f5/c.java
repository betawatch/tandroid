package f5;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class c extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ ka.c e;

    static {
        re.a aVar = new re.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = re.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        e2.q(re.a.b(t.h, tVar, tVar));
        return a4.a.o(tVar.f.length, "]", sb2);
    }
}
