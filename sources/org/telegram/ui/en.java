package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class en extends FrameLayout {
    public final dn a;
    public final org.telegram.ui.ActionBar.r4 b;
    public View c;
    public int d;
    public boolean e;

    public en(Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = r4Var;
        dn dnVar = new dn(this, bundle);
        this.a = dnVar;
        dnVar.kb = true;
    }

    public void a() {
        int i7;
        dn dnVar = this.a;
        if (dnVar.onFragmentCreate()) {
            this.c = dnVar.fragmentView;
            dnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = dnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    dnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            cj cjVar = dnVar.z0;
            if (cjVar != null && (i7 = this.d) != 0) {
                cjVar.setPadding(0, i7, 0, 0);
            }
            dnVar.Ra();
            addView(this.c, c8.ha.c(-1.0f, -1));
            if (this.e) {
                dnVar.onResume();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i7) {
        this.d = i7;
    }

    public void b(boolean z9) {
    }
}
