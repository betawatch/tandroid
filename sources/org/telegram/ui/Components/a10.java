package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a10 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a10(Object obj, int i10) {
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
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.D;
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, fragmentContextView.l0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.D;
                b1Var2.J = fragmentContextView.h instanceof org.telegram.ui.rn;
                b1Var2.B.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f = null;
                }
                fragmentContextView.B.B(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                fragmentContextView.B.N();
                fragmentContextView.q(false);
                fragmentContextView.B.setDimMenu(0.3f);
                fragmentContextView.B.M(fragmentContextView.D, null);
                fragmentContextView.B.setOnMenuDismiss(new Utilities.Callback() { // from class: org.telegram.ui.Components.z00
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
                dd0 dd0Var = (dd0) obj;
                dd0Var.r.setText("");
                lh.w8.a(dd0Var.s, true);
                Drawable drawable = dd0Var.a;
                if (drawable instanceof nb0) {
                    ((nb0) drawable).y();
                }
                return true;
            default:
                return sp0.n((sp0) obj);
        }
    }
}
