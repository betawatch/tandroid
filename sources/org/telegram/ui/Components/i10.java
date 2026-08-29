package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i10 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                fragmentContextView.D.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.D;
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, fragmentContextView.l0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.D;
                c1Var2.J = fragmentContextView.h instanceof org.telegram.ui.tn;
                c1Var2.B.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f = null;
                }
                fragmentContextView.B.B(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                fragmentContextView.B.N();
                fragmentContextView.q(false);
                fragmentContextView.B.setDimMenu(0.3f);
                fragmentContextView.B.M(fragmentContextView.D, null);
                fragmentContextView.B.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.h10
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.I0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController mediaController = MediaController.getInstance();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.R), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                nd0 nd0Var = (nd0) obj;
                nd0Var.r.setText("");
                nh.l8.a(nd0Var.s, true);
                Drawable drawable = nd0Var.a;
                if (drawable instanceof yb0) {
                    ((yb0) drawable).y();
                }
                return true;
            default:
                return dq0.n((dq0) obj);
        }
    }
}
