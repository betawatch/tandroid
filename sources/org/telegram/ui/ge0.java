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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ge0 extends org.telegram.ui.Components.cv0 {
    public int A;
    public int B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public Bundle H;
    public boolean I;
    public Timer J;
    public final Object K;
    public int L;
    public double M;
    public boolean N;
    public Bundle O;
    public TLRPC.TL_auth_sentCode P;
    public final de0 Q;
    public final de0 R;
    public float S;
    public final /* synthetic */ fg0 T;
    public final int a;
    public final org.telegram.ui.Components.fc0 b;
    public final fg.g c;
    public final org.telegram.ui.Components.voip.m2 d;
    public final TextView e;
    public final TextView f;
    public final org.telegram.ui.Components.pi0 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final hf0 v;
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
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ge0(fg0 fg0Var, Context context, int i9) {
        super(context);
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        this.T = fg0Var;
        this.w = true;
        this.x = false;
        this.y = false;
        this.K = new Object();
        this.L = 60000;
        this.Q = new de0(this, 1);
        this.R = new de0(this, 2);
        this.S = -3.0f;
        this.a = i9;
        boolean z11 = i9 != 16;
        setOrientation(1);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.h = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var.f(R.raw.bubble, 95, 95, null);
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                z10 = false;
                pi0Var.setVisibility(!z10 ? 8 : 0);
                addView(pi0Var, g7.e6.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                addView(textView, g7.e6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, g7.e6.t(-2, -2, 1, 8, 5, 8, 16));
                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                this.b = fc0Var;
                fc0Var.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
                fg.g gVar = new fg.g(this, context, 9);
                this.c = gVar;
                gVar.setSingleLine();
                gVar.setLines(1);
                gVar.setCursorSize(AndroidUtilities.dp(20.0f));
                gVar.setCursorWidth(1.5f);
                gVar.setImeOptions(268435461);
                gVar.setTextSize(1, 18.0f);
                gVar.setMaxLines(1);
                gVar.setBackground(null);
                gVar.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
                gVar.addTextChangedListener(new org.telegram.ui.Cells.i3(this));
                gVar.setEllipsizeByGradient(true);
                gVar.setInputType(1);
                gVar.setTypeface(Typeface.DEFAULT);
                gVar.setGravity(!LocaleController.isRTL ? 5 : 3);
                gVar.setOnFocusChangeListener(new ld(this, 5));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                j3.r0.u(12.0f, 1, textView3);
                textView3.setPadding(org.telegram.ui.Cells.j2.c(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
                textView3.setGravity(17);
                int i10 = org.telegram.ui.ActionBar.f6.o6;
                b6Var = ((org.telegram.ui.ActionBar.o2) fg0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
                textView3.setTextColor(v02);
                int dp = AndroidUtilities.dp(6.0f);
                int l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, v02);
                int l12 = org.telegram.ui.ActionBar.f6.l1(0.15f, v02);
                textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
                g7.g6.b(textView3, 0.1f, 1.5f);
                gVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
                final int i11 = 0;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i12;
                        int i13;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i11) {
                            case 0:
                                ge0 ge0Var = this.b;
                                fg.g gVar2 = ge0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    ge0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ge0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ge0 ge0Var2 = this.b;
                                fg0 fg0Var2 = ge0Var2.T;
                                hf0 hf0Var = ge0Var2.v;
                                if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                                    Bundle bundle = ge0Var2.O;
                                    if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                        fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i14 = ge0Var2.A;
                                        if (i14 != 4 && i14 != 2 && i14 != 11 && i14 != 15) {
                                            if (i14 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                                    ge0Var2.I = true;
                                                    hf0Var.invalidate();
                                                    hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ge0Var2.F);
                                                    bundle2.putString("ephone", ge0Var2.E);
                                                    bundle2.putString("phoneFormated", ge0Var2.C);
                                                    ge0Var2.N = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ge0Var2.C;
                                                    tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                                    i13 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                                    final int i15 = 1;
                                                    fg0Var2.n1(ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i15) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ge0Var2.I = true;
                                            hf0Var.invalidate();
                                            hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            hf0Var.setTextSize(1, 15.0f);
                                            int i16 = ge0Var2.A;
                                            if (i16 == 4 || i16 == 11) {
                                                hf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                hf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ge0Var2.F);
                                            bundle3.putString("ephone", ge0Var2.E);
                                            bundle3.putString("phoneFormated", ge0Var2.C);
                                            bundle3.putInt("prevType", ge0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ge0Var2.C;
                                            tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                            i12 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i17 = 0;
                                            ConnectionsManager.getInstance(i12).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
                fc0Var.addView(gVar, g7.e6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                fc0Var.e(gVar);
                fc0Var.addView(textView3, g7.e6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(fc0Var, g7.e6.q(-1, -2, 1));
                addView(linearLayout, g7.e6.t(-1, -2, 1, 16, 3, 16, 0));
                gVar.setOnEditorActionListener(new ea(this, 6));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, g7.e6.n(-1, -2));
                org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(fg0Var, context);
                this.d = m2Var;
                int i12 = org.telegram.ui.ActionBar.f6.I6;
                m2Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                m2Var.setTextColor(fg0Var.getThemedColor(i12));
                m2Var.setTextSize(1, 14.0f);
                m2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                m2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i13 = 1;
                m2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i122;
                        int i132;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i13) {
                            case 0:
                                ge0 ge0Var = this.b;
                                fg.g gVar2 = ge0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    ge0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ge0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ge0 ge0Var2 = this.b;
                                fg0 fg0Var2 = ge0Var2.T;
                                hf0 hf0Var = ge0Var2.v;
                                if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                                    Bundle bundle = ge0Var2.O;
                                    if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                        fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i14 = ge0Var2.A;
                                        if (i14 != 4 && i14 != 2 && i14 != 11 && i14 != 15) {
                                            if (i14 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                                    ge0Var2.I = true;
                                                    hf0Var.invalidate();
                                                    hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ge0Var2.F);
                                                    bundle2.putString("ephone", ge0Var2.E);
                                                    bundle2.putString("phoneFormated", ge0Var2.C);
                                                    ge0Var2.N = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ge0Var2.C;
                                                    tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                                    i132 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                                    final int i15 = 1;
                                                    fg0Var2.n1(ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i15) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ge0Var2.I = true;
                                            hf0Var.invalidate();
                                            hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            hf0Var.setTextSize(1, 15.0f);
                                            int i16 = ge0Var2.A;
                                            if (i16 == 4 || i16 == 11) {
                                                hf0Var.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                hf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ge0Var2.F);
                                            bundle3.putString("ephone", ge0Var2.E);
                                            bundle3.putString("phoneFormated", ge0Var2.C);
                                            bundle3.putInt("prevType", ge0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ge0Var2.C;
                                            tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                            i122 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i17 = 0;
                                            ConnectionsManager.getInstance(i122).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
                addView(m2Var, g7.e6.t(-2, -2, 1, 0, 18, 0, 0));
                m2Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
                textView4.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, g7.e6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
                textView5.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.y6));
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, g7.e6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                hf0 hf0Var = new hf0(this, context);
                this.v = hf0Var;
                hf0Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                hf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                hf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                hf0Var.setTextSize(1, 15.0f);
                hf0Var.setGravity(19);
                final int i14 = 2;
                hf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CharSequence charSequence;
                        int i122;
                        int i132;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        switch (i14) {
                            case 0:
                                ge0 ge0Var = this.b;
                                fg.g gVar2 = ge0Var.c;
                                try {
                                    charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    Editable text = gVar2.getText();
                                    ge0Var.y = true;
                                    if (text != null) {
                                        int max = Math.max(0, gVar2.getSelectionStart());
                                        text.replace(max, Math.max(max, gVar2.getSelectionEnd()), charSequence);
                                    }
                                }
                                ge0Var.q(true);
                                break;
                            case 1:
                                this.b.c(true);
                                break;
                            default:
                                final ge0 ge0Var2 = this.b;
                                fg0 fg0Var2 = ge0Var2.T;
                                hf0 hf0Var2 = ge0Var2.v;
                                if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                                    Bundle bundle = ge0Var2.O;
                                    if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                        fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i142 = ge0Var2.A;
                                        if (i142 != 4 && i142 != 2 && i142 != 11 && i142 != 15) {
                                            if (i142 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                                    ge0Var2.I = true;
                                                    hf0Var2.invalidate();
                                                    hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", ge0Var2.F);
                                                    bundle2.putString("ephone", ge0Var2.E);
                                                    bundle2.putString("phoneFormated", ge0Var2.C);
                                                    ge0Var2.N = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = ge0Var2.C;
                                                    tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                                    i132 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                                    final int i15 = 1;
                                                    fg0Var2.n1(ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (i15) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ge0Var2.I = true;
                                            hf0Var2.invalidate();
                                            hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            hf0Var2.setTextSize(1, 15.0f);
                                            int i16 = ge0Var2.A;
                                            if (i16 == 4 || i16 == 11) {
                                                hf0Var2.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                hf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", ge0Var2.F);
                                            bundle3.putString("ephone", ge0Var2.E);
                                            bundle3.putString("phoneFormated", ge0Var2.C);
                                            bundle3.putInt("prevType", ge0Var2.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = ge0Var2.C;
                                            tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                            i122 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i17 = 0;
                                            ConnectionsManager.getInstance(i122).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i17) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
                frameLayout2.addView(hf0Var, g7.e6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, g7.e6.q(-1, -1, 80));
                org.telegram.ui.Cells.e3.s2(hf0Var);
            }
        }
        z10 = true;
        pi0Var.setVisibility(!z10 ? 8 : 0);
        addView(pi0Var, g7.e6.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(LocaleController.getString(z11 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
        addView(textView6, g7.e6.t(-2, -2, 1, 8, !z10 ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView22, g7.e6.t(-2, -2, 1, 8, 5, 8, 16));
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
        this.b = fc0Var2;
        fc0Var2.setText(LocaleController.getString(z11 ? R.string.SMSWord : R.string.SMSPhrase));
        fg.g gVar2 = new fg.g(this, context, 9);
        this.c = gVar2;
        gVar2.setSingleLine();
        gVar2.setLines(1);
        gVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar2.setCursorWidth(1.5f);
        gVar2.setImeOptions(268435461);
        gVar2.setTextSize(1, 18.0f);
        gVar2.setMaxLines(1);
        gVar2.setBackground(null);
        gVar2.setHint(LocaleController.getString(z11 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
        gVar2.addTextChangedListener(new org.telegram.ui.Cells.i3(this));
        gVar2.setEllipsizeByGradient(true);
        gVar2.setInputType(1);
        gVar2.setTypeface(Typeface.DEFAULT);
        gVar2.setGravity(!LocaleController.isRTL ? 5 : 3);
        gVar2.setOnFocusChangeListener(new ld(this, 5));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        j3.r0.u(12.0f, 1, textView32);
        textView32.setPadding(org.telegram.ui.Cells.j2.c(10.0f, R.string.Paste, textView32), 0, AndroidUtilities.dp(10.0f), 0);
        textView32.setGravity(17);
        int i102 = org.telegram.ui.ActionBar.f6.o6;
        b6Var = ((org.telegram.ui.ActionBar.o2) fg0Var).resourceProvider;
        int v022 = org.telegram.ui.ActionBar.f6.v0(i102, b6Var);
        textView32.setTextColor(v022);
        int dp2 = AndroidUtilities.dp(6.0f);
        int l13 = org.telegram.ui.ActionBar.f6.l1(0.12f, v022);
        int l122 = org.telegram.ui.ActionBar.f6.l1(0.15f, v022);
        textView32.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, l13, l122, l122));
        g7.g6.b(textView32, 0.1f, 1.5f);
        gVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
        final int i112 = 0;
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i122;
                int i132;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i112) {
                    case 0:
                        ge0 ge0Var = this.b;
                        fg.g gVar22 = ge0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            ge0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        ge0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ge0 ge0Var2 = this.b;
                        fg0 fg0Var2 = ge0Var2.T;
                        hf0 hf0Var2 = ge0Var2.v;
                        if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                            Bundle bundle = ge0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i142 = ge0Var2.A;
                                if (i142 != 4 && i142 != 2 && i142 != 11 && i142 != 15) {
                                    if (i142 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                            ge0Var2.I = true;
                                            hf0Var2.invalidate();
                                            hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ge0Var2.F);
                                            bundle2.putString("ephone", ge0Var2.E);
                                            bundle2.putString("phoneFormated", ge0Var2.C);
                                            ge0Var2.N = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ge0Var2.C;
                                            tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                            i132 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i15 = 1;
                                            fg0Var2.n1(ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i15) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ge0Var2.I = true;
                                    hf0Var2.invalidate();
                                    hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                    hf0Var2.setTextSize(1, 15.0f);
                                    int i16 = ge0Var2.A;
                                    if (i16 == 4 || i16 == 11) {
                                        hf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        hf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ge0Var2.F);
                                    bundle3.putString("ephone", ge0Var2.E);
                                    bundle3.putString("phoneFormated", ge0Var2.C);
                                    bundle3.putInt("prevType", ge0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ge0Var2.C;
                                    tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                    i122 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(i122).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
        fc0Var2.addView(gVar2, g7.e6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        fc0Var2.e(gVar2);
        fc0Var2.addView(textView32, g7.e6.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(fc0Var2, g7.e6.q(-1, -2, 1));
        addView(linearLayout2, g7.e6.t(-1, -2, 1, 16, 3, 16, 0));
        gVar2.setOnEditorActionListener(new ea(this, 6));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, g7.e6.n(-1, -2));
        org.telegram.ui.Components.voip.m2 m2Var2 = new org.telegram.ui.Components.voip.m2(fg0Var, context);
        this.d = m2Var2;
        int i122 = org.telegram.ui.ActionBar.f6.I6;
        m2Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i122, false));
        m2Var2.setTextColor(fg0Var.getThemedColor(i122));
        m2Var2.setTextSize(1, 14.0f);
        m2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i132 = 1;
        m2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1222;
                int i1322;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i132) {
                    case 0:
                        ge0 ge0Var = this.b;
                        fg.g gVar22 = ge0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            ge0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        ge0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ge0 ge0Var2 = this.b;
                        fg0 fg0Var2 = ge0Var2.T;
                        hf0 hf0Var2 = ge0Var2.v;
                        if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                            Bundle bundle = ge0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i142 = ge0Var2.A;
                                if (i142 != 4 && i142 != 2 && i142 != 11 && i142 != 15) {
                                    if (i142 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                            ge0Var2.I = true;
                                            hf0Var2.invalidate();
                                            hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ge0Var2.F);
                                            bundle2.putString("ephone", ge0Var2.E);
                                            bundle2.putString("phoneFormated", ge0Var2.C);
                                            ge0Var2.N = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ge0Var2.C;
                                            tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                            i1322 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i15 = 1;
                                            fg0Var2.n1(ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i15) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ge0Var2.I = true;
                                    hf0Var2.invalidate();
                                    hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                    hf0Var2.setTextSize(1, 15.0f);
                                    int i16 = ge0Var2.A;
                                    if (i16 == 4 || i16 == 11) {
                                        hf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        hf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ge0Var2.F);
                                    bundle3.putString("ephone", ge0Var2.E);
                                    bundle3.putString("phoneFormated", ge0Var2.C);
                                    bundle3.putInt("prevType", ge0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ge0Var2.C;
                                    tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                    i1222 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(i1222).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
        addView(m2Var2, g7.e6.t(-2, -2, 1, 0, 18, 0, 0));
        m2Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(LocaleController.getString(z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        textView42.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, g7.e6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(LocaleController.getString(z11 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
        textView52.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, g7.e6.d(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
        hf0 hf0Var2 = new hf0(this, context);
        this.v = hf0Var2;
        hf0Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i122, false));
        hf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        hf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        hf0Var2.setTextSize(1, 15.0f);
        hf0Var2.setGravity(19);
        final int i142 = 2;
        hf0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ee0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence charSequence;
                int i1222;
                int i1322;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                switch (i142) {
                    case 0:
                        ge0 ge0Var = this.b;
                        fg.g gVar22 = ge0Var.c;
                        try {
                            charSequence = ((ClipboardManager) ge0Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ge0Var.getContext());
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            Editable text = gVar22.getText();
                            ge0Var.y = true;
                            if (text != null) {
                                int max = Math.max(0, gVar22.getSelectionStart());
                                text.replace(max, Math.max(max, gVar22.getSelectionEnd()), charSequence);
                            }
                        }
                        ge0Var.q(true);
                        break;
                    case 1:
                        this.b.c(true);
                        break;
                    default:
                        final ge0 ge0Var2 = this.b;
                        fg0 fg0Var2 = ge0Var2.T;
                        hf0 hf0Var22 = ge0Var2.v;
                        if (ge0Var2.L <= 0 || ge0Var2.J == null) {
                            Bundle bundle = ge0Var2.O;
                            if (bundle != null && (tL_auth_sentCode = ge0Var2.P) != null) {
                                fg0Var2.g1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i1422 = ge0Var2.A;
                                if (i1422 != 4 && i1422 != 2 && i1422 != 11 && i1422 != 15) {
                                    if (i1422 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        if (!ge0Var2.N && !ge0Var2.I && !fg0Var2.k0) {
                                            ge0Var2.I = true;
                                            hf0Var22.invalidate();
                                            hf0Var22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", ge0Var2.F);
                                            bundle2.putString("ephone", ge0Var2.E);
                                            bundle2.putString("phoneFormated", ge0Var2.C);
                                            ge0Var2.N = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = ge0Var2.C;
                                            tL_auth_resendCode.phone_code_hash = ge0Var2.D;
                                            i1322 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            final int i15 = 1;
                                            fg0Var2.n1(ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (i15) {
                                                        case 0:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle2, tL_error));
                                                            break;
                                                        default:
                                                            AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle2, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    ge0Var2.I = true;
                                    hf0Var22.invalidate();
                                    hf0Var22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                    hf0Var22.setTextSize(1, 15.0f);
                                    int i16 = ge0Var2.A;
                                    if (i16 == 4 || i16 == 11) {
                                        hf0Var22.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        hf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", ge0Var2.F);
                                    bundle3.putString("ephone", ge0Var2.E);
                                    bundle3.putString("phoneFormated", ge0Var2.C);
                                    bundle3.putInt("prevType", ge0Var2.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = ge0Var2.C;
                                    tL_auth_resendCode2.phone_code_hash = ge0Var2.D;
                                    i1222 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                    final int i17 = 0;
                                    ConnectionsManager.getInstance(i1222).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: org.telegram.ui.ae0
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i17) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tLObject, bundle3, tL_error));
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(new ce0(ge0Var2, tL_error, bundle3, tLObject));
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
        frameLayout22.addView(hf0Var2, g7.e6.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, g7.e6.q(-1, -1, 80));
        org.telegram.ui.Cells.e3.s2(hf0Var2);
    }

    public static String t(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length && str.charAt(i9) <= ' ') {
            i9++;
        }
        return (i9 > 0 || length < str.length()) ? str.substring(i9, length) : str;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean c(boolean z10) {
        fg0 fg0Var = this.T;
        fg0Var.k1(true, true);
        int i9 = this.B;
        if (i9 != 0) {
            fg0Var.u1(i9, true, null, true);
            return false;
        }
        this.H = null;
        this.N = false;
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.N = false;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        if (this.N) {
            return;
        }
        String obj = this.c.getText().toString();
        if (obj.length() == 0) {
            s(false);
            return;
        }
        if (!p(obj)) {
            s(true);
            return;
        }
        this.N = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.C;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.D;
        tL_auth_signIn.flags |= 1;
        fg0 fg0Var = this.T;
        fg0Var.n1(fg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new zd0(this, tL_auth_signIn, 0), 10), true);
        fg0Var.v1(true, true);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void i() {
        q(true);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new de0(this, 3), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.a);
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        if (this.H != null) {
            bundle.putBundle("recoveryview_word" + this.a, this.H);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        hf0 hf0Var = this.v;
        if (bundle == null) {
            if (this.O == null || this.P == null) {
                return;
            }
            hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
            int i9 = this.A;
            hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i9 == 17 ? R.string.ReturnEnteringPhrase : i9 == 16 ? R.string.ReturnEnteringWord : i9 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            return;
        }
        fg.g gVar = this.c;
        gVar.setText("");
        this.H = bundle;
        this.G = null;
        this.A = bundle.getInt("nextType");
        this.B = bundle.getInt("prevType", 0);
        this.E = bundle.getString("ephone");
        if (this.H.containsKey("beginning")) {
            this.G = this.H.getString("beginning");
        }
        this.C = bundle.getString("phoneFormated");
        this.D = bundle.getString("phoneHash");
        this.F = this.H.getString("phone");
        this.L = bundle.getInt("timeout");
        int i10 = this.B;
        org.telegram.ui.Components.voip.m2 m2Var = this.d;
        if (i10 == 17) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i10 == 16) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 3 || i10 == 15) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else {
            m2Var.setVisibility(8);
        }
        this.O = null;
        this.P = null;
        this.N = false;
        this.I = false;
        fg0 fg0Var = this.T;
        fg0Var.k0 = false;
        hf0Var.invalidate();
        boolean z11 = this.a != 16;
        String str = "+" + ne.b.c().b(ne.b.d(this.F, false));
        String str2 = this.G;
        TextView textView = this.r;
        if (str2 == null) {
            org.telegram.messenger.ll.q(!z11 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, textView);
        } else {
            org.telegram.messenger.ll.q(!z11 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, textView);
        }
        fg0.T0(fg0Var, gVar);
        gVar.requestFocus();
        org.telegram.ui.Components.pi0 pi0Var = this.h;
        if (pi0Var.getAnimatedDrawable() != null) {
            pi0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new o00(pi0Var, 20), 500L);
        q(false);
        o(false);
        this.M = System.currentTimeMillis();
        int i11 = org.telegram.ui.ActionBar.f6.y6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        int i12 = this.A;
        if (i12 != 2 && i12 != 4 && i12 != 3) {
            hf0Var.setVisibility(8);
            return;
        }
        if (this.J != null) {
            return;
        }
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i11));
        Timer timer = new Timer();
        this.J = timer;
        timer.schedule(new fe0(this), 0L, 1000L);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        fg0 fg0Var = this.T;
        this.n.setTextColor(fg0Var.getThemedColor(i9));
        this.r.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.D6));
        int themedColor = fg0Var.getThemedColor(i9);
        fg.g gVar = this.c;
        gVar.setTextColor(themedColor);
        gVar.setCursorColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.l6));
        gVar.setHintTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        this.b.f();
    }

    public final void o(boolean z10) {
        this.x = z10;
        float f10 = 0.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.b.a(f11);
        float f12 = (f11 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f12).scaleY(f12).alpha(f11).translationY((1.0f - f11) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.ll.r(translationY, grVar, 290L);
        if (this.w && !this.x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        this.f.animate().scaleX(f13).scaleY(f13).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(this.x ? 5.0f : -5.0f)).setInterpolator(grVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.G == null) {
            return true;
        }
        String lowerCase = t(str).toLowerCase();
        String lowerCase2 = this.G.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void q(boolean z10) {
        de0 de0Var = this.Q;
        AndroidUtilities.cancelRunOnUIThread(de0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z11 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.w != z11) {
            this.w = z11;
            float f10 = 0.9f;
            TextView textView = this.s;
            TextView textView2 = this.f;
            float f11 = 0.0f;
            if (z10) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                scaleY.setInterpolator(grVar).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f10).alpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f11 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                alpha.translationY(f11).setInterpolator(grVar).setDuration(300L).start();
            } else {
                textView.setAlpha(z11 ? 1.0f : 0.0f);
                textView.setScaleX(z11 ? 1.0f : 0.7f);
                textView.setScaleY(z11 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.w || this.x) ? 0.9f : 1.0f);
                if (this.w && !this.x) {
                    f10 = 1.0f;
                }
                textView2.setScaleY(f10);
                textView2.setAlpha((!this.w || this.x) ? 0.0f : 1.0f);
                if (!this.w || this.x) {
                    f11 = AndroidUtilities.dp(this.x ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f11);
            }
        }
        AndroidUtilities.runOnUIThread(de0Var, 5000L);
    }

    public final void r() {
        hf0 hf0Var = this.v;
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i9));
        try {
            synchronized (this.K) {
                try {
                    Timer timer = this.J;
                    if (timer != null) {
                        timer.cancel();
                        this.J = null;
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s(boolean z10) {
        fg.g gVar = this.c;
        if (this.T.getParentActivity() == null) {
            return;
        }
        try {
            gVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z11 = this.a != 16;
        TextView textView = this.e;
        if (z10) {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
        } else if (TextUtils.isEmpty(gVar.getText())) {
            textView.setText("");
        } else {
            textView.setText(LocaleController.getString(!z11 ? R.string.SMSWordError : R.string.SMSPhraseError));
        }
        if (!this.x && !this.y) {
            AndroidUtilities.shakeViewSpring(gVar, this.S);
            AndroidUtilities.shakeViewSpring(textView, this.S);
        }
        de0 de0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(de0Var);
        o(true);
        AndroidUtilities.runOnUIThread(de0Var, 10000L);
        this.S = -this.S;
    }
}
