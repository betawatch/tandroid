package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pu implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ pu(Spanned spanned, int i10) {
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
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj);
                break;
            default:
                Spanned spanned2 = this.b;
                spanStart = spanned2.getSpanStart((tu) obj2);
                spanStart2 = spanned2.getSpanStart((tu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
