package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rh implements org.telegram.ui.io0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ bi d;

    public rh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.io0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.io0
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
                ((org.telegram.ui.un) this.d.W1).p8(i10, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i11));
            org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
            arrayList.add(qzVar);
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
            String str = jfVar.h;
            if (str != null) {
                qzVar.c = str;
            } else {
                qzVar.l = jfVar;
            }
            qzVar.e = jfVar.c;
            qzVar.k = jfVar.s;
            CharSequence charSequence = jfVar.I;
            qzVar.d = charSequence != null ? charSequence.toString() : null;
            qzVar.i = jfVar.n;
            qzVar.j = jfVar.r;
            qzVar.h = jfVar.x;
            TLRPC.BotInlineResult botInlineResult = jfVar.N;
            if (botInlineResult != null && jfVar.H == 1) {
                qzVar.m = botInlineResult;
                qzVar.n = jfVar.O;
            }
            System.currentTimeMillis();
            i11++;
        }
    }

    @Override // org.telegram.ui.io0
    public final void B(Editable editable) {
    }

    @Override // org.telegram.ui.io0
    public final /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.io0
    public final void y() {
    }
}
