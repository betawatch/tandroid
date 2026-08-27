package gf;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Map map) {
        if (map.isEmpty()) {
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                JSONObject jSONObject = new JSONObject(new String(d5.g0.R(open), o8.d.c));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                open.close();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        FileLog.d("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        a a2 = a.a(serializedData, serializedData.readInt32(true));
        serializedData.cleanup();
        if (a2.c != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a2.c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a2.b);
        String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + bytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(bytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + bytesToHex + " not found");
            throw new RuntimeException(a9.p.m("no purpose under ", bytesToHex, " found :("));
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + bytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        a a3 = a.a(serializedData3, serializedData3.readInt32(true));
        serializedData3.cleanup();
        return a3.c;
    }
}
