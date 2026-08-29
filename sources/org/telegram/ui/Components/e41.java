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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class e41 extends org.telegram.ui.ActionBar.f3 {
    public final int b;
    public final GradientDrawable c;
    public final d41 d;
    public final s41 e;
    public int f;

    public e41(Context context, org.telegram.ui.ActionBar.o2 o2Var, s41 s41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        d41 d41Var = new d41(this, context);
        this.d = d41Var;
        d41Var.addView(s41Var, i7.f6.c(-1.0f, -1));
        this.containerView = d41Var;
        this.e = s41Var;
        s41Var.setParentFragment(o2Var);
        s41Var.setOnScrollListener(new b41(this));
    }

    public static void m(e41 e41Var) {
        s41 s41Var = e41Var.e;
        if (s41Var.c()) {
            e41Var.f = s41Var.getContentTopOffset();
            e41Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        super.dismiss();
        s41 s41Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(s41Var.a);
        notificationCenter.removeObserver(s41Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(s41Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s41 s41Var = this.e;
        Objects.requireNonNull(s41Var);
        x6 x6Var = new x6(s41Var, 10);
        h41 h41Var = s41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.i6(h41Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        ImageView imageView = h41Var.b;
        int i10 = org.telegram.ui.ActionBar.g6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(h41Var.c, 8, null, null, null, null, i10));
        ig.f fVar = h41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fVar, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fVar, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Mh));
        r41 r41Var = s41Var.s;
        i41 i41Var = s41Var.n;
        r41Var.getClass();
        org.telegram.ui.Cells.p3.a(arrayList, i41Var, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var, 0, new Class[]{org.telegram.ui.Cells.n3.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Qh));
        org.telegram.ui.Cells.s3.a(arrayList, i41Var);
        rf.m1 m1Var = s41Var.v;
        i41 i41Var2 = s41Var.n;
        m1Var.getClass();
        org.telegram.ui.Cells.p3.a(arrayList, i41Var2, x6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var2, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var2, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(i41Var2, 8, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, i11));
        ImageView imageView2 = m1Var.H;
        int i12 = org.telegram.ui.ActionBar.g6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(m1Var.I, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(s41Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        FrameLayout frameLayout = s41Var.w;
        int i13 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
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
