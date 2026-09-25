package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ p1(Spanned spanned, int i10) {
        this.a = i10;
        this.b = spanned;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.a) {
            case 0:
                Spanned spanned = this.b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
                spanStart = spannableStringBuilder.getSpanStart((w9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((w9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
