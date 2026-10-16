package n2;

import ab.o0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import e0.f0;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t implements q {
    public static final v0 d = new v0(12);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public t(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = b2.n.c;
        u6.f("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.n.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (b2.n.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // n2.q
    public final byte[] D() {
        return this.b.openSession();
    }

    @Override // n2.q
    public final void K(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // n2.q
    public final void W(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // n2.q
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // n2.q
    public final byte[] g0(byte[] bArr, byte[] bArr2) {
        if (b2.n.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
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

    @Override // n2.q
    public final void j0(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // n2.q
    public final void k(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f0.f(this.b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
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
    @Override // n2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        b2.s sVar;
        byte[] bArr3;
        j6.l i11;
        UUID uuid = this.a;
        b2.s sVar2 = null;
        if (list != null) {
            boolean z10 = false;
            if (b2.n.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    b2.s sVar3 = (b2.s) list.get(0);
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        b2.s sVar4 = (b2.s) list.get(i13);
                        byte[] bArr4 = sVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(sVar4.d, sVar3.d) && Objects.equals(sVar4.c, sVar3.c) && w3.p.i(bArr4) != null) {
                            i12 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i12];
                    int i14 = 0;
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        byte[] bArr6 = ((b2.s) list.get(i15)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i14, length);
                        i14 += length;
                    }
                    sVar = new b2.s(sVar3.b, sVar3.c, sVar3.d, bArr5);
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= list.size()) {
                        sVar = (b2.s) list.get(0);
                        break;
                    }
                    b2.s sVar5 = (b2.s) list.get(i16);
                    byte[] bArr7 = sVar5.e;
                    bArr7.getClass();
                    j6.l i17 = w3.p.i(bArr7);
                    if ((i17 == null ? -1 : i17.a) == 1) {
                        sVar = sVar5;
                        break;
                    }
                    i16++;
                }
            } else {
                sVar = (b2.s) list.get(0);
            }
            byte[] bArr8 = sVar.e;
            bArr8.getClass();
            UUID uuid2 = b2.n.f;
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
            if (i19 < 27 && Objects.equals(uuid, b2.n.d)) {
                z10 = true;
            }
            if (z10 && (i11 = w3.p.i(bArr8)) != null) {
                bArr8 = w3.p.a(b2.n.c, (UUID[]) i11.d, (byte[]) i11.c);
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
            String str5 = sVar.d;
            str = (i19 < 26 && b2.n.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            sVar2 = sVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] data = keyRequest.getData();
        if (b2.n.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = m0.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && sVar2 != null) {
                str2 = sVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new o(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = sVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new o(defaultUrl, data);
    }

    @Override // n2.q
    public final void m0(final m.l lVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: n2.s
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                t tVar = t.this;
                m.l lVar2 = lVar;
                tVar.getClass();
                o0 o0Var = ((e) lVar2.a).M;
                o0Var.getClass();
                o0Var.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // n2.q
    public final p p() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // n2.q
    public final int p0() {
        return 2;
    }

    @Override // n2.q
    public final h2.b q(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 < 27 && Objects.equals(uuid, b2.n.d)) {
            uuid = b2.n.c;
        }
        return new r(uuid, bArr);
    }

    @Override // n2.q
    public final synchronized void release() {
        int i10 = this.c - 1;
        this.c = i10;
        if (i10 == 0) {
            this.b.release();
        }
    }

    @Override // n2.q
    public final boolean w0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 >= 31) {
            boolean equals2 = uuid.equals(b2.n.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(b2.n.d);
            }
            if (equals) {
                return f0.d(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i10 >= 27 || !Objects.equals(uuid, b2.n.d)) ? uuid : b2.n.c, bArr);
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
            boolean z10 = !uuid.equals(b2.n.d);
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
}
