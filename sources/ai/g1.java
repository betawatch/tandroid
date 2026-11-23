package ai;

import android.os.Build;
import android.util.Log;
import di.mc;
import di.p8;
import di.s4;
import fi.b6;
import fi.d6;
import fi.l4;
import hi.a8;
import hi.c7;
import hi.k7;
import hi.u6;
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
import java.util.concurrent.CountDownLatch;
import ki.s3;
import oi.y4;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator qw0Var;
        final Comparator qw0Var2;
        int i7 = 27;
        int i10 = 26;
        int i11 = 28;
        int i12 = 5;
        int i13 = 2;
        int i14 = 14;
        int i15 = 13;
        int i16 = 6;
        int i17 = 24;
        final int i18 = 0;
        final int i19 = 1;
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    int size = arrayList2.size();
                    while (i18 < size) {
                        Object obj = arrayList2.get(i18);
                        i18++;
                        if (obj instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (m1.class) {
                        m1.a = arrayList;
                        m1.k(arrayList);
                    }
                    Log.d("Dictation", "speech models: " + arrayList.size() + " from the server");
                    DictationAsr.P();
                    DictationAsr.p();
                } else {
                    p5.c.t(new StringBuilder("speech models: list failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                }
                synchronized (m1.class) {
                    m1.c = null;
                }
                countDownLatch.countDown();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new c1.a(i10, (di.b0) this.b, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new c1.a(i7, (di.c0) this.b, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.f2(12, tLObject, (h0) this.b));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new di.f2(i14, (p8) this.b, tLObject));
                return;
            case 5:
                mc mcVar = (mc) this.b;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    ur.a0(mcVar.n1).j1(new ArrayList(Arrays.asList(mcVar.G1.k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    mcVar.getClass();
                    return;
                }
            case 6:
                org.telegram.messenger.g0.g3(new f2.a((a8) this.b, i15));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new l4(i13, (b6) this.b, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new l4(4, (d6) this.b, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new hi.c(i13, (hi.r1) this.b, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new hi.c(12, (u6) this.b, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new hi.c(i14, (c7) this.b, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new hi.c(15, (k7) this.b, tLObject));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ii.a((r10) this.b, tLObject, tL_error, i18));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new hi.c(22, (ii.m) this.b, tLObject));
                return;
            case 15:
                jg.h0 h0Var = (jg.h0) this.b;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new hi.c(i17, h0Var, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new di.a8((kg.c) this.b, tL_error, tLObject, i7));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new ji.i(i19, (kg.f) this.b, tLObject));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new di.a8((kg.n) this.b, tL_error, tLObject, i11));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new kg.y((kg.u0) this.b, tL_error, tLObject, i13));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new kg.y((kg.e1) this.b, tL_error, tLObject, 3));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new ji.i(i16, (kg.v1) this.b, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new ji.i(i14, (s3) this.b, tL_error));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new oi.t(i18, (oi.v) this.b, tLObject));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new oi.t(i12, (y4) this.b, tLObject));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new u4(i10, (org.telegram.ui.web.t1) this.b, tLObject));
                return;
            case 26:
                wg.u0 u0Var = (wg.u0) this.b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i20 = 0; i20 < tL_help_countriesList.countries.size(); i20++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i20);
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
                                arrayList3.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(hd.E0().y != null ? hd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        qw0Var = new s4(collator, 6);
                    } else {
                        qw0Var = new qw0(13);
                    }
                    Collections.sort(arrayList3, qw0Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new es0((Object) u0Var, (Object) hashMap, (Object) arrayList3, i11));
                    return;
                }
                return;
            case 27:
                ug.z zVar = (ug.z) this.b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i21 = 0; i21 < tL_help_countriesList2.countries.size(); i21++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i21);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String N0 = hd.N0(2131750504, null);
                                tL_help_country2.default_name = N0;
                                tL_help_country2.name = N0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList4.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(hd.E0().y != null ? hd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        qw0Var2 = new s4(collator2, 6);
                    } else {
                        qw0Var2 = new qw0(13);
                    }
                    Collections.sort(arrayList4, qw0Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new wg.p(zVar, hashMap2, arrayList4, i19));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new wg.q(i12, (wg.e1) this.b, tLObject));
                return;
        }
    }
}
