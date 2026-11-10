package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dh0 extends org.telegram.ui.ActionBar.w2 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int Y1 = 0;
    public boolean A1;
    public String B1;
    public boolean C1;
    public String D1;
    public String E1;
    public final org.telegram.ui.ActionBar.f2 F1;
    public final int G1;
    public final ch0 H1;
    public final View I1;
    public final ch0 J1;
    public final ImageView K1;
    public final org.telegram.ui.Components.wo L1;
    public final TextView M1;
    public final LinearLayout N1;
    public int O1;
    public final org.telegram.ui.ActionBar.n2 P1;
    public final TextView Q1;
    public final RadialProgressView R1;
    public final FrameLayout S1;
    public final TextView T1;
    public String U1;
    public int V1;
    public int W1;
    public boolean X1;
    public final LinearLayout l1;
    public final org.telegram.ui.Components.kb0 m1;
    public final org.telegram.ui.Components.kb0 n1;
    public final FrameLayout o1;
    public final View p1;
    public final fi.d q1;
    public final org.telegram.ui.Components.kb0 r1;
    public final org.telegram.ui.Components.lb0 s1;
    public final org.telegram.ui.Components.w70 t1;
    public final ArrayList u1;
    public final HashMap v1;
    public final HashMap w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dh0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, true);
        String str;
        String str2;
        int i7;
        ps psVar;
        TelephonyManager telephonyManager;
        final int i10 = 1;
        this.u1 = new ArrayList();
        this.v1 = new HashMap();
        this.w1 = new HashMap();
        this.V1 = -1;
        N();
        this.D = true;
        this.P0 = true;
        this.G1 = ConnectionsManager.generateClassGuid();
        this.F1 = f2Var;
        Context context2 = getContext();
        final int i11 = 4;
        new org.telegram.ui.Components.zp(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.l1 = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.l1.setOrientation(1);
        scrollView.addView(this.l1, c8.ha.x(-1, -2, 51));
        this.l1.setOnTouchListener(new ei.b(28));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.l1.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.kb0 kb0Var = new org.telegram.ui.Components.kb0(context2);
        this.m1 = kb0Var;
        kb0Var.getEditText().setInputType(49152);
        this.m1.getEditText().setImeOptions(5);
        this.m1.setHint(org.telegram.messenger.id.M0(2131750694, null));
        if (this.D1 != null) {
            this.m1.getEditText().setText(this.D1);
            this.D1 = null;
        }
        frameLayout.addView(this.m1, c8.ha.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 == 5) {
                            dh0 dh0Var = this.b;
                            dh0Var.H1.requestFocus();
                            ch0 ch0Var = dh0Var.H1;
                            ch0Var.setSelection(ch0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        dh0 dh0Var2 = this.b;
                        if (i13 != 5) {
                            dh0Var2.getClass();
                            break;
                        } else {
                            dh0Var2.n1.requestFocus();
                            dh0Var2.n1.getEditText().setSelection(dh0Var2.n1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i13 == 5) {
                            dh0 dh0Var3 = this.b;
                            dh0Var3.H1.requestFocus();
                            ch0 ch0Var2 = dh0Var3.H1;
                            ch0Var2.setSelection(ch0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i13 == 5) {
                            dh0 dh0Var4 = this.b;
                            dh0Var4.J1.requestFocus();
                            ch0 ch0Var3 = dh0Var4.J1;
                            ch0Var3.setSelection(ch0Var3.length());
                            break;
                        }
                        break;
                    default:
                        dh0 dh0Var5 = this.b;
                        if (i13 != 5) {
                            dh0Var5.getClass();
                            break;
                        } else {
                            dh0Var5.S1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.kb0 kb0Var2 = new org.telegram.ui.Components.kb0(context2);
        this.n1 = kb0Var2;
        kb0Var2.setBackground(null);
        this.n1.getEditText().setInputType(49152);
        this.n1.getEditText().setImeOptions(5);
        this.n1.setHint(org.telegram.messenger.id.M0(2131749032, null));
        if (this.E1 != null) {
            this.n1.getEditText().setText(this.E1);
            this.E1 = null;
        }
        frameLayout.addView(this.n1, c8.ha.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.n1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            dh0 dh0Var = this.b;
                            dh0Var.H1.requestFocus();
                            ch0 ch0Var = dh0Var.H1;
                            ch0Var.setSelection(ch0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        dh0 dh0Var2 = this.b;
                        if (i132 != 5) {
                            dh0Var2.getClass();
                            break;
                        } else {
                            dh0Var2.n1.requestFocus();
                            dh0Var2.n1.getEditText().setSelection(dh0Var2.n1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            dh0 dh0Var3 = this.b;
                            dh0Var3.H1.requestFocus();
                            ch0 ch0Var2 = dh0Var3.H1;
                            ch0Var2.setSelection(ch0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            dh0 dh0Var4 = this.b;
                            dh0Var4.J1.requestFocus();
                            ch0 ch0Var3 = dh0Var4.J1;
                            ch0Var3.setSelection(ch0Var3.length());
                            break;
                        }
                        break;
                    default:
                        dh0 dh0Var5 = this.b;
                        if (i132 != 5) {
                            dh0Var5.getClass();
                            break;
                        } else {
                            dh0Var5.S1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context2, null);
        this.s1 = lb0Var;
        lb0Var.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.s1.setText(org.telegram.messenger.id.M0(2131747290, null));
        this.l1.addView(this.s1, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context2, null);
        this.t1 = w70Var;
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(this.t1, org.telegram.ui.ActionBar.m6.y6, this.I0);
        org.telegram.ui.ActionBar.t6.G(this.t1, org.telegram.ui.ActionBar.m6.Uc, this.I0);
        this.l1.addView(this.t1, c8.ha.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(context2, 5);
        this.P1 = n2Var;
        n2Var.setTextSize(1, 16.0f);
        this.P1.setFocusable(false);
        this.P1.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                dh0 dh0Var = this.b;
                switch (i15) {
                    case 0:
                        dh0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new bh0(dh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = dh0Var.F1;
                        if (!dh0Var.A1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (dh0Var.m1.getEditText().length() != 0) {
                                if (dh0Var.H1.length() != 0) {
                                    if (dh0Var.J1.length() != 0) {
                                        if (!dh0Var.L1.a.q) {
                                            dh0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747307, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(dh0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(dh0Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(dh0Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(dh0Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ts tsVar = new ts(null, true);
                        tsVar.r = new bh0(dh0Var);
                        dh0Var.F1.showAsSheet(tsVar);
                        break;
                    default:
                        dh0Var.L1.a(!r6.a.q, true);
                        dh0Var.P0(true);
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(6.0f);
        int i15 = org.telegram.ui.ActionBar.m6.i6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, x02, x02);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
        frameLayout2.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, k02, null, M, null);
        frameLayout2.addView(this.P1, c8.ha.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, c8.ha.o(42, -1));
        TextView textView = new TextView(context2);
        this.T1 = textView;
        textView.setText("+");
        this.T1.setTextSize(1, 16.0f);
        this.T1.setFocusable(false);
        linearLayout2.addView(this.T1, c8.ha.o(-2, -2));
        ch0 ch0Var = new ch0(this, context2, i12);
        this.H1 = ch0Var;
        int i16 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(ch0Var, i16, null);
        this.H1.setInputType(3);
        this.H1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.H1.setCursorWidth(1.5f);
        this.H1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        this.H1.setTextSize(1, 16.0f);
        this.H1.setMaxLines(1);
        this.H1.setGravity(19);
        this.H1.setImeOptions(268435461);
        this.H1.setBackground(null);
        this.H1.setContentDescription(org.telegram.messenger.id.M0(2131748740, null));
        linearLayout2.addView(this.H1, c8.ha.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.H1.addTextChangedListener(new m0(this, 13));
        final int i17 = 3;
        this.H1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i132 == 5) {
                            dh0 dh0Var = this.b;
                            dh0Var.H1.requestFocus();
                            ch0 ch0Var2 = dh0Var.H1;
                            ch0Var2.setSelection(ch0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        dh0 dh0Var2 = this.b;
                        if (i132 != 5) {
                            dh0Var2.getClass();
                            break;
                        } else {
                            dh0Var2.n1.requestFocus();
                            dh0Var2.n1.getEditText().setSelection(dh0Var2.n1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            dh0 dh0Var3 = this.b;
                            dh0Var3.H1.requestFocus();
                            ch0 ch0Var22 = dh0Var3.H1;
                            ch0Var22.setSelection(ch0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            dh0 dh0Var4 = this.b;
                            dh0Var4.J1.requestFocus();
                            ch0 ch0Var3 = dh0Var4.J1;
                            ch0Var3.setSelection(ch0Var3.length());
                            break;
                        }
                        break;
                    default:
                        dh0 dh0Var5 = this.b;
                        if (i132 != 5) {
                            dh0Var5.getClass();
                            break;
                        } else {
                            dh0Var5.S1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.I1 = new View(context2);
        LinearLayout.LayoutParams k10 = c8.ha.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(this.I1, k10);
        ch0 ch0Var2 = new ch0(this, context2, i10);
        this.J1 = ch0Var2;
        org.telegram.ui.ActionBar.t6.U(ch0Var2, i16, null);
        this.J1.setInputType(3);
        this.J1.setPadding(0, 0, 0, 0);
        this.J1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.J1.setCursorWidth(1.5f);
        this.J1.setTextSize(1, 16.0f);
        this.J1.setMaxLines(1);
        this.J1.setGravity(19);
        this.J1.setImeOptions(268435461);
        this.J1.setBackground(null);
        this.J1.setContentDescription(org.telegram.messenger.id.M0(2131747290, null));
        linearLayout2.addView(this.J1, c8.ha.o(-1, 36));
        this.J1.addTextChangedListener(new ar(this, 2));
        this.J1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i132 == 5) {
                            dh0 dh0Var = this.b;
                            dh0Var.H1.requestFocus();
                            ch0 ch0Var22 = dh0Var.H1;
                            ch0Var22.setSelection(ch0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        dh0 dh0Var2 = this.b;
                        if (i132 != 5) {
                            dh0Var2.getClass();
                            break;
                        } else {
                            dh0Var2.n1.requestFocus();
                            dh0Var2.n1.getEditText().setSelection(dh0Var2.n1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            dh0 dh0Var3 = this.b;
                            dh0Var3.H1.requestFocus();
                            ch0 ch0Var222 = dh0Var3.H1;
                            ch0Var222.setSelection(ch0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            dh0 dh0Var4 = this.b;
                            dh0Var4.J1.requestFocus();
                            ch0 ch0Var3 = dh0Var4.J1;
                            ch0Var3.setSelection(ch0Var3.length());
                            break;
                        }
                        break;
                    default:
                        dh0 dh0Var5 = this.b;
                        if (i132 != 5) {
                            dh0Var5.getClass();
                            break;
                        } else {
                            dh0Var5.S1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.K1 = imageView;
        imageView.setScaleX(0.5f);
        this.K1.setScaleY(0.5f);
        this.K1.setAlpha(0.0f);
        this.s1.addView(this.K1, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context2, this.I0);
        this.L1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
        this.L1.setDrawUnchecked(true);
        this.L1.a(false, false);
        this.L1.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.M1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i16, this.I0);
        this.M1.setTextSize(1, 14.0f);
        this.M1.setText(org.telegram.messenger.id.M0(2131754445, null));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.N1 = linearLayout3;
        linearLayout3.setOrientation(0);
        this.N1.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        this.N1.addView(this.L1, c8.ha.t(21, 21, 16, 0, 0, 9, 0));
        this.N1.addView(this.M1, c8.ha.r(-2, -2, 16));
        final int i18 = 3;
        this.N1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i18;
                dh0 dh0Var = this.b;
                switch (i152) {
                    case 0:
                        dh0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new bh0(dh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = dh0Var.F1;
                        if (!dh0Var.A1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (dh0Var.m1.getEditText().length() != 0) {
                                if (dh0Var.H1.length() != 0) {
                                    if (dh0Var.J1.length() != 0) {
                                        if (!dh0Var.L1.a.q) {
                                            dh0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747307, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(dh0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(dh0Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(dh0Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(dh0Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ts tsVar = new ts(null, true);
                        tsVar.r = new bh0(dh0Var);
                        dh0Var.F1.showAsSheet(tsVar);
                        break;
                    default:
                        dh0Var.L1.a(!r6.a.q, true);
                        dh0Var.P0(true);
                        break;
                }
            }
        });
        this.N1.setTranslationY(org.telegram.messenger.g0.L(-21.33f));
        this.N1.setPivotX(0.0f);
        c8.ka.b(this.N1, 0.0125f, 1.2f);
        org.telegram.ui.ActionBar.t6.Q(this.N1, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i15), this.I0);
        this.l1.addView(this.N1, c8.ha.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.o1 = frameLayout3;
        frameLayout3.setTranslationY(org.telegram.messenger.g0.L(-10.665f));
        this.l1.addView(this.o1, c8.ha.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.p1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, this.I0);
        this.o1.addView(this.p1, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        fi.d dVar = new fi.d(context2, this.I0, false);
        this.q1 = dVar;
        dVar.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131754448, null));
        this.q1.i(spannableStringBuilder, false, true);
        this.q1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i12;
                dh0 dh0Var = this.b;
                switch (i152) {
                    case 0:
                        dh0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new bh0(dh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = dh0Var.F1;
                        if (!dh0Var.A1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (dh0Var.m1.getEditText().length() != 0) {
                                if (dh0Var.H1.length() != 0) {
                                    if (dh0Var.J1.length() != 0) {
                                        if (!dh0Var.L1.a.q) {
                                            dh0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747307, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(dh0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(dh0Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(dh0Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(dh0Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ts tsVar = new ts(null, true);
                        tsVar.r = new bh0(dh0Var);
                        dh0Var.F1.showAsSheet(tsVar);
                        break;
                    default:
                        dh0Var.L1.a(!r6.a.q, true);
                        dh0Var.P0(true);
                        break;
                }
            }
        });
        this.o1.addView(this.q1, c8.ha.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.kb0 kb0Var3 = new org.telegram.ui.Components.kb0(context2);
        this.r1 = kb0Var3;
        kb0Var3.setBackground(null);
        this.r1.getEditText().setInputType(49152);
        this.r1.getEditText().setImeOptions(5);
        this.r1.setHint(org.telegram.messenger.id.M0(2131746650, null));
        this.o1.addView(this.r1, c8.ha.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.r1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i132 == 5) {
                            dh0 dh0Var = this.b;
                            dh0Var.H1.requestFocus();
                            ch0 ch0Var22 = dh0Var.H1;
                            ch0Var22.setSelection(ch0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        dh0 dh0Var2 = this.b;
                        if (i132 != 5) {
                            dh0Var2.getClass();
                            break;
                        } else {
                            dh0Var2.n1.requestFocus();
                            dh0Var2.n1.getEditText().setSelection(dh0Var2.n1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            dh0 dh0Var3 = this.b;
                            dh0Var3.H1.requestFocus();
                            ch0 ch0Var222 = dh0Var3.H1;
                            ch0Var222.setSelection(ch0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            dh0 dh0Var4 = this.b;
                            dh0Var4.J1.requestFocus();
                            ch0 ch0Var3 = dh0Var4.J1;
                            ch0Var3.setSelection(ch0Var3.length());
                            break;
                        }
                        break;
                    default:
                        dh0 dh0Var5 = this.b;
                        if (i132 != 5) {
                            dh0Var5.getClass();
                            break;
                        } else {
                            dh0Var5.S1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        P0(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ps psVar2 = new ps();
                psVar2.a = split[2];
                psVar2.c = split[0];
                psVar2.d = split[1];
                this.u1.add(0, psVar2);
                List list = (List) this.v1.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.v1;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(psVar2);
                if (split.length > 3) {
                    this.w1.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.u1, Comparator$-CC.comparing(new aa.l(15)));
        if (TextUtils.isEmpty(this.B1)) {
            try {
                telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i7 = 0;
                    while (true) {
                        if (i7 < this.u1.size()) {
                            psVar = null;
                            break;
                        } else {
                            if (Objects.equals(((ps) this.u1.get(i7)).a, str2)) {
                                psVar = (ps) this.u1.get(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    if (psVar != null) {
                        this.H1.setText(psVar.c);
                    }
                }
                if (this.H1.length() == 0) {
                    this.J1.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i7 = 0;
                while (true) {
                    if (i7 < this.u1.size()) {
                    }
                    i7++;
                }
                if (psVar != null) {
                }
            }
            if (this.H1.length() == 0) {
            }
        } else {
            TLRPC.User f10 = this.F1.getUserConfig().f();
            if (this.B1.startsWith("+")) {
                this.H1.setText(this.B1.substring(1));
            } else if (this.C1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
                this.H1.setText(this.B1);
            } else {
                String str4 = f10.phone;
                while (true) {
                    if (i11 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i11);
                    if (((List) this.v1.get(substring)) != null) {
                        this.H1.setText(substring);
                        break;
                    }
                    i11--;
                }
                this.J1.setText(this.B1);
            }
            this.B1 = null;
        }
        this.S1 = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.Q1 = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.Q1.setGravity(17);
        this.Q1.setLines(1);
        this.Q1.setSingleLine(true);
        this.Q1.setText(org.telegram.messenger.id.M0(2131751751, null));
        TextView textView4 = this.Q1;
        org.telegram.ui.ActionBar.f2 f2Var2 = this.F1;
        int i19 = org.telegram.ui.ActionBar.m6.Gi;
        textView4.setTextColor(f2Var2.getThemedColor(i19));
        this.Q1.setTextSize(1, 15.0f);
        this.Q1.setTypeface(org.telegram.messenger.g0.o());
        c8.ka.b(this.S1, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.R1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.R1.setProgressColor(this.F1.getThemedColor(i19));
        this.S1.addView(this.Q1, c8.ha.c(-1.0f, -1));
        this.S1.addView(this.R1, c8.ha.e(40, 40, 17));
        this.l1.addView(this.S1, c8.ha.t(-1, 48, 0, 0, 8, 0, 4));
        org.telegram.messenger.g0.Z3(this.Q1, true, 1.0f, true, false);
        org.telegram.messenger.g0.Z3(this.R1, false, 1.0f, true, false);
        this.S1.setBackground(org.telegram.ui.ActionBar.b6.e(this.F1.getThemedColor(org.telegram.ui.ActionBar.m6.Ci), 24.0f));
        this.S1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yg0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i10;
                dh0 dh0Var = this.b;
                switch (i152) {
                    case 0:
                        dh0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new bh0(dh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var22 = dh0Var.F1;
                        if (!dh0Var.A1 && f2Var22 != null && f2Var22.getParentActivity() != null) {
                            if (dh0Var.m1.getEditText().length() != 0) {
                                if (dh0Var.H1.length() != 0) {
                                    if (dh0Var.J1.length() != 0) {
                                        if (!dh0Var.L1.a.q) {
                                            dh0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747307, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(dh0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(dh0Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(dh0Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(dh0Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ts tsVar = new ts(null, true);
                        tsVar.r = new bh0(dh0Var);
                        dh0Var.F1.showAsSheet(tsVar);
                        break;
                    default:
                        dh0Var.L1.a(!r6.a.q, true);
                        dh0Var.P0(true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.U(this.T1, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.k6, this.I1, null);
        this.N = scrollView;
        this.O = org.telegram.messenger.id.M0(2131748276, null);
        this.P = true;
    }

    public static void I0(dh0 dh0Var) {
        String replaceAll = (dh0Var.H1.getText().toString() + dh0Var.J1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z9 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) dh0Var.v1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) dh0Var.w1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z9 = true;
                            break;
                        }
                    }
                }
            }
            if (z9) {
                break;
            }
        }
        if (z9) {
            if (TextUtils.equals(dh0Var.U1, replaceAll)) {
                return;
            }
            dh0Var.U1 = replaceAll;
            dh0Var.Q0(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(dh0Var.U1)) {
            return;
        }
        dh0Var.U1 = null;
        dh0Var.Q0(null);
    }

    public static String K0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i7 = 4; i7 >= 1; i7--) {
                String substring = str2.substring(0, i7);
                if (((String) hashMap.get(substring)) != null) {
                    return a8.p0.p("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
    }

    public final void J0() {
        this.A1 = true;
        org.telegram.messenger.g0.Z3(this.Q1, false, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(this.R1, true, 0.5f, true, true);
        String str = "+" + this.H1.getText().toString() + this.J1.getText().toString();
        String obj = this.m1.getEditText().getText().toString();
        String obj2 = this.n1.getEditText().getText().toString();
        String obj3 = this.r1.getVisibility() == 0 ? this.r1.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(obj3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = obj3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.G1);
        if (this.L1.a.q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str != null && !str.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void L0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.P1.animate();
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
            animate.setInterpolator(wqVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.T1.animate().setInterpolator(wqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.H1.animate().setInterpolator(wqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.P1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.T1.animate();
        org.telegram.ui.Components.wq wqVar2 = org.telegram.ui.Components.wq.f;
        animate2.setInterpolator(wqVar2).translationX(0.0f).setDuration(150L);
        this.H1.animate().setInterpolator(wqVar2).translationX(0.0f).setDuration(150L);
        this.P1.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(String str, ps psVar) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0);
        }
        int i10 = 0;
        L0(org.telegram.messenger.i6.m(spannableStringBuilder, this.P1.getPaint().getFontMetricsInt(), false, null, 0));
        this.O1 = -1;
        String replace = this.J1.getText() != null ? this.J1.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.w1;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.O1 != -1) {
                int selectionStart = this.J1.getSelectionStart();
                int selectionEnd = this.J1.getSelectionEnd();
                this.J1.setHintText((String) null);
                this.J1.setSelection(selectionStart, selectionEnd);
                this.O1 = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i7 = 0;
            while (i7 < list.size()) {
                if (replace.startsWith(((String) list.get(i7)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = -1;
        if (i7 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i7 = i11;
                    break;
                }
            }
        }
        i10 = i7;
        if (this.O1 != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = this.J1.getSelectionStart();
            int selectionEnd2 = this.J1.getSelectionEnd();
            this.J1.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.J1.setSelection(selectionStart2, selectionEnd2);
            this.O1 = i10;
        }
    }

    public final void N0(String str, boolean z9) {
        this.B1 = str;
        this.C1 = z9;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(this.a).f();
        if (this.B1.startsWith("+")) {
            this.H1.setText(this.B1.substring(1));
        } else if (this.C1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
            this.H1.setText(this.B1);
        } else {
            String str2 = f10.phone;
            int i7 = 4;
            while (true) {
                if (i7 >= 1) {
                    List list = (List) this.v1.get(str2.substring(0, i7));
                    if (list == null || list.size() <= 0) {
                        i7--;
                    } else {
                        String str3 = ((ps) list.get(0)).c;
                        this.H1.setText(str3);
                        if (str3.endsWith("0") && this.B1.startsWith("0")) {
                            this.B1 = this.B1.substring(1);
                        }
                    }
                } else {
                    Context context = org.telegram.messenger.t0.b;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.H1.setText(upperCase);
                    if (upperCase.endsWith("0") && this.B1.startsWith("0")) {
                        this.B1 = this.B1.substring(1);
                    }
                }
            }
            this.J1.setText(this.B1);
        }
        this.B1 = null;
    }

    public final void O0(boolean z9) {
        ViewPropertyAnimator translationY = this.N1.animate().translationY(z9 ? -org.telegram.messenger.g0.L(21.33f) : 0.0f);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        org.telegram.messenger.camera.q.l(translationY, wqVar, 420L);
        this.o1.animate().translationY(z9 ? -org.telegram.messenger.g0.L(10.665f) : 0.0f).setInterpolator(wqVar).setDuration(420L).start();
    }

    public final void P0(boolean z9) {
        boolean z10 = this.L1.a.q;
        final boolean z11 = !z10;
        if (!z9) {
            this.q1.animate().cancel();
            this.q1.setVisibility(!z10 ? 0 : 4);
            this.q1.setAlpha(!z10 ? 1.0f : 0.0f);
            this.p1.animate().cancel();
            this.p1.setVisibility(!z10 ? 0 : 8);
            this.p1.setAlpha(!z10 ? 1.0f : 0.0f);
            this.r1.animate().cancel();
            this.r1.setVisibility(z10 ? 0 : 4);
            this.r1.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        this.q1.setVisibility(0);
        ViewPropertyAnimator alpha = this.q1.animate().alpha(!z10 ? 1.0f : 0.0f);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        final int i7 = 0;
        alpha.setInterpolator(wqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        boolean z12 = z11;
                        dh0 dh0Var = this.b;
                        if (!z12) {
                            dh0Var.q1.setVisibility(4);
                            break;
                        } else {
                            dh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        dh0 dh0Var2 = this.b;
                        if (!z13) {
                            dh0Var2.p1.setVisibility(4);
                            break;
                        } else {
                            dh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        dh0 dh0Var3 = this.b;
                        if (!z14) {
                            dh0Var3.getClass();
                            break;
                        } else {
                            dh0Var3.r1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.p1.setVisibility(0);
        final int i10 = 1;
        this.p1.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(wqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z11;
                        dh0 dh0Var = this.b;
                        if (!z12) {
                            dh0Var.q1.setVisibility(4);
                            break;
                        } else {
                            dh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        dh0 dh0Var2 = this.b;
                        if (!z13) {
                            dh0Var2.p1.setVisibility(4);
                            break;
                        } else {
                            dh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        dh0 dh0Var3 = this.b;
                        if (!z14) {
                            dh0Var3.getClass();
                            break;
                        } else {
                            dh0Var3.r1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.r1.setVisibility(0);
        final int i11 = 2;
        this.r1.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(wqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ dh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z11;
                        dh0 dh0Var = this.b;
                        if (!z12) {
                            dh0Var.q1.setVisibility(4);
                            break;
                        } else {
                            dh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        dh0 dh0Var2 = this.b;
                        if (!z13) {
                            dh0Var2.p1.setVisibility(4);
                            break;
                        } else {
                            dh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        dh0 dh0Var3 = this.b;
                        if (!z14) {
                            dh0Var3.getClass();
                            break;
                        } else {
                            dh0Var3.r1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void Q0(String str) {
        if (this.V1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.V1, true);
            this.V1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.camera.q.l(this.K1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.wq.h, 420L);
            this.t1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.camera.q.l(this.K1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.wq.h, 420L);
        this.K1.setImageDrawable(new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m5, this.I0)));
        this.t1.setText("");
        O0(true);
        org.telegram.ui.Components.ex exVar = new org.telegram.ui.Components.ex(16, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.g5.r(this.a).k0.get(pf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = pf.b.d(str, false);
            this.V1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new k50(12, this, exVar));
        } else {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                exVar.a(a22);
            } else {
                org.telegram.messenger.yr.a0(this.a).a.c(new pc0(this, tL_contact, exVar, 8));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.J1, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.J1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.J1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.i3(new xg0(this, 0), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.z1) {
            this.z1 = false;
            return;
        }
        this.x1 = true;
        this.H1.setText(((ps) this.u1.get(i7)).c);
        this.x1 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.R1;
            org.telegram.ui.ActionBar.f2 f2Var = this.F1;
            if (radialProgressView != null && f2Var != null) {
                radialProgressView.setProgressColor(f2Var.getThemedColor(org.telegram.ui.ActionBar.m6.Gi));
            }
            if (this.S1 != null && f2Var != null && ((themedColor = f2Var.getThemedColor(org.telegram.ui.ActionBar.m6.Ci)) != this.W1 || this.X1 != org.telegram.ui.ActionBar.m6.I.q())) {
                this.X1 = org.telegram.ui.ActionBar.m6.I.q();
                this.W1 = themedColor;
                org.telegram.ui.ActionBar.m6.H1(this.S1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.m6.H1(this.S1.getBackground(), org.telegram.ui.ActionBar.b6.b(themedColor), true);
                this.S1.invalidate();
            }
            ImageView imageView = this.K1;
            if (imageView == null || !(imageView.getDrawable() instanceof org.telegram.ui.Components.cp)) {
                return;
            }
            ((org.telegram.ui.Components.cp) this.K1.getDrawable()).b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m5, this.I0));
            this.K1.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.m1.getEditText().requestFocus();
        this.m1.getEditText().setSelection(this.m1.getEditText().length());
        org.telegram.messenger.g0.i3(new xg0(this, 1), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
