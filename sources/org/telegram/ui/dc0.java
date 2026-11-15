package org.telegram.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dc0 extends org.telegram.ui.Components.xt0 {
    public boolean E;
    public int F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public Bundle M;
    public boolean N;
    public Timer O;
    public final Object P;
    public int Q;
    public double R;
    public boolean S;
    public Bundle T;
    public TLRPC.TL_auth_sentCode U;
    public final bc0 V;
    public final bc0 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.Components.mb0 b;
    public final /* synthetic */ ce0 b0;
    public final ah.i c;
    public final db0 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.fh0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final cd0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc0(ce0 ce0Var, Context context, int i7) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        this.b0 = ce0Var;
        final int i10 = 1;
        this.x = true;
        final int i11 = 0;
        this.y = false;
        this.E = false;
        this.P = new Object();
        this.Q = 60000;
        this.V = new bc0(this, 1);
        this.W = new bc0(this, 2);
        this.a0 = -3.0f;
        this.a = i7;
        boolean z11 = i7 != 16;
        setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.h = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.f(R.raw.bubble, 95, 95, null);
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                z10 = false;
                fh0Var.setVisibility(!z10 ? 8 : 0);
                addView(fh0Var, c8.ja.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(org.telegram.messenger.hd.M0(z11 ? 2131745950 : 2131745958, null));
                addView(textView, c8.ja.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView2, c8.ja.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                this.b = mb0Var;
                mb0Var.setText(org.telegram.messenger.hd.M0(z11 ? 2131745957 : 2131745965, null));
                ah.i iVar = new ah.i(9, context, this);
                this.c = iVar;
                iVar.setSingleLine();
                iVar.setLines(1);
                iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                iVar.setCursorWidth(1.5f);
                iVar.setImeOptions(268435461);
                iVar.setTextSize(1, 18.0f);
                iVar.setMaxLines(1);
                iVar.setBackground(null);
                iVar.setHint(org.telegram.messenger.hd.M0(z11 ? 2131745953 : 2131745961, null));
                iVar.addTextChangedListener(new org.telegram.ui.Cells.j3(this));
                iVar.setEllipsizeByGradient(true);
                iVar.setInputType(1);
                iVar.setTypeface(Typeface.DEFAULT);
                int i12 = 5;
                iVar.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                iVar.setOnFocusChangeListener(new ed(this, i12));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setText(org.telegram.messenger.hd.M0(2131747435, null));
                textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView3.setGravity(17);
                int i13 = org.telegram.ui.ActionBar.j6.o6;
                e6Var = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                org.telegram.ui.ActionBar.q6.U(textView3, i13, e6Var2);
                int L = org.telegram.messenger.g0.L(6.0f);
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.12f, w02);
                int r13 = org.telegram.ui.ActionBar.j6.r1(0.15f, w02);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, r12, r13, r13);
                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i13);
                org.telegram.ui.ActionBar.m6 K2 = org.telegram.ui.ActionBar.q6.K(0.15f, i13);
                e6Var3 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                textView3.setBackground(k02);
                org.telegram.ui.ActionBar.q6.j(textView3, k02, K, K2, e6Var3);
                c8.na.b(textView3, 0.1f, 1.5f);
                iVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
                    public final /* synthetic */ dc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        int i15;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i16 = i11;
                        CharSequence charSequence = null;
                        final int i17 = 0;
                        final dc0 dc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                ah.i iVar2 = dc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = iVar2.getText();
                                    dc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, iVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, iVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                dc0Var.p(true);
                                break;
                            case 1:
                                dc0Var.c(true);
                                break;
                            default:
                                ce0 ce0Var2 = dc0Var.b0;
                                cd0 cd0Var = dc0Var.w;
                                if (dc0Var.Q <= 0 || dc0Var.O == null) {
                                    Bundle bundle = dc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                        ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = dc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.D3(false);
                                                if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                                    dc0Var.N = true;
                                                    cd0Var.invalidate();
                                                    org.telegram.ui.ActionBar.q6.U(cd0Var, org.telegram.ui.ActionBar.j6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", dc0Var.K);
                                                    bundle2.putString("ephone", dc0Var.J);
                                                    bundle2.putString("phoneFormated", dc0Var.H);
                                                    dc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = dc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                                    i15 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                                    ce0Var2.F1(ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            dc0Var.N = true;
                                            cd0Var.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var, org.telegram.ui.ActionBar.j6.I6, null);
                                            cd0Var.setTextSize(1, 15.0f);
                                            int i20 = dc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                cd0Var.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                            } else {
                                                cd0Var.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", dc0Var.K);
                                            bundle3.putString("ephone", dc0Var.J);
                                            bundle3.putString("phoneFormated", dc0Var.H);
                                            bundle3.putInt("prevType", dc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = dc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                            i14 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                mb0Var.addView(iVar, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, 0.0f));
                mb0Var.e(iVar);
                mb0Var.addView(textView3, c8.ja.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(mb0Var, c8.ja.r(-1, -2, 1));
                addView(linearLayout, c8.ja.t(-1, -2, 1, 16, 3, 16, 0));
                iVar.setOnEditorActionListener(new fa(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, c8.ja.o(-1, -2));
                db0 db0Var = new db0(ce0Var, context);
                this.d = db0Var;
                int i14 = org.telegram.ui.ActionBar.j6.I6;
                org.telegram.ui.ActionBar.q6.G(db0Var, i14, null);
                org.telegram.ui.ActionBar.q6.U(db0Var, i14, ce0Var.getResourceProvider());
                db0Var.setTextSize(1, 14.0f);
                db0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                db0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                db0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
                    public final /* synthetic */ dc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i142;
                        int i15;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i16 = i10;
                        CharSequence charSequence = null;
                        final int i17 = 0;
                        final dc0 dc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                ah.i iVar2 = dc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = iVar2.getText();
                                    dc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, iVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, iVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                dc0Var.p(true);
                                break;
                            case 1:
                                dc0Var.c(true);
                                break;
                            default:
                                ce0 ce0Var2 = dc0Var.b0;
                                cd0 cd0Var = dc0Var.w;
                                if (dc0Var.Q <= 0 || dc0Var.O == null) {
                                    Bundle bundle = dc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                        ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = dc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.D3(false);
                                                if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                                    dc0Var.N = true;
                                                    cd0Var.invalidate();
                                                    org.telegram.ui.ActionBar.q6.U(cd0Var, org.telegram.ui.ActionBar.j6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", dc0Var.K);
                                                    bundle2.putString("ephone", dc0Var.J);
                                                    bundle2.putString("phoneFormated", dc0Var.H);
                                                    dc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = dc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                                    i15 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                                    ce0Var2.F1(ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            dc0Var.N = true;
                                            cd0Var.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var, org.telegram.ui.ActionBar.j6.I6, null);
                                            cd0Var.setTextSize(1, 15.0f);
                                            int i20 = dc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                cd0Var.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                            } else {
                                                cd0Var.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", dc0Var.K);
                                            bundle3.putString("ephone", dc0Var.J);
                                            bundle3.putString("phoneFormated", dc0Var.H);
                                            bundle3.putInt("prevType", dc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = dc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                            i142 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                addView(db0Var, c8.ja.t(-2, -2, 1, 0, 18, 0, 0));
                db0Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(org.telegram.messenger.hd.M0(z11 ? 2131745954 : 2131745962, null));
                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.p7, ce0Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-org.telegram.messenger.g0.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(org.telegram.messenger.hd.M0(z11 ? 2131745952 : 2131745960, null));
                org.telegram.ui.ActionBar.q6.U(textView5, org.telegram.ui.ActionBar.j6.y6, ce0Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                cd0 cd0Var = new cd0(this, context);
                this.w = cd0Var;
                org.telegram.ui.ActionBar.q6.G(cd0Var, i14, null);
                cd0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                cd0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                cd0Var.setTextSize(1, 15.0f);
                cd0Var.setGravity(19);
                final int i15 = 2;
                cd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
                    public final /* synthetic */ dc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i142;
                        int i152;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i16 = i15;
                        CharSequence charSequence = null;
                        final int i17 = 0;
                        final dc0 dc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                ah.i iVar2 = dc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = iVar2.getText();
                                    dc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, iVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, iVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                dc0Var.p(true);
                                break;
                            case 1:
                                dc0Var.c(true);
                                break;
                            default:
                                ce0 ce0Var2 = dc0Var.b0;
                                cd0 cd0Var2 = dc0Var.w;
                                if (dc0Var.Q <= 0 || dc0Var.O == null) {
                                    Bundle bundle = dc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                        ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = dc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.D3(false);
                                                if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                                    dc0Var.N = true;
                                                    cd0Var2.invalidate();
                                                    org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", dc0Var.K);
                                                    bundle2.putString("ephone", dc0Var.J);
                                                    bundle2.putString("phoneFormated", dc0Var.H);
                                                    dc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = dc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                                    i152 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                                    ce0Var2.F1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            dc0Var.N = true;
                                            cd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                            cd0Var2.setTextSize(1, 15.0f);
                                            int i20 = dc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                cd0Var2.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                            } else {
                                                cd0Var2.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", dc0Var.K);
                                            bundle3.putString("ephone", dc0Var.J);
                                            bundle3.putString("phoneFormated", dc0Var.H);
                                            bundle3.putInt("prevType", dc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = dc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                            i142 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(cd0Var, c8.ja.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, c8.ja.r(-1, -1, 80));
                h6.m.g(cd0Var);
            }
        }
        z10 = true;
        fh0Var.setVisibility(!z10 ? 8 : 0);
        addView(fh0Var, c8.ja.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(org.telegram.messenger.hd.M0(z11 ? 2131745950 : 2131745958, null));
        addView(textView6, c8.ja.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView22, c8.ja.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
        this.b = mb0Var2;
        mb0Var2.setText(org.telegram.messenger.hd.M0(z11 ? 2131745957 : 2131745965, null));
        ah.i iVar2 = new ah.i(9, context, this);
        this.c = iVar2;
        iVar2.setSingleLine();
        iVar2.setLines(1);
        iVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar2.setCursorWidth(1.5f);
        iVar2.setImeOptions(268435461);
        iVar2.setTextSize(1, 18.0f);
        iVar2.setMaxLines(1);
        iVar2.setBackground(null);
        iVar2.setHint(org.telegram.messenger.hd.M0(z11 ? 2131745953 : 2131745961, null));
        iVar2.addTextChangedListener(new org.telegram.ui.Cells.j3(this));
        iVar2.setEllipsizeByGradient(true);
        iVar2.setInputType(1);
        iVar2.setTypeface(Typeface.DEFAULT);
        int i122 = 5;
        iVar2.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
        iVar2.setOnFocusChangeListener(new ed(this, i122));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(org.telegram.messenger.g0.o());
        textView32.setText(org.telegram.messenger.hd.M0(2131747435, null));
        textView32.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView32.setGravity(17);
        int i132 = org.telegram.ui.ActionBar.j6.o6;
        e6Var = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        int w022 = org.telegram.ui.ActionBar.j6.w0(i132, e6Var);
        e6Var2 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        org.telegram.ui.ActionBar.q6.U(textView32, i132, e6Var2);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int r122 = org.telegram.ui.ActionBar.j6.r1(0.12f, w022);
        int r132 = org.telegram.ui.ActionBar.j6.r1(0.15f, w022);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, r122, r132, r132);
        org.telegram.ui.ActionBar.m6 K3 = org.telegram.ui.ActionBar.q6.K(0.12f, i132);
        org.telegram.ui.ActionBar.m6 K22 = org.telegram.ui.ActionBar.q6.K(0.15f, i132);
        e6Var3 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
        textView32.setBackground(k022);
        org.telegram.ui.ActionBar.q6.j(textView32, k022, K3, K22, e6Var3);
        c8.na.b(textView32, 0.1f, 1.5f);
        iVar2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
            public final /* synthetic */ dc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i16 = i11;
                CharSequence charSequence = null;
                final int i17 = 0;
                final dc0 dc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        ah.i iVar22 = dc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = iVar22.getText();
                            dc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, iVar22.getSelectionStart());
                                text.replace(max, Math.max(max, iVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        dc0Var.p(true);
                        break;
                    case 1:
                        dc0Var.c(true);
                        break;
                    default:
                        ce0 ce0Var2 = dc0Var.b0;
                        cd0 cd0Var2 = dc0Var.w;
                        if (dc0Var.Q <= 0 || dc0Var.O == null) {
                            Bundle bundle = dc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = dc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.D3(false);
                                        if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                            dc0Var.N = true;
                                            cd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", dc0Var.K);
                                            bundle2.putString("ephone", dc0Var.J);
                                            bundle2.putString("phoneFormated", dc0Var.H);
                                            dc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = dc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                            i152 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ce0Var2.F1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    dc0Var.N = true;
                                    cd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                    cd0Var2.setTextSize(1, 15.0f);
                                    int i20 = dc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        cd0Var2.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                    } else {
                                        cd0Var2.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", dc0Var.K);
                                    bundle3.putString("ephone", dc0Var.J);
                                    bundle3.putString("phoneFormated", dc0Var.H);
                                    bundle3.putInt("prevType", dc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = dc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                    i142 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        mb0Var2.addView(iVar2, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        mb0Var2.e(iVar2);
        mb0Var2.addView(textView32, c8.ja.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(mb0Var2, c8.ja.r(-1, -2, 1));
        addView(linearLayout2, c8.ja.t(-1, -2, 1, 16, 3, 16, 0));
        iVar2.setOnEditorActionListener(new fa(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, c8.ja.o(-1, -2));
        db0 db0Var2 = new db0(ce0Var, context);
        this.d = db0Var2;
        int i142 = org.telegram.ui.ActionBar.j6.I6;
        org.telegram.ui.ActionBar.q6.G(db0Var2, i142, null);
        org.telegram.ui.ActionBar.q6.U(db0Var2, i142, ce0Var.getResourceProvider());
        db0Var2.setTextSize(1, 14.0f);
        db0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        db0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        db0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
            public final /* synthetic */ dc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1422;
                int i152;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i16 = i10;
                CharSequence charSequence = null;
                final int i17 = 0;
                final dc0 dc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        ah.i iVar22 = dc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = iVar22.getText();
                            dc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, iVar22.getSelectionStart());
                                text.replace(max, Math.max(max, iVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        dc0Var.p(true);
                        break;
                    case 1:
                        dc0Var.c(true);
                        break;
                    default:
                        ce0 ce0Var2 = dc0Var.b0;
                        cd0 cd0Var2 = dc0Var.w;
                        if (dc0Var.Q <= 0 || dc0Var.O == null) {
                            Bundle bundle = dc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = dc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.D3(false);
                                        if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                            dc0Var.N = true;
                                            cd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", dc0Var.K);
                                            bundle2.putString("ephone", dc0Var.J);
                                            bundle2.putString("phoneFormated", dc0Var.H);
                                            dc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = dc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                            i152 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ce0Var2.F1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    dc0Var.N = true;
                                    cd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.q6.U(cd0Var2, org.telegram.ui.ActionBar.j6.I6, null);
                                    cd0Var2.setTextSize(1, 15.0f);
                                    int i20 = dc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        cd0Var2.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                    } else {
                                        cd0Var2.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", dc0Var.K);
                                    bundle3.putString("ephone", dc0Var.J);
                                    bundle3.putString("phoneFormated", dc0Var.H);
                                    bundle3.putInt("prevType", dc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = dc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                    i1422 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        addView(db0Var2, c8.ja.t(-2, -2, 1, 0, 18, 0, 0));
        db0Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(org.telegram.messenger.hd.M0(z11 ? 2131745954 : 2131745962, null));
        org.telegram.ui.ActionBar.q6.U(textView42, org.telegram.ui.ActionBar.j6.p7, ce0Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-org.telegram.messenger.g0.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(org.telegram.messenger.hd.M0(z11 ? 2131745952 : 2131745960, null));
        org.telegram.ui.ActionBar.q6.U(textView52, org.telegram.ui.ActionBar.j6.y6, ce0Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        cd0 cd0Var2 = new cd0(this, context);
        this.w = cd0Var2;
        org.telegram.ui.ActionBar.q6.G(cd0Var2, i142, null);
        cd0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        cd0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        cd0Var2.setTextSize(1, 15.0f);
        cd0Var2.setGravity(19);
        final int i152 = 2;
        cd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cc0
            public final /* synthetic */ dc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1422;
                int i1522;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i16 = i152;
                CharSequence charSequence = null;
                final int i17 = 0;
                final dc0 dc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        ah.i iVar22 = dc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) dc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(dc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = iVar22.getText();
                            dc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, iVar22.getSelectionStart());
                                text.replace(max, Math.max(max, iVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        dc0Var.p(true);
                        break;
                    case 1:
                        dc0Var.c(true);
                        break;
                    default:
                        ce0 ce0Var2 = dc0Var.b0;
                        cd0 cd0Var22 = dc0Var.w;
                        if (dc0Var.Q <= 0 || dc0Var.O == null) {
                            Bundle bundle = dc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = dc0Var.U) != null) {
                                ce0Var2.y1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = dc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.D3(false);
                                        if (!dc0Var.S && !dc0Var.N && !ce0Var2.r0) {
                                            dc0Var.N = true;
                                            cd0Var22.invalidate();
                                            org.telegram.ui.ActionBar.q6.U(cd0Var22, org.telegram.ui.ActionBar.j6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", dc0Var.K);
                                            bundle2.putString("ephone", dc0Var.J);
                                            bundle2.putString("phoneFormated", dc0Var.H);
                                            dc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = dc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = dc0Var.I;
                                            i1522 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                            ce0Var2.F1(ConnectionsManager.getInstance(i1522).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    dc0Var.N = true;
                                    cd0Var22.invalidate();
                                    org.telegram.ui.ActionBar.q6.U(cd0Var22, org.telegram.ui.ActionBar.j6.I6, null);
                                    cd0Var22.setTextSize(1, 15.0f);
                                    int i20 = dc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        cd0Var22.setText(org.telegram.messenger.hd.M0(2131752597, null));
                                    } else {
                                        cd0Var22.setText(org.telegram.messenger.hd.M0(2131745577, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", dc0Var.K);
                                    bundle3.putString("ephone", dc0Var.J);
                                    bundle3.putString("phoneFormated", dc0Var.H);
                                    bundle3.putInt("prevType", dc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = dc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = dc0Var.I;
                                    i1422 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.yb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new ac0(dc0Var, tL_error, bundle3, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(cd0Var2, c8.ja.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, c8.ja.r(-1, -1, 80));
        h6.m.g(cd0Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length && str.charAt(i7) <= ' ') {
            i7++;
        }
        return (i7 > 0 || length < str.length()) ? str.substring(i7, length) : str;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean c(boolean z10) {
        ce0 ce0Var = this.b0;
        ce0Var.C1(true, true);
        int i7 = this.G;
        if (i7 != 0) {
            ce0Var.M1(i7, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void d() {
        this.S = false;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void g() {
        org.telegram.messenger.g0.r(this.V);
    }

    @Override // org.telegram.ui.Components.xt0
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748266, "NewPassword");
    }

    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        if (this.S) {
            return;
        }
        String obj = this.c.getText().toString();
        if (obj.length() == 0) {
            r(false);
            return;
        }
        if (!o(obj)) {
            r(true);
            return;
        }
        this.S = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.H;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.I;
        tL_auth_signIn.flags |= 1;
        ce0 ce0Var = this.b0;
        ce0Var.F1(ce0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new xb0(this, tL_auth_signIn, 0), 10), true);
        ce0Var.N1(true, true);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void i() {
        p(true);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void j() {
        org.telegram.messenger.g0.i3(new bc0(this, 3), ce0.A0);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.M);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void m(Bundle bundle, boolean z10) {
        cd0 cd0Var = this.w;
        if (bundle == null) {
            if (this.T == null || this.U == null) {
                return;
            }
            org.telegram.ui.ActionBar.q6.U(cd0Var, org.telegram.ui.ActionBar.j6.I6, null);
            int i7 = this.F;
            cd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(i7 == 17 ? 2131746050 : i7 == 16 ? 2131746048 : i7 == 3 ? 2131746047 : 2131746049, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
            return;
        }
        ah.i iVar = this.c;
        iVar.setText("");
        this.M = bundle;
        this.L = null;
        this.F = bundle.getInt("nextType");
        this.G = bundle.getInt("prevType", 0);
        this.J = bundle.getString("ephone");
        if (this.M.containsKey("beginning")) {
            this.L = this.M.getString("beginning");
        }
        this.H = bundle.getString("phoneFormated");
        this.I = bundle.getString("phoneHash");
        this.K = this.M.getString("phone");
        this.Q = bundle.getInt("timeout");
        int i10 = this.G;
        db0 db0Var = this.d;
        if (i10 == 17) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i10 == 16) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 3 || i10 == 15) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131753755, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else {
            db0Var.setVisibility(8);
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        ce0 ce0Var = this.b0;
        ce0Var.r0 = false;
        cd0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + pf.b.c().b(pf.b.d(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.k5.q(null, null, !z11 ? 2131745951 : 2131745959, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.k5.q(null, null, !z11 ? 2131745955 : 2131745963, new Object[]{str, str2}, textView);
        }
        ce0.b1(ce0Var, iVar);
        iVar.requestFocus();
        org.telegram.ui.Components.fh0 fh0Var = this.h;
        if (fh0Var.getAnimatedDrawable() != null) {
            fh0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.g0.i3(new iz(fh0Var, 23), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.U(cd0Var, i11, null);
        int i12 = this.F;
        if (i12 != 2 && i12 != 4 && i12 != 3) {
            cd0Var.setVisibility(8);
            return;
        }
        if (this.O != null) {
            return;
        }
        org.telegram.ui.ActionBar.q6.U(cd0Var, i11, null);
        cd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i11));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new h6.r(this, 3), 0L, 1000L);
    }

    public final void n(boolean z10) {
        this.y = z10;
        float f10 = 0.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.b.a(f11);
        float f12 = (f11 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f12).scaleY(f12).alpha(f11).translationY((1.0f - f11) * org.telegram.messenger.g0.L(-5.0f));
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        org.telegram.messenger.i20.n(translationY, erVar, 290L);
        if (this.x && !this.y) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        this.f.animate().scaleX(f13).scaleY(f13).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.g0.L(this.y ? 5.0f : -5.0f)).setInterpolator(erVar).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.L == null) {
            return true;
        }
        String lowerCase = s(str).toLowerCase();
        String lowerCase2 = this.L.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void p(boolean z10) {
        bc0 bc0Var = this.V;
        org.telegram.messenger.g0.r(bc0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.x != z11) {
            this.x = z11;
            float f10 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f11 = 0.0f;
            if (z10) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                scaleY.setInterpolator(erVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f10).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f11 = org.telegram.messenger.g0.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f11).setInterpolator(erVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f10 = 1.0f;
                }
                textView2.setScaleY(f10);
                textView2.setAlpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f11 = org.telegram.messenger.g0.L(this.y ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f11);
            }
        }
        org.telegram.messenger.g0.i3(bc0Var, 5000L);
    }

    public final void q() {
        cd0 cd0Var = this.w;
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.U(cd0Var, i7, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i7));
        try {
            synchronized (this.P) {
                try {
                    Timer timer = this.O;
                    if (timer != null) {
                        timer.cancel();
                        this.O = null;
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r(boolean z10) {
        ah.i iVar = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            iVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(!z11 ? 2131745956 : 2131745964, null));
        } else if (TextUtils.isEmpty(iVar.getText())) {
            textView.setText("");
        } else {
            textView.setText(org.telegram.messenger.hd.M0(!z11 ? 2131745954 : 2131745962, null));
        }
        if (!this.y && !this.E) {
            org.telegram.messenger.g0.F3(this.a0, iVar, null);
            org.telegram.messenger.g0.F3(this.a0, textView, null);
        }
        bc0 bc0Var = this.W;
        org.telegram.messenger.g0.r(bc0Var);
        n(true);
        org.telegram.messenger.g0.i3(bc0Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override // org.telegram.ui.Components.xt0, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        ce0 ce0Var = this.b0;
        this.n.setTextColor(ce0Var.getThemedColor(i7));
        this.r.setTextColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.j6.D6));
        int themedColor = ce0Var.getThemedColor(i7);
        ah.i iVar = this.c;
        iVar.setTextColor(themedColor);
        iVar.setCursorColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.j6.l6));
        iVar.setHintTextColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        this.b.f();
    }
}
