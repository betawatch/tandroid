package og;

import android.content.Context;
import org.telegram.messenger.k6;
import org.telegram.ui.ActionBar.u5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends u5 {
    public final /* synthetic */ int M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, int i10) {
        super(context);
        this.M0 = i10;
    }

    @Override // org.telegram.ui.ActionBar.u5
    public boolean k(CharSequence charSequence) {
        switch (this.M0) {
            case 0:
                return l(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 1:
            default:
                return super.k(charSequence);
            case 2:
                return l(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 3:
                return l(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.u5
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.M0) {
            case 1:
                return super.l(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z10);
            case 4:
                return super.l(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.M0) {
            case 5:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
