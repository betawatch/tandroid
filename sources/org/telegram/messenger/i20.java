package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class i20 extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static i20 a(double d, double d2, long j3, int i7, int i10, int i11, int i12) {
        i20 i20Var = new i20();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        i20Var.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j3;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i7;
        tL_inputWebFileGeoPointLocation.h = i10;
        tL_inputWebFileGeoPointLocation.zoom = i11;
        tL_inputWebFileGeoPointLocation.scale = i12;
        i20Var.e = "image/png";
        i20Var.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        i20Var.c = new ArrayList();
        return i20Var;
    }

    public static i20 b(TLRPC.GeoPoint geoPoint, int i7, int i10, int i11, int i12) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i7, i10, i11, i12);
    }

    public static i20 c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            i20 i20Var = new i20();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            i20Var.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            i20Var.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            i20Var.d = tL_webDocument.size;
            i20Var.e = tL_webDocument.mime_type;
            i20Var.c = tL_webDocument.attributes;
            return i20Var;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        i20 i20Var2 = new i20();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        i20Var2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        i20Var2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        i20Var2.d = tL_webDocumentNoProxy.size;
        i20Var2.e = tL_webDocumentNoProxy.mime_type;
        i20Var2.c = tL_webDocumentNoProxy.attributes;
        i20Var2.f = true;
        return i20Var2;
    }
}
