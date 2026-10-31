package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rh implements org.telegram.ui.ko0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ bi d;

    public rh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.ko0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ko0
    public final void u0(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                ((org.telegram.ui.un) this.d.W1).l8(i10, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i11));
            org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
            arrayList.add(pzVar);
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
            String str = hfVar.h;
            if (str != null) {
                pzVar.c = str;
            } else {
                pzVar.l = hfVar;
            }
            pzVar.e = hfVar.c;
            pzVar.k = hfVar.s;
            CharSequence charSequence = hfVar.I;
            pzVar.d = charSequence != null ? charSequence.toString() : null;
            pzVar.i = hfVar.n;
            pzVar.j = hfVar.r;
            pzVar.h = hfVar.x;
            TLRPC.BotInlineResult botInlineResult = hfVar.N;
            if (botInlineResult != null && hfVar.H == 1) {
                pzVar.m = botInlineResult;
                pzVar.n = hfVar.O;
            }
            System.currentTimeMillis();
            i11++;
        }
    }

    @Override // org.telegram.ui.ko0
    public final void B(Editable editable) {
    }

    @Override // org.telegram.ui.ko0
    public final /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.ko0
    public final void y() {
    }
}
