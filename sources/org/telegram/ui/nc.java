package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nc extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final va1 b;
    public final f2.m0 c;
    public final int d;
    public int e;

    public nc(int i9, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.d = i9;
        this.a = b6Var;
        va1 va1Var = new va1(activity, 3, b6Var);
        this.b = va1Var;
        va1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        va1Var.setClipToPadding(false);
        va1Var.setAdapter(new lc(this, activity, b6Var, i9));
        f2.m0 m0Var = new f2.m0();
        this.c = m0Var;
        m0Var.j1(0);
        va1Var.setLayoutManager(m0Var);
        addView(va1Var, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i10 = 0;
        if (peerColors != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= peerColors.colors.size()) {
                    break;
                }
                if (peerColors.colors.get(i11).id == i9) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 != this.e) {
            this.e = i10;
            if (!z10) {
                this.c.h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new kc(0, this, z10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
