package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ i60(int i3, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                HashMap hashMap = this.c;
                boolean z10 = this.d;
                boolean z11 = this.e;
                String str = LaunchActivity.E1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i10), hashMap, z10, z11, true));
                break;
            case 1:
                int i11 = this.b;
                HashMap hashMap2 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                String str2 = LaunchActivity.E1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i11), hashMap2, z12, z13, false));
                break;
            default:
                int i12 = this.b;
                HashMap hashMap3 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                String str3 = LaunchActivity.E1;
                Utilities.e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i12), hashMap3, z14, z15, true));
                break;
        }
    }
}
