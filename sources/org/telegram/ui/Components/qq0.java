package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qq0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ ys0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(ys0 ys0Var, Context context) {
        super(context);
        this.m0 = ys0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(org.telegram.messenger.gj gjVar) {
        long playlistTopicId;
        ys0 ys0Var = this.m0;
        ns0[] ns0VarArr = ys0Var.w1;
        if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
            boolean S = MediaController.B().S(gjVar);
            MediaController.B().r0(S ? ns0VarArr[4].a : null, false);
            return S;
        }
        if (!gjVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = ns0VarArr[4].a;
        long j3 = ys0Var.f1;
        playlistTopicId = ys0Var.getPlaylistTopicId();
        return B.o0(arrayList, gjVar, j3, true, null, playlistTopicId);
    }
}
