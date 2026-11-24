// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dg0 extends lka {
    public final /* synthetic */ byte N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg0(Context context, byte b) {
        super(context);
        this.N0 = b;
    }

    @Override // lka
    public final boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 0:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 5:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // lka
    public final boolean l(CharSequence charSequence, boolean z) {
        switch (this.N0) {
            case 1:
                return super.l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 2:
                return super.l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z);
            default:
                return super.l(charSequence, z);
        }
    }

    @Override // lka, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.N0) {
            case 3:
                super.onMeasure(i, i2);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
