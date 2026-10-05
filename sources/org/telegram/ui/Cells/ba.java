package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public interface ba {
    Layout getLayout();

    CharSequence getPrefix();

    int getRow();

    Rect getSelectionBounds();

    CharSequence getText();

    int getX();

    int getY();
}
