package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ m70(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                int i11 = this.b;
                HashMap hashMap = this.c;
                boolean z10 = this.d;
                boolean z11 = this.e;
                Pattern pattern = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i11), hashMap, z10, z11, true));
                break;
            case 1:
                int i12 = this.b;
                HashMap hashMap2 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                Pattern pattern2 = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i12), hashMap2, z12, z13, false));
                break;
            default:
                int i13 = this.b;
                HashMap hashMap3 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                Pattern pattern3 = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i13), hashMap3, z14, z15, true));
                break;
        }
    }
}
