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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e11 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final /* synthetic */ g11 d;

    public e11(g11 g11Var, Context context) {
        this.d = g11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        g11 g11Var = this.d;
        if (b10 == g11Var.B) {
            return g11Var.n;
        }
        if (m1Var.b() == g11Var.T) {
            return true;
        }
        switch (m1Var.f) {
        }
        return g11Var.n;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.V;
    }

    @Override // f2.p0
    public final int j(int i10) {
        g11 g11Var = this.d;
        if (i10 == g11Var.v || i10 == g11Var.H || i10 == g11Var.Q || i10 == g11Var.M) {
            return 0;
        }
        if (i10 == g11Var.C || i10 == g11Var.D || i10 == g11Var.F || i10 == g11Var.E || i10 == g11Var.N || i10 == g11Var.O || i10 == g11Var.T) {
            return 1;
        }
        if (i10 == g11Var.K || i10 == g11Var.S || i10 == g11Var.G || i10 == g11Var.P) {
            return 2;
        }
        if (i10 == g11Var.R) {
            return 3;
        }
        if (i10 == g11Var.I || i10 == g11Var.J) {
            return 4;
        }
        if (i10 == g11Var.w) {
            return 5;
        }
        if (i10 == g11Var.x || i10 == g11Var.U) {
            return 6;
        }
        return (i10 == g11Var.y || i10 == g11Var.B || i10 == g11Var.L) ? 7 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        g11 g11Var = this.d;
        long j10 = g11Var.f;
        long j11 = g11Var.e;
        int i17 = m1Var.f;
        View view = m1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != g11Var.v) {
                    if (i10 != g11Var.H) {
                        if (i10 != g11Var.Q) {
                            if (i10 == g11Var.M) {
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
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != g11Var.T) {
                    aaVar.setTextColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                    if (i10 != g11Var.C) {
                        if (i10 != g11Var.N) {
                            if (i10 != g11Var.D) {
                                if (i10 != g11Var.F) {
                                    if (i10 != g11Var.E) {
                                        if (i10 == g11Var.O) {
                                            int c3 = org.telegram.messenger.y3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c3 != 0 && c3 != 4) {
                                                if (c3 != 1) {
                                                    if (c3 != 2) {
                                                        if (c3 == 3) {
                                                            aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c10 = org.telegram.messenger.y3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c11 = org.telegram.messenger.y3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c10 != 0) {
                                            aaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c10), LocaleController.formatPluralString("Minutes", c11 / 60, new Object[0])), false, g11Var.F != -1);
                                            break;
                                        } else {
                                            aaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, g11Var.F != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c12 = org.telegram.messenger.y3.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c12 != 0) {
                                        if (c12 != 1 && c12 != 2) {
                                            if (c12 != 3) {
                                                if (c12 != 4) {
                                                    if (c12 == 5) {
                                                        aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c13 = org.telegram.messenger.y3.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c13 != 0 && c13 != 4) {
                                    if (c13 != 1) {
                                        if (c13 != 2) {
                                            if (c13 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (g11Var.E == -1 && g11Var.F == -1) {
                                                    r9 = false;
                                                }
                                                aaVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (g11Var.E == -1 && g11Var.F == -1) {
                                                r9 = false;
                                            }
                                            aaVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (g11Var.E == -1 && g11Var.F == -1) {
                                            r9 = false;
                                        }
                                        aaVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (g11Var.E == -1 && g11Var.F == -1) {
                                        r9 = false;
                                    }
                                    aaVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(yh.k("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            aaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(yh.k("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c14 = g11Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c14 == null ? LocaleController.getString(R.string.CustomSound) : qk0.a0(c14, c14.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        aaVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    aaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    aaVar.setTextColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 != g11Var.K) {
                    if (i10 != g11Var.S) {
                        if (i10 != g11Var.G) {
                            if (i10 == g11Var.P) {
                                a9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (g11Var.F != -1) {
                            a9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            a9Var.setText("");
                            break;
                        }
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    a9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb = new StringBuilder("color_");
                sb.append(sharedPrefKey2);
                int c15 = notificationsSettings2.contains(sb.toString()) ? org.telegram.messenger.y3.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.u8.f[i18] == c15) {
                            c15 = org.telegram.ui.Cells.u8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                u8Var.b(c15, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i13 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c16 = org.telegram.messenger.y3.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c16 == 0) {
                    c16 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != g11Var.I) {
                    if (i10 == g11Var.J) {
                        j6Var.c(LocaleController.getString(R.string.PopupDisabled), c16 == 2, false);
                        j6Var.setTag(2);
                        break;
                    }
                } else {
                    j6Var.c(LocaleController.getString(R.string.PopupEnabled), c16 == 1, true);
                    j6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                boolean z4 = i10 > 0;
                r9 = i10 < g11Var.V - 1;
                if (z6Var.c != z4 || z6Var.d != r9) {
                    z6Var.c = z4;
                    z6Var.d = r9;
                    int i19 = z6Var.b;
                    if (i19 != 0) {
                        z6Var.setBackgroundColor(i19);
                        break;
                    } else {
                        z6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i16 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != g11Var.y) {
                    if (i10 != g11Var.B) {
                        if (i10 == g11Var.L) {
                            String k10 = yh.k(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (g11Var.W || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            s8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(k10, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        s8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    s8Var.f(LocaleController.getString(R.string.Notifications), g11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        g11 g11Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = g11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.aa(context, 0, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, g6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.u8(context, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.j6(context, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ua(context, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.s8(context, g6Var);
                m4Var.setBackgroundColor(g11Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
        }
        return yh.o(m4Var, m4Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        int i10 = m1Var.f;
        View view = m1Var.a;
        g11 g11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, g11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (m1Var.b() == g11Var.T) {
                aaVar.a(null, true);
                return;
            } else {
                aaVar.a(null, g11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.a9) view).c(null, g11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.u8) view).a(null, g11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.j6) view).b(null, g11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
        if (m1Var.b() == g11Var.B) {
            s8Var.e(null, g11Var.n);
        } else if (m1Var.b() == g11Var.L) {
            s8Var.e(null, g11Var.n);
        } else {
            s8Var.e(null, true);
        }
    }
}
