package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements kg.c0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ w9 a;

    public /* synthetic */ s9(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // kg.c0
    public void a(a0.h hVar, ArrayList arrayList) {
        w9 w9Var = this.a;
        ArrayList arrayList2 = w9Var.s;
        if (w9Var.r) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            kg.d0 d0Var = (kg.d0) obj;
            TLObject tLObject = d0Var.a;
            if ((tLObject instanceof TLRPC.User) && w9.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) d0Var.a);
            }
        }
        ai.h4 h4Var = w9Var.a;
        if (h4Var != null) {
            h4Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        w9 w9Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            w9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
