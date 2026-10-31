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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jz0 extends org.telegram.ui.ActionBar.k2 {
    public float D;
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public org.telegram.messenger.sz J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] a;
    public gz0 b;
    public fz0 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.c7[] e;
    public org.telegram.ui.Cells.b9[] f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.x9 n;
    public org.telegram.ui.ActionBar.l5 r;
    public org.telegram.ui.Cells.m6[] s;
    public int w;
    public ji.b x;
    public String y;

    public jz0() {
        super(null);
        this.e = new org.telegram.ui.Cells.c7[3];
        this.f = new org.telegram.ui.Cells.b9[2];
        this.s = new org.telegram.ui.Cells.m6[3];
        this.D = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new dz0(this);
        this.J = new org.telegram.messenger.sz(ji.b.i);
        this.I = true;
    }

    public final void Y(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ji.k.l(editTextBoldCursor.getText().toString())) || ji.k.f(this.a[4].getText().toString()) == null);
        if (this.F != z11) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.setDuration(200L);
                this.G.addUpdateListener(new a3(this, 29));
            }
            if (z10) {
                float[] fArr = this.E;
                fArr[0] = this.D;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.G.start();
            } else {
                this.D = z11 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.a7.V(this.h.getTextView(), z11 ? org.telegram.ui.ActionBar.t6.q6 : org.telegram.ui.ActionBar.t6.z6, null);
            }
            this.h.setEnabled(z11);
            this.r.a(z11, z10);
            this.F = z11;
        }
    }

    public final void Z(int i10, boolean z10, org.telegram.ui.Components.qq qqVar) {
        org.telegram.ui.Cells.m6[] m6VarArr = this.s;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f;
        if (this.w != i10) {
            this.w = i10;
            TransitionManager.endTransitions(this.c);
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f).setDuration(250L);
                if (qqVar != null) {
                    duration.addListener((Transition.TransitionListener) new iz0(qqVar));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.w;
            if (i11 == 1) {
                b9VarArr[0].setVisibility(0);
                b9VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.b9 b9Var = b9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131743803, sb2, "\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743802, null));
                b9Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                b9VarArr[1].setText(org.telegram.messenger.cd.L0(2131743798, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.w != 3 ? 0 : 8);
            m6VarArr[0].a(this.w == 1, z10);
            m6VarArr[1].a(this.w == 2, z10);
            m6VarArr[2].a(this.w == 3, z10);
            Y(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        String str;
        org.telegram.ui.Cells.c7[] c7VarArr = this.e;
        ClipData primaryClip = this.H.getPrimaryClip();
        ji.b bVar = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.y)) {
                this.x = null;
                this.y = str;
                if (str != null) {
                    try {
                        bVar = ji.b.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (bVar != null && bVar.f()) {
                        this.x = bVar;
                    }
                }
                if (this.x != null) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        c7VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    c7VarArr[2].setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.equals(str, this.y)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    public final void b0() {
        int x02;
        try {
            int i10 = 0;
            if (this.b != null && (x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s8, false)) != this.M) {
                this.M = x02;
                org.telegram.messenger.i0.y3(this.b, x02);
            }
            if (this.a == null) {
                return;
            }
            org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.H6);
            org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G6);
            org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i10 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.t6.H6, null);
                    org.telegram.ui.ActionBar.a7.w(this.a[i10], org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.ui.ActionBar.a7.A(this.a[i10], org.telegram.ui.ActionBar.t6.L6, null);
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.Cells.b9[] b9VarArr = this.f;
        org.telegram.messenger.sz szVar = this.J;
        org.telegram.ui.Cells.c7[] c7VarArr = this.e;
        org.telegram.ui.Cells.m6[] m6VarArr = this.s;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746619, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        final int i11 = 0;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 25));
        this.r = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new fz0(context);
        gz0 gz0Var = new gz0(context, this.c, this.resourceProvider, true);
        this.b = gz0Var;
        gz0Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        org.telegram.messenger.i0.y3(this.b, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s8, false));
        int i12 = -1;
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.ez0
            public final /* synthetic */ jz0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i11) {
                    case 0:
                        this.b.Z(ji.b.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        jz0 jz0Var = this.b;
                        ji.b bVar = jz0Var.x;
                        if (bVar != null) {
                            int i13 = bVar.a;
                            int i14 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.a;
                                if (i14 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    jz0Var.Z(i13, true, new org.telegram.ui.Components.qq(jz0Var, i13, 20));
                                    break;
                                } else {
                                    if ((i13 != 1 || i14 != 4) && (i13 != 2 || (i14 != 2 && i14 != 3))) {
                                        if (i14 == 0) {
                                            str = jz0Var.x.b;
                                        } else if (i14 == 1) {
                                            int i15 = jz0Var.x.c;
                                            if (i15 != 0) {
                                                str = Integer.toString(i15);
                                            }
                                            str = null;
                                        } else if (i14 == 2) {
                                            str = jz0Var.x.d;
                                        } else if (i14 == 3) {
                                            str = jz0Var.x.e;
                                        } else {
                                            if (i14 == 4) {
                                                str = jz0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            jz0Var.a[i14].setText((CharSequence) null);
                                        } else {
                                            try {
                                                jz0Var.a[i14].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                jz0Var.a[i14].setText(str);
                                            }
                                        }
                                    }
                                    i14++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i13 = 0;
        while (i13 < 3) {
            int e = ji.b.e(i13);
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
            m6VarArr[i13] = m6Var;
            org.telegram.ui.ActionBar.a7.R(m6Var, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6), null);
            m6VarArr[i13].setTag(Integer.valueOf(i13));
            if (i13 == 0) {
                m6VarArr[i13].c(org.telegram.messenger.cd.L0(2131743808, null), e == this.w, true);
            } else if (i13 == 1) {
                m6VarArr[i13].c(org.telegram.messenger.cd.L0(2131743805, null), e == this.w, true);
            } else {
                m6VarArr[i13].c(org.telegram.messenger.cd.L0(2131743799, null), e == this.w, false);
            }
            this.c.addView(m6VarArr[i13], w7.b6.o(-1, 50));
            m6VarArr[i13].setOnClickListener(onClickListener);
            i13++;
            i12 = -1;
        }
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        c7VarArr[0] = c7Var;
        this.c.addView(c7Var, w7.b6.o(i12, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.i0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, w7.b6.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i14 = 0;
        for (int i15 = 5; i14 < i15; i15 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.b6.o(-1, 64));
            this.a[i14] = new EditTextBoldCursor(context);
            this.a[i14].setTag(Integer.valueOf(i14));
            this.a[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.B(this.a[i14], org.telegram.ui.ActionBar.t6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i14];
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i16, null);
            this.a[i14].setBackground(null);
            org.telegram.ui.ActionBar.a7.w(this.a[i14], i16, null);
            this.a[i14].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.a[i14].setCursorWidth(1.5f);
            this.a[i14].setSingleLine(true);
            this.a[i14].setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.a7.A(this.a[i14], org.telegram.ui.ActionBar.t6.L6, null);
            this.a[i14].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.a7.G(this.a[i14], org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, null);
            if (i14 == 0) {
                this.a[i14].setInputType(524305);
                this.a[i14].addTextChangedListener(new hz0(this, 0));
            } else if (i14 == 1) {
                this.a[i14].setInputType(2);
                this.a[i14].addTextChangedListener(new hz0(this, 1));
            } else if (i14 == 3) {
                this.a[i14].setInputType(org.telegram.messenger.zs.N1);
                this.a[i14].setTypeface(Typeface.DEFAULT);
                this.a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.a[i14].addTextChangedListener(new hz0(this, 2));
            }
            this.a[i14].setImeOptions(268435461);
            if (i14 == 0) {
                this.a[i14].setHintText(org.telegram.messenger.cd.L0(2131743817, null));
                this.a[i14].setText(szVar.a.b);
            } else if (i14 == 1) {
                this.a[i14].setHintText(org.telegram.messenger.cd.L0(2131743812, null));
                this.a[i14].setText(Integer.toString(szVar.a.c));
            } else if (i14 == 2) {
                this.a[i14].setHintText(org.telegram.messenger.cd.L0(2131743800, null));
                this.a[i14].setText(szVar.a.d);
            } else if (i14 == 3) {
                this.a[i14].setHintText(org.telegram.messenger.cd.L0(2131743813, null));
                this.a[i14].setText(szVar.a.e);
            } else if (i14 == 4) {
                this.a[i14].setHintText(org.telegram.messenger.cd.L0(2131743810, null));
                this.a[i14].setText(szVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i14].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i14], w7.b6.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i14].setOnEditorActionListener(new ha(this, 10));
            i14++;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9VarArr[i17] = b9Var;
            if (i17 == 0) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131743814, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131743803, sb2, "\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743802, null));
                b9Var.setText(sb2.toString());
                b9VarArr[i17].setVisibility(8);
            }
            this.c.addView(b9VarArr[i17], w7.b6.o(-1, -2));
        }
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(this.fragmentView.getContext());
        this.n = x9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        int i18 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
        int i19 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i19);
        x9Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
        this.n.b(org.telegram.messenger.cd.L0(2131747450, null), false);
        TextView textView = this.n.getTextView();
        int i20 = org.telegram.ui.ActionBar.t6.q6;
        org.telegram.ui.ActionBar.a7.V(textView, i20, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ez0
            public final /* synthetic */ jz0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i10) {
                    case 0:
                        this.b.Z(ji.b.e(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        jz0 jz0Var = this.b;
                        ji.b bVar = jz0Var.x;
                        if (bVar != null) {
                            int i132 = bVar.a;
                            int i142 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.a;
                                if (i142 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    jz0Var.Z(i132, true, new org.telegram.ui.Components.qq(jz0Var, i132, 20));
                                    break;
                                } else {
                                    if ((i132 != 1 || i142 != 4) && (i132 != 2 || (i142 != 2 && i142 != 3))) {
                                        if (i142 == 0) {
                                            str = jz0Var.x.b;
                                        } else if (i142 == 1) {
                                            int i152 = jz0Var.x.c;
                                            if (i152 != 0) {
                                                str = Integer.toString(i152);
                                            }
                                            str = null;
                                        } else if (i142 == 2) {
                                            str = jz0Var.x.d;
                                        } else if (i142 == 3) {
                                            str = jz0Var.x.e;
                                        } else {
                                            if (i142 == 4) {
                                                str = jz0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            jz0Var.a[i142].setText((CharSequence) null);
                                        } else {
                                            try {
                                                jz0Var.a[i142].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                jz0Var.a[i142].setText(str);
                                            }
                                        }
                                    }
                                    i142++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, w7.b6.o(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        c7VarArr[2] = c7Var2;
        this.c.addView(c7Var2, 1, w7.b6.o(-1, -2));
        c7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
        this.h = x9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i18);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i19);
        x9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.a7.k(x9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.cd.L0(2131745477, null), false);
        org.telegram.ui.ActionBar.a7.V(this.h.getTextView(), i20, null);
        this.c.addView(this.h, w7.b6.o(-1, -2));
        this.h.setOnClickListener(new rv0(i10, this, context));
        org.telegram.ui.Cells.c7 c7Var3 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        c7VarArr[1] = c7Var3;
        this.c.addView(c7Var3, w7.b6.o(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.D = 1.0f;
        Y(false);
        this.w = 0;
        Z(szVar.a.a, false, null);
        this.x = null;
        this.y = null;
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        for (int i10 = 0; i10 < this.s.length; i10++) {
        }
        if (this.a != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i11], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.a[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                i11++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.e;
            if (i12 >= c7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.c7 c7Var = c7VarArr[i12];
            i12++;
        }
        for (int i13 = 0; i13 < this.f.length; i13++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        a0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                org.telegram.ui.ActionBar.a7.V(this.h.getTextView(), this.F ? org.telegram.ui.ActionBar.t6.q6 : org.telegram.ui.ActionBar.t6.z6, null);
            }
            b0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.a[0].requestFocus();
            org.telegram.messenger.i0.J3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
