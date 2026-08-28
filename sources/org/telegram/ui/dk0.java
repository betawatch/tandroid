package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dk0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ NotificationsSettingsActivity d;

    public dk0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        return (b10 == notificationsSettingsActivity.x || b10 == notificationsSettingsActivity.y || b10 == notificationsSettingsActivity.A || b10 == notificationsSettingsActivity.G || b10 == notificationsSettingsActivity.I || b10 == notificationsSettingsActivity.O || b10 == notificationsSettingsActivity.J || b10 == notificationsSettingsActivity.H || b10 == notificationsSettingsActivity.N || b10 == notificationsSettingsActivity.B || b10 == notificationsSettingsActivity.C || b10 == notificationsSettingsActivity.K || b10 == notificationsSettingsActivity.r || b10 == notificationsSettingsActivity.s || b10 == notificationsSettingsActivity.P || b10 == notificationsSettingsActivity.F) ? false : true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.Q;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i9 == notificationsSettingsActivity.G || i9 == notificationsSettingsActivity.I || i9 == notificationsSettingsActivity.O || i9 == notificationsSettingsActivity.C || i9 == notificationsSettingsActivity.J || i9 == notificationsSettingsActivity.A || i9 == notificationsSettingsActivity.x || i9 == notificationsSettingsActivity.r) {
            return 0;
        }
        i10 = notificationsSettingsActivity.inappSoundRow;
        if (i9 == i10) {
            return 1;
        }
        i11 = notificationsSettingsActivity.inappVibrateRow;
        if (i9 == i11 || i9 == notificationsSettingsActivity.w) {
            return 1;
        }
        i12 = notificationsSettingsActivity.inappPreviewRow;
        if (i9 == i12) {
            return 1;
        }
        i13 = notificationsSettingsActivity.contactJoinedRow;
        if (i9 == i13) {
            return 1;
        }
        i14 = notificationsSettingsActivity.pinnedMessageRow;
        if (i9 == i14 || i9 == notificationsSettingsActivity.v) {
            return 1;
        }
        i15 = notificationsSettingsActivity.badgeNumberMutedRow;
        if (i9 == i15) {
            return 1;
        }
        i16 = notificationsSettingsActivity.badgeNumberMessagesRow;
        if (i9 == i16) {
            return 1;
        }
        i17 = notificationsSettingsActivity.badgeNumberShowRow;
        if (i9 == i17) {
            return 1;
        }
        i18 = notificationsSettingsActivity.inappPriorityRow;
        if (i9 == i18) {
            return 1;
        }
        i19 = notificationsSettingsActivity.inchatSoundRow;
        if (i9 == i19 || i9 == notificationsSettingsActivity.L) {
            return 1;
        }
        i20 = notificationsSettingsActivity.accountsAllRow;
        if (i9 == i20) {
            return 1;
        }
        i21 = notificationsSettingsActivity.resetNotificationsRow;
        if (i9 == i21) {
            return 2;
        }
        i22 = notificationsSettingsActivity.privateRow;
        if (i9 == i22) {
            return 3;
        }
        i23 = notificationsSettingsActivity.groupRow;
        if (i9 == i23) {
            return 3;
        }
        i24 = notificationsSettingsActivity.channelsRow;
        if (i9 == i24) {
            return 3;
        }
        i25 = notificationsSettingsActivity.storiesRow;
        if (i9 == i25) {
            return 3;
        }
        i26 = notificationsSettingsActivity.reactionsRow;
        if (i9 == i26) {
            return 3;
        }
        if (i9 == notificationsSettingsActivity.F || i9 == notificationsSettingsActivity.y || i9 == notificationsSettingsActivity.H || i9 == notificationsSettingsActivity.N || i9 == notificationsSettingsActivity.B || i9 == notificationsSettingsActivity.K || i9 == notificationsSettingsActivity.P) {
            return 4;
        }
        return i9 == notificationsSettingsActivity.s ? 6 : 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String string;
        ArrayList arrayList;
        int i30;
        int i31;
        ArrayList arrayList2;
        boolean z10;
        String str;
        int i32;
        int i33;
        boolean z11;
        int i34;
        int i35;
        int i36;
        int i37 = q1Var.f;
        View view = q1Var.a;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i37 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == notificationsSettingsActivity.x) {
                m4Var.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (i9 == notificationsSettingsActivity.A) {
                m4Var.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                return;
            }
            if (i9 == notificationsSettingsActivity.G) {
                m4Var.setText(LocaleController.getString("Events", R.string.Events));
                return;
            }
            if (i9 == notificationsSettingsActivity.I) {
                m4Var.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                return;
            }
            if (i9 == notificationsSettingsActivity.O) {
                m4Var.setText(LocaleController.getString("Reset", R.string.Reset));
                return;
            }
            if (i9 == notificationsSettingsActivity.C) {
                m4Var.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                return;
            } else if (i9 == notificationsSettingsActivity.J) {
                m4Var.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                return;
            } else {
                if (i9 == notificationsSettingsActivity.r) {
                    m4Var.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                    return;
                }
                return;
            }
        }
        if (i37 == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i10 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i9 == i11) {
                t8Var.f(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i12 = notificationsSettingsActivity.inappVibrateRow;
            if (i9 == i12) {
                t8Var.f(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappPreviewRow;
            if (i9 == i13) {
                t8Var.f(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPriorityRow;
            if (i9 == i14) {
                t8Var.g(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i15 = notificationsSettingsActivity.contactJoinedRow;
            if (i9 == i15) {
                t8Var.f(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i16 = notificationsSettingsActivity.pinnedMessageRow;
            if (i9 == i16) {
                t8Var.f(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i9 == notificationsSettingsActivity.L) {
                t8Var.f("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i9 == notificationsSettingsActivity.v) {
                t8Var.g(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService), true, true);
                return;
            }
            if (i9 == notificationsSettingsActivity.w) {
                t8Var.g(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection), true, true);
                return;
            }
            i17 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i9 == i17) {
                t8Var.f(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), notificationsSettingsActivity.getNotificationsController().showBadgeNumber, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i9 == i18) {
                t8Var.f(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), notificationsSettingsActivity.getNotificationsController().showBadgeMuted, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i9 == i19) {
                t8Var.f(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), notificationsSettingsActivity.getNotificationsController().showBadgeMessages, false);
                return;
            }
            i20 = notificationsSettingsActivity.inchatSoundRow;
            if (i9 == i20) {
                t8Var.f(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i9 == notificationsSettingsActivity.D) {
                t8Var.f(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i21 = notificationsSettingsActivity.accountsAllRow;
            if (i9 == i21) {
                t8Var.f(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i37 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setMultilineDetail(true);
            i22 = notificationsSettingsActivity.resetNotificationsRow;
            if (i9 == i22) {
                a9Var.a(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                return;
            }
            return;
        }
        if (i37 != 3) {
            if (i37 != 5) {
                if (i37 != 6) {
                    return;
                }
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == notificationsSettingsActivity.s) {
                    b9Var.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            i36 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i36);
            if (i9 == notificationsSettingsActivity.E) {
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                baVar.c(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, notificationsSettingsActivity.S, false);
                notificationsSettingsActivity.S = false;
                return;
            }
            if (i9 != notificationsSettingsActivity.D) {
                if (i9 == notificationsSettingsActivity.M) {
                    int i38 = notificationsSettings2.getInt("repeat_messages", 60);
                    baVar.c(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), i38 == 0 ? LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever) : i38 < 60 ? LocaleController.formatPluralString("Minutes", i38, new Object[0]) : LocaleController.formatPluralString("Hours", i38 / 60, new Object[0]), notificationsSettingsActivity.T, false);
                    notificationsSettingsActivity.T = false;
                    return;
                }
                return;
            }
            int i39 = notificationsSettings2.getInt("vibrate_calls", 0);
            if (i39 == 0) {
                baVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), notificationsSettingsActivity.R, true);
            } else if (i39 == 1) {
                baVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), notificationsSettingsActivity.R, true);
            } else if (i39 == 2) {
                baVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), notificationsSettingsActivity.R, true);
            } else if (i39 == 3) {
                baVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), notificationsSettingsActivity.R, true);
            } else if (i39 == 4) {
                baVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), notificationsSettingsActivity.R, true);
            }
            notificationsSettingsActivity.R = false;
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        i23 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i23);
        i24 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
        i25 = notificationsSettingsActivity.privateRow;
        ArrayList arrayList3 = null;
        if (i9 == i25) {
            string = LocaleController.getString(R.string.NotificationsPrivateChats);
            arrayList = notificationsSettingsActivity.d;
            i30 = notificationsSettings3.getInt("EnableAll2", 0);
            i31 = R.drawable.msg_openprofile;
        } else {
            i26 = notificationsSettingsActivity.groupRow;
            if (i9 != i26) {
                i27 = notificationsSettingsActivity.storiesRow;
                i28 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i9 == i27) {
                    string = LocaleController.getString(R.string.NotificationStories);
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList2 = notificationsSettingsActivity.n;
                    if (notificationsSettings3.getBoolean("EnableAllStories", false)) {
                        i28 = 0;
                    }
                    i31 = R.drawable.msg_menu_stories;
                } else {
                    i29 = notificationsSettingsActivity.reactionsRow;
                    if (i9 == i29) {
                        string = LocaleController.getString(R.string.NotificationReactions);
                        int i40 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i31 = R.drawable.msg_reactions;
                        i28 = i40;
                        arrayList2 = null;
                    } else {
                        string = LocaleController.getString(R.string.NotificationsChannels);
                        arrayList = notificationsSettingsActivity.f;
                        i30 = notificationsSettings3.getInt("EnableChannel2", 0);
                        i31 = R.drawable.msg_channel;
                    }
                }
                z10 = i28 >= currentTime;
                if (!z10 && i28 - 31536000 < currentTime) {
                    str = string;
                    i32 = 2;
                } else {
                    str = string;
                    i32 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                i33 = notificationsSettingsActivity.reactionsRow;
                if (i9 != i33) {
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        z10 = i28 < currentTime;
                        if (z10) {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        } else if (i28 - 31536000 >= currentTime) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i28)));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList3.size();
                        i34 = notificationsSettingsActivity.storiesRow;
                        if (i9 == i34 && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        if (i28 > 0) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        }
                        if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                        }
                    }
                    z11 = z10;
                } else if (i28 > 0) {
                    sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                    z11 = false;
                } else {
                    if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                    }
                    if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsStories));
                    }
                    z11 = true;
                }
                i35 = notificationsSettingsActivity.reactionsRow;
                j5Var.b(str, sb2, i31, z11, i32, false, i9 != i35, false);
            }
            string = LocaleController.getString(R.string.NotificationsGroups);
            arrayList = notificationsSettingsActivity.e;
            i30 = notificationsSettings3.getInt("EnableGroup2", 0);
            i31 = R.drawable.msg_groups;
        }
        int i41 = i30;
        arrayList2 = null;
        arrayList3 = arrayList;
        i28 = i41;
        if (i28 >= currentTime) {
        }
        if (z10) {
            str = string;
            i32 = 2;
            StringBuilder sb22 = new StringBuilder();
            i33 = notificationsSettingsActivity.reactionsRow;
            if (i9 != i33) {
            }
            i35 = notificationsSettingsActivity.reactionsRow;
            j5Var.b(str, sb22, i31, z11, i32, false, i9 != i35, false);
        }
        str = string;
        i32 = 0;
        StringBuilder sb222 = new StringBuilder();
        i33 = notificationsSettingsActivity.reactionsRow;
        if (i9 != i33) {
        }
        i35 = notificationsSettingsActivity.reactionsRow;
        j5Var.b(str, sb222, i31, z11, i32, false, i9 != i35, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.c;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
        } else if (i9 == 1) {
            b6Var2 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.t8(context, b6Var2);
        } else if (i9 == 2) {
            m4Var = new org.telegram.ui.Cells.a9(context);
        } else if (i9 == 3) {
            b6Var3 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.j5(21, 64, this.c, b6Var3, true);
        } else if (i9 == 4) {
            m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else if (i9 != 5) {
            b6Var5 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.b9(context, b6Var5);
        } else {
            b6Var4 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.ba(context, 0, b6Var4);
        }
        return new org.telegram.ui.Components.ik0(m4Var);
    }
}
