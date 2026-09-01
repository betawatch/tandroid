package lh;

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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import mh.j7;
import mh.l7;
import mh.t7;
import oh.k6;
import oh.l6;
import oh.t6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c71;
import org.telegram.ui.c9;
import org.telegram.ui.f31;
import org.telegram.ui.fc;
import org.telegram.ui.fn0;
import org.telegram.ui.m31;
import org.telegram.ui.pe;
import org.telegram.ui.ra;
import org.telegram.ui.sb;
import org.telegram.ui.ve;
import org.telegram.ui.vm0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import org.telegram.ui.yx0;
import org.telegram.ui.zi;
import org.telegram.ui.zk0;
import qh.va;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x03af A[Catch: Exception -> 0x04db, TryCatch #1 {Exception -> 0x04db, blocks: (B:99:0x025b, B:101:0x0277, B:102:0x0279, B:103:0x0281, B:105:0x0285, B:107:0x0298, B:108:0x029f, B:110:0x02a5, B:111:0x02a9, B:113:0x02af, B:114:0x02b3, B:116:0x02c2, B:117:0x02d5, B:119:0x02db, B:121:0x02e7, B:123:0x02ed, B:125:0x02f7, B:127:0x0305, B:128:0x030c, B:130:0x0312, B:132:0x031c, B:134:0x032a, B:135:0x032e, B:137:0x0334, B:139:0x033e, B:141:0x034c, B:142:0x0350, B:144:0x0356, B:146:0x035c, B:148:0x0366, B:150:0x036c, B:151:0x036f, B:152:0x0375, B:155:0x037c, B:157:0x0381, B:162:0x0393, B:164:0x0399, B:166:0x03af, B:174:0x03c4, B:176:0x03ce, B:178:0x0405, B:180:0x0418, B:181:0x041f, B:183:0x0425, B:184:0x0429, B:186:0x042f, B:187:0x0433, B:189:0x043d, B:190:0x0447, B:192:0x044d, B:194:0x0457, B:198:0x0462, B:200:0x0468, B:202:0x0472, B:204:0x04a9, B:205:0x04b6, B:159:0x038f, B:219:0x027e), top: B:98:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b A[Catch: Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, blocks: (B:36:0x00df, B:38:0x00e9, B:40:0x00ef, B:41:0x00f7, B:43:0x0135, B:45:0x013b, B:47:0x0141, B:48:0x0144, B:50:0x0149, B:52:0x014f, B:53:0x0152, B:56:0x015b, B:58:0x0165, B:60:0x0175, B:62:0x0181, B:64:0x018d, B:68:0x01db, B:70:0x01e1, B:71:0x01e4, B:73:0x01ed, B:74:0x01f0, B:75:0x01fa, B:78:0x0205, B:84:0x0218, B:86:0x021e, B:94:0x024e, B:96:0x0254, B:223:0x019e, B:225:0x01b2, B:227:0x01bc, B:229:0x01d6, B:235:0x00fe, B:237:0x0108, B:239:0x010e, B:240:0x0111, B:241:0x0115, B:243:0x011f, B:245:0x0125, B:247:0x012b, B:248:0x012e), top: B:35:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165 A[Catch: Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, blocks: (B:36:0x00df, B:38:0x00e9, B:40:0x00ef, B:41:0x00f7, B:43:0x0135, B:45:0x013b, B:47:0x0141, B:48:0x0144, B:50:0x0149, B:52:0x014f, B:53:0x0152, B:56:0x015b, B:58:0x0165, B:60:0x0175, B:62:0x0181, B:64:0x018d, B:68:0x01db, B:70:0x01e1, B:71:0x01e4, B:73:0x01ed, B:74:0x01f0, B:75:0x01fa, B:78:0x0205, B:84:0x0218, B:86:0x021e, B:94:0x024e, B:96:0x0254, B:223:0x019e, B:225:0x01b2, B:227:0x01bc, B:229:0x01d6, B:235:0x00fe, B:237:0x0108, B:239:0x010e, B:240:0x0111, B:241:0x0115, B:243:0x011f, B:245:0x0125, B:247:0x012b, B:248:0x012e), top: B:35:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1 A[Catch: Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, blocks: (B:36:0x00df, B:38:0x00e9, B:40:0x00ef, B:41:0x00f7, B:43:0x0135, B:45:0x013b, B:47:0x0141, B:48:0x0144, B:50:0x0149, B:52:0x014f, B:53:0x0152, B:56:0x015b, B:58:0x0165, B:60:0x0175, B:62:0x0181, B:64:0x018d, B:68:0x01db, B:70:0x01e1, B:71:0x01e4, B:73:0x01ed, B:74:0x01f0, B:75:0x01fa, B:78:0x0205, B:84:0x0218, B:86:0x021e, B:94:0x024e, B:96:0x0254, B:223:0x019e, B:225:0x01b2, B:227:0x01bc, B:229:0x01d6, B:235:0x00fe, B:237:0x0108, B:239:0x010e, B:240:0x0111, B:241:0x0115, B:243:0x011f, B:245:0x0125, B:247:0x012b, B:248:0x012e), top: B:35:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed A[Catch: Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, blocks: (B:36:0x00df, B:38:0x00e9, B:40:0x00ef, B:41:0x00f7, B:43:0x0135, B:45:0x013b, B:47:0x0141, B:48:0x0144, B:50:0x0149, B:52:0x014f, B:53:0x0152, B:56:0x015b, B:58:0x0165, B:60:0x0175, B:62:0x0181, B:64:0x018d, B:68:0x01db, B:70:0x01e1, B:71:0x01e4, B:73:0x01ed, B:74:0x01f0, B:75:0x01fa, B:78:0x0205, B:84:0x0218, B:86:0x021e, B:94:0x024e, B:96:0x0254, B:223:0x019e, B:225:0x01b2, B:227:0x01bc, B:229:0x01d6, B:235:0x00fe, B:237:0x0108, B:239:0x010e, B:240:0x0111, B:241:0x0115, B:243:0x011f, B:245:0x0125, B:247:0x012b, B:248:0x012e), top: B:35:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205 A[Catch: Exception -> 0x00f3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f3, blocks: (B:36:0x00df, B:38:0x00e9, B:40:0x00ef, B:41:0x00f7, B:43:0x0135, B:45:0x013b, B:47:0x0141, B:48:0x0144, B:50:0x0149, B:52:0x014f, B:53:0x0152, B:56:0x015b, B:58:0x0165, B:60:0x0175, B:62:0x0181, B:64:0x018d, B:68:0x01db, B:70:0x01e1, B:71:0x01e4, B:73:0x01ed, B:74:0x01f0, B:75:0x01fa, B:78:0x0205, B:84:0x0218, B:86:0x021e, B:94:0x024e, B:96:0x0254, B:223:0x019e, B:225:0x01b2, B:227:0x01bc, B:229:0x01d6, B:235:0x00fe, B:237:0x0108, B:239:0x010e, B:240:0x0111, B:241:0x0115, B:243:0x011f, B:245:0x0125, B:247:0x012b, B:248:0x012e), top: B:35:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        uf.c cVar;
        Location location;
        String str;
        Locale locale;
        List<Address> list;
        List<Address> list2;
        int i10;
        boolean z4;
        boolean z10;
        String countryName;
        boolean z11;
        boolean z12;
        Address address;
        StringBuilder sb;
        StringBuilder sb2;
        Address address2;
        boolean z13;
        String str2;
        int i11;
        uf.c cVar2 = (uf.c) this.d;
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
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder();
                    locale = locale2;
                    StringBuilder sb5 = new StringBuilder();
                    String locality = address3.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address3.getAdminArea();
                    }
                    list = fromLocationName2;
                    String str5 = locality;
                    if (address4 != null && TextUtils.isEmpty(address4.getLocality())) {
                        address4.getAdminArea();
                    }
                    location = location2;
                    try {
                        String thoroughfare = address3.getThoroughfare();
                        str = str4;
                        if (TextUtils.isEmpty(thoroughfare)) {
                            list2 = fromLocationName;
                        } else {
                            list2 = fromLocationName;
                            try {
                                if (!TextUtils.equals(thoroughfare, address3.getAdminArea())) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(thoroughfare);
                                    z4 = false;
                                    if (TextUtils.isEmpty(str5)) {
                                        z10 = true;
                                    } else {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(str5);
                                        if (sb5 != null) {
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(str5);
                                        }
                                        z10 = false;
                                    }
                                    StringBuilder sb6 = sb5;
                                    countryName = address3.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        z11 = z4;
                                        z12 = z10;
                                        address = address4;
                                    } else {
                                        z11 = z4;
                                        z12 = z10;
                                        if (!"US".equals(address3.getCountryCode()) && !"AE".equals(address3.getCountryCode()) && (!"GB".equals(address3.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                            str2 = countryName;
                                            address = address4;
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(str2);
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(countryName);
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
                                        if (sb4.length() > 0) {
                                        }
                                        sb4.append(str2);
                                        if (sb3.length() > 0) {
                                        }
                                        sb3.append(countryName);
                                    }
                                    if (cVar2.e) {
                                        StringBuilder sb7 = new StringBuilder();
                                        try {
                                            String addressLine = address3.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb7.append(addressLine);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        if (sb7.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb7.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportAddress);
                                            arrayList.add(tL_messageMediaVenue);
                                        }
                                        cVar = cVar2;
                                    } else {
                                        if (sb6 == null || sb6.length() <= 0) {
                                            cVar = cVar2;
                                            sb = sb4;
                                            sb2 = sb3;
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
                                                tL_messageMediaVenue2.title = sb6.toString();
                                                tL_messageMediaVenue2.icon = "pin";
                                                tL_messageMediaVenue2.address = LocaleController.getString(z11 ? R.string.PassportCity : R.string.PassportStreet1);
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
                                                    StringBuilder sb8 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb2 = sb3;
                                                        sb = sb4;
                                                    } else {
                                                        sb2 = sb3;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        sb = sb4;
                                                        tL_geoPointAddress2.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress3.city = locality2;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (!z11) {
                                                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str5) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str5) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getSubLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str5) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                            thoroughfare2 = address.getLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                            sb8 = null;
                                                        } else {
                                                            if (sb8.length() > 0) {
                                                                sb8.append(", ");
                                                            }
                                                            sb8.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                            int i16 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i16 >= strArr.length) {
                                                                    break;
                                                                }
                                                                if (strArr[i16].equalsIgnoreCase(sb8.toString())) {
                                                                    z13 = true;
                                                                    break;
                                                                }
                                                                i16++;
                                                            }
                                                        }
                                                        z13 = false;
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb8.toString();
                                                        }
                                                        if (!z13) {
                                                            arrayList.add(tL_messageMediaVenue2);
                                                            if (arrayList.size() >= i12) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sb2 = sb3;
                                                    sb = sb4;
                                                }
                                                z13 = false;
                                                if (!z13) {
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (!z12 && !hashSet2.contains(sb.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint3;
                                            tL_geoPoint3.lat = latitude;
                                            tL_geoPoint3._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb.toString();
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
                                        if (sb2.length() > 0 && !hashSet.contains(sb2.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb2.toString();
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
                                sb5 = null;
                                z4 = true;
                                if (TextUtils.isEmpty(str5)) {
                                }
                                StringBuilder sb62 = sb5;
                                countryName = address3.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                if (cVar2.e) {
                                }
                            } else {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(locality4);
                            }
                        } else {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(subLocality);
                        }
                        z4 = false;
                        if (TextUtils.isEmpty(str5)) {
                        }
                        StringBuilder sb622 = sb5;
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
                    location = location2;
                    str = str4;
                    list2 = fromLocationName;
                    i10 = i13;
                }
                i13 = i10 + 1;
                locale2 = locale;
                location2 = location;
                fromLocationName2 = list;
                fromLocationName = list2;
                str4 = str;
                cVar2 = cVar;
            }
        } catch (Exception unused5) {
        }
        cVar = cVar2;
        location = location2;
        str = str4;
        AndroidUtilities.runOnUIThread(new yx0(20, cVar, location, arrayList, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x037b, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03b4, code lost:
    
        if (r8.creator != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03b0, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L110;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.p2 U;
        TLRPC.ChatParticipants chatParticipants;
        String str;
        TLRPC.User user = null;
        int i10 = 2;
        boolean z4 = true;
        int i11 = 0;
        switch (this.a) {
            case 0:
                g2.P((g2) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLObject) this.b, (eg.d3) this.f, (Utilities.Callback) this.h, (TLRPC.TL_error) this.c);
                break;
            case 1:
                mh.g5.c1((mh.g5) this.d, (TLObject) this.b, (CharSequence) this.e, (TL_stars.TL_starGiftUnique) this.f, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h, (TLRPC.TL_error) this.c);
                break;
            case 2:
                mh.g5.x0((mh.g5) this.d, (TLObject) this.b, (hg.v2[]) this.e, (Long) this.f, (androidx.car.app.utils.b) this.h, (TLRPC.TL_error) this.c);
                break;
            case 3:
                t7 t7Var = (t7) this.d;
                List list = (List) this.e;
                eh.w wVar = (eh.w) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                p2.h hVar = (p2.h) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new mh.w5(wVar, i11));
                    break;
                } else {
                    p2.m mVar = (p2.m) list.get(0);
                    if (mVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new mh.w5(wVar, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(t7Var.a).sendRequest(tL_payments_canPurchaseStore, new hg.i0(mVar, hVar, (Utilities.Callback2) wVar, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, 2));
                        break;
                    }
                }
            case 4:
                t7 t7Var2 = (t7) this.d;
                Runnable runnable = (Runnable) this.e;
                MessageObject messageObject = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (t7Var2.e) {
                    t7Var2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
                    break;
                } else {
                    t7.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 5:
                t7 t7Var3 = (t7) this.d;
                TLObject tLObject = (TLObject) this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                zi ziVar = (zi) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    t7Var3.Y(messageObject2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, ziVar, null);
                } else {
                    t7.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                ziVar.run();
                break;
            case 6:
                t7 t7Var4 = (t7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject3 = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                zArr[0] = true;
                t7Var4.a0(messageObject3, inputInvoice2, tL_payments_paymentFormStars2, new mh.m1(1, callback2));
                break;
            case 7:
                j7 j7Var = (j7) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                l7 l7Var = (l7) this.f;
                Utilities.Callback callback3 = (Utilities.Callback) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                long j10 = j7Var.b;
                int i12 = j7Var.a;
                HashMap hashMap = j7Var.h;
                ArrayList arrayList = j7Var.e;
                j7Var.k = false;
                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i13 = tL_starGiftCollection2.collection_id;
                    l7Var.d = i13;
                    hashMap.put(Integer.valueOf(i13), l7Var);
                    j7Var.j();
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var);
                    if (callback3 != null) {
                        callback3.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error2 != null && (U = LaunchActivity.U()) != null) {
                        qc.a0(U).d0(tL_error2, false);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    j7Var.j();
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var);
                    break;
                }
                break;
            case 8:
                l6 l6Var = (l6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.c;
                StringBuilder sb = new StringBuilder("StoriesList ");
                sb.append(l6Var.e);
                sb.append("{");
                sb.append(l6Var.d);
                sb.append("} preloadCache {");
                sb.append(t6.a(arrayList2));
                yh.v("}", sb);
                ArrayList arrayList6 = l6Var.g;
                arrayList6.clear();
                arrayList6.addAll(arrayList3);
                l6Var.t = false;
                int i14 = l6Var.c;
                MessagesController.getInstance(i14).putUsers(arrayList4, true);
                MessagesController.getInstance(i14).putChats(arrayList5, true);
                if (l6Var.v) {
                    l6Var.v = false;
                    l6Var.y = null;
                    l6Var.j();
                    break;
                } else {
                    l6Var.m.addAll(hashSet);
                    l6Var.k.clear();
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        l6Var.t((MessageObject) arrayList2.get(i15), true);
                    }
                    l6Var.d(false);
                    k6 k6Var = l6Var.y;
                    if (k6Var != null) {
                        k6Var.run(0);
                        l6Var.y = null;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                    break;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.b;
                String[] strArr = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final g90 g90Var = (g90) this.f;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.h;
                g6 g6Var = (g6) this.c;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str2 = ((TL_phone.exportedGroupCallInvite) tLObject3).link;
                    strArr[0] = str2;
                    if (str2.startsWith("https://")) {
                        str2 = str2.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.k8
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
                                g90Var.setText(str2);
                            }
                        }
                    });
                    duration.addListener(new c9(atomicBoolean, g90Var, str2));
                    duration.start();
                    new qc(h3Var.topBulletinContainer, g6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 10:
                sb sbVar = (sb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList7 = (ArrayList) this.b;
                ArrayList arrayList8 = (ArrayList) this.f;
                ArrayList arrayList9 = (ArrayList) this.h;
                ra raVar = (ra) this.c;
                TLRPC.Chat chat = sbVar.s;
                sbVar.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = sbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = sbVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList7.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.b.h(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                    }
                    arrayList7.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.b.h(R.drawable.msg_block, 35, arrayList8, arrayList9);
                }
                raVar.run();
                break;
            case 11:
                xn xnVar = (xn) this.d;
                af.f fVar = (af.f) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f;
                String str3 = (String) this.h;
                TLObject tLObject4 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                fVar.b();
                q70 I = q70.I(xnVar, t1Var);
                jm0 jm0Var = new jm0(xnVar.getParentActivity(), xnVar.ba);
                I.p = new pe(jm0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ve(xnVar, jm0Var, str3, i10), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i16 = 0;
                    while (true) {
                        int i17 = 13;
                        if (i16 < size2) {
                            TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i16);
                            i16++;
                            TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                            I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new fc(i17, xnVar, tL_bankCardOpenUrl2), false);
                        } else if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                            I.k();
                            I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                        }
                    }
                }
                jm0Var.e(I);
                jm0Var.f(t1Var, characterStyle, null, false);
                xnVar.showDialog(jm0Var);
                break;
            case 12:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                g6 g6Var2 = (g6) this.e;
                qh.d dVar = (qh.d) this.b;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error3 != null) {
                    new qc(cb.a(context), g6Var2).d0(tL_error3, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    h3Var2.dismiss();
                    new qc(cb.a(context), g6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable2.run();
                    break;
                }
            case 13:
                org.telegram.ui.Components.yx0 yx0Var = (org.telegram.ui.Components.yx0) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr = (int[]) this.c;
                yx0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z4 = false;
                } else {
                    editTextBoldCursor.setText(str);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    yx0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z4) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                break;
            case 14:
                fn0.W((fn0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (vm0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 15:
                m31.n((m31) this.d, (TLObject) this.b, (CharSequence) this.e, (TLRPC.TL_error) this.c, (byte[]) this.f, (String) this.h);
                break;
            case 16:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                g6 g6Var3 = (g6) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                a90 a90Var = (a90) this.c;
                m31 m31Var = new m31(context2, g6Var3, 0L, bArr);
                m31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                m31Var.s = new f31(p2Var, context2, g6Var3, a90Var);
                m31Var.show();
                break;
            case 17:
                c71.R((c71) this.d, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.e, (TLRPC.User) this.b, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 18:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                String str4 = (String) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                String str5 = (String) this.h;
                g6 g6Var4 = a1Var.e;
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.TL_urlAuthResultRequest) {
                        zk0.b(false, a1Var.J, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject7, null, null, null, false, a1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        zk0.b(false, a1Var.J, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject7, null, null, null, false, a1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.z4.p0(a1Var.getContext(), str4, false, true, true, false, 0L, null, null, null);
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        new qc(a1Var, g6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str5), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new qc(a1Var, g6Var4).d0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                String str6 = (String) this.f;
                String str7 = (String) this.h;
                String str8 = (String) this.c;
                if (file == null) {
                    d2Var.c(500L);
                    break;
                } else {
                    int[] iArr2 = new int[11];
                    Utilities.globalQueue.postRunnable(new o71(file, iArr2, new hg.g0(a1Var2, iArr2, file, d2Var, str6, str7, str8, 13), 4));
                    break;
                }
            case 20:
                int[] iArr3 = (int[]) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                va vaVar = (va) this.h;
                ml mlVar = (ml) this.c;
                iArr3[0] = 0;
                if (tLObject8 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject8;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        vaVar.run();
                        break;
                    }
                }
                mlVar.run(null);
                break;
            case 21:
                a();
                break;
            default:
                uf.m0 m0Var = (uf.m0) this.d;
                String str9 = (String) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.b;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                uf.u0 u0Var = m0Var.e;
                String str10 = u0Var.n0;
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
                    u0Var.R(user);
                    u0Var.q0 = 0;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z4) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ e1(t7 t7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.d = t7Var;
        this.e = obj;
        this.b = messageObject;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    public /* synthetic */ e1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ e1(TLRPC.TL_error tL_error, Context context, g6 g6Var, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.a = 12;
        this.c = tL_error;
        this.d = context;
        this.e = g6Var;
        this.b = dVar;
        this.f = h3Var;
        this.h = runnable;
    }

    public /* synthetic */ e1(xn xnVar, af.f fVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 11;
        this.d = xnVar;
        this.e = fVar;
        this.f = t1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ e1(fn0 fn0Var, TLRPC.TL_error tL_error, String str, vm0 vm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 14;
        this.d = fn0Var;
        this.c = tL_error;
        this.e = str;
        this.f = vm0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ e1(m31 m31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 15;
        this.d = m31Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ e1(c71 c71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 17;
        this.d = c71Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ e1(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 18;
        this.d = a1Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }

    public /* synthetic */ e1(uf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.a = 22;
        this.d = m0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = messagesController;
        this.h = messagesStorage;
    }
}
