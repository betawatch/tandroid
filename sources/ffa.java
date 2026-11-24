// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ffa extends eda {
    public final /* synthetic */ nha m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffa(nha nhaVar, Context context) {
        super(context);
        this.m0 = nhaVar;
    }

    @Override // eda
    public final boolean d(k47 k47Var) {
        long playlistTopicId;
        nha nhaVar = this.m0;
        cha[] chaVarArr = nhaVar.w1;
        if (k47.Q4(k47Var.k) || k47Var.g4()) {
            boolean R = MediaController.w().R(k47Var);
            MediaController.w().q0(R ? chaVarArr[4].a : null, false);
            return R;
        }
        if (!k47Var.I3()) {
            return false;
        }
        MediaController w = MediaController.w();
        ArrayList arrayList = chaVarArr[4].a;
        long j = nhaVar.f1;
        playlistTopicId = nhaVar.getPlaylistTopicId();
        return w.n0(arrayList, k47Var, j, true, null, playlistTopicId);
    }
}
