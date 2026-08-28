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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k11 extends org.telegram.ui.ActionBar.o2 {
    public float A;
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] a;
    public h11 b;
    public g11 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] e;
    public org.telegram.ui.Cells.b9[] f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.ba n;
    public org.telegram.ui.ActionBar.w0 r;
    public org.telegram.ui.Cells.j6[] s;
    public int v;
    public int w;
    public String x;
    public String[] y;

    public k11() {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f = new org.telegram.ui.Cells.b9[2];
        this.s = new org.telegram.ui.Cells.j6[2];
        this.v = -1;
        this.w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new d11(this);
        this.G = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.F = true;
    }

    public final void T(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = (editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) ? false : true;
        if (this.C != z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D = ofFloat;
                ofFloat.setDuration(200L);
                this.D.addUpdateListener(new v01(this, 1));
            }
            if (z10) {
                float[] fArr = this.B;
                fArr[0] = this.A;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.D.start();
            } else {
                this.A = z11 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, z11 ? org.telegram.ui.ActionBar.f6.q6 : org.telegram.ui.ActionBar.f6.z6, false));
                this.r.setAlpha(z11 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z11);
            this.r.setEnabled(z11);
            this.C = z11;
        }
    }

    public final void U(int i9, boolean z10, ky0 ky0Var) {
        org.telegram.ui.Cells.j6[] j6VarArr = this.s;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f;
        if (this.v != i9) {
            this.v = i9;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.c);
            }
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f).setDuration(250L);
                if (ky0Var != null) {
                    duration.addListener((Transition.TransitionListener) new j11(ky0Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i10 = this.v;
            if (i10 == 0) {
                b9VarArr[0].setVisibility(0);
                b9VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
            } else if (i10 == 1) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
            }
            j6VarArr[0].a(this.v == 0, z10);
            j6VarArr[1].a(this.v == 1, z10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        String str;
        char c10;
        org.telegram.ui.Cells.z6[] z6VarArr = this.e;
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
                    int i9 = 0;
                    while (true) {
                        if (i9 >= 2) {
                            break;
                        }
                        int indexOf = str.indexOf(strArr2[i9]);
                        if (indexOf >= 0) {
                            this.w = 0;
                            strArr = str.substring(strArr2[i9].length() + indexOf).split("&");
                            break;
                        }
                        i9++;
                    }
                    if (strArr == null) {
                        String[] strArr3 = {"t.me/proxy?", "tg://proxy?"};
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 2) {
                                break;
                            }
                            int indexOf2 = str.indexOf(strArr3[i10]);
                            if (indexOf2 >= 0) {
                                this.w = 1;
                                strArr = str.substring(strArr3[i10].length() + indexOf2).split("&");
                                break;
                            }
                            i10++;
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
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -905826493:
                                        if (lowerCase.equals("server")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3433489:
                                        if (lowerCase.equals("pass")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3446913:
                                        if (lowerCase.equals("port")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3599307:
                                        if (lowerCase.equals("user")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
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
                if (this.w != -1) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        z6VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    z6VarArr[2].setVisibility(8);
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
        org.telegram.ui.Cells.b9[] b9VarArr = this.f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.z6[] z6VarArr = this.e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new f11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.c = new g11(context);
        h11 h11Var = new h11(context, this.c, this.resourceProvider, true);
        this.b = h11Var;
        this.actionBar.setAdaptiveBackground(h11Var);
        this.b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.s8, false));
        int i9 = -1;
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i10 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.e11
            public final /* synthetic */ k11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.U(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        k11 k11Var = this.b;
                        if (k11Var.w != -1) {
                            int i11 = 0;
                            while (true) {
                                String[] strArr = k11Var.y;
                                if (i11 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = k11Var.a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    k11Var.U(k11Var.w, true, new ky0(k11Var, 8));
                                    break;
                                } else {
                                    int i12 = k11Var.w;
                                    if ((i12 != 0 || i11 != 4) && (i12 != 1 || (i11 != 2 && i11 != 3))) {
                                        String str = strArr[i11];
                                        if (str != null) {
                                            try {
                                                k11Var.a[i11].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                k11Var.a[i11].setText(k11Var.y[i11]);
                                            }
                                        } else {
                                            k11Var.a[i11].setText((CharSequence) null);
                                        }
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i11] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
            j6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                j6VarArr[i11].c(LocaleController.getString(R.string.UseProxySocks5), i11 == this.v, true);
            } else {
                j6VarArr[i11].c(LocaleController.getString(R.string.UseProxyTelegram), i11 == this.v, false);
            }
            this.c.addView(j6VarArr[i11], g7.e6.n(-1, 50));
            j6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        z6VarArr[0] = z6Var;
        this.c.addView(z6Var, g7.e6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, g7.e6.n(-1, -2));
        int i12 = 5;
        this.a = new EditTextBoldCursor[5];
        int i13 = 0;
        while (i13 < i12) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, g7.e6.n(i9, 64));
            this.a[i13] = new EditTextBoldCursor(context);
            this.a[i13].setTag(Integer.valueOf(i13));
            this.a[i13].setTextSize(1, 16.0f);
            this.a[i13].setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.a[i13];
            int i14 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.a[i13].setBackground(null);
            this.a[i13].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.a[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i13].setCursorWidth(1.5f);
            this.a[i13].setSingleLine(true);
            this.a[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.a[i13].setHeaderHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
            this.a[i13].setTransformHintToHeader(true);
            this.a[i13].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
            if (i13 == 0) {
                this.a[i13].setInputType(524305);
                this.a[i13].addTextChangedListener(new i11(this, 0));
            } else if (i13 == 1) {
                this.a[i13].setInputType(2);
                this.a[i13].addTextChangedListener(new i11(this, 1));
            } else if (i13 == 3) {
                this.a[i13].setInputType(129);
                this.a[i13].setTypeface(Typeface.DEFAULT);
                this.a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i13].setInputType(524289);
            }
            this.a[i13].setImeOptions(268435461);
            if (i13 == 0) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.a[i13].setText(proxyInfo.address);
            } else if (i13 == 1) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.a[i13].setText("" + proxyInfo.port);
            } else if (i13 == 2) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.a[i13].setText(proxyInfo.username);
            } else if (i13 == 3) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.a[i13].setText(proxyInfo.password);
            } else if (i13 == 4) {
                this.a[i13].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.a[i13].setText(proxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i13].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i13], g7.e6.d(-1, -1.0f, 51, 17.0f, i13 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i13].setOnEditorActionListener(new ea(this, 10));
            i13++;
            i12 = 5;
            i9 = -1;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9VarArr[i15] = b9Var;
            if (i15 == 0) {
                b9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                b9Var.setText(sb2.toString());
                b9VarArr[i15].setVisibility(8);
            }
            this.c.addView(b9VarArr[i15], g7.e6.n(-1, -2));
        }
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(this.fragmentView.getContext());
        this.n = baVar;
        baVar.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ba baVar2 = this.n;
        int i16 = org.telegram.ui.ActionBar.f6.q6;
        baVar2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        final int i17 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e11
            public final /* synthetic */ k11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.U(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        k11 k11Var = this.b;
                        if (k11Var.w != -1) {
                            int i112 = 0;
                            while (true) {
                                String[] strArr = k11Var.y;
                                if (i112 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = k11Var.a[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    k11Var.U(k11Var.w, true, new ky0(k11Var, 8));
                                    break;
                                } else {
                                    int i122 = k11Var.w;
                                    if ((i122 != 0 || i112 != 4) && (i122 != 1 || (i112 != 2 && i112 != 3))) {
                                        String str = strArr[i112];
                                        if (str != null) {
                                            try {
                                                k11Var.a[i112].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                k11Var.a[i112].setText(k11Var.y[i112]);
                                            }
                                        } else {
                                            k11Var.a[i112].setText((CharSequence) null);
                                        }
                                    }
                                    i112++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, g7.e6.n(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (org.telegram.ui.Cells.j2) null);
        z6VarArr[2] = z6Var2;
        this.c.addView(z6Var2, 1, g7.e6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
        this.h = baVar3;
        baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.c.addView(this.h, g7.e6.n(-1, -2));
        this.h.setOnClickListener(new v80(18, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        z6VarArr[1] = z6Var3;
        this.c.addView(z6Var3, g7.e6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.A = 1.0f;
        T(false);
        this.v = -1;
        U(!TextUtils.isEmpty(proxyInfo.secret) ? 1 : 0, false, null);
        this.w = -1;
        this.x = null;
        V();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.s;
        sx0 sx0Var = new sx0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        LinearLayout linearLayout = this.d;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, TLObject.FLAG_28, null, null, null, null, i10));
        org.telegram.ui.Cells.ba baVar = this.h;
        int i11 = org.telegram.ui.ActionBar.f6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(baVar, TLObject.FLAG_28, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, TLObject.FLAG_28, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, TLObject.FLAG_28, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        for (int i13 = 0; i13 < j6VarArr.length; i13++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h7));
        }
        if (this.a != null) {
            int i14 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i14 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i14];
                int i15 = org.telegram.ui.ActionBar.f6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a[i14], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a[i14], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.a[i14], 16777216, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.p7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.e;
            if (i16 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i16];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
            }
            i16++;
        }
        for (int i17 = 0; i17 < b9VarArr.length; i17++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        }
        return arrayList;
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
        V();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.F) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }
}
