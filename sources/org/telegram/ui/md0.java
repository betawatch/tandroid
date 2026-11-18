package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class md0 extends org.telegram.ui.Components.fu0 {
    public final ImageView a;
    public final hi.d b;
    public final di.h0[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ ee0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(ee0 ee0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        this.w = ee0Var;
        di.h0[] h0VarArr = {r3, r3, r3};
        this.c = h0VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ma.o(-1, org.telegram.messenger.ks.e3));
        ki.f fVar = new ki.f(context, 3);
        frameLayout.addView(fVar, c8.ma.e(-1, org.telegram.messenger.ks.e3, org.telegram.messenger.ks.E1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        i6Var = ((org.telegram.ui.ActionBar.h2) ee0Var).resourceProvider;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        di.bc bcVar = new di.bc(context, 1, 1, 1);
        bcVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.n6.Dk;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, i11, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.f fVar2 = bcVar.b;
        fVar2.z = i11;
        fVar2.A = org.telegram.ui.ActionBar.n6.Ck;
        fVar2.b();
        frameLayout.addView(bcVar, c8.ma.e(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131745771, null));
        org.telegram.messenger.f3.l(textView, i7, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        i6Var2 = ((org.telegram.ui.ActionBar.h2) ee0Var).resourceProvider;
        di.h0 h0Var = new di.h0(1, context, i6Var2);
        h0Var.a(R.drawable.menu_high_price, org.telegram.messenger.gd.M0(2131745785, null), org.telegram.messenger.gd.M0(2131745787, null));
        addView(h0VarArr[0], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        i6Var3 = ((org.telegram.ui.ActionBar.h2) ee0Var).resourceProvider;
        di.h0 h0Var2 = new di.h0(1, context, i6Var3);
        h0Var2.a(R.drawable.menu_feature_code, org.telegram.messenger.gd.M0(2131745783, null), org.telegram.messenger.gd.M0(2131745784, null));
        addView(h0VarArr[1], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        i6Var4 = ((org.telegram.ui.ActionBar.h2) ee0Var).resourceProvider;
        di.h0 h0Var3 = new di.h0(1, context, i6Var4);
        h0Var3.a(R.drawable.menu_feature_hands, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131745778, null), new id0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.gd.M0(2131745782, null));
        addView(h0VarArr[2], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), c8.ma.p(0, 0, 1.0f, org.telegram.messenger.ks.E1));
        hi.d g10 = org.telegram.messenger.n10.g(24, context, null, true);
        this.b = g10;
        g10.setLoading(true);
        addView(g10, c8.ma.t(-1, 48, 7, 0, 16, 0, 16));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|1|2|3|4|(1:6)(1:93)|7|8|(1:10)(1:92)|11|12|13|14|(1:16)(1:88)|(1:87)|(1:84)|(3:24|(4:27|(5:29|30|(1:32)(1:36)|33|34)(1:37)|35|25)|38)|40|41|(4:74|75|(1:77)(1:80)|78)(1:43)|44|45|46|(2:48|(11:50|51|52|53|(1:55)|56|(1:68)(1:60)|61|(1:63)|64|66))|72|51|52|53|(0)|56|(1:58)|68|61|(0)|64|66|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024b A[Catch: Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:3:0x0005, B:6:0x004d, B:7:0x005e, B:10:0x0066, B:11:0x006f, B:40:0x0175, B:44:0x01ba, B:51:0x01dc, B:56:0x01f8, B:60:0x0217, B:61:0x0222, B:63:0x024b, B:64:0x0258, B:43:0x01b7, B:83:0x01b3, B:91:0x0172, B:92:0x006a, B:93:0x0055, B:75:0x017d, B:77:0x019b, B:80:0x01af, B:14:0x00bc, B:16:0x00c8, B:18:0x00d3, B:21:0x00e3, B:24:0x00ef, B:25:0x00f3, B:27:0x00f9, B:30:0x0109, B:33:0x0169, B:36:0x0165, B:84:0x00e9, B:87:0x00dd), top: B:2:0x0005, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(md0 md0Var, String str, String str2, String str3) {
        boolean z10;
        int i7;
        String str4;
        WifiManager wifiManager;
        try {
            boolean z11 = false;
            PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            }
            if (TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(i10);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(md0Var.getContext());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                    completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                        String number = subscriptionInfo.getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            String str6 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb2.append(str6);
                            sb2.append(".Phone: ");
                            sb2.append(number);
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".MCC: ");
                            sb2.append(subscriptionInfo.getMcc());
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".MNC: ");
                            sb2.append(subscriptionInfo.getMnc());
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".Carrier: ");
                            sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb2.append("\n\n");
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) md0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            Context context = md0Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.a;
            try {
                wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z10 = true;
                    sb2.append(z10);
                    sb2.append("\n");
                    sb2.append("Airplane Mode: ");
                    if (Settings.Global.getInt(md0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z11 = true;
                    }
                    sb2.append(z11);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("App: ");
                    sb2.append(org.telegram.messenger.s2.d);
                    sb2.append("\n");
                    i7 = packageInfo.versionCode % 10;
                    if (i7 != 1 || i7 == 2) {
                        str4 = "store";
                    } else {
                        org.telegram.messenger.t0.u();
                        org.telegram.messenger.t0.n();
                        str4 = "beta";
                    }
                    sb2.append("App version: ");
                    sb2.append(str5);
                    sb2.append(" ");
                    sb2.append(str4);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("Issue: ");
                    sb2.append("billing_issue");
                    sb2.append("\n");
                    if (!TextUtils.isEmpty(md0Var.e)) {
                        sb2.append("Error: ");
                        sb2.append(md0Var.e);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n================================================\n");
                    sb2.append("WRITE YOUR COMMENT HERE:\n");
                    sb2.append("\n");
                    sb2.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    md0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z10 = false;
            sb2.append(z10);
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            if (Settings.Global.getInt(md0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb2.append(z11);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(org.telegram.messenger.s2.d);
            sb2.append("\n");
            i7 = packageInfo.versionCode % 10;
            if (i7 != 1) {
            }
            str4 = "store";
            sb2.append("App version: ");
            sb2.append(str5);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append("billing_issue");
            sb2.append("\n");
            if (!TextUtils.isEmpty(md0Var.e)) {
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            md0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            md0Var.w.D1(org.telegram.messenger.gd.M0(R.string.AppName, null), org.telegram.messenger.gd.M0(2131748007, "NoMailInstalled"));
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public final void g() {
        int i7;
        if (this.s >= 0) {
            i7 = ((org.telegram.ui.ActionBar.h2) this.w).currentAccount;
            ConnectionsManager.getInstance(i7).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.fu0
    public final void m(Bundle bundle, boolean z10) {
        int i7;
        this.d = bundle;
        String i02 = org.telegram.messenger.gd.i0(2131750505, bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j3 = bundle == null ? 0L : bundle.getLong("amount");
        int i10 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean isEmpty = TextUtils.isEmpty(i02);
        di.h0[] h0VarArr = this.c;
        if (isEmpty) {
            h0VarArr[0].c.setText(org.telegram.messenger.gd.M0(2131745787, null));
            i7 = 0;
        } else {
            i7 = 0;
            h0VarArr[0].c.setText(org.telegram.messenger.gd.a0(null, null, 2131745786, i02));
        }
        h0VarArr[2].setSubtitle(i10 == 7 ? org.telegram.messenger.gd.M0(2131745782, null) : org.telegram.messenger.gd.H(',', "SMSFee3TextDays", i10));
        this.a.setOnClickListener(new bi.m6(this, string4, string5, string2, 15));
        hi.d dVar = this.b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (!org.telegram.messenger.s2.b()) {
            int i11 = i7;
            String str = string3;
            int i12 = i10;
            if (TextUtils.isEmpty(string)) {
                dVar.setVisibility(8);
                return;
            }
            dVar.setVisibility(i11);
            dVar.setLoading(true);
            ai.g1 g1Var = new ai.g1(this, string, str, string2, i12, 24);
            if (org.telegram.messenger.r1.i().k()) {
                g1Var.run();
                return;
            } else {
                org.telegram.messenger.r1.i().i.add(g1Var);
                return;
            }
        }
        if (TextUtils.isEmpty(string6) || j3 <= 0) {
            boolean z11 = i7;
            dVar.setVisibility(z11 ? 1 : 0);
            dVar.setLoading(z11);
            dVar.setEnabled(z11);
            dVar.i(org.telegram.messenger.gd.M0(2131743676, null), z11, true);
            return;
        }
        boolean z12 = i7;
        dVar.setVisibility(z12 ? 1 : 0);
        dVar.setLoading(z12);
        Object[] objArr = new Object[1];
        objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j3, string6);
        dVar.i(org.telegram.messenger.gd.a0(null, null, 2131745772, objArr), z12, true);
        dVar.g(i10 == 7 ? org.telegram.messenger.gd.M0(2131745776, null) : org.telegram.messenger.gd.H(',', "SMSFeePurchaseTextDays", i10), z12);
        dVar.setOnClickListener(new di.q0(this, string6, j3, string3, string2, i10));
    }

    public final void o() {
        int i7;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i7 = ((org.telegram.ui.ActionBar.h2) this.w).currentAccount;
            this.s = ConnectionsManager.getInstance(i7).sendRequest(tL_checkPaidAuth, new l(this, 14), 1096);
        }
    }
}
