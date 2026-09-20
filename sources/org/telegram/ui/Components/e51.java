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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class e51 extends org.telegram.ui.ActionBar.f3 {
    public final int b;
    public final GradientDrawable c;
    public final d51 d;
    public final s51 e;
    public int f;

    public e51(Context context, org.telegram.ui.ActionBar.n2 n2Var, s51 s51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        d51 d51Var = new d51(this, context);
        this.d = d51Var;
        d51Var.addView(s51Var, w7.y5.c(-1.0f, -1));
        this.containerView = d51Var;
        this.e = s51Var;
        s51Var.setParentFragment(n2Var);
        s51Var.setOnScrollListener(new b51(this));
    }

    public static void m(e51 e51Var) {
        s51 s51Var = e51Var.e;
        if (s51Var.c()) {
            e51Var.f = s51Var.getContentTopOffset();
            e51Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        super.dismiss();
        s51 s51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(s51Var.a);
        notificationCenter.removeObserver(s51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(s51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s51 s51Var = this.e;
        Objects.requireNonNull(s51Var);
        x6 x6Var = new x6(s51Var, 10);
        h51 h51Var = s51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        ImageView imageView = h51Var.b;
        int i10 = org.telegram.ui.ActionBar.j6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var.c, 8, null, null, null, null, i10));
        ci.h2 h2Var = h51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Mh));
        r51 r51Var = s51Var.s;
        i51 i51Var = s51Var.n;
        r51Var.getClass();
        org.telegram.ui.Cells.t3.a(arrayList, i51Var, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var, 0, new Class[]{org.telegram.ui.Cells.r3.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Qh));
        org.telegram.ui.Cells.w3.a(arrayList, i51Var);
        gg.g2 g2Var = s51Var.v;
        i51 i51Var2 = s51Var.n;
        g2Var.getClass();
        org.telegram.ui.Cells.t3.a(arrayList, i51Var2, x6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(i51Var2, 8, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.j6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(s51Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        FrameLayout frameLayout = s51Var.w;
        int i13 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
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
