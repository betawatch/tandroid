package org.telegram.messenger;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class et {
    public final int a;

    public et(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j3, long j10, int i7) {
        String str;
        String str2;
        String str3;
        TLRPC.NotificationSound notificationSound2;
        String str4;
        if (notificationSound == null) {
            return;
        }
        if (j3 != 0) {
            String v = dt.v(j3, j10, true);
            str = rf.b.i("sound_", v);
            str3 = rf.b.i("sound_path_", v);
            str2 = rf.b.i("sound_document_id_", v);
        } else if (i7 == 0) {
            str = "GroupSound";
            str2 = "GroupSoundDocId";
            str3 = "GroupSoundPath";
        } else if (i7 == 3) {
            str = "StoriesSound";
            str2 = "StoriesSoundDocId";
            str3 = "StoriesSoundPath";
        } else if (i7 == 1) {
            str = "GlobalSound";
            str2 = "GlobalSoundDocId";
            str3 = "GlobalSoundPath";
        } else if (i7 == 4 || i7 == 5) {
            str = "ReactionSound";
            str2 = "ReactionSoundDocId";
            str3 = "ReactionSoundPath";
        } else {
            str = "ChannelSound";
            str2 = "ChannelSoundDocId";
            str3 = "ChannelSoundPath";
        }
        String str5 = str3;
        String str6 = str;
        String str7 = str2;
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = (TLRPC.TL_notificationSoundLocal) notificationSound;
            if ("Default".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound2 = new TLRPC.TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound2 = new TLRPC.TL_notificationSoundNone();
            } else {
                String str8 = tL_notificationSoundLocal.title;
                if (str8 != null) {
                    try {
                        RingtoneManager ringtoneManager = new RingtoneManager(t0.b);
                        ringtoneManager.setType(2);
                        Cursor cursor = ringtoneManager.getCursor();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(1);
                            str4 = cursor.getString(2) + "/" + cursor.getString(0);
                            if (str8.equalsIgnoreCase(string)) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                }
                str4 = null;
                if (str4 == null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = str4;
                }
            }
            if (!(notificationSound2 instanceof TLRPC.TL_notificationSoundDefault)) {
                editor.putString(str6, "Default");
                editor.putString(str5, "Default");
                editor.remove(str7);
                return;
            }
            if (notificationSound2 instanceof TLRPC.TL_notificationSoundNone) {
                editor.putString(str6, "NoSound");
                editor.putString(str5, "NoSound");
                editor.remove(str7);
                return;
            } else {
                if (notificationSound2 instanceof TLRPC.TL_notificationSoundLocal) {
                    TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) notificationSound2;
                    editor.putString(str6, tL_notificationSoundLocal2.title);
                    editor.putString(str5, tL_notificationSoundLocal2.data);
                    editor.remove(str7);
                    return;
                }
                if (notificationSound2 instanceof TLRPC.TL_notificationSoundRingtone) {
                    TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) notificationSound2;
                    editor.putLong(str7, tL_notificationSoundRingtone.id);
                    ui.b0(this.a).z0.g(true);
                    ui.b0(this.a).z0.c(tL_notificationSoundRingtone.id);
                    return;
                }
                return;
            }
        }
        notificationSound2 = notificationSound;
        if (!(notificationSound2 instanceof TLRPC.TL_notificationSoundDefault)) {
        }
    }

    public final SharedPreferences b() {
        return qp.s1(this.a).d7;
    }

    public final int c(int i7, long j3, long j10, String str) {
        String v = dt.v(j3, j10, true);
        if (b().contains(str + v)) {
            return b().getInt(str + v, i7);
        }
        String v10 = dt.v(j3, 0L, true);
        return b().getInt(str + v10, i7);
    }

    public final long d(long j3, long j10) {
        String v = dt.v(j3, j10, true);
        if (b().contains("sound_document_id_" + v)) {
            return b().getLong("sound_document_id_" + v, 0L);
        }
        String v10 = dt.v(j3, 0L, true);
        return b().getLong("sound_document_id_" + v10, 0L);
    }

    public final boolean e(long j3, long j10) {
        String v = dt.v(j3, j10, false);
        if (b().contains("custom_" + v)) {
            return b().getBoolean("custom_" + v, false);
        }
        String v10 = dt.v(j3, 0L, false);
        return b().getBoolean("custom_" + v10, false);
    }

    public final String f(long j3, long j10) {
        String v = dt.v(j3, j10, false);
        if (b().contains("sound_path_" + v)) {
            return b().getString("sound_path_" + v, null);
        }
        String v10 = dt.v(j3, 0L, false);
        return b().getString("sound_path_" + v10, null);
    }
}
