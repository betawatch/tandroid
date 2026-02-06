package org.telegram.ui.Components.blur3.capture;

import android.os.Build;
import android.view.View;

/* loaded from: classes5.dex */
public interface IBlur3Hash {
    void add(long j);

    void add(View view);

    void add(boolean z);

    void addF(float f);

    void unsupported();

    public abstract /* synthetic */ class -CC {
        public static void $default$add(IBlur3Hash iBlur3Hash, View view) {
            long uniqueDrawingId;
            if (Build.VERSION.SDK_INT >= 29) {
                uniqueDrawingId = view.getUniqueDrawingId();
                iBlur3Hash.add(uniqueDrawingId);
            } else {
                iBlur3Hash.unsupported();
            }
        }
    }
}
