package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final uv0 a;

    public x(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        addView(view, c6.n(-1, -1));
        view.setBackgroundColor(k6.v0(k6.h5, g6Var));
        uv0 uv0Var = new uv0(context, g6Var);
        this.a = uv0Var;
        addView(uv0Var, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(k6.V0(getContext(), R.drawable.greydivider_top, k6.b7));
    }

    public void setCallBack(tv0 tv0Var) {
        this.a.setCallback(tv0Var);
    }
}
