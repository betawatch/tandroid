package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o00 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.bn bnVar;
        int i7 = this.a;
        Object obj = this.b;
        final int i10 = 0;
        final int i11 = 1;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
                int i12 = org.telegram.ui.ActionBar.n6.G8;
                org.telegram.ui.ActionBar.u6.h(i12, u0Var, fragmentContextView.r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.n00
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.X0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController B = MediaController.B();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(C, B.C(fragmentContextView2.a0), false);
                    }
                });
                org.telegram.messenger.mp.h1().edit().putInt("speedhint", -15).apply();
                break;
            case 1:
                oc0 oc0Var = (oc0) obj;
                oc0Var.r.setText("");
                hi.s8.a(oc0Var.s, true);
                Drawable drawable = oc0Var.a;
                if (drawable instanceof za0) {
                    ((za0) drawable).x();
                    break;
                }
                break;
            default:
                final zo0 zo0Var = (zo0) obj;
                oi.w1 w1Var = zo0Var.p1;
                boolean z10 = zo0Var.d2;
                Activity activity = zo0Var.c2;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(zo0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (zo0Var.J1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zo0Var.J0);
                        if (z10) {
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, zo0Var.J0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new jo0(zo0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vn0(zo0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, zo0Var.getContext(), zo0Var.J0, true, false);
                        if (z10) {
                            y0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, zo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.na.o(-1, 48));
                        y0Var.j(org.telegram.messenger.gd.N0(2131745135, null), 0, null);
                        zo0Var.E2 = true;
                        y0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, zo0Var.getContext(), zo0Var.J0, false, true);
                        if (z10) {
                            y0Var2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, zo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.na.o(-1, 48));
                        y0Var2.j(org.telegram.messenger.gd.N0(2131749115, null), 0, null);
                        y0Var2.setChecked(!zo0Var.E2);
                        y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        zo0Var.E2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        zo0Var.E2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        y0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        zo0Var.E2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        zo0Var.E2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        zo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.n6.I5, zo0Var.J0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new jo0(zo0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new vn0(zo0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, zo0Var.getContext(), zo0Var.J0, true, true);
                    if (z10) {
                        y0Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, zo0Var.J0));
                        y0Var3.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, zo0Var.J0));
                    }
                    y0Var3.j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                    y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, c8.na.o(-1, 48));
                    y0Var3.setOnClickListener(new un0(zo0Var, 2));
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, zo0Var.getContext(), zo0Var.J0, true, true);
                    if (z10) {
                        y0Var4.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, zo0Var.J0));
                        y0Var4.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, zo0Var.J0));
                    }
                    y0Var4.j(org.telegram.messenger.gd.N0(2131745405, null), R.drawable.msg_send, null);
                    y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, c8.na.o(-1, 48));
                    y0Var4.setOnClickListener(new un0(zo0Var, i14));
                    zo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.n6.I5, zo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.na.o(-1, -2));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    zo0Var.F2 = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    zo0Var.F2.setOutsideTouchable(true);
                    zo0Var.F2.setClippingEnabled(true);
                    zo0Var.F2.setInputMethodMode(2);
                    zo0Var.F2.setSoftInputMode(0);
                    zo0Var.F2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    zo0Var.F2.setFocusable(true);
                    int[] iArr = new int[2];
                    w1Var.getLocationInWindow(iArr);
                    zo0Var.F2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!zo0Var.d || (bnVar = zo0Var.b2) == null || bnVar.m1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : w1Var.getMeasuredHeight() + iArr[1]);
                    zo0Var.F2.b();
                    try {
                        w1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
