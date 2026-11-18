package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class l4 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object e;

    public /* synthetic */ l4(int i7, Object obj, Object obj2) {
        this.c = i7;
        this.e = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        String M0;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        CharSequence charSequence;
        boolean z10;
        boolean z11;
        org.telegram.messenger.z5 z5Var;
        CharSequence M02;
        int i20;
        boolean z12;
        int i21;
        CharSequence charSequence2;
        int i22;
        int i23;
        int i24;
        CharSequence M03;
        int i25;
        boolean a10;
        boolean z13;
        CharSequence charSequence3;
        boolean z14;
        boolean z15;
        int i26;
        int i27;
        DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
        int i28 = f1Var.f;
        View view = f1Var.a;
        boolean z16 = true;
        int i29 = 0;
        switch (i28) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.setCanDisable(false);
                org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                i10 = dataSettingsActivity.useLessDataForCallsRow;
                if (i7 != i10) {
                    i11 = dataSettingsActivity.proxyRow;
                    if (i7 != i11) {
                        i12 = dataSettingsActivity.resetDownloadRow;
                        if (i7 != i12) {
                            i13 = dataSettingsActivity.clearDraftsRow;
                            if (i7 == i13) {
                                x9Var.setIcon(0);
                                x9Var.b(org.telegram.messenger.gd.M0(2131746648, null), false);
                                break;
                            }
                        } else {
                            x9Var.setIcon(0);
                            x9Var.setCanDisable(true);
                            org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                            x9Var.b(org.telegram.messenger.gd.M0(2131745916, null), false);
                            break;
                        }
                    } else {
                        x9Var.setIcon(0);
                        x9Var.b(org.telegram.messenger.gd.M0(2131746406, null), false);
                        break;
                    }
                } else {
                    x9Var.setIcon(0);
                    int i30 = org.telegram.messenger.mp.g1().getInt("VoipDataSaving", org.telegram.ui.Components.voip.b2.c());
                    if (i30 == 0) {
                        str = null;
                        M0 = org.telegram.messenger.gd.M0(2131743558, null);
                    } else if (i30 == 1) {
                        str = null;
                        M0 = org.telegram.messenger.gd.M0(2131743557, null);
                    } else if (i30 == 2) {
                        str = null;
                        M0 = org.telegram.messenger.gd.M0(2131743559, null);
                    } else if (i30 != 3) {
                        M0 = null;
                        str = null;
                    } else {
                        str = null;
                        M0 = org.telegram.messenger.gd.M0(2131743556, null);
                    }
                    x9Var.c(org.telegram.messenger.gd.M0(2131742992, str), M0, dataSettingsActivity.V, true);
                    dataSettingsActivity.V = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 != dataSettingsActivity.d) {
                    if (i7 != 0) {
                        if (i7 != dataSettingsActivity.N) {
                            if (i7 != dataSettingsActivity.P) {
                                if (i7 != dataSettingsActivity.y) {
                                    if (i7 != dataSettingsActivity.J) {
                                        if (i7 == dataSettingsActivity.S) {
                                            o4Var.setText(org.telegram.messenger.gd.M0(2131745723, null));
                                            break;
                                        }
                                    } else {
                                        o4Var.setText(org.telegram.messenger.gd.M0(2131753762, null));
                                        break;
                                    }
                                } else {
                                    o4Var.setText(org.telegram.messenger.gd.M0(2131744203, null));
                                    break;
                                }
                            } else {
                                o4Var.setText(org.telegram.messenger.gd.M0(2131746416, null));
                                break;
                            }
                        } else {
                            o4Var.setText(org.telegram.messenger.gd.M0(2131752585, null));
                            break;
                        }
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131751665, null));
                        break;
                    }
                } else {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131753765, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i7 != dataSettingsActivity.E) {
                    if (i7 != dataSettingsActivity.F) {
                        if (i7 != dataSettingsActivity.H) {
                            if (i7 != dataSettingsActivity.G) {
                                if (i7 != dataSettingsActivity.K) {
                                    if (i7 == dataSettingsActivity.L) {
                                        String M04 = org.telegram.messenger.gd.M0(2131753761, null);
                                        int i31 = org.telegram.messenger.bz.a;
                                        s8Var.f(M04, org.telegram.messenger.pc.e(1024), false);
                                        break;
                                    }
                                } else {
                                    String M05 = org.telegram.messenger.gd.M0(2131753763, null);
                                    int i32 = org.telegram.messenger.bz.a;
                                    s8Var.f(M05, org.telegram.messenger.pc.e(2048), true);
                                    break;
                                }
                            } else {
                                s8Var.f("(beta only) Stream All Videos", org.telegram.messenger.bz.C0, false);
                                break;
                            }
                        } else {
                            s8Var.f("(beta only) Show MKV as Video", org.telegram.messenger.bz.D0, true);
                            break;
                        }
                    }
                } else {
                    s8Var.f(org.telegram.messenger.gd.M0(2131751133, null), org.telegram.messenger.bz.B0, dataSettingsActivity.G != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == dataSettingsActivity.I) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131751147, null));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i14 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i7 == i14) {
                    M03 = org.telegram.messenger.gd.M0(2131745724, null);
                    org.telegram.messenger.mv mvVar = org.telegram.messenger.c6.d;
                    i26 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                    charSequence2 = mvVar.e(i26);
                    a10 = org.telegram.messenger.c6.d.a();
                } else {
                    i15 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i7 == i15) {
                        M03 = org.telegram.messenger.gd.M0(2131745731, null);
                        org.telegram.messenger.mv mvVar2 = org.telegram.messenger.c6.e;
                        i25 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                        charSequence2 = mvVar2.e(i25);
                        a10 = org.telegram.messenger.c6.e.a();
                    } else {
                        i16 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i7 == i16) {
                            CharSequence M06 = org.telegram.messenger.gd.M0(2131745733, null);
                            org.telegram.messenger.mv mvVar3 = org.telegram.messenger.c6.f;
                            i24 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                            charSequence2 = mvVar3.e(i24);
                            charSequence = M06;
                            z10 = org.telegram.messenger.c6.f.a();
                            z11 = false;
                            z5Var = null;
                            if (z5Var == null) {
                                long[] jArr = z5Var.b;
                                StringBuilder sb2 = new StringBuilder();
                                int i33 = 0;
                                boolean z17 = false;
                                int i34 = 0;
                                boolean z18 = false;
                                boolean z19 = false;
                                while (true) {
                                    int[] iArr = z5Var.a;
                                    int i35 = z16;
                                    if (i33 < iArr.length) {
                                        if (!z17 && (iArr[i33] & 1) != 0) {
                                            i34++;
                                            z17 = i35;
                                        }
                                        if (!z18 && (iArr[i33] & 4) != 0) {
                                            i34++;
                                            z18 = i35;
                                        }
                                        if (!z19 && (iArr[i33] & 8) != 0) {
                                            i34++;
                                            z19 = i35;
                                        }
                                        i33++;
                                        z16 = i35;
                                    } else {
                                        if (!z5Var.g || i34 == 0) {
                                            z15 = z17;
                                            sb2.append(org.telegram.messenger.gd.M0(2131748005, null));
                                        } else {
                                            if (z17) {
                                                sb2.append(org.telegram.messenger.gd.M0(2131753814, null));
                                            }
                                            if (z18) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.gd.M0(2131753803, null));
                                                z15 = z17;
                                                Object[] objArr = new Object[i35];
                                                objArr[0] = org.telegram.messenger.g0.i0(jArr[i35], i35, false);
                                                sb2.append(String.format(" (%1$s)", objArr));
                                            } else {
                                                z15 = z17;
                                            }
                                            if (z19) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.gd.M0(2131753835, null));
                                                sb2.append(String.format(" (%1$s)", org.telegram.messenger.g0.i0(jArr[org.telegram.messenger.a6.x(8)], true, false)));
                                            }
                                        }
                                        if ((z15 || z18 || z19) && z10) {
                                            i29 = 1;
                                        }
                                        charSequence3 = sb2;
                                        z13 = i29;
                                        z14 = true;
                                    }
                                }
                            } else {
                                z13 = z10;
                                charSequence3 = charSequence2;
                                z14 = true;
                            }
                            j5Var.setAnimationsEnabled(z14);
                            j5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            break;
                        } else {
                            if (i7 == dataSettingsActivity.e) {
                                M02 = org.telegram.messenger.gd.M0(2131742626, null);
                                i22 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.a6.q(i22).N.g;
                                i23 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                z5Var = org.telegram.messenger.a6.q(i23).n();
                            } else if (i7 == dataSettingsActivity.h) {
                                M02 = org.telegram.messenger.gd.M0(2131742628, null);
                                i20 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.a6.q(i20).O.g;
                                i21 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                z5Var = org.telegram.messenger.a6.q(i21).p();
                            } else {
                                CharSequence M07 = org.telegram.messenger.gd.M0(2131742627, null);
                                i17 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                boolean z20 = org.telegram.messenger.a6.q(i17).P.g;
                                i18 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                                org.telegram.messenger.z5 o4 = org.telegram.messenger.a6.q(i18).o();
                                i19 = dataSettingsActivity.resetDownloadRow;
                                charSequence = M07;
                                z10 = z20;
                                z11 = i19 >= 0;
                                z5Var = o4;
                                charSequence2 = null;
                                if (z5Var == null) {
                                }
                                j5Var.setAnimationsEnabled(z14);
                                j5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            }
                            charSequence = M02;
                            z10 = z12;
                            z11 = true;
                            charSequence2 = null;
                            if (z5Var == null) {
                            }
                            j5Var.setAnimationsEnabled(z14);
                            j5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                        }
                    }
                }
                charSequence = M03;
                z10 = a10;
                z11 = true;
                z5Var = null;
                if (z5Var == null) {
                }
                j5Var.setAnimationsEnabled(z14);
                j5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                break;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                if (i7 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.X) {
                        n8Var.r(org.telegram.messenger.gd.M0(2131744581, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        n8Var.h(45, true, dataSettingsActivity.W);
                    } else {
                        String M08 = org.telegram.messenger.gd.M0(2131744581, null);
                        long j3 = dataSettingsActivity.Y;
                        n8Var.r(M08, j3 <= 0 ? "" : org.telegram.messenger.g0.i0(j3, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        n8Var.h(45, false, dataSettingsActivity.W);
                    }
                    dataSettingsActivity.W = false;
                } else if (i7 == dataSettingsActivity.w) {
                    i27 = ((org.telegram.ui.ActionBar.h2) dataSettingsActivity).currentAccount;
                    org.telegram.messenger.cz e10 = org.telegram.messenger.cz.e(i27);
                    n8Var.r(org.telegram.messenger.gd.M0(2131748106, null), org.telegram.messenger.g0.i0(e10.g(2, 6) + e10.g(1, 6) + e10.g(0, 6) + e10.f(2, 6) + e10.f(1, 6) + e10.f(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i7 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(org.telegram.messenger.bz.h0)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i29 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i29)).getAbsolutePath();
                                if (absolutePath2.startsWith(org.telegram.messenger.bz.h0)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    n8Var.r(org.telegram.messenger.gd.M0(2131744585, null), org.telegram.messenger.gd.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131748996 : 2131745645, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                n8Var.setOffsetFromImage(64);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(v4.f1 f1Var, int i7) {
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
        CharSequence M0;
        ArrayList arrayList;
        int i29;
        int i30;
        CharSequence charSequence;
        ArrayList arrayList2;
        int i31;
        int i32;
        int i33;
        boolean z10;
        int i34;
        int i35;
        int i36;
        NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
        int i37 = f1Var.f;
        View view = f1Var.a;
        if (i37 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (i7 == notificationsSettingsActivity.y) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131747716, "NotificationsForChats"));
                return;
            }
            if (i7 == notificationsSettingsActivity.F) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131749027, "InAppNotifications"));
                return;
            }
            if (i7 == notificationsSettingsActivity.L) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131750874, "Events"));
                return;
            }
            if (i7 == notificationsSettingsActivity.N) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131747698, "NotificationsOther"));
                return;
            }
            if (i7 == notificationsSettingsActivity.T) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131745923, "Reset"));
                return;
            }
            if (i7 == notificationsSettingsActivity.H) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131743042, "VoipNotificationSettings"));
                return;
            } else if (i7 == notificationsSettingsActivity.O) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131753731, "BadgeNumber"));
                return;
            } else {
                if (i7 == notificationsSettingsActivity.r) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131745141, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        int i38 = 0;
        if (i37 == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            i10 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).g7;
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i7 == i11) {
                s8Var.f(org.telegram.messenger.gd.M0(2131749023, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i12 = notificationsSettingsActivity.inappVibrateRow;
            if (i7 == i12) {
                s8Var.f(org.telegram.messenger.gd.M0(2131749022, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappPreviewRow;
            if (i7 == i13) {
                s8Var.f(org.telegram.messenger.gd.M0(2131749024, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPriorityRow;
            if (i7 == i14) {
                s8Var.g(org.telegram.messenger.gd.M0(2131749026, null), org.telegram.messenger.gd.M0(2131749025, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i15 = notificationsSettingsActivity.contactJoinedRow;
            if (i7 == i15) {
                s8Var.f(org.telegram.messenger.gd.M0(2131751779, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i16 = notificationsSettingsActivity.pinnedMessageRow;
            if (i7 == i16) {
                s8Var.f(org.telegram.messenger.gd.M0(2131747035, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i7 == notificationsSettingsActivity.Q) {
                s8Var.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.w) {
                s8Var.g(org.telegram.messenger.gd.M0(2131747683, "NotificationsService"), org.telegram.messenger.gd.M0(2131747680, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().E3), true, true);
                return;
            }
            if (i7 == notificationsSettingsActivity.x) {
                s8Var.g(org.telegram.messenger.gd.M0(2131747682, "NotificationsServiceConnection"), org.telegram.messenger.gd.M0(2131747681, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().F3), true, true);
                return;
            }
            i17 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i7 == i17) {
                s8Var.f(org.telegram.messenger.gd.M0(2131753729, "BadgeNumberShow"), notificationsSettingsActivity.getNotificationsController().S, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i7 == i18) {
                s8Var.f(org.telegram.messenger.gd.M0(2131753730, "BadgeNumberMutedChats"), notificationsSettingsActivity.getNotificationsController().T, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i7 == i19) {
                s8Var.f(org.telegram.messenger.gd.M0(2131753728, "BadgeNumberUnread"), notificationsSettingsActivity.getNotificationsController().U, false);
                return;
            }
            i20 = notificationsSettingsActivity.inchatSoundRow;
            if (i7 == i20) {
                s8Var.f(org.telegram.messenger.gd.M0(2131749021, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.I) {
                s8Var.f(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i21 = notificationsSettingsActivity.accountsAllRow;
            if (i7 == i21) {
                s8Var.f(org.telegram.messenger.gd.M0(2131754300, "AllAccounts"), org.telegram.messenger.mp.h1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i37 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setMultilineDetail(true);
            i22 = notificationsSettingsActivity.resetNotificationsRow;
            if (i7 == i22) {
                z8Var.a(org.telegram.messenger.gd.M0(2131745917, "ResetAllNotifications"), org.telegram.messenger.gd.M0(2131743649, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i37 != 3) {
            if (i37 != 5) {
                if (i37 != 6) {
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == notificationsSettingsActivity.s) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131745140, "ShowNotificationsForInfo"));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            i36 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(i36).g7;
            if (i7 == notificationsSettingsActivity.J) {
                String string = sharedPreferences2.getString("CallsRingtone", org.telegram.messenger.gd.M0(2131751588, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = org.telegram.messenger.gd.M0(2131747959, "NoSound");
                }
                x9Var.c(org.telegram.messenger.gd.M0(2131743004, "VoipSettingsRingtone"), string, notificationsSettingsActivity.X, false);
                notificationsSettingsActivity.X = false;
                return;
            }
            if (i7 != notificationsSettingsActivity.I) {
                if (i7 == notificationsSettingsActivity.R) {
                    int i39 = sharedPreferences2.getInt("repeat_messages", 60);
                    x9Var.c(org.telegram.messenger.gd.M0(2131746080, "RepeatNotifications"), i39 == 0 ? org.telegram.messenger.gd.M0(2131746079, "RepeatNotificationsNever") : i39 < 60 ? org.telegram.messenger.gd.G(i39, "Minutes", new Object[0]) : org.telegram.messenger.gd.G(i39 / 60, "Hours", new Object[0]), notificationsSettingsActivity.Y, false);
                    notificationsSettingsActivity.Y = false;
                    return;
                }
                return;
            }
            int i40 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                x9Var.c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), org.telegram.messenger.gd.M0(2131743376, "VibrationDefault"), notificationsSettingsActivity.W, true);
            } else if (i40 == 1) {
                x9Var.c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), org.telegram.messenger.gd.M0(2131745171, "Short"), notificationsSettingsActivity.W, true);
            } else if (i40 == 2) {
                x9Var.c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), org.telegram.messenger.gd.M0(2131743375, "VibrationDisabled"), notificationsSettingsActivity.W, true);
            } else if (i40 == 3) {
                x9Var.c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), org.telegram.messenger.gd.M0(2131748531, "Long"), notificationsSettingsActivity.W, true);
            } else if (i40 == 4) {
                x9Var.c(org.telegram.messenger.gd.M0(2131743377, "Vibrate"), org.telegram.messenger.gd.M0(2131747628, "OnlyIfSilent"), notificationsSettingsActivity.W, true);
            }
            notificationsSettingsActivity.W = false;
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        i23 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences3 = org.telegram.messenger.mp.u1(i23).g7;
        i24 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
        i25 = notificationsSettingsActivity.privateRow;
        if (i7 == i25) {
            M0 = org.telegram.messenger.gd.M0(2131747685, null);
            arrayList = notificationsSettingsActivity.d;
            i29 = sharedPreferences3.getInt("EnableAll2", 0);
            i30 = R.drawable.msg_openprofile;
        } else {
            i26 = notificationsSettingsActivity.groupRow;
            if (i7 != i26) {
                i27 = notificationsSettingsActivity.storiesRow;
                int i41 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i7 == i27) {
                    CharSequence M02 = org.telegram.messenger.gd.M0(2131747739, null);
                    ArrayList arrayList3 = notificationsSettingsActivity.h;
                    ArrayList arrayList4 = notificationsSettingsActivity.n;
                    if (sharedPreferences3.getBoolean("EnableAllStories", false)) {
                        i41 = 0;
                    }
                    i30 = R.drawable.msg_menu_stories;
                    charSequence = M02;
                    arrayList2 = arrayList4;
                    i29 = i41;
                    arrayList = arrayList3;
                } else {
                    i28 = notificationsSettingsActivity.reactionsRow;
                    if (i7 == i28) {
                        CharSequence M03 = org.telegram.messenger.gd.M0(2131747743, null);
                        i29 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i30 = R.drawable.msg_reactions;
                        charSequence = M03;
                        arrayList2 = null;
                        arrayList = null;
                    } else {
                        M0 = org.telegram.messenger.gd.M0(2131747728, null);
                        arrayList = notificationsSettingsActivity.f;
                        i29 = sharedPreferences3.getInt("EnableChannel2", 0);
                        i30 = R.drawable.msg_channel;
                    }
                }
                i31 = i29 >= currentTime ? 1 : 0;
                if (i31 == 0) {
                    i32 = 0;
                } else {
                    i32 = 0;
                    i38 = i29 - 31536000 >= currentTime ? 0 : 2;
                }
                StringBuilder sb2 = new StringBuilder();
                i33 = notificationsSettingsActivity.reactionsRow;
                if (i7 == i33) {
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i31 = i29 < currentTime ? 1 : i32;
                        if (i31 != 0) {
                            sb2.append(org.telegram.messenger.gd.M0(2131747699, "NotificationsOn"));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb2.append(org.telegram.messenger.gd.M0(2131747701, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i32] = org.telegram.messenger.gd.e1(i29);
                            sb2.append(org.telegram.messenger.gd.a0("NotificationsOffUntil", null, 2131747700, objArr));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList.size();
                        i34 = notificationsSettingsActivity.storiesRow;
                        if (i7 == i34 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(org.telegram.messenger.gd.G(size, "Exception", new Object[i32]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(org.telegram.messenger.gd.M0(2131744026, "TapToChange"));
                    } else {
                        if (i29 > 0) {
                            sb2.append(org.telegram.messenger.gd.M0(2131747701, "NotificationsOff"));
                        } else {
                            sb2.append(org.telegram.messenger.gd.M0(2131747699, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(org.telegram.messenger.gd.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z10 = i31;
                } else if (i29 > 0) {
                    sb2.append(org.telegram.messenger.gd.M0(2131747701, "NotificationsOff"));
                    z10 = i32;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(org.telegram.messenger.gd.M0(2131747742, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.gd.M0(2131747741, null));
                    }
                    z10 = 1;
                }
                i35 = notificationsSettingsActivity.reactionsRow;
                j5Var.b(charSequence, sb2, i30, z10, i38, false, i7 == i35, false);
            }
            M0 = org.telegram.messenger.gd.M0(2131747714, null);
            arrayList = notificationsSettingsActivity.e;
            i29 = sharedPreferences3.getInt("EnableGroup2", 0);
            i30 = R.drawable.msg_groups;
        }
        charSequence = M0;
        arrayList2 = null;
        if (i29 >= currentTime) {
        }
        if (i31 == 0) {
        }
        StringBuilder sb22 = new StringBuilder();
        i33 = notificationsSettingsActivity.reactionsRow;
        if (i7 == i33) {
        }
        i35 = notificationsSettingsActivity.reactionsRow;
        j5Var.b(charSequence, sb22, i30, z10, i38, false, i7 == i35, false);
    }

    private final void I(v4.f1 f1Var, int i7) {
        boolean K1;
        cn0 cn0Var = (cn0) this.e;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        ArrayList arrayList = cn0Var.n;
        ArrayList arrayList2 = cn0Var.c;
        HashMap hashMap = cn0Var.b;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.setItemSize(cn0Var.S);
            org.telegram.ui.Components.q9 imageView = s5Var.getImageView();
            s5Var.setTag(Integer.valueOf(i7));
            imageView.r();
            if (ueVar != null) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.e.get(i7);
                s5Var.d(efVar, arrayList2.size() > 1, true, false, false);
                int i11 = efVar.C;
                s5Var.b(cn0Var.e ? arrayList2.indexOf(Integer.valueOf(i11)) : -1, hashMap.containsKey(Integer.valueOf(i11)), false);
                K1 = PhotoViewer.K1(efVar.I);
            } else {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) cn0Var.f.get(i7);
                s5Var.e(hfVar);
                s5Var.getVideoInfoContainer().setVisibility(4);
                s5Var.b(cn0Var.e ? arrayList2.indexOf(hfVar.B) : -1, hashMap.containsKey(hfVar.B), false);
                K1 = PhotoViewer.K1(hfVar.g());
            }
            imageView.getImageReceiver().O0(!K1, true);
            s5Var.getCheckBox().setVisibility((cn0Var.U != 0 || K1) ? 8 : 0);
            return;
        }
        if (i10 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = cn0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 == 2) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ueVar.e.get(i7);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            i7Var.setPhotoEntry(efVar2);
            i7Var.b(hashMap.containsKey(Integer.valueOf(efVar2.C)), false);
            i7Var.setTag(Integer.valueOf(i7));
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        if (i7 < arrayList.size()) {
            n8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i7), false);
        } else {
            n8Var.o(R.drawable.msg_clear_recent, org.telegram.messenger.gd.M0(2131752056, null), false);
        }
    }

    private final void J(v4.f1 f1Var, int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) f1Var.a;
        int L = org.telegram.messenger.g0.L(85.0f);
        int L2 = i7 != 0 ? org.telegram.messenger.g0.L(6.0f) : 0;
        y5Var.f = L;
        org.telegram.ui.Components.mp mpVar = y5Var.c;
        org.telegram.ui.Components.q9 q9Var = y5Var.a;
        di.n4 n4Var = y5Var.e;
        y5Var.h = L2;
        ((FrameLayout.LayoutParams) y5Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) q9Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) n4Var.getLayoutParams()).rightMargin = L2;
        q9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (!(obj instanceof org.telegram.messenger.ef)) {
            if (obj instanceof org.telegram.messenger.hf) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                y5Var.setTag(hfVar);
                y5Var.setImage(hfVar);
                n4Var.setVisibility(4);
                mpVar.a.f(-1, true, false);
                mpVar.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
        int i10 = efVar.C;
        String str = efVar.I;
        y5Var.setTag(efVar);
        n4Var.setVisibility(4);
        String str2 = efVar.c;
        if (str2 != null) {
            q9Var.h(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            q9Var.s(efVar.J, efVar.K, true);
            if (!efVar.b || efVar.d()) {
                q9Var.h("thumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                n4Var.setVisibility(0);
                y5Var.d.setText(org.telegram.messenger.g0.g0(efVar.E, false, false));
                q9Var.h("vthumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            q9Var.setImageResource(R.drawable.nophotos);
        }
        mpVar.a.f(-1, true, false);
        mpVar.setVisibility(0);
    }

    private final void K(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i12 = f1Var.f;
        View view = f1Var.a;
        switch (i12) {
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                i10 = proxyListActivity.proxyAddRow;
                if (i7 == i10) {
                    x9Var.b(org.telegram.messenger.gd.M0(2131754389, null), proxyListActivity.E != -1);
                    break;
                } else if (i7 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                    x9Var.b(org.telegram.messenger.gd.M0(2131751569, null), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == proxyListActivity.h) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746410, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i7 == i11) {
                    s8Var.f(org.telegram.messenger.gd.M0(2131743546, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i7 == proxyListActivity.w) {
                    s8Var.f(org.telegram.messenger.gd.M0(2131743548, null), org.telegram.messenger.bz.a1, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == proxyListActivity.y) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131746408, null));
                    break;
                }
                break;
            case 5:
                rx0 rx0Var = (rx0) view;
                org.telegram.messenger.az azVar = (org.telegram.messenger.az) arrayList2.get(i7 - proxyListActivity.n);
                rx0Var.setProxy(azVar);
                rx0Var.setChecked(org.telegram.messenger.bz.B1 == azVar);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.n));
                rx0Var.h = contains;
                rx0Var.f.a(contains, false);
                rx0Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i7 == proxyListActivity.x) {
                    org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.kt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        strArr[i13] = org.telegram.messenger.gd.a0(null, null, 2131746407, arrayList3.get(i13));
                    }
                    eu0Var.setCallback(new l60(12));
                    eu0Var.b(org.telegram.messenger.bz.b1, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void L(v4.f1 f1Var, int i7) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.h2) ((zy0) this.e)).currentAccount;
        boolean e10 = org.telegram.ui.Components.e50.e(i10);
        int i11 = f1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.o4) f1Var.a).setText(i7 == 0 ? org.telegram.messenger.gd.M0(2131745793, null) : org.telegram.messenger.gd.M0(2131745797, null));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) f1Var.a;
            s8Var.setEnabled(i7 == 1 || e10);
            if (i7 == 1) {
                s8Var.f(org.telegram.messenger.gd.M0(2131745789, null), e10, false);
                return;
            }
            String M0 = org.telegram.messenger.gd.M0(2131745796, null);
            aj.a aVar = aj.e.i;
            aVar.a();
            s8Var.f(M0, aVar.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.a9) f1Var.a).setText(i7 == 6 ? org.telegram.messenger.gd.M0(2131745792, null) : org.telegram.messenger.gd.M0(2131745795, null));
            return;
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.a;
        x9Var.setEnabled(e10);
        if (i7 == 2) {
            x9Var.c(org.telegram.messenger.gd.M0(2131745791, null), a8.p0.n(((zi.s0) aj.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i7 == 3) {
            String M02 = org.telegram.messenger.gd.M0(2131745801, null);
            zi.o0 o0Var = (zi.o0) aj.e.f.a();
            x9Var.c(M02, o0Var == zi.o0.a ? org.telegram.messenger.gd.M0(2131745800, null) : o0Var == zi.o0.b ? org.telegram.messenger.gd.M0(2131745798, null) : org.telegram.messenger.gd.M0(2131745799, null), false, true);
        } else if (i7 == 4) {
            x9Var.c(org.telegram.messenger.gd.M0(2131745794, null), a8.p0.n(((zi.p0) aj.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            x9Var.c(org.telegram.messenger.gd.M0(2131745802, null), zy0.f0(aj.e.h.a()), false, false);
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7;
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
        switch (this.c) {
            case 0:
                int b10 = f1Var.b();
                if (b10 == 1) {
                    return true;
                }
                i7 = ((org.telegram.ui.ActionBar.h2) ((zy0) this.e)).currentAccount;
                return MediaController.s0(i7) && b10 == 2;
            case 1:
                int b11 = f1Var.b();
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.e;
                return b11 == rnVar.v0 || b11 == rnVar.H0 || b11 == rnVar.C0 || b11 == rnVar.G0 || b11 == rnVar.D0 || b11 == rnVar.I0 || b11 == rnVar.E0 || b11 == rnVar.F0 || b11 == rnVar.J0 || b11 == rnVar.K0 || b11 == rnVar.O0.b || b11 == rnVar.N0.b || b11 == rnVar.M0;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return f1Var.f == 0;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = f1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                i10 = dataAutoDownloadActivity.photosRow;
                if (b12 != i10) {
                    i11 = dataAutoDownloadActivity.videosRow;
                    if (b12 != i11) {
                        i12 = dataAutoDownloadActivity.filesRow;
                        if (b12 != i12) {
                            i13 = dataAutoDownloadActivity.storiesRow;
                            if (b12 != i13) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            case 9:
                int b13 = f1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (b13 != dataSettingsActivity.e && b13 != dataSettingsActivity.f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.s) {
                    i14 = dataSettingsActivity.useLessDataForCallsRow;
                    if (b13 != i14 && b13 != dataSettingsActivity.w) {
                        i15 = dataSettingsActivity.proxyRow;
                        if (b13 != i15) {
                            i16 = dataSettingsActivity.clearDraftsRow;
                            if (b13 != i16 && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.H && b13 != dataSettingsActivity.L && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.n) {
                                i17 = dataSettingsActivity.saveToGalleryGroupsRow;
                                if (b13 != i17) {
                                    i18 = dataSettingsActivity.saveToGalleryPeerRow;
                                    if (b13 != i18) {
                                        i19 = dataSettingsActivity.saveToGalleryChannelsRow;
                                        if (b13 != i19) {
                                            i20 = dataSettingsActivity.resetDownloadRow;
                                            if (b13 != i20) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            case 10:
                int b14 = f1Var.b();
                ge0 ge0Var = (ge0) this.e;
                return b14 == ge0Var.c || b14 == ge0Var.d || b14 == ge0Var.e || b14 == ge0Var.f || b14 == ge0Var.h || b14 == ge0Var.r;
            case 11:
                int b15 = f1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                return (b15 == notificationsSettingsActivity.y || b15 == notificationsSettingsActivity.E || b15 == notificationsSettingsActivity.F || b15 == notificationsSettingsActivity.L || b15 == notificationsSettingsActivity.N || b15 == notificationsSettingsActivity.T || b15 == notificationsSettingsActivity.O || b15 == notificationsSettingsActivity.M || b15 == notificationsSettingsActivity.S || b15 == notificationsSettingsActivity.G || b15 == notificationsSettingsActivity.H || b15 == notificationsSettingsActivity.P || b15 == notificationsSettingsActivity.r || b15 == notificationsSettingsActivity.s || b15 == notificationsSettingsActivity.U || b15 == notificationsSettingsActivity.K) ? false : true;
            case 12:
                int b16 = f1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                i21 = passcodeActivity.fingerprintRow;
                if (b16 != i21) {
                    i22 = passcodeActivity.autoLockRow;
                    if (b16 != i22 && b16 != passcodeActivity.O) {
                        i23 = passcodeActivity.changePasscodeRow;
                        if (b16 != i23) {
                            i24 = passcodeActivity.disablePasscodeRow;
                            if (b16 != i24 && b16 != passcodeActivity.K && b16 != passcodeActivity.L) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            case 13:
                return true;
            case 14:
                cn0 cn0Var = (cn0) this.e;
                return cn0Var.K != null || (!TextUtils.isEmpty(cn0Var.w) ? f1Var.b() >= cn0Var.f.size() : f1Var.f != 3);
            case 15:
                return false;
            case 16:
                int b17 = f1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                i25 = proxyListActivity.useProxyRow;
                if (b17 != i25 && b17 != proxyListActivity.w) {
                    i26 = proxyListActivity.proxyAddRow;
                    if (b17 != i26 && b17 != proxyListActivity.E && (b17 < proxyListActivity.n || b17 >= proxyListActivity.r)) {
                        return false;
                    }
                }
                return true;
            case 17:
                int b18 = f1Var.b();
                if (b18 == 1) {
                    return true;
                }
                i27 = ((org.telegram.ui.ActionBar.h2) ((zy0) this.e)).currentAccount;
                return org.telegram.ui.Components.e50.e(i27) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8);
            case 18:
                return f1Var.f != 1;
            default:
                return p1.g.d(3)[f1Var.f] == 1;
        }
    }

    public void E() {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        org.telegram.ui.ActionBar.a5 a5Var3;
        org.telegram.ui.ActionBar.a5 a5Var4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        a5Var = ((org.telegram.ui.ActionBar.h2) proxyListActivity).simpleActionBar;
        boolean x10 = a5Var.x();
        if (size <= 0) {
            if (x10) {
                a5Var2 = ((org.telegram.ui.ActionBar.h2) proxyListActivity).simpleActionBar;
                a5Var2.w();
                int i7 = proxyListActivity.n;
                n(i7, proxyListActivity.r - i7, 2);
                return;
            }
            return;
        }
        a5Var3 = ((org.telegram.ui.ActionBar.h2) proxyListActivity).simpleActionBar;
        a5Var3.E(size, x10);
        if (x10) {
            return;
        }
        a5Var4 = ((org.telegram.ui.ActionBar.h2) proxyListActivity).simpleActionBar;
        a5Var4.J();
        int i10 = proxyListActivity.n;
        n(i10, proxyListActivity.r - i10, 2);
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.F.clear();
        int i7 = proxyListActivity.n;
        n(i7, proxyListActivity.r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.n;
        if (i7 < i10 || i7 >= proxyListActivity.r) {
            return;
        }
        org.telegram.messenger.az azVar = (org.telegram.messenger.az) proxyListActivity.G.get(i7 - i10);
        if (arrayList.contains(azVar)) {
            arrayList.remove(azVar);
        } else {
            arrayList.add(azVar);
        }
        h(i7, 1);
        E();
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.rn) this.e).R0;
            case 2:
                return ((org.telegram.ui.Components.pz) this.e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.qz) this.e).v1.size();
                return size < 10 ? size + 1 : size;
            case 4:
                return ((org.telegram.ui.Components.de0) this.e).G;
            case 5:
                return org.telegram.messenger.qd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.yw0) this.d).x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.f71) this.e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.e).y;
            case 9:
                return ((DataSettingsActivity) this.e).U;
            case 10:
                return ((ge0) this.e).w;
            case 11:
                return ((NotificationsSettingsActivity) this.e).V;
            case 12:
                return ((PasscodeActivity) this.e).Q;
            case 13:
                if (((qm0) this.e).d != null) {
                    return (int) Math.ceil(r1.size() / r0.f);
                }
                return 0;
            case 14:
                cn0 cn0Var = (cn0) this.e;
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar != null) {
                    return ueVar.e.size();
                }
                if (!cn0Var.f.isEmpty()) {
                    return cn0Var.f.size() + (!cn0Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(cn0Var.w) || cn0Var.n.isEmpty()) {
                    return 0;
                }
                return cn0Var.n.size() + 2;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                uq0 uq0Var = photoViewer.d;
                if (uq0Var == null || uq0Var.c() == null) {
                    return 0;
                }
                return photoViewer.d.c().size();
            case 16:
                return ((ProxyListActivity) this.e).e;
            case 17:
                return 7;
            case 18:
                return ((ArrayList) this.e).size();
            default:
                return ((pg.i) this.e).F.size();
        }
    }

    @Override // v4.i0
    public long c(int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.c) {
            case 2:
                i10 = ((org.telegram.ui.Components.pz) this.e).l0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                if (((org.telegram.ui.Components.yw0) this.d).x == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.ni) r0.get(i7)).a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.c71) ((org.telegram.ui.Components.f71) this.e).h.get(i7)).a;
                break;
            case 14:
                return i7;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i7 == proxyListActivity.f) {
                    return -1L;
                }
                if (i7 == proxyListActivity.s) {
                    return -2L;
                }
                i11 = proxyListActivity.proxyAddRow;
                if (i7 == i11) {
                    return -3L;
                }
                i12 = proxyListActivity.useProxyRow;
                if (i7 == i12) {
                    return -4L;
                }
                if (i7 == proxyListActivity.h) {
                    return -6L;
                }
                if (i7 == proxyListActivity.E) {
                    return -8L;
                }
                if (i7 == proxyListActivity.w) {
                    return -9L;
                }
                if (i7 == proxyListActivity.x) {
                    return -10L;
                }
                if (i7 == proxyListActivity.y) {
                    return -11L;
                }
                if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
                    return -7L;
                }
                return ((org.telegram.messenger.az) proxyListActivity.G.get(i7 - r1)).hashCode();
            default:
                return super.c(i7);
        }
        return i10;
    }

    @Override // v4.i0
    public int d(int i7) {
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
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                int i42 = 1;
                if (i7 != 1) {
                    i42 = 2;
                    if (i7 != 2) {
                        return 3;
                    }
                }
                return i42;
            case 1:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.e;
                if (i7 == rnVar.C0 || i7 == rnVar.G0 || i7 == rnVar.H0 || i7 == rnVar.D0 || i7 == rnVar.E0 || i7 == rnVar.F0 || i7 == rnVar.I0 || i7 == rnVar.N0.b || i7 == rnVar.O0.b) {
                    return 10;
                }
                if (i7 == rnVar.m0 || i7 == rnVar.t0 || i7 == rnVar.x0 || i7 == rnVar.p0) {
                    return 0;
                }
                if (i7 == rnVar.s0) {
                    return 1;
                }
                if (i7 == rnVar.w0 || i7 == rnVar.y0 || i7 == rnVar.r0 || i7 == rnVar.L0) {
                    return 2;
                }
                if (i7 == rnVar.v0 || i7 == rnVar.J0 || i7 == rnVar.M0) {
                    return 3;
                }
                if (i7 == rnVar.n0) {
                    return 4;
                }
                if (i7 == rnVar.o0) {
                    return 11;
                }
                if (i7 == rnVar.q0) {
                    return 7;
                }
                if (i7 == rnVar.z0 || i7 == rnVar.A0 || i7 == rnVar.K0) {
                    return 6;
                }
                if (i7 == rnVar.B0) {
                    return 8;
                }
                return i7 == 0 ? 9 : 5;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                org.telegram.ui.Components.de0 de0Var = (org.telegram.ui.Components.de0) this.e;
                return (i7 == de0Var.E || i7 == de0Var.F) ? 1 : 0;
            case 5:
                return i7 == 0 ? 1 : 0;
            case 6:
            default:
                return super.d(i7);
            case 7:
                return 0;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                i10 = dataAutoDownloadActivity.autoDownloadRow;
                if (i7 == i10) {
                    return 0;
                }
                if (i7 == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i7 == dataAutoDownloadActivity.r || i7 == dataAutoDownloadActivity.w) {
                    return 2;
                }
                i11 = dataAutoDownloadActivity.usageProgressRow;
                if (i7 == i11) {
                    return 3;
                }
                i12 = dataAutoDownloadActivity.photosRow;
                if (i7 != i12) {
                    i13 = dataAutoDownloadActivity.videosRow;
                    if (i7 != i13) {
                        i14 = dataAutoDownloadActivity.filesRow;
                        if (i7 != i14) {
                            i15 = dataAutoDownloadActivity.storiesRow;
                            if (i7 != i15) {
                                return 5;
                            }
                        }
                    }
                }
                return 4;
            case 9:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (i7 == dataSettingsActivity.r || i7 == dataSettingsActivity.x || i7 == dataSettingsActivity.O || i7 == dataSettingsActivity.Q || i7 == dataSettingsActivity.M || i7 == dataSettingsActivity.R || i7 == dataSettingsActivity.T) {
                    return 0;
                }
                if (i7 == dataSettingsActivity.d || i7 == dataSettingsActivity.y || i7 == dataSettingsActivity.N || i7 == 0 || i7 == dataSettingsActivity.P || i7 == dataSettingsActivity.J || i7 == dataSettingsActivity.S) {
                    return 2;
                }
                if (i7 == dataSettingsActivity.F || i7 == dataSettingsActivity.E || i7 == dataSettingsActivity.G || i7 == dataSettingsActivity.H || i7 == dataSettingsActivity.K || i7 == dataSettingsActivity.L) {
                    return 3;
                }
                if (i7 == dataSettingsActivity.I) {
                    return 4;
                }
                if (i7 != dataSettingsActivity.e && i7 != dataSettingsActivity.h && i7 != dataSettingsActivity.f) {
                    i16 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i7 != i16) {
                        i17 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i7 != i17) {
                            i18 = dataSettingsActivity.saveToGalleryChannelsRow;
                            if (i7 != i18) {
                                return (i7 == dataSettingsActivity.s || i7 == dataSettingsActivity.w || i7 == dataSettingsActivity.n) ? 6 : 1;
                            }
                        }
                    }
                }
                return 5;
            case 10:
                ge0 ge0Var = (ge0) this.e;
                ge0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 == ge0Var.c || i7 == ge0Var.d || i7 == ge0Var.e || i7 == ge0Var.f || i7 == ge0Var.h) {
                    return 1;
                }
                if (i7 == ge0Var.n) {
                    return 2;
                }
                return i7 == ge0Var.r ? 3 : 4;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                if (i7 == notificationsSettingsActivity.L || i7 == notificationsSettingsActivity.N || i7 == notificationsSettingsActivity.T || i7 == notificationsSettingsActivity.H || i7 == notificationsSettingsActivity.O || i7 == notificationsSettingsActivity.F || i7 == notificationsSettingsActivity.y || i7 == notificationsSettingsActivity.r) {
                    return 0;
                }
                i19 = notificationsSettingsActivity.inappSoundRow;
                if (i7 != i19) {
                    i20 = notificationsSettingsActivity.inappVibrateRow;
                    if (i7 != i20 && i7 != notificationsSettingsActivity.x) {
                        i21 = notificationsSettingsActivity.inappPreviewRow;
                        if (i7 != i21) {
                            i22 = notificationsSettingsActivity.contactJoinedRow;
                            if (i7 != i22) {
                                i23 = notificationsSettingsActivity.pinnedMessageRow;
                                if (i7 != i23 && i7 != notificationsSettingsActivity.w) {
                                    i24 = notificationsSettingsActivity.badgeNumberMutedRow;
                                    if (i7 != i24) {
                                        i25 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                        if (i7 != i25) {
                                            i26 = notificationsSettingsActivity.badgeNumberShowRow;
                                            if (i7 != i26) {
                                                i27 = notificationsSettingsActivity.inappPriorityRow;
                                                if (i7 != i27) {
                                                    i28 = notificationsSettingsActivity.inchatSoundRow;
                                                    if (i7 != i28 && i7 != notificationsSettingsActivity.Q) {
                                                        i29 = notificationsSettingsActivity.accountsAllRow;
                                                        if (i7 != i29) {
                                                            i30 = notificationsSettingsActivity.resetNotificationsRow;
                                                            if (i7 == i30) {
                                                                return 2;
                                                            }
                                                            i31 = notificationsSettingsActivity.privateRow;
                                                            if (i7 != i31) {
                                                                i32 = notificationsSettingsActivity.groupRow;
                                                                if (i7 != i32) {
                                                                    i33 = notificationsSettingsActivity.channelsRow;
                                                                    if (i7 != i33) {
                                                                        i34 = notificationsSettingsActivity.storiesRow;
                                                                        if (i7 != i34) {
                                                                            i35 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i7 != i35) {
                                                                                if (i7 == notificationsSettingsActivity.K || i7 == notificationsSettingsActivity.E || i7 == notificationsSettingsActivity.M || i7 == notificationsSettingsActivity.S || i7 == notificationsSettingsActivity.G || i7 == notificationsSettingsActivity.P || i7 == notificationsSettingsActivity.U) {
                                                                                    return 4;
                                                                                }
                                                                                return i7 == notificationsSettingsActivity.s ? 6 : 5;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            return 3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return 1;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                i36 = passcodeActivity.fingerprintRow;
                if (i7 != i36 && i7 != passcodeActivity.O && i7 != passcodeActivity.L && i7 != passcodeActivity.K) {
                    i37 = passcodeActivity.changePasscodeRow;
                    if (i7 != i37) {
                        i38 = passcodeActivity.autoLockRow;
                        if (i7 != i38) {
                            i39 = passcodeActivity.disablePasscodeRow;
                            if (i7 != i39) {
                                if (i7 == passcodeActivity.I || i7 == passcodeActivity.P || i7 == passcodeActivity.H || i7 == passcodeActivity.M) {
                                    return 2;
                                }
                                if (i7 == passcodeActivity.N || i7 == passcodeActivity.J) {
                                    return 3;
                                }
                                if (i7 == 0) {
                                    return 4;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 13:
                return 0;
            case 14:
                cn0 cn0Var = (cn0) this.e;
                if (cn0Var.Z) {
                    return 2;
                }
                if (cn0Var.K == null) {
                    if (cn0Var.f.isEmpty()) {
                        return i7 == cn0Var.n.size() ? 4 : 3;
                    }
                    if (i7 >= cn0Var.f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i7 == proxyListActivity.f || i7 == proxyListActivity.s) {
                    return 0;
                }
                i40 = proxyListActivity.proxyAddRow;
                if (i7 == i40 || i7 == proxyListActivity.E) {
                    return 1;
                }
                i41 = proxyListActivity.useProxyRow;
                if (i7 == i41 || i7 == proxyListActivity.w) {
                    return 3;
                }
                if (i7 == proxyListActivity.h) {
                    return 2;
                }
                if (i7 == proxyListActivity.x) {
                    return 6;
                }
                return (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) ? 4 : 5;
            case 17:
                if (i7 == 0 || i7 == 7) {
                    return 0;
                }
                if (i7 == 1 || i7 == 8) {
                    return 1;
                }
                return (i7 == 6 || i7 == 9) ? 3 : 2;
            case 18:
                return i7 == ((ArrayList) this.e).size() ? 1 : 0;
            case 19:
                return p1.g.c(((pg.a) ((pg.i) this.e).F.get(i7)).b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cb, code lost:
    
        if (org.telegram.ui.Wallet.u0.D(r3).R() != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06d7  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        String G;
        TextView textView;
        Drawable drawable;
        org.telegram.ui.Components.e71 e71Var;
        int i11;
        int i12;
        int i13;
        int i14;
        String M0;
        int i15;
        int i16;
        org.telegram.messenger.z5 o4;
        int i17;
        int i18;
        int i19;
        int i20;
        StringBuilder sb2;
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
        int i31 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        int i32 = 0;
        switch (i31) {
            case 0:
                i10 = ((org.telegram.ui.ActionBar.h2) ((zy0) obj2)).currentAccount;
                boolean s02 = MediaController.s0(i10);
                int i33 = f1Var.f;
                View view = f1Var.a;
                if (i33 == 0) {
                    ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.M0(2131753922, null));
                    break;
                } else if (i33 == 1) {
                    ((org.telegram.ui.Cells.s8) view).f(org.telegram.messenger.gd.M0(2131753916, null), s02, false);
                    break;
                } else if (i33 == 2) {
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.setEnabled(s02);
                    x9Var.c(org.telegram.messenger.gd.M0(2131753920, null), org.telegram.messenger.gd.M0(((yi.g) aj.e.c.a()) == yi.g.b ? 2131753918 : 2131753919, null), false, false);
                    break;
                } else {
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.gd.M0(2131753921, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj2;
                boolean z11 = rnVar.f0;
                bg.w0 w0Var = rnVar.N0;
                bg.w0 w0Var2 = rnVar.O0;
                org.telegram.ui.ActionBar.i6 i6Var = rnVar.a;
                boolean z12 = rnVar.n;
                int i34 = f1Var.f;
                View view2 = f1Var.a;
                if (i34 == 0) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view2;
                    if (i7 == rnVar.m0) {
                        o4Var.getTextView().setGravity(19);
                        o4Var.setText(org.telegram.messenger.gd.M0(z12 ? 2131743819 : 2131746972, null));
                        break;
                    } else if (i7 == rnVar.p0) {
                        o4Var.getTextView().setGravity(19);
                        o4Var.setText(org.telegram.messenger.gd.M0(2131754471, null));
                        break;
                    } else {
                        o4Var.getTextView().setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                        if (i7 == rnVar.t0) {
                            if (z11) {
                                o4Var.setText(org.telegram.messenger.gd.M0(2131746252, null));
                                break;
                            } else {
                                o4Var.setText(org.telegram.messenger.gd.M0(z12 ? 2131743837 : 2131754244, null));
                                break;
                            }
                        } else if (i7 == rnVar.x0) {
                            o4Var.setText(org.telegram.messenger.gd.M0(2131745300, null));
                            break;
                        }
                    }
                } else if (i34 == 6) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view2;
                    if (i7 == rnVar.z0) {
                        s8Var.f(org.telegram.messenger.gd.M0(2131743858, null), rnVar.g0, rnVar.A0 != -1);
                        s8Var.e(null, true);
                        break;
                    } else if (i7 == rnVar.A0) {
                        s8Var.f(org.telegram.messenger.gd.M0(2131743857, null), rnVar.h0, false);
                        s8Var.e(null, true);
                        break;
                    } else if (i7 == rnVar.K0) {
                        s8Var.f(org.telegram.messenger.gd.M0(2131746946, null), rnVar.a0, false);
                        s8Var.e(null, true);
                        break;
                    }
                } else if (i34 == 2) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view2;
                    a9Var.setFixedSize(0);
                    new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var)), org.telegram.ui.ActionBar.n6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7)).x = true;
                    if (i7 == rnVar.r0) {
                        a9Var.setText(org.telegram.messenger.gd.M0(2131754470, null));
                        break;
                    } else if (i7 == rnVar.y0) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        break;
                    } else {
                        int i35 = rnVar.K - rnVar.N;
                        if (i35 <= 0) {
                            a9Var.setText(org.telegram.messenger.gd.M0(z12 ? 2131743873 : 2131754467, null));
                            break;
                        } else if (z12) {
                            a9Var.setText(org.telegram.messenger.gd.H(',', "TodoNewTaskInfo", i35));
                            break;
                        } else if (i7 == rnVar.L0) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746945, null));
                            break;
                        } else {
                            a9Var.setText(org.telegram.messenger.gd.a0(null, null, 2131754468, org.telegram.messenger.gd.G(i35, "Option", new Object[0])));
                            break;
                        }
                    }
                } else if (i34 == 3) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view2;
                    if (i7 == rnVar.M0) {
                        String M02 = org.telegram.messenger.gd.M0(2131746952, null);
                        ArrayList arrayList = rnVar.Q0;
                        if (arrayList.isEmpty()) {
                            G = org.telegram.messenger.gd.M0(2131745616, null);
                            z10 = false;
                        } else if (arrayList.size() == 1) {
                            z10 = false;
                            G = org.telegram.messenger.gd.i0(2131750505, (String) arrayList.get(0));
                        } else {
                            z10 = false;
                            G = org.telegram.messenger.gd.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                        }
                        n8Var.q(M02, G, z10, true);
                        break;
                    } else if (i7 == rnVar.J0) {
                        rnVar.Z(n8Var, false);
                        break;
                    } else {
                        n8Var.g(-1, org.telegram.ui.ActionBar.n6.Zl);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable3 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.k7, i6Var), mode));
                        rnVar.o1 = drawable2;
                        rnVar.p1 = drawable3;
                        n8Var.p(org.telegram.messenger.gd.M0(z12 ? 2131743833 : 2131754469, null), new org.telegram.ui.Components.mq(drawable2, drawable3), false);
                        n8Var.x = 20;
                        n8Var.s = 58;
                        break;
                    }
                } else if (i34 == 9) {
                    view2.requestLayout();
                    break;
                } else if (i34 == 10) {
                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                    z5Var.setDivider(false);
                    if (i7 == rnVar.C0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746931, null), org.telegram.messenger.gd.M0(2131746930, null), org.telegram.ui.Components.n30.c, R.drawable.filled_poll_view_24, !rnVar.b0);
                    } else if (i7 == rnVar.G0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746956, null), org.telegram.messenger.gd.M0(2131746955, null), org.telegram.ui.Components.n30.f, R.drawable.filled_poll_multiple_24, rnVar.c0);
                    } else if (i7 == rnVar.E0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746954, null), org.telegram.messenger.gd.M0(2131746953, null), org.telegram.ui.Components.n30.w, R.drawable.filled_poll_revote_24, rnVar.S);
                    } else if (i7 == rnVar.D0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746958, null), org.telegram.messenger.gd.M0(2131746957, null), org.telegram.ui.Components.n30.s, R.drawable.filled_poll_add_24, rnVar.U);
                    } else if (i7 == rnVar.F0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746929, null), org.telegram.messenger.gd.M0(2131746928, null), org.telegram.ui.Components.n30.h, R.drawable.filled_poll_shuffle_24, rnVar.T);
                    } else if (i7 == rnVar.H0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746933, null), org.telegram.messenger.gd.M0(2131746932, null), org.telegram.ui.Components.n30.n, R.drawable.filled_poll_correct_24, rnVar.d0);
                    } else if (i7 == w0Var2.b) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746944, null), org.telegram.messenger.gd.M0(2131746943, null), org.telegram.ui.Components.n30.e, R.drawable.filled_location, w0Var2.a);
                    } else if (i7 == w0Var.b) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746936, null), org.telegram.messenger.gd.M0(2131746935, null), org.telegram.ui.Components.n30.d, R.drawable.msg_folders_groups, w0Var.a);
                    } else if (i7 == rnVar.I0) {
                        z5Var.a(org.telegram.messenger.gd.M0(2131746942, null), org.telegram.messenger.gd.M0(2131746941, null), org.telegram.ui.Components.n30.r, R.drawable.filled_poll_deadline_24, (rnVar.V == 0 && rnVar.W == 0) ? false : true);
                        z5Var.setDivider((rnVar.V == 0 && rnVar.W == 0) ? false : true);
                    }
                    if (i7 == rnVar.H0) {
                        z5Var.getCheckBox().a.a(z11, false);
                        break;
                    } else if (i7 == rnVar.D0) {
                        Switch checkBox = z5Var.getCheckBox();
                        if (!rnVar.d0 && !rnVar.b0) {
                            r9 = false;
                        }
                        checkBox.a.a(r9, false);
                        break;
                    } else {
                        z5Var.getCheckBox().a.a(false, false);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.nz nzVar = (org.telegram.ui.Components.nz) f1Var.a;
                int id2 = nzVar.b != null ? nzVar.getId() : -1;
                org.telegram.ui.Components.mz mzVar = (org.telegram.ui.Components.mz) ((org.telegram.ui.Components.pz) obj2).h.get(i7);
                nzVar.b = mzVar;
                nzVar.e = i7;
                nzVar.setContentDescription(mzVar.b);
                nzVar.requestLayout();
                boolean z13 = nzVar.n;
                org.telegram.ui.Components.mz mzVar2 = nzVar.b;
                if (z13 != (mzVar2 != null && mzVar2.g)) {
                    org.telegram.ui.Components.x5.release(nzVar, nzVar.r);
                    org.telegram.ui.Components.x5.release(nzVar, nzVar.P);
                    org.telegram.ui.Components.x5.release(nzVar, nzVar.R);
                    org.telegram.ui.Components.x5.release(nzVar, nzVar.T);
                    if (nzVar.m0) {
                        nzVar.r = org.telegram.ui.Components.x5.update(nzVar.b.g ? 26 : 0, nzVar, nzVar.r, nzVar.s);
                        nzVar.P = org.telegram.ui.Components.x5.update(nzVar.b.g ? 26 : 0, nzVar, nzVar.P, nzVar.Q);
                        nzVar.R = org.telegram.ui.Components.x5.update(nzVar.b.g ? 26 : 0, nzVar, nzVar.R, nzVar.S);
                        nzVar.T = org.telegram.ui.Components.x5.update(nzVar.b.g ? 26 : 0, nzVar, nzVar.T, nzVar.U);
                    }
                    nzVar.n = nzVar.b.g;
                }
                if (id2 != nzVar.getId()) {
                    nzVar.l0 = nzVar.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 3:
                Context context2 = (Context) obj;
                org.telegram.ui.ActionBar.q2 q2Var = (org.telegram.ui.ActionBar.q2) f1Var.a;
                org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) obj2;
                ArrayList arrayList2 = qzVar.w1;
                ArrayList arrayList3 = qzVar.v1;
                if (i7 < arrayList3.size()) {
                    org.telegram.ui.ActionBar.u6.s(q2Var.getImageView(), org.telegram.ui.ActionBar.n6.J5, null, PorterDuff.Mode.MULTIPLY);
                    org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) arrayList3.get(i7);
                    org.telegram.ui.ActionBar.u6.U(q2Var.getTextView(), org.telegram.ui.ActionBar.n6.j5, null);
                    int i36 = roVar.g;
                    int i37 = org.telegram.messenger.mp.J8;
                    int i38 = i36 & i37;
                    q2Var.a(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.b, q2Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), roVar.c, q2Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new org.telegram.ui.Components.h00(qzVar.getContext(), i38 == 3 ? R.drawable.msg_openprofile : ((i36 & 64) == 0 || i38 != i37) ? i38 == 8 ? R.drawable.msg_channel : i38 == 4 ? R.drawable.msg_groups : i38 == 1 ? R.drawable.msg_contacts : i38 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, roVar.m), false);
                    q2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, qzVar.J0));
                    for (int i39 = 0; i39 < arrayList2.size(); i39++) {
                        if (!roVar.a(org.telegram.messenger.c.a(qzVar.a), ((Long) arrayList2.get(i39)).longValue())) {
                            r9 = false;
                        }
                    }
                    q2Var.setChecked(r9);
                    break;
                } else {
                    q2Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable4 = context2.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable5 = context2.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = q2Var.getImageView();
                    int i40 = org.telegram.ui.ActionBar.n6.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.u6.x(imageView, drawable4, i40, null, mode2);
                    org.telegram.ui.ActionBar.u6.x(q2Var.getImageView(), drawable5, org.telegram.ui.ActionBar.n6.k7, null, mode2);
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable4, drawable5);
                    org.telegram.ui.ActionBar.u6.U(q2Var.getTextView(), org.telegram.ui.ActionBar.n6.q6, null);
                    q2Var.a(org.telegram.messenger.gd.M0(2131751705, null), 0, mqVar, false);
                    break;
                }
            case 4:
                org.telegram.ui.Components.de0 de0Var = (org.telegram.ui.Components.de0) obj2;
                int i41 = f1Var.f;
                View view3 = f1Var.a;
                if (i41 == 0) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view3;
                    u5Var.setTag(Integer.valueOf(i7));
                    if (i7 == de0Var.b) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131751115, null), 0, de0Var.H);
                        break;
                    } else if (i7 == de0Var.r) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131749110, null), -100, de0Var.Q);
                        break;
                    } else if (i7 == de0Var.d) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131751758, null), -100, de0Var.J);
                        break;
                    } else if (i7 == de0Var.c) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131750846, null), -100, de0Var.I);
                        break;
                    } else if (i7 == de0Var.f) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131742691, null), -100, de0Var.K);
                        break;
                    } else if (i7 == de0Var.e) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131745752, null), -100, de0Var.L);
                        break;
                    } else if (i7 == de0Var.w) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131743287, null), 0, de0Var.S);
                        break;
                    } else if (i7 == de0Var.s) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131745270, null), -100, de0Var.R);
                        break;
                    } else if (i7 == de0Var.x) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131749349, null), 0, de0Var.T);
                        break;
                    } else if (i7 == de0Var.y) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131745172, null), 0, de0Var.V);
                        break;
                    } else if (i7 == de0Var.h) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131750835, null), 0, de0Var.M);
                        break;
                    } else if (i7 == de0Var.n) {
                        u5Var.a(org.telegram.messenger.gd.M0(2131745098, null), 0, de0Var.N);
                        break;
                    }
                } else if (i41 == 1) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view3;
                    t5Var.setTag(Integer.valueOf(i7));
                    if (i7 == de0Var.E) {
                        t5Var.a(de0Var.O, org.telegram.messenger.gd.M0(2131743879, null));
                        break;
                    } else if (i7 == de0Var.F) {
                        t5Var.a(de0Var.P, org.telegram.messenger.gd.M0(2131743880, null));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj2;
                int i42 = f1Var.f;
                if (i42 != 0) {
                    if (i42 == 1 && (textView = jt0Var.p1) != null) {
                        textView.setText(org.telegram.messenger.gd.a0("SharingLiveLocationTitle", null, 2131745197, org.telegram.messenger.gd.G(org.telegram.messenger.qd.g(), "Chats", new Object[0])));
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.s7) f1Var.a).setDialog(org.telegram.ui.Components.jt0.K0(i7 - 1));
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.xw0 xw0Var = (org.telegram.ui.Components.xw0) f1Var.a;
                org.telegram.ui.Components.yw0 yw0Var = (org.telegram.ui.Components.yw0) obj;
                ArrayList arrayList4 = yw0Var.x;
                String str = arrayList4 == null ? null : ((org.telegram.messenger.ni) arrayList4.get(i7)).a;
                int direction = yw0Var.getDirection();
                xw0Var.a = str;
                if (str == null || !str.startsWith("animated_")) {
                    xw0Var.setImageDrawable(org.telegram.messenger.j6.f(str));
                } else {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable6 = xw0Var.b;
                        if (drawable6 instanceof org.telegram.ui.Components.o5) {
                            if (((org.telegram.ui.Components.o5) drawable6).h() != parseLong) {
                            }
                        }
                        drawable = null;
                        try {
                            xw0Var.setImageDrawable(org.telegram.ui.Components.o5.m(org.telegram.messenger.j10.t0, parseLong, null, xw0Var.f.d()));
                        } catch (Exception unused) {
                            xw0Var.setImageDrawable(drawable);
                            if (xw0Var.d == direction) {
                                return;
                            }
                        }
                    } catch (Exception unused2) {
                        drawable = null;
                    }
                }
                if (xw0Var.d == direction) {
                    xw0Var.d = direction;
                    xw0Var.requestLayout();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.d71 d71Var = (org.telegram.ui.Components.d71) f1Var.a;
                org.telegram.ui.Components.f71 f71Var = (org.telegram.ui.Components.f71) obj2;
                org.telegram.ui.Components.c71 c71Var = (org.telegram.ui.Components.c71) f71Var.h.get(i7);
                d71Var.a = c71Var;
                d71Var.setContentDescription(c71Var.b);
                d71Var.setAlpha(1.0f);
                d71Var.requestLayout();
                d71Var.setReordering(f71Var.n0 && (e71Var = f71Var.E) != null && e71Var.h(i7));
                break;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i43 = dataAutoDownloadActivity.f;
                org.telegram.messenger.z5 z5Var2 = dataAutoDownloadActivity.H;
                int i44 = f1Var.f;
                View view4 = f1Var.a;
                if (i44 == 0) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view4;
                    i11 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i7 == i11) {
                        s8Var2.setDrawCheckRipple(true);
                        s8Var2.f(org.telegram.messenger.gd.M0(2131753828, null), z5Var2.g, false);
                        s8Var2.setTag(Integer.valueOf(z5Var2.g ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6));
                        org.telegram.ui.ActionBar.u6.h(z5Var2.g ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6, s8Var2, null);
                        break;
                    }
                } else if (i44 == 2) {
                    org.telegram.ui.Cells.o4 o4Var2 = (org.telegram.ui.Cells.o4) view4;
                    if (i7 == dataAutoDownloadActivity.r) {
                        o4Var2.setText(org.telegram.messenger.gd.M0(2131753837, null));
                        break;
                    } else if (i7 == dataAutoDownloadActivity.w) {
                        o4Var2.setText(org.telegram.messenger.gd.M0(2131753806, null));
                        break;
                    }
                } else if (i44 == 3) {
                    dataAutoDownloadActivity.r0((org.telegram.ui.Components.eu0) view4);
                    break;
                } else if (i44 == 4) {
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view4;
                    j5Var.setDrawLine(true);
                    i12 = dataAutoDownloadActivity.photosRow;
                    if (i7 == i12) {
                        M0 = org.telegram.messenger.gd.M0(2131753815, null);
                        i15 = 1;
                    } else {
                        i13 = dataAutoDownloadActivity.videosRow;
                        if (i7 == i13) {
                            M0 = org.telegram.messenger.gd.M0(2131753804, null);
                            i15 = 4;
                        } else {
                            i14 = dataAutoDownloadActivity.storiesRow;
                            if (i7 == i14) {
                                String M03 = org.telegram.messenger.gd.M0(2131753807, null);
                                j5Var.setDrawLine(false);
                                M0 = M03;
                                i15 = -1;
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131753836, null);
                                i15 = 8;
                            }
                        }
                    }
                    if (i43 == 0) {
                        i23 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.a6.q(i23).n();
                    } else if (i43 == 1) {
                        i17 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.a6.q(i17).p();
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.a6.q(i16).o();
                    }
                    long j3 = o4.b[org.telegram.messenger.a6.x(i15)];
                    StringBuilder sb3 = new StringBuilder();
                    i18 = dataAutoDownloadActivity.storiesRow;
                    if (i7 != i18) {
                        i19 = 0;
                        int i45 = 0;
                        while (true) {
                            int[] iArr = o4.a;
                            if (i45 < iArr.length) {
                                if ((iArr[i45] & i15) != 0) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    if (i45 == 0) {
                                        sb3.append(org.telegram.messenger.gd.M0(2131753839, null));
                                    } else if (i45 == 1) {
                                        sb3.append(org.telegram.messenger.gd.M0(2131753812, null));
                                    } else if (i45 == 2) {
                                        sb3.append(org.telegram.messenger.gd.M0(2131753833, null));
                                    } else if (i45 == 3) {
                                        sb3.append(org.telegram.messenger.gd.M0(2131753840, null));
                                    }
                                    i19++;
                                }
                                i45++;
                            } else {
                                if (i19 == 4) {
                                    sb3.setLength(0);
                                    i21 = dataAutoDownloadActivity.photosRow;
                                    if (i7 == i21) {
                                        sb3.append(org.telegram.messenger.gd.M0(2131753824, null));
                                    } else {
                                        sb3.append(org.telegram.messenger.gd.a0("AutoDownloadUpToOnAllChats", null, 2131753805, org.telegram.messenger.g0.i0(j3, false, false)));
                                    }
                                } else if (i19 == 0) {
                                    sb3.append(org.telegram.messenger.gd.M0(2131753826, null));
                                } else {
                                    i20 = dataAutoDownloadActivity.photosRow;
                                    sb2 = i7 == i20 ? new StringBuilder(org.telegram.messenger.gd.a0("AutoDownloadOnFor", null, 2131753823, sb3.toString())) : new StringBuilder(org.telegram.messenger.gd.a0("AutoDownloadOnUpToFor", null, 2131753818, org.telegram.messenger.g0.i0(j3, false, false), sb3.toString()));
                                }
                                sb2 = sb3;
                            }
                        }
                    } else if (o4.e) {
                        sb2 = new StringBuilder(org.telegram.messenger.gd.a0("AutoDownloadOn", null, 2131753825, sb3.toString()));
                        i19 = 1;
                    } else {
                        sb2 = new StringBuilder(org.telegram.messenger.gd.a0("AutoDownloadOff", null, 2131753826, sb3.toString()));
                        i19 = 0;
                    }
                    if (dataAutoDownloadActivity.h) {
                        j5Var.setChecked(i19 != 0);
                    }
                    boolean z14 = i19 != 0;
                    i22 = dataAutoDownloadActivity.storiesRow;
                    j5Var.b(M0, sb2, 0, z14, 0, true, i7 != i22, false);
                    break;
                } else if (i44 == 5) {
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view4;
                    if (i7 == dataAutoDownloadActivity.x) {
                        a9Var2.setText(org.telegram.messenger.gd.M0(2131753841, null));
                        a9Var2.setFixedSize(0);
                        a9Var2.setImportantForAccessibility(1);
                        break;
                    } else if (i7 == dataAutoDownloadActivity.n) {
                        if (dataAutoDownloadActivity.r == -1) {
                            if (i43 == 0) {
                                a9Var2.setText(org.telegram.messenger.gd.M0(2131753821, null));
                            } else if (i43 == 1) {
                                a9Var2.setText(org.telegram.messenger.gd.M0(2131753816, null));
                            } else if (i43 == 2) {
                                a9Var2.setText(org.telegram.messenger.gd.M0(2131753819, null));
                            }
                            a9Var2.setImportantForAccessibility(1);
                            break;
                        } else {
                            a9Var2.setText(null);
                            a9Var2.setFixedSize(12);
                            a9Var2.setImportantForAccessibility(4);
                            break;
                        }
                    }
                }
                break;
            case 9:
                G(f1Var, i7);
                break;
            case 10:
                ge0 ge0Var = (ge0) obj2;
                int i46 = f1Var.f;
                View view5 = f1Var.a;
                if (i46 == 0) {
                    org.telegram.ui.Cells.o4 o4Var3 = (org.telegram.ui.Cells.o4) view5;
                    if (i7 == 0) {
                        o4Var3.setText(org.telegram.messenger.gd.M0(2131754268, null));
                        break;
                    }
                } else if (i46 == 1) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view5;
                    if (i7 == ge0Var.c) {
                        z8Var.b(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131754466, null), org.telegram.messenger.gd.M0(2131754465, null), true);
                        break;
                    } else if (i7 == ge0Var.d) {
                        z8Var.b(R.drawable.msg_permissions, org.telegram.messenger.gd.M0(2131745326, null), org.telegram.messenger.gd.M0(2131745325, null), true);
                        break;
                    } else if (i7 == ge0Var.e) {
                        z8Var.b(R.drawable.msg_clearcache, org.telegram.messenger.gd.M0(2131752087, null), org.telegram.messenger.gd.M0(2131752083, null), true);
                        break;
                    } else if (i7 == ge0Var.f) {
                        z8Var.b(R.drawable.msg_newphone, org.telegram.messenger.gd.M0(2131752526, null), org.telegram.messenger.gd.M0(2131752525, null), true);
                        break;
                    } else if (i7 == ge0Var.h) {
                        z8Var.b(R.drawable.msg_help, org.telegram.messenger.gd.M0(2131751772, null), org.telegram.messenger.gd.M0(2131751771, null), false);
                        break;
                    }
                } else if (i46 == 3) {
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view5;
                    if (i7 == ge0Var.r) {
                        org.telegram.ui.ActionBar.u6.U(x9Var2.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                        x9Var2.b(org.telegram.messenger.gd.M0(2131748549, null), false);
                        break;
                    }
                } else if (i46 == 4) {
                    org.telegram.ui.Cells.a9 a9Var3 = (org.telegram.ui.Cells.a9) view5;
                    if (i7 == ge0Var.s) {
                        a9Var3.setText(org.telegram.messenger.gd.M0(2131748550, null));
                        break;
                    }
                }
                break;
            case 11:
                H(f1Var, i7);
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj2;
                int i47 = f1Var.f;
                View view6 = f1Var.a;
                if (i47 == 0) {
                    org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view6;
                    i24 = passcodeActivity.fingerprintRow;
                    if (i7 == i24) {
                        s8Var3.f(org.telegram.messenger.gd.M0(2131743636, null), org.telegram.messenger.bz.D, false);
                        break;
                    } else if (i7 == passcodeActivity.O) {
                        s8Var3.f(org.telegram.messenger.gd.M0(2131745646, null), org.telegram.messenger.bz.A, false);
                        break;
                    } else if (i7 == passcodeActivity.L) {
                        String M04 = org.telegram.messenger.gd.M0(2131742928, null);
                        i26 = ((org.telegram.ui.ActionBar.h2) passcodeActivity).currentAccount;
                        if (org.telegram.ui.Wallet.u0.D(i26).f()) {
                            i27 = ((org.telegram.ui.ActionBar.h2) passcodeActivity).currentAccount;
                            break;
                        }
                        r9 = false;
                        s8Var3.f(M04, r9, false);
                        break;
                    } else if (i7 == passcodeActivity.K) {
                        String M05 = org.telegram.messenger.gd.M0(2131742927, null);
                        i25 = ((org.telegram.ui.ActionBar.h2) passcodeActivity).currentAccount;
                        s8Var3.f(M05, org.telegram.ui.Wallet.u0.D(i25).S(), false);
                        break;
                    }
                } else if (i47 == 1) {
                    org.telegram.ui.Cells.x9 x9Var3 = (org.telegram.ui.Cells.x9) view6;
                    i28 = passcodeActivity.changePasscodeRow;
                    if (i7 == i28) {
                        x9Var3.b(org.telegram.messenger.gd.M0(2131752533, null), true);
                        if (org.telegram.messenger.bz.s.isEmpty()) {
                            int i48 = org.telegram.ui.ActionBar.n6.E6;
                            x9Var3.setTag(Integer.valueOf(i48));
                            org.telegram.ui.ActionBar.u6.U(x9Var3.getTextView(), i48, null);
                            break;
                        } else {
                            int i49 = org.telegram.ui.ActionBar.n6.G6;
                            x9Var3.setTag(Integer.valueOf(i49));
                            org.telegram.ui.ActionBar.u6.U(x9Var3.getTextView(), i49, null);
                            break;
                        }
                    } else {
                        i29 = passcodeActivity.autoLockRow;
                        if (i7 == i29) {
                            int i50 = org.telegram.messenger.bz.y;
                            x9Var3.c(org.telegram.messenger.gd.M0(2131753798, null), i50 == 0 ? org.telegram.messenger.gd.a0("AutoLockDisabled", null, 2131753797, new Object[0]) : i50 < 3600 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G(i50 / 60, "Minutes", new Object[0])) : i50 < 86400 ? org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G((int) Math.ceil((i50 / 60.0f) / 60.0f), "Hours", new Object[0])) : org.telegram.messenger.gd.a0("AutoLockInTime", null, 2131753796, org.telegram.messenger.gd.G((int) Math.ceil(((i50 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                            int i51 = org.telegram.ui.ActionBar.n6.G6;
                            x9Var3.setTag(Integer.valueOf(i51));
                            org.telegram.ui.ActionBar.u6.U(x9Var3.getTextView(), i51, null);
                            break;
                        } else {
                            i30 = passcodeActivity.disablePasscodeRow;
                            if (i7 == i30) {
                                x9Var3.b(org.telegram.messenger.gd.M0(2131751422, null), false);
                                int i52 = org.telegram.ui.ActionBar.n6.q7;
                                x9Var3.setTag(Integer.valueOf(i52));
                                org.telegram.ui.ActionBar.u6.U(x9Var3.getTextView(), i52, null);
                                break;
                            }
                        }
                    }
                } else if (i47 == 2) {
                    org.telegram.ui.Cells.a9 a9Var4 = (org.telegram.ui.Cells.a9) view6;
                    if (i7 == passcodeActivity.H) {
                        a9Var4.setText(org.telegram.messenger.gd.M0(2131747462, null));
                        a9Var4.setBackground(null);
                        a9Var4.getTextView().setGravity(1);
                        break;
                    } else if (i7 == passcodeActivity.I) {
                        a9Var4.setText(org.telegram.messenger.gd.M0(2131753795, null));
                        a9Var4.getTextView().setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.M) {
                        a9Var4.setText(org.telegram.messenger.gd.M0(2131742839, null));
                        a9Var4.getTextView().setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.P) {
                        a9Var4.setText(org.telegram.messenger.gd.M0(2131745647, null));
                        a9Var4.getTextView().setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                        break;
                    }
                } else if (i47 == 3) {
                    org.telegram.ui.Cells.o4 o4Var4 = (org.telegram.ui.Cells.o4) view6;
                    o4Var4.setHeight(46);
                    if (i7 == passcodeActivity.N) {
                        o4Var4.setText(org.telegram.messenger.gd.M0(2131745648, null));
                        break;
                    } else if (i7 == passcodeActivity.J) {
                        o4Var4.setText(org.telegram.messenger.gd.M0(2131742840, null));
                        break;
                    }
                } else if (i47 == 4) {
                    oi0 oi0Var = (oi0) view6;
                    oi0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    oi0Var.a.d();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) f1Var.a;
                qm0 qm0Var = (qm0) obj2;
                x5Var.setAlbumsCount(qm0Var.f);
                while (true) {
                    int i53 = qm0Var.f;
                    if (i32 >= i53) {
                        x5Var.requestLayout();
                        break;
                    } else {
                        int i54 = (i53 * i7) + i32;
                        if (i54 < qm0Var.d.size()) {
                            x5Var.a(i32, (org.telegram.messenger.ue) qm0Var.d.get(i54));
                        } else {
                            x5Var.a(i32, null);
                        }
                        i32++;
                    }
                }
            case 14:
                I(f1Var, i7);
                break;
            case 15:
                J(f1Var, i7);
                break;
            case 16:
                K(f1Var, i7);
                break;
            case 17:
                L(f1Var, i7);
                break;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj2;
                if (f1Var.f == 0) {
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.a;
                    u2Var.t2 = i7 != arrayList5.size() - 1;
                    u2Var.setDialog((org.telegram.ui.Cells.p2) arrayList5.get(i7));
                    break;
                }
                break;
            default:
                View view7 = f1Var.a;
                pg.a aVar = (pg.a) ((pg.i) obj2).F.get(i7);
                int i55 = aVar.b;
                org.telegram.ui.Components.p6 p6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = p1.g.c(i55);
                if (c10 == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) view7;
                    o1Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false));
                    o1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    org.telegram.ui.Cells.o4 o4Var5 = (org.telegram.ui.Cells.o4) view7;
                    o4Var5.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.L6, false));
                    o4Var5.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    pg.h hVar = (pg.h) view7;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) p6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = p6Var;
                    hVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public void v(v4.f1 f1Var, int i7, List list) {
        int i10;
        boolean contains;
        switch (this.c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i11 = f1Var.f;
                View view = f1Var.a;
                if (i11 == 5 && !list.isEmpty()) {
                    rx0 rx0Var = (rx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i7 - proxyListActivity.n))) != rx0Var.h) {
                        rx0Var.h = contains;
                        rx0Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        rx0Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (f1Var.f != 3 || !list.contains(0)) {
                    t(f1Var, i7);
                    break;
                } else {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    i10 = proxyListActivity.useProxyRow;
                    if (i7 != i10) {
                        if (i7 == proxyListActivity.w) {
                            s8Var.setChecked(org.telegram.messenger.bz.a1);
                            break;
                        }
                    } else {
                        s8Var.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.v(f1Var, i7, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.ui.Components.kn] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        View o4Var;
        View view;
        org.telegram.ui.Cells.t5 t5Var;
        FrameLayout frameLayout2;
        View view2;
        View view3;
        View o4Var2;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        org.telegram.ui.ActionBar.i6 i6Var5;
        View s8Var;
        ViewGroup viewGroup2;
        View z6Var;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        int i10 = this.c;
        int i11 = 9;
        int i12 = 4;
        Object obj = this.e;
        int i13 = 3;
        final int i14 = 0;
        final int i15 = 2;
        final int i16 = 1;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.o4(context);
                } else if (i7 == 1) {
                    frameLayout = new org.telegram.ui.Cells.s8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                    x9Var.setCanDisable(true);
                    frameLayout = x9Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.a9(context);
                }
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new org.telegram.ui.Components.kj0(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj;
                boolean z10 = rnVar.n;
                org.telegram.ui.ActionBar.i6 i6Var6 = rnVar.a;
                switch (i7) {
                    case 0:
                        o4Var = new org.telegram.ui.Cells.o4((Context) obj2, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, rnVar.a);
                        break;
                    case 1:
                        View z6Var2 = new org.telegram.ui.Cells.z6(context2, (org.telegram.ui.Cells.c0) null);
                        new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var6)), org.telegram.ui.ActionBar.n6.Y0(context2, R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7)).x = true;
                        o4Var = z6Var2;
                        break;
                    case 2:
                        o4Var = new org.telegram.ui.Cells.a9(context2, i6Var6);
                        break;
                    case 3:
                        o4Var = new org.telegram.ui.Cells.n8(context2, i6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.mn mnVar = new org.telegram.ui.Components.mn(this, (Context) obj2, rnVar.J ? 1 : 0, rnVar.a, i7);
                        if (i7 == 11 && !z10) {
                            mnVar.setTextRight(98);
                            mnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i14) {
                                        case 0:
                                            rn.T((rn) this.b.e, -2);
                                            break;
                                        case 1:
                                            rn.T((rn) this.b.e, -3);
                                            break;
                                        default:
                                            ((rn) this.b.e).c0(view4, (org.telegram.ui.Cells.b6) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        mnVar.d();
                        mnVar.setIconsColor(org.telegram.ui.ActionBar.n6.o7);
                        mnVar.c(new org.telegram.ui.Components.nn(this, mnVar, i7));
                        o4Var = mnVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.pn pnVar = new org.telegram.ui.Components.pn(this, (Context) obj2, rnVar.J ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                            public final /* synthetic */ org.telegram.ui.l4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                switch (i15) {
                                    case 0:
                                        rn.T((rn) this.b.e, -2);
                                        break;
                                    case 1:
                                        rn.T((rn) this.b.e, -3);
                                        break;
                                    default:
                                        ((rn) this.b.e).c0(view4, (org.telegram.ui.Cells.b6) view4.getParent(), true);
                                        break;
                                }
                            }
                        }, rnVar.a);
                        if (!z10) {
                            pnVar.setTextRight(org.telegram.messenger.ks.W1);
                            pnVar.b().setOnClickListener(new org.telegram.ui.Components.y7(i12, this, pnVar));
                        }
                        int i17 = org.telegram.ui.ActionBar.n6.o7;
                        pnVar.setIconsColor(i17);
                        org.telegram.ui.Components.mp mpVar = pnVar.r;
                        if (mpVar != null) {
                            mpVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                            float f10 = pnVar.a.e;
                            if (checkBoxBase.w != f10) {
                                checkBoxBase.w = f10;
                                checkBoxBase.b();
                            }
                        }
                        pnVar.getCheckBox().b(-1, i17, org.telegram.ui.ActionBar.n6.k7);
                        pnVar.c(new bi.v(11, this, pnVar));
                        pnVar.setShowNextButton(true);
                        EditTextBoldCursor textView = pnVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(i15, this, pnVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.ln(pnVar, i14));
                        o4Var = pnVar;
                        break;
                    case 6:
                        o4Var = new org.telegram.ui.Cells.s8(context2, i6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.on onVar = new org.telegram.ui.Components.on(this, context2, rnVar.J ? 1 : 0);
                        onVar.d();
                        if (!z10) {
                            onVar.setTextRight(98);
                            onVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i16) {
                                        case 0:
                                            rn.T((rn) this.b.e, -2);
                                            break;
                                        case 1:
                                            rn.T((rn) this.b.e, -3);
                                            break;
                                        default:
                                            ((rn) this.b.e).c0(view4, (org.telegram.ui.Cells.b6) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        onVar.setIconsColor(org.telegram.ui.ActionBar.n6.o7);
                        onVar.c(new bi.v(10, this, onVar));
                        o4Var = onVar;
                        break;
                    case 8:
                        View jnVar = new org.telegram.ui.Components.jn(context2, 0);
                        jnVar.setTag(-33024);
                        view = jnVar;
                        o4Var = view;
                        break;
                    case 9:
                        View i3Var = new bi.i3(16, context2, this);
                        i3Var.setTag(-33024);
                        view = i3Var;
                        o4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context2, i6Var6);
                        z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        o4Var = z5Var;
                        break;
                }
                return i5.c.q(o4Var, o4Var, -1, -2);
            case 2:
                return new org.telegram.ui.Components.kj0(new org.telegram.ui.Components.nz((org.telegram.ui.Components.pz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(0, (Context) obj2, null);
                q2Var.setBackground(null);
                q2Var.setLayoutParams(new v4.q0(-1, -2));
                return new org.telegram.ui.Components.kj0(q2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.i6 i6Var7 = ((org.telegram.ui.Components.de0) obj).J0;
                    org.telegram.ui.Cells.u5 u5Var = new org.telegram.ui.Cells.u5(context3);
                    u5Var.e = new j6.o(u5Var, 23);
                    TextView textView2 = new TextView(context3);
                    u5Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    u5Var.addView(textView2, c8.ma.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    u5Var.b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.qg, i6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    u5Var.addView(textView3, c8.ma.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context3);
                    Paint paint = new Paint();
                    sd0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    sd0Var.b = paint2;
                    sd0Var.c = org.telegram.messenger.g0.L(16.0f);
                    sd0Var.d = 0;
                    sd0Var.e = 0.0f;
                    sd0Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    u5Var.c = sd0Var;
                    u5Var.addView(sd0Var, c8.ma.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    u5Var.setSeekBarDelegate(new org.telegram.ui.Components.iy(this, 10));
                    t5Var = u5Var;
                } else {
                    org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context3);
                    t5Var2.setOnClickListener(new org.telegram.ui.Components.h70(this, 5));
                    t5Var = t5Var2;
                }
                return new org.telegram.ui.Components.kj0(t5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                if (i7 != 0) {
                    FrameLayout p2Var = new bi.p2(context4, 21);
                    p2Var.setWillNotDraw(false);
                    jt0Var.p1 = new TextView(context4);
                    org.telegram.ui.ActionBar.u6.U(jt0Var.p1, org.telegram.ui.ActionBar.n6.J5, jt0Var.J0);
                    jt0Var.p1.setTextSize(1, 14.0f);
                    jt0Var.p1.setGravity(17);
                    jt0Var.p1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    p2Var.addView(jt0Var.p1, c8.ma.c(40.0f, -1));
                    frameLayout2 = p2Var;
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.s7(54, context4, jt0Var.J0, false);
                }
                return new org.telegram.ui.Components.kj0(frameLayout2);
            case 6:
                return new org.telegram.ui.Components.kj0(new org.telegram.ui.Components.xw0((org.telegram.ui.Components.yw0) obj, ((org.telegram.ui.Components.yw0) obj2).getContext()));
            case 7:
                return new org.telegram.ui.Components.kj0(new org.telegram.ui.Components.d71((org.telegram.ui.Components.f71) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context5);
                    s8Var2.d(org.telegram.ui.ActionBar.n6.g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
                    s8Var2.setTypeface(org.telegram.messenger.g0.o());
                    s8Var2.setHeight(56);
                    view2 = s8Var2;
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.Cells.z6(context5, (org.telegram.ui.Cells.c0) null);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.o4(context5);
                } else if (i7 != 3) {
                    view2 = i7 != 4 ? new org.telegram.ui.Cells.a9(context5) : new org.telegram.ui.Cells.j5(context5);
                } else {
                    org.telegram.ui.Components.eu0 eu0Var = new org.telegram.ui.Components.eu0(context5, null);
                    eu0Var.setCallback(new zr(this, i13));
                    view2 = eu0Var;
                }
                return i5.c.q(view2, view2, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                View n8Var = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new org.telegram.ui.Cells.n8(context6) : new org.telegram.ui.Cells.j5(context6) : new org.telegram.ui.Cells.a9(context6) : new org.telegram.ui.Cells.s8(context6) : new org.telegram.ui.Cells.o4(context6, 22) : new org.telegram.ui.Cells.x9(context6) : new org.telegram.ui.Cells.z6(context6, (org.telegram.ui.Cells.c0) null);
                return i5.c.q(n8Var, n8Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 == 0) {
                    View o4Var3 = new org.telegram.ui.Cells.o4(context7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var3, null);
                    view3 = o4Var3;
                } else if (i7 == 1) {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context7);
                    z8Var.setMultilineDetail(true);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z8Var, null);
                    view3 = z8Var;
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.Cells.z6(context7, (org.telegram.ui.Cells.c0) null);
                } else if (i7 != 3) {
                    view3 = new org.telegram.ui.Cells.a9(context7);
                } else {
                    View x9Var2 = new org.telegram.ui.Cells.x9(context7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, x9Var2, null);
                    view3 = x9Var2;
                }
                return i5.c.q(view3, view3, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    i6Var = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.o4(context8, i6Var);
                } else if (i7 == 1) {
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.s8(context8, i6Var2);
                } else if (i7 == 2) {
                    o4Var2 = new org.telegram.ui.Cells.z8(context8);
                } else if (i7 == 3) {
                    i6Var3 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.j5((Context) obj2, 21, 64, true, i6Var3);
                } else if (i7 == 4) {
                    o4Var2 = new org.telegram.ui.Cells.z6(context8, (org.telegram.ui.Cells.c0) null);
                } else if (i7 != 5) {
                    i6Var5 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.a9(context8, i6Var5);
                } else {
                    i6Var4 = ((org.telegram.ui.ActionBar.h2) notificationsSettingsActivity).resourceProvider;
                    o4Var2 = new org.telegram.ui.Cells.x9(0, context8, i6Var4);
                }
                return new org.telegram.ui.Components.kj0(o4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 == 0) {
                    s8Var = new org.telegram.ui.Cells.s8(context9);
                } else if (i7 == 1) {
                    s8Var = new org.telegram.ui.Cells.x9(context9);
                } else if (i7 == 3) {
                    s8Var = new org.telegram.ui.Cells.o4(context9);
                } else if (i7 != 4) {
                    s8Var = new org.telegram.ui.Cells.a9(context9);
                } else {
                    s8Var = new oi0(context9);
                    s8Var.setTag(-33024);
                }
                return new org.telegram.ui.Components.kj0(s8Var);
            case 13:
                Context context10 = (Context) obj2;
                org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context10);
                x5Var.e = new Paint();
                x5Var.b = new org.telegram.messenger.ue[4];
                x5Var.a = new org.telegram.ui.Cells.v5[4];
                while (i14 < 4) {
                    x5Var.a[i14] = new org.telegram.ui.Cells.v5(x5Var, context10);
                    x5Var.addView(x5Var.a[i14]);
                    x5Var.a[i14].setVisibility(4);
                    x5Var.a[i14].setTag(Integer.valueOf(i14));
                    x5Var.a[i14].setOnClickListener(new org.telegram.ui.Cells.a(x5Var, i11));
                    i14++;
                }
                x5Var.setDelegate(new qi0(this, i16));
                return new org.telegram.ui.Components.kj0(x5Var);
            case 14:
                cn0 cn0Var = (cn0) obj;
                boolean z11 = cn0Var.s0;
                Context context11 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context11, null);
                    s5Var.setDelegate(new an0(this));
                    s5Var.getCheckFrame().setVisibility(cn0Var.U == 0 ? 0 : 8);
                    viewGroup2 = s5Var;
                } else if (i7 == 1) {
                    ViewGroup frameLayout5 = new FrameLayout(context11);
                    frameLayout5.setLayoutParams(new v4.q0(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout5.addView(radialProgressView, c8.ma.c(-1.0f, -1));
                    viewGroup2 = frameLayout5;
                } else if (i7 == 2) {
                    viewGroup2 = new org.telegram.ui.Cells.i7(1, context11, null);
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.f3 f3Var = new org.telegram.ui.Cells.f3(context11, null);
                    f3Var.setForceDarkTheme(z11);
                    viewGroup2 = f3Var;
                } else {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(23, context11, true);
                    n8Var2.setLayoutParams(new v4.q0(-1, -2));
                    if (z11) {
                        org.telegram.ui.ActionBar.u6.X(n8Var2.a, cn0Var.w0, null);
                        org.telegram.ui.ActionBar.u6.s(n8Var2.e, org.telegram.ui.ActionBar.n6.ih, null, PorterDuff.Mode.MULTIPLY);
                    }
                    viewGroup2 = n8Var2;
                }
                return new org.telegram.ui.Components.kj0(viewGroup2);
            case 15:
                Context context12 = (Context) obj2;
                org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context12);
                new Paint();
                y5Var.setWillNotDraw(false);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context12);
                y5Var.a = q9Var;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                y5Var.addView(q9Var, c8.ma.c(-1.0f, -1));
                FrameLayout frameLayout6 = new FrameLayout(context12);
                y5Var.b = frameLayout6;
                y5Var.addView(frameLayout6, c8.ma.e(42, 42, 53));
                di.n4 n4Var = new di.n4(context12);
                n4Var.d = new Path();
                n4Var.e = new float[8];
                n4Var.b = new RectF();
                n4Var.c = new Paint(1);
                y5Var.e = n4Var;
                n4Var.setWillNotDraw(false);
                n4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                y5Var.addView(n4Var, c8.ma.e(-1, 16, 83));
                n4Var.addView(org.telegram.messenger.n10.e(context12, R.drawable.ic_video), c8.ma.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                y5Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                n4Var.addView(textView4, c8.ma.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.mp mpVar2 = new org.telegram.ui.Components.mp(24, context12, null);
                y5Var.c = mpVar2;
                mpVar2.setDrawBackgroundAsArc(11);
                mpVar2.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
                y5Var.addView(mpVar2, c8.ma.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                mpVar2.setVisibility(0);
                y5Var.setFocusable(true);
                frameLayout6.setOnClickListener(new j40(this, 21));
                return new org.telegram.ui.Components.kj0(y5Var);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 == 0) {
                    z6Var = new org.telegram.ui.Cells.z6(context13, (org.telegram.ui.Cells.c0) null);
                } else if (i7 == 1) {
                    z6Var = new org.telegram.ui.Cells.x9(context13);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z6Var, null);
                } else if (i7 == 2) {
                    z6Var = new org.telegram.ui.Cells.o4(context13);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z6Var, null);
                } else if (i7 == 3) {
                    z6Var = new org.telegram.ui.Cells.s8(context13);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z6Var, null);
                } else if (i7 == 4) {
                    z6Var = new org.telegram.ui.Cells.a9(context13);
                } else if (i7 != 6) {
                    z6Var = new rx0((ProxyListActivity) obj, context13);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z6Var, null);
                } else {
                    z6Var = new org.telegram.ui.Components.eu0(context13, null);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, z6Var, null);
                }
                return i5.c.q(z6Var, z6Var, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    frameLayout3 = new org.telegram.ui.Cells.o4(context14);
                } else if (i7 == 1) {
                    frameLayout3 = new org.telegram.ui.Cells.s8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context14);
                    x9Var3.setCanDisable(true);
                    frameLayout3 = x9Var3;
                } else {
                    frameLayout3 = new org.telegram.ui.Cells.a9(context14);
                }
                frameLayout3.setLayoutParams(new v4.q0(-1, -2));
                return new org.telegram.ui.Components.kj0(frameLayout3);
            case 18:
                Context context15 = (Context) obj2;
                View u2Var = i7 == 0 ? new org.telegram.ui.Cells.u2(context15, false) : new org.telegram.ui.Cells.u4(context15);
                u2Var.setLayoutParams(new v4.q0(-1, -2));
                return new org.telegram.ui.Components.kj0(u2Var);
            default:
                Context context16 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 == 1) {
                    frameLayout4 = new org.telegram.ui.Cells.o4(context16);
                } else if (c10 != 2) {
                    frameLayout4 = new org.telegram.ui.ActionBar.o1(context16, null);
                } else {
                    pg.h hVar = new pg.h(context16);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context16);
                    hVar.a = ym0Var;
                    ym0Var.setReportChanges(true);
                    ym0Var.setDelegate(new org.telegram.ui.Components.hn(hVar, i11));
                    ym0Var.setImportantForAccessibility(2);
                    hVar.addView(ym0Var, c8.ma.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout4 = hVar;
                }
                frameLayout4.setLayoutParams(new v4.q0(-1, -2));
                return new org.telegram.ui.Components.kj0(frameLayout4);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        int i7;
        int i10 = this.c;
        Object obj = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj;
                sh.e eVar = rnVar.n1;
                boolean z10 = rnVar.n;
                int i11 = f1Var.f;
                View view = f1Var.a;
                if (i11 != 4) {
                    if (i11 != 11) {
                        if (i11 != 5) {
                            if (i11 == 7) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                                b6Var.setTag(1);
                                CharSequence charSequence = rnVar.Q;
                                b6Var.o(charSequence != null ? charSequence : "", org.telegram.messenger.gd.M0(2131754472, null), false);
                                b6Var.setTag(null);
                                if (!z10) {
                                    b6Var.e.b(eVar.b(-3), false);
                                }
                                org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                                break;
                            }
                        } else {
                            int b10 = f1Var.b();
                            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
                            b6Var2.setTag(1);
                            b6Var2.a.a(rnVar.c0, false);
                            int i12 = b10 - rnVar.u0;
                            b6Var2.o(rnVar.L[i12], org.telegram.messenger.gd.M0(z10 ? 2131743820 : 2131747581, null), true);
                            b6Var2.setTag(null);
                            if (rnVar.l0 == b10) {
                                EditTextBoldCursor textView = b6Var2.getTextView();
                                textView.requestFocus();
                                org.telegram.messenger.g0.I3(textView);
                                rnVar.l0 = -1;
                            }
                            if (!z10) {
                                b6Var2.e.b(eVar.b(i12), false);
                            }
                            org.telegram.ui.Components.rn.Q(rnVar, view, b10);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
                        b6Var3.setTag(1);
                        CharSequence charSequence2 = rnVar.P;
                        b6Var3.o(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.gd.M0(2131746254, null), false);
                        b6Var3.setTag(null);
                        b6Var3.e.b(eVar.b(-2), false);
                        org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.b6 b6Var4 = (org.telegram.ui.Cells.b6) view;
                    b6Var4.setTag(1);
                    CharSequence charSequence3 = rnVar.O;
                    b6Var4.o(charSequence3 != null ? charSequence3 : "", org.telegram.messenger.gd.M0(z10 ? 2131743818 : 2131746253, null), true);
                    b6Var4.setTag(null);
                    org.telegram.ui.Components.rn.Q(rnVar, view, f1Var.b());
                    break;
                }
                break;
            case 9:
                if (f1Var.f == 3) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) f1Var.a;
                    int b11 = f1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 != dataSettingsActivity.F) {
                        if (b11 != dataSettingsActivity.E) {
                            if (b11 != dataSettingsActivity.G) {
                                if (b11 != dataSettingsActivity.H) {
                                    if (b11 != dataSettingsActivity.K) {
                                        if (b11 == dataSettingsActivity.L) {
                                            int i13 = org.telegram.messenger.bz.a;
                                            s8Var.setChecked(org.telegram.messenger.pc.e(1024));
                                            break;
                                        }
                                    } else {
                                        int i14 = org.telegram.messenger.bz.a;
                                        s8Var.setChecked(org.telegram.messenger.pc.e(2048));
                                        break;
                                    }
                                } else {
                                    s8Var.setChecked(org.telegram.messenger.bz.D0);
                                    break;
                                }
                            } else {
                                s8Var.setChecked(org.telegram.messenger.bz.C0);
                                break;
                            }
                        } else {
                            s8Var.setChecked(org.telegram.messenger.bz.B0);
                            break;
                        }
                    } else {
                        s8Var.setChecked(org.telegram.messenger.bz.E0);
                        break;
                    }
                }
                break;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (f1Var.f == 3) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) f1Var.a;
                    int b12 = f1Var.b();
                    i7 = proxyListActivity.useProxyRow;
                    if (b12 != i7) {
                        if (b12 == proxyListActivity.w) {
                            s8Var2.setChecked(org.telegram.messenger.bz.a1);
                            break;
                        }
                    } else {
                        s8Var2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.i0
    public void z(v4.f1 f1Var) {
        switch (this.c) {
            case 1:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.e;
                int i7 = f1Var.f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) f1Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (rnVar.J) {
                            org.telegram.ui.Components.in inVar = rnVar.y;
                            if (inVar != null) {
                                inVar.f();
                            }
                            rnVar.e0(true);
                        }
                        rnVar.h1 = null;
                        textView.clearFocus();
                        org.telegram.messenger.g0.v1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public l4(pg.i iVar, LaunchActivity launchActivity) {
        this.c = 19;
        this.e = iVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2();
        p2Var.a = org.telegram.messenger.gd.M0(2131743936, null);
        p2Var.b = org.telegram.messenger.gd.M0(2131743928, null);
        p2Var.c = 0;
        p2Var.d = 0;
        p2Var.e = true;
        p2Var.f = false;
        p2Var.g = 0;
        p2Var.h = currentTimeMillis;
        p2Var.i = false;
        p2Var.j = false;
        p2Var.k = 2;
        arrayList.add(p2Var);
        org.telegram.ui.Cells.p2 p2Var2 = new org.telegram.ui.Cells.p2();
        p2Var2.a = org.telegram.messenger.gd.M0(2131743935, null);
        p2Var2.b = org.telegram.messenger.gd.M0(2131743927, null);
        p2Var2.c = 1;
        p2Var2.d = 2;
        p2Var2.e = false;
        p2Var2.f = false;
        p2Var2.g = 0;
        p2Var2.h = currentTimeMillis - 3600;
        p2Var2.i = false;
        p2Var2.j = false;
        p2Var2.k = -1;
        arrayList.add(p2Var2);
        org.telegram.ui.Cells.p2 p2Var3 = new org.telegram.ui.Cells.p2();
        p2Var3.a = org.telegram.messenger.gd.M0(2131743934, null);
        p2Var3.b = org.telegram.messenger.gd.M0(2131743926, null);
        p2Var3.c = 2;
        p2Var3.d = 3;
        p2Var3.e = false;
        p2Var3.f = true;
        p2Var3.g = 0;
        p2Var3.h = currentTimeMillis - 7200;
        p2Var3.i = false;
        p2Var3.j = true;
        p2Var3.k = -1;
        arrayList.add(p2Var3);
        org.telegram.ui.Cells.p2 p2Var4 = new org.telegram.ui.Cells.p2();
        p2Var4.a = org.telegram.messenger.gd.M0(2131743933, null);
        p2Var4.b = org.telegram.messenger.gd.M0(2131743925, null);
        p2Var4.c = 3;
        p2Var4.d = 0;
        p2Var4.e = false;
        p2Var4.f = false;
        p2Var4.g = 2;
        p2Var4.h = currentTimeMillis - 10800;
        p2Var4.i = false;
        p2Var4.j = false;
        p2Var4.k = -1;
        arrayList.add(p2Var4);
        org.telegram.ui.Cells.p2 p2Var5 = new org.telegram.ui.Cells.p2();
        p2Var5.a = org.telegram.messenger.gd.M0(2131743932, null);
        p2Var5.b = org.telegram.messenger.gd.M0(2131743924, null);
        p2Var5.c = 4;
        p2Var5.d = 0;
        p2Var5.e = false;
        p2Var5.f = false;
        p2Var5.g = 1;
        p2Var5.h = currentTimeMillis - 14400;
        p2Var5.i = false;
        p2Var5.j = false;
        p2Var5.k = 2;
        arrayList.add(p2Var5);
        org.telegram.ui.Cells.p2 p2Var6 = new org.telegram.ui.Cells.p2();
        p2Var6.a = org.telegram.messenger.gd.M0(2131743931, null);
        p2Var6.b = org.telegram.messenger.gd.M0(2131743923, null);
        p2Var6.c = 5;
        p2Var6.d = 0;
        p2Var6.e = false;
        p2Var6.f = false;
        p2Var6.g = 0;
        p2Var6.h = currentTimeMillis - 18000;
        p2Var6.i = false;
        p2Var6.j = false;
        p2Var6.k = -1;
        arrayList.add(p2Var6);
        org.telegram.ui.Cells.p2 p2Var7 = new org.telegram.ui.Cells.p2();
        p2Var7.a = org.telegram.messenger.gd.M0(2131743930, null);
        p2Var7.b = org.telegram.messenger.gd.M0(2131743922, null);
        p2Var7.c = 6;
        p2Var7.d = 0;
        p2Var7.e = false;
        p2Var7.f = false;
        p2Var7.g = 0;
        p2Var7.h = currentTimeMillis - 21600;
        p2Var7.i = true;
        p2Var7.j = false;
        p2Var7.k = -1;
        arrayList.add(p2Var7);
        org.telegram.ui.Cells.p2 p2Var8 = new org.telegram.ui.Cells.p2();
        p2Var8.a = org.telegram.messenger.gd.M0(2131743929, null);
        p2Var8.b = org.telegram.messenger.gd.M0(2131743921, null);
        p2Var8.c = 0;
        p2Var8.d = 0;
        p2Var8.e = false;
        p2Var8.f = false;
        p2Var8.g = 0;
        p2Var8.h = currentTimeMillis - 25200;
        p2Var8.i = true;
        p2Var8.j = false;
        p2Var8.k = -1;
        arrayList.add(p2Var8);
    }

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.c = 16;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
