package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vr0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ pj0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(0, context, g6Var);
        this.l0 = i7;
        this.m0 = pj0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.l0) {
            case 0:
                wr0 wr0Var = (wr0) this.m0;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S = MediaController.B().S(ijVar);
                    MediaController.B().r0(S ? wr0Var.d : null, false);
                    if (ijVar.h4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = wr0Var.d;
                zs0 zs0Var = wr0Var.w;
                long j3 = zs0Var.e1;
                playlistTopicId = zs0Var.getPlaylistTopicId();
                return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
            case 1:
                ms0 ms0Var = (ms0) this.m0;
                int i7 = ms0Var.d;
                zs0 zs0Var2 = ms0Var.f;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S2 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S2 ? zs0Var2.v1[i7].a : null, false);
                    return S2;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = zs0Var2.v1[i7].a;
                long j10 = zs0Var2.e1;
                playlistTopicId2 = zs0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, ijVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.a00 a00Var = ((org.telegram.ui.vz) this.m0).w;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S3 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S3 ? a00Var.f : null, false);
                    return S3;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                String str = a00Var.Q;
                long j11 = a00Var.E;
                long j12 = a00Var.H;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, a00Var.D);
                a0Var.e = a00Var.N;
                a0Var.f = a00Var.w;
                a0Var.d = a00Var.O;
                a0Var.g = a00Var.J ? 1 : 0;
                return MediaController.B().o0(a00Var.f, ijVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(org.telegram.ui.vz vzVar, Context context) {
        super(1, context, null);
        this.l0 = 2;
        this.m0 = vzVar;
    }
}
