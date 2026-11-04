package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qh implements org.telegram.ui.rm0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ bi d;

    public qh(bi biVar, HashMap hashMap, ArrayList arrayList) {
        this.d = biVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.rm0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.rm0
    public final void v0(int i3, boolean z10, boolean z11) {
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
                ((org.telegram.ui.wm) this.d.X1).s8(i3, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
            org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
            arrayList.add(xyVar);
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
            String str = bfVar.h;
            if (str != null) {
                xyVar.c = str;
            } else {
                xyVar.l = bfVar;
            }
            xyVar.e = bfVar.c;
            xyVar.k = bfVar.s;
            CharSequence charSequence = bfVar.I;
            xyVar.d = charSequence != null ? charSequence.toString() : null;
            xyVar.i = bfVar.n;
            xyVar.j = bfVar.r;
            xyVar.h = bfVar.x;
            TLRPC.BotInlineResult botInlineResult = bfVar.N;
            if (botInlineResult != null && bfVar.H == 1) {
                xyVar.m = botInlineResult;
                xyVar.n = bfVar.O;
            }
            System.currentTimeMillis();
            i10++;
        }
    }

    @Override // org.telegram.ui.rm0
    public final void u(Editable editable) {
    }

    @Override // org.telegram.ui.rm0
    public final /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.rm0
    public final void m() {
    }
}
