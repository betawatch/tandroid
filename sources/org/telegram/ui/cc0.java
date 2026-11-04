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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cc0 extends org.telegram.ui.Components.vt0 {
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
    public final ac0 V;
    public final ac0 W;
    public final int a;
    public float a0;
    public final org.telegram.ui.Components.gb0 b;
    public final /* synthetic */ xd0 b0;
    public final bh.g c;
    public final za0 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.fh0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final bd0 w;
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
    public cc0(xd0 xd0Var, Context context, int i3) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        this.b0 = xd0Var;
        final int i10 = 1;
        this.x = true;
        final int i11 = 0;
        this.y = false;
        this.E = false;
        this.P = new Object();
        this.Q = 60000;
        this.V = new ac0(this, 1);
        this.W = new ac0(this, 2);
        this.a0 = -3.0f;
        this.a = i3;
        boolean z11 = i3 != 16;
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
                addView(fh0Var, b8.mf.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(org.telegram.messenger.bd.M0(z11 ? 2131745960 : 2131745968, null));
                addView(textView, b8.mf.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView2, b8.mf.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
                this.b = gb0Var;
                gb0Var.setText(org.telegram.messenger.bd.M0(z11 ? 2131745967 : 2131745975, null));
                bh.g gVar = new bh.g(9, context, this);
                this.c = gVar;
                gVar.setSingleLine();
                gVar.setLines(1);
                gVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                gVar.setCursorWidth(1.5f);
                gVar.setImeOptions(268435461);
                gVar.setTextSize(1, 18.0f);
                gVar.setMaxLines(1);
                gVar.setBackground(null);
                gVar.setHint(org.telegram.messenger.bd.M0(z11 ? 2131745963 : 2131745971, null));
                gVar.addTextChangedListener(new org.telegram.ui.Cells.j3(this));
                gVar.setEllipsizeByGradient(true);
                gVar.setInputType(1);
                gVar.setTypeface(Typeface.DEFAULT);
                int i12 = 5;
                gVar.setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
                gVar.setOnFocusChangeListener(new ed(this, i12));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setText(org.telegram.messenger.bd.M0(2131747443, null));
                textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView3.setGravity(17);
                int i13 = org.telegram.ui.ActionBar.k6.o6;
                e6Var = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i13, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
                org.telegram.ui.ActionBar.r6.V(textView3, i13, e6Var2);
                int L = org.telegram.messenger.g0.L(6.0f);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i13);
                org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i13);
                e6Var3 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
                textView3.setBackground(k02);
                org.telegram.ui.ActionBar.r6.k(textView3, k02, L2, L3, e6Var3);
                b8.pf.b(textView3, 0.1f, 1.5f);
                gVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
                    public final /* synthetic */ cc0 b;

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
                        final cc0 cc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                bh.g gVar2 = cc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    cc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                cc0Var.p(true);
                                break;
                            case 1:
                                cc0Var.c(true);
                                break;
                            default:
                                xd0 xd0Var2 = cc0Var.b0;
                                bd0 bd0Var = cc0Var.w;
                                if (cc0Var.Q <= 0 || cc0Var.O == null) {
                                    Bundle bundle = cc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                        xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = cc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.E3(false);
                                                if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                                    cc0Var.N = true;
                                                    bd0Var.invalidate();
                                                    org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", cc0Var.K);
                                                    bundle2.putString("ephone", cc0Var.J);
                                                    bundle2.putString("phoneFormated", cc0Var.H);
                                                    cc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = cc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                                    i15 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                                    xd0Var2.w1(ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var.N = true;
                                            bd0Var.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                            bd0Var.setTextSize(1, 15.0f);
                                            int i20 = cc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                bd0Var.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                            } else {
                                                bd0Var.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", cc0Var.K);
                                            bundle3.putString("ephone", cc0Var.J);
                                            bundle3.putString("phoneFormated", cc0Var.H);
                                            bundle3.putInt("prevType", cc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = cc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                            i14 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
                gb0Var.addView(gVar, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
                gb0Var.e(gVar);
                gb0Var.addView(textView3, b8.mf.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(gb0Var, b8.mf.r(-1, -2, 1));
                addView(linearLayout, b8.mf.t(-1, -2, 1, 16, 3, 16, 0));
                gVar.setOnEditorActionListener(new ea(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, b8.mf.o(-1, -2));
                za0 za0Var = new za0(xd0Var, context);
                this.d = za0Var;
                int i14 = org.telegram.ui.ActionBar.k6.I6;
                org.telegram.ui.ActionBar.r6.H(za0Var, i14, null);
                org.telegram.ui.ActionBar.r6.V(za0Var, i14, xd0Var.getResourceProvider());
                za0Var.setTextSize(1, 14.0f);
                za0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                za0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                za0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
                    public final /* synthetic */ cc0 b;

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
                        final cc0 cc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                bh.g gVar2 = cc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    cc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                cc0Var.p(true);
                                break;
                            case 1:
                                cc0Var.c(true);
                                break;
                            default:
                                xd0 xd0Var2 = cc0Var.b0;
                                bd0 bd0Var = cc0Var.w;
                                if (cc0Var.Q <= 0 || cc0Var.O == null) {
                                    Bundle bundle = cc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                        xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = cc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.E3(false);
                                                if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                                    cc0Var.N = true;
                                                    bd0Var.invalidate();
                                                    org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", cc0Var.K);
                                                    bundle2.putString("ephone", cc0Var.J);
                                                    bundle2.putString("phoneFormated", cc0Var.H);
                                                    cc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = cc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                                    i15 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                                    xd0Var2.w1(ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var.N = true;
                                            bd0Var.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                            bd0Var.setTextSize(1, 15.0f);
                                            int i20 = cc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                bd0Var.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                            } else {
                                                bd0Var.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", cc0Var.K);
                                            bundle3.putString("ephone", cc0Var.J);
                                            bundle3.putString("phoneFormated", cc0Var.H);
                                            bundle3.putInt("prevType", cc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = cc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                            i142 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
                addView(za0Var, b8.mf.t(-2, -2, 1, 0, 18, 0, 0));
                za0Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(org.telegram.messenger.bd.M0(z11 ? 2131745964 : 2131745972, null));
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.p7, xd0Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-org.telegram.messenger.g0.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(org.telegram.messenger.bd.M0(z11 ? 2131745962 : 2131745970, null));
                org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.y6, xd0Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                bd0 bd0Var = new bd0(this, context);
                this.w = bd0Var;
                org.telegram.ui.ActionBar.r6.H(bd0Var, i14, null);
                bd0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                bd0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                bd0Var.setTextSize(1, 15.0f);
                bd0Var.setGravity(19);
                final int i15 = 2;
                bd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
                    public final /* synthetic */ cc0 b;

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
                        final cc0 cc0Var = this.b;
                        final int i18 = 1;
                        switch (i16) {
                            case 0:
                                bh.g gVar2 = cc0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    cc0Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                cc0Var.p(true);
                                break;
                            case 1:
                                cc0Var.c(true);
                                break;
                            default:
                                xd0 xd0Var2 = cc0Var.b0;
                                bd0 bd0Var2 = cc0Var.w;
                                if (cc0Var.Q <= 0 || cc0Var.O == null) {
                                    Bundle bundle = cc0Var.T;
                                    if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                        xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i19 = cc0Var.F;
                                        if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                            if (i19 == 3) {
                                                org.telegram.messenger.g0.E3(false);
                                                if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                                    cc0Var.N = true;
                                                    bd0Var2.invalidate();
                                                    org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", cc0Var.K);
                                                    bundle2.putString("ephone", cc0Var.J);
                                                    bundle2.putString("phoneFormated", cc0Var.H);
                                                    cc0Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = cc0Var.H;
                                                    tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                                    i152 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                                    xd0Var2.w1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            cc0Var.N = true;
                                            bd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                            bd0Var2.setTextSize(1, 15.0f);
                                            int i20 = cc0Var.F;
                                            if (i20 == 4 || i20 == 11) {
                                                bd0Var2.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                            } else {
                                                bd0Var2.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", cc0Var.K);
                                            bundle3.putString("ephone", cc0Var.J);
                                            bundle3.putString("phoneFormated", cc0Var.H);
                                            bundle3.putInt("prevType", cc0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = cc0Var.H;
                                            tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                            i142 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
                frameLayout2.addView(bd0Var, b8.mf.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, b8.mf.r(-1, -1, 80));
                k4.j.k(bd0Var);
            }
        }
        z10 = true;
        fh0Var.setVisibility(!z10 ? 8 : 0);
        addView(fh0Var, b8.mf.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(org.telegram.messenger.bd.M0(z11 ? 2131745960 : 2131745968, null));
        addView(textView6, b8.mf.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView22, b8.mf.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.b = gb0Var2;
        gb0Var2.setText(org.telegram.messenger.bd.M0(z11 ? 2131745967 : 2131745975, null));
        bh.g gVar2 = new bh.g(9, context, this);
        this.c = gVar2;
        gVar2.setSingleLine();
        gVar2.setLines(1);
        gVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gVar2.setCursorWidth(1.5f);
        gVar2.setImeOptions(268435461);
        gVar2.setTextSize(1, 18.0f);
        gVar2.setMaxLines(1);
        gVar2.setBackground(null);
        gVar2.setHint(org.telegram.messenger.bd.M0(z11 ? 2131745963 : 2131745971, null));
        gVar2.addTextChangedListener(new org.telegram.ui.Cells.j3(this));
        gVar2.setEllipsizeByGradient(true);
        gVar2.setInputType(1);
        gVar2.setTypeface(Typeface.DEFAULT);
        int i122 = 5;
        gVar2.setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
        gVar2.setOnFocusChangeListener(new ed(this, i122));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(org.telegram.messenger.g0.o());
        textView32.setText(org.telegram.messenger.bd.M0(2131747443, null));
        textView32.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView32.setGravity(17);
        int i132 = org.telegram.ui.ActionBar.k6.o6;
        e6Var = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        int w022 = org.telegram.ui.ActionBar.k6.w0(i132, e6Var);
        e6Var2 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        org.telegram.ui.ActionBar.r6.V(textView32, i132, e6Var2);
        int L4 = org.telegram.messenger.g0.L(6.0f);
        int r122 = org.telegram.ui.ActionBar.k6.r1(0.12f, w022);
        int r132 = org.telegram.ui.ActionBar.k6.r1(0.15f, w022);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, r122, r132, r132);
        org.telegram.ui.ActionBar.n6 L22 = org.telegram.ui.ActionBar.r6.L(0.12f, i132);
        org.telegram.ui.ActionBar.n6 L32 = org.telegram.ui.ActionBar.r6.L(0.15f, i132);
        e6Var3 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        textView32.setBackground(k022);
        org.telegram.ui.ActionBar.r6.k(textView32, k022, L22, L32, e6Var3);
        b8.pf.b(textView32, 0.1f, 1.5f);
        gVar2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
            public final /* synthetic */ cc0 b;

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
                final cc0 cc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        bh.g gVar22 = cc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            cc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        cc0Var.p(true);
                        break;
                    case 1:
                        cc0Var.c(true);
                        break;
                    default:
                        xd0 xd0Var2 = cc0Var.b0;
                        bd0 bd0Var2 = cc0Var.w;
                        if (cc0Var.Q <= 0 || cc0Var.O == null) {
                            Bundle bundle = cc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = cc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.E3(false);
                                        if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                            cc0Var.N = true;
                                            bd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", cc0Var.K);
                                            bundle2.putString("ephone", cc0Var.J);
                                            bundle2.putString("phoneFormated", cc0Var.H);
                                            cc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = cc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                            i152 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            xd0Var2.w1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var.N = true;
                                    bd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                    bd0Var2.setTextSize(1, 15.0f);
                                    int i20 = cc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        bd0Var2.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                    } else {
                                        bd0Var2.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", cc0Var.K);
                                    bundle3.putString("ephone", cc0Var.J);
                                    bundle3.putString("phoneFormated", cc0Var.H);
                                    bundle3.putInt("prevType", cc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = cc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                    i142 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
        gb0Var2.addView(gVar2, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        gb0Var2.e(gVar2);
        gb0Var2.addView(textView32, b8.mf.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(gb0Var2, b8.mf.r(-1, -2, 1));
        addView(linearLayout2, b8.mf.t(-1, -2, 1, 16, 3, 16, 0));
        gVar2.setOnEditorActionListener(new ea(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, b8.mf.o(-1, -2));
        za0 za0Var2 = new za0(xd0Var, context);
        this.d = za0Var2;
        int i142 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.ActionBar.r6.H(za0Var2, i142, null);
        org.telegram.ui.ActionBar.r6.V(za0Var2, i142, xd0Var.getResourceProvider());
        za0Var2.setTextSize(1, 14.0f);
        za0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        za0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        za0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
            public final /* synthetic */ cc0 b;

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
                final cc0 cc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        bh.g gVar22 = cc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            cc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        cc0Var.p(true);
                        break;
                    case 1:
                        cc0Var.c(true);
                        break;
                    default:
                        xd0 xd0Var2 = cc0Var.b0;
                        bd0 bd0Var2 = cc0Var.w;
                        if (cc0Var.Q <= 0 || cc0Var.O == null) {
                            Bundle bundle = cc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = cc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.E3(false);
                                        if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                            cc0Var.N = true;
                                            bd0Var2.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", cc0Var.K);
                                            bundle2.putString("ephone", cc0Var.J);
                                            bundle2.putString("phoneFormated", cc0Var.H);
                                            cc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = cc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                            i152 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            xd0Var2.w1(ConnectionsManager.getInstance(i152).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var.N = true;
                                    bd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                    bd0Var2.setTextSize(1, 15.0f);
                                    int i20 = cc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        bd0Var2.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                    } else {
                                        bd0Var2.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", cc0Var.K);
                                    bundle3.putString("ephone", cc0Var.J);
                                    bundle3.putString("phoneFormated", cc0Var.H);
                                    bundle3.putInt("prevType", cc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = cc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                    i1422 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
        addView(za0Var2, b8.mf.t(-2, -2, 1, 0, 18, 0, 0));
        za0Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(org.telegram.messenger.bd.M0(z11 ? 2131745964 : 2131745972, null));
        org.telegram.ui.ActionBar.r6.V(textView42, org.telegram.ui.ActionBar.k6.p7, xd0Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-org.telegram.messenger.g0.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(org.telegram.messenger.bd.M0(z11 ? 2131745962 : 2131745970, null));
        org.telegram.ui.ActionBar.r6.V(textView52, org.telegram.ui.ActionBar.k6.y6, xd0Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        bd0 bd0Var2 = new bd0(this, context);
        this.w = bd0Var2;
        org.telegram.ui.ActionBar.r6.H(bd0Var2, i142, null);
        bd0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        bd0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        bd0Var2.setTextSize(1, 15.0f);
        bd0Var2.setGravity(19);
        final int i152 = 2;
        bd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bc0
            public final /* synthetic */ cc0 b;

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
                final cc0 cc0Var = this.b;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        bh.g gVar22 = cc0Var.c;
                        try {
                            charSequence = ((ClipboardManager) cc0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cc0Var.getContext());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            cc0Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        cc0Var.p(true);
                        break;
                    case 1:
                        cc0Var.c(true);
                        break;
                    default:
                        xd0 xd0Var2 = cc0Var.b0;
                        bd0 bd0Var22 = cc0Var.w;
                        if (cc0Var.Q <= 0 || cc0Var.O == null) {
                            Bundle bundle = cc0Var.T;
                            if (bundle != null && (tL_auth_sentCode = cc0Var.U) != null) {
                                xd0Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i19 = cc0Var.F;
                                if (i19 != 4 && i19 != 2 && i19 != 11 && i19 != 15) {
                                    if (i19 == 3) {
                                        org.telegram.messenger.g0.E3(false);
                                        if (!cc0Var.S && !cc0Var.N && !xd0Var2.q0) {
                                            cc0Var.N = true;
                                            bd0Var22.invalidate();
                                            org.telegram.ui.ActionBar.r6.V(bd0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", cc0Var.K);
                                            bundle2.putString("ephone", cc0Var.J);
                                            bundle2.putString("phoneFormated", cc0Var.H);
                                            cc0Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = cc0Var.H;
                                            tL_auth_resendCode.phone_code_hash = cc0Var.I;
                                            i1522 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            xd0Var2.w1(ConnectionsManager.getInstance(i1522).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    cc0Var.N = true;
                                    bd0Var22.invalidate();
                                    org.telegram.ui.ActionBar.r6.V(bd0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                                    bd0Var22.setTextSize(1, 15.0f);
                                    int i20 = cc0Var.F;
                                    if (i20 == 4 || i20 == 11) {
                                        bd0Var22.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                    } else {
                                        bd0Var22.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", cc0Var.K);
                                    bundle3.putString("ephone", cc0Var.J);
                                    bundle3.putString("phoneFormated", cc0Var.H);
                                    bundle3.putInt("prevType", cc0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = cc0Var.H;
                                    tL_auth_resendCode2.phone_code_hash = cc0Var.I;
                                    i1422 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.xb0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(new zb0(cc0Var, tL_error, bundle3, tLObject));
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
        frameLayout22.addView(bd0Var2, b8.mf.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, b8.mf.r(-1, -1, 80));
        k4.j.k(bd0Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length && str.charAt(i3) <= ' ') {
            i3++;
        }
        return (i3 > 0 || length < str.length()) ? str.substring(i3, length) : str;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean c(boolean z10) {
        xd0 xd0Var = this.b0;
        xd0Var.t1(true, true);
        int i3 = this.G;
        if (i3 != 0) {
            xd0Var.D1(i3, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void d() {
        this.S = false;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void g() {
        org.telegram.messenger.g0.r(this.V);
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131748274, "NewPassword");
    }

    @Override // org.telegram.ui.Components.vt0
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
        xd0 xd0Var = this.b0;
        xd0Var.w1(xd0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new wb0(this, tL_auth_signIn, 0), 10), true);
        xd0Var.E1(true, true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void i() {
        p(true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        org.telegram.messenger.g0.i3(new ac0(this, 3), xd0.z0);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.M);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        bd0 bd0Var = this.w;
        if (bundle == null) {
            if (this.T == null || this.U == null) {
                return;
            }
            org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
            int i3 = this.F;
            bd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(i3 == 17 ? 2131746060 : i3 == 16 ? 2131746058 : i3 == 3 ? 2131746057 : 2131746059, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
            return;
        }
        bh.g gVar = this.c;
        gVar.setText("");
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
        za0 za0Var = this.d;
        if (i10 == 17) {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i10 == 16) {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 3 || i10 == 15) {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753755, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else {
            za0Var.setVisibility(8);
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        xd0 xd0Var = this.b0;
        xd0Var.q0 = false;
        bd0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + mf.b.c().b(mf.b.d(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.k5.r(null, null, !z11 ? 2131745961 : 2131745969, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.k5.r(null, null, !z11 ? 2131745965 : 2131745973, new Object[]{str, str2}, textView);
        }
        xd0.a1(xd0Var, gVar);
        gVar.requestFocus();
        org.telegram.ui.Components.fh0 fh0Var = this.h;
        if (fh0Var.getAnimatedDrawable() != null) {
            fh0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.g0.i3(new fz(fh0Var, 22), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i11, null);
        int i12 = this.F;
        if (i12 != 2 && i12 != 4 && i12 != 3) {
            bd0Var.setVisibility(8);
            return;
        }
        if (this.O != null) {
            return;
        }
        org.telegram.ui.ActionBar.r6.V(bd0Var, i11, null);
        bd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i11));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new g6.q(this, 4), 0L, 1000L);
    }

    public final void n(boolean z10) {
        this.y = z10;
        float f10 = 0.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.b.a(f11);
        float f12 = (f11 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f12).scaleY(f12).alpha(f11).translationY((1.0f - f11) * org.telegram.messenger.g0.L(-5.0f));
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 290L);
        if (this.x && !this.y) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        this.f.animate().scaleX(f13).scaleY(f13).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.g0.L(this.y ? 5.0f : -5.0f)).setInterpolator(xqVar).setDuration(290L).start();
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
        ac0 ac0Var = this.V;
        org.telegram.messenger.g0.r(ac0Var);
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
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                scaleY.setInterpolator(xqVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f10).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f11 = org.telegram.messenger.g0.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f11).setInterpolator(xqVar).setDuration(300L).start();
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
        org.telegram.messenger.g0.i3(ac0Var, 5000L);
    }

    public final void q() {
        bd0 bd0Var = this.w;
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i3));
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
        bh.g gVar = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            gVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(org.telegram.messenger.bd.M0(!z11 ? 2131745966 : 2131745974, null));
        } else if (TextUtils.isEmpty(gVar.getText())) {
            textView.setText("");
        } else {
            textView.setText(org.telegram.messenger.bd.M0(!z11 ? 2131745964 : 2131745972, null));
        }
        if (!this.y && !this.E) {
            org.telegram.messenger.g0.G3(this.a0, gVar, null);
            org.telegram.messenger.g0.G3(this.a0, textView, null);
        }
        ac0 ac0Var = this.W;
        org.telegram.messenger.g0.r(ac0Var);
        n(true);
        org.telegram.messenger.g0.i3(ac0Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        xd0 xd0Var = this.b0;
        this.n.setTextColor(xd0Var.getThemedColor(i3));
        this.r.setTextColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.D6));
        int themedColor = xd0Var.getThemedColor(i3);
        bh.g gVar = this.c;
        gVar.setTextColor(themedColor);
        gVar.setCursorColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.l6));
        gVar.setHintTextColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        this.b.f();
    }
}
