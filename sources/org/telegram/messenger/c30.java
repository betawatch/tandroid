package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c30 extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static c30 a(double d, double d10, long j10, int i10, int i11, int i12, int i13) {
        c30 c30Var = new c30();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        c30Var.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j10;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d10;
        tL_inputWebFileGeoPointLocation.w = i10;
        tL_inputWebFileGeoPointLocation.h = i11;
        tL_inputWebFileGeoPointLocation.zoom = i12;
        tL_inputWebFileGeoPointLocation.scale = i13;
        c30Var.e = "image/png";
        c30Var.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        c30Var.c = new ArrayList();
        return c30Var;
    }

    public static c30 b(TLRPC.GeoPoint geoPoint, int i10, int i11, int i12, int i13) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i10, i11, i12, i13);
    }

    public static c30 c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            c30 c30Var = new c30();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            c30Var.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            c30Var.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            c30Var.d = tL_webDocument.size;
            c30Var.e = tL_webDocument.mime_type;
            c30Var.c = tL_webDocument.attributes;
            return c30Var;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        c30 c30Var2 = new c30();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        c30Var2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        c30Var2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        c30Var2.d = tL_webDocumentNoProxy.size;
        c30Var2.e = tL_webDocumentNoProxy.mime_type;
        c30Var2.c = tL_webDocumentNoProxy.attributes;
        c30Var2.f = true;
        return c30Var2;
    }
}
