// default package

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class h77 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;

    public /* synthetic */ h77(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 5;
        byte b4 = 2;
        byte b5 = 3;
        byte b6 = 6;
        final byte b7 = 1;
        final byte b8 = 0;
        final uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.x2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    uc7Var.y2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    uc7Var.y2 = tL_help_termsOfServiceUpdate.expires;
                    hl.c3(new mn6((Object) uc7Var, (Object) tL_help_termsOfServiceUpdate, (byte) 27));
                } else {
                    uc7Var.y2 = uc7Var.getConnectionsManager().getCurrentTime() + 3600;
                }
                uc7Var.X3.edit().putInt("nextTosCheckTime", uc7Var.y2).commit();
                break;
            case 1:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
                break;
            case 2:
                if (tL_error == null) {
                    TLRPC.User X1 = uc7Var.X1(Long.valueOf(uc7Var.getUserConfig().e()));
                    if (X1 == null) {
                        X1 = uc7Var.getUserConfig().f();
                        uc7Var.i4(X1, true, false);
                    } else {
                        uc7Var.getUserConfig().v(X1);
                    }
                    if (X1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w = xb4.w(arrayList, 100, false, null, false);
                        TLRPC.PhotoSize w2 = xb4.w(arrayList, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        X1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w != null) {
                            tL_userProfilePhoto.photo_small = w.location;
                        }
                        if (w2 != null) {
                            tL_userProfilePhoto.photo_big = w2.location;
                        }
                        uc7Var.U0(X1.id).f();
                        uc7Var.U0(X1.id).a(0, 80);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(X1);
                        uc7Var.getMessagesStorage().n1(arrayList2, null, false, true);
                        hl.c3(new l87(uc7Var, (byte) 10));
                        break;
                    }
                }
                break;
            case 3:
                uc7Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i = 0; i < arrayList3.size(); i++) {
                        if (arrayList3.get(i) instanceof TLRPC.User) {
                            arrayList4.add((TLRPC.User) arrayList3.get(i));
                        }
                    }
                    uc7Var.getMessagesController().j4(arrayList4, false);
                    break;
                }
                break;
            case 4:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 5:
                if (tL_error == null) {
                    hl.c3(new c87(uc7Var, tLObject, b4));
                    break;
                }
                break;
            case 6:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 7:
                hl.c3(new c87(uc7Var, tLObject, b5));
                break;
            case 8:
                if (tL_error == null) {
                    uc7Var.C2 = System.currentTimeMillis();
                    uc7Var.F2 = false;
                    uc7Var.E2 = (byte) 0;
                } else {
                    long j = uc7Var.C2;
                    if (j != 0) {
                        uc7Var.C2 = j + 5000;
                    }
                }
                uc7Var.D2 = 0;
                break;
            case 9:
                if (tL_error == null) {
                    uc7Var.F2 = true;
                } else {
                    long j2 = uc7Var.C2;
                    if (j2 != 0) {
                        uc7Var.C2 = j2 + 5000;
                    }
                }
                uc7Var.D2 = 0;
                break;
            case 10:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, b6));
                    break;
                }
                break;
            case 11:
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, b3));
                    break;
                }
                break;
            case 12:
                hl.c3(new c87(uc7Var, tLObject, b2));
                break;
            case 13:
                hl.c3(new c87(uc7Var, tLObject, b8));
                break;
            case 14:
                uc7Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    break;
                }
                break;
            case 15:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, b5));
                    break;
                }
                break;
            case 16:
                hl.c3(new c87(uc7Var, tLObject, b3));
                break;
            case 17:
                if (tLObject instanceof Vector) {
                    ArrayList arrayList5 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    while (b8 < vector.objects.size()) {
                        arrayList5.add((TLRPC.DialogFilter) vector.objects.get(b8));
                        b8++;
                    }
                    kf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new gd7(messagesStorage, arrayList5, new l87(uc7Var, b4), b6));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z = uc7Var.m4;
                    boolean z2 = tL_messages_dialogFilters.tags_enabled;
                    if (z != z2) {
                        SharedPreferences.Editor edit = uc7Var.Y3.edit();
                        uc7Var.m4 = z2;
                        edit.putBoolean("folderTags", z2).apply();
                        hl.c3(new l87(uc7Var, b5));
                    }
                    kf7 messagesStorage2 = uc7Var.getMessagesStorage();
                    messagesStorage2.a.c(new gd7(messagesStorage2, tL_messages_dialogFilters.filters, new l87(uc7Var, b2), b6));
                    break;
                } else {
                    hl.c3(new l87(uc7Var, b3));
                    break;
                }
            case 18:
                uc7Var.getConnectionsManager().cleanup(false);
                hl.c3(new d87(tLObject, b8));
                break;
            case 19:
                uc7Var.getClass();
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 20:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    hl.c3(new Runnable() { // from class: k87
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b9 = b8;
                            TLRPC.TL_help_peerColors tL_help_peerColors2 = tL_help_peerColors;
                            uc7 uc7Var2 = uc7Var;
                            switch (b9) {
                                case 0:
                                    uc7Var2.R4 = false;
                                    uc7Var2.F3 = lc7.c(0, tL_help_peerColors2);
                                    uc7Var2.Y3.edit().putString("peerColors", uc7Var2.F3.toString()).apply();
                                    break;
                                default:
                                    uc7Var2.S4 = false;
                                    uc7Var2.G3 = lc7.c(1, tL_help_peerColors2);
                                    uc7Var2.Y3.edit().putString("profilePeerColors", uc7Var2.G3.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 21:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors2 = (TLRPC.TL_help_peerColors) tLObject;
                    hl.c3(new Runnable() { // from class: k87
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b9 = b7;
                            TLRPC.TL_help_peerColors tL_help_peerColors22 = tL_help_peerColors2;
                            uc7 uc7Var2 = uc7Var;
                            switch (b9) {
                                case 0:
                                    uc7Var2.R4 = false;
                                    uc7Var2.F3 = lc7.c(0, tL_help_peerColors22);
                                    uc7Var2.Y3.edit().putString("peerColors", uc7Var2.F3.toString()).apply();
                                    break;
                                default:
                                    uc7Var2.S4 = false;
                                    uc7Var2.G3 = lc7.c(1, tL_help_peerColors22);
                                    uc7Var2.Y3.edit().putString("profilePeerColors", uc7Var2.G3.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 22:
                uc7Var.a2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    uc7Var.getMessagesStorage().J1(tL_updates_state.date);
                    uc7Var.getMessagesStorage().K1(tL_updates_state.pts);
                    uc7Var.getMessagesStorage().M1(tL_updates_state.seq);
                    uc7Var.getMessagesStorage().L1(tL_updates_state.qts);
                    for (int i2 = 0; i2 < 3; i2++) {
                        uc7Var.Z3(i2, 2);
                    }
                    kf7 messagesStorage3 = uc7Var.getMessagesStorage();
                    kf7 messagesStorage4 = uc7Var.getMessagesStorage();
                    messagesStorage4.I();
                    int i3 = messagesStorage4.w;
                    kf7 messagesStorage5 = uc7Var.getMessagesStorage();
                    messagesStorage5.I();
                    int i4 = messagesStorage5.r;
                    kf7 messagesStorage6 = uc7Var.getMessagesStorage();
                    messagesStorage6.I();
                    int i5 = messagesStorage6.n;
                    kf7 messagesStorage7 = uc7Var.getMessagesStorage();
                    messagesStorage7.I();
                    messagesStorage3.B1(i3, i4, i5, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    uc7Var.a2 = true;
                    uc7Var.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new h77(uc7Var, (byte) 22));
                    break;
                }
                break;
            case 23:
                hl.c3(new c87(uc7Var, tLObject, b7));
                break;
            case 24:
                uc7 uc7Var2 = this.b;
                ConcurrentHashMap concurrentHashMap = uc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var2.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList6 = new ArrayList();
                    for (int i6 = 0; i6 < tL_messages_peerDialogs.dialogs.size(); i6++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i6);
                        wf3.w(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
                        if (num.intValue() == 0) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                                tL_updateReadChannelInbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelInbox.max_id = dialog.read_inbox_max_id;
                                tL_updateReadChannelInbox.still_unread_count = dialog.unread_count;
                                arrayList6.add(tL_updateReadChannelInbox);
                            } else {
                                TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                tL_updateReadHistoryInbox.peer = dialog.peer;
                                tL_updateReadHistoryInbox.max_id = dialog.read_inbox_max_id;
                                arrayList6.add(tL_updateReadHistoryInbox);
                            }
                        }
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
                        if (dialog.read_outbox_max_id > num2.intValue()) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TL_update.TL_updateReadChannelOutbox();
                                tL_updateReadChannelOutbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList6.add(tL_updateReadChannelOutbox);
                            } else {
                                TL_update.TL_updateReadHistoryOutbox tL_updateReadHistoryOutbox = new TL_update.TL_updateReadHistoryOutbox();
                                tL_updateReadHistoryOutbox.peer = dialog.peer;
                                tL_updateReadHistoryOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList6.add(tL_updateReadHistoryOutbox);
                            }
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        uc7Var2.X3(arrayList6, null, null, false, 0);
                        break;
                    }
                }
                break;
            case 25:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            default:
                uc7Var.getClass();
                hl.c3(new c87(uc7Var, tLObject, b6));
                break;
        }
    }
}
