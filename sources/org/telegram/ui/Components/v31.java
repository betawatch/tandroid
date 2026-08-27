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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class v31 extends org.telegram.ui.ActionBar.e3 {
    public final int b;
    public final GradientDrawable c;
    public final u31 d;
    public final j41 e;
    public int f;

    public v31(Context context, org.telegram.ui.ActionBar.n2 n2Var, j41 j41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        this.b = AndroidUtilities.dp(12.0f);
        this.c = new GradientDrawable();
        u31 u31Var = new u31(this, context);
        this.d = u31Var;
        u31Var.addView(j41Var, h7.z5.c(-1.0f, -1));
        this.containerView = u31Var;
        this.e = j41Var;
        j41Var.setParentFragment(n2Var);
        j41Var.setOnScrollListener(new s31(this));
    }

    public static void m(v31 v31Var) {
        j41 j41Var = v31Var.e;
        if (j41Var.c()) {
            v31Var.f = j41Var.getContentTopOffset();
            v31Var.containerView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        super.dismiss();
        j41 j41Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(j41Var.a);
        notificationCenter.removeObserver(j41Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(j41Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j41 j41Var = this.e;
        Objects.requireNonNull(j41Var);
        s6 s6Var = new s6(j41Var, 10);
        y31 y31Var = j41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y31Var.a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        ImageView imageView = y31Var.b;
        int i10 = org.telegram.ui.ActionBar.g6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(y31Var.c, 8, null, null, null, null, i10));
        gg.g gVar = y31Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Mh));
        i41 i41Var = j41Var.s;
        z31 z31Var = j41Var.n;
        i41Var.getClass();
        org.telegram.ui.Cells.p3.a(arrayList, z31Var, s6Var);
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var, 4, new Class[]{org.telegram.ui.Cells.n3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var, 0, new Class[]{org.telegram.ui.Cells.n3.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Qh));
        org.telegram.ui.Cells.s3.a(arrayList, z31Var);
        pf.l1 l1Var = j41Var.v;
        z31 z31Var2 = j41Var.n;
        l1Var.getClass();
        org.telegram.ui.Cells.p3.a(arrayList, z31Var2, s6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var2, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var2, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z31Var2, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, i11));
        ImageView imageView2 = l1Var.H;
        int i12 = org.telegram.ui.ActionBar.g6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(l1Var.I, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(j41Var.f, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        FrameLayout frameLayout = j41Var.w;
        int i13 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
