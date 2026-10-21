package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ev;
import org.telegram.ui.o51;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                Method method = m1.k;
                break;
            case 1:
                Field field = ev.f;
                break;
            default:
                Field field2 = o51.c;
                break;
        }
    }
}
