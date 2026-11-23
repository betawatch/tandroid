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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fh0 extends org.telegram.ui.ActionBar.w2 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int Z1 = 0;
    public boolean A1;
    public boolean B1;
    public String C1;
    public boolean D1;
    public String E1;
    public String F1;
    public final org.telegram.ui.ActionBar.g2 G1;
    public final int H1;
    public final eh0 I1;
    public final View J1;
    public final eh0 K1;
    public final ImageView L1;
    public final org.telegram.ui.Components.op M1;
    public final TextView N1;
    public final LinearLayout O1;
    public int P1;
    public final org.telegram.ui.ActionBar.n2 Q1;
    public final TextView R1;
    public final RadialProgressView S1;
    public final FrameLayout T1;
    public final TextView U1;
    public String V1;
    public int W1;
    public int X1;
    public boolean Y1;
    public final LinearLayout m1;
    public final org.telegram.ui.Components.wb0 n1;
    public final org.telegram.ui.Components.wb0 o1;
    public final FrameLayout p1;
    public final View q1;
    public final hi.e r1;
    public final org.telegram.ui.Components.wb0 s1;
    public final org.telegram.ui.Components.yb0 t1;
    public final org.telegram.ui.Components.m80 u1;
    public final ArrayList v1;
    public final HashMap w1;
    public final HashMap x1;
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
    public fh0(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, true);
        String str;
        String str2;
        int i7;
        ps psVar;
        TelephonyManager telephonyManager;
        final int i10 = 1;
        this.v1 = new ArrayList();
        this.w1 = new HashMap();
        this.x1 = new HashMap();
        this.W1 = -1;
        O();
        this.E = true;
        this.Q0 = true;
        this.H1 = ConnectionsManager.generateClassGuid();
        this.G1 = g2Var;
        Context context2 = getContext();
        final int i11 = 4;
        new org.telegram.ui.Components.qq(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.m1 = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.m1.setOrientation(1);
        scrollView.addView(this.m1, c8.ma.x(-1, -2, 51));
        this.m1.setOnTouchListener(new gi.a(29));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.m1.addView(frameLayout, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(context2);
        this.n1 = wb0Var;
        wb0Var.getEditText().setInputType(49152);
        this.n1.getEditText().setImeOptions(5);
        this.n1.setHint(org.telegram.messenger.hd.N0(2131750677, null));
        if (this.E1 != null) {
            this.n1.getEditText().setText(this.E1);
            this.E1 = null;
        }
        frameLayout.addView(this.n1, c8.ma.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.n1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bh0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 == 5) {
                            fh0 fh0Var = this.b;
                            fh0Var.I1.requestFocus();
                            eh0 eh0Var = fh0Var.I1;
                            eh0Var.setSelection(eh0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        fh0 fh0Var2 = this.b;
                        if (i13 != 5) {
                            fh0Var2.getClass();
                            break;
                        } else {
                            fh0Var2.o1.requestFocus();
                            fh0Var2.o1.getEditText().setSelection(fh0Var2.o1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i13 == 5) {
                            fh0 fh0Var3 = this.b;
                            fh0Var3.I1.requestFocus();
                            eh0 eh0Var2 = fh0Var3.I1;
                            eh0Var2.setSelection(eh0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i13 == 5) {
                            fh0 fh0Var4 = this.b;
                            fh0Var4.K1.requestFocus();
                            eh0 eh0Var3 = fh0Var4.K1;
                            eh0Var3.setSelection(eh0Var3.length());
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var5 = this.b;
                        if (i13 != 5) {
                            fh0Var5.getClass();
                            break;
                        } else {
                            fh0Var5.T1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.wb0 wb0Var2 = new org.telegram.ui.Components.wb0(context2);
        this.o1 = wb0Var2;
        wb0Var2.setBackground(null);
        this.o1.getEditText().setInputType(49152);
        this.o1.getEditText().setImeOptions(5);
        this.o1.setHint(org.telegram.messenger.hd.N0(2131748839, null));
        if (this.F1 != null) {
            this.o1.getEditText().setText(this.F1);
            this.F1 = null;
        }
        frameLayout.addView(this.o1, c8.ma.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.o1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bh0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            fh0 fh0Var = this.b;
                            fh0Var.I1.requestFocus();
                            eh0 eh0Var = fh0Var.I1;
                            eh0Var.setSelection(eh0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        fh0 fh0Var2 = this.b;
                        if (i132 != 5) {
                            fh0Var2.getClass();
                            break;
                        } else {
                            fh0Var2.o1.requestFocus();
                            fh0Var2.o1.getEditText().setSelection(fh0Var2.o1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            fh0 fh0Var3 = this.b;
                            fh0Var3.I1.requestFocus();
                            eh0 eh0Var2 = fh0Var3.I1;
                            eh0Var2.setSelection(eh0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            fh0 fh0Var4 = this.b;
                            fh0Var4.K1.requestFocus();
                            eh0 eh0Var3 = fh0Var4.K1;
                            eh0Var3.setSelection(eh0Var3.length());
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var5 = this.b;
                        if (i132 != 5) {
                            fh0Var5.getClass();
                            break;
                        } else {
                            fh0Var5.T1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(context2, null);
        this.t1 = yb0Var;
        yb0Var.addView(linearLayout2, c8.ma.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.t1.setText(org.telegram.messenger.hd.N0(2131747096, null));
        this.m1.addView(this.t1, c8.ma.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context2, null);
        this.u1 = m80Var;
        m80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(this.u1, org.telegram.ui.ActionBar.m6.y6, this.J0);
        org.telegram.ui.ActionBar.t6.G(this.u1, org.telegram.ui.ActionBar.m6.Xc, this.J0);
        this.m1.addView(this.u1, c8.ma.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(context2, 5);
        this.Q1 = n2Var;
        n2Var.setTextSize(1, 16.0f);
        this.Q1.setFocusable(false);
        this.Q1.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                fh0 fh0Var = this.b;
                switch (i15) {
                    case 0:
                        fh0Var.dismiss();
                        t9.j0(LaunchActivity.H1, 1, new dh0(fh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.g2 g2Var2 = fh0Var.G1;
                        if (!fh0Var.B1 && g2Var2 != null && g2Var2.getParentActivity() != null) {
                            if (fh0Var.n1.getEditText().length() != 0) {
                                if (fh0Var.I1.length() != 0) {
                                    if (fh0Var.K1.length() != 0) {
                                        if (!fh0Var.M1.a.q) {
                                            fh0Var.K0();
                                            break;
                                        } else {
                                            c8.na.c(R.raw.permission_request_contacts, 2131747113, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(fh0Var, 16));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.D3(fh0Var.K1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(fh0Var.I1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(fh0Var.n1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        us usVar = new us(null, true);
                        usVar.r = new dh0(fh0Var);
                        fh0Var.G1.showAsSheet(usVar);
                        break;
                    default:
                        fh0Var.M1.a(!r6.a.q, true);
                        fh0Var.Q0(true);
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
        frameLayout2.addView(this.Q1, c8.ma.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, c8.ma.o(42, -1));
        TextView textView = new TextView(context2);
        this.U1 = textView;
        textView.setText("+");
        this.U1.setTextSize(1, 16.0f);
        this.U1.setFocusable(false);
        linearLayout2.addView(this.U1, c8.ma.o(-2, -2));
        eh0 eh0Var = new eh0(this, context2, i12);
        this.I1 = eh0Var;
        int i16 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(eh0Var, i16, null);
        this.I1.setInputType(3);
        this.I1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.I1.setCursorWidth(1.5f);
        this.I1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        this.I1.setTextSize(1, 16.0f);
        this.I1.setMaxLines(1);
        this.I1.setGravity(19);
        this.I1.setImeOptions(268435461);
        this.I1.setBackground(null);
        this.I1.setContentDescription(org.telegram.messenger.hd.N0(2131748547, null));
        linearLayout2.addView(this.I1, c8.ma.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.I1.addTextChangedListener(new m0(this, 13));
        final int i17 = 3;
        this.I1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bh0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i132 == 5) {
                            fh0 fh0Var = this.b;
                            fh0Var.I1.requestFocus();
                            eh0 eh0Var2 = fh0Var.I1;
                            eh0Var2.setSelection(eh0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        fh0 fh0Var2 = this.b;
                        if (i132 != 5) {
                            fh0Var2.getClass();
                            break;
                        } else {
                            fh0Var2.o1.requestFocus();
                            fh0Var2.o1.getEditText().setSelection(fh0Var2.o1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            fh0 fh0Var3 = this.b;
                            fh0Var3.I1.requestFocus();
                            eh0 eh0Var22 = fh0Var3.I1;
                            eh0Var22.setSelection(eh0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            fh0 fh0Var4 = this.b;
                            fh0Var4.K1.requestFocus();
                            eh0 eh0Var3 = fh0Var4.K1;
                            eh0Var3.setSelection(eh0Var3.length());
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var5 = this.b;
                        if (i132 != 5) {
                            fh0Var5.getClass();
                            break;
                        } else {
                            fh0Var5.T1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.J1 = new View(context2);
        LinearLayout.LayoutParams k10 = c8.ma.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(this.J1, k10);
        eh0 eh0Var2 = new eh0(this, context2, i10);
        this.K1 = eh0Var2;
        org.telegram.ui.ActionBar.t6.U(eh0Var2, i16, null);
        this.K1.setInputType(3);
        this.K1.setPadding(0, 0, 0, 0);
        this.K1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.K1.setCursorWidth(1.5f);
        this.K1.setTextSize(1, 16.0f);
        this.K1.setMaxLines(1);
        this.K1.setGravity(19);
        this.K1.setImeOptions(268435461);
        this.K1.setBackground(null);
        this.K1.setContentDescription(org.telegram.messenger.hd.N0(2131747096, null));
        linearLayout2.addView(this.K1, c8.ma.o(-1, 36));
        this.K1.addTextChangedListener(new ar(this, 2));
        this.K1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bh0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i132 == 5) {
                            fh0 fh0Var = this.b;
                            fh0Var.I1.requestFocus();
                            eh0 eh0Var22 = fh0Var.I1;
                            eh0Var22.setSelection(eh0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        fh0 fh0Var2 = this.b;
                        if (i132 != 5) {
                            fh0Var2.getClass();
                            break;
                        } else {
                            fh0Var2.o1.requestFocus();
                            fh0Var2.o1.getEditText().setSelection(fh0Var2.o1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            fh0 fh0Var3 = this.b;
                            fh0Var3.I1.requestFocus();
                            eh0 eh0Var222 = fh0Var3.I1;
                            eh0Var222.setSelection(eh0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            fh0 fh0Var4 = this.b;
                            fh0Var4.K1.requestFocus();
                            eh0 eh0Var3 = fh0Var4.K1;
                            eh0Var3.setSelection(eh0Var3.length());
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var5 = this.b;
                        if (i132 != 5) {
                            fh0Var5.getClass();
                            break;
                        } else {
                            fh0Var5.T1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.L1 = imageView;
        imageView.setScaleX(0.5f);
        this.L1.setScaleY(0.5f);
        this.L1.setAlpha(0.0f);
        this.t1.addView(this.L1, c8.ma.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(21, context2, this.J0);
        this.M1 = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
        this.M1.setDrawUnchecked(true);
        this.M1.a(false, false);
        this.M1.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.N1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i16, this.J0);
        this.N1.setTextSize(1, 14.0f);
        this.N1.setText(org.telegram.messenger.hd.N0(2131754442, null));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.O1 = linearLayout3;
        linearLayout3.setOrientation(0);
        this.O1.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        this.O1.addView(this.M1, c8.ma.t(21, 21, 16, 0, 0, 9, 0));
        this.O1.addView(this.N1, c8.ma.r(-2, -2, 16));
        final int i18 = 3;
        this.O1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i18;
                fh0 fh0Var = this.b;
                switch (i152) {
                    case 0:
                        fh0Var.dismiss();
                        t9.j0(LaunchActivity.H1, 1, new dh0(fh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.g2 g2Var2 = fh0Var.G1;
                        if (!fh0Var.B1 && g2Var2 != null && g2Var2.getParentActivity() != null) {
                            if (fh0Var.n1.getEditText().length() != 0) {
                                if (fh0Var.I1.length() != 0) {
                                    if (fh0Var.K1.length() != 0) {
                                        if (!fh0Var.M1.a.q) {
                                            fh0Var.K0();
                                            break;
                                        } else {
                                            c8.na.c(R.raw.permission_request_contacts, 2131747113, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(fh0Var, 16));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.D3(fh0Var.K1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(fh0Var.I1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(fh0Var.n1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        us usVar = new us(null, true);
                        usVar.r = new dh0(fh0Var);
                        fh0Var.G1.showAsSheet(usVar);
                        break;
                    default:
                        fh0Var.M1.a(!r6.a.q, true);
                        fh0Var.Q0(true);
                        break;
                }
            }
        });
        this.O1.setTranslationY(org.telegram.messenger.g0.L(-21.33f));
        this.O1.setPivotX(0.0f);
        c8.ra.b(this.O1, 0.0125f, 1.2f);
        org.telegram.ui.ActionBar.t6.Q(this.O1, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i15, this.J0), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i15), this.J0);
        this.m1.addView(this.O1, c8.ma.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.p1 = frameLayout3;
        frameLayout3.setTranslationY(org.telegram.messenger.g0.L(-10.665f));
        this.m1.addView(this.p1, c8.ma.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.q1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, this.J0);
        this.p1.addView(this.q1, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        hi.e eVar = new hi.e(context2, this.J0, false);
        this.r1 = eVar;
        eVar.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131754445, null));
        this.r1.i(spannableStringBuilder, false, true);
        this.r1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i12;
                fh0 fh0Var = this.b;
                switch (i152) {
                    case 0:
                        fh0Var.dismiss();
                        t9.j0(LaunchActivity.H1, 1, new dh0(fh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.g2 g2Var2 = fh0Var.G1;
                        if (!fh0Var.B1 && g2Var2 != null && g2Var2.getParentActivity() != null) {
                            if (fh0Var.n1.getEditText().length() != 0) {
                                if (fh0Var.I1.length() != 0) {
                                    if (fh0Var.K1.length() != 0) {
                                        if (!fh0Var.M1.a.q) {
                                            fh0Var.K0();
                                            break;
                                        } else {
                                            c8.na.c(R.raw.permission_request_contacts, 2131747113, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(fh0Var, 16));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.D3(fh0Var.K1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(fh0Var.I1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) g2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(fh0Var.n1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        us usVar = new us(null, true);
                        usVar.r = new dh0(fh0Var);
                        fh0Var.G1.showAsSheet(usVar);
                        break;
                    default:
                        fh0Var.M1.a(!r6.a.q, true);
                        fh0Var.Q0(true);
                        break;
                }
            }
        });
        this.p1.addView(this.r1, c8.ma.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.wb0 wb0Var3 = new org.telegram.ui.Components.wb0(context2);
        this.s1 = wb0Var3;
        wb0Var3.setBackground(null);
        this.s1.getEditText().setInputType(49152);
        this.s1.getEditText().setImeOptions(5);
        this.s1.setHint(org.telegram.messenger.hd.N0(2131746454, null));
        this.p1.addView(this.s1, c8.ma.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.s1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bh0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i132 == 5) {
                            fh0 fh0Var = this.b;
                            fh0Var.I1.requestFocus();
                            eh0 eh0Var22 = fh0Var.I1;
                            eh0Var22.setSelection(eh0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        fh0 fh0Var2 = this.b;
                        if (i132 != 5) {
                            fh0Var2.getClass();
                            break;
                        } else {
                            fh0Var2.o1.requestFocus();
                            fh0Var2.o1.getEditText().setSelection(fh0Var2.o1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            fh0 fh0Var3 = this.b;
                            fh0Var3.I1.requestFocus();
                            eh0 eh0Var222 = fh0Var3.I1;
                            eh0Var222.setSelection(eh0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            fh0 fh0Var4 = this.b;
                            fh0Var4.K1.requestFocus();
                            eh0 eh0Var3 = fh0Var4.K1;
                            eh0Var3.setSelection(eh0Var3.length());
                            break;
                        }
                        break;
                    default:
                        fh0 fh0Var5 = this.b;
                        if (i132 != 5) {
                            fh0Var5.getClass();
                            break;
                        } else {
                            fh0Var5.T1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        Q0(false);
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
                this.v1.add(0, psVar2);
                List list = (List) this.w1.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.w1;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(psVar2);
                if (split.length > 3) {
                    this.x1.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.v1, Comparator$-CC.comparing(new aa.l(15)));
        if (TextUtils.isEmpty(this.C1)) {
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
                        if (i7 < this.v1.size()) {
                            psVar = null;
                            break;
                        } else {
                            if (Objects.equals(((ps) this.v1.get(i7)).a, str2)) {
                                psVar = (ps) this.v1.get(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    if (psVar != null) {
                        this.I1.setText(psVar.c);
                    }
                }
                if (this.I1.length() == 0) {
                    this.K1.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i7 = 0;
                while (true) {
                    if (i7 < this.v1.size()) {
                    }
                    i7++;
                }
                if (psVar != null) {
                }
            }
            if (this.I1.length() == 0) {
            }
        } else {
            TLRPC.User f10 = this.G1.getUserConfig().f();
            if (this.C1.startsWith("+")) {
                this.I1.setText(this.C1.substring(1));
            } else if (this.D1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
                this.I1.setText(this.C1);
            } else {
                String str4 = f10.phone;
                while (true) {
                    if (i11 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i11);
                    if (((List) this.w1.get(substring)) != null) {
                        this.I1.setText(substring);
                        break;
                    }
                    i11--;
                }
                this.K1.setText(this.C1);
            }
            this.C1 = null;
        }
        this.T1 = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.R1 = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.R1.setGravity(17);
        this.R1.setLines(1);
        this.R1.setSingleLine(true);
        this.R1.setText(org.telegram.messenger.hd.N0(2131751739, null));
        TextView textView4 = this.R1;
        org.telegram.ui.ActionBar.g2 g2Var2 = this.G1;
        int i19 = org.telegram.ui.ActionBar.m6.Ji;
        textView4.setTextColor(g2Var2.getThemedColor(i19));
        this.R1.setTextSize(1, 15.0f);
        this.R1.setTypeface(org.telegram.messenger.g0.o());
        c8.ra.b(this.T1, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.S1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.S1.setProgressColor(this.G1.getThemedColor(i19));
        this.T1.addView(this.R1, c8.ma.c(-1.0f, -1));
        this.T1.addView(this.S1, c8.ma.e(40, 40, 17));
        this.m1.addView(this.T1, c8.ma.t(-1, 48, 0, 0, 8, 0, 4));
        org.telegram.messenger.g0.X3(this.R1, true, 1.0f, true, false);
        org.telegram.messenger.g0.X3(this.S1, false, 1.0f, true, false);
        this.T1.setBackground(org.telegram.ui.ActionBar.a6.e(this.G1.getThemedColor(org.telegram.ui.ActionBar.m6.Fi), 24.0f));
        this.T1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i10;
                fh0 fh0Var = this.b;
                switch (i152) {
                    case 0:
                        fh0Var.dismiss();
                        t9.j0(LaunchActivity.H1, 1, new dh0(fh0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.g2 g2Var22 = fh0Var.G1;
                        if (!fh0Var.B1 && g2Var22 != null && g2Var22.getParentActivity() != null) {
                            if (fh0Var.n1.getEditText().length() != 0) {
                                if (fh0Var.I1.length() != 0) {
                                    if (fh0Var.K1.length() != 0) {
                                        if (!fh0Var.M1.a.q) {
                                            fh0Var.K0();
                                            break;
                                        } else {
                                            c8.na.c(R.raw.permission_request_contacts, 2131747113, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(fh0Var, 16));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) g2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.D3(fh0Var.K1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) g2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(fh0Var.I1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) g2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(fh0Var.n1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        us usVar = new us(null, true);
                        usVar.r = new dh0(fh0Var);
                        fh0Var.G1.showAsSheet(usVar);
                        break;
                    default:
                        fh0Var.M1.a(!r6.a.q, true);
                        fh0Var.Q0(true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.U(this.U1, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.k6, this.J1, null);
        this.O = scrollView;
        this.P = org.telegram.messenger.hd.N0(2131748083, null);
        this.Q = true;
    }

    public static void J0(fh0 fh0Var) {
        String replaceAll = (fh0Var.I1.getText().toString() + fh0Var.K1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) fh0Var.w1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) fh0Var.x1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (z10) {
            if (TextUtils.equals(fh0Var.V1, replaceAll)) {
                return;
            }
            fh0Var.V1 = replaceAll;
            fh0Var.R0(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(fh0Var.V1)) {
            return;
        }
        fh0Var.V1 = null;
        fh0Var.R0(null);
    }

    public static String L0(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
    }

    public final void K0() {
        this.B1 = true;
        org.telegram.messenger.g0.X3(this.R1, false, 0.5f, true, true);
        org.telegram.messenger.g0.X3(this.S1, true, 0.5f, true, true);
        String str = "+" + this.I1.getText().toString() + this.K1.getText().toString();
        String obj = this.n1.getEditText().getText().toString();
        String obj2 = this.o1.getEditText().getText().toString();
        String obj3 = this.s1.getVisibility() == 0 ? this.s1.getEditText().getText().toString() : "";
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
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.H1);
        if (this.M1.a.q) {
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

    public final void M0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.Q1.animate();
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            animate.setInterpolator(nrVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.U1.animate().setInterpolator(nrVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.I1.animate().setInterpolator(nrVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.Q1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.U1.animate();
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.f;
        animate2.setInterpolator(nrVar2).translationX(0.0f).setDuration(150L);
        this.I1.animate().setInterpolator(nrVar2).translationX(0.0f).setDuration(150L);
        this.Q1.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(String str, ps psVar) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0);
        }
        int i10 = 0;
        M0(org.telegram.messenger.j6.m(spannableStringBuilder, this.Q1.getPaint().getFontMetricsInt(), false, null, 0));
        this.P1 = -1;
        String replace = this.K1.getText() != null ? this.K1.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.x1;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.P1 != -1) {
                int selectionStart = this.K1.getSelectionStart();
                int selectionEnd = this.K1.getSelectionEnd();
                this.K1.setHintText((String) null);
                this.K1.setSelection(selectionStart, selectionEnd);
                this.P1 = -1;
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
        if (this.P1 != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = this.K1.getSelectionStart();
            int selectionEnd2 = this.K1.getSelectionEnd();
            this.K1.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.K1.setSelection(selectionStart2, selectionEnd2);
            this.P1 = i10;
        }
    }

    public final void O0(String str, boolean z10) {
        this.C1 = str;
        this.D1 = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.k10.i(this.a).f();
        if (this.C1.startsWith("+")) {
            this.I1.setText(this.C1.substring(1));
        } else if (this.D1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
            this.I1.setText(this.C1);
        } else {
            String str2 = f10.phone;
            int i7 = 4;
            while (true) {
                if (i7 >= 1) {
                    List list = (List) this.w1.get(str2.substring(0, i7));
                    if (list == null || list.size() <= 0) {
                        i7--;
                    } else {
                        String str3 = ((ps) list.get(0)).c;
                        this.I1.setText(str3);
                        if (str3.endsWith("0") && this.C1.startsWith("0")) {
                            this.C1 = this.C1.substring(1);
                        }
                    }
                } else {
                    Context context = org.telegram.messenger.t0.b;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.I1.setText(upperCase);
                    if (upperCase.endsWith("0") && this.C1.startsWith("0")) {
                        this.C1 = this.C1.substring(1);
                    }
                }
            }
            this.K1.setText(this.C1);
        }
        this.C1 = null;
    }

    public final void P0(boolean z10) {
        ViewPropertyAnimator translationY = this.O1.animate().translationY(z10 ? -org.telegram.messenger.g0.L(21.33f) : 0.0f);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        org.telegram.messenger.o10.o(translationY, nrVar, 420L);
        this.p1.animate().translationY(z10 ? -org.telegram.messenger.g0.L(10.665f) : 0.0f).setInterpolator(nrVar).setDuration(420L).start();
    }

    public final void Q0(boolean z10) {
        boolean z11 = this.M1.a.q;
        final boolean z12 = !z11;
        if (!z10) {
            this.r1.animate().cancel();
            this.r1.setVisibility(!z11 ? 0 : 4);
            this.r1.setAlpha(!z11 ? 1.0f : 0.0f);
            this.q1.animate().cancel();
            this.q1.setVisibility(!z11 ? 0 : 8);
            this.q1.setAlpha(!z11 ? 1.0f : 0.0f);
            this.s1.animate().cancel();
            this.s1.setVisibility(z11 ? 0 : 4);
            this.s1.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        this.r1.setVisibility(0);
        ViewPropertyAnimator alpha = this.r1.animate().alpha(!z11 ? 1.0f : 0.0f);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        final int i7 = 0;
        alpha.setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ch0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        boolean z13 = z12;
                        fh0 fh0Var = this.b;
                        if (!z13) {
                            fh0Var.r1.setVisibility(4);
                            break;
                        } else {
                            fh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        fh0 fh0Var2 = this.b;
                        if (!z14) {
                            fh0Var2.q1.setVisibility(4);
                            break;
                        } else {
                            fh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        fh0 fh0Var3 = this.b;
                        if (!z15) {
                            fh0Var3.getClass();
                            break;
                        } else {
                            fh0Var3.s1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.q1.setVisibility(0);
        final int i10 = 1;
        this.q1.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ch0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        fh0 fh0Var = this.b;
                        if (!z13) {
                            fh0Var.r1.setVisibility(4);
                            break;
                        } else {
                            fh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        fh0 fh0Var2 = this.b;
                        if (!z14) {
                            fh0Var2.q1.setVisibility(4);
                            break;
                        } else {
                            fh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        fh0 fh0Var3 = this.b;
                        if (!z15) {
                            fh0Var3.getClass();
                            break;
                        } else {
                            fh0Var3.s1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.s1.setVisibility(0);
        final int i11 = 2;
        this.s1.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ch0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        fh0 fh0Var = this.b;
                        if (!z13) {
                            fh0Var.r1.setVisibility(4);
                            break;
                        } else {
                            fh0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        fh0 fh0Var2 = this.b;
                        if (!z14) {
                            fh0Var2.q1.setVisibility(4);
                            break;
                        } else {
                            fh0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        fh0 fh0Var3 = this.b;
                        if (!z15) {
                            fh0Var3.getClass();
                            break;
                        } else {
                            fh0Var3.s1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void R0(String str) {
        if (this.W1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.W1, true);
            this.W1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.o10.o(this.L1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.nr.h, 420L);
            this.u1.setText("");
            P0(true);
            return;
        }
        org.telegram.messenger.o10.o(this.L1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.nr.h, 420L);
        this.L1.setImageDrawable(new org.telegram.ui.Components.up(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m5, this.J0)));
        this.u1.setText("");
        P0(true);
        org.telegram.ui.Components.rh rhVar = new org.telegram.ui.Components.rh(20, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.i5.r(this.a).l0.get(pf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = pf.b.d(str, false);
            this.W1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new e00(14, this, rhVar));
        } else {
            TLRPC.User c22 = org.telegram.messenger.np.u1(this.a).c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null) {
                rhVar.a(c22);
            } else {
                org.telegram.messenger.ur.a0(this.a).a.c(new mc0(this, tL_contact, rhVar, 8));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.o1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K1, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.h3(new zg0(this, 0), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.A1) {
            this.A1 = false;
            return;
        }
        this.y1 = true;
        this.I1.setText(((ps) this.v1.get(i7)).c);
        this.y1 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.S1;
            org.telegram.ui.ActionBar.g2 g2Var = this.G1;
            if (radialProgressView != null && g2Var != null) {
                radialProgressView.setProgressColor(g2Var.getThemedColor(org.telegram.ui.ActionBar.m6.Ji));
            }
            if (this.T1 != null && g2Var != null && ((themedColor = g2Var.getThemedColor(org.telegram.ui.ActionBar.m6.Fi)) != this.X1 || this.Y1 != org.telegram.ui.ActionBar.m6.I.q())) {
                this.Y1 = org.telegram.ui.ActionBar.m6.I.q();
                this.X1 = themedColor;
                org.telegram.ui.ActionBar.m6.H1(this.T1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.m6.H1(this.T1.getBackground(), org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.T1.invalidate();
            }
            ImageView imageView = this.L1;
            if (imageView == null || !(imageView.getDrawable() instanceof org.telegram.ui.Components.up)) {
                return;
            }
            ((org.telegram.ui.Components.up) this.L1.getDrawable()).b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m5, this.J0));
            this.L1.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.n1.getEditText().requestFocus();
        this.n1.getEditText().setSelection(this.n1.getEditText().length());
        org.telegram.messenger.g0.h3(new zg0(this, 1), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
