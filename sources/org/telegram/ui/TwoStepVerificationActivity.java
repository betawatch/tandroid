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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public ScrollView E;
    public wp4 F;
    public x0c G;
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
    public final u4c W;
    public boolean X;
    public int Y;
    public z4c Z;
    public b5c a;
    public byte a0;
    public r59 b;
    public String b0;
    public s09 c;
    public c5c c0;
    private int changePasswordRow;
    public TextView d;
    public final u4c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public lka n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public gt7 w;
    public he x;
    public r34 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u4c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u4c(this, (byte) 3);
    }

    public static boolean b0(TL_account.Password password, boolean z) {
        return z ? !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) : ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void f0(TL_account.Password password) {
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

    public final void A0(TL_account.Password password, byte[] bArr, long j, byte[] bArr2) {
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j;
        this.K = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        showDialog(heVar);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131742611, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(jb6.M0(2131743620, null), null);
        alertDialog$Builder.g(jb6.M0(2131750526, null), new o15(this, (byte) 1));
        anb.X((TextView) alertDialog$Builder.o().c(-2), cmb.p7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        TextView textView;
        if (this.K) {
            return;
        }
        int i = this.J.pending_reset_date;
        u4c u4cVar = this.d0;
        if (i != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i2 = this.J.pending_reset_date;
            if (currentTime <= i2) {
                int max = Math.max(1, i2 - getConnectionsManager().getCurrentTime());
                this.h.setText(jb6.a0("RestorePasswordResetIn", null, 2131745802, max > 86400 ? jb6.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? jb6.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                anb.X(this.h, cmb.C6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                gm.r(u4cVar);
                gm.d3(u4cVar, 1000L);
                if (this.J == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                gm.r(u4cVar);
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
        lka lkaVar = this.n;
        if (i3 == 0) {
            lkaVar.l(jb6.M0(2131750523, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            lkaVar.l(jb6.M0(2131745826, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        anb.W(this.n, cmb.p6, null);
        gm.r(u4cVar);
        if (this.J == null) {
        }
        gm.r(u4cVar);
        textView = this.r;
        if (textView == null) {
        }
    }

    public final void E0() {
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
                r59 r59Var = this.b;
                if (r59Var != null) {
                    r59Var.setVisibility(0);
                    this.E.setVisibility(4);
                    this.b.setEmptyView(this.y);
                }
                if (this.s != null) {
                    this.F.e(false, false);
                    this.s.setVisibility(4);
                    this.d.setVisibility(4);
                    this.f.setVisibility(8);
                    this.n.setVisibility(4);
                    D0();
                }
                View view = this.fragmentView;
                int i = cmb.Z6;
                anb.h(i, null, view);
                this.fragmentView.setTag(Integer.valueOf(i));
                return;
            }
            r59 r59Var2 = this.b;
            if (r59Var2 != null) {
                r59Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.E.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.F.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i2 = cmb.c6;
                anb.h(i2, null, view2);
                this.fragmentView.setTag(Integer.valueOf(i2));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                D0();
                this.f.setVisibility(8);
                boolean isEmpty = TextUtils.isEmpty(this.J.hint);
                EditTextBoldCursor editTextBoldCursor = this.s;
                if (isEmpty) {
                    editTextBoldCursor.setHint((CharSequence) null);
                } else {
                    editTextBoldCursor.setHint(this.J.hint);
                }
                gm.d3(new u4c(this, b), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131752528, null), new o15(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752529, null), null);
        String M0 = jb6.M0(2131752524, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752530, null);
        showDialog(heVar);
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
        c5c c5cVar;
        boolean z;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final byte b2 = 1;
        if (!this.K || this.c0 != null) {
            anb.h(cmb.c6, null, this.actionBar);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i2 = cmb.F6;
            anb.l(aVar, 5, i2, null);
            anb.l(this.actionBar, 1, i2, null);
            anb.l(this.actionBar, 3, cmb.t8, null);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i3 = cmb.c6;
        anb.h(i3, null, frameLayout);
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.E, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.E.addView(linearLayout, qoe.x(-1, -2, 51));
        s09 s09Var = new s09(context);
        this.c = s09Var;
        s09Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        s09 s09Var2 = this.c;
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                s09Var2.setVisibility(i);
                linearLayout.addView(this.c, qoe.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i4 = cmb.F6;
                anb.X(textView, i4, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(gm.o());
                TextView m = wi8.m(linearLayout, this.d, qoe.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = m;
                int i5 = cmb.C6;
                anb.X(m, i5, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, qoe.t(-2, -2, 1, 42, 8, 42, 0));
                gt7 gt7Var = new gt7(context, null);
                this.w = gt7Var;
                gt7Var.setText(jb6.M0(2131751053, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, qoe.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                anb.X(this.s, i4, null);
                anb.D(this.s, cmb.G6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(nm7.M1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i6 = cmb.k6;
                anb.v(editTextBoldCursor2, i6, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(jb6.M0(2131751053, null));
                int L = gm.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, qoe.c(-2.0f, -1));
                this.w.e(this.s);
                this.s.setOnFocusChangeListener(new tt0(this, (byte) 19));
                this.s.setOnEditorActionListener(new j(this, (byte) 28));
                this.s.addTextChangedListener(new og6(this, (byte) 21));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                anb.X(textView2, i5, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!jb6.a0 ? 5 : 3) | 48);
                this.f.setText(jb6.M0(2131742481, null));
                TextView m2 = wi8.m(linearLayout, this.f, qoe.t(-2, -2, (!jb6.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = m2;
                anb.X(m2, i5, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!jb6.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, qoe.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, qoe.l(1.0f, -1, 0));
                lka lkaVar = new lka(context);
                this.n = lkaVar;
                lkaVar.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
                frameLayout.addView(this.n, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                                twoStepVerificationActivity.w0();
                                break;
                            case 1:
                                twoStepVerificationActivity.c0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                wm9.c(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
                this.r.setText(jb6.M0(2131752524, null));
                anb.X(this.r, cmb.p6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                                twoStepVerificationActivity.w0();
                                break;
                            case 1:
                                twoStepVerificationActivity.c0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                wm9.c(this.r);
                wp4 wp4Var = new wp4(this.resourceProvider, context, false);
                this.F = wp4Var;
                wm9.c(wp4Var);
                final byte b3 = 2;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                                twoStepVerificationActivity.w0();
                                break;
                            case 1:
                                twoStepVerificationActivity.c0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                x0c x0cVar = new x0c(context);
                this.G = x0cVar;
                x0cVar.setTransformType(1);
                this.G.setProgress(0.0f);
                this.G.setColor(cmb.w0(null, cmb.N9, false));
                this.G.setDrawBackground(false);
                this.F.setContentDescription(jb6.M0(2131747984, null));
                this.F.addView(this.G, qoe.e(56, 56, 17));
                this.F.a(this.G);
                frameLayout.addView(this.F, wp4.b());
                r34 r34Var = new r34(context, null);
                this.y = r34Var;
                r34Var.b();
                frameLayout.addView(this.y, qoe.c(-1.0f, -1));
                r59 r59Var = new r59(context, null);
                this.b = r59Var;
                r59Var.setSections(true);
                this.b.setLayoutManager(new u46(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, qoe.c(-1.0f, -1));
                r59 r59Var2 = this.b;
                b5c b5cVar = new b5c(this, context);
                this.a = b5cVar;
                r59Var2.setAdapter(b5cVar);
                this.b.setOnItemClickListener(new s19(this, (byte) 29));
                z4c z4cVar = new z4c(context, null);
                this.Z = z4cVar;
                z4cVar.setSize(gm.L(20.0f));
                this.Z.setAlpha(0.0f);
                this.Z.setScaleX(0.1f);
                this.Z.setScaleY(0.1f);
                this.Z.setProgressColor(cmb.w0(null, i6, false));
                this.actionBar.addView(this.Z, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.K || this.c0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(jb6.M0(2131743618, null));
                }
                c5cVar = this.c0;
                TextView textView4 = this.d;
                if (c5cVar == null) {
                    textView4.setText(jb6.M0(2131742468, null));
                    byte b4 = this.a0;
                    if (b4 == 1) {
                        this.e.setText(jb6.M0(2131746946, null));
                    } else {
                        TextView textView5 = this.e;
                        if (b4 == 2) {
                            hg9.q(null, null, 2131746949, new Object[]{this.b0}, textView5);
                        } else if (b4 == 3) {
                            hg9.q(null, null, 2131746948, new Object[]{this.b0}, textView5);
                        } else {
                            textView5.setText(jb6.M0(2131746947, null));
                        }
                    }
                    this.e.setVisibility(0);
                } else {
                    textView4.setText(jb6.M0(2131742468, null));
                    this.e.setVisibility(0);
                    this.e.setText(jb6.M0(2131748481, null));
                }
                z = this.K;
                View view = this.fragmentView;
                if (z) {
                    anb.h(i3, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i3));
                } else {
                    int i7 = cmb.Z6;
                    anb.h(i7, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i7));
                }
                return this.fragmentView;
            }
        }
        i = 8;
        s09Var2.setVisibility(i);
        linearLayout.addView(this.c, qoe.r(100, 100, 1));
        TextView textView6 = new TextView(context);
        this.d = textView6;
        int i42 = cmb.F6;
        anb.X(textView6, i42, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(gm.o());
        TextView m3 = wi8.m(linearLayout, this.d, qoe.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = m3;
        int i52 = cmb.C6;
        anb.X(m3, i52, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, qoe.t(-2, -2, 1, 42, 8, 42, 0));
        gt7 gt7Var2 = new gt7(context, null);
        this.w = gt7Var2;
        gt7Var2.setText(jb6.M0(2131751053, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, qoe.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        anb.X(this.s, i42, null);
        anb.D(this.s, cmb.G6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(nm7.M1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i62 = cmb.k6;
        anb.v(editTextBoldCursor22, i62, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(jb6.M0(2131751053, null));
        int L2 = gm.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, qoe.c(-2.0f, -1));
        this.w.e(this.s);
        this.s.setOnFocusChangeListener(new tt0(this, (byte) 19));
        this.s.setOnEditorActionListener(new j(this, (byte) 28));
        this.s.addTextChangedListener(new og6(this, (byte) 21));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        anb.X(textView22, i52, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!jb6.a0 ? 5 : 3) | 48);
        this.f.setText(jb6.M0(2131742481, null));
        TextView m22 = wi8.m(linearLayout, this.f, qoe.t(-2, -2, (!jb6.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = m22;
        anb.X(m22, i52, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!jb6.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, qoe.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, qoe.l(1.0f, -1, 0));
        lka lkaVar2 = new lka(context);
        this.n = lkaVar2;
        lkaVar2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        frameLayout.addView(this.n, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                        twoStepVerificationActivity.w0();
                        break;
                    case 1:
                        twoStepVerificationActivity.c0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        wm9.c(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.r.setText(jb6.M0(2131752524, null));
        anb.X(this.r, cmb.p6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                        twoStepVerificationActivity.w0();
                        break;
                    case 1:
                        twoStepVerificationActivity.c0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        wm9.c(this.r);
        wp4 wp4Var2 = new wp4(this.resourceProvider, context, false);
        this.F = wp4Var2;
        wm9.c(wp4Var2);
        final byte b32 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: y4c
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
                        twoStepVerificationActivity.w0();
                        break;
                    case 1:
                        twoStepVerificationActivity.c0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        x0c x0cVar2 = new x0c(context);
        this.G = x0cVar2;
        x0cVar2.setTransformType(1);
        this.G.setProgress(0.0f);
        this.G.setColor(cmb.w0(null, cmb.N9, false));
        this.G.setDrawBackground(false);
        this.F.setContentDescription(jb6.M0(2131747984, null));
        this.F.addView(this.G, qoe.e(56, 56, 17));
        this.F.a(this.G);
        frameLayout.addView(this.F, wp4.b());
        r34 r34Var2 = new r34(context, null);
        this.y = r34Var2;
        r34Var2.b();
        frameLayout.addView(this.y, qoe.c(-1.0f, -1));
        r59 r59Var3 = new r59(context, null);
        this.b = r59Var3;
        r59Var3.setSections(true);
        this.b.setLayoutManager(new u46(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        r59 r59Var22 = this.b;
        b5c b5cVar2 = new b5c(this, context);
        this.a = b5cVar2;
        r59Var22.setAdapter(b5cVar2);
        this.b.setOnItemClickListener(new s19(this, (byte) 29));
        z4c z4cVar2 = new z4c(context, null);
        this.Z = z4cVar2;
        z4cVar2.setSize(gm.L(20.0f));
        this.Z.setAlpha(0.0f);
        this.Z.setScaleX(0.1f);
        this.Z.setScaleY(0.1f);
        this.Z.setProgressColor(cmb.w0(null, i62, false));
        this.actionBar.addView(this.Z, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        E0();
        if (this.K) {
        }
        this.actionBar.setTitle(null);
        c5cVar = this.c0;
        TextView textView42 = this.d;
        if (c5cVar == null) {
        }
        z = this.K;
        View view2 = this.fragmentView;
        if (z) {
        }
        return this.fragmentView;
    }

    public final void d0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        z8c.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new x4c(this, updatepasswordsettings, (byte) 0));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == nm7.p0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    public final TLRPC.TL_inputCheckPasswordSRP e0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return nq9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        if (this.Y < 0) {
            super.finishFragment();
            return;
        }
        Bundle l = ts2.l("afterSignup", true);
        bj6 bj6Var = new bj6();
        bj6Var.n0(l);
        presentFragment(bj6Var, true);
    }

    public final /* synthetic */ void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            d0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        arrayList.add(new cnb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        return arrayList;
    }

    public final /* synthetic */ void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            d0();
        }
    }

    public final void i0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 6), 8);
            return;
        }
        t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                B0(jb6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                B0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            this.J = null;
            this.L = new byte[0];
            nm7.f(this.currentAccount).k(nm7.r0, new Object[0]);
            nm7.f(this.currentAccount).k(nm7.q0, new Object[0]);
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    public final /* synthetic */ void j0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = e0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t4c(this, (byte) 4), 10);
    }

    public final void k0(int i) {
        if (i == this.P || i == this.changePasswordRow) {
            p5c p5cVar = new p5c(this.currentAccount, 0, this.J);
            p5cVar.K.add(this);
            p5cVar.I0(this.L, this.M, this.N, false);
            presentFragment(p5cVar);
            return;
        }
        byte b = 3;
        if (i == this.R || i == this.S) {
            p5c p5cVar2 = new p5c(this.currentAccount, 3, this.J);
            p5cVar2.K.add(this);
            p5cVar2.I0(this.L, this.M, this.N, true);
            presentFragment(p5cVar2);
            return;
        }
        if (i == this.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131743627, null);
            if (this.J.has_secure_values) {
                StringBuilder k = b10.k(M0, "\n\n");
                k.append(jb6.M0(2131743628, null));
                M0 = k.toString();
            }
            String M02 = jb6.M0(2131743626, null);
            String M03 = jb6.M0(2131751372, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            heVar.S = M02;
            alertDialog$Builder.j(M03, new o15(this, b));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }

    public final void l0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!b0(password, false)) {
                ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
                return;
            }
            if (!z || z2) {
                byte[] bArr = this.L;
                this.K = (bArr != null && bArr.length > 0) || !this.J.has_password;
            }
            f0(this.J);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        E0();
    }

    public final void m0(TLObject tLObject, TLRPC.TL_error tL_error) {
        t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                B0(jb6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                B0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = this.J;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        a5c a5cVar = new a5c(this, this.currentAccount, password);
        a5cVar.K.add(this);
        a5cVar.I0(this.L, this.M, this.N, false);
        presentFragment(a5cVar);
    }

    public final void n0(byte[] bArr, boolean z) {
        if (this.c0 == null || !z) {
            t0();
        }
        if (!z) {
            ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
            return;
        }
        this.L = bArr;
        this.K = true;
        if (this.c0 != null) {
            gm.t1(this.s);
            this.c0.h(e0());
            return;
        }
        if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
            p5c p5cVar = new p5c(this.currentAccount, 5, this.J);
            p5cVar.I0(this.L, this.M, this.N, true);
            presentFragment(p5cVar, true);
            return;
        }
        gm.t1(this.s);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.K = true;
        twoStepVerificationActivity.L = this.L;
        twoStepVerificationActivity.J = this.J;
        twoStepVerificationActivity.N = this.N;
        twoStepVerificationActivity.M = this.M;
        presentFragment(twoStepVerificationActivity, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(byte[] bArr, TLObject tLObject, byte[] bArr2) {
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
                gm.c3(new yl6((Object) this, z, (Object) bArr2, (byte) 27));
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
            if (!xz7.S0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = e0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new nf2(objArr == true ? 1 : 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        gm.c3(new yl6((Object) this, z, (Object) bArr2, (byte) 27));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.Y < 0) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        C0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        s09 s09Var = this.c;
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                s09Var.setVisibility(i);
            }
        }
        i = 8;
        s09Var.setVisibility(i);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        nm7.f(this.currentAccount).b(this, nm7.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gm.r(this.d0);
        nm7.f(this.currentAccount).n(this, nm7.p0);
        this.I = true;
        he heVar = this.x;
        if (heVar != null) {
            try {
                heVar.dismiss();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.x = null;
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r34 r34Var = this.y;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
            x0c x0cVar = this.G;
            if (x0cVar != null) {
                x0cVar.setColor(cmb.w0(null, cmb.N9, false));
            }
            z4c z4cVar = this.Z;
            if (z4cVar != null) {
                z4cVar.setProgressColor(cmb.w0(null, cmb.k6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            if (this.X) {
                w0();
                this.X = false;
            } else if (this.O) {
                z0();
                this.O = false;
            }
        }
    }

    public final /* synthetic */ void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            y0();
        }
    }

    public final void q0(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 5), 8);
            return;
        }
        t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            v0(this.w, this.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            B0(jb6.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            B0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public final /* synthetic */ void r0(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? nq9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        fm8 fm8Var = new fm8((Object) this, (Object) bArr, (Object) c, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            fm8Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = nq9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, fm8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        fm8Var.run(null, tL_error2);
    }

    public final void s0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            b5c b5cVar = this.a;
            if (b5cVar != null) {
                b5cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new p3b(this, z2, z, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(d53.f);
            animatorSet.start();
            return;
        }
        he heVar = this.x;
        if (heVar == null) {
            return;
        }
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.x = null;
    }

    public final void u0(boolean z) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<z4c, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(d53.f);
            animatorSet.start();
            return;
        }
        he heVar = new he(3, null, getParentActivity());
        this.x = heVar;
        heVar.j0 = false;
        if (z) {
            heVar.q(300L);
        } else {
            heVar.show();
        }
    }

    public final void v0(gt7 gt7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
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
        gt7Var.a(1.0f);
        gm.A3(5.0f, gt7Var, new u4c(this, (byte) 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t4c(this, (byte) 1), 10);
            return;
        }
        if (getParentActivity() != null) {
            if (this.J.pending_reset_date == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.j(jb6.M0(2131745851, null), new o15(this, (byte) 5));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                String M0 = jb6.M0(2131745826, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745805, null);
                showDialog(heVar);
                return;
            }
            if (getConnectionsManager().getCurrentTime() <= this.J.pending_reset_date) {
                c0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(jb6.M0(2131745851, null), new o15(this, (byte) 4));
            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
            String M02 = jb6.M0(2131745826, null);
            he heVar2 = alertDialog$Builder2.a;
            heVar2.S = M02;
            heVar2.U = jb6.M0(2131745799, null);
            showDialog(heVar2);
            TextView textView = (TextView) heVar2.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }

    public final void x0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password == null || password.current_algo == null || (bArr = this.L) == null || bArr.length <= 0) {
            s0(runnable, true, password != null);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void y0() {
        if (this.K) {
            return;
        }
        String obj = this.s.getText().toString();
        if (obj.length() == 0) {
            v0(this.w, this.s, false);
            return;
        }
        byte[] g1 = gm.g1(obj);
        u0(false);
        Utilities.e.c(new b7b((Object) this, (Object) g1, (byte) 29));
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t4c(this, (byte) 0));
    }
}
