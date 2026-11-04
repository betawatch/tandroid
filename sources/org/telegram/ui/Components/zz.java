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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.ui.wm wmVar;
        int i3 = this.a;
        Object obj = this.b;
        final int i10 = 0;
        final int i11 = 1;
        switch (i3) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                final float C = MediaController.B().C(fragmentContextView.a0);
                fragmentContextView.J.e(false, C);
                org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
                int i12 = org.telegram.ui.ActionBar.k6.G8;
                org.telegram.ui.ActionBar.r6.i(i12, u0Var, fragmentContextView.r0);
                org.telegram.ui.ActionBar.u0 u0Var2 = fragmentContextView.J;
                u0Var2.O = fragmentContextView.h instanceof org.telegram.ui.wm;
                u0Var2.G.setShader(null);
                u0Var2.h = null;
                Bitmap bitmap = u0Var2.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    u0Var2.f = null;
                }
                fragmentContextView.H.H(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                fragmentContextView.H.V();
                fragmentContextView.q(false);
                fragmentContextView.H.setDimMenu(0.3f);
                fragmentContextView.H.U(fragmentContextView.J, null);
                fragmentContextView.H.setOnMenuDismiss(new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.yz
                    @Override // org.telegram.messenger.u10
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
                org.telegram.messenger.hp.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 1:
                zb0 zb0Var = (zb0) obj;
                zb0Var.r.setText("");
                gi.z7.a(zb0Var.s, true);
                Drawable drawable = zb0Var.a;
                if (drawable instanceof la0) {
                    ((la0) drawable).x();
                    break;
                }
                break;
            default:
                final oo0 oo0Var = (oo0) obj;
                mi.x1 x1Var = oo0Var.m1;
                boolean z10 = oo0Var.a2;
                Activity activity = oo0Var.Z1;
                if (activity != null) {
                    LinearLayout linearLayout = new LinearLayout(oo0Var.getContext());
                    linearLayout.setOrientation(1);
                    int i13 = 2;
                    if (oo0Var.G1 != null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, oo0Var.J0);
                        if (z10) {
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout, oo0Var.J0);
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yn0(oo0Var, 0));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new kn0(oo0Var, i13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
                        final org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, oo0Var.getContext(), oo0Var.J0, true, false);
                        if (z10) {
                            y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bh, oo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var, b8.mf.o(-1, 48));
                        y0Var.j(org.telegram.messenger.bd.M0(2131745341, null), 0, null);
                        oo0Var.B2 = true;
                        y0Var.setChecked(true);
                        final org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(1, oo0Var.getContext(), oo0Var.J0, false, true);
                        if (z10) {
                            y0Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bh, oo0Var.J0));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, b8.mf.o(-1, 48));
                        y0Var2.j(org.telegram.messenger.bd.M0(2131749316, null), 0, null);
                        y0Var2.setChecked(!oo0Var.B2);
                        y0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.nn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        oo0Var.B2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.B2);
                                        break;
                                    default:
                                        oo0Var.B2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.B2);
                                        break;
                                }
                            }
                        });
                        y0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.nn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        oo0Var.B2 = true;
                                        y0Var.setChecked(true);
                                        y0Var2.setChecked(!r3.B2);
                                        break;
                                    default:
                                        oo0Var.B2 = false;
                                        y0Var.setChecked(false);
                                        y0Var2.setChecked(!r3.B2);
                                        break;
                                }
                            }
                        });
                        oo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.k6.I5, oo0Var.J0);
                        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, oo0Var.J0);
                    if (z10) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Tg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new yn0(oo0Var, 1));
                    int i14 = 3;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new kn0(oo0Var, i14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, oo0Var.getContext(), oo0Var.J0, true, true);
                    if (z10) {
                        y0Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bh, oo0Var.J0));
                        y0Var3.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, oo0Var.J0));
                    }
                    y0Var3.j(org.telegram.messenger.bd.M0(2131745593, null), R.drawable.input_notify_off, null);
                    y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var3, b8.mf.o(-1, 48));
                    y0Var3.setOnClickListener(new jn0(oo0Var, 2));
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, oo0Var.getContext(), oo0Var.J0, true, true);
                    if (z10) {
                        y0Var4.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bh, oo0Var.J0));
                        y0Var4.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, oo0Var.J0));
                    }
                    y0Var4.j(org.telegram.messenger.bd.M0(2131745611, null), R.drawable.msg_send, null);
                    y0Var4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var4, b8.mf.o(-1, 48));
                    y0Var4.setOnClickListener(new jn0(oo0Var, i14));
                    oo0.W0(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.k6.I5, oo0Var.J0);
                    linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, b8.mf.o(-1, -2));
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(linearLayout, -2, -2);
                    oo0Var.C2 = f1Var;
                    f1Var.b = false;
                    f1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                    oo0Var.C2.setOutsideTouchable(true);
                    oo0Var.C2.setClippingEnabled(true);
                    oo0Var.C2.setInputMethodMode(2);
                    oo0Var.C2.setSoftInputMode(0);
                    oo0Var.C2.getContentView().setFocusableInTouchMode(true);
                    int i15 = org.telegram.messenger.az.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("scheduledOrNoSoundHintShows", 3);
                    edit.apply();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    oo0Var.C2.setFocusable(true);
                    int[] iArr = new int[2];
                    x1Var.getLocationInWindow(iArr);
                    oo0Var.C2.showAtLocation(x1Var, 51, org.telegram.messenger.g0.L(8.0f) + ((x1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!oo0Var.d || (wmVar = oo0Var.Y1) == null || wmVar.m1.getMeasuredHeight() <= org.telegram.messenger.g0.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f) : x1Var.getMeasuredHeight() + iArr[1]);
                    oo0Var.C2.b();
                    try {
                        x1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
