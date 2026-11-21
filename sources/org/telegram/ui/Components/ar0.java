package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ar0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ jt0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(jt0 jt0Var, Context context) {
        super(context);
        this.m0 = jt0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(org.telegram.messenger.fj fjVar) {
        long playlistTopicId;
        jt0 jt0Var = this.m0;
        ys0[] ys0VarArr = jt0Var.w1;
        if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
            boolean S = MediaController.B().S(fjVar);
            MediaController.B().r0(S ? ys0VarArr[4].a : null, false);
            return S;
        }
        if (!fjVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = ys0VarArr[4].a;
        long j3 = jt0Var.f1;
        playlistTopicId = jt0Var.getPlaylistTopicId();
        return B.o0(arrayList, fjVar, j3, true, null, playlistTopicId);
    }
}
