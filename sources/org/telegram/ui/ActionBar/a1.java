package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.xt;
import org.telegram.ui.h11;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                Method method = g1.k;
                break;
            case 1:
                Field field = xt.f;
                break;
            default:
                Field field2 = h11.c;
                break;
        }
    }
}
