package og;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yu0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final yu0 a;
    public final View b;

    public x(Context context, p6 p6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, b6.o(-1, -1));
        a7.i(t6.h5, view, p6Var);
        yu0 yu0Var = new yu0(context, p6Var);
        this.a = yu0Var;
        addView(yu0Var, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        a7.a0(this, getContext(), R.drawable.greydivider_top, t6.b7);
    }

    public void setCallBack(xu0 xu0Var) {
        this.a.setCallback(xu0Var);
    }
}
