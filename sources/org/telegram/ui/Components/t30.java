package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
            arrayList.add(yyVar);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                String str = efVar.h;
                if (str != null) {
                    yyVar.c = str;
                } else {
                    yyVar.c = efVar.I;
                }
                yyVar.e = efVar.c;
                yyVar.f = efVar.g;
                yyVar.k = efVar.s;
                yyVar.p = efVar.d();
                yyVar.o = efVar.b;
                yyVar.z = efVar.m;
                yyVar.q = true;
                CharSequence charSequence = efVar.a;
                yyVar.d = charSequence != null ? charSequence.toString() : null;
                yyVar.i = efVar.n;
                yyVar.j = efVar.r;
                yyVar.h = efVar.x;
                TLRPC.VideoSize videoSize = efVar.S;
                yyVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof org.telegram.messenger.hf) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                String str2 = hfVar.h;
                if (str2 != null) {
                    yyVar.c = str2;
                } else {
                    yyVar.l = hfVar;
                }
                yyVar.e = hfVar.c;
                yyVar.f = hfVar.g;
                yyVar.k = hfVar.s;
                CharSequence charSequence2 = hfVar.I;
                yyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                yyVar.i = hfVar.n;
                yyVar.j = hfVar.r;
                yyVar.h = hfVar.x;
                TLRPC.BotInlineResult botInlineResult = hfVar.N;
                if (botInlineResult != null && hfVar.H == 1) {
                    yyVar.m = botInlineResult;
                    yyVar.n = hfVar.O;
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
