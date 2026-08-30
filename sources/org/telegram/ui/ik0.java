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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ik0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ NotificationsSettingsActivity d;

    public ik0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        return (b10 == notificationsSettingsActivity.x || b10 == notificationsSettingsActivity.y || b10 == notificationsSettingsActivity.B || b10 == notificationsSettingsActivity.H || b10 == notificationsSettingsActivity.J || b10 == notificationsSettingsActivity.P || b10 == notificationsSettingsActivity.K || b10 == notificationsSettingsActivity.I || b10 == notificationsSettingsActivity.O || b10 == notificationsSettingsActivity.C || b10 == notificationsSettingsActivity.D || b10 == notificationsSettingsActivity.L || b10 == notificationsSettingsActivity.r || b10 == notificationsSettingsActivity.s || b10 == notificationsSettingsActivity.Q || b10 == notificationsSettingsActivity.G) ? false : true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.R;
    }

    @Override // f2.o0
    public final int j(int i10) {
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
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i10 == notificationsSettingsActivity.H || i10 == notificationsSettingsActivity.J || i10 == notificationsSettingsActivity.P || i10 == notificationsSettingsActivity.D || i10 == notificationsSettingsActivity.K || i10 == notificationsSettingsActivity.B || i10 == notificationsSettingsActivity.x || i10 == notificationsSettingsActivity.r) {
            return 0;
        }
        i11 = notificationsSettingsActivity.inappSoundRow;
        if (i10 == i11) {
            return 1;
        }
        i12 = notificationsSettingsActivity.inappVibrateRow;
        if (i10 == i12 || i10 == notificationsSettingsActivity.w) {
            return 1;
        }
        i13 = notificationsSettingsActivity.inappPreviewRow;
        if (i10 == i13) {
            return 1;
        }
        i14 = notificationsSettingsActivity.contactJoinedRow;
        if (i10 == i14) {
            return 1;
        }
        i15 = notificationsSettingsActivity.pinnedMessageRow;
        if (i10 == i15 || i10 == notificationsSettingsActivity.v) {
            return 1;
        }
        i16 = notificationsSettingsActivity.badgeNumberMutedRow;
        if (i10 == i16) {
            return 1;
        }
        i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
        if (i10 == i17) {
            return 1;
        }
        i18 = notificationsSettingsActivity.badgeNumberShowRow;
        if (i10 == i18) {
            return 1;
        }
        i19 = notificationsSettingsActivity.inappPriorityRow;
        if (i10 == i19) {
            return 1;
        }
        i20 = notificationsSettingsActivity.inchatSoundRow;
        if (i10 == i20 || i10 == notificationsSettingsActivity.M) {
            return 1;
        }
        i21 = notificationsSettingsActivity.accountsAllRow;
        if (i10 == i21) {
            return 1;
        }
        i22 = notificationsSettingsActivity.resetNotificationsRow;
        if (i10 == i22) {
            return 2;
        }
        i23 = notificationsSettingsActivity.privateRow;
        if (i10 == i23) {
            return 3;
        }
        i24 = notificationsSettingsActivity.groupRow;
        if (i10 == i24) {
            return 3;
        }
        i25 = notificationsSettingsActivity.channelsRow;
        if (i10 == i25) {
            return 3;
        }
        i26 = notificationsSettingsActivity.storiesRow;
        if (i10 == i26) {
            return 3;
        }
        i27 = notificationsSettingsActivity.reactionsRow;
        if (i10 == i27) {
            return 3;
        }
        if (i10 == notificationsSettingsActivity.G || i10 == notificationsSettingsActivity.y || i10 == notificationsSettingsActivity.I || i10 == notificationsSettingsActivity.O || i10 == notificationsSettingsActivity.C || i10 == notificationsSettingsActivity.L || i10 == notificationsSettingsActivity.Q) {
            return 4;
        }
        return i10 == notificationsSettingsActivity.s ? 6 : 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
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
        int i30;
        String string;
        ArrayList arrayList;
        int i31;
        int i32;
        ArrayList arrayList2;
        boolean z4;
        String str;
        int i33;
        int i34;
        boolean z10;
        int i35;
        int i36;
        int i37;
        int i38 = l1Var.f;
        View view = l1Var.a;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i38 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == notificationsSettingsActivity.x) {
                m4Var.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (i10 == notificationsSettingsActivity.B) {
                m4Var.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                return;
            }
            if (i10 == notificationsSettingsActivity.H) {
                m4Var.setText(LocaleController.getString("Events", R.string.Events));
                return;
            }
            if (i10 == notificationsSettingsActivity.J) {
                m4Var.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                return;
            }
            if (i10 == notificationsSettingsActivity.P) {
                m4Var.setText(LocaleController.getString("Reset", R.string.Reset));
                return;
            }
            if (i10 == notificationsSettingsActivity.D) {
                m4Var.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                return;
            } else if (i10 == notificationsSettingsActivity.K) {
                m4Var.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                return;
            } else {
                if (i10 == notificationsSettingsActivity.r) {
                    m4Var.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                    return;
                }
                return;
            }
        }
        if (i38 == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            i11 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            i12 = notificationsSettingsActivity.inappSoundRow;
            if (i10 == i12) {
                s8Var.f(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappVibrateRow;
            if (i10 == i13) {
                s8Var.f(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPreviewRow;
            if (i10 == i14) {
                s8Var.f(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i15 = notificationsSettingsActivity.inappPriorityRow;
            if (i10 == i15) {
                s8Var.g(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i16 = notificationsSettingsActivity.contactJoinedRow;
            if (i10 == i16) {
                s8Var.f(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i17 = notificationsSettingsActivity.pinnedMessageRow;
            if (i10 == i17) {
                s8Var.f(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i10 == notificationsSettingsActivity.M) {
                s8Var.f("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.v) {
                s8Var.g(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService), true, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.w) {
                s8Var.g(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection), true, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i10 == i18) {
                s8Var.f(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), notificationsSettingsActivity.getNotificationsController().showBadgeNumber, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i10 == i19) {
                s8Var.f(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), notificationsSettingsActivity.getNotificationsController().showBadgeMuted, true);
                return;
            }
            i20 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i10 == i20) {
                s8Var.f(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), notificationsSettingsActivity.getNotificationsController().showBadgeMessages, false);
                return;
            }
            i21 = notificationsSettingsActivity.inchatSoundRow;
            if (i10 == i21) {
                s8Var.f(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.E) {
                s8Var.f(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i22 = notificationsSettingsActivity.accountsAllRow;
            if (i10 == i22) {
                s8Var.f(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i38 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setMultilineDetail(true);
            i23 = notificationsSettingsActivity.resetNotificationsRow;
            if (i10 == i23) {
                z8Var.a(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                return;
            }
            return;
        }
        if (i38 != 3) {
            if (i38 != 5) {
                if (i38 != 6) {
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == notificationsSettingsActivity.s) {
                    a9Var.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            i37 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i37);
            if (i10 == notificationsSettingsActivity.F) {
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                aaVar.c(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, notificationsSettingsActivity.T, false);
                notificationsSettingsActivity.T = false;
                return;
            }
            if (i10 != notificationsSettingsActivity.E) {
                if (i10 == notificationsSettingsActivity.N) {
                    int i39 = notificationsSettings2.getInt("repeat_messages", 60);
                    aaVar.c(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), i39 == 0 ? LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever) : i39 < 60 ? LocaleController.formatPluralString("Minutes", i39, new Object[0]) : LocaleController.formatPluralString("Hours", i39 / 60, new Object[0]), notificationsSettingsActivity.U, false);
                    notificationsSettingsActivity.U = false;
                    return;
                }
                return;
            }
            int i40 = notificationsSettings2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                aaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), notificationsSettingsActivity.S, true);
            } else if (i40 == 1) {
                aaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), notificationsSettingsActivity.S, true);
            } else if (i40 == 2) {
                aaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), notificationsSettingsActivity.S, true);
            } else if (i40 == 3) {
                aaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), notificationsSettingsActivity.S, true);
            } else if (i40 == 4) {
                aaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), notificationsSettingsActivity.S, true);
            }
            notificationsSettingsActivity.S = false;
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        i24 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i24);
        i25 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i25).getCurrentTime();
        i26 = notificationsSettingsActivity.privateRow;
        ArrayList arrayList3 = null;
        if (i10 == i26) {
            string = LocaleController.getString(R.string.NotificationsPrivateChats);
            arrayList = notificationsSettingsActivity.d;
            i31 = notificationsSettings3.getInt("EnableAll2", 0);
            i32 = R.drawable.msg_openprofile;
        } else {
            i27 = notificationsSettingsActivity.groupRow;
            if (i10 != i27) {
                i28 = notificationsSettingsActivity.storiesRow;
                i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i10 == i28) {
                    string = LocaleController.getString(R.string.NotificationStories);
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList2 = notificationsSettingsActivity.n;
                    if (notificationsSettings3.getBoolean("EnableAllStories", false)) {
                        i29 = 0;
                    }
                    i32 = R.drawable.msg_menu_stories;
                } else {
                    i30 = notificationsSettingsActivity.reactionsRow;
                    if (i10 == i30) {
                        string = LocaleController.getString(R.string.NotificationReactions);
                        int i41 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i32 = R.drawable.msg_reactions;
                        i29 = i41;
                        arrayList2 = null;
                    } else {
                        string = LocaleController.getString(R.string.NotificationsChannels);
                        arrayList = notificationsSettingsActivity.f;
                        i31 = notificationsSettings3.getInt("EnableChannel2", 0);
                        i32 = R.drawable.msg_channel;
                    }
                }
                z4 = i29 >= currentTime;
                if (!z4 && i29 - 31536000 < currentTime) {
                    str = string;
                    i33 = 2;
                } else {
                    str = string;
                    i33 = 0;
                }
                StringBuilder sb = new StringBuilder();
                i34 = notificationsSettingsActivity.reactionsRow;
                if (i10 != i34) {
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        z4 = i29 < currentTime;
                        if (z4) {
                            sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i29)));
                        }
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        int size = arrayList3.size();
                        i35 = notificationsSettingsActivity.storiesRow;
                        if (i10 == i35 && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        if (i29 > 0) {
                            sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        }
                        if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                            sb.append(", ");
                            sb.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                        }
                    }
                    z10 = z4;
                } else if (i29 > 0) {
                    sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                    z10 = false;
                } else {
                    if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                        sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                    }
                    if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                    }
                    z10 = true;
                }
                i36 = notificationsSettingsActivity.reactionsRow;
                j5Var.b(str, sb, i32, z10, i33, false, i10 != i36, false);
            }
            string = LocaleController.getString(R.string.NotificationsGroups);
            arrayList = notificationsSettingsActivity.e;
            i31 = notificationsSettings3.getInt("EnableGroup2", 0);
            i32 = R.drawable.msg_groups;
        }
        int i42 = i31;
        arrayList2 = null;
        arrayList3 = arrayList;
        i29 = i42;
        if (i29 >= currentTime) {
        }
        if (z4) {
            str = string;
            i33 = 2;
            StringBuilder sb2 = new StringBuilder();
            i34 = notificationsSettingsActivity.reactionsRow;
            if (i10 != i34) {
            }
            i36 = notificationsSettingsActivity.reactionsRow;
            j5Var.b(str, sb2, i32, z10, i33, false, i10 != i36, false);
        }
        str = string;
        i33 = 0;
        StringBuilder sb22 = new StringBuilder();
        i34 = notificationsSettingsActivity.reactionsRow;
        if (i10 != i34) {
        }
        i36 = notificationsSettingsActivity.reactionsRow;
        j5Var.b(str, sb22, i32, z10, i33, false, i10 != i36, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
        } else if (i10 == 1) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.s8(context, f6Var2);
        } else if (i10 == 2) {
            m4Var = new org.telegram.ui.Cells.z8(context);
        } else if (i10 == 3) {
            f6Var3 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.j5(21, 64, this.c, f6Var3, true);
        } else if (i10 == 4) {
            m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
        } else if (i10 != 5) {
            f6Var5 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.a9(context, f6Var5);
        } else {
            f6Var4 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.aa(context, 0, f6Var4);
        }
        return new org.telegram.ui.Components.el0(m4Var);
    }
}
