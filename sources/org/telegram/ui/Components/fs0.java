package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ dk0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(0, context, h6Var);
        this.m0 = i7;
        this.n0 = dk0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(org.telegram.messenger.gj gjVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.m0) {
            case 0:
                gs0 gs0Var = (gs0) this.n0;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S = MediaController.B().S(gjVar);
                    MediaController.B().r0(S ? gs0Var.d : null, false);
                    if (gjVar.h4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = gs0Var.d;
                jt0 jt0Var = gs0Var.w;
                long j3 = jt0Var.f1;
                playlistTopicId = jt0Var.getPlaylistTopicId();
                return B.o0(arrayList, gjVar, j3, true, null, playlistTopicId);
            case 1:
                ws0 ws0Var = (ws0) this.n0;
                int i7 = ws0Var.d;
                jt0 jt0Var2 = ws0Var.f;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S2 = MediaController.B().S(gjVar);
                    MediaController.B().r0(S2 ? jt0Var2.w1[i7].a : null, false);
                    return S2;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = jt0Var2.w1[i7].a;
                long j10 = jt0Var2.f1;
                playlistTopicId2 = jt0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, gjVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.xz) this.n0).w;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S3 = MediaController.B().S(gjVar);
                    MediaController.B().r0(S3 ? c00Var.f : null, false);
                    return S3;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                String str = c00Var.R;
                long j11 = c00Var.F;
                long j12 = c00Var.I;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, c00Var.E);
                a0Var.e = c00Var.O;
                a0Var.f = c00Var.w;
                a0Var.d = c00Var.P;
                a0Var.g = c00Var.K ? 1 : 0;
                return MediaController.B().o0(c00Var.f, gjVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(org.telegram.ui.xz xzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.n0 = xzVar;
    }
}
