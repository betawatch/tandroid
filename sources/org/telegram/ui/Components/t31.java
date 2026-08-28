package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class t31 extends org.telegram.ui.ActionBar.f3 {
    public final int b;
    public final GradientDrawable c;
    public final s31 d;
    public final h41 e;
    public int f;

    public t31(Context context, org.telegram.ui.ActionBar.o2 o2Var, h41 h41Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true, false);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        s31 s31Var = new s31(this, context);
        this.d = s31Var;
        s31Var.addView(h41Var, g7.e6.c(-1.0f, -1));
        this.containerView = s31Var;
        this.e = h41Var;
        h41Var.setParentFragment(o2Var);
        h41Var.setOnScrollListener(new q31(this));
    }

    public static void m(t31 t31Var) {
        h41 h41Var = t31Var.e;
        if (h41Var.c()) {
            t31Var.f = h41Var.getContentTopOffset();
            t31Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        super.dismiss();
        h41 h41Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(h41Var.a);
        notificationCenter.removeObserver(h41Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(h41Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h41 h41Var = this.e;
        Objects.requireNonNull(h41Var);
        s6 s6Var = new s6(h41Var, 10);
        w31 w31Var = h41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w31Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.O5));
        ImageView imageView = w31Var.b;
        int i9 = org.telegram.ui.ActionBar.f6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w31Var.c, 8, null, null, null, null, i9));
        fg.g gVar = w31Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.Mh));
        g41 g41Var = h41Var.s;
        x31 x31Var = h41Var.n;
        g41Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, x31Var, s6Var);
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, x31Var);
        of.y1 y1Var = h41Var.v;
        x31 x31Var2 = h41Var.n;
        y1Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, x31Var2, s6Var);
        int i10 = org.telegram.ui.ActionBar.f6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"urlTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(x31Var2, 8, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, i10));
        ImageView imageView2 = y1Var.H;
        int i11 = org.telegram.ui.ActionBar.f6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView2, 8, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(y1Var.I, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(h41Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.V5));
        FrameLayout frameLayout = h41Var.w;
        int i12 = org.telegram.ui.ActionBar.f6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayout, 1, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
