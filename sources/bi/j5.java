package bi;

import android.content.Context;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class j5 extends org.telegram.ui.ActionBar.j5 {
    public final /* synthetic */ int M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(Context context, int i10) {
        super(context);
        this.M0 = i10;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public boolean k(CharSequence charSequence) {
        switch (this.M0) {
            case 2:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 3:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.j5
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.M0) {
            case 1:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z10);
            case 4:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.j5, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.M0) {
            case 0:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
