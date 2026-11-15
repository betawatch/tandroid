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
import android.os.Build;
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
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l4 extends org.telegram.ui.Components.tj0 {
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
    private final void G(v4.e1 e1Var, int i7) {
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
        int i28 = e1Var.f;
        View view = e1Var.a;
        boolean z16 = true;
        int i29 = 0;
        switch (i28) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                v9Var.setCanDisable(false);
                org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
                i10 = dataSettingsActivity.useLessDataForCallsRow;
                if (i7 != i10) {
                    i11 = dataSettingsActivity.proxyRow;
                    if (i7 != i11) {
                        i12 = dataSettingsActivity.resetDownloadRow;
                        if (i7 != i12) {
                            i13 = dataSettingsActivity.clearDraftsRow;
                            if (i7 == i13) {
                                v9Var.setIcon(0);
                                v9Var.b(org.telegram.messenger.hd.M0(2131746841, null), false);
                                break;
                            }
                        } else {
                            v9Var.setIcon(0);
                            v9Var.setCanDisable(true);
                            org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
                            v9Var.b(org.telegram.messenger.hd.M0(2131746111, null), false);
                            break;
                        }
                    } else {
                        v9Var.setIcon(0);
                        v9Var.b(org.telegram.messenger.hd.M0(2131746601, null), false);
                        break;
                    }
                } else {
                    v9Var.setIcon(0);
                    int i30 = org.telegram.messenger.np.e1().getInt("VoipDataSaving", org.telegram.ui.Components.voip.c2.c());
                    if (i30 == 0) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743795, null);
                    } else if (i30 == 1) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743794, null);
                    } else if (i30 == 2) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743796, null);
                    } else if (i30 != 3) {
                        M0 = null;
                        str = null;
                    } else {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743793, null);
                    }
                    v9Var.c(org.telegram.messenger.hd.M0(2131743229, str), M0, dataSettingsActivity.V, true);
                    dataSettingsActivity.V = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != dataSettingsActivity.d) {
                    if (i7 != 0) {
                        if (i7 != dataSettingsActivity.N) {
                            if (i7 != dataSettingsActivity.P) {
                                if (i7 != dataSettingsActivity.y) {
                                    if (i7 != dataSettingsActivity.J) {
                                        if (i7 == dataSettingsActivity.S) {
                                            n4Var.setText(org.telegram.messenger.hd.M0(2131745918, null));
                                            break;
                                        }
                                    } else {
                                        n4Var.setText(org.telegram.messenger.hd.M0(2131753764, null));
                                        break;
                                    }
                                } else {
                                    n4Var.setText(org.telegram.messenger.hd.M0(2131744438, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746611, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131752596, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131751676, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753767, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (i7 != dataSettingsActivity.E) {
                    if (i7 != dataSettingsActivity.F) {
                        if (i7 != dataSettingsActivity.H) {
                            if (i7 != dataSettingsActivity.G) {
                                if (i7 != dataSettingsActivity.K) {
                                    if (i7 == dataSettingsActivity.L) {
                                        String M04 = org.telegram.messenger.hd.M0(2131753763, null);
                                        int i31 = org.telegram.messenger.gz.a;
                                        q8Var.f(M04, org.telegram.messenger.qc.e(1024), false);
                                        break;
                                    }
                                } else {
                                    String M05 = org.telegram.messenger.hd.M0(2131753765, null);
                                    int i32 = org.telegram.messenger.gz.a;
                                    q8Var.f(M05, org.telegram.messenger.qc.e(2048), true);
                                    break;
                                }
                            } else {
                                q8Var.f("(beta only) Stream All Videos", org.telegram.messenger.gz.C0, false);
                                break;
                            }
                        } else {
                            q8Var.f("(beta only) Show MKV as Video", org.telegram.messenger.gz.D0, true);
                            break;
                        }
                    }
                } else {
                    q8Var.f(org.telegram.messenger.hd.M0(2131751144, null), org.telegram.messenger.gz.B0, dataSettingsActivity.G != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == dataSettingsActivity.I) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131751158, null));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i14 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i7 == i14) {
                    M03 = org.telegram.messenger.hd.M0(2131745919, null);
                    org.telegram.messenger.qv qvVar = org.telegram.messenger.b6.d;
                    i26 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                    charSequence2 = qvVar.e(i26);
                    a10 = org.telegram.messenger.b6.d.a();
                } else {
                    i15 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i7 == i15) {
                        M03 = org.telegram.messenger.hd.M0(2131745926, null);
                        org.telegram.messenger.qv qvVar2 = org.telegram.messenger.b6.e;
                        i25 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                        charSequence2 = qvVar2.e(i25);
                        a10 = org.telegram.messenger.b6.e.a();
                    } else {
                        i16 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i7 == i16) {
                            CharSequence M06 = org.telegram.messenger.hd.M0(2131745928, null);
                            org.telegram.messenger.qv qvVar3 = org.telegram.messenger.b6.f;
                            i24 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                            charSequence2 = qvVar3.e(i24);
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
                                            sb2.append(org.telegram.messenger.hd.M0(2131748197, null));
                                        } else {
                                            if (z17) {
                                                sb2.append(org.telegram.messenger.hd.M0(2131753816, null));
                                            }
                                            if (z18) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.hd.M0(2131753805, null));
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
                                                sb2.append(org.telegram.messenger.hd.M0(2131753837, null));
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
                            if (i7 == dataSettingsActivity.e) {
                                M02 = org.telegram.messenger.hd.M0(2131742884, null);
                                i22 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.z5.q(i22).N.g;
                                i23 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i23).n();
                            } else if (i7 == dataSettingsActivity.h) {
                                M02 = org.telegram.messenger.hd.M0(2131742886, null);
                                i20 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                z12 = org.telegram.messenger.z5.q(i20).O.g;
                                i21 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i21).p();
                            } else {
                                CharSequence M07 = org.telegram.messenger.hd.M0(2131742885, null);
                                i17 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                boolean z20 = org.telegram.messenger.z5.q(i17).P.g;
                                i18 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                                org.telegram.messenger.y5 o4 = org.telegram.messenger.z5.q(i18).o();
                                i19 = dataSettingsActivity.resetDownloadRow;
                                charSequence = M07;
                                z10 = z20;
                                z11 = i19 >= 0;
                                y5Var = o4;
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
                if (i7 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.X) {
                        l8Var.r(org.telegram.messenger.hd.M0(2131744816, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        l8Var.h(45, true, dataSettingsActivity.W);
                    } else {
                        String M08 = org.telegram.messenger.hd.M0(2131744816, null);
                        long j3 = dataSettingsActivity.Y;
                        l8Var.r(M08, j3 <= 0 ? "" : org.telegram.messenger.g0.i0(j3, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        l8Var.h(45, false, dataSettingsActivity.W);
                    }
                    dataSettingsActivity.W = false;
                } else if (i7 == dataSettingsActivity.w) {
                    i27 = ((org.telegram.ui.ActionBar.e2) dataSettingsActivity).currentAccount;
                    org.telegram.messenger.hz e10 = org.telegram.messenger.hz.e(i27);
                    l8Var.r(org.telegram.messenger.hd.M0(2131748298, null), org.telegram.messenger.g0.i0(e10.g(2, 6) + e10.g(1, 6) + e10.g(0, 6) + e10.f(2, 6) + e10.f(1, 6) + e10.f(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i7 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(org.telegram.messenger.gz.h0)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i29 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i29)).getAbsolutePath();
                                if (absolutePath2.startsWith(org.telegram.messenger.gz.h0)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    l8Var.r(org.telegram.messenger.hd.M0(2131744820, null), org.telegram.messenger.hd.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131749188 : 2131745840, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
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
    private final void H(v4.e1 e1Var, int i7) {
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
        int i37 = e1Var.f;
        View view = e1Var.a;
        if (i37 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == notificationsSettingsActivity.y) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747909, "NotificationsForChats"));
                return;
            }
            if (i7 == notificationsSettingsActivity.F) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131749219, "InAppNotifications"));
                return;
            }
            if (i7 == notificationsSettingsActivity.L) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131750885, "Events"));
                return;
            }
            if (i7 == notificationsSettingsActivity.N) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747891, "NotificationsOther"));
                return;
            }
            if (i7 == notificationsSettingsActivity.T) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746118, "Reset"));
                return;
            }
            if (i7 == notificationsSettingsActivity.H) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131743279, "VoipNotificationSettings"));
                return;
            } else if (i7 == notificationsSettingsActivity.O) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753733, "BadgeNumber"));
                return;
            } else {
                if (i7 == notificationsSettingsActivity.r) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745336, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        int i38 = 0;
        if (i37 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i10 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i10).e7;
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i7 == i11) {
                q8Var.f(org.telegram.messenger.hd.M0(2131749215, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i12 = notificationsSettingsActivity.inappVibrateRow;
            if (i7 == i12) {
                q8Var.f(org.telegram.messenger.hd.M0(2131749214, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappPreviewRow;
            if (i7 == i13) {
                q8Var.f(org.telegram.messenger.hd.M0(2131749216, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPriorityRow;
            if (i7 == i14) {
                q8Var.g(org.telegram.messenger.hd.M0(2131749218, null), org.telegram.messenger.hd.M0(2131749217, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i15 = notificationsSettingsActivity.contactJoinedRow;
            if (i7 == i15) {
                q8Var.f(org.telegram.messenger.hd.M0(2131751790, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i16 = notificationsSettingsActivity.pinnedMessageRow;
            if (i7 == i16) {
                q8Var.f(org.telegram.messenger.hd.M0(2131747228, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i7 == notificationsSettingsActivity.Q) {
                q8Var.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.w) {
                q8Var.g(org.telegram.messenger.hd.M0(2131747876, "NotificationsService"), org.telegram.messenger.hd.M0(2131747873, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().C3), true, true);
                return;
            }
            if (i7 == notificationsSettingsActivity.x) {
                q8Var.g(org.telegram.messenger.hd.M0(2131747875, "NotificationsServiceConnection"), org.telegram.messenger.hd.M0(2131747874, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().D3), true, true);
                return;
            }
            i17 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i7 == i17) {
                q8Var.f(org.telegram.messenger.hd.M0(2131753731, "BadgeNumberShow"), notificationsSettingsActivity.getNotificationsController().S, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i7 == i18) {
                q8Var.f(org.telegram.messenger.hd.M0(2131753732, "BadgeNumberMutedChats"), notificationsSettingsActivity.getNotificationsController().T, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i7 == i19) {
                q8Var.f(org.telegram.messenger.hd.M0(2131753730, "BadgeNumberUnread"), notificationsSettingsActivity.getNotificationsController().U, false);
                return;
            }
            i20 = notificationsSettingsActivity.inchatSoundRow;
            if (i7 == i20) {
                q8Var.f(org.telegram.messenger.hd.M0(2131749213, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.I) {
                q8Var.f(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i21 = notificationsSettingsActivity.accountsAllRow;
            if (i7 == i21) {
                q8Var.f(org.telegram.messenger.hd.M0(2131754302, "AllAccounts"), org.telegram.messenger.np.f1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i37 == 2) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setMultilineDetail(true);
            i22 = notificationsSettingsActivity.resetNotificationsRow;
            if (i7 == i22) {
                x8Var.a(org.telegram.messenger.hd.M0(2131746112, "ResetAllNotifications"), org.telegram.messenger.hd.M0(2131743886, "UndoAllCustom"), false);
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
                if (i7 == notificationsSettingsActivity.s) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131745335, "ShowNotificationsForInfo"));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            i36 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences2 = org.telegram.messenger.np.s1(i36).e7;
            if (i7 == notificationsSettingsActivity.J) {
                String string = sharedPreferences2.getString("CallsRingtone", org.telegram.messenger.hd.M0(2131751599, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = org.telegram.messenger.hd.M0(2131748151, "NoSound");
                }
                v9Var.c(org.telegram.messenger.hd.M0(2131743241, "VoipSettingsRingtone"), string, notificationsSettingsActivity.X, false);
                notificationsSettingsActivity.X = false;
                return;
            }
            if (i7 != notificationsSettingsActivity.I) {
                if (i7 == notificationsSettingsActivity.R) {
                    int i39 = sharedPreferences2.getInt("repeat_messages", 60);
                    v9Var.c(org.telegram.messenger.hd.M0(2131746275, "RepeatNotifications"), i39 == 0 ? org.telegram.messenger.hd.M0(2131746274, "RepeatNotificationsNever") : i39 < 60 ? org.telegram.messenger.hd.G(i39, "Minutes", new Object[0]) : org.telegram.messenger.hd.G(i39 / 60, "Hours", new Object[0]), notificationsSettingsActivity.Y, false);
                    notificationsSettingsActivity.Y = false;
                    return;
                }
                return;
            }
            int i40 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                v9Var.c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), org.telegram.messenger.hd.M0(2131743613, "VibrationDefault"), notificationsSettingsActivity.W, true);
            } else if (i40 == 1) {
                v9Var.c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), org.telegram.messenger.hd.M0(2131745366, "Short"), notificationsSettingsActivity.W, true);
            } else if (i40 == 2) {
                v9Var.c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), org.telegram.messenger.hd.M0(2131743612, "VibrationDisabled"), notificationsSettingsActivity.W, true);
            } else if (i40 == 3) {
                v9Var.c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), org.telegram.messenger.hd.M0(2131748723, "Long"), notificationsSettingsActivity.W, true);
            } else if (i40 == 4) {
                v9Var.c(org.telegram.messenger.hd.M0(2131743614, "Vibrate"), org.telegram.messenger.hd.M0(2131747821, "OnlyIfSilent"), notificationsSettingsActivity.W, true);
            }
            notificationsSettingsActivity.W = false;
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        i23 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences3 = org.telegram.messenger.np.s1(i23).e7;
        i24 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
        i25 = notificationsSettingsActivity.privateRow;
        if (i7 == i25) {
            M0 = org.telegram.messenger.hd.M0(2131747878, null);
            arrayList = notificationsSettingsActivity.d;
            i29 = sharedPreferences3.getInt("EnableAll2", 0);
            i30 = R.drawable.msg_openprofile;
        } else {
            i26 = notificationsSettingsActivity.groupRow;
            if (i7 != i26) {
                i27 = notificationsSettingsActivity.storiesRow;
                int i41 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i7 == i27) {
                    CharSequence M02 = org.telegram.messenger.hd.M0(2131747932, null);
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
                        CharSequence M03 = org.telegram.messenger.hd.M0(2131747936, null);
                        i29 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i30 = R.drawable.msg_reactions;
                        charSequence = M03;
                        arrayList2 = null;
                        arrayList = null;
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131747921, null);
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
                            sb2.append(org.telegram.messenger.hd.M0(2131747892, "NotificationsOn"));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb2.append(org.telegram.messenger.hd.M0(2131747894, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i32] = org.telegram.messenger.hd.e1(i29);
                            sb2.append(org.telegram.messenger.hd.a0("NotificationsOffUntil", null, 2131747893, objArr));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList.size();
                        i34 = notificationsSettingsActivity.storiesRow;
                        if (i7 == i34 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(org.telegram.messenger.hd.G(size, "Exception", new Object[i32]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(org.telegram.messenger.hd.M0(2131744261, "TapToChange"));
                    } else {
                        if (i29 > 0) {
                            sb2.append(org.telegram.messenger.hd.M0(2131747894, "NotificationsOff"));
                        } else {
                            sb2.append(org.telegram.messenger.hd.M0(2131747892, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(org.telegram.messenger.hd.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z10 = i31;
                } else if (i29 > 0) {
                    sb2.append(org.telegram.messenger.hd.M0(2131747894, "NotificationsOff"));
                    z10 = i32;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(org.telegram.messenger.hd.M0(2131747935, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.hd.M0(2131747934, null));
                    }
                    z10 = 1;
                }
                i35 = notificationsSettingsActivity.reactionsRow;
                h5Var.b(charSequence, sb2, i30, z10, i38, false, i7 == i35, false);
            }
            M0 = org.telegram.messenger.hd.M0(2131747907, null);
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
        h5Var.b(charSequence, sb22, i30, z10, i38, false, i7 == i35, false);
    }

    private final void I(v4.e1 e1Var, int i7) {
        boolean K1;
        ym0 ym0Var = (ym0) this.e;
        org.telegram.messenger.ve veVar = ym0Var.K;
        ArrayList arrayList = ym0Var.n;
        ArrayList arrayList2 = ym0Var.c;
        HashMap hashMap = ym0Var.b;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.setItemSize(ym0Var.S);
            org.telegram.ui.Components.i9 imageView = q5Var.getImageView();
            q5Var.setTag(Integer.valueOf(i7));
            imageView.r();
            if (veVar != null) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.e.get(i7);
                q5Var.d(ffVar, arrayList2.size() > 1, true, false, false);
                int i11 = ffVar.C;
                q5Var.b(ym0Var.e ? arrayList2.indexOf(Integer.valueOf(i11)) : -1, hashMap.containsKey(Integer.valueOf(i11)), false);
                K1 = PhotoViewer.K1(ffVar.I);
            } else {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) ym0Var.f.get(i7);
                q5Var.e(jfVar);
                q5Var.getVideoInfoContainer().setVisibility(4);
                q5Var.b(ym0Var.e ? arrayList2.indexOf(jfVar.B) : -1, hashMap.containsKey(jfVar.B), false);
                K1 = PhotoViewer.K1(jfVar.g());
            }
            imageView.getImageReceiver().O0(!K1, true);
            q5Var.getCheckBox().setVisibility((ym0Var.U != 0 || K1) ? 8 : 0);
            return;
        }
        if (i10 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = ym0Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 == 2) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) veVar.e.get(i7);
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            g7Var.setPhotoEntry(ffVar2);
            g7Var.b(hashMap.containsKey(Integer.valueOf(ffVar2.C)), false);
            g7Var.setTag(Integer.valueOf(i7));
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        if (i7 < arrayList.size()) {
            l8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i7), false);
        } else {
            l8Var.o(R.drawable.msg_clear_recent, org.telegram.messenger.hd.M0(2131752067, null), false);
        }
    }

    private final void J(v4.e1 e1Var, int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) e1Var.a;
        int L = org.telegram.messenger.g0.L(85.0f);
        int L2 = i7 != 0 ? org.telegram.messenger.g0.L(6.0f) : 0;
        w5Var.f = L;
        org.telegram.ui.Components.fp fpVar = w5Var.c;
        org.telegram.ui.Components.i9 i9Var = w5Var.a;
        di.k4 k4Var = w5Var.e;
        w5Var.h = L2;
        ((FrameLayout.LayoutParams) w5Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) i9Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) k4Var.getLayoutParams()).rightMargin = L2;
        i9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (!(obj instanceof org.telegram.messenger.ff)) {
            if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                w5Var.setTag(jfVar);
                w5Var.setImage(jfVar);
                k4Var.setVisibility(4);
                fpVar.a.f(-1, true, false);
                fpVar.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
        int i10 = ffVar.C;
        String str = ffVar.I;
        w5Var.setTag(ffVar);
        k4Var.setVisibility(4);
        String str2 = ffVar.c;
        if (str2 != null) {
            i9Var.h(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            i9Var.s(ffVar.J, ffVar.K, true);
            if (!ffVar.b || ffVar.d()) {
                i9Var.h("thumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                k4Var.setVisibility(0);
                w5Var.d.setText(org.telegram.messenger.g0.g0(ffVar.E, false, false));
                i9Var.h("vthumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            i9Var.setImageResource(R.drawable.nophotos);
        }
        fpVar.a.f(-1, true, false);
        fpVar.setVisibility(0);
    }

    private final void K(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i12 = e1Var.f;
        View view = e1Var.a;
        switch (i12) {
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, null);
                i10 = proxyListActivity.proxyAddRow;
                if (i7 == i10) {
                    v9Var.b(org.telegram.messenger.hd.M0(2131754391, null), proxyListActivity.E != -1);
                    break;
                } else if (i7 == proxyListActivity.E) {
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
                    v9Var.b(org.telegram.messenger.hd.M0(2131751580, null), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746605, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i7 == i11) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131743783, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i7 == proxyListActivity.w) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131743785, null), org.telegram.messenger.gz.a1, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == proxyListActivity.y) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131746603, null));
                    break;
                }
                break;
            case 5:
                mx0 mx0Var = (mx0) view;
                org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList2.get(i7 - proxyListActivity.n);
                mx0Var.setProxy(fzVar);
                mx0Var.setChecked(org.telegram.messenger.gz.B1 == fzVar);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.n));
                mx0Var.h = contains;
                mx0Var.f.a(contains, false);
                mx0Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i7 == proxyListActivity.x) {
                    org.telegram.ui.Components.wt0 wt0Var = (org.telegram.ui.Components.wt0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.nt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        strArr[i13] = org.telegram.messenger.hd.a0(null, null, 2131746602, arrayList3.get(i13));
                    }
                    wt0Var.setCallback(new t70(11));
                    wt0Var.b(org.telegram.messenger.gz.b1, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void L(v4.e1 e1Var, int i7) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.e2) ((vy0) this.e)).currentAccount;
        boolean e10 = org.telegram.ui.Components.w40.e(i10);
        int i11 = e1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.n4) e1Var.a).setText(i7 == 0 ? org.telegram.messenger.hd.M0(2131745988, null) : org.telegram.messenger.hd.M0(2131745992, null));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) e1Var.a;
            q8Var.setEnabled(i7 == 1 || e10);
            if (i7 == 1) {
                q8Var.f(org.telegram.messenger.hd.M0(2131745984, null), e10, false);
                return;
            }
            String M0 = org.telegram.messenger.hd.M0(2131745991, null);
            aj.a aVar = aj.e.i;
            aVar.a();
            q8Var.f(M0, aVar.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.y8) e1Var.a).setText(i7 == 6 ? org.telegram.messenger.hd.M0(2131745987, null) : org.telegram.messenger.hd.M0(2131745990, null));
            return;
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.a;
        v9Var.setEnabled(e10);
        if (i7 == 2) {
            v9Var.c(org.telegram.messenger.hd.M0(2131745986, null), a8.p0.n(((zi.t0) aj.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i7 == 3) {
            String M02 = org.telegram.messenger.hd.M0(2131745996, null);
            zi.o0 o0Var = (zi.o0) aj.e.f.a();
            v9Var.c(M02, o0Var == zi.o0.a ? org.telegram.messenger.hd.M0(2131745995, null) : o0Var == zi.o0.b ? org.telegram.messenger.hd.M0(2131745993, null) : org.telegram.messenger.hd.M0(2131745994, null), false, true);
        } else if (i7 == 4) {
            v9Var.c(org.telegram.messenger.hd.M0(2131745989, null), a8.p0.n(((zi.q0) aj.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            v9Var.c(org.telegram.messenger.hd.M0(2131745997, null), vy0.f0(aj.e.h.a()), false, false);
        }
    }

    private final void M(v4.e1 e1Var, int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.a;
            t2Var.t2 = i7 != arrayList.size() - 1;
            t2Var.setDialog((org.telegram.ui.Cells.o2) arrayList.get(i7));
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
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
                int b10 = e1Var.b();
                if (b10 == 1 || b10 == 5 || b10 == 6) {
                    return true;
                }
                i7 = ((org.telegram.ui.ActionBar.e2) ((vy0) this.e)).currentAccount;
                return MediaController.s0(i7) && b10 == 2;
            case 1:
                int b11 = e1Var.b();
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.e;
                return b11 == jnVar.v0 || b11 == jnVar.H0 || b11 == jnVar.C0 || b11 == jnVar.G0 || b11 == jnVar.D0 || b11 == jnVar.I0 || b11 == jnVar.E0 || b11 == jnVar.F0 || b11 == jnVar.J0 || b11 == jnVar.K0 || b11 == jnVar.O0.b || b11 == jnVar.N0.b || b11 == jnVar.M0;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return e1Var.f == 0;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                int b12 = e1Var.b();
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
                int b13 = e1Var.b();
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
                int b14 = e1Var.b();
                ee0 ee0Var = (ee0) this.e;
                return b14 == ee0Var.c || b14 == ee0Var.d || b14 == ee0Var.e || b14 == ee0Var.f || b14 == ee0Var.h || b14 == ee0Var.r;
            case 11:
                int b15 = e1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                return (b15 == notificationsSettingsActivity.y || b15 == notificationsSettingsActivity.E || b15 == notificationsSettingsActivity.F || b15 == notificationsSettingsActivity.L || b15 == notificationsSettingsActivity.N || b15 == notificationsSettingsActivity.T || b15 == notificationsSettingsActivity.O || b15 == notificationsSettingsActivity.M || b15 == notificationsSettingsActivity.S || b15 == notificationsSettingsActivity.G || b15 == notificationsSettingsActivity.H || b15 == notificationsSettingsActivity.P || b15 == notificationsSettingsActivity.r || b15 == notificationsSettingsActivity.s || b15 == notificationsSettingsActivity.U || b15 == notificationsSettingsActivity.K) ? false : true;
            case 12:
                int b16 = e1Var.b();
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
                ym0 ym0Var = (ym0) this.e;
                return ym0Var.K != null || (!TextUtils.isEmpty(ym0Var.w) ? e1Var.b() >= ym0Var.f.size() : e1Var.f != 3);
            case 15:
                return false;
            case 16:
                int b17 = e1Var.b();
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
                int b18 = e1Var.b();
                if (b18 == 1) {
                    return true;
                }
                i27 = ((org.telegram.ui.ActionBar.e2) ((vy0) this.e)).currentAccount;
                return org.telegram.ui.Components.w40.e(i27) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8);
            case 18:
                return e1Var.f != 1;
            default:
                return p1.g.d(3)[e1Var.f] == 1;
        }
    }

    public void E() {
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        org.telegram.ui.ActionBar.w4 w4Var3;
        org.telegram.ui.ActionBar.w4 w4Var4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        w4Var = ((org.telegram.ui.ActionBar.e2) proxyListActivity).simpleActionBar;
        boolean v = w4Var.v();
        if (size <= 0) {
            if (v) {
                w4Var2 = ((org.telegram.ui.ActionBar.e2) proxyListActivity).simpleActionBar;
                w4Var2.u();
                int i7 = proxyListActivity.n;
                n(i7, proxyListActivity.r - i7, 2);
                return;
            }
            return;
        }
        w4Var3 = ((org.telegram.ui.ActionBar.e2) proxyListActivity).simpleActionBar;
        w4Var3.A(size, v);
        if (v) {
            return;
        }
        w4Var4 = ((org.telegram.ui.ActionBar.e2) proxyListActivity).simpleActionBar;
        w4Var4.F();
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

    public void N(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        int i10 = proxyListActivity.n;
        if (i7 < i10 || i7 >= proxyListActivity.r) {
            return;
        }
        org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) proxyListActivity.G.get(i7 - i10);
        if (arrayList.contains(fzVar)) {
            arrayList.remove(fzVar);
        } else {
            arrayList.add(fzVar);
        }
        h(i7, 1);
        E();
    }

    @Override // v4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return DictationAsr.A() ? 8 : 4;
            case 1:
                return ((org.telegram.ui.Components.jn) this.e).R0;
            case 2:
                return ((org.telegram.ui.Components.iz) this.e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.jz) this.e).v1.size();
                return size < 10 ? size + 1 : size;
            case 4:
                return ((org.telegram.ui.Components.td0) this.e).G;
            case 5:
                return org.telegram.messenger.rd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.rw0) this.d).x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.v61) this.e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.e).y;
            case 9:
                return ((DataSettingsActivity) this.e).U;
            case 10:
                return ((ee0) this.e).w;
            case 11:
                return ((NotificationsSettingsActivity) this.e).V;
            case 12:
                return ((PasscodeActivity) this.e).Q;
            case 13:
                if (((nm0) this.e).d != null) {
                    return (int) Math.ceil(r1.size() / r0.f);
                }
                return 0;
            case 14:
                ym0 ym0Var = (ym0) this.e;
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar != null) {
                    return veVar.e.size();
                }
                if (!ym0Var.f.isEmpty()) {
                    return ym0Var.f.size() + (!ym0Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(ym0Var.w) || ym0Var.n.isEmpty()) {
                    return 0;
                }
                return ym0Var.n.size() + 2;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                sq0 sq0Var = photoViewer.d;
                if (sq0Var == null || sq0Var.c() == null) {
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

    @Override // v4.h0
    public long c(int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.c) {
            case 2:
                i10 = ((org.telegram.ui.Components.iz) this.e).l0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                if (((org.telegram.ui.Components.rw0) this.d).x == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.oi) r0.get(i7)).a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.s61) ((org.telegram.ui.Components.v61) this.e).h.get(i7)).a;
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
                return ((org.telegram.messenger.fz) proxyListActivity.G.get(i7 - r1)).hashCode();
            default:
                return super.c(i7);
        }
        return i10;
    }

    @Override // v4.h0
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
                if (i7 == 0 || i7 == 4) {
                    return 0;
                }
                if (i7 == 1 || i7 == 5 || i7 == 6) {
                    return 1;
                }
                return i7 == 2 ? 2 : 3;
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.e;
                if (i7 == jnVar.C0 || i7 == jnVar.G0 || i7 == jnVar.H0 || i7 == jnVar.D0 || i7 == jnVar.E0 || i7 == jnVar.F0 || i7 == jnVar.I0 || i7 == jnVar.N0.b || i7 == jnVar.O0.b) {
                    return 10;
                }
                if (i7 == jnVar.m0 || i7 == jnVar.t0 || i7 == jnVar.x0 || i7 == jnVar.p0) {
                    return 0;
                }
                if (i7 == jnVar.s0) {
                    return 1;
                }
                if (i7 == jnVar.w0 || i7 == jnVar.y0 || i7 == jnVar.r0 || i7 == jnVar.L0) {
                    return 2;
                }
                if (i7 == jnVar.v0 || i7 == jnVar.J0 || i7 == jnVar.M0) {
                    return 3;
                }
                if (i7 == jnVar.n0) {
                    return 4;
                }
                if (i7 == jnVar.o0) {
                    return 11;
                }
                if (i7 == jnVar.q0) {
                    return 7;
                }
                if (i7 == jnVar.z0 || i7 == jnVar.A0 || i7 == jnVar.K0) {
                    return 6;
                }
                if (i7 == jnVar.B0) {
                    return 8;
                }
                return i7 == 0 ? 9 : 5;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                org.telegram.ui.Components.td0 td0Var = (org.telegram.ui.Components.td0) this.e;
                return (i7 == td0Var.E || i7 == td0Var.F) ? 1 : 0;
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
                ee0 ee0Var = (ee0) this.e;
                ee0Var.getClass();
                if (i7 == 0) {
                    return 0;
                }
                if (i7 == ee0Var.c || i7 == ee0Var.d || i7 == ee0Var.e || i7 == ee0Var.f || i7 == ee0Var.h) {
                    return 1;
                }
                if (i7 == ee0Var.n) {
                    return 2;
                }
                return i7 == ee0Var.r ? 3 : 4;
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
                ym0 ym0Var = (ym0) this.e;
                if (ym0Var.Z) {
                    return 2;
                }
                if (ym0Var.K == null) {
                    if (ym0Var.f.isEmpty()) {
                        return i7 == ym0Var.n.size() ? 4 : 3;
                    }
                    if (i7 >= ym0Var.f.size()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b0, code lost:
    
        if (org.telegram.ui.Wallet.l0.x(r3).J() != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06bb  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        String G;
        TextView textView;
        Drawable drawable;
        org.telegram.ui.Components.u61 u61Var;
        int i11;
        int i12;
        int i13;
        int i14;
        String M0;
        int i15;
        org.telegram.messenger.y5 o4;
        int i16;
        int i17;
        int i18;
        int i19;
        StringBuilder sb2;
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
        int i30 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        int i31 = 0;
        switch (i30) {
            case 0:
                i10 = ((org.telegram.ui.ActionBar.e2) ((vy0) obj2)).currentAccount;
                boolean s02 = MediaController.s0(i10);
                int i32 = e1Var.f;
                View view = e1Var.a;
                if (i32 == 0) {
                    ((org.telegram.ui.Cells.n4) view).setText(i7 == 4 ? "Live transcript" : org.telegram.messenger.hd.M0(2131753924, null));
                    break;
                } else if (i7 == 5) {
                    ((org.telegram.ui.Cells.q8) view).f("Show text while recording", c8.z0.b(), true);
                    break;
                } else if (i7 == 6) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.f("Text in a field above the recorder", c8.z0.c(), false);
                    q8Var.e(null, c8.z0.b());
                    break;
                } else if (i7 == 7) {
                    ((org.telegram.ui.Cells.y8) view).setText(Build.VERSION.SDK_INT < 33 ? "Needs Android 13 or newer." : c8.z0.c() ? "While a locked voice recording runs, the speech appears in a field above the recorder. Trimming the recording trims the text, resuming adds to it; send it as text or Enhance it." : "While a locked voice recording runs, the speech is also shown as text over the blurred chat, with Edit and Send to turn it into a text message.");
                    break;
                } else if (i32 == 1) {
                    ((org.telegram.ui.Cells.q8) view).f(org.telegram.messenger.hd.M0(2131753918, null), s02, false);
                    break;
                } else if (i32 == 2) {
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.setEnabled(s02);
                    v9Var.c(org.telegram.messenger.hd.M0(2131753922, null), org.telegram.messenger.hd.M0(((yi.h) aj.e.c.a()) == yi.h.b ? 2131753920 : 2131753921, null), false, false);
                    break;
                } else {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.M0(2131753923, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj2;
                boolean z11 = jnVar.f0;
                bg.v0 v0Var = jnVar.N0;
                bg.v0 v0Var2 = jnVar.O0;
                org.telegram.ui.ActionBar.e6 e6Var = jnVar.a;
                boolean z12 = jnVar.n;
                int i33 = e1Var.f;
                View view2 = e1Var.a;
                if (i33 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view2;
                    if (i7 == jnVar.m0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.hd.M0(z12 ? 2131744054 : 2131747165, null));
                        break;
                    } else if (i7 == jnVar.p0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.hd.M0(2131754473, null));
                        break;
                    } else {
                        n4Var.getTextView().setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                        if (i7 == jnVar.t0) {
                            if (z11) {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746447, null));
                                break;
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(z12 ? 2131744072 : 2131754246, null));
                                break;
                            }
                        } else if (i7 == jnVar.x0) {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131745495, null));
                            break;
                        }
                    }
                } else if (i33 == 6) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view2;
                    if (i7 == jnVar.z0) {
                        q8Var2.f(org.telegram.messenger.hd.M0(2131744093, null), jnVar.g0, jnVar.A0 != -1);
                        q8Var2.e(null, true);
                        break;
                    } else if (i7 == jnVar.A0) {
                        q8Var2.f(org.telegram.messenger.hd.M0(2131744092, null), jnVar.h0, false);
                        q8Var2.e(null, true);
                        break;
                    } else if (i7 == jnVar.K0) {
                        q8Var2.f(org.telegram.messenger.hd.M0(2131747139, null), jnVar.a0, false);
                        q8Var2.e(null, true);
                        break;
                    }
                } else if (i33 == 2) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view2;
                    y8Var.setFixedSize(0);
                    new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var)), org.telegram.ui.ActionBar.j6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).x = true;
                    if (i7 == jnVar.r0) {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
                        break;
                    } else if (i7 == jnVar.y0) {
                        y8Var.setFixedSize(12);
                        y8Var.setText(null);
                        break;
                    } else {
                        int i34 = jnVar.K - jnVar.N;
                        if (i34 <= 0) {
                            y8Var.setText(org.telegram.messenger.hd.M0(z12 ? 2131744108 : 2131754469, null));
                            break;
                        } else if (z12) {
                            y8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i34));
                            break;
                        } else if (i7 == jnVar.L0) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131747138, null));
                            break;
                        } else {
                            y8Var.setText(org.telegram.messenger.hd.a0(null, null, 2131754470, org.telegram.messenger.hd.G(i34, "Option", new Object[0])));
                            break;
                        }
                    }
                } else if (i33 == 3) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                    if (i7 == jnVar.M0) {
                        String M02 = org.telegram.messenger.hd.M0(2131747145, null);
                        ArrayList arrayList = jnVar.Q0;
                        if (arrayList.isEmpty()) {
                            G = org.telegram.messenger.hd.M0(2131745811, null);
                            z10 = false;
                        } else if (arrayList.size() == 1) {
                            z10 = false;
                            G = org.telegram.messenger.hd.i0(2131750521, (String) arrayList.get(0));
                        } else {
                            z10 = false;
                            G = org.telegram.messenger.hd.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                        }
                        l8Var.q(M02, G, z10, true);
                        break;
                    } else if (i7 == jnVar.J0) {
                        jnVar.Z(l8Var, false);
                        break;
                    } else {
                        l8Var.g(-1, org.telegram.ui.ActionBar.j6.Zl);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable3 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.N6, e6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.k7, e6Var), mode));
                        jnVar.o1 = drawable2;
                        jnVar.p1 = drawable3;
                        l8Var.p(org.telegram.messenger.hd.M0(z12 ? 2131744068 : 2131754471, null), new org.telegram.ui.Components.fq(drawable2, drawable3), false);
                        l8Var.x = 20;
                        l8Var.s = 58;
                        break;
                    }
                } else if (i33 == 9) {
                    view2.requestLayout();
                    break;
                } else if (i33 == 10) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view2;
                    x5Var.setDivider(false);
                    if (i7 == jnVar.C0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747124, null), org.telegram.messenger.hd.M0(2131747123, null), org.telegram.ui.Components.f30.c, R.drawable.filled_poll_view_24, !jnVar.b0);
                    } else {
                        if (i7 == jnVar.G0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747149, null), org.telegram.messenger.hd.M0(2131747148, null), org.telegram.ui.Components.f30.f, R.drawable.filled_poll_multiple_24, jnVar.c0);
                        } else if (i7 == jnVar.E0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747147, null), org.telegram.messenger.hd.M0(2131747146, null), org.telegram.ui.Components.f30.w, R.drawable.filled_poll_revote_24, jnVar.S);
                        } else if (i7 == jnVar.D0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747151, null), org.telegram.messenger.hd.M0(2131747150, null), org.telegram.ui.Components.f30.s, R.drawable.filled_poll_add_24, jnVar.U);
                        } else if (i7 == jnVar.F0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747122, null), org.telegram.messenger.hd.M0(2131747121, null), org.telegram.ui.Components.f30.h, R.drawable.filled_poll_shuffle_24, jnVar.T);
                        } else if (i7 == jnVar.H0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747126, null), org.telegram.messenger.hd.M0(2131747125, null), org.telegram.ui.Components.f30.n, R.drawable.filled_poll_correct_24, jnVar.d0);
                        } else if (i7 == v0Var2.b) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747137, null), org.telegram.messenger.hd.M0(2131747136, null), org.telegram.ui.Components.f30.e, R.drawable.filled_location, v0Var2.a);
                        } else if (i7 == v0Var.b) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747129, null), org.telegram.messenger.hd.M0(2131747128, null), org.telegram.ui.Components.f30.d, R.drawable.msg_folders_groups, v0Var.a);
                        } else if (i7 == jnVar.I0) {
                            x5Var.a(org.telegram.messenger.hd.M0(2131747135, null), org.telegram.messenger.hd.M0(2131747134, null), org.telegram.ui.Components.f30.r, R.drawable.filled_poll_deadline_24, (jnVar.V == 0 && jnVar.W == 0) ? false : true);
                            x5Var = x5Var;
                            x5Var.setDivider((jnVar.V == 0 && jnVar.W == 0) ? false : true);
                        }
                        x5Var = x5Var;
                    }
                    if (i7 == jnVar.H0) {
                        x5Var.getCheckBox().a.a(z11, false);
                        break;
                    } else if (i7 == jnVar.D0) {
                        Switch checkBox = x5Var.getCheckBox();
                        if (!jnVar.d0 && !jnVar.b0) {
                            r10 = false;
                        }
                        checkBox.a.a(r10, false);
                        break;
                    } else {
                        x5Var.getCheckBox().a.a(false, false);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.gz gzVar = (org.telegram.ui.Components.gz) e1Var.a;
                r13 = gzVar.b != null ? gzVar.getId() : -1;
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) ((org.telegram.ui.Components.iz) obj2).h.get(i7);
                gzVar.b = fzVar;
                gzVar.e = i7;
                gzVar.setContentDescription(fzVar.b);
                gzVar.requestLayout();
                boolean z13 = gzVar.n;
                org.telegram.ui.Components.fz fzVar2 = gzVar.b;
                if (z13 != (fzVar2 != null && fzVar2.g)) {
                    org.telegram.ui.Components.p5.release(gzVar, gzVar.r);
                    org.telegram.ui.Components.p5.release(gzVar, gzVar.P);
                    org.telegram.ui.Components.p5.release(gzVar, gzVar.R);
                    org.telegram.ui.Components.p5.release(gzVar, gzVar.T);
                    if (gzVar.m0) {
                        gzVar.r = org.telegram.ui.Components.p5.update(gzVar.b.g ? 26 : 0, gzVar, gzVar.r, gzVar.s);
                        gzVar.P = org.telegram.ui.Components.p5.update(gzVar.b.g ? 26 : 0, gzVar, gzVar.P, gzVar.Q);
                        gzVar.R = org.telegram.ui.Components.p5.update(gzVar.b.g ? 26 : 0, gzVar, gzVar.R, gzVar.S);
                        gzVar.T = org.telegram.ui.Components.p5.update(gzVar.b.g ? 26 : 0, gzVar, gzVar.T, gzVar.U);
                    }
                    gzVar.n = gzVar.b.g;
                }
                if (r13 != gzVar.getId()) {
                    gzVar.l0 = gzVar.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 3:
                Context context2 = (Context) obj;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) e1Var.a;
                org.telegram.ui.Components.jz jzVar = (org.telegram.ui.Components.jz) obj2;
                ArrayList arrayList2 = jzVar.w1;
                ArrayList arrayList3 = jzVar.v1;
                if (i7 < arrayList3.size()) {
                    org.telegram.ui.ActionBar.q6.s(n2Var.getImageView(), org.telegram.ui.ActionBar.j6.J5, null, PorterDuff.Mode.MULTIPLY);
                    org.telegram.messenger.so soVar = (org.telegram.messenger.so) arrayList3.get(i7);
                    org.telegram.ui.ActionBar.q6.U(n2Var.getTextView(), org.telegram.ui.ActionBar.j6.j5, null);
                    int i35 = soVar.g;
                    int i36 = org.telegram.messenger.np.E8;
                    int i37 = i35 & i36;
                    n2Var.a(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.b, n2Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), soVar.c, n2Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new org.telegram.ui.Components.a00(jzVar.getContext(), i37 == 3 ? R.drawable.msg_openprofile : ((i35 & 64) == 0 || i37 != i36) ? i37 == 8 ? R.drawable.msg_channel : i37 == 4 ? R.drawable.msg_groups : i37 == 1 ? R.drawable.msg_contacts : i37 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, soVar.m), false);
                    n2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, jzVar.J0));
                    for (int i38 = 0; i38 < arrayList2.size(); i38++) {
                        if (!soVar.b(org.telegram.messenger.c.a(jzVar.a), ((Long) arrayList2.get(i38)).longValue())) {
                            r10 = false;
                        }
                    }
                    n2Var.setChecked(r10);
                    break;
                } else {
                    n2Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable4 = context2.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable5 = context2.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = n2Var.getImageView();
                    int i39 = org.telegram.ui.ActionBar.j6.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.q6.x(imageView, drawable4, i39, null, mode2);
                    org.telegram.ui.ActionBar.q6.x(n2Var.getImageView(), drawable5, org.telegram.ui.ActionBar.j6.k7, null, mode2);
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable4, drawable5);
                    org.telegram.ui.ActionBar.q6.U(n2Var.getTextView(), org.telegram.ui.ActionBar.j6.q6, null);
                    n2Var.a(org.telegram.messenger.hd.M0(2131751716, null), 0, fqVar, false);
                    break;
                }
            case 4:
                org.telegram.ui.Components.td0 td0Var = (org.telegram.ui.Components.td0) obj2;
                int i40 = e1Var.f;
                View view3 = e1Var.a;
                if (i40 == 0) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view3;
                    s5Var.setTag(Integer.valueOf(i7));
                    if (i7 == td0Var.b) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131751126, null), 0, td0Var.H);
                        break;
                    } else if (i7 == td0Var.r) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131749302, null), -100, td0Var.Q);
                        break;
                    } else if (i7 == td0Var.d) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131751769, null), -100, td0Var.J);
                        break;
                    } else if (i7 == td0Var.c) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131750857, null), -100, td0Var.I);
                        break;
                    } else if (i7 == td0Var.f) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131742949, null), -100, td0Var.K);
                        break;
                    } else if (i7 == td0Var.e) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745947, null), -100, td0Var.L);
                        break;
                    } else if (i7 == td0Var.w) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131743524, null), 0, td0Var.S);
                        break;
                    } else if (i7 == td0Var.s) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745465, null), -100, td0Var.R);
                        break;
                    } else if (i7 == td0Var.x) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131749524, null), 0, td0Var.T);
                        break;
                    } else if (i7 == td0Var.y) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745367, null), 0, td0Var.V);
                        break;
                    } else if (i7 == td0Var.h) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131750846, null), 0, td0Var.M);
                        break;
                    } else if (i7 == td0Var.n) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745293, null), 0, td0Var.N);
                        break;
                    }
                } else if (i40 == 1) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view3;
                    r5Var.setTag(Integer.valueOf(i7));
                    if (i7 == td0Var.E) {
                        r5Var.a(td0Var.O, org.telegram.messenger.hd.M0(2131744114, null));
                        break;
                    } else if (i7 == td0Var.F) {
                        r5Var.a(td0Var.P, org.telegram.messenger.hd.M0(2131744115, null));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.bt0 bt0Var = (org.telegram.ui.Components.bt0) obj2;
                int i41 = e1Var.f;
                if (i41 != 0) {
                    if (i41 == 1 && (textView = bt0Var.p1) != null) {
                        textView.setText(org.telegram.messenger.hd.a0("SharingLiveLocationTitle", null, 2131745392, org.telegram.messenger.hd.G(org.telegram.messenger.rd.g(), "Chats", new Object[0])));
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.q7) e1Var.a).setDialog(org.telegram.ui.Components.bt0.J0(i7 - 1));
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.qw0 qw0Var = (org.telegram.ui.Components.qw0) e1Var.a;
                org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) obj;
                ArrayList arrayList4 = rw0Var.x;
                String str = arrayList4 == null ? null : ((org.telegram.messenger.oi) arrayList4.get(i7)).a;
                int direction = rw0Var.getDirection();
                qw0Var.a = str;
                if (str == null || !str.startsWith("animated_")) {
                    qw0Var.setImageDrawable(org.telegram.messenger.j6.f(str));
                } else {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable6 = qw0Var.b;
                        if (drawable6 instanceof org.telegram.ui.Components.g5) {
                            if (((org.telegram.ui.Components.g5) drawable6).h() != parseLong) {
                            }
                        }
                        try {
                            qw0Var.setImageDrawable(org.telegram.ui.Components.g5.m(org.telegram.messenger.m10.t0, parseLong, null, qw0Var.f.d()));
                        } catch (Exception unused) {
                            drawable = null;
                            qw0Var.setImageDrawable(drawable);
                            if (qw0Var.d == direction) {
                                return;
                            }
                        }
                    } catch (Exception unused2) {
                        drawable = null;
                    }
                }
                if (qw0Var.d == direction) {
                    qw0Var.d = direction;
                    qw0Var.requestLayout();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) e1Var.a;
                org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) obj2;
                org.telegram.ui.Components.s61 s61Var = (org.telegram.ui.Components.s61) v61Var.h.get(i7);
                t61Var.a = s61Var;
                t61Var.setContentDescription(s61Var.b);
                t61Var.setAlpha(1.0f);
                t61Var.requestLayout();
                t61Var.setReordering(v61Var.n0 && (u61Var = v61Var.E) != null && ((org.telegram.ui.Components.cf) u61Var).l(i7));
                break;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i42 = dataAutoDownloadActivity.f;
                org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.H;
                int i43 = e1Var.f;
                View view4 = e1Var.a;
                if (i43 == 0) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view4;
                    i11 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i7 == i11) {
                        q8Var3.setDrawCheckRipple(true);
                        q8Var3.f(org.telegram.messenger.hd.M0(2131753830, null), y5Var.g, false);
                        q8Var3.setTag(Integer.valueOf(y5Var.g ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6));
                        org.telegram.ui.ActionBar.q6.h(y5Var.g ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, q8Var3, null);
                        break;
                    }
                } else if (i43 == 2) {
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view4;
                    if (i7 == dataAutoDownloadActivity.r) {
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131753839, null));
                        break;
                    } else if (i7 == dataAutoDownloadActivity.w) {
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131753808, null));
                        break;
                    }
                } else if (i43 == 3) {
                    dataAutoDownloadActivity.r0((org.telegram.ui.Components.wt0) view4);
                    break;
                } else if (i43 == 4) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view4;
                    h5Var.setDrawLine(true);
                    i12 = dataAutoDownloadActivity.photosRow;
                    if (i7 == i12) {
                        M0 = org.telegram.messenger.hd.M0(2131753817, null);
                        r13 = 1;
                    } else {
                        i13 = dataAutoDownloadActivity.videosRow;
                        if (i7 == i13) {
                            M0 = org.telegram.messenger.hd.M0(2131753806, null);
                            r13 = 4;
                        } else {
                            i14 = dataAutoDownloadActivity.storiesRow;
                            if (i7 == i14) {
                                String M03 = org.telegram.messenger.hd.M0(2131753809, null);
                                h5Var.setDrawLine(false);
                                M0 = M03;
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131753838, null);
                                r13 = 8;
                            }
                        }
                    }
                    if (i42 == 0) {
                        i22 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i22).n();
                    } else if (i42 == 1) {
                        i16 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i16).p();
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i15).o();
                    }
                    long j3 = o4.b[org.telegram.messenger.z5.x(r13)];
                    StringBuilder sb3 = new StringBuilder();
                    i17 = dataAutoDownloadActivity.storiesRow;
                    if (i7 != i17) {
                        int i44 = 0;
                        i18 = 0;
                        while (true) {
                            int[] iArr = o4.a;
                            if (i44 < iArr.length) {
                                if ((iArr[i44] & r13) != 0) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    if (i44 == 0) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753841, null));
                                    } else if (i44 == 1) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753814, null));
                                    } else if (i44 == 2) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753835, null));
                                    } else if (i44 == 3) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753842, null));
                                    }
                                    i18++;
                                }
                                i44++;
                            } else {
                                if (i18 == 4) {
                                    sb3.setLength(0);
                                    i20 = dataAutoDownloadActivity.photosRow;
                                    if (i7 == i20) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753826, null));
                                    } else {
                                        sb3.append(org.telegram.messenger.hd.a0("AutoDownloadUpToOnAllChats", null, 2131753807, org.telegram.messenger.g0.i0(j3, false, false)));
                                    }
                                } else if (i18 == 0) {
                                    sb3.append(org.telegram.messenger.hd.M0(2131753828, null));
                                } else {
                                    i19 = dataAutoDownloadActivity.photosRow;
                                    sb2 = i7 == i19 ? new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOnFor", null, 2131753825, sb3.toString())) : new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOnUpToFor", null, 2131753820, org.telegram.messenger.g0.i0(j3, false, false), sb3.toString()));
                                }
                                sb2 = sb3;
                            }
                        }
                    } else if (o4.e) {
                        sb2 = new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOn", null, 2131753827, sb3.toString()));
                        i18 = 1;
                    } else {
                        sb2 = new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOff", null, 2131753828, sb3.toString()));
                        i18 = 0;
                    }
                    if (dataAutoDownloadActivity.h) {
                        h5Var.setChecked(i18 != 0);
                    }
                    boolean z14 = i18 != 0;
                    i21 = dataAutoDownloadActivity.storiesRow;
                    h5Var.b(M0, sb2, 0, z14, 0, true, i7 != i21, false);
                    break;
                } else if (i43 == 5) {
                    org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view4;
                    if (i7 == dataAutoDownloadActivity.x) {
                        y8Var2.setText(org.telegram.messenger.hd.M0(2131753843, null));
                        y8Var2.setFixedSize(0);
                        y8Var2.setImportantForAccessibility(1);
                        break;
                    } else if (i7 == dataAutoDownloadActivity.n) {
                        if (dataAutoDownloadActivity.r == -1) {
                            if (i42 == 0) {
                                y8Var2.setText(org.telegram.messenger.hd.M0(2131753823, null));
                            } else if (i42 == 1) {
                                y8Var2.setText(org.telegram.messenger.hd.M0(2131753818, null));
                            } else if (i42 == 2) {
                                y8Var2.setText(org.telegram.messenger.hd.M0(2131753821, null));
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
                G(e1Var, i7);
                break;
            case 10:
                ee0 ee0Var = (ee0) obj2;
                int i45 = e1Var.f;
                View view5 = e1Var.a;
                if (i45 == 0) {
                    org.telegram.ui.Cells.n4 n4Var3 = (org.telegram.ui.Cells.n4) view5;
                    if (i7 == 0) {
                        n4Var3.setText(org.telegram.messenger.hd.M0(2131754270, null));
                        break;
                    }
                } else if (i45 == 1) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view5;
                    if (i7 == ee0Var.c) {
                        x8Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131754468, null), org.telegram.messenger.hd.M0(2131754467, null), true);
                        break;
                    } else if (i7 == ee0Var.d) {
                        x8Var.b(R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131745521, null), org.telegram.messenger.hd.M0(2131745520, null), true);
                        break;
                    } else if (i7 == ee0Var.e) {
                        x8Var.b(R.drawable.msg_clearcache, org.telegram.messenger.hd.M0(2131752098, null), org.telegram.messenger.hd.M0(2131752094, null), true);
                        break;
                    } else if (i7 == ee0Var.f) {
                        x8Var.b(R.drawable.msg_newphone, org.telegram.messenger.hd.M0(2131752537, null), org.telegram.messenger.hd.M0(2131752536, null), true);
                        break;
                    } else if (i7 == ee0Var.h) {
                        x8Var.b(R.drawable.msg_help, org.telegram.messenger.hd.M0(2131751783, null), org.telegram.messenger.hd.M0(2131751782, null), false);
                        break;
                    }
                } else if (i45 == 3) {
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view5;
                    if (i7 == ee0Var.r) {
                        org.telegram.ui.ActionBar.q6.U(v9Var2.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
                        v9Var2.b(org.telegram.messenger.hd.M0(2131748741, null), false);
                        break;
                    }
                } else if (i45 == 4) {
                    org.telegram.ui.Cells.y8 y8Var3 = (org.telegram.ui.Cells.y8) view5;
                    if (i7 == ee0Var.s) {
                        y8Var3.setText(org.telegram.messenger.hd.M0(2131748742, null));
                        break;
                    }
                }
                break;
            case 11:
                H(e1Var, i7);
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj2;
                int i46 = e1Var.f;
                View view6 = e1Var.a;
                if (i46 == 0) {
                    org.telegram.ui.Cells.q8 q8Var4 = (org.telegram.ui.Cells.q8) view6;
                    i23 = passcodeActivity.fingerprintRow;
                    if (i7 == i23) {
                        q8Var4.f(org.telegram.messenger.hd.M0(2131743873, null), org.telegram.messenger.gz.D, false);
                        break;
                    } else if (i7 == passcodeActivity.O) {
                        q8Var4.f(org.telegram.messenger.hd.M0(2131745841, null), org.telegram.messenger.gz.A, false);
                        break;
                    } else if (i7 == passcodeActivity.L) {
                        String M04 = org.telegram.messenger.hd.M0(2131743166, null);
                        i25 = ((org.telegram.ui.ActionBar.e2) passcodeActivity).currentAccount;
                        if (org.telegram.ui.Wallet.l0.x(i25).e()) {
                            i26 = ((org.telegram.ui.ActionBar.e2) passcodeActivity).currentAccount;
                            break;
                        }
                        r10 = false;
                        q8Var4.f(M04, r10, false);
                        break;
                    } else if (i7 == passcodeActivity.K) {
                        String M05 = org.telegram.messenger.hd.M0(2131743165, null);
                        i24 = ((org.telegram.ui.ActionBar.e2) passcodeActivity).currentAccount;
                        q8Var4.f(M05, org.telegram.ui.Wallet.l0.x(i24).K(), false);
                        break;
                    }
                } else if (i46 == 1) {
                    org.telegram.ui.Cells.v9 v9Var3 = (org.telegram.ui.Cells.v9) view6;
                    i27 = passcodeActivity.changePasscodeRow;
                    if (i7 == i27) {
                        v9Var3.b(org.telegram.messenger.hd.M0(2131752544, null), true);
                        if (org.telegram.messenger.gz.s.isEmpty()) {
                            int i47 = org.telegram.ui.ActionBar.j6.E6;
                            v9Var3.setTag(Integer.valueOf(i47));
                            org.telegram.ui.ActionBar.q6.U(v9Var3.getTextView(), i47, null);
                            break;
                        } else {
                            int i48 = org.telegram.ui.ActionBar.j6.G6;
                            v9Var3.setTag(Integer.valueOf(i48));
                            org.telegram.ui.ActionBar.q6.U(v9Var3.getTextView(), i48, null);
                            break;
                        }
                    } else {
                        i28 = passcodeActivity.autoLockRow;
                        if (i7 == i28) {
                            int i49 = org.telegram.messenger.gz.y;
                            v9Var3.c(org.telegram.messenger.hd.M0(2131753800, null), i49 == 0 ? org.telegram.messenger.hd.a0("AutoLockDisabled", null, 2131753799, new Object[0]) : i49 < 3600 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(i49 / 60, "Minutes", new Object[0])) : i49 < 86400 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G((int) Math.ceil((i49 / 60.0f) / 60.0f), "Hours", new Object[0])) : org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G((int) Math.ceil(((i49 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                            int i50 = org.telegram.ui.ActionBar.j6.G6;
                            v9Var3.setTag(Integer.valueOf(i50));
                            org.telegram.ui.ActionBar.q6.U(v9Var3.getTextView(), i50, null);
                            break;
                        } else {
                            i29 = passcodeActivity.disablePasscodeRow;
                            if (i7 == i29) {
                                v9Var3.b(org.telegram.messenger.hd.M0(2131751433, null), false);
                                int i51 = org.telegram.ui.ActionBar.j6.q7;
                                v9Var3.setTag(Integer.valueOf(i51));
                                org.telegram.ui.ActionBar.q6.U(v9Var3.getTextView(), i51, null);
                                break;
                            }
                        }
                    }
                } else if (i46 == 2) {
                    org.telegram.ui.Cells.y8 y8Var4 = (org.telegram.ui.Cells.y8) view6;
                    if (i7 == passcodeActivity.H) {
                        y8Var4.setText(org.telegram.messenger.hd.M0(2131747655, null));
                        y8Var4.setBackground(null);
                        y8Var4.getTextView().setGravity(1);
                        break;
                    } else if (i7 == passcodeActivity.I) {
                        y8Var4.setText(org.telegram.messenger.hd.M0(2131753797, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.M) {
                        y8Var4.setText(org.telegram.messenger.hd.M0(2131743078, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.P) {
                        y8Var4.setText(org.telegram.messenger.hd.M0(2131745842, null));
                        y8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    }
                } else if (i46 == 3) {
                    org.telegram.ui.Cells.n4 n4Var4 = (org.telegram.ui.Cells.n4) view6;
                    n4Var4.setHeight(46);
                    if (i7 == passcodeActivity.N) {
                        n4Var4.setText(org.telegram.messenger.hd.M0(2131745843, null));
                        break;
                    } else if (i7 == passcodeActivity.J) {
                        n4Var4.setText(org.telegram.messenger.hd.M0(2131743079, null));
                        break;
                    }
                } else if (i46 == 4) {
                    li0 li0Var = (li0) view6;
                    li0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    li0Var.a.d();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) e1Var.a;
                nm0 nm0Var = (nm0) obj2;
                v5Var.setAlbumsCount(nm0Var.f);
                while (true) {
                    int i52 = nm0Var.f;
                    if (i31 >= i52) {
                        v5Var.requestLayout();
                        break;
                    } else {
                        int i53 = (i52 * i7) + i31;
                        if (i53 < nm0Var.d.size()) {
                            v5Var.a(i31, (org.telegram.messenger.ve) nm0Var.d.get(i53));
                        } else {
                            v5Var.a(i31, null);
                        }
                        i31++;
                    }
                }
            case 14:
                I(e1Var, i7);
                break;
            case 15:
                J(e1Var, i7);
                break;
            case 16:
                K(e1Var, i7);
                break;
            case 17:
                L(e1Var, i7);
                break;
            case 18:
                M(e1Var, i7);
                break;
            default:
                View view7 = e1Var.a;
                pg.a aVar = (pg.a) ((pg.i) obj2).F.get(i7);
                int i54 = aVar.b;
                org.telegram.ui.Components.j6 j6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = p1.g.c(i54);
                if (c10 == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) view7;
                    n1Var.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false));
                    n1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    org.telegram.ui.Cells.n4 n4Var5 = (org.telegram.ui.Cells.n4) view7;
                    n4Var5.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.L6, false));
                    n4Var5.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    pg.h hVar = (pg.h) view7;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) j6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = j6Var;
                    hVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // v4.h0
    public void v(v4.e1 e1Var, int i7, List list) {
        int i10;
        boolean contains;
        switch (this.c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i11 = e1Var.f;
                View view = e1Var.a;
                if (i11 == 5 && !list.isEmpty()) {
                    mx0 mx0Var = (mx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i7 - proxyListActivity.n))) != mx0Var.h) {
                        mx0Var.h = contains;
                        mx0Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        mx0Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (e1Var.f != 3 || !list.contains(0)) {
                    t(e1Var, i7);
                    break;
                } else {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    i10 = proxyListActivity.useProxyRow;
                    if (i7 != i10) {
                        if (i7 == proxyListActivity.w) {
                            q8Var.setChecked(org.telegram.messenger.gz.a1);
                            break;
                        }
                    } else {
                        q8Var.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.v(e1Var, i7, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.cn] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        View n4Var;
        int i11;
        View view;
        View view2;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout2;
        View view3;
        View view4;
        View n4Var2;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        View q8Var;
        ViewGroup viewGroup2;
        View x6Var;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        int i12 = this.c;
        int i13 = 16;
        int i14 = 4;
        Object obj = this.e;
        int i15 = 3;
        final int i16 = 0;
        final int i17 = 2;
        final int i18 = 1;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                Context context = (Context) obj2;
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.n4(context);
                } else if (i7 == 1) {
                    frameLayout = new org.telegram.ui.Cells.q8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                    v9Var.setCanDisable(true);
                    frameLayout = v9Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.y8(context);
                }
                frameLayout.setLayoutParams(new v4.p0(-1, -2));
                return new org.telegram.ui.Components.cj0(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                boolean z10 = jnVar.n;
                org.telegram.ui.ActionBar.e6 e6Var6 = jnVar.a;
                switch (i7) {
                    case 0:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, jnVar.a);
                        break;
                    case 1:
                        i10 = -1;
                        View x6Var2 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.y0) null);
                        new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var6)), org.telegram.ui.ActionBar.j6.Y0(context2, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).x = true;
                        n4Var = x6Var2;
                        break;
                    case 2:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.y8(context2, e6Var6);
                        break;
                    case 3:
                        i10 = -1;
                        n4Var = new org.telegram.ui.Cells.l8(context2, e6Var6);
                        break;
                    case 4:
                    case 11:
                        i10 = -1;
                        org.telegram.ui.Components.en enVar = new org.telegram.ui.Components.en(this, (Context) obj2, jnVar.J ? 1 : 0, jnVar.a, i7);
                        if (i7 == 11 && !z10) {
                            enVar.setTextRight(98);
                            enVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    switch (i16) {
                                        case 0:
                                            jn.T((jn) this.b.e, -2);
                                            break;
                                        case 1:
                                            jn.T((jn) this.b.e, -3);
                                            break;
                                        default:
                                            ((jn) this.b.e).c0(view5, (org.telegram.ui.Cells.z5) view5.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        enVar.d();
                        enVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                        enVar.c(new org.telegram.ui.Components.fn(this, enVar, i7));
                        n4Var = enVar;
                        break;
                    case 5:
                    default:
                        i11 = -1;
                        org.telegram.ui.Components.hn hnVar = new org.telegram.ui.Components.hn(this, (Context) obj2, jnVar.J ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                            public final /* synthetic */ org.telegram.ui.l4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                switch (i17) {
                                    case 0:
                                        jn.T((jn) this.b.e, -2);
                                        break;
                                    case 1:
                                        jn.T((jn) this.b.e, -3);
                                        break;
                                    default:
                                        ((jn) this.b.e).c0(view5, (org.telegram.ui.Cells.z5) view5.getParent(), true);
                                        break;
                                }
                            }
                        }, jnVar.a);
                        if (!z10) {
                            hnVar.setTextRight(org.telegram.messenger.ns.W1);
                            hnVar.b().setOnClickListener(new org.telegram.ui.Components.n2(r10, this, hnVar));
                        }
                        int i19 = org.telegram.ui.ActionBar.j6.o7;
                        hnVar.setIconsColor(i19);
                        org.telegram.ui.Components.fp fpVar = hnVar.r;
                        if (fpVar != null) {
                            fpVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
                            float f10 = hnVar.a.e;
                            if (checkBoxBase.w != f10) {
                                checkBoxBase.w = f10;
                                checkBoxBase.b();
                            }
                        }
                        hnVar.getCheckBox().b(-1, i19, org.telegram.ui.ActionBar.j6.k7);
                        hnVar.c(new bi.v(11, this, hnVar));
                        hnVar.setShowNextButton(true);
                        EditTextBoldCursor textView = hnVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ld(i17, this, hnVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.dn(hnVar, i16));
                        view2 = hnVar;
                        i10 = i11;
                        n4Var = view2;
                        break;
                    case 6:
                        i11 = -1;
                        view2 = new org.telegram.ui.Cells.q8(context2, e6Var6);
                        i10 = i11;
                        n4Var = view2;
                        break;
                    case 7:
                        i11 = -1;
                        org.telegram.ui.Components.gn gnVar = new org.telegram.ui.Components.gn(this, context2, jnVar.J ? 1 : 0);
                        gnVar.d();
                        if (!z10) {
                            gnVar.setTextRight(98);
                            gnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    switch (i18) {
                                        case 0:
                                            jn.T((jn) this.b.e, -2);
                                            break;
                                        case 1:
                                            jn.T((jn) this.b.e, -3);
                                            break;
                                        default:
                                            ((jn) this.b.e).c0(view5, (org.telegram.ui.Cells.z5) view5.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        gnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                        gnVar.c(new bi.v(10, this, gnVar));
                        view2 = gnVar;
                        i10 = i11;
                        n4Var = view2;
                        break;
                    case 8:
                        i11 = -1;
                        View bnVar = new org.telegram.ui.Components.bn(context2, 0);
                        bnVar.setTag(-33024);
                        view = bnVar;
                        view2 = view;
                        i10 = i11;
                        n4Var = view2;
                        break;
                    case 9:
                        i11 = -1;
                        View o2Var = new bi.o2(i13, context2, this);
                        o2Var.setTag(-33024);
                        view = o2Var;
                        view2 = view;
                        i10 = i11;
                        n4Var = view2;
                        break;
                    case 10:
                        i11 = -1;
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, e6Var6);
                        x5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        view2 = x5Var;
                        i10 = i11;
                        n4Var = view2;
                        break;
                }
                return i5.c.q(n4Var, n4Var, i10, -2);
            case 2:
                return new org.telegram.ui.Components.cj0(new org.telegram.ui.Components.gz((org.telegram.ui.Components.iz) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(0, (Context) obj2, null);
                n2Var.setBackground(null);
                n2Var.setLayoutParams(new v4.p0(-1, -2));
                return new org.telegram.ui.Components.cj0(n2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.e6 e6Var7 = ((org.telegram.ui.Components.td0) obj).J0;
                    org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context3);
                    s5Var.e = new j6.o(s5Var, 23);
                    TextView textView2 = new TextView(context3);
                    s5Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    s5Var.addView(textView2, c8.ja.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    s5Var.b = textView3;
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.qg, e6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    s5Var.addView(textView3, c8.ja.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    org.telegram.ui.Components.id0 id0Var = new org.telegram.ui.Components.id0(context3);
                    Paint paint = new Paint();
                    id0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    id0Var.b = paint2;
                    id0Var.c = org.telegram.messenger.g0.L(16.0f);
                    id0Var.d = 0;
                    id0Var.e = 0.0f;
                    id0Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    s5Var.c = id0Var;
                    s5Var.addView(id0Var, c8.ja.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    s5Var.setSeekBarDelegate(new org.telegram.ui.Components.gx(this, 11));
                    r5Var = s5Var;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.y60(this, i14));
                    r5Var = r5Var2;
                }
                return new org.telegram.ui.Components.cj0(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.bt0 bt0Var = (org.telegram.ui.Components.bt0) obj;
                if (i7 != 0) {
                    FrameLayout v1Var = new bi.v1(context4, 21);
                    v1Var.setWillNotDraw(false);
                    bt0Var.p1 = new TextView(context4);
                    org.telegram.ui.ActionBar.q6.U(bt0Var.p1, org.telegram.ui.ActionBar.j6.J5, bt0Var.J0);
                    bt0Var.p1.setTextSize(1, 14.0f);
                    bt0Var.p1.setGravity(17);
                    bt0Var.p1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    v1Var.addView(bt0Var.p1, c8.ja.c(40.0f, -1));
                    frameLayout2 = v1Var;
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.q7(54, context4, bt0Var.J0, false);
                }
                return new org.telegram.ui.Components.cj0(frameLayout2);
            case 6:
                return new org.telegram.ui.Components.cj0(new org.telegram.ui.Components.qw0((org.telegram.ui.Components.rw0) obj, ((org.telegram.ui.Components.rw0) obj2).getContext()));
            case 7:
                return new org.telegram.ui.Components.cj0(new org.telegram.ui.Components.t61((org.telegram.ui.Components.v61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context5);
                    q8Var2.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                    q8Var2.setTypeface(org.telegram.messenger.g0.o());
                    q8Var2.setHeight(56);
                    view3 = q8Var2;
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.Cells.x6(context5, (org.telegram.ui.Cells.y0) null);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.Cells.n4(context5);
                } else if (i7 != 3) {
                    view3 = i7 != 4 ? new org.telegram.ui.Cells.y8(context5) : new org.telegram.ui.Cells.h5(context5);
                } else {
                    org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context5, null);
                    wt0Var.setCallback(new zr(this, i15));
                    view3 = wt0Var;
                }
                return i5.c.q(view3, view3, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                View l8Var = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new org.telegram.ui.Cells.l8(context6) : new org.telegram.ui.Cells.h5(context6) : new org.telegram.ui.Cells.y8(context6) : new org.telegram.ui.Cells.q8(context6) : new org.telegram.ui.Cells.n4(context6, 22) : new org.telegram.ui.Cells.v9(context6) : new org.telegram.ui.Cells.x6(context6, (org.telegram.ui.Cells.y0) null);
                return i5.c.q(l8Var, l8Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 == 0) {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var3, null);
                    view4 = n4Var3;
                } else if (i7 == 1) {
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context7);
                    x8Var.setMultilineDetail(true);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x8Var, null);
                    view4 = x8Var;
                } else if (i7 == 2) {
                    view4 = new org.telegram.ui.Cells.x6(context7, (org.telegram.ui.Cells.y0) null);
                } else if (i7 != 3) {
                    view4 = new org.telegram.ui.Cells.y8(context7);
                } else {
                    View v9Var2 = new org.telegram.ui.Cells.v9(context7);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, v9Var2, null);
                    view4 = v9Var2;
                }
                return i5.c.q(view4, view4, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    e6Var = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, e6Var);
                } else if (i7 == 1) {
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.q8(context8, e6Var2);
                } else if (i7 == 2) {
                    n4Var2 = new org.telegram.ui.Cells.x8(context8);
                } else if (i7 == 3) {
                    e6Var3 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, e6Var3);
                } else if (i7 == 4) {
                    n4Var2 = new org.telegram.ui.Cells.x6(context8, (org.telegram.ui.Cells.y0) null);
                } else if (i7 != 5) {
                    e6Var5 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.y8(context8, e6Var5);
                } else {
                    e6Var4 = ((org.telegram.ui.ActionBar.e2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.v9(0, context8, e6Var4);
                }
                return new org.telegram.ui.Components.cj0(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 == 0) {
                    q8Var = new org.telegram.ui.Cells.q8(context9);
                } else if (i7 == 1) {
                    q8Var = new org.telegram.ui.Cells.v9(context9);
                } else if (i7 == 3) {
                    q8Var = new org.telegram.ui.Cells.n4(context9);
                } else if (i7 != 4) {
                    q8Var = new org.telegram.ui.Cells.y8(context9);
                } else {
                    q8Var = new li0(context9);
                    q8Var.setTag(-33024);
                }
                return new org.telegram.ui.Components.cj0(q8Var);
            case 13:
                Context context10 = (Context) obj2;
                org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context10);
                v5Var.e = new Paint();
                v5Var.b = new org.telegram.messenger.ve[4];
                v5Var.a = new org.telegram.ui.Cells.t5[4];
                while (i16 < 4) {
                    v5Var.a[i16] = new org.telegram.ui.Cells.t5(v5Var, context10);
                    v5Var.addView(v5Var.a[i16]);
                    v5Var.a[i16].setVisibility(4);
                    v5Var.a[i16].setTag(Integer.valueOf(i16));
                    v5Var.a[i16].setOnClickListener(new org.telegram.ui.Cells.a(v5Var, 9));
                    i16++;
                }
                v5Var.setDelegate(new ni0(this, i18));
                return new org.telegram.ui.Components.cj0(v5Var);
            case 14:
                ym0 ym0Var = (ym0) obj;
                boolean z11 = ym0Var.s0;
                Context context11 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new wm0(this));
                    q5Var.getCheckFrame().setVisibility(ym0Var.U == 0 ? 0 : 8);
                    viewGroup2 = q5Var;
                } else if (i7 == 1) {
                    ViewGroup frameLayout5 = new FrameLayout(context11);
                    frameLayout5.setLayoutParams(new v4.p0(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout5.addView(radialProgressView, c8.ja.c(-1.0f, -1));
                    viewGroup2 = frameLayout5;
                } else if (i7 == 2) {
                    viewGroup2 = new org.telegram.ui.Cells.g7(1, context11, null);
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                    e3Var.setForceDarkTheme(z11);
                    viewGroup2 = e3Var;
                } else {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context11, true);
                    l8Var2.setLayoutParams(new v4.p0(-1, -2));
                    viewGroup2 = l8Var2;
                    if (z11) {
                        org.telegram.ui.ActionBar.q6.X(l8Var2.a, ym0Var.w0, null);
                        org.telegram.ui.ActionBar.q6.s(l8Var2.e, org.telegram.ui.ActionBar.j6.ih, null, PorterDuff.Mode.MULTIPLY);
                        viewGroup2 = l8Var2;
                    }
                }
                return new org.telegram.ui.Components.cj0(viewGroup2);
            case 15:
                Context context12 = (Context) obj2;
                org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context12);
                new Paint();
                w5Var.setWillNotDraw(false);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context12);
                w5Var.a = i9Var;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                w5Var.addView(i9Var, c8.ja.c(-1.0f, -1));
                FrameLayout frameLayout6 = new FrameLayout(context12);
                w5Var.b = frameLayout6;
                w5Var.addView(frameLayout6, c8.ja.e(42, 42, 53));
                di.k4 k4Var = new di.k4(context12);
                k4Var.d = new Path();
                k4Var.e = new float[8];
                k4Var.b = new RectF();
                k4Var.c = new Paint(1);
                w5Var.e = k4Var;
                k4Var.setWillNotDraw(false);
                k4Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                w5Var.addView(k4Var, c8.ja.e(-1, 16, 83));
                k4Var.addView(org.telegram.messenger.i20.e(context12, R.drawable.ic_video), c8.ja.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                w5Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                k4Var.addView(textView4, c8.ja.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.fp fpVar2 = new org.telegram.ui.Components.fp(24, context12, null);
                w5Var.c = fpVar2;
                fpVar2.setDrawBackgroundAsArc(11);
                fpVar2.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
                w5Var.addView(fpVar2, c8.ja.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                fpVar2.setVisibility(0);
                w5Var.setFocusable(true);
                frameLayout6.setOnClickListener(new g40(this, 21));
                return new org.telegram.ui.Components.cj0(w5Var);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 == 0) {
                    x6Var = new org.telegram.ui.Cells.x6(context13, (org.telegram.ui.Cells.y0) null);
                } else if (i7 == 1) {
                    x6Var = new org.telegram.ui.Cells.v9(context13);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x6Var, null);
                } else if (i7 == 2) {
                    x6Var = new org.telegram.ui.Cells.n4(context13);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x6Var, null);
                } else if (i7 == 3) {
                    x6Var = new org.telegram.ui.Cells.q8(context13);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x6Var, null);
                } else if (i7 == 4) {
                    x6Var = new org.telegram.ui.Cells.y8(context13);
                } else if (i7 != 6) {
                    x6Var = new mx0((ProxyListActivity) obj, context13);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x6Var, null);
                } else {
                    x6Var = new org.telegram.ui.Components.wt0(context13, null);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, x6Var, null);
                }
                return i5.c.q(x6Var, x6Var, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    frameLayout3 = new org.telegram.ui.Cells.n4(context14);
                } else if (i7 == 1) {
                    frameLayout3 = new org.telegram.ui.Cells.q8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context14);
                    v9Var3.setCanDisable(true);
                    frameLayout3 = v9Var3;
                } else {
                    frameLayout3 = new org.telegram.ui.Cells.y8(context14);
                }
                frameLayout3.setLayoutParams(new v4.p0(-1, -2));
                return new org.telegram.ui.Components.cj0(frameLayout3);
            case 18:
                Context context15 = (Context) obj2;
                View t2Var = i7 == 0 ? new org.telegram.ui.Cells.t2(context15, false) : new org.telegram.ui.Cells.t4(context15);
                t2Var.setLayoutParams(new v4.p0(-1, -2));
                return new org.telegram.ui.Components.cj0(t2Var);
            default:
                Context context16 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 == 1) {
                    frameLayout4 = new org.telegram.ui.Cells.n4(context16);
                } else if (c10 != 2) {
                    frameLayout4 = new org.telegram.ui.ActionBar.n1(context16, null);
                } else {
                    pg.h hVar = new pg.h(context16);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context16);
                    hVar.a = qm0Var;
                    qm0Var.setReportChanges(true);
                    qm0Var.setDelegate(new org.telegram.messenger.ou(hVar, 15));
                    qm0Var.setImportantForAccessibility(2);
                    hVar.addView(qm0Var, c8.ja.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout4 = hVar;
                }
                frameLayout4.setLayoutParams(new v4.p0(-1, -2));
                return new org.telegram.ui.Components.cj0(frameLayout4);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        int i7;
        int i10 = this.c;
        Object obj = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                sh.d dVar = jnVar.n1;
                boolean z10 = jnVar.n;
                int i11 = e1Var.f;
                View view = e1Var.a;
                if (i11 != 4) {
                    if (i11 != 11) {
                        if (i11 != 5) {
                            if (i11 == 7) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                z5Var.setTag(1);
                                CharSequence charSequence = jnVar.Q;
                                z5Var.o(charSequence != null ? charSequence : "", org.telegram.messenger.hd.M0(2131754474, null), false);
                                z5Var.setTag(null);
                                if (!z10) {
                                    z5Var.e.b(dVar.b(-3), false);
                                }
                                org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                                break;
                            }
                        } else {
                            int b10 = e1Var.b();
                            org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                            z5Var2.setTag(1);
                            z5Var2.a.a(jnVar.c0, false);
                            int i12 = b10 - jnVar.u0;
                            z5Var2.o(jnVar.L[i12], org.telegram.messenger.hd.M0(z10 ? 2131744055 : 2131747774, null), true);
                            z5Var2.setTag(null);
                            if (jnVar.l0 == b10) {
                                EditTextBoldCursor textView = z5Var2.getTextView();
                                textView.requestFocus();
                                org.telegram.messenger.g0.J3(textView);
                                jnVar.l0 = -1;
                            }
                            if (!z10) {
                                z5Var2.e.b(dVar.b(i12), false);
                            }
                            org.telegram.ui.Components.jn.Q(jnVar, view, b10);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
                        z5Var3.setTag(1);
                        CharSequence charSequence2 = jnVar.P;
                        z5Var3.o(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.hd.M0(2131746449, null), false);
                        z5Var3.setTag(null);
                        z5Var3.e.b(dVar.b(-2), false);
                        org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.z5 z5Var4 = (org.telegram.ui.Cells.z5) view;
                    z5Var4.setTag(1);
                    CharSequence charSequence3 = jnVar.O;
                    z5Var4.o(charSequence3 != null ? charSequence3 : "", org.telegram.messenger.hd.M0(z10 ? 2131744053 : 2131746448, null), true);
                    z5Var4.setTag(null);
                    org.telegram.ui.Components.jn.Q(jnVar, view, e1Var.b());
                    break;
                }
                break;
            case 9:
                if (e1Var.f == 3) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) e1Var.a;
                    int b11 = e1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 != dataSettingsActivity.F) {
                        if (b11 != dataSettingsActivity.E) {
                            if (b11 != dataSettingsActivity.G) {
                                if (b11 != dataSettingsActivity.H) {
                                    if (b11 != dataSettingsActivity.K) {
                                        if (b11 == dataSettingsActivity.L) {
                                            int i13 = org.telegram.messenger.gz.a;
                                            q8Var.setChecked(org.telegram.messenger.qc.e(1024));
                                            break;
                                        }
                                    } else {
                                        int i14 = org.telegram.messenger.gz.a;
                                        q8Var.setChecked(org.telegram.messenger.qc.e(2048));
                                        break;
                                    }
                                } else {
                                    q8Var.setChecked(org.telegram.messenger.gz.D0);
                                    break;
                                }
                            } else {
                                q8Var.setChecked(org.telegram.messenger.gz.C0);
                                break;
                            }
                        } else {
                            q8Var.setChecked(org.telegram.messenger.gz.B0);
                            break;
                        }
                    } else {
                        q8Var.setChecked(org.telegram.messenger.gz.E0);
                        break;
                    }
                }
                break;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (e1Var.f == 3) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) e1Var.a;
                    int b12 = e1Var.b();
                    i7 = proxyListActivity.useProxyRow;
                    if (b12 != i7) {
                        if (b12 == proxyListActivity.w) {
                            q8Var2.setChecked(org.telegram.messenger.gz.a1);
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

    @Override // v4.h0
    public void z(v4.e1 e1Var) {
        switch (this.c) {
            case 1:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.e;
                int i7 = e1Var.f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) e1Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (jnVar.J) {
                            org.telegram.ui.Components.an anVar = jnVar.y;
                            if (anVar != null) {
                                anVar.f();
                            }
                            jnVar.e0(true);
                        }
                        jnVar.h1 = null;
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
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.a = org.telegram.messenger.hd.M0(2131744171, null);
        o2Var.b = org.telegram.messenger.hd.M0(2131744163, null);
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
        o2Var2.a = org.telegram.messenger.hd.M0(2131744170, null);
        o2Var2.b = org.telegram.messenger.hd.M0(2131744162, null);
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
        o2Var3.a = org.telegram.messenger.hd.M0(2131744169, null);
        o2Var3.b = org.telegram.messenger.hd.M0(2131744161, null);
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
        o2Var4.a = org.telegram.messenger.hd.M0(2131744168, null);
        o2Var4.b = org.telegram.messenger.hd.M0(2131744160, null);
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
        o2Var5.a = org.telegram.messenger.hd.M0(2131744167, null);
        o2Var5.b = org.telegram.messenger.hd.M0(2131744159, null);
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
        o2Var6.a = org.telegram.messenger.hd.M0(2131744166, null);
        o2Var6.b = org.telegram.messenger.hd.M0(2131744158, null);
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
        o2Var7.a = org.telegram.messenger.hd.M0(2131744165, null);
        o2Var7.b = org.telegram.messenger.hd.M0(2131744157, null);
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
        o2Var8.a = org.telegram.messenger.hd.M0(2131744164, null);
        o2Var8.b = org.telegram.messenger.hd.M0(2131744156, null);
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

    public l4(ProxyListActivity proxyListActivity, Context context) {
        this.c = 16;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
