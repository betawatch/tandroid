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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class p41 extends org.telegram.ui.ActionBar.h3 {
    public final int b;
    public final GradientDrawable c;
    public final o41 d;
    public final d51 e;
    public int f;

    public p41(Context context, org.telegram.ui.ActionBar.p2 p2Var, d51 d51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        o41 o41Var = new o41(this, context);
        this.d = o41Var;
        o41Var.addView(d51Var, k7.c6.c(-1.0f, -1));
        this.containerView = o41Var;
        this.e = d51Var;
        d51Var.setParentFragment(p2Var);
        d51Var.setOnScrollListener(new m41(this));
    }

    public static void m(p41 p41Var) {
        d51 d51Var = p41Var.e;
        if (d51Var.c()) {
            p41Var.f = d51Var.getContentTopOffset();
            p41Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        super.dismiss();
        d51 d51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(d51Var.a);
        notificationCenter.removeObserver(d51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(d51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        d51 d51Var = this.e;
        Objects.requireNonNull(d51Var);
        t6 t6Var = new t6(d51Var, 10);
        s41 s41Var = d51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.m6(s41Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.O5));
        ImageView imageView = s41Var.b;
        int i10 = org.telegram.ui.ActionBar.k6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(s41Var.c, 8, null, null, null, null, i10));
        lg.f fVar = s41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.Mh));
        c51 c51Var = d51Var.s;
        t41 t41Var = d51Var.n;
        c51Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t41Var, t6Var);
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, t41Var);
        uf.m1 m1Var = d51Var.v;
        t41 t41Var2 = d51Var.n;
        m1Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t41Var2, t6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 8, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i11));
        ImageView imageView2 = m1Var.I;
        int i12 = org.telegram.ui.ActionBar.k6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(m1Var.J, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d51Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        FrameLayout frameLayout = d51Var.w;
        int i13 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
