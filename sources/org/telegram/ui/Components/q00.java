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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q00 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(Object obj, int i7) {
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
                int i12 = org.telegram.ui.ActionBar.m6.G8;
                org.telegram.ui.ActionBar.t6.h(i12, u0Var, fragmentContextView.r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.bn;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.p00
                    @Override // org.telegram.messenger.y10
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
                org.telegram.messenger.np.h1().edit().putInt("speedhint", -15).apply();
                break;
            case 1:
                qc0 qc0Var = (qc0) obj;
                qc0Var.r.setText("");
                hi.x7.a(qc0Var.s, true);
                Drawable drawable = qc0Var.a;
                if (drawable instanceof cb0) {
                    ((cb0) drawable).x();
                    break;
                }
                break;
            default:
                final ap0 ap0Var = (ap0) obj;
                oi.w1 w1Var = ap0Var.p1;
                boolean z10 = ap0Var.d2;
                Activity activity = ap0Var.c2;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(ap0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (ap0Var.J1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ap0Var.J0);
                        if (z10) {
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, ap0Var.J0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ko0(ap0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wn0(ap0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, ap0Var.getContext(), ap0Var.J0, true, false);
                        if (z10) {
                            y0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.eh, ap0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, c8.ma.o(-1, 48));
                        y0Var.j(org.telegram.messenger.hd.N0(2131745135, null), 0, null);
                        ap0Var.E2 = true;
                        y0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, ap0Var.getContext(), ap0Var.J0, false, true);
                        if (z10) {
                            y0Var2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.eh, ap0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, c8.ma.o(-1, 48));
                        y0Var2.j(org.telegram.messenger.hd.N0(2131749115, null), 0, null);
                        y0Var2.setChecked(!ap0Var.E2);
                        y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.zn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        ap0Var.E2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        ap0Var.E2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        y0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.zn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        ap0Var.E2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        ap0Var.E2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        ap0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.m6.I5, ap0Var.J0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ap0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new ko0(ap0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new wn0(ap0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, ap0Var.getContext(), ap0Var.J0, true, true);
                    if (z10) {
                        y0Var3.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.eh, ap0Var.J0));
                        y0Var3.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, ap0Var.J0));
                    }
                    y0Var3.j(org.telegram.messenger.hd.N0(2131745387, null), R.drawable.input_notify_off, null);
                    y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, c8.ma.o(-1, 48));
                    y0Var3.setOnClickListener(new vn0(ap0Var, 2));
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, ap0Var.getContext(), ap0Var.J0, true, true);
                    if (z10) {
                        y0Var4.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.eh, ap0Var.J0));
                        y0Var4.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, ap0Var.J0));
                    }
                    y0Var4.j(org.telegram.messenger.hd.N0(2131745405, null), R.drawable.msg_send, null);
                    y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, c8.ma.o(-1, 48));
                    y0Var4.setOnClickListener(new vn0(ap0Var, i14));
                    ap0.X0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.m6.I5, ap0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ma.o(-1, -2));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    ap0Var.F2 = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    ap0Var.F2.setOutsideTouchable(true);
                    ap0Var.F2.setClippingEnabled(true);
                    ap0Var.F2.setInputMethodMode(2);
                    ap0Var.F2.setSoftInputMode(0);
                    ap0Var.F2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.cz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    ap0Var.F2.setFocusable(true);
                    int[] iArr = new int[2];
                    w1Var.getLocationInWindow(iArr);
                    ap0Var.F2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!ap0Var.d || (bnVar = ap0Var.b2) == null || bnVar.m1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : w1Var.getMeasuredHeight() + iArr[1]);
                    ap0Var.F2.b();
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
