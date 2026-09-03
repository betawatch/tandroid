package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public interface fz0 extends org.telegram.ui.Cells.w9 {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i10);

    void setX(int i10);

    void setY(int i10);
}
