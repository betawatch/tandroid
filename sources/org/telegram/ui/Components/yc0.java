package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.w10 d;

    public /* synthetic */ yc0(String[] strArr, Activity activity, org.telegram.messenger.w10 w10Var, int i7) {
        this.a = i7;
        this.b = strArr;
        this.c = activity;
        this.d = w10Var;
    }

    @Override // org.telegram.messenger.w10
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
                org.telegram.messenger.w10 w10Var = this.d;
                if (w10Var != null) {
                    w10Var.a(Boolean.valueOf(z10));
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
                org.telegram.messenger.w10 w10Var2 = this.d;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.valueOf(z11));
                    break;
                }
                break;
        }
    }
}
