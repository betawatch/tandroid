// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fda extends eba {
    public final /* synthetic */ nfa m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fda(nfa nfaVar, Context context) {
        super(context);
        this.m0 = nfaVar;
    }

    @Override // eba
    public final boolean d(k27 k27Var) {
        long playlistTopicId;
        nfa nfaVar = this.m0;
        cfa[] cfaVarArr = nfaVar.w1;
        if (k27.Q4(k27Var.k) || k27Var.g4()) {
            boolean R = MediaController.w().R(k27Var);
            MediaController.w().q0(R ? cfaVarArr[4].a : null, false);
            return R;
        }
        if (!k27Var.I3()) {
            return false;
        }
        MediaController w = MediaController.w();
        ArrayList arrayList = cfaVarArr[4].a;
        long j = nfaVar.f1;
        playlistTopicId = nfaVar.getPlaylistTopicId();
        return w.n0(arrayList, k27Var, j, true, null, playlistTopicId);
    }
}
