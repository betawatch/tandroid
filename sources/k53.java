// default package

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class k53 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l53 b;
    public final /* synthetic */ TL_wallet.currencyRates c;

    public /* synthetic */ k53(l53 l53Var, TL_wallet.currencyRates currencyrates, byte b) {
        this.a = b;
        this.b = l53Var;
        this.c = currencyrates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        switch (this.a) {
            case 0:
                l53 l53Var = this.b;
                TL_wallet.currencyRates currencyrates = this.c;
                boolean z = true;
                if (currencyrates == null || currencyrates.rates == null) {
                    b = 1;
                } else {
                    try {
                        InputStream open = a.b.getAssets().open("currencies.json");
                        try {
                            String str = hac.a;
                            JSONObject jSONObject = new JSONObject(new String(i61.b(open), kl1.a));
                            ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                TL_wallet.currencyRate currencyrate = arrayList.get(i);
                                i++;
                                TL_wallet.currencyRate currencyrate2 = currencyrate;
                                if (currencyrate2 != null) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                    if (optJSONObject == null) {
                                        String str2 = currencyrate2.currency;
                                        currencyrate2.title = str2;
                                        currencyrate2.symbol = str2;
                                        currencyrate2.thousandsSeparator = ",";
                                        currencyrate2.decimalSeparator = ".";
                                        currencyrate2.spaceBetween = z;
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
                                        z = true;
                                    }
                                }
                            }
                            open.close();
                            b = 1;
                        } finally {
                        }
                    } catch (Exception e) {
                        b = 1;
                        fc4.g(e, true);
                    }
                }
                gm.c3(new k53(l53Var, currencyrates, b));
                return;
            default:
                l53 l53Var2 = this.b;
                l53Var2.d = this.c;
                l53Var2.c = false;
                l53Var2.b.S();
                return;
        }
    }
}
