// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class hga extends r59 implements o4b {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // o4b
    public final void b(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - gm.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - gm.L(2.0f)) - this.h3;
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
