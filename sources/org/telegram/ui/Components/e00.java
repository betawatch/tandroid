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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.cn cnVar;
        int i7 = this.a;
        Object obj = this.b;
        final int i10 = 0;
        final int i11 = 1;
        switch (i7) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float C = MediaController.B().C(fragmentContextView.W);
                fragmentContextView.I.e(false, C);
                org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.I;
                int i12 = org.telegram.ui.ActionBar.l6.G8;
                org.telegram.ui.ActionBar.s6.h(i12, v0Var, fragmentContextView.q0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.I;
                v0Var2.N = fragmentContextView.h instanceof org.telegram.ui.cn;
                v0Var2.F.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f = null;
                }
                fragmentContextView.G.H(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.d00
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj2) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController B = MediaController.B();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(C, B.C(fragmentContextView2.W), false);
                    }
                });
                org.telegram.messenger.qp.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 1:
                fc0 fc0Var = (fc0) obj;
                fc0Var.r.setText("");
                fi.a8.a(fc0Var.s, true);
                Drawable drawable = fc0Var.a;
                if (drawable instanceof ra0) {
                    ((ra0) drawable).x();
                    break;
                }
                break;
            default:
                final no0 no0Var = (no0) obj;
                li.w1 w1Var = no0Var.l1;
                boolean z9 = no0Var.Z1;
                Activity activity = no0Var.Y1;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(no0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (no0Var.F1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, no0Var.I0);
                        if (z9) {
                            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, no0Var.I0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new xn0(no0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new in0(no0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, no0Var.getContext(), no0Var.I0, true, false);
                        if (z9) {
                            z0Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bh, no0Var.I0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ha.o(-1, 48));
                        z0Var.j(org.telegram.messenger.id.M0(2131745331, null), 0, null);
                        no0Var.A2 = true;
                        z0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, no0Var.getContext(), no0Var.I0, false, true);
                        if (z9) {
                            z0Var2.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bh, no0Var.I0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ha.o(-1, 48));
                        z0Var2.j(org.telegram.messenger.id.M0(2131749308, null), 0, null);
                        z0Var2.setChecked(!no0Var.A2);
                        z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.mn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        no0Var.A2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.A2);
                                        break;
                                    default:
                                        no0Var.A2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.A2);
                                        break;
                                }
                            }
                        });
                        z0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.mn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        no0Var.A2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.A2);
                                        break;
                                    default:
                                        no0Var.A2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.A2);
                                        break;
                                }
                            }
                        });
                        no0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.l6.I5, no0Var.I0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, no0Var.I0);
                    if (z9) {
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new xn0(no0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new in0(no0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, no0Var.getContext(), no0Var.I0, true, true);
                    if (z9) {
                        z0Var3.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bh, no0Var.I0));
                        z0Var3.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.H6, no0Var.I0));
                    }
                    z0Var3.j(org.telegram.messenger.id.M0(2131745583, null), R.drawable.input_notify_off, null);
                    z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ha.o(-1, 48));
                    z0Var3.setOnClickListener(new hn0(no0Var, 2));
                    org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, no0Var.getContext(), no0Var.I0, true, true);
                    if (z9) {
                        z0Var4.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bh, no0Var.I0));
                        z0Var4.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.H6, no0Var.I0));
                    }
                    z0Var4.j(org.telegram.messenger.id.M0(2131745601, null), R.drawable.msg_send, null);
                    z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ha.o(-1, 48));
                    z0Var4.setOnClickListener(new hn0(no0Var, i14));
                    no0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.l6.I5, no0Var.I0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ha.o(-1, -2));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    no0Var.B2 = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    no0Var.B2.setOutsideTouchable(true);
                    no0Var.B2.setClippingEnabled(true);
                    no0Var.B2.setInputMethodMode(2);
                    no0Var.B2.setSoftInputMode(0);
                    no0Var.B2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    no0Var.B2.setFocusable(true);
                    int[] iArr = new int[2];
                    w1Var.getLocationInWindow(iArr);
                    no0Var.B2.showAtLocation(w1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((w1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!no0Var.d || (cnVar = no0Var.X1) == null || cnVar.l1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : w1Var.getMeasuredHeight() + iArr[1]);
                    no0Var.B2.b();
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
