package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class bu implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ bu(Spanned spanned, int i7) {
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
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj);
                break;
            default:
                Spanned spanned2 = this.b;
                spanStart = spanned2.getSpanStart((fu) obj2);
                spanStart2 = spanned2.getSpanStart((fu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
