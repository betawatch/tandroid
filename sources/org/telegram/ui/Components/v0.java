package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements ya0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ v0(int[] iArr, int i3) {
        this.a = i3;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.ya0
    public final String e(int i3) {
        int i10 = this.a;
        int[] iArr = this.b;
        switch (i10) {
            case 0:
                int i11 = iArr[i3];
                return i11 == 0 ? org.telegram.messenger.bd.M0(2131748315, null) : i11 < 60 ? org.telegram.messenger.bd.G(i11, "Minutes", new Object[0]) : i11 < 1440 ? org.telegram.messenger.bd.G(i11 / 60, "Hours", new Object[0]) : i11 < 10080 ? org.telegram.messenger.bd.G(i11 / 1440, "Days", new Object[0]) : i11 < 44640 ? org.telegram.messenger.bd.G(i11 / 10080, "Weeks", new Object[0]) : i11 < 525600 ? org.telegram.messenger.bd.G(i11 / 44640, "Months", new Object[0]) : org.telegram.messenger.bd.G(i11 / 525600, "Years", new Object[0]);
            default:
                int i12 = iArr[i3];
                return i12 == 0 ? org.telegram.messenger.bd.M0(2131753849, null) : i12 < 10080 ? org.telegram.messenger.bd.G(i12 / 1440, "Days", new Object[0]) : i12 < 44640 ? org.telegram.messenger.bd.G(i12 / 10080, "Weeks", new Object[0]) : i12 < 525600 ? org.telegram.messenger.bd.G(i12 / 44640, "Months", new Object[0]) : org.telegram.messenger.bd.G(i12 / 525600, "Years", new Object[0]);
        }
    }
}
