// default package

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ht7 extends Dialog implements pk5 {
    public final ActionBarLayout a;
    public final FrameLayout b;
    public final by7 c;

    public ht7(Context context) {
        super(context, R.style.TransparentDialog);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        qk5 qk5Var = new qk5(new qv0(this, (byte) 7));
        qk5Var.c = true;
        actionBarLayout.R(qk5Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (gm.O1() && !gm.E && !gm.N1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new m67(this, (byte) 3));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            wm9.c(actionBarLayout.getView());
        }
        by7 by7Var = new by7(context);
        this.c = by7Var;
        frameLayout.addView(by7Var, qoe.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(d dVar) {
        this.a.T(dVar, (!gm.O1() || gm.E || gm.N1()) ? false : true);
    }

    @Override // pk5
    public final void e(int[] iArr) {
        if (!gm.O1() || gm.E || gm.N1()) {
            return;
        }
        iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(530.0f), View.MeasureSpec.getSize(iArr[0])), TLObject.FLAG_30);
        iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(528.0f), View.MeasureSpec.getSize(iArr[1])), TLObject.FLAG_30);
    }

    @Override // pk5
    public final boolean h(d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override // pk5
    public final boolean j() {
        return false;
    }

    @Override // pk5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    @Override // pk5
    public final boolean l(ActionBarLayout actionBarLayout, qk5 qk5Var) {
        d dVar = qk5Var.a;
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.c.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            ActionBarLayout actionBarLayout = this.a;
            actionBarLayout.G();
            if (actionBarLayout.getFragmentStack().size() <= 1) {
                dismiss();
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        FrameLayout frameLayout = this.b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new wt((byte) 2));
        if (i >= 26) {
            gm.i3(this, on2.h(cmb.w0(null, cmb.c6, true)) >= 0.9d);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.c);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.c);
        }
    }

    @Override // pk5
    public final void a(float f) {
    }

    @Override // pk5
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}
