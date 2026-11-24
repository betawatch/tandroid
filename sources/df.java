// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class df implements hp7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ df(int[] iArr, byte b) {
        this.a = b;
        this.b = iArr;
    }

    @Override // hp7
    public final String c(int i) {
        byte b = this.a;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int i2 = iArr[i];
                return i2 == 0 ? jb6.M0(2131748064, null) : i2 < 60 ? jb6.G(i2, "Minutes", new Object[0]) : i2 < 1440 ? jb6.G(i2 / 60, "Hours", new Object[0]) : i2 < 10080 ? jb6.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? jb6.G(i2 / 10080, "Weeks", new Object[0]) : i2 < 525600 ? jb6.G(i2 / 44640, "Months", new Object[0]) : jb6.G(i2 / 525600, "Years", new Object[0]);
            default:
                int i3 = iArr[i];
                return i3 == 0 ? jb6.M0(2131753814, null) : i3 < 10080 ? jb6.G(i3 / 1440, "Days", new Object[0]) : i3 < 44640 ? jb6.G(i3 / 10080, "Weeks", new Object[0]) : i3 < 525600 ? jb6.G(i3 / 44640, "Months", new Object[0]) : jb6.G(i3 / 525600, "Years", new Object[0]);
        }
    }
}
