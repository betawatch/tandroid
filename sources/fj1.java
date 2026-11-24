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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fj1 extends d implements jm7, vn5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public jf5 I;
    public EditTextBoldCursor J;
    public boolean K;
    public p09 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public f56 R;
    public v09 S;
    public v09 T;
    public njb U;
    public TextView V;
    public sf1 W;
    public jf5 X;
    public int Y;
    public String Z;
    public r7 a;
    public y31 a0;
    public x43 b;
    public boolean b0;
    public wi2 c;
    public boolean c0;
    public cv3 d;
    public boolean d0;
    public bba e;
    public TLRPC.TL_chatInviteExported e0;
    public kc0 f;
    public boolean f0;
    public njb g0;
    public a91 h;
    public final ArrayList h0;
    public pa6 i0;
    public final int j0;
    public final long k0;
    public boolean l0;
    public final Boolean m0;
    public cj1 n;
    public TLRPC.InputFile n0;
    public TLRPC.InputFile o0;
    public TLRPC.VideoSize p0;
    public String q0;
    public AnimatorSet r;
    public double r0;
    public dj1 s;
    public boolean s0;
    public boolean t0;
    public Integer u0;
    public jac v0;
    public final pc0 w;
    public he w0;
    public final wn5 x;
    public final wi1 x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public fj1(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        byte b = 1;
        this.l0 = true;
        byte b2 = 0;
        this.x0 = new wi1(this, b2);
        int i = bundle.getInt("step", 0);
        this.j0 = i;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i == 0) {
            this.w = new pc0((ylb) null);
            this.x = new wn5(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new yi1(this, b));
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z;
            this.c0 = !z;
            if (!z && !this.f0) {
                this.f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yi1(this, b2));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    @Override // vn5
    public final void H(float f) {
        dj1 dj1Var = this.s;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(f);
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        dj1 dj1Var = this.s;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(0.0f);
    }

    @Override // vn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1((d) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 0));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i;
        final fj1 fj1Var = this;
        cv3 cv3Var = fj1Var.d;
        if (cv3Var != null) {
            cv3Var.o();
        }
        fj1Var.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        fj1Var.actionBar.setAllowOverlayTitle(true);
        fj1Var.actionBar.setActionBarMenuOnItemClick(new r8(fj1Var, (byte) 22));
        r6 t = fj1Var.actionBar.t();
        Drawable d = b10.d(context, R.drawable.ic_ab_done);
        int i2 = cmb.u8;
        final byte b2 = 0;
        int w0 = cmb.w0(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        d.setColorFilter(new PorterDuffColorFilter(w0, mode));
        wi2 wi2Var = new wi2(cmb.w0(null, i2, false));
        fj1Var.c = wi2Var;
        x43 x43Var = new x43(d, wi2Var);
        fj1Var.b = x43Var;
        int L = gm.L(56.0f);
        String M0 = jb6.M0(2131751291, null);
        boolean z = t.c;
        a aVar = t.b;
        r7 c = t.c(1, 0, null, z ? aVar.r0 : aVar.q0, x43Var, L, M0, null);
        fj1Var.a = c;
        anb.x(c, d, i2, null, mode);
        byte b3 = 2;
        int i3 = fj1Var.j0;
        if (i3 == 0) {
            fj1Var.actionBar.setTitle(jb6.M0(2131748043, null));
            hz0 hz0Var = new hz0(fj1Var, context, b);
            hz0Var.setOnTouchListener(new p8((byte) 26));
            fj1Var.fragmentView = hz0Var;
            int i4 = cmb.c6;
            hz0Var.setTag(Integer.valueOf(i4));
            anb.h(i4, null, fj1Var.fragmentView);
            LinearLayout linearLayout = new LinearLayout(context);
            fj1Var.M = linearLayout;
            linearLayout.setOrientation(1);
            hz0Var.addView(fj1Var.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            fj1Var.M.addView(frameLayout, qoe.o(-1, -2));
            kc0 kc0Var = new kc0(b3, context, fj1Var);
            fj1Var.f = kc0Var;
            kc0Var.setRoundRadius(gm.L(32.0f));
            pc0 pc0Var = fj1Var.w;
            pc0Var.j(5L, null, null, null);
            fj1Var.f.setImageDrawable(pc0Var);
            kc0 kc0Var2 = fj1Var.f;
            boolean z2 = jb6.a0;
            frameLayout.addView(kc0Var2, qoe.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            a91 a91Var = new a91(fj1Var, context, paint, b);
            fj1Var.h = a91Var;
            a91Var.setContentDescription(jb6.M0(2131752149, null));
            a91 a91Var2 = fj1Var.h;
            boolean z3 = jb6.a0;
            frameLayout.addView(a91Var2, qoe.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 12.0f));
            fj1Var.h.setOnClickListener(new zi1(fj1Var, b));
            fj1Var.L = new p09(R.raw.camera, gm.L(60.0f), gm.L(60.0f), false, null);
            cj1 cj1Var = new cj1(b2, context, fj1Var);
            fj1Var.n = cj1Var;
            cj1Var.setScaleType(ImageView.ScaleType.CENTER);
            fj1Var.n.setAnimation(fj1Var.L);
            fj1Var.n.setEnabled(false);
            fj1Var.n.setClickable(false);
            fj1Var.n.setPadding(gm.L(0.0f), 0, 0, gm.L(1.0f));
            cj1 cj1Var2 = fj1Var.n;
            boolean z4 = jb6.a0;
            frameLayout.addView(cj1Var2, qoe.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 15.0f, 12.0f, z4 ? 15.0f : 0.0f, 12.0f));
            dj1 dj1Var = new dj1(fj1Var, context, b2);
            fj1Var.s = dj1Var;
            dj1Var.setSize(gm.L(30.0f));
            fj1Var.s.setProgressColor(-1);
            fj1Var.s.setNoProgress(false);
            dj1 dj1Var2 = fj1Var.s;
            boolean z5 = jb6.a0;
            frameLayout.addView(dj1Var2, qoe.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 12.0f));
            fj1Var.j0(false, false);
            cv3 cv3Var2 = new cv3(context, hz0Var, fj1Var, 0, false, null);
            fj1Var = fj1Var;
            fj1Var.d = cv3Var2;
            cv3Var2.setHint(jb6.M0(2131751061, null));
            String str = fj1Var.G;
            if (str != null) {
                fj1Var.d.setText(str);
                fj1Var.G = null;
            }
            fj1Var.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            fj1Var.d.getEditText().setSingleLine(true);
            fj1Var.d.getEditText().setImeOptions(5);
            fj1Var.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(fj1Var) { // from class: aj1
                public final /* synthetic */ fj1 b;

                {
                    this.b = fj1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b4 = b2;
                    fj1 fj1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i5 == 5 && !TextUtils.isEmpty(fj1Var2.d.getEditText().getText())) {
                                fj1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i5 == 6 && (r7Var = fj1Var2.a) != null) {
                                r7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            cv3 cv3Var3 = fj1Var.d;
            boolean z6 = jb6.a0;
            frameLayout.addView(cv3Var3, qoe.d(-1, -2.0f, 16, z6 ? 5.0f : 96.0f, 0.0f, z6 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            fj1Var.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            anb.D(fj1Var.y, cmb.G6, null);
            EditTextBoldCursor editTextBoldCursor2 = fj1Var.y;
            int i5 = cmb.F6;
            anb.X(editTextBoldCursor2, i5, null);
            fj1Var.y.setBackgroundDrawable(null);
            anb.F(fj1Var.y, cmb.j6, cmb.k6, cmb.o7, fj1Var.getResourceProvider());
            fj1Var.y.setPadding(0, 0, 0, gm.L(6.0f));
            fj1Var.y.setGravity(jb6.a0 ? 5 : 3);
            fj1Var.y.setInputType(180225);
            fj1Var.y.setImeOptions(6);
            fj1Var.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(nm7.E1)});
            fj1Var.y.setHint(jb6.M0(2131751396, null));
            anb.v(fj1Var.y, i5, null);
            fj1Var.y.setCursorSize(gm.L(20.0f));
            fj1Var.y.setCursorWidth(1.5f);
            fj1Var.M.addView(fj1Var.y, qoe.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            fj1Var.y.setOnEditorActionListener(new TextView.OnEditorActionListener(fj1Var) { // from class: aj1
                public final /* synthetic */ fj1 b;

                {
                    this.b = fj1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i52, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b4 = b;
                    fj1 fj1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i52 == 5 && !TextUtils.isEmpty(fj1Var2.d.getEditText().getText())) {
                                fj1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i52 == 6 && (r7Var = fj1Var2.a) != null) {
                                r7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            fj1Var.y.addTextChangedListener(new ej1(b2));
            TextView textView = new TextView(context);
            fj1Var.V = textView;
            textView.setTextSize(1, 15.0f);
            anb.X(fj1Var.V, cmb.E6, null);
            fj1Var.V.setGravity(jb6.a0 ? 5 : 3);
            fj1Var.V.setText(jb6.M0(2131751399, null));
            fj1Var.M.addView(fj1Var.V, qoe.t(-2, -2, jb6.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i3 == 1) {
            ScrollView scrollView = new ScrollView(context);
            fj1Var.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            fj1Var.M = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(fj1Var.M, new FrameLayout.LayoutParams(-1, -2));
            oc7 messagesController = fj1Var.getMessagesController();
            long j = fj1Var.k0;
            TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
            boolean z7 = L0 != null && (!sd2.T(L0) || sd2.n0(L0));
            fj1Var.K = z7;
            fj1Var.actionBar.setTitle(jb6.M0(z7 ? 2131749157 : 2131752235, null));
            View view = fj1Var.fragmentView;
            int i6 = cmb.Z6;
            view.setTag(Integer.valueOf(i6));
            anb.h(i6, null, fj1Var.fragmentView);
            jf5 jf5Var = new jf5(context, 23);
            fj1Var.I = jf5Var;
            jf5Var.setHeight(46);
            jf5 jf5Var2 = fj1Var.I;
            int i7 = cmb.c6;
            anb.h(i7, null, jf5Var2);
            fj1Var.I.setText(jb6.M0(fj1Var.K ? 2131749148 : 2131752213, null));
            fj1Var.M.addView(fj1Var.I);
            LinearLayout linearLayout3 = new LinearLayout(context);
            fj1Var.H = linearLayout3;
            linearLayout3.setOrientation(1);
            anb.h(i7, null, fj1Var.H);
            fj1Var.M.addView(fj1Var.H, qoe.o(-1, -2));
            v09 v09Var = new v09(context, false);
            fj1Var.S = v09Var;
            fg0 L02 = cmb.L0(false);
            int i8 = cmb.h6;
            wmb M = anb.M(i8);
            v09Var.setBackground(L02);
            anb.j(v09Var, L02, null, M, null);
            Boolean bool = fj1Var.m0;
            if (bool != null && !bool.booleanValue()) {
                fj1Var.c0 = true;
            }
            boolean z8 = fj1Var.K;
            v09 v09Var2 = fj1Var.S;
            if (z8) {
                i = 1;
                v09Var2.b(jb6.M0(2131748395, null), jb6.M0(2131748394, null), false, !fj1Var.c0);
            } else {
                i = 1;
                v09Var2.b(jb6.M0(2131752260, null), jb6.M0(2131752257, null), false, !fj1Var.c0);
            }
            fj1Var.S.setOnClickListener(new zi1(fj1Var, b3));
            if (bool == null || bool.booleanValue()) {
                fj1Var.H.addView(fj1Var.S, qoe.o(-1, -2));
            }
            v09 v09Var3 = new v09(context, false);
            fj1Var.T = v09Var3;
            fg0 L03 = cmb.L0(false);
            wmb M2 = anb.M(i8);
            v09Var3.setBackground(L03);
            anb.j(v09Var3, L03, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                fj1Var.c0 = false;
            }
            boolean z9 = fj1Var.K;
            v09 v09Var4 = fj1Var.T;
            if (z9) {
                v09Var4.b(jb6.M0(2131748398, null), jb6.M0(2131748397, null), false, fj1Var.c0);
            } else {
                v09Var4.b(jb6.M0(2131752271, null), jb6.M0(2131752270, null), false, fj1Var.c0);
            }
            fj1Var.T.setOnClickListener(new zi1(fj1Var, (byte) 3));
            if (bool == null || !bool.booleanValue()) {
                fj1Var.H.addView(fj1Var.T, qoe.o(-1, -2));
            }
            bba bbaVar = new bba(context, (hg9) null);
            fj1Var.e = bbaVar;
            fj1Var.M.addView(bbaVar, qoe.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            fj1Var.O = linearLayout4;
            linearLayout4.setOrientation(i);
            anb.h(i7, null, fj1Var.O);
            fj1Var.M.addView(fj1Var.O, qoe.o(-1, -2));
            jf5 jf5Var3 = new jf5(context);
            fj1Var.X = jf5Var3;
            fj1Var.O.addView(jf5Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            fj1Var.P = linearLayout5;
            linearLayout5.setOrientation(0);
            fj1Var.O.addView(fj1Var.P, qoe.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            fj1Var.J = editTextBoldCursor3;
            editTextBoldCursor3.setText(oc7.r1(fj1Var.currentAccount).N2 + "/");
            fj1Var.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = fj1Var.J;
            int i9 = cmb.G6;
            anb.D(editTextBoldCursor4, i9, null);
            EditTextBoldCursor editTextBoldCursor5 = fj1Var.J;
            int i10 = cmb.F6;
            anb.X(editTextBoldCursor5, i10, null);
            fj1Var.J.setMaxLines(1);
            fj1Var.J.setLines(1);
            fj1Var.J.setEnabled(false);
            fj1Var.J.setBackgroundDrawable(null);
            fj1Var.J.setPadding(0, 0, 0, 0);
            fj1Var.J.setSingleLine(true);
            fj1Var.J.setInputType(163840);
            fj1Var.J.setImeOptions(6);
            fj1Var.P.addView(fj1Var.J, qoe.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            fj1Var.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            anb.D(fj1Var.y, i9, null);
            anb.X(fj1Var.y, i10, null);
            fj1Var.y.setMaxLines(1);
            fj1Var.y.setLines(1);
            fj1Var.y.setBackgroundDrawable(null);
            fj1Var.y.setPadding(0, 0, 0, 0);
            fj1Var.y.setSingleLine(true);
            fj1Var.y.setInputType(163872);
            fj1Var.y.setImeOptions(6);
            fj1Var.y.setHint(jb6.M0(2131752203, null));
            anb.v(fj1Var.y, i10, null);
            fj1Var.y.setCursorSize(gm.L(20.0f));
            fj1Var.y.setCursorWidth(1.5f);
            fj1Var.P.addView(fj1Var.y, qoe.o(-1, 36));
            fj1Var.y.addTextChangedListener(new b7(fj1Var, (byte) 7));
            LinearLayout linearLayout6 = new LinearLayout(context);
            fj1Var.Q = linearLayout6;
            linearLayout6.setOrientation(1);
            fj1Var.O.addView(fj1Var.Q, qoe.o(-1, -2));
            f56 f56Var = new f56(context, fj1Var, null, true, sd2.T(fj1Var.getMessagesController().L0(Long.valueOf(j))));
            fj1Var.R = f56Var;
            f56Var.b(true);
            fj1Var.R.d(0, null, false);
            fj1Var.Q.addView(fj1Var.R);
            sf1 sf1Var = new sf1((byte) 1, context, (Object) fj1Var);
            fj1Var.W = sf1Var;
            anb.G(sf1Var, cmb.I6, null);
            anb.C(fj1Var.W, cmb.J6, null);
            fj1Var.W.setTextSize(1, 15.0f);
            fj1Var.W.setGravity(jb6.a0 ? 5 : 3);
            fj1Var.W.setVisibility(8);
            fj1Var.W.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
            fj1Var.O.addView(fj1Var.W, qoe.t(-2, -2, jb6.a0 ? 5 : 3, 18, 3, 18, 7));
            njb njbVar = new njb(context);
            fj1Var.U = njbVar;
            int i11 = cmb.a7;
            anb.Z(njbVar, context, R.drawable.greydivider_bottom, i11);
            fj1Var.M.addView(fj1Var.U, qoe.o(-1, -2));
            pa6 pa6Var = new pa6(context);
            fj1Var.i0 = pa6Var;
            fj1Var.M.addView(pa6Var, qoe.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            fj1Var.N = linearLayout7;
            anb.h(i7, null, linearLayout7);
            fj1Var.N.setOrientation(1);
            fj1Var.M.addView(fj1Var.N, qoe.o(-1, -2));
            njb njbVar2 = new njb(context);
            fj1Var.g0 = njbVar2;
            anb.Z(njbVar2, context, R.drawable.greydivider_bottom, i11);
            fj1Var.M.addView(fj1Var.g0, qoe.o(-1, -2));
            fj1Var.n0();
        }
        return fj1Var.fragmentView;
    }

    public final void d0() {
        int w0 = cmb.w0(null, cmb.T7, false) + ((cmb.w0(null, cmb.S7, false) + ((cmb.w0(null, cmb.R7, false) + ((cmb.w0(null, cmb.Q7, false) + ((cmb.w0(null, cmb.P7, false) + ((cmb.w0(null, cmb.O7, false) + ((cmb.w0(null, cmb.N7, false) + (cmb.w0(null, cmb.I7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (w0 != this.z0) {
            this.z0 = w0;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.N.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.S) {
            he heVar = this.w0;
            if (heVar != null) {
                try {
                    heVar.dismiss();
                    this.w0 = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            m0(false);
            this.t0 = false;
            return;
        }
        if (i == nm7.R) {
            he heVar2 = this.w0;
            if (heVar2 != null) {
                try {
                    heVar2.dismiss();
                    this.w0 = null;
                } catch (Exception e2) {
                    fc4.g(e2, true);
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
                oc7.r1(this.currentAccount).x(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            fj1 fj1Var = new fj1(bundle);
            fj1Var.v0 = this.v0;
            presentFragment(fj1Var, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        wn5 wn5Var = this.x;
        if (wn5Var == null || !wn5Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wn5 wn5Var = this.x;
        return (wn5Var == null || dialog != wn5Var.c) && super.dismissDialogOnPause(dialog);
    }

    public final void e0(String str) {
        if (str == null || str.length() <= 0) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
        }
        y31 y31Var = this.a0;
        if (y31Var != null) {
            gm.r(y31Var);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.W.setText(jb6.M0(2131748666, null));
                sf1 sf1Var = this.W;
                int i = cmb.o7;
                sf1Var.setTag(Integer.valueOf(i));
                anb.X(this.W, i, null);
                return;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt >= '0' && charAt <= '9') {
                    this.W.setText(jb6.M0(2131748662, null));
                    sf1 sf1Var2 = this.W;
                    int i3 = cmb.o7;
                    sf1Var2.setTag(Integer.valueOf(i3));
                    anb.X(this.W, i3, null);
                    return;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.W.setText(jb6.M0(2131748666, null));
                    sf1 sf1Var3 = this.W;
                    int i4 = cmb.o7;
                    sf1Var3.setTag(Integer.valueOf(i4));
                    anb.X(this.W, i4, null);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.W.setText(jb6.M0(2131748664, null));
            sf1 sf1Var4 = this.W;
            int i5 = cmb.o7;
            sf1Var4.setTag(Integer.valueOf(i5));
            anb.X(this.W, i5, null);
            return;
        }
        int length = str.length();
        sf1 sf1Var5 = this.W;
        if (length > 32) {
            sf1Var5.setText(jb6.M0(2131748665, null));
            sf1 sf1Var6 = this.W;
            int i6 = cmb.o7;
            sf1Var6.setTag(Integer.valueOf(i6));
            anb.X(this.W, i6, null);
            return;
        }
        sf1Var5.setText(jb6.M0(2131748679, null));
        sf1 sf1Var7 = this.W;
        int i7 = cmb.E6;
        sf1Var7.setTag(Integer.valueOf(i7));
        anb.X(this.W, i7, null);
        this.Z = str;
        y31 y31Var2 = new y31(this, str, (byte) 27);
        this.a0 = y31Var2;
        gm.d3(y31Var2, 300L);
    }

    public final /* synthetic */ void f0(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = oc7.r1(this.currentAccount).g1(this.k0);
        this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new eo0((Object) this, (Object) str, (Object) tL_channels_checkUsername, (byte) 14), 2);
    }

    public final /* synthetic */ void g0(TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = oc7.h1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new yi1(this, (byte) 2), 64);
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cv3 cv3Var = this.d;
        int i = cmb.j6;
        arrayList.add(new cnb(cv3Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        cv3 cv3Var2 = this.d;
        int i2 = cmb.k6;
        arrayList.add(new cnb(cv3Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.a7));
        LinearLayout linearLayout = this.Q;
        int i3 = cmb.h6;
        arrayList.add(new cnb(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.i0, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        return arrayList;
    }

    public final void h0(View view) {
        TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(R.string.AppName, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        boolean z = currentChannel.megagroup;
        int i = this.currentAccount;
        if (z) {
            heVar.U = gm.S2(jb6.a0("RevokeLinkAlert", null, 2131745755, oc7.r1(i).N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
        } else {
            heVar.U = gm.S2(jb6.a0("RevokeLinkAlertChannel", null, 2131745754, oc7.r1(i).N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131745757, null), new g11((Object) this, (Object) currentChannel, (byte) 10));
        showDialog(heVar);
    }

    public final /* synthetic */ void i0(he heVar) {
        this.t0 = false;
        this.s0 = false;
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        m0(false);
        heVar.dismiss();
    }

    public final void j0(boolean z, boolean z2) {
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
            cj1 cj1Var = this.n;
            if (z) {
                cj1Var.setAlpha(1.0f);
                this.n.setVisibility(4);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            cj1Var.setAlpha(1.0f);
            this.n.setVisibility(0);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        this.r = new AnimatorSet();
        if (z) {
            this.s.setVisibility(0);
            AnimatorSet animatorSet2 = this.r;
            cj1 cj1Var2 = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(cj1Var2, (Property<cj1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<dj1, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            cj1 cj1Var3 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(cj1Var3, (Property<cj1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<dj1, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new y7((byte) 13, (Object) this, z));
        this.r.start();
    }

    public final void k0() {
        if (this.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131744521, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131744522, null);
        alertDialog$Builder.j(jb6.M0(2131742897, null), null);
        alertDialog$Builder.g(jb6.M0(2131744530, null), new cd1((Object) this, (byte) 3));
        this.w0 = alertDialog$Builder.o();
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(2, this.currentAccount, null, getParentActivity(), this);
        i46Var.q2 = true;
        i46Var.C2 = new wi1(this, (byte) 1);
        showDialog(i46Var);
    }

    public final void m0(boolean z) {
        if (!z) {
            gm.r(this.x0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 27));
            this.y0.setDuration((long) (Math.abs(this.b.c - (z ? 1.0f : 0.0f)) * 200.0f));
            this.y0.setInterpolator(d53.f);
            this.y0.start();
        }
    }

    public final void n0() {
        if (this.e == null) {
            return;
        }
        int i = 8;
        if (this.c0 || this.l0) {
            njb njbVar = this.U;
            int i2 = cmb.A6;
            njbVar.setTag(Integer.valueOf(i2));
            anb.X(this.U.getTextView(), i2, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            njb njbVar2 = this.U;
            anb.Z(njbVar2, njbVar2.getContext(), R.drawable.greydivider_bottom, cmb.a7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            boolean z = this.K;
            njb njbVar3 = this.U;
            boolean z2 = this.c0;
            if (z) {
                njbVar3.setText(jb6.M0(z2 ? 2131748396 : 2131748393, null));
                this.X.setText(this.c0 ? jb6.M0(2131752347, null) : jb6.M0(2131752329, null));
            } else {
                njbVar3.setText(jb6.M0(z2 ? 2131752269 : 2131752204, null));
                this.X.setText(this.c0 ? jb6.M0(2131752347, null) : jb6.M0(2131752329, null));
            }
            this.P.setVisibility(this.c0 ? 8 : 0);
            this.Q.setVisibility(this.c0 ? 0 : 8);
            this.O.setPadding(0, 0, 0, this.c0 ? 0 : gm.L(7.0f));
            f56 f56Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            f56Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            sf1 sf1Var = this.W;
            if (!this.c0 && sf1Var.length() != 0) {
                i = 0;
            }
            sf1Var.setVisibility(i);
        } else {
            this.U.setText(jb6.M0(2131752486, null));
            njb njbVar4 = this.U;
            int i3 = cmb.o7;
            njbVar4.setTag(Integer.valueOf(i3));
            anb.X(this.U.getTextView(), i3, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                njb njbVar5 = this.U;
                anb.Z(njbVar5, njbVar5.getContext(), R.drawable.greydivider_bottom, cmb.a7);
                this.g0.setVisibility(8);
            } else {
                njb njbVar6 = this.U;
                anb.Z(njbVar6, njbVar6.getContext(), R.drawable.greydivider, cmb.a7);
                this.i0.setVisibility(8);
                this.N.setVisibility(0);
                this.g0.setVisibility(0);
            }
        }
        this.S.a(!this.c0);
        this.T.a(this.c0);
        this.y.clearFocus();
        gm.t1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.d;
        if (cv3Var == null || !cv3Var.e) {
            return true;
        }
        if (!z) {
            return false;
        }
        cv3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.R);
        nm7.f(this.currentAccount).b(this, nm7.S);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            oc7 messagesController = getMessagesController();
            long j = this.k0;
            TLRPC.ChatFull M0 = messagesController.M0(j);
            if (M0 != null) {
                this.e0 = M0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new yi1(this, (byte) 3));
            }
        }
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.a = this;
            wn5Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        nm7.f(this.currentAccount).n(this, nm7.R);
        nm7.f(this.currentAccount).n(this, nm7.S);
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.c();
        }
        gm.y2(getParentActivity(), this.classGuid);
        cv3 cv3Var = this.d;
        if (cv3Var != null) {
            cv3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        cv3 cv3Var = this.d;
        if (cv3Var != null) {
            cv3Var.r();
        }
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.j(i, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        cv3 cv3Var = this.d;
        if (cv3Var != null) {
            cv3Var.s();
        }
        gm.V2(getParentActivity(), this.classGuid);
        wn5 wn5Var = this.x;
        if (wn5Var != null) {
            wn5Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            wi2 wi2Var = this.c;
            if (wi2Var != null) {
                wi2Var.b(cmb.w0(null, cmb.u8, false));
            }
            pa6 pa6Var = this.i0;
            if (pa6Var == null || pa6Var.getChildCount() <= 0 || !(this.i0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(cmb.w0(null, cmb.g6, false));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.j0 == 1) {
            return;
        }
        this.d.requestFocus();
        wu3 wu3Var = this.d.a;
        wu3Var.requestFocus();
        gm.E3(wu3Var);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            wn5 wn5Var = this.x;
            if (wn5Var != null) {
                wn5Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                cv3 cv3Var = this.d;
                if (cv3Var != null) {
                    cv3Var.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            wn5 wn5Var = this.x;
            if (wn5Var != null && (str = wn5Var.f) != null) {
                bundle.putString("path", str);
            }
            cv3 cv3Var = this.d;
            if (cv3Var != null) {
                String obj = cv3Var.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    @Override // vn5
    public final void T() {
    }
}
