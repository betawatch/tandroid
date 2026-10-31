package org.telegram.ui.Wallet;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ TL_wallet.currencyRates c;

    public /* synthetic */ e(f fVar, TL_wallet.currencyRates currencyrates, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = currencyrates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                f fVar = this.b;
                TL_wallet.currencyRates currencyrates = this.c;
                boolean z10 = true;
                if (currencyrates == null || currencyrates.rates == null) {
                    i10 = 1;
                } else {
                    try {
                        InputStream open = org.telegram.messenger.w0.b.getAssets().open("currencies.json");
                        try {
                            String str = e2.l0.a;
                            JSONObject jSONObject = new JSONObject(new String(f9.f.b(open), d9.j.a));
                            ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TL_wallet.currencyRate currencyrate = arrayList.get(i11);
                                i11++;
                                TL_wallet.currencyRate currencyrate2 = currencyrate;
                                if (currencyrate2 != null) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                    if (optJSONObject == null) {
                                        String str2 = currencyrate2.currency;
                                        currencyrate2.title = str2;
                                        currencyrate2.symbol = str2;
                                        currencyrate2.thousandsSeparator = ",";
                                        currencyrate2.decimalSeparator = ".";
                                        currencyrate2.spaceBetween = z10;
                                        currencyrate2.exp = 2;
                                    } else {
                                        currencyrate2.title = optJSONObject.optString("title", currencyrate2.currency);
                                        String optString = optJSONObject.optString("native", currencyrate2.currency);
                                        currencyrate2.symbol = "AED".equals(currencyrate2.currency) ? "\u20c3" : "GEL".equals(currencyrate2.currency) ? "₾" : ("$".equals(optString) && !"USD".equals(currencyrate2.currency)) || "kr".equals(optString) ? optJSONObject.optString("symbol", currencyrate2.currency) : optString;
                                        currencyrate2.thousandsSeparator = optJSONObject.optString("thousands_sep", ",");
                                        currencyrate2.decimalSeparator = optJSONObject.optString("decimal_sep", ".");
                                        currencyrate2.symbolLeft = optJSONObject.optBoolean("symbol_left");
                                        currencyrate2.spaceBetween = optJSONObject.optBoolean("space_between");
                                        currencyrate2.dropZeros = optJSONObject.optBoolean("drop_zeros");
                                        currencyrate2.exp = optJSONObject.optInt("exp", 2);
                                        if ("AED".equals(currencyrate2.currency)) {
                                            currencyrate2.title = currencyrate2.title.replace("United Arab Emirates", "UAE");
                                        } else if ("USD".equalsIgnoreCase(currencyrate2.currency)) {
                                            currencyrate2.title = currencyrate2.title.replace("United States", "US");
                                        }
                                        z10 = true;
                                    }
                                }
                            }
                            open.close();
                            i10 = 1;
                        } finally {
                        }
                    } catch (Exception e) {
                        i10 = 1;
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.g3(new e(fVar, currencyrates, i10));
                return;
            default:
                f fVar2 = this.b;
                fVar2.d = this.c;
                fVar2.c = false;
                fVar2.b.L();
                return;
        }
    }
}
