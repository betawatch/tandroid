package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ c7(int i10, int i11, int i12, Object obj, Object obj2, TLObject tLObject) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
        this.f = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        byte[] bArr;
        int i11;
        switch (this.a) {
            case 0:
                m7 m7Var = (m7) this.d;
                l7 l7Var = (l7) this.e;
                int i12 = this.b;
                int i13 = this.c;
                TLObject tLObject2 = this.f;
                if (l7Var.k) {
                    f8.d("received chunk but definitely cancelled offset=" + l7Var.e + " size=" + l7Var.c + " token=" + l7Var.a);
                    return;
                }
                if (l7Var.j) {
                    f8.d("received cancelled chunk after cancelRequests! offset=" + l7Var.e + " size=" + l7Var.c + " token=" + l7Var.a);
                }
                if (!m7Var.G0.contains(l7Var)) {
                    if (!m7Var.H0.contains(l7Var)) {
                        return;
                    }
                    int i14 = 0;
                    boolean z10 = false;
                    while (i14 < m7Var.G0.size()) {
                        l7 l7Var2 = (l7) m7Var.G0.get(i14);
                        if (l7Var2 == null || l7Var2 == l7Var) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            if (l7Var2.e == l7Var.e && l7Var2.c == l7Var.c) {
                                f8.d("received cancelled chunk faster than new one! received=" + l7Var.a + " new=" + l7Var2.a);
                                if (z10) {
                                    m7Var.G0.remove(i14);
                                    i14--;
                                } else {
                                    m7Var.G0.set(i14, l7Var);
                                    z10 = true;
                                }
                            }
                        }
                        i14 += i11;
                    }
                }
                int i15 = 0;
                while (i15 < m7Var.H0.size()) {
                    l7 l7Var3 = (l7) m7Var.H0.get(i15);
                    if (l7Var3 != null && l7Var3 != l7Var && l7Var3.e == l7Var.e && l7Var3.c == l7Var.c) {
                        f8.d("received new chunk faster than cancelled one! received=" + l7Var.a + " cancelled=" + l7Var3.a);
                        m7Var.H0.remove(i15);
                        i15 += -1;
                    }
                    i15++;
                }
                if (v2.a) {
                    StringBuilder sb2 = new StringBuilder("debug_loading: ");
                    sb2.append(m7Var.L0.getName());
                    sb2.append(" time=");
                    sb2.append(System.currentTimeMillis() - l7Var.b);
                    sb2.append(" dcId=");
                    sb2.append(i12);
                    sb2.append(" cdn=");
                    sb2.append(m7Var.u0);
                    sb2.append(" conType=");
                    sb2.append(i13);
                    sb2.append(" reqId");
                    i0.a.p(l7Var.a, sb2);
                }
                if (l7Var == m7Var.f0) {
                    i0.a.q(m7Var.f0.e, new StringBuilder("frame get request completed "));
                    m7Var.f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = l7Var.l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        m7Var.G0.remove(l7Var);
                        long j10 = m7Var.Q;
                        long j11 = l7Var.c;
                        m7Var.Q = j10 - j11;
                        ArrayList arrayList = m7Var.O;
                        long j12 = l7Var.e;
                        m7.n(j12, j11 + j12, arrayList);
                        return;
                    }
                    if (w8.r(tL_error.text)) {
                        m7Var.p(l7Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        m7Var.u0 = false;
                        m7Var.e(l7Var, false, false);
                        m7Var.s(i13);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (m7Var.q0 == null) {
                            m7Var.q0 = new HashMap();
                        }
                        for (int i16 = 0; i16 < tL_upload_fileCdnRedirect.file_hashes.size(); i16++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i16);
                            m7Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 == null || (bArr = tL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                        Runnable runnable2 = l7Var.l;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "bad redirect response";
                        tL_error2.code = 400;
                        m7Var.m(l7Var, tL_error2);
                        return;
                    }
                    m7Var.u0 = true;
                    if (m7Var.P == null) {
                        ArrayList arrayList2 = new ArrayList();
                        m7Var.P = arrayList2;
                        arrayList2.add(new k7(0L, m7Var.q));
                    }
                    m7Var.y0 = tL_upload_fileCdnRedirect.dc_id;
                    m7Var.v0 = tL_upload_fileCdnRedirect.encryption_iv;
                    m7Var.w0 = tL_upload_fileCdnRedirect.encryption_key;
                    m7Var.x0 = tL_upload_fileCdnRedirect.file_token;
                    m7Var.e(l7Var, false, false);
                    m7Var.s(i13);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (m7Var.z0) {
                        return;
                    }
                    m7Var.e(l7Var, false, false);
                    m7Var.z0 = true;
                    TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                    tL_upload_reuploadCdnFile.file_token = m7Var.x0;
                    tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                    ConnectionsManager.getInstance(m7Var.R).sendRequest(tL_upload_reuploadCdnFile, new fo(m7Var, i13, l7Var, 1), null, null, 0, m7Var.T, 1, true);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_upload_file) {
                    l7Var.f = (TLRPC.TL_upload_file) tLObject;
                } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                    TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                    l7Var.g = tL_upload_webFile;
                    if (m7Var.b0 == 0 && (i10 = tL_upload_webFile.size) != 0) {
                        m7Var.b0 = i10;
                    }
                } else {
                    l7Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                }
                if (tLObject != null) {
                    int i17 = m7Var.b1;
                    if (i17 == 50331648) {
                        uz.e(m7Var.R).h(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                    } else if (i17 == 33554432) {
                        uz.e(m7Var.R).h(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                    } else if (i17 == 16777216) {
                        uz.e(m7Var.R).h(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                    } else if (i17 == 67108864) {
                        String str = m7Var.P0;
                        if (str == null || !(str.toLowerCase().endsWith("mp3") || m7Var.P0.toLowerCase().endsWith("m4a"))) {
                            uz.e(m7Var.R).h(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                        } else {
                            uz.e(m7Var.R).h(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                        }
                    }
                }
                if (tL_error == null && tLObject != null) {
                    int objectSize = tLObject.getObjectSize();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j13 = m7Var.g1;
                    if (j13 == 0 || elapsedRealtime - m7Var.h1 > 2000) {
                        m7Var.g1 = elapsedRealtime;
                        m7Var.i1 = 0L;
                        m7Var.j1 = 0;
                    } else {
                        long j14 = m7Var.i1 + objectSize;
                        m7Var.i1 = j14;
                        int i18 = m7Var.j1 + 1;
                        m7Var.j1 = i18;
                        if (i18 >= 2 && j14 >= 131072) {
                            long j15 = elapsedRealtime - j13;
                            if (j15 >= 500) {
                                long j16 = j14 * 8;
                                synchronized (d6.class) {
                                    if (j16 > 0 && j15 > 0) {
                                        double d = (j16 * 1000.0d) / j15;
                                        try {
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            long j17 = d6.b;
                                            if (j17 != 0 && elapsedRealtime2 - j17 <= 60000) {
                                                d = (d * 0.3d) + (d6.a * 0.7d);
                                            }
                                            d6.a = d;
                                            d6.b = elapsedRealtime2;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                m7Var.g1 = elapsedRealtime;
                                m7Var.i1 = 0L;
                                m7Var.j1 = 0;
                            }
                        }
                    }
                    m7Var.h1 = elapsedRealtime;
                }
                m7Var.m(l7Var, tL_error);
                Runnable runnable3 = l7Var.l;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 1:
                zf.z zVar = (zf.z) this.d;
                String str2 = (String) this.e;
                int i19 = this.b;
                int i20 = this.c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList3 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i21 = 0; i21 < messages_messages.chats.size(); i21++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i21);
                        hVar.k(chat, chat.id);
                    }
                    for (int i22 = 0; i22 < messages_messages.users.size(); i22++) {
                        TLRPC.User user = messages_messages.users.get(i22);
                        hVar2.k(user, user.id);
                    }
                    for (int i23 = 0; i23 < messages_messages.messages.size(); i23++) {
                        jj jjVar = new jj(zVar.s0, messages_messages.messages.get(i23), hVar2, hVar, false, true);
                        arrayList3.add(jjVar);
                        jjVar.J5(str2, true);
                    }
                }
                i0.g3(new bg(zVar, i19, i20, tL_error, str2, tLObject, tL_messages_search, arrayList3, 1));
                return;
            default:
                zf.z zVar2 = (zf.z) this.d;
                String str3 = (String) this.e;
                int i24 = this.b;
                int i25 = this.c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i26 = zVar2.s0;
                ArrayList arrayList4 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i27 = 0; i27 < messages_messages2.chats.size(); i27++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i27);
                        hVar3.k(chat2, chat2.id);
                    }
                    for (int i28 = 0; i28 < messages_messages2.users.size(); i28++) {
                        TLRPC.User user2 = messages_messages2.users.get(i28);
                        hVar4.k(user2, user2.id);
                    }
                    for (int i29 = 0; i29 < messages_messages2.messages.size(); i29++) {
                        jj jjVar2 = new jj(zVar2.s0, messages_messages2.messages.get(i29), hVar4, hVar3, false, true);
                        arrayList4.add(jjVar2);
                        jjVar2.J5(str3, true);
                    }
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i30 = 0; i30 < messages_messages3.messages.size(); i30++) {
                        TLRPC.Message message = messages_messages3.messages.get(i30);
                        long B0 = jj.B0(message);
                        if (((Integer) (message.out ? vp.r1(i26).P : vp.r1(i26).O).get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                    }
                }
                bg bgVar = new bg(zVar2, i24, i25, tL_error, str3, tLObject, tL_messages_searchGlobal, arrayList4, 2);
                if (hashSet.isEmpty()) {
                    i0.g3(bgVar);
                    return;
                } else {
                    hs.a0(i26).a.c(new rh.l5(zVar2, hashSet, bgVar, 27));
                    return;
                }
        }
    }
}
