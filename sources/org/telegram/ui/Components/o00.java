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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
                int i12 = org.telegram.ui.ActionBar.n6.G8;
                org.telegram.ui.ActionBar.u6.h(i12, v0Var, fragmentContextView.r0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.J;
                v0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                v0Var2.G.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.n00
                    @Override // org.telegram.messenger.x10
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
                pc0 pc0Var = (pc0) obj;
                pc0Var.r.setText("");
                hi.y7.a(pc0Var.s, true);
                Drawable drawable = pc0Var.a;
                if (drawable instanceof bb0) {
                    ((bb0) drawable).x();
                    break;
                }
                break;
            default:
                final yo0 yo0Var = (yo0) obj;
                oi.u1 u1Var = yo0Var.p1;
                boolean z10 = yo0Var.d2;
                Activity activity = yo0Var.c2;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(yo0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (yo0Var.J1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, yo0Var.J0);
                        if (z10) {
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, yo0Var.J0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new io0(yo0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new un0(yo0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, yo0Var.getContext(), yo0Var.J0, true, false);
                        if (z10) {
                            z0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, yo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ma.o(-1, 48));
                        z0Var.j(org.telegram.messenger.gd.M0(2131745136, null), 0, null);
                        yo0Var.E2 = true;
                        z0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, yo0Var.getContext(), yo0Var.J0, false, true);
                        if (z10) {
                            z0Var2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, yo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ma.o(-1, 48));
                        z0Var2.j(org.telegram.messenger.gd.M0(2131749116, null), 0, null);
                        z0Var2.setChecked(!yo0Var.E2);
                        z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.xn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        yo0Var.E2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        yo0Var.E2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        z0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.xn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        yo0Var.E2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        yo0Var.E2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        yo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.n6.I5, yo0Var.J0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, yo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new io0(yo0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new un0(yo0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, yo0Var.getContext(), yo0Var.J0, true, true);
                    if (z10) {
                        z0Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, yo0Var.J0));
                        z0Var3.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, yo0Var.J0));
                    }
                    z0Var3.j(org.telegram.messenger.gd.M0(2131745388, null), R.drawable.input_notify_off, null);
                    z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ma.o(-1, 48));
                    z0Var3.setOnClickListener(new tn0(yo0Var, 2));
                    org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, yo0Var.getContext(), yo0Var.J0, true, true);
                    if (z10) {
                        z0Var4.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.eh, yo0Var.J0));
                        z0Var4.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, yo0Var.J0));
                    }
                    z0Var4.j(org.telegram.messenger.gd.M0(2131745406, null), R.drawable.msg_send, null);
                    z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ma.o(-1, 48));
                    z0Var4.setOnClickListener(new tn0(yo0Var, i14));
                    yo0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.n6.I5, yo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ma.o(-1, -2));
                    org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(linearLayout, -2, -2);
                    yo0Var.F2 = h1Var;
                    h1Var.b = false;
                    h1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    yo0Var.F2.setOutsideTouchable(true);
                    yo0Var.F2.setClippingEnabled(true);
                    yo0Var.F2.setInputMethodMode(2);
                    yo0Var.F2.setSoftInputMode(0);
                    yo0Var.F2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    yo0Var.F2.setFocusable(true);
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    yo0Var.F2.showAtLocation(u1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((u1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!yo0Var.d || (bnVar = yo0Var.b2) == null || bnVar.m1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : u1Var.getMeasuredHeight() + iArr[1]);
                    yo0Var.F2.b();
                    try {
                        u1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
