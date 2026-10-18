package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements hg.f0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ w9 a;

    public /* synthetic */ s9(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // hg.f0
    public void b(a0.h hVar, ArrayList arrayList) {
        w9 w9Var = this.a;
        ArrayList arrayList2 = w9Var.r;
        if (w9Var.n) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hg.g0 g0Var = (hg.g0) obj;
            TLObject tLObject = g0Var.a;
            if ((tLObject instanceof TLRPC.User) && w9.b0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        u61 u61Var = w9Var.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        w9 w9Var = this.a;
        w9Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            w9Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
