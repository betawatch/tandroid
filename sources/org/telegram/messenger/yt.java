package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class yt implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ yt(Spanned spanned, int i7) {
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
                spanStart = spanned2.getSpanStart((cu) obj2);
                spanStart2 = spanned2.getSpanStart((cu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
