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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n4 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object e;

    public /* synthetic */ n4(int i3, Object obj, Object obj2) {
        this.c = i3;
        this.e = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(u4.d1 d1Var, int i3) {
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
        org.telegram.messenger.y5 y5Var;
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
        int i28 = d1Var.f;
        View view = d1Var.a;
        boolean z16 = true;
        int i29 = 0;
        switch (i28) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                v9Var.setCanDisable(false);
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                i10 = dataSettingsActivity.useLessDataForCallsRow;
                if (i3 != i10) {
                    i11 = dataSettingsActivity.proxyRow;
                    if (i3 != i11) {
                        i12 = dataSettingsActivity.resetDownloadRow;
                        if (i3 != i12) {
                            i13 = dataSettingsActivity.clearDraftsRow;
                            if (i3 == i13) {
                                v9Var.setIcon(0);
                                v9Var.b(org.telegram.messenger.bd.M0(2131746849, null), false);
                                break;
                            }
                        } else {
                            v9Var.setIcon(0);
                            v9Var.setCanDisable(true);
                            org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                            v9Var.b(org.telegram.messenger.bd.M0(2131746121, null), false);
                            break;
                        }
                    } else {
                        v9Var.setIcon(0);
                        v9Var.b(org.telegram.messenger.bd.M0(2131746609, null), false);
                        break;
                    }
                } else {
                    v9Var.setIcon(0);
                    int i30 = org.telegram.messenger.hp.e1().getInt("VoipDataSaving", org.telegram.ui.Components.voip.n1.c());
                    if (i30 == 0) {
                        str = null;
                        M0 = org.telegram.messenger.bd.M0(2131743805, null);
                    } else if (i30 == 1) {
                        str = null;
                        M0 = org.telegram.messenger.bd.M0(2131743804, null);
                    } else if (i30 == 2) {
                        str = null;
                        M0 = org.telegram.messenger.bd.M0(2131743806, null);
                    } else if (i30 != 3) {
                        M0 = null;
                        str = null;
                    } else {
                        str = null;
                        M0 = org.telegram.messenger.bd.M0(2131743803, null);
                    }
                    v9Var.c(org.telegram.messenger.bd.M0(2131743239, str), M0, dataSettingsActivity.V, true);
                    dataSettingsActivity.V = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 != dataSettingsActivity.d) {
                    if (i3 != 0) {
                        if (i3 != dataSettingsActivity.N) {
                            if (i3 != dataSettingsActivity.P) {
                                if (i3 != dataSettingsActivity.y) {
                                    if (i3 != dataSettingsActivity.J) {
                                        if (i3 == dataSettingsActivity.S) {
                                            n4Var.setText(org.telegram.messenger.bd.M0(2131745928, null));
                                            break;
                                        }
                                    } else {
                                        n4Var.setText(org.telegram.messenger.bd.M0(2131753764, null));
                                        break;
                                    }
                                } else {
                                    n4Var.setText(org.telegram.messenger.bd.M0(2131744448, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.bd.M0(2131746619, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131752596, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131751677, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131753767, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i3 != dataSettingsActivity.E) {
                    if (i3 != dataSettingsActivity.F) {
                        if (i3 != dataSettingsActivity.H) {
                            if (i3 != dataSettingsActivity.G) {
                                if (i3 != dataSettingsActivity.K) {
                                    if (i3 == dataSettingsActivity.L) {
                                        String M04 = org.telegram.messenger.bd.M0(2131753763, null);
                                        int i31 = org.telegram.messenger.az.a;
                                        q8Var.f(M04, org.telegram.messenger.lc.e(1024), false);
                                        break;
                                    }
                                } else {
                                    String M05 = org.telegram.messenger.bd.M0(2131753765, null);
                                    int i32 = org.telegram.messenger.az.a;
                                    q8Var.f(M05, org.telegram.messenger.lc.e(2048), true);
                                    break;
                                }
                            } else {
                                q8Var.f("(beta only) Stream All Videos", org.telegram.messenger.az.C0, false);
                                break;
                            }
                        } else {
                            q8Var.f("(beta only) Show MKV as Video", org.telegram.messenger.az.D0, true);
                            break;
                        }
                    }
                } else {
                    q8Var.f(org.telegram.messenger.bd.M0(2131751145, null), org.telegram.messenger.az.B0, dataSettingsActivity.G != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == dataSettingsActivity.I) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131751159, null));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i14 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i3 == i14) {
                    M03 = org.telegram.messenger.bd.M0(2131745929, null);
                    org.telegram.messenger.kv kvVar = org.telegram.messenger.b6.d;
                    i26 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                    charSequence2 = kvVar.e(i26);
                    a10 = org.telegram.messenger.b6.d.a();
                } else {
                    i15 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i3 == i15) {
                        M03 = org.telegram.messenger.bd.M0(2131745936, null);
                        org.telegram.messenger.kv kvVar2 = org.telegram.messenger.b6.e;
                        i25 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                        charSequence2 = kvVar2.e(i25);
                        a10 = org.telegram.messenger.b6.e.a();
                    } else {
                        i16 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i3 == i16) {
                            CharSequence M06 = org.telegram.messenger.bd.M0(2131745938, null);
                            org.telegram.messenger.kv kvVar3 = org.telegram.messenger.b6.f;
                            i24 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                            charSequence2 = kvVar3.e(i24);
                            charSequence = M06;
                            z10 = org.telegram.messenger.b6.f.a();
                            z11 = false;
                            y5Var = null;
                            if (y5Var == null) {
                                long[] jArr = y5Var.b;
                                StringBuilder sb2 = new StringBuilder();
                                int i33 = 0;
                                boolean z17 = false;
                                int i34 = 0;
                                boolean z18 = false;
                                boolean z19 = false;
                                while (true) {
                                    int[] iArr = y5Var.a;
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
                                        if (!y5Var.g || i34 == 0) {
                                            z15 = z17;
                                            sb2.append(org.telegram.messenger.bd.M0(2131748205, null));
                                        } else {
                                            if (z17) {
                                                sb2.append(org.telegram.messenger.bd.M0(2131753816, null));
                                            }
                                            if (z18) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.bd.M0(2131753805, null));
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
                                                sb2.append(org.telegram.messenger.bd.M0(2131753837, null));
                                                sb2.append(String.format(" (%1$s)", org.telegram.messenger.g0.i0(jArr[org.telegram.messenger.z5.x(8)], true, false)));
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
                            h5Var.setAnimationsEnabled(z14);
                            h5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            break;
                        } else {
                            if (i3 == dataSettingsActivity.e) {
                                M02 = org.telegram.messenger.bd.M0(2131742894, null);
                                i22 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.z5.q(i22).N.g;
                                i23 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i23).n();
                            } else if (i3 == dataSettingsActivity.h) {
                                M02 = org.telegram.messenger.bd.M0(2131742896, null);
                                i20 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.z5.q(i20).O.g;
                                i21 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i21).p();
                            } else {
                                CharSequence M07 = org.telegram.messenger.bd.M0(2131742895, null);
                                i17 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                boolean z20 = org.telegram.messenger.z5.q(i17).P.g;
                                i18 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                                org.telegram.messenger.y5 o10 = org.telegram.messenger.z5.q(i18).o();
                                i19 = dataSettingsActivity.resetDownloadRow;
                                charSequence = M07;
                                z10 = z20;
                                z11 = i19 >= 0;
                                y5Var = o10;
                                charSequence2 = null;
                                if (y5Var == null) {
                                }
                                h5Var.setAnimationsEnabled(z14);
                                h5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            }
                            charSequence = M02;
                            z10 = z12;
                            z11 = true;
                            charSequence2 = null;
                            if (y5Var == null) {
                            }
                            h5Var.setAnimationsEnabled(z14);
                            h5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                        }
                    }
                }
                charSequence = M03;
                z10 = a10;
                z11 = true;
                y5Var = null;
                if (y5Var == null) {
                }
                h5Var.setAnimationsEnabled(z14);
                h5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (i3 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.X) {
                        l8Var.r(org.telegram.messenger.bd.M0(2131744826, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        l8Var.h(45, true, dataSettingsActivity.W);
                    } else {
                        String M08 = org.telegram.messenger.bd.M0(2131744826, null);
                        long j10 = dataSettingsActivity.Y;
                        l8Var.r(M08, j10 <= 0 ? "" : org.telegram.messenger.g0.i0(j10, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        l8Var.h(45, false, dataSettingsActivity.W);
                    }
                    dataSettingsActivity.W = false;
                } else if (i3 == dataSettingsActivity.w) {
                    i27 = ((org.telegram.ui.ActionBar.d2) dataSettingsActivity).currentAccount;
                    org.telegram.messenger.bz e10 = org.telegram.messenger.bz.e(i27);
                    l8Var.r(org.telegram.messenger.bd.M0(2131748306, null), org.telegram.messenger.g0.i0(e10.g(2, 6) + e10.g(1, 6) + e10.g(0, 6) + e10.f(2, 6) + e10.f(1, 6) + e10.f(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i3 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(org.telegram.messenger.az.h0)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i29 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i29)).getAbsolutePath();
                                if (absolutePath2.startsWith(org.telegram.messenger.az.h0)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    l8Var.r(org.telegram.messenger.bd.M0(2131744830, null), org.telegram.messenger.bd.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131749196 : 2131745850, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                l8Var.setOffsetFromImage(64);
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
    private final void H(u4.d1 d1Var, int i3) {
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
        int i37 = d1Var.f;
        View view = d1Var.a;
        if (i37 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i3 == notificationsSettingsActivity.y) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747917, "NotificationsForChats"));
                return;
            }
            if (i3 == notificationsSettingsActivity.F) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131749227, "InAppNotifications"));
                return;
            }
            if (i3 == notificationsSettingsActivity.L) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131750886, "Events"));
                return;
            }
            if (i3 == notificationsSettingsActivity.N) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747899, "NotificationsOther"));
                return;
            }
            if (i3 == notificationsSettingsActivity.T) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746128, "Reset"));
                return;
            }
            if (i3 == notificationsSettingsActivity.H) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131743289, "VoipNotificationSettings"));
                return;
            } else if (i3 == notificationsSettingsActivity.O) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753733, "BadgeNumber"));
                return;
            } else {
                if (i3 == notificationsSettingsActivity.r) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131745346, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        int i38 = 0;
        if (i37 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i10 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i10).d7;
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i3 == i11) {
                q8Var.f(org.telegram.messenger.bd.M0(2131749223, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i12 = notificationsSettingsActivity.inappVibrateRow;
            if (i3 == i12) {
                q8Var.f(org.telegram.messenger.bd.M0(2131749222, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappPreviewRow;
            if (i3 == i13) {
                q8Var.f(org.telegram.messenger.bd.M0(2131749224, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPriorityRow;
            if (i3 == i14) {
                q8Var.g(org.telegram.messenger.bd.M0(2131749226, null), org.telegram.messenger.bd.M0(2131749225, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i15 = notificationsSettingsActivity.contactJoinedRow;
            if (i3 == i15) {
                q8Var.f(org.telegram.messenger.bd.M0(2131751790, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i16 = notificationsSettingsActivity.pinnedMessageRow;
            if (i3 == i16) {
                q8Var.f(org.telegram.messenger.bd.M0(2131747236, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i3 == notificationsSettingsActivity.Q) {
                q8Var.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i3 == notificationsSettingsActivity.w) {
                q8Var.g(org.telegram.messenger.bd.M0(2131747884, "NotificationsService"), org.telegram.messenger.bd.M0(2131747881, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().C3), true, true);
                return;
            }
            if (i3 == notificationsSettingsActivity.x) {
                q8Var.g(org.telegram.messenger.bd.M0(2131747883, "NotificationsServiceConnection"), org.telegram.messenger.bd.M0(2131747882, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().D3), true, true);
                return;
            }
            i17 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i3 == i17) {
                q8Var.f(org.telegram.messenger.bd.M0(2131753731, "BadgeNumberShow"), notificationsSettingsActivity.getNotificationsController().S, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i3 == i18) {
                q8Var.f(org.telegram.messenger.bd.M0(2131753732, "BadgeNumberMutedChats"), notificationsSettingsActivity.getNotificationsController().T, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i3 == i19) {
                q8Var.f(org.telegram.messenger.bd.M0(2131753730, "BadgeNumberUnread"), notificationsSettingsActivity.getNotificationsController().U, false);
                return;
            }
            i20 = notificationsSettingsActivity.inchatSoundRow;
            if (i3 == i20) {
                q8Var.f(org.telegram.messenger.bd.M0(2131749221, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i3 == notificationsSettingsActivity.I) {
                q8Var.f(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i21 = notificationsSettingsActivity.accountsAllRow;
            if (i3 == i21) {
                q8Var.f(org.telegram.messenger.bd.M0(2131754302, "AllAccounts"), org.telegram.messenger.hp.f1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i37 == 2) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setMultilineDetail(true);
            i22 = notificationsSettingsActivity.resetNotificationsRow;
            if (i3 == i22) {
                x8Var.a(org.telegram.messenger.bd.M0(2131746122, "ResetAllNotifications"), org.telegram.messenger.bd.M0(2131743896, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i37 != 3) {
            if (i37 != 5) {
                if (i37 != 6) {
                    return;
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == notificationsSettingsActivity.s) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131745345, "ShowNotificationsForInfo"));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            i36 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(i36).d7;
            if (i3 == notificationsSettingsActivity.J) {
                String string = sharedPreferences2.getString("CallsRingtone", org.telegram.messenger.bd.M0(2131751600, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = org.telegram.messenger.bd.M0(2131748159, "NoSound");
                }
                v9Var.c(org.telegram.messenger.bd.M0(2131743251, "VoipSettingsRingtone"), string, notificationsSettingsActivity.X, false);
                notificationsSettingsActivity.X = false;
                return;
            }
            if (i3 != notificationsSettingsActivity.I) {
                if (i3 == notificationsSettingsActivity.R) {
                    int i39 = sharedPreferences2.getInt("repeat_messages", 60);
                    v9Var.c(org.telegram.messenger.bd.M0(2131746283, "RepeatNotifications"), i39 == 0 ? org.telegram.messenger.bd.M0(2131746282, "RepeatNotificationsNever") : i39 < 60 ? org.telegram.messenger.bd.G(i39, "Minutes", new Object[0]) : org.telegram.messenger.bd.G(i39 / 60, "Hours", new Object[0]), notificationsSettingsActivity.Y, false);
                    notificationsSettingsActivity.Y = false;
                    return;
                }
                return;
            }
            int i40 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                v9Var.c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), org.telegram.messenger.bd.M0(2131743623, "VibrationDefault"), notificationsSettingsActivity.W, true);
            } else if (i40 == 1) {
                v9Var.c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), org.telegram.messenger.bd.M0(2131745376, "Short"), notificationsSettingsActivity.W, true);
            } else if (i40 == 2) {
                v9Var.c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), org.telegram.messenger.bd.M0(2131743622, "VibrationDisabled"), notificationsSettingsActivity.W, true);
            } else if (i40 == 3) {
                v9Var.c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), org.telegram.messenger.bd.M0(2131748731, "Long"), notificationsSettingsActivity.W, true);
            } else if (i40 == 4) {
                v9Var.c(org.telegram.messenger.bd.M0(2131743624, "Vibrate"), org.telegram.messenger.bd.M0(2131747829, "OnlyIfSilent"), notificationsSettingsActivity.W, true);
            }
            notificationsSettingsActivity.W = false;
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        i23 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences3 = org.telegram.messenger.hp.s1(i23).d7;
        i24 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
        i25 = notificationsSettingsActivity.privateRow;
        if (i3 == i25) {
            M0 = org.telegram.messenger.bd.M0(2131747886, null);
            arrayList = notificationsSettingsActivity.d;
            i29 = sharedPreferences3.getInt("EnableAll2", 0);
            i30 = R.drawable.msg_openprofile;
        } else {
            i26 = notificationsSettingsActivity.groupRow;
            if (i3 != i26) {
                i27 = notificationsSettingsActivity.storiesRow;
                int i41 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i3 == i27) {
                    CharSequence M02 = org.telegram.messenger.bd.M0(2131747940, null);
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
                    if (i3 == i28) {
                        CharSequence M03 = org.telegram.messenger.bd.M0(2131747944, null);
                        i29 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i30 = R.drawable.msg_reactions;
                        charSequence = M03;
                        arrayList2 = null;
                        arrayList = null;
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131747929, null);
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
                if (i3 == i33) {
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i31 = i29 < currentTime ? 1 : i32;
                        if (i31 != 0) {
                            sb2.append(org.telegram.messenger.bd.M0(2131747900, "NotificationsOn"));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb2.append(org.telegram.messenger.bd.M0(2131747902, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i32] = org.telegram.messenger.bd.e1(i29);
                            sb2.append(org.telegram.messenger.bd.a0("NotificationsOffUntil", null, 2131747901, objArr));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList.size();
                        i34 = notificationsSettingsActivity.storiesRow;
                        if (i3 == i34 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(org.telegram.messenger.bd.G(size, "Exception", new Object[i32]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(org.telegram.messenger.bd.M0(2131744271, "TapToChange"));
                    } else {
                        if (i29 > 0) {
                            sb2.append(org.telegram.messenger.bd.M0(2131747902, "NotificationsOff"));
                        } else {
                            sb2.append(org.telegram.messenger.bd.M0(2131747900, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(org.telegram.messenger.bd.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z10 = i31;
                } else if (i29 > 0) {
                    sb2.append(org.telegram.messenger.bd.M0(2131747902, "NotificationsOff"));
                    z10 = i32;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(org.telegram.messenger.bd.M0(2131747943, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.bd.M0(2131747942, null));
                    }
                    z10 = 1;
                }
                i35 = notificationsSettingsActivity.reactionsRow;
                h5Var.b(charSequence, sb2, i30, z10, i38, false, i3 == i35, false);
            }
            M0 = org.telegram.messenger.bd.M0(2131747915, null);
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
        if (i3 == i33) {
        }
        i35 = notificationsSettingsActivity.reactionsRow;
        h5Var.b(charSequence, sb22, i30, z10, i38, false, i3 == i35, false);
    }

    private final void I(u4.d1 d1Var, int i3) {
        boolean P1;
        sm0 sm0Var = (sm0) this.e;
        org.telegram.messenger.pe peVar = sm0Var.K;
        ArrayList arrayList = sm0Var.n;
        ArrayList arrayList2 = sm0Var.c;
        HashMap hashMap = sm0Var.b;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.setItemSize(sm0Var.S);
            org.telegram.ui.Components.k9 imageView = q5Var.getImageView();
            q5Var.setTag(Integer.valueOf(i3));
            imageView.r();
            if (peVar != null) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.e.get(i3);
                q5Var.d(yeVar, arrayList2.size() > 1, true, false, false);
                int i11 = yeVar.C;
                q5Var.b(sm0Var.e ? arrayList2.indexOf(Integer.valueOf(i11)) : -1, hashMap.containsKey(Integer.valueOf(i11)), false);
                P1 = PhotoViewer.P1(yeVar.I);
            } else {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f.get(i3);
                q5Var.e(bfVar);
                q5Var.getVideoInfoContainer().setVisibility(4);
                q5Var.b(sm0Var.e ? arrayList2.indexOf(bfVar.B) : -1, hashMap.containsKey(bfVar.B), false);
                P1 = PhotoViewer.P1(bfVar.g());
            }
            imageView.getImageReceiver().O0(!P1, true);
            q5Var.getCheckBox().setVisibility((sm0Var.U != 0 || P1) ? 8 : 0);
            return;
        }
        if (i10 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = sm0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 == 2) {
            org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) peVar.e.get(i3);
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            g7Var.setPhotoEntry(yeVar2);
            g7Var.b(hashMap.containsKey(Integer.valueOf(yeVar2.C)), false);
            g7Var.setTag(Integer.valueOf(i3));
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        if (i3 < arrayList.size()) {
            l8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i3), false);
        } else {
            l8Var.o(R.drawable.msg_clear_recent, org.telegram.messenger.bd.M0(2131752067, null), false);
        }
    }

    private final void J(u4.d1 d1Var, int i3) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) d1Var.a;
        int L = org.telegram.messenger.g0.L(85.0f);
        int L2 = i3 != 0 ? org.telegram.messenger.g0.L(6.0f) : 0;
        w5Var.f = L;
        org.telegram.ui.Components.wo woVar = w5Var.c;
        org.telegram.ui.Components.k9 k9Var = w5Var.a;
        ci.t4 t4Var = w5Var.e;
        w5Var.h = L2;
        ((FrameLayout.LayoutParams) w5Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) k9Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) t4Var.getLayoutParams()).rightMargin = L2;
        k9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i3));
        if (!(obj instanceof org.telegram.messenger.ye)) {
            if (obj instanceof org.telegram.messenger.bf) {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                w5Var.setTag(bfVar);
                w5Var.setImage(bfVar);
                t4Var.setVisibility(4);
                woVar.a.f(-1, true, false);
                woVar.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
        int i10 = yeVar.C;
        String str = yeVar.I;
        w5Var.setTag(yeVar);
        t4Var.setVisibility(4);
        String str2 = yeVar.c;
        if (str2 != null) {
            k9Var.h(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            k9Var.s(yeVar.J, yeVar.K, true);
            if (!yeVar.b || yeVar.d()) {
                k9Var.h("thumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                t4Var.setVisibility(0);
                w5Var.d.setText(org.telegram.messenger.g0.g0(yeVar.E, false, false));
                k9Var.h("vthumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            k9Var.setImageResource(R.drawable.nophotos);
        }
        woVar.a.f(-1, true, false);
        woVar.setVisibility(0);
    }

    private final void K(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i12 = d1Var.f;
        View view = d1Var.a;
        switch (i12) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                i10 = proxyListActivity.proxyAddRow;
                if (i3 == i10) {
                    v9Var.b(org.telegram.messenger.bd.M0(2131754391, null), proxyListActivity.E != -1);
                    break;
                } else if (i3 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    v9Var.b(org.telegram.messenger.bd.M0(2131751581, null), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746613, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i3 == i11) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131743793, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i3 == proxyListActivity.w) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131743795, null), org.telegram.messenger.az.a1, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == proxyListActivity.y) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131746611, null));
                    break;
                }
                break;
            case 5:
                fx0 fx0Var = (fx0) view;
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList2.get(i3 - proxyListActivity.n);
                fx0Var.setProxy(zyVar);
                fx0Var.setChecked(org.telegram.messenger.az.B1 == zyVar);
                boolean contains = arrayList.contains(arrayList2.get(i3 - proxyListActivity.n));
                fx0Var.h = contains;
                fx0Var.f.a(contains, false);
                fx0Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i3 == proxyListActivity.x) {
                    org.telegram.ui.Components.ut0 ut0Var = (org.telegram.ui.Components.ut0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ht.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        strArr[i13] = org.telegram.messenger.bd.a0(null, null, 2131746610, arrayList3.get(i13));
                    }
                    ut0Var.setCallback(new u70(10));
                    ut0Var.b(org.telegram.messenger.az.b1, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void L(u4.d1 d1Var, int i3) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.d2) ((ny0) this.e)).currentAccount;
        boolean d = org.telegram.ui.Components.p40.d(i10);
        int i11 = d1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.n4) d1Var.a).setText(i3 == 0 ? org.telegram.messenger.bd.M0(2131745998, null) : org.telegram.messenger.bd.M0(2131746002, null));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) d1Var.a;
            q8Var.setEnabled(i3 == 1 || d);
            if (i3 == 1) {
                q8Var.f(org.telegram.messenger.bd.M0(2131745994, null), d, false);
                return;
            }
            String M0 = org.telegram.messenger.bd.M0(2131746001, null);
            xi.a aVar = xi.e.i;
            aVar.a();
            q8Var.f(M0, aVar.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.y8) d1Var.a).setText(i3 == 6 ? org.telegram.messenger.bd.M0(2131745997, null) : org.telegram.messenger.bd.M0(2131746000, null));
            return;
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.a;
        v9Var.setEnabled(d);
        if (i3 == 2) {
            v9Var.c(org.telegram.messenger.bd.M0(2131745996, null), a1.g.o(((wi.r0) xi.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i3 == 3) {
            String M02 = org.telegram.messenger.bd.M0(2131746006, null);
            wi.n0 n0Var = (wi.n0) xi.e.f.a();
            v9Var.c(M02, n0Var == wi.n0.a ? org.telegram.messenger.bd.M0(2131746005, null) : n0Var == wi.n0.b ? org.telegram.messenger.bd.M0(2131746003, null) : org.telegram.messenger.bd.M0(2131746004, null), false, true);
        } else if (i3 == 4) {
            v9Var.c(org.telegram.messenger.bd.M0(2131745999, null), a1.g.o(((wi.o0) xi.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            v9Var.c(org.telegram.messenger.bd.M0(2131746007, null), ny0.f0(xi.e.h.a()), false, false);
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3;
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
                int b10 = d1Var.b();
                if (b10 == 1) {
                    return true;
                }
                i3 = ((org.telegram.ui.ActionBar.d2) ((ny0) this.e)).currentAccount;
                return MediaController.s0(i3) && b10 == 2;
            case 1:
                int b11 = d1Var.b();
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.e;
                return b11 == anVar.v0 || b11 == anVar.H0 || b11 == anVar.C0 || b11 == anVar.G0 || b11 == anVar.D0 || b11 == anVar.I0 || b11 == anVar.E0 || b11 == anVar.F0 || b11 == anVar.J0 || b11 == anVar.K0 || b11 == anVar.O0.b || b11 == anVar.N0.b || b11 == anVar.M0;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return d1Var.f == 0;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = d1Var.b();
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
                int b13 = d1Var.b();
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
                int b14 = d1Var.b();
                zd0 zd0Var = (zd0) this.e;
                return b14 == zd0Var.c || b14 == zd0Var.d || b14 == zd0Var.e || b14 == zd0Var.f || b14 == zd0Var.h || b14 == zd0Var.r;
            case 11:
                int b15 = d1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                return (b15 == notificationsSettingsActivity.y || b15 == notificationsSettingsActivity.E || b15 == notificationsSettingsActivity.F || b15 == notificationsSettingsActivity.L || b15 == notificationsSettingsActivity.N || b15 == notificationsSettingsActivity.T || b15 == notificationsSettingsActivity.O || b15 == notificationsSettingsActivity.M || b15 == notificationsSettingsActivity.S || b15 == notificationsSettingsActivity.G || b15 == notificationsSettingsActivity.H || b15 == notificationsSettingsActivity.P || b15 == notificationsSettingsActivity.r || b15 == notificationsSettingsActivity.s || b15 == notificationsSettingsActivity.U || b15 == notificationsSettingsActivity.K) ? false : true;
            case 12:
                int b16 = d1Var.b();
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
                sm0 sm0Var = (sm0) this.e;
                return sm0Var.K != null || (!TextUtils.isEmpty(sm0Var.w) ? d1Var.b() >= sm0Var.f.size() : d1Var.f != 3);
            case 15:
                return false;
            case 16:
                int b17 = d1Var.b();
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
                int b18 = d1Var.b();
                if (b18 == 1) {
                    return true;
                }
                i27 = ((org.telegram.ui.ActionBar.d2) ((ny0) this.e)).currentAccount;
                return org.telegram.ui.Components.p40.d(i27) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8);
            case 18:
                return d1Var.f != 1;
            default:
                return o1.g.d(3)[d1Var.f] == 1;
        }
    }

    public void E() {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.y4 y4Var3;
        org.telegram.ui.ActionBar.y4 y4Var4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        y4Var = ((org.telegram.ui.ActionBar.d2) proxyListActivity).simpleActionBar;
        boolean s6 = y4Var.s();
        if (size <= 0) {
            if (s6) {
                y4Var2 = ((org.telegram.ui.ActionBar.d2) proxyListActivity).simpleActionBar;
                y4Var2.r();
                int i3 = proxyListActivity.n;
                n(i3, proxyListActivity.r - i3, 2);
                return;
            }
            return;
        }
        y4Var3 = ((org.telegram.ui.ActionBar.d2) proxyListActivity).simpleActionBar;
        y4Var3.x(size, s6);
        if (s6) {
            return;
        }
        y4Var4 = ((org.telegram.ui.ActionBar.d2) proxyListActivity).simpleActionBar;
        y4Var4.B();
        int i10 = proxyListActivity.n;
        n(i10, proxyListActivity.r - i10, 2);
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.F.clear();
        int i3 = proxyListActivity.n;
        n(i3, proxyListActivity.r - i3, 1);
        E();
    }

    public void M(int i3) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.n;
        if (i3 < i10 || i3 >= proxyListActivity.r) {
            return;
        }
        org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) proxyListActivity.G.get(i3 - i10);
        if (arrayList.contains(zyVar)) {
            arrayList.remove(zyVar);
        } else {
            arrayList.add(zyVar);
        }
        h(i3, 1);
        E();
    }

    @Override // u4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.an) this.e).R0;
            case 2:
                return ((org.telegram.ui.Components.bz) this.e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.cz) this.e).s1.size();
                return size < 10 ? size + 1 : size;
            case 4:
                return ((org.telegram.ui.Components.nd0) this.e).G;
            case 5:
                return org.telegram.messenger.ld.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.m61) this.e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.e).y;
            case 9:
                return ((DataSettingsActivity) this.e).U;
            case 10:
                return ((zd0) this.e).w;
            case 11:
                return ((NotificationsSettingsActivity) this.e).V;
            case 12:
                return ((PasscodeActivity) this.e).Q;
            case 13:
                if (((hm0) this.e).d != null) {
                    return (int) Math.ceil(r1.size() / r0.f);
                }
                return 0;
            case 14:
                sm0 sm0Var = (sm0) this.e;
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar != null) {
                    return peVar.e.size();
                }
                if (!sm0Var.f.isEmpty()) {
                    return sm0Var.f.size() + (!sm0Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(sm0Var.w) || sm0Var.n.isEmpty()) {
                    return 0;
                }
                return sm0Var.n.size() + 2;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                kq0 kq0Var = photoViewer.d;
                if (kq0Var == null || kq0Var.c() == null) {
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
                return ((qg.h) this.e).F.size();
        }
    }

    @Override // u4.h0
    public long c(int i3) {
        int i10;
        int i11;
        int i12;
        switch (this.c) {
            case 2:
                i10 = ((org.telegram.ui.Components.bz) this.e).l0.get(i3);
                break;
            case 4:
                return i3;
            case 6:
                if (((org.telegram.ui.Components.ow0) this.d).x == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.hi) r0.get(i3)).a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.j61) ((org.telegram.ui.Components.m61) this.e).h.get(i3)).a;
                break;
            case 14:
                return i3;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i3 == proxyListActivity.f) {
                    return -1L;
                }
                if (i3 == proxyListActivity.s) {
                    return -2L;
                }
                i11 = proxyListActivity.proxyAddRow;
                if (i3 == i11) {
                    return -3L;
                }
                i12 = proxyListActivity.useProxyRow;
                if (i3 == i12) {
                    return -4L;
                }
                if (i3 == proxyListActivity.h) {
                    return -6L;
                }
                if (i3 == proxyListActivity.E) {
                    return -8L;
                }
                if (i3 == proxyListActivity.w) {
                    return -9L;
                }
                if (i3 == proxyListActivity.x) {
                    return -10L;
                }
                if (i3 == proxyListActivity.y) {
                    return -11L;
                }
                if (i3 < proxyListActivity.n || i3 >= proxyListActivity.r) {
                    return -7L;
                }
                return ((org.telegram.messenger.zy) proxyListActivity.G.get(i3 - r1)).hashCode();
            default:
                return super.c(i3);
        }
        return i10;
    }

    @Override // u4.h0
    public int d(int i3) {
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
                if (i3 == 0) {
                    return 0;
                }
                int i42 = 1;
                if (i3 != 1) {
                    i42 = 2;
                    if (i3 != 2) {
                        return 3;
                    }
                }
                return i42;
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.e;
                if (i3 == anVar.C0 || i3 == anVar.G0 || i3 == anVar.H0 || i3 == anVar.D0 || i3 == anVar.E0 || i3 == anVar.F0 || i3 == anVar.I0 || i3 == anVar.N0.b || i3 == anVar.O0.b) {
                    return 10;
                }
                if (i3 == anVar.m0 || i3 == anVar.t0 || i3 == anVar.x0 || i3 == anVar.p0) {
                    return 0;
                }
                if (i3 == anVar.s0) {
                    return 1;
                }
                if (i3 == anVar.w0 || i3 == anVar.y0 || i3 == anVar.r0 || i3 == anVar.L0) {
                    return 2;
                }
                if (i3 == anVar.v0 || i3 == anVar.J0 || i3 == anVar.M0) {
                    return 3;
                }
                if (i3 == anVar.n0) {
                    return 4;
                }
                if (i3 == anVar.o0) {
                    return 11;
                }
                if (i3 == anVar.q0) {
                    return 7;
                }
                if (i3 == anVar.z0 || i3 == anVar.A0 || i3 == anVar.K0) {
                    return 6;
                }
                if (i3 == anVar.B0) {
                    return 8;
                }
                return i3 == 0 ? 9 : 5;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                org.telegram.ui.Components.nd0 nd0Var = (org.telegram.ui.Components.nd0) this.e;
                return (i3 == nd0Var.E || i3 == nd0Var.F) ? 1 : 0;
            case 5:
                return i3 == 0 ? 1 : 0;
            case 6:
            default:
                return super.d(i3);
            case 7:
                return 0;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                i10 = dataAutoDownloadActivity.autoDownloadRow;
                if (i3 == i10) {
                    return 0;
                }
                if (i3 == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i3 == dataAutoDownloadActivity.r || i3 == dataAutoDownloadActivity.w) {
                    return 2;
                }
                i11 = dataAutoDownloadActivity.usageProgressRow;
                if (i3 == i11) {
                    return 3;
                }
                i12 = dataAutoDownloadActivity.photosRow;
                if (i3 != i12) {
                    i13 = dataAutoDownloadActivity.videosRow;
                    if (i3 != i13) {
                        i14 = dataAutoDownloadActivity.filesRow;
                        if (i3 != i14) {
                            i15 = dataAutoDownloadActivity.storiesRow;
                            if (i3 != i15) {
                                return 5;
                            }
                        }
                    }
                }
                return 4;
            case 9:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (i3 == dataSettingsActivity.r || i3 == dataSettingsActivity.x || i3 == dataSettingsActivity.O || i3 == dataSettingsActivity.Q || i3 == dataSettingsActivity.M || i3 == dataSettingsActivity.R || i3 == dataSettingsActivity.T) {
                    return 0;
                }
                if (i3 == dataSettingsActivity.d || i3 == dataSettingsActivity.y || i3 == dataSettingsActivity.N || i3 == 0 || i3 == dataSettingsActivity.P || i3 == dataSettingsActivity.J || i3 == dataSettingsActivity.S) {
                    return 2;
                }
                if (i3 == dataSettingsActivity.F || i3 == dataSettingsActivity.E || i3 == dataSettingsActivity.G || i3 == dataSettingsActivity.H || i3 == dataSettingsActivity.K || i3 == dataSettingsActivity.L) {
                    return 3;
                }
                if (i3 == dataSettingsActivity.I) {
                    return 4;
                }
                if (i3 != dataSettingsActivity.e && i3 != dataSettingsActivity.h && i3 != dataSettingsActivity.f) {
                    i16 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i3 != i16) {
                        i17 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i3 != i17) {
                            i18 = dataSettingsActivity.saveToGalleryChannelsRow;
                            if (i3 != i18) {
                                return (i3 == dataSettingsActivity.s || i3 == dataSettingsActivity.w || i3 == dataSettingsActivity.n) ? 6 : 1;
                            }
                        }
                    }
                }
                return 5;
            case 10:
                zd0 zd0Var = (zd0) this.e;
                zd0Var.getClass();
                if (i3 == 0) {
                    return 0;
                }
                if (i3 == zd0Var.c || i3 == zd0Var.d || i3 == zd0Var.e || i3 == zd0Var.f || i3 == zd0Var.h) {
                    return 1;
                }
                if (i3 == zd0Var.n) {
                    return 2;
                }
                return i3 == zd0Var.r ? 3 : 4;
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                if (i3 == notificationsSettingsActivity.L || i3 == notificationsSettingsActivity.N || i3 == notificationsSettingsActivity.T || i3 == notificationsSettingsActivity.H || i3 == notificationsSettingsActivity.O || i3 == notificationsSettingsActivity.F || i3 == notificationsSettingsActivity.y || i3 == notificationsSettingsActivity.r) {
                    return 0;
                }
                i19 = notificationsSettingsActivity.inappSoundRow;
                if (i3 != i19) {
                    i20 = notificationsSettingsActivity.inappVibrateRow;
                    if (i3 != i20 && i3 != notificationsSettingsActivity.x) {
                        i21 = notificationsSettingsActivity.inappPreviewRow;
                        if (i3 != i21) {
                            i22 = notificationsSettingsActivity.contactJoinedRow;
                            if (i3 != i22) {
                                i23 = notificationsSettingsActivity.pinnedMessageRow;
                                if (i3 != i23 && i3 != notificationsSettingsActivity.w) {
                                    i24 = notificationsSettingsActivity.badgeNumberMutedRow;
                                    if (i3 != i24) {
                                        i25 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                        if (i3 != i25) {
                                            i26 = notificationsSettingsActivity.badgeNumberShowRow;
                                            if (i3 != i26) {
                                                i27 = notificationsSettingsActivity.inappPriorityRow;
                                                if (i3 != i27) {
                                                    i28 = notificationsSettingsActivity.inchatSoundRow;
                                                    if (i3 != i28 && i3 != notificationsSettingsActivity.Q) {
                                                        i29 = notificationsSettingsActivity.accountsAllRow;
                                                        if (i3 != i29) {
                                                            i30 = notificationsSettingsActivity.resetNotificationsRow;
                                                            if (i3 == i30) {
                                                                return 2;
                                                            }
                                                            i31 = notificationsSettingsActivity.privateRow;
                                                            if (i3 != i31) {
                                                                i32 = notificationsSettingsActivity.groupRow;
                                                                if (i3 != i32) {
                                                                    i33 = notificationsSettingsActivity.channelsRow;
                                                                    if (i3 != i33) {
                                                                        i34 = notificationsSettingsActivity.storiesRow;
                                                                        if (i3 != i34) {
                                                                            i35 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i3 != i35) {
                                                                                if (i3 == notificationsSettingsActivity.K || i3 == notificationsSettingsActivity.E || i3 == notificationsSettingsActivity.M || i3 == notificationsSettingsActivity.S || i3 == notificationsSettingsActivity.G || i3 == notificationsSettingsActivity.P || i3 == notificationsSettingsActivity.U) {
                                                                                    return 4;
                                                                                }
                                                                                return i3 == notificationsSettingsActivity.s ? 6 : 5;
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
                if (i3 != i36 && i3 != passcodeActivity.O && i3 != passcodeActivity.L && i3 != passcodeActivity.K) {
                    i37 = passcodeActivity.changePasscodeRow;
                    if (i3 != i37) {
                        i38 = passcodeActivity.autoLockRow;
                        if (i3 != i38) {
                            i39 = passcodeActivity.disablePasscodeRow;
                            if (i3 != i39) {
                                if (i3 == passcodeActivity.I || i3 == passcodeActivity.P || i3 == passcodeActivity.H || i3 == passcodeActivity.M) {
                                    return 2;
                                }
                                if (i3 == passcodeActivity.N || i3 == passcodeActivity.J) {
                                    return 3;
                                }
                                if (i3 == 0) {
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
                sm0 sm0Var = (sm0) this.e;
                if (sm0Var.Z) {
                    return 2;
                }
                if (sm0Var.K == null) {
                    if (sm0Var.f.isEmpty()) {
                        return i3 == sm0Var.n.size() ? 4 : 3;
                    }
                    if (i3 >= sm0Var.f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 15:
                return 0;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i3 == proxyListActivity.f || i3 == proxyListActivity.s) {
                    return 0;
                }
                i40 = proxyListActivity.proxyAddRow;
                if (i3 == i40 || i3 == proxyListActivity.E) {
                    return 1;
                }
                i41 = proxyListActivity.useProxyRow;
                if (i3 == i41 || i3 == proxyListActivity.w) {
                    return 3;
                }
                if (i3 == proxyListActivity.h) {
                    return 2;
                }
                if (i3 == proxyListActivity.x) {
                    return 6;
                }
                return (i3 < proxyListActivity.n || i3 >= proxyListActivity.r) ? 4 : 5;
            case 17:
                if (i3 == 0 || i3 == 7) {
                    return 0;
                }
                if (i3 == 1 || i3 == 8) {
                    return 1;
                }
                return (i3 == 6 || i3 == 9) ? 3 : 2;
            case 18:
                return i3 == ((ArrayList) this.e).size() ? 1 : 0;
            case 19:
                return o1.g.c(((qg.a) ((qg.h) this.e).F.get(i3)).b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cb, code lost:
    
        if (org.telegram.ui.Wallet.k0.x(r3).J() != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06d9  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        String G;
        TextView textView;
        Drawable drawable;
        org.telegram.ui.Components.l61 l61Var;
        int i11;
        int i12;
        int i13;
        int i14;
        String M0;
        int i15;
        int i16;
        org.telegram.messenger.y5 o10;
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
                i10 = ((org.telegram.ui.ActionBar.d2) ((ny0) obj2)).currentAccount;
                boolean s02 = MediaController.s0(i10);
                int i33 = d1Var.f;
                View view = d1Var.a;
                if (i33 == 0) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131753924, null));
                    break;
                } else if (i33 == 1) {
                    ((org.telegram.ui.Cells.q8) view).f(org.telegram.messenger.bd.M0(2131753918, null), s02, false);
                    break;
                } else if (i33 == 2) {
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.setEnabled(s02);
                    v9Var.c(org.telegram.messenger.bd.M0(2131753922, null), org.telegram.messenger.bd.M0(((vi.h) xi.e.c.a()) == vi.h.b ? 2131753920 : 2131753921, null), false, false);
                    break;
                } else {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(2131753923, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) obj2;
                boolean z11 = anVar.f0;
                cg.v0 v0Var = anVar.N0;
                cg.v0 v0Var2 = anVar.O0;
                org.telegram.ui.ActionBar.e6 e6Var = anVar.a;
                boolean z12 = anVar.n;
                int i34 = d1Var.f;
                View view2 = d1Var.a;
                if (i34 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view2;
                    if (i3 == anVar.m0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.bd.M0(z12 ? 2131744064 : 2131747173, null));
                        break;
                    } else if (i3 == anVar.p0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.bd.M0(2131754473, null));
                        break;
                    } else {
                        n4Var.getTextView().setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                        if (i3 == anVar.t0) {
                            if (z11) {
                                n4Var.setText(org.telegram.messenger.bd.M0(2131746455, null));
                                break;
                            } else {
                                n4Var.setText(org.telegram.messenger.bd.M0(z12 ? 2131744082 : 2131754246, null));
                                break;
                            }
                        } else if (i3 == anVar.x0) {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131745505, null));
                            break;
                        }
                    }
                } else if (i34 == 6) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view2;
                    if (i3 == anVar.z0) {
                        q8Var.f(org.telegram.messenger.bd.M0(2131744103, null), anVar.g0, anVar.A0 != -1);
                        q8Var.e(null, true);
                        break;
                    } else if (i3 == anVar.A0) {
                        q8Var.f(org.telegram.messenger.bd.M0(2131744102, null), anVar.h0, false);
                        q8Var.e(null, true);
                        break;
                    } else if (i3 == anVar.K0) {
                        q8Var.f(org.telegram.messenger.bd.M0(2131747147, null), anVar.a0, false);
                        q8Var.e(null, true);
                        break;
                    }
                } else if (i34 == 2) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view2;
                    y8Var.setFixedSize(0);
                    new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var)), org.telegram.ui.ActionBar.k6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7)).x = true;
                    if (i3 == anVar.r0) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131754472, null));
                        break;
                    } else if (i3 == anVar.y0) {
                        y8Var.setFixedSize(12);
                        y8Var.setText(null);
                        break;
                    } else {
                        int i35 = anVar.K - anVar.N;
                        if (i35 <= 0) {
                            y8Var.setText(org.telegram.messenger.bd.M0(z12 ? 2131744118 : 2131754469, null));
                            break;
                        } else if (z12) {
                            y8Var.setText(org.telegram.messenger.bd.H(',', "TodoNewTaskInfo", i35));
                            break;
                        } else if (i3 == anVar.L0) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131747146, null));
                            break;
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.a0(null, null, 2131754470, org.telegram.messenger.bd.G(i35, "Option", new Object[0])));
                            break;
                        }
                    }
                } else if (i34 == 3) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                    if (i3 == anVar.M0) {
                        String M02 = org.telegram.messenger.bd.M0(2131747153, null);
                        ArrayList arrayList = anVar.Q0;
                        if (arrayList.isEmpty()) {
                            G = org.telegram.messenger.bd.M0(2131745821, null);
                            z10 = false;
                        } else if (arrayList.size() == 1) {
                            z10 = false;
                            G = org.telegram.messenger.bd.i0(2131750529, (String) arrayList.get(0));
                        } else {
                            z10 = false;
                            G = org.telegram.messenger.bd.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                        }
                        l8Var.q(M02, G, z10, true);
                        break;
                    } else if (i3 == anVar.J0) {
                        anVar.Z(l8Var, false);
                        break;
                    } else {
                        l8Var.g(-1, org.telegram.ui.ActionBar.k6.Wl);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable3 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, e6Var), mode));
                        anVar.o1 = drawable2;
                        anVar.p1 = drawable3;
                        l8Var.p(org.telegram.messenger.bd.M0(z12 ? 2131744078 : 2131754471, null), new org.telegram.ui.Components.xp(drawable2, drawable3), false);
                        l8Var.x = 20;
                        l8Var.s = 58;
                        break;
                    }
                } else if (i34 == 9) {
                    view2.requestLayout();
                    break;
                } else if (i34 == 10) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view2;
                    x5Var.setDivider(false);
                    if (i3 == anVar.C0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747132, null), org.telegram.messenger.bd.M0(2131747131, null), org.telegram.ui.Components.y20.c, R.drawable.filled_poll_view_24, !anVar.b0);
                    } else if (i3 == anVar.G0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747157, null), org.telegram.messenger.bd.M0(2131747156, null), org.telegram.ui.Components.y20.f, R.drawable.filled_poll_multiple_24, anVar.c0);
                    } else if (i3 == anVar.E0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747155, null), org.telegram.messenger.bd.M0(2131747154, null), org.telegram.ui.Components.y20.w, R.drawable.filled_poll_revote_24, anVar.S);
                    } else if (i3 == anVar.D0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747159, null), org.telegram.messenger.bd.M0(2131747158, null), org.telegram.ui.Components.y20.s, R.drawable.filled_poll_add_24, anVar.U);
                    } else if (i3 == anVar.F0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747130, null), org.telegram.messenger.bd.M0(2131747129, null), org.telegram.ui.Components.y20.h, R.drawable.filled_poll_shuffle_24, anVar.T);
                    } else if (i3 == anVar.H0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747134, null), org.telegram.messenger.bd.M0(2131747133, null), org.telegram.ui.Components.y20.n, R.drawable.filled_poll_correct_24, anVar.d0);
                    } else if (i3 == v0Var2.b) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747145, null), org.telegram.messenger.bd.M0(2131747144, null), org.telegram.ui.Components.y20.e, R.drawable.filled_location, v0Var2.a);
                    } else if (i3 == v0Var.b) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747137, null), org.telegram.messenger.bd.M0(2131747136, null), org.telegram.ui.Components.y20.d, R.drawable.msg_folders_groups, v0Var.a);
                    } else if (i3 == anVar.I0) {
                        x5Var.a(org.telegram.messenger.bd.M0(2131747143, null), org.telegram.messenger.bd.M0(2131747142, null), org.telegram.ui.Components.y20.r, R.drawable.filled_poll_deadline_24, (anVar.V == 0 && anVar.W == 0) ? false : true);
                        x5Var.setDivider((anVar.V == 0 && anVar.W == 0) ? false : true);
                    }
                    if (i3 == anVar.H0) {
                        x5Var.getCheckBox().a.a(z11, false);
                        break;
                    } else if (i3 == anVar.D0) {
                        Switch checkBox = x5Var.getCheckBox();
                        if (!anVar.d0 && !anVar.b0) {
                            r9 = false;
                        }
                        checkBox.a.a(r9, false);
                        break;
                    } else {
                        x5Var.getCheckBox().a.a(false, false);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.zy zyVar = (org.telegram.ui.Components.zy) d1Var.a;
                int id2 = zyVar.b != null ? zyVar.getId() : -1;
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) ((org.telegram.ui.Components.bz) obj2).h.get(i3);
                zyVar.b = yyVar;
                zyVar.e = i3;
                zyVar.setContentDescription(yyVar.b);
                zyVar.requestLayout();
                boolean z13 = zyVar.n;
                org.telegram.ui.Components.yy yyVar2 = zyVar.b;
                if (z13 != (yyVar2 != null && yyVar2.g)) {
                    org.telegram.ui.Components.p5.release(zyVar, zyVar.r);
                    org.telegram.ui.Components.p5.release(zyVar, zyVar.P);
                    org.telegram.ui.Components.p5.release(zyVar, zyVar.R);
                    org.telegram.ui.Components.p5.release(zyVar, zyVar.T);
                    if (zyVar.m0) {
                        zyVar.r = org.telegram.ui.Components.p5.update(zyVar.b.g ? 26 : 0, zyVar, zyVar.r, zyVar.s);
                        zyVar.P = org.telegram.ui.Components.p5.update(zyVar.b.g ? 26 : 0, zyVar, zyVar.P, zyVar.Q);
                        zyVar.R = org.telegram.ui.Components.p5.update(zyVar.b.g ? 26 : 0, zyVar, zyVar.R, zyVar.S);
                        zyVar.T = org.telegram.ui.Components.p5.update(zyVar.b.g ? 26 : 0, zyVar, zyVar.T, zyVar.U);
                    }
                    zyVar.n = zyVar.b.g;
                }
                if (id2 != zyVar.getId()) {
                    zyVar.l0 = zyVar.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 3:
                Context context2 = (Context) obj;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) d1Var.a;
                org.telegram.ui.Components.cz czVar = (org.telegram.ui.Components.cz) obj2;
                ArrayList arrayList2 = czVar.t1;
                ArrayList arrayList3 = czVar.s1;
                if (i3 < arrayList3.size()) {
                    org.telegram.ui.ActionBar.r6.t(m2Var.getImageView(), org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
                    org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) arrayList3.get(i3);
                    org.telegram.ui.ActionBar.r6.V(m2Var.getTextView(), org.telegram.ui.ActionBar.k6.j5, null);
                    int i36 = moVar.g;
                    int i37 = org.telegram.messenger.hp.D8;
                    int i38 = i36 & i37;
                    m2Var.a(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(moVar.b, m2Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), moVar.c, m2Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new org.telegram.ui.Components.sz(czVar.getContext(), i38 == 3 ? R.drawable.msg_openprofile : ((i36 & 64) == 0 || i38 != i37) ? i38 == 8 ? R.drawable.msg_channel : i38 == 4 ? R.drawable.msg_groups : i38 == 1 ? R.drawable.msg_contacts : i38 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, moVar.m), false);
                    m2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, czVar.J0));
                    for (int i39 = 0; i39 < arrayList2.size(); i39++) {
                        if (!moVar.b(org.telegram.messenger.c.a(czVar.a), ((Long) arrayList2.get(i39)).longValue())) {
                            r9 = false;
                        }
                    }
                    m2Var.setChecked(r9);
                    break;
                } else {
                    m2Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable4 = context2.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable5 = context2.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = m2Var.getImageView();
                    int i40 = org.telegram.ui.ActionBar.k6.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.y(imageView, drawable4, i40, null, mode2);
                    org.telegram.ui.ActionBar.r6.y(m2Var.getImageView(), drawable5, org.telegram.ui.ActionBar.k6.k7, null, mode2);
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable4, drawable5);
                    org.telegram.ui.ActionBar.r6.V(m2Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
                    m2Var.a(org.telegram.messenger.bd.M0(2131751717, null), 0, xpVar, false);
                    break;
                }
            case 4:
                org.telegram.ui.Components.nd0 nd0Var = (org.telegram.ui.Components.nd0) obj2;
                int i41 = d1Var.f;
                View view3 = d1Var.a;
                if (i41 == 0) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view3;
                    s5Var.setTag(Integer.valueOf(i3));
                    if (i3 == nd0Var.b) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131751127, null), 0, nd0Var.H);
                        break;
                    } else if (i3 == nd0Var.r) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131749310, null), -100, nd0Var.Q);
                        break;
                    } else if (i3 == nd0Var.d) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131751769, null), -100, nd0Var.J);
                        break;
                    } else if (i3 == nd0Var.c) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131750858, null), -100, nd0Var.I);
                        break;
                    } else if (i3 == nd0Var.f) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131742959, null), -100, nd0Var.K);
                        break;
                    } else if (i3 == nd0Var.e) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131745957, null), -100, nd0Var.L);
                        break;
                    } else if (i3 == nd0Var.w) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131743534, null), 0, nd0Var.S);
                        break;
                    } else if (i3 == nd0Var.s) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131745475, null), -100, nd0Var.R);
                        break;
                    } else if (i3 == nd0Var.x) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131749532, null), 0, nd0Var.T);
                        break;
                    } else if (i3 == nd0Var.y) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131745377, null), 0, nd0Var.V);
                        break;
                    } else if (i3 == nd0Var.h) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131750847, null), 0, nd0Var.M);
                        break;
                    } else if (i3 == nd0Var.n) {
                        s5Var.a(org.telegram.messenger.bd.M0(2131745303, null), 0, nd0Var.N);
                        break;
                    }
                } else if (i41 == 1) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view3;
                    r5Var.setTag(Integer.valueOf(i3));
                    if (i3 == nd0Var.E) {
                        r5Var.a(nd0Var.O, org.telegram.messenger.bd.M0(2131744124, null));
                        break;
                    } else if (i3 == nd0Var.F) {
                        r5Var.a(nd0Var.P, org.telegram.messenger.bd.M0(2131744125, null));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) obj2;
                int i42 = d1Var.f;
                if (i42 != 0) {
                    if (i42 == 1 && (textView = zs0Var.m1) != null) {
                        textView.setText(org.telegram.messenger.bd.a0("SharingLiveLocationTitle", null, 2131745402, org.telegram.messenger.bd.G(org.telegram.messenger.ld.g(), "Chats", new Object[0])));
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.q7) d1Var.a).setDialog(org.telegram.ui.Components.zs0.J0(i3 - 1));
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.nw0 nw0Var = (org.telegram.ui.Components.nw0) d1Var.a;
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) obj;
                ArrayList arrayList4 = ow0Var.x;
                String str = arrayList4 == null ? null : ((org.telegram.messenger.hi) arrayList4.get(i3)).a;
                int direction = ow0Var.getDirection();
                nw0Var.a = str;
                if (str == null || !str.startsWith("animated_")) {
                    nw0Var.setImageDrawable(org.telegram.messenger.i6.f(str));
                } else {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable6 = nw0Var.b;
                        if (drawable6 instanceof org.telegram.ui.Components.g5) {
                            if (((org.telegram.ui.Components.g5) drawable6).h() != parseLong) {
                            }
                        }
                        drawable = null;
                        try {
                            nw0Var.setImageDrawable(org.telegram.ui.Components.g5.m(org.telegram.messenger.h10.t0, parseLong, null, nw0Var.f.d()));
                        } catch (Exception unused) {
                            nw0Var.setImageDrawable(drawable);
                            if (nw0Var.d == direction) {
                                return;
                            }
                        }
                    } catch (Exception unused2) {
                        drawable = null;
                    }
                }
                if (nw0Var.d == direction) {
                    nw0Var.d = direction;
                    nw0Var.requestLayout();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) d1Var.a;
                org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj2;
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) m61Var.h.get(i3);
                k61Var.a = j61Var;
                k61Var.setContentDescription(j61Var.b);
                k61Var.setAlpha(1.0f);
                k61Var.requestLayout();
                k61Var.setReordering(m61Var.n0 && (l61Var = m61Var.E) != null && ((org.telegram.ui.Components.y00) l61Var).i(i3));
                break;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i43 = dataAutoDownloadActivity.f;
                org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.H;
                int i44 = d1Var.f;
                View view4 = d1Var.a;
                if (i44 == 0) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view4;
                    i11 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i3 == i11) {
                        q8Var2.setDrawCheckRipple(true);
                        q8Var2.f(org.telegram.messenger.bd.M0(2131753830, null), y5Var.g, false);
                        q8Var2.setTag(Integer.valueOf(y5Var.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6));
                        org.telegram.ui.ActionBar.r6.i(y5Var.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, q8Var2, null);
                        break;
                    }
                } else if (i44 == 2) {
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view4;
                    if (i3 == dataAutoDownloadActivity.r) {
                        n4Var2.setText(org.telegram.messenger.bd.M0(2131753839, null));
                        break;
                    } else if (i3 == dataAutoDownloadActivity.w) {
                        n4Var2.setText(org.telegram.messenger.bd.M0(2131753808, null));
                        break;
                    }
                } else if (i44 == 3) {
                    dataAutoDownloadActivity.r0((org.telegram.ui.Components.ut0) view4);
                    break;
                } else if (i44 == 4) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view4;
                    h5Var.setDrawLine(true);
                    i12 = dataAutoDownloadActivity.photosRow;
                    if (i3 == i12) {
                        M0 = org.telegram.messenger.bd.M0(2131753817, null);
                        i15 = 1;
                    } else {
                        i13 = dataAutoDownloadActivity.videosRow;
                        if (i3 == i13) {
                            M0 = org.telegram.messenger.bd.M0(2131753806, null);
                            i15 = 4;
                        } else {
                            i14 = dataAutoDownloadActivity.storiesRow;
                            if (i3 == i14) {
                                String M03 = org.telegram.messenger.bd.M0(2131753809, null);
                                h5Var.setDrawLine(false);
                                M0 = M03;
                                i15 = -1;
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131753838, null);
                                i15 = 8;
                            }
                        }
                    }
                    if (i43 == 0) {
                        i23 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
                        o10 = org.telegram.messenger.z5.q(i23).n();
                    } else if (i43 == 1) {
                        i17 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
                        o10 = org.telegram.messenger.z5.q(i17).p();
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
                        o10 = org.telegram.messenger.z5.q(i16).o();
                    }
                    long j10 = o10.b[org.telegram.messenger.z5.x(i15)];
                    StringBuilder sb3 = new StringBuilder();
                    i18 = dataAutoDownloadActivity.storiesRow;
                    if (i3 != i18) {
                        i19 = 0;
                        int i45 = 0;
                        while (true) {
                            int[] iArr = o10.a;
                            if (i45 < iArr.length) {
                                if ((iArr[i45] & i15) != 0) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    if (i45 == 0) {
                                        sb3.append(org.telegram.messenger.bd.M0(2131753841, null));
                                    } else if (i45 == 1) {
                                        sb3.append(org.telegram.messenger.bd.M0(2131753814, null));
                                    } else if (i45 == 2) {
                                        sb3.append(org.telegram.messenger.bd.M0(2131753835, null));
                                    } else if (i45 == 3) {
                                        sb3.append(org.telegram.messenger.bd.M0(2131753842, null));
                                    }
                                    i19++;
                                }
                                i45++;
                            } else {
                                if (i19 == 4) {
                                    sb3.setLength(0);
                                    i21 = dataAutoDownloadActivity.photosRow;
                                    if (i3 == i21) {
                                        sb3.append(org.telegram.messenger.bd.M0(2131753826, null));
                                    } else {
                                        sb3.append(org.telegram.messenger.bd.a0("AutoDownloadUpToOnAllChats", null, 2131753807, org.telegram.messenger.g0.i0(j10, false, false)));
                                    }
                                } else if (i19 == 0) {
                                    sb3.append(org.telegram.messenger.bd.M0(2131753828, null));
                                } else {
                                    i20 = dataAutoDownloadActivity.photosRow;
                                    sb2 = i3 == i20 ? new StringBuilder(org.telegram.messenger.bd.a0("AutoDownloadOnFor", null, 2131753825, sb3.toString())) : new StringBuilder(org.telegram.messenger.bd.a0("AutoDownloadOnUpToFor", null, 2131753820, org.telegram.messenger.g0.i0(j10, false, false), sb3.toString()));
                                }
                                sb2 = sb3;
                            }
                        }
                    } else if (o10.e) {
                        sb2 = new StringBuilder(org.telegram.messenger.bd.a0("AutoDownloadOn", null, 2131753827, sb3.toString()));
                        i19 = 1;
                    } else {
                        sb2 = new StringBuilder(org.telegram.messenger.bd.a0("AutoDownloadOff", null, 2131753828, sb3.toString()));
                        i19 = 0;
                    }
                    if (dataAutoDownloadActivity.h) {
                        h5Var.setChecked(i19 != 0);
                    }
                    boolean z14 = i19 != 0;
                    i22 = dataAutoDownloadActivity.storiesRow;
                    h5Var.b(M0, sb2, 0, z14, 0, true, i3 != i22, false);
                    break;
                } else if (i44 == 5) {
                    org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view4;
                    if (i3 == dataAutoDownloadActivity.x) {
                        y8Var2.setText(org.telegram.messenger.bd.M0(2131753843, null));
                        y8Var2.setFixedSize(0);
                        y8Var2.setImportantForAccessibility(1);
                        break;
                    } else if (i3 == dataAutoDownloadActivity.n) {
                        if (dataAutoDownloadActivity.r == -1) {
                            if (i43 == 0) {
                                y8Var2.setText(org.telegram.messenger.bd.M0(2131753823, null));
                            } else if (i43 == 1) {
                                y8Var2.setText(org.telegram.messenger.bd.M0(2131753818, null));
                            } else if (i43 == 2) {
                                y8Var2.setText(org.telegram.messenger.bd.M0(2131753821, null));
                            }
                            y8Var2.setImportantForAccessibility(1);
                            break;
                        } else {
                            y8Var2.setText(null);
                            y8Var2.setFixedSize(12);
                            y8Var2.setImportantForAccessibility(4);
                            break;
                        }
                    }
                }
                break;
            case 9:
                G(d1Var, i3);
                break;
            case 10:
                zd0 zd0Var = (zd0) obj2;
                int i46 = d1Var.f;
                View view5 = d1Var.a;
                if (i46 == 0) {
                    org.telegram.ui.Cells.n4 n4Var3 = (org.telegram.ui.Cells.n4) view5;
                    if (i3 == 0) {
                        n4Var3.setText(org.telegram.messenger.bd.M0(2131754270, null));
                        break;
                    }
                } else if (i46 == 1) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view5;
                    if (i3 == zd0Var.c) {
                        x8Var.b(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131754468, null), org.telegram.messenger.bd.M0(2131754467, null), true);
                        break;
                    } else if (i3 == zd0Var.d) {
                        x8Var.b(R.drawable.msg_permissions, org.telegram.messenger.bd.M0(2131745531, null), org.telegram.messenger.bd.M0(2131745530, null), true);
                        break;
                    } else if (i3 == zd0Var.e) {
                        x8Var.b(R.drawable.msg_clearcache, org.telegram.messenger.bd.M0(2131752098, null), org.telegram.messenger.bd.M0(2131752094, null), true);
                        break;
                    } else if (i3 == zd0Var.f) {
                        x8Var.b(R.drawable.msg_newphone, org.telegram.messenger.bd.M0(2131752537, null), org.telegram.messenger.bd.M0(2131752536, null), true);
                        break;
                    } else if (i3 == zd0Var.h) {
                        x8Var.b(R.drawable.msg_help, org.telegram.messenger.bd.M0(2131751783, null), org.telegram.messenger.bd.M0(2131751782, null), false);
                        break;
                    }
                } else if (i46 == 3) {
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view5;
                    if (i3 == zd0Var.r) {
                        org.telegram.ui.ActionBar.r6.V(v9Var2.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                        v9Var2.b(org.telegram.messenger.bd.M0(2131748749, null), false);
                        break;
                    }
                } else if (i46 == 4) {
                    org.telegram.ui.Cells.y8 y8Var3 = (org.telegram.ui.Cells.y8) view5;
                    if (i3 == zd0Var.s) {
                        y8Var3.setText(org.telegram.messenger.bd.M0(2131748750, null));
                        break;
                    }
                }
                break;
            case 11:
                H(d1Var, i3);
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj2;
                int i47 = d1Var.f;
                View view6 = d1Var.a;
                if (i47 == 0) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view6;
                    i24 = passcodeActivity.fingerprintRow;
                    if (i3 == i24) {
                        q8Var3.f(org.telegram.messenger.bd.M0(2131743883, null), org.telegram.messenger.az.D, false);
                        break;
                    } else if (i3 == passcodeActivity.O) {
                        q8Var3.f(org.telegram.messenger.bd.M0(2131745851, null), org.telegram.messenger.az.A, false);
                        break;
                    } else if (i3 == passcodeActivity.L) {
                        String M04 = org.telegram.messenger.bd.M0(2131743176, null);
                        i26 = ((org.telegram.ui.ActionBar.d2) passcodeActivity).currentAccount;
                        if (org.telegram.ui.Wallet.k0.x(i26).e()) {
                            i27 = ((org.telegram.ui.ActionBar.d2) passcodeActivity).currentAccount;
                            break;
                        }
                        r9 = false;
                        q8Var3.f(M04, r9, false);
                        break;
                    } else if (i3 == passcodeActivity.K) {
                        String M05 = org.telegram.messenger.bd.M0(2131743175, null);
                        i25 = ((org.telegram.ui.ActionBar.d2) passcodeActivity).currentAccount;
                        q8Var3.f(M05, org.telegram.ui.Wallet.k0.x(i25).K(), false);
                        break;
                    }
                } else if (i47 == 1) {
                    org.telegram.ui.Cells.v9 v9Var3 = (org.telegram.ui.Cells.v9) view6;
                    i28 = passcodeActivity.changePasscodeRow;
                    if (i3 == i28) {
                        v9Var3.b(org.telegram.messenger.bd.M0(2131752544, null), true);
                        if (org.telegram.messenger.az.s.isEmpty()) {
                            int i48 = org.telegram.ui.ActionBar.k6.E6;
                            v9Var3.setTag(Integer.valueOf(i48));
                            org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), i48, null);
                            break;
                        } else {
                            int i49 = org.telegram.ui.ActionBar.k6.G6;
                            v9Var3.setTag(Integer.valueOf(i49));
                            org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), i49, null);
                            break;
                        }
                    } else {
                        i29 = passcodeActivity.autoLockRow;
                        if (i3 == i29) {
                            int i50 = org.telegram.messenger.az.y;
                            v9Var3.c(org.telegram.messenger.bd.M0(2131753800, null), i50 == 0 ? org.telegram.messenger.bd.a0("AutoLockDisabled", null, 2131753799, new Object[0]) : i50 < 3600 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(i50 / 60, "Minutes", new Object[0])) : i50 < 86400 ? org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G((int) Math.ceil((i50 / 60.0f) / 60.0f), "Hours", new Object[0])) : org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G((int) Math.ceil(((i50 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                            int i51 = org.telegram.ui.ActionBar.k6.G6;
                            v9Var3.setTag(Integer.valueOf(i51));
                            org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), i51, null);
                            break;
                        } else {
                            i30 = passcodeActivity.disablePasscodeRow;
                            if (i3 == i30) {
                                v9Var3.b(org.telegram.messenger.bd.M0(2131751434, null), false);
                                int i52 = org.telegram.ui.ActionBar.k6.q7;
                                v9Var3.setTag(Integer.valueOf(i52));
                                org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), i52, null);
                                break;
                            }
                        }
                    }
                } else if (i47 == 2) {
                    org.telegram.ui.Cells.y8 y8Var4 = (org.telegram.ui.Cells.y8) view6;
                    if (i3 == passcodeActivity.H) {
                        y8Var4.setText(org.telegram.messenger.bd.M0(2131747663, null));
                        y8Var4.setBackground(null);
                        y8Var4.getTextView().setGravity(1);
                        break;
                    } else if (i3 == passcodeActivity.I) {
                        y8Var4.setText(org.telegram.messenger.bd.M0(2131753797, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        break;
                    } else if (i3 == passcodeActivity.M) {
                        y8Var4.setText(org.telegram.messenger.bd.M0(2131743088, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        break;
                    } else if (i3 == passcodeActivity.P) {
                        y8Var4.setText(org.telegram.messenger.bd.M0(2131745852, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        break;
                    }
                } else if (i47 == 3) {
                    org.telegram.ui.Cells.n4 n4Var4 = (org.telegram.ui.Cells.n4) view6;
                    n4Var4.setHeight(46);
                    if (i3 == passcodeActivity.N) {
                        n4Var4.setText(org.telegram.messenger.bd.M0(2131745853, null));
                        break;
                    } else if (i3 == passcodeActivity.J) {
                        n4Var4.setText(org.telegram.messenger.bd.M0(2131743089, null));
                        break;
                    }
                } else if (i47 == 4) {
                    hi0 hi0Var = (hi0) view6;
                    hi0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    hi0Var.a.d();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) d1Var.a;
                hm0 hm0Var = (hm0) obj2;
                v5Var.setAlbumsCount(hm0Var.f);
                while (true) {
                    int i53 = hm0Var.f;
                    if (i32 >= i53) {
                        v5Var.requestLayout();
                        break;
                    } else {
                        int i54 = (i53 * i3) + i32;
                        if (i54 < hm0Var.d.size()) {
                            v5Var.a(i32, (org.telegram.messenger.pe) hm0Var.d.get(i54));
                        } else {
                            v5Var.a(i32, null);
                        }
                        i32++;
                    }
                }
            case 14:
                I(d1Var, i3);
                break;
            case 15:
                J(d1Var, i3);
                break;
            case 16:
                K(d1Var, i3);
                break;
            case 17:
                L(d1Var, i3);
                break;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj2;
                if (d1Var.f == 0) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
                    t2Var.t2 = i3 != arrayList5.size() - 1;
                    t2Var.setDialog((org.telegram.ui.Cells.o2) arrayList5.get(i3));
                    break;
                }
                break;
            default:
                View view7 = d1Var.a;
                qg.a aVar = (qg.a) ((qg.h) obj2).F.get(i3);
                int i55 = aVar.b;
                org.telegram.ui.Components.j6 j6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c2 = o1.g.c(i55);
                if (c2 == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) view7;
                    m1Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                    m1Var.a(0, charSequence);
                    break;
                } else if (c2 == 1) {
                    org.telegram.ui.Cells.n4 n4Var5 = (org.telegram.ui.Cells.n4) view7;
                    n4Var5.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false));
                    n4Var5.setText(charSequence);
                    break;
                } else if (c2 == 2) {
                    qg.g gVar = (qg.g) view7;
                    gVar.f = charSequence.toString();
                    gVar.d = ((Float) j6Var.get(null)).floatValue();
                    gVar.b = aVar.d;
                    gVar.c = aVar.e;
                    gVar.e = j6Var;
                    gVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public void v(u4.d1 d1Var, int i3, List list) {
        int i10;
        boolean contains;
        switch (this.c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 == 5 && !list.isEmpty()) {
                    fx0 fx0Var = (fx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i3 - proxyListActivity.n))) != fx0Var.h) {
                        fx0Var.h = contains;
                        fx0Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        fx0Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (d1Var.f != 3 || !list.contains(0)) {
                    t(d1Var, i3);
                    break;
                } else {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    i10 = proxyListActivity.useProxyRow;
                    if (i3 != i10) {
                        if (i3 == proxyListActivity.w) {
                            q8Var.setChecked(org.telegram.messenger.az.a1);
                            break;
                        }
                    } else {
                        q8Var.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.v(d1Var, i3, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.telegram.ui.Components.tm] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        View n4Var;
        View view;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout;
        View view2;
        View view3;
        View n4Var2;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        View q8Var;
        ViewGroup viewGroup2;
        View x6Var;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        int i10 = this.c;
        int i11 = 16;
        Object obj = this.e;
        int i12 = 3;
        final int i13 = 0;
        final int i14 = 2;
        final int i15 = 1;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                if (i3 == 0) {
                    y8Var = new org.telegram.ui.Cells.n4(context);
                } else if (i3 == 1) {
                    y8Var = new org.telegram.ui.Cells.q8(context);
                } else if (i3 == 2) {
                    org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                    v9Var.setCanDisable(true);
                    y8Var = v9Var;
                } else {
                    y8Var = new org.telegram.ui.Cells.y8(context);
                }
                y8Var.setLayoutParams(new u4.p0(-1, -2));
                return new org.telegram.ui.Components.bj0(y8Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) obj;
                boolean z10 = anVar.n;
                org.telegram.ui.ActionBar.e6 e6Var6 = anVar.a;
                switch (i3) {
                    case 0:
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, anVar.a);
                        break;
                    case 1:
                        View x6Var2 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
                        new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var6)), org.telegram.ui.ActionBar.k6.Y0(context2, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7)).x = true;
                        n4Var = x6Var2;
                        break;
                    case 2:
                        n4Var = new org.telegram.ui.Cells.y8(context2, e6Var6);
                        break;
                    case 3:
                        n4Var = new org.telegram.ui.Cells.l8(context2, e6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.vm vmVar = new org.telegram.ui.Components.vm(this, (Context) obj2, anVar.J ? 1 : 0, anVar.a, i3);
                        if (i3 == 11 && !z10) {
                            vmVar.setTextRight(98);
                            vmVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tm
                                public final /* synthetic */ org.telegram.ui.n4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i13) {
                                        case 0:
                                            an.S((an) this.b.e, -2);
                                            break;
                                        case 1:
                                            an.S((an) this.b.e, -3);
                                            break;
                                        default:
                                            ((an) this.b.e).c0(view4, (org.telegram.ui.Cells.z5) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        vmVar.c();
                        vmVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                        vmVar.b(new org.telegram.ui.Components.wm(this, vmVar, i3));
                        n4Var = vmVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.ym ymVar = new org.telegram.ui.Components.ym(this, (Context) obj2, anVar.J ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tm
                            public final /* synthetic */ org.telegram.ui.n4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                switch (i14) {
                                    case 0:
                                        an.S((an) this.b.e, -2);
                                        break;
                                    case 1:
                                        an.S((an) this.b.e, -3);
                                        break;
                                    default:
                                        ((an) this.b.e).c0(view4, (org.telegram.ui.Cells.z5) view4.getParent(), true);
                                        break;
                                }
                            }
                        }, anVar.a);
                        if (!z10) {
                            ymVar.setTextRight(org.telegram.messenger.hs.W1);
                            ymVar.a().setOnClickListener(new org.telegram.ui.Components.q2(7, this, ymVar));
                        }
                        int i16 = org.telegram.ui.ActionBar.k6.o7;
                        ymVar.setIconsColor(i16);
                        org.telegram.ui.Components.wo woVar = ymVar.r;
                        if (woVar != null) {
                            woVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                            float f10 = ymVar.a.e;
                            if (checkBoxBase.w != f10) {
                                checkBoxBase.w = f10;
                                checkBoxBase.b();
                            }
                        }
                        ymVar.getCheckBox().b(-1, i16, org.telegram.ui.ActionBar.k6.k7);
                        ymVar.b(new ai.a0(11, this, ymVar));
                        ymVar.setShowNextButton(true);
                        EditTextBoldCursor textView = ymVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(i14, this, ymVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.um(ymVar, i13));
                        n4Var = ymVar;
                        break;
                    case 6:
                        n4Var = new org.telegram.ui.Cells.q8(context2, e6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.xm xmVar = new org.telegram.ui.Components.xm(this, context2, anVar.J ? 1 : 0);
                        xmVar.c();
                        if (!z10) {
                            xmVar.setTextRight(98);
                            xmVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tm
                                public final /* synthetic */ org.telegram.ui.n4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i15) {
                                        case 0:
                                            an.S((an) this.b.e, -2);
                                            break;
                                        case 1:
                                            an.S((an) this.b.e, -3);
                                            break;
                                        default:
                                            ((an) this.b.e).c0(view4, (org.telegram.ui.Cells.z5) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        xmVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                        xmVar.b(new ai.a0(10, this, xmVar));
                        n4Var = xmVar;
                        break;
                    case 8:
                        View smVar = new org.telegram.ui.Components.sm(context2, 0);
                        smVar.setTag(-33024);
                        view = smVar;
                        n4Var = view;
                        break;
                    case 9:
                        View x2Var = new ai.x2(i11, context2, this);
                        x2Var.setTag(-33024);
                        view = x2Var;
                        n4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, e6Var6);
                        x5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        n4Var = x5Var;
                        break;
                }
                return k2.p1.p(n4Var, n4Var, -1, -2);
            case 2:
                return new org.telegram.ui.Components.bj0(new org.telegram.ui.Components.zy((org.telegram.ui.Components.bz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(0, (Context) obj2, null);
                m2Var.setBackground(null);
                m2Var.setLayoutParams(new u4.p0(-1, -2));
                return new org.telegram.ui.Components.bj0(m2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i3 == 0) {
                    org.telegram.ui.ActionBar.e6 e6Var7 = ((org.telegram.ui.Components.nd0) obj).J0;
                    org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context3);
                    s5Var.e = new mi.b0(s5Var, 19);
                    TextView textView2 = new TextView(context3);
                    s5Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    s5Var.addView(textView2, b8.mf.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    s5Var.b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.ng, e6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    s5Var.addView(textView3, b8.mf.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(context3);
                    Paint paint = new Paint();
                    cd0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    cd0Var.b = paint2;
                    cd0Var.c = org.telegram.messenger.g0.L(16.0f);
                    cd0Var.d = 0;
                    cd0Var.e = 0.0f;
                    cd0Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    s5Var.c = cd0Var;
                    s5Var.addView(cd0Var, b8.mf.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    s5Var.setSeekBarDelegate(new org.telegram.ui.Components.zw(this, 11));
                    r5Var = s5Var;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.ga0(this, i12));
                    r5Var = r5Var2;
                }
                return new org.telegram.ui.Components.bj0(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) obj;
                if (i3 != 0) {
                    FrameLayout d2Var = new ai.d2(context4, 21);
                    d2Var.setWillNotDraw(false);
                    zs0Var.m1 = new TextView(context4);
                    org.telegram.ui.ActionBar.r6.V(zs0Var.m1, org.telegram.ui.ActionBar.k6.J5, zs0Var.J0);
                    zs0Var.m1.setTextSize(1, 14.0f);
                    zs0Var.m1.setGravity(17);
                    zs0Var.m1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    d2Var.addView(zs0Var.m1, b8.mf.c(40.0f, -1));
                    frameLayout = d2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q7(54, context4, zs0Var.J0, false);
                }
                return new org.telegram.ui.Components.bj0(frameLayout);
            case 6:
                return new org.telegram.ui.Components.bj0(new org.telegram.ui.Components.nw0((org.telegram.ui.Components.ow0) obj, ((org.telegram.ui.Components.ow0) obj2).getContext()));
            case 7:
                return new org.telegram.ui.Components.bj0(new org.telegram.ui.Components.k61((org.telegram.ui.Components.m61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i3 == 0) {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context5);
                    q8Var2.d(org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                    q8Var2.setTypeface(org.telegram.messenger.g0.o());
                    q8Var2.setHeight(56);
                    view2 = q8Var2;
                } else if (i3 == 1) {
                    view2 = new org.telegram.ui.Cells.x6(context5, (org.telegram.ui.Cells.f1) null);
                } else if (i3 == 2) {
                    view2 = new org.telegram.ui.Cells.n4(context5);
                } else if (i3 != 3) {
                    view2 = i3 != 4 ? new org.telegram.ui.Cells.y8(context5) : new org.telegram.ui.Cells.h5(context5);
                } else {
                    org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context5, null);
                    ut0Var.setCallback(new ur(this, i12));
                    view2 = ut0Var;
                }
                return k2.p1.p(view2, view2, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                View l8Var = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? new org.telegram.ui.Cells.l8(context6) : new org.telegram.ui.Cells.h5(context6) : new org.telegram.ui.Cells.y8(context6) : new org.telegram.ui.Cells.q8(context6) : new org.telegram.ui.Cells.n4(context6, 22) : new org.telegram.ui.Cells.v9(context6) : new org.telegram.ui.Cells.x6(context6, (org.telegram.ui.Cells.f1) null);
                return k2.p1.p(l8Var, l8Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i3 == 0) {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var3, null);
                    view3 = n4Var3;
                } else if (i3 == 1) {
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context7);
                    x8Var.setMultilineDetail(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x8Var, null);
                    view3 = x8Var;
                } else if (i3 == 2) {
                    view3 = new org.telegram.ui.Cells.x6(context7, (org.telegram.ui.Cells.f1) null);
                } else if (i3 != 3) {
                    view3 = new org.telegram.ui.Cells.y8(context7);
                } else {
                    View v9Var2 = new org.telegram.ui.Cells.v9(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, v9Var2, null);
                    view3 = v9Var2;
                }
                return k2.p1.p(view3, view3, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i3 == 0) {
                    e6Var = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, e6Var);
                } else if (i3 == 1) {
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.q8(context8, e6Var2);
                } else if (i3 == 2) {
                    n4Var2 = new org.telegram.ui.Cells.x8(context8);
                } else if (i3 == 3) {
                    e6Var3 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, e6Var3);
                } else if (i3 == 4) {
                    n4Var2 = new org.telegram.ui.Cells.x6(context8, (org.telegram.ui.Cells.f1) null);
                } else if (i3 != 5) {
                    e6Var5 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.y8(context8, e6Var5);
                } else {
                    e6Var4 = ((org.telegram.ui.ActionBar.d2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.v9(0, context8, e6Var4);
                }
                return new org.telegram.ui.Components.bj0(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i3 == 0) {
                    q8Var = new org.telegram.ui.Cells.q8(context9);
                } else if (i3 == 1) {
                    q8Var = new org.telegram.ui.Cells.v9(context9);
                } else if (i3 == 3) {
                    q8Var = new org.telegram.ui.Cells.n4(context9);
                } else if (i3 != 4) {
                    q8Var = new org.telegram.ui.Cells.y8(context9);
                } else {
                    q8Var = new hi0(context9);
                    q8Var.setTag(-33024);
                }
                return new org.telegram.ui.Components.bj0(q8Var);
            case 13:
                Context context10 = (Context) obj2;
                org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context10);
                v5Var.e = new Paint();
                v5Var.b = new org.telegram.messenger.pe[4];
                v5Var.a = new org.telegram.ui.Cells.t5[4];
                while (i13 < 4) {
                    v5Var.a[i13] = new org.telegram.ui.Cells.t5(v5Var, context10);
                    v5Var.addView(v5Var.a[i13]);
                    v5Var.a[i13].setVisibility(4);
                    v5Var.a[i13].setTag(Integer.valueOf(i13));
                    v5Var.a[i13].setOnClickListener(new org.telegram.ui.Cells.a(v5Var, 9));
                    i13++;
                }
                v5Var.setDelegate(new ci0(this, i14));
                return new org.telegram.ui.Components.bj0(v5Var);
            case 14:
                sm0 sm0Var = (sm0) obj;
                boolean z11 = sm0Var.s0;
                Context context11 = (Context) obj2;
                if (i3 == 0) {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new qm0(this));
                    q5Var.getCheckFrame().setVisibility(sm0Var.U == 0 ? 0 : 8);
                    viewGroup2 = q5Var;
                } else if (i3 == 1) {
                    ViewGroup frameLayout4 = new FrameLayout(context11);
                    frameLayout4.setLayoutParams(new u4.p0(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout4.addView(radialProgressView, b8.mf.c(-1.0f, -1));
                    viewGroup2 = frameLayout4;
                } else if (i3 == 2) {
                    viewGroup2 = new org.telegram.ui.Cells.g7(1, context11, null);
                } else if (i3 != 3) {
                    org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                    e3Var.setForceDarkTheme(z11);
                    viewGroup2 = e3Var;
                } else {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context11, true);
                    l8Var2.setLayoutParams(new u4.p0(-1, -2));
                    viewGroup2 = l8Var2;
                    if (z11) {
                        org.telegram.ui.ActionBar.r6.Y(l8Var2.a, sm0Var.w0, null);
                        org.telegram.ui.ActionBar.r6.t(l8Var2.e, org.telegram.ui.ActionBar.k6.fh, null, PorterDuff.Mode.MULTIPLY);
                        viewGroup2 = l8Var2;
                    }
                }
                return new org.telegram.ui.Components.bj0(viewGroup2);
            case 15:
                Context context12 = (Context) obj2;
                org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context12);
                new Paint();
                w5Var.setWillNotDraw(false);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context12);
                w5Var.a = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                w5Var.addView(k9Var, b8.mf.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(context12);
                w5Var.b = frameLayout5;
                w5Var.addView(frameLayout5, b8.mf.e(42, 42, 53));
                ci.t4 t4Var = new ci.t4(context12);
                t4Var.d = new Path();
                t4Var.e = new float[8];
                t4Var.b = new RectF();
                t4Var.c = new Paint(1);
                w5Var.e = t4Var;
                t4Var.setWillNotDraw(false);
                t4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                w5Var.addView(t4Var, b8.mf.e(-1, 16, 83));
                t4Var.addView(org.telegram.messenger.camera.q.e(context12, R.drawable.ic_video), b8.mf.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                w5Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                t4Var.addView(textView4, b8.mf.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(24, context12, null);
                w5Var.c = woVar2;
                woVar2.setDrawBackgroundAsArc(11);
                woVar2.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
                w5Var.addView(woVar2, b8.mf.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                woVar2.setVisibility(0);
                w5Var.setFocusable(true);
                frameLayout5.setOnClickListener(new b40(this, 21));
                return new org.telegram.ui.Components.bj0(w5Var);
            case 16:
                Context context13 = (Context) obj2;
                if (i3 == 0) {
                    x6Var = new org.telegram.ui.Cells.x6(context13, (org.telegram.ui.Cells.f1) null);
                } else if (i3 == 1) {
                    x6Var = new org.telegram.ui.Cells.v9(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x6Var, null);
                } else if (i3 == 2) {
                    x6Var = new org.telegram.ui.Cells.n4(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x6Var, null);
                } else if (i3 == 3) {
                    x6Var = new org.telegram.ui.Cells.q8(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x6Var, null);
                } else if (i3 == 4) {
                    x6Var = new org.telegram.ui.Cells.y8(context13);
                } else if (i3 != 6) {
                    x6Var = new fx0((ProxyListActivity) obj, context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x6Var, null);
                } else {
                    x6Var = new org.telegram.ui.Components.ut0(context13, null);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, x6Var, null);
                }
                return k2.p1.p(x6Var, x6Var, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i3 == 0) {
                    frameLayout2 = new org.telegram.ui.Cells.n4(context14);
                } else if (i3 == 1) {
                    frameLayout2 = new org.telegram.ui.Cells.q8(context14);
                } else if (i3 == 2) {
                    org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context14);
                    v9Var3.setCanDisable(true);
                    frameLayout2 = v9Var3;
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.y8(context14);
                }
                frameLayout2.setLayoutParams(new u4.p0(-1, -2));
                return new org.telegram.ui.Components.bj0(frameLayout2);
            case 18:
                Context context15 = (Context) obj2;
                View t2Var = i3 == 0 ? new org.telegram.ui.Cells.t2(context15, false) : new org.telegram.ui.Cells.t4(context15);
                t2Var.setLayoutParams(new u4.p0(-1, -2));
                return new org.telegram.ui.Components.bj0(t2Var);
            default:
                Context context16 = (Context) obj2;
                int c2 = o1.g.c(o1.g.d(3)[i3]);
                if (c2 == 1) {
                    frameLayout3 = new org.telegram.ui.Cells.n4(context16);
                } else if (c2 != 2) {
                    frameLayout3 = new org.telegram.ui.ActionBar.m1(context16, null);
                } else {
                    qg.g gVar = new qg.g(context16);
                    gVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    gVar.h = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context16);
                    gVar.a = pm0Var;
                    pm0Var.setReportChanges(true);
                    pm0Var.setDelegate(new org.telegram.ui.Components.i9(gVar, 14));
                    pm0Var.setImportantForAccessibility(2);
                    gVar.addView(pm0Var, b8.mf.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout3 = gVar;
                }
                frameLayout3.setLayoutParams(new u4.p0(-1, -2));
                return new org.telegram.ui.Components.bj0(frameLayout3);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        int i3;
        int i10 = this.c;
        Object obj = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) obj;
                th.d dVar = anVar.n1;
                boolean z10 = anVar.n;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 != 4) {
                    if (i11 != 11) {
                        if (i11 != 5) {
                            if (i11 == 7) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                z5Var.setTag(1);
                                CharSequence charSequence = anVar.Q;
                                z5Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.bd.M0(2131754474, null), false);
                                z5Var.setTag(null);
                                if (!z10) {
                                    z5Var.e.b(dVar.b(-3), false);
                                }
                                org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                                break;
                            }
                        } else {
                            int b10 = d1Var.b();
                            org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                            z5Var2.setTag(1);
                            z5Var2.a.a(anVar.c0, false);
                            int i12 = b10 - anVar.u0;
                            z5Var2.n(anVar.L[i12], org.telegram.messenger.bd.M0(z10 ? 2131744065 : 2131747782, null), true);
                            z5Var2.setTag(null);
                            if (anVar.l0 == b10) {
                                EditTextBoldCursor textView = z5Var2.getTextView();
                                textView.requestFocus();
                                org.telegram.messenger.g0.K3(textView);
                                anVar.l0 = -1;
                            }
                            if (!z10) {
                                z5Var2.e.b(dVar.b(i12), false);
                            }
                            org.telegram.ui.Components.an.P(anVar, view, b10);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
                        z5Var3.setTag(1);
                        CharSequence charSequence2 = anVar.P;
                        z5Var3.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.bd.M0(2131746457, null), false);
                        z5Var3.setTag(null);
                        z5Var3.e.b(dVar.b(-2), false);
                        org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.z5 z5Var4 = (org.telegram.ui.Cells.z5) view;
                    z5Var4.setTag(1);
                    CharSequence charSequence3 = anVar.O;
                    z5Var4.n(charSequence3 != null ? charSequence3 : "", org.telegram.messenger.bd.M0(z10 ? 2131744063 : 2131746456, null), true);
                    z5Var4.setTag(null);
                    org.telegram.ui.Components.an.P(anVar, view, d1Var.b());
                    break;
                }
                break;
            case 9:
                if (d1Var.f == 3) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) d1Var.a;
                    int b11 = d1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 != dataSettingsActivity.F) {
                        if (b11 != dataSettingsActivity.E) {
                            if (b11 != dataSettingsActivity.G) {
                                if (b11 != dataSettingsActivity.H) {
                                    if (b11 != dataSettingsActivity.K) {
                                        if (b11 == dataSettingsActivity.L) {
                                            int i13 = org.telegram.messenger.az.a;
                                            q8Var.setChecked(org.telegram.messenger.lc.e(1024));
                                            break;
                                        }
                                    } else {
                                        int i14 = org.telegram.messenger.az.a;
                                        q8Var.setChecked(org.telegram.messenger.lc.e(2048));
                                        break;
                                    }
                                } else {
                                    q8Var.setChecked(org.telegram.messenger.az.D0);
                                    break;
                                }
                            } else {
                                q8Var.setChecked(org.telegram.messenger.az.C0);
                                break;
                            }
                        } else {
                            q8Var.setChecked(org.telegram.messenger.az.B0);
                            break;
                        }
                    } else {
                        q8Var.setChecked(org.telegram.messenger.az.E0);
                        break;
                    }
                }
                break;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (d1Var.f == 3) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) d1Var.a;
                    int b12 = d1Var.b();
                    i3 = proxyListActivity.useProxyRow;
                    if (b12 != i3) {
                        if (b12 == proxyListActivity.w) {
                            q8Var2.setChecked(org.telegram.messenger.az.a1);
                            break;
                        }
                    } else {
                        q8Var2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // u4.h0
    public void z(u4.d1 d1Var) {
        switch (this.c) {
            case 1:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.e;
                int i3 = d1Var.f;
                if (i3 == 4 || i3 == 11 || i3 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) d1Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (anVar.J) {
                            org.telegram.ui.Components.rm rmVar = anVar.y;
                            if (rmVar != null) {
                                rmVar.f();
                            }
                            anVar.e0(true);
                        }
                        anVar.h1 = null;
                        textView.clearFocus();
                        org.telegram.messenger.g0.v1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public n4(qg.h hVar, LaunchActivity launchActivity) {
        this.c = 19;
        this.e = hVar;
        this.d = launchActivity;
    }

    public n4(Context context) {
        this.c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.a = org.telegram.messenger.bd.M0(2131744181, null);
        o2Var.b = org.telegram.messenger.bd.M0(2131744173, null);
        o2Var.c = 0;
        o2Var.d = 0;
        o2Var.e = true;
        o2Var.f = false;
        o2Var.g = 0;
        o2Var.h = currentTimeMillis;
        o2Var.i = false;
        o2Var.j = false;
        o2Var.k = 2;
        arrayList.add(o2Var);
        org.telegram.ui.Cells.o2 o2Var2 = new org.telegram.ui.Cells.o2();
        o2Var2.a = org.telegram.messenger.bd.M0(2131744180, null);
        o2Var2.b = org.telegram.messenger.bd.M0(2131744172, null);
        o2Var2.c = 1;
        o2Var2.d = 2;
        o2Var2.e = false;
        o2Var2.f = false;
        o2Var2.g = 0;
        o2Var2.h = currentTimeMillis - 3600;
        o2Var2.i = false;
        o2Var2.j = false;
        o2Var2.k = -1;
        arrayList.add(o2Var2);
        org.telegram.ui.Cells.o2 o2Var3 = new org.telegram.ui.Cells.o2();
        o2Var3.a = org.telegram.messenger.bd.M0(2131744179, null);
        o2Var3.b = org.telegram.messenger.bd.M0(2131744171, null);
        o2Var3.c = 2;
        o2Var3.d = 3;
        o2Var3.e = false;
        o2Var3.f = true;
        o2Var3.g = 0;
        o2Var3.h = currentTimeMillis - 7200;
        o2Var3.i = false;
        o2Var3.j = true;
        o2Var3.k = -1;
        arrayList.add(o2Var3);
        org.telegram.ui.Cells.o2 o2Var4 = new org.telegram.ui.Cells.o2();
        o2Var4.a = org.telegram.messenger.bd.M0(2131744178, null);
        o2Var4.b = org.telegram.messenger.bd.M0(2131744170, null);
        o2Var4.c = 3;
        o2Var4.d = 0;
        o2Var4.e = false;
        o2Var4.f = false;
        o2Var4.g = 2;
        o2Var4.h = currentTimeMillis - 10800;
        o2Var4.i = false;
        o2Var4.j = false;
        o2Var4.k = -1;
        arrayList.add(o2Var4);
        org.telegram.ui.Cells.o2 o2Var5 = new org.telegram.ui.Cells.o2();
        o2Var5.a = org.telegram.messenger.bd.M0(2131744177, null);
        o2Var5.b = org.telegram.messenger.bd.M0(2131744169, null);
        o2Var5.c = 4;
        o2Var5.d = 0;
        o2Var5.e = false;
        o2Var5.f = false;
        o2Var5.g = 1;
        o2Var5.h = currentTimeMillis - 14400;
        o2Var5.i = false;
        o2Var5.j = false;
        o2Var5.k = 2;
        arrayList.add(o2Var5);
        org.telegram.ui.Cells.o2 o2Var6 = new org.telegram.ui.Cells.o2();
        o2Var6.a = org.telegram.messenger.bd.M0(2131744176, null);
        o2Var6.b = org.telegram.messenger.bd.M0(2131744168, null);
        o2Var6.c = 5;
        o2Var6.d = 0;
        o2Var6.e = false;
        o2Var6.f = false;
        o2Var6.g = 0;
        o2Var6.h = currentTimeMillis - 18000;
        o2Var6.i = false;
        o2Var6.j = false;
        o2Var6.k = -1;
        arrayList.add(o2Var6);
        org.telegram.ui.Cells.o2 o2Var7 = new org.telegram.ui.Cells.o2();
        o2Var7.a = org.telegram.messenger.bd.M0(2131744175, null);
        o2Var7.b = org.telegram.messenger.bd.M0(2131744167, null);
        o2Var7.c = 6;
        o2Var7.d = 0;
        o2Var7.e = false;
        o2Var7.f = false;
        o2Var7.g = 0;
        o2Var7.h = currentTimeMillis - 21600;
        o2Var7.i = true;
        o2Var7.j = false;
        o2Var7.k = -1;
        arrayList.add(o2Var7);
        org.telegram.ui.Cells.o2 o2Var8 = new org.telegram.ui.Cells.o2();
        o2Var8.a = org.telegram.messenger.bd.M0(2131744174, null);
        o2Var8.b = org.telegram.messenger.bd.M0(2131744166, null);
        o2Var8.c = 0;
        o2Var8.d = 0;
        o2Var8.e = false;
        o2Var8.f = false;
        o2Var8.g = 0;
        o2Var8.h = currentTimeMillis - 25200;
        o2Var8.i = true;
        o2Var8.j = false;
        o2Var8.k = -1;
        arrayList.add(o2Var8);
    }

    public n4(ProxyListActivity proxyListActivity, Context context) {
        this.c = 16;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
