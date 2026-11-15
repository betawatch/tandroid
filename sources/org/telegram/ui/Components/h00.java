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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h00 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.an anVar;
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
                int i12 = org.telegram.ui.ActionBar.j6.G8;
                org.telegram.ui.ActionBar.q6.h(i12, v0Var, fragmentContextView.r0);
                org.telegram.ui.ActionBar.v0 v0Var2 = fragmentContextView.J;
                v0Var2.O = fragmentContextView.h instanceof org.telegram.ui.an;
                v0Var2.G.setShader(null);
                v0Var2.h = null;
                Bitmap bitmap = v0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    v0Var2.f = null;
                }
                fragmentContextView.H.I(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
                fragmentContextView.H.W();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.V(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.g00
                    @Override // org.telegram.messenger.z10
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
                org.telegram.messenger.np.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 1:
                fc0 fc0Var = (fc0) obj;
                fc0Var.r.setText("");
                hi.y7.a(fc0Var.s, true);
                Drawable drawable = fc0Var.a;
                if (drawable instanceof ra0) {
                    ((ra0) drawable).x();
                    break;
                }
                break;
            default:
                final po0 po0Var = (po0) obj;
                oi.u1 u1Var = po0Var.p1;
                boolean z10 = po0Var.d2;
                Activity activity = po0Var.c2;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(po0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (po0Var.J1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, po0Var.J0);
                        if (z10) {
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout, po0Var.J0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zn0(po0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ln0(po0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, po0Var.getContext(), po0Var.J0, true, false);
                        if (z10) {
                            z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.eh, po0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ja.o(-1, 48));
                        z0Var.j(org.telegram.messenger.hd.M0(2131745331, null), 0, null);
                        po0Var.E2 = true;
                        z0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(1, po0Var.getContext(), po0Var.J0, false, true);
                        if (z10) {
                            z0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.eh, po0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ja.o(-1, 48));
                        z0Var2.j(org.telegram.messenger.hd.M0(2131749308, null), 0, null);
                        z0Var2.setChecked(!po0Var.E2);
                        z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.on0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        po0Var.E2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        po0Var.E2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        z0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.on0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        po0Var.E2 = true;
                                        z0Var.setChecked(true);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                    default:
                                        po0Var.E2 = false;
                                        z0Var.setChecked(false);
                                        z0Var2.setChecked(!r3.E2);
                                        break;
                                }
                            }
                        });
                        po0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.j6.I5, po0Var.J0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ja.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, po0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Wg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zn0(po0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new ln0(po0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, po0Var.getContext(), po0Var.J0, true, true);
                    if (z10) {
                        z0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.eh, po0Var.J0));
                        z0Var3.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, po0Var.J0));
                    }
                    z0Var3.j(org.telegram.messenger.hd.M0(2131745583, null), R.drawable.input_notify_off, null);
                    z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var3, c8.ja.o(-1, 48));
                    z0Var3.setOnClickListener(new kn0(po0Var, 2));
                    org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, po0Var.getContext(), po0Var.J0, true, true);
                    if (z10) {
                        z0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.eh, po0Var.J0));
                        z0Var4.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.H6, po0Var.J0));
                    }
                    z0Var4.j(org.telegram.messenger.hd.M0(2131745601, null), R.drawable.msg_send, null);
                    z0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var4, c8.ja.o(-1, 48));
                    z0Var4.setOnClickListener(new kn0(po0Var, i14));
                    po0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.j6.I5, po0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ja.o(-1, -2));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    po0Var.F2 = g1Var;
                    g1Var.b = false;
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    po0Var.F2.setOutsideTouchable(true);
                    po0Var.F2.setClippingEnabled(true);
                    po0Var.F2.setInputMethodMode(2);
                    po0Var.F2.setSoftInputMode(0);
                    po0Var.F2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.gz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    po0Var.F2.setFocusable(true);
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    po0Var.F2.showAtLocation(u1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((u1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!po0Var.d || (anVar = po0Var.b2) == null || anVar.m1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : u1Var.getMeasuredHeight() + iArr[1]);
                    po0Var.F2.b();
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
