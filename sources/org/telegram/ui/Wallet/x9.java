package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x9 implements zf.x, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ ba a;

    public /* synthetic */ x9(ba baVar) {
        this.a = baVar;
    }

    @Override // zf.x
    public void a(a0.h hVar, ArrayList arrayList) {
        ba baVar = this.a;
        ArrayList arrayList2 = baVar.s;
        if (baVar.r) {
            return;
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            zf.y yVar = (zf.y) obj;
            TLObject tLObject = yVar.a;
            if ((tLObject instanceof TLRPC.User) && ba.h0((TLRPC.User) tLObject)) {
                arrayList2.add((TLRPC.User) yVar.a);
            }
        }
        ii iiVar = baVar.a;
        if (iiVar != null) {
            iiVar.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ba baVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
            baVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
