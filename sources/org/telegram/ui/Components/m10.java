package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m10 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m10(Object obj, int i10) {
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
                float[] fArr = FragmentContextView.O0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, fragmentContextView.p0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.H;
                c1Var2.N = fragmentContextView.h instanceof org.telegram.ui.bo;
                c1Var2.F.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                fragmentContextView.F.N();
                fragmentContextView.r(false);
                fragmentContextView.F.setDimMenu(0.3f);
                fragmentContextView.F.M(fragmentContextView.H, null);
                fragmentContextView.F.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.l10
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.O0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController mediaController = MediaController.getInstance();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.V), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                sd0 sd0Var = (sd0) obj;
                sd0Var.r.setText("");
                ci.m9.a(sd0Var.s, true);
                Drawable drawable = sd0Var.a;
                if (drawable instanceof cc0) {
                    ((cc0) drawable).y();
                }
                return true;
            default:
                return iq0.n((iq0) obj);
        }
    }
}
