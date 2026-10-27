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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ie0 extends org.telegram.ui.Components.bx0 {
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
    public final fe0 U;
    public final fe0 V;
    public float W;
    public final int a;
    public final /* synthetic */ ig0 a0;
    public final org.telegram.ui.Components.sd0 b;
    public final fi.c2 c;
    public final fd0 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.bk0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final jf0 v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ie0(ig0 ig0Var, Context context, int i10) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        this.a0 = ig0Var;
        this.w = true;
        this.x = false;
        this.y = false;
        this.O = new Object();
        this.P = 60000;
        this.U = new fe0(this, 1);
        this.V = new fe0(this, 2);
        this.W = -3.0f;
        this.a = i10;
        boolean z11 = i10 != 16;
        setOrientation(1);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.h = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.f(R.raw.bubble, 95, 95, null);
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z10 = false;
                bk0Var.setVisibility(!z10 ? 8 : 0);
                addView(bk0Var, org.telegram.ui.Components.kb1.x(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
                this.b = sd0Var;
                sd0Var.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
                fi.c2 c2Var = new fi.c2(this, context, 8);
                this.c = c2Var;
                c2Var.setSingleLine();
                c2Var.setLines(1);
                c2Var.setCursorSize(AndroidUtilities.dp(20.0f));
                c2Var.setCursorWidth(1.5f);
                c2Var.setImeOptions(268435461);
                c2Var.setTextSize(1, 18.0f);
                c2Var.setMaxLines(1);
                c2Var.setBackground(null);
                c2Var.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
                c2Var.addTextChangedListener(new org.telegram.ui.Cells.f3(this));
                c2Var.setEllipsizeByGradient(true);
                c2Var.setInputType(1);
                c2Var.setTypeface(Typeface.DEFAULT);
                c2Var.setGravity(!LocaleController.isRTL ? 5 : 3);
                c2Var.setOnFocusChangeListener(new rd(this, 5));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                ic.a.o(12.0f, 1, textView3);
                textView3.setPadding(d3.h(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
                textView3.setGravity(17);
                int i11 = org.telegram.ui.ActionBar.y6.o6;
                u6Var = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
                u6Var2 = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
                org.telegram.ui.ActionBar.f7.V(textView3, i11, u6Var2);
                int dp = AndroidUtilities.dp(6.0f);
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.12f, w02);
                int o13 = org.telegram.ui.ActionBar.y6.o1(0.15f, w02);
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13);
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i11);
                org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i11);
                u6Var3 = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
                textView3.setBackground(j02);
                org.telegram.ui.ActionBar.f7.k(textView3, j02, L, L2, u6Var3);
                org.telegram.ui.Components.kb1.c(textView3, 0.1f, 1.5f);
                c2Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
                final int i12 = 0;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
                    public final /* synthetic */ ie0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i13;
                        int i14;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i12) {
                            case 0:
                                ie0 ie0Var = this.b;
                                fi.c2 c2Var2 = ie0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = c2Var2.getText();
                                    ie0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, c2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, c2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ie0Var.p(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ie0 ie0Var2 = this.b;
                                ig0 ig0Var2 = ie0Var2.a0;
                                jf0 jf0Var = ie0Var2.v;
                                if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                                    Bundle bundle = ie0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                        ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = ie0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                                    ie0Var2.M = true;
                                                    jf0Var.invalidate();
                                                    org.telegram.ui.ActionBar.f7.V(jf0Var, org.telegram.ui.ActionBar.y6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ie0Var2.J);
                                                    bundle2.putString("ephone", ie0Var2.I);
                                                    bundle2.putString("phoneFormated", ie0Var2.G);
                                                    ie0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ie0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                                    i14 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    ig0Var2.s1(ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ie0Var2.M = true;
                                            jf0Var.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var, org.telegram.ui.ActionBar.y6.I6, null);
                                            jf0Var.setTextSize(1, 15.0f);
                                            int i17 = ie0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                jf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                jf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ie0Var2.J);
                                            bundle3.putString("ephone", ie0Var2.I);
                                            bundle3.putString("phoneFormated", ie0Var2.G);
                                            bundle3.putInt("prevType", ie0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ie0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                            i13 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
                sd0Var.addView(c2Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                sd0Var.e(c2Var);
                sd0Var.addView(textView3, org.telegram.ui.Components.kb1.h(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(sd0Var, org.telegram.ui.Components.kb1.u(-1, -2, 1));
                addView(linearLayout, org.telegram.ui.Components.kb1.x(-1, -2, 1, 16, 3, 16, 0));
                c2Var.setOnEditorActionListener(new la(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                fd0 fd0Var = new fd0(ig0Var, context);
                this.d = fd0Var;
                int i13 = org.telegram.ui.ActionBar.y6.I6;
                org.telegram.ui.ActionBar.f7.H(fd0Var, i13, null);
                org.telegram.ui.ActionBar.f7.V(fd0Var, i13, ig0Var.getResourceProvider());
                fd0Var.setTextSize(1, 14.0f);
                fd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                fd0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 1;
                fd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
                    public final /* synthetic */ ie0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i132;
                        int i142;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i14) {
                            case 0:
                                ie0 ie0Var = this.b;
                                fi.c2 c2Var2 = ie0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = c2Var2.getText();
                                    ie0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, c2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, c2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ie0Var.p(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ie0 ie0Var2 = this.b;
                                ig0 ig0Var2 = ie0Var2.a0;
                                jf0 jf0Var = ie0Var2.v;
                                if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                                    Bundle bundle = ie0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                        ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i15 = ie0Var2.E;
                                        if (i15 != 4 && i15 != 2 && i15 != 11 && i15 != 15) {
                                            if (i15 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                                    ie0Var2.M = true;
                                                    jf0Var.invalidate();
                                                    org.telegram.ui.ActionBar.f7.V(jf0Var, org.telegram.ui.ActionBar.y6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ie0Var2.J);
                                                    bundle2.putString("ephone", ie0Var2.I);
                                                    bundle2.putString("phoneFormated", ie0Var2.G);
                                                    ie0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ie0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                                    i142 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    ig0Var2.s1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ie0Var2.M = true;
                                            jf0Var.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var, org.telegram.ui.ActionBar.y6.I6, null);
                                            jf0Var.setTextSize(1, 15.0f);
                                            int i17 = ie0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                jf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                jf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ie0Var2.J);
                                            bundle3.putString("ephone", ie0Var2.I);
                                            bundle3.putString("phoneFormated", ie0Var2.G);
                                            bundle3.putInt("prevType", ie0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ie0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                            i132 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
                addView(fd0Var, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 18, 0, 0));
                fd0Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.p7, ig0Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
                org.telegram.ui.ActionBar.f7.V(textView5, org.telegram.ui.ActionBar.y6.y6, ig0Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                jf0 jf0Var = new jf0(this, context);
                this.v = jf0Var;
                org.telegram.ui.ActionBar.f7.H(jf0Var, i13, null);
                jf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                jf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                jf0Var.setTextSize(1, 15.0f);
                jf0Var.setGravity(19);
                final int i15 = 2;
                jf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
                    public final /* synthetic */ ie0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i132;
                        int i142;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i15) {
                            case 0:
                                ie0 ie0Var = this.b;
                                fi.c2 c2Var2 = ie0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = c2Var2.getText();
                                    ie0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, c2Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, c2Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ie0Var.p(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ie0 ie0Var2 = this.b;
                                ig0 ig0Var2 = ie0Var2.a0;
                                jf0 jf0Var2 = ie0Var2.v;
                                if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                                    Bundle bundle = ie0Var2.S;
                                    if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                        ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i152 = ie0Var2.E;
                                        if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                                    ie0Var2.M = true;
                                                    jf0Var2.invalidate();
                                                    org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ie0Var2.J);
                                                    bundle2.putString("ephone", ie0Var2.I);
                                                    bundle2.putString("phoneFormated", ie0Var2.G);
                                                    ie0Var2.R = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ie0Var2.G;
                                                    tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                                    i142 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                                    final int i16 = 1;
                                                    ig0Var2.s1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i16) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ie0Var2.M = true;
                                            jf0Var2.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                            jf0Var2.setTextSize(1, 15.0f);
                                            int i17 = ie0Var2.E;
                                            if (i17 == 4 || i17 == 11) {
                                                jf0Var2.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                jf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ie0Var2.J);
                                            bundle3.putString("ephone", ie0Var2.I);
                                            bundle3.putString("phoneFormated", ie0Var2.G);
                                            bundle3.putInt("prevType", ie0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ie0Var2.G;
                                            tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                            i132 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i18 = 0;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i18) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
                frameLayout2.addView(jf0Var, org.telegram.ui.Components.kb1.h(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, org.telegram.ui.Components.kb1.u(-1, -1, 80));
                k6.c.h(jf0Var);
            }
        }
        z10 = true;
        bk0Var.setVisibility(!z10 ? 8 : 0);
        addView(bk0Var, org.telegram.ui.Components.kb1.x(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView6, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView22, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.sd0 sd0Var2 = new org.telegram.ui.Components.sd0(context, null);
        this.b = sd0Var2;
        sd0Var2.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
        fi.c2 c2Var2 = new fi.c2(this, context, 8);
        this.c = c2Var2;
        c2Var2.setSingleLine();
        c2Var2.setLines(1);
        c2Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        c2Var2.setCursorWidth(1.5f);
        c2Var2.setImeOptions(268435461);
        c2Var2.setTextSize(1, 18.0f);
        c2Var2.setMaxLines(1);
        c2Var2.setBackground(null);
        c2Var2.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        c2Var2.addTextChangedListener(new org.telegram.ui.Cells.f3(this));
        c2Var2.setEllipsizeByGradient(true);
        c2Var2.setInputType(1);
        c2Var2.setTypeface(Typeface.DEFAULT);
        c2Var2.setGravity(!LocaleController.isRTL ? 5 : 3);
        c2Var2.setOnFocusChangeListener(new rd(this, 5));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        ic.a.o(12.0f, 1, textView32);
        textView32.setPadding(d3.h(10.0f, R.string.Paste, textView32), 0, AndroidUtilities.dp(10.0f), 0);
        textView32.setGravity(17);
        int i112 = org.telegram.ui.ActionBar.y6.o6;
        u6Var = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
        int w022 = org.telegram.ui.ActionBar.y6.w0(i112, u6Var);
        u6Var2 = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
        org.telegram.ui.ActionBar.f7.V(textView32, i112, u6Var2);
        int dp2 = AndroidUtilities.dp(6.0f);
        int o122 = org.telegram.ui.ActionBar.y6.o1(0.12f, w022);
        int o132 = org.telegram.ui.ActionBar.y6.o1(0.15f, w022);
        org.telegram.ui.Cells.y j022 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, o122, o132, o132);
        org.telegram.ui.ActionBar.b7 L3 = org.telegram.ui.ActionBar.f7.L(0.12f, i112);
        org.telegram.ui.ActionBar.b7 L22 = org.telegram.ui.ActionBar.f7.L(0.15f, i112);
        u6Var3 = ((org.telegram.ui.ActionBar.r2) ig0Var).resourceProvider;
        textView32.setBackground(j022);
        org.telegram.ui.ActionBar.f7.k(textView32, j022, L3, L22, u6Var3);
        org.telegram.ui.Components.kb1.c(textView32, 0.1f, 1.5f);
        c2Var2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
        final int i122 = 0;
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
            public final /* synthetic */ ie0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i132;
                int i142;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i122) {
                    case 0:
                        ie0 ie0Var = this.b;
                        fi.c2 c2Var22 = ie0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = c2Var22.getText();
                            ie0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, c2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, c2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ie0Var.p(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ie0 ie0Var2 = this.b;
                        ig0 ig0Var2 = ie0Var2.a0;
                        jf0 jf0Var2 = ie0Var2.v;
                        if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                            Bundle bundle = ie0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = ie0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                            ie0Var2.M = true;
                                            jf0Var2.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ie0Var2.J);
                                            bundle2.putString("ephone", ie0Var2.I);
                                            bundle2.putString("phoneFormated", ie0Var2.G);
                                            ie0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ie0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                            i142 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i16 = 1;
                                            ig0Var2.s1(ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ie0Var2.M = true;
                                    jf0Var2.invalidate();
                                    org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                    jf0Var2.setTextSize(1, 15.0f);
                                    int i17 = ie0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        jf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        jf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ie0Var2.J);
                                    bundle3.putString("ephone", ie0Var2.I);
                                    bundle3.putString("phoneFormated", ie0Var2.G);
                                    bundle3.putInt("prevType", ie0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ie0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                    i132 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
        sd0Var2.addView(c2Var2, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        sd0Var2.e(c2Var2);
        sd0Var2.addView(textView32, org.telegram.ui.Components.kb1.h(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(sd0Var2, org.telegram.ui.Components.kb1.u(-1, -2, 1));
        addView(linearLayout2, org.telegram.ui.Components.kb1.x(-1, -2, 1, 16, 3, 16, 0));
        c2Var2.setOnEditorActionListener(new la(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, org.telegram.ui.Components.kb1.r(-1, -2));
        fd0 fd0Var2 = new fd0(ig0Var, context);
        this.d = fd0Var2;
        int i132 = org.telegram.ui.ActionBar.y6.I6;
        org.telegram.ui.ActionBar.f7.H(fd0Var2, i132, null);
        org.telegram.ui.ActionBar.f7.V(fd0Var2, i132, ig0Var.getResourceProvider());
        fd0Var2.setTextSize(1, 14.0f);
        fd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        fd0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i142 = 1;
        fd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
            public final /* synthetic */ ie0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1322;
                int i1422;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i142) {
                    case 0:
                        ie0 ie0Var = this.b;
                        fi.c2 c2Var22 = ie0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = c2Var22.getText();
                            ie0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, c2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, c2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ie0Var.p(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ie0 ie0Var2 = this.b;
                        ig0 ig0Var2 = ie0Var2.a0;
                        jf0 jf0Var2 = ie0Var2.v;
                        if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                            Bundle bundle = ie0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i152 = ie0Var2.E;
                                if (i152 != 4 && i152 != 2 && i152 != 11 && i152 != 15) {
                                    if (i152 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                            ie0Var2.M = true;
                                            jf0Var2.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ie0Var2.J);
                                            bundle2.putString("ephone", ie0Var2.I);
                                            bundle2.putString("phoneFormated", ie0Var2.G);
                                            ie0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ie0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                            i1422 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i16 = 1;
                                            ig0Var2.s1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ie0Var2.M = true;
                                    jf0Var2.invalidate();
                                    org.telegram.ui.ActionBar.f7.V(jf0Var2, org.telegram.ui.ActionBar.y6.I6, null);
                                    jf0Var2.setTextSize(1, 15.0f);
                                    int i17 = ie0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        jf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        jf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ie0Var2.J);
                                    bundle3.putString("ephone", ie0Var2.I);
                                    bundle3.putString("phoneFormated", ie0Var2.G);
                                    bundle3.putInt("prevType", ie0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ie0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                    i1322 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
        addView(fd0Var2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 18, 0, 0));
        fd0Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        org.telegram.ui.ActionBar.f7.V(textView42, org.telegram.ui.ActionBar.y6.p7, ig0Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        org.telegram.ui.ActionBar.f7.V(textView52, org.telegram.ui.ActionBar.y6.y6, ig0Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        jf0 jf0Var2 = new jf0(this, context);
        this.v = jf0Var2;
        org.telegram.ui.ActionBar.f7.H(jf0Var2, i132, null);
        jf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        jf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        jf0Var2.setTextSize(1, 15.0f);
        jf0Var2.setGravity(19);
        final int i152 = 2;
        jf0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ge0
            public final /* synthetic */ ie0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1322;
                int i1422;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i152) {
                    case 0:
                        ie0 ie0Var = this.b;
                        fi.c2 c2Var22 = ie0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ie0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ie0Var.getContext());
                        } catch (Exception e) {
                            FileLog.e(e);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = c2Var22.getText();
                            ie0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, c2Var22.getSelectionStart());
                                text.replace(max, Math.max(max, c2Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        ie0Var.p(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ie0 ie0Var2 = this.b;
                        ig0 ig0Var2 = ie0Var2.a0;
                        jf0 jf0Var22 = ie0Var2.v;
                        if (ie0Var2.P <= 0 || ie0Var2.N == null) {
                            Bundle bundle = ie0Var2.S;
                            if (bundle != null && (tL_auth_sentCode = ie0Var2.T) != null) {
                                ig0Var2.l1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i1522 = ie0Var2.E;
                                if (i1522 != 4 && i1522 != 2 && i1522 != 11 && i1522 != 15) {
                                    if (i1522 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ie0Var2.R && !ie0Var2.M && !ig0Var2.p0) {
                                            ie0Var2.M = true;
                                            jf0Var22.invalidate();
                                            org.telegram.ui.ActionBar.f7.V(jf0Var22, org.telegram.ui.ActionBar.y6.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ie0Var2.J);
                                            bundle2.putString("ephone", ie0Var2.I);
                                            bundle2.putString("phoneFormated", ie0Var2.G);
                                            ie0Var2.R = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ie0Var2.G;
                                            tL_auth_resendCode.phone_code_hash = ie0Var2.H;
                                            i1422 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            final int i16 = 1;
                                            ig0Var2.s1(ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i16) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ie0Var2.M = true;
                                    jf0Var22.invalidate();
                                    org.telegram.ui.ActionBar.f7.V(jf0Var22, org.telegram.ui.ActionBar.y6.I6, null);
                                    jf0Var22.setTextSize(1, 15.0f);
                                    int i17 = ie0Var2.E;
                                    if (i17 == 4 || i17 == 11) {
                                        jf0Var22.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        jf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ie0Var2.J);
                                    bundle3.putString("ephone", ie0Var2.I);
                                    bundle3.putString("phoneFormated", ie0Var2.G);
                                    bundle3.putInt("prevType", ie0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ie0Var2.G;
                                    tL_auth_resendCode2.phone_code_hash = ie0Var2.H;
                                    i1322 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                    final int i18 = 0;
                                    ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ce0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i18) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ee0(ie0Var2, tL_error, bundle3, tLObject));
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
        frameLayout22.addView(jf0Var2, org.telegram.ui.Components.kb1.h(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, org.telegram.ui.Components.kb1.u(-1, -1, 80));
        k6.c.h(jf0Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        return (i10 > 0 || length < str.length()) ? str.substring(i10, length) : str;
    }

    @Override // org.telegram.ui.Components.bx0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.bx0
    public final boolean c(boolean z10) {
        ig0 ig0Var = this.a0;
        ig0Var.p1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            ig0Var.z1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override // org.telegram.ui.Components.bx0
    public final void d() {
        this.R = false;
    }

    @Override // org.telegram.ui.Components.bx0
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override // org.telegram.ui.Components.bx0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.bx0
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
        ig0 ig0Var = this.a0;
        ig0Var.s1(ig0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new be0(this, tL_auth_signIn, 0), 10), true);
        ig0Var.A1(true, true);
    }

    @Override // org.telegram.ui.Components.bx0
    public final void i() {
        p(true);
    }

    @Override // org.telegram.ui.Components.bx0
    public final void j() {
        AndroidUtilities.runOnUIThread(new fe0(this, 3), ig0.y0);
    }

    @Override // org.telegram.ui.Components.bx0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.bx0
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.L);
        }
    }

    @Override // org.telegram.ui.Components.bx0
    public final void m(Bundle bundle, boolean z10) {
        jf0 jf0Var = this.v;
        if (bundle == null) {
            if (this.S == null || this.T == null) {
                return;
            }
            org.telegram.ui.ActionBar.f7.V(jf0Var, org.telegram.ui.ActionBar.y6.I6, null);
            int i10 = this.E;
            jf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i10 == 17 ? R.string.ReturnEnteringPhrase : i10 == 16 ? R.string.ReturnEnteringWord : i10 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            return;
        }
        fi.c2 c2Var = this.c;
        c2Var.setText("");
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
        fd0 fd0Var = this.d;
        if (i11 == 17) {
            fd0Var.setVisibility(0);
            fd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 16) {
            fd0Var.setVisibility(0);
            fd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 3 || i11 == 15) {
            fd0Var.setVisibility(0);
            fd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            fd0Var.setVisibility(8);
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        ig0 ig0Var = this.a0;
        ig0Var.p0 = false;
        jf0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + kf.b.c().b(kf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.wh.o(!z11 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.wh.o(!z11 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        ig0.W0(ig0Var, c2Var);
        c2Var.requestFocus();
        org.telegram.ui.Components.bk0 bk0Var = this.h;
        if (bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().N(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new r00(bk0Var, 22), 500L);
        p(false);
        n(false);
        this.Q = System.currentTimeMillis();
        int i12 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.V(jf0Var, i12, null);
        int i13 = this.E;
        if (i13 != 2 && i13 != 4 && i13 != 3) {
            jf0Var.setVisibility(8);
            return;
        }
        if (this.N != null) {
            return;
        }
        org.telegram.ui.ActionBar.f7.V(jf0Var, i12, null);
        jf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i12));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new he0(this), 0L, 1000L);
    }

    public final void n(boolean z10) {
        this.x = z10;
        float f7 = 0.0f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.b.a(f10);
        float f11 = (f10 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        org.telegram.messenger.wh.q(translationY, dsVar, 290L);
        if (this.w && !this.x) {
            f7 = 1.0f;
        }
        float f12 = (0.1f * f7) + 0.9f;
        this.f.animate().scaleX(f12).scaleY(f12).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(this.x ? 5.0f : -5.0f)).setInterpolator(dsVar).setDuration(290L).start();
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
        fe0 fe0Var = this.U;
        AndroidUtilities.cancelRunOnUIThread(fe0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.w != z11) {
            this.w = z11;
            float f7 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f10 = 0.0f;
            if (z10) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                scaleY.setInterpolator(dsVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f7).alpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f10 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                alpha.translationY(f10).setInterpolator(dsVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f7 = 1.0f;
                }
                textView2.setScaleY(f7);
                textView2.setAlpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f10 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f10);
            }
        }
        AndroidUtilities.runOnUIThread(fe0Var, 5000L);
    }

    public final void q() {
        jf0 jf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.V(jf0Var, i10, null);
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
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
            FileLog.e(e);
        }
    }

    public final void r(boolean z10) {
        fi.c2 c2Var = this.c;
        if (this.a0.getParentActivity() == null) {
            return;
        }
        try {
            c2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(c2Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.x && !this.y) {
            AndroidUtilities.shakeViewSpring(c2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        fe0 fe0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(fe0Var);
        n(true);
        AndroidUtilities.runOnUIThread(fe0Var, 10000L);
        this.W = -this.W;
    }

    @Override // org.telegram.ui.Components.bx0
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        ig0 ig0Var = this.a0;
        this.n.setTextColor(ig0Var.getThemedColor(i10));
        this.r.setTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.y6.D6));
        int themedColor = ig0Var.getThemedColor(i10);
        fi.c2 c2Var = this.c;
        c2Var.setTextColor(themedColor);
        c2Var.setCursorColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.y6.l6));
        c2Var.setHintTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.y6.H6));
        this.b.f();
    }
}
