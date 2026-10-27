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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h11 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ j11 d;

    public h11(j11 j11Var, Context context) {
        this.d = j11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        j11 j11Var = this.d;
        if (b10 == j11Var.F) {
            return j11Var.r;
        }
        if (e1Var.b() == j11Var.X) {
            return true;
        }
        switch (e1Var.f) {
        }
        return j11Var.r;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Z;
    }

    @Override // s4.h0
    public final int j(int i10) {
        j11 j11Var = this.d;
        if (i10 == j11Var.w || i10 == j11Var.L || i10 == j11Var.U || i10 == j11Var.Q) {
            return 0;
        }
        if (i10 == j11Var.G || i10 == j11Var.H || i10 == j11Var.J || i10 == j11Var.I || i10 == j11Var.R || i10 == j11Var.S || i10 == j11Var.X) {
            return 1;
        }
        if (i10 == j11Var.O || i10 == j11Var.W || i10 == j11Var.K || i10 == j11Var.T) {
            return 2;
        }
        if (i10 == j11Var.V) {
            return 3;
        }
        if (i10 == j11Var.M || i10 == j11Var.N) {
            return 4;
        }
        if (i10 == j11Var.x) {
            return 5;
        }
        if (i10 == j11Var.y || i10 == j11Var.Y) {
            return 6;
        }
        return (i10 == j11Var.E || i10 == j11Var.F || i10 == j11Var.P) ? 7 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        j11 j11Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = j11Var.e;
        long j10 = j11Var.h;
        long j11 = j11Var.f;
        int i17 = e1Var.f;
        View view = e1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 != j11Var.w) {
                    if (i10 != j11Var.L) {
                        if (i10 != j11Var.U) {
                            if (i10 == j11Var.Q) {
                                q4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        q4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    q4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != j11Var.X) {
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, u6Var);
                    if (i10 != j11Var.G) {
                        if (i10 != j11Var.R) {
                            if (i10 != j11Var.H) {
                                if (i10 != j11Var.J) {
                                    if (i10 != j11Var.I) {
                                        if (i10 == j11Var.S) {
                                            int d = org.telegram.messenger.t.d("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (d != 0 && d != 4) {
                                                if (d != 1) {
                                                    if (d != 2) {
                                                        if (d == 3) {
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
                                        int d10 = org.telegram.messenger.t.d("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int d11 = org.telegram.messenger.t.d("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (d10 != 0) {
                                            gaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(d10), LocaleController.formatPluralString("Minutes", d11 / 60, new Object[0])), false, j11Var.J != -1);
                                            break;
                                        } else {
                                            gaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, j11Var.J != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int d12 = org.telegram.messenger.t.d("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (d12 != 0) {
                                        if (d12 != 1 && d12 != 2) {
                                            if (d12 != 3) {
                                                if (d12 != 4) {
                                                    if (d12 == 5) {
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
                                int d13 = org.telegram.messenger.t.d("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (d13 != 0 && d13 != 4) {
                                    if (d13 != 1) {
                                        if (d13 != 2) {
                                            if (d13 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (j11Var.I == -1 && j11Var.J == -1) {
                                                    r10 = false;
                                                }
                                                gaVar.c(string, string2, false, r10);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (j11Var.I == -1 && j11Var.J == -1) {
                                                r10 = false;
                                            }
                                            gaVar.c(string3, string4, false, r10);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (j11Var.I == -1 && j11Var.J == -1) {
                                            r10 = false;
                                        }
                                        gaVar.c(string5, string6, false, r10);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (j11Var.I == -1 && j11Var.J == -1) {
                                        r10 = false;
                                    }
                                    gaVar.c(string7, string8, false, r10);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(org.telegram.ui.Components.b10.j("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            gaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(org.telegram.ui.Components.b10.j("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c10 = j11Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c10 == null ? LocaleController.getString(R.string.CustomSound) : vk0.c0(c10, c10.file_name_fixed);
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
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.q7, u6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                if (i10 != j11Var.O) {
                    if (i10 != j11Var.W) {
                        if (i10 != j11Var.K) {
                            if (i10 == j11Var.T) {
                                i9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (j11Var.J != -1) {
                            i9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            i9Var.setText("");
                            break;
                        }
                    } else {
                        i9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    i9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int d14 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.t.d("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.c9.f[i18] == d14) {
                            d14 = org.telegram.ui.Cells.c9.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                c9Var.b(d14, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
                i13 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int d15 = org.telegram.messenger.t.d("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (d15 == 0) {
                    d15 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != j11Var.M) {
                    if (i10 == j11Var.N) {
                        o6Var.c(LocaleController.getString(R.string.PopupDisabled), d15 == 2, false);
                        o6Var.setTag(2);
                        break;
                    }
                } else {
                    o6Var.c(LocaleController.getString(R.string.PopupEnabled), d15 == 1, true);
                    o6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                zaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                boolean z10 = i10 > 0;
                r10 = i10 < j11Var.Z - 1;
                if (f7Var.c != z10 || f7Var.d != r10) {
                    f7Var.c = z10;
                    f7Var.d = r10;
                    int i19 = f7Var.b;
                    if (i19 != 0) {
                        f7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        f7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                i16 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != j11Var.E) {
                    if (i10 != j11Var.F) {
                        if (i10 == j11Var.P) {
                            String j13 = org.telegram.ui.Components.b10.j(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (j11Var.a0 || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r11 = true;
                            }
                            a9Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(j13, r11), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        a9Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    a9Var.f(LocaleController.getString(R.string.Notifications), j11Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        org.telegram.ui.ActionBar.u6 u6Var = this.d.e;
        Context context = this.c;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
            case 1:
                q4Var = new org.telegram.ui.Cells.ga(context, 0, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.i9(context, u6Var);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.c9(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
            case 4:
                q4Var = new org.telegram.ui.Cells.o6(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
            case 5:
                q4Var = new org.telegram.ui.Cells.za(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
            case 6:
                q4Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            default:
                q4Var = new org.telegram.ui.Cells.a9(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                break;
        }
        return ic.a.n(q4Var, q4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        j11 j11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.q4) view).a(null, j11Var.r);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (e1Var.b() == j11Var.X) {
                gaVar.a(null, true);
                return;
            } else {
                gaVar.a(null, j11Var.r);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.i9) view).c(null, j11Var.r);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.c9) view).a(null, j11Var.r);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.o6) view).b(null, j11Var.r);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (e1Var.b() == j11Var.F) {
            a9Var.e(null, j11Var.r);
        } else if (e1Var.b() == j11Var.P) {
            a9Var.e(null, j11Var.r);
        } else {
            a9Var.e(null, true);
        }
    }
}
