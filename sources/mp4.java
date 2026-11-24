// default package

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mp4 implements i54 {
    public static final wn4 d = new wn4((byte) 3);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public mp4(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = g51.c;
        gre.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(g51.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (g51.e.equals(uuid)) {
            HashSet hashSet = cr6.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    @Override // i54
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // i54
    public final h54 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new h54(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // i54
    public final kp4 g(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, g51.d)) {
            uuid = g51.c;
        }
        return new kp4(uuid, bArr);
    }

    @Override // i54
    public final byte[] j() {
        return this.b.openSession();
    }

    @Override // i54
    public final void k(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // i54
    public final void l(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // i54
    public final void n(final lj9 lj9Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: lp4
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                c1 c1Var = ((da3) lj9Var.b).N;
                c1Var.getClass();
                c1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // i54
    public final byte[] p(byte[] bArr, byte[] bArr2) {
        if (g51.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(g8c.r(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                lad.d("ClearKeyUtil", "Failed to adjust response data: ".concat(g8c.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // i54
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // i54
    public final void s(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x019e, code lost:
    
        if ("AFTT".equals(r5) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0235, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    @Override // i54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g54 t(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        pq3 pq3Var;
        byte[] bArr3;
        ju8 b;
        UUID uuid = this.a;
        pq3 pq3Var2 = null;
        if (list != null) {
            if (g51.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    pq3 pq3Var3 = (pq3) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        pq3 pq3Var4 = (pq3) list.get(i3);
                        byte[] bArr4 = pq3Var4.e;
                        bArr4.getClass();
                        if (Objects.equals(pq3Var4.d, pq3Var3.d) && Objects.equals(pq3Var4.c, pq3Var3.c) && tre.b(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = ((pq3) list.get(i5)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i4 += length;
                    }
                    pq3Var = new pq3(pq3Var3.b, pq3Var3.c, pq3Var3.d, bArr5);
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= list.size()) {
                        pq3Var = (pq3) list.get(0);
                        break;
                    }
                    pq3 pq3Var5 = (pq3) list.get(i6);
                    byte[] bArr7 = pq3Var5.e;
                    bArr7.getClass();
                    ju8 b2 = tre.b(bArr7);
                    if ((b2 == null ? (short) -1 : b2.a) == 1) {
                        pq3Var = pq3Var5;
                        break;
                    }
                    i6++;
                }
            } else {
                pq3Var = (pq3) list.get(0);
            }
            byte[] bArr8 = pq3Var.e;
            bArr8.getClass();
            UUID uuid2 = g51.f;
            if (uuid2.equals(uuid)) {
                byte[] c = tre.c(uuid, bArr8);
                if (c != null) {
                    bArr8 = c;
                }
                xu7 xu7Var = new xu7(bArr8);
                int o = xu7Var.o();
                short q = xu7Var.q();
                short q2 = xu7Var.q();
                if (q == 1 && q2 == 1) {
                    short q3 = xu7Var.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y = xu7Var.y(q3, charset);
                    if (!y.contains("<LA_URL>")) {
                        int indexOf = y.indexOf("</DATA>");
                        if (indexOf == -1) {
                            lad.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y.substring(indexOf);
                        int i7 = o + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i7);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i7);
                        allocate.putShort(q);
                        allocate.putShort(q2);
                        allocate.putShort((short) (str3.length() << 1));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    lad.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = tre.a(uuid2, null, bArr8);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, g51.d) && (b = tre.b(bArr8)) != null) {
                bArr8 = tre.a(g51.c, (UUID[]) b.d, b.b);
            }
            HashSet hashSet = cr6.a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = tre.c(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = pq3Var.d;
            str = (i8 < 26 && g51.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            pq3Var2 = pq3Var;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm mediaDrm = this.b;
        MediaDrm.KeyRequest keyRequest = mediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (g51.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = g8c.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && pq3Var2 != null) {
                str2 = pq3Var2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new g54(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = pq3Var2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new g54(defaultUrl, data);
    }

    @Override // i54
    public final int v() {
        return 2;
    }

    @Override // i54
    public final void w(byte[] bArr, uc8 uc8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                yz.x(this.b, bArr, uc8Var);
            } catch (UnsupportedOperationException unused) {
                lad.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // i54
    public final boolean x(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(g51.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                if (i < 37) {
                    String propertyString = mediaDrm.getPropertyString("version");
                    if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                        equals = false;
                    }
                }
                equals = true;
            } else {
                equals = uuid.equals(g51.d);
            }
            if (equals) {
                return yz.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, g51.d)) ? uuid : g51.c, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(g51.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }
}
