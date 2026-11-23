package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ dk0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(0, context, i6Var);
        this.m0 = i7;
        this.n0 = dk0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(org.telegram.messenger.fj fjVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.m0) {
            case 0:
                fs0 fs0Var = (fs0) this.n0;
                if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
                    boolean S = MediaController.B().S(fjVar);
                    MediaController.B().r0(S ? fs0Var.d : null, false);
                    if (fjVar.h4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!fjVar.I3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = fs0Var.d;
                it0 it0Var = fs0Var.w;
                long j3 = it0Var.f1;
                playlistTopicId = it0Var.getPlaylistTopicId();
                return B.o0(arrayList, fjVar, j3, true, null, playlistTopicId);
            case 1:
                vs0 vs0Var = (vs0) this.n0;
                int i7 = vs0Var.d;
                it0 it0Var2 = vs0Var.f;
                if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
                    boolean S2 = MediaController.B().S(fjVar);
                    MediaController.B().r0(S2 ? it0Var2.w1[i7].a : null, false);
                    return S2;
                }
                if (!fjVar.I3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = it0Var2.w1[i7].a;
                long j10 = it0Var2.f1;
                playlistTopicId2 = it0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, fjVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.wz) this.n0).w;
                if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
                    boolean S3 = MediaController.B().S(fjVar);
                    MediaController.B().r0(S3 ? b00Var.f : null, false);
                    return S3;
                }
                if (!fjVar.I3()) {
                    return false;
                }
                String str = b00Var.R;
                long j11 = b00Var.F;
                long j12 = b00Var.I;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, b00Var.E);
                a0Var.e = b00Var.O;
                a0Var.f = b00Var.w;
                a0Var.d = b00Var.P;
                a0Var.g = b00Var.K ? 1 : 0;
                return MediaController.B().o0(b00Var.f, fjVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(org.telegram.ui.wz wzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.n0 = wzVar;
    }
}
