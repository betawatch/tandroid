package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Collection;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class eg0 extends org.telegram.ui.Components.cv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList A;
    public final HashMap B;
    public final HashMap C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public Toast K;
    public String L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Runnable Q;
    public final /* synthetic */ fg0 R;
    public final kj0 a;
    public final bg0 b;
    public final TextView c;
    public final org.telegram.ui.Components.xz0 d;
    public final org.telegram.ui.Components.fc0 e;
    public final org.telegram.ui.Components.fc0 f;
    public final TextView h;
    public final org.telegram.ui.Components.l80 n;
    public final View r;
    public final ImageView s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 w;
    public int x;
    public lt y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        this.R = fg0Var;
        this.x = 0;
        this.A = new ArrayList();
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0L;
        this.M = -1;
        this.O = false;
        this.P = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        j3.r0.u(18.0f, 1, textView);
        textView.setText(LocaleController.getString(fg0Var.B == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new v80(8, this, context));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
        this.n = l80Var;
        l80Var.setText(LocaleController.getString(fg0Var.B == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(17);
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(l80Var, g7.e6.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0(context);
        this.d = xz0Var;
        xz0Var.setFactory(new ag0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.xs.e);
        xz0Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(xz0Var, g7.e6.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, g7.e6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
        this.e = fc0Var;
        fc0Var.setText(LocaleController.getString(R.string.Country));
        fc0Var.addView(linearLayout, g7.e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        fc0Var.setForceUseCenter(true);
        fc0Var.setFocusable(true);
        fc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        fc0Var.setOnFocusChangeListener(new ld(this, 9));
        addView(fc0Var, g7.e6.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i10 = 1;
        fc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wf0
            public final /* synthetic */ eg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        fg0 fg0Var2 = this.b.R;
                        if (fg0Var2.getParentActivity() != null) {
                            boolean z10 = !fg0Var2.y;
                            fg0Var2.y = z10;
                            ((org.telegram.ui.Cells.z1) view).c(z10, true);
                            if (!fg0Var2.y) {
                                new org.telegram.ui.Components.oc(fg0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                break;
                            } else {
                                new org.telegram.ui.Components.oc(fg0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                break;
                            }
                        }
                        break;
                    default:
                        eg0 eg0Var = this.b;
                        qt qtVar = new qt(eg0Var.A, true);
                        qtVar.r = new wt(eg0Var, 20);
                        eg0Var.R.presentFragment(qtVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
        this.f = fc0Var2;
        fc0Var2.addView(linearLayout2, g7.e6.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        fc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(fc0Var2, g7.e6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, g7.e6.n(-2, -2));
        kj0 kj0Var = new kj0(this, context, 2);
        this.a = kj0Var;
        kj0Var.setInputType(3);
        kj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        kj0Var.setCursorWidth(1.5f);
        kj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        kj0Var.setTextSize(1, 16.0f);
        kj0Var.setMaxLines(1);
        kj0Var.setGravity(19);
        kj0Var.setImeOptions(268435461);
        kj0Var.setBackground(null);
        kj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        kj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(kj0Var, g7.e6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        kj0Var.addTextChangedListener(new o0(this, 10));
        final int i11 = 1;
        kj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.vf0
            public final /* synthetic */ eg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i12, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        eg0 eg0Var = this.b;
                        if (i12 != 5) {
                            eg0Var.getClass();
                            return false;
                        }
                        tf0 tf0Var = eg0Var.R.X;
                        if (tf0Var != null) {
                            tf0Var.h.callOnClick();
                            return true;
                        }
                        eg0Var.h(null);
                        return true;
                    default:
                        bg0 bg0Var = this.b.b;
                        if (i12 != 5) {
                            return false;
                        }
                        bg0Var.requestFocus();
                        bg0Var.setSelection(bg0Var.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = g7.e6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        bg0 bg0Var = new bg0(this, context);
        this.b = bg0Var;
        bg0Var.setInputType(3);
        bg0Var.setPadding(0, 0, 0, 0);
        bg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        bg0Var.setCursorWidth(1.5f);
        bg0Var.setTextSize(1, 16.0f);
        bg0Var.setMaxLines(1);
        bg0Var.setGravity(19);
        bg0Var.setImeOptions(268435461);
        bg0Var.setBackground(null);
        bg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        bg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(bg0Var, g7.e6.c(36.0f, -1));
        bg0Var.addTextChangedListener(new rr(this, 1));
        final int i12 = 0;
        bg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.vf0
            public final /* synthetic */ eg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i122, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        eg0 eg0Var = this.b;
                        if (i122 != 5) {
                            eg0Var.getClass();
                            return false;
                        }
                        tf0 tf0Var = eg0Var.R.X;
                        if (tf0Var != null) {
                            tf0Var.h.callOnClick();
                            return true;
                        }
                        eg0Var.h(null);
                        return true;
                    default:
                        bg0 bg0Var2 = this.b.b;
                        if (i122 != 5) {
                            return false;
                        }
                        bg0Var2.requestFocus();
                        bg0Var2.setSelection(bg0Var2.length());
                        return true;
                }
            }
        });
        if (fg0Var.x && fg0Var.B == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", fg0Var.y, false, false);
            addView(z1Var, g7.e6.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i13 = 0;
            z1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wf0
                public final /* synthetic */ eg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            fg0 fg0Var2 = this.b.R;
                            if (fg0Var2.getParentActivity() != null) {
                                boolean z10 = !fg0Var2.y;
                                fg0Var2.y = z10;
                                ((org.telegram.ui.Cells.z1) view2).c(z10, true);
                                if (!fg0Var2.y) {
                                    new org.telegram.ui.Components.oc(fg0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    break;
                                } else {
                                    new org.telegram.ui.Components.oc(fg0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    break;
                                }
                            }
                            break;
                        default:
                            eg0 eg0Var = this.b;
                            qt qtVar = new qt(eg0Var.A, true);
                            qtVar.r = new wt(eg0Var, 20);
                            eg0Var.R.presentFragment(qtVar);
                            break;
                    }
                }
            });
            i9 = 48;
        } else {
            i9 = 72;
        }
        boolean z10 = BuildVars.DEBUG_VERSION || fg0Var.getConnectionsManager().isTestBackend();
        if (z10 && fg0Var.B == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = fg0Var.getConnectionsManager().isTestBackend();
            fg0Var.A = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, g7.e6.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i9 -= 24;
            z1Var2.setOnClickListener(new ih.b2(8, this, z10));
        }
        if (i9 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i9));
            addView(space, g7.e6.n(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                lt ltVar = new lt();
                ltVar.a = split[2];
                String str = split[0];
                ltVar.c = str;
                ltVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(ltVar.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(ltVar.d, countryName)) {
                        ltVar.b = ltVar.a;
                        ltVar.a = countryName;
                    }
                }
                this.A.add(0, ltVar);
                List list = (List) this.B.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.B;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ltVar);
                if (split.length > 3) {
                    this.C.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Collections.sort(this.A, Comparator$-CC.comparing(new k8(6)));
        try {
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        fg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new v40(11, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.x = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            bg0 bg0Var2 = this.b;
            bg0Var2.setSelection(bg0Var2.length());
        } else {
            this.a.requestFocus();
        }
        s();
    }

    public static void o(eg0 eg0Var, ArrayList arrayList) {
        fg0 fg0Var = eg0Var.R;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            fg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.P = string;
        fg0Var.n = fg0Var.showDialog(c2Var, true, null);
        fg0Var.Y = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.xs.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.fc0 fc0Var = this.e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        fc0Var.b(f10, f10, true);
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.G = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void f() {
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
            this.Q = null;
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        int i11;
        if (this.R.getParentActivity() == null || this.G || this.R.k0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sim status = " + telephonyManager.getSimState());
        }
        int i12 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            fg0.U0(this.R, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i13 = 1;
        if (!this.H) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y && !this.R.h1() && this.R.O.R() > AndroidUtilities.dp(20.0f)) {
                fg0 fg0Var = this.R;
                fg0Var.P = new uf0(this, i13);
                AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                return;
            }
            fg0 fg0Var2 = this.R;
            Context context = this.R.fragmentView.getContext();
            fg0 fg0Var3 = this.R;
            fg0Var2.X = new tf0(context, (ViewGroup) fg0Var3.fragmentView, fg0Var3.J, str2, new dg0(this));
            tf0 tf0Var = this.R.X;
            tf0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new sf0(tf0Var, i12));
            duration.addUpdateListener(new pf0(tf0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.gr.f);
            duration.start();
            return;
        }
        this.H = false;
        tf0 tf0Var2 = this.R.X;
        if (tf0Var2 != null) {
            int i14 = tf0.A;
            tf0Var2.a();
        }
        boolean isSimAvailable = AndroidUtilities.isSimAvailable();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 23 || !isSimAvailable) {
            z10 = isSimAvailable;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        } else {
            z12 = this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.R.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i15 < 28 || this.R.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z15 = i15 < 26 || this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            fg0 fg0Var4 = this.R;
            z10 = isSimAvailable;
            if (fg0Var4.v) {
                fg0Var4.r.clear();
                if (!z12) {
                    this.R.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.R.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.R.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z15 && i15 >= 26) {
                    this.R.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.R.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.R.getParentActivity().requestPermissions((String[]) this.R.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.R.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.P = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i11 = R.raw.calls_log;
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.P = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i11 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.P = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i11 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i11, 46, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                    fg0 fg0Var5 = this.R;
                    fg0Var5.h = fg0Var5.showDialog(alertDialog$Builder.a);
                    this.H = true;
                    return;
                }
            }
            z11 = true;
        }
        int i16 = this.x;
        if (i16 == z11) {
            this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
            this.R.k1(false, z11);
            return;
        }
        if (i16 == 2 && !BuildVars.DEBUG_VERSION) {
            this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
            this.R.k1(false, true);
            return;
        }
        String d = ne.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        fg0 fg0Var6 = this.R;
        if (fg0Var6.B == 0 && (fg0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i17 = 0; i17 < 4; i17++) {
                UserConfig userConfig = UserConfig.getInstance(i17);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i17).isTestBackend();
                    fg0 fg0Var7 = this.R;
                    if (isTestBackend == fg0Var7.A) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var7.getParentActivity());
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.a.P = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new bg.x2(this, i17, 12));
                        alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                        this.R.showDialog(alertDialog$Builder2.a);
                        this.R.k1(false, true);
                        return;
                    }
                }
            }
        }
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z10 && z12 && z13 && z14;
        tL_codeSettings.allow_missed_call = z10 && z12;
        boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.R.h0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
        if (savedLogInTokens != null) {
            for (int i18 = 0; i18 < savedLogInTokens.size(); i18++) {
                if (savedLogInTokens.get(i18).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i18).future_auth_token, StandardCharsets.UTF_8)));
                    }
                    tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i18).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
        if (savedLogOutTokens != null) {
            for (int i19 = 0; i19 < savedLogOutTokens.size(); i19++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i19).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        sharedPreferences.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
        } else {
            sharedPreferences.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet V0 = fg0.V0(this.R);
                if (V0.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (UserConfig.getActivatedAccountsCount() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(V0).anyMatch(new w70(d, 1));
                }
            } catch (Exception e11) {
                tL_codeSettings.unknown_number = true;
                FileLog.e(e11);
            }
        }
        fg0 fg0Var8 = this.R;
        if (fg0Var8.B == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var8).currentAccount;
            ConnectionsManager.getInstance(i9).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
            tL_auth_sendCode2.api_id = BuildVars.APP_ID;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + ne.b.d(this.a.getText().toString(), false) + " " + ne.b.d(this.b.getText().toString(), false));
        } catch (Exception e12) {
            FileLog.e(e12);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        lt ltVar = this.y;
        if (ltVar != null) {
            bundle.putString("country", ltVar.c);
        }
        this.G = true;
        j4.c cVar = new j4.c(21, false);
        cVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        cVar.b = this.y;
        cVar.c = (List) this.C.get(this.a.getText().toString());
        i10 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
        this.R.n1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new bg.h0(this, bundle, d, cVar, tL_auth_sendCode3, 12), 27), true);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.R.y, false);
        }
        AndroidUtilities.runOnUIThread(new uf0(this, 0), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.b.setText(string2);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false);
        org.telegram.ui.Components.l80 l80Var = this.n;
        l80Var.setTextColor(w02);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false));
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.xz0 xz0Var = this.d;
            if (i9 >= xz0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) xz0Var.getChildAt(i9);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            i9++;
        }
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        ImageView imageView = this.s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(this.R.getThemedColor(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        kj0 kj0Var = this.a;
        kj0Var.setTextColor(w04);
        int i12 = org.telegram.ui.ActionBar.f6.l6;
        kj0Var.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k6, false));
        int w05 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        bg0 bg0Var = this.b;
        bg0Var.setTextColor(w05);
        bg0Var.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        bg0Var.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i13 = org.telegram.ui.ActionBar.f6.Y6;
            int i14 = org.telegram.ui.ActionBar.f6.W6;
            int i15 = org.telegram.ui.ActionBar.f6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i13;
                checkBoxSquare.v = i14;
                checkBoxSquare.w = i15;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.w;
        if (z1Var2 != null) {
            int i16 = org.telegram.ui.ActionBar.f6.Y6;
            int i17 = org.telegram.ui.ActionBar.f6.W6;
            int i18 = org.telegram.ui.ActionBar.f6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i16;
                checkBoxSquare2.v = i17;
                checkBoxSquare2.w = i18;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j10) {
        if (this.D) {
            this.D = false;
            return;
        }
        this.E = true;
        this.a.setText(((lt) this.A.get(i9)).c);
        this.E = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:6:0x000e, B:8:0x001e, B:10:0x0026, B:15:0x003b, B:19:0x004e, B:23:0x0058, B:25:0x005f, B:28:0x006a, B:29:0x0071, B:31:0x007b, B:35:0x008a, B:39:0x0096, B:41:0x00af, B:44:0x00b9, B:50:0x0118, B:52:0x0129, B:48:0x0123, B:53:0x00c9, B:55:0x00cf, B:57:0x00f5, B:59:0x00fe, B:65:0x0110, B:69:0x0138, B:70:0x014b, B:72:0x0155, B:74:0x0186), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:6:0x000e, B:8:0x001e, B:10:0x0026, B:15:0x003b, B:19:0x004e, B:23:0x0058, B:25:0x005f, B:28:0x006a, B:29:0x0071, B:31:0x007b, B:35:0x008a, B:39:0x0096, B:41:0x00af, B:44:0x00b9, B:50:0x0118, B:52:0x0129, B:48:0x0123, B:53:0x00c9, B:55:0x00cf, B:57:0x00f5, B:59:0x00fe, B:65:0x0110, B:69:0x0138, B:70:0x014b, B:72:0x0155, B:74:0x0186), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z10;
        boolean z11;
        boolean z12;
        lt ltVar;
        fg0 fg0Var;
        if (this.N || this.R.B != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (AndroidUtilities.isSimAvailable()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23) {
                    z10 = this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    if (i9 >= 26 && this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        fg0Var = this.R;
                        if (fg0Var.w && (!z10 || !z11)) {
                            fg0Var.s.clear();
                            if (!z10) {
                                this.R.s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i9 >= 26) {
                                this.R.s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (this.R.s.isEmpty()) {
                                o(this, new ArrayList(this.R.s));
                                return;
                            }
                            return;
                        }
                    }
                    z11 = true;
                    fg0Var = this.R;
                    if (fg0Var.w) {
                        fg0Var.s.clear();
                        if (!z10) {
                        }
                        if (!z11) {
                            this.R.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.R.s.isEmpty()) {
                        }
                    }
                } else {
                    z10 = true;
                    z11 = true;
                }
                this.N = true;
                if (!this.R.x && z10 && z11) {
                    this.a.setAlpha(0.0f);
                    this.b.setAlpha(0.0f);
                    String d = ne.b.d(telephonyManager.getLine1Number(), false);
                    if (!TextUtils.isEmpty(d)) {
                        int i10 = 4;
                        String str = null;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 < 1) {
                                    z12 = false;
                                    break;
                                }
                                String substring = d.substring(0, i10);
                                List list = (List) this.B.get(substring);
                                if (list == null) {
                                    ltVar = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    ltVar = (lt) list.get(list.size() - 1);
                                    if (string != null) {
                                        ArrayList arrayList = this.A;
                                        int size = arrayList.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= size) {
                                                break;
                                            }
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            lt ltVar2 = (lt) obj;
                                            if (Objects.equals(ltVar2.d, string)) {
                                                ltVar = ltVar2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    ltVar = (lt) list.get(0);
                                }
                                if (ltVar != null) {
                                    str = d.substring(i10);
                                    this.a.setText(substring);
                                    z12 = true;
                                    break;
                                }
                                i10--;
                            }
                            if (!z12) {
                                str = d.substring(1);
                                this.a.setText(d.substring(0, 1));
                            }
                        }
                        if (str != null) {
                            this.b.requestFocus();
                            this.b.setText(str);
                            bg0 bg0Var = this.b;
                            bg0Var.setSelection(bg0Var.length());
                        }
                    }
                    if (this.b.length() <= 0) {
                        this.a.setAlpha(1.0f);
                        this.b.setAlpha(1.0f);
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(300L);
                    kj0 kj0Var = this.a;
                    Property property = View.ALPHA;
                    duration.playTogether(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<bg0, Float>) property, 1.0f));
                    duration.start();
                    this.H = true;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void r() {
        int i9;
        String str = this.L;
        bg0 bg0Var = this.b;
        String replace = bg0Var.getText() != null ? bg0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.C;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.M != -1) {
                int selectionStart = bg0Var.getSelectionStart();
                int selectionEnd = bg0Var.getSelectionEnd();
                bg0Var.setHintText((String) null);
                bg0Var.setSelection(selectionStart, selectionEnd);
                this.M = -1;
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
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str2 = (String) list.get(i10);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i9 = i10;
                    break;
                }
            }
            if (i9 == -1) {
                i9 = 0;
            }
        }
        if (this.M != i9) {
            String str3 = (String) ((List) hashMap.get(str)).get(i9);
            int selectionStart2 = bg0Var.getSelectionStart();
            int selectionEnd2 = bg0Var.getSelectionEnd();
            bg0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            bg0Var.setSelection(Math.max(0, Math.min(bg0Var.length(), selectionStart2)), Math.max(0, Math.min(bg0Var.length(), selectionEnd2)));
            this.M = i9;
        }
    }

    public final void s() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.R.getConnectionsManager().sendRequest(tL_help_getCountriesList, new yf0(this, 0), 10);
    }

    public final void t(boolean z10) {
        int i9;
        fg0 fg0Var = this.R;
        if (fg0Var.B == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.P) {
            if (z10 || !this.O) {
                this.P = true;
                this.O = true;
                Context context = getContext();
                i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                this.Q = PasskeysController.login(context, i9, z10, new xf0(this, 0));
            }
        }
    }

    public final void v(String str, lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.L = str;
        this.M = -1;
        r();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
