package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public interface qy0 {
    jy0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i9);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(jy0 jy0Var, int i9, int i10);
}
