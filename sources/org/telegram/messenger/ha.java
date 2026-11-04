package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ha {
    public static volatile ha[] g = new ha[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ga b;
    public final ga c;
    public final ga d;
    public final SharedPreferences e;
    public final ArrayList f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public ha(int i3) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.a = i3;
        this.b = new ga(i3);
        this.c = new ga(i3);
        this.d = new ga(i3);
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("hashtag_search_history" + i3, 0);
        this.e = sharedPreferences;
        int i10 = sharedPreferences.getInt("count", 0);
        arrayList.clear();
        arrayList.ensureCapacity(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            String string = sharedPreferences.getString("e_" + i11, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            arrayList.add(string);
        }
    }

    public static ha a(int i3) {
        ha haVar;
        ha haVar2 = g[i3];
        if (haVar2 != null) {
            return haVar2;
        }
        synchronized (h[i3]) {
            try {
                haVar = g[i3];
                if (haVar == null) {
                    ha[] haVarArr = g;
                    ha haVar3 = new ha(i3);
                    haVarArr[i3] = haVar3;
                    haVar = haVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return haVar;
    }

    public final ga b(int i3) {
        if (i3 == 1) {
            return this.b;
        }
        if (i3 == 2) {
            return this.c;
        }
        if (i3 == 3) {
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            edit.putString(k2.p1.i(i3, "e_"), (String) arrayList.get(i3));
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final int i3, final int i10, final int i11, String str) {
        String str2;
        final String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final ga b10 = b(i10);
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
            int i12 = this.a;
            if (!isEmpty) {
                TLObject f22 = hp.s1(i12).f2(str3);
                if (f22 == null) {
                    k7 a10 = hp.s1(i12).d2().a(str3, null, new u10() { // from class: org.telegram.messenger.da
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            ha haVar = ha.this;
                            int i13 = haVar.a;
                            ga gaVar = b10;
                            String str5 = gaVar.k;
                            String str6 = str4;
                            if (TextUtils.equals(str5, str6)) {
                                TLObject f23 = hp.s1(i13).f2(str3);
                                int i14 = i3;
                                if (f23 != null) {
                                    haVar.e(i14, i10, i11, str6);
                                    return;
                                }
                                if (r5[0] == gaVar.e) {
                                    gaVar.e = null;
                                    gaVar.f = false;
                                    gaVar.n = true;
                                    gaVar.m = 0;
                                    hs.f(i13).k(hs.I0, Integer.valueOf(i14), Integer.valueOf(gaVar.m), Boolean.valueOf(gaVar.n), Integer.valueOf(gaVar.b()), Integer.valueOf(gaVar.l), 0);
                                }
                            }
                        }
                    });
                    b10.e = a10;
                    final Runnable[] runnableArr = {a10};
                    return;
                }
                tLObject = f22;
            }
            if (i10 == 1) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.limit = 21;
                tL_messages_searchGlobal.q = str4;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_channels_searchPosts = tL_messages_searchGlobal;
                if (b10.i != null) {
                    tL_messages_searchGlobal.offset_rate = b10.g;
                    tL_messages_searchGlobal.offset_id = b10.h;
                    tL_messages_searchGlobal.offset_peer = hp.s1(i12).m1(b10.i);
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                }
            } else if (tLObject != null) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = hp.k1(tLObject);
                tL_messages_search.q = str2;
                tL_messages_search.limit = 21;
                int i13 = b10.h;
                tL_channels_searchPosts = tL_messages_search;
                if (i13 != 0) {
                    tL_messages_search.offset_id = i13;
                    tL_channels_searchPosts = tL_messages_search;
                }
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
                    tL_channels_searchPosts2.offset_peer = hp.s1(i12).m1(b10.i);
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new RequestDelegate() { // from class: org.telegram.messenger.ea
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                        return;
                    }
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        ha haVar = ha.this;
                        if (i14 >= size) {
                            g0.h3(new o4.w0(haVar, r4, b10, messages_messages, arrayList, i3, i11));
                            return;
                        }
                        TLRPC.Message message = arrayList2.get(i14);
                        i14++;
                        zi ziVar = new zi(haVar.a, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                        if (ziVar.A2()) {
                            ziVar.Q2 = true;
                        }
                        ziVar.L5(str4, false);
                        arrayList.add(ziVar);
                    }
                }
            });
            b10.d = sendRequest;
            final int[] iArr = {sendRequest};
        }
    }
}
