package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f30 implements bi {
    public final /* synthetic */ j30 a;

    public f30(j30 j30Var) {
        this.a = j30Var;
    }

    @Override // org.telegram.ui.Components.bi
    public final void F0() {
        org.telegram.messenger.g0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void c0(qg qgVar) {
        qgVar.run();
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar;
        j30 j30Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = j30Var.a;
        if (f2Var == null || f2Var.getParentActivity() == null || (diVar = j30Var.c) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            diVar.L(i7);
            if (i7 == 0) {
                j30Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = diVar.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = j30Var.c.a2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
            arrayList.add(fzVar);
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                String str = gfVar.h;
                if (str != null) {
                    fzVar.c = str;
                } else {
                    fzVar.c = gfVar.I;
                }
                fzVar.e = gfVar.c;
                fzVar.f = gfVar.g;
                fzVar.k = gfVar.s;
                fzVar.p = gfVar.d();
                fzVar.o = gfVar.b;
                fzVar.z = gfVar.m;
                fzVar.q = true;
                CharSequence charSequence = gfVar.a;
                fzVar.d = charSequence != null ? charSequence.toString() : null;
                fzVar.i = gfVar.n;
                fzVar.j = gfVar.r;
                fzVar.h = gfVar.x;
                TLRPC.VideoSize videoSize = gfVar.S;
                fzVar.v = videoSize;
                z13 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.kf) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                String str2 = kfVar.h;
                if (str2 != null) {
                    fzVar.c = str2;
                } else {
                    fzVar.l = kfVar;
                }
                fzVar.e = kfVar.c;
                fzVar.f = kfVar.g;
                fzVar.k = kfVar.s;
                CharSequence charSequence2 = kfVar.I;
                fzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                fzVar.i = kfVar.n;
                fzVar.j = kfVar.r;
                fzVar.h = kfVar.x;
                TLRPC.BotInlineResult botInlineResult = kfVar.N;
                if (botInlineResult != null && kfVar.H == 1) {
                    fzVar.m = botInlineResult;
                    fzVar.n = kfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        j30.a(j30Var, z13, arrayList);
        if (i7 != 8) {
            j30Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.bi
    public final void t0() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public final void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
