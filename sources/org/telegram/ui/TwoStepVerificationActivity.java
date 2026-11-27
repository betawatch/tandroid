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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public ScrollView E;
    public zp4 F;
    public w2c G;
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
    public final u6c W;
    public boolean X;
    public int Y;
    public y6c Z;
    public a7c a;
    public byte a0;
    public d79 b;
    public String b0;
    public e29 c;
    public b7c c0;
    private int changePasswordRow;
    public TextView d;
    public final u6c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public ema n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public lu7 w;
    public id x;
    public b34 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u6c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u6c(this, (byte) 3);
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
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        showDialog(idVar);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131742579, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(ob6.M0(2131743588, null), null);
        alertDialog$Builder.g(ob6.M0(2131750554, null), new t15(this, (byte) 1));
        yob.X((TextView) alertDialog$Builder.o().c(-2), aob.q7, null);
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
        u6c u6cVar = this.d0;
        if (i != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i2 = this.J.pending_reset_date;
            if (currentTime <= i2) {
                int max = Math.max(1, i2 - getConnectionsManager().getCurrentTime());
                this.h.setText(ob6.a0("RestorePasswordResetIn", null, 2131745796, max > 86400 ? ob6.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? ob6.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                yob.X(this.h, aob.D6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                hl.r(u6cVar);
                hl.d3(u6cVar, 1000L);
                if (this.J == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                hl.r(u6cVar);
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
        ema emaVar = this.n;
        if (i3 == 0) {
            emaVar.l(ob6.M0(2131750551, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            emaVar.l(ob6.M0(2131745820, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        yob.W(this.n, aob.q6, null);
        hl.r(u6cVar);
        if (this.J == null) {
        }
        hl.r(u6cVar);
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
                d79 d79Var = this.b;
                if (d79Var != null) {
                    d79Var.setVisibility(0);
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
                int i = aob.a7;
                yob.h(i, null, view);
                this.fragmentView.setTag(Integer.valueOf(i));
                return;
            }
            d79 d79Var2 = this.b;
            if (d79Var2 != null) {
                d79Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.E.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.F.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i2 = aob.d6;
                yob.h(i2, null, view2);
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
                hl.d3(new u6c(this, b), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131752556, null), new t15(this, (byte) 2));
        alertDialog$Builder.g(ob6.M0(2131752557, null), null);
        String M0 = ob6.M0(2131752552, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752558, null);
        showDialog(idVar);
    }

    public final void c0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        yac.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        t0(false);
        Utilities.e.c(new bcb((Object) this, (Object) updatepasswordsettings, (byte) 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fc  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        b7c b7cVar;
        boolean z;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final byte b2 = 1;
        if (!this.K || this.c0 != null) {
            yob.h(aob.d6, null, this.actionBar);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i2 = aob.G6;
            yob.l(aVar, 5, i2, null);
            yob.l(this.actionBar, 1, i2, null);
            yob.l(this.actionBar, 3, aob.u8, null);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 24));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i3 = aob.d6;
        yob.h(i3, null, frameLayout);
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.E, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.E.addView(linearLayout, tre.x(-1, -2, 51));
        e29 e29Var = new e29(context);
        this.c = e29Var;
        e29Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        e29 e29Var2 = this.c;
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                e29Var2.setVisibility(i);
                linearLayout.addView(this.c, tre.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i4 = aob.G6;
                yob.X(textView, i4, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(hl.o());
                TextView m = ik8.m(linearLayout, this.d, tre.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = m;
                int i5 = aob.D6;
                yob.X(m, i5, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, tre.t(-2, -2, 1, 42, 8, 42, 0));
                lu7 lu7Var = new lu7(context, null);
                this.w = lu7Var;
                lu7Var.setText(ob6.M0(2131751081, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, tre.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                yob.X(this.s, i4, null);
                yob.D(this.s, aob.H6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(jn7.M1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i6 = aob.l6;
                yob.v(editTextBoldCursor2, i6, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(ob6.M0(2131751081, null));
                int L = hl.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, tre.c(-2.0f, -1));
                this.w.e(this.s);
                this.s.setOnFocusChangeListener(new ts0(this, (byte) 20));
                this.s.setOnEditorActionListener(new j(this, (byte) 27));
                this.s.addTextChangedListener(new nh6(this, (byte) 21));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                yob.X(textView2, i5, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!ob6.a0 ? 5 : 3) | 48);
                this.f.setText(ob6.M0(2131742449, null));
                TextView m2 = ik8.m(linearLayout, this.f, tre.t(-2, -2, (!ob6.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = m2;
                yob.X(m2, i5, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!ob6.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, tre.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, tre.l(1.0f, -1, 0));
                ema emaVar = new ema(context);
                this.n = emaVar;
                emaVar.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
                frameLayout.addView(this.n, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                ko9.e(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
                this.r.setText(ob6.M0(2131752552, null));
                yob.X(this.r, aob.q6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                ko9.e(this.r);
                zp4 zp4Var = new zp4(this.resourceProvider, context, false);
                this.F = zp4Var;
                ko9.e(zp4Var);
                final byte b3 = 2;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                                twoStepVerificationActivity.b0();
                                break;
                            default:
                                twoStepVerificationActivity.y0();
                                break;
                        }
                    }
                });
                w2c w2cVar = new w2c(context);
                this.G = w2cVar;
                w2cVar.setTransformType(1);
                this.G.setProgress(0.0f);
                this.G.setColor(aob.w0(null, aob.O9, false));
                this.G.setDrawBackground(false);
                this.F.setContentDescription(ob6.M0(2131747981, null));
                this.F.addView(this.G, tre.e(56, 56, 17));
                this.F.a(this.G);
                frameLayout.addView(this.F, zp4.b());
                b34 b34Var = new b34(context, null);
                this.y = b34Var;
                b34Var.b();
                frameLayout.addView(this.y, tre.c(-1.0f, -1));
                d79 d79Var = new d79(context, null);
                this.b = d79Var;
                d79Var.setSections(true);
                this.b.setLayoutManager(new x46(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, tre.c(-1.0f, -1));
                d79 d79Var2 = this.b;
                a7c a7cVar = new a7c(this, context);
                this.a = a7cVar;
                d79Var2.setAdapter(a7cVar);
                this.b.setOnItemClickListener(new t39(this, (byte) 28));
                y6c y6cVar = new y6c(context, null);
                this.Z = y6cVar;
                y6cVar.setSize(hl.L(20.0f));
                this.Z.setAlpha(0.0f);
                this.Z.setScaleX(0.1f);
                this.Z.setScaleY(0.1f);
                this.Z.setProgressColor(aob.w0(null, i6, false));
                this.actionBar.addView(this.Z, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.K || this.c0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(ob6.M0(2131743586, null));
                }
                b7cVar = this.c0;
                TextView textView4 = this.d;
                if (b7cVar == null) {
                    textView4.setText(ob6.M0(2131742436, null));
                    byte b4 = this.a0;
                    if (b4 == 1) {
                        this.e.setText(ob6.M0(2131746940, null));
                    } else {
                        TextView textView5 = this.e;
                        if (b4 == 2) {
                            uh9.r(null, null, 2131746943, new Object[]{this.b0}, textView5);
                        } else if (b4 == 3) {
                            uh9.r(null, null, 2131746942, new Object[]{this.b0}, textView5);
                        } else {
                            textView5.setText(ob6.M0(2131746941, null));
                        }
                    }
                    this.e.setVisibility(0);
                } else {
                    textView4.setText(ob6.M0(2131742436, null));
                    this.e.setVisibility(0);
                    this.e.setText(ob6.M0(2131748478, null));
                }
                z = this.K;
                View view = this.fragmentView;
                if (z) {
                    yob.h(i3, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i3));
                } else {
                    int i7 = aob.a7;
                    yob.h(i7, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i7));
                }
                return this.fragmentView;
            }
        }
        i = 8;
        e29Var2.setVisibility(i);
        linearLayout.addView(this.c, tre.r(100, 100, 1));
        TextView textView6 = new TextView(context);
        this.d = textView6;
        int i42 = aob.G6;
        yob.X(textView6, i42, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(hl.o());
        TextView m3 = ik8.m(linearLayout, this.d, tre.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = m3;
        int i52 = aob.D6;
        yob.X(m3, i52, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, tre.t(-2, -2, 1, 42, 8, 42, 0));
        lu7 lu7Var2 = new lu7(context, null);
        this.w = lu7Var2;
        lu7Var2.setText(ob6.M0(2131751081, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, tre.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        yob.X(this.s, i42, null);
        yob.D(this.s, aob.H6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(jn7.M1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i62 = aob.l6;
        yob.v(editTextBoldCursor22, i62, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(ob6.M0(2131751081, null));
        int L2 = hl.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, tre.c(-2.0f, -1));
        this.w.e(this.s);
        this.s.setOnFocusChangeListener(new ts0(this, (byte) 20));
        this.s.setOnEditorActionListener(new j(this, (byte) 27));
        this.s.addTextChangedListener(new nh6(this, (byte) 21));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        yob.X(textView22, i52, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!ob6.a0 ? 5 : 3) | 48);
        this.f.setText(ob6.M0(2131742449, null));
        TextView m22 = ik8.m(linearLayout, this.f, tre.t(-2, -2, (!ob6.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = m22;
        yob.X(m22, i52, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!ob6.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, tre.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, tre.l(1.0f, -1, 0));
        ema emaVar2 = new ema(context);
        this.n = emaVar2;
        emaVar2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        frameLayout.addView(this.n, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        ko9.e(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.r.setText(ob6.M0(2131752552, null));
        yob.X(this.r, aob.q6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        ko9.e(this.r);
        zp4 zp4Var2 = new zp4(this.resourceProvider, context, false);
        this.F = zp4Var2;
        ko9.e(zp4Var2);
        final byte b32 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: x6c
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
                        twoStepVerificationActivity.b0();
                        break;
                    default:
                        twoStepVerificationActivity.y0();
                        break;
                }
            }
        });
        w2c w2cVar2 = new w2c(context);
        this.G = w2cVar2;
        w2cVar2.setTransformType(1);
        this.G.setProgress(0.0f);
        this.G.setColor(aob.w0(null, aob.O9, false));
        this.G.setDrawBackground(false);
        this.F.setContentDescription(ob6.M0(2131747981, null));
        this.F.addView(this.G, tre.e(56, 56, 17));
        this.F.a(this.G);
        frameLayout.addView(this.F, zp4.b());
        b34 b34Var2 = new b34(context, null);
        this.y = b34Var2;
        b34Var2.b();
        frameLayout.addView(this.y, tre.c(-1.0f, -1));
        d79 d79Var3 = new d79(context, null);
        this.b = d79Var3;
        d79Var3.setSections(true);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        d79 d79Var22 = this.b;
        a7c a7cVar2 = new a7c(this, context);
        this.a = a7cVar2;
        d79Var22.setAdapter(a7cVar2);
        this.b.setOnItemClickListener(new t39(this, (byte) 28));
        y6c y6cVar2 = new y6c(context, null);
        this.Z = y6cVar2;
        y6cVar2.setSize(hl.L(20.0f));
        this.Z.setAlpha(0.0f);
        this.Z.setScaleX(0.1f);
        this.Z.setScaleY(0.1f);
        this.Z.setProgressColor(aob.w0(null, i62, false));
        this.actionBar.addView(this.Z, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        E0();
        if (this.K) {
        }
        this.actionBar.setTitle(null);
        b7cVar = this.c0;
        TextView textView42 = this.d;
        if (b7cVar == null) {
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
        return es9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == jn7.p0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            r0(null, false, false);
            E0();
        }
    }

    public final /* synthetic */ void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void finishFragment() {
        if (this.Y < 0) {
            super.finishFragment();
            return;
        }
        Bundle l = bs2.l("afterSignup", true);
        fj6 fj6Var = new fj6();
        fj6Var.s0(l);
        presentFragment(fj6Var, true);
    }

    public final /* synthetic */ void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
        arrayList.add(new apb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        return arrayList;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 6), 8);
            return;
        }
        s0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                B0(ob6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                B0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            this.J = null;
            this.L = new byte[0];
            jn7.f(this.currentAccount).k(jn7.r0, new Object[0]);
            jn7.f(this.currentAccount).k(jn7.q0, new Object[0]);
            finishFragment();
        }
    }

    public final /* synthetic */ void i0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = d0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t6c(this, (byte) 4), 10);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    public final void j0(int i) {
        if (i == this.P || i == this.changePasswordRow) {
            o7c o7cVar = new o7c(this.currentAccount, 0, this.J);
            o7cVar.K.add(this);
            o7cVar.I0(this.L, this.M, this.N, false);
            presentFragment(o7cVar);
            return;
        }
        byte b = 3;
        if (i == this.R || i == this.S) {
            o7c o7cVar2 = new o7c(this.currentAccount, 3, this.J);
            o7cVar2.K.add(this);
            o7cVar2.I0(this.L, this.M, this.N, true);
            presentFragment(o7cVar2);
            return;
        }
        if (i == this.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131743595, null);
            if (this.J.has_secure_values) {
                StringBuilder l = c00.l(M0, "\n\n");
                l.append(ob6.M0(2131743596, null));
                M0 = l.toString();
            }
            String M02 = ob6.M0(2131743594, null);
            String M03 = ob6.M0(2131751400, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = M02;
            alertDialog$Builder.j(M03, new t15(this, b));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }

    public final void k0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!a0(password, false)) {
                jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
                return;
            }
            if (!z || z2) {
                byte[] bArr = this.L;
                this.K = (bArr != null && bArr.length > 0) || !this.J.has_password;
            }
            e0(this.J);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        E0();
    }

    public final void l0(TLObject tLObject, TLRPC.TL_error tL_error) {
        s0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                B0(ob6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                B0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = this.J;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        z6c z6cVar = new z6c(this, this.currentAccount, password);
        z6cVar.K.add(this);
        z6cVar.I0(this.L, this.M, this.N, false);
        presentFragment(z6cVar);
    }

    public final void m0(byte[] bArr, boolean z) {
        if (this.c0 == null || !z) {
            s0();
        }
        if (!z) {
            jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
            return;
        }
        this.L = bArr;
        this.K = true;
        if (this.c0 != null) {
            hl.t1(this.s);
            this.c0.h(d0());
            return;
        }
        if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
            o7c o7cVar = new o7c(this.currentAccount, 5, this.J);
            o7cVar.I0(this.L, this.M, this.N, true);
            presentFragment(o7cVar, true);
            return;
        }
        hl.t1(this.s);
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
                hl.c3(new yn6((Object) this, z, (Object) bArr2, (byte) 26));
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
            if (!b18.S0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new xe2(objArr == true ? 1 : 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        hl.c3(new yn6((Object) this, z, (Object) bArr2, (byte) 26));
    }

    public final /* synthetic */ void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            y0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        e29 e29Var = this.c;
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                e29Var.setVisibility(i);
            }
        }
        i = 8;
        e29Var.setVisibility(i);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        jn7.f(this.currentAccount).b(this, jn7.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hl.r(this.d0);
        jn7.f(this.currentAccount).n(this, jn7.p0);
        this.I = true;
        id idVar = this.x;
        if (idVar != null) {
            try {
                idVar.dismiss();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.x = null;
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            b34 b34Var = this.y;
            if (b34Var != null) {
                b34Var.setProgressBarColor(aob.w0(null, aob.h6, false));
            }
            w2c w2cVar = this.G;
            if (w2cVar != null) {
                w2cVar.setColor(aob.w0(null, aob.O9, false));
            }
            y6c y6cVar = this.Z;
            if (y6cVar != null) {
                y6cVar.setProgressColor(aob.w0(null, aob.l6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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

    public final void p0(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 5), 8);
            return;
        }
        s0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            u0(this.w, this.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            B0(ob6.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            B0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public final /* synthetic */ void q0(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? es9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        qn8 qn8Var = new qn8((Object) this, (Object) bArr, (Object) c, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            qn8Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = es9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, qn8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        qn8Var.run(null, tL_error2);
    }

    public final void r0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            a7c a7cVar = this.a;
            if (a7cVar != null) {
                a7cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new k5b(this, z2, z, runnable), 10);
    }

    public final void s0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(k43.f);
            animatorSet.start();
            return;
        }
        id idVar = this.x;
        if (idVar == null) {
            return;
        }
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.x = null;
    }

    public final void t0(boolean z) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<y6c, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(k43.f);
            animatorSet.start();
            return;
        }
        id idVar = new id(3, null, getParentActivity());
        this.x = idVar;
        idVar.j0 = false;
        if (z) {
            idVar.q(300L);
        } else {
            idVar.show();
        }
    }

    public final void u0(lu7 lu7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
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
        lu7Var.a(1.0f);
        hl.A3(5.0f, lu7Var, new u6c(this, (byte) 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            t0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t6c(this, (byte) 1), 10);
            return;
        }
        if (getParentActivity() != null) {
            if (this.J.pending_reset_date == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.j(ob6.M0(2131745845, null), new t15(this, (byte) 5));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                String M0 = ob6.M0(2131745820, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745799, null);
                showDialog(idVar);
                return;
            }
            if (getConnectionsManager().getCurrentTime() <= this.J.pending_reset_date) {
                b0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(ob6.M0(2131745845, null), new t15(this, (byte) 4));
            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            String M02 = ob6.M0(2131745820, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M02;
            idVar2.U = ob6.M0(2131745793, null);
            showDialog(idVar2);
            TextView textView = (TextView) idVar2.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }

    public final void x0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password == null || password.current_algo == null || (bArr = this.L) == null || bArr.length <= 0) {
            r0(runnable, true, password != null);
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
            u0(this.w, this.s, false);
            return;
        }
        byte[] g1 = hl.g1(obj);
        t0(false);
        Utilities.e.c(new bcb((Object) this, (Object) g1, (byte) 24));
    }

    public final void z0() {
        t0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t6c(this, (byte) 0));
    }
}
