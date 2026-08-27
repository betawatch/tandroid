package gh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.s6;
import lh.kc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a9;
import org.telegram.ui.ex0;
import org.telegram.ui.k61;
import org.telegram.ui.ke;
import org.telegram.ui.om0;
import org.telegram.ui.q21;
import org.telegram.ui.qb;
import org.telegram.ui.qe;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.ti;
import org.telegram.ui.tk0;
import org.telegram.ui.x21;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i1(u7 u7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.d = u7Var;
        this.e = obj;
        this.b = messageObject;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x039a A[Catch: Exception -> 0x04dc, TryCatch #0 {Exception -> 0x04dc, blocks: (B:99:0x025c, B:101:0x0278, B:102:0x027a, B:103:0x0282, B:105:0x0286, B:107:0x0299, B:108:0x02a0, B:110:0x02a6, B:111:0x02aa, B:113:0x02b0, B:114:0x02b4, B:116:0x02c3, B:117:0x02d6, B:119:0x02dc, B:121:0x02e8, B:123:0x02ee, B:125:0x02f8, B:127:0x0306, B:128:0x030d, B:130:0x0313, B:132:0x031d, B:134:0x032b, B:135:0x032f, B:137:0x0335, B:139:0x033f, B:141:0x034d, B:142:0x0351, B:144:0x0357, B:146:0x035d, B:148:0x0367, B:150:0x036d, B:151:0x0370, B:152:0x0376, B:155:0x037d, B:157:0x0382, B:162:0x0394, B:164:0x039a, B:166:0x03b0, B:174:0x03c5, B:176:0x03cf, B:178:0x0406, B:180:0x0419, B:181:0x0420, B:183:0x0426, B:184:0x042a, B:186:0x0430, B:187:0x0434, B:189:0x043e, B:190:0x0448, B:192:0x044e, B:194:0x0458, B:198:0x0463, B:200:0x0469, B:202:0x0473, B:204:0x04aa, B:205:0x04b7, B:159:0x0390, B:219:0x027f), top: B:98:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b0 A[Catch: Exception -> 0x04dc, TryCatch #0 {Exception -> 0x04dc, blocks: (B:99:0x025c, B:101:0x0278, B:102:0x027a, B:103:0x0282, B:105:0x0286, B:107:0x0299, B:108:0x02a0, B:110:0x02a6, B:111:0x02aa, B:113:0x02b0, B:114:0x02b4, B:116:0x02c3, B:117:0x02d6, B:119:0x02dc, B:121:0x02e8, B:123:0x02ee, B:125:0x02f8, B:127:0x0306, B:128:0x030d, B:130:0x0313, B:132:0x031d, B:134:0x032b, B:135:0x032f, B:137:0x0335, B:139:0x033f, B:141:0x034d, B:142:0x0351, B:144:0x0357, B:146:0x035d, B:148:0x0367, B:150:0x036d, B:151:0x0370, B:152:0x0376, B:155:0x037d, B:157:0x0382, B:162:0x0394, B:164:0x039a, B:166:0x03b0, B:174:0x03c5, B:176:0x03cf, B:178:0x0406, B:180:0x0419, B:181:0x0420, B:183:0x0426, B:184:0x042a, B:186:0x0430, B:187:0x0434, B:189:0x043e, B:190:0x0448, B:192:0x044e, B:194:0x0458, B:198:0x0463, B:200:0x0469, B:202:0x0473, B:204:0x04aa, B:205:0x04b7, B:159:0x0390, B:219:0x027f), top: B:98:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c A[Catch: Exception -> 0x00f4, TryCatch #3 {Exception -> 0x00f4, blocks: (B:36:0x00e0, B:38:0x00ea, B:40:0x00f0, B:41:0x00f8, B:43:0x0136, B:45:0x013c, B:47:0x0142, B:48:0x0145, B:50:0x014a, B:52:0x0150, B:53:0x0153, B:56:0x015c, B:58:0x0166, B:60:0x0176, B:62:0x0182, B:64:0x018e, B:68:0x01dc, B:70:0x01e2, B:71:0x01e5, B:73:0x01ee, B:74:0x01f1, B:75:0x01fb, B:78:0x0206, B:84:0x0219, B:86:0x021f, B:94:0x024f, B:96:0x0255, B:223:0x019f, B:225:0x01b3, B:227:0x01bd, B:229:0x01d7, B:235:0x00ff, B:237:0x0109, B:239:0x010f, B:240:0x0112, B:241:0x0116, B:243:0x0120, B:245:0x0126, B:247:0x012c, B:248:0x012f), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166 A[Catch: Exception -> 0x00f4, TryCatch #3 {Exception -> 0x00f4, blocks: (B:36:0x00e0, B:38:0x00ea, B:40:0x00f0, B:41:0x00f8, B:43:0x0136, B:45:0x013c, B:47:0x0142, B:48:0x0145, B:50:0x014a, B:52:0x0150, B:53:0x0153, B:56:0x015c, B:58:0x0166, B:60:0x0176, B:62:0x0182, B:64:0x018e, B:68:0x01dc, B:70:0x01e2, B:71:0x01e5, B:73:0x01ee, B:74:0x01f1, B:75:0x01fb, B:78:0x0206, B:84:0x0219, B:86:0x021f, B:94:0x024f, B:96:0x0255, B:223:0x019f, B:225:0x01b3, B:227:0x01bd, B:229:0x01d7, B:235:0x00ff, B:237:0x0109, B:239:0x010f, B:240:0x0112, B:241:0x0116, B:243:0x0120, B:245:0x0126, B:247:0x012c, B:248:0x012f), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2 A[Catch: Exception -> 0x00f4, TryCatch #3 {Exception -> 0x00f4, blocks: (B:36:0x00e0, B:38:0x00ea, B:40:0x00f0, B:41:0x00f8, B:43:0x0136, B:45:0x013c, B:47:0x0142, B:48:0x0145, B:50:0x014a, B:52:0x0150, B:53:0x0153, B:56:0x015c, B:58:0x0166, B:60:0x0176, B:62:0x0182, B:64:0x018e, B:68:0x01dc, B:70:0x01e2, B:71:0x01e5, B:73:0x01ee, B:74:0x01f1, B:75:0x01fb, B:78:0x0206, B:84:0x0219, B:86:0x021f, B:94:0x024f, B:96:0x0255, B:223:0x019f, B:225:0x01b3, B:227:0x01bd, B:229:0x01d7, B:235:0x00ff, B:237:0x0109, B:239:0x010f, B:240:0x0112, B:241:0x0116, B:243:0x0120, B:245:0x0126, B:247:0x012c, B:248:0x012f), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee A[Catch: Exception -> 0x00f4, TryCatch #3 {Exception -> 0x00f4, blocks: (B:36:0x00e0, B:38:0x00ea, B:40:0x00f0, B:41:0x00f8, B:43:0x0136, B:45:0x013c, B:47:0x0142, B:48:0x0145, B:50:0x014a, B:52:0x0150, B:53:0x0153, B:56:0x015c, B:58:0x0166, B:60:0x0176, B:62:0x0182, B:64:0x018e, B:68:0x01dc, B:70:0x01e2, B:71:0x01e5, B:73:0x01ee, B:74:0x01f1, B:75:0x01fb, B:78:0x0206, B:84:0x0219, B:86:0x021f, B:94:0x024f, B:96:0x0255, B:223:0x019f, B:225:0x01b3, B:227:0x01bd, B:229:0x01d7, B:235:0x00ff, B:237:0x0109, B:239:0x010f, B:240:0x0112, B:241:0x0116, B:243:0x0120, B:245:0x0126, B:247:0x012c, B:248:0x012f), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0206 A[Catch: Exception -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f4, blocks: (B:36:0x00e0, B:38:0x00ea, B:40:0x00f0, B:41:0x00f8, B:43:0x0136, B:45:0x013c, B:47:0x0142, B:48:0x0145, B:50:0x014a, B:52:0x0150, B:53:0x0153, B:56:0x015c, B:58:0x0166, B:60:0x0176, B:62:0x0182, B:64:0x018e, B:68:0x01dc, B:70:0x01e2, B:71:0x01e5, B:73:0x01ee, B:74:0x01f1, B:75:0x01fb, B:78:0x0206, B:84:0x0219, B:86:0x021f, B:94:0x024f, B:96:0x0255, B:223:0x019f, B:225:0x01b3, B:227:0x01bd, B:229:0x01d7, B:235:0x00ff, B:237:0x0109, B:239:0x010f, B:240:0x0112, B:241:0x0116, B:243:0x0120, B:245:0x0126, B:247:0x012c, B:248:0x012f), top: B:35:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        pf.c cVar;
        String str;
        Location location;
        Locale locale;
        List<Address> list;
        List<Address> list2;
        int i10;
        boolean z10;
        boolean z11;
        String countryName;
        boolean z12;
        boolean z13;
        Address address;
        StringBuilder sb2;
        StringBuilder sb3;
        Address address2;
        boolean z14;
        String str2;
        int i11;
        pf.c cVar2 = (pf.c) this.d;
        Locale locale2 = (Locale) this.e;
        String str3 = (String) this.b;
        Locale locale3 = (Locale) this.f;
        Location location2 = (Location) this.h;
        String str4 = (String) this.c;
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = cVar2.e ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str3, 5);
            List<Address> fromLocationName2 = cVar2.d ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str3, 5) : null;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int i13 = 0;
            while (i13 < fromLocationName.size()) {
                Address address3 = fromLocationName.get(i13);
                Address address4 = (fromLocationName2 == null || i13 >= fromLocationName2.size()) ? null : fromLocationName2.get(i13);
                if (address3.hasLatitude() && address3.hasLongitude()) {
                    i10 = i13;
                    double latitude = address3.getLatitude();
                    double longitude = address3.getLongitude();
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder();
                    locale = locale2;
                    StringBuilder sb6 = new StringBuilder();
                    String locality = address3.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address3.getAdminArea();
                    }
                    list = fromLocationName2;
                    String str5 = locality;
                    if (address4 != null && TextUtils.isEmpty(address4.getLocality())) {
                        address4.getAdminArea();
                    }
                    str = str4;
                    try {
                        String thoroughfare = address3.getThoroughfare();
                        location = location2;
                        if (TextUtils.isEmpty(thoroughfare)) {
                            list2 = fromLocationName;
                        } else {
                            list2 = fromLocationName;
                            try {
                                if (!TextUtils.equals(thoroughfare, address3.getAdminArea())) {
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(thoroughfare);
                                    z10 = false;
                                    if (TextUtils.isEmpty(str5)) {
                                        z11 = true;
                                    } else {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(str5);
                                        if (sb6 != null) {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(str5);
                                        }
                                        z11 = false;
                                    }
                                    StringBuilder sb7 = sb6;
                                    countryName = address3.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        z12 = z10;
                                        z13 = z11;
                                        address = address4;
                                    } else {
                                        z12 = z10;
                                        z13 = z11;
                                        if (!"US".equals(address3.getCountryCode()) && !"AE".equals(address3.getCountryCode()) && (!"GB".equals(address3.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                            str2 = countryName;
                                            address = address4;
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(str2);
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(countryName);
                                        }
                                        String[] split = countryName.split(" ");
                                        int length = split.length;
                                        str2 = "";
                                        address = address4;
                                        int i14 = 0;
                                        while (i14 < length) {
                                            int i15 = length;
                                            String str6 = split[i14];
                                            if (str6.length() > 0) {
                                                i11 = i14;
                                                str2 = str2 + str6.charAt(0);
                                            } else {
                                                i11 = i14;
                                            }
                                            i14 = i11 + 1;
                                            length = i15;
                                        }
                                        if (sb5.length() > 0) {
                                        }
                                        sb5.append(str2);
                                        if (sb4.length() > 0) {
                                        }
                                        sb4.append(countryName);
                                    }
                                    if (cVar2.e) {
                                        StringBuilder sb8 = new StringBuilder();
                                        try {
                                            String addressLine = address3.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb8.append(addressLine);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        if (sb8.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb8.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportAddress);
                                            arrayList.add(tL_messageMediaVenue);
                                        }
                                        cVar = cVar2;
                                    } else {
                                        if (sb7 == null || sb7.length() <= 0) {
                                            cVar = cVar2;
                                            sb2 = sb5;
                                            sb3 = sb4;
                                            address2 = address3;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                            cVar = cVar2;
                                            try {
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                address2 = address3;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb7.toString();
                                                tL_messageMediaVenue2.icon = "pin";
                                                tL_messageMediaVenue2.address = LocaleController.getString(z12 ? R.string.PassportCity : R.string.PassportStreet1);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                                    tL_geoPointAddress.country_iso2 = address.getCountryCode();
                                                    String locality2 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address.getSubAdminArea();
                                                    }
                                                    String adminArea = address.getAdminArea();
                                                    StringBuilder sb9 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb3 = sb4;
                                                        sb2 = sb5;
                                                    } else {
                                                        sb3 = sb4;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        sb2 = sb5;
                                                        tL_geoPointAddress2.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress3.city = locality2;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (!z12) {
                                                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str5) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str5) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getSubLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str5) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                            sb9 = null;
                                                        } else {
                                                            if (sb9.length() > 0) {
                                                                sb9.append(", ");
                                                            }
                                                            sb9.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            int i16 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i16 >= strArr.length) {
                                                                    break;
                                                                }
                                                                if (strArr[i16].equalsIgnoreCase(sb9.toString())) {
                                                                    z14 = true;
                                                                    break;
                                                                }
                                                                i16++;
                                                            }
                                                            if (!TextUtils.isEmpty(sb9)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                                tL_geoPointAddress4.flags |= 4;
                                                                tL_geoPointAddress4.street = sb9.toString();
                                                            }
                                                            if (!z14) {
                                                                arrayList.add(tL_messageMediaVenue2);
                                                                if (arrayList.size() >= i12) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z14 = false;
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                        }
                                                        if (!z14) {
                                                        }
                                                    }
                                                } else {
                                                    sb3 = sb4;
                                                    sb2 = sb5;
                                                }
                                                z14 = false;
                                                if (!z14) {
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (!z13 && !hashSet2.contains(sb2.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint3;
                                            tL_geoPoint3.lat = latitude;
                                            tL_geoPoint3._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb2.toString();
                                            tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                            tL_messageMediaVenue3.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                            hashSet2.add(tL_messageMediaVenue3.title);
                                            tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportCity);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                                tL_geoPointAddress5.country_iso2 = address.getCountryCode();
                                                String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getSubAdminArea();
                                                }
                                                String adminArea2 = address.getAdminArea();
                                                if (!TextUtils.isEmpty(adminArea2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress6.state = adminArea2;
                                                    tL_geoPointAddress6.flags |= 1;
                                                }
                                                if (!TextUtils.isEmpty(locality3)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress7.city = locality3;
                                                    tL_geoPointAddress7.flags |= 2;
                                                }
                                            }
                                            arrayList.add(tL_messageMediaVenue3);
                                            if (arrayList.size() >= i12) {
                                                break;
                                            }
                                        }
                                        if (sb3.length() > 0 && !hashSet.contains(sb3.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb3.toString();
                                            tL_messageMediaVenue4.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                            tL_messageMediaVenue4.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                            hashSet.add(tL_messageMediaVenue4.title);
                                            tL_messageMediaVenue4.address = LocaleController.getString(R.string.Country);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                            }
                                            arrayList.add(tL_messageMediaVenue4);
                                            if (arrayList.size() >= i12) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused3) {
                                cVar = cVar2;
                            }
                        }
                        String subLocality = address3.getSubLocality();
                        if (TextUtils.isEmpty(subLocality)) {
                            String locality4 = address3.getLocality();
                            if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str5)) {
                                sb6 = null;
                                z10 = true;
                                if (TextUtils.isEmpty(str5)) {
                                }
                                StringBuilder sb72 = sb6;
                                countryName = address3.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                if (cVar2.e) {
                                }
                            } else {
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(locality4);
                            }
                        } else {
                            if (sb6.length() > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(subLocality);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str5)) {
                        }
                        StringBuilder sb722 = sb6;
                        countryName = address3.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        if (cVar2.e) {
                        }
                    } catch (Exception unused4) {
                        cVar = cVar2;
                    }
                } else {
                    locale = locale2;
                    list = fromLocationName2;
                    cVar = cVar2;
                    str = str4;
                    location = location2;
                    list2 = fromLocationName;
                    i10 = i13;
                }
                i13 = i10 + 1;
                locale2 = locale;
                str4 = str;
                fromLocationName2 = list;
                fromLocationName = list2;
                location2 = location;
                cVar2 = cVar;
            }
        } catch (Exception unused5) {
        }
        cVar = cVar2;
        str = str4;
        location = location2;
        AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x036f, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x033a, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0373, code lost:
    
        if (r8.creator != false) goto L102;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.n2 U;
        TLRPC.ChatParticipants chatParticipants;
        String str;
        int i10 = 8;
        TLRPC.User user = null;
        int i11 = 2;
        boolean z10 = true;
        int i12 = 0;
        switch (this.a) {
            case 0:
                k2.P((k2) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLObject) this.b, (e1) this.f, (Utilities.Callback) this.h, (TLRPC.TL_error) this.c);
                break;
            case 1:
                hh.i5.c1((hh.i5) this.d, (TLObject) this.b, (CharSequence) this.e, (TL_stars.TL_starGiftUnique) this.f, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h, (TLRPC.TL_error) this.c);
                break;
            case 2:
                hh.i5.x0((hh.i5) this.d, (TLObject) this.b, (cg.y2[]) this.e, (Long) this.f, (androidx.car.app.utils.a) this.h, (TLRPC.TL_error) this.c);
                break;
            case 3:
                u7 u7Var = (u7) this.d;
                List list = (List) this.e;
                cg.u0 u0Var = (cg.u0) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                n2.g gVar = (n2.g) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new hh.y5(u0Var, i12));
                    break;
                } else {
                    n2.l lVar = (n2.l) list.get(0);
                    if (lVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new hh.y5(u0Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(u7Var.a).sendRequest(tL_payments_canPurchaseStore, new cg.j0(lVar, gVar, (Utilities.Callback2) u0Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, 2));
                        break;
                    }
                }
            case 4:
                u7 u7Var2 = (u7) this.d;
                Runnable runnable = (Runnable) this.e;
                MessageObject messageObject = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (u7Var2.e) {
                    u7Var2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
                    break;
                } else {
                    u7.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 5:
                u7 u7Var3 = (u7) this.d;
                TLObject tLObject = (TLObject) this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                ti tiVar = (ti) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    u7Var3.Y(messageObject2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, tiVar, null);
                } else {
                    u7.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                tiVar.run();
                break;
            case 6:
                u7 u7Var4 = (u7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject3 = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                zArr[0] = true;
                u7Var4.a0(messageObject3, inputInvoice2, tL_payments_paymentFormStars2, new hh.p1(1, callback2));
                break;
            case 7:
                k7 k7Var = (k7) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                m7 m7Var = (m7) this.f;
                Utilities.Callback callback3 = (Utilities.Callback) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                long j10 = k7Var.b;
                int i13 = k7Var.a;
                HashMap hashMap = k7Var.h;
                ArrayList arrayList = k7Var.e;
                k7Var.k = false;
                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i14 = tL_starGiftCollection2.collection_id;
                    m7Var.d = i14;
                    hashMap.put(Integer.valueOf(i14), m7Var);
                    k7Var.j();
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var);
                    if (callback3 != null) {
                        callback3.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error2 != null && (U = LaunchActivity.U()) != null) {
                        mc.a0(U).d0(tL_error2, false);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    k7Var.j();
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var);
                    break;
                }
                break;
            case 8:
                jh.j6 j6Var = (jh.j6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.c;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(j6Var.e);
                sb2.append("{");
                sb2.append(j6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(s6.a(arrayList2));
                pa.v("}", sb2);
                ArrayList arrayList6 = j6Var.g;
                arrayList6.clear();
                arrayList6.addAll(arrayList3);
                j6Var.t = false;
                int i15 = j6Var.c;
                MessagesController.getInstance(i15).putUsers(arrayList4, true);
                MessagesController.getInstance(i15).putChats(arrayList5, true);
                if (j6Var.v) {
                    j6Var.v = false;
                    j6Var.y = null;
                    j6Var.j();
                    break;
                } else {
                    j6Var.m.addAll(hashSet);
                    j6Var.k.clear();
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        j6Var.t((MessageObject) arrayList2.get(i16), true);
                    }
                    j6Var.d(false);
                    jh.i6 i6Var = j6Var.y;
                    if (i6Var != null) {
                        i6Var.run(0);
                        j6Var.y = null;
                    }
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var);
                    break;
                }
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                lh.mc mcVar = (lh.mc) this.h;
                kc kcVar = (kc) this.c;
                iArr[0] = 0;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        mcVar.run();
                        break;
                    }
                }
                kcVar.run(null);
                break;
            case 10:
                TLObject tLObject4 = (TLObject) this.b;
                String[] strArr = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final p80 p80Var = (p80) this.f;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str2 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    strArr[0] = str2;
                    if (str2.startsWith("https://")) {
                        str2 = str2.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.i8
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(abs);
                            frameLayout2.setScaleY(abs);
                            if (floatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                p80Var.setText(str2);
                            }
                        }
                    });
                    duration.addListener(new a9(atomicBoolean, p80Var, str2));
                    duration.start();
                    new mc(e3Var.topBulletinContainer, c6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 11:
                qb qbVar = (qb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList7 = (ArrayList) this.b;
                ArrayList arrayList8 = (ArrayList) this.f;
                ArrayList arrayList9 = (ArrayList) this.h;
                org.telegram.ui.pa paVar = (org.telegram.ui.pa) this.c;
                TLRPC.Chat chat = qbVar.s;
                qbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = qbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = qbVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i12 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList7.add(LocaleController.getString(R.string.Restrict));
                        pa.n(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                    }
                    arrayList7.add(LocaleController.getString(R.string.Ban));
                    pa.n(R.drawable.msg_block, 35, arrayList8, arrayList9);
                }
                paVar.run();
                break;
            case 12:
                rn rnVar = (rn) this.d;
                we.d dVar = (we.d) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                String str3 = (String) this.h;
                TLObject tLObject5 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                dVar.b();
                b70 I = b70.I(rnVar, s1Var);
                ol0 ol0Var = new ol0(rnVar.getParentActivity(), rnVar.aa);
                I.p = new ke(ol0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new qe(rnVar, ol0Var, str3, i11), false);
                if (tLObject5 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject5;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i17);
                        i17++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new rd(i10, rnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                ol0Var.e(I);
                ol0Var.f(s1Var, characterStyle, null, false);
                rnVar.showDialog(ol0Var);
                break;
            case 13:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.e;
                lh.d dVar2 = (lh.d) this.b;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error3 != null) {
                    new mc(ab.a(context), c6Var2).d0(tL_error3, false);
                    break;
                } else {
                    dVar2.setLoading(false);
                    e3Var2.dismiss();
                    new mc(ab.a(context), c6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable2.run();
                    break;
                }
            case 14:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) this.d;
                TLObject tLObject6 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                ex0Var.getClass();
                if (!(tLObject6 instanceof TLRPC.TL_stickers_suggestedShortName) || (str = ((TLRPC.TL_stickers_suggestedShortName) tLObject6).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    ex0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z10) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 15:
                xm0.W((xm0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (om0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 16:
                x21.n((x21) this.d, (TLObject) this.b, (CharSequence) this.e, (TLRPC.TL_error) this.c, (byte[]) this.f, (String) this.h);
                break;
            case 17:
                TLObject tLObject7 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                lg0 lg0Var = (lg0) this.c;
                x21 x21Var = new x21(context2, c6Var3, 0L, bArr);
                x21Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject7);
                x21Var.s = new q21(n2Var, context2, c6Var3, lg0Var);
                x21Var.show();
                break;
            case 18:
                k61.R((k61) this.d, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.e, (TLRPC.User) this.b, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 19:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                String str4 = (String) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                String str5 = (String) this.h;
                org.telegram.ui.ActionBar.c6 c6Var4 = z0Var.e;
                if (tLObject8 != null) {
                    if (tLObject8 instanceof TLRPC.TL_urlAuthResultRequest) {
                        tk0.b(false, z0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject8, null, null, null, false, z0Var);
                        break;
                    } else if (tLObject8 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        tk0.b(false, z0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject8, null, null, null, false, z0Var);
                        break;
                    } else if (tLObject8 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.y4.p0(z0Var.getContext(), str4, false, true, true, false, 0L, null, null, null);
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        new mc(z0Var, c6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str5), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new mc(z0Var, c6Var4).d0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                String str6 = (String) this.f;
                String str7 = (String) this.h;
                String str8 = (String) this.c;
                if (file == null) {
                    b2Var.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new gs0(file, iArr3, new cg.h0(z0Var2, iArr3, file, b2Var, str6, str7, str8, 13), 16));
                    break;
                }
            case 21:
                a();
                break;
            default:
                pf.m0 m0Var = (pf.m0) this.d;
                String str9 = (String) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.b;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                pf.u0 u0Var2 = m0Var.e;
                String str10 = u0Var2.m0;
                if (str10 != null && str10.equals(str9)) {
                    if (tL_error5 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject9;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                        }
                    }
                    u0Var2.R(user);
                    u0Var2.p0 = 0;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ i1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ i1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.c6 c6Var, lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.a = 13;
        this.c = tL_error;
        this.d = context;
        this.e = c6Var;
        this.b = dVar;
        this.f = e3Var;
        this.h = runnable;
    }

    public /* synthetic */ i1(rn rnVar, we.d dVar, org.telegram.ui.Cells.s1 s1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 12;
        this.d = rnVar;
        this.e = dVar;
        this.f = s1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ i1(xm0 xm0Var, TLRPC.TL_error tL_error, String str, om0 om0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 15;
        this.d = xm0Var;
        this.c = tL_error;
        this.e = str;
        this.f = om0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ i1(x21 x21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 16;
        this.d = x21Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ i1(k61 k61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 18;
        this.d = k61Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ i1(org.telegram.ui.web.z0 z0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 19;
        this.d = z0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }

    public /* synthetic */ i1(pf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.a = 22;
        this.d = m0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = messagesController;
        this.h = messagesStorage;
    }
}
