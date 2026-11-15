package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ m60(int i7, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                HashMap hashMap = this.c;
                boolean z10 = this.d;
                boolean z11 = this.e;
                String str = LaunchActivity.C1;
                Utilities.e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i10), hashMap, z10, z11, true));
                break;
            case 1:
                int i11 = this.b;
                HashMap hashMap2 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                String str2 = LaunchActivity.C1;
                Utilities.e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i11), hashMap2, z12, z13, false));
                break;
            default:
                int i12 = this.b;
                HashMap hashMap3 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                String str3 = LaunchActivity.C1;
                Utilities.e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i12), hashMap3, z14, z15, true));
                break;
        }
    }
}
