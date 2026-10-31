package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bo0 extends org.telegram.ui.ActionBar.k2 {
    public Bitmap a;
    public BitmapDrawable b;
    public ao0 c;
    public zn0 d;
    public boolean e;
    public boolean f;

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.C(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751699, null));
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 14));
        this.actionBar.p().h(1, R.drawable.ic_ab_done, org.telegram.messenger.cd.L0(2131751355, null), org.telegram.messenger.i0.L(56.0f));
        zn0 zn0Var = new zn0(this, context);
        this.d = zn0Var;
        this.fragmentView = zn0Var;
        zn0Var.G = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        int max;
        if (this.a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !sc.e.x(string)) {
                return false;
            }
            if (org.telegram.messenger.i0.Q1()) {
                max = org.telegram.messenger.i0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.i0.q;
                max = Math.max(point.x, point.y);
            }
            float f7 = max;
            Bitmap K = org.telegram.messenger.hc.K(string, uri, f7, f7, true);
            this.a = K;
            if (K == null) {
                return false;
            }
        }
        this.b = new BitmapDrawable(this.a);
        super.onFragmentCreate();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.a = null;
        }
        this.b = null;
    }
}
