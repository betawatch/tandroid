// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class de implements dn7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ de(int[] iArr, byte b) {
        this.a = b;
        this.b = iArr;
    }

    @Override // dn7
    public final String c(int i) {
        byte b = this.a;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int i2 = iArr[i];
                return i2 == 0 ? k96.M0(2131748115, null) : i2 < 60 ? k96.G(i2, "Minutes", new Object[0]) : i2 < 1440 ? k96.G(i2 / 60, "Hours", new Object[0]) : i2 < 10080 ? k96.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? k96.G(i2 / 10080, "Weeks", new Object[0]) : i2 < 525600 ? k96.G(i2 / 44640, "Months", new Object[0]) : k96.G(i2 / 525600, "Years", new Object[0]);
            default:
                int i3 = iArr[i];
                return i3 == 0 ? k96.M0(2131753846, null) : i3 < 10080 ? k96.G(i3 / 1440, "Days", new Object[0]) : i3 < 44640 ? k96.G(i3 / 10080, "Weeks", new Object[0]) : i3 < 525600 ? k96.G(i3 / 44640, "Months", new Object[0]) : k96.G(i3 / 525600, "Years", new Object[0]);
        }
    }
}
