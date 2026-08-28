package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements org.telegram.ui.Components.nk0, kc0 {
    public final /* synthetic */ r60 a;

    public /* synthetic */ m60(r60 r60Var) {
        this.a = r60Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        r60 r60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(r60Var)) {
                return;
            }
            pc0 pc0Var = new pc0(4);
            pc0Var.a0 = 0L;
            pc0Var.B0 = new m60(r60Var);
            r60Var.presentFragment(pc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.p8) || r60Var.L == 5) {
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = r60Var.w;
        if (o1Var == null || !o1Var.isShowing()) {
            org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(r60Var.getParentActivity(), null, new g(r60Var, 22), true, 1, null);
            h8Var.b(r60Var.S);
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(h8Var.a, -2, -2);
            r60Var.w = o1Var2;
            o1Var2.e = true;
            o1Var2.c = 220;
            o1Var2.setOutsideTouchable(true);
            r60Var.w.setClippingEnabled(true);
            r60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            r60Var.w.setFocusable(true);
            h8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            r60Var.w.setInputMethodMode(2);
            r60Var.w.getContentView().setFocusableInTouchMode(true);
            r60Var.w.showAtLocation(r60Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            r60Var.w.b();
        }
    }

    @Override // org.telegram.ui.kc0
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        r60 r60Var = this.a;
        Location location = r60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        r60Var.P = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
