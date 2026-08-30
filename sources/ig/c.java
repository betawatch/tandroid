package ig;

import android.content.Context;
import org.telegram.messenger.Emoji;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c extends k5 {
    public final /* synthetic */ int J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, int i10) {
        super(context);
        this.J0 = i10;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean k(CharSequence charSequence) {
        switch (this.J0) {
            case 0:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 1:
            case 2:
            default:
                return super.k(charSequence);
            case 3:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 4:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean l(CharSequence charSequence, boolean z4) {
        switch (this.J0) {
            case 2:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z4);
            case 5:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z4);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.J0) {
            case 1:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
