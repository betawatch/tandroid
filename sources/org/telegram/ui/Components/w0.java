package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements wb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ w0(int[] iArr, int i10) {
        this.a = i10;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.wb0
    public final String e(int i10) {
        int i11 = this.a;
        int[] iArr = this.b;
        switch (i11) {
            case 0:
                int i12 = iArr[i10];
                return i12 == 0 ? org.telegram.messenger.cd.L0(2131748322, null) : i12 < 60 ? org.telegram.messenger.cd.G(i12, "Minutes", new Object[0]) : i12 < 1440 ? org.telegram.messenger.cd.G(i12 / 60, "Hours", new Object[0]) : i12 < 10080 ? org.telegram.messenger.cd.G(i12 / 1440, "Days", new Object[0]) : i12 < 44640 ? org.telegram.messenger.cd.G(i12 / 10080, "Weeks", new Object[0]) : i12 < 525600 ? org.telegram.messenger.cd.G(i12 / 44640, "Months", new Object[0]) : org.telegram.messenger.cd.G(i12 / 525600, "Years", new Object[0]);
            default:
                int i13 = iArr[i10];
                return i13 == 0 ? org.telegram.messenger.cd.L0(2131753849, null) : i13 < 10080 ? org.telegram.messenger.cd.G(i13 / 1440, "Days", new Object[0]) : i13 < 44640 ? org.telegram.messenger.cd.G(i13 / 10080, "Weeks", new Object[0]) : i13 < 525600 ? org.telegram.messenger.cd.G(i13 / 44640, "Months", new Object[0]) : org.telegram.messenger.cd.G(i13 / 525600, "Years", new Object[0]);
        }
    }
}
