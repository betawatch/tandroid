package bi;

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
import org.telegram.ui.Components.sx0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator pVar;
        final Comparator pVar2;
        int i10 = this.a;
        int i11 = 27;
        int i12 = 2;
        int i13 = 11;
        int i14 = 4;
        int i15 = 22;
        int i16 = 28;
        int i17 = 16;
        int i18 = 24;
        final int i19 = 1;
        final int i20 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(i13, (h2) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(i15, (i9) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(23, (r9) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new a1.e(i18, (aa) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new af(15, (di.u4) obj, tL_error));
                break;
            case 5:
                fg.c cVar = (fg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new af(26, cVar, tLObject));
                    break;
                }
                break;
            case 6:
                fg.h0 h0Var = (fg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new af(i11, h0Var, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.c) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new fg.s1(i12, (gg.f) obj, tLObject));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.n) obj, tL_error, tLObject, i16));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.a1) obj, tL_error, tLObject, i12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.m1) obj, tL_error, tLObject, 3));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new fg.s1(8, (gg.k2) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new fg.s1(i13, (hi.y) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new fg.s1(i17, (hi.d5) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(i19, (org.telegram.ui.web.i2) obj, tLObject));
                break;
            case 16:
                sg.z0 z0Var = (sg.z0) obj;
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
                        pVar = new q3(collator, i14);
                    } else {
                        pVar = new sg.p(0);
                    }
                    Collections.sort(arrayList, pVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: sg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i20) {
                                    case 0:
                                        return pVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return pVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new sx0(z0Var, hashMap, arrayList, i17));
                    break;
                }
                break;
            case 17:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj;
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
                        pVar2 = new q3(collator2, i14);
                    } else {
                        pVar2 = new sg.p(0);
                    }
                    Collections.sort(arrayList2, pVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: sg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return pVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return pVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new sx0(y1Var, hashMap2, arrayList2, 19));
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(i18, (sg.p1) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, (tf.c) obj, tLObject));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new sx0(obj, tLObject, (Object) tL_error, 20));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new sx0(obj, tLObject, (Object) tL_error, i16));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new u2.k0(9, (xh.m) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new u2.k0(10, (xh.n) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new u2.k0(i15, tLObject, (org.telegram.ui.web.y1) obj));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new u2.k0(i18, (xh.n5) obj, tLObject));
                break;
            case 26:
                xh.r8 r8Var = (xh.r8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(r8Var.c).putMessages(new ArrayList<>(Arrays.asList(r8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    r8Var.getClass();
                    break;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new xh.x((sa) obj, i16));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new yg.q(14, (zh.u4) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yg.q(i17, (zh.w4) obj, tLObject));
                break;
        }
    }
}
