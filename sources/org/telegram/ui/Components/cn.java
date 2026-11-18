package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cn implements qi {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ fi.n2 c;

    public cn(fi.n2 n2Var, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = h2Var;
        this.b = x10Var;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void f0(eh ehVar) {
        org.telegram.messenger.ks.f(this.a.getCurrentAccount()).d(ehVar);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.e2;
        org.telegram.messenger.x10 x10Var = this.b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.h2 h2Var = this.a;
            b5.d0(h2Var.getContext(), h2Var.getResourceProvider(), null, null, new bn(x10Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
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
                    yyVar.z = efVar.m;
                    yyVar.q = true;
                    yyVar.o = efVar.b;
                    CharSequence charSequence = efVar.a;
                    yyVar.d = charSequence != null ? charSequence.toString() : null;
                    yyVar.i = efVar.n;
                    yyVar.j = efVar.r;
                    yyVar.h = efVar.x;
                    yyVar.v = efVar.S;
                    yyVar.y = efVar;
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
                x10Var.a(new th.d(yyVar));
            }
        }
        n2Var.a(true);
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.qi
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.qi
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
