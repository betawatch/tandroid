package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zh implements org.telegram.ui.xm0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ki d;

    public zh(ki kiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = kiVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.xm0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.xm0
    public final void t0(int i7, boolean z10, boolean z11) {
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
                ((org.telegram.ui.an) this.d.a2).u8(i7, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
            org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
            arrayList.add(dzVar);
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
            String str = jfVar.h;
            if (str != null) {
                dzVar.c = str;
            } else {
                dzVar.l = jfVar;
            }
            dzVar.e = jfVar.c;
            dzVar.k = jfVar.s;
            CharSequence charSequence = jfVar.I;
            dzVar.d = charSequence != null ? charSequence.toString() : null;
            dzVar.i = jfVar.n;
            dzVar.j = jfVar.r;
            dzVar.h = jfVar.x;
            TLRPC.BotInlineResult botInlineResult = jfVar.N;
            if (botInlineResult != null && jfVar.H == 1) {
                dzVar.m = botInlineResult;
                dzVar.n = jfVar.O;
            }
            System.currentTimeMillis();
            i10++;
        }
    }

    @Override // org.telegram.ui.xm0
    public final void A(Editable editable) {
    }

    @Override // org.telegram.ui.xm0
    public final /* synthetic */ void d0() {
    }

    @Override // org.telegram.ui.xm0
    public final void y() {
    }
}
