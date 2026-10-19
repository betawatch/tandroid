package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements hg.f0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ r9 a;

    public /* synthetic */ o9(r9 r9Var) {
        this.a = r9Var;
    }

    @Override // hg.f0
    public void b(a0.h hVar, ArrayList arrayList) {
        r9 r9Var = this.a;
        ArrayList arrayList2 = r9Var.r;
        if (r9Var.n) {
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
            if ((tLObject instanceof TLRPC.User) && r9.c0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) g0Var.a);
            }
        }
        v61 v61Var = r9Var.a;
        if (v61Var != null) {
            v61Var.W2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        r9 r9Var = this.a;
        r9Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            r9Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
