package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public interface uy0 extends org.telegram.ui.Cells.v9 {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i10);

    void setX(int i10);

    void setY(int i10);
}
