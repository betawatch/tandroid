package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.ev;
import org.telegram.ui.q51;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                Field field2 = q51.c;
                break;
        }
    }
}
