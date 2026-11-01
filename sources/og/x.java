package og;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final zu0 a;
    public final View b;

    public x(Context context, p6 p6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, b6.o(-1, -1));
        a7.i(t6.h5, view, p6Var);
        zu0 zu0Var = new zu0(context, p6Var);
        this.a = zu0Var;
        addView(zu0Var, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        a7.a0(this, getContext(), R.drawable.greydivider_top, t6.b7);
    }

    public void setCallBack(yu0 yu0Var) {
        this.a.setCallback(yu0Var);
    }
}
