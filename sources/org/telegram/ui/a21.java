package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a21 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ c21 d;

    public a21(c21 c21Var, Context context) {
        this.d = c21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        c21 c21Var = this.d;
        if (b10 == c21Var.E) {
            return c21Var.n;
        }
        if (c1Var.b() == c21Var.W) {
            return true;
        }
        switch (c1Var.f) {
        }
        return c21Var.n;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.h0
    public final int j(int i10) {
        c21 c21Var = this.d;
        if (i10 == c21Var.v || i10 == c21Var.K || i10 == c21Var.T || i10 == c21Var.P) {
            return 0;
        }
        if (i10 == c21Var.F || i10 == c21Var.G || i10 == c21Var.I || i10 == c21Var.H || i10 == c21Var.Q || i10 == c21Var.R || i10 == c21Var.W) {
            return 1;
        }
        if (i10 == c21Var.N || i10 == c21Var.V || i10 == c21Var.J || i10 == c21Var.S) {
            return 2;
        }
        if (i10 == c21Var.U) {
            return 3;
        }
        if (i10 == c21Var.L || i10 == c21Var.M) {
            return 4;
        }
        if (i10 == c21Var.w) {
            return 5;
        }
        if (i10 == c21Var.x || i10 == c21Var.X) {
            return 6;
        }
        return (i10 == c21Var.y || i10 == c21Var.E || i10 == c21Var.O) ? 7 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        c21 c21Var = this.d;
        long j3 = c21Var.f;
        long j10 = c21Var.e;
        int i17 = c1Var.f;
        View view = c1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != c21Var.v) {
                    if (i10 != c21Var.K) {
                        if (i10 != c21Var.T) {
                            if (i10 == c21Var.P) {
                                m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != c21Var.W) {
                    gaVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    if (i10 != c21Var.F) {
                        if (i10 != c21Var.Q) {
                            if (i10 != c21Var.G) {
                                if (i10 != c21Var.I) {
                                    if (i10 != c21Var.H) {
                                        if (i10 == c21Var.R) {
                                            int c10 = org.telegram.messenger.a2.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.a2.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.a2.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            gaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, c21Var.I != -1);
                                            break;
                                        } else {
                                            gaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, c21Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.a2.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.a2.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (c21Var.H == -1 && c21Var.I == -1) {
                                                    r9 = false;
                                                }
                                                gaVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (c21Var.H == -1 && c21Var.I == -1) {
                                                r9 = false;
                                            }
                                            gaVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (c21Var.H == -1 && c21Var.I == -1) {
                                            r9 = false;
                                        }
                                        gaVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (c21Var.H == -1 && c21Var.I == -1) {
                                        r9 = false;
                                    }
                                    gaVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(org.telegram.ui.Cells.r6.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            gaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(org.telegram.ui.Cells.r6.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = c21Var.getMediaDataController().ringtoneDataStore.c(j11);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : al0.a0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        gaVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    gaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    gaVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 != c21Var.N) {
                    if (i10 != c21Var.V) {
                        if (i10 != c21Var.J) {
                            if (i10 == c21Var.S) {
                                f9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (c21Var.I != -1) {
                            f9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            f9Var.setText("");
                            break;
                        }
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.a2.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.z8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.z8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                z8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
                i13 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.a2.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != c21Var.L) {
                    if (i10 == c21Var.M) {
                        l6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        l6Var.setTag(2);
                        break;
                    }
                } else {
                    l6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    l6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                if (DialogObject.isUserDialog(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                }
                abVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < c21Var.Y - 1;
                if (c7Var.c != z10 || c7Var.d != r9) {
                    c7Var.c = z10;
                    c7Var.d = r9;
                    int i19 = c7Var.b;
                    if (i19 != 0) {
                        c7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        c7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                i16 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != c21Var.y) {
                    if (i10 != c21Var.E) {
                        if (i10 == c21Var.O) {
                            String i20 = org.telegram.ui.Cells.r6.i(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j10, j3));
                            if (c21Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            x8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(i20, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                        x8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    x8Var.f(LocaleController.getString(R.string.Notifications), c21Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        c21 c21Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = c21Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ga(context, 0, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.f9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.l6(context, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ab(context, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.x8(context, f6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(m4Var, m4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        c21 c21Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, c21Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (c1Var.b() == c21Var.W) {
                gaVar.a(null, true);
                return;
            } else {
                gaVar.a(null, c21Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.f9) view).c(null, c21Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.z8) view).a(null, c21Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.l6) view).b(null, c21Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        if (c1Var.b() == c21Var.E) {
            x8Var.e(null, c21Var.n);
        } else if (c1Var.b() == c21Var.O) {
            x8Var.e(null, c21Var.n);
        } else {
            x8Var.e(null, true);
        }
    }
}
