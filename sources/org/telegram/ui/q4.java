package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q4 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.mm0 a;
    public p4 b;

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        p4 p4Var = new p4(context);
        this.b = p4Var;
        mm0Var2.setAdapter(p4Var);
        this.a.setOnItemClickListener(new h(this, 2));
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
