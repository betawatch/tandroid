package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
            arrayList.add(zyVar);
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
            String str = jfVar.h;
            if (str != null) {
                zyVar.c = str;
            } else {
                zyVar.l = jfVar;
            }
            zyVar.e = jfVar.c;
            zyVar.k = jfVar.s;
            CharSequence charSequence = jfVar.I;
            zyVar.d = charSequence != null ? charSequence.toString() : null;
            zyVar.i = jfVar.n;
            zyVar.j = jfVar.r;
            zyVar.h = jfVar.x;
            TLRPC.BotInlineResult botInlineResult = jfVar.N;
            if (botInlineResult != null && jfVar.H == 1) {
                zyVar.m = botInlineResult;
                zyVar.n = jfVar.O;
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
