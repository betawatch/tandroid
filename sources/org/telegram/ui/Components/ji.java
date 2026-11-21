package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ji implements org.telegram.ui.bn0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ui d;

    public ji(ui uiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = uiVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.bn0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.bn0
    public final void v0(int i7, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                ((org.telegram.ui.bn) this.d.a2).u8(i7, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
            org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
            arrayList.add(yyVar);
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
            String str = hfVar.h;
            if (str != null) {
                yyVar.c = str;
            } else {
                yyVar.l = hfVar;
            }
            yyVar.e = hfVar.c;
            yyVar.k = hfVar.s;
            CharSequence charSequence = hfVar.I;
            yyVar.d = charSequence != null ? charSequence.toString() : null;
            yyVar.i = hfVar.n;
            yyVar.j = hfVar.r;
            yyVar.h = hfVar.x;
            TLRPC.BotInlineResult botInlineResult = hfVar.N;
            if (botInlineResult != null && hfVar.H == 1) {
                yyVar.m = botInlineResult;
                yyVar.n = hfVar.O;
            }
            System.currentTimeMillis();
            i10++;
        }
    }

    @Override // org.telegram.ui.bn0
    public final void A(Editable editable) {
    }

    @Override // org.telegram.ui.bn0
    public final /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.bn0
    public final void u() {
    }
}
