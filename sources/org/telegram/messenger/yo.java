package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class yo {
    public final long a;
    public boolean e;
    public final /* synthetic */ qp h;
    public final ArrayList b = new ArrayList();
    public boolean c = true;
    public boolean d = false;
    public int f = -1;
    public int g = -1;

    public yo(qp qpVar, long j3) {
        this.h = qpVar;
        this.a = j3;
    }

    public final void a(final int i7, final int i10) {
        if (this.e || i10 <= 0 || i7 < 0) {
            return;
        }
        if (i10 == this.g && i7 == this.f) {
            return;
        }
        this.e = true;
        this.f = i7;
        this.g = i10;
        long j3 = this.a;
        qp qpVar = this.h;
        if (j3 < 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.add_offset = i7;
            tL_messages_search.limit = i10;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = qpVar.j1(j3);
            final int i11 = 1;
            qpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: org.telegram.messenger.xo
                public final /* synthetic */ yo b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            if (tL_error == null) {
                                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                yo yoVar = this.b;
                                yoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                g0.h3(new l2.a0(yoVar, photos_photos, i7, i10, 5));
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                yo yoVar2 = this.b;
                                yoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                g0.h3(new l2.a0(yoVar2, messages_messages, i7, i10, 6));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.User a22 = qpVar.a2(Long.valueOf(j3));
        if (a22 == null) {
            this.e = false;
            return;
        }
        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
        tL_photos_getUserPhotos.offset = i7;
        tL_photos_getUserPhotos.limit = i10;
        tL_photos_getUserPhotos.max_id = 0L;
        tL_photos_getUserPhotos.user_id = qpVar.q1(a22);
        final int i12 = 0;
        qpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: org.telegram.messenger.xo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i12) {
                    case 0:
                        if (tL_error == null) {
                            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                            yo yoVar = this.b;
                            yoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                            g0.h3(new l2.a0(yoVar, photos_photos, i7, i10, 5));
                            break;
                        }
                        break;
                    default:
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            yo yoVar2 = this.b;
                            yoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            g0.h3(new l2.a0(yoVar2, messages_messages, i7, i10, 6));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void b(int i7, boolean z9) {
        ArrayList arrayList = this.b;
        int i10 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i7 < 0) {
            i7 += arrayList.size();
        }
        if (i7 >= arrayList.size()) {
            i7 -= arrayList.size();
        }
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == null) {
                if (z9) {
                    while (arrayList.get(i7) != null) {
                        i7++;
                        if (i7 >= arrayList.size()) {
                            i7 = 0;
                        }
                    }
                    while (i10 <= 80) {
                        int i12 = i7 + i10;
                        if (i12 >= arrayList.size() || arrayList.get(i12) != null) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        a(i7, i10);
                        return;
                    }
                    return;
                }
                while (arrayList.get(i7) != null) {
                    i7--;
                    if (i7 < 0) {
                        i7 = arrayList.size() - 1;
                    }
                }
                while (i10 <= 80) {
                    int i13 = i7 - i10;
                    if (i13 < 0 || arrayList.get(i13) != null) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    a(i7 - i10, i10);
                    return;
                }
                return;
            }
        }
    }

    public final void c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return;
            }
            arrayList.add(0, (TLRPC.Photo) arrayList.remove(i7));
            g();
            this.h.getNotificationCenter().k(qs.e3, this);
        }
    }

    public final void d(int i7, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z9 = this.d;
        this.e = false;
        this.d = true;
        this.c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.b;
        boolean z10 = max != arrayList.size() || i7 + i10 > arrayList.size();
        if (!z10) {
            int i11 = 0;
            while (true) {
                if (i11 >= photos_photos.photos.size()) {
                    break;
                }
                int i12 = i7 + i11;
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).id != photos_photos.photos.get(i11).id) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            arrayList.clear();
            for (int i13 = 0; i13 < photos_photos.count; i13++) {
                int i14 = i13 - i7;
                arrayList.add((i14 < 0 || i14 >= photos_photos.photos.size()) ? null : photos_photos.photos.get(i14));
            }
        } else {
            for (int i15 = 0; i15 < photos_photos.photos.size(); i15++) {
                arrayList.set(i7 + i15, photos_photos.photos.get(i15));
            }
        }
        g();
        this.h.getNotificationCenter().k(qs.e3, this);
        if (z9 || i7 != 0 || i10 >= arrayList.size() || arrayList.size() - i10 <= 80) {
            return;
        }
        a(arrayList.size() - 80, 80);
    }

    public final void e(long j3) {
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i7);
            if (photo != null && photo.id == j3) {
                arrayList.remove(i7);
                i7--;
                z9 = true;
            }
            i7++;
        }
        if (z9) {
            g();
            this.h.getNotificationCenter().k(qs.e3, this);
        }
    }

    public final void f() {
        this.b.clear();
        this.f = -1;
        this.g = -1;
        this.c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().a.c(new wo(this, 1));
    }
}
