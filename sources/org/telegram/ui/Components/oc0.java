package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.messenger.c20 d;

    public /* synthetic */ oc0(String[] strArr, Activity activity, org.telegram.messenger.c20 c20Var, int i7) {
        this.a = i7;
        this.b = strArr;
        this.c = activity;
        this.d = c20Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = this.b;
                int length = strArr.length;
                boolean z9 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (this.c.checkSelfPermission(strArr[i7]) == 0) {
                            z9 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                org.telegram.messenger.c20 c20Var = this.d;
                if (c20Var != null) {
                    c20Var.a(Boolean.valueOf(z9));
                    break;
                }
                break;
            default:
                String[] strArr2 = this.b;
                int length2 = strArr2.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (this.c.checkSelfPermission(strArr2[i10]) == 0) {
                            i10++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                org.telegram.messenger.c20 c20Var2 = this.d;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
