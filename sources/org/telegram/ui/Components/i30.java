package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i30 implements ii {
    public final /* synthetic */ m30 a;

    public i30(m30 m30Var) {
        this.a = m30Var;
    }

    @Override // org.telegram.ui.Components.ii
    public final void K0() {
        org.telegram.messenger.g0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void d0(vg vgVar) {
        vgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void v0() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.ii
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar;
        m30 m30Var = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = m30Var.a;
        if (e2Var == null || e2Var.getParentActivity() == null || (kiVar = m30Var.c) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            kiVar.M(i7);
            if (i7 == 0) {
                m30Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = kiVar.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = m30Var.c.e2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
            arrayList.add(dzVar);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                String str = ffVar.h;
                if (str != null) {
                    dzVar.c = str;
                } else {
                    dzVar.c = ffVar.I;
                }
                dzVar.e = ffVar.c;
                dzVar.f = ffVar.g;
                dzVar.k = ffVar.s;
                dzVar.p = ffVar.d();
                dzVar.o = ffVar.b;
                dzVar.z = ffVar.m;
                dzVar.q = true;
                CharSequence charSequence = ffVar.a;
                dzVar.d = charSequence != null ? charSequence.toString() : null;
                dzVar.i = ffVar.n;
                dzVar.j = ffVar.r;
                dzVar.h = ffVar.x;
                TLRPC.VideoSize videoSize = ffVar.S;
                dzVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                String str2 = jfVar.h;
                if (str2 != null) {
                    dzVar.c = str2;
                } else {
                    dzVar.l = jfVar;
                }
                dzVar.e = jfVar.c;
                dzVar.f = jfVar.g;
                dzVar.k = jfVar.s;
                CharSequence charSequence2 = jfVar.I;
                dzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                dzVar.i = jfVar.n;
                dzVar.j = jfVar.r;
                dzVar.h = jfVar.x;
                TLRPC.BotInlineResult botInlineResult = jfVar.N;
                if (botInlineResult != null && jfVar.H == 1) {
                    dzVar.m = botInlineResult;
                    dzVar.n = jfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        m30.a(m30Var, z14, arrayList);
        if (i7 != 8) {
            m30Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
