package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
