// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
