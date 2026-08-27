package eg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final dv0 a;

    public y(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(g6.v0(g6.h5, c6Var));
        dv0 dv0Var = new dv0(context, c6Var);
        this.a = dv0Var;
        addView(dv0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(g6.V0(getContext(), R.drawable.greydivider_top, g6.b7));
    }

    public void setCallBack(cv0 cv0Var) {
        this.a.setCallback(cv0Var);
    }
}
