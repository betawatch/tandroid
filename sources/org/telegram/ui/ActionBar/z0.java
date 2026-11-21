package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ku;
import org.telegram.ui.j11;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                Method method = g1.k;
                break;
            case 1:
                Field field = ku.f;
                break;
            default:
                Field field2 = j11.c;
                break;
        }
    }
}
