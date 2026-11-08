package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ xs0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(xs0 xs0Var, Context context) {
        super(context);
        this.l0 = xs0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        xs0 xs0Var = this.l0;
        ms0[] ms0VarArr = xs0Var.v1;
        if (org.telegram.messenger.ij.S4(ijVar.k) || ijVar.i4()) {
            boolean S = MediaController.B().S(ijVar);
            MediaController.B().r0(S ? ms0VarArr[4].a : null, false);
            return S;
        }
        if (!ijVar.J3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = ms0VarArr[4].a;
        long j3 = xs0Var.e1;
        playlistTopicId = xs0Var.getPlaylistTopicId();
        return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
    }
}
