package c8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class ud {
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
            di.b3 b3Var = new di.b3(viewGroup.getContext(), 8);
            xf.a aVar3 = new xf.a(b3Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, aVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(b3Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(b3Var, new ViewGroup.LayoutParams(1, 1));
            }
            aVar2 = aVar3;
        }
        cVar.b = aVar2;
        return aVar2;
    }
}
