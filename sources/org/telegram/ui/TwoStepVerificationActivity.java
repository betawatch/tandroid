package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public ScrollView E;
    public un4 F;
    public wyb G;
    public boolean H;
    public boolean I;
    public TL_account.Password J;
    public boolean K;
    public byte[] L;
    public long M;
    public byte[] N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final u2c W;
    public boolean X;
    public int Y;
    public y2c Z;
    public a3c a;
    public byte a0;
    public o39 b;
    public String b0;
    public ry8 c;
    public b3c c0;
    private int changePasswordRow;
    public TextView d;
    public final u2c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public jia n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public er7 w;
    public hd x;
    public g24 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u2c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u2c(this, (byte) 3);
    }

    public static boolean a0(TL_account.Password password, boolean z) {
        return z ? !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) : ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void e0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        showDialog(hdVar);
    }

    public final void B0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131742685, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(k96.M0(2131743694, null), null);
        alertDialog$Builder.g(k96.M0(2131750577, null), new pz4(this, (byte) 1));
        zkb.X((TextView) alertDialog$Builder.o().c(-2), bkb.p7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        TextView textView;
        if (this.K) {
            return;
        }
        int i = this.J.pending_reset_date;
        u2c u2cVar = this.d0;
        if (i != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i2 = this.J.pending_reset_date;
            if (currentTime <= i2) {
                int max = Math.max(1, i2 - getConnectionsManager().getCurrentTime());
                this.h.setText(k96.a0("RestorePasswordResetIn", null, 2131745876, max > 86400 ? k96.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? k96.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                zkb.X(this.h, bkb.C6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                gl.r(u2cVar);
                gl.d3(u2cVar, 1000L);
                if (this.J == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                gl.r(u2cVar);
                textView = this.r;
                if (textView == null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        int i3 = this.J.pending_reset_date;
        jia jiaVar = this.n;
        if (i3 == 0) {
            jiaVar.l(k96.M0(2131750574, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            jiaVar.l(k96.M0(2131745900, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        zkb.W(this.n, bkb.p6, null);
        gl.r(u2cVar);
        if (this.J == null) {
        }
        gl.r(u2cVar);
        textView = this.r;
        if (textView == null) {
        }
    }

    public final void D0() {
        TL_account.Password password;
        StringBuilder sb = new StringBuilder();
        sb.append(this.P);
        sb.append(this.Q);
        sb.append(this.changePasswordRow);
        sb.append(this.turnPasswordOffRow);
        sb.append(this.R);
        sb.append(this.S);
        sb.append(this.T);
        sb.append(this.U);
        byte b = 0;
        this.U = 0;
        this.P = -1;
        this.Q = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        if (!this.H && (password = this.J) != null && this.K) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.U = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.U = 3;
                    this.S = 2;
                } else {
                    this.U = 3;
                    this.R = 2;
                }
                this.U = 4;
                this.T = 3;
            } else {
                this.P = 0;
                this.U = 2;
                this.Q = 1;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.P);
        sb2.append(this.Q);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        sb2.append(this.U);
        if (this.a != null && !sb.toString().equals(sb2.toString())) {
            this.a.f();
        }
        if (this.fragmentView != null) {
            if (this.H || this.K) {
                o39 o39Var = this.b;
                if (o39Var != null) {
                    o39Var.setVisibility(0);
                    this.E.setVisibility(4);
                    this.b.setEmptyView(this.y);
                }
                if (this.s != null) {
                    this.F.e(false, false);
                    this.s.setVisibility(4);
                    this.d.setVisibility(4);
                    this.f.setVisibility(8);
                    this.n.setVisibility(4);
                    C0();
                }
                View view = this.fragmentView;
                int i = bkb.Z6;
                zkb.h(i, null, view);
                this.fragmentView.setTag(Integer.valueOf(i));
                return;
            }
            o39 o39Var2 = this.b;
            if (o39Var2 != null) {
                o39Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.E.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.F.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i2 = bkb.c6;
                zkb.h(i2, null, view2);
                this.fragmentView.setTag(Integer.valueOf(i2));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                C0();
                this.f.setVisibility(8);
                boolean isEmpty = TextUtils.isEmpty(this.J.hint);
                EditTextBoldCursor editTextBoldCursor = this.s;
                if (isEmpty) {
                    editTextBoldCursor.setHint((CharSequence) null);
                } else {
                    editTextBoldCursor.setHint(this.J.hint);
                }
                gl.d3(new u2c(this, b), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131752563, null), new pz4(this, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752564, null), null);
        String M0 = k96.M0(2131752559, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752565, null);
        showDialog(hdVar);
    }

    public final void c0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        y6c.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        t0(false);
        Utilities.e.c(new a5b((Object) this, (Object) updatepasswordsettings, (byte) 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fc  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        b3c b3cVar;
        boolean z;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final byte b2 = 1;
        if (!this.K || this.c0 != null) {
            zkb.h(bkb.c6, null, this.actionBar);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i2 = bkb.F6;
            zkb.l(aVar, 5, i2, null);
            zkb.l(this.actionBar, 1, i2, null);
            zkb.l(this.actionBar, 3, bkb.t8, null);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i3 = bkb.c6;
        zkb.h(i3, null, frameLayout);
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.E, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.E.addView(linearLayout, nme.x(-1, -2, 51));
        ry8 ry8Var = new ry8(context);
        this.c = ry8Var;
        ry8Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        ry8 ry8Var2 = this.c;
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                ry8Var2.setVisibility(i);
                linearLayout.addView(this.c, nme.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i4 = bkb.F6;
                zkb.X(textView, i4, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(gl.o());
                TextView m = ug8.m(linearLayout, this.d, nme.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = m;
                int i5 = bkb.C6;
                zkb.X(m, i5, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, nme.t(-2, -2, 1, 42, 8, 42, 0));
                er7 er7Var = new er7(context, null);
                this.w = er7Var;
                er7Var.setText(k96.M0(2131751104, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, nme.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                zkb.X(this.s, i4, null);
                zkb.D(this.s, bkb.G6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(kk7.M1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i6 = bkb.k6;
                zkb.v(editTextBoldCursor2, i6, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(k96.M0(2131751104, null));
                int L = gl.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, nme.c(-2.0f, -1));
                this.w.e(this.s);
                this.s.setOnFocusChangeListener(new ls0(this, (byte) 19));
                this.s.setOnEditorActionListener(new j(this, (byte) 27));
                this.s.addTextChangedListener(new jf6(this, (byte) 20));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                zkb.X(textView2, i5, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!k96.a0 ? 5 : 3) | 48);
                this.f.setText(k96.M0(2131742555, null));
                TextView m2 = ug8.m(linearLayout, this.f, nme.t(-2, -2, (!k96.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = m2;
                zkb.X(m2, i5, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!k96.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, nme.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, nme.l(1.0f, -1, 0));
                jia jiaVar = new jia(context);
                this.n = jiaVar;
                jiaVar.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
                frameLayout.addView(this.n, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                        switch (b3) {
                            case 0:
                                twoStepVerificationActivity.v0();
                                break;
                            case 1:
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.x0();
                                break;
                        }
                    }
                });
                vk9.c(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
                this.r.setText(k96.M0(2131752559, null));
                zkb.X(this.r, bkb.p6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                        switch (b3) {
                            case 0:
                                twoStepVerificationActivity.v0();
                                break;
                            case 1:
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.x0();
                                break;
                        }
                    }
                });
                vk9.c(this.r);
                un4 un4Var = new un4(this.resourceProvider, context, false);
                this.F = un4Var;
                vk9.c(un4Var);
                final byte b3 = 2;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b3;
                        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                        switch (b32) {
                            case 0:
                                twoStepVerificationActivity.v0();
                                break;
                            case 1:
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.x0();
                                break;
                        }
                    }
                });
                wyb wybVar = new wyb(context);
                this.G = wybVar;
                wybVar.setTransformType(1);
                this.G.setProgress(0.0f);
                this.G.setColor(bkb.w0(null, bkb.N9, false));
                this.G.setDrawBackground(false);
                this.F.setContentDescription(k96.M0(2131748058, null));
                this.F.addView(this.G, nme.e(56, 56, 17));
                this.F.a(this.G);
                frameLayout.addView(this.F, un4.b());
                g24 g24Var = new g24(context, null);
                this.y = g24Var;
                g24Var.b();
                frameLayout.addView(this.y, nme.c(-1.0f, -1));
                o39 o39Var = new o39(context, null);
                this.b = o39Var;
                o39Var.setSections(true);
                this.b.setLayoutManager(new t26(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, nme.c(-1.0f, -1));
                o39 o39Var2 = this.b;
                a3c a3cVar = new a3c(this, context);
                this.a = a3cVar;
                o39Var2.setAdapter(a3cVar);
                this.b.setOnItemClickListener(new f09(this, (byte) 28));
                y2c y2cVar = new y2c(context, null);
                this.Z = y2cVar;
                y2cVar.setSize(gl.L(20.0f));
                this.Z.setAlpha(0.0f);
                this.Z.setScaleX(0.1f);
                this.Z.setScaleY(0.1f);
                this.Z.setProgressColor(bkb.w0(null, i6, false));
                this.actionBar.addView(this.Z, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                D0();
                if (this.K || this.c0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(k96.M0(2131743692, null));
                }
                b3cVar = this.c0;
                TextView textView4 = this.d;
                if (b3cVar == null) {
                    textView4.setText(k96.M0(2131742542, null));
                    byte b4 = this.a0;
                    if (b4 == 1) {
                        this.e.setText(k96.M0(2131747020, null));
                    } else {
                        TextView textView5 = this.e;
                        if (b4 == 2) {
                            de9.r(null, null, 2131747023, new Object[]{this.b0}, textView5);
                        } else if (b4 == 3) {
                            de9.r(null, null, 2131747022, new Object[]{this.b0}, textView5);
                        } else {
                            textView5.setText(k96.M0(2131747021, null));
                        }
                    }
                    this.e.setVisibility(0);
                } else {
                    textView4.setText(k96.M0(2131742542, null));
                    this.e.setVisibility(0);
                    this.e.setText(k96.M0(2131748532, null));
                }
                z = this.K;
                View view = this.fragmentView;
                if (z) {
                    zkb.h(i3, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i3));
                } else {
                    int i7 = bkb.Z6;
                    zkb.h(i7, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i7));
                }
                return this.fragmentView;
            }
        }
        i = 8;
        ry8Var2.setVisibility(i);
        linearLayout.addView(this.c, nme.r(100, 100, 1));
        TextView textView6 = new TextView(context);
        this.d = textView6;
        int i42 = bkb.F6;
        zkb.X(textView6, i42, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(gl.o());
        TextView m3 = ug8.m(linearLayout, this.d, nme.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = m3;
        int i52 = bkb.C6;
        zkb.X(m3, i52, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, nme.t(-2, -2, 1, 42, 8, 42, 0));
        er7 er7Var2 = new er7(context, null);
        this.w = er7Var2;
        er7Var2.setText(k96.M0(2131751104, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, nme.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        zkb.X(this.s, i42, null);
        zkb.D(this.s, bkb.G6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(kk7.M1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i62 = bkb.k6;
        zkb.v(editTextBoldCursor22, i62, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(k96.M0(2131751104, null));
        int L2 = gl.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, nme.c(-2.0f, -1));
        this.w.e(this.s);
        this.s.setOnFocusChangeListener(new ls0(this, (byte) 19));
        this.s.setOnEditorActionListener(new j(this, (byte) 27));
        this.s.addTextChangedListener(new jf6(this, (byte) 20));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        zkb.X(textView22, i52, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!k96.a0 ? 5 : 3) | 48);
        this.f.setText(k96.M0(2131742555, null));
        TextView m22 = ug8.m(linearLayout, this.f, nme.t(-2, -2, (!k96.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = m22;
        zkb.X(m22, i52, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!k96.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, nme.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, nme.l(1.0f, -1, 0));
        jia jiaVar2 = new jia(context);
        this.n = jiaVar2;
        jiaVar2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        frameLayout.addView(this.n, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b;
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                switch (b32) {
                    case 0:
                        twoStepVerificationActivity.v0();
                        break;
                    case 1:
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.x0();
                        break;
                }
            }
        });
        vk9.c(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.r.setText(k96.M0(2131752559, null));
        zkb.X(this.r, bkb.p6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b2;
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                switch (b32) {
                    case 0:
                        twoStepVerificationActivity.v0();
                        break;
                    case 1:
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.x0();
                        break;
                }
            }
        });
        vk9.c(this.r);
        un4 un4Var2 = new un4(this.resourceProvider, context, false);
        this.F = un4Var2;
        vk9.c(un4Var2);
        final byte b32 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: x2c
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b322 = b32;
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                switch (b322) {
                    case 0:
                        twoStepVerificationActivity.v0();
                        break;
                    case 1:
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.x0();
                        break;
                }
            }
        });
        wyb wybVar2 = new wyb(context);
        this.G = wybVar2;
        wybVar2.setTransformType(1);
        this.G.setProgress(0.0f);
        this.G.setColor(bkb.w0(null, bkb.N9, false));
        this.G.setDrawBackground(false);
        this.F.setContentDescription(k96.M0(2131748058, null));
        this.F.addView(this.G, nme.e(56, 56, 17));
        this.F.a(this.G);
        frameLayout.addView(this.F, un4.b());
        g24 g24Var2 = new g24(context, null);
        this.y = g24Var2;
        g24Var2.b();
        frameLayout.addView(this.y, nme.c(-1.0f, -1));
        o39 o39Var3 = new o39(context, null);
        this.b = o39Var3;
        o39Var3.setSections(true);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        o39 o39Var22 = this.b;
        a3c a3cVar2 = new a3c(this, context);
        this.a = a3cVar2;
        o39Var22.setAdapter(a3cVar2);
        this.b.setOnItemClickListener(new f09(this, (byte) 28));
        y2c y2cVar2 = new y2c(context, null);
        this.Z = y2cVar2;
        y2cVar2.setSize(gl.L(20.0f));
        this.Z.setAlpha(0.0f);
        this.Z.setScaleX(0.1f);
        this.Z.setScaleY(0.1f);
        this.Z.setProgressColor(bkb.w0(null, i62, false));
        this.actionBar.addView(this.Z, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        D0();
        if (this.K) {
        }
        this.actionBar.setTitle(null);
        b3cVar = this.c0;
        TextView textView42 = this.d;
        if (b3cVar == null) {
        }
        z = this.K;
        View view2 = this.fragmentView;
        if (z) {
        }
        return this.fragmentView;
    }

    public final TLRPC.TL_inputCheckPasswordSRP d0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return mo9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == kk7.o0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            r0(null, false, false);
            D0();
        }
    }

    public final /* synthetic */ void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        if (this.Y < 0) {
            super.finishFragment();
            return;
        }
        Bundle l = ir2.l("afterSignup", true);
        ah6 ah6Var = new ah6();
        ah6Var.q0(l);
        presentFragment(ah6Var, true);
    }

    public final /* synthetic */ void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        return arrayList;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 6), 8);
            return;
        }
        s0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                A0(k96.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                A0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            this.J = null;
            this.L = new byte[0];
            kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
            kk7.f(this.currentAccount).k(kk7.p0, new Object[0]);
            finishFragment();
        }
    }

    public final /* synthetic */ void i0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = d0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t2c(this, (byte) 4), 10);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d;
    }

    public final void j0(int i) {
        if (i == this.P || i == this.changePasswordRow) {
            p3c p3cVar = new p3c(this.currentAccount, 0, this.J);
            p3cVar.K.add(this);
            p3cVar.H0(this.L, this.M, this.N, false);
            presentFragment(p3cVar);
            return;
        }
        byte b = 3;
        if (i == this.R || i == this.S) {
            p3c p3cVar2 = new p3c(this.currentAccount, 3, this.J);
            p3cVar2.K.add(this);
            p3cVar2.H0(this.L, this.M, this.N, true);
            presentFragment(p3cVar2);
            return;
        }
        if (i == this.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131743701, null);
            if (this.J.has_secure_values) {
                StringBuilder k = b00.k(M0, "\n\n");
                k.append(k96.M0(2131743702, null));
                M0 = k.toString();
            }
            String M02 = k96.M0(2131743700, null);
            String M03 = k96.M0(2131751423, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = M0;
            hdVar.S = M02;
            alertDialog$Builder.j(M03, new pz4(this, b));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    public final void k0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!a0(password, false)) {
                ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
                return;
            }
            if (!z || z2) {
                byte[] bArr = this.L;
                this.K = (bArr != null && bArr.length > 0) || !this.J.has_password;
            }
            e0(this.J);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        D0();
    }

    public final void l0(TLObject tLObject, TLRPC.TL_error tL_error) {
        s0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                A0(k96.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                A0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = this.J;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        z2c z2cVar = new z2c(this, this.currentAccount, password);
        z2cVar.K.add(this);
        z2cVar.H0(this.L, this.M, this.N, false);
        presentFragment(z2cVar);
    }

    public final void m0(byte[] bArr, boolean z) {
        if (this.c0 == null || !z) {
            s0();
        }
        if (!z) {
            ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
            return;
        }
        this.L = bArr;
        this.K = true;
        if (this.c0 != null) {
            gl.t1(this.s);
            this.c0.g(d0());
            return;
        }
        if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
            p3c p3cVar = new p3c(this.currentAccount, 5, this.J);
            p3cVar.H0(this.L, this.M, this.N, true);
            presentFragment(p3cVar, true);
            return;
        }
        gl.t1(this.s);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.K = true;
        twoStepVerificationActivity.L = this.L;
        twoStepVerificationActivity.J = this.J;
        twoStepVerificationActivity.N = this.N;
        twoStepVerificationActivity.M = this.M;
        presentFragment(twoStepVerificationActivity, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z;
        byte[] s;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            this.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z = false;
            Object[] objArr = 0;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s = Utilities.s(bArr3, bArr, bArr3);
                }
                gl.c3(new vj6((Object) this, z, (Object) bArr2, (byte) 27));
            }
            s = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            this.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s, 32, bArr5, 0, 16);
            byte[] bArr6 = this.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!vx7.R0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = d0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new ce2(objArr == true ? 1 : 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        gl.c3(new vj6((Object) this, z, (Object) bArr2, (byte) 27));
    }

    public final /* synthetic */ void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            x0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.Y < 0) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        B0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        ry8 ry8Var = this.c;
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                ry8Var.setVisibility(i);
            }
        }
        i = 8;
        ry8Var.setVisibility(i);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0(null);
        D0();
        kk7.f(this.currentAccount).b(this, kk7.o0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gl.r(this.d0);
        kk7.f(this.currentAccount).n(this, kk7.o0);
        this.I = true;
        hd hdVar = this.x;
        if (hdVar != null) {
            try {
                hdVar.dismiss();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.x = null;
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g24 g24Var = this.y;
            if (g24Var != null) {
                g24Var.setProgressBarColor(bkb.w0(null, bkb.g6, false));
            }
            wyb wybVar = this.G;
            if (wybVar != null) {
                wybVar.setColor(bkb.w0(null, bkb.N9, false));
            }
            y2c y2cVar = this.Z;
            if (y2cVar != null) {
                y2cVar.setProgressColor(bkb.w0(null, bkb.k6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            if (this.X) {
                v0();
                this.X = false;
            } else if (this.O) {
                y0();
                this.O = false;
            }
        }
    }

    public final void p0(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 5), 8);
            return;
        }
        s0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            u0(this.w, this.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            A0(k96.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            A0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public final /* synthetic */ void q0(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? mo9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        ck8 ck8Var = new ck8((Object) this, (Object) bArr, (Object) c, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            ck8Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = mo9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, ck8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        ck8Var.run(null, tL_error2);
    }

    public final void r0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            a3c a3cVar = this.a;
            if (a3cVar != null) {
                a3cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new n1b(this, z2, z, runnable), 10);
    }

    public final void s0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(s33.f);
            animatorSet.start();
            return;
        }
        hd hdVar = this.x;
        if (hdVar == null) {
            return;
        }
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.x = null;
    }

    public final void t0(boolean z) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<y2c, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(s33.f);
            animatorSet.start();
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        this.x = hdVar;
        hdVar.j0 = false;
        if (z) {
            hdVar.q(300L);
        } else {
            hdVar.show();
        }
    }

    public final void u0(er7 er7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        er7Var.a(1.0f);
        gl.A3(5.0f, er7Var, new u2c(this, (byte) 1));
    }

    public final void v0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            t0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t2c(this, (byte) 1), 10);
            return;
        }
        if (getParentActivity() != null) {
            if (this.J.pending_reset_date == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.j(k96.M0(2131745925, null), new pz4(this, (byte) 5));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                String M0 = k96.M0(2131745900, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745879, null);
                showDialog(hdVar);
                return;
            }
            if (getConnectionsManager().getCurrentTime() <= this.J.pending_reset_date) {
                b0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(k96.M0(2131745925, null), new pz4(this, (byte) 4));
            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
            String M02 = k96.M0(2131745900, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M02;
            hdVar2.U = k96.M0(2131745873, null);
            showDialog(hdVar2);
            TextView textView = (TextView) hdVar2.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    public final void w0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password == null || password.current_algo == null || (bArr = this.L) == null || bArr.length <= 0) {
            r0(runnable, true, password != null);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void x0() {
        if (this.K) {
            return;
        }
        String obj = this.s.getText().toString();
        if (obj.length() == 0) {
            u0(this.w, this.s, false);
            return;
        }
        byte[] g1 = gl.g1(obj);
        t0(false);
        Utilities.e.c(new a5b((Object) this, (Object) g1, (byte) 27));
    }

    public final void y0() {
        t0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t2c(this, (byte) 0));
    }

    public final void z0(TL_account.Password password, byte[] bArr, long j, byte[] bArr2) {
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j;
        this.K = (bArr != null && bArr.length > 0) || !password.has_password;
    }
}
