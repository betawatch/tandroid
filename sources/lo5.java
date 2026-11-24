// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lo5 implements gs3 {
    public final /* synthetic */ byte a;
    public String b;

    public lo5(String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override // gs3
    public final int b(int i) {
        return -1;
    }

    @Override // gs3
    public final boolean c(int i) {
        return false;
    }

    @Override // gs3
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // gs3
    public final int length() {
        return this.b.length();
    }

    @Override // gs3
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return this.b;
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}
