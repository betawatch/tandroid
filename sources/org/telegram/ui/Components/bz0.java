package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public interface bz0 extends org.telegram.ui.Cells.ca {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i10);

    void setX(int i10);

    void setY(int i10);
}
