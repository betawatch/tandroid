package c8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class xd {
    public static xf.a a(View view, xf.c cVar) {
        xf.a aVar = cVar.b;
        if (aVar != null) {
            return aVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        xf.a aVar2 = (xf.a) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (aVar2 == null) {
            fi.u2 u2Var = new fi.u2(viewGroup.getContext(), 8);
            xf.a aVar3 = new xf.a(u2Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, aVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(u2Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(u2Var, new ViewGroup.LayoutParams(1, 1));
            }
            aVar2 = aVar3;
        }
        cVar.b = aVar2;
        return aVar2;
    }
}
