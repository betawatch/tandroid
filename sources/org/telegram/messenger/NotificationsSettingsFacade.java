package org.telegram.messenger;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class NotificationsSettingsFacade {
    public static final String PROPERTY_CONTENT_PREVIEW = "content_preview_";
    public static final String PROPERTY_CUSTOM = "custom_";
    public static final String PROPERTY_NOTIFY = "notify2_";
    public static final String PROPERTY_NOTIFY_UNTIL = "notifyuntil_";
    public static final String PROPERTY_SILENT = "silent_";
    public static final String PROPERTY_STORIES_NOTIFY = "stories_";
    private final int currentAccount;

    public NotificationsSettingsFacade(int i10) {
        this.currentAccount = i10;
    }

    private SharedPreferences getPreferences() {
        return MessagesController.getNotificationsSettings(this.currentAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyDialogNotificationsSettings$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyDialogNotificationsSettings$1(long j3, long j10, TLRPC.PeerNotifySettings peerNotifySettings) {
        boolean z10;
        int i10;
        int i11;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10, true);
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        NotificationsController notificationsController = NotificationsController.getInstance(this.currentAccount);
        int c10 = a2.c(PROPERTY_NOTIFY, sharedPrefKey, getPreferences(), -1);
        boolean z11 = true;
        int c11 = a2.c(PROPERTY_NOTIFY_UNTIL, sharedPrefKey, getPreferences(), 0);
        SharedPreferences.Editor edit = getPreferences().edit();
        if ((peerNotifySettings.flags & 2) != 0) {
            edit.putBoolean(org.telegram.ui.Cells.r6.i(PROPERTY_SILENT, sharedPrefKey), peerNotifySettings.silent);
        } else {
            edit.remove(PROPERTY_SILENT + sharedPrefKey);
        }
        if ((peerNotifySettings.flags & 64) != 0) {
            edit.putBoolean(org.telegram.ui.Cells.r6.i(PROPERTY_STORIES_NOTIFY, sharedPrefKey), !peerNotifySettings.stories_muted);
        } else {
            edit.remove(PROPERTY_STORIES_NOTIFY + sharedPrefKey);
        }
        TLRPC.Dialog dialog = j10 == 0 ? (TLRPC.Dialog) messagesController.dialogs_dict.f(j3) : null;
        if (dialog != null) {
            dialog.notify_settings = peerNotifySettings;
        }
        if ((peerNotifySettings.flags & 4) == 0) {
            boolean z12 = true;
            if (c10 != -1) {
                if (dialog != null) {
                    dialog.notify_settings.mute_until = 0;
                }
                edit.remove(PROPERTY_NOTIFY + sharedPrefKey);
            } else {
                z12 = false;
            }
            if (j10 == 0) {
                messagesStorage.setDialogFlags(j3, 0L);
            }
            z11 = z12;
        } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
            if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                if (c10 == 3 && c11 == peerNotifySettings.mute_until) {
                    z11 = false;
                } else {
                    edit.putInt(PROPERTY_NOTIFY + sharedPrefKey, 3);
                    edit.putInt(PROPERTY_NOTIFY_UNTIL + sharedPrefKey, peerNotifySettings.mute_until);
                    if (dialog != null) {
                        dialog.notify_settings.mute_until = 0;
                    }
                }
                i11 = peerNotifySettings.mute_until;
            } else if (c10 != 2) {
                edit.putInt(PROPERTY_NOTIFY + sharedPrefKey, 2);
                if (dialog != null) {
                    dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                i11 = 0;
            } else {
                i11 = 0;
                z11 = false;
            }
            if (j10 == 0) {
                messagesStorage.setDialogFlags(j3, (i11 << 32) | 1);
                notificationsController.removeNotificationsForDialog(j3);
            }
        } else {
            if (c10 == 0 || c10 == 1) {
                z10 = false;
            } else {
                if (dialog != null) {
                    TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                    i10 = 0;
                    peerNotifySettings2.mute_until = 0;
                } else {
                    i10 = 0;
                }
                edit.putInt(PROPERTY_NOTIFY + sharedPrefKey, i10);
                z10 = true;
            }
            if (j10 == 0) {
                messagesStorage.setDialogFlags(j3, 0L);
            }
            z11 = z10;
        }
        applySoundSettings(peerNotifySettings.android_sound, edit, j3, j10, 0, false);
        edit.apply();
        if (z11) {
            AndroidUtilities.runOnUIThread(new dh(this, 2));
        }
    }

    public void applyDialogNotificationsSettings(long j3, long j10, TLRPC.PeerNotifySettings peerNotifySettings) {
        if (peerNotifySettings == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new a3.g0(this, j3, j10, peerNotifySettings, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applySoundSettings(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j3, long j10, int i10, boolean z10) {
        String str;
        String str2;
        String str3;
        int i11;
        TLRPC.NotificationSound notificationSound2;
        String str4;
        if (notificationSound == null) {
            return;
        }
        int i12 = 1;
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10, true);
            str = org.telegram.ui.Cells.r6.i("sound_", sharedPrefKey);
            str3 = org.telegram.ui.Cells.r6.i("sound_path_", sharedPrefKey);
            str2 = org.telegram.ui.Cells.r6.i("sound_document_id_", sharedPrefKey);
        } else if (i10 == 0) {
            str = "GroupSound";
            str2 = "GroupSoundDocId";
            str3 = "GroupSoundPath";
        } else if (i10 == 3) {
            str = "StoriesSound";
            str2 = "StoriesSoundDocId";
            str3 = "StoriesSoundPath";
        } else if (i10 == 1) {
            str = "GlobalSound";
            str2 = "GlobalSoundDocId";
            str3 = "GlobalSoundPath";
        } else if (i10 == 4 || i10 == 5) {
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
                        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
                        ringtoneManager.setType(2);
                        Cursor cursor = ringtoneManager.getCursor();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(i12);
                            StringBuilder sb2 = new StringBuilder();
                            i11 = i13;
                            try {
                                sb2.append(cursor.getString(2));
                                sb2.append("/");
                                sb2.append(cursor.getString(0));
                                String sb3 = sb2.toString();
                                if (str8.equalsIgnoreCase(string)) {
                                    str4 = sb3;
                                    break;
                                } else {
                                    i13 = i11;
                                    i12 = 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                FileLog.e(th);
                                str4 = null;
                                if (str4 != null) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i11 = i13;
                    }
                }
                i11 = i13;
                str4 = null;
                if (str4 != null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = str4;
                }
            }
            i11 = i13;
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
            }
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
                MediaDataController.getInstance(this.currentAccount).checkRingtones(true);
                if (z10 && i11 != 0) {
                    editor.putBoolean(PROPERTY_CUSTOM + j3, true);
                }
                MediaDataController.getInstance(this.currentAccount).ringtoneDataStore.c(tL_notificationSoundRingtone.id);
                return;
            }
            return;
        }
        i11 = i13;
        notificationSound2 = notificationSound;
        if (!(notificationSound2 instanceof TLRPC.TL_notificationSoundDefault)) {
        }
    }

    public void clearPreference(long j3, long j10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10, true);
        getPreferences().edit().remove(PROPERTY_NOTIFY + sharedPrefKey).remove(PROPERTY_CUSTOM + sharedPrefKey).remove(PROPERTY_NOTIFY_UNTIL + sharedPrefKey).remove(PROPERTY_CONTENT_PREVIEW + sharedPrefKey).remove(PROPERTY_SILENT + sharedPrefKey).remove(PROPERTY_STORIES_NOTIFY + sharedPrefKey).apply();
    }

    public int getProperty(String str, long j3, long j10, int i10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getInt(str + sharedPrefKey, i10);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j3, 0L, true);
        return getPreferences().getInt(str + sharedPrefKey2, i10);
    }

    public String getPropertyString(String str, long j3, long j10, String str2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getString(str + sharedPrefKey, str2);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j3, 0L);
        return getPreferences().getString(str + sharedPrefKey2, str2);
    }

    public boolean isDefault(long j3, long j10) {
        NotificationsController.getSharedPrefKey(j3, j10, true);
        return false;
    }

    public void removeProperty(String str, long j3, long j10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        getPreferences().edit().remove(str + sharedPrefKey).apply();
    }

    public void setSettingsForDialog(SharedPreferences.Editor editor, TLRPC.Dialog dialog, TLRPC.PeerNotifySettings peerNotifySettings) {
        long peerId = MessageObject.getPeerId(dialog.peer);
        if ((dialog.notify_settings.flags & 2) != 0) {
            editor.putBoolean(a4.a.o(peerId, PROPERTY_SILENT), dialog.notify_settings.silent);
        } else {
            editor.remove(PROPERTY_SILENT + peerId);
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
        if ((peerNotifySettings2.flags & 4) == 0) {
            editor.remove(PROPERTY_NOTIFY + peerId);
            return;
        }
        if (peerNotifySettings2.mute_until <= connectionsManager.getCurrentTime()) {
            editor.putInt(PROPERTY_NOTIFY + peerId, 0);
        } else {
            if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                editor.putInt(PROPERTY_NOTIFY + peerId, 2);
                dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                return;
            }
            editor.putInt(PROPERTY_NOTIFY + peerId, 3);
            editor.putInt(a4.a.o(peerId, PROPERTY_NOTIFY_UNTIL), dialog.notify_settings.mute_until);
        }
    }

    public long getProperty(String str, long j3, long j10, long j11) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10, true);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getLong(str + sharedPrefKey, j11);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j3, 0L, true);
        return getPreferences().getLong(str + sharedPrefKey2, j11);
    }

    public boolean getProperty(String str, long j3, long j10, boolean z10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        if (getPreferences().contains(str + sharedPrefKey)) {
            return getPreferences().getBoolean(str + sharedPrefKey, z10);
        }
        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j3, 0L);
        return getPreferences().getBoolean(str + sharedPrefKey2, z10);
    }
}
