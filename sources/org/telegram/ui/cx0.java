package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cx0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.wk0 a;
    public f2.m0 b;
    public bx0 c;
    public org.telegram.ui.Components.yy d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public final boolean x;
    public final int y;

    public cx0() {
        super(null);
        this.y = 1;
        this.x = true;
    }

    public final void T(Long l10, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)));
        int i9 = this.y;
        H.l(0, LocaleController.getString(R.string.Unblock), new ys0(10, this, l10), i9 == 1);
        H.m(i9 != 1, i9 == 0 ? R.drawable.msg_user_remove : 0, LocaleController.getString(R.string.Remove), true, new ax0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void U() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.w = -1;
        if (!this.x || getMessagesController().totalBlockedCount >= 0) {
            int i9 = this.e;
            int i10 = i9 + 1;
            this.e = i10;
            this.f = i9;
            int i11 = this.y;
            if (i11 == 1) {
                this.e = i9 + 2;
                this.h = i10;
            }
            if (i11 != 1) {
                throw null;
            }
            int size = getMessagesController().blockePeers.size();
            if (size != 0) {
                if (i11 == 1) {
                    int i12 = this.e;
                    this.e = i12 + 1;
                    this.n = i12;
                }
                int i13 = this.e;
                this.r = i13;
                int i14 = i13 + size;
                this.s = i14;
                int i15 = i14 + 1;
                this.e = i15;
                this.v = i14;
                if (i11 != 1) {
                    this.e = i14 + 2;
                    this.w = i15;
                }
            } else {
                this.n = -1;
                this.r = -1;
                this.s = -1;
                this.v = -1;
                this.w = -1;
            }
        }
        bx0 bx0Var = this.c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.y;
        if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.d = yyVar;
        if (i9 == 1) {
            yyVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            yyVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setItemSelectorColorProvider(new zw0(this));
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.wk0 wk0Var2 = this.a;
        f2.m0 m0Var = new f2.m0(1, false);
        this.b = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wk0 wk0Var3 = this.a;
        bx0 bx0Var = new bx0(this, context);
        this.c = bx0Var;
        wk0Var3.setAdapter(bx0Var);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new i(this, 26));
        this.a.setOnItemLongClickListener(new zw0(this));
        if (i9 == 1) {
            this.a.setOnScrollListener(new l3(this, 26));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        U();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        if (i9 != NotificationCenter.updateInterfaces) {
            if (i9 == NotificationCenter.blockedUsersDidLoad) {
                this.d.c();
                U();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0) || (wk0Var = this.a) == null) {
            return;
        }
        int childCount = wk0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.b5) {
                ((org.telegram.ui.Cells.b5) childAt).c(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        bx0 bx0Var = this.c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }
}
