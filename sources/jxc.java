// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jxc extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static jxc a(double d, double d2, long j, int i2, int i3, int i4, int i5) {
        jxc jxcVar = new jxc();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        jxcVar.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i2;
        tL_inputWebFileGeoPointLocation.h = i3;
        tL_inputWebFileGeoPointLocation.zoom = i4;
        tL_inputWebFileGeoPointLocation.scale = i5;
        jxcVar.e = "image/png";
        jxcVar.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        jxcVar.c = new ArrayList();
        return jxcVar;
    }

    public static jxc b(TLRPC.GeoPoint geoPoint, int i2, int i3, int i4, int i5) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i2, i3, i4, i5);
    }

    public static jxc c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            jxc jxcVar = new jxc();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            jxcVar.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            jxcVar.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            jxcVar.d = tL_webDocument.size;
            jxcVar.e = tL_webDocument.mime_type;
            jxcVar.c = tL_webDocument.attributes;
            return jxcVar;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        jxc jxcVar2 = new jxc();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        jxcVar2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        jxcVar2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        jxcVar2.d = tL_webDocumentNoProxy.size;
        jxcVar2.e = tL_webDocumentNoProxy.mime_type;
        jxcVar2.c = tL_webDocumentNoProxy.attributes;
        jxcVar2.f = true;
        return jxcVar2;
    }
}
