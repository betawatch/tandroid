package fi;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class u3 extends org.telegram.ui.ActionBar.m5 {
    public final /* synthetic */ int N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Context context, int i7) {
        super(context);
        this.N0 = i7;
    }

    @Override // org.telegram.ui.ActionBar.m5
    public boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 2:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 3:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m5
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.N0) {
            case 1:
                return super.l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z10);
            case 4:
                return super.l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.N0) {
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
