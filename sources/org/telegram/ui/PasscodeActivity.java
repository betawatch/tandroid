package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public r7 R;
    public boolean S;
    public final gx7 T;
    public hx7 U;
    public t56 V;
    public ve4 W;
    public s09 a;
    private int autoLockRow;
    public s30 b;
    public r59 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public blb e;
    public gt7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public xe6 n;
    public TextView r;
    public ImageView s;
    public d63 w;
    public wp4 x;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new gx7(this, (byte) 5);
        this.y = i;
    }

    public static org.telegram.ui.ActionBar.d n0() {
        return !gda.r.isEmpty() ? new PasscodeActivity(2) : new u8(6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03dc A[LOOP:0: B:54:0x03da->B:55:0x03dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        a8 a8Var;
        wl5 wl5Var = new wl5(this, (byte) 16);
        rja rjaVar = this.simpleActionBar;
        byte b = 0;
        boolean z = false;
        boolean z2 = false;
        if (rjaVar != null) {
            rjaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(wl5Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(wl5Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        byte b2 = this.y;
        int i2 = 1;
        if (b2 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, qoe.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        jx7 jx7Var = new jx7(this, context, frameLayout, b);
        byte b3 = 2;
        jx7Var.setDelegate(new xw0(this, b3));
        this.fragmentView = jx7Var;
        jx7Var.addView(frameLayout, qoe.l(1.0f, -1, 0));
        d63 d63Var = new d63(context);
        this.w = d63Var;
        d63Var.setVisibility(o0() ? 0 : 8);
        jx7Var.addView(this.w, qoe.o(-1, 230));
        if (b2 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(jb6.M0(2131747390, null));
            frameLayout2.setTag(Integer.valueOf(cmb.Z6));
            r59 r59Var = new r59(context, null);
            this.c = r59Var;
            r59Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new zs((byte) 10, i2, z ? 1 : 0));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, qoe.c(-1.0f, -1));
            r59 r59Var2 = this.c;
            s30 s30Var = new s30(this, context, (byte) 9);
            this.b = s30Var;
            r59Var2.setAdapter(s30Var);
            this.c.setOnItemClickListener(new kg4(this, (byte) 17));
        } else if (b2 == 1 || b2 == 2 || b2 == 3) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                anb.h(cmb.c6, null, aVar);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                anb.l(this.actionBar, 1, cmb.F6, null);
                anb.l(this.actionBar, 3, cmb.t8, null);
                this.actionBar.setCastShadows(false);
                r6 t = this.actionBar.t();
                if (b2 == 1) {
                    r7 a = t.a(0, R.drawable.ic_ab_other);
                    this.R = a;
                    a8Var = a.e(1, R.drawable.msg_permissions, jb6.M0(2131747386, null));
                } else {
                    a8Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new kx7(this, a8Var, z2 ? 1 : 0));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, qoe.c(-1.0f, -1));
            s09 s09Var = new s09(context);
            this.a = s09Var;
            s09Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, nm7.E1, nm7.E1, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            s09 s09Var2 = this.a;
            if (!gm.M1()) {
                Point point = gm.q;
                if (point.x < point.y) {
                    i = 0;
                    s09Var2.setVisibility(i);
                    linearLayout.addView(this.a, qoe.r(nm7.E1, nm7.E1, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i3 = cmb.F6;
                    anb.X(textView, i3, null);
                    this.d.setTypeface(gm.o());
                    if (b2 != 1) {
                        boolean isEmpty = gda.r.isEmpty();
                        TextView textView2 = this.d;
                        if (isEmpty) {
                            textView2.setText(jb6.M0(2131751645, null));
                        } else {
                            textView2.setText(jb6.M0(2131751056, null));
                        }
                    } else {
                        this.d.setText(jb6.M0(2131751049, null));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, qoe.t(-2, -2, 1, 0, 16, 0, 0));
                    blb blbVar = new blb(context);
                    this.e = blbVar;
                    blbVar.setFactory(new jl3(context, b3));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, qoe.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 14.0f);
                    anb.X(textView3, cmb.Ei, null);
                    textView3.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
                    textView3.setGravity((!p0() ? 3 : 1) | 16);
                    textView3.setOnClickListener(new m67(context, (byte) 5));
                    textView3.setVisibility(b2 != 2 ? 0 : 8);
                    textView3.setText(jb6.M0(2131750525, null));
                    frameLayout2.addView(textView3, qoe.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    wm9.c(textView3);
                    TextView textView4 = new TextView(context);
                    this.r = textView4;
                    textView4.setTextSize(1, 14.0f);
                    anb.X(this.r, cmb.C6, null);
                    this.r.setText(jb6.M0(2131747385, null));
                    this.r.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
                    gm.T3(this.r, false, 1.0f, true, false);
                    frameLayout2.addView(this.r, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    gt7 gt7Var = new gt7(context, null);
                    this.f = gt7Var;
                    gt7Var.setText(jb6.M0(2131751053, null));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    anb.X(this.h, i3, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!jb6.a0 ? 5 : 3);
                    this.h.setSingleLine(true);
                    byte b4 = 6;
                    if (b2 != 1) {
                        this.F = false;
                        this.h.setImeOptions(5);
                    } else {
                        this.F = true;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    anb.v(this.h, cmb.k6, null);
                    this.h.setCursorSize(gm.L(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int L = gm.L(16.0f);
                    this.h.setPadding(L, L, L, L);
                    this.h.setOnFocusChangeListener(new tt0(this, (byte) 15));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, qoe.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    anb.s(this.s, cmb.G6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i4 = cmb.h6;
                    anb.R(imageView2, cmb.f0(getThemedColor(i4), 1, -1), null, anb.M(i4), getResourceProvider());
                    gm.T3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new qz(this, atomicBoolean, b4));
                    this.s.setOnClickListener(new n06(this, atomicBoolean, (byte) 12));
                    linearLayout2.addView(this.s, qoe.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, qoe.c(-2.0f, -1));
                    frameLayout3.addView(this.f, qoe.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new j(this, (byte) 17));
                    this.h.addTextChangedListener(new lx7(this, (byte) 0));
                    this.h.setCustomSelectionActionModeCallback(new mx7((byte) 0));
                    xe6 xe6Var = new xe6((byte) 2, context, this);
                    this.n = xe6Var;
                    xe6Var.b(4, 10);
                    for (gl2 gl2Var : this.n.f) {
                        gl2Var.setShowSoftInputOnFocusCompat(!o0());
                        gl2Var.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        gl2Var.setTextSize(1, 24.0f);
                        gl2Var.addTextChangedListener(new lx7(this, (byte) 1));
                        gl2Var.setOnFocusChangeListener(new ru0(this, gl2Var, (byte) 3));
                    }
                    frameLayout3.addView(this.n, qoe.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, qoe.t(-1, -2, 1, 0, 32, 0, 72));
                    if (b2 == 1) {
                        frameLayout2.setTag(Integer.valueOf(cmb.c6));
                    }
                    wp4 wp4Var = new wp4(this.resourceProvider, context, false);
                    this.x = wp4Var;
                    wm9.c(wp4Var);
                    frameLayout2.addView(this.x, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.x.setOnClickListener(new m67(this, b4));
                    x0c x0cVar = new x0c(context);
                    x0cVar.setTransformType(1);
                    x0cVar.setProgress(0.0f);
                    x0cVar.setColor(cmb.w0(null, cmb.N9, false));
                    x0cVar.setDrawBackground(false);
                    this.x.setContentDescription(jb6.M0(2131747984, null));
                    this.x.addView(x0cVar, qoe.e(56, 56, 17));
                    wp4 wp4Var2 = this.x;
                    wp4Var2.a(wp4Var2);
                    y0();
                }
            }
            i = 8;
            s09Var2.setVisibility(i);
            linearLayout.addView(this.a, qoe.r(nm7.E1, nm7.E1, 1));
            TextView textView5 = new TextView(context);
            this.d = textView5;
            int i32 = cmb.F6;
            anb.X(textView5, i32, null);
            this.d.setTypeface(gm.o());
            if (b2 != 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, qoe.t(-2, -2, 1, 0, 16, 0, 0));
            blb blbVar2 = new blb(context);
            this.e = blbVar2;
            blbVar2.setFactory(new jl3(context, b3));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, qoe.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView32 = new TextView(context);
            textView32.setTextSize(1, 14.0f);
            anb.X(textView32, cmb.Ei, null);
            textView32.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
            textView32.setGravity((!p0() ? 3 : 1) | 16);
            textView32.setOnClickListener(new m67(context, (byte) 5));
            textView32.setVisibility(b2 != 2 ? 0 : 8);
            textView32.setText(jb6.M0(2131750525, null));
            frameLayout2.addView(textView32, qoe.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            wm9.c(textView32);
            TextView textView42 = new TextView(context);
            this.r = textView42;
            textView42.setTextSize(1, 14.0f);
            anb.X(this.r, cmb.C6, null);
            this.r.setText(jb6.M0(2131747385, null));
            this.r.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
            gm.T3(this.r, false, 1.0f, true, false);
            frameLayout2.addView(this.r, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            gt7 gt7Var2 = new gt7(context, null);
            this.f = gt7Var2;
            gt7Var2.setText(jb6.M0(2131751053, null));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            anb.X(this.h, i32, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!jb6.a0 ? 5 : 3);
            this.h.setSingleLine(true);
            byte b42 = 6;
            if (b2 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            anb.v(this.h, cmb.k6, null);
            this.h.setCursorSize(gm.L(20.0f));
            this.h.setCursorWidth(1.5f);
            int L2 = gm.L(16.0f);
            this.h.setPadding(L2, L2, L2, L2);
            this.h.setOnFocusChangeListener(new tt0(this, (byte) 15));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, qoe.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            anb.s(this.s, cmb.G6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i42 = cmb.h6;
            anb.R(imageView22, cmb.f0(getThemedColor(i42), 1, -1), null, anb.M(i42), getResourceProvider());
            gm.T3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new qz(this, atomicBoolean2, b42));
            this.s.setOnClickListener(new n06(this, atomicBoolean2, (byte) 12));
            linearLayout22.addView(this.s, qoe.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, qoe.c(-2.0f, -1));
            frameLayout3.addView(this.f, qoe.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new j(this, (byte) 17));
            this.h.addTextChangedListener(new lx7(this, (byte) 0));
            this.h.setCustomSelectionActionModeCallback(new mx7((byte) 0));
            xe6 xe6Var2 = new xe6((byte) 2, context, this);
            this.n = xe6Var2;
            xe6Var2.b(4, 10);
            while (r11 < r10) {
            }
            frameLayout3.addView(this.n, qoe.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, qoe.t(-1, -2, 1, 0, 32, 0, 72));
            if (b2 == 1) {
            }
            wp4 wp4Var3 = new wp4(this.resourceProvider, context, false);
            this.x = wp4Var3;
            wm9.c(wp4Var3);
            frameLayout2.addView(this.x, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.x.setOnClickListener(new m67(this, b42));
            x0c x0cVar2 = new x0c(context);
            x0cVar2.setTransformType(1);
            x0cVar2.setProgress(0.0f);
            x0cVar2.setColor(cmb.w0(null, cmb.N9, false));
            x0cVar2.setDrawBackground(false);
            this.x.setContentDescription(jb6.M0(2131747984, null));
            this.x.addView(x0cVar2, qoe.e(56, 56, 17));
            wp4 wp4Var22 = this.x;
            wp4Var22.a(wp4Var22);
            y0();
        }
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                z0();
                s30 s30Var = this.b;
                if (s30Var != null) {
                    s30Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        if (this.y != 0) {
            arrayList.add(new cnb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        }
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        arrayList.add(new cnb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        arrayList.add(new cnb(this.c, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.c, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return this.y == 0;
    }

    public final void m0(Runnable runnable) {
        if (!q0()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            xe6 xe6Var = this.n;
            gl2[] gl2VarArr = xe6Var.f;
            if (i >= gl2VarArr.length) {
                xe6Var.postDelayed(new bl7(this, runnable, (byte) 18), (gl2VarArr.length * 75) + 350);
                return;
            } else {
                gl2 gl2Var = gl2VarArr[i];
                gl2Var.postDelayed(new ix7(gl2Var, (byte) 0), i * 75);
                i++;
            }
        }
    }

    public final boolean o0() {
        if (!q0() || this.y == 0 || gm.O1()) {
            return false;
        }
        Point point = gm.q;
        return point.x < point.y && !gm.A1();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        gl2[] gl2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        w0(o0(), false);
        s09 s09Var = this.a;
        if (s09Var != null) {
            if (!gm.M1()) {
                Point point = gm.q;
                if (point.x < point.y) {
                    i = 0;
                    s09Var.setVisibility(i);
                }
            }
            i = 8;
            s09Var.setVisibility(i);
        }
        xe6 xe6Var = this.n;
        if (xe6Var == null || (gl2VarArr = xe6Var.f) == null) {
            return;
        }
        for (gl2 gl2Var : gl2VarArr) {
            gl2Var.setShowSoftInputOnFocusCompat(!o0());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        if (this.y != 0) {
            return true;
        }
        nm7.e().b(this, nm7.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            nm7.e().n(this, nm7.n0);
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        gm.z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.b;
        if (s30Var != null) {
            s30Var.f();
        }
        if (this.y != 0 && !o0()) {
            gm.d3(new gx7(this, (byte) 6), 200L);
        }
        gm.V2(getParentActivity(), this.classGuid);
        if (o0()) {
            gm.t1(this.fragmentView);
            gm.W2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                anb.l(editTextBoldCursor, 30, cmb.k6, null);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.y == 0) {
            return;
        }
        x0();
    }

    public final boolean p0() {
        byte b = this.y;
        return (b == 1 && this.E) || ((b == 2 || b == 3) && gda.q == 1);
    }

    public final boolean q0() {
        byte b = this.y;
        return (b == 1 && !this.E) || ((b == 2 || b == 3) && gda.q == 0);
    }

    public final /* synthetic */ void r0(lp7 lp7Var, int i) {
        int value = lp7Var.getValue();
        if (value == 0) {
            gda.x = 0;
        } else if (value == 1) {
            gda.x = 60;
        } else if (value == 2) {
            gda.x = nm7.W4;
        } else if (value == 3) {
            gda.x = 3600;
        } else if (value == 4) {
            gda.x = 18000;
        }
        this.b.g(i);
        z8c.h(this.currentAccount).u(false);
    }

    public final void s0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131751370, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131751369, null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131751368, null), new cj6(this, (byte) 26));
                heVar.show();
                anb.X((TextView) heVar.c(-1), cmb.p7, null);
                return;
            }
            if (i == this.changePasscodeRow) {
                presentFragment(new PasscodeActivity(1));
                return;
            }
            byte b = 3;
            if (i == this.autoLockRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = jb6.M0(2131753765, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M02;
                    lp7 lp7Var = new lp7(getParentActivity(), null);
                    lp7Var.setMinValue(0);
                    lp7Var.setMaxValue(4);
                    int i2 = gda.x;
                    if (i2 == 0) {
                        lp7Var.setValue(0);
                    } else if (i2 == 60) {
                        lp7Var.setValue(1);
                    } else if (i2 == 300) {
                        lp7Var.setValue(2);
                    } else if (i2 == 3600) {
                        lp7Var.setValue(3);
                    } else if (i2 == 18000) {
                        lp7Var.setValue(4);
                    }
                    lp7Var.setFormatter(new bh7((byte) 23));
                    alertDialog$Builder2.n(lp7Var);
                    alertDialog$Builder2.g(jb6.M0(2131751291, null), new yg((Object) this, (Object) lp7Var, i, (byte) 11));
                    showDialog(heVar2);
                    return;
                }
                return;
            }
            if (i == this.fingerprintRow) {
                gda.C = !gda.C;
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(gda.C);
                return;
            }
            if (i == this.O) {
                gda.z = !gda.z;
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(gda.z);
                nm7.e().k(nm7.n0, Boolean.FALSE);
                if (gda.z) {
                    return;
                }
                ik.r0(this, null, jb6.M0(2131745578, null), null);
                return;
            }
            if (i == this.K) {
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean z = !C.R();
                if (C.m != z) {
                    C.m = z;
                    try {
                        org.telegram.ui.Wallet.c.B().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", C.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.c.n("failed to save prefs", e);
                    }
                }
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(C.R());
                return;
            }
            if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean Q = C2.Q();
                boolean z2 = !Q;
                ra raVar = new ra(b, view, Q);
                g35 g35Var = C2.c;
                if (g35Var == null) {
                    raVar.a(Boolean.FALSE);
                } else {
                    g35.i.execute(new i71((Object) g35Var, g35Var.l(), z2, (Object) new sk3(raVar, (byte) 13), (byte) 1));
                }
            }
        }
    }

    public final void t0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (q0()) {
            for (gl2 gl2Var : this.n.f) {
                gl2Var.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        gm.A3(q0() ? 10.0f : 4.0f, q0() ? this.n : this.f, new gx7(this, (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0() {
        if (p0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        String code = q0() ? this.n.getCode() : this.h.getText().toString();
        byte b = this.y;
        Object[] objArr = 0;
        if (b == 1) {
            if (!this.G.equals(code)) {
                gm.R3(this.r, true);
                for (gl2 gl2Var : this.n.f) {
                    gl2Var.setText("");
                }
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.T);
                this.n.post(new gx7(this, (byte) 0));
                return;
            }
            boolean isEmpty = gda.r.isEmpty();
            try {
                gda.v = new byte[16];
                Utilities.b.nextBytes(gda.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(gda.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(gda.v, 0, bArr, bytes.length + 16, 16);
                gda.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                fc4.g(e, true);
            }
            gda.z = true;
            gda.q = this.E ? 1 : 0;
            gda.x();
            this.h.clearFocus();
            gm.t1(this.h);
            for (gl2 gl2Var2 : this.n.f) {
                gl2Var2.clearFocus();
                gm.t1(gl2Var2);
            }
            this.w.setEditText(null);
            m0(new hx7(this, isEmpty, objArr == true ? 1 : 0));
            return;
        }
        if (b == 2 || b == 3) {
            long j = gda.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), jb6.a0("TooManyTries", null, 2131743722, jb6.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (gl2 gl2Var3 : this.n.f) {
                    gl2Var3.setText("");
                }
                this.h.setText("");
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            if (!gda.g(code)) {
                gda.r();
                this.h.setText("");
                for (gl2 gl2Var4 : this.n.f) {
                    gl2Var4.setText("");
                }
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            gda.u = 0;
            gda.x();
            this.h.clearFocus();
            gm.t1(this.h);
            for (gl2 gl2Var5 : this.n.f) {
                gl2Var5.clearFocus();
                gm.t1(gl2Var5);
            }
            this.w.setEditText(null);
            if (b == 3) {
                m0(new gx7(this, (byte) 1));
            } else {
                m0(new gx7(this, (byte) 2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0() {
        if ((this.E && this.h.getText().length() == 0) || (!this.E && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        r7 r7Var = this.R;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        this.d.setText(jb6.M0(2131751752, null));
        this.e.setText(gm.S2(jb6.M0(2131747389, null)));
        this.G = q0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (gl2 gl2Var : this.n.f) {
            gl2Var.setText("");
        }
        x0();
        this.F = true;
    }

    public final void w0(boolean z, boolean z2) {
        if (z) {
            gm.t1(this.fragmentView);
            gm.W2(getParentActivity(), this.classGuid);
        } else {
            gm.z2(getParentActivity(), this.classGuid);
        }
        if (!z2) {
            this.w.setVisibility(z ? (byte) 0 : (byte) 8);
            this.w.setAlpha(z ? 1.0f : 0.0f);
            this.w.setTranslationY(z ? 0.0f : gm.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            r2 = 1.0f;
            r1 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(r2, r1).setDuration(150L);
        duration.setInterpolator(z ? d53.f : vt3.e);
        duration.addUpdateListener(new fx7(this, r0));
        duration.addListener(new jf4((byte) 18, this, z));
        duration.start();
    }

    public final void x0() {
        if (q0()) {
            this.n.f[0].requestFocus();
            if (o0()) {
                return;
            }
            gm.E3(this.n.f[0]);
            return;
        }
        if (p0()) {
            this.h.requestFocus();
            gm.E3(this.h);
        }
    }

    public final void y0() {
        String charSequence;
        byte b = this.y;
        if (b == 2) {
            charSequence = jb6.M0(2131751048, null);
        } else if (b == 3) {
            charSequence = jb6.M0(2131742876, null);
        } else if (this.F) {
            charSequence = this.e.getCurrentView().getText().toString();
        } else {
            charSequence = jb6.M0(!this.E ? 2131751644 : 2131751643, null);
        }
        byte b2 = 1;
        boolean z = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (b == 2) {
            this.e.a(jb6.M0(2131751048, null), z, false);
        } else if (b == 3) {
            this.e.setText(jb6.M0(2131742876, null));
        } else if (!this.F) {
            this.e.a(jb6.M0(this.E ? 2131751643 : 2131751644, null), z, false);
        }
        if (q0()) {
            gm.T3(this.n, true, 1.0f, true, z);
            gm.T3(this.f, false, 1.0f, true, z);
        } else if (p0()) {
            gm.T3(this.n, false, 1.0f, true, z);
            gm.T3(this.f, true, 1.0f, true, z);
        }
        if (p0()) {
            hx7 hx7Var = new hx7(this, z, b2);
            this.U = hx7Var;
            gm.d3(hx7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        w0(o0(), z);
        x0();
    }

    public final void z0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = true;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new ek0(new dk0(org.telegram.messenger.a.b, (byte) 0)).a(15) == 0) {
                Typeface typeface = gm.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().l4.n0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (g35.i(org.telegram.messenger.a.b)) {
                int i4 = this.Q;
                this.Q = i4 + 1;
                this.L = i4;
            }
            int i5 = this.Q;
            this.Q = i5 + 1;
            this.M = i5;
        }
        int i6 = this.Q;
        this.N = i6;
        this.O = i6 + 1;
        this.P = i6 + 2;
        this.Q = i6 + 4;
        this.disablePasscodeRow = i6 + 3;
    }
}
