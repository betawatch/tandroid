package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.x10 d;

    public /* synthetic */ zc0(String[] strArr, Activity activity, org.telegram.messenger.x10 x10Var, int i7) {
        this.a = i7;
        this.b = strArr;
        this.c = activity;
        this.d = x10Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = this.b;
                int length = strArr.length;
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.c.checkSelfPermission(strArr[i7]) == 0) {
                            z10 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.x10 x10Var = this.d;
                if (x10Var != null) {
                    x10Var.a(Boolean.valueOf(z10));
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
                org.telegram.messenger.x10 x10Var2 = this.d;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.valueOf(z11));
                    break;
                }
                break;
        }
    }
}
