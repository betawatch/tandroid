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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mx0 extends org.telegram.ui.ActionBar.d2 {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public org.telegram.messenger.zy K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public jx0 b;
    public ix0 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.x6[] e;
    public org.telegram.ui.Cells.y8[] f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.v9 n;
    public org.telegram.ui.ActionBar.b5 r;
    public org.telegram.ui.Cells.h6[] s;
    public int w;
    public ui.a x;
    public String y;

    public mx0() {
        super(null);
        this.e = new org.telegram.ui.Cells.x6[3];
        this.f = new org.telegram.ui.Cells.y8[2];
        this.s = new org.telegram.ui.Cells.h6[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new gx0(this);
        this.K = new org.telegram.messenger.zy(ui.a.i);
        this.J = true;
    }

    public final void Z(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ui.j.l(editTextBoldCursor.getText().toString())) || ui.j.f(this.a[4].getText().toString()) == null);
        if (this.G != z11) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.setDuration(200L);
                this.H.addUpdateListener(new b3(this, 29));
            }
            if (z10) {
                float[] fArr = this.F;
                fArr[0] = this.E;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.H.start();
            } else {
                this.E = z11 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), z11 ? org.telegram.ui.ActionBar.k6.q6 : org.telegram.ui.ActionBar.k6.z6, null);
            }
            this.h.setEnabled(z11);
            this.r.a(z11, z10);
            this.G = z11;
        }
    }

    public final void a0(int i3, boolean z10, org.telegram.ui.Components.o2 o2Var) {
        org.telegram.ui.Cells.h6[] h6VarArr = this.s;
        org.telegram.ui.Cells.y8[] y8VarArr = this.f;
        if (this.w != i3) {
            this.w = i3;
            TransitionManager.endTransitions(this.c);
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f).setDuration(250L);
                if (o2Var != null) {
                    duration.addListener((Transition.TransitionListener) new lx0(o2Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i10 = this.w;
            if (i10 == 1) {
                y8VarArr[0].setVisibility(0);
                y8VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.y8 y8Var = y8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743787, sb2, "\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743786, null));
                y8Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                y8VarArr[1].setText(org.telegram.messenger.bd.M0(2131743782, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            h6VarArr[0].a(this.w == 1, z10);
            h6VarArr[1].a(this.w == 2, z10);
            h6VarArr[2].a(this.w == 3, z10);
            Z(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(context, org.telegram.messenger.bd.M0(2131745458, null), str, org.telegram.messenger.bd.M0(2131746512, null), true);
        og0Var.o1.setImageBitmap(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, R.raw.qr_dog)));
        showDialog(og0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        String str;
        org.telegram.ui.Cells.x6[] x6VarArr = this.e;
        ClipData primaryClip = this.I.getPrimaryClip();
        ui.a aVar = null;
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
                        aVar = ui.a.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (aVar != null && aVar.g()) {
                        this.x = aVar;
                    }
                }
                if (this.x != null) {
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
        if (TextUtils.equals(str, this.y)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.Cells.y8[] y8VarArr = this.f;
        org.telegram.messenger.zy zyVar = this.K;
        org.telegram.ui.Cells.x6[] x6VarArr = this.e;
        org.telegram.ui.Cells.h6[] h6VarArr = this.s;
        final int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746612, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        final int i10 = 0;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 5));
        this.r = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new ix0(context);
        jx0 jx0Var = new jx0(context, this.c, this.resourceProvider, true);
        this.b = jx0Var;
        jx0Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        org.telegram.messenger.g0.z3(this.b, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
        int i11 = -1;
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.hx0
            public final /* synthetic */ mx0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i10) {
                    case 0:
                        this.b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        mx0 mx0Var = this.b;
                        ui.a aVar = mx0Var.x;
                        if (aVar != null) {
                            int i12 = aVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    mx0Var.a0(i12, true, new org.telegram.ui.Components.o2(mx0Var, i12, 25));
                                    break;
                                } else {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = mx0Var.x.b;
                                        } else if (i13 == 1) {
                                            int i14 = mx0Var.x.c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = mx0Var.x.d;
                                        } else if (i13 == 3) {
                                            str = mx0Var.x.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = mx0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            mx0Var.a[i13].setText((CharSequence) null);
                                        } else {
                                            try {
                                                mx0Var.a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                mx0Var.a[i13].setText(str);
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
            int f10 = ui.a.f(i12);
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
            h6VarArr[i12] = h6Var;
            org.telegram.ui.ActionBar.r6.R(h6Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6), null);
            h6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                h6VarArr[i12].c(org.telegram.messenger.bd.M0(2131743792, null), f10 == this.w, true);
            } else if (i12 == 1) {
                h6VarArr[i12].c(org.telegram.messenger.bd.M0(2131743789, null), f10 == this.w, true);
            } else {
                h6VarArr[i12].c(org.telegram.messenger.bd.M0(2131743783, null), f10 == this.w, false);
            }
            this.c.addView(h6VarArr[i12], b8.mf.o(-1, 50));
            h6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        x6VarArr[0] = x6Var;
        this.c.addView(x6Var, b8.mf.o(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        int i13 = -1;
        this.c.addView(this.d, b8.mf.o(-1, -2));
        int i14 = 5;
        this.a = new EditTextBoldCursor[5];
        int i15 = 0;
        while (i15 < i14) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, b8.mf.o(i13, 64));
            this.a[i15] = new EditTextBoldCursor(context);
            this.a[i15].setTag(Integer.valueOf(i15));
            this.a[i15].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.a[i15], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i15];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i16, null);
            this.a[i15].setBackground(null);
            org.telegram.ui.ActionBar.r6.w(this.a[i15], i16, null);
            this.a[i15].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.a[i15].setCursorWidth(1.5f);
            this.a[i15].setSingleLine(true);
            this.a[i15].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.r6.A(this.a[i15], org.telegram.ui.ActionBar.k6.L6, null);
            this.a[i15].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.r6.G(this.a[i15], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i15 == 0) {
                this.a[i15].setInputType(524305);
                this.a[i15].addTextChangedListener(new kx0(this, 0));
            } else if (i15 == 1) {
                this.a[i15].setInputType(2);
                this.a[i15].addTextChangedListener(new kx0(this, 1));
            } else if (i15 == 3) {
                this.a[i15].setInputType(org.telegram.messenger.hs.N1);
                this.a[i15].setTypeface(Typeface.DEFAULT);
                this.a[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i15].setInputType(524289);
            }
            if (i15 == 4) {
                this.a[i15].addTextChangedListener(new kx0(this, 2));
            }
            this.a[i15].setImeOptions(268435461);
            if (i15 == 0) {
                this.a[i15].setHintText(org.telegram.messenger.bd.M0(2131743801, null));
                this.a[i15].setText(zyVar.a.b);
            } else if (i15 == 1) {
                this.a[i15].setHintText(org.telegram.messenger.bd.M0(2131743796, null));
                this.a[i15].setText(Integer.toString(zyVar.a.c));
            } else if (i15 == 2) {
                this.a[i15].setHintText(org.telegram.messenger.bd.M0(2131743784, null));
                this.a[i15].setText(zyVar.a.d);
            } else if (i15 == 3) {
                this.a[i15].setHintText(org.telegram.messenger.bd.M0(2131743797, null));
                this.a[i15].setText(zyVar.a.e);
            } else if (i15 == 4) {
                this.a[i15].setHintText(org.telegram.messenger.bd.M0(2131743794, null));
                this.a[i15].setText(zyVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i15];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i15].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i15], b8.mf.d(-1, -1.0f, 51, 17.0f, i15 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i15].setOnEditorActionListener(new ea(this, 10));
            i15++;
            i14 = 5;
            i13 = -1;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8VarArr[i17] = y8Var;
            if (i17 == 0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131743798, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743787, sb2, "\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743786, null));
                y8Var.setText(sb2.toString());
                y8VarArr[i17].setVisibility(8);
            }
            this.c.addView(y8VarArr[i17], b8.mf.o(-1, -2));
        }
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(this.fragmentView.getContext());
        this.n = v9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i18 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        int i19 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i19);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
        this.n.b(org.telegram.messenger.bd.M0(2131747442, null), false);
        TextView textView = this.n.getTextView();
        int i20 = org.telegram.ui.ActionBar.k6.q6;
        org.telegram.ui.ActionBar.r6.V(textView, i20, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hx0
            public final /* synthetic */ mx0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i3) {
                    case 0:
                        this.b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        mx0 mx0Var = this.b;
                        ui.a aVar = mx0Var.x;
                        if (aVar != null) {
                            int i122 = aVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    mx0Var.a0(i122, true, new org.telegram.ui.Components.o2(mx0Var, i122, 25));
                                    break;
                                } else {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = mx0Var.x.b;
                                        } else if (i132 == 1) {
                                            int i142 = mx0Var.x.c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = mx0Var.x.d;
                                        } else if (i132 == 3) {
                                            str = mx0Var.x.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = mx0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            mx0Var.a[i132].setText((CharSequence) null);
                                        } else {
                                            try {
                                                mx0Var.a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                mx0Var.a[i132].setText(str);
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
        this.c.addView(this.n, 0, b8.mf.o(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        x6VarArr[2] = x6Var2;
        this.c.addView(x6Var2, 1, b8.mf.o(-1, -2));
        x6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
        this.h = v9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i18);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i19);
        v9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.r6.k(v9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.bd.M0(2131745469, null), false);
        org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), i20, null);
        this.c.addView(this.h, b8.mf.o(-1, -2));
        this.h.setOnClickListener(new hb0(13, this, context));
        org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        x6VarArr[1] = x6Var3;
        this.c.addView(x6Var3, b8.mf.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.w = 0;
        a0(zyVar.a.a, false, null);
        this.x = null;
        this.y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i3 = 0;
            if (this.b != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false)) != this.N) {
                this.N = x02;
                org.telegram.messenger.g0.z3(this.b, x02);
            }
            if (this.a == null) {
                return;
            }
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6);
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6);
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i3 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                    org.telegram.ui.ActionBar.r6.w(this.a[i3], org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.ui.ActionBar.r6.A(this.a[i3], org.telegram.ui.ActionBar.k6.L6, null);
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        for (int i3 = 0; i3 < this.s.length; i3++) {
        }
        if (this.a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.e;
            if (i11 >= x6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.x6 x6Var = x6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f.length; i12++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), this.G ? org.telegram.ui.ActionBar.k6.q6 : org.telegram.ui.ActionBar.k6.z6, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.J) {
            this.a[0].requestFocus();
            org.telegram.messenger.g0.K3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
