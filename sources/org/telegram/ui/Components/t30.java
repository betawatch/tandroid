package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t30 implements si {
    public final /* synthetic */ x30 a;

    public t30(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // org.telegram.ui.Components.si
    public final void K0() {
        org.telegram.messenger.g0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.si
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void v0() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar;
        x30 x30Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = x30Var.a;
        if (g2Var == null || g2Var.getParentActivity() == null || (uiVar = x30Var.c) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            uiVar.M(i7);
            if (i7 == 0) {
                x30Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = uiVar.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = x30Var.c.e2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
            arrayList.add(zyVar);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                String str = ffVar.h;
                if (str != null) {
                    zyVar.c = str;
                } else {
                    zyVar.c = ffVar.I;
                }
                zyVar.e = ffVar.c;
                zyVar.f = ffVar.g;
                zyVar.k = ffVar.s;
                zyVar.p = ffVar.d();
                zyVar.o = ffVar.b;
                zyVar.z = ffVar.m;
                zyVar.q = true;
                CharSequence charSequence = ffVar.a;
                zyVar.d = charSequence != null ? charSequence.toString() : null;
                zyVar.i = ffVar.n;
                zyVar.j = ffVar.r;
                zyVar.h = ffVar.x;
                TLRPC.VideoSize videoSize = ffVar.S;
                zyVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                String str2 = jfVar.h;
                if (str2 != null) {
                    zyVar.c = str2;
                } else {
                    zyVar.l = jfVar;
                }
                zyVar.e = jfVar.c;
                zyVar.f = jfVar.g;
                zyVar.k = jfVar.s;
                CharSequence charSequence2 = jfVar.I;
                zyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                zyVar.i = jfVar.n;
                zyVar.j = jfVar.r;
                zyVar.h = jfVar.x;
                TLRPC.BotInlineResult botInlineResult = jfVar.N;
                if (botInlineResult != null && jfVar.H == 1) {
                    zyVar.m = botInlineResult;
                    zyVar.n = jfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        x30.a(x30Var, z14, arrayList);
        if (i7 != 8) {
            x30Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
