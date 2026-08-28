package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nj0 extends org.telegram.ui.ActionBar.f3 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int Z = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public boolean F;
    public String G;
    public String H;
    public final org.telegram.ui.ActionBar.o2 I;
    public final int J;
    public final kj0 K;
    public final View L;
    public final kj0 M;
    public final ImageView N;
    public final org.telegram.ui.Components.dp O;
    public final TextView P;
    public final LinearLayout Q;
    public int R;
    public final jj0 S;
    public final TextView T;
    public final RadialProgressView U;
    public final FrameLayout V;
    public final TextView W;
    public String X;
    public int Y;
    public final LinearLayout b;
    public final org.telegram.ui.Components.jq c;
    public final org.telegram.ui.Components.ec0 d;
    public final org.telegram.ui.Components.ec0 e;
    public final FrameLayout f;
    public final View h;
    public final kh.d n;
    public final org.telegram.ui.Components.ec0 r;
    public final org.telegram.ui.Components.fc0 s;
    public final org.telegram.ui.Components.l80 v;
    public final ArrayList w;
    public final HashMap x;
    public final HashMap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nj0(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, true);
        String str;
        String str2;
        int i9;
        lt ltVar;
        TelephonyManager telephonyManager;
        final int i10 = 1;
        this.w = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.Y = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.J = ConnectionsManager.generateClassGuid();
        this.I = o2Var;
        Context context2 = getContext();
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(context2, 1);
        this.c = jqVar;
        final int i11 = 4;
        jqVar.setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setOrientation(1);
        scrollView.addView(this.b, g7.e6.x(-1, -2, 51));
        this.b.setOnTouchListener(new jh.d(27));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b.addView(frameLayout, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context2);
        this.d = ec0Var;
        ec0Var.getEditText().setInputType(49152);
        this.d.getEditText().setImeOptions(5);
        this.d.setHint(LocaleController.getString(R.string.FirstName));
        if (this.G != null) {
            this.d.getEditText().setText(this.G);
            this.G = null;
        }
        frameLayout.addView(this.d, g7.e6.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 == 5) {
                            nj0 nj0Var = this.b;
                            nj0Var.K.requestFocus();
                            kj0 kj0Var = nj0Var.K;
                            kj0Var.setSelection(kj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        if (i13 != 5) {
                            nj0Var2.getClass();
                            break;
                        } else {
                            nj0Var2.e.requestFocus();
                            nj0Var2.e.getEditText().setSelection(nj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i13 == 5) {
                            nj0 nj0Var3 = this.b;
                            nj0Var3.K.requestFocus();
                            kj0 kj0Var2 = nj0Var3.K;
                            kj0Var2.setSelection(kj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i13 == 5) {
                            nj0 nj0Var4 = this.b;
                            nj0Var4.M.requestFocus();
                            kj0 kj0Var3 = nj0Var4.M;
                            kj0Var3.setSelection(kj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        nj0 nj0Var5 = this.b;
                        if (i13 != 5) {
                            nj0Var5.getClass();
                            break;
                        } else {
                            nj0Var5.V.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context2);
        this.e = ec0Var2;
        ec0Var2.setBackground(null);
        this.e.getEditText().setInputType(49152);
        this.e.getEditText().setImeOptions(5);
        this.e.setHint(LocaleController.getString(R.string.LastName));
        if (this.H != null) {
            this.e.getEditText().setText(this.H);
            this.H = null;
        }
        frameLayout.addView(this.e, g7.e6.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.e.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            nj0 nj0Var = this.b;
                            nj0Var.K.requestFocus();
                            kj0 kj0Var = nj0Var.K;
                            kj0Var.setSelection(kj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        if (i132 != 5) {
                            nj0Var2.getClass();
                            break;
                        } else {
                            nj0Var2.e.requestFocus();
                            nj0Var2.e.getEditText().setSelection(nj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            nj0 nj0Var3 = this.b;
                            nj0Var3.K.requestFocus();
                            kj0 kj0Var2 = nj0Var3.K;
                            kj0Var2.setSelection(kj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            nj0 nj0Var4 = this.b;
                            nj0Var4.M.requestFocus();
                            kj0 kj0Var3 = nj0Var4.M;
                            kj0Var3.setSelection(kj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        nj0 nj0Var5 = this.b;
                        if (i132 != 5) {
                            nj0Var5.getClass();
                            break;
                        } else {
                            nj0Var5.V.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context2, null);
        this.s = fc0Var;
        fc0Var.addView(linearLayout2, g7.e6.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.s.setText(LocaleController.getString(R.string.PhoneNumber));
        this.b.addView(this.s, g7.e6.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context2, null);
        this.v = l80Var;
        l80Var.setTextSize(1, 12.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        this.v.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.gc));
        this.b.addView(this.v, g7.e6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        jj0 jj0Var = new jj0(context2);
        this.S = jj0Var;
        jj0Var.setTextSize(1, 16.0f);
        this.S.setFocusable(false);
        this.S.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        nj0 nj0Var = this.b;
                        nj0Var.dismiss();
                        s9.d0(LaunchActivity.C1, 1, new mj0(nj0Var));
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = nj0Var2.I;
                        if (!nj0Var2.D && o2Var2 != null && o2Var2.getParentActivity() != null) {
                            if (nj0Var2.d.getEditText().length() != 0) {
                                if (nj0Var2.K.length() != 0) {
                                    if (nj0Var2.M.length() != 0) {
                                        if (!nj0Var2.O.a.q) {
                                            nj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.kd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new w3(nj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(nj0Var2.M);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(nj0Var2.K);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(nj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        nj0 nj0Var3 = this.b;
                        qtVar.r = new g(nj0Var3, 27);
                        nj0Var3.I.showAsSheet(qtVar);
                        break;
                    default:
                        nj0 nj0Var4 = this.b;
                        nj0Var4.O.a(!r0.a.q, true);
                        nj0Var4.x(true);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(6.0f);
        int i15 = org.telegram.ui.ActionBar.f6.i6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, w02, w02));
        frameLayout2.addView(this.S, g7.e6.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, g7.e6.n(42, -1));
        TextView textView = new TextView(context2);
        this.W = textView;
        textView.setText("+");
        this.W.setTextSize(1, 16.0f);
        this.W.setFocusable(false);
        linearLayout2.addView(this.W, g7.e6.n(-2, -2));
        kj0 kj0Var = new kj0(this, context2, 0);
        this.K = kj0Var;
        int i16 = org.telegram.ui.ActionBar.f6.G6;
        kj0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.K.setInputType(3);
        this.K.setCursorSize(AndroidUtilities.dp(20.0f));
        this.K.setCursorWidth(1.5f);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.K.setTextSize(1, 16.0f);
        this.K.setMaxLines(1);
        this.K.setGravity(19);
        this.K.setImeOptions(268435461);
        this.K.setBackground(null);
        this.K.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.K, g7.e6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.K.addTextChangedListener(new o0(this, 11));
        final int i17 = 3;
        this.K.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i132 == 5) {
                            nj0 nj0Var = this.b;
                            nj0Var.K.requestFocus();
                            kj0 kj0Var2 = nj0Var.K;
                            kj0Var2.setSelection(kj0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        if (i132 != 5) {
                            nj0Var2.getClass();
                            break;
                        } else {
                            nj0Var2.e.requestFocus();
                            nj0Var2.e.getEditText().setSelection(nj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            nj0 nj0Var3 = this.b;
                            nj0Var3.K.requestFocus();
                            kj0 kj0Var22 = nj0Var3.K;
                            kj0Var22.setSelection(kj0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            nj0 nj0Var4 = this.b;
                            nj0Var4.M.requestFocus();
                            kj0 kj0Var3 = nj0Var4.M;
                            kj0Var3.setSelection(kj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        nj0 nj0Var5 = this.b;
                        if (i132 != 5) {
                            nj0Var5.getClass();
                            break;
                        } else {
                            nj0Var5.V.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.L = new View(context2);
        LinearLayout.LayoutParams k10 = g7.e6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.L, k10);
        kj0 kj0Var2 = new kj0(this, context2, 1);
        this.M = kj0Var2;
        kj0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.M.setInputType(3);
        this.M.setPadding(0, 0, 0, 0);
        this.M.setCursorSize(AndroidUtilities.dp(20.0f));
        this.M.setCursorWidth(1.5f);
        this.M.setTextSize(1, 16.0f);
        this.M.setMaxLines(1);
        this.M.setGravity(19);
        this.M.setImeOptions(268435461);
        this.M.setBackground(null);
        this.M.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(this.M, g7.e6.n(-1, 36));
        this.M.addTextChangedListener(new rr(this, 2));
        this.M.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i132 == 5) {
                            nj0 nj0Var = this.b;
                            nj0Var.K.requestFocus();
                            kj0 kj0Var22 = nj0Var.K;
                            kj0Var22.setSelection(kj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        if (i132 != 5) {
                            nj0Var2.getClass();
                            break;
                        } else {
                            nj0Var2.e.requestFocus();
                            nj0Var2.e.getEditText().setSelection(nj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            nj0 nj0Var3 = this.b;
                            nj0Var3.K.requestFocus();
                            kj0 kj0Var222 = nj0Var3.K;
                            kj0Var222.setSelection(kj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            nj0 nj0Var4 = this.b;
                            nj0Var4.M.requestFocus();
                            kj0 kj0Var3 = nj0Var4.M;
                            kj0Var3.setSelection(kj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        nj0 nj0Var5 = this.b;
                        if (i132 != 5) {
                            nj0Var5.getClass();
                            break;
                        } else {
                            nj0Var5.V.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.N = imageView;
        imageView.setScaleX(0.5f);
        this.N.setScaleY(0.5f);
        this.N.setAlpha(0.0f);
        this.s.addView(this.N, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context2, 21, this.resourcesProvider);
        this.O = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.h7, org.telegram.ui.ActionBar.f6.j7, org.telegram.ui.ActionBar.f6.k7);
        this.O.setDrawUnchecked(true);
        this.O.a(false, false);
        this.O.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.P = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i16, this.resourcesProvider));
        this.P.setTextSize(1, 14.0f);
        this.P.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.Q = linearLayout3;
        linearLayout3.setOrientation(0);
        this.Q.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.Q.addView(this.O, g7.e6.t(21, 21, 16, 0, 0, 9, 0));
        this.Q.addView(this.P, g7.e6.q(-2, -2, 16));
        final int i18 = 3;
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        nj0 nj0Var = this.b;
                        nj0Var.dismiss();
                        s9.d0(LaunchActivity.C1, 1, new mj0(nj0Var));
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = nj0Var2.I;
                        if (!nj0Var2.D && o2Var2 != null && o2Var2.getParentActivity() != null) {
                            if (nj0Var2.d.getEditText().length() != 0) {
                                if (nj0Var2.K.length() != 0) {
                                    if (nj0Var2.M.length() != 0) {
                                        if (!nj0Var2.O.a.q) {
                                            nj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.kd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new w3(nj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(nj0Var2.M);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(nj0Var2.K);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(nj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        nj0 nj0Var3 = this.b;
                        qtVar.r = new g(nj0Var3, 27);
                        nj0Var3.I.showAsSheet(qtVar);
                        break;
                    default:
                        nj0 nj0Var4 = this.b;
                        nj0Var4.O.a(!r0.a.q, true);
                        nj0Var4.x(true);
                        break;
                }
            }
        });
        this.Q.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.Q.setPivotX(0.0f);
        g7.g6.b(this.Q, 0.0125f, 1.2f);
        this.Q.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i15, this.resourcesProvider), 6, 6));
        this.b.addView(this.Q, g7.e6.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.b.addView(this.f, g7.e6.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.h = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourcesProvider));
        this.f.addView(this.h, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        kh.d dVar = new kh.d(context2, this.resourcesProvider, false);
        this.n = dVar;
        dVar.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.n.g(spannableStringBuilder, false, true);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        nj0 nj0Var = this.b;
                        nj0Var.dismiss();
                        s9.d0(LaunchActivity.C1, 1, new mj0(nj0Var));
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = nj0Var2.I;
                        if (!nj0Var2.D && o2Var2 != null && o2Var2.getParentActivity() != null) {
                            if (nj0Var2.d.getEditText().length() != 0) {
                                if (nj0Var2.K.length() != 0) {
                                    if (nj0Var2.M.length() != 0) {
                                        if (!nj0Var2.O.a.q) {
                                            nj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.kd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new w3(nj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(nj0Var2.M);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(nj0Var2.K);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) o2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(nj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        nj0 nj0Var3 = this.b;
                        qtVar.r = new g(nj0Var3, 27);
                        nj0Var3.I.showAsSheet(qtVar);
                        break;
                    default:
                        nj0 nj0Var4 = this.b;
                        nj0Var4.O.a(!r0.a.q, true);
                        nj0Var4.x(true);
                        break;
                }
            }
        });
        this.f.addView(this.n, g7.e6.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ec0 ec0Var3 = new org.telegram.ui.Components.ec0(context2);
        this.r = ec0Var3;
        ec0Var3.setBackground(null);
        this.r.getEditText().setInputType(49152);
        this.r.getEditText().setImeOptions(5);
        this.r.setHint("Notes");
        this.f.addView(this.r, g7.e6.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.r.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i132 == 5) {
                            nj0 nj0Var = this.b;
                            nj0Var.K.requestFocus();
                            kj0 kj0Var22 = nj0Var.K;
                            kj0Var22.setSelection(kj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        if (i132 != 5) {
                            nj0Var2.getClass();
                            break;
                        } else {
                            nj0Var2.e.requestFocus();
                            nj0Var2.e.getEditText().setSelection(nj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            nj0 nj0Var3 = this.b;
                            nj0Var3.K.requestFocus();
                            kj0 kj0Var222 = nj0Var3.K;
                            kj0Var222.setSelection(kj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            nj0 nj0Var4 = this.b;
                            nj0Var4.M.requestFocus();
                            kj0 kj0Var3 = nj0Var4.M;
                            kj0Var3.setSelection(kj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        nj0 nj0Var5 = this.b;
                        if (i132 != 5) {
                            nj0Var5.getClass();
                            break;
                        } else {
                            nj0Var5.V.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        x(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                lt ltVar2 = new lt();
                ltVar2.a = split[2];
                ltVar2.c = split[0];
                ltVar2.d = split[1];
                this.w.add(0, ltVar2);
                List list = (List) this.x.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.x;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(ltVar2);
                if (split.length > 3) {
                    this.y.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Collections.sort(this.w, Comparator$-CC.comparing(new k8(7)));
        if (TextUtils.isEmpty(this.E)) {
            try {
                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i9 = 0;
                    while (true) {
                        if (i9 < this.w.size()) {
                            ltVar = null;
                            break;
                        } else {
                            if (Objects.equals(((lt) this.w.get(i9)).a, str2)) {
                                ltVar = (lt) this.w.get(i9);
                                break;
                            }
                            i9++;
                        }
                    }
                    if (ltVar != null) {
                        this.K.setText(ltVar.c);
                    }
                }
                if (this.K.length() == 0) {
                    this.M.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i9 = 0;
                while (true) {
                    if (i9 < this.w.size()) {
                    }
                    i9++;
                }
                if (ltVar != null) {
                }
            }
            if (this.K.length() == 0) {
            }
        } else {
            TLRPC.User currentUser = this.I.getUserConfig().getCurrentUser();
            if (this.E.startsWith("+")) {
                this.K.setText(this.E.substring(1));
            } else if (this.F || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.K.setText(this.E);
            } else {
                String str4 = currentUser.phone;
                while (true) {
                    if (i11 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i11);
                    if (((List) this.x.get(substring)) != null) {
                        this.K.setText(substring);
                        break;
                    }
                    i11--;
                }
                this.M.setText(this.E);
            }
            this.E = null;
        }
        this.V = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.T = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.T.setGravity(17);
        this.T.setLines(1);
        this.T.setSingleLine(true);
        this.T.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.T;
        org.telegram.ui.ActionBar.o2 o2Var2 = this.I;
        int i19 = org.telegram.ui.ActionBar.f6.Sh;
        textView4.setTextColor(o2Var2.getThemedColor(i19));
        this.T.setTextSize(1, 15.0f);
        this.T.setTypeface(AndroidUtilities.bold());
        g7.g6.b(this.V, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.U = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.U.setProgressColor(this.I.getThemedColor(i19));
        this.V.addView(this.T, g7.e6.c(-1.0f, -1));
        this.V.addView(this.U, g7.e6.e(40, 40, 17));
        this.b.addView(this.V, g7.e6.t(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.T, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.U, false, 1.0f, false);
        this.V.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, this.I.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
        this.V.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gj0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        nj0 nj0Var = this.b;
                        nj0Var.dismiss();
                        s9.d0(LaunchActivity.C1, 1, new mj0(nj0Var));
                        break;
                    case 1:
                        nj0 nj0Var2 = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var22 = nj0Var2.I;
                        if (!nj0Var2.D && o2Var22 != null && o2Var22.getParentActivity() != null) {
                            if (nj0Var2.d.getEditText().length() != 0) {
                                if (nj0Var2.K.length() != 0) {
                                    if (nj0Var2.M.length() != 0) {
                                        if (!nj0Var2.O.a.q) {
                                            nj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.kd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new w3(nj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) o2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(nj0Var2.M);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) o2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(nj0Var2.K);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) o2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(nj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        nj0 nj0Var3 = this.b;
                        qtVar.r = new g(nj0Var3, 27);
                        nj0Var3.I.showAsSheet(qtVar);
                        break;
                    default:
                        nj0 nj0Var4 = this.b;
                        nj0Var4.O.a(!r0.a.q, true);
                        nj0Var4.x(true);
                        break;
                }
            }
        });
        this.W.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.L.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k6, false));
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static /* synthetic */ void m(nj0 nj0Var, TLObject tLObject, eb0 eb0Var) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(nj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(nj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(nj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                eb0Var.run(user);
            }
        }
        user = null;
        eb0Var.run(user);
    }

    public static void n(nj0 nj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.o2 o2Var = nj0Var.I;
        nj0Var.D = false;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(nj0Var.T, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(nj0Var.U, false, 0.5f, true);
            org.telegram.ui.Components.y4.f0(nj0Var.currentAccount, tL_error, o2Var, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(nj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(nj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, nj0Var.I, 1, false);
            nj0Var.dismiss();
        } else {
            if (o2Var.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(nj0Var.T, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(nj0Var.U, false, 0.5f, true);
            org.telegram.ui.Components.y4.v(o2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public static void q(nj0 nj0Var) {
        String replaceAll = (nj0Var.K.getText().toString() + nj0Var.M.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) nj0Var.x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) nj0Var.y.get(substring);
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
            if (TextUtils.equals(nj0Var.X, replaceAll)) {
                return;
            }
            nj0Var.X = replaceAll;
            nj0Var.y(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(nj0Var.X)) {
            return;
        }
        nj0Var.X = null;
        nj0Var.y(null);
    }

    public static String s(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
            FileLog.e(e10);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i9 = 4; i9 >= 1; i9--) {
                String substring = str2.substring(0, i9);
                if (((String) hashMap.get(substring)) != null) {
                    return aa.d.o("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new fj0(this, 0), 50L);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, TLObject.FLAG_23, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, TLObject.FLAG_23, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, TLObject.FLAG_23, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.E7));
        return arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j10) {
        if (this.C) {
            this.C = false;
            return;
        }
        this.A = true;
        this.K.setText(((lt) this.w.get(i9)).c);
        this.A = false;
    }

    public final void r() {
        this.D = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.T, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.U, true, 0.5f, true);
        String str = "+" + this.K.getText().toString() + this.M.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.e.getEditText().getText().toString();
        String obj3 = this.r.getVisibility() == 0 ? this.r.getEditText().getText().toString() : "";
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new y9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.J);
        if (this.O.a.q) {
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new fj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.S.animate();
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            animate.setInterpolator(grVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.W.animate().setInterpolator(grVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.K.animate().setInterpolator(grVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.S.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.W.animate();
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
        animate2.setInterpolator(grVar2).translationX(0.0f).setDuration(150L);
        this.K.animate().setInterpolator(grVar2).translationX(0.0f).setDuration(150L);
        this.S.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str, lt ltVar) {
        int i9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        int i10 = 0;
        t(Emoji.replaceEmoji(spannableStringBuilder, this.S.getPaint().getFontMetricsInt(), false));
        this.R = -1;
        String replace = this.M.getText() != null ? this.M.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.y;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.R != -1) {
                int selectionStart = this.M.getSelectionStart();
                int selectionEnd = this.M.getSelectionEnd();
                this.M.setHintText((String) null);
                this.M.setSelection(selectionStart, selectionEnd);
                this.R = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i9 = 0;
            while (i9 < list.size()) {
                if (replace.startsWith(((String) list.get(i9)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        i9 = -1;
        if (i9 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i9 = i11;
                    break;
                }
            }
        }
        i10 = i9;
        if (this.R != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = this.M.getSelectionStart();
            int selectionEnd2 = this.M.getSelectionEnd();
            this.M.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.M.setSelection(selectionStart2, selectionEnd2);
            this.R = i10;
        }
    }

    public final void v(String str, boolean z10) {
        this.E = str;
        this.F = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.E.startsWith("+")) {
            this.K.setText(this.E.substring(1));
        } else if (this.F || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.K.setText(this.E);
        } else {
            String str2 = currentUser.phone;
            int i9 = 4;
            while (true) {
                if (i9 >= 1) {
                    List list = (List) this.x.get(str2.substring(0, i9));
                    if (list == null || list.size() <= 0) {
                        i9--;
                    } else {
                        String str3 = ((lt) list.get(0)).c;
                        this.K.setText(str3);
                        if (str3.endsWith("0") && this.E.startsWith("0")) {
                            this.E = this.E.substring(1);
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 23) {
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.K.setText(upperCase);
                    if (upperCase.endsWith("0") && this.E.startsWith("0")) {
                        this.E = this.E.substring(1);
                    }
                }
            }
            this.M.setText(this.E);
        }
        this.E = null;
    }

    public final void w(boolean z10) {
        ViewPropertyAnimator translationY = this.Q.animate().translationY(z10 ? -AndroidUtilities.dp(21.33f) : 0.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.ll.r(translationY, grVar, 420L);
        this.f.animate().translationY(z10 ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(grVar).setDuration(420L).start();
    }

    public final void x(boolean z10) {
        boolean z11 = this.O.a.q;
        final boolean z12 = !z11;
        if (!z10) {
            this.n.animate().cancel();
            this.n.setVisibility(!z11 ? 0 : 4);
            this.n.setAlpha(!z11 ? 1.0f : 0.0f);
            this.h.animate().cancel();
            this.h.setVisibility(!z11 ? 0 : 8);
            this.h.setAlpha(!z11 ? 1.0f : 0.0f);
            this.r.animate().cancel();
            this.r.setVisibility(z11 ? 0 : 4);
            this.r.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        this.n.setVisibility(0);
        ViewPropertyAnimator alpha = this.n.animate().alpha(!z11 ? 1.0f : 0.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        final int i9 = 0;
        alpha.setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ij0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        boolean z13 = z12;
                        nj0 nj0Var = this.b;
                        if (!z13) {
                            nj0Var.n.setVisibility(4);
                            break;
                        } else {
                            nj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        nj0 nj0Var2 = this.b;
                        if (!z14) {
                            nj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            nj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        nj0 nj0Var3 = this.b;
                        if (!z15) {
                            nj0Var3.getClass();
                            break;
                        } else {
                            nj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.h.setVisibility(0);
        final int i10 = 1;
        this.h.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ij0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        nj0 nj0Var = this.b;
                        if (!z13) {
                            nj0Var.n.setVisibility(4);
                            break;
                        } else {
                            nj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        nj0 nj0Var2 = this.b;
                        if (!z14) {
                            nj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            nj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        nj0 nj0Var3 = this.b;
                        if (!z15) {
                            nj0Var3.getClass();
                            break;
                        } else {
                            nj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.r.setVisibility(0);
        final int i11 = 2;
        this.r.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ij0
            public final /* synthetic */ nj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        nj0 nj0Var = this.b;
                        if (!z13) {
                            nj0Var.n.setVisibility(4);
                            break;
                        } else {
                            nj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        nj0 nj0Var2 = this.b;
                        if (!z14) {
                            nj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            nj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        nj0 nj0Var3 = this.b;
                        if (!z15) {
                            nj0Var3.getClass();
                            break;
                        } else {
                            nj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void y(String str) {
        if (this.Y >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            this.Y = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.ll.r(this.N.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.gr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        org.telegram.messenger.ll.r(this.N.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.gr.h, 420L);
        this.N.setImageDrawable(new org.telegram.ui.Components.jp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.f6.m5)));
        this.v.setText("");
        w(true);
        eb0 eb0Var = new eb0(3, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(ne.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = ne.b.d(str, false);
            this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new v40(13, this, eb0Var));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                eb0Var.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ye0((Object) this, (Object) tL_contact, (Object) eb0Var, 6));
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
