package dg;

import android.content.Context;
import org.telegram.messenger.Emoji;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends h5 {
    public final /* synthetic */ int I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, int i9) {
        super(context);
        this.I0 = i9;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public boolean k(CharSequence charSequence) {
        switch (this.I0) {
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

    @Override // org.telegram.ui.ActionBar.h5
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.I0) {
            case 2:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z10);
            case 5:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.I0) {
            case 1:
                super.onMeasure(i9, i10);
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
