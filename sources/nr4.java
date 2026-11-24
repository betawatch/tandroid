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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nr4 implements t64 {
    public static final zo4 d = new zo4((byte) 5);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public nr4(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = n61.c;
        jte.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(n61.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (n61.e.equals(uuid)) {
            HashSet hashSet = ct6.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    @Override // t64
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // t64
    public final s64 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new s64(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // t64
    public final lr4 f(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, n61.d)) {
            uuid = n61.c;
        }
        return new lr4(uuid, bArr);
    }

    @Override // t64
    public final byte[] i() {
        return this.b.openSession();
    }

    @Override // t64
    public final void j(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // t64
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // t64
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (n61.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(hac.r(bArr2));
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
                ncd.d("ClearKeyUtil", "Failed to adjust response data: ".concat(hac.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // t64
    public final void m(final sz4 sz4Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: mr4
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                c1 c1Var = ((pb3) sz4Var.a).N;
                c1Var.getClass();
                c1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // t64
    public final void o(byte[] bArr) {
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
    @Override // t64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r64 q(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        zr3 zr3Var;
        byte[] bArr3;
        kw8 b;
        UUID uuid = this.a;
        zr3 zr3Var2 = null;
        if (list != null) {
            if (n61.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    zr3 zr3Var3 = (zr3) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        zr3 zr3Var4 = (zr3) list.get(i3);
                        byte[] bArr4 = zr3Var4.e;
                        bArr4.getClass();
                        if (Objects.equals(zr3Var4.d, zr3Var3.d) && Objects.equals(zr3Var4.c, zr3Var3.c) && wte.b(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = ((zr3) list.get(i5)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i4 += length;
                    }
                    zr3Var = new zr3(zr3Var3.b, zr3Var3.c, zr3Var3.d, bArr5);
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= list.size()) {
                        zr3Var = (zr3) list.get(0);
                        break;
                    }
                    zr3 zr3Var5 = (zr3) list.get(i6);
                    byte[] bArr7 = zr3Var5.e;
                    bArr7.getClass();
                    kw8 b2 = wte.b(bArr7);
                    if ((b2 == null ? (short) -1 : b2.a) == 1) {
                        zr3Var = zr3Var5;
                        break;
                    }
                    i6++;
                }
            } else {
                zr3Var = (zr3) list.get(0);
            }
            byte[] bArr8 = zr3Var.e;
            bArr8.getClass();
            UUID uuid2 = n61.f;
            if (uuid2.equals(uuid)) {
                byte[] c = wte.c(uuid, bArr8);
                if (c != null) {
                    bArr8 = c;
                }
                yw7 yw7Var = new yw7(bArr8);
                int o = yw7Var.o();
                short q = yw7Var.q();
                short q2 = yw7Var.q();
                if (q == 1 && q2 == 1) {
                    short q3 = yw7Var.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y = yw7Var.y(q3, charset);
                    if (!y.contains("<LA_URL>")) {
                        int indexOf = y.indexOf("</DATA>");
                        if (indexOf == -1) {
                            ncd.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
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
                    ncd.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = wte.a(uuid2, null, bArr8);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, n61.d) && (b = wte.b(bArr8)) != null) {
                bArr8 = wte.a(n61.c, (UUID[]) b.d, b.b);
            }
            HashSet hashSet = ct6.a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = wte.c(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = zr3Var.d;
            str = (i8 < 26 && n61.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            zr3Var2 = zr3Var;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm mediaDrm = this.b;
        MediaDrm.KeyRequest keyRequest = mediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (n61.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = hac.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && zr3Var2 != null) {
                str2 = zr3Var2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new r64(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = zr3Var2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new r64(defaultUrl, data);
    }

    @Override // t64
    public final int r() {
        return 2;
    }

    @Override // t64
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // t64
    public final void t(byte[] bArr, we8 we8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                y00.x(this.b, bArr, we8Var);
            } catch (UnsupportedOperationException unused) {
                ncd.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // t64
    public final boolean u(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(n61.e);
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
                equals = uuid.equals(n61.d);
            }
            if (equals) {
                return y00.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, n61.d)) ? uuid : n61.c, bArr);
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
            boolean z = !uuid.equals(n61.d);
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
