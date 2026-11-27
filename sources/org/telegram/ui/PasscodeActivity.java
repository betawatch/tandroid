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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public s7 R;
    public boolean S;
    public final ly7 T;
    public my7 U;
    public w56 V;
    public se4 W;
    public e29 a;
    private int autoLockRow;
    public t20 b;
    public d79 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public wmb e;
    public lu7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public bf6 n;
    public TextView r;
    public ImageView s;
    public k53 w;
    public zp4 x;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new ly7(this, (byte) 5);
        this.y = i;
    }

    public static org.telegram.ui.ActionBar.e m0() {
        return !xea.r.isEmpty() ? new PasscodeActivity(2) : new v8(6);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03db A[LOOP:0: B:54:0x03d9->B:55:0x03db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        b8 b8Var;
        zl5 zl5Var = new zl5(this, (byte) 17);
        jla jlaVar = this.simpleActionBar;
        byte b = 0;
        boolean z = false;
        boolean z2 = false;
        if (jlaVar != null) {
            jlaVar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(zl5Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(zl5Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        byte b2 = this.y;
        int i2 = 1;
        if (b2 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, tre.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        oy7 oy7Var = new oy7(this, context, frameLayout, b);
        byte b3 = 2;
        oy7Var.setDelegate(new yv0(this, b3));
        this.fragmentView = oy7Var;
        oy7Var.addView(frameLayout, tre.l(1.0f, -1, 0));
        k53 k53Var = new k53(context);
        this.w = k53Var;
        k53Var.setVisibility(n0() ? 0 : 8);
        oy7Var.addView(this.w, tre.o(-1, 230));
        if (b2 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(ob6.M0(2131747384, null));
            frameLayout2.setTag(Integer.valueOf(aob.a7));
            d79 d79Var = new d79(context, null);
            this.c = d79Var;
            d79Var.s1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new as((byte) 10, i2, z ? 1 : 0));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, tre.c(-1.0f, -1));
            d79 d79Var2 = this.c;
            t20 t20Var = new t20(this, context, (byte) 9);
            this.b = t20Var;
            d79Var2.setAdapter(t20Var);
            this.c.setOnItemClickListener(new zg4(this, (byte) 16));
        } else if (b2 == 1 || b2 == 2 || b2 == 3) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                yob.h(aob.d6, null, aVar);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                yob.l(this.actionBar, 1, aob.G6, null);
                yob.l(this.actionBar, 3, aob.u8, null);
                this.actionBar.setCastShadows(false);
                s6 u = this.actionBar.u();
                if (b2 == 1) {
                    s7 a = u.a(0, R.drawable.ic_ab_other);
                    this.R = a;
                    b8Var = a.e(1, R.drawable.msg_permissions, ob6.M0(2131747380, null));
                } else {
                    b8Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new py7(this, b8Var, z2 ? 1 : 0));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, tre.c(-1.0f, -1));
            e29 e29Var = new e29(context);
            this.a = e29Var;
            e29Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, jn7.E1, jn7.E1, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            e29 e29Var2 = this.a;
            if (!hl.M1()) {
                Point point = hl.q;
                if (point.x < point.y) {
                    i = 0;
                    e29Var2.setVisibility(i);
                    linearLayout.addView(this.a, tre.r(jn7.E1, jn7.E1, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i3 = aob.G6;
                    yob.X(textView, i3, null);
                    this.d.setTypeface(hl.o());
                    if (b2 != 1) {
                        boolean isEmpty = xea.r.isEmpty();
                        TextView textView2 = this.d;
                        if (isEmpty) {
                            textView2.setText(ob6.M0(2131751673, null));
                        } else {
                            textView2.setText(ob6.M0(2131751084, null));
                        }
                    } else {
                        this.d.setText(ob6.M0(2131751077, null));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, tre.t(-2, -2, 1, 0, 16, 0, 0));
                    wmb wmbVar = new wmb(context);
                    this.e = wmbVar;
                    wmbVar.setFactory(new qk3(context, b3));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, tre.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 14.0f);
                    byte b4 = 16;
                    yob.X(textView3, aob.Fi, null);
                    textView3.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
                    textView3.setGravity((!o0() ? 3 : 1) | 16);
                    textView3.setOnClickListener(new am7(context, (byte) 4));
                    textView3.setVisibility(b2 != 2 ? 0 : 8);
                    textView3.setText(ob6.M0(2131750553, null));
                    frameLayout2.addView(textView3, tre.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    ko9.e(textView3);
                    TextView textView4 = new TextView(context);
                    this.r = textView4;
                    textView4.setTextSize(1, 14.0f);
                    yob.X(this.r, aob.D6, null);
                    this.r.setText(ob6.M0(2131747379, null));
                    this.r.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
                    hl.T3(this.r, false, 1.0f, true, false);
                    frameLayout2.addView(this.r, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    lu7 lu7Var = new lu7(context, null);
                    this.f = lu7Var;
                    lu7Var.setText(ob6.M0(2131751081, null));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    yob.X(this.h, i3, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!ob6.a0 ? 5 : 3);
                    this.h.setSingleLine(true);
                    byte b5 = 6;
                    if (b2 != 1) {
                        this.F = false;
                        this.h.setImeOptions(5);
                    } else {
                        this.F = true;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    yob.v(this.h, aob.l6, null);
                    this.h.setCursorSize(hl.L(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int L = hl.L(16.0f);
                    this.h.setPadding(L, L, L, L);
                    this.h.setOnFocusChangeListener(new ts0(this, b4));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, tre.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    yob.s(this.s, aob.H6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i4 = aob.i6;
                    yob.R(imageView2, aob.f0(getThemedColor(i4), 1, -1), null, yob.M(i4), getResourceProvider());
                    hl.T3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new ry(this, atomicBoolean, b5));
                    this.s.setOnClickListener(new uv5(this, atomicBoolean, (byte) 14));
                    linearLayout2.addView(this.s, tre.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, tre.c(-2.0f, -1));
                    frameLayout3.addView(this.f, tre.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new j(this, (byte) 16));
                    this.h.addTextChangedListener(new qy7(this, (byte) 0));
                    this.h.setCustomSelectionActionModeCallback(new ry7((byte) 0));
                    bf6 bf6Var = new bf6((byte) 2, context, this);
                    this.n = bf6Var;
                    bf6Var.b(4, 10);
                    for (ok2 ok2Var : this.n.f) {
                        ok2Var.setShowSoftInputOnFocusCompat(!n0());
                        ok2Var.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        ok2Var.setTextSize(1, 24.0f);
                        ok2Var.addTextChangedListener(new qy7(this, (byte) 1));
                        ok2Var.setOnFocusChangeListener(new rt0(this, ok2Var, (byte) 3));
                    }
                    frameLayout3.addView(this.n, tre.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, tre.t(-1, -2, 1, 0, 32, 0, 72));
                    if (b2 == 1) {
                        frameLayout2.setTag(Integer.valueOf(aob.d6));
                    }
                    zp4 zp4Var = new zp4(this.resourceProvider, context, false);
                    this.x = zp4Var;
                    ko9.e(zp4Var);
                    frameLayout2.addView(this.x, tre.d(56, 56.0f, (ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.x.setOnClickListener(new am7(this, (byte) 5));
                    w2c w2cVar = new w2c(context);
                    w2cVar.setTransformType(1);
                    w2cVar.setProgress(0.0f);
                    w2cVar.setColor(aob.w0(null, aob.O9, false));
                    w2cVar.setDrawBackground(false);
                    this.x.setContentDescription(ob6.M0(2131747981, null));
                    this.x.addView(w2cVar, tre.e(56, 56, 17));
                    zp4 zp4Var2 = this.x;
                    zp4Var2.a(zp4Var2);
                    y0();
                }
            }
            i = 8;
            e29Var2.setVisibility(i);
            linearLayout.addView(this.a, tre.r(jn7.E1, jn7.E1, 1));
            TextView textView5 = new TextView(context);
            this.d = textView5;
            int i32 = aob.G6;
            yob.X(textView5, i32, null);
            this.d.setTypeface(hl.o());
            if (b2 != 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, tre.t(-2, -2, 1, 0, 16, 0, 0));
            wmb wmbVar2 = new wmb(context);
            this.e = wmbVar2;
            wmbVar2.setFactory(new qk3(context, b3));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, tre.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView32 = new TextView(context);
            textView32.setTextSize(1, 14.0f);
            byte b42 = 16;
            yob.X(textView32, aob.Fi, null);
            textView32.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
            textView32.setGravity((!o0() ? 3 : 1) | 16);
            textView32.setOnClickListener(new am7(context, (byte) 4));
            textView32.setVisibility(b2 != 2 ? 0 : 8);
            textView32.setText(ob6.M0(2131750553, null));
            frameLayout2.addView(textView32, tre.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            ko9.e(textView32);
            TextView textView42 = new TextView(context);
            this.r = textView42;
            textView42.setTextSize(1, 14.0f);
            yob.X(this.r, aob.D6, null);
            this.r.setText(ob6.M0(2131747379, null));
            this.r.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
            hl.T3(this.r, false, 1.0f, true, false);
            frameLayout2.addView(this.r, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            lu7 lu7Var2 = new lu7(context, null);
            this.f = lu7Var2;
            lu7Var2.setText(ob6.M0(2131751081, null));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            yob.X(this.h, i32, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!ob6.a0 ? 5 : 3);
            this.h.setSingleLine(true);
            byte b52 = 6;
            if (b2 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            yob.v(this.h, aob.l6, null);
            this.h.setCursorSize(hl.L(20.0f));
            this.h.setCursorWidth(1.5f);
            int L2 = hl.L(16.0f);
            this.h.setPadding(L2, L2, L2, L2);
            this.h.setOnFocusChangeListener(new ts0(this, b42));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, tre.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            yob.s(this.s, aob.H6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i42 = aob.i6;
            yob.R(imageView22, aob.f0(getThemedColor(i42), 1, -1), null, yob.M(i42), getResourceProvider());
            hl.T3(this.s, (b2 == 1 || this.F) ? false : true, 0.1f, true, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new ry(this, atomicBoolean2, b52));
            this.s.setOnClickListener(new uv5(this, atomicBoolean2, (byte) 14));
            linearLayout22.addView(this.s, tre.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, tre.c(-2.0f, -1));
            frameLayout3.addView(this.f, tre.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new j(this, (byte) 16));
            this.h.addTextChangedListener(new qy7(this, (byte) 0));
            this.h.setCustomSelectionActionModeCallback(new ry7((byte) 0));
            bf6 bf6Var2 = new bf6((byte) 2, context, this);
            this.n = bf6Var2;
            bf6Var2.b(4, 10);
            while (r10 < r7) {
            }
            frameLayout3.addView(this.n, tre.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, tre.t(-1, -2, 1, 0, 32, 0, 72));
            if (b2 == 1) {
            }
            zp4 zp4Var3 = new zp4(this.resourceProvider, context, false);
            this.x = zp4Var3;
            ko9.e(zp4Var3);
            frameLayout2.addView(this.x, tre.d(56, 56.0f, (ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.x.setOnClickListener(new am7(this, (byte) 5));
            w2c w2cVar2 = new w2c(context);
            w2cVar2.setTransformType(1);
            w2cVar2.setProgress(0.0f);
            w2cVar2.setColor(aob.w0(null, aob.O9, false));
            w2cVar2.setDrawBackground(false);
            this.x.setContentDescription(ob6.M0(2131747981, null));
            this.x.addView(w2cVar2, tre.e(56, 56, 17));
            zp4 zp4Var22 = this.x;
            zp4Var22.a(zp4Var22);
            y0();
        }
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                z0();
                t20 t20Var = this.b;
                if (t20Var != null) {
                    t20Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        if (this.y != 0) {
            arrayList.add(new apb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        }
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
        arrayList.add(new apb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        arrayList.add(new apb(this.c, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.c, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.e
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
            bf6 bf6Var = this.n;
            ok2[] ok2VarArr = bf6Var.f;
            if (i >= ok2VarArr.length) {
                bf6Var.postDelayed(new pl7(this, runnable, (byte) 15), (ok2VarArr.length * 75) + 350);
                return;
            } else {
                ok2 ok2Var = ok2VarArr[i];
                ok2Var.postDelayed(new ny7(ok2Var, (byte) 0), i * 75);
                i++;
            }
        }
    }

    public final boolean n0() {
        if (!p0() || this.y == 0 || hl.O1()) {
            return false;
        }
        Point point = hl.q;
        return point.x < point.y && !hl.A1();
    }

    public final boolean o0() {
        byte b = this.y;
        return (b == 1 && this.E) || ((b == 2 || b == 3) && xea.q == 1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        ok2[] ok2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        w0(n0(), false);
        e29 e29Var = this.a;
        if (e29Var != null) {
            if (!hl.M1()) {
                Point point = hl.q;
                if (point.x < point.y) {
                    i = 0;
                    e29Var.setVisibility(i);
                }
            }
            i = 8;
            e29Var.setVisibility(i);
        }
        bf6 bf6Var = this.n;
        if (bf6Var == null || (ok2VarArr = bf6Var.f) == null) {
            return;
        }
        for (ok2 ok2Var : ok2VarArr) {
            ok2Var.setShowSoftInputOnFocusCompat(!n0());
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        if (this.y != 0) {
            return true;
        }
        jn7.e().b(this, jn7.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            jn7.e().n(this, jn7.n0);
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        hl.z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.b;
        if (t20Var != null) {
            t20Var.f();
        }
        if (this.y != 0 && !n0()) {
            hl.d3(new ly7(this, (byte) 6), 200L);
        }
        hl.V2(getParentActivity(), this.classGuid);
        if (n0()) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                yob.l(editTextBoldCursor, 30, aob.l6, null);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.y == 0) {
            return;
        }
        x0();
    }

    public final boolean p0() {
        byte b = this.y;
        return (b == 1 && !this.E) || ((b == 2 || b == 3) && xea.q == 0);
    }

    public final /* synthetic */ void q0(hq7 hq7Var, int i) {
        int value = hq7Var.getValue();
        if (value == 0) {
            xea.x = 0;
        } else if (value == 1) {
            xea.x = 60;
        } else if (value == 2) {
            xea.x = jn7.W4;
        } else if (value == 3) {
            xea.x = 3600;
        } else if (value == 4) {
            xea.x = 18000;
        }
        this.b.g(i);
        yac.h(this.currentAccount).u(false);
    }

    public final void r0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131751398, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131751397, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131751396, null), new bm6(this, (byte) 28));
                idVar.show();
                yob.X((TextView) idVar.c(-1), aob.q7, null);
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
                    String M02 = ob6.M0(2131753793, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M02;
                    hq7 hq7Var = new hq7(getParentActivity(), null);
                    hq7Var.setMinValue(0);
                    hq7Var.setMaxValue(4);
                    int i2 = xea.x;
                    if (i2 == 0) {
                        hq7Var.setValue(0);
                    } else if (i2 == 60) {
                        hq7Var.setValue(1);
                    } else if (i2 == 300) {
                        hq7Var.setValue(2);
                    } else if (i2 == 3600) {
                        hq7Var.setValue(3);
                    } else if (i2 == 18000) {
                        hq7Var.setValue(4);
                    }
                    hq7Var.setFormatter(new ku7((byte) 9));
                    alertDialog$Builder2.n(hq7Var);
                    alertDialog$Builder2.g(ob6.M0(2131751319, null), new bf((Object) this, (Object) hq7Var, i, (byte) 12));
                    showDialog(idVar2);
                    return;
                }
                return;
            }
            if (i == this.fingerprintRow) {
                xea.C = !xea.C;
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(xea.C);
                return;
            }
            if (i == this.O) {
                xea.z = !xea.z;
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(xea.z);
                jn7.e().k(jn7.n0, Boolean.FALSE);
                if (xea.z) {
                    return;
                }
                jj.r0(this, null, ob6.M0(2131745572, null), null);
                return;
            }
            if (i == this.K) {
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean z = !C.S();
                if (C.m != z) {
                    C.m = z;
                    try {
                        org.telegram.ui.Wallet.c.B().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", C.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.c.n("failed to save prefs", e);
                    }
                }
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(C.S());
                return;
            }
            if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean R = C2.R();
                boolean z2 = !R;
                sa saVar = new sa(b, view, R);
                k35 k35Var = C2.c;
                if (k35Var == null) {
                    saVar.a(Boolean.FALSE);
                } else {
                    k35.i.execute(new j61((Object) k35Var, k35Var.l(), z2, (Object) new zj3(saVar, (byte) 13), (byte) 1));
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
            for (ok2 ok2Var : this.n.f) {
                ok2Var.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        hl.A3(p0() ? 10.0f : 4.0f, p0() ? this.n : this.f, new ly7(this, (byte) 3));
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
                hl.R3(this.r, true);
                for (ok2 ok2Var : this.n.f) {
                    ok2Var.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                s0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ly7(this, (byte) 0));
                return;
            }
            boolean isEmpty = xea.r.isEmpty();
            try {
                xea.v = new byte[16];
                Utilities.b.nextBytes(xea.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(xea.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(xea.v, 0, bArr, bytes.length + 16, 16);
                xea.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            xea.z = true;
            xea.q = this.E ? 1 : 0;
            xea.x();
            this.h.clearFocus();
            hl.t1(this.h);
            for (ok2 ok2Var2 : this.n.f) {
                ok2Var2.clearFocus();
                hl.t1(ok2Var2);
            }
            this.w.setEditText(null);
            l0(new my7(this, isEmpty, objArr == true ? 1 : 0));
            return;
        }
        if (b == 2 || b == 3) {
            long j = xea.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), ob6.a0("TooManyTries", null, 2131743690, ob6.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (ok2 ok2Var3 : this.n.f) {
                    ok2Var3.setText("");
                }
                this.h.setText("");
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
                return;
            }
            if (!xea.g(code)) {
                xea.r();
                this.h.setText("");
                for (ok2 ok2Var4 : this.n.f) {
                    ok2Var4.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
                return;
            }
            xea.u = 0;
            xea.x();
            this.h.clearFocus();
            hl.t1(this.h);
            for (ok2 ok2Var5 : this.n.f) {
                ok2Var5.clearFocus();
                hl.t1(ok2Var5);
            }
            this.w.setEditText(null);
            if (b == 3) {
                l0(new ly7(this, (byte) 1));
            } else {
                l0(new ly7(this, (byte) 2));
            }
        }
    }

    public final void u0() {
        if ((this.E && this.h.getText().length() == 0) || (!this.E && this.n.getCode().length() != 4)) {
            s0();
            return;
        }
        s7 s7Var = this.R;
        if (s7Var != null) {
            s7Var.setVisibility(8);
        }
        this.d.setText(ob6.M0(2131751780, null));
        this.e.setText(hl.S2(ob6.M0(2131747383, null)));
        this.G = p0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (ok2 ok2Var : this.n.f) {
            ok2Var.setText("");
        }
        x0();
        this.F = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void w0(boolean z, boolean z2) {
        if (z) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        } else {
            hl.z2(getParentActivity(), this.classGuid);
        }
        if (!z2) {
            this.w.setVisibility(z ? 0 : 8);
            this.w.setAlpha(z ? 1.0f : 0.0f);
            this.w.setTranslationY(z ? 0.0f : hl.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            r2 = 1.0f;
            r1 = 0.0f;
        }
        byte b = 1;
        ValueAnimator duration = ValueAnimator.ofFloat(r2, r1).setDuration(150L);
        duration.setInterpolator(z ? k43.f : dt3.e);
        duration.addUpdateListener(new pv7(this, b));
        duration.addListener(new gf4((byte) 18, this, z));
        duration.start();
    }

    public final void x0() {
        if (p0()) {
            this.n.f[0].requestFocus();
            if (n0()) {
                return;
            }
            hl.E3(this.n.f[0]);
            return;
        }
        if (o0()) {
            this.h.requestFocus();
            hl.E3(this.h);
        }
    }

    public final void y0() {
        String charSequence;
        byte b = this.y;
        if (b == 2) {
            charSequence = ob6.M0(2131751076, null);
        } else if (b == 3) {
            charSequence = ob6.M0(2131742844, null);
        } else if (this.F) {
            charSequence = this.e.getCurrentView().getText().toString();
        } else {
            charSequence = ob6.M0(!this.E ? 2131751672 : 2131751671, null);
        }
        byte b2 = 1;
        boolean z = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (b == 2) {
            this.e.a(ob6.M0(2131751076, null), z, false);
        } else if (b == 3) {
            this.e.setText(ob6.M0(2131742844, null));
        } else if (!this.F) {
            this.e.a(ob6.M0(this.E ? 2131751671 : 2131751672, null), z, false);
        }
        if (p0()) {
            hl.T3(this.n, true, 1.0f, true, z);
            hl.T3(this.f, false, 1.0f, true, z);
        } else if (o0()) {
            hl.T3(this.n, false, 1.0f, true, z);
            hl.T3(this.f, true, 1.0f, true, z);
        }
        if (o0()) {
            my7 my7Var = new my7(this, z, b2);
            this.U = my7Var;
            hl.d3(my7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        w0(n0(), z);
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
            if (new fj0(new ej0(org.telegram.messenger.a.b, (byte) 0)).a(15) == 0) {
                Typeface typeface = hl.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().k4.v0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (k35.i(org.telegram.messenger.a.b)) {
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
