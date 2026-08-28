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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q01 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ s01 d;

    public q01(s01 s01Var, Context context) {
        this.d = s01Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        s01 s01Var = this.d;
        if (b10 == s01Var.A) {
            return s01Var.n;
        }
        if (q1Var.b() == s01Var.S) {
            return true;
        }
        switch (q1Var.f) {
        }
        return s01Var.n;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.U;
    }

    @Override // f2.r0
    public final int j(int i9) {
        s01 s01Var = this.d;
        if (i9 == s01Var.v || i9 == s01Var.G || i9 == s01Var.P || i9 == s01Var.L) {
            return 0;
        }
        if (i9 == s01Var.B || i9 == s01Var.C || i9 == s01Var.E || i9 == s01Var.D || i9 == s01Var.M || i9 == s01Var.N || i9 == s01Var.S) {
            return 1;
        }
        if (i9 == s01Var.J || i9 == s01Var.R || i9 == s01Var.F || i9 == s01Var.O) {
            return 2;
        }
        if (i9 == s01Var.Q) {
            return 3;
        }
        if (i9 == s01Var.H || i9 == s01Var.I) {
            return 4;
        }
        if (i9 == s01Var.w) {
            return 5;
        }
        if (i9 == s01Var.x || i9 == s01Var.T) {
            return 6;
        }
        return (i9 == s01Var.y || i9 == s01Var.A || i9 == s01Var.K) ? 7 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject chat;
        int i14;
        int i15;
        s01 s01Var = this.d;
        long j10 = s01Var.f;
        long j11 = s01Var.e;
        int i16 = q1Var.f;
        View view = q1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 != s01Var.v) {
                    if (i9 != s01Var.G) {
                        if (i9 != s01Var.P) {
                            if (i9 == s01Var.L) {
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
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i10 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (i9 != s01Var.S) {
                    baVar.setTextColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                    if (i9 != s01Var.B) {
                        if (i9 != s01Var.M) {
                            if (i9 != s01Var.C) {
                                if (i9 != s01Var.E) {
                                    if (i9 != s01Var.D) {
                                        if (i9 == s01Var.N) {
                                            int c10 = org.telegram.messenger.l0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.l0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.l0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            baVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, s01Var.E != -1);
                                            break;
                                        } else {
                                            baVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, s01Var.E != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.l0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.l0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (s01Var.D == -1 && s01Var.E == -1) {
                                                    r9 = false;
                                                }
                                                baVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (s01Var.D == -1 && s01Var.E == -1) {
                                                r9 = false;
                                            }
                                            baVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (s01Var.D == -1 && s01Var.E == -1) {
                                            r9 = false;
                                        }
                                        baVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (s01Var.D == -1 && s01Var.E == -1) {
                                        r9 = false;
                                    }
                                    baVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(ta.b.d("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            baVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(ta.b.d("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c15 = s01Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : kk0.Z(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        baVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    baVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    baVar.setTextColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i9 != s01Var.J) {
                    if (i9 != s01Var.R) {
                        if (i9 != s01Var.F) {
                            if (i9 == s01Var.O) {
                                b9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (s01Var.E != -1) {
                            b9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            b9Var.setText("");
                            break;
                        }
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    b9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i11);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.l0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.v8.f[i17] == c16) {
                            c16 = org.telegram.ui.Cells.v8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                v8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i12 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i12);
                int c17 = org.telegram.messenger.l0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i9 != s01Var.H) {
                    if (i9 == s01Var.I) {
                        j6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        j6Var.setTag(2);
                        break;
                    }
                } else {
                    j6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    j6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i14 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                boolean z10 = i9 > 0;
                r9 = i9 < s01Var.U - 1;
                if (z6Var.c != z10 || z6Var.d != r9) {
                    z6Var.c = z10;
                    z6Var.d = r9;
                    int i18 = z6Var.b;
                    if (i18 != 0) {
                        z6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        z6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i15 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i15);
                if (i9 != s01Var.y) {
                    if (i9 != s01Var.A) {
                        if (i9 == s01Var.K) {
                            String d = ta.b.d(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (s01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            t8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(d, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        t8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    t8Var.f(LocaleController.getString(R.string.Notifications), s01Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        s01 s01Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var = s01Var.d;
        Context context = this.c;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ba(context, 0, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.b9(context, b6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.v8(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.j6(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ua(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.t8(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
        }
        return j3.r0.s(m4Var, m4Var, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f;
        View view = q1Var.a;
        s01 s01Var = this.d;
        if (i9 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, s01Var.n);
            return;
        }
        if (i9 == 1) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (q1Var.b() == s01Var.S) {
                baVar.a(null, true);
                return;
            } else {
                baVar.a(null, s01Var.n);
                return;
            }
        }
        if (i9 == 2) {
            ((org.telegram.ui.Cells.b9) view).c(null, s01Var.n);
            return;
        }
        if (i9 == 3) {
            ((org.telegram.ui.Cells.v8) view).a(null, s01Var.n);
            return;
        }
        if (i9 == 4) {
            ((org.telegram.ui.Cells.j6) view).b(null, s01Var.n);
            return;
        }
        if (i9 != 7) {
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        if (q1Var.b() == s01Var.A) {
            t8Var.e(null, s01Var.n);
        } else if (q1Var.b() == s01Var.K) {
            t8Var.e(null, s01Var.n);
        } else {
            t8Var.e(null, true);
        }
    }
}
