package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class of0 extends org.telegram.ui.Components.ax0 {
    public final ImageView a;
    public final fi.d b;
    public final bi.p0[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ gg0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(gg0 gg0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        this.v = gg0Var;
        bi.p0[] p0VarArr = {r4, r4, r4};
        this.c = p0VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, org.telegram.ui.Components.gb1.r(-1, 200));
        hi.e eVar = new hi.e(context, 3);
        frameLayout.addView(eVar, org.telegram.ui.Components.gb1.i(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        u6Var = ((org.telegram.ui.ActionBar.r2) gg0Var).resourceProvider;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.h(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        bi.qd qdVar = new bi.qd(context, 1, 1, 1);
        qdVar.setStarParticlesView(eVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i12 = org.telegram.ui.ActionBar.y6.Mj;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false)));
        qdVar.setBackgroundBitmap(createBitmap);
        ug.g gVar = qdVar.b;
        gVar.z = i12;
        gVar.A = org.telegram.ui.ActionBar.y6.Lj;
        gVar.b();
        frameLayout.addView(qdVar, org.telegram.ui.Components.gb1.i(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        u6Var2 = ((org.telegram.ui.ActionBar.r2) gg0Var).resourceProvider;
        bi.p0 p0Var = new bi.p0(context, 1, u6Var2);
        p0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(p0VarArr[0], org.telegram.ui.Components.gb1.x(-1, -2, 55, 0, 0, 0, 6));
        u6Var3 = ((org.telegram.ui.ActionBar.r2) gg0Var).resourceProvider;
        bi.p0 p0Var2 = new bi.p0(context, 1, u6Var3);
        p0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(p0VarArr[1], org.telegram.ui.Components.gb1.x(-1, -2, 55, 0, 0, 0, 6));
        u6Var4 = ((org.telegram.ui.ActionBar.r2) gg0Var).resourceProvider;
        bi.p0 p0Var3 = new bi.p0(context, 1, u6Var4);
        p0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new lf0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(p0VarArr[2], org.telegram.ui.Components.gb1.x(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), org.telegram.ui.Components.gb1.s(0, 0, 1.0f, 119));
        fi.d f7 = org.telegram.messenger.vh.f(24, context, null, true);
        this.b = f7;
        f7.setLoading(true);
        addView(f7, org.telegram.ui.Components.gb1.x(-1, 48, 7, 0, 16, 0, 16));
    }

    public static /* synthetic */ void n(of0 of0Var, String str, String str2, String str3) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str4 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
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
                SubscriptionManager from = SubscriptionManager.from(of0Var.getContext());
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
                            String str5 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb2.append(str5);
                            sb2.append(".Phone: ");
                            sb2.append(number);
                            sb2.append("\n");
                            sb2.append(str5);
                            sb2.append(".MCC: ");
                            sb2.append(subscriptionInfo.getMcc());
                            sb2.append("\n");
                            sb2.append(str5);
                            sb2.append(".MNC: ");
                            sb2.append(subscriptionInfo.getMnc());
                            sb2.append("\n");
                            sb2.append(str5);
                            sb2.append(".Carrier: ");
                            sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb2.append("\n\n");
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) of0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(of0Var.getContext()));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(of0Var.getContext()));
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(BuildVars.APP_ID);
            sb2.append("\n");
            int i11 = packageInfo.versionCode % 10;
            String str6 = (i11 == 1 || i11 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb2.append("App version: ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str6);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append("billing_issue");
            sb2.append("\n");
            if (!TextUtils.isEmpty(of0Var.e)) {
                sb2.append("Error: ");
                sb2.append(of0Var.e);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            of0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            of0Var.v.q1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override // org.telegram.ui.Components.ax0
    public final void g() {
        int i10;
        if (this.s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.ax0
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        this.d = bundle;
        String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j10 = bundle == null ? 0L : bundle.getLong("amount");
        int i11 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean isEmpty = TextUtils.isEmpty(countryName);
        bi.p0[] p0VarArr = this.c;
        if (isEmpty) {
            p0VarArr[0].c.setText(LocaleController.getString(R.string.SMSFee1Text));
            i10 = 0;
        } else {
            i10 = 0;
            p0VarArr[0].c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        p0VarArr[2].setSubtitle(i11 == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i11));
        this.a.setOnClickListener(new di.c4(this, string4, string5, string2, 14));
        fi.d dVar = this.b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (!BuildVars.useInvoiceBilling()) {
            int i12 = i10;
            String str = string3;
            int i13 = i11;
            if (TextUtils.isEmpty(string)) {
                dVar.setVisibility(8);
                return;
            }
            dVar.setVisibility(i12);
            dVar.setLoading(true);
            bi.sb sbVar = new bi.sb((Object) this, string, str, string2, i13, 29);
            if (BillingController.getInstance().isReady()) {
                sbVar.run();
                return;
            } else {
                BillingController.getInstance().whenSetuped(sbVar);
                return;
            }
        }
        if (TextUtils.isEmpty(string6) || j10 <= 0) {
            boolean z11 = i10;
            dVar.setVisibility(z11 ? 1 : 0);
            dVar.setLoading(z11);
            dVar.setEnabled(z11);
            dVar.i(LocaleController.getString(R.string.Unavailable), z11, true);
            return;
        }
        boolean z12 = i10;
        dVar.setVisibility(z12 ? 1 : 0);
        dVar.setLoading(z12);
        int i14 = R.string.SMSFeePurchaseTitle;
        Object[] objArr = new Object[1];
        objArr[z12 ? 1 : 0] = BillingController.getInstance().formatCurrency(j10, string6);
        dVar.i(LocaleController.formatString(i14, objArr), z12, true);
        dVar.g(i11 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11), z12);
        dVar.setOnClickListener(new bi.d1(this, string6, j10, string3, string2, i11));
    }

    public final void o() {
        int i10;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i10 = ((org.telegram.ui.ActionBar.r2) this.v).currentAccount;
            this.s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new l(this, 15), 1096);
        }
    }
}
