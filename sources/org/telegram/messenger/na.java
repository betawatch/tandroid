package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class na {
    public static volatile na[] g = new na[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ma b;
    public final ma c;
    public final ma d;
    public final SharedPreferences e;
    public final ArrayList f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public na(int i7) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.a = i7;
        this.b = new ma(i7);
        this.c = new ma(i7);
        this.d = new ma(i7);
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("hashtag_search_history" + i7, 0);
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

    public static na a(int i7) {
        na naVar;
        na naVar2 = g[i7];
        if (naVar2 != null) {
            return naVar2;
        }
        synchronized (h[i7]) {
            try {
                naVar = g[i7];
                if (naVar == null) {
                    na[] naVarArr = g;
                    na naVar3 = new na(i7);
                    naVarArr[i7] = naVar3;
                    naVar = naVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return naVar;
    }

    public final ma b(int i7) {
        if (i7 == 1) {
            return this.b;
        }
        if (i7 == 2) {
            return this.c;
        }
        if (i7 == 3) {
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            edit.putString(i5.c.i(i7, "e_"), (String) arrayList.get(i7));
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final int i7, final int i10, final int i11, String str) {
        String str2;
        final String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final ma b10 = b(i10);
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
                TLObject h22 = np.u1(i12).h2(str3);
                if (h22 == null) {
                    l7 a10 = np.u1(i12).f2().a(str3, null, new y10() { // from class: org.telegram.messenger.ia
                        @Override // org.telegram.messenger.y10
                        public final void a(Object obj) {
                            na naVar = na.this;
                            int i13 = naVar.a;
                            ma maVar = b10;
                            String str5 = maVar.k;
                            String str6 = str4;
                            if (TextUtils.equals(str5, str6)) {
                                TLObject h23 = np.u1(i13).h2(str3);
                                int i14 = i7;
                                if (h23 != null) {
                                    naVar.e(i14, i10, i11, str6);
                                    return;
                                }
                                if (r5[0] == maVar.e) {
                                    maVar.e = null;
                                    maVar.f = false;
                                    maVar.n = true;
                                    maVar.m = 0;
                                    ls.f(i13).k(ls.I0, Integer.valueOf(i14), Integer.valueOf(maVar.m), Boolean.valueOf(maVar.n), Integer.valueOf(maVar.b()), Integer.valueOf(maVar.l), 0);
                                }
                            }
                        }
                    });
                    b10.e = a10;
                    final Runnable[] runnableArr = {a10};
                    return;
                }
                tLObject = h22;
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
                    tL_messages_searchGlobal.offset_peer = np.u1(i12).o1(b10.i);
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                }
            } else if (tLObject != null) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = np.m1(tLObject);
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
                    tL_channels_searchPosts2.offset_peer = np.u1(i12).o1(b10.i);
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new RequestDelegate() { // from class: org.telegram.messenger.ja
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
                        na naVar = na.this;
                        if (i14 >= size) {
                            g0.g3(new ka(naVar, r4, b10, messages_messages, arrayList, i7, i11));
                            return;
                        }
                        TLRPC.Message message = arrayList2.get(i14);
                        i14++;
                        gj gjVar = new gj(naVar.a, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                        if (gjVar.z2()) {
                            gjVar.S2 = true;
                        }
                        gjVar.K5(str4, false);
                        arrayList.add(gjVar);
                    }
                }
            });
            b10.d = sendRequest;
            final int[] iArr = {sendRequest};
        }
    }
}
