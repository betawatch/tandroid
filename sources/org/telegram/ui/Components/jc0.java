package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.u10 d;

    public /* synthetic */ jc0(String[] strArr, Activity activity, org.telegram.messenger.u10 u10Var, int i3) {
        this.a = i3;
        this.b = strArr;
        this.c = activity;
        this.d = u10Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = this.b;
                int length = strArr.length;
                boolean z10 = false;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (this.c.checkSelfPermission(strArr[i3]) == 0) {
                            z10 = true;
                        } else {
                            i3++;
                        }
                    }
                }
                org.telegram.messenger.u10 u10Var = this.d;
                if (u10Var != null) {
                    u10Var.a(Boolean.valueOf(z10));
                    break;
                }
                break;
            default:
                String[] strArr2 = this.b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.u10 u10Var2 = this.d;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.valueOf(z11));
                    break;
                }
                break;
        }
    }
}
