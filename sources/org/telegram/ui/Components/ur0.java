package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ur0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ oj0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(0, context, h6Var);
        this.l0 = i7;
        this.m0 = oj0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.l0) {
            case 0:
                vr0 vr0Var = (vr0) this.m0;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S = MediaController.B().S(ijVar);
                    MediaController.B().r0(S ? vr0Var.d : null, false);
                    if (ijVar.h4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = vr0Var.d;
                ys0 ys0Var = vr0Var.w;
                long j3 = ys0Var.e1;
                playlistTopicId = ys0Var.getPlaylistTopicId();
                return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
            case 1:
                ls0 ls0Var = (ls0) this.m0;
                int i7 = ls0Var.d;
                ys0 ys0Var2 = ls0Var.f;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S2 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S2 ? ys0Var2.v1[i7].a : null, false);
                    return S2;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = ys0Var2.v1[i7].a;
                long j10 = ys0Var2.e1;
                playlistTopicId2 = ys0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, ijVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.wz) this.m0).w;
                if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                    boolean S3 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S3 ? b00Var.f : null, false);
                    return S3;
                }
                if (!ijVar.I3()) {
                    return false;
                }
                String str = b00Var.Q;
                long j11 = b00Var.E;
                long j12 = b00Var.H;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, b00Var.D);
                a0Var.e = b00Var.N;
                a0Var.f = b00Var.w;
                a0Var.d = b00Var.O;
                a0Var.g = b00Var.J ? 1 : 0;
                return MediaController.B().o0(b00Var.f, ijVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(org.telegram.ui.wz wzVar, Context context) {
        super(1, context, null);
        this.l0 = 2;
        this.m0 = wzVar;
    }
}
