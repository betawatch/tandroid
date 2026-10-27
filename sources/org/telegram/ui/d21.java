package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.ActionBar.r2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] a;
    public a21 b;
    public z11 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.f7[] e;
    public org.telegram.ui.Cells.i9[] f;
    public org.telegram.ui.Cells.ga h;
    public org.telegram.ui.Cells.ga n;
    public org.telegram.ui.ActionBar.u5 r;
    public org.telegram.ui.Cells.o6[] s;
    public int v;
    public ti.a w;
    public String x;
    public float y;

    public d21() {
        super(null);
        this.e = new org.telegram.ui.Cells.f7[3];
        this.f = new org.telegram.ui.Cells.i9[2];
        this.s = new org.telegram.ui.Cells.o6[3];
        this.y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new v11(this);
        this.J = new SharedConfig.ProxyInfo(ti.a.i);
        this.I = true;
    }

    public final void V(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ti.j.j(editTextBoldCursor.getText().toString())) || ti.j.d(this.a[4].getText().toString()) == null);
        if (this.F != z11) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.setDuration(200L);
                this.G.addUpdateListener(new x11(this, 0));
            }
            if (z10) {
                float[] fArr = this.E;
                fArr[0] = this.y;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.G.start();
            } else {
                this.y = z11 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.f7.V(this.h.getTextView(), z11 ? org.telegram.ui.ActionBar.y6.q6 : org.telegram.ui.ActionBar.y6.z6, null);
            }
            this.h.setEnabled(z11);
            this.r.a(z11, z10);
            this.F = z11;
        }
    }

    public final void W(int i10, boolean z10, org.telegram.ui.Components.h2 h2Var) {
        org.telegram.ui.Cells.o6[] o6VarArr = this.s;
        org.telegram.ui.Cells.i9[] i9VarArr = this.f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.c);
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.ds.f).setDuration(250L);
                if (h2Var != null) {
                    duration.addListener((Transition.TransitionListener) new c21(h2Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.v;
            if (i11 == 1) {
                i9VarArr[0].setVisibility(0);
                i9VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                i9VarArr[0].setVisibility(8);
                i9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.i9 i9Var = i9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                i9Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                i9VarArr[0].setVisibility(8);
                i9VarArr[1].setVisibility(0);
                i9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.v != 3 ? 0 : 8);
            o6VarArr[0].a(this.v == 1, z10);
            o6VarArr[1].a(this.v == 2, z10);
            o6VarArr[2].a(this.v == 3, z10);
            V(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        String str;
        org.telegram.ui.Cells.f7[] f7VarArr = this.e;
        ClipData primaryClip = this.H.getPrimaryClip();
        ti.a aVar = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.x)) {
                this.w = null;
                this.x = str;
                if (str != null) {
                    try {
                        aVar = ti.a.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (aVar != null && aVar.f()) {
                        this.w = aVar;
                    }
                }
                if (this.w != null) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        f7VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    f7VarArr[2].setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.equals(str, this.x)) {
        }
    }

    public final void Y() {
        int x02;
        try {
            int i10 = 0;
            if (this.b != null && (x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s8, false)) != this.M) {
                this.M = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(this.b, x02);
            }
            if (this.a == null) {
                return;
            }
            org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.H6);
            org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.G6);
            org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i10 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.y6.H6, null);
                    org.telegram.ui.ActionBar.f7.w(this.a[i10], org.telegram.ui.ActionBar.y6.G6, null);
                    org.telegram.ui.ActionBar.f7.A(this.a[i10], org.telegram.ui.ActionBar.y6.L6, null);
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.Cells.i9[] i9VarArr = this.f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.f7[] f7VarArr = this.e;
        org.telegram.ui.Cells.o6[] o6VarArr = this.s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y11(this));
        this.r = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new z11(context);
        a21 a21Var = new a21(context, this.c, this.resourceProvider, true);
        this.b = a21Var;
        a21Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s8, false));
        int i10 = -1;
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.w11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i11) {
                    case 0:
                        this.b.W(ti.a.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        d21 d21Var = this.b;
                        ti.a aVar = d21Var.w;
                        if (aVar != null) {
                            int i12 = aVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    d21Var.W(i12, true, new org.telegram.ui.Components.h2(d21Var, i12, 28));
                                    break;
                                } else {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = d21Var.w.b;
                                        } else if (i13 == 1) {
                                            int i14 = d21Var.w.c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = d21Var.w.d;
                                        } else if (i13 == 3) {
                                            str = d21Var.w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = d21Var.w.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            d21Var.a[i13].setText((CharSequence) null);
                                        } else {
                                            try {
                                                d21Var.a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.a[i13].setText(str);
                                            }
                                        }
                                    }
                                    i13++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i12 = 0;
        while (i12 < 3) {
            int e = ti.a.e(i12);
            org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, null);
            o6VarArr[i12] = o6Var;
            org.telegram.ui.ActionBar.f7.R(o6Var, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6), null);
            o6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                o6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), e == this.v, true);
            } else if (i12 == 1) {
                o6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), e == this.v, true);
            } else {
                o6VarArr[i12].c(LocaleController.getString(R.string.UseProxyWeb), e == this.v, false);
            }
            this.c.addView(o6VarArr[i12], org.telegram.ui.Components.kb1.r(-1, 50));
            o6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i10 = -1;
        }
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        f7VarArr[0] = f7Var;
        this.c.addView(f7Var, org.telegram.ui.Components.kb1.r(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, org.telegram.ui.Components.kb1.r(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, org.telegram.ui.Components.kb1.r(-1, 64));
            this.a[i13] = new EditTextBoldCursor(context);
            this.a[i13].setTag(Integer.valueOf(i13));
            this.a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.B(this.a[i13], org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i13];
            int i15 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i15, null);
            this.a[i13].setBackground(null);
            org.telegram.ui.ActionBar.f7.w(this.a[i13], i15, null);
            this.a[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i13].setCursorWidth(1.5f);
            this.a[i13].setSingleLine(true);
            this.a[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.f7.A(this.a[i13], org.telegram.ui.ActionBar.y6.L6, null);
            this.a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.f7.G(this.a[i13], org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, null);
            if (i13 == 0) {
                this.a[i13].setInputType(524305);
                this.a[i13].addTextChangedListener(new b21(this, 0));
            } else if (i13 == 1) {
                this.a[i13].setInputType(2);
                this.a[i13].addTextChangedListener(new b21(this, 1));
            } else if (i13 == 3) {
                this.a[i13].setInputType(129);
                this.a[i13].setTypeface(Typeface.DEFAULT);
                this.a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.a[i13].addTextChangedListener(new b21(this, 2));
            }
            this.a[i13].setImeOptions(268435461);
            if (i13 == 0) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.a[i13].setText(proxyInfo.settings.b);
            } else if (i13 == 1) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.a[i13].setText(Integer.toString(proxyInfo.settings.c));
            } else if (i13 == 2) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.a[i13].setText(proxyInfo.settings.d);
            } else if (i13 == 3) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.a[i13].setText(proxyInfo.settings.e);
            } else if (i13 == 4) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.a[i13].setText(proxyInfo.settings.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i13].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i13], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 17.0f, i13 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i13].setOnEditorActionListener(new la(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            i9VarArr[i16] = i9Var;
            if (i16 == 0) {
                i9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                i9Var.setText(sb2.toString());
                i9VarArr[i16].setVisibility(8);
            }
            this.c.addView(i9VarArr[i16], org.telegram.ui.Components.kb1.r(-1, -2));
        }
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(this.fragmentView.getContext());
        this.n = gaVar;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        int i17 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
        int i18 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
        gaVar.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        TextView textView = this.n.getTextView();
        int i19 = org.telegram.ui.ActionBar.y6.q6;
        org.telegram.ui.ActionBar.f7.V(textView, i19, null);
        final int i20 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i20) {
                    case 0:
                        this.b.W(ti.a.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        d21 d21Var = this.b;
                        ti.a aVar = d21Var.w;
                        if (aVar != null) {
                            int i122 = aVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    d21Var.W(i122, true, new org.telegram.ui.Components.h2(d21Var, i122, 28));
                                    break;
                                } else {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = d21Var.w.b;
                                        } else if (i132 == 1) {
                                            int i142 = d21Var.w.c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = d21Var.w.d;
                                        } else if (i132 == 3) {
                                            str = d21Var.w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = d21Var.w.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            d21Var.a[i132].setText((CharSequence) null);
                                        } else {
                                            try {
                                                d21Var.a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.a[i132].setText(str);
                                            }
                                        }
                                    }
                                    i132++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, org.telegram.ui.Components.kb1.r(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(this.fragmentView.getContext(), (d3) null);
        f7VarArr[2] = f7Var2;
        this.c.addView(f7Var2, 1, org.telegram.ui.Components.kb1.r(-1, -2));
        f7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
        this.h = gaVar2;
        org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(true);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i18);
        gaVar2.setBackground(M02);
        org.telegram.ui.ActionBar.f7.k(gaVar2, M02, N3, N4, null);
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        org.telegram.ui.ActionBar.f7.V(this.h.getTextView(), i19, null);
        this.c.addView(this.h, org.telegram.ui.Components.kb1.r(-1, -2));
        this.h.setOnClickListener(new zd0(12, this, context));
        org.telegram.ui.Cells.f7 f7Var3 = new org.telegram.ui.Cells.f7(context, (d3) null);
        f7VarArr[1] = f7Var3;
        this.c.addView(f7Var3, org.telegram.ui.Components.kb1.r(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.y = 1.0f;
        V(false);
        this.v = 0;
        W(proxyInfo.settings.a, false, null);
        this.w = null;
        this.x = null;
        X();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.hp0 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        for (int i10 = 0; i10 < this.s.length; i10++) {
        }
        if (this.a != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i11], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.a[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                i11++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.f7[] f7VarArr = this.e;
            if (i12 >= f7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.f7 f7Var = f7VarArr[i12];
            i12++;
        }
        for (int i13 = 0; i13 < this.f.length; i13++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        X();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                org.telegram.ui.ActionBar.f7.V(this.h.getTextView(), this.F ? org.telegram.ui.ActionBar.y6.q6 : org.telegram.ui.ActionBar.y6.z6, null);
            }
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
