package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sr0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ sj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(0, context, e6Var);
        this.m0 = i3;
        this.n0 = sj0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(org.telegram.messenger.zi ziVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.m0) {
            case 0:
                tr0 tr0Var = (tr0) this.n0;
                if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
                    boolean S = MediaController.B().S(ziVar);
                    MediaController.B().r0(S ? tr0Var.d : null, false);
                    if (ziVar.i4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!ziVar.J3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = tr0Var.d;
                ws0 ws0Var = tr0Var.w;
                long j10 = ws0Var.f1;
                playlistTopicId = ws0Var.getPlaylistTopicId();
                return B.o0(arrayList, ziVar, j10, true, null, playlistTopicId);
            case 1:
                js0 js0Var = (js0) this.n0;
                int i3 = js0Var.d;
                ws0 ws0Var2 = js0Var.f;
                if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
                    boolean S2 = MediaController.B().S(ziVar);
                    MediaController.B().r0(S2 ? ws0Var2.w1[i3].a : null, false);
                    return S2;
                }
                if (!ziVar.J3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = ws0Var2.w1[i3].a;
                long j11 = ws0Var2.f1;
                playlistTopicId2 = ws0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, ziVar, j11, true, null, playlistTopicId2);
            default:
                org.telegram.ui.wz wzVar = ((org.telegram.ui.rz) this.n0).w;
                if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
                    boolean S3 = MediaController.B().S(ziVar);
                    MediaController.B().r0(S3 ? wzVar.f : null, false);
                    return S3;
                }
                if (!ziVar.J3()) {
                    return false;
                }
                String str = wzVar.R;
                long j12 = wzVar.F;
                long j13 = wzVar.I;
                g2.b0 b0Var = new g2.b0(str, j12, j13, j13, wzVar.E);
                b0Var.e = wzVar.O;
                b0Var.f = wzVar.w;
                b0Var.d = wzVar.P;
                b0Var.g = wzVar.K ? 1 : 0;
                return MediaController.B().o0(wzVar.f, ziVar, 0L, true, b0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(org.telegram.ui.rz rzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.n0 = rzVar;
    }
}
