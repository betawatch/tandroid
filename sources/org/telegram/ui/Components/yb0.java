package org.telegram.ui.Components;

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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yb0 extends Dialog implements org.telegram.ui.ActionBar.p4 {
    public final ActionBarLayout a;
    public final FrameLayout b;
    public final pc0 c;

    public yb0(Context context) {
        super(context, R.style.TransparentDialog);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        org.telegram.ui.ActionBar.q4 q4Var = new org.telegram.ui.ActionBar.q4(new bi.y8(this, 9));
        q4Var.c = true;
        actionBarLayout.U(q4Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new h70(this, 3));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            h6.m.i(actionBarLayout.getView());
        }
        pc0 pc0Var = new pc0(context);
        this.c = pc0Var;
        frameLayout.addView(pc0Var, c8.ma.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.h2 h2Var) {
        return true;
    }

    public final void d(org.telegram.ui.ActionBar.h2 h2Var) {
        this.a.T(h2Var, (!org.telegram.messenger.g0.Q1() || org.telegram.messenger.g0.E || org.telegram.messenger.g0.P1()) ? false : true);
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final void f(int[] iArr) {
        if (!org.telegram.messenger.g0.Q1() || org.telegram.messenger.g0.E || org.telegram.messenger.g0.P1()) {
            return;
        }
        iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(530.0f), View.MeasureSpec.getSize(iArr[0])), TLObject.FLAG_30);
        iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(528.0f), View.MeasureSpec.getSize(iArr[1])), TLObject.FLAG_30);
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.q4 q4Var) {
        org.telegram.ui.ActionBar.h2 h2Var = q4Var.a;
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
            actionBarLayout.I();
            if (actionBarLayout.getFragmentStack().size() <= 1) {
                dismiss();
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
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
        if (i7 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        FrameLayout frameLayout = this.b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.y2(2));
        if (i7 >= 26) {
            org.telegram.messenger.g0.m3(this, i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, true)) >= 0.9d);
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

    @Override // org.telegram.ui.ActionBar.p4
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.ActionBar.p4
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
