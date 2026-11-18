package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements ob0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ e1(int[] iArr, int i7) {
        this.a = i7;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.ob0
    public final String i(int i7) {
        int i10 = this.a;
        int[] iArr = this.b;
        switch (i10) {
            case 0:
                int i11 = iArr[i7];
                return i11 == 0 ? org.telegram.messenger.gd.M0(2131748115, null) : i11 < 60 ? org.telegram.messenger.gd.G(i11, "Minutes", new Object[0]) : i11 < 1440 ? org.telegram.messenger.gd.G(i11 / 60, "Hours", new Object[0]) : i11 < 10080 ? org.telegram.messenger.gd.G(i11 / 1440, "Days", new Object[0]) : i11 < 44640 ? org.telegram.messenger.gd.G(i11 / 10080, "Weeks", new Object[0]) : i11 < 525600 ? org.telegram.messenger.gd.G(i11 / 44640, "Months", new Object[0]) : org.telegram.messenger.gd.G(i11 / 525600, "Years", new Object[0]);
            default:
                int i12 = iArr[i7];
                return i12 == 0 ? org.telegram.messenger.gd.M0(2131753847, null) : i12 < 10080 ? org.telegram.messenger.gd.G(i12 / 1440, "Days", new Object[0]) : i12 < 44640 ? org.telegram.messenger.gd.G(i12 / 10080, "Weeks", new Object[0]) : i12 < 525600 ? org.telegram.messenger.gd.G(i12 / 44640, "Months", new Object[0]) : org.telegram.messenger.gd.G(i12 / 525600, "Years", new Object[0]);
        }
    }
}
