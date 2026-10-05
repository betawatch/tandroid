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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class p51 extends org.telegram.ui.ActionBar.f3 {
    public final int b;
    public final GradientDrawable c;
    public final o51 d;
    public final d61 e;
    public int f;

    public p51(Context context, org.telegram.ui.ActionBar.n2 n2Var, d61 d61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        o51 o51Var = new o51(this, context);
        this.d = o51Var;
        o51Var.addView(d61Var, w7.z5.c(-1.0f, -1));
        this.containerView = o51Var;
        this.e = d61Var;
        d61Var.setParentFragment(n2Var);
        d61Var.setOnScrollListener(new m51(this));
    }

    public static void m(p51 p51Var) {
        d61 d61Var = p51Var.e;
        if (d61Var.c()) {
            p51Var.f = d61Var.getContentTopOffset();
            p51Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        super.dismiss();
        d61 d61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(d61Var.a);
        notificationCenter.removeObserver(d61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(d61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        d61 d61Var = this.e;
        Objects.requireNonNull(d61Var);
        y6 y6Var = new y6(d61Var, 10);
        s51 s51Var = d61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.O5));
        ImageView imageView = s51Var.b;
        int i10 = org.telegram.ui.ActionBar.i6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(s51Var.c, 8, null, null, null, null, i10));
        ci.h2 h2Var = s51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.i6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Mh));
        c61 c61Var = d61Var.s;
        t51 t51Var = d61Var.n;
        c61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, t51Var, y6Var);
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, t51Var);
        gg.g2 g2Var = d61Var.v;
        g2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, t51Var, y6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(t51Var, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.i6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(d61Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        FrameLayout frameLayout = d61Var.w;
        int i13 = org.telegram.ui.ActionBar.i6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
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
