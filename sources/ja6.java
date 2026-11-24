// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ja6 extends nfa {
    public final /* synthetic */ qa6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja6(qa6 qa6Var, Context context, ffa ffaVar, qa6 qa6Var2, ia6 ia6Var, wjb wjbVar) {
        super(context, 0L, ffaVar, 0, null, null, null, 8, 0, qa6Var2, ia6Var, 0, wjbVar, null);
        this.x2 = qa6Var;
    }

    @Override // nfa
    public final boolean H() {
        return true;
    }

    @Override // nfa
    public final int I0() {
        return 32;
    }

    @Override // nfa
    public final int Z0() {
        return 3;
    }

    @Override // nfa
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
