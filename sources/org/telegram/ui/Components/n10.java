package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n10(Object obj, int i10) {
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
                float[] fArr = FragmentContextView.J0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.S);
                fragmentContextView.E.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, fragmentContextView.m0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.E;
                c1Var2.K = fragmentContextView.h instanceof org.telegram.ui.xn;
                c1Var2.C.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f = null;
                }
                fragmentContextView.C.B(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                fragmentContextView.C.N();
                fragmentContextView.q(false);
                fragmentContextView.C.setDimMenu(0.3f);
                fragmentContextView.C.M(fragmentContextView.E, null);
                fragmentContextView.C.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.m10
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.J0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController mediaController = MediaController.getInstance();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.S), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                xd0 xd0Var = (xd0) obj;
                xd0Var.r.setText("");
                td0.a(xd0Var.s, true);
                Drawable drawable = xd0Var.a;
                if (drawable instanceof fc0) {
                    ((fc0) drawable).y();
                }
                return true;
            default:
                return lq0.n((lq0) obj);
        }
    }
}
