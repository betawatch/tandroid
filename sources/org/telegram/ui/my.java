package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class my extends org.telegram.ui.ActionBar.o2 {
    public jy a;
    public org.telegram.ui.Components.wk0 b;
    public f2.h0 c;
    public ImageView d;
    public final ArrayList e;
    public ly f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public final int w;
    public final int x;
    public b1 y;

    public my(int i9, int i10) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.w = i9;
        this.x = i10;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i10, i9, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        Y();
    }

    public static /* synthetic */ void T(my myVar, Context context, int i9) {
        ArrayList arrayList = myVar.e;
        if (i9 == myVar.h) {
            org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(context, myVar.currentAccount, null, 0L, myVar, null);
            k60Var.X(new wt(myVar, 5));
            k60Var.Y(arrayList);
            myVar.showDialog(k60Var);
        }
    }

    public final void X() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ri(this, 26), 1000L);
    }

    public final void Y() {
        this.v = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i9 = this.v;
            this.n = i9;
            int size = arrayList.size() + i9;
            this.v = size;
            this.r = size;
        }
        int i10 = this.v;
        this.v = i10 + 1;
        this.s = i10;
        jy jyVar = this.a;
        if (jyVar != null) {
            jyVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.w == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new gy(this));
        this.a = new jy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.setLayoutManager(new f2.m0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((f2.n) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        f2.h0 h0Var = new f2.h0(new ky(this));
        this.c = h0Var;
        h0Var.d(this.b);
        this.b.setOnItemClickListener(new bg.b1(18, this, context));
        this.b.setOnItemLongClickListener(new iy(this));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.y != null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        X();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        dy.i4(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }
}
