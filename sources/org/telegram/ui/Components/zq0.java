package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ it0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(it0 it0Var, Context context) {
        super(context);
        this.m0 = it0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.fj fjVar) {
        long playlistTopicId;
        it0 it0Var = this.m0;
        xs0[] xs0VarArr = it0Var.w1;
        if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
            boolean S = MediaController.B().S(fjVar);
            MediaController.B().r0(S ? xs0VarArr[4].a : null, false);
            return S;
        }
        if (!fjVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = xs0VarArr[4].a;
        long j3 = it0Var.f1;
        playlistTopicId = it0Var.getPlaylistTopicId();
        return B.o0(arrayList, fjVar, j3, true, null, playlistTopicId);
    }
}
