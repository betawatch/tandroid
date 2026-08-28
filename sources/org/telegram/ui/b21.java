package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b21 extends org.telegram.ui.ActionBar.o2 {
    public a21 a;
    public org.telegram.ui.Components.wk0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public org.telegram.ui.Cells.k3[] n;

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 19));
        this.a = new a21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.m0(1, false));
        frameLayout2.addView(this.b, g7.e6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.actionBar.setAdaptiveBackground(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.k3.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.c = 1;
        this.d = 2;
        this.e = 3;
        this.h = 5;
        this.f = 4;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i9 = 0;
        SharedPreferences.Editor edit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            org.telegram.ui.Cells.k3[] k3VarArr = this.n;
            if (i9 >= k3VarArr.length) {
                edit.commit();
                return;
            }
            org.telegram.ui.Cells.k3 k3Var = k3VarArr[i9];
            if (k3Var != null) {
                String obj = k3Var.getTextView().getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    edit.remove("quick_reply_msg" + (i9 + 1));
                } else {
                    edit.putString("quick_reply_msg" + (i9 + 1), obj);
                }
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        a21 a21Var = this.a;
        if (a21Var != null) {
            a21Var.l();
        }
    }
}
