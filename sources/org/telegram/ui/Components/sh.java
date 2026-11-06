package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sh implements org.telegram.ui.wm0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ di d;

    public sh(di diVar, HashMap hashMap, ArrayList arrayList) {
        this.d = diVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.wm0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.wm0
    public final void v0(int i7, boolean z9, boolean z10) {
        if (z9) {
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
                ((org.telegram.ui.an) this.d.W1).s8(i7, arrayList, z10);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
            org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
            arrayList.add(fzVar);
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
            String str = kfVar.h;
            if (str != null) {
                fzVar.c = str;
            } else {
                fzVar.l = kfVar;
            }
            fzVar.e = kfVar.c;
            fzVar.k = kfVar.s;
            CharSequence charSequence = kfVar.I;
            fzVar.d = charSequence != null ? charSequence.toString() : null;
            fzVar.i = kfVar.n;
            fzVar.j = kfVar.r;
            fzVar.h = kfVar.x;
            TLRPC.BotInlineResult botInlineResult = kfVar.N;
            if (botInlineResult != null && kfVar.H == 1) {
                fzVar.m = botInlineResult;
                fzVar.n = kfVar.O;
            }
            System.currentTimeMillis();
            i10++;
        }
    }

    @Override // org.telegram.ui.wm0
    public final void B(Editable editable) {
    }

    @Override // org.telegram.ui.wm0
    public final void A() {
    }

    @Override // org.telegram.ui.wm0
    public final /* synthetic */ void f0() {
    }
}
