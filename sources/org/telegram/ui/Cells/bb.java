package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bb {
    public final w01 a;
    public w01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new w01(charSequence, 12.0f, null);
        this.b = new w01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
