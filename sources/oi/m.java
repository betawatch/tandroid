package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m implements ck {
    public final /* synthetic */ ui a;
    public final /* synthetic */ o b;

    public m(o oVar, ui uiVar) {
        this.b = oVar;
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.ck
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.a2.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        t3 t3Var = this.b.r;
        if (!arrayList.isEmpty()) {
            t3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            gj gjVar = (gj) arrayList3.get(0);
            t3Var.getClass();
            if (gjVar != null && gjVar.F0() != null) {
                TLRPC.Document F0 = gjVar.F0();
                TLRPC.Message message = gjVar.k;
                t3Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.ck
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.ck
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
