package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b30 implements zh {
    public final /* synthetic */ f30 a;

    public b30(f30 f30Var) {
        this.a = f30Var;
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar;
        f30 f30Var = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = f30Var.a;
        if (d2Var == null || d2Var.getParentActivity() == null || (biVar = f30Var.c) == null) {
            return;
        }
        if (i3 != 8 && i3 != 7) {
            biVar.L(i3);
            if (i3 == 0) {
                f30Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = biVar.b2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = f30Var.c.b2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
            arrayList.add(xyVar);
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                String str = yeVar.h;
                if (str != null) {
                    xyVar.c = str;
                } else {
                    xyVar.c = yeVar.I;
                }
                xyVar.e = yeVar.c;
                xyVar.f = yeVar.g;
                xyVar.k = yeVar.s;
                xyVar.p = yeVar.d();
                xyVar.o = yeVar.b;
                xyVar.z = yeVar.m;
                xyVar.q = true;
                CharSequence charSequence = yeVar.a;
                xyVar.d = charSequence != null ? charSequence.toString() : null;
                xyVar.i = yeVar.n;
                xyVar.j = yeVar.r;
                xyVar.h = yeVar.x;
                TLRPC.VideoSize videoSize = yeVar.S;
                xyVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.bf) {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                String str2 = bfVar.h;
                if (str2 != null) {
                    xyVar.c = str2;
                } else {
                    xyVar.l = bfVar;
                }
                xyVar.e = bfVar.c;
                xyVar.f = bfVar.g;
                xyVar.k = bfVar.s;
                CharSequence charSequence2 = bfVar.I;
                xyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                xyVar.i = bfVar.n;
                xyVar.j = bfVar.r;
                xyVar.h = bfVar.x;
                TLRPC.BotInlineResult botInlineResult = bfVar.N;
                if (botInlineResult != null && bfVar.H == 1) {
                    xyVar.m = botInlineResult;
                    xyVar.n = bfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        f30.a(f30Var, z14, arrayList);
        if (i3 != 8) {
            f30Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.zh
    public final void r0() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.zh
    public final void v0() {
        org.telegram.messenger.g0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public final void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
