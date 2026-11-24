// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class hea extends o39 implements n2b {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // n2b
    public final void b(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - gl.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - gl.L(2.0f)) - this.h3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.i3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f3 = i2;
        this.g3 = i4;
        super.setPadding(i, i2, i3, i4);
    }
}
