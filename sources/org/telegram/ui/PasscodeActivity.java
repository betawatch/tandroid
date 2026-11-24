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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public final ev7 T;
    public fv7 U;
    public t36 V;
    public vc4 W;
    public ry8 a;
    private int autoLockRow;
    public s20 b;
    public o39 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public ajb e;
    public er7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public yc6 n;
    public TextView r;
    public ImageView s;
    public s43 w;
    public un4 x;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new ev7(this, (byte) 5);
        this.y = i;
    }

    public static org.telegram.ui.ActionBar.d m0() {
        return !gba.r.isEmpty() ? new PasscodeActivity(2) : new u8(6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03dc A[LOOP:0: B:54:0x03da->B:55:0x03dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        a8 a8Var;
        bq5 bq5Var = new bq5(this, (byte) 15);
        pha phaVar = this.simpleActionBar;
        byte b = 0;
        boolean z = false;
        boolean z2 = false;
        if (phaVar != null) {
            phaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(bq5Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(bq5Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        byte b2 = this.y;
        int i2 = 1;
        if (b2 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, nme.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        hv7 hv7Var = new hv7(this, context, frameLayout, b);
        byte b3 = 2;
        hv7Var.setDelegate(new ov0(this, b3));
        this.fragmentView = hv7Var;
        hv7Var.addView(frameLayout, nme.l(1.0f, -1, 0));
        s43 s43Var = new s43(context);
        this.w = s43Var;
        s43Var.setVisibility(n0() ? 0 : 8);
        hv7Var.addView(this.w, nme.o(-1, kk7.F3));
        if (b2 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(k96.M0(2131747464, null));
            frameLayout2.setTag(Integer.valueOf(bkb.Z6));
            o39 o39Var = new o39(context, null);
            this.c = o39Var;
            o39Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new zr((byte) 10, i2, z ? 1 : 0));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, nme.c(-1.0f, -1));
            o39 o39Var2 = this.c;
            s20 s20Var = new s20(this, context, (byte) 9);
            this.b = s20Var;
            o39Var2.setAdapter(s20Var);
            this.c.setOnItemClickListener(new bf4(this, (byte) 16));
        } else if (b2 == 1 || b2 == 2 || b2 == 3) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                zkb.h(bkb.c6, null, aVar);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                zkb.l(this.actionBar, 1, bkb.F6, null);
                zkb.l(this.actionBar, 3, bkb.t8, null);
                this.actionBar.setCastShadows(false);
                r6 t = this.actionBar.t();
                if (b2 == 1) {
                    r7 a = t.a(0, R.drawable.ic_ab_other);
                    this.R = a;
                    a8Var = a.e(1, R.drawable.msg_permissions, k96.M0(2131747460, null));
                } else {
                    a8Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new iv7(this, a8Var, z2 ? 1 : 0));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, nme.c(-1.0f, -1));
            ry8 ry8Var = new ry8(context);
            this.a = ry8Var;
            ry8Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            ry8 ry8Var2 = this.a;
            if (!gl.M1()) {
                Point point = gl.q;
                if (point.x < point.y) {
                    i = 0;
                    ry8Var2.setVisibility(i);
                    linearLayout.addView(this.a, nme.r(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i3 = bkb.F6;
                    zkb.X(textView, i3, null);
                    this.d.setTypeface(gl.o());
                    if (b2 != 1) {
                        boolean isEmpty = gba.r.isEmpty();
                        TextView textView2 = this.d;
                        if (isEmpty) {
                            textView2.setText(k96.M0(2131751696, null));
                        } else {
                            textView2.setText(k96.M0(2131751107, null));
                        }
                    } else {
                        this.d.setText(k96.M0(2131751100, null));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, nme.t(-2, -2, 1, 0, 16, 0, 0));
                    ajb ajbVar = new ajb(context);
                    this.e = ajbVar;
                    ajbVar.setFactory(new zj3(context, b3));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, nme.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 14.0f);
                    zkb.X(textView3, bkb.Ei, null);
                    textView3.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
                    textView3.setGravity((!o0() ? 3 : 1) | 16);
                    textView3.setOnClickListener(new fr7(context, b3));
                    textView3.setVisibility(b2 != 2 ? 0 : 8);
                    textView3.setText(k96.M0(2131750576, null));
                    frameLayout2.addView(textView3, nme.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    vk9.c(textView3);
                    TextView textView4 = new TextView(context);
                    this.r = textView4;
                    textView4.setTextSize(1, 14.0f);
                    zkb.X(this.r, bkb.C6, null);
                    this.r.setText(k96.M0(2131747459, null));
                    this.r.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
                    gl.U3(this.r, false, 1.0f, true, false);
                    frameLayout2.addView(this.r, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    er7 er7Var = new er7(context, null);
                    this.f = er7Var;
                    er7Var.setText(k96.M0(2131751104, null));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    zkb.X(this.h, i3, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!k96.a0 ? 5 : 3);
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
                    zkb.v(this.h, bkb.k6, null);
                    this.h.setCursorSize(gl.L(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int L = gl.L(16.0f);
                    this.h.setPadding(L, L, L, L);
                    this.h.setOnFocusChangeListener(new ls0(this, (byte) 15));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, nme.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    zkb.s(this.s, bkb.G6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i4 = bkb.h6;
                    zkb.R(imageView2, bkb.f0(getThemedColor(i4), 1, -1), null, zkb.M(i4), getResourceProvider());
                    gl.U3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new qy(this, atomicBoolean, b4));
                    this.s.setOnClickListener(new v16(this, atomicBoolean, (byte) 11));
                    linearLayout2.addView(this.s, nme.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, nme.c(-2.0f, -1));
                    frameLayout3.addView(this.f, nme.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new j(this, (byte) 16));
                    this.h.addTextChangedListener(new jv7(this, (byte) 0));
                    this.h.setCustomSelectionActionModeCallback(new kv7((byte) 0));
                    yc6 yc6Var = new yc6((byte) 2, context, this);
                    this.n = yc6Var;
                    yc6Var.b(4, 10);
                    for (sj2 sj2Var : this.n.f) {
                        sj2Var.setShowSoftInputOnFocusCompat(!n0());
                        sj2Var.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        sj2Var.setTextSize(1, 24.0f);
                        sj2Var.addTextChangedListener(new jv7(this, (byte) 1));
                        sj2Var.setOnFocusChangeListener(new jt0(this, sj2Var, (byte) 3));
                    }
                    frameLayout3.addView(this.n, nme.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, nme.t(-1, -2, 1, 0, 32, 0, 72));
                    if (b2 == 1) {
                        frameLayout2.setTag(Integer.valueOf(bkb.c6));
                    }
                    un4 un4Var = new un4(this.resourceProvider, context, false);
                    this.x = un4Var;
                    vk9.c(un4Var);
                    frameLayout2.addView(this.x, nme.d(56, 56.0f, (!k96.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.x.setOnClickListener(new fr7(this, (byte) 3));
                    wyb wybVar = new wyb(context);
                    wybVar.setTransformType(1);
                    wybVar.setProgress(0.0f);
                    wybVar.setColor(bkb.w0(null, bkb.N9, false));
                    wybVar.setDrawBackground(false);
                    this.x.setContentDescription(k96.M0(2131748058, null));
                    this.x.addView(wybVar, nme.e(56, 56, 17));
                    un4 un4Var2 = this.x;
                    un4Var2.a(un4Var2);
                    x0();
                }
            }
            i = 8;
            ry8Var2.setVisibility(i);
            linearLayout.addView(this.a, nme.r(120, 120, 1));
            TextView textView5 = new TextView(context);
            this.d = textView5;
            int i32 = bkb.F6;
            zkb.X(textView5, i32, null);
            this.d.setTypeface(gl.o());
            if (b2 != 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, nme.t(-2, -2, 1, 0, 16, 0, 0));
            ajb ajbVar2 = new ajb(context);
            this.e = ajbVar2;
            ajbVar2.setFactory(new zj3(context, b3));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, nme.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView32 = new TextView(context);
            textView32.setTextSize(1, 14.0f);
            zkb.X(textView32, bkb.Ei, null);
            textView32.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
            textView32.setGravity((!o0() ? 3 : 1) | 16);
            textView32.setOnClickListener(new fr7(context, b3));
            textView32.setVisibility(b2 != 2 ? 0 : 8);
            textView32.setText(k96.M0(2131750576, null));
            frameLayout2.addView(textView32, nme.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            vk9.c(textView32);
            TextView textView42 = new TextView(context);
            this.r = textView42;
            textView42.setTextSize(1, 14.0f);
            zkb.X(this.r, bkb.C6, null);
            this.r.setText(k96.M0(2131747459, null));
            this.r.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
            gl.U3(this.r, false, 1.0f, true, false);
            frameLayout2.addView(this.r, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            er7 er7Var2 = new er7(context, null);
            this.f = er7Var2;
            er7Var2.setText(k96.M0(2131751104, null));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            zkb.X(this.h, i32, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!k96.a0 ? 5 : 3);
            this.h.setSingleLine(true);
            byte b42 = 6;
            if (b2 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            zkb.v(this.h, bkb.k6, null);
            this.h.setCursorSize(gl.L(20.0f));
            this.h.setCursorWidth(1.5f);
            int L2 = gl.L(16.0f);
            this.h.setPadding(L2, L2, L2, L2);
            this.h.setOnFocusChangeListener(new ls0(this, (byte) 15));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, nme.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            zkb.s(this.s, bkb.G6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i42 = bkb.h6;
            zkb.R(imageView22, bkb.f0(getThemedColor(i42), 1, -1), null, zkb.M(i42), getResourceProvider());
            gl.U3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new qy(this, atomicBoolean2, b42));
            this.s.setOnClickListener(new v16(this, atomicBoolean2, (byte) 11));
            linearLayout22.addView(this.s, nme.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, nme.c(-2.0f, -1));
            frameLayout3.addView(this.f, nme.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new j(this, (byte) 16));
            this.h.addTextChangedListener(new jv7(this, (byte) 0));
            this.h.setCustomSelectionActionModeCallback(new kv7((byte) 0));
            yc6 yc6Var2 = new yc6((byte) 2, context, this);
            this.n = yc6Var2;
            yc6Var2.b(4, 10);
            while (r10 < r7) {
            }
            frameLayout3.addView(this.n, nme.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, nme.t(-1, -2, 1, 0, 32, 0, 72));
            if (b2 == 1) {
            }
            un4 un4Var3 = new un4(this.resourceProvider, context, false);
            this.x = un4Var3;
            vk9.c(un4Var3);
            frameLayout2.addView(this.x, nme.d(56, 56.0f, (!k96.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.x.setOnClickListener(new fr7(this, (byte) 3));
            wyb wybVar2 = new wyb(context);
            wybVar2.setTransformType(1);
            wybVar2.setProgress(0.0f);
            wybVar2.setColor(bkb.w0(null, bkb.N9, false));
            wybVar2.setDrawBackground(false);
            this.x.setContentDescription(k96.M0(2131748058, null));
            this.x.addView(wybVar2, nme.e(56, 56, 17));
            un4 un4Var22 = this.x;
            un4Var22.a(un4Var22);
            x0();
        }
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.m0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                y0();
                s20 s20Var = this.b;
                if (s20Var != null) {
                    s20Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        if (this.y != 0) {
            arrayList.add(new blb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        }
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        arrayList.add(new blb(this.c, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.c, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
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

    public final void l0(Runnable runnable) {
        if (!p0()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            yc6 yc6Var = this.n;
            sj2[] sj2VarArr = yc6Var.f;
            if (i >= sj2VarArr.length) {
                yc6Var.postDelayed(new bj7(this, runnable, (byte) 17), (sj2VarArr.length * 75) + 350);
                return;
            } else {
                sj2 sj2Var = sj2VarArr[i];
                sj2Var.postDelayed(new gv7(sj2Var, (byte) 0), i * 75);
                i++;
            }
        }
    }

    public final boolean n0() {
        if (!p0() || this.y == 0 || gl.O1()) {
            return false;
        }
        Point point = gl.q;
        return point.x < point.y && !gl.A1();
    }

    public final boolean o0() {
        byte b = this.y;
        return (b == 1 && this.E) || ((b == 2 || b == 3) && gba.q == 1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        sj2[] sj2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        v0(n0(), false);
        ry8 ry8Var = this.a;
        if (ry8Var != null) {
            if (!gl.M1()) {
                Point point = gl.q;
                if (point.x < point.y) {
                    i = 0;
                    ry8Var.setVisibility(i);
                }
            }
            i = 8;
            ry8Var.setVisibility(i);
        }
        yc6 yc6Var = this.n;
        if (yc6Var == null || (sj2VarArr = yc6Var.f) == null) {
            return;
        }
        for (sj2 sj2Var : sj2VarArr) {
            sj2Var.setShowSoftInputOnFocusCompat(!n0());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        y0();
        if (this.y != 0) {
            return true;
        }
        kk7.e().b(this, kk7.m0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            kk7.e().n(this, kk7.m0);
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        gl.z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.b;
        if (s20Var != null) {
            s20Var.f();
        }
        if (this.y != 0 && !n0()) {
            gl.e3(new ev7(this, (byte) 6), 200L);
        }
        gl.W2(getParentActivity(), this.classGuid);
        if (n0()) {
            gl.t1(this.fragmentView);
            gl.X2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                zkb.l(editTextBoldCursor, 30, bkb.k6, null);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.y == 0) {
            return;
        }
        w0();
    }

    public final boolean p0() {
        byte b = this.y;
        return (b == 1 && !this.E) || ((b == 2 || b == 3) && gba.q == 0);
    }

    public final /* synthetic */ void q0(hn7 hn7Var, int i) {
        int value = hn7Var.getValue();
        if (value == 0) {
            gba.x = 0;
        } else if (value == 1) {
            gba.x = 60;
        } else if (value == 2) {
            gba.x = kk7.W4;
        } else if (value == 3) {
            gba.x = 3600;
        } else if (value == 4) {
            gba.x = 18000;
        }
        this.b.g(i);
        y6c.h(this.currentAccount).u(false);
    }

    public final void r0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131751421, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131751420, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131751419, null), new im6(this, (byte) 23));
                hdVar.show();
                zkb.X((TextView) hdVar.c(-1), bkb.p7, null);
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
                    String M02 = k96.M0(2131753797, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hn7 hn7Var = new hn7(getParentActivity(), null);
                    hn7Var.setMinValue(0);
                    hn7Var.setMaxValue(4);
                    int i2 = gba.x;
                    if (i2 == 0) {
                        hn7Var.setValue(0);
                    } else if (i2 == 60) {
                        hn7Var.setValue(1);
                    } else if (i2 == 300) {
                        hn7Var.setValue(2);
                    } else if (i2 == 3600) {
                        hn7Var.setValue(3);
                    } else if (i2 == 18000) {
                        hn7Var.setValue(4);
                    }
                    hn7Var.setFormatter(new fi7((byte) 21));
                    alertDialog$Builder2.n(hn7Var);
                    alertDialog$Builder2.g(k96.M0(2131751342, null), new zf((Object) this, (Object) hn7Var, i, (byte) 10));
                    showDialog(hdVar2);
                    return;
                }
                return;
            }
            if (i == this.fingerprintRow) {
                gba.C = !gba.C;
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(gba.C);
                return;
            }
            if (i == this.O) {
                gba.z = !gba.z;
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(gba.z);
                kk7.e().k(kk7.m0, Boolean.FALSE);
                if (gba.z) {
                    return;
                }
                ij.r0(this, null, k96.M0(2131745652, null), null);
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
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(C.R());
                return;
            }
            if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean Q = C2.Q();
                boolean z2 = !Q;
                ra raVar = new ra(b, view, Q);
                g15 g15Var = C2.c;
                if (g15Var == null) {
                    raVar.a(Boolean.FALSE);
                } else {
                    g15.i.execute(new b61((Object) g15Var, g15Var.l(), z2, (Object) new hj3(raVar, (byte) 13), (byte) 1));
                }
            }
        }
    }

    public final void s0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (p0()) {
            for (sj2 sj2Var : this.n.f) {
                sj2Var.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        gl.B3(p0() ? 10.0f : 4.0f, p0() ? this.n : this.f, new ev7(this, (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        if (o0() && this.h.getText().length() == 0) {
            s0();
            return;
        }
        String code = p0() ? this.n.getCode() : this.h.getText().toString();
        byte b = this.y;
        Object[] objArr = 0;
        if (b == 1) {
            if (!this.G.equals(code)) {
                gl.S3(this.r, true);
                for (sj2 sj2Var : this.n.f) {
                    sj2Var.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                s0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ev7(this, (byte) 0));
                return;
            }
            boolean isEmpty = gba.r.isEmpty();
            try {
                gba.v = new byte[16];
                Utilities.b.nextBytes(gba.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(gba.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(gba.v, 0, bArr, bytes.length + 16, 16);
                gba.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            gba.z = true;
            gba.q = this.E ? 1 : 0;
            gba.x();
            this.h.clearFocus();
            gl.t1(this.h);
            for (sj2 sj2Var2 : this.n.f) {
                sj2Var2.clearFocus();
                gl.t1(sj2Var2);
            }
            this.w.setEditText(null);
            l0(new fv7(this, isEmpty, objArr == true ? 1 : 0));
            return;
        }
        if (b == 2 || b == 3) {
            long j = gba.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), k96.a0("TooManyTries", null, 2131743796, k96.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (sj2 sj2Var3 : this.n.f) {
                    sj2Var3.setText("");
                }
                this.h.setText("");
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
                return;
            }
            if (!gba.g(code)) {
                gba.r();
                this.h.setText("");
                for (sj2 sj2Var4 : this.n.f) {
                    sj2Var4.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
                return;
            }
            gba.u = 0;
            gba.x();
            this.h.clearFocus();
            gl.t1(this.h);
            for (sj2 sj2Var5 : this.n.f) {
                sj2Var5.clearFocus();
                gl.t1(sj2Var5);
            }
            this.w.setEditText(null);
            if (b == 3) {
                l0(new ev7(this, (byte) 1));
            } else {
                l0(new ev7(this, (byte) 2));
            }
        }
    }

    public final void u0() {
        if ((this.E && this.h.getText().length() == 0) || (!this.E && this.n.getCode().length() != 4)) {
            s0();
            return;
        }
        r7 r7Var = this.R;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        this.d.setText(k96.M0(2131751803, null));
        this.e.setText(gl.T2(k96.M0(2131747463, null)));
        this.G = p0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (sj2 sj2Var : this.n.f) {
            sj2Var.setText("");
        }
        w0();
        this.F = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0(boolean z, boolean z2) {
        if (z) {
            gl.t1(this.fragmentView);
            gl.X2(getParentActivity(), this.classGuid);
        } else {
            gl.z2(getParentActivity(), this.classGuid);
        }
        if (!z2) {
            this.w.setVisibility(z ? 0 : 8);
            this.w.setAlpha(z ? 1.0f : 0.0f);
            this.w.setTranslationY(z ? 0.0f : gl.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            r2 = 1.0f;
            r1 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(r2, r1).setDuration(150L);
        duration.setInterpolator(z ? s33.f : ls3.e);
        duration.addUpdateListener(new ni4(this, (byte) 28));
        duration.addListener(new id4((byte) 18, this, z));
        duration.start();
    }

    public final void w0() {
        if (p0()) {
            this.n.f[0].requestFocus();
            if (n0()) {
                return;
            }
            gl.F3(this.n.f[0]);
            return;
        }
        if (o0()) {
            this.h.requestFocus();
            gl.F3(this.h);
        }
    }

    public final void x0() {
        String charSequence;
        byte b = this.y;
        if (b == 2) {
            charSequence = k96.M0(2131751099, null);
        } else if (b == 3) {
            charSequence = k96.M0(2131742950, null);
        } else if (this.F) {
            charSequence = this.e.getCurrentView().getText().toString();
        } else {
            charSequence = k96.M0(!this.E ? 2131751695 : 2131751694, null);
        }
        byte b2 = 1;
        boolean z = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (b == 2) {
            this.e.a(k96.M0(2131751099, null), z, false);
        } else if (b == 3) {
            this.e.setText(k96.M0(2131742950, null));
        } else if (!this.F) {
            this.e.a(k96.M0(this.E ? 2131751694 : 2131751695, null), z, false);
        }
        if (p0()) {
            gl.U3(this.n, true, 1.0f, true, z);
            gl.U3(this.f, false, 1.0f, true, z);
        } else if (o0()) {
            gl.U3(this.n, false, 1.0f, true, z);
            gl.U3(this.f, true, 1.0f, true, z);
        }
        if (o0()) {
            fv7 fv7Var = new fv7(this, z, b2);
            this.U = fv7Var;
            gl.e3(fv7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        v0(n0(), z);
        w0();
    }

    public final void y0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = true;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new ej0(new dj0(org.telegram.messenger.a.b)).a(15) == 0) {
                Typeface typeface = gl.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().k4.n0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (g15.i(org.telegram.messenger.a.b)) {
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
