package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public interface tz0 {
    mz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(mz0 mz0Var, int i10, int i11);
}
