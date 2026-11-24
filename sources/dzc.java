// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dzc extends gzc {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final l94 f = new l94(l94.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        uyc i = i(view);
        if (i != null) {
            i.b();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, wzc wzcVar, boolean z) {
        uyc i = i(view);
        if (i != null) {
            i.a = wzcVar;
            if (!z) {
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), wzcVar, z);
            }
        }
    }

    public static void g(View view, wzc wzcVar, List list) {
        uyc i = i(view);
        if (i != null) {
            i.c(wzcVar, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), wzcVar, list);
            }
        }
    }

    public static void h(View view, xab xabVar) {
        uyc i = i(view);
        if (i != null) {
            if (i.c == 0) {
                Iterator it = i.d.iterator();
                while (it.hasNext()) {
                    ((tyc) it.next()).v();
                }
            }
            i.c++;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), xabVar);
            }
        }
    }

    public static uyc i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof czc) {
            return ((czc) tag).a;
        }
        return null;
    }
}
