package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FragmentTransition {
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    private FragmentTransition() {
    }

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void retainValues(ArrayMap arrayMap, ArrayMap namedViews) {
        Intrinsics.checkNotNullParameter(arrayMap, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = arrayMap.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    public static final void callSharedElementStartEnd(Fragment inFragment, Fragment outFragment, boolean z, ArrayMap sharedElements, boolean z2) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    public static final void setViewVisibility(List views, int i) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
