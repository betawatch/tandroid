package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public interface f01 {
    yz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(yz0 yz0Var, int i10, int i11);
}
