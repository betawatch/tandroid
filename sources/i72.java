// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i72 implements g22 {
    public final /* synthetic */ d a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ e51 c;

    public i72(e51 e51Var, qac qacVar, d dVar) {
        this.a = dVar;
        this.b = qacVar;
        this.c = e51Var;
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        e51 e51Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = e51Var.d2;
        qac qacVar = this.b;
        if (i == 15) {
            d dVar = this.a;
            ik.d0(dVar.getContext(), dVar.getResourceProvider(), null, null, new h72(qacVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                z5a z5aVar = new z5a();
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    String str = jo6Var.h;
                    if (str != null) {
                        z5aVar.c = str;
                    } else {
                        z5aVar.c = jo6Var.I;
                    }
                    z5aVar.e = jo6Var.c;
                    z5aVar.f = jo6Var.g;
                    z5aVar.k = jo6Var.s;
                    z5aVar.p = jo6Var.d();
                    z5aVar.z = jo6Var.m;
                    z5aVar.q = true;
                    z5aVar.o = jo6Var.b;
                    CharSequence charSequence = jo6Var.a;
                    z5aVar.d = charSequence != null ? charSequence.toString() : null;
                    z5aVar.i = jo6Var.n;
                    z5aVar.j = jo6Var.r;
                    z5aVar.h = jo6Var.x;
                    z5aVar.v = jo6Var.S;
                    z5aVar.y = jo6Var;
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str2 = no6Var.h;
                    if (str2 != null) {
                        z5aVar.c = str2;
                    } else {
                        z5aVar.l = no6Var;
                    }
                    z5aVar.e = no6Var.c;
                    z5aVar.f = no6Var.g;
                    z5aVar.k = no6Var.s;
                    CharSequence charSequence2 = no6Var.I;
                    z5aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    z5aVar.i = no6Var.n;
                    z5aVar.j = no6Var.r;
                    z5aVar.h = no6Var.x;
                    TLRPC.BotInlineResult botInlineResult = no6Var.N;
                    if (botInlineResult != null && no6Var.H) {
                        z5aVar.m = botInlineResult;
                        z5aVar.n = no6Var.O;
                    }
                    System.currentTimeMillis();
                }
                qacVar.a(new rf8(z5aVar));
            }
        }
        e51Var.a(true);
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        nm7.f(this.a.getCurrentAccount()).d(vr0Var);
    }

    @Override // g22
    public final void I() {
    }

    @Override // g22
    public final void b0() {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
