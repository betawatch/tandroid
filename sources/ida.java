// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ida extends yo {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ida(ViewGroup viewGroup, Object obj, byte b) {
        this.c = b;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // yo
    public final int i(int i) {
        int i2;
        int i3;
        byte b = this.c;
        ViewGroup viewGroup = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                iea ieaVar = (iea) obj;
                w39 adapter = ieaVar.n.getAdapter();
                nfa nfaVar = (nfa) viewGroup;
                hfa hfaVar = nfaVar.L;
                if (adapter == hfaVar) {
                    if (hfaVar.d(i) == 2) {
                        return ieaVar.r.J;
                    }
                    return 1;
                }
                if (nfaVar.y1(adapter) == -1) {
                    return 1;
                }
                ((kfa) adapter).getClass();
                return 1;
            case 1:
                o5c o5cVar = (o5c) obj;
                l5c l5cVar = ((q5c) viewGroup).g3;
                if (l5cVar == null) {
                    return o5cVar.J;
                }
                c4c G = l5cVar.G(i);
                return (G == null || (i2 = G.v) == -1) ? o5cVar.J : i2;
            default:
                o5c o5cVar2 = (o5c) obj;
                l5c l5cVar2 = ((q5c) viewGroup).g3;
                if (l5cVar2 == null) {
                    return o5cVar2.J;
                }
                c4c G2 = l5cVar2.G(i);
                return (G2 == null || (i3 = G2.v) == -1) ? o5cVar2.J : i3;
        }
    }
}
