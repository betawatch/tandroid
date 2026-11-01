package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x30 implements ai {
    public final /* synthetic */ b40 a;

    public x30(b40 b40Var) {
        this.a = b40Var;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar;
        b40 b40Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = b40Var.a;
        if (k2Var == null || k2Var.getParentActivity() == null || (biVar = b40Var.c) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            biVar.M(i10);
            if (i10 == 0) {
                b40Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = b40Var.c.a2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
            org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
            arrayList.add(qzVar);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                String str = ffVar.h;
                if (str != null) {
                    qzVar.c = str;
                } else {
                    qzVar.c = ffVar.I;
                }
                qzVar.e = ffVar.c;
                qzVar.f = ffVar.g;
                qzVar.k = ffVar.s;
                qzVar.p = ffVar.d();
                qzVar.o = ffVar.b;
                qzVar.z = ffVar.m;
                qzVar.q = true;
                CharSequence charSequence = ffVar.a;
                qzVar.d = charSequence != null ? charSequence.toString() : null;
                qzVar.i = ffVar.n;
                qzVar.j = ffVar.r;
                qzVar.h = ffVar.x;
                TLRPC.VideoSize videoSize = ffVar.S;
                qzVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                String str2 = jfVar.h;
                if (str2 != null) {
                    qzVar.c = str2;
                } else {
                    qzVar.l = jfVar;
                }
                qzVar.e = jfVar.c;
                qzVar.f = jfVar.g;
                qzVar.k = jfVar.s;
                CharSequence charSequence2 = jfVar.I;
                qzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                qzVar.i = jfVar.n;
                qzVar.j = jfVar.r;
                qzVar.h = jfVar.x;
                TLRPC.BotInlineResult botInlineResult = jfVar.N;
                if (botInlineResult != null && jfVar.H == 1) {
                    qzVar.m = botInlineResult;
                    qzVar.n = jfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        b40.a(b40Var, z14, arrayList);
        if (i10 != 8) {
            b40Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final void N() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
        org.telegram.messenger.i0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
