package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public interface jy0 extends org.telegram.ui.Cells.y9 {
    void attach(View view);

    void detach(View view);

    void draw(Canvas canvas, View view);

    int getEmojiOnlyCount();

    void setRow(int i9);

    void setX(int i9);

    void setY(int i9);
}
