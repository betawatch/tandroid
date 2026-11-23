package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cn implements ri {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ org.telegram.messenger.w10 b;
    public final /* synthetic */ fi.n2 c;

    public cn(fi.n2 n2Var, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = g2Var;
        this.b = w10Var;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.ri
    public final void S(fh fhVar) {
        org.telegram.messenger.ks.f(this.a.getCurrentAccount()).d(fhVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var.e2;
        org.telegram.messenger.w10 w10Var = this.b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.g2 g2Var = this.a;
            b5.d0(g2Var.getContext(), g2Var.getResourceProvider(), null, null, new bn(w10Var, 0), null);
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
                w10Var.a(new th.d(yyVar));
            }
        }
        n2Var.a(true);
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final void B0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
