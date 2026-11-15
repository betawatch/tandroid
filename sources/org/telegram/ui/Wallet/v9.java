package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements jg.f0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ z9 a;

    public /* synthetic */ v9(z9 z9Var) {
        this.a = z9Var;
    }

    @Override // jg.f0
    public void a(a0.h hVar, ArrayList arrayList) {
        z9 z9Var = this.a;
        ArrayList arrayList2 = z9Var.s;
        if (z9Var.r) {
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
            if ((tLObject instanceof TLRPC.User) && z9.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        bi.v3 v3Var = z9Var.a;
        if (v3Var != null) {
            v3Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        z9 z9Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            z9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
