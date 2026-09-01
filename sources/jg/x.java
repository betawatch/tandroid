package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vv0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final vv0 a;

    public x(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        addView(view, c6.n(-1, -1));
        view.setBackgroundColor(k6.v0(k6.h5, g6Var));
        vv0 vv0Var = new vv0(context, g6Var);
        this.a = vv0Var;
        addView(vv0Var, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(k6.V0(getContext(), R.drawable.greydivider_top, k6.b7));
    }

    public void setCallBack(uv0 uv0Var) {
        this.a.setCallback(uv0Var);
    }
}
