package androidx.core.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class MarginLayoutParamsCompat {
    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }
}
