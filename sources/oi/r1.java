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
public final class r1 implements ck {
    public final /* synthetic */ ui a;
    public final /* synthetic */ b2 b;

    public r1(b2 b2Var, ui uiVar) {
        this.b = b2Var;
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.ck
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.b;
        if (!isEmpty) {
            b2Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = b2Var.Q;
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
