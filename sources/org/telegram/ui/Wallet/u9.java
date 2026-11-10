package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ y9 a;

    public /* synthetic */ u9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // jg.f0
    public void a(a0.h hVar, ArrayList arrayList) {
        y9 y9Var = this.a;
        ArrayList arrayList2 = y9Var.s;
        if (y9Var.r) {
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
            if ((tLObject instanceof TLRPC.User) && y9.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        fi.w3 w3Var = y9Var.a;
        if (w3Var != null) {
            w3Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        y9 y9Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            y9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
