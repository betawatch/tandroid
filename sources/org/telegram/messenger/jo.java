package org.telegram.messenger;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vs e;

    public /* synthetic */ jo(vs vsVar, boolean z10, boolean z11, long j10, int i10) {
        this.a = i10;
        this.e = vsVar;
        this.c = z10;
        this.d = z11;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2131751914;
        long j10 = this.b;
        boolean z10 = this.d;
        boolean z11 = this.c;
        vs vsVar = this.e;
        switch (i10) {
            case 0:
                wp wpVar = (wp) vsVar;
                ArrayList arrayList = z11 ? wpVar.v0 : wpVar.u0;
                if (!z10) {
                    arrayList.remove(Long.valueOf(j10));
                    break;
                } else if (!arrayList.contains(Long.valueOf(j10))) {
                    arrayList.add(Long.valueOf(j10));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.un.U0((org.telegram.ui.un) vsVar, j10, z11, z10);
                break;
            case 2:
                yh.l lVar = (yh.l) vsVar;
                String L0 = dd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.Components.s4.u0(lVar, L0, dd.L0(i11, null), dd.L0(2131746336, null), true, new yh.f(lVar, j10, 0));
                break;
            default:
                yh.z zVar = (yh.z) vsVar;
                Context context = zVar.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = zVar.I0;
                String L02 = dd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.ActionBar.x1 O = org.telegram.ui.Components.s4.O(context, p6Var, L02, dd.L0(i11, null), dd.L0(2131746336, null), new vh.q8(zVar, j10, 1));
                O.show();
                TextView textView = (TextView) O.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jo(org.telegram.ui.un unVar, long j10, boolean z10, boolean z11) {
        this.a = 1;
        this.e = unVar;
        this.b = j10;
        this.c = z10;
        this.d = z11;
    }
}
