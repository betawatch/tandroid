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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class id0 extends org.telegram.ui.Components.vt0 {
    public final ImageView a;
    public final gi.d b;
    public final ci.l0[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ xd0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(xd0 xd0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.w = xd0Var;
        ci.l0[] l0VarArr = {r3, r3, r3};
        this.c = l0VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, b8.mf.o(-1, org.telegram.messenger.hs.e3));
        ii.f fVar = new ii.f(context, 3);
        frameLayout.addView(fVar, b8.mf.e(-1, org.telegram.messenger.hs.e3, org.telegram.messenger.hs.E1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        e6Var = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        frameLayout.addView(imageView, b8.mf.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        ci.ic icVar = new ci.ic(context, 1, 1, 1);
        icVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.k6.Ak;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false)));
        icVar.setBackgroundBitmap(createBitmap);
        wg.f fVar2 = icVar.b;
        fVar2.z = i11;
        fVar2.A = org.telegram.ui.ActionBar.k6.zk;
        fVar2.b();
        frameLayout.addView(icVar, b8.mf.e(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131745976, null));
        org.telegram.messenger.k5.n(textView, i3, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        e6Var2 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var = new ci.l0(1, context, e6Var2);
        l0Var.a(R.drawable.menu_high_price, org.telegram.messenger.bd.M0(2131745990, null), org.telegram.messenger.bd.M0(2131745992, null));
        addView(l0VarArr[0], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var3 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var2 = new ci.l0(1, context, e6Var3);
        l0Var2.a(R.drawable.menu_feature_code, org.telegram.messenger.bd.M0(2131745988, null), org.telegram.messenger.bd.M0(2131745989, null));
        addView(l0VarArr[1], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        e6Var4 = ((org.telegram.ui.ActionBar.d2) xd0Var).resourceProvider;
        ci.l0 l0Var3 = new ci.l0(1, context, e6Var4);
        l0Var3.a(R.drawable.menu_feature_hands, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131745983, null), new ed0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.bd.M0(2131745987, null));
        addView(l0VarArr[2], b8.mf.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), b8.mf.p(0, 0, 1.0f, org.telegram.messenger.hs.E1));
        gi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.b = h;
        h.setLoading(true);
        addView(h, b8.mf.t(-1, 48, 7, 0, 16, 0, 16));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|1|2|3|4|(1:6)(1:93)|7|8|(1:10)(1:92)|11|12|13|14|(1:16)(1:88)|(1:87)|(1:84)|(3:24|(4:27|(5:29|30|(1:32)(1:36)|33|34)(1:37)|35|25)|38)|40|41|(4:74|75|(1:77)(1:80)|78)(1:43)|44|45|46|(2:48|(11:50|51|52|53|(1:55)|56|(1:68)(1:60)|61|(1:63)|64|66))|72|51|52|53|(0)|56|(1:58)|68|61|(0)|64|66|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024b A[Catch: Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:3:0x0005, B:6:0x004d, B:7:0x005e, B:10:0x0066, B:11:0x006f, B:40:0x0175, B:44:0x01ba, B:51:0x01dc, B:56:0x01f8, B:60:0x0217, B:61:0x0222, B:63:0x024b, B:64:0x0258, B:43:0x01b7, B:83:0x01b3, B:91:0x0172, B:92:0x006a, B:93:0x0055, B:75:0x017d, B:77:0x019b, B:80:0x01af, B:14:0x00bc, B:16:0x00c8, B:18:0x00d3, B:21:0x00e3, B:24:0x00ef, B:25:0x00f3, B:27:0x00f9, B:30:0x0109, B:33:0x0169, B:36:0x0165, B:84:0x00e9, B:87:0x00dd), top: B:2:0x0005, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(id0 id0Var, String str, String str2, String str3) {
        boolean z10;
        int i3;
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
                SubscriptionManager from = SubscriptionManager.from(id0Var.getContext());
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
                    TelephonyManager telephonyManager = (TelephonyManager) id0Var.getContext().getSystemService(TelephonyManager.class);
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
            Context context = id0Var.getContext();
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
                    if (Settings.Global.getInt(id0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z11 = true;
                    }
                    sb2.append(z11);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("App: ");
                    sb2.append(org.telegram.messenger.r2.d);
                    sb2.append("\n");
                    i3 = packageInfo.versionCode % 10;
                    if (i3 != 1 || i3 == 2) {
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
                    if (!TextUtils.isEmpty(id0Var.e)) {
                        sb2.append("Error: ");
                        sb2.append(id0Var.e);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n================================================\n");
                    sb2.append("WRITE YOUR COMMENT HERE:\n");
                    sb2.append("\n");
                    sb2.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    id0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z10 = false;
            sb2.append(z10);
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            if (Settings.Global.getInt(id0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb2.append(z11);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(org.telegram.messenger.r2.d);
            sb2.append("\n");
            i3 = packageInfo.versionCode % 10;
            if (i3 != 1) {
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
            if (!TextUtils.isEmpty(id0Var.e)) {
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            id0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            id0Var.w.u1(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.M0(2131748207, "NoMailInstalled"));
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void g() {
        int i3;
        if (this.s >= 0) {
            i3 = ((org.telegram.ui.ActionBar.d2) this.w).currentAccount;
            ConnectionsManager.getInstance(i3).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        int i3;
        this.d = bundle;
        String i02 = org.telegram.messenger.bd.i0(2131750529, bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j10 = bundle == null ? 0L : bundle.getLong("amount");
        int i10 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean isEmpty = TextUtils.isEmpty(i02);
        ci.l0[] l0VarArr = this.c;
        if (isEmpty) {
            l0VarArr[0].c.setText(org.telegram.messenger.bd.M0(2131745992, null));
            i3 = 0;
        } else {
            i3 = 0;
            l0VarArr[0].c.setText(org.telegram.messenger.bd.a0(null, null, 2131745991, i02));
        }
        l0VarArr[2].setSubtitle(i10 == 7 ? org.telegram.messenger.bd.M0(2131745987, null) : org.telegram.messenger.bd.H(',', "SMSFee3TextDays", i10));
        this.a.setOnClickListener(new ai.r4(this, string4, string5, string2, 15));
        gi.d dVar = this.b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (!org.telegram.messenger.r2.b()) {
            int i11 = i3;
            String str = string3;
            int i12 = i10;
            if (TextUtils.isEmpty(string)) {
                dVar.setVisibility(8);
                return;
            }
            dVar.setVisibility(i11);
            dVar.setLoading(true);
            ai.p1 p1Var = new ai.p1(this, string, str, string2, i12, 24);
            if (org.telegram.messenger.r1.i().k()) {
                p1Var.run();
                return;
            } else {
                org.telegram.messenger.r1.i().i.add(p1Var);
                return;
            }
        }
        if (TextUtils.isEmpty(string6) || j10 <= 0) {
            boolean z11 = i3;
            dVar.setVisibility(z11 ? 1 : 0);
            dVar.setLoading(z11);
            dVar.setEnabled(z11);
            dVar.i(org.telegram.messenger.bd.M0(2131743923, null), z11, true);
            return;
        }
        boolean z12 = i3;
        dVar.setVisibility(z12 ? 1 : 0);
        dVar.setLoading(z12);
        Object[] objArr = new Object[1];
        objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j10, string6);
        dVar.i(org.telegram.messenger.bd.a0(null, null, 2131745977, objArr), z12, true);
        dVar.g(i10 == 7 ? org.telegram.messenger.bd.M0(2131745981, null) : org.telegram.messenger.bd.H(',', "SMSFeePurchaseTextDays", i10), z12);
        dVar.setOnClickListener(new ci.w0(this, string6, j10, string3, string2, i10));
    }

    public final void o() {
        int i3;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i3 = ((org.telegram.ui.ActionBar.d2) this.w).currentAccount;
            this.s = ConnectionsManager.getInstance(i3).sendRequest(tL_checkPaidAuth, new l(this, 15), 1096);
        }
    }
}
