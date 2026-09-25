package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                float[] fArr = FragmentContextView.O0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, fragmentContextView.p0));
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.H;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.wn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                fragmentContextView.F.N();
                fragmentContextView.r(false);
                fragmentContextView.F.setDimMenu(0.3f);
                fragmentContextView.F.M(fragmentContextView.H, null);
                fragmentContextView.F.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.m10
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
                ce0 ce0Var = (ce0) obj;
                ce0Var.r.setText("");
                ci.j9.a(ce0Var.s, true);
                Drawable drawable = ce0Var.a;
                if (drawable instanceof mc0) {
                    ((mc0) drawable).y();
                }
                return true;
            default:
                return uq0.n((uq0) obj);
        }
    }
}
