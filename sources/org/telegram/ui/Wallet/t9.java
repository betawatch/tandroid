package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ x9 a;

    public /* synthetic */ t9(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // jg.f0
    public void a(a0.h hVar, ArrayList arrayList) {
        x9 x9Var = this.a;
        ArrayList arrayList2 = x9Var.s;
        if (x9Var.r) {
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
            if ((tLObject instanceof TLRPC.User) && x9.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        fi.w3 w3Var = x9Var.a;
        if (w3Var != null) {
            w3Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x9 x9Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            x9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
