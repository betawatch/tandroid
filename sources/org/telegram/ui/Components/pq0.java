package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ ys0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(ys0 ys0Var, Context context) {
        super(context);
        this.l0 = ys0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        ys0 ys0Var = this.l0;
        ns0[] ns0VarArr = ys0Var.v1;
        if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
            boolean S = MediaController.B().S(ijVar);
            MediaController.B().r0(S ? ns0VarArr[4].a : null, false);
            return S;
        }
        if (!ijVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = ns0VarArr[4].a;
        long j3 = ys0Var.e1;
        playlistTopicId = ys0Var.getPlaylistTopicId();
        return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
    }
}
