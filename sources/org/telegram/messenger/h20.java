package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class h20 extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static h20 a(double d, double d2, long j3, int i7, int i10, int i11, int i12) {
        h20 h20Var = new h20();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        h20Var.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j3;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i7;
        tL_inputWebFileGeoPointLocation.h = i10;
        tL_inputWebFileGeoPointLocation.zoom = i11;
        tL_inputWebFileGeoPointLocation.scale = i12;
        h20Var.e = "image/png";
        h20Var.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        h20Var.c = new ArrayList();
        return h20Var;
    }

    public static h20 b(TLRPC.GeoPoint geoPoint, int i7, int i10, int i11, int i12) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i7, i10, i11, i12);
    }

    public static h20 c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            h20 h20Var = new h20();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            h20Var.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            h20Var.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            h20Var.d = tL_webDocument.size;
            h20Var.e = tL_webDocument.mime_type;
            h20Var.c = tL_webDocument.attributes;
            return h20Var;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        h20 h20Var2 = new h20();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        h20Var2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        h20Var2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        h20Var2.d = tL_webDocumentNoProxy.size;
        h20Var2.e = tL_webDocumentNoProxy.mime_type;
        h20Var2.c = tL_webDocumentNoProxy.attributes;
        h20Var2.f = true;
        return h20Var2;
    }
}
