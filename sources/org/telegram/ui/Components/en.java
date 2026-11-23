package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class en implements si {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ org.telegram.messenger.y10 b;
    public final /* synthetic */ fi.n2 c;

    public en(fi.n2 n2Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = g2Var;
        this.b = y10Var;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        org.telegram.messenger.ls.f(this.a.getCurrentAccount()).d(ghVar);
    }

    @Override // org.telegram.ui.Components.si
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.e2;
        org.telegram.messenger.y10 y10Var = this.b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.g2 g2Var = this.a;
            c5.d0(g2Var.getContext(), g2Var.getResourceProvider(), null, null, new dn(y10Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
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
                    zyVar.z = ffVar.m;
                    zyVar.q = true;
                    zyVar.o = ffVar.b;
                    CharSequence charSequence = ffVar.a;
                    zyVar.d = charSequence != null ? charSequence.toString() : null;
                    zyVar.i = ffVar.n;
                    zyVar.j = ffVar.r;
                    zyVar.h = ffVar.x;
                    zyVar.v = ffVar.S;
                    zyVar.y = ffVar;
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
                y10Var.a(new th.d(zyVar));
            }
        }
        n2Var.a(true);
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.si
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
