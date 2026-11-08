package di;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d4 extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ int M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Context context, int i7) {
        super(context);
        this.M0 = i7;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean k(CharSequence charSequence) {
        switch (this.M0) {
            case 2:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 3:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean l(CharSequence charSequence, boolean z9) {
        switch (this.M0) {
            case 1:
                return super.l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z9);
            case 4:
                return super.l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.l(charSequence, z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.M0) {
            case 0:
                super.onMeasure(i7, i10);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
