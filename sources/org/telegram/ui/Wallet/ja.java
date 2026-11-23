package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements jg.f0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ na a;

    public /* synthetic */ ja(na naVar) {
        this.a = naVar;
    }

    @Override // jg.f0
    public void a(a0.h hVar, ArrayList arrayList) {
        na naVar = this.a;
        ArrayList arrayList2 = naVar.s;
        if (naVar.r) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            jg.g0 g0Var = (jg.g0) obj;
            TLObject tLObject = g0Var.a;
            if ((tLObject instanceof TLRPC.User) && na.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        bi.f6 f6Var = naVar.a;
        if (f6Var != null) {
            f6Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        na naVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            naVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
