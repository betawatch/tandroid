// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ic6 extends nha {
    public final /* synthetic */ pc6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic6(pc6 pc6Var, Context context, fha fhaVar, pc6 pc6Var2, hc6 hc6Var, ylb ylbVar) {
        super(context, 0L, fhaVar, 0, null, null, null, 8, 0, pc6Var2, hc6Var, 0, ylbVar, null);
        this.x2 = pc6Var;
    }

    @Override // nha
    public final boolean H() {
        return true;
    }

    @Override // nha
    public final int I0() {
        return 32;
    }

    @Override // nha
    public final int Z0() {
        return 3;
    }

    @Override // nha
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
