package o3;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.text.TextUtils;
import b4.e0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m.j0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 implements w {
    public static final j0 d = new j0(10);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public a0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = j3.h.b;
        h5.a.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((h5.d0.a >= 27 || !j3.h.c.equals(uuid)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (j3.h.d.equals(uuid) && "ASUS_Z00AD".equals(h5.d0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // o3.w
    public final byte[] B() {
        return this.b.openSession();
    }

    @Override // o3.w
    public final void C(final c cVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o3.y
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                a0 a0Var = a0.this;
                c cVar2 = cVar;
                a0Var.getClass();
                androidx.mediarouter.app.d dVar = ((f) cVar2.b).J;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // o3.w
    public final void G(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // o3.w
    public final void H(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // o3.w
    public final byte[] X(byte[] bArr, byte[] bArr2) {
        if (j3.h.c.equals(this.a) && h5.d0.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(h5.d0.m(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(r8.d.c);
            } catch (JSONException e) {
                h5.a.p("ClearKeyUtil", "Failed to adjust response data: ".concat(h5.d0.m(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // o3.w
    public final void Y(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // o3.w
    public final Map a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x019f, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    @Override // o3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b0(byte[] bArr, List list, int i10, HashMap hashMap) {
        byte[] bArr2;
        String str;
        g gVar;
        byte[] bArr3;
        UUID uuid = this.a;
        g gVar2 = null;
        if (list != null) {
            if (j3.h.d.equals(uuid)) {
                if (h5.d0.a >= 28 && list.size() > 1) {
                    g gVar3 = (g) list.get(0);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        g gVar4 = (g) list.get(i12);
                        byte[] bArr4 = gVar4.e;
                        bArr4.getClass();
                        if (h5.d0.a(gVar4.d, gVar3.d) && h5.d0.a(gVar4.c, gVar3.c) && z3.j.e(bArr4) != null) {
                            i11 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i11];
                    int i13 = 0;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        byte[] bArr6 = ((g) list.get(i14)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i13, length);
                        i13 += length;
                    }
                    gVar = new g(gVar3.b, gVar3.c, gVar3.d, bArr5);
                }
                for (int i15 = 0; i15 < list.size(); i15++) {
                    g gVar5 = (g) list.get(i15);
                    byte[] bArr7 = gVar5.e;
                    bArr7.getClass();
                    e0 e = z3.j.e(bArr7);
                    int i16 = e == null ? -1 : e.b;
                    int i17 = h5.d0.a;
                    if ((i17 < 23 && i16 == 0) || (i17 >= 23 && i16 == 1)) {
                        gVar = gVar5;
                        break;
                    }
                }
                gVar = (g) list.get(0);
            } else {
                gVar = (g) list.get(0);
            }
            byte[] bArr8 = gVar.e;
            bArr8.getClass();
            UUID uuid2 = j3.h.e;
            if (uuid2.equals(uuid)) {
                byte[] f10 = z3.j.f(bArr8, uuid);
                if (f10 != null) {
                    bArr8 = f10;
                }
                h5.w wVar = new h5.w(bArr8);
                int i18 = wVar.i();
                short k10 = wVar.k();
                short k11 = wVar.k();
                if (k10 == 1 && k11 == 1) {
                    short k12 = wVar.k();
                    Charset charset = r8.d.e;
                    String s6 = wVar.s(k12, charset);
                    if (!s6.contains("<LA_URL>")) {
                        int indexOf = s6.indexOf("</DATA>");
                        if (indexOf == -1) {
                            h5.a.K("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = s6.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + s6.substring(indexOf);
                        int i19 = i18 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i19);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i19);
                        allocate.putShort(k10);
                        allocate.putShort(k11);
                        allocate.putShort((short) (str2.length() * 2));
                        allocate.put(str2.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    h5.a.v("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = z3.j.a(uuid2, null, bArr8);
            }
            int i20 = h5.d0.a;
            if (i20 >= 23 || !j3.h.d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(h5.d0.c)) {
                    String str3 = h5.d0.d;
                    if (!"AFTB".equals(str3)) {
                        if (!"AFTS".equals(str3)) {
                            if (!"AFTM".equals(str3)) {
                            }
                        }
                    }
                }
                bArr3 = bArr8;
                String str4 = gVar.d;
                str = (i20 < 26 && j3.h.c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
                bArr2 = bArr3;
                gVar2 = gVar;
            }
            bArr3 = z3.j.f(bArr8, uuid);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] data = keyRequest.getData();
        if (j3.h.c.equals(uuid) && h5.d0.a < 27) {
            data = h5.d0.m(data).replace('+', '-').replace('/', '_').getBytes(r8.d.c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (h5.d0.a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && gVar2 != null) {
            String str5 = gVar2.c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (h5.d0.a >= 23) {
            keyRequest.getRequestType();
        }
        return new u(defaultUrl, data);
    }

    @Override // o3.w
    public final v d() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new v(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // o3.w
    public final int h0() {
        return 2;
    }

    @Override // o3.w
    public final boolean j0(String str, byte[] bArr) {
        if (h5.d0.a >= 31) {
            return z.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // o3.w
    public final void k(byte[] bArr, k3.k kVar) {
        if (h5.d0.a >= 31) {
            try {
                z.b(this.b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                h5.a.K("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // o3.w
    public final synchronized void release() {
        int i10 = this.c - 1;
        this.c = i10;
        if (i10 == 0) {
            this.b.release();
        }
    }

    @Override // o3.w
    public final n3.b z(byte[] bArr) {
        int i10 = h5.d0.a;
        UUID uuid = this.a;
        boolean z4 = i10 < 21 && j3.h.d.equals(uuid) && "L3".equals(this.b.getPropertyString("securityLevel"));
        if (i10 < 27 && j3.h.c.equals(uuid)) {
            uuid = j3.h.b;
        }
        return new x(uuid, bArr, z4);
    }
}
