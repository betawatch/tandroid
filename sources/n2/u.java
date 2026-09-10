package n2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import e0.h0;
import e2.d0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m.g3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class u implements r {
    public static final l d = new l(1);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public u(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = b2.i.b;
        e2.d.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.i.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (b2.i.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // n2.r
    public final byte[] B() {
        return this.b.openSession();
    }

    @Override // n2.r
    public final void F(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // n2.r
    public final void G(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // n2.r
    public final byte[] J(byte[] bArr, byte[] bArr2) {
        if (b2.i.c.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(d0.p(bArr2));
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
                e2.a.f("ClearKeyUtil", "Failed to adjust response data: ".concat(d0.p(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // n2.r
    public final void W(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01bf, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0256, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        if ("AFTT".equals(r6) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    @Override // n2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p Z(byte[] bArr, List list, int i10, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        b2.n nVar;
        byte[] bArr3;
        j6.l j3;
        UUID uuid = this.a;
        b2.n nVar2 = null;
        if (list != null) {
            if (b2.i.d.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    b2.n nVar3 = (b2.n) list.get(0);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        b2.n nVar4 = (b2.n) list.get(i12);
                        byte[] bArr4 = nVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(nVar4.d, nVar3.d) && Objects.equals(nVar4.c, nVar3.c) && w3.n.j(bArr4) != null) {
                            i11 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i11];
                    int i13 = 0;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        byte[] bArr6 = ((b2.n) list.get(i14)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i13, length);
                        i13 += length;
                    }
                    nVar = new b2.n(nVar3.b, nVar3.c, nVar3.d, bArr5);
                }
                for (int i15 = 0; i15 < list.size(); i15++) {
                    b2.n nVar5 = (b2.n) list.get(i15);
                    byte[] bArr7 = nVar5.e;
                    bArr7.getClass();
                    j6.l j10 = w3.n.j(bArr7);
                    int i16 = j10 == null ? -1 : j10.a;
                    int i17 = Build.VERSION.SDK_INT;
                    if ((i17 < 23 && i16 == 0) || (i17 >= 23 && i16 == 1)) {
                        nVar = nVar5;
                        break;
                    }
                }
                nVar = (b2.n) list.get(0);
            } else {
                nVar = (b2.n) list.get(0);
            }
            byte[] bArr8 = nVar.e;
            bArr8.getClass();
            UUID uuid2 = b2.i.e;
            if (uuid2.equals(uuid)) {
                byte[] k10 = w3.n.k(uuid, bArr8);
                if (k10 != null) {
                    bArr8 = k10;
                }
                e2.v vVar = new e2.v(bArr8);
                int l4 = vVar.l();
                short n10 = vVar.n();
                short n11 = vVar.n();
                if (n10 == 1 && n11 == 1) {
                    short n12 = vVar.n();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String v = vVar.v(n12, charset);
                    if (!v.contains("<LA_URL>")) {
                        int indexOf = v.indexOf("</DATA>");
                        if (indexOf == -1) {
                            e2.a.n("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = v.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + v.substring(indexOf);
                        int i18 = l4 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i18);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i18);
                        allocate.putShort(n10);
                        allocate.putShort(n11);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    e2.a.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = w3.n.a(uuid2, null, bArr8);
            }
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 27 && Objects.equals(uuid, b2.i.c) && (j3 = w3.n.j(bArr8)) != null) {
                bArr8 = w3.n.a(b2.i.b, (UUID[]) j3.d, (byte[]) j3.c);
            }
            if (i19 >= 23 || !b2.i.d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                    String str4 = Build.MODEL;
                    if (!"AFTB".equals(str4)) {
                        if (!"AFTS".equals(str4)) {
                            if (!"AFTM".equals(str4)) {
                            }
                        }
                    }
                }
                bArr3 = bArr8;
                String str5 = nVar.d;
                if (i19 < 26 && b2.i.c.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) {
                    str5 = "cenc";
                }
                str = str5;
                bArr2 = bArr3;
                nVar2 = nVar;
            }
            bArr3 = w3.n.k(uuid, bArr8);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] data = keyRequest.getData();
        if (b2.i.c.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = d0.p(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && nVar2 != null) {
                str2 = nVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                keyRequest.getRequestType();
            }
            return new p(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = nVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
        return new p(defaultUrl, data);
    }

    @Override // n2.r
    public final int a0() {
        return 2;
    }

    @Override // n2.r
    public final void c(final g3 g3Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: n2.t
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                g3 g3Var2 = g3Var;
                uVar.getClass();
                androidx.mediarouter.app.c cVar = ((e) g3Var2.b).M;
                cVar.getClass();
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // n2.r
    public final Map h(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // n2.r
    public final boolean j0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 >= 31) {
            boolean equals2 = uuid.equals(b2.i.d);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(b2.i.c);
            }
            if (equals) {
                return h0.b(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i10 >= 27 || !Objects.equals(uuid, b2.i.c)) ? uuid : b2.i.b, bArr);
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
            boolean z10 = !uuid.equals(b2.i.c);
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
    public final void l(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                h0.e(this.b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // n2.r
    public final q p() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
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
    public final h2.b x(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i10 < 27 && Objects.equals(uuid, b2.i.c)) {
            uuid = b2.i.b;
        }
        return new s(uuid, bArr);
    }
}
