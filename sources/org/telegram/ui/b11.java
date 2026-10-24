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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b11 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ d11 d;

    public b11(d11 d11Var, Context context) {
        this.d = d11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        d11 d11Var = this.d;
        if (b10 == d11Var.E) {
            return d11Var.n;
        }
        if (b1Var.b() == d11Var.W) {
            return true;
        }
        switch (b1Var.f) {
        }
        return d11Var.n;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.g0
    public final int j(int i10) {
        d11 d11Var = this.d;
        if (i10 == d11Var.v || i10 == d11Var.K || i10 == d11Var.T || i10 == d11Var.P) {
            return 0;
        }
        if (i10 == d11Var.F || i10 == d11Var.G || i10 == d11Var.I || i10 == d11Var.H || i10 == d11Var.Q || i10 == d11Var.R || i10 == d11Var.W) {
            return 1;
        }
        if (i10 == d11Var.N || i10 == d11Var.V || i10 == d11Var.J || i10 == d11Var.S) {
            return 2;
        }
        if (i10 == d11Var.U) {
            return 3;
        }
        if (i10 == d11Var.L || i10 == d11Var.M) {
            return 4;
        }
        if (i10 == d11Var.w) {
            return 5;
        }
        if (i10 == d11Var.x || i10 == d11Var.X) {
            return 6;
        }
        return (i10 == d11Var.y || i10 == d11Var.E || i10 == d11Var.O) ? 7 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        d11 d11Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = d11Var.d;
        long j10 = d11Var.f;
        long j11 = d11Var.e;
        int i17 = b1Var.f;
        View view = b1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != d11Var.v) {
                    if (i10 != d11Var.K) {
                        if (i10 != d11Var.T) {
                            if (i10 == d11Var.P) {
                                l4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            l4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    l4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != d11Var.W) {
                    org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.G6, g6Var);
                    if (i10 != d11Var.F) {
                        if (i10 != d11Var.Q) {
                            if (i10 != d11Var.G) {
                                if (i10 != d11Var.I) {
                                    if (i10 != d11Var.H) {
                                        if (i10 == d11Var.R) {
                                            int c10 = org.telegram.messenger.v0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.v0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.v0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            caVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, d11Var.I != -1);
                                            break;
                                        } else {
                                            caVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, d11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.v0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.v0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (d11Var.H == -1 && d11Var.I == -1) {
                                                    r10 = false;
                                                }
                                                caVar.c(string, string2, false, r10);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (d11Var.H == -1 && d11Var.I == -1) {
                                                r10 = false;
                                            }
                                            caVar.c(string3, string4, false, r10);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (d11Var.H == -1 && d11Var.I == -1) {
                                            r10 = false;
                                        }
                                        caVar.c(string5, string6, false, r10);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (d11Var.H == -1 && d11Var.I == -1) {
                                        r10 = false;
                                    }
                                    caVar.c(string7, string8, false, r10);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(si.o0.h("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            caVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(si.o0.h("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c15 = d11Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : nk0.b0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        caVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    caVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.q7, g6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != d11Var.N) {
                    if (i10 != d11Var.V) {
                        if (i10 != d11Var.J) {
                            if (i10 == d11Var.S) {
                                e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (d11Var.I != -1) {
                            e9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            e9Var.setText("");
                            break;
                        }
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.v0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.y8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.y8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                y8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i13 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.v0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != d11Var.L) {
                    if (i10 == d11Var.M) {
                        k6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        k6Var.setTag(2);
                        break;
                    }
                } else {
                    k6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    k6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                vaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                boolean z10 = i10 > 0;
                r10 = i10 < d11Var.Y - 1;
                if (b7Var.c != z10 || b7Var.d != r10) {
                    b7Var.c = z10;
                    b7Var.d = r10;
                    int i19 = b7Var.b;
                    if (i19 != 0) {
                        b7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        b7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i16 = ((org.telegram.ui.ActionBar.o2) d11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != d11Var.y) {
                    if (i10 != d11Var.E) {
                        if (i10 == d11Var.O) {
                            String h = si.o0.h(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (d11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r11 = true;
                            }
                            w8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(h, r11), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        w8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    w8Var.f(LocaleController.getString(R.string.Notifications), d11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.g6 g6Var = this.d.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.ca(context, 0, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, g6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.y8(context, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.k6(context, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.va(context, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.w8(context, g6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        View view = b1Var.a;
        d11 d11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.l4) view).a(null, d11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (b1Var.b() == d11Var.W) {
                caVar.a(null, true);
                return;
            } else {
                caVar.a(null, d11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.e9) view).c(null, d11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.y8) view).a(null, d11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.k6) view).b(null, d11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (b1Var.b() == d11Var.E) {
            w8Var.e(null, d11Var.n);
        } else if (b1Var.b() == d11Var.O) {
            w8Var.e(null, d11Var.n);
        } else {
            w8Var.e(null, true);
        }
    }
}
