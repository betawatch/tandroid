package ai;

import android.os.Build;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.lb1;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator lb1Var;
        final Comparator lb1Var2;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 8;
        int i13 = 21;
        int i14 = 23;
        int i15 = 5;
        int i16 = 24;
        int i17 = 26;
        int i18 = 28;
        final int i19 = 0;
        final int i20 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((ci.p9) obj, 12));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(15, (v8) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(17, (x8) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ba(15, (ci.w1) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ba(i17, (ci.g8) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ba(27, (ci.o8) obj, tLObject));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ba(i18, (ci.x8) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ci.b9(i13, (ei.q4) obj, tL_error));
                break;
            case 8:
                gg.c cVar = (gg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ci.b9(25, cVar, tLObject));
                    break;
                }
                break;
            case 9:
                gg.i0 i0Var = (gg.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new ci.b9(i17, i0Var, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.t((hg.c) obj, tL_error, tLObject, i15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.x1(2, (hg.f) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new gg.t((hg.m) obj, tL_error, tLObject, i11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.w0) obj, tL_error, tLObject, 10));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g1) obj, tL_error, tLObject, 11));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.x1(i12, (hg.b2) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new gg.x1(12, (ii.x) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new gg.x1(17, (ii.a5) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new qb1(i18, (org.telegram.ui.web.g2) obj, tLObject));
                break;
            case 19:
                tg.y0 y0Var = (tg.y0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < tL_help_countriesList.countries.size(); i21++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i21);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        lb1Var = new c8(collator, i15);
                    } else {
                        lb1Var = new lb1(7);
                    }
                    Collections.sort(arrayList, lb1Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: tg.r
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return lb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return lb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new gr0(y0Var, hashMap, arrayList, i16));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i22 = 0; i22 < tL_help_countriesList2.countries.size(); i22++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i22);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList2.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        lb1Var2 = new c8(collator2, i15);
                    } else {
                        lb1Var2 = new lb1(7);
                    }
                    Collections.sort(arrayList2, lb1Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: tg.r
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i20) {
                                    case 0:
                                        return lb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return lb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new gr0(b1Var, hashMap2, arrayList2, 27));
                    break;
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new p2.b(i14, (tg.n1) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new p2.b(i17, (uf.c) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new gr0((uf.d) obj, tLObject, tL_error, i18));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new w9.v((yh.g) obj, tLObject, tL_error, i11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new uh.i(i12, (yh.l) obj, tLObject));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new uh.i(9, (yh.m) obj, tLObject));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new uh.i(i13, tLObject, (org.telegram.ui.web.b1) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new uh.i(i14, (yh.n5) obj, tLObject));
                break;
            default:
                yh.q8 q8Var = (yh.q8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(q8Var.c).putMessages(new ArrayList<>(Arrays.asList(q8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    q8Var.getClass();
                    break;
                }
        }
    }
}
