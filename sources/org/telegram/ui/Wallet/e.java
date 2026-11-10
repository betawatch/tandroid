package org.telegram.ui.Wallet;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ TL_wallet.currencyRates c;

    public /* synthetic */ e(f fVar, TL_wallet.currencyRates currencyrates, int i7) {
        this.a = i7;
        this.b = fVar;
        this.c = currencyrates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                f fVar = this.b;
                TL_wallet.currencyRates currencyrates = this.c;
                boolean z9 = true;
                if (currencyrates == null || currencyrates.rates == null) {
                    i7 = 1;
                } else {
                    try {
                        InputStream open = org.telegram.messenger.t0.b.getAssets().open("currencies.json");
                        try {
                            String str = h2.m0.a;
                            JSONObject jSONObject = new JSONObject(new String(i9.f.b(open), g9.j.a));
                            ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TL_wallet.currencyRate currencyrate = arrayList.get(i10);
                                i10++;
                                TL_wallet.currencyRate currencyrate2 = currencyrate;
                                if (currencyrate2 != null) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                    if (optJSONObject == null) {
                                        String str2 = currencyrate2.currency;
                                        currencyrate2.title = str2;
                                        currencyrate2.symbol = str2;
                                        currencyrate2.thousandsSeparator = ",";
                                        currencyrate2.decimalSeparator = ".";
                                        currencyrate2.spaceBetween = z9;
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
                                        z9 = true;
                                    }
                                }
                            }
                            open.close();
                            i7 = 1;
                        } finally {
                        }
                    } catch (Exception e10) {
                        i7 = 1;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new e(fVar, currencyrates, i7));
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
