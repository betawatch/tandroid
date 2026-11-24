// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gw8 extends d {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public fda K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public ew8 b;
    public m56 c;
    public LinearLayout d;
    public bba[] e;
    public njb[] f;
    public vkb h;
    public vkb n;
    public uja r;
    public w09[] s;
    public int w;
    public bw8 x;
    public String y;

    public gw8() {
        super(null);
        this.e = new bba[3];
        this.f = new njb[2];
        this.s = new w09[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new cw8(this, (byte) 0);
        this.K = new fda(bw8.i);
        this.J = true;
    }

    public final void Z(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z2 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(bwc.l(editTextBoldCursor.getText().toString())) || bwc.f(this.a[4].getText().toString()) == null);
        if (this.G != z2) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.setDuration(200L);
                this.H.addUpdateListener(new fx7(this, (byte) 22));
            }
            if (z) {
                float[] fArr = this.F;
                fArr[0] = this.E;
                fArr[1] = z2 ? 1.0f : 0.0f;
                this.H.start();
            } else {
                this.E = z2 ? 1.0f : 0.0f;
                anb.X(this.h.getTextView(), z2 ? cmb.p6 : cmb.y6, null);
            }
            this.h.setEnabled(z2);
            this.r.a(z2, z);
            this.G = z2;
        }
    }

    public final void a0(int i, boolean z, ge7 ge7Var) {
        w09[] w09VarArr = this.s;
        njb[] njbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            byte b = 2;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) d53.f).setDuration(250L);
                if (ge7Var != null) {
                    duration.addListener((Transition.TransitionListener) new i7(ge7Var, b));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                njbVarArr[0].setVisibility(0);
                njbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                njbVarArr[0].setVisibility(8);
                njbVarArr[1].setVisibility(0);
                njbVarArr[1].setText(jb6.M0(2131743464, null) + "\n\n" + jb6.M0(2131743463, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                njbVarArr[0].setVisibility(8);
                njbVarArr[1].setVisibility(0);
                njbVarArr[1].setText(jb6.M0(2131743459, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            w09VarArr[0].a(this.w == 1, z);
            w09VarArr[1].a(this.w == 2, z);
            w09VarArr[2].a(this.w == 3, z);
            Z(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0(Context context, String str) {
        ax8 ax8Var = new ax8(context, jb6.M0(2131745182, null), str, jb6.M0(2131746237, null), true);
        ax8Var.q1.setImageBitmap(neb.e(gm.L(60.0f), gm.L(60.0f), gm.v2(null, R.raw.qr_dog)));
        showDialog(ax8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        String str;
        bba[] bbaVarArr = this.e;
        ClipData primaryClip = this.I.getPrimaryClip();
        bw8 bw8Var = null;
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
                        bw8Var = bw8.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (bw8Var != null && bw8Var.g()) {
                        this.x = bw8Var;
                    }
                }
                bw8 bw8Var2 = this.x;
                vkb vkbVar = this.n;
                if (bw8Var2 != null) {
                    if (vkbVar.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        bbaVarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (vkbVar.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    bbaVarArr[2].setVisibility(8);
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

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        njb[] njbVarArr = this.f;
        fda fdaVar = this.K;
        bba[] bbaVarArr = this.e;
        w09[] w09VarArr = this.s;
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(jb6.M0(2131746337, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        tk5 tk5Var = this.parentLayout;
        final byte b2 = 0;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 5));
        this.r = this.simpleActionBar.s(jb6.M0(2131745680, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new m56(context);
        ew8 ew8Var = new ew8(context, this.c, this.resourceProvider, true);
        this.b = ew8Var;
        ew8Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        gm.u3(this.b, cmb.w0(null, cmb.r8, false));
        int i = -1;
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: dw8
            public final /* synthetic */ gw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b2;
                gw8 gw8Var = this.b;
                switch (b3) {
                    case 0:
                        gw8Var.a0(bw8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        bw8 bw8Var = gw8Var.x;
                        if (bw8Var != null) {
                            int i2 = bw8Var.a;
                            int i3 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = gw8Var.a;
                                if (i3 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    gw8Var.a0(i2, true, new ge7(gw8Var, i2, (byte) 9));
                                    break;
                                } else {
                                    if ((i2 != 1 || i3 != 4) && (i2 != 2 || (i3 != 2 && i3 != 3))) {
                                        if (i3 == 0) {
                                            str = gw8Var.x.b;
                                        } else if (i3 == 1) {
                                            int i4 = gw8Var.x.c;
                                            if (i4 != 0) {
                                                str = Integer.toString(i4);
                                            }
                                            str = null;
                                        } else if (i3 == 2) {
                                            str = gw8Var.x.d;
                                        } else if (i3 == 3) {
                                            str = gw8Var.x.e;
                                        } else {
                                            if (i3 == 4) {
                                                str = gw8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            gw8Var.a[i3].setText((CharSequence) null);
                                        } else {
                                            try {
                                                gw8Var.a[i3].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                gw8Var.a[i3].setText(str);
                                            }
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            int f = bw8.f(i2);
            w09 w09Var = new w09(context, null);
            w09VarArr[i2] = w09Var;
            anb.R(w09Var, cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6), null);
            w09VarArr[i2].setTag(Integer.valueOf(i2));
            if (i2 == 0) {
                w09VarArr[i2].c(jb6.M0(2131743469, null), f == this.w, true);
            } else if (i2 == 1) {
                w09VarArr[i2].c(jb6.M0(2131743466, null), f == this.w, true);
            } else {
                w09VarArr[i2].c(jb6.M0(2131743460, null), f == this.w, false);
            }
            this.c.addView(w09VarArr[i2], qoe.o(-1, 50));
            w09VarArr[i2].setOnClickListener(onClickListener);
            i2++;
            i = -1;
        }
        bba bbaVar = new bba(context, (hg9) null);
        bbaVarArr[0] = bbaVar;
        this.c.addView(bbaVar, qoe.o(i, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(gm.L(1.0f));
        this.d.setOutlineProvider(null);
        int i3 = -1;
        this.c.addView(this.d, qoe.o(-1, -2));
        int i4 = 5;
        this.a = new EditTextBoldCursor[5];
        int i5 = 0;
        while (i5 < i4) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, qoe.o(i3, 64));
            this.a[i5] = new EditTextBoldCursor(context);
            this.a[i5].setTag(Integer.valueOf(i5));
            this.a[i5].setTextSize(1, 16.0f);
            anb.A(this.a[i5], cmb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i5];
            int i6 = cmb.F6;
            anb.X(editTextBoldCursor, i6, null);
            this.a[i5].setBackground(null);
            anb.v(this.a[i5], i6, null);
            this.a[i5].setCursorSize(gm.L(20.0f));
            this.a[i5].setCursorWidth(1.5f);
            this.a[i5].setSingleLine(true);
            this.a[i5].setGravity((jb6.a0 ? 5 : 3) | 16);
            anb.z(this.a[i5], cmb.K6, null);
            this.a[i5].setTransformHintToHeader(true);
            anb.F(this.a[i5], cmb.j6, cmb.k6, cmb.o7, null);
            if (i5 == 0) {
                this.a[i5].setInputType(524305);
                this.a[i5].addTextChangedListener(new fw8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i5 == 1) {
                    editTextBoldCursorArr[i5].setInputType(2);
                    this.a[i5].addTextChangedListener(new fw8(this, (byte) 1));
                } else if (i5 == 3) {
                    editTextBoldCursorArr[i5].setInputType(nm7.M1);
                    this.a[i5].setTypeface(Typeface.DEFAULT);
                    this.a[i5].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i5].setInputType(524289);
                }
            }
            if (i5 == 4) {
                this.a[i5].addTextChangedListener(new fw8(this, (byte) 2));
            }
            this.a[i5].setImeOptions(268435461);
            if (i5 == 0) {
                this.a[i5].setHintText(jb6.M0(2131743478, null));
                this.a[i5].setText(fdaVar.a.b);
            } else if (i5 == 1) {
                this.a[i5].setHintText(jb6.M0(2131743473, null));
                this.a[i5].setText(Integer.toString(fdaVar.a.c));
            } else if (i5 == 2) {
                this.a[i5].setHintText(jb6.M0(2131743461, null));
                this.a[i5].setText(fdaVar.a.d);
            } else if (i5 == 3) {
                this.a[i5].setHintText(jb6.M0(2131743474, null));
                this.a[i5].setText(fdaVar.a.e);
            } else if (i5 == 4) {
                this.a[i5].setHintText(jb6.M0(2131743471, null));
                this.a[i5].setText(fdaVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i5];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i5].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i5], qoe.d(-1, -1.0f, 51, 17.0f, i5 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i5].setOnEditorActionListener(new j(this, (byte) 20));
            i5++;
            i4 = 5;
            i3 = -1;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            njb njbVar = new njb(context);
            njbVarArr[i7] = njbVar;
            if (i7 == 0) {
                njbVar.setText(jb6.M0(2131743475, null));
            } else {
                njbVar.setText(jb6.M0(2131743464, null) + "\n\n" + jb6.M0(2131743463, null));
                njbVarArr[i7].setVisibility(8);
            }
            this.c.addView(njbVarArr[i7], qoe.o(-1, -2));
        }
        vkb vkbVar = new vkb(this.fragmentView.getContext());
        this.n = vkbVar;
        fg0 L0 = cmb.L0(true);
        int i8 = cmb.c6;
        wmb M = anb.M(i8);
        int i9 = cmb.h6;
        wmb M2 = anb.M(i9);
        vkbVar.setBackground(L0);
        anb.j(vkbVar, L0, M, M2, null);
        this.n.b(jb6.M0(2131747167, null), false);
        TextView textView = this.n.getTextView();
        int i10 = cmb.p6;
        anb.X(textView, i10, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: dw8
            public final /* synthetic */ gw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b;
                gw8 gw8Var = this.b;
                switch (b3) {
                    case 0:
                        gw8Var.a0(bw8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        bw8 bw8Var = gw8Var.x;
                        if (bw8Var != null) {
                            int i22 = bw8Var.a;
                            int i32 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = gw8Var.a;
                                if (i32 >= editTextBoldCursorArr2.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    gw8Var.a0(i22, true, new ge7(gw8Var, i22, (byte) 9));
                                    break;
                                } else {
                                    if ((i22 != 1 || i32 != 4) && (i22 != 2 || (i32 != 2 && i32 != 3))) {
                                        if (i32 == 0) {
                                            str = gw8Var.x.b;
                                        } else if (i32 == 1) {
                                            int i42 = gw8Var.x.c;
                                            if (i42 != 0) {
                                                str = Integer.toString(i42);
                                            }
                                            str = null;
                                        } else if (i32 == 2) {
                                            str = gw8Var.x.d;
                                        } else if (i32 == 3) {
                                            str = gw8Var.x.e;
                                        } else {
                                            if (i32 == 4) {
                                                str = gw8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            gw8Var.a[i32].setText((CharSequence) null);
                                        } else {
                                            try {
                                                gw8Var.a[i32].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                gw8Var.a[i32].setText(str);
                                            }
                                        }
                                    }
                                    i32++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, qoe.o(-1, -2));
        this.n.setVisibility(8);
        bba bbaVar2 = new bba(this.fragmentView.getContext(), (hg9) null);
        bbaVarArr[2] = bbaVar2;
        this.c.addView(bbaVar2, 1, qoe.o(-1, -2));
        bbaVarArr[2].setVisibility(8);
        vkb vkbVar2 = new vkb(context);
        this.h = vkbVar2;
        fg0 L02 = cmb.L0(true);
        wmb M3 = anb.M(i8);
        wmb M4 = anb.M(i9);
        vkbVar2.setBackground(L02);
        anb.j(vkbVar2, L02, M3, M4, null);
        this.h.b(jb6.M0(2131745193, null), false);
        anb.X(this.h.getTextView(), i10, null);
        this.c.addView(this.h, qoe.o(-1, -2));
        this.h.setOnClickListener(new n06(this, context, (byte) 27));
        bba bbaVar3 = new bba(context, (hg9) null);
        bbaVarArr[1] = bbaVar3;
        this.c.addView(bbaVar3, qoe.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.w = 0;
        a0(fdaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = cmb.w0(null, cmb.r8, false)) != this.N) {
                this.N = w0;
                gm.u3(this.b, w0);
            }
            if (this.a == null) {
                return;
            }
            cmb.u0(cmb.G6);
            cmb.u0(cmb.F6);
            cmb.u0(cmb.K6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    anb.l(editTextBoldCursor, 34, cmb.G6, null);
                    anb.v(this.a[i], cmb.F6, null);
                    anb.z(this.a[i], cmb.K6, null);
                }
                i++;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ww9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new cnb(editTextBoldCursorArr[i2], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
                arrayList.add(new cnb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                i2++;
            }
        } else {
            arrayList.add(new cnb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
        }
        arrayList.add(new cnb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i3 = 0;
        while (true) {
            bba[] bbaVarArr = this.e;
            if (i3 >= bbaVarArr.length) {
                break;
            }
            bba bbaVar = bbaVarArr[i3];
            i3++;
        }
        for (int i4 = 0; i4 < this.f.length; i4++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        ValueAnimator valueAnimator;
        try {
            super.onThemeColorsChanged();
            if (this.h != null && ((valueAnimator = this.H) == null || !valueAnimator.isRunning())) {
                anb.X(this.h.getTextView(), this.G ? cmb.p6 : cmb.y6, null);
            }
            d0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            gm.E3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
