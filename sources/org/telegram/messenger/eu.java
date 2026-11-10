package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class eu implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ eu(Spanned spanned, int i7) {
        this.a = i7;
        this.b = spanned;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.a) {
            case 0:
                Spanned spanned = this.b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj);
                break;
            default:
                Spanned spanned2 = this.b;
                spanStart = spanned2.getSpanStart((iu) obj2);
                spanStart2 = spanned2.getSpanStart((iu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
