package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class oa {
    public static volatile oa[] g = new oa[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final na b;
    public final na c;
    public final na d;
    public final SharedPreferences e;
    public final ArrayList f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public oa(int i10) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.a = i10;
        this.b = new na(i10);
        this.c = new na(i10);
        this.d = new na(i10);
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("hashtag_search_history" + i10, 0);
        this.e = sharedPreferences;
        int i11 = sharedPreferences.getInt("count", 0);
        arrayList.clear();
        arrayList.ensureCapacity(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            String string = sharedPreferences.getString("e_" + i12, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            arrayList.add(string);
        }
    }

    public static oa a(int i10) {
        oa oaVar;
        oa oaVar2 = g[i10];
        if (oaVar2 != null) {
            return oaVar2;
        }
        synchronized (h[i10]) {
            try {
                oaVar = g[i10];
                if (oaVar == null) {
                    oa[] oaVarArr = g;
                    oa oaVar3 = new oa(i10);
                    oaVarArr[i10] = oaVar3;
                    oaVar = oaVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oaVar;
    }

    public final na b(int i10) {
        if (i10 == 1) {
            return this.b;
        }
        if (i10 == 2) {
            return this.c;
        }
        if (i10 == 3) {
            return this.d;
        }
        throw new RuntimeException("Unknown search type");
    }

    public final void c(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            ArrayList arrayList = this.f;
            int indexOf = arrayList.indexOf(str);
            if (indexOf != -1) {
                if (indexOf == 0) {
                    return;
                } else {
                    arrayList.remove(indexOf);
                }
            }
            arrayList.add(0, str);
            if (arrayList.size() >= 100) {
                arrayList.subList(99, arrayList.size()).clear();
            }
            d();
        }
    }

    public final void d() {
        SharedPreferences.Editor edit = this.e.edit();
        edit.clear();
        ArrayList arrayList = this.f;
        edit.putInt("count", arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            edit.putString(i0.a.i(i10, "e_"), (String) arrayList.get(i10));
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final int i10, final int i11, String str, final int i12) {
        String str2;
        final String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final na b10 = b(i11);
        if (b10.k == null && str == null) {
            return;
        }
        if (str == null || !str.isEmpty()) {
            if (str == null) {
                str = b10.k;
            } else if (!TextUtils.equals(str, b10.k)) {
                b10.a();
            } else if (b10.f) {
                return;
            }
            final String str4 = str;
            b10.k = str4;
            int indexOf = str4.indexOf(64);
            TLObject tLObject = null;
            if (indexOf >= 0) {
                String substring = str4.substring(indexOf + 1);
                str2 = str4.substring(0, indexOf);
                str3 = substring;
            } else {
                str2 = str4;
                str3 = null;
            }
            b10.f = true;
            boolean isEmpty = TextUtils.isEmpty(str3);
            int i13 = this.a;
            if (!isEmpty) {
                TLObject e22 = vp.r1(i13).e2(str3);
                if (e22 == null) {
                    o7 a2 = vp.r1(i13).c2().a(str3, null, new q20() { // from class: org.telegram.messenger.ka
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj) {
                            oa oaVar = oa.this;
                            int i14 = oaVar.a;
                            na naVar = b10;
                            String str5 = naVar.k;
                            String str6 = str4;
                            if (TextUtils.equals(str5, str6)) {
                                TLObject e23 = vp.r1(i14).e2(str3);
                                int i15 = i10;
                                if (e23 != null) {
                                    oaVar.e(i15, i11, str6, i12);
                                    return;
                                }
                                if (r5[0] == naVar.e) {
                                    naVar.e = null;
                                    naVar.f = false;
                                    naVar.n = true;
                                    naVar.m = 0;
                                    zs.f(i14).k(zs.I0, Integer.valueOf(i15), Integer.valueOf(naVar.m), Boolean.valueOf(naVar.n), Integer.valueOf(naVar.b()), Integer.valueOf(naVar.l), 0);
                                }
                            }
                        }
                    });
                    b10.e = a2;
                    final Runnable[] runnableArr = {a2};
                    return;
                }
                tLObject = e22;
            }
            if (i11 == 1) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.limit = 21;
                tL_messages_searchGlobal.q = str4;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_channels_searchPosts = tL_messages_searchGlobal;
                if (b10.i != null) {
                    tL_messages_searchGlobal.offset_rate = b10.g;
                    tL_messages_searchGlobal.offset_id = b10.h;
                    tL_messages_searchGlobal.offset_peer = vp.r1(i13).l1(b10.i);
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                }
            } else if (tLObject != null) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = vp.j1(tLObject);
                tL_messages_search.q = str2;
                tL_messages_search.limit = 21;
                int i14 = b10.h;
                if (i14 != 0) {
                    tL_messages_search.offset_id = i14;
                }
                tL_channels_searchPosts = tL_messages_search;
            } else {
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts2 = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts2.flags |= 1;
                tL_channels_searchPosts2.hashtag = str4;
                tL_channels_searchPosts2.limit = 21;
                tL_channels_searchPosts2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_channels_searchPosts = tL_channels_searchPosts2;
                if (b10.i != null) {
                    tL_channels_searchPosts2.offset_rate = b10.g;
                    tL_channels_searchPosts2.offset_id = b10.h;
                    tL_channels_searchPosts2.offset_peer = vp.r1(i13).l1(b10.i);
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i13).sendRequest(tL_channels_searchPosts, new RequestDelegate() { // from class: org.telegram.messenger.la
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                        return;
                    }
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (true) {
                        oa oaVar = oa.this;
                        if (i15 >= size) {
                            i0.g3(new m4.y0(oaVar, r4, b10, messages_messages, arrayList, i10, i12));
                            return;
                        }
                        TLRPC.Message message = arrayList2.get(i15);
                        i15++;
                        jj jjVar = new jj(oaVar.a, message, null, null, null, null, null, true, true, 0L, false, false, false, i11);
                        if (jjVar.z2()) {
                            jjVar.N2 = true;
                        }
                        jjVar.J5(str4, false);
                        arrayList.add(jjVar);
                    }
                }
            });
            b10.d = sendRequest;
            final int[] iArr = {sendRequest};
        }
    }
}
