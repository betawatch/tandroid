// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aec extends sn2 {
    public final /* synthetic */ bec E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aec(bec becVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = becVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        bec becVar = this.E;
        boolean z = becVar.d;
        float f = becVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
