// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb4 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kb4(xb4 xb4Var, boolean z, String str, long j, long j2, Float f) {
        this.e = xb4Var;
        this.c = z;
        this.f = str;
        this.b = j;
        this.d = j2;
        this.h = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb4 xb4Var = (xb4) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                long j = this.b;
                long j2 = this.d;
                Float f = (Float) this.h;
                nd4 nd4Var = z ? (nd4) xb4Var.n.get(str) : (nd4) xb4Var.h.get(str);
                if (nd4Var != null) {
                    Utilities.d.c(new o30((Object) nd4Var, (Object) f, j2, j, (byte) 3));
                    break;
                } else if (j2 != 0) {
                    xb4Var.y.put(str, Long.valueOf(j2));
                    break;
                }
                break;
            default:
                c6b c6bVar = (c6b) this.e;
                long j3 = this.b;
                boolean z2 = this.c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j4 = this.d;
                TLObject tLObject = (TLObject) this.h;
                c6bVar.D.remove(Long.valueOf(j3));
                if (!z2) {
                    peerStories = c6bVar.x(j4);
                }
                if (peerStories != null) {
                    byte b = 0;
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                                if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                                    peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                                    c6bVar.Y(j4, tL_stories_stories.stories.get(i));
                                }
                            }
                        }
                        if (!z2) {
                            o6b o6bVar = c6bVar.k;
                            o6bVar.b.a.c(new n6b(o6bVar, peerStories, b));
                        }
                    }
                    jn7.f(c6bVar.a).k(jn7.y5, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kb4(c6b c6bVar, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        this.e = c6bVar;
        this.b = j;
        this.c = z;
        this.f = peerStories;
        this.d = j2;
        this.h = tLObject;
    }
}
