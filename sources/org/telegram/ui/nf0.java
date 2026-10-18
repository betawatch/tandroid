package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nf0 extends org.telegram.ui.Components.ow0 {
    public final ImageView a;
    public final ei.d b;
    public final ai.n0[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ eg0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(eg0 eg0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = eg0Var;
        ai.n0[] n0VarArr = {r4, r4, r4};
        this.c = n0VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.n(-1, 200));
        gi.f fVar = new gi.f(context, 3);
        frameLayout.addView(fVar, w7.z5.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.n2) eg0Var).resourceProvider;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 1, -1));
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        ai.zd zdVar = new ai.zd(context, 1, 1, 1);
        zdVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.h6.Mj;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false)));
        zdVar.setBackgroundBitmap(createBitmap);
        tg.g gVar = zdVar.b;
        gVar.z = i11;
        gVar.A = org.telegram.ui.ActionBar.h6.Lj;
        gVar.b();
        frameLayout.addView(zdVar, w7.z5.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        d6Var2 = ((org.telegram.ui.ActionBar.n2) eg0Var).resourceProvider;
        ai.n0 n0Var = new ai.n0(context, 1, d6Var2);
        n0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(n0VarArr[0], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        d6Var3 = ((org.telegram.ui.ActionBar.n2) eg0Var).resourceProvider;
        ai.n0 n0Var2 = new ai.n0(context, 1, d6Var3);
        n0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(n0VarArr[1], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        d6Var4 = ((org.telegram.ui.ActionBar.n2) eg0Var).resourceProvider;
        ai.n0 n0Var3 = new ai.n0(context, 1, d6Var4);
        n0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new kf0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(n0VarArr[2], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), w7.z5.o(0, 0, 1.0f, 119));
        ei.d f7 = org.telegram.messenger.lk.f(24, context, null, true);
        this.b = f7;
        f7.setLoading(true);
        addView(f7, w7.z5.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static /* synthetic */ void o(nf0 nf0Var, String str, String str2, String str3) {
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
                SubscriptionManager from = SubscriptionManager.from(nf0Var.getContext());
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
                    TelephonyManager telephonyManager = (TelephonyManager) nf0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(nf0Var.getContext()));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(nf0Var.getContext()));
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
            if (!TextUtils.isEmpty(nf0Var.e)) {
                sb2.append("Error: ");
                sb2.append(nf0Var.e);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            nf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            nf0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public final void g() {
        int i10;
        if (this.s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.ow0
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
        ai.n0[] n0VarArr = this.c;
        if (isEmpty) {
            n0VarArr[0].c.setText(LocaleController.getString(R.string.SMSFee1Text));
            i10 = 0;
        } else {
            i10 = 0;
            n0VarArr[0].c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        n0VarArr[2].setSubtitle(i11 == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i11));
        this.a.setOnClickListener(new ci.b4(this, string4, string5, string2, 14));
        ei.d dVar = this.b;
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
            ai.ub ubVar = new ai.ub((Object) this, string, str, string2, i13, 29);
            if (BillingController.getInstance().isReady()) {
                ubVar.run();
                return;
            } else {
                BillingController.getInstance().whenSetuped(ubVar);
                return;
            }
        }
        if (TextUtils.isEmpty(string6) || j10 <= 0) {
            boolean z11 = i10;
            dVar.setVisibility(z11 ? 1 : 0);
            dVar.setLoading(z11);
            dVar.setEnabled(z11);
            dVar.g(LocaleController.getString(R.string.Unavailable), z11, true);
            return;
        }
        boolean z12 = i10;
        dVar.setVisibility(z12 ? 1 : 0);
        dVar.setLoading(z12);
        int i14 = R.string.SMSFeePurchaseTitle;
        Object[] objArr = new Object[1];
        objArr[z12 ? 1 : 0] = BillingController.getInstance().formatCurrency(j10, string6);
        dVar.g(LocaleController.formatString(i14, objArr), z12, true);
        dVar.f(i11 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11), z12);
        dVar.setOnClickListener(new ai.e1(this, string6, j10, string3, string2, i11));
    }

    public final void p() {
        int i10;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i10 = ((org.telegram.ui.ActionBar.n2) this.v).currentAccount;
            this.s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new m(this, 14), 1096);
        }
    }
}
