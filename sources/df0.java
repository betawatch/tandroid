// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class df0 extends jia {
    public final /* synthetic */ byte N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df0(Context context, byte b) {
        super(context);
        this.N0 = b;
    }

    @Override // jia
    public final boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 0:
                return l(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
                return l(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 5:
                return l(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // jia
    public final boolean l(CharSequence charSequence, boolean z) {
        switch (this.N0) {
            case 1:
                return super.l(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 2:
                return super.l(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z);
            default:
                return super.l(charSequence, z);
        }
    }

    @Override // jia, android.view.View
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
