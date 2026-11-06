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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ah0 extends org.telegram.ui.ActionBar.v2 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int V1 = 0;
    public String A1;
    public String B1;
    public final org.telegram.ui.ActionBar.f2 C1;
    public final int D1;
    public final zg0 E1;
    public final View F1;
    public final zg0 G1;
    public final ImageView H1;
    public final org.telegram.ui.Components.wo I1;
    public final TextView J1;
    public final LinearLayout K1;
    public int L1;
    public final org.telegram.ui.ActionBar.m2 M1;
    public final TextView N1;
    public final RadialProgressView O1;
    public final FrameLayout P1;
    public final TextView Q1;
    public String R1;
    public int S1;
    public int T1;
    public boolean U1;
    public final LinearLayout i1;
    public final org.telegram.ui.Components.kb0 j1;
    public final org.telegram.ui.Components.kb0 k1;
    public final FrameLayout l1;
    public final View m1;
    public final fi.d n1;
    public final org.telegram.ui.Components.kb0 o1;
    public final org.telegram.ui.Components.lb0 p1;
    public final org.telegram.ui.Components.w70 q1;
    public final ArrayList r1;
    public final HashMap s1;
    public final HashMap t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public String y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ah0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, true);
        String str;
        String str2;
        int i7;
        ms msVar;
        TelephonyManager telephonyManager;
        final int i10 = 1;
        this.r1 = new ArrayList();
        this.s1 = new HashMap();
        this.t1 = new HashMap();
        this.S1 = -1;
        N();
        this.D = true;
        this.P0 = true;
        this.D1 = ConnectionsManager.generateClassGuid();
        this.C1 = f2Var;
        Context context2 = getContext();
        final int i11 = 4;
        new org.telegram.ui.Components.zp(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.i1 = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.i1.setOrientation(1);
        scrollView.addView(this.i1, c8.ha.x(-1, -2, 51));
        this.i1.setOnTouchListener(new ei.b(28));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.i1.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.kb0 kb0Var = new org.telegram.ui.Components.kb0(context2);
        this.j1 = kb0Var;
        kb0Var.getEditText().setInputType(49152);
        this.j1.getEditText().setImeOptions(5);
        this.j1.setHint(org.telegram.messenger.hd.M0(2131750695, null));
        if (this.A1 != null) {
            this.j1.getEditText().setText(this.A1);
            this.A1 = null;
        }
        frameLayout.addView(this.j1, c8.ha.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.j1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 == 5) {
                            ah0 ah0Var = this.b;
                            ah0Var.E1.requestFocus();
                            zg0 zg0Var = ah0Var.E1;
                            zg0Var.setSelection(zg0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ah0 ah0Var2 = this.b;
                        if (i13 != 5) {
                            ah0Var2.getClass();
                            break;
                        } else {
                            ah0Var2.k1.requestFocus();
                            ah0Var2.k1.getEditText().setSelection(ah0Var2.k1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i13 == 5) {
                            ah0 ah0Var3 = this.b;
                            ah0Var3.E1.requestFocus();
                            zg0 zg0Var2 = ah0Var3.E1;
                            zg0Var2.setSelection(zg0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i13 == 5) {
                            ah0 ah0Var4 = this.b;
                            ah0Var4.G1.requestFocus();
                            zg0 zg0Var3 = ah0Var4.G1;
                            zg0Var3.setSelection(zg0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ah0 ah0Var5 = this.b;
                        if (i13 != 5) {
                            ah0Var5.getClass();
                            break;
                        } else {
                            ah0Var5.P1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.kb0 kb0Var2 = new org.telegram.ui.Components.kb0(context2);
        this.k1 = kb0Var2;
        kb0Var2.setBackground(null);
        this.k1.getEditText().setInputType(49152);
        this.k1.getEditText().setImeOptions(5);
        this.k1.setHint(org.telegram.messenger.hd.M0(2131749031, null));
        if (this.B1 != null) {
            this.k1.getEditText().setText(this.B1);
            this.B1 = null;
        }
        frameLayout.addView(this.k1, c8.ha.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.k1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            ah0 ah0Var = this.b;
                            ah0Var.E1.requestFocus();
                            zg0 zg0Var = ah0Var.E1;
                            zg0Var.setSelection(zg0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ah0 ah0Var2 = this.b;
                        if (i132 != 5) {
                            ah0Var2.getClass();
                            break;
                        } else {
                            ah0Var2.k1.requestFocus();
                            ah0Var2.k1.getEditText().setSelection(ah0Var2.k1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            ah0 ah0Var3 = this.b;
                            ah0Var3.E1.requestFocus();
                            zg0 zg0Var2 = ah0Var3.E1;
                            zg0Var2.setSelection(zg0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            ah0 ah0Var4 = this.b;
                            ah0Var4.G1.requestFocus();
                            zg0 zg0Var3 = ah0Var4.G1;
                            zg0Var3.setSelection(zg0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ah0 ah0Var5 = this.b;
                        if (i132 != 5) {
                            ah0Var5.getClass();
                            break;
                        } else {
                            ah0Var5.P1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context2, null);
        this.p1 = lb0Var;
        lb0Var.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.p1.setText(org.telegram.messenger.hd.M0(2131747289, null));
        this.i1.addView(this.p1, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context2, null);
        this.q1 = w70Var;
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(this.q1, org.telegram.ui.ActionBar.k6.y6, this.I0);
        org.telegram.ui.ActionBar.r6.H(this.q1, org.telegram.ui.ActionBar.k6.Uc, this.I0);
        this.i1.addView(this.q1, c8.ha.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(context2, 5);
        this.M1 = m2Var;
        m2Var.setTextSize(1, 16.0f);
        this.M1.setFocusable(false);
        this.M1.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                ah0 ah0Var = this.b;
                switch (i15) {
                    case 0:
                        ah0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new yg0(ah0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = ah0Var.C1;
                        if (!ah0Var.x1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (ah0Var.j1.getEditText().length() != 0) {
                                if (ah0Var.E1.length() != 0) {
                                    if (ah0Var.G1.length() != 0) {
                                        if (!ah0Var.I1.a.q) {
                                            ah0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747306, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(ah0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(ah0Var.G1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(ah0Var.E1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(ah0Var.j1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qs qsVar = new qs(null, true);
                        qsVar.r = new yg0(ah0Var);
                        ah0Var.C1.showAsSheet(qsVar);
                        break;
                    default:
                        ah0Var.I1.a(!r6.a.q, true);
                        ah0Var.P0(true);
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(6.0f);
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
        frameLayout2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, k02, null, N, null);
        frameLayout2.addView(this.M1, c8.ha.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, c8.ha.o(42, -1));
        TextView textView = new TextView(context2);
        this.Q1 = textView;
        textView.setText("+");
        this.Q1.setTextSize(1, 16.0f);
        this.Q1.setFocusable(false);
        linearLayout2.addView(this.Q1, c8.ha.o(-2, -2));
        zg0 zg0Var = new zg0(this, context2, i12);
        this.E1 = zg0Var;
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(zg0Var, i16, null);
        this.E1.setInputType(3);
        this.E1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.E1.setCursorWidth(1.5f);
        this.E1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        this.E1.setTextSize(1, 16.0f);
        this.E1.setMaxLines(1);
        this.E1.setGravity(19);
        this.E1.setImeOptions(268435461);
        this.E1.setBackground(null);
        this.E1.setContentDescription(org.telegram.messenger.hd.M0(2131748739, null));
        linearLayout2.addView(this.E1, c8.ha.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.E1.addTextChangedListener(new m0(this, 13));
        final int i17 = 3;
        this.E1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i132 == 5) {
                            ah0 ah0Var = this.b;
                            ah0Var.E1.requestFocus();
                            zg0 zg0Var2 = ah0Var.E1;
                            zg0Var2.setSelection(zg0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        ah0 ah0Var2 = this.b;
                        if (i132 != 5) {
                            ah0Var2.getClass();
                            break;
                        } else {
                            ah0Var2.k1.requestFocus();
                            ah0Var2.k1.getEditText().setSelection(ah0Var2.k1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            ah0 ah0Var3 = this.b;
                            ah0Var3.E1.requestFocus();
                            zg0 zg0Var22 = ah0Var3.E1;
                            zg0Var22.setSelection(zg0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            ah0 ah0Var4 = this.b;
                            ah0Var4.G1.requestFocus();
                            zg0 zg0Var3 = ah0Var4.G1;
                            zg0Var3.setSelection(zg0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ah0 ah0Var5 = this.b;
                        if (i132 != 5) {
                            ah0Var5.getClass();
                            break;
                        } else {
                            ah0Var5.P1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.F1 = new View(context2);
        LinearLayout.LayoutParams k10 = c8.ha.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(this.F1, k10);
        zg0 zg0Var2 = new zg0(this, context2, i10);
        this.G1 = zg0Var2;
        org.telegram.ui.ActionBar.r6.V(zg0Var2, i16, null);
        this.G1.setInputType(3);
        this.G1.setPadding(0, 0, 0, 0);
        this.G1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.G1.setCursorWidth(1.5f);
        this.G1.setTextSize(1, 16.0f);
        this.G1.setMaxLines(1);
        this.G1.setGravity(19);
        this.G1.setImeOptions(268435461);
        this.G1.setBackground(null);
        this.G1.setContentDescription(org.telegram.messenger.hd.M0(2131747289, null));
        linearLayout2.addView(this.G1, c8.ha.o(-1, 36));
        this.G1.addTextChangedListener(new xq(this, 2));
        this.G1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i132 == 5) {
                            ah0 ah0Var = this.b;
                            ah0Var.E1.requestFocus();
                            zg0 zg0Var22 = ah0Var.E1;
                            zg0Var22.setSelection(zg0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        ah0 ah0Var2 = this.b;
                        if (i132 != 5) {
                            ah0Var2.getClass();
                            break;
                        } else {
                            ah0Var2.k1.requestFocus();
                            ah0Var2.k1.getEditText().setSelection(ah0Var2.k1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            ah0 ah0Var3 = this.b;
                            ah0Var3.E1.requestFocus();
                            zg0 zg0Var222 = ah0Var3.E1;
                            zg0Var222.setSelection(zg0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            ah0 ah0Var4 = this.b;
                            ah0Var4.G1.requestFocus();
                            zg0 zg0Var3 = ah0Var4.G1;
                            zg0Var3.setSelection(zg0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ah0 ah0Var5 = this.b;
                        if (i132 != 5) {
                            ah0Var5.getClass();
                            break;
                        } else {
                            ah0Var5.P1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.H1 = imageView;
        imageView.setScaleX(0.5f);
        this.H1.setScaleY(0.5f);
        this.H1.setAlpha(0.0f);
        this.p1.addView(this.H1, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context2, this.I0);
        this.I1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        this.I1.setDrawUnchecked(true);
        this.I1.a(false, false);
        this.I1.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.J1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i16, this.I0);
        this.J1.setTextSize(1, 14.0f);
        this.J1.setText(org.telegram.messenger.hd.M0(2131754445, null));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.K1 = linearLayout3;
        linearLayout3.setOrientation(0);
        this.K1.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        this.K1.addView(this.I1, c8.ha.t(21, 21, 16, 0, 0, 9, 0));
        this.K1.addView(this.J1, c8.ha.r(-2, -2, 16));
        final int i18 = 3;
        this.K1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i18;
                ah0 ah0Var = this.b;
                switch (i152) {
                    case 0:
                        ah0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new yg0(ah0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = ah0Var.C1;
                        if (!ah0Var.x1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (ah0Var.j1.getEditText().length() != 0) {
                                if (ah0Var.E1.length() != 0) {
                                    if (ah0Var.G1.length() != 0) {
                                        if (!ah0Var.I1.a.q) {
                                            ah0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747306, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(ah0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(ah0Var.G1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(ah0Var.E1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(ah0Var.j1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qs qsVar = new qs(null, true);
                        qsVar.r = new yg0(ah0Var);
                        ah0Var.C1.showAsSheet(qsVar);
                        break;
                    default:
                        ah0Var.I1.a(!r6.a.q, true);
                        ah0Var.P0(true);
                        break;
                }
            }
        });
        this.K1.setTranslationY(org.telegram.messenger.g0.L(-21.33f));
        this.K1.setPivotX(0.0f);
        c8.ka.b(this.K1, 0.0125f, 1.2f);
        org.telegram.ui.ActionBar.r6.R(this.K1, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i15), this.I0);
        this.i1.addView(this.K1, c8.ha.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.l1 = frameLayout3;
        frameLayout3.setTranslationY(org.telegram.messenger.g0.L(-10.665f));
        this.i1.addView(this.l1, c8.ha.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.m1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.I0);
        this.l1.addView(this.m1, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        fi.d dVar = new fi.d(context2, this.I0, false);
        this.n1 = dVar;
        dVar.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131754448, null));
        this.n1.i(spannableStringBuilder, false, true);
        this.n1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i12;
                ah0 ah0Var = this.b;
                switch (i152) {
                    case 0:
                        ah0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new yg0(ah0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var2 = ah0Var.C1;
                        if (!ah0Var.x1 && f2Var2 != null && f2Var2.getParentActivity() != null) {
                            if (ah0Var.j1.getEditText().length() != 0) {
                                if (ah0Var.E1.length() != 0) {
                                    if (ah0Var.G1.length() != 0) {
                                        if (!ah0Var.I1.a.q) {
                                            ah0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747306, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(ah0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(ah0Var.G1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(ah0Var.E1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(ah0Var.j1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qs qsVar = new qs(null, true);
                        qsVar.r = new yg0(ah0Var);
                        ah0Var.C1.showAsSheet(qsVar);
                        break;
                    default:
                        ah0Var.I1.a(!r6.a.q, true);
                        ah0Var.P0(true);
                        break;
                }
            }
        });
        this.l1.addView(this.n1, c8.ha.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.kb0 kb0Var3 = new org.telegram.ui.Components.kb0(context2);
        this.o1 = kb0Var3;
        kb0Var3.setBackground(null);
        this.o1.getEditText().setInputType(49152);
        this.o1.getEditText().setImeOptions(5);
        this.o1.setHint(org.telegram.messenger.hd.M0(2131746649, null));
        this.l1.addView(this.o1, c8.ha.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.o1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i132 == 5) {
                            ah0 ah0Var = this.b;
                            ah0Var.E1.requestFocus();
                            zg0 zg0Var22 = ah0Var.E1;
                            zg0Var22.setSelection(zg0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        ah0 ah0Var2 = this.b;
                        if (i132 != 5) {
                            ah0Var2.getClass();
                            break;
                        } else {
                            ah0Var2.k1.requestFocus();
                            ah0Var2.k1.getEditText().setSelection(ah0Var2.k1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            ah0 ah0Var3 = this.b;
                            ah0Var3.E1.requestFocus();
                            zg0 zg0Var222 = ah0Var3.E1;
                            zg0Var222.setSelection(zg0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            ah0 ah0Var4 = this.b;
                            ah0Var4.G1.requestFocus();
                            zg0 zg0Var3 = ah0Var4.G1;
                            zg0Var3.setSelection(zg0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ah0 ah0Var5 = this.b;
                        if (i132 != 5) {
                            ah0Var5.getClass();
                            break;
                        } else {
                            ah0Var5.P1.callOnClick();
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
                ms msVar2 = new ms();
                msVar2.a = split[2];
                msVar2.c = split[0];
                msVar2.d = split[1];
                this.r1.add(0, msVar2);
                List list = (List) this.s1.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.s1;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(msVar2);
                if (split.length > 3) {
                    this.t1.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.r1, Comparator$-CC.comparing(new aa.l(15)));
        if (TextUtils.isEmpty(this.y1)) {
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
                        if (i7 < this.r1.size()) {
                            msVar = null;
                            break;
                        } else {
                            if (Objects.equals(((ms) this.r1.get(i7)).a, str2)) {
                                msVar = (ms) this.r1.get(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    if (msVar != null) {
                        this.E1.setText(msVar.c);
                    }
                }
                if (this.E1.length() == 0) {
                    this.G1.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i7 = 0;
                while (true) {
                    if (i7 < this.r1.size()) {
                    }
                    i7++;
                }
                if (msVar != null) {
                }
            }
            if (this.E1.length() == 0) {
            }
        } else {
            TLRPC.User f10 = this.C1.getUserConfig().f();
            if (this.y1.startsWith("+")) {
                this.E1.setText(this.y1.substring(1));
            } else if (this.z1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
                this.E1.setText(this.y1);
            } else {
                String str4 = f10.phone;
                while (true) {
                    if (i11 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i11);
                    if (((List) this.s1.get(substring)) != null) {
                        this.E1.setText(substring);
                        break;
                    }
                    i11--;
                }
                this.G1.setText(this.y1);
            }
            this.y1 = null;
        }
        this.P1 = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.N1 = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.N1.setGravity(17);
        this.N1.setLines(1);
        this.N1.setSingleLine(true);
        this.N1.setText(org.telegram.messenger.hd.M0(2131751751, null));
        TextView textView4 = this.N1;
        org.telegram.ui.ActionBar.f2 f2Var2 = this.C1;
        int i19 = org.telegram.ui.ActionBar.k6.Gi;
        textView4.setTextColor(f2Var2.getThemedColor(i19));
        this.N1.setTextSize(1, 15.0f);
        this.N1.setTypeface(org.telegram.messenger.g0.o());
        c8.ka.b(this.P1, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.O1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.O1.setProgressColor(this.C1.getThemedColor(i19));
        this.P1.addView(this.N1, c8.ha.c(-1.0f, -1));
        this.P1.addView(this.O1, c8.ha.e(40, 40, 17));
        this.i1.addView(this.P1, c8.ha.t(-1, 48, 0, 0, 8, 0, 4));
        org.telegram.messenger.g0.Z3(this.N1, true, 1.0f, true, false);
        org.telegram.messenger.g0.Z3(this.O1, false, 1.0f, true, false);
        this.P1.setBackground(org.telegram.ui.ActionBar.z5.e(this.C1.getThemedColor(org.telegram.ui.ActionBar.k6.Ci), 24.0f));
        this.P1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i10;
                ah0 ah0Var = this.b;
                switch (i152) {
                    case 0:
                        ah0Var.dismiss();
                        s9.j0(LaunchActivity.G1, 1, new yg0(ah0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.f2 f2Var22 = ah0Var.C1;
                        if (!ah0Var.x1 && f2Var22 != null && f2Var22.getParentActivity() != null) {
                            if (ah0Var.j1.getEditText().length() != 0) {
                                if (ah0Var.E1.length() != 0) {
                                    if (ah0Var.G1.length() != 0) {
                                        if (!ah0Var.I1.a.q) {
                                            ah0Var.J0();
                                            break;
                                        } else {
                                            c8.ia.c(R.raw.permission_request_contacts, 2131747306, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new r3(ah0Var, 15));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(ah0Var.G1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(ah0Var.E1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) f2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(ah0Var.j1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qs qsVar = new qs(null, true);
                        qsVar.r = new yg0(ah0Var);
                        ah0Var.C1.showAsSheet(qsVar);
                        break;
                    default:
                        ah0Var.I1.a(!r6.a.q, true);
                        ah0Var.P0(true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.V(this.Q1, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.k6, this.F1, null);
        this.N = scrollView;
        this.O = org.telegram.messenger.hd.M0(2131748275, null);
        this.P = true;
    }

    public static void I0(ah0 ah0Var) {
        String replaceAll = (ah0Var.E1.getText().toString() + ah0Var.G1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z9 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) ah0Var.s1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) ah0Var.t1.get(substring);
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
            if (TextUtils.equals(ah0Var.R1, replaceAll)) {
                return;
            }
            ah0Var.R1 = replaceAll;
            ah0Var.Q0(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(ah0Var.R1)) {
            return;
        }
        ah0Var.R1 = null;
        ah0Var.Q0(null);
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

    @Override // org.telegram.ui.ActionBar.v2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
    }

    public final void J0() {
        this.x1 = true;
        org.telegram.messenger.g0.Z3(this.N1, false, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(this.O1, true, 0.5f, true, true);
        String str = "+" + this.E1.getText().toString() + this.G1.getText().toString();
        String obj = this.j1.getEditText().getText().toString();
        String obj2 = this.k1.getEditText().getText().toString();
        String obj3 = this.o1.getVisibility() == 0 ? this.o1.getEditText().getText().toString() : "";
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
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.D1);
        if (this.I1.a.q) {
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
            ViewPropertyAnimator animate = this.M1.animate();
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            animate.setInterpolator(xqVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.Q1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.E1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.M1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Q1.animate();
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f;
        animate2.setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.E1.animate().setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.M1.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(String str, ms msVar) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(msVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0);
        }
        int i10 = 0;
        L0(org.telegram.messenger.i6.m(spannableStringBuilder, this.M1.getPaint().getFontMetricsInt(), false, null, 0));
        this.L1 = -1;
        String replace = this.G1.getText() != null ? this.G1.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.t1;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.L1 != -1) {
                int selectionStart = this.G1.getSelectionStart();
                int selectionEnd = this.G1.getSelectionEnd();
                this.G1.setHintText((String) null);
                this.G1.setSelection(selectionStart, selectionEnd);
                this.L1 = -1;
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
        if (this.L1 != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = this.G1.getSelectionStart();
            int selectionEnd2 = this.G1.getSelectionEnd();
            this.G1.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.G1.setSelection(selectionStart2, selectionEnd2);
            this.L1 = i10;
        }
    }

    public final void N0(String str, boolean z9) {
        this.y1 = str;
        this.z1 = z9;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(this.a).f();
        if (this.y1.startsWith("+")) {
            this.E1.setText(this.y1.substring(1));
        } else if (this.z1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
            this.E1.setText(this.y1);
        } else {
            String str2 = f10.phone;
            int i7 = 4;
            while (true) {
                if (i7 >= 1) {
                    List list = (List) this.s1.get(str2.substring(0, i7));
                    if (list == null || list.size() <= 0) {
                        i7--;
                    } else {
                        String str3 = ((ms) list.get(0)).c;
                        this.E1.setText(str3);
                        if (str3.endsWith("0") && this.y1.startsWith("0")) {
                            this.y1 = this.y1.substring(1);
                        }
                    }
                } else {
                    Context context = org.telegram.messenger.t0.b;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.E1.setText(upperCase);
                    if (upperCase.endsWith("0") && this.y1.startsWith("0")) {
                        this.y1 = this.y1.substring(1);
                    }
                }
            }
            this.G1.setText(this.y1);
        }
        this.y1 = null;
    }

    public final void O0(boolean z9) {
        ViewPropertyAnimator translationY = this.K1.animate().translationY(z9 ? -org.telegram.messenger.g0.L(21.33f) : 0.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 420L);
        this.l1.animate().translationY(z9 ? -org.telegram.messenger.g0.L(10.665f) : 0.0f).setInterpolator(xqVar).setDuration(420L).start();
    }

    public final void P0(boolean z9) {
        boolean z10 = this.I1.a.q;
        final boolean z11 = !z10;
        if (!z9) {
            this.n1.animate().cancel();
            this.n1.setVisibility(!z10 ? 0 : 4);
            this.n1.setAlpha(!z10 ? 1.0f : 0.0f);
            this.m1.animate().cancel();
            this.m1.setVisibility(!z10 ? 0 : 8);
            this.m1.setAlpha(!z10 ? 1.0f : 0.0f);
            this.o1.animate().cancel();
            this.o1.setVisibility(z10 ? 0 : 4);
            this.o1.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        this.n1.setVisibility(0);
        ViewPropertyAnimator alpha = this.n1.animate().alpha(!z10 ? 1.0f : 0.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        final int i7 = 0;
        alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.xg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        boolean z12 = z11;
                        ah0 ah0Var = this.b;
                        if (!z12) {
                            ah0Var.n1.setVisibility(4);
                            break;
                        } else {
                            ah0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        ah0 ah0Var2 = this.b;
                        if (!z13) {
                            ah0Var2.m1.setVisibility(4);
                            break;
                        } else {
                            ah0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        ah0 ah0Var3 = this.b;
                        if (!z14) {
                            ah0Var3.getClass();
                            break;
                        } else {
                            ah0Var3.o1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.m1.setVisibility(0);
        final int i10 = 1;
        this.m1.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.xg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z11;
                        ah0 ah0Var = this.b;
                        if (!z12) {
                            ah0Var.n1.setVisibility(4);
                            break;
                        } else {
                            ah0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        ah0 ah0Var2 = this.b;
                        if (!z13) {
                            ah0Var2.m1.setVisibility(4);
                            break;
                        } else {
                            ah0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        ah0 ah0Var3 = this.b;
                        if (!z14) {
                            ah0Var3.getClass();
                            break;
                        } else {
                            ah0Var3.o1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.o1.setVisibility(0);
        final int i11 = 2;
        this.o1.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.xg0
            public final /* synthetic */ ah0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z11;
                        ah0 ah0Var = this.b;
                        if (!z12) {
                            ah0Var.n1.setVisibility(4);
                            break;
                        } else {
                            ah0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        ah0 ah0Var2 = this.b;
                        if (!z13) {
                            ah0Var2.m1.setVisibility(4);
                            break;
                        } else {
                            ah0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        ah0 ah0Var3 = this.b;
                        if (!z14) {
                            ah0Var3.getClass();
                            break;
                        } else {
                            ah0Var3.o1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void Q0(String str) {
        if (this.S1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.S1, true);
            this.S1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.camera.q.l(this.H1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.xq.h, 420L);
            this.q1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.camera.q.l(this.H1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.xq.h, 420L);
        this.H1.setImageDrawable(new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m5, this.I0)));
        this.q1.setText("");
        O0(true);
        org.telegram.ui.Components.ex exVar = new org.telegram.ui.Components.ex(16, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.g5.r(this.a).k0.get(pf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = pf.b.d(str, false);
            this.S1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new h50(12, this, exVar));
        } else {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                exVar.a(a22);
            } else {
                org.telegram.messenger.yr.a0(this.a).a.c(new mc0(this, tL_contact, exVar, 8));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G1, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.i3(new ug0(this, 0), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.w1) {
            this.w1 = false;
            return;
        }
        this.u1 = true;
        this.E1.setText(((ms) this.r1.get(i7)).c);
        this.u1 = false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.O1;
            org.telegram.ui.ActionBar.f2 f2Var = this.C1;
            if (radialProgressView != null && f2Var != null) {
                radialProgressView.setProgressColor(f2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
            }
            if (this.P1 != null && f2Var != null && ((themedColor = f2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.T1 || this.U1 != org.telegram.ui.ActionBar.k6.I.q())) {
                this.U1 = org.telegram.ui.ActionBar.k6.I.q();
                this.T1 = themedColor;
                org.telegram.ui.ActionBar.k6.H1(this.P1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.k6.H1(this.P1.getBackground(), org.telegram.ui.ActionBar.z5.b(themedColor), true);
                this.P1.invalidate();
            }
            ImageView imageView = this.H1;
            if (imageView == null || !(imageView.getDrawable() instanceof org.telegram.ui.Components.cp)) {
                return;
            }
            ((org.telegram.ui.Components.cp) this.H1.getDrawable()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m5, this.I0));
            this.H1.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        this.j1.getEditText().requestFocus();
        this.j1.getEditText().setSelection(this.j1.getEditText().length());
        org.telegram.messenger.g0.i3(new ug0(this, 1), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
