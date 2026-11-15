package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ur0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ tj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(0, context, e6Var);
        this.m0 = i7;
        this.n0 = tj0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(org.telegram.messenger.gj gjVar) {
        long playlistTopicId;
        long playlistTopicId2;
        switch (this.m0) {
            case 0:
                vr0 vr0Var = (vr0) this.n0;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S = MediaController.B().S(gjVar);
                    MediaController.B().r0(S ? vr0Var.d : null, false);
                    if (gjVar.h4()) {
                        MediaController.B().k0(false);
                    }
                    return S;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                MediaController B = MediaController.B();
                ArrayList arrayList = vr0Var.d;
                ys0 ys0Var = vr0Var.w;
                long j3 = ys0Var.f1;
                playlistTopicId = ys0Var.getPlaylistTopicId();
                return B.o0(arrayList, gjVar, j3, true, null, playlistTopicId);
            case 1:
                ls0 ls0Var = (ls0) this.n0;
                int i7 = ls0Var.d;
                ys0 ys0Var2 = ls0Var.f;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S2 = MediaController.B().S(gjVar);
                    MediaController.B().r0(S2 ? ys0Var2.w1[i7].a : null, false);
                    return S2;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                MediaController B2 = MediaController.B();
                ArrayList arrayList2 = ys0Var2.w1[i7].a;
                long j10 = ys0Var2.f1;
                playlistTopicId2 = ys0Var2.getPlaylistTopicId();
                return B2.o0(arrayList2, gjVar, j10, true, null, playlistTopicId2);
            default:
                org.telegram.ui.zz zzVar = ((org.telegram.ui.uz) this.n0).w;
                if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                    boolean S3 = MediaController.B().S(gjVar);
                    MediaController.B().r0(S3 ? zzVar.f : null, false);
                    return S3;
                }
                if (!gjVar.I3()) {
                    return false;
                }
                String str = zzVar.R;
                long j11 = zzVar.F;
                long j12 = zzVar.I;
                h2.a0 a0Var = new h2.a0(str, j11, j12, j12, zzVar.E);
                a0Var.e = zzVar.O;
                a0Var.f = zzVar.w;
                a0Var.d = zzVar.P;
                a0Var.g = zzVar.K ? 1 : 0;
                return MediaController.B().o0(zzVar.f, gjVar, 0L, true, a0Var, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(org.telegram.ui.uz uzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.n0 = uzVar;
    }
}
