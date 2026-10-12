package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.jv;
import org.telegram.ui.i71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                Field field = jv.f;
                break;
            default:
                Field field2 = i71.c;
                break;
        }
    }
}
