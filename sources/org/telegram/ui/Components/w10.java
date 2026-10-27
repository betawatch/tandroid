package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w10 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w10(Object obj, int i10) {
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
                float[] fArr = FragmentContextView.W0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.y6.G8;
                org.telegram.ui.ActionBar.f7.i(i11, c1Var, fragmentContextView.q0);
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.I;
                c1Var2.N = fragmentContextView.h instanceof org.telegram.ui.wn;
                c1Var2.F.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f = null;
                }
                fragmentContextView.G.H(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.v10
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController mediaController = MediaController.getInstance();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.W), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                me0 me0Var = (me0) obj;
                me0Var.r.setText("");
                fi.t8.a(me0Var.s, true);
                Drawable drawable = me0Var.a;
                if (drawable instanceof vc0) {
                    ((vc0) drawable).x();
                }
                return true;
            default:
                return nr0.q((nr0) obj);
        }
    }
}
