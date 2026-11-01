package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.r20 d;

    public /* synthetic */ jd0(String[] strArr, Activity activity, org.telegram.messenger.r20 r20Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = activity;
        this.d = r20Var;
    }

    @Override // org.telegram.messenger.r20
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
                org.telegram.messenger.r20 r20Var = this.d;
                if (r20Var != null) {
                    r20Var.a(Boolean.valueOf(z10));
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
                org.telegram.messenger.r20 r20Var2 = this.d;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.valueOf(z11));
                    break;
                }
                break;
        }
    }
}
