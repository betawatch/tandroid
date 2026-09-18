package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public interface kz0 {
    dz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(dz0 dz0Var, int i10, int i11);
}
