package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vm implements ii {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ org.telegram.messenger.z10 b;
    public final /* synthetic */ fi.p2 c;

    public vm(fi.p2 p2Var, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = e2Var;
        this.b = z10Var;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void d0(vg vgVar) {
        org.telegram.messenger.ns.f(this.a.getCurrentAccount()).d(vgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.p2 p2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p2Var.e2;
        org.telegram.messenger.z10 z10Var = this.b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.e2 e2Var = this.a;
            t4.d0(e2Var.getContext(), e2Var.getResourceProvider(), null, null, new um(z10Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
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
                    dzVar.z = ffVar.m;
                    dzVar.q = true;
                    dzVar.o = ffVar.b;
                    CharSequence charSequence = ffVar.a;
                    dzVar.d = charSequence != null ? charSequence.toString() : null;
                    dzVar.i = ffVar.n;
                    dzVar.j = ffVar.r;
                    dzVar.h = ffVar.x;
                    dzVar.v = ffVar.S;
                    dzVar.y = ffVar;
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
                z10Var.a(new th.d(dzVar));
            }
        }
        p2Var.a(true);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
