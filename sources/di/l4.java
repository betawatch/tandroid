package di;

import android.content.Context;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l4 extends org.telegram.ui.ActionBar.b6 {
    public final /* synthetic */ int M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Context context, int i10) {
        super(context);
        this.M0 = i10;
    }

    @Override // org.telegram.ui.ActionBar.b6
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

    @Override // org.telegram.ui.ActionBar.b6
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

    @Override // org.telegram.ui.ActionBar.b6, android.view.View
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
