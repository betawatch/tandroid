package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class po {
    public final long a;
    public boolean e;
    public final /* synthetic */ hp h;
    public final ArrayList b = new ArrayList();
    public boolean c = true;
    public boolean d = false;
    public int f = -1;
    public int g = -1;

    public po(hp hpVar, long j10) {
        this.h = hpVar;
        this.a = j10;
    }

    public final void a(final int i3, final int i10) {
        if (this.e || i10 <= 0 || i3 < 0) {
            return;
        }
        if (i10 == this.g && i3 == this.f) {
            return;
        }
        this.e = true;
        this.f = i3;
        this.g = i10;
        long j10 = this.a;
        hp hpVar = this.h;
        if (j10 < 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.add_offset = i3;
            tL_messages_search.limit = i10;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = hpVar.j1(j10);
            final int i11 = 1;
            hpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: org.telegram.messenger.oo
                public final /* synthetic */ po b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            if (tL_error == null) {
                                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                po poVar = this.b;
                                poVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                g0.h3(new k2.a0(poVar, photos_photos, i3, i10, 5));
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                po poVar2 = this.b;
                                poVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                g0.h3(new k2.a0(poVar2, messages_messages, i3, i10, 6));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.User a22 = hpVar.a2(Long.valueOf(j10));
        if (a22 == null) {
            this.e = false;
            return;
        }
        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
        tL_photos_getUserPhotos.offset = i3;
        tL_photos_getUserPhotos.limit = i10;
        tL_photos_getUserPhotos.max_id = 0L;
        tL_photos_getUserPhotos.user_id = hpVar.q1(a22);
        final int i12 = 0;
        hpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: org.telegram.messenger.oo
            public final /* synthetic */ po b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i12) {
                    case 0:
                        if (tL_error == null) {
                            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                            po poVar = this.b;
                            poVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                            g0.h3(new k2.a0(poVar, photos_photos, i3, i10, 5));
                            break;
                        }
                        break;
                    default:
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            po poVar2 = this.b;
                            poVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            g0.h3(new k2.a0(poVar2, messages_messages, i3, i10, 6));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void b(int i3, boolean z10) {
        ArrayList arrayList = this.b;
        int i10 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i3 < 0) {
            i3 += arrayList.size();
        }
        if (i3 >= arrayList.size()) {
            i3 -= arrayList.size();
        }
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == null) {
                if (z10) {
                    while (arrayList.get(i3) != null) {
                        i3++;
                        if (i3 >= arrayList.size()) {
                            i3 = 0;
                        }
                    }
                    while (i10 <= 80) {
                        int i12 = i3 + i10;
                        if (i12 >= arrayList.size() || arrayList.get(i12) != null) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        a(i3, i10);
                        return;
                    }
                    return;
                }
                while (arrayList.get(i3) != null) {
                    i3--;
                    if (i3 < 0) {
                        i3 = arrayList.size() - 1;
                    }
                }
                while (i10 <= 80) {
                    int i13 = i3 - i10;
                    if (i13 < 0 || arrayList.get(i13) != null) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    a(i3 - i10, i10);
                    return;
                }
                return;
            }
        }
    }

    public final void c(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return;
            }
            arrayList.add(0, (TLRPC.Photo) arrayList.remove(i3));
            g();
            this.h.getNotificationCenter().k(hs.e3, this);
        }
    }

    public final void d(int i3, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z10 = this.d;
        this.e = false;
        this.d = true;
        this.c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.b;
        boolean z11 = max != arrayList.size() || i3 + i10 > arrayList.size();
        if (!z11) {
            int i11 = 0;
            while (true) {
                if (i11 >= photos_photos.photos.size()) {
                    break;
                }
                int i12 = i3 + i11;
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).id != photos_photos.photos.get(i11).id) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        if (z11) {
            arrayList.clear();
            for (int i13 = 0; i13 < photos_photos.count; i13++) {
                int i14 = i13 - i3;
                arrayList.add((i14 < 0 || i14 >= photos_photos.photos.size()) ? null : photos_photos.photos.get(i14));
            }
        } else {
            for (int i15 = 0; i15 < photos_photos.photos.size(); i15++) {
                arrayList.set(i3 + i15, photos_photos.photos.get(i15));
            }
        }
        g();
        this.h.getNotificationCenter().k(hs.e3, this);
        if (z10 || i3 != 0 || i10 >= arrayList.size() || arrayList.size() - i10 <= 80) {
            return;
        }
        a(arrayList.size() - 80, 80);
    }

    public final void e(long j10) {
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i3);
            if (photo != null && photo.id == j10) {
                arrayList.remove(i3);
                i3--;
                z10 = true;
            }
            i3++;
        }
        if (z10) {
            g();
            this.h.getNotificationCenter().k(hs.e3, this);
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
        this.h.getMessagesStorage().a.c(new no(this, 1));
    }
}
