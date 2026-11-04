package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pq0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ ws0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(ws0 ws0Var, Context context) {
        super(context);
        this.m0 = ws0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(org.telegram.messenger.zi ziVar) {
        long playlistTopicId;
        ws0 ws0Var = this.m0;
        ls0[] ls0VarArr = ws0Var.w1;
        if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
            boolean S = MediaController.B().S(ziVar);
            MediaController.B().r0(S ? ls0VarArr[4].a : null, false);
            return S;
        }
        if (!ziVar.J3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = ls0VarArr[4].a;
        long j10 = ws0Var.f1;
        playlistTopicId = ws0Var.getPlaylistTopicId();
        return B.o0(arrayList, ziVar, j10, true, null, playlistTopicId);
    }
}
