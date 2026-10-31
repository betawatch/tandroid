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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ld0 extends org.telegram.ui.Components.zu0 {
    public boolean D;
    public int E;
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public Bundle L;
    public boolean M;
    public Timer N;
    public final Object O;
    public int P;
    public double Q;
    public boolean R;
    public Bundle S;
    public TLRPC.TL_auth_sentCode T;
    public final jd0 U;
    public final jd0 V;
    public float W;
    public final int a;
    public final /* synthetic */ hf0 a0;
    public final org.telegram.ui.Components.ec0 b;
    public final org.telegram.ui.ActionBar.n0 c;
    public final mc0 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.ei0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final ke0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ld0(hf0 hf0Var, Context context, int i10) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        this.a0 = hf0Var;
        final int i11 = 1;
        this.x = true;
        final int i12 = 0;
        this.y = false;
        this.D = false;
        this.O = new Object();
        this.P = 60000;
        this.U = new jd0(this, 1);
        this.V = new jd0(this, 2);
        this.W = -3.0f;
        this.a = i10;
        boolean z11 = i10 != 16;
        setOrientation(1);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.h = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.f(R.raw.bubble, 95, 95, null);
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                z10 = false;
                ei0Var.setVisibility(!z10 ? 8 : 0);
                addView(ei0Var, w7.b6.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(org.telegram.messenger.cd.L0(z11 ? 2131745967 : 2131745975, null));
                addView(textView, w7.b6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                addView(textView2, w7.b6.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                this.b = ec0Var;
                ec0Var.setText(org.telegram.messenger.cd.L0(z11 ? 2131745974 : 2131745982, null));
                int i13 = 6;
                org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 6);
                this.c = n0Var;
                n0Var.setSingleLine();
                n0Var.setLines(1);
                n0Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                n0Var.setCursorWidth(1.5f);
                n0Var.setImeOptions(268435461);
                n0Var.setTextSize(1, 18.0f);
                n0Var.setMaxLines(1);
                n0Var.setBackground(null);
                n0Var.setHint(org.telegram.messenger.cd.L0(z11 ? 2131745970 : 2131745978, null));
                n0Var.addTextChangedListener(new org.telegram.ui.Cells.l3(this));
                n0Var.setEllipsizeByGradient(true);
                n0Var.setInputType(1);
                n0Var.setTypeface(Typeface.DEFAULT);
                int i14 = 5;
                n0Var.setGravity(!org.telegram.messenger.cd.X ? 5 : 3);
                n0Var.setOnFocusChangeListener(new od(this, i14));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(org.telegram.messenger.i0.o());
                textView3.setText(org.telegram.messenger.cd.L0(2131747451, null));
                textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                textView3.setGravity(17);
                int i15 = org.telegram.ui.ActionBar.t6.o6;
                p6Var = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
                p6Var2 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
                org.telegram.ui.ActionBar.a7.V(textView3, i15, p6Var2);
                int L = org.telegram.messenger.i0.L(6.0f);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.12f, w02);
                int r13 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13);
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i15);
                org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i15);
                p6Var3 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
                textView3.setBackground(k02);
                org.telegram.ui.ActionBar.a7.k(textView3, k02, L2, L3, p6Var3);
                w7.e6.b(textView3, 0.1f, 1.5f);
                n0Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.34f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ ld0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i18 = i12;
                        CharSequence charSequence = null;
                        final int i19 = 0;
                        final ld0 ld0Var = this.b;
                        final int i20 = 1;
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.n0 n0Var2 = ld0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = n0Var2.getText();
                                    ld0Var.D = true;
                                    if (text != null) {
                                        int max = Math.max(0, n0Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, n0Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ld0Var.p(true);
                                break;
                            case 1:
                                ld0Var.c(true);
                                break;
                            default:
                                hf0 hf0Var2 = ld0Var.a0;
                                ke0 ke0Var = ld0Var.w;
                                if (ld0Var.P <= 0 || ld0Var.N == null) {
                                    Bundle bundle = ld0Var.S;
                                    if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                        hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i21 = ld0Var.E;
                                        if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                            if (i21 == 3) {
                                                org.telegram.messenger.i0.D3(false);
                                                if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                                    ld0Var.M = true;
                                                    ke0Var.invalidate();
                                                    org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ld0Var.J);
                                                    bundle2.putString("ephone", ld0Var.I);
                                                    bundle2.putString("phoneFormated", ld0Var.G);
                                                    ld0Var.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ld0Var.G;
                                                    tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                                    i17 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                                    hf0Var2.v1(ConnectionsManager.getInstance(i17).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i20) {
                                                                case 0:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ld0Var.M = true;
                                            ke0Var.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                                            ke0Var.setTextSize(1, 15.0f);
                                            int i22 = ld0Var.E;
                                            if (i22 == 4 || i22 == 11) {
                                                ke0Var.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                            } else {
                                                ke0Var.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ld0Var.J);
                                            bundle3.putString("ephone", ld0Var.I);
                                            bundle3.putString("phoneFormated", ld0Var.G);
                                            bundle3.putInt("prevType", ld0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ld0Var.G;
                                            tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                            i16 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i16).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i19) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
                ec0Var.addView(n0Var, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
                ec0Var.e(n0Var);
                ec0Var.addView(textView3, w7.b6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(ec0Var, w7.b6.r(-1, -2, 1));
                addView(linearLayout, w7.b6.t(-1, -2, 1, 16, 3, 16, 0));
                n0Var.setOnEditorActionListener(new ha(this, i13));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, w7.b6.o(-1, -2));
                mc0 mc0Var = new mc0(hf0Var, context);
                this.d = mc0Var;
                int i16 = org.telegram.ui.ActionBar.t6.I6;
                org.telegram.ui.ActionBar.a7.H(mc0Var, i16, null);
                org.telegram.ui.ActionBar.a7.V(mc0Var, i16, hf0Var.getResourceProvider());
                mc0Var.setTextSize(1, 14.0f);
                mc0Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                mc0Var.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                mc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ ld0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        int i17;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i18 = i11;
                        CharSequence charSequence = null;
                        final int i19 = 0;
                        final ld0 ld0Var = this.b;
                        final int i20 = 1;
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.n0 n0Var2 = ld0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = n0Var2.getText();
                                    ld0Var.D = true;
                                    if (text != null) {
                                        int max = Math.max(0, n0Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, n0Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ld0Var.p(true);
                                break;
                            case 1:
                                ld0Var.c(true);
                                break;
                            default:
                                hf0 hf0Var2 = ld0Var.a0;
                                ke0 ke0Var = ld0Var.w;
                                if (ld0Var.P <= 0 || ld0Var.N == null) {
                                    Bundle bundle = ld0Var.S;
                                    if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                        hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i21 = ld0Var.E;
                                        if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                            if (i21 == 3) {
                                                org.telegram.messenger.i0.D3(false);
                                                if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                                    ld0Var.M = true;
                                                    ke0Var.invalidate();
                                                    org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ld0Var.J);
                                                    bundle2.putString("ephone", ld0Var.I);
                                                    bundle2.putString("phoneFormated", ld0Var.G);
                                                    ld0Var.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ld0Var.G;
                                                    tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                                    i17 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                                    hf0Var2.v1(ConnectionsManager.getInstance(i17).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i20) {
                                                                case 0:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ld0Var.M = true;
                                            ke0Var.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                                            ke0Var.setTextSize(1, 15.0f);
                                            int i22 = ld0Var.E;
                                            if (i22 == 4 || i22 == 11) {
                                                ke0Var.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                            } else {
                                                ke0Var.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ld0Var.J);
                                            bundle3.putString("ephone", ld0Var.I);
                                            bundle3.putString("phoneFormated", ld0Var.G);
                                            bundle3.putInt("prevType", ld0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ld0Var.G;
                                            tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                            i162 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i162).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i19) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
                addView(mc0Var, w7.b6.t(-2, -2, 1, 0, 18, 0, 0));
                mc0Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(org.telegram.messenger.cd.L0(z11 ? 2131745971 : 2131745979, null));
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.p7, hf0Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-org.telegram.messenger.i0.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(org.telegram.messenger.cd.L0(z11 ? 2131745969 : 2131745977, null));
                org.telegram.ui.ActionBar.a7.V(textView5, org.telegram.ui.ActionBar.t6.y6, hf0Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
                ke0 ke0Var = new ke0(this, context);
                this.w = ke0Var;
                org.telegram.ui.ActionBar.a7.H(ke0Var, i16, null);
                ke0Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                ke0Var.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                ke0Var.setTextSize(1, 15.0f);
                ke0Var.setGravity(19);
                final int i17 = 2;
                ke0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ ld0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        int i172;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        int i18 = i17;
                        CharSequence charSequence = null;
                        final int i19 = 0;
                        final ld0 ld0Var = this.b;
                        final int i20 = 1;
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.n0 n0Var2 = ld0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = n0Var2.getText();
                                    ld0Var.D = true;
                                    if (text != null) {
                                        int max = Math.max(0, n0Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, n0Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ld0Var.p(true);
                                break;
                            case 1:
                                ld0Var.c(true);
                                break;
                            default:
                                hf0 hf0Var2 = ld0Var.a0;
                                ke0 ke0Var2 = ld0Var.w;
                                if (ld0Var.P <= 0 || ld0Var.N == null) {
                                    Bundle bundle = ld0Var.S;
                                    if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                        hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i21 = ld0Var.E;
                                        if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                            if (i21 == 3) {
                                                org.telegram.messenger.i0.D3(false);
                                                if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                                    ld0Var.M = true;
                                                    ke0Var2.invalidate();
                                                    org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ld0Var.J);
                                                    bundle2.putString("ephone", ld0Var.I);
                                                    bundle2.putString("phoneFormated", ld0Var.G);
                                                    ld0Var.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ld0Var.G;
                                                    tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                                    i172 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                                    hf0Var2.v1(ConnectionsManager.getInstance(i172).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i20) {
                                                                case 0:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ld0Var.M = true;
                                            ke0Var2.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                            ke0Var2.setTextSize(1, 15.0f);
                                            int i22 = ld0Var.E;
                                            if (i22 == 4 || i22 == 11) {
                                                ke0Var2.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                            } else {
                                                ke0Var2.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ld0Var.J);
                                            bundle3.putString("ephone", ld0Var.I);
                                            bundle3.putString("phoneFormated", ld0Var.G);
                                            bundle3.putInt("prevType", ld0Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ld0Var.G;
                                            tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                            i162 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            ConnectionsManager.getInstance(i162).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i19) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
                frameLayout2.addView(ke0Var, w7.b6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, w7.b6.r(-1, -1, 80));
                li.k.i(ke0Var);
            }
        }
        z10 = true;
        ei0Var.setVisibility(!z10 ? 8 : 0);
        addView(ei0Var, w7.b6.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(org.telegram.messenger.i0.o());
        textView6.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(org.telegram.messenger.cd.L0(z11 ? 2131745967 : 2131745975, null));
        addView(textView6, w7.b6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView22, w7.b6.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
        this.b = ec0Var2;
        ec0Var2.setText(org.telegram.messenger.cd.L0(z11 ? 2131745974 : 2131745982, null));
        int i132 = 6;
        org.telegram.ui.ActionBar.n0 n0Var2 = new org.telegram.ui.ActionBar.n0(this, context, 6);
        this.c = n0Var2;
        n0Var2.setSingleLine();
        n0Var2.setLines(1);
        n0Var2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        n0Var2.setCursorWidth(1.5f);
        n0Var2.setImeOptions(268435461);
        n0Var2.setTextSize(1, 18.0f);
        n0Var2.setMaxLines(1);
        n0Var2.setBackground(null);
        n0Var2.setHint(org.telegram.messenger.cd.L0(z11 ? 2131745970 : 2131745978, null));
        n0Var2.addTextChangedListener(new org.telegram.ui.Cells.l3(this));
        n0Var2.setEllipsizeByGradient(true);
        n0Var2.setInputType(1);
        n0Var2.setTypeface(Typeface.DEFAULT);
        int i142 = 5;
        n0Var2.setGravity(!org.telegram.messenger.cd.X ? 5 : 3);
        n0Var2.setOnFocusChangeListener(new od(this, i142));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(org.telegram.messenger.i0.o());
        textView32.setText(org.telegram.messenger.cd.L0(2131747451, null));
        textView32.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView32.setGravity(17);
        int i152 = org.telegram.ui.ActionBar.t6.o6;
        p6Var = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        int w022 = org.telegram.ui.ActionBar.t6.w0(i152, p6Var);
        p6Var2 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        org.telegram.ui.ActionBar.a7.V(textView32, i152, p6Var2);
        int L4 = org.telegram.messenger.i0.L(6.0f);
        int r122 = org.telegram.ui.ActionBar.t6.r1(0.12f, w022);
        int r132 = org.telegram.ui.ActionBar.t6.r1(0.15f, w022);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.t6.k0(L4, L4, L4, L4, r122, r132, r132);
        org.telegram.ui.ActionBar.w6 L22 = org.telegram.ui.ActionBar.a7.L(0.12f, i152);
        org.telegram.ui.ActionBar.w6 L32 = org.telegram.ui.ActionBar.a7.L(0.15f, i152);
        p6Var3 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        textView32.setBackground(k022);
        org.telegram.ui.ActionBar.a7.k(textView32, k022, L22, L32, p6Var3);
        w7.e6.b(textView32, 0.1f, 1.5f);
        n0Var2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.34f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ ld0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162;
                int i172;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i18 = i12;
                CharSequence charSequence = null;
                final int i19 = 0;
                final ld0 ld0Var = this.b;
                final int i20 = 1;
                switch (i18) {
                    case 0:
                        org.telegram.ui.ActionBar.n0 n0Var22 = ld0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = n0Var22.getText();
                            ld0Var.D = true;
                            if (text != null) {
                                int max = Math.max(0, n0Var22.getSelectionStart());
                                text.replace(max, Math.max(max, n0Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ld0Var.p(true);
                        break;
                    case 1:
                        ld0Var.c(true);
                        break;
                    default:
                        hf0 hf0Var2 = ld0Var.a0;
                        ke0 ke0Var2 = ld0Var.w;
                        if (ld0Var.P <= 0 || ld0Var.N == null) {
                            Bundle bundle = ld0Var.S;
                            if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i21 = ld0Var.E;
                                if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                    if (i21 == 3) {
                                        org.telegram.messenger.i0.D3(false);
                                        if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                            ld0Var.M = true;
                                            ke0Var2.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ld0Var.J);
                                            bundle2.putString("ephone", ld0Var.I);
                                            bundle2.putString("phoneFormated", ld0Var.G);
                                            ld0Var.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ld0Var.G;
                                            tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                            i172 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            hf0Var2.v1(ConnectionsManager.getInstance(i172).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i20) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ld0Var.M = true;
                                    ke0Var2.invalidate();
                                    org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                    ke0Var2.setTextSize(1, 15.0f);
                                    int i22 = ld0Var.E;
                                    if (i22 == 4 || i22 == 11) {
                                        ke0Var2.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                    } else {
                                        ke0Var2.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ld0Var.J);
                                    bundle3.putString("ephone", ld0Var.I);
                                    bundle3.putString("phoneFormated", ld0Var.G);
                                    bundle3.putInt("prevType", ld0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ld0Var.G;
                                    tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                    i162 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i162).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i19) {
                                                case 0:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
        ec0Var2.addView(n0Var2, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        ec0Var2.e(n0Var2);
        ec0Var2.addView(textView32, w7.b6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(ec0Var2, w7.b6.r(-1, -2, 1));
        addView(linearLayout2, w7.b6.t(-1, -2, 1, 16, 3, 16, 0));
        n0Var2.setOnEditorActionListener(new ha(this, i132));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, w7.b6.o(-1, -2));
        mc0 mc0Var2 = new mc0(hf0Var, context);
        this.d = mc0Var2;
        int i162 = org.telegram.ui.ActionBar.t6.I6;
        org.telegram.ui.ActionBar.a7.H(mc0Var2, i162, null);
        org.telegram.ui.ActionBar.a7.V(mc0Var2, i162, hf0Var.getResourceProvider());
        mc0Var2.setTextSize(1, 14.0f);
        mc0Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        mc0Var2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
        mc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ ld0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1622;
                int i172;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i18 = i11;
                CharSequence charSequence = null;
                final int i19 = 0;
                final ld0 ld0Var = this.b;
                final int i20 = 1;
                switch (i18) {
                    case 0:
                        org.telegram.ui.ActionBar.n0 n0Var22 = ld0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = n0Var22.getText();
                            ld0Var.D = true;
                            if (text != null) {
                                int max = Math.max(0, n0Var22.getSelectionStart());
                                text.replace(max, Math.max(max, n0Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ld0Var.p(true);
                        break;
                    case 1:
                        ld0Var.c(true);
                        break;
                    default:
                        hf0 hf0Var2 = ld0Var.a0;
                        ke0 ke0Var2 = ld0Var.w;
                        if (ld0Var.P <= 0 || ld0Var.N == null) {
                            Bundle bundle = ld0Var.S;
                            if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i21 = ld0Var.E;
                                if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                    if (i21 == 3) {
                                        org.telegram.messenger.i0.D3(false);
                                        if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                            ld0Var.M = true;
                                            ke0Var2.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ld0Var.J);
                                            bundle2.putString("ephone", ld0Var.I);
                                            bundle2.putString("phoneFormated", ld0Var.G);
                                            ld0Var.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ld0Var.G;
                                            tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                            i172 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            hf0Var2.v1(ConnectionsManager.getInstance(i172).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i20) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ld0Var.M = true;
                                    ke0Var2.invalidate();
                                    org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                    ke0Var2.setTextSize(1, 15.0f);
                                    int i22 = ld0Var.E;
                                    if (i22 == 4 || i22 == 11) {
                                        ke0Var2.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                    } else {
                                        ke0Var2.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ld0Var.J);
                                    bundle3.putString("ephone", ld0Var.I);
                                    bundle3.putString("phoneFormated", ld0Var.G);
                                    bundle3.putInt("prevType", ld0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ld0Var.G;
                                    tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                    i1622 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1622).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i19) {
                                                case 0:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
        addView(mc0Var2, w7.b6.t(-2, -2, 1, 0, 18, 0, 0));
        mc0Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(org.telegram.messenger.cd.L0(z11 ? 2131745971 : 2131745979, null));
        org.telegram.ui.ActionBar.a7.V(textView42, org.telegram.ui.ActionBar.t6.p7, hf0Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-org.telegram.messenger.i0.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(org.telegram.messenger.cd.L0(z11 ? 2131745969 : 2131745977, null));
        org.telegram.ui.ActionBar.a7.V(textView52, org.telegram.ui.ActionBar.t6.y6, hf0Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, w7.b6.d(-1, -2.0f, org.telegram.messenger.zs.E1, 16.0f, 8.0f, 16.0f, 8.0f));
        ke0 ke0Var2 = new ke0(this, context);
        this.w = ke0Var2;
        org.telegram.ui.ActionBar.a7.H(ke0Var2, i162, null);
        ke0Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        ke0Var2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
        ke0Var2.setTextSize(1, 15.0f);
        ke0Var2.setGravity(19);
        final int i172 = 2;
        ke0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ ld0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1622;
                int i1722;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                int i18 = i172;
                CharSequence charSequence = null;
                final int i19 = 0;
                final ld0 ld0Var = this.b;
                final int i20 = 1;
                switch (i18) {
                    case 0:
                        org.telegram.ui.ActionBar.n0 n0Var22 = ld0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ld0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ld0Var.getContext());
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = n0Var22.getText();
                            ld0Var.D = true;
                            if (text != null) {
                                int max = Math.max(0, n0Var22.getSelectionStart());
                                text.replace(max, Math.max(max, n0Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ld0Var.p(true);
                        break;
                    case 1:
                        ld0Var.c(true);
                        break;
                    default:
                        hf0 hf0Var2 = ld0Var.a0;
                        ke0 ke0Var22 = ld0Var.w;
                        if (ld0Var.P <= 0 || ld0Var.N == null) {
                            Bundle bundle = ld0Var.S;
                            if (bundle != null && (tL_auth_sentCode = ld0Var.T) != null) {
                                hf0Var2.o1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i21 = ld0Var.E;
                                if (i21 != 4 && i21 != 2 && i21 != 11 && i21 != 15) {
                                    if (i21 == 3) {
                                        org.telegram.messenger.i0.D3(false);
                                        if (!ld0Var.R && !ld0Var.M && !hf0Var2.p0) {
                                            ld0Var.M = true;
                                            ke0Var22.invalidate();
                                            org.telegram.ui.ActionBar.a7.V(ke0Var22, org.telegram.ui.ActionBar.t6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ld0Var.J);
                                            bundle2.putString("ephone", ld0Var.I);
                                            bundle2.putString("phoneFormated", ld0Var.G);
                                            ld0Var.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ld0Var.G;
                                            tL_auth_resendCode.phone_code_hash = ld0Var.H;
                                            i1722 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                            hf0Var2.v1(ConnectionsManager.getInstance(i1722).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i20) {
                                                        case 0:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ld0Var.M = true;
                                    ke0Var22.invalidate();
                                    org.telegram.ui.ActionBar.a7.V(ke0Var22, org.telegram.ui.ActionBar.t6.I6, null);
                                    ke0Var22.setTextSize(1, 15.0f);
                                    int i22 = ld0Var.E;
                                    if (i22 == 4 || i22 == 11) {
                                        ke0Var22.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                    } else {
                                        ke0Var22.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ld0Var.J);
                                    bundle3.putString("ephone", ld0Var.I);
                                    bundle3.putString("phoneFormated", ld0Var.G);
                                    bundle3.putInt("prevType", ld0Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ld0Var.G;
                                    tL_auth_resendCode2.phone_code_hash = ld0Var.H;
                                    i1622 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i1622).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.gd0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i19) {
                                                case 0:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.g3(new id0(ld0Var, tL_error, bundle3, tLObject));
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
        frameLayout22.addView(ke0Var2, w7.b6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, w7.b6.r(-1, -1, 80));
        li.k.i(ke0Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean c(boolean z10) {
        hf0 hf0Var = this.a0;
        hf0Var.s1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            hf0Var.C1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.R = false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void g() {
        org.telegram.messenger.i0.r(this.U);
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748283, "NewPassword");
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        if (this.R) {
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
        this.R = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.G;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.H;
        tL_auth_signIn.flags |= 1;
        hf0 hf0Var = this.a0;
        hf0Var.v1(hf0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new fd0(this, tL_auth_signIn, 0), 10), true);
        hf0Var.D1(true, true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void i() {
        p(true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        org.telegram.messenger.i0.h3(new jd0(this, 3), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.L);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
        ke0 ke0Var = this.w;
        if (bundle == null) {
            if (this.S == null || this.T == null) {
                return;
            }
            org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
            int i10 = this.E;
            ke0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(i10 == 17 ? 2131746067 : i10 == 16 ? 2131746065 : i10 == 3 ? 2131746064 : 2131746066, null), true, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
            return;
        }
        org.telegram.ui.ActionBar.n0 n0Var = this.c;
        n0Var.setText("");
        this.L = bundle;
        this.K = null;
        this.E = bundle.getInt("nextType");
        this.F = bundle.getInt("prevType", 0);
        this.I = bundle.getString("ephone");
        if (this.L.containsKey("beginning")) {
            this.K = this.L.getString("beginning");
        }
        this.G = bundle.getString("phoneFormated");
        this.H = bundle.getString("phoneHash");
        this.J = this.L.getString("phone");
        this.P = bundle.getInt("timeout");
        int i11 = this.F;
        mc0 mc0Var = this.d;
        if (i11 == 17) {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753754, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else if (i11 == 16) {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753753, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 3 || i11 == 15) {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753755, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else {
            mc0Var.setVisibility(8);
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        hf0 hf0Var = this.a0;
        hf0Var.p0 = false;
        ke0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + af.b.c().b(af.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.m5.q(null, null, !z11 ? 2131745968 : 2131745976, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.m5.q(null, null, !z11 ? 2131745972 : 2131745980, new Object[]{str, str2}, textView);
        }
        hf0.Z0(hf0Var, n0Var);
        n0Var.requestFocus();
        org.telegram.ui.Components.ei0 ei0Var = this.h;
        if (ei0Var.getAnimatedDrawable() != null) {
            ei0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.i0.h3(new zy(ei0Var, 23), 500L);
        p(false);
        n(false);
        this.Q = System.currentTimeMillis();
        int i12 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i12, null);
        int i13 = this.E;
        if (i13 != 2 && i13 != 4 && i13 != 3) {
            ke0Var.setVisibility(8);
            return;
        }
        if (this.N != null) {
            return;
        }
        org.telegram.ui.ActionBar.a7.V(ke0Var, i12, null);
        ke0Var.setTag(R.id.color_key_tag, Integer.valueOf(i12));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new e6.r(this, 3), 0L, 1000L);
    }

    public final void n(boolean z10) {
        this.y = z10;
        float f7 = 0.0f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.b.a(f10);
        float f11 = (f10 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.i0.L(-5.0f));
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.z20.m(translationY, grVar, 290L);
        if (this.x && !this.y) {
            f7 = 1.0f;
        }
        float f12 = (0.1f * f7) + 0.9f;
        this.f.animate().scaleX(f12).scaleY(f12).alpha(f7).translationY((1.0f - f7) * org.telegram.messenger.i0.L(this.y ? 5.0f : -5.0f)).setInterpolator(grVar).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.K == null) {
            return true;
        }
        String lowerCase = s(str).toLowerCase();
        String lowerCase2 = this.K.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void p(boolean z10) {
        jd0 jd0Var = this.U;
        org.telegram.messenger.i0.r(jd0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.x != z11) {
            this.x = z11;
            float f7 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f10 = 0.0f;
            if (z10) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                scaleY.setInterpolator(grVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f7).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f10 = org.telegram.messenger.i0.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f10).setInterpolator(grVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f7 = 1.0f;
                }
                textView2.setScaleY(f7);
                textView2.setAlpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f10 = org.telegram.messenger.i0.L(this.y ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f10);
            }
        }
        org.telegram.messenger.i0.h3(jd0Var, 5000L);
    }

    public final void q() {
        ke0 ke0Var = this.w;
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.O) {
                try {
                    Timer timer = this.N;
                    if (timer != null) {
                        timer.cancel();
                        this.N = null;
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r(boolean z10) {
        org.telegram.ui.ActionBar.n0 n0Var = this.c;
        if (this.a0.getParentActivity() == null) {
            return;
        }
        try {
            n0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(!z11 ? 2131745973 : 2131745981, null));
        } else if (TextUtils.isEmpty(n0Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(org.telegram.messenger.cd.L0(!z11 ? 2131745971 : 2131745979, null));
        }
        if (!this.y && !this.D) {
            org.telegram.messenger.i0.F3(this.W, n0Var, null);
            org.telegram.messenger.i0.F3(this.W, textView, null);
        }
        jd0 jd0Var = this.V;
        org.telegram.messenger.i0.r(jd0Var);
        n(true);
        org.telegram.messenger.i0.h3(jd0Var, 10000L);
        this.W = -this.W;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        hf0 hf0Var = this.a0;
        this.n.setTextColor(hf0Var.getThemedColor(i10));
        this.r.setTextColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.D6));
        int themedColor = hf0Var.getThemedColor(i10);
        org.telegram.ui.ActionBar.n0 n0Var = this.c;
        n0Var.setTextColor(themedColor);
        n0Var.setCursorColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.l6));
        n0Var.setHintTextColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.H6));
        this.b.f();
    }
}
