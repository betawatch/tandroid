package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public interface ca {
    Layout getLayout();

    CharSequence getPrefix();

    int getRow();

    Rect getSelectionBounds();

    CharSequence getText();

    int getX();

    int getY();
}
