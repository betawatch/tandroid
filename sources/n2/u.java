package n2;

import ab.o0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import e0.e0;
import e2.m0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class u implements r {
    public static final v0 d = new v0(14);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public u(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = b2.m.c;
        u6.f("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.m.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (b2.m.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // n2.r
    public final boolean B0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 >= 31) {
            boolean equals2 = uuid.equals(b2.m.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(b2.m.d);
            }
            if (equals) {
                return e0.d(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i10 >= 27 || !Objects.equals(uuid, b2.m.d)) ? uuid : b2.m.c, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !uuid.equals(b2.m.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // n2.r
    public final byte[] H() {
        return this.b.openSession();
    }

    @Override // n2.r
    public final void U(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // n2.r
    public final void Y(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // n2.r
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // n2.r
    public final byte[] g0(byte[] bArr, byte[] bArr2) {
        if (b2.m.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(m0.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                e2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(m0.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // n2.r
    public final void h(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                e0.f(this.b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // n2.r
    public final void j0(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ab, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0244, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0257  */
    @Override // n2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        b2.r rVar;
        byte[] bArr3;
        j6.l i11;
        UUID uuid = this.a;
        b2.r rVar2 = null;
        if (list != null) {
            boolean z10 = false;
            if (b2.m.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    b2.r rVar3 = (b2.r) list.get(0);
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        b2.r rVar4 = (b2.r) list.get(i13);
                        byte[] bArr4 = rVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(rVar4.d, rVar3.d) && Objects.equals(rVar4.c, rVar3.c) && w3.p.i(bArr4) != null) {
                            i12 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i12];
                    int i14 = 0;
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        byte[] bArr6 = ((b2.r) list.get(i15)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i14, length);
                        i14 += length;
                    }
                    rVar = new b2.r(rVar3.b, rVar3.c, rVar3.d, bArr5);
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= list.size()) {
                        rVar = (b2.r) list.get(0);
                        break;
                    }
                    b2.r rVar5 = (b2.r) list.get(i16);
                    byte[] bArr7 = rVar5.e;
                    bArr7.getClass();
                    j6.l i17 = w3.p.i(bArr7);
                    if ((i17 == null ? -1 : i17.a) == 1) {
                        rVar = rVar5;
                        break;
                    }
                    i16++;
                }
            } else {
                rVar = (b2.r) list.get(0);
            }
            byte[] bArr8 = rVar.e;
            bArr8.getClass();
            UUID uuid2 = b2.m.f;
            if (uuid2.equals(uuid)) {
                byte[] j10 = w3.p.j(uuid, bArr8);
                if (j10 != null) {
                    bArr8 = j10;
                }
                e2.x xVar = new e2.x(bArr8);
                int o10 = xVar.o();
                short q6 = xVar.q();
                short q10 = xVar.q();
                if (q6 == 1 && q10 == 1) {
                    short q11 = xVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y3 = xVar.y(q11, charset);
                    if (!y3.contains("<LA_URL>")) {
                        int indexOf = y3.indexOf("</DATA>");
                        if (indexOf == -1) {
                            e2.a.l("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y3.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y3.substring(indexOf);
                        int i18 = o10 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i18);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i18);
                        allocate.putShort(q6);
                        allocate.putShort(q10);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    e2.a.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = w3.p.a(uuid2, null, bArr8);
            }
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 27 && Objects.equals(uuid, b2.m.d)) {
                z10 = true;
            }
            if (z10 && (i11 = w3.p.i(bArr8)) != null) {
                bArr8 = w3.p.a(b2.m.c, (UUID[]) i11.d, (byte[]) i11.c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = w3.p.j(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = rVar.d;
            str = (i19 < 26 && b2.m.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            rVar2 = rVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] data = keyRequest.getData();
        if (b2.m.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = m0.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && rVar2 != null) {
                str2 = rVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new p(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = rVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new p(defaultUrl, data);
    }

    @Override // n2.r
    public final int m0() {
        return 2;
    }

    @Override // n2.r
    public final q o() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // n2.r
    public final h2.b r(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 < 27 && Objects.equals(uuid, b2.m.d)) {
            uuid = b2.m.c;
        }
        return new s(uuid, bArr);
    }

    @Override // n2.r
    public final synchronized void release() {
        int i10 = this.c - 1;
        this.c = i10;
        if (i10 == 0) {
            this.b.release();
        }
    }

    @Override // n2.r
    public final void t0(final l2.f fVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: n2.t
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                l2.f fVar2 = fVar;
                uVar.getClass();
                o0 o0Var = ((f) fVar2.b).M;
                o0Var.getClass();
                o0Var.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }
}
