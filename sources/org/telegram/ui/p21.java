package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
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
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p21 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] a;
    public m21 b;
    public l21 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.a7[] e;
    public org.telegram.ui.Cells.e9[] f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.ea n;
    public org.telegram.ui.ActionBar.v0 r;
    public org.telegram.ui.Cells.k6[] s;
    public int v;
    public ni.b w;
    public String x;
    public float y;

    public p21() {
        super(null);
        this.e = new org.telegram.ui.Cells.a7[3];
        this.f = new org.telegram.ui.Cells.e9[2];
        this.s = new org.telegram.ui.Cells.k6[3];
        this.y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new i21(this);
        this.J = new SharedConfig.ProxyInfo(ni.b.i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ni.k.j(editTextBoldCursor.getText().toString())) || ni.k.d(this.a[4].getText().toString()) == null);
        if (this.F != z11) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.setDuration(200L);
                this.G.addUpdateListener(new a21(this, 1));
            }
            if (z10) {
                float[] fArr = this.E;
                fArr[0] = this.y;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.G.start();
            } else {
                this.y = z11 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, z11 ? org.telegram.ui.ActionBar.i6.q6 : org.telegram.ui.ActionBar.i6.z6, false));
                this.r.setAlpha(z11 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z11);
            this.r.setEnabled(z11);
            this.F = z11;
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.id idVar) {
        org.telegram.ui.Cells.k6[] k6VarArr = this.s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.c);
            }
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.qr.f).setDuration(250L);
                if (idVar != null) {
                    duration.addListener((Transition.TransitionListener) new o21(idVar));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.v;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.m(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.v != 3 ? 0 : 8);
            k6VarArr[0].a(this.v == 1, z10);
            k6VarArr[1].a(this.v == 2, z10);
            k6VarArr[2].a(this.v == 3, z10);
            U(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        String str;
        org.telegram.ui.Cells.a7[] a7VarArr = this.e;
        ClipData primaryClip = this.H.getPrimaryClip();
        ni.b bVar = null;
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
                        bVar = ni.b.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (bVar != null && bVar.f()) {
                        this.w = bVar;
                    }
                }
                if (this.w != null) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        a7VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    a7VarArr[2].setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.a7[] a7VarArr = this.e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new k21(this));
        org.telegram.ui.ActionBar.v0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        this.c = new l21(context);
        m21 m21Var = new m21(context, this.c, this.resourceProvider, true);
        this.b = m21Var;
        this.actionBar.setAdaptiveBackground(m21Var);
        this.b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.s8, false));
        int i10 = -1;
        frameLayout.addView(this.b, w7.x5.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.j21
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i11) {
                    case 0:
                        this.b.V(ni.b.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        p21 p21Var = this.b;
                        ni.b bVar = p21Var.w;
                        if (bVar != null) {
                            int i12 = bVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = p21Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    p21Var.V(i12, true, new org.telegram.ui.Components.id(p21Var, i12, 25));
                                    break;
                                } else {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = p21Var.w.b;
                                        } else if (i13 == 1) {
                                            int i14 = p21Var.w.c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = p21Var.w.d;
                                        } else if (i13 == 3) {
                                            str = p21Var.w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = p21Var.w.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            p21Var.a[i13].setText((CharSequence) null);
                                        } else {
                                            try {
                                                p21Var.a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                p21Var.a[i13].setText(str);
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
        for (int i12 = 0; i12 < 3; i12++) {
            int e = ni.b.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            k6Var.setBackground(org.telegram.ui.ActionBar.i6.K0(true));
            k6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                k6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), e == this.v, true);
            } else if (i12 == 1) {
                k6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), e == this.v, true);
            } else {
                k6VarArr[i12].c(LocaleController.getString(R.string.UseProxyWeb), e == this.v, false);
            }
            this.c.addView(k6VarArr[i12], w7.x5.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        a7VarArr[0] = a7Var;
        this.c.addView(a7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, w7.x5.n(-1, -2));
        int i13 = 5;
        this.a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.x5.n(i10, 64));
            this.a[i14] = new EditTextBoldCursor(context);
            this.a[i14].setTag(Integer.valueOf(i14));
            this.a[i14].setTextSize(1, 16.0f);
            this.a[i14].setHintColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.a[i14];
            int i15 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.a[i14].setBackground(null);
            this.a[i14].setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i14].setCursorWidth(1.5f);
            this.a[i14].setSingleLine(true);
            this.a[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L6, false));
            this.a[i14].setTransformHintToHeader(true);
            this.a[i14].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
            if (i14 == 0) {
                this.a[i14].setInputType(524305);
                this.a[i14].addTextChangedListener(new n21(this, 0));
            } else if (i14 == 1) {
                this.a[i14].setInputType(2);
                this.a[i14].addTextChangedListener(new n21(this, 1));
            } else if (i14 == 3) {
                this.a[i14].setInputType(129);
                this.a[i14].setTypeface(Typeface.DEFAULT);
                this.a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.a[i14].addTextChangedListener(new n21(this, 2));
            }
            this.a[i14].setImeOptions(268435461);
            if (i14 == 0) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.a[i14].setText(proxyInfo.settings.b);
            } else if (i14 == 1) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.a[i14].setText(Integer.toString(proxyInfo.settings.c));
            } else if (i14 == 2) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.a[i14].setText(proxyInfo.settings.d);
            } else if (i14 == 3) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.a[i14].setText(proxyInfo.settings.e);
            } else if (i14 == 4) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.a[i14].setText(proxyInfo.settings.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i14].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i14], w7.x5.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i14].setOnEditorActionListener(new ia(this, 10));
            i14++;
            i13 = 5;
            i10 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9VarArr[i16] = e9Var;
            if (i16 == 0) {
                e9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.m(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.c.addView(e9VarArr[i16], w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(this.fragmentView.getContext());
        this.n = eaVar;
        eaVar.setBackground(org.telegram.ui.ActionBar.i6.K0(true));
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ea eaVar2 = this.n;
        int i17 = org.telegram.ui.ActionBar.i6.q6;
        eaVar2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        final int i18 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.j21
            public final /* synthetic */ p21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i18) {
                    case 0:
                        this.b.V(ni.b.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        p21 p21Var = this.b;
                        ni.b bVar = p21Var.w;
                        if (bVar != null) {
                            int i122 = bVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = p21Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    p21Var.V(i122, true, new org.telegram.ui.Components.id(p21Var, i122, 25));
                                    break;
                                } else {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = p21Var.w.b;
                                        } else if (i132 == 1) {
                                            int i142 = p21Var.w.c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = p21Var.w.d;
                                        } else if (i132 == 3) {
                                            str = p21Var.w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = p21Var.w.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            p21Var.a[i132].setText((CharSequence) null);
                                        } else {
                                            try {
                                                p21Var.a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                p21Var.a[i132].setText(str);
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
        this.c.addView(this.n, 0, w7.x5.n(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(this.fragmentView.getContext(), (org.telegram.ui.Cells.q3) null);
        a7VarArr[2] = a7Var2;
        this.c.addView(a7Var2, 1, w7.x5.n(-1, -2));
        a7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ea eaVar3 = new org.telegram.ui.Cells.ea(context);
        this.h = eaVar3;
        eaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        this.c.addView(this.h, w7.x5.n(-1, -2));
        this.h.setOnClickListener(new wy0(1, this, context));
        org.telegram.ui.Cells.a7 a7Var3 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        a7VarArr[1] = a7Var3;
        this.c.addView(a7Var3, w7.x5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.a, false, null);
        this.w = null;
        this.x = null;
        W();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f;
        org.telegram.ui.Cells.k6[] k6VarArr = this.s;
        xy0 xy0Var = new xy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, TLObject.FLAG_28, null, null, null, null, i11));
        org.telegram.ui.Cells.ea eaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.i6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(eaVar, TLObject.FLAG_28, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, xy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.i6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, TLObject.FLAG_28, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, TLObject.FLAG_28, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < k6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h7));
        }
        if (this.a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.a[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.i6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.a7[] a7VarArr = this.e;
            if (i17 >= a7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.a7 a7Var = a7VarArr[i17];
            if (a7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(a7Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        W();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }
}
