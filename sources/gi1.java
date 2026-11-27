// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gi1 extends e implements fn7, yn5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public mf5 I;
    public EditTextBoldCursor J;
    public boolean K;
    public b29 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public i56 R;
    public h29 S;
    public h29 T;
    public ilb U;
    public TextView V;
    public te1 W;
    public mf5 X;
    public int Y;
    public String Z;
    public s7 a;
    public z21 a0;
    public e43 b;
    public boolean b0;
    public di2 c;
    public boolean c0;
    public iu3 d;
    public boolean d0;
    public rca e;
    public TLRPC.TL_chatInviteExported e0;
    public mb0 f;
    public boolean f0;
    public ilb g0;
    public a81 h;
    public final ArrayList h0;
    public ua6 i0;
    public final int j0;
    public final long k0;
    public boolean l0;
    public final Boolean m0;
    public di1 n;
    public TLRPC.InputFile n0;
    public TLRPC.InputFile o0;
    public TLRPC.VideoSize p0;
    public String q0;
    public AnimatorSet r;
    public double r0;
    public ei1 s;
    public boolean s0;
    public boolean t0;
    public Integer u0;
    public icc v0;
    public final rb0 w;
    public id w0;
    public final zn5 x;
    public final xh1 x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public gi1(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        byte b = 1;
        this.l0 = true;
        byte b2 = 0;
        this.x0 = new xh1(this, b2);
        int i = bundle.getInt("step", 0);
        this.j0 = i;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i == 0) {
            this.w = new rb0((vnb) null);
            this.x = new zn5(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new zh1(this, b));
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z;
            this.c0 = !z;
            if (!z && !this.f0) {
                this.f0 = true;
                m0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new zh1(this, b2));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    @Override // yn5
    public final void H(float f) {
        ei1 ei1Var = this.s;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(f);
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        ei1 ei1Var = this.s;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(0.0f);
    }

    @Override // yn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1((e) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 0));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void c0() {
        int w0 = aob.w0(null, aob.U7, false) + ((aob.w0(null, aob.T7, false) + ((aob.w0(null, aob.S7, false) + ((aob.w0(null, aob.R7, false) + ((aob.w0(null, aob.Q7, false) + ((aob.w0(null, aob.P7, false) + ((aob.w0(null, aob.O7, false) + (aob.w0(null, aob.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (w0 != this.z0) {
            this.z0 = w0;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.N.getChildAt(i);
                    if (childAt instanceof kb) {
                        kb kbVar = (kb) childAt;
                        kbVar.d.p(kbVar.f);
                        kbVar.a.invalidate();
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        int i;
        final gi1 gi1Var = this;
        iu3 iu3Var = gi1Var.d;
        if (iu3Var != null) {
            iu3Var.o();
        }
        gi1Var.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        gi1Var.actionBar.setAllowOverlayTitle(true);
        gi1Var.actionBar.setActionBarMenuOnItemClick(new s8(gi1Var, (byte) 22));
        s6 u = gi1Var.actionBar.u();
        Drawable e = c00.e(context, R.drawable.ic_ab_done);
        int i2 = aob.v8;
        final byte b2 = 0;
        int w0 = aob.w0(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        e.setColorFilter(new PorterDuffColorFilter(w0, mode));
        di2 di2Var = new di2(aob.w0(null, i2, false));
        gi1Var.c = di2Var;
        e43 e43Var = new e43(e, di2Var);
        gi1Var.b = e43Var;
        int L = hl.L(56.0f);
        String M0 = ob6.M0(2131751319, null);
        boolean z = u.c;
        a aVar = u.b;
        s7 c = u.c(1, 0, null, z ? aVar.r0 : aVar.q0, e43Var, L, M0, null);
        gi1Var.a = c;
        yob.x(c, e, i2, null, mode);
        byte b3 = 2;
        int i3 = gi1Var.j0;
        if (i3 == 0) {
            gi1Var.actionBar.setTitle(ob6.M0(2131748040, null));
            iy0 iy0Var = new iy0(gi1Var, context, b);
            iy0Var.setOnTouchListener(new q8((byte) 26));
            gi1Var.fragmentView = iy0Var;
            int i4 = aob.d6;
            iy0Var.setTag(Integer.valueOf(i4));
            yob.h(i4, null, gi1Var.fragmentView);
            LinearLayout linearLayout = new LinearLayout(context);
            gi1Var.M = linearLayout;
            linearLayout.setOrientation(1);
            iy0Var.addView(gi1Var.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            gi1Var.M.addView(frameLayout, tre.o(-1, -2));
            mb0 mb0Var = new mb0(b3, context, gi1Var);
            gi1Var.f = mb0Var;
            mb0Var.setRoundRadius(hl.L(32.0f));
            rb0 rb0Var = gi1Var.w;
            rb0Var.j(5L, null, null, null);
            gi1Var.f.setImageDrawable(rb0Var);
            mb0 mb0Var2 = gi1Var.f;
            boolean z2 = ob6.a0;
            frameLayout.addView(mb0Var2, tre.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            a81 a81Var = new a81(gi1Var, context, paint, b);
            gi1Var.h = a81Var;
            a81Var.setContentDescription(ob6.M0(2131752177, null));
            a81 a81Var2 = gi1Var.h;
            boolean z3 = ob6.a0;
            frameLayout.addView(a81Var2, tre.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 12.0f));
            gi1Var.h.setOnClickListener(new ai1(gi1Var, b));
            gi1Var.L = new b29(R.raw.camera, hl.L(60.0f), hl.L(60.0f), false, null);
            di1 di1Var = new di1(b2, context, gi1Var);
            gi1Var.n = di1Var;
            di1Var.setScaleType(ImageView.ScaleType.CENTER);
            gi1Var.n.setAnimation(gi1Var.L);
            gi1Var.n.setEnabled(false);
            gi1Var.n.setClickable(false);
            gi1Var.n.setPadding(hl.L(0.0f), 0, 0, hl.L(1.0f));
            di1 di1Var2 = gi1Var.n;
            boolean z4 = ob6.a0;
            frameLayout.addView(di1Var2, tre.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 15.0f, 12.0f, z4 ? 15.0f : 0.0f, 12.0f));
            ei1 ei1Var = new ei1(gi1Var, context, b2);
            gi1Var.s = ei1Var;
            ei1Var.setSize(hl.L(30.0f));
            gi1Var.s.setProgressColor(-1);
            gi1Var.s.setNoProgress(false);
            ei1 ei1Var2 = gi1Var.s;
            boolean z5 = ob6.a0;
            frameLayout.addView(ei1Var2, tre.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 12.0f));
            gi1Var.i0(false, false);
            iu3 iu3Var2 = new iu3(context, iy0Var, gi1Var, 0, false, null);
            gi1Var = gi1Var;
            gi1Var.d = iu3Var2;
            iu3Var2.setHint(ob6.M0(2131751089, null));
            String str = gi1Var.G;
            if (str != null) {
                gi1Var.d.setText(str);
                gi1Var.G = null;
            }
            gi1Var.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            gi1Var.d.getEditText().setSingleLine(true);
            gi1Var.d.getEditText().setImeOptions(5);
            gi1Var.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(gi1Var) { // from class: bi1
                public final /* synthetic */ gi1 b;

                {
                    this.b = gi1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    s7 s7Var;
                    byte b4 = b2;
                    gi1 gi1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i5 == 5 && !TextUtils.isEmpty(gi1Var2.d.getEditText().getText())) {
                                gi1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i5 == 6 && (s7Var = gi1Var2.a) != null) {
                                s7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            iu3 iu3Var3 = gi1Var.d;
            boolean z6 = ob6.a0;
            frameLayout.addView(iu3Var3, tre.d(-1, -2.0f, 16, z6 ? 5.0f : 96.0f, 0.0f, z6 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            gi1Var.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            yob.D(gi1Var.y, aob.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = gi1Var.y;
            int i5 = aob.G6;
            yob.X(editTextBoldCursor2, i5, null);
            gi1Var.y.setBackgroundDrawable(null);
            yob.F(gi1Var.y, aob.k6, aob.l6, aob.p7, gi1Var.getResourceProvider());
            gi1Var.y.setPadding(0, 0, 0, hl.L(6.0f));
            gi1Var.y.setGravity(ob6.a0 ? 5 : 3);
            gi1Var.y.setInputType(180225);
            gi1Var.y.setImeOptions(6);
            gi1Var.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(jn7.E1)});
            gi1Var.y.setHint(ob6.M0(2131751424, null));
            yob.v(gi1Var.y, i5, null);
            gi1Var.y.setCursorSize(hl.L(20.0f));
            gi1Var.y.setCursorWidth(1.5f);
            gi1Var.M.addView(gi1Var.y, tre.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            gi1Var.y.setOnEditorActionListener(new TextView.OnEditorActionListener(gi1Var) { // from class: bi1
                public final /* synthetic */ gi1 b;

                {
                    this.b = gi1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i52, KeyEvent keyEvent) {
                    s7 s7Var;
                    byte b4 = b;
                    gi1 gi1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i52 == 5 && !TextUtils.isEmpty(gi1Var2.d.getEditText().getText())) {
                                gi1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i52 == 6 && (s7Var = gi1Var2.a) != null) {
                                s7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            gi1Var.y.addTextChangedListener(new fi1(b2));
            TextView textView = new TextView(context);
            gi1Var.V = textView;
            textView.setTextSize(1, 15.0f);
            yob.X(gi1Var.V, aob.F6, null);
            gi1Var.V.setGravity(ob6.a0 ? 5 : 3);
            gi1Var.V.setText(ob6.M0(2131751427, null));
            gi1Var.M.addView(gi1Var.V, tre.t(-2, -2, ob6.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i3 == 1) {
            ScrollView scrollView = new ScrollView(context);
            gi1Var.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            gi1Var.M = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(gi1Var.M, new FrameLayout.LayoutParams(-1, -2));
            uc7 messagesController = gi1Var.getMessagesController();
            long j = gi1Var.k0;
            TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j));
            boolean z7 = M02 != null && (!xc2.T(M02) || xc2.n0(M02));
            gi1Var.K = z7;
            gi1Var.actionBar.setTitle(ob6.M0(z7 ? 2131749154 : 2131752263, null));
            View view = gi1Var.fragmentView;
            int i6 = aob.a7;
            view.setTag(Integer.valueOf(i6));
            yob.h(i6, null, gi1Var.fragmentView);
            mf5 mf5Var = new mf5(context, 23);
            gi1Var.I = mf5Var;
            mf5Var.setHeight(46);
            mf5 mf5Var2 = gi1Var.I;
            int i7 = aob.d6;
            yob.h(i7, null, mf5Var2);
            gi1Var.I.setText(ob6.M0(gi1Var.K ? 2131749145 : 2131752241, null));
            gi1Var.M.addView(gi1Var.I);
            LinearLayout linearLayout3 = new LinearLayout(context);
            gi1Var.H = linearLayout3;
            linearLayout3.setOrientation(1);
            yob.h(i7, null, gi1Var.H);
            gi1Var.M.addView(gi1Var.H, tre.o(-1, -2));
            h29 h29Var = new h29(context, false);
            gi1Var.S = h29Var;
            hf0 L0 = aob.L0(false);
            int i8 = aob.i6;
            uob M = yob.M(i8);
            h29Var.setBackground(L0);
            yob.j(h29Var, L0, null, M, null);
            Boolean bool = gi1Var.m0;
            if (bool != null && !bool.booleanValue()) {
                gi1Var.c0 = true;
            }
            boolean z8 = gi1Var.K;
            h29 h29Var2 = gi1Var.S;
            if (z8) {
                i = 1;
                h29Var2.b(ob6.M0(2131748392, null), ob6.M0(2131748391, null), false, !gi1Var.c0);
            } else {
                i = 1;
                h29Var2.b(ob6.M0(2131752288, null), ob6.M0(2131752285, null), false, !gi1Var.c0);
            }
            gi1Var.S.setOnClickListener(new ai1(gi1Var, b3));
            if (bool == null || bool.booleanValue()) {
                gi1Var.H.addView(gi1Var.S, tre.o(-1, -2));
            }
            h29 h29Var3 = new h29(context, false);
            gi1Var.T = h29Var3;
            hf0 L02 = aob.L0(false);
            uob M2 = yob.M(i8);
            h29Var3.setBackground(L02);
            yob.j(h29Var3, L02, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                gi1Var.c0 = false;
            }
            boolean z9 = gi1Var.K;
            h29 h29Var4 = gi1Var.T;
            if (z9) {
                h29Var4.b(ob6.M0(2131748395, null), ob6.M0(2131748394, null), false, gi1Var.c0);
            } else {
                h29Var4.b(ob6.M0(2131752299, null), ob6.M0(2131752298, null), false, gi1Var.c0);
            }
            gi1Var.T.setOnClickListener(new ai1(gi1Var, (byte) 3));
            if (bool == null || !bool.booleanValue()) {
                gi1Var.H.addView(gi1Var.T, tre.o(-1, -2));
            }
            rca rcaVar = new rca(context, (uh9) null);
            gi1Var.e = rcaVar;
            gi1Var.M.addView(rcaVar, tre.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            gi1Var.O = linearLayout4;
            linearLayout4.setOrientation(i);
            yob.h(i7, null, gi1Var.O);
            gi1Var.M.addView(gi1Var.O, tre.o(-1, -2));
            mf5 mf5Var3 = new mf5(context);
            gi1Var.X = mf5Var3;
            gi1Var.O.addView(mf5Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            gi1Var.P = linearLayout5;
            linearLayout5.setOrientation(0);
            gi1Var.O.addView(gi1Var.P, tre.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            gi1Var.J = editTextBoldCursor3;
            editTextBoldCursor3.setText(uc7.s1(gi1Var.currentAccount).N2 + "/");
            gi1Var.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = gi1Var.J;
            int i9 = aob.H6;
            yob.D(editTextBoldCursor4, i9, null);
            EditTextBoldCursor editTextBoldCursor5 = gi1Var.J;
            int i10 = aob.G6;
            yob.X(editTextBoldCursor5, i10, null);
            gi1Var.J.setMaxLines(1);
            gi1Var.J.setLines(1);
            gi1Var.J.setEnabled(false);
            gi1Var.J.setBackgroundDrawable(null);
            gi1Var.J.setPadding(0, 0, 0, 0);
            gi1Var.J.setSingleLine(true);
            gi1Var.J.setInputType(163840);
            gi1Var.J.setImeOptions(6);
            gi1Var.P.addView(gi1Var.J, tre.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            gi1Var.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            yob.D(gi1Var.y, i9, null);
            yob.X(gi1Var.y, i10, null);
            gi1Var.y.setMaxLines(1);
            gi1Var.y.setLines(1);
            gi1Var.y.setBackgroundDrawable(null);
            gi1Var.y.setPadding(0, 0, 0, 0);
            gi1Var.y.setSingleLine(true);
            gi1Var.y.setInputType(163872);
            gi1Var.y.setImeOptions(6);
            gi1Var.y.setHint(ob6.M0(2131752231, null));
            yob.v(gi1Var.y, i10, null);
            gi1Var.y.setCursorSize(hl.L(20.0f));
            gi1Var.y.setCursorWidth(1.5f);
            gi1Var.P.addView(gi1Var.y, tre.o(-1, 36));
            gi1Var.y.addTextChangedListener(new c7(gi1Var, (byte) 6));
            LinearLayout linearLayout6 = new LinearLayout(context);
            gi1Var.Q = linearLayout6;
            linearLayout6.setOrientation(1);
            gi1Var.O.addView(gi1Var.Q, tre.o(-1, -2));
            i56 i56Var = new i56(context, gi1Var, null, true, xc2.T(gi1Var.getMessagesController().M0(Long.valueOf(j))));
            gi1Var.R = i56Var;
            i56Var.b(true);
            gi1Var.R.d(0, null, false);
            gi1Var.Q.addView(gi1Var.R);
            te1 te1Var = new te1((byte) 1, context, (Object) gi1Var);
            gi1Var.W = te1Var;
            yob.G(te1Var, aob.J6, null);
            yob.C(gi1Var.W, aob.K6, null);
            gi1Var.W.setTextSize(1, 15.0f);
            gi1Var.W.setGravity(ob6.a0 ? 5 : 3);
            gi1Var.W.setVisibility(8);
            gi1Var.W.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
            gi1Var.O.addView(gi1Var.W, tre.t(-2, -2, ob6.a0 ? 5 : 3, 18, 3, 18, 7));
            ilb ilbVar = new ilb(context);
            gi1Var.U = ilbVar;
            int i11 = aob.b7;
            yob.Z(ilbVar, context, R.drawable.greydivider_bottom, i11);
            gi1Var.M.addView(gi1Var.U, tre.o(-1, -2));
            ua6 ua6Var = new ua6(context);
            gi1Var.i0 = ua6Var;
            gi1Var.M.addView(ua6Var, tre.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            gi1Var.N = linearLayout7;
            yob.h(i7, null, linearLayout7);
            gi1Var.N.setOrientation(1);
            gi1Var.M.addView(gi1Var.N, tre.o(-1, -2));
            ilb ilbVar2 = new ilb(context);
            gi1Var.g0 = ilbVar2;
            yob.Z(ilbVar2, context, R.drawable.greydivider_bottom, i11);
            gi1Var.M.addView(gi1Var.g0, tre.o(-1, -2));
            gi1Var.m0();
        }
        return gi1Var.fragmentView;
    }

    public final void d0(String str) {
        if (str == null || str.length() <= 0) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
        }
        z21 z21Var = this.a0;
        if (z21Var != null) {
            hl.r(z21Var);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.W.setText(ob6.M0(2131748663, null));
                te1 te1Var = this.W;
                int i = aob.p7;
                te1Var.setTag(Integer.valueOf(i));
                yob.X(this.W, i, null);
                return;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt >= '0' && charAt <= '9') {
                    this.W.setText(ob6.M0(2131748659, null));
                    te1 te1Var2 = this.W;
                    int i3 = aob.p7;
                    te1Var2.setTag(Integer.valueOf(i3));
                    yob.X(this.W, i3, null);
                    return;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.W.setText(ob6.M0(2131748663, null));
                    te1 te1Var3 = this.W;
                    int i4 = aob.p7;
                    te1Var3.setTag(Integer.valueOf(i4));
                    yob.X(this.W, i4, null);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.W.setText(ob6.M0(2131748661, null));
            te1 te1Var4 = this.W;
            int i5 = aob.p7;
            te1Var4.setTag(Integer.valueOf(i5));
            yob.X(this.W, i5, null);
            return;
        }
        int length = str.length();
        te1 te1Var5 = this.W;
        if (length > 32) {
            te1Var5.setText(ob6.M0(2131748662, null));
            te1 te1Var6 = this.W;
            int i6 = aob.p7;
            te1Var6.setTag(Integer.valueOf(i6));
            yob.X(this.W, i6, null);
            return;
        }
        te1Var5.setText(ob6.M0(2131748676, null));
        te1 te1Var7 = this.W;
        int i7 = aob.F6;
        te1Var7.setTag(Integer.valueOf(i7));
        yob.X(this.W, i7, null);
        this.Z = str;
        z21 z21Var2 = new z21(this, str, (byte) 27);
        this.a0 = z21Var2;
        hl.d3(z21Var2, 300L);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.S) {
            id idVar = this.w0;
            if (idVar != null) {
                try {
                    idVar.dismiss();
                    this.w0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            l0(false);
            this.t0 = false;
            return;
        }
        if (i == jn7.R) {
            id idVar2 = this.w0;
            if (idVar2 != null) {
                try {
                    idVar2.dismiss();
                    this.w0 = null;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.n0 != null || this.o0 != null || this.p0 != null) {
                uc7.s1(this.currentAccount).z(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            gi1 gi1Var = new gi1(bundle);
            gi1Var.v0 = this.v0;
            presentFragment(gi1Var, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void dismissCurrentDialog() {
        zn5 zn5Var = this.x;
        if (zn5Var == null || !zn5Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        zn5 zn5Var = this.x;
        return (zn5Var == null || dialog != zn5Var.c) && super.dismissDialogOnPause(dialog);
    }

    public final /* synthetic */ void e0(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = uc7.s1(this.currentAccount).h1(this.k0);
        this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new fn0((Object) this, (Object) str, (Object) tL_channels_checkUsername, (byte) 14), 2);
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    public final /* synthetic */ void f0(TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = uc7.i1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new zh1(this, (byte) 2), 64);
    }

    public final void g0(View view) {
        TLRPC.Chat currentChannel = ((kb) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(R.string.AppName, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        boolean z = currentChannel.megagroup;
        int i = this.currentAccount;
        if (z) {
            idVar.U = hl.S2(ob6.a0("RevokeLinkAlert", null, 2131745749, uc7.s1(i).N2 + "/" + xc2.K(currentChannel, false), currentChannel.title));
        } else {
            idVar.U = hl.S2(ob6.a0("RevokeLinkAlertChannel", null, 2131745748, uc7.s1(i).N2 + "/" + xc2.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131745751, null), new h01((Object) this, (Object) currentChannel, (byte) 10));
        showDialog(idVar);
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        iu3 iu3Var = this.d;
        int i = aob.k6;
        arrayList.add(new apb(iu3Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        iu3 iu3Var2 = this.d;
        int i2 = aob.l6;
        arrayList.add(new apb(iu3Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.b7));
        LinearLayout linearLayout = this.Q;
        int i3 = aob.i6;
        arrayList.add(new apb(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.i0, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        return arrayList;
    }

    public final /* synthetic */ void h0(id idVar) {
        this.t0 = false;
        this.s0 = false;
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        l0(false);
        idVar.dismiss();
    }

    public final void i0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (!z2) {
            di1 di1Var = this.n;
            if (z) {
                di1Var.setAlpha(1.0f);
                this.n.setVisibility(4);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            di1Var.setAlpha(1.0f);
            this.n.setVisibility(0);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        this.r = new AnimatorSet();
        if (z) {
            this.s.setVisibility(0);
            AnimatorSet animatorSet2 = this.r;
            di1 di1Var2 = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(di1Var2, (Property<di1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<ei1, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            di1 di1Var3 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(di1Var3, (Property<di1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<ei1, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new z7((byte) 13, (Object) this, z));
        this.r.start();
    }

    public final void j0() {
        if (this.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131744489, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131744490, null);
        alertDialog$Builder.j(ob6.M0(2131742865, null), null);
        alertDialog$Builder.g(ob6.M0(2131744498, null), new rd1((Object) this, (byte) 2));
        this.w0 = alertDialog$Builder.o();
    }

    public final void k0() {
        if (getParentActivity() == null) {
            return;
        }
        l46 l46Var = new l46(2, this.currentAccount, null, getParentActivity(), this);
        l46Var.q2 = true;
        l46Var.C2 = new xh1(this, (byte) 1);
        showDialog(l46Var);
    }

    public final void l0(boolean z) {
        if (!z) {
            hl.r(this.x0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new g0(this, (byte) 26));
            this.y0.setDuration((long) (Math.abs(this.b.c - (z ? 1.0f : 0.0f)) * 200.0f));
            this.y0.setInterpolator(k43.f);
            this.y0.start();
        }
    }

    public final void m0() {
        if (this.e == null) {
            return;
        }
        int i = 8;
        if (this.c0 || this.l0) {
            ilb ilbVar = this.U;
            int i2 = aob.B6;
            ilbVar.setTag(Integer.valueOf(i2));
            yob.X(this.U.getTextView(), i2, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            ilb ilbVar2 = this.U;
            yob.Z(ilbVar2, ilbVar2.getContext(), R.drawable.greydivider_bottom, aob.b7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            boolean z = this.K;
            ilb ilbVar3 = this.U;
            boolean z2 = this.c0;
            if (z) {
                ilbVar3.setText(ob6.M0(z2 ? 2131748393 : 2131748390, null));
                this.X.setText(this.c0 ? ob6.M0(2131752375, null) : ob6.M0(2131752357, null));
            } else {
                ilbVar3.setText(ob6.M0(z2 ? 2131752297 : 2131752232, null));
                this.X.setText(this.c0 ? ob6.M0(2131752375, null) : ob6.M0(2131752357, null));
            }
            this.P.setVisibility(this.c0 ? 8 : 0);
            this.Q.setVisibility(this.c0 ? 0 : 8);
            this.O.setPadding(0, 0, 0, this.c0 ? 0 : hl.L(7.0f));
            i56 i56Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            i56Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            te1 te1Var = this.W;
            if (!this.c0 && te1Var.length() != 0) {
                i = 0;
            }
            te1Var.setVisibility(i);
        } else {
            this.U.setText(ob6.M0(2131752514, null));
            ilb ilbVar4 = this.U;
            int i3 = aob.p7;
            ilbVar4.setTag(Integer.valueOf(i3));
            yob.X(this.U.getTextView(), i3, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                ilb ilbVar5 = this.U;
                yob.Z(ilbVar5, ilbVar5.getContext(), R.drawable.greydivider_bottom, aob.b7);
                this.g0.setVisibility(8);
            } else {
                ilb ilbVar6 = this.U;
                yob.Z(ilbVar6, ilbVar6.getContext(), R.drawable.greydivider, aob.b7);
                this.i0.setVisibility(8);
                this.N.setVisibility(0);
                this.g0.setVisibility(0);
            }
        }
        this.S.a(!this.c0);
        this.T.a(this.c0);
        this.y.clearFocus();
        hl.t1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.d;
        if (iu3Var == null || !iu3Var.e) {
            return true;
        }
        if (!z) {
            return false;
        }
        iu3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.R);
        jn7.f(this.currentAccount).b(this, jn7.S);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            uc7 messagesController = getMessagesController();
            long j = this.k0;
            TLRPC.ChatFull N0 = messagesController.N0(j);
            if (N0 != null) {
                this.e0 = N0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new zh1(this, (byte) 3));
            }
        }
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.a = this;
            zn5Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        jn7.f(this.currentAccount).n(this, jn7.R);
        jn7.f(this.currentAccount).n(this, jn7.S);
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.c();
        }
        hl.y2(getParentActivity(), this.classGuid);
        iu3 iu3Var = this.d;
        if (iu3Var != null) {
            iu3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        iu3 iu3Var = this.d;
        if (iu3Var != null) {
            iu3Var.r();
        }
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.j(i, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        iu3 iu3Var = this.d;
        if (iu3Var != null) {
            iu3Var.s();
        }
        hl.V2(getParentActivity(), this.classGuid);
        zn5 zn5Var = this.x;
        if (zn5Var != null) {
            zn5Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            di2 di2Var = this.c;
            if (di2Var != null) {
                di2Var.b(aob.w0(null, aob.v8, false));
            }
            ua6 ua6Var = this.i0;
            if (ua6Var == null || ua6Var.getChildCount() <= 0 || !(this.i0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(aob.w0(null, aob.h6, false));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.j0 == 1) {
            return;
        }
        this.d.requestFocus();
        du3 du3Var = this.d.a;
        du3Var.requestFocus();
        hl.E3(du3Var);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            zn5 zn5Var = this.x;
            if (zn5Var != null) {
                zn5Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                iu3 iu3Var = this.d;
                if (iu3Var != null) {
                    iu3Var.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            zn5 zn5Var = this.x;
            if (zn5Var != null && (str = zn5Var.f) != null) {
                bundle.putString("path", str);
            }
            iu3 iu3Var = this.d;
            if (iu3Var != null) {
                String obj = iu3Var.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    @Override // yn5
    public final void T() {
    }
}
