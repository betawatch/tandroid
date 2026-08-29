package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
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
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l11 extends org.telegram.ui.ActionBar.o2 {
    public float A;
    public final float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public boolean F;
    public final SharedConfig.ProxyInfo G;
    public boolean H;
    public final ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] a;
    public i11 b;
    public h11 c;
    public LinearLayout d;
    public final org.telegram.ui.Cells.x6[] e;
    public final org.telegram.ui.Cells.y8[] f;
    public org.telegram.ui.Cells.y9 h;
    public org.telegram.ui.Cells.y9 n;
    public org.telegram.ui.ActionBar.w0 r;
    public final org.telegram.ui.Cells.h6[] s;
    public int v;
    public int w;
    public String x;
    public String[] y;

    public l11() {
        super(null);
        this.e = new org.telegram.ui.Cells.x6[3];
        this.f = new org.telegram.ui.Cells.y8[2];
        this.s = new org.telegram.ui.Cells.h6[3];
        this.v = -1;
        this.w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.e11
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                l11.this.W();
            }
        };
        this.G = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.F = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.v != 2 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(WebProxyTransport.normalizeHost(editTextBoldCursor.getText().toString())) || !WebProxyTransport.isValidSecret(this.a[4].getText().toString()));
        if (this.C != z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D = ofFloat;
                ofFloat.setDuration(200L);
                this.D.addUpdateListener(new w01(this, 1));
            }
            if (z10) {
                float f9 = this.A;
                float[] fArr = this.B;
                fArr[0] = f9;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.D.start();
            } else {
                this.A = z11 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, z11 ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.z6, false));
                this.r.setAlpha(z11 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z11);
            this.r.setEnabled(z11);
            this.C = z11;
        }
    }

    public final void V(int i10, boolean z10, ky0 ky0Var) {
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.c);
            }
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.jr.f).setDuration(250L);
                if (ky0Var != null) {
                    duration.addListener((Transition.TransitionListener) new k11(ky0Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.v;
            org.telegram.ui.Cells.y8[] y8VarArr = this.f;
            if (i11 == 0) {
                y8VarArr[0].setVisibility(0);
                y8VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 1) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.y8 y8Var = y8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                y8Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                y8VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.v != 2 ? 0 : 8);
            org.telegram.ui.Cells.h6[] h6VarArr = this.s;
            h6VarArr[0].a(this.v == 0, z10);
            h6VarArr[1].a(this.v == 1, z10);
            h6VarArr[2].a(this.v == 2, z10);
            U(z10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        String str;
        char c3;
        ClipData primaryClip = this.E.getPrimaryClip();
        String[] strArr = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.x)) {
                this.w = -1;
                this.x = str;
                this.y = new String[this.a.length];
                if (str != null) {
                    String[] strArr2 = {"t.me/socks?", "tg://socks?"};
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            break;
                        }
                        int indexOf = str.indexOf(strArr2[i10]);
                        if (indexOf >= 0) {
                            this.w = 0;
                            strArr = str.substring(strArr2[i10].length() + indexOf).split("&");
                            break;
                        }
                        i10++;
                    }
                    if (strArr == null) {
                        String[] strArr3 = {"t.me/proxy?", "tg://proxy?"};
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 2) {
                                break;
                            }
                            int indexOf2 = str.indexOf(strArr3[i11]);
                            if (indexOf2 >= 0) {
                                this.w = 1;
                                strArr = str.substring(strArr3[i11].length() + indexOf2).split("&");
                                break;
                            }
                            i11++;
                        }
                    }
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            String[] split = str2.split("=");
                            if (split.length == 2) {
                                String lowerCase = split[0].toLowerCase();
                                lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case -906277200:
                                        if (lowerCase.equals("secret")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -905826493:
                                        if (lowerCase.equals("server")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3433489:
                                        if (lowerCase.equals("pass")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3446913:
                                        if (lowerCase.equals("port")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3599307:
                                        if (lowerCase.equals("user")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                        if (this.w == 1) {
                                            this.y[4] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        this.y[0] = split[1];
                                        break;
                                    case 2:
                                        if (this.w == 0) {
                                            this.y[3] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        this.y[1] = split[1];
                                        break;
                                    case 4:
                                        if (this.w == 0) {
                                            this.y[2] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                    }
                }
                int i12 = this.w;
                org.telegram.ui.Cells.x6[] x6VarArr = this.e;
                if (i12 != -1) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        x6VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    x6VarArr[2].setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        SharedConfig.ProxyInfo proxyInfo;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new g11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.c = new h11(context);
        i11 i11Var = new i11(context, this.c, this.resourceProvider, true);
        this.b = i11Var;
        this.actionBar.setAdaptiveBackground(i11Var);
        this.b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.s8, false));
        int i10 = -1;
        frameLayout.addView(this.b, i7.f6.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.f11
            public final /* synthetic */ l11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        l11 l11Var = this.b;
                        if (l11Var.w != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = l11Var.y;
                                if (i12 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = l11Var.a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    l11Var.V(l11Var.w, true, new ky0(l11Var, 8));
                                    break;
                                } else {
                                    int i13 = l11Var.w;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                l11Var.a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                l11Var.a[i12].setText(l11Var.y[i12]);
                                            }
                                        } else {
                                            l11Var.a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i12 = 0;
        while (i12 < 3) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
            org.telegram.ui.Cells.h6[] h6VarArr = this.s;
            h6VarArr[i12] = h6Var;
            h6Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
            h6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                h6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), i12 == this.v, true);
            } else if (i12 == 1) {
                h6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), i12 == this.v, true);
            } else {
                h6VarArr[i12].c(LocaleController.getString(R.string.UseProxyWeb), i12 == this.v, false);
            }
            this.c.addView(h6VarArr[i12], i7.f6.n(-1, 50));
            h6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        org.telegram.ui.Cells.x6[] x6VarArr = this.e;
        x6VarArr[0] = x6Var;
        this.c.addView(x6Var, i7.f6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, i7.f6.n(-1, -2));
        int i13 = 5;
        this.a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (true) {
            proxyInfo = this.G;
            if (i14 >= i13) {
                break;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, i7.f6.n(i10, 64));
            this.a[i14] = new EditTextBoldCursor(context);
            this.a[i14].setTag(Integer.valueOf(i14));
            this.a[i14].setTextSize(1, 16.0f);
            this.a[i14].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.a[i14];
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.a[i14].setBackground(null);
            this.a[i14].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i14].setCursorWidth(1.5f);
            this.a[i14].setSingleLine(true);
            this.a[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            this.a[i14].setTransformHintToHeader(true);
            this.a[i14].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
            if (i14 == 0) {
                this.a[i14].setInputType(524305);
                this.a[i14].addTextChangedListener(new j11(this, 0));
            } else if (i14 == 1) {
                this.a[i14].setInputType(2);
                this.a[i14].addTextChangedListener(new j11(this, 1));
            } else if (i14 == 3) {
                this.a[i14].setInputType(129);
                this.a[i14].setTypeface(Typeface.DEFAULT);
                this.a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.a[i14].addTextChangedListener(new j11(this, 2));
            }
            this.a[i14].setImeOptions(268435461);
            if (i14 == 0) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.a[i14].setText(proxyInfo.address);
            } else if (i14 == 1) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.a[i14].setText("" + proxyInfo.port);
            } else if (i14 == 2) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.a[i14].setText(proxyInfo.username);
            } else if (i14 == 3) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.a[i14].setText(proxyInfo.password);
            } else if (i14 == 4) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.a[i14].setText(proxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i14].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i14], i7.f6.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i14].setOnEditorActionListener(new da(this, 10));
            i14++;
            i13 = 5;
            i10 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.Cells.y8[] y8VarArr = this.f;
            y8VarArr[i16] = y8Var;
            if (i16 == 0) {
                y8Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                y8Var.setText(sb2.toString());
                y8VarArr[i16].setVisibility(8);
            }
            this.c.addView(y8VarArr[i16], i7.f6.n(-1, -2));
        }
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(this.fragmentView.getContext());
        this.n = y9Var;
        y9Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.y9 y9Var2 = this.n;
        int i17 = org.telegram.ui.ActionBar.g6.q6;
        y9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        final int i18 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f11
            public final /* synthetic */ l11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        l11 l11Var = this.b;
                        if (l11Var.w != -1) {
                            int i122 = 0;
                            while (true) {
                                String[] strArr = l11Var.y;
                                if (i122 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = l11Var.a[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    l11Var.V(l11Var.w, true, new ky0(l11Var, 8));
                                    break;
                                } else {
                                    int i132 = l11Var.w;
                                    if ((i132 != 0 || i122 != 4) && (i132 != 1 || (i122 != 2 && i122 != 3))) {
                                        String str = strArr[i122];
                                        if (str != null) {
                                            try {
                                                l11Var.a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                l11Var.a[i122].setText(l11Var.y[i122]);
                                            }
                                        } else {
                                            l11Var.a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, i7.f6.n(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(this.fragmentView.getContext(), (b) null);
        x6VarArr[2] = x6Var2;
        this.c.addView(x6Var2, 1, i7.f6.n(-1, -2));
        x6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.y9 y9Var3 = new org.telegram.ui.Cells.y9(context);
        this.h = y9Var3;
        y9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.c.addView(this.h, i7.f6.n(-1, -2));
        this.h.setOnClickListener(new t70(19, this, context));
        org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (b) null);
        x6VarArr[1] = x6Var3;
        this.c.addView(x6Var3, i7.f6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.A = 1.0f;
        U(false);
        this.v = -1;
        V(proxyInfo.type, false, null);
        this.w = -1;
        this.x = null;
        W();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        rx0 rx0Var = new rx0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, TLObject.FLAG_28, null, null, null, null, i11));
        org.telegram.ui.Cells.y9 y9Var = this.h;
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y9Var, TLObject.FLAG_28, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, TLObject.FLAG_28, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, TLObject.FLAG_28, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.h6[] h6VarArr = this.s;
            if (i14 >= h6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h7));
            i14++;
        }
        if (this.a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.e;
            if (i17 >= x6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.x6 x6Var = x6VarArr[i17];
            if (x6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(x6Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.f;
            if (i18 >= y8VarArr.length) {
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
            i18++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.E.removePrimaryClipChangedListener(this.I);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.E.addPrimaryClipChangedListener(this.I);
        W();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.F) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }

    public l11(SharedConfig.ProxyInfo proxyInfo) {
        super(null);
        this.e = new org.telegram.ui.Cells.x6[3];
        this.f = new org.telegram.ui.Cells.y8[2];
        this.s = new org.telegram.ui.Cells.h6[3];
        this.v = -1;
        this.w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.e11
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                l11.this.W();
            }
        };
        this.G = proxyInfo;
    }
}
