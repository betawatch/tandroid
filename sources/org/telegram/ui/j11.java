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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j11 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ l11 d;

    public j11(l11 l11Var, Context context) {
        this.d = l11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        l11 l11Var = this.d;
        if (b10 == l11Var.B) {
            return l11Var.n;
        }
        if (l1Var.b() == l11Var.T) {
            return true;
        }
        switch (l1Var.f) {
        }
        return l11Var.n;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.V;
    }

    @Override // f2.o0
    public final int j(int i10) {
        l11 l11Var = this.d;
        if (i10 == l11Var.v || i10 == l11Var.H || i10 == l11Var.Q || i10 == l11Var.M) {
            return 0;
        }
        if (i10 == l11Var.C || i10 == l11Var.D || i10 == l11Var.F || i10 == l11Var.E || i10 == l11Var.N || i10 == l11Var.O || i10 == l11Var.T) {
            return 1;
        }
        if (i10 == l11Var.K || i10 == l11Var.S || i10 == l11Var.G || i10 == l11Var.P) {
            return 2;
        }
        if (i10 == l11Var.R) {
            return 3;
        }
        if (i10 == l11Var.I || i10 == l11Var.J) {
            return 4;
        }
        if (i10 == l11Var.w) {
            return 5;
        }
        if (i10 == l11Var.x || i10 == l11Var.U) {
            return 6;
        }
        return (i10 == l11Var.y || i10 == l11Var.B || i10 == l11Var.L) ? 7 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        l11 l11Var = this.d;
        long j10 = l11Var.f;
        long j11 = l11Var.e;
        int i17 = l1Var.f;
        View view = l1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != l11Var.v) {
                    if (i10 != l11Var.H) {
                        if (i10 != l11Var.Q) {
                            if (i10 == l11Var.M) {
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
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != l11Var.T) {
                    z9Var.setTextColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    if (i10 != l11Var.C) {
                        if (i10 != l11Var.N) {
                            if (i10 != l11Var.D) {
                                if (i10 != l11Var.F) {
                                    if (i10 != l11Var.E) {
                                        if (i10 == l11Var.O) {
                                            int c3 = org.telegram.messenger.y3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c3 != 0 && c3 != 4) {
                                                if (c3 != 1) {
                                                    if (c3 != 2) {
                                                        if (c3 == 3) {
                                                            z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c10 = org.telegram.messenger.y3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c11 = org.telegram.messenger.y3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c10 != 0) {
                                            z9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c10), LocaleController.formatPluralString("Minutes", c11 / 60, new Object[0])), false, l11Var.F != -1);
                                            break;
                                        } else {
                                            z9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, l11Var.F != -1);
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
                                                        z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
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
                                                if (l11Var.E == -1 && l11Var.F == -1) {
                                                    r9 = false;
                                                }
                                                z9Var.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (l11Var.E == -1 && l11Var.F == -1) {
                                                r9 = false;
                                            }
                                            z9Var.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (l11Var.E == -1 && l11Var.F == -1) {
                                            r9 = false;
                                        }
                                        z9Var.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (l11Var.E == -1 && l11Var.F == -1) {
                                        r9 = false;
                                    }
                                    z9Var.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(vh.w2.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            z9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(vh.w2.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c14 = l11Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c14 == null ? LocaleController.getString(R.string.CustomSound) : qk0.a0(c14, c14.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        z9Var.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    z9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    z9Var.setTextColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i10 != l11Var.K) {
                    if (i10 != l11Var.S) {
                        if (i10 != l11Var.G) {
                            if (i10 == l11Var.P) {
                                z8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (l11Var.F != -1) {
                            z8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            z8Var.setText("");
                            break;
                        }
                    } else {
                        z8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    z8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb = new StringBuilder("color_");
                sb.append(sharedPrefKey2);
                int c15 = notificationsSettings2.contains(sb.toString()) ? org.telegram.messenger.y3.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.t8.f[i18] == c15) {
                            c15 = org.telegram.ui.Cells.t8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                t8Var.b(c15, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i13 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c16 = org.telegram.messenger.y3.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c16 == 0) {
                    c16 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != l11Var.I) {
                    if (i10 == l11Var.J) {
                        i6Var.c(LocaleController.getString(R.string.PopupDisabled), c16 == 2, false);
                        i6Var.setTag(2);
                        break;
                    }
                } else {
                    i6Var.c(LocaleController.getString(R.string.PopupEnabled), c16 == 1, true);
                    i6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                taVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                boolean z4 = i10 > 0;
                r9 = i10 < l11Var.V - 1;
                if (y6Var.c != z4 || y6Var.d != r9) {
                    y6Var.c = z4;
                    y6Var.d = r9;
                    int i19 = y6Var.b;
                    if (i19 != 0) {
                        y6Var.setBackgroundColor(i19);
                        break;
                    } else {
                        y6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i16 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != l11Var.y) {
                    if (i10 != l11Var.B) {
                        if (i10 == l11Var.L) {
                            String e = vh.w2.e(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (l11Var.W || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            r8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        r8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    r8Var.f(LocaleController.getString(R.string.Notifications), l11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        l11 l11Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = l11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.z9(context, 0, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.t8(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.i6(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ta(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
        }
        return ai.n(l4Var, l4Var, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        View view = l1Var.a;
        l11 l11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.l4) view).a(null, l11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            if (l1Var.b() == l11Var.T) {
                z9Var.a(null, true);
                return;
            } else {
                z9Var.a(null, l11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.z8) view).c(null, l11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.t8) view).a(null, l11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.i6) view).b(null, l11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (l1Var.b() == l11Var.B) {
            r8Var.e(null, l11Var.n);
        } else if (l1Var.b() == l11Var.L) {
            r8Var.e(null, l11Var.n);
        } else {
            r8Var.e(null, true);
        }
    }
}
