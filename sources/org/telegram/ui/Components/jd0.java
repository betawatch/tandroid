package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.q20 d;

    public /* synthetic */ jd0(String[] strArr, Activity activity, org.telegram.messenger.q20 q20Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = activity;
        this.d = q20Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = this.b;
                int length = strArr.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (this.c.checkSelfPermission(strArr[i10]) == 0) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    }
                }
                org.telegram.messenger.q20 q20Var = this.d;
                if (q20Var != null) {
                    q20Var.a(Boolean.valueOf(z10));
                    break;
                }
                break;
            default:
                String[] strArr2 = this.b;
                int length2 = strArr2.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (this.c.checkSelfPermission(strArr2[i11]) == 0) {
                            i11++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                org.telegram.messenger.q20 q20Var2 = this.d;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.valueOf(z11));
                    break;
                }
                break;
        }
    }
}
