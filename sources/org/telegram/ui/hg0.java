package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hg0 extends org.telegram.ui.Components.tw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public lt F;
    public final ArrayList G;
    public final HashMap H;
    public final HashMap I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public Toast Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final pj0 a;
    public final /* synthetic */ ig0 a0;
    public final eg0 b;
    public final TextView c;
    public final org.telegram.ui.Components.s11 d;
    public final org.telegram.ui.Components.vd0 e;
    public final org.telegram.ui.Components.vd0 f;
    public final TextView h;
    public final org.telegram.ui.Components.y90 n;
    public final View r;
    public final ImageView s;
    public int v;
    public int w;
    public final org.telegram.ui.Cells.z1 x;
    public final org.telegram.ui.Cells.z1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg0(ig0 ig0Var, Context context) {
        super(context);
        int i10;
        this.a0 = ig0Var;
        this.E = 0;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0L;
        this.S = -1;
        this.U = false;
        this.V = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(ig0Var.F == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.z5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new ae0(2, this, context));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, null);
        this.n = y90Var;
        y90Var.setText(LocaleController.getString(ig0Var.F == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        y90Var.setTextSize(1, 14.0f);
        y90Var.setGravity(17);
        y90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(y90Var, w7.z5.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.s11 s11Var = new org.telegram.ui.Components.s11(context);
        this.d = s11Var;
        s11Var.setFactory(new dg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.st.e);
        s11Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(s11Var, w7.z5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, null);
        this.e = vd0Var;
        vd0Var.setText(LocaleController.getString(R.string.Country));
        vd0Var.addView(linearLayout, w7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        vd0Var.setForceUseCenter(true);
        vd0Var.setFocusable(true);
        vd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        vd0Var.setOnFocusChangeListener(new pd(this, 9));
        addView(vd0Var, w7.z5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i11 = 1;
        vd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zf0
            public final /* synthetic */ hg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ig0 ig0Var2 = this.b.a0;
                        if (ig0Var2.getParentActivity() != null) {
                            boolean z10 = !ig0Var2.y;
                            ig0Var2.y = z10;
                            ((org.telegram.ui.Cells.z1) view).c(z10, true);
                            if (!ig0Var2.y) {
                                new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                break;
                            } else {
                                new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                break;
                            }
                        }
                        break;
                    default:
                        hg0 hg0Var = this.b;
                        rt rtVar = new rt(hg0Var.G, true);
                        rtVar.r = new xt(hg0Var, 20);
                        hg0Var.a0.presentFragment(rtVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.vd0 vd0Var2 = new org.telegram.ui.Components.vd0(context, null);
        this.f = vd0Var2;
        vd0Var2.addView(linearLayout2, w7.z5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        vd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(vd0Var2, w7.z5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.z5.n(-2, -2));
        pj0 pj0Var = new pj0(this, context, 2);
        this.a = pj0Var;
        pj0Var.setInputType(3);
        pj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        pj0Var.setCursorWidth(1.5f);
        pj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        pj0Var.setTextSize(1, 16.0f);
        pj0Var.setMaxLines(1);
        pj0Var.setGravity(19);
        pj0Var.setImeOptions(268435461);
        pj0Var.setBackground(null);
        pj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        pj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(pj0Var, w7.z5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        pj0Var.addTextChangedListener(new n0(this, 10));
        final int i12 = 1;
        pj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.yf0
            public final /* synthetic */ hg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        hg0 hg0Var = this.b;
                        if (i13 != 5) {
                            hg0Var.getClass();
                            return false;
                        }
                        wf0 wf0Var = hg0Var.a0.b0;
                        if (wf0Var != null) {
                            wf0Var.h.callOnClick();
                            return true;
                        }
                        hg0Var.h(null);
                        return true;
                    default:
                        eg0 eg0Var = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        eg0Var.requestFocus();
                        eg0Var.setSelection(eg0Var.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = w7.z5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        eg0 eg0Var = new eg0(this, context);
        this.b = eg0Var;
        eg0Var.setInputType(3);
        eg0Var.setPadding(0, 0, 0, 0);
        eg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        eg0Var.setCursorWidth(1.5f);
        eg0Var.setTextSize(1, 16.0f);
        eg0Var.setMaxLines(1);
        eg0Var.setGravity(19);
        eg0Var.setImeOptions(268435461);
        eg0Var.setBackground(null);
        eg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        eg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(eg0Var, w7.z5.c(36.0f, -1));
        eg0Var.addTextChangedListener(new rr(this, 1));
        final int i13 = 0;
        eg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.yf0
            public final /* synthetic */ hg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        hg0 hg0Var = this.b;
                        if (i132 != 5) {
                            hg0Var.getClass();
                            return false;
                        }
                        wf0 wf0Var = hg0Var.a0.b0;
                        if (wf0Var != null) {
                            wf0Var.h.callOnClick();
                            return true;
                        }
                        hg0Var.h(null);
                        return true;
                    default:
                        eg0 eg0Var2 = this.b.b;
                        if (i132 != 5) {
                            return false;
                        }
                        eg0Var2.requestFocus();
                        eg0Var2.setSelection(eg0Var2.length());
                        return true;
                }
            }
        });
        if (ig0Var.x && ig0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.x = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", ig0Var.y, false, false);
            addView(z1Var, w7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i14 = 0;
            z1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zf0
                public final /* synthetic */ hg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            ig0 ig0Var2 = this.b.a0;
                            if (ig0Var2.getParentActivity() != null) {
                                boolean z10 = !ig0Var2.y;
                                ig0Var2.y = z10;
                                ((org.telegram.ui.Cells.z1) view2).c(z10, true);
                                if (!ig0Var2.y) {
                                    new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    break;
                                } else {
                                    new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    break;
                                }
                            }
                            break;
                        default:
                            hg0 hg0Var = this.b;
                            rt rtVar = new rt(hg0Var.G, true);
                            rtVar.r = new xt(hg0Var, 20);
                            hg0Var.a0.presentFragment(rtVar);
                            break;
                    }
                }
            });
            i10 = 48;
        } else {
            i10 = 72;
        }
        boolean z10 = BuildVars.DEBUG_VERSION || ig0Var.getConnectionsManager().isTestBackend();
        if (z10 && ig0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.y = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = ig0Var.getConnectionsManager().isTestBackend();
            ig0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i10 -= 24;
            z1Var2.setOnClickListener(new ci.g2(8, this, z10));
        }
        if (i10 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i10));
            addView(space, w7.z5.n(-2, -2));
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
                this.G.add(0, ltVar);
                List list = (List) this.H.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.H;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ltVar);
                if (split.length > 3) {
                    this.I.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.G, Comparator$-CC.comparing(new k2.g(7)));
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ig0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new a50(11, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.E = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            eg0 eg0Var2 = this.b;
            eg0Var2.setSelection(eg0Var2.length());
        } else {
            this.a.requestFocus();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.st.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.vd0 vd0Var = this.e;
        float f7 = charSequence != null ? 1.0f : 0.0f;
        vd0Var.b(f7, f7, true);
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final void d() {
        this.M = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void f() {
        Runnable runnable = this.W;
        if (runnable != null) {
            runnable.run();
            this.W = null;
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.tw0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i11;
        int i12;
        if (this.a0.getParentActivity() == null || this.M || this.a0.o0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sim status = " + telephonyManager.getSimState());
        }
        int i13 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            ig0.W0(this.a0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i14 = 1;
        if (!this.N) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y && !this.a0.l1() && this.a0.S.Q() > AndroidUtilities.dp(20.0f)) {
                ig0 ig0Var = this.a0;
                ig0Var.T = new xf0(this, i14);
                AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                return;
            }
            ig0 ig0Var2 = this.a0;
            Context context = this.a0.fragmentView.getContext();
            ig0 ig0Var3 = this.a0;
            ig0Var2.b0 = new wf0(context, (ViewGroup) ig0Var3.fragmentView, ig0Var3.N, str2, new gg0(this));
            wf0 wf0Var = this.a0.b0;
            wf0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new vf0(wf0Var, i13));
            duration.addUpdateListener(new sf0(wf0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.bs.f);
            duration.start();
            return;
        }
        this.N = false;
        wf0 wf0Var2 = this.a0.b0;
        if (wf0Var2 != null) {
            int i15 = wf0.F;
            wf0Var2.a();
        }
        boolean isSimAvailable = AndroidUtilities.isSimAvailable();
        int i16 = Build.VERSION.SDK_INT;
        if (isSimAvailable) {
            z12 = this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.a0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i16 < 28 || this.a0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z15 = i16 < 26 || this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ig0 ig0Var4 = this.a0;
            z10 = isSimAvailable;
            if (ig0Var4.v) {
                ig0Var4.r.clear();
                if (!z12) {
                    this.a0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.a0.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.a0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z15 && i16 >= 26) {
                    this.a0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.a0.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !this.a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.a0.getParentActivity().requestPermissions((String[]) this.a0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a0.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i12 = R.raw.calls_log;
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i12 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i12 = R.raw.calls_log;
                    }
                    int i17 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i12, 46, org.telegram.ui.ActionBar.k6.x0(null, i17, false), null);
                    alertDialog$Builder.n(i17, null);
                    ig0 ig0Var5 = this.a0;
                    ig0Var5.h = ig0Var5.showDialog(alertDialog$Builder.a);
                    this.N = true;
                    return;
                }
            }
            z11 = true;
        } else {
            z10 = isSimAvailable;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        }
        int i18 = this.E;
        if (i18 == z11) {
            this.a0.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
            this.a0.o1(false, z11);
            return;
        }
        if (i18 == 2 && !BuildVars.DEBUG_VERSION) {
            this.a0.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
            this.a0.o1(false, true);
            return;
        }
        String d = jf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        ig0 ig0Var6 = this.a0;
        if (ig0Var6.F == 0 && (ig0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i19 = 0; i19 < 4; i19++) {
                UserConfig userConfig = UserConfig.getInstance(i19);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    ig0 ig0Var7 = this.a0;
                    if (isTestBackend == ig0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.r(this, i19, 14));
                        alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                        this.a0.showDialog(alertDialog$Builder2.a);
                        this.a0.o1(false, true);
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
        if (this.a0.l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
        if (savedLogInTokens != null) {
            for (int i20 = 0; i20 < savedLogInTokens.size(); i20++) {
                if (savedLogInTokens.get(i20).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i20).future_auth_token, StandardCharsets.UTF_8)));
                    }
                    tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i20).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
        if (savedLogOutTokens != null) {
            for (int i21 = 0; i21 < savedLogOutTokens.size(); i21++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i21).future_auth_token);
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
                HashSet X0 = ig0.X0(this.a0);
                if (X0.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (UserConfig.getActivatedAccountsCount() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(X0).anyMatch(new e80(d, 1));
                }
            } catch (Exception e7) {
                tL_codeSettings.unknown_number = true;
                FileLog.e(e7);
            }
        }
        ig0 ig0Var8 = this.a0;
        if (ig0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) ig0Var8).currentAccount;
            ConnectionsManager.getInstance(i10).cleanup(false);
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
            bundle.putString("ephone", "+" + jf.b.d(this.a.getText().toString(), false) + " " + jf.b.d(this.b.getText().toString(), false));
        } catch (Exception e10) {
            FileLog.e(e10);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        lt ltVar = this.F;
        if (ltVar != null) {
            bundle.putString("country", ltVar.c);
        }
        this.M = true;
        m.g3 g3Var = new m.g3(16, false);
        g3Var.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        g3Var.b = this.F;
        g3Var.c = (List) this.I.get(this.a.getText().toString());
        i11 = ((org.telegram.ui.ActionBar.o2) this.a0).currentAccount;
        this.a0.r1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new ai.s9(this, bundle, d, g3Var, tL_auth_sendCode3, 10), 27), true);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void j() {
        o();
        org.telegram.ui.Cells.z1 z1Var = this.x;
        if (z1Var != null) {
            z1Var.c(this.a0.y, false);
        }
        AndroidUtilities.runOnUIThread(new xf0(this, 0), ig0.x0);
    }

    @Override // org.telegram.ui.Components.tw0
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

    @Override // org.telegram.ui.Components.tw0
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

    public final void o() {
        boolean z10;
        ig0 ig0Var;
        boolean z11;
        lt ltVar;
        if (this.T || this.a0.F != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (AndroidUtilities.isSimAvailable()) {
                int i10 = Build.VERSION.SDK_INT;
                boolean z12 = this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i10 >= 26 && this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z10 = false;
                    ig0Var = this.a0;
                    if (!ig0Var.w && (!z12 || !z10)) {
                        ig0Var.s.clear();
                        if (!z12) {
                            this.a0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z10 && i10 >= 26) {
                            this.a0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.a0.s.isEmpty()) {
                            return;
                        }
                        new f80(27, this, new ArrayList(this.a0.s)).run();
                        return;
                    }
                    this.T = true;
                    if (ig0Var.x && z12 && z10) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = jf.b.d(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(d)) {
                            int i11 = 4;
                            String str = null;
                            if (d.length() > 4) {
                                while (true) {
                                    if (i11 < 1) {
                                        z11 = false;
                                        break;
                                    }
                                    String substring = d.substring(0, i11);
                                    List list = (List) this.H.get(substring);
                                    if (list == null) {
                                        ltVar = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                        ltVar = (lt) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.G;
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i12);
                                                i12++;
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
                                        str = d.substring(i11);
                                        this.a.setText(substring);
                                        z11 = true;
                                        break;
                                    }
                                    i11--;
                                }
                                if (!z11) {
                                    str = d.substring(1);
                                    this.a.setText(d.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                eg0 eg0Var = this.b;
                                eg0Var.setSelection(eg0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        pj0 pj0Var = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<eg0, Float>) property, 1.0f));
                        duration.start();
                        this.N = true;
                        return;
                    }
                    return;
                }
                z10 = true;
                ig0Var = this.a0;
                if (!ig0Var.w) {
                }
                this.T = true;
                if (ig0Var.x) {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.J) {
            this.J = false;
            return;
        }
        this.K = true;
        this.a.setText(((lt) this.G.get(i10)).c);
        this.K = false;
    }

    public final void p() {
        int i10;
        String str = this.R;
        eg0 eg0Var = this.b;
        String replace = eg0Var.getText() != null ? eg0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.I;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.S != -1) {
                int selectionStart = eg0Var.getSelectionStart();
                int selectionEnd = eg0Var.getSelectionEnd();
                eg0Var.setHintText((String) null);
                eg0Var.setSelection(selectionStart, selectionEnd);
                this.S = -1;
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
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = 0;
            }
        }
        if (this.S != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = eg0Var.getSelectionStart();
            int selectionEnd2 = eg0Var.getSelectionEnd();
            eg0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            eg0Var.setSelection(Math.max(0, Math.min(eg0Var.length(), selectionStart2)), Math.max(0, Math.min(eg0Var.length(), selectionEnd2)));
            this.S = i10;
        }
    }

    public final void q() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.a0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new bg0(this, 0), 10);
    }

    public final void r(boolean z10) {
        int i10;
        ig0 ig0Var = this.a0;
        if (ig0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.V) {
            if (z10 || !this.U) {
                this.V = true;
                this.U = true;
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                this.W = PasskeysController.login(context, i10, z10, new ag0(this, 0));
            }
        }
    }

    public final void s(String str, lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.R = str;
        this.S = -1;
        p();
    }

    @Override // org.telegram.ui.Components.tw0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.y90 y90Var = this.n;
        y90Var.setTextColor(x02);
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.s11 s11Var = this.d;
            if (i10 >= s11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) s11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = this.v;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        ig0.g1(imageView, x03, i12, mode);
        this.v = x03;
        int themedColor = this.a0.getThemedColor(org.telegram.ui.ActionBar.k6.i6);
        ig0.h1(imageView, themedColor, this.w);
        this.w = themedColor;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        pj0 pj0Var = this.a;
        pj0Var.setTextColor(x04);
        int i14 = org.telegram.ui.ActionBar.k6.l6;
        pj0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false));
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        eg0 eg0Var = this.b;
        eg0Var.setTextColor(x05);
        eg0Var.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        eg0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        org.telegram.ui.Cells.z1 z1Var = this.x;
        if (z1Var != null) {
            int i15 = org.telegram.ui.ActionBar.k6.Y6;
            int i16 = org.telegram.ui.ActionBar.k6.W6;
            int i17 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i15;
                checkBoxSquare.v = i16;
                checkBoxSquare.w = i17;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.y;
        if (z1Var2 != null) {
            int i18 = org.telegram.ui.ActionBar.k6.Y6;
            int i19 = org.telegram.ui.ActionBar.k6.W6;
            int i20 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i18;
                checkBoxSquare2.v = i19;
                checkBoxSquare2.w = i20;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
