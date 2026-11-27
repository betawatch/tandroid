// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class n2f {
    public static thc a(View view, vhc vhcVar) {
        thc thcVar = vhcVar.b;
        if (thcVar != null) {
            return thcVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            lq5.j("Cannot add OnPostDrawListener to root view");
            return null;
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        thc thcVar2 = (thc) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (thcVar2 == null) {
            vl4 vl4Var = new vl4(viewGroup.getContext());
            thc thcVar3 = new thc(vl4Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, thcVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(vl4Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(vl4Var, new ViewGroup.LayoutParams(1, 1));
            }
            thcVar2 = thcVar3;
        }
        vhcVar.b = thcVar2;
        return thcVar2;
    }
}
