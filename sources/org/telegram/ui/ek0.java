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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ek0 extends org.telegram.ui.ActionBar.f3 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int d0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public boolean J;
    public String K;
    public String L;
    public final org.telegram.ui.ActionBar.n2 M;
    public final int N;
    public final ck0 O;
    public final View P;
    public final ck0 Q;
    public final ImageView R;
    public final org.telegram.ui.Components.mp S;
    public final TextView T;
    public final LinearLayout U;
    public int V;
    public final bk0 W;
    public final TextView X;
    public final RadialProgressView Y;
    public final FrameLayout Z;
    public final TextView a0;
    public final LinearLayout b;
    public String b0;
    public final org.telegram.ui.Components.sq c;
    public int c0;
    public final org.telegram.ui.Components.yc0 d;
    public final org.telegram.ui.Components.yc0 e;
    public final FrameLayout f;
    public final View h;
    public final di.d n;
    public final org.telegram.ui.Components.yc0 r;
    public final org.telegram.ui.Components.zc0 s;
    public final org.telegram.ui.Components.d90 v;
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
    public ek0(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, true);
        String str;
        String str2;
        int i10;
        vt vtVar;
        TelephonyManager telephonyManager;
        final int i11 = 1;
        this.w = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.c0 = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.N = ConnectionsManager.generateClassGuid();
        this.M = n2Var;
        Context context2 = getContext();
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(context2, 1);
        this.c = sqVar;
        final int i12 = 4;
        sqVar.setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        final int i13 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setOrientation(1);
        scrollView.addView(this.b, w7.x5.x(-1, -2, 51));
        this.b.setOnTouchListener(new ci.d(27));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b.addView(frameLayout, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context2);
        this.d = yc0Var;
        yc0Var.getEditText().setInputType(49152);
        this.d.getEditText().setImeOptions(5);
        this.d.setHint(LocaleController.getString(R.string.FirstName));
        if (this.K != null) {
            this.d.getEditText().setText(this.K);
            this.K = null;
        }
        frameLayout.addView(this.d, w7.x5.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i14 == 5) {
                            ek0 ek0Var = this.b;
                            ek0Var.O.requestFocus();
                            ck0 ck0Var = ek0Var.O;
                            ck0Var.setSelection(ck0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        if (i14 != 5) {
                            ek0Var2.getClass();
                            break;
                        } else {
                            ek0Var2.e.requestFocus();
                            ek0Var2.e.getEditText().setSelection(ek0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i14 == 5) {
                            ek0 ek0Var3 = this.b;
                            ek0Var3.O.requestFocus();
                            ck0 ck0Var2 = ek0Var3.O;
                            ck0Var2.setSelection(ck0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i14 == 5) {
                            ek0 ek0Var4 = this.b;
                            ek0Var4.Q.requestFocus();
                            ck0 ck0Var3 = ek0Var4.Q;
                            ck0Var3.setSelection(ck0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ek0 ek0Var5 = this.b;
                        if (i14 != 5) {
                            ek0Var5.getClass();
                            break;
                        } else {
                            ek0Var5.Z.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(context2);
        this.e = yc0Var2;
        yc0Var2.setBackground(null);
        this.e.getEditText().setInputType(49152);
        this.e.getEditText().setImeOptions(5);
        this.e.setHint(LocaleController.getString(R.string.LastName));
        if (this.L != null) {
            this.e.getEditText().setText(this.L);
            this.L = null;
        }
        frameLayout.addView(this.e, w7.x5.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i14 = 2;
        this.e.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i142, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i142 == 5) {
                            ek0 ek0Var = this.b;
                            ek0Var.O.requestFocus();
                            ck0 ck0Var = ek0Var.O;
                            ck0Var.setSelection(ck0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        if (i142 != 5) {
                            ek0Var2.getClass();
                            break;
                        } else {
                            ek0Var2.e.requestFocus();
                            ek0Var2.e.getEditText().setSelection(ek0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            ek0 ek0Var3 = this.b;
                            ek0Var3.O.requestFocus();
                            ck0 ck0Var2 = ek0Var3.O;
                            ck0Var2.setSelection(ck0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            ek0 ek0Var4 = this.b;
                            ek0Var4.Q.requestFocus();
                            ck0 ck0Var3 = ek0Var4.Q;
                            ck0Var3.setSelection(ck0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ek0 ek0Var5 = this.b;
                        if (i142 != 5) {
                            ek0Var5.getClass();
                            break;
                        } else {
                            ek0Var5.Z.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context2, null);
        this.s = zc0Var;
        zc0Var.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.s.setText(LocaleController.getString(R.string.PhoneNumber));
        this.b.addView(this.s, w7.x5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context2, null);
        this.v = d90Var;
        d90Var.setTextSize(1, 12.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.v.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        this.b.addView(this.v, w7.x5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        bk0 bk0Var = new bk0(context2);
        this.W = bk0Var;
        bk0Var.setTextSize(1, 16.0f);
        this.W.setFocusable(false);
        this.W.setGravity(17);
        final int i15 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        ek0 ek0Var = this.b;
                        ek0Var.dismiss();
                        u9.e0(LaunchActivity.G1, 1, new dk0(ek0Var));
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = ek0Var2.M;
                        if (!ek0Var2.H && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (ek0Var2.d.getEditText().length() != 0) {
                                if (ek0Var2.O.length() != 0) {
                                    if (ek0Var2.Q.length() != 0) {
                                        if (!ek0Var2.S.a.q) {
                                            ek0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.de0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(ek0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(ek0Var2.Q);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(ek0Var2.O);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(ek0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        bu buVar = new bu(null, true);
                        ek0 ek0Var3 = this.b;
                        buVar.r = new g(ek0Var3, 27);
                        ek0Var3.M.showAsSheet(buVar);
                        break;
                    default:
                        ek0 ek0Var4 = this.b;
                        ek0Var4.S.a(!r0.a.q, true);
                        ek0Var4.x(true);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(6.0f);
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        frameLayout2.addView(this.W, w7.x5.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, w7.x5.n(42, -1));
        TextView textView = new TextView(context2);
        this.a0 = textView;
        textView.setText("+");
        this.a0.setTextSize(1, 16.0f);
        this.a0.setFocusable(false);
        linearLayout2.addView(this.a0, w7.x5.n(-2, -2));
        ck0 ck0Var = new ck0(this, context2, 0);
        this.O = ck0Var;
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        ck0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.O.setInputType(3);
        this.O.setCursorSize(AndroidUtilities.dp(20.0f));
        this.O.setCursorWidth(1.5f);
        this.O.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.O.setTextSize(1, 16.0f);
        this.O.setMaxLines(1);
        this.O.setGravity(19);
        this.O.setImeOptions(268435461);
        this.O.setBackground(null);
        this.O.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.O, w7.x5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.O.addTextChangedListener(new l0(this, 11));
        final int i18 = 3;
        this.O.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i18) {
                    case 0:
                        if (i142 == 5) {
                            ek0 ek0Var = this.b;
                            ek0Var.O.requestFocus();
                            ck0 ck0Var2 = ek0Var.O;
                            ck0Var2.setSelection(ck0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        if (i142 != 5) {
                            ek0Var2.getClass();
                            break;
                        } else {
                            ek0Var2.e.requestFocus();
                            ek0Var2.e.getEditText().setSelection(ek0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            ek0 ek0Var3 = this.b;
                            ek0Var3.O.requestFocus();
                            ck0 ck0Var22 = ek0Var3.O;
                            ck0Var22.setSelection(ck0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            ek0 ek0Var4 = this.b;
                            ek0Var4.Q.requestFocus();
                            ck0 ck0Var3 = ek0Var4.Q;
                            ck0Var3.setSelection(ck0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ek0 ek0Var5 = this.b;
                        if (i142 != 5) {
                            ek0Var5.getClass();
                            break;
                        } else {
                            ek0Var5.Z.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.P = new View(context2);
        LinearLayout.LayoutParams k10 = w7.x5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.P, k10);
        ck0 ck0Var2 = new ck0(this, context2, 1);
        this.Q = ck0Var2;
        ck0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.Q.setInputType(3);
        this.Q.setPadding(0, 0, 0, 0);
        this.Q.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Q.setCursorWidth(1.5f);
        this.Q.setTextSize(1, 16.0f);
        this.Q.setMaxLines(1);
        this.Q.setGravity(19);
        this.Q.setImeOptions(268435461);
        this.Q.setBackground(null);
        this.Q.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(this.Q, w7.x5.n(-1, 36));
        this.Q.addTextChangedListener(new ds(this, 2));
        this.Q.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i142 == 5) {
                            ek0 ek0Var = this.b;
                            ek0Var.O.requestFocus();
                            ck0 ck0Var22 = ek0Var.O;
                            ck0Var22.setSelection(ck0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        if (i142 != 5) {
                            ek0Var2.getClass();
                            break;
                        } else {
                            ek0Var2.e.requestFocus();
                            ek0Var2.e.getEditText().setSelection(ek0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            ek0 ek0Var3 = this.b;
                            ek0Var3.O.requestFocus();
                            ck0 ck0Var222 = ek0Var3.O;
                            ck0Var222.setSelection(ck0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            ek0 ek0Var4 = this.b;
                            ek0Var4.Q.requestFocus();
                            ck0 ck0Var3 = ek0Var4.Q;
                            ck0Var3.setSelection(ck0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ek0 ek0Var5 = this.b;
                        if (i142 != 5) {
                            ek0Var5.getClass();
                            break;
                        } else {
                            ek0Var5.Z.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.R = imageView;
        imageView.setScaleX(0.5f);
        this.R.setScaleY(0.5f);
        this.R.setAlpha(0.0f);
        this.s.addView(this.R, w7.x5.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context2, 21, this.resourcesProvider);
        this.S = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        this.S.setDrawUnchecked(true);
        this.S.a(false, false);
        this.S.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.T = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, this.resourcesProvider));
        this.T.setTextSize(1, 14.0f);
        this.T.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.U = linearLayout3;
        linearLayout3.setOrientation(0);
        this.U.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.S, w7.x5.t(21, 21, 16, 0, 0, 9, 0));
        this.U.addView(this.T, w7.x5.q(-2, -2, 16));
        final int i19 = 3;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        ek0 ek0Var = this.b;
                        ek0Var.dismiss();
                        u9.e0(LaunchActivity.G1, 1, new dk0(ek0Var));
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = ek0Var2.M;
                        if (!ek0Var2.H && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (ek0Var2.d.getEditText().length() != 0) {
                                if (ek0Var2.O.length() != 0) {
                                    if (ek0Var2.Q.length() != 0) {
                                        if (!ek0Var2.S.a.q) {
                                            ek0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.de0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(ek0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(ek0Var2.Q);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(ek0Var2.O);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(ek0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        bu buVar = new bu(null, true);
                        ek0 ek0Var3 = this.b;
                        buVar.r = new g(ek0Var3, 27);
                        ek0Var3.M.showAsSheet(buVar);
                        break;
                    default:
                        ek0 ek0Var4 = this.b;
                        ek0Var4.S.a(!r0.a.q, true);
                        ek0Var4.x(true);
                        break;
                }
            }
        });
        this.U.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.U.setPivotX(0.0f);
        w7.z5.b(this.U, 0.0125f, 1.2f);
        this.U.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i16, this.resourcesProvider), 6, 6));
        this.b.addView(this.U, w7.x5.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.b.addView(this.f, w7.x5.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.h = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourcesProvider));
        this.f.addView(this.h, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        di.d dVar = new di.d(context2, this.resourcesProvider, false);
        this.n = dVar;
        dVar.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.n.g(spannableStringBuilder, false, true);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ek0 ek0Var = this.b;
                        ek0Var.dismiss();
                        u9.e0(LaunchActivity.G1, 1, new dk0(ek0Var));
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = ek0Var2.M;
                        if (!ek0Var2.H && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (ek0Var2.d.getEditText().length() != 0) {
                                if (ek0Var2.O.length() != 0) {
                                    if (ek0Var2.Q.length() != 0) {
                                        if (!ek0Var2.S.a.q) {
                                            ek0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.de0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(ek0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(ek0Var2.Q);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(ek0Var2.O);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(ek0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        bu buVar = new bu(null, true);
                        ek0 ek0Var3 = this.b;
                        buVar.r = new g(ek0Var3, 27);
                        ek0Var3.M.showAsSheet(buVar);
                        break;
                    default:
                        ek0 ek0Var4 = this.b;
                        ek0Var4.S.a(!r0.a.q, true);
                        ek0Var4.x(true);
                        break;
                }
            }
        });
        this.f.addView(this.n, w7.x5.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.yc0 yc0Var3 = new org.telegram.ui.Components.yc0(context2);
        this.r = yc0Var3;
        yc0Var3.setBackground(null);
        this.r.getEditText().setInputType(49152);
        this.r.getEditText().setImeOptions(5);
        this.r.setHint("Notes");
        this.f.addView(this.r, w7.x5.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.r.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i142, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i142 == 5) {
                            ek0 ek0Var = this.b;
                            ek0Var.O.requestFocus();
                            ck0 ck0Var22 = ek0Var.O;
                            ck0Var22.setSelection(ck0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        if (i142 != 5) {
                            ek0Var2.getClass();
                            break;
                        } else {
                            ek0Var2.e.requestFocus();
                            ek0Var2.e.getEditText().setSelection(ek0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            ek0 ek0Var3 = this.b;
                            ek0Var3.O.requestFocus();
                            ck0 ck0Var222 = ek0Var3.O;
                            ck0Var222.setSelection(ck0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            ek0 ek0Var4 = this.b;
                            ek0Var4.Q.requestFocus();
                            ck0 ck0Var3 = ek0Var4.Q;
                            ck0Var3.setSelection(ck0Var3.length());
                            break;
                        }
                        break;
                    default:
                        ek0 ek0Var5 = this.b;
                        if (i142 != 5) {
                            ek0Var5.getClass();
                            break;
                        } else {
                            ek0Var5.Z.callOnClick();
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
                vt vtVar2 = new vt();
                vtVar2.a = split[2];
                vtVar2.c = split[0];
                vtVar2.d = split[1];
                this.w.add(0, vtVar2);
                List list = (List) this.x.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.x;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(vtVar2);
                if (split.length > 3) {
                    this.y.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        Collections.sort(this.w, Comparator$-CC.comparing(new l8(7)));
        if (TextUtils.isEmpty(this.I)) {
            try {
                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i10 = 0;
                    while (true) {
                        if (i10 < this.w.size()) {
                            vtVar = null;
                            break;
                        } else {
                            if (Objects.equals(((vt) this.w.get(i10)).a, str2)) {
                                vtVar = (vt) this.w.get(i10);
                                break;
                            }
                            i10++;
                        }
                    }
                    if (vtVar != null) {
                        this.O.setText(vtVar.c);
                    }
                }
                if (this.O.length() == 0) {
                    this.Q.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i10 = 0;
                while (true) {
                    if (i10 < this.w.size()) {
                    }
                    i10++;
                }
                if (vtVar != null) {
                }
            }
            if (this.O.length() == 0) {
            }
        } else {
            TLRPC.User currentUser = this.M.getUserConfig().getCurrentUser();
            if (this.I.startsWith("+")) {
                this.O.setText(this.I.substring(1));
            } else if (this.J || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.O.setText(this.I);
            } else {
                String str4 = currentUser.phone;
                while (true) {
                    if (i12 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i12);
                    if (((List) this.x.get(substring)) != null) {
                        this.O.setText(substring);
                        break;
                    }
                    i12--;
                }
                this.Q.setText(this.I);
            }
            this.I = null;
        }
        this.Z = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.X = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.X.setGravity(17);
        this.X.setLines(1);
        this.X.setSingleLine(true);
        this.X.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.X;
        org.telegram.ui.ActionBar.n2 n2Var2 = this.M;
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        textView4.setTextColor(n2Var2.getThemedColor(i20));
        this.X.setTextSize(1, 15.0f);
        this.X.setTypeface(AndroidUtilities.bold());
        w7.z5.b(this.Z, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.Y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.Y.setProgressColor(this.M.getThemedColor(i20));
        this.Z.addView(this.X, w7.x5.c(-1.0f, -1));
        this.Z.addView(this.Y, w7.x5.e(40, 40, 17));
        this.b.addView(this.Z, w7.x5.t(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.X, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.Y, false, 1.0f, false);
        this.Z.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, this.M.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        ek0 ek0Var = this.b;
                        ek0Var.dismiss();
                        u9.e0(LaunchActivity.G1, 1, new dk0(ek0Var));
                        break;
                    case 1:
                        ek0 ek0Var2 = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var22 = ek0Var2.M;
                        if (!ek0Var2.H && n2Var22 != null && n2Var22.getParentActivity() != null) {
                            if (ek0Var2.d.getEditText().length() != 0) {
                                if (ek0Var2.O.length() != 0) {
                                    if (ek0Var2.Q.length() != 0) {
                                        if (!ek0Var2.S.a.q) {
                                            ek0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.de0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(ek0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) n2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(ek0Var2.Q);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) n2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(ek0Var2.O);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) n2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(ek0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        bu buVar = new bu(null, true);
                        ek0 ek0Var3 = this.b;
                        buVar.r = new g(ek0Var3, 27);
                        ek0Var3.M.showAsSheet(buVar);
                        break;
                    default:
                        ek0 ek0Var4 = this.b;
                        ek0Var4.S.a(!r0.a.q, true);
                        ek0Var4.x(true);
                        break;
                }
            }
        });
        this.a0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.P.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false));
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static /* synthetic */ void m(ek0 ek0Var, TLObject tLObject, oj0 oj0Var) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(ek0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(ek0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(ek0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                oj0Var.run(user);
            }
        }
        user = null;
        oj0Var.run(user);
    }

    public static void n(ek0 ek0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.n2 n2Var = ek0Var.M;
        ek0Var.H = false;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(ek0Var.X, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ek0Var.Y, false, 0.5f, true);
            org.telegram.ui.Components.e5.f0(ek0Var.currentAccount, tL_error, n2Var, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(ek0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(ek0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, ek0Var.M, 1, false);
            ek0Var.dismiss();
        } else {
            if (n2Var.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(ek0Var.X, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ek0Var.Y, false, 0.5f, true);
            org.telegram.ui.Components.e5.v(n2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public static void q(ek0 ek0Var) {
        String replaceAll = (ek0Var.O.getText().toString() + ek0Var.Q.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) ek0Var.x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) ek0Var.y.get(substring);
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
            if (TextUtils.equals(ek0Var.b0, replaceAll)) {
                return;
            }
            ek0Var.b0 = replaceAll;
            ek0Var.y(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(ek0Var.b0)) {
            return;
        }
        ek0Var.b0 = null;
        ek0Var.y(null);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i10 = 4; i10 >= 1; i10--) {
                String substring = str2.substring(0, i10);
                if (((String) hashMap.get(substring)) != null) {
                    return a4.a.p("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new xj0(this, 0), 50L);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, TLObject.FLAG_23, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E7));
        return arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        if (this.G) {
            this.G = false;
            return;
        }
        this.E = true;
        this.O.setText(((vt) this.w.get(i10)).c);
        this.E = false;
    }

    public final void r() {
        this.H = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.X, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.Y, true, 0.5f, true);
        String str = "+" + this.O.getText().toString() + this.Q.getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new aa(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.N);
        if (this.S.a.q) {
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
            } catch (OperationApplicationException | RemoteException e7) {
                e7.printStackTrace();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new xj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.W.animate();
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
            animate.setInterpolator(prVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.a0.animate().setInterpolator(prVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.O.animate().setInterpolator(prVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.W.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.a0.animate();
        org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
        animate2.setInterpolator(prVar2).translationX(0.0f).setDuration(150L);
        this.O.animate().setInterpolator(prVar2).translationX(0.0f).setDuration(150L);
        this.W.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str, vt vtVar) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(vtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        int i11 = 0;
        t(Emoji.replaceEmoji(spannableStringBuilder, this.W.getPaint().getFontMetricsInt(), false));
        this.V = -1;
        String replace = this.Q.getText() != null ? this.Q.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.y;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.V != -1) {
                int selectionStart = this.Q.getSelectionStart();
                int selectionEnd = this.Q.getSelectionEnd();
                this.Q.setHintText((String) null);
                this.Q.setSelection(selectionStart, selectionEnd);
                this.V = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i10 = 0;
            while (i10 < list.size()) {
                if (replace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                String str2 = (String) list.get(i12);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i12;
                    break;
                }
            }
        }
        i11 = i10;
        if (this.V != i11) {
            String str3 = (String) ((List) hashMap.get(str)).get(i11);
            int selectionStart2 = this.Q.getSelectionStart();
            int selectionEnd2 = this.Q.getSelectionEnd();
            this.Q.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.Q.setSelection(selectionStart2, selectionEnd2);
            this.V = i11;
        }
    }

    public final void v(String str, boolean z10) {
        this.I = str;
        this.J = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.I.startsWith("+")) {
            this.O.setText(this.I.substring(1));
        } else if (this.J || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.O.setText(this.I);
        } else {
            String str2 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 >= 1) {
                    List list = (List) this.x.get(str2.substring(0, i10));
                    if (list == null || list.size() <= 0) {
                        i10--;
                    } else {
                        String str3 = ((vt) list.get(0)).c;
                        this.O.setText(str3);
                        if (str3.endsWith("0") && this.I.startsWith("0")) {
                            this.I = this.I.substring(1);
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 23) {
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.O.setText(upperCase);
                    if (upperCase.endsWith("0") && this.I.startsWith("0")) {
                        this.I = this.I.substring(1);
                    }
                }
            }
            this.Q.setText(this.I);
        }
        this.I = null;
    }

    public final void w(boolean z10) {
        ViewPropertyAnimator translationY = this.U.animate().translationY(z10 ? -AndroidUtilities.dp(21.33f) : 0.0f);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        org.telegram.messenger.vl.q(translationY, prVar, 420L);
        this.f.animate().translationY(z10 ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(prVar).setDuration(420L).start();
    }

    public final void x(boolean z10) {
        boolean z11 = this.S.a.q;
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
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        final int i10 = 0;
        alpha.setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ak0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        ek0 ek0Var = this.b;
                        if (!z13) {
                            ek0Var.n.setVisibility(4);
                            break;
                        } else {
                            ek0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        ek0 ek0Var2 = this.b;
                        if (!z14) {
                            ek0Var2.h.setVisibility(4);
                            break;
                        } else {
                            ek0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        ek0 ek0Var3 = this.b;
                        if (!z15) {
                            ek0Var3.getClass();
                            break;
                        } else {
                            ek0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.h.setVisibility(0);
        final int i11 = 1;
        this.h.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ak0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        ek0 ek0Var = this.b;
                        if (!z13) {
                            ek0Var.n.setVisibility(4);
                            break;
                        } else {
                            ek0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        ek0 ek0Var2 = this.b;
                        if (!z14) {
                            ek0Var2.h.setVisibility(4);
                            break;
                        } else {
                            ek0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        ek0 ek0Var3 = this.b;
                        if (!z15) {
                            ek0Var3.getClass();
                            break;
                        } else {
                            ek0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.r.setVisibility(0);
        final int i12 = 2;
        this.r.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.ak0
            public final /* synthetic */ ek0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z13 = z12;
                        ek0 ek0Var = this.b;
                        if (!z13) {
                            ek0Var.n.setVisibility(4);
                            break;
                        } else {
                            ek0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        ek0 ek0Var2 = this.b;
                        if (!z14) {
                            ek0Var2.h.setVisibility(4);
                            break;
                        } else {
                            ek0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        ek0 ek0Var3 = this.b;
                        if (!z15) {
                            ek0Var3.getClass();
                            break;
                        } else {
                            ek0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void y(String str) {
        if (this.c0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.c0, true);
            this.c0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.vl.q(this.R.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.pr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        org.telegram.messenger.vl.q(this.R.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.pr.h, 420L);
        this.R.setImageDrawable(new org.telegram.ui.Components.sp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.j6.m5)));
        this.v.setText("");
        w(true);
        oj0 oj0Var = new oj0(1, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(gf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = gf.b.d(str, false);
            this.c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new bc0(6, this, oj0Var));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                oj0Var.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new pf0((Object) this, (Object) tL_contact, (Object) oj0Var, 6));
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
