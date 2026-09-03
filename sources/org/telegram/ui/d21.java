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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.ActionBar.p2 {
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] a;
    public a21 b;
    public z11 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] e;
    public org.telegram.ui.Cells.z8[] f;
    public org.telegram.ui.Cells.z9 h;
    public org.telegram.ui.Cells.z9 n;
    public org.telegram.ui.ActionBar.w0 r;
    public org.telegram.ui.Cells.i6[] s;
    public int v;
    public rf.b w;
    public String x;
    public float y;

    public d21() {
        super(null);
        this.e = new org.telegram.ui.Cells.y6[3];
        this.f = new org.telegram.ui.Cells.z8[2];
        this.s = new org.telegram.ui.Cells.i6[3];
        this.y = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new w11(this);
        this.G = new SharedConfig.ProxyInfo(rf.b.g);
        this.F = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z10 = this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(rf.j.i(editTextBoldCursor.getText().toString())) || rf.j.d(this.a[4].getText().toString()) == null);
        if (this.C != z10) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D = ofFloat;
                ofFloat.setDuration(200L);
                this.D.addUpdateListener(new o11(this, 1));
            }
            if (z4) {
                float[] fArr = this.B;
                fArr[0] = this.y;
                fArr[1] = z10 ? 1.0f : 0.0f;
                this.D.start();
            } else {
                this.y = z10 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z10 ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                this.r.setAlpha(z10 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z10);
            this.r.setEnabled(z10);
            this.C = z10;
        }
    }

    public final void V(int i10, boolean z4, org.telegram.ui.Components.dw dwVar) {
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.c);
            }
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.mr.f).setDuration(250L);
                if (dwVar != null) {
                    duration.addListener((Transition.TransitionListener) new c21(dwVar));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.v;
            if (i11 == 1) {
                z8VarArr[0].setVisibility(0);
                z8VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.z8 z8Var = z8VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                z8Var.setText(sb.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.v != 3 ? 0 : 8);
            i6VarArr[0].a(this.v == 1, z4);
            i6VarArr[1].a(this.v == 2, z4);
            i6VarArr[2].a(this.v == 3, z4);
            U(z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        String str;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        ClipData primaryClip = this.E.getPrimaryClip();
        rf.b bVar = null;
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
                        bVar = rf.b.c(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (bVar != null && bVar.e()) {
                        this.w = bVar;
                    }
                }
                if (this.w != null) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        y6VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    y6VarArr[2].setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new y11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.c = new z11(context);
        a21 a21Var = new a21(context, this.c, this.resourceProvider, true);
        this.b = a21Var;
        this.actionBar.setAdaptiveBackground(a21Var);
        this.b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s8, false));
        int i10 = -1;
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.x11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i11) {
                    case 0:
                        this.b.V(rf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        d21 d21Var = this.b;
                        rf.b bVar = d21Var.w;
                        if (bVar != null) {
                            int i12 = bVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    d21Var.V(i12, true, new org.telegram.ui.Components.dw(d21Var, i12, 22));
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
        for (int i12 = 0; i12 < 3; i12++) {
            int d = rf.b.d(i12);
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
            i6VarArr[i12] = i6Var;
            i6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            i6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                i6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), d == this.v, true);
            } else if (i12 == 1) {
                i6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), d == this.v, true);
            } else {
                i6VarArr[i12].c(LocaleController.getString(R.string.UseProxyWeb), d == this.v, false);
            }
            this.c.addView(i6VarArr[i12], k7.b6.n(-1, 50));
            i6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        y6VarArr[0] = y6Var;
        this.c.addView(y6Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, k7.b6.n(-1, -2));
        int i13 = 5;
        this.a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.b6.n(i10, 64));
            this.a[i14] = new EditTextBoldCursor(context);
            this.a[i14].setTag(Integer.valueOf(i14));
            this.a[i14].setTextSize(1, 16.0f);
            this.a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.a[i14].setBackground(null);
            this.a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i14].setCursorWidth(1.5f);
            this.a[i14].setSingleLine(true);
            this.a[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.a[i14].setTransformHintToHeader(true);
            this.a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
            if (i14 == 0) {
                this.a[i14].setInputType(524305);
                this.a[i14].addTextChangedListener(new b21(this, 0));
            } else if (i14 == 1) {
                this.a[i14].setInputType(2);
                this.a[i14].addTextChangedListener(new b21(this, 1));
            } else if (i14 == 3) {
                this.a[i14].setInputType(129);
                this.a[i14].setTypeface(Typeface.DEFAULT);
                this.a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.a[i14].addTextChangedListener(new b21(this, 2));
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
            frameLayout2.addView(this.a[i14], k7.b6.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i14].setOnEditorActionListener(new ja(this, 10));
            i14++;
            i13 = 5;
            i10 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i16] = z8Var;
            if (i16 == 0) {
                z8Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                z8Var.setText(sb.toString());
                z8VarArr[i16].setVisibility(8);
            }
            this.c.addView(z8VarArr[i16], k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(this.fragmentView.getContext());
        this.n = z9Var;
        z9Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.z9 z9Var2 = this.n;
        int i17 = org.telegram.ui.ActionBar.j6.q6;
        z9Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final int i18 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i18) {
                    case 0:
                        this.b.V(rf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        d21 d21Var = this.b;
                        rf.b bVar = d21Var.w;
                        if (bVar != null) {
                            int i122 = bVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    d21Var.V(i122, true, new org.telegram.ui.Components.dw(d21Var, i122, 22));
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
        this.c.addView(this.n, 0, k7.b6.n(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (b) null);
        y6VarArr[2] = y6Var2;
        this.c.addView(y6Var2, 1, k7.b6.n(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.z9 z9Var3 = new org.telegram.ui.Cells.z9(context);
        this.h = z9Var3;
        z9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.c.addView(this.h, k7.b6.n(-1, -2));
        this.h.setOnClickListener(new ib0(16, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (b) null);
        y6VarArr[1] = y6Var3;
        this.c.addView(y6Var3, k7.b6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.a, false, null);
        this.w = null;
        this.x = null;
        W();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        jy0 jy0Var = new jy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, TLObject.FLAG_28, null, null, null, null, i11));
        org.telegram.ui.Cells.z9 z9Var = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var, TLObject.FLAG_28, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_28, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_28, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < i6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        }
        if (this.a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.e;
            if (i17 >= y6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.y6 y6Var = y6VarArr[i17];
            if (y6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(y6Var, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < z8VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.E.removePrimaryClipChangedListener(this.I);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.E.addPrimaryClipChangedListener(this.I);
        W();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10 && this.F) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }
}
