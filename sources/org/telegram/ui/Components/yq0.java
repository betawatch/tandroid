package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yq0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ gt0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(gt0 gt0Var, Context context) {
        super(context);
        this.m0 = gt0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(org.telegram.messenger.fj fjVar) {
        long playlistTopicId;
        gt0 gt0Var = this.m0;
        vs0[] vs0VarArr = gt0Var.w1;
        if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
            boolean S = MediaController.B().S(fjVar);
            MediaController.B().r0(S ? vs0VarArr[4].a : null, false);
            return S;
        }
        if (!fjVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = vs0VarArr[4].a;
        long j3 = gt0Var.f1;
        playlistTopicId = gt0Var.getPlaylistTopicId();
        return B.o0(arrayList, fjVar, j3, true, null, playlistTopicId);
    }
}
