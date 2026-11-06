package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ o60(int i7, HashMap hashMap, boolean z9, boolean z10, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = hashMap;
        this.d = z9;
        this.e = z10;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                HashMap hashMap = this.c;
                boolean z9 = this.d;
                boolean z10 = this.e;
                String str = LaunchActivity.B1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i10), hashMap, z9, z10, true));
                break;
            case 1:
                int i11 = this.b;
                HashMap hashMap2 = this.c;
                boolean z11 = this.d;
                boolean z12 = this.e;
                String str2 = LaunchActivity.B1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i11), hashMap2, z11, z12, false));
                break;
            default:
                int i12 = this.b;
                HashMap hashMap3 = this.c;
                boolean z13 = this.d;
                boolean z14 = this.e;
                String str3 = LaunchActivity.B1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i12), hashMap3, z13, z14, true));
                break;
        }
    }
}
