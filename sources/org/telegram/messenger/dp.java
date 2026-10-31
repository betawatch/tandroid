package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class dp {
    public final long a;
    public boolean e;
    public final /* synthetic */ vp h;
    public final ArrayList b = new ArrayList();
    public boolean c = true;
    public boolean d = false;
    public int f = -1;
    public int g = -1;

    public dp(vp vpVar, long j10) {
        this.h = vpVar;
        this.a = j10;
    }

    public final void a(final int i10, final int i11) {
        if (this.e || i11 <= 0 || i10 < 0) {
            return;
        }
        if (i11 == this.g && i10 == this.f) {
            return;
        }
        this.e = true;
        this.f = i10;
        this.g = i11;
        long j10 = this.a;
        vp vpVar = this.h;
        if (j10 < 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.add_offset = i10;
            tL_messages_search.limit = i11;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = vpVar.i1(j10);
            final int i12 = 1;
            vpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: org.telegram.messenger.cp
                public final /* synthetic */ dp b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            if (tL_error == null) {
                                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                dp dpVar = this.b;
                                dpVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                i0.g3(new i2.a0(dpVar, photos_photos, i10, i11, 5));
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                dp dpVar2 = this.b;
                                dpVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                i0.g3(new i2.a0(dpVar2, messages_messages, i10, i11, 6));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.User Z1 = vpVar.Z1(Long.valueOf(j10));
        if (Z1 == null) {
            this.e = false;
            return;
        }
        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
        tL_photos_getUserPhotos.offset = i10;
        tL_photos_getUserPhotos.limit = i11;
        tL_photos_getUserPhotos.max_id = 0L;
        tL_photos_getUserPhotos.user_id = vpVar.p1(Z1);
        final int i13 = 0;
        vpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: org.telegram.messenger.cp
            public final /* synthetic */ dp b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i13) {
                    case 0:
                        if (tL_error == null) {
                            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                            dp dpVar = this.b;
                            dpVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                            i0.g3(new i2.a0(dpVar, photos_photos, i10, i11, 5));
                            break;
                        }
                        break;
                    default:
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            dp dpVar2 = this.b;
                            dpVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            i0.g3(new i2.a0(dpVar2, messages_messages, i10, i11, 6));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void b(int i10, boolean z10) {
        ArrayList arrayList = this.b;
        int i11 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i10 < 0) {
            i10 += arrayList.size();
        }
        if (i10 >= arrayList.size()) {
            i10 -= arrayList.size();
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (arrayList.get(i12) == null) {
                if (z10) {
                    while (arrayList.get(i10) != null) {
                        i10++;
                        if (i10 >= arrayList.size()) {
                            i10 = 0;
                        }
                    }
                    while (i11 <= 80) {
                        int i13 = i10 + i11;
                        if (i13 >= arrayList.size() || arrayList.get(i13) != null) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 > 0) {
                        a(i10, i11);
                        return;
                    }
                    return;
                }
                while (arrayList.get(i10) != null) {
                    i10--;
                    if (i10 < 0) {
                        i10 = arrayList.size() - 1;
                    }
                }
                while (i11 <= 80) {
                    int i14 = i10 - i11;
                    if (i14 < 0 || arrayList.get(i14) != null) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    a(i10 - i11, i11);
                    return;
                }
                return;
            }
        }
    }

    public final void c(int i10, int i11, TLRPC.photos_Photos photos_photos) {
        boolean z10 = this.d;
        this.e = false;
        this.d = true;
        this.c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.b;
        boolean z11 = max != arrayList.size() || i10 + i11 > arrayList.size();
        if (!z11) {
            int i12 = 0;
            while (true) {
                if (i12 >= photos_photos.photos.size()) {
                    break;
                }
                int i13 = i10 + i12;
                if (arrayList.get(i13) != null && ((TLRPC.Photo) arrayList.get(i13)).id != photos_photos.photos.get(i12).id) {
                    z11 = true;
                    break;
                }
                i12++;
            }
        }
        if (z11) {
            arrayList.clear();
            for (int i14 = 0; i14 < photos_photos.count; i14++) {
                int i15 = i14 - i10;
                arrayList.add((i15 < 0 || i15 >= photos_photos.photos.size()) ? null : photos_photos.photos.get(i15));
            }
        } else {
            for (int i16 = 0; i16 < photos_photos.photos.size(); i16++) {
                arrayList.set(i10 + i16, photos_photos.photos.get(i16));
            }
        }
        f();
        this.h.getNotificationCenter().k(zs.e3, this);
        if (z10 || i10 != 0 || i11 >= arrayList.size() || arrayList.size() - i11 <= 80) {
            return;
        }
        a(arrayList.size() - 80, 80);
    }

    public final void d(long j10) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i10);
            if (photo != null && photo.id == j10) {
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            f();
            this.h.getNotificationCenter().k(zs.e3, this);
        }
    }

    public final void e() {
        this.b.clear();
        this.f = -1;
        this.g = -1;
        this.c = true;
        f();
    }

    public final void f() {
        this.h.getMessagesStorage().a.c(new bp(this, 1));
    }
}
