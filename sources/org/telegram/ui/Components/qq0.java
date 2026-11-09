package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ zs0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(zs0 zs0Var, Context context) {
        super(context);
        this.l0 = zs0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        zs0 zs0Var = this.l0;
        os0[] os0VarArr = zs0Var.v1;
        if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
            boolean S = MediaController.B().S(ijVar);
            MediaController.B().r0(S ? os0VarArr[4].a : null, false);
            return S;
        }
        if (!ijVar.I3()) {
            return false;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = os0VarArr[4].a;
        long j3 = zs0Var.e1;
        playlistTopicId = zs0Var.getPlaylistTopicId();
        return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
    }
}
