package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tr0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ oj0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(0, context, f6Var);
        this.l0 = i7;
        this.m0 = oj0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.ij ijVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.l0) {
            case 0:
                ur0 ur0Var = (ur0) this.m0;
                if (org.telegram.messenger.ij.S4(ijVar.k) || ijVar.i4()) {
                    boolean S = MediaController.B().S(ijVar);
                    MediaController.B().r0(S ? ur0Var.d : null, false);
                    if (ijVar.i4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!ijVar.J3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = ur0Var.d;
                xs0 xs0Var = ur0Var.w;
                long j3 = xs0Var.e1;
                playlistTopicId = xs0Var.getPlaylistTopicId();
                return B.o0(arrayList, ijVar, j3, true, null, playlistTopicId);
            case 1:
                ks0 ks0Var = (ks0) this.m0;
                int i7 = ks0Var.d;
                xs0 xs0Var2 = ks0Var.f;
                if (org.telegram.messenger.ij.S4(ijVar.k) || ijVar.i4()) {
                    boolean S2 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S2 ? xs0Var2.v1[i7].a : null, false);
                    return S2;
                }
                if (!ijVar.J3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = xs0Var2.v1[i7].a;
                long j10 = xs0Var2.e1;
                playlistTopicId2 = xs0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, ijVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.yz yzVar = ((org.telegram.ui.tz) this.m0).w;
                if (org.telegram.messenger.ij.S4(ijVar.k) || ijVar.i4()) {
                    boolean S3 = MediaController.B().S(ijVar);
                    MediaController.B().r0(S3 ? yzVar.f : null, false);
                    return S3;
                }
                if (!ijVar.J3()) {
                    return false;
                }
                String str = yzVar.Q;
                long j11 = yzVar.E;
                long j12 = yzVar.H;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, yzVar.D);
                a0Var.e = yzVar.N;
                a0Var.f = yzVar.w;
                a0Var.d = yzVar.O;
                a0Var.g = yzVar.J ? 1 : 0;
                return MediaController.B().o0(yzVar.f, ijVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(org.telegram.ui.tz tzVar, Context context) {
        super(1, context, null);
        this.l0 = 2;
        this.m0 = tzVar;
    }
}
