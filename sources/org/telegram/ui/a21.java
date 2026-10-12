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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a21 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ c21 d;

    public a21(c21 c21Var, Context context) {
        this.d = c21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        c21 c21Var = this.d;
        if (b10 == c21Var.E) {
            return c21Var.n;
        }
        if (b1Var.b() == c21Var.W) {
            return true;
        }
        switch (b1Var.f) {
        }
        return c21Var.n;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        c21 c21Var = this.d;
        long j10 = c21Var.f;
        long j11 = c21Var.e;
        int i17 = b1Var.f;
        View view = b1Var.a;
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
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != c21Var.W) {
                    caVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    if (i10 != c21Var.F) {
                        if (i10 != c21Var.Q) {
                            if (i10 != c21Var.G) {
                                if (i10 != c21Var.I) {
                                    if (i10 != c21Var.H) {
                                        if (i10 == c21Var.R) {
                                            int d = org.telegram.messenger.q.d("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (d != 0 && d != 4) {
                                                if (d != 1) {
                                                    if (d != 2) {
                                                        if (d == 3) {
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
                                        int d10 = org.telegram.messenger.q.d("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int d11 = org.telegram.messenger.q.d("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (d10 != 0) {
                                            caVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(d10), LocaleController.formatPluralString("Minutes", d11 / 60, new Object[0])), false, c21Var.I != -1);
                                            break;
                                        } else {
                                            caVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, c21Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int d12 = org.telegram.messenger.q.d("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (d12 != 0) {
                                        if (d12 != 1 && d12 != 2) {
                                            if (d12 != 3) {
                                                if (d12 != 4) {
                                                    if (d12 == 5) {
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
                                int d13 = org.telegram.messenger.q.d("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (d13 != 0 && d13 != 4) {
                                    if (d13 != 1) {
                                        if (d13 != 2) {
                                            if (d13 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (c21Var.H == -1 && c21Var.I == -1) {
                                                    r9 = false;
                                                }
                                                caVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (c21Var.H == -1 && c21Var.I == -1) {
                                                r9 = false;
                                            }
                                            caVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (c21Var.H == -1 && c21Var.I == -1) {
                                            r9 = false;
                                        }
                                        caVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (c21Var.H == -1 && c21Var.I == -1) {
                                        r9 = false;
                                    }
                                    caVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(t8.b.h("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            caVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(t8.b.h("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c10 = c21Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c10 == null ? LocaleController.getString(R.string.CustomSound) : fl0.a0(c10, c10.file_name_fixed);
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
                    caVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != c21Var.N) {
                    if (i10 != c21Var.V) {
                        if (i10 != c21Var.J) {
                            if (i10 == c21Var.S) {
                                e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (c21Var.I != -1) {
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
                i12 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int d14 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.q.d("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.y8.f[i18] == d14) {
                            d14 = org.telegram.ui.Cells.y8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                y8Var.b(d14, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i13 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int d15 = org.telegram.messenger.q.d("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (d15 == 0) {
                    d15 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != c21Var.L) {
                    if (i10 == c21Var.M) {
                        k6Var.c(LocaleController.getString(R.string.PopupDisabled), d15 == 2, false);
                        k6Var.setTag(2);
                        break;
                    }
                } else {
                    k6Var.c(LocaleController.getString(R.string.PopupEnabled), d15 == 1, true);
                    k6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                waVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < c21Var.Y - 1;
                if (b7Var.c != z10 || b7Var.d != r9) {
                    b7Var.c = z10;
                    b7Var.d = r9;
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
                i16 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != c21Var.y) {
                    if (i10 != c21Var.E) {
                        if (i10 == c21Var.O) {
                            String h = t8.b.h(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (c21Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            w8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(h, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        w8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    w8Var.f(LocaleController.getString(R.string.Notifications), c21Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        c21 c21Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = c21Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ca(context, 0, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, c6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.wa(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(m4Var, m4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        View view = b1Var.a;
        c21 c21Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, c21Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (b1Var.b() == c21Var.W) {
                caVar.a(null, true);
                return;
            } else {
                caVar.a(null, c21Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.e9) view).c(null, c21Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.y8) view).a(null, c21Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.k6) view).b(null, c21Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (b1Var.b() == c21Var.E) {
            w8Var.e(null, c21Var.n);
        } else if (b1Var.b() == c21Var.O) {
            w8Var.e(null, c21Var.n);
        } else {
            w8Var.e(null, true);
        }
    }
}
