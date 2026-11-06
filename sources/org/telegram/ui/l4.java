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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l4 extends org.telegram.ui.Components.oj0 {
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
    private final void G(v4.d1 d1Var, int i7) {
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
        boolean z9;
        boolean z10;
        org.telegram.messenger.y5 y5Var;
        CharSequence M02;
        int i20;
        boolean z11;
        int i21;
        CharSequence charSequence2;
        int i22;
        int i23;
        int i24;
        CharSequence M03;
        int i25;
        boolean a10;
        boolean z12;
        CharSequence charSequence3;
        boolean z13;
        boolean z14;
        int i26;
        int i27;
        DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
        int i28 = d1Var.f;
        View view = d1Var.a;
        boolean z15 = true;
        int i29 = 0;
        switch (i28) {
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                w9Var.setCanDisable(false);
                org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                i10 = dataSettingsActivity.useLessDataForCallsRow;
                if (i7 != i10) {
                    i11 = dataSettingsActivity.proxyRow;
                    if (i7 != i11) {
                        i12 = dataSettingsActivity.resetDownloadRow;
                        if (i7 != i12) {
                            i13 = dataSettingsActivity.clearDraftsRow;
                            if (i7 == i13) {
                                w9Var.setIcon(0);
                                w9Var.b(org.telegram.messenger.hd.M0(2131746840, null), false);
                                break;
                            }
                        } else {
                            w9Var.setIcon(0);
                            w9Var.setCanDisable(true);
                            org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                            w9Var.b(org.telegram.messenger.hd.M0(2131746112, null), false);
                            break;
                        }
                    } else {
                        w9Var.setIcon(0);
                        w9Var.b(org.telegram.messenger.hd.M0(2131746600, null), false);
                        break;
                    }
                } else {
                    w9Var.setIcon(0);
                    int i30 = org.telegram.messenger.qp.e1().getInt("VoipDataSaving", org.telegram.ui.Components.voip.y1.c());
                    if (i30 == 0) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743796, null);
                    } else if (i30 == 1) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743795, null);
                    } else if (i30 == 2) {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743797, null);
                    } else if (i30 != 3) {
                        M0 = null;
                        str = null;
                    } else {
                        str = null;
                        M0 = org.telegram.messenger.hd.M0(2131743794, null);
                    }
                    w9Var.c(org.telegram.messenger.hd.M0(2131743230, str), M0, dataSettingsActivity.U, true);
                    dataSettingsActivity.U = false;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != dataSettingsActivity.d) {
                    if (i7 != 0) {
                        if (i7 != dataSettingsActivity.M) {
                            if (i7 != dataSettingsActivity.O) {
                                if (i7 != dataSettingsActivity.y) {
                                    if (i7 != dataSettingsActivity.I) {
                                        if (i7 == dataSettingsActivity.R) {
                                            n4Var.setText(org.telegram.messenger.hd.M0(2131745919, null));
                                            break;
                                        }
                                    } else {
                                        n4Var.setText(org.telegram.messenger.hd.M0(2131753764, null));
                                        break;
                                    }
                                } else {
                                    n4Var.setText(org.telegram.messenger.hd.M0(2131744439, null));
                                    break;
                                }
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746610, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131752596, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131751677, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753767, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (i7 != dataSettingsActivity.D) {
                    if (i7 != dataSettingsActivity.E) {
                        if (i7 != dataSettingsActivity.G) {
                            if (i7 != dataSettingsActivity.F) {
                                if (i7 != dataSettingsActivity.J) {
                                    if (i7 == dataSettingsActivity.K) {
                                        String M04 = org.telegram.messenger.hd.M0(2131753763, null);
                                        int i31 = org.telegram.messenger.iz.a;
                                        r8Var.f(M04, org.telegram.messenger.rc.e(1024), false);
                                        break;
                                    }
                                } else {
                                    String M05 = org.telegram.messenger.hd.M0(2131753765, null);
                                    int i32 = org.telegram.messenger.iz.a;
                                    r8Var.f(M05, org.telegram.messenger.rc.e(2048), true);
                                    break;
                                }
                            } else {
                                r8Var.f("(beta only) Stream All Videos", org.telegram.messenger.iz.C0, false);
                                break;
                            }
                        } else {
                            r8Var.f("(beta only) Show MKV as Video", org.telegram.messenger.iz.D0, true);
                            break;
                        }
                    }
                } else {
                    r8Var.f(org.telegram.messenger.hd.M0(2131751145, null), org.telegram.messenger.iz.B0, dataSettingsActivity.F != -1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == dataSettingsActivity.H) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131751159, null));
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i14 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i7 == i14) {
                    M03 = org.telegram.messenger.hd.M0(2131745920, null);
                    org.telegram.messenger.sv svVar = org.telegram.messenger.b6.d;
                    i26 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                    charSequence2 = svVar.e(i26);
                    a10 = org.telegram.messenger.b6.d.a();
                } else {
                    i15 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i7 == i15) {
                        M03 = org.telegram.messenger.hd.M0(2131745927, null);
                        org.telegram.messenger.sv svVar2 = org.telegram.messenger.b6.e;
                        i25 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                        charSequence2 = svVar2.e(i25);
                        a10 = org.telegram.messenger.b6.e.a();
                    } else {
                        i16 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i7 == i16) {
                            CharSequence M06 = org.telegram.messenger.hd.M0(2131745929, null);
                            org.telegram.messenger.sv svVar3 = org.telegram.messenger.b6.f;
                            i24 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                            charSequence2 = svVar3.e(i24);
                            charSequence = M06;
                            z9 = org.telegram.messenger.b6.f.a();
                            z10 = false;
                            y5Var = null;
                            if (y5Var == null) {
                                long[] jArr = y5Var.b;
                                StringBuilder sb2 = new StringBuilder();
                                int i33 = 0;
                                boolean z16 = false;
                                int i34 = 0;
                                boolean z17 = false;
                                boolean z18 = false;
                                while (true) {
                                    int[] iArr = y5Var.a;
                                    int i35 = z15;
                                    if (i33 < iArr.length) {
                                        if (!z16 && (iArr[i33] & 1) != 0) {
                                            i34++;
                                            z16 = i35;
                                        }
                                        if (!z17 && (iArr[i33] & 4) != 0) {
                                            i34++;
                                            z17 = i35;
                                        }
                                        if (!z18 && (iArr[i33] & 8) != 0) {
                                            i34++;
                                            z18 = i35;
                                        }
                                        i33++;
                                        z15 = i35;
                                    } else {
                                        if (!y5Var.g || i34 == 0) {
                                            z14 = z16;
                                            sb2.append(org.telegram.messenger.hd.M0(2131748196, null));
                                        } else {
                                            if (z16) {
                                                sb2.append(org.telegram.messenger.hd.M0(2131753816, null));
                                            }
                                            if (z17) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.hd.M0(2131753805, null));
                                                z14 = z16;
                                                Object[] objArr = new Object[i35];
                                                objArr[0] = org.telegram.messenger.g0.i0(jArr[i35], i35, false);
                                                sb2.append(String.format(" (%1$s)", objArr));
                                            } else {
                                                z14 = z16;
                                            }
                                            if (z18) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(org.telegram.messenger.hd.M0(2131753837, null));
                                                sb2.append(String.format(" (%1$s)", org.telegram.messenger.g0.i0(jArr[org.telegram.messenger.z5.x(8)], true, false)));
                                            }
                                        }
                                        if ((z14 || z17 || z18) && z9) {
                                            i29 = 1;
                                        }
                                        charSequence3 = sb2;
                                        z12 = i29;
                                        z13 = true;
                                    }
                                }
                            } else {
                                z12 = z9;
                                charSequence3 = charSequence2;
                                z13 = true;
                            }
                            h5Var.setAnimationsEnabled(z13);
                            h5Var.b(charSequence, charSequence3, 0, z12, 0, true, z10, false);
                            break;
                        } else {
                            if (i7 == dataSettingsActivity.e) {
                                M02 = org.telegram.messenger.hd.M0(2131742885, null);
                                i22 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                z11 = org.telegram.messenger.z5.q(i22).M.g;
                                i23 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i23).n();
                            } else if (i7 == dataSettingsActivity.h) {
                                M02 = org.telegram.messenger.hd.M0(2131742887, null);
                                i20 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                z11 = org.telegram.messenger.z5.q(i20).N.g;
                                i21 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                y5Var = org.telegram.messenger.z5.q(i21).p();
                            } else {
                                CharSequence M07 = org.telegram.messenger.hd.M0(2131742886, null);
                                i17 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                boolean z19 = org.telegram.messenger.z5.q(i17).O.g;
                                i18 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                                org.telegram.messenger.y5 o4 = org.telegram.messenger.z5.q(i18).o();
                                i19 = dataSettingsActivity.resetDownloadRow;
                                charSequence = M07;
                                z9 = z19;
                                z10 = i19 >= 0;
                                y5Var = o4;
                                charSequence2 = null;
                                if (y5Var == null) {
                                }
                                h5Var.setAnimationsEnabled(z13);
                                h5Var.b(charSequence, charSequence3, 0, z12, 0, true, z10, false);
                            }
                            charSequence = M02;
                            z9 = z11;
                            z10 = true;
                            charSequence2 = null;
                            if (y5Var == null) {
                            }
                            h5Var.setAnimationsEnabled(z13);
                            h5Var.b(charSequence, charSequence3, 0, z12, 0, true, z10, false);
                        }
                    }
                }
                charSequence = M03;
                z9 = a10;
                z10 = true;
                y5Var = null;
                if (y5Var == null) {
                }
                h5Var.setAnimationsEnabled(z13);
                h5Var.b(charSequence, charSequence3, 0, z12, 0, true, z10, false);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (i7 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.W) {
                        m8Var.r(org.telegram.messenger.hd.M0(2131744817, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        m8Var.h(45, true, dataSettingsActivity.V);
                    } else {
                        String M08 = org.telegram.messenger.hd.M0(2131744817, null);
                        long j3 = dataSettingsActivity.X;
                        m8Var.r(M08, j3 <= 0 ? "" : org.telegram.messenger.g0.i0(j3, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        m8Var.h(45, false, dataSettingsActivity.V);
                    }
                    dataSettingsActivity.V = false;
                } else if (i7 == dataSettingsActivity.w) {
                    i27 = ((org.telegram.ui.ActionBar.f2) dataSettingsActivity).currentAccount;
                    org.telegram.messenger.jz e10 = org.telegram.messenger.jz.e(i27);
                    m8Var.r(org.telegram.messenger.hd.M0(2131748297, null), org.telegram.messenger.g0.i0(e10.g(2, 6) + e10.g(1, 6) + e10.g(0, 6) + e10.f(2, 6) + e10.f(1, 6) + e10.f(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i7 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(org.telegram.messenger.iz.h0)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i29 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i29)).getAbsolutePath();
                                if (absolutePath2.startsWith(org.telegram.messenger.iz.h0)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    m8Var.r(org.telegram.messenger.hd.M0(2131744821, null), org.telegram.messenger.hd.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131749187 : 2131745841, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                m8Var.setOffsetFromImage(64);
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
    private final void H(v4.d1 d1Var, int i7) {
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
        boolean z9;
        int i34;
        int i35;
        int i36;
        NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
        int i37 = d1Var.f;
        View view = d1Var.a;
        if (i37 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == notificationsSettingsActivity.y) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747908, "NotificationsForChats"));
                return;
            }
            if (i7 == notificationsSettingsActivity.E) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131749218, "InAppNotifications"));
                return;
            }
            if (i7 == notificationsSettingsActivity.K) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131750886, "Events"));
                return;
            }
            if (i7 == notificationsSettingsActivity.M) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747890, "NotificationsOther"));
                return;
            }
            if (i7 == notificationsSettingsActivity.S) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746119, "Reset"));
                return;
            }
            if (i7 == notificationsSettingsActivity.G) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131743280, "VoipNotificationSettings"));
                return;
            } else if (i7 == notificationsSettingsActivity.N) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753733, "BadgeNumber"));
                return;
            } else {
                if (i7 == notificationsSettingsActivity.r) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745337, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        int i38 = 0;
        if (i37 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            i10 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).d7;
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i7 == i11) {
                r8Var.f(org.telegram.messenger.hd.M0(2131749214, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i12 = notificationsSettingsActivity.inappVibrateRow;
            if (i7 == i12) {
                r8Var.f(org.telegram.messenger.hd.M0(2131749213, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappPreviewRow;
            if (i7 == i13) {
                r8Var.f(org.telegram.messenger.hd.M0(2131749215, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPriorityRow;
            if (i7 == i14) {
                r8Var.g(org.telegram.messenger.hd.M0(2131749217, null), org.telegram.messenger.hd.M0(2131749216, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i15 = notificationsSettingsActivity.contactJoinedRow;
            if (i7 == i15) {
                r8Var.f(org.telegram.messenger.hd.M0(2131751790, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i16 = notificationsSettingsActivity.pinnedMessageRow;
            if (i7 == i16) {
                r8Var.f(org.telegram.messenger.hd.M0(2131747227, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i7 == notificationsSettingsActivity.P) {
                r8Var.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.w) {
                r8Var.g(org.telegram.messenger.hd.M0(2131747875, "NotificationsService"), org.telegram.messenger.hd.M0(2131747872, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().B3), true, true);
                return;
            }
            if (i7 == notificationsSettingsActivity.x) {
                r8Var.g(org.telegram.messenger.hd.M0(2131747874, "NotificationsServiceConnection"), org.telegram.messenger.hd.M0(2131747873, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().C3), true, true);
                return;
            }
            i17 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i7 == i17) {
                r8Var.f(org.telegram.messenger.hd.M0(2131753731, "BadgeNumberShow"), notificationsSettingsActivity.getNotificationsController().R, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i7 == i18) {
                r8Var.f(org.telegram.messenger.hd.M0(2131753732, "BadgeNumberMutedChats"), notificationsSettingsActivity.getNotificationsController().S, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i7 == i19) {
                r8Var.f(org.telegram.messenger.hd.M0(2131753730, "BadgeNumberUnread"), notificationsSettingsActivity.getNotificationsController().T, false);
                return;
            }
            i20 = notificationsSettingsActivity.inchatSoundRow;
            if (i7 == i20) {
                r8Var.f(org.telegram.messenger.hd.M0(2131749212, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i7 == notificationsSettingsActivity.H) {
                r8Var.f(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i21 = notificationsSettingsActivity.accountsAllRow;
            if (i7 == i21) {
                r8Var.f(org.telegram.messenger.hd.M0(2131754302, "AllAccounts"), org.telegram.messenger.qp.f1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i37 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setMultilineDetail(true);
            i22 = notificationsSettingsActivity.resetNotificationsRow;
            if (i7 == i22) {
                y8Var.a(org.telegram.messenger.hd.M0(2131746113, "ResetAllNotifications"), org.telegram.messenger.hd.M0(2131743887, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i37 != 3) {
            if (i37 != 5) {
                if (i37 != 6) {
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == notificationsSettingsActivity.s) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131745336, "ShowNotificationsForInfo"));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            i36 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(i36).d7;
            if (i7 == notificationsSettingsActivity.I) {
                String string = sharedPreferences2.getString("CallsRingtone", org.telegram.messenger.hd.M0(2131751600, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = org.telegram.messenger.hd.M0(2131748150, "NoSound");
                }
                w9Var.c(org.telegram.messenger.hd.M0(2131743242, "VoipSettingsRingtone"), string, notificationsSettingsActivity.W, false);
                notificationsSettingsActivity.W = false;
                return;
            }
            if (i7 != notificationsSettingsActivity.H) {
                if (i7 == notificationsSettingsActivity.Q) {
                    int i39 = sharedPreferences2.getInt("repeat_messages", 60);
                    w9Var.c(org.telegram.messenger.hd.M0(2131746274, "RepeatNotifications"), i39 == 0 ? org.telegram.messenger.hd.M0(2131746273, "RepeatNotificationsNever") : i39 < 60 ? org.telegram.messenger.hd.G(i39, "Minutes", new Object[0]) : org.telegram.messenger.hd.G(i39 / 60, "Hours", new Object[0]), notificationsSettingsActivity.X, false);
                    notificationsSettingsActivity.X = false;
                    return;
                }
                return;
            }
            int i40 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                w9Var.c(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), org.telegram.messenger.hd.M0(2131743614, "VibrationDefault"), notificationsSettingsActivity.V, true);
            } else if (i40 == 1) {
                w9Var.c(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), org.telegram.messenger.hd.M0(2131745367, "Short"), notificationsSettingsActivity.V, true);
            } else if (i40 == 2) {
                w9Var.c(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), org.telegram.messenger.hd.M0(2131743613, "VibrationDisabled"), notificationsSettingsActivity.V, true);
            } else if (i40 == 3) {
                w9Var.c(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), org.telegram.messenger.hd.M0(2131748722, "Long"), notificationsSettingsActivity.V, true);
            } else if (i40 == 4) {
                w9Var.c(org.telegram.messenger.hd.M0(2131743615, "Vibrate"), org.telegram.messenger.hd.M0(2131747820, "OnlyIfSilent"), notificationsSettingsActivity.V, true);
            }
            notificationsSettingsActivity.V = false;
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        i23 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences3 = org.telegram.messenger.qp.s1(i23).d7;
        i24 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i24).getCurrentTime();
        i25 = notificationsSettingsActivity.privateRow;
        if (i7 == i25) {
            M0 = org.telegram.messenger.hd.M0(2131747877, null);
            arrayList = notificationsSettingsActivity.d;
            i29 = sharedPreferences3.getInt("EnableAll2", 0);
            i30 = R.drawable.msg_openprofile;
        } else {
            i26 = notificationsSettingsActivity.groupRow;
            if (i7 != i26) {
                i27 = notificationsSettingsActivity.storiesRow;
                int i41 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i7 == i27) {
                    CharSequence M02 = org.telegram.messenger.hd.M0(2131747931, null);
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
                        CharSequence M03 = org.telegram.messenger.hd.M0(2131747935, null);
                        i29 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i30 = R.drawable.msg_reactions;
                        charSequence = M03;
                        arrayList2 = null;
                        arrayList = null;
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131747920, null);
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
                            sb2.append(org.telegram.messenger.hd.M0(2131747891, "NotificationsOn"));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb2.append(org.telegram.messenger.hd.M0(2131747893, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i32] = org.telegram.messenger.hd.e1(i29);
                            sb2.append(org.telegram.messenger.hd.a0("NotificationsOffUntil", null, 2131747892, objArr));
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
                        sb2.append(org.telegram.messenger.hd.M0(2131744262, "TapToChange"));
                    } else {
                        if (i29 > 0) {
                            sb2.append(org.telegram.messenger.hd.M0(2131747893, "NotificationsOff"));
                        } else {
                            sb2.append(org.telegram.messenger.hd.M0(2131747891, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(org.telegram.messenger.hd.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z9 = i31;
                } else if (i29 > 0) {
                    sb2.append(org.telegram.messenger.hd.M0(2131747893, "NotificationsOff"));
                    z9 = i32;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(org.telegram.messenger.hd.M0(2131747934, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.hd.M0(2131747933, null));
                    }
                    z9 = 1;
                }
                i35 = notificationsSettingsActivity.reactionsRow;
                h5Var.b(charSequence, sb2, i30, z9, i38, false, i7 == i35, false);
            }
            M0 = org.telegram.messenger.hd.M0(2131747906, null);
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
        h5Var.b(charSequence, sb22, i30, z9, i38, false, i7 == i35, false);
    }

    private final void I(v4.d1 d1Var, int i7) {
        boolean K1;
        xm0 xm0Var = (xm0) this.e;
        org.telegram.messenger.we weVar = xm0Var.J;
        ArrayList arrayList = xm0Var.n;
        ArrayList arrayList2 = xm0Var.c;
        HashMap hashMap = xm0Var.b;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.setItemSize(xm0Var.R);
            org.telegram.ui.Components.l9 imageView = q5Var.getImageView();
            q5Var.setTag(Integer.valueOf(i7));
            imageView.r();
            if (weVar != null) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(i7);
                q5Var.d(gfVar, arrayList2.size() > 1, true, false, false);
                int i11 = gfVar.C;
                q5Var.b(xm0Var.e ? arrayList2.indexOf(Integer.valueOf(i11)) : -1, hashMap.containsKey(Integer.valueOf(i11)), false);
                K1 = PhotoViewer.K1(gfVar.I);
            } else {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f.get(i7);
                q5Var.e(kfVar);
                q5Var.getVideoInfoContainer().setVisibility(4);
                q5Var.b(xm0Var.e ? arrayList2.indexOf(kfVar.B) : -1, hashMap.containsKey(kfVar.B), false);
                K1 = PhotoViewer.K1(kfVar.g());
            }
            imageView.getImageReceiver().O0(!K1, true);
            q5Var.getCheckBox().setVisibility((xm0Var.T != 0 || K1) ? 8 : 0);
            return;
        }
        if (i10 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = xm0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 == 2) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) weVar.e.get(i7);
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            h7Var.setPhotoEntry(gfVar2);
            h7Var.b(hashMap.containsKey(Integer.valueOf(gfVar2.C)), false);
            h7Var.setTag(Integer.valueOf(i7));
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i7 < arrayList.size()) {
            m8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i7), false);
        } else {
            m8Var.o(R.drawable.msg_clear_recent, org.telegram.messenger.hd.M0(2131752067, null), false);
        }
    }

    private final void J(v4.d1 d1Var, int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) d1Var.a;
        int L = org.telegram.messenger.g0.L(85.0f);
        int L2 = i7 != 0 ? org.telegram.messenger.g0.L(6.0f) : 0;
        w5Var.f = L;
        org.telegram.ui.Components.wo woVar = w5Var.c;
        org.telegram.ui.Components.l9 l9Var = w5Var.a;
        bi.m5 m5Var = w5Var.e;
        w5Var.h = L2;
        ((FrameLayout.LayoutParams) w5Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) l9Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).rightMargin = L2;
        l9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i7));
        if (!(obj instanceof org.telegram.messenger.gf)) {
            if (obj instanceof org.telegram.messenger.kf) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                w5Var.setTag(kfVar);
                w5Var.setImage(kfVar);
                m5Var.setVisibility(4);
                woVar.a.f(-1, true, false);
                woVar.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
        int i10 = gfVar.C;
        String str = gfVar.I;
        w5Var.setTag(gfVar);
        m5Var.setVisibility(4);
        String str2 = gfVar.c;
        if (str2 != null) {
            l9Var.h(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            l9Var.s(gfVar.J, gfVar.K, true);
            if (!gfVar.b || gfVar.d()) {
                l9Var.h("thumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                m5Var.setVisibility(0);
                w5Var.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
                l9Var.h("vthumb://" + i10 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            l9Var.setImageResource(R.drawable.nophotos);
        }
        woVar.a.f(-1, true, false);
        woVar.setVisibility(0);
    }

    private final void K(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i12 = d1Var.f;
        View view = d1Var.a;
        switch (i12) {
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                i10 = proxyListActivity.proxyAddRow;
                if (i7 == i10) {
                    w9Var.b(org.telegram.messenger.hd.M0(2131754391, null), proxyListActivity.D != -1);
                    break;
                } else if (i7 == proxyListActivity.D) {
                    org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    w9Var.b(org.telegram.messenger.hd.M0(2131751581, null), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == proxyListActivity.h) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746604, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i11 = proxyListActivity.useProxyRow;
                if (i7 == i11) {
                    r8Var.f(org.telegram.messenger.hd.M0(2131743784, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i7 == proxyListActivity.w) {
                    r8Var.f(org.telegram.messenger.hd.M0(2131743786, null), org.telegram.messenger.iz.a1, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == proxyListActivity.y) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131746602, null));
                    break;
                }
                break;
            case 5:
                nx0 nx0Var = (nx0) view;
                org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) arrayList2.get(i7 - proxyListActivity.n);
                nx0Var.setProxy(hzVar);
                nx0Var.setChecked(org.telegram.messenger.iz.B1 == hzVar);
                boolean contains = arrayList.contains(arrayList2.get(i7 - proxyListActivity.n));
                nx0Var.h = contains;
                nx0Var.f.a(contains, false);
                nx0Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i7 == proxyListActivity.x) {
                    org.telegram.ui.Components.vt0 vt0Var = (org.telegram.ui.Components.vt0) view;
                    ArrayList arrayList3 = new ArrayList(org.telegram.messenger.qt.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        strArr[i13] = org.telegram.messenger.hd.a0(null, null, 2131746601, arrayList3.get(i13));
                    }
                    vt0Var.setCallback(new go0(5));
                    vt0Var.b(org.telegram.messenger.iz.b1, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void L(v4.d1 d1Var, int i7) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.f2) ((xy0) this.e)).currentAccount;
        boolean d = org.telegram.ui.Components.t40.d(i10);
        int i11 = d1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.n4) d1Var.a).setText(i7 == 0 ? org.telegram.messenger.hd.M0(2131745989, null) : org.telegram.messenger.hd.M0(2131745993, null));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.a;
            r8Var.setEnabled(i7 == 1 || d);
            if (i7 == 1) {
                r8Var.f(org.telegram.messenger.hd.M0(2131745985, null), d, false);
                return;
            }
            String M0 = org.telegram.messenger.hd.M0(2131745992, null);
            xi.a aVar = xi.e.i;
            aVar.a();
            r8Var.f(M0, aVar.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.z8) d1Var.a).setText(i7 == 6 ? org.telegram.messenger.hd.M0(2131745988, null) : org.telegram.messenger.hd.M0(2131745991, null));
            return;
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.a;
        w9Var.setEnabled(d);
        if (i7 == 2) {
            w9Var.c(org.telegram.messenger.hd.M0(2131745987, null), a8.p0.n(((wi.r0) xi.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i7 == 3) {
            String M02 = org.telegram.messenger.hd.M0(2131745997, null);
            wi.n0 n0Var = (wi.n0) xi.e.f.a();
            w9Var.c(M02, n0Var == wi.n0.a ? org.telegram.messenger.hd.M0(2131745996, null) : n0Var == wi.n0.b ? org.telegram.messenger.hd.M0(2131745994, null) : org.telegram.messenger.hd.M0(2131745995, null), false, true);
        } else if (i7 == 4) {
            w9Var.c(org.telegram.messenger.hd.M0(2131745990, null), a8.p0.n(((wi.o0) xi.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            w9Var.c(org.telegram.messenger.hd.M0(2131745998, null), xy0.f0(xi.e.h.a()), false, false);
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
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
                int b10 = d1Var.b();
                if (b10 == 1) {
                    return true;
                }
                i7 = ((org.telegram.ui.ActionBar.f2) ((xy0) this.e)).currentAccount;
                return MediaController.s0(i7) && b10 == 2;
            case 1:
                int b11 = d1Var.b();
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.e;
                return b11 == bnVar.u0 || b11 == bnVar.G0 || b11 == bnVar.B0 || b11 == bnVar.F0 || b11 == bnVar.C0 || b11 == bnVar.H0 || b11 == bnVar.D0 || b11 == bnVar.E0 || b11 == bnVar.I0 || b11 == bnVar.J0 || b11 == bnVar.N0.b || b11 == bnVar.M0.b || b11 == bnVar.L0;
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
                            if (b13 != i16 && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.D && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.J && b13 != dataSettingsActivity.n) {
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
                ee0 ee0Var = (ee0) this.e;
                return b14 == ee0Var.c || b14 == ee0Var.d || b14 == ee0Var.e || b14 == ee0Var.f || b14 == ee0Var.h || b14 == ee0Var.r;
            case 11:
                int b15 = d1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                return (b15 == notificationsSettingsActivity.y || b15 == notificationsSettingsActivity.D || b15 == notificationsSettingsActivity.E || b15 == notificationsSettingsActivity.K || b15 == notificationsSettingsActivity.M || b15 == notificationsSettingsActivity.S || b15 == notificationsSettingsActivity.N || b15 == notificationsSettingsActivity.L || b15 == notificationsSettingsActivity.R || b15 == notificationsSettingsActivity.F || b15 == notificationsSettingsActivity.G || b15 == notificationsSettingsActivity.O || b15 == notificationsSettingsActivity.r || b15 == notificationsSettingsActivity.s || b15 == notificationsSettingsActivity.T || b15 == notificationsSettingsActivity.J) ? false : true;
            case 12:
                int b16 = d1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                i21 = passcodeActivity.fingerprintRow;
                if (b16 != i21) {
                    i22 = passcodeActivity.autoLockRow;
                    if (b16 != i22 && b16 != passcodeActivity.N) {
                        i23 = passcodeActivity.changePasscodeRow;
                        if (b16 != i23) {
                            i24 = passcodeActivity.disablePasscodeRow;
                            if (b16 != i24 && b16 != passcodeActivity.J && b16 != passcodeActivity.K) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            case 13:
                return true;
            case 14:
                xm0 xm0Var = (xm0) this.e;
                return xm0Var.J != null || (!TextUtils.isEmpty(xm0Var.w) ? d1Var.b() >= xm0Var.f.size() : d1Var.f != 3);
            case 15:
                return false;
            case 16:
                int b17 = d1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                i25 = proxyListActivity.useProxyRow;
                if (b17 != i25 && b17 != proxyListActivity.w) {
                    i26 = proxyListActivity.proxyAddRow;
                    if (b17 != i26 && b17 != proxyListActivity.D && (b17 < proxyListActivity.n || b17 >= proxyListActivity.r)) {
                        return false;
                    }
                }
                return true;
            case 17:
                int b18 = d1Var.b();
                if (b18 == 1) {
                    return true;
                }
                i27 = ((org.telegram.ui.ActionBar.f2) ((xy0) this.e)).currentAccount;
                return org.telegram.ui.Components.t40.d(i27) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8);
            case 18:
                return d1Var.f != 1;
            default:
                return p1.g.d(3)[d1Var.f] == 1;
        }
    }

    public void E() {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.y4 y4Var3;
        org.telegram.ui.ActionBar.y4 y4Var4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.E.size();
        y4Var = ((org.telegram.ui.ActionBar.f2) proxyListActivity).simpleActionBar;
        boolean s5 = y4Var.s();
        if (size <= 0) {
            if (s5) {
                y4Var2 = ((org.telegram.ui.ActionBar.f2) proxyListActivity).simpleActionBar;
                y4Var2.r();
                int i7 = proxyListActivity.n;
                n(i7, proxyListActivity.r - i7, 2);
                return;
            }
            return;
        }
        y4Var3 = ((org.telegram.ui.ActionBar.f2) proxyListActivity).simpleActionBar;
        y4Var3.x(size, s5);
        if (s5) {
            return;
        }
        y4Var4 = ((org.telegram.ui.ActionBar.f2) proxyListActivity).simpleActionBar;
        y4Var4.B();
        int i10 = proxyListActivity.n;
        n(i10, proxyListActivity.r - i10, 2);
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.E.clear();
        int i7 = proxyListActivity.n;
        n(i7, proxyListActivity.r - i7, 1);
        E();
    }

    public void M(int i7) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        int i10 = proxyListActivity.n;
        if (i7 < i10 || i7 >= proxyListActivity.r) {
            return;
        }
        org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) proxyListActivity.F.get(i7 - i10);
        if (arrayList.contains(hzVar)) {
            arrayList.remove(hzVar);
        } else {
            arrayList.add(hzVar);
        }
        h(i7, 1);
        E();
    }

    @Override // v4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return 4;
            case 1:
                return ((org.telegram.ui.Components.bn) this.e).Q0;
            case 2:
                return ((org.telegram.ui.Components.ez) this.e).h.size();
            case 3:
                int size = ((org.telegram.ui.Components.fz) this.e).r1.size();
                return size < 10 ? size + 1 : size;
            case 4:
                return ((org.telegram.ui.Components.sd0) this.e).F;
            case 5:
                return org.telegram.messenger.sd.g() + 1;
            case 6:
                ArrayList arrayList = ((org.telegram.ui.Components.ow0) this.d).x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 7:
                return ((org.telegram.ui.Components.u61) this.e).h.size();
            case 8:
                return ((DataAutoDownloadActivity) this.e).y;
            case 9:
                return ((DataSettingsActivity) this.e).T;
            case 10:
                return ((ee0) this.e).w;
            case 11:
                return ((NotificationsSettingsActivity) this.e).U;
            case 12:
                return ((PasscodeActivity) this.e).P;
            case 13:
                if (((mm0) this.e).d != null) {
                    return (int) Math.ceil(r1.size() / r0.f);
                }
                return 0;
            case 14:
                xm0 xm0Var = (xm0) this.e;
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar != null) {
                    return weVar.e.size();
                }
                if (!xm0Var.f.isEmpty()) {
                    return xm0Var.f.size() + (!xm0Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(xm0Var.w) || xm0Var.n.isEmpty()) {
                    return 0;
                }
                return xm0Var.n.size() + 2;
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
                return ((pg.j) this.e).E.size();
        }
    }

    @Override // v4.g0
    public long c(int i7) {
        int i10;
        int i11;
        int i12;
        switch (this.c) {
            case 2:
                i10 = ((org.telegram.ui.Components.ez) this.e).k0.get(i7);
                break;
            case 4:
                return i7;
            case 6:
                if (((org.telegram.ui.Components.ow0) this.d).x == null) {
                    return 0L;
                }
                return ((org.telegram.messenger.qi) r0.get(i7)).a.hashCode();
            case 7:
                i10 = ((org.telegram.ui.Components.r61) ((org.telegram.ui.Components.u61) this.e).h.get(i7)).a;
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
                if (i7 == proxyListActivity.D) {
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
                return ((org.telegram.messenger.hz) proxyListActivity.F.get(i7 - r1)).hashCode();
            default:
                return super.c(i7);
        }
        return i10;
    }

    @Override // v4.g0
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
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.e;
                if (i7 == bnVar.B0 || i7 == bnVar.F0 || i7 == bnVar.G0 || i7 == bnVar.C0 || i7 == bnVar.D0 || i7 == bnVar.E0 || i7 == bnVar.H0 || i7 == bnVar.M0.b || i7 == bnVar.N0.b) {
                    return 10;
                }
                if (i7 == bnVar.l0 || i7 == bnVar.s0 || i7 == bnVar.w0 || i7 == bnVar.o0) {
                    return 0;
                }
                if (i7 == bnVar.r0) {
                    return 1;
                }
                if (i7 == bnVar.v0 || i7 == bnVar.x0 || i7 == bnVar.q0 || i7 == bnVar.K0) {
                    return 2;
                }
                if (i7 == bnVar.u0 || i7 == bnVar.I0 || i7 == bnVar.L0) {
                    return 3;
                }
                if (i7 == bnVar.m0) {
                    return 4;
                }
                if (i7 == bnVar.n0) {
                    return 11;
                }
                if (i7 == bnVar.p0) {
                    return 7;
                }
                if (i7 == bnVar.y0 || i7 == bnVar.z0 || i7 == bnVar.J0) {
                    return 6;
                }
                if (i7 == bnVar.A0) {
                    return 8;
                }
                return i7 == 0 ? 9 : 5;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.e;
                return (i7 == sd0Var.D || i7 == sd0Var.E) ? 1 : 0;
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
                if (i7 == dataSettingsActivity.r || i7 == dataSettingsActivity.x || i7 == dataSettingsActivity.N || i7 == dataSettingsActivity.P || i7 == dataSettingsActivity.L || i7 == dataSettingsActivity.Q || i7 == dataSettingsActivity.S) {
                    return 0;
                }
                if (i7 == dataSettingsActivity.d || i7 == dataSettingsActivity.y || i7 == dataSettingsActivity.M || i7 == 0 || i7 == dataSettingsActivity.O || i7 == dataSettingsActivity.I || i7 == dataSettingsActivity.R) {
                    return 2;
                }
                if (i7 == dataSettingsActivity.E || i7 == dataSettingsActivity.D || i7 == dataSettingsActivity.F || i7 == dataSettingsActivity.G || i7 == dataSettingsActivity.J || i7 == dataSettingsActivity.K) {
                    return 3;
                }
                if (i7 == dataSettingsActivity.H) {
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
                if (i7 == notificationsSettingsActivity.K || i7 == notificationsSettingsActivity.M || i7 == notificationsSettingsActivity.S || i7 == notificationsSettingsActivity.G || i7 == notificationsSettingsActivity.N || i7 == notificationsSettingsActivity.E || i7 == notificationsSettingsActivity.y || i7 == notificationsSettingsActivity.r) {
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
                                                    if (i7 != i28 && i7 != notificationsSettingsActivity.P) {
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
                                                                                if (i7 == notificationsSettingsActivity.J || i7 == notificationsSettingsActivity.D || i7 == notificationsSettingsActivity.L || i7 == notificationsSettingsActivity.R || i7 == notificationsSettingsActivity.F || i7 == notificationsSettingsActivity.O || i7 == notificationsSettingsActivity.T) {
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
                if (i7 != i36 && i7 != passcodeActivity.N && i7 != passcodeActivity.K && i7 != passcodeActivity.J) {
                    i37 = passcodeActivity.changePasscodeRow;
                    if (i7 != i37) {
                        i38 = passcodeActivity.autoLockRow;
                        if (i7 != i38) {
                            i39 = passcodeActivity.disablePasscodeRow;
                            if (i7 != i39) {
                                if (i7 == passcodeActivity.H || i7 == passcodeActivity.O || i7 == passcodeActivity.G || i7 == passcodeActivity.L) {
                                    return 2;
                                }
                                if (i7 == passcodeActivity.M || i7 == passcodeActivity.I) {
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
                xm0 xm0Var = (xm0) this.e;
                if (xm0Var.Y) {
                    return 2;
                }
                if (xm0Var.J == null) {
                    if (xm0Var.f.isEmpty()) {
                        return i7 == xm0Var.n.size() ? 4 : 3;
                    }
                    if (i7 >= xm0Var.f.size()) {
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
                if (i7 == i40 || i7 == proxyListActivity.D) {
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
                return p1.g.c(((pg.a) ((pg.j) this.e).E.get(i7)).b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cb, code lost:
    
        if (org.telegram.ui.Wallet.n0.x(r3).J() != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06d9  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        String G;
        TextView textView;
        Drawable drawable;
        org.telegram.ui.Components.t61 t61Var;
        int i11;
        int i12;
        int i13;
        int i14;
        String M0;
        int i15;
        int i16;
        org.telegram.messenger.y5 o4;
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
                i10 = ((org.telegram.ui.ActionBar.f2) ((xy0) obj2)).currentAccount;
                boolean s02 = MediaController.s0(i10);
                int i33 = d1Var.f;
                View view = d1Var.a;
                if (i33 == 0) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131753924, null));
                    break;
                } else if (i33 == 1) {
                    ((org.telegram.ui.Cells.r8) view).f(org.telegram.messenger.hd.M0(2131753918, null), s02, false);
                    break;
                } else if (i33 == 2) {
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.setEnabled(s02);
                    w9Var.c(org.telegram.messenger.hd.M0(2131753922, null), org.telegram.messenger.hd.M0(((vi.f) xi.e.c.a()) == vi.f.b ? 2131753920 : 2131753921, null), false, false);
                    break;
                } else {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.hd.M0(2131753923, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj2;
                boolean z10 = bnVar.e0;
                bg.w0 w0Var = bnVar.M0;
                bg.w0 w0Var2 = bnVar.N0;
                org.telegram.ui.ActionBar.f6 f6Var = bnVar.a;
                boolean z11 = bnVar.n;
                int i34 = d1Var.f;
                View view2 = d1Var.a;
                if (i34 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view2;
                    if (i7 == bnVar.l0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.hd.M0(z11 ? 2131744055 : 2131747164, null));
                        break;
                    } else if (i7 == bnVar.o0) {
                        n4Var.getTextView().setGravity(19);
                        n4Var.setText(org.telegram.messenger.hd.M0(2131754473, null));
                        break;
                    } else {
                        n4Var.getTextView().setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                        if (i7 == bnVar.s0) {
                            if (z10) {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746446, null));
                                break;
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(z11 ? 2131744073 : 2131754246, null));
                                break;
                            }
                        } else if (i7 == bnVar.w0) {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131745496, null));
                            break;
                        }
                    }
                } else if (i34 == 6) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                    if (i7 == bnVar.y0) {
                        r8Var.f(org.telegram.messenger.hd.M0(2131744094, null), bnVar.f0, bnVar.z0 != -1);
                        r8Var.e(null, true);
                        break;
                    } else if (i7 == bnVar.z0) {
                        r8Var.f(org.telegram.messenger.hd.M0(2131744093, null), bnVar.g0, false);
                        r8Var.e(null, true);
                        break;
                    } else if (i7 == bnVar.J0) {
                        r8Var.f(org.telegram.messenger.hd.M0(2131747138, null), bnVar.W, false);
                        r8Var.e(null, true);
                        break;
                    }
                } else if (i34 == 2) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view2;
                    z8Var.setFixedSize(0);
                    new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var)), org.telegram.ui.ActionBar.k6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7)).x = true;
                    if (i7 == bnVar.q0) {
                        z8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
                        break;
                    } else if (i7 == bnVar.x0) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        break;
                    } else {
                        int i35 = bnVar.J - bnVar.M;
                        if (i35 <= 0) {
                            z8Var.setText(org.telegram.messenger.hd.M0(z11 ? 2131744109 : 2131754469, null));
                            break;
                        } else if (z11) {
                            z8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i35));
                            break;
                        } else if (i7 == bnVar.K0) {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131747137, null));
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.hd.a0(null, null, 2131754470, org.telegram.messenger.hd.G(i35, "Option", new Object[0])));
                            break;
                        }
                    }
                } else if (i34 == 3) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view2;
                    if (i7 == bnVar.L0) {
                        String M02 = org.telegram.messenger.hd.M0(2131747144, null);
                        ArrayList arrayList = bnVar.P0;
                        if (arrayList.isEmpty()) {
                            G = org.telegram.messenger.hd.M0(2131745812, null);
                            z9 = false;
                        } else if (arrayList.size() == 1) {
                            z9 = false;
                            G = org.telegram.messenger.hd.i0(2131750520, (String) arrayList.get(0));
                        } else {
                            z9 = false;
                            G = org.telegram.messenger.hd.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                        }
                        m8Var.q(M02, G, z9, true);
                        break;
                    } else if (i7 == bnVar.I0) {
                        bnVar.Z(m8Var, false);
                        break;
                    } else {
                        m8Var.g(-1, org.telegram.ui.ActionBar.k6.Wl);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable3 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, f6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, f6Var), mode));
                        bnVar.n1 = drawable2;
                        bnVar.o1 = drawable3;
                        m8Var.p(org.telegram.messenger.hd.M0(z11 ? 2131744069 : 2131754471, null), new org.telegram.ui.Components.xp(drawable2, drawable3), false);
                        m8Var.x = 20;
                        m8Var.s = 58;
                        break;
                    }
                } else if (i34 == 9) {
                    view2.requestLayout();
                    break;
                } else if (i34 == 10) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view2;
                    x5Var.setDivider(false);
                    if (i7 == bnVar.B0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747123, null), org.telegram.messenger.hd.M0(2131747122, null), org.telegram.ui.Components.c30.c, R.drawable.filled_poll_view_24, !bnVar.a0);
                    } else if (i7 == bnVar.F0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747148, null), org.telegram.messenger.hd.M0(2131747147, null), org.telegram.ui.Components.c30.f, R.drawable.filled_poll_multiple_24, bnVar.b0);
                    } else if (i7 == bnVar.D0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747146, null), org.telegram.messenger.hd.M0(2131747145, null), org.telegram.ui.Components.c30.w, R.drawable.filled_poll_revote_24, bnVar.R);
                    } else if (i7 == bnVar.C0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747150, null), org.telegram.messenger.hd.M0(2131747149, null), org.telegram.ui.Components.c30.s, R.drawable.filled_poll_add_24, bnVar.T);
                    } else if (i7 == bnVar.E0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747121, null), org.telegram.messenger.hd.M0(2131747120, null), org.telegram.ui.Components.c30.h, R.drawable.filled_poll_shuffle_24, bnVar.S);
                    } else if (i7 == bnVar.G0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747125, null), org.telegram.messenger.hd.M0(2131747124, null), org.telegram.ui.Components.c30.n, R.drawable.filled_poll_correct_24, bnVar.c0);
                    } else if (i7 == w0Var2.b) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747136, null), org.telegram.messenger.hd.M0(2131747135, null), org.telegram.ui.Components.c30.e, R.drawable.filled_location, w0Var2.a);
                    } else if (i7 == w0Var.b) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747128, null), org.telegram.messenger.hd.M0(2131747127, null), org.telegram.ui.Components.c30.d, R.drawable.msg_folders_groups, w0Var.a);
                    } else if (i7 == bnVar.H0) {
                        x5Var.a(org.telegram.messenger.hd.M0(2131747134, null), org.telegram.messenger.hd.M0(2131747133, null), org.telegram.ui.Components.c30.r, R.drawable.filled_poll_deadline_24, (bnVar.U == 0 && bnVar.V == 0) ? false : true);
                        x5Var.setDivider((bnVar.U == 0 && bnVar.V == 0) ? false : true);
                    }
                    if (i7 == bnVar.G0) {
                        x5Var.getCheckBox().a.a(z10, false);
                        break;
                    } else if (i7 == bnVar.C0) {
                        Switch checkBox = x5Var.getCheckBox();
                        if (!bnVar.c0 && !bnVar.a0) {
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
                org.telegram.ui.Components.cz czVar = (org.telegram.ui.Components.cz) d1Var.a;
                int id2 = czVar.b != null ? czVar.getId() : -1;
                org.telegram.ui.Components.bz bzVar = (org.telegram.ui.Components.bz) ((org.telegram.ui.Components.ez) obj2).h.get(i7);
                czVar.b = bzVar;
                czVar.e = i7;
                czVar.setContentDescription(bzVar.b);
                czVar.requestLayout();
                boolean z12 = czVar.n;
                org.telegram.ui.Components.bz bzVar2 = czVar.b;
                if (z12 != (bzVar2 != null && bzVar2.g)) {
                    org.telegram.ui.Components.r5.release(czVar, czVar.r);
                    org.telegram.ui.Components.r5.release(czVar, czVar.O);
                    org.telegram.ui.Components.r5.release(czVar, czVar.Q);
                    org.telegram.ui.Components.r5.release(czVar, czVar.S);
                    if (czVar.l0) {
                        czVar.r = org.telegram.ui.Components.r5.update(czVar.b.g ? 26 : 0, czVar, czVar.r, czVar.s);
                        czVar.O = org.telegram.ui.Components.r5.update(czVar.b.g ? 26 : 0, czVar, czVar.O, czVar.P);
                        czVar.Q = org.telegram.ui.Components.r5.update(czVar.b.g ? 26 : 0, czVar, czVar.Q, czVar.R);
                        czVar.S = org.telegram.ui.Components.r5.update(czVar.b.g ? 26 : 0, czVar, czVar.S, czVar.T);
                    }
                    czVar.n = czVar.b.g;
                }
                if (id2 != czVar.getId()) {
                    czVar.k0 = czVar.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 3:
                Context context2 = (Context) obj;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) d1Var.a;
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) obj2;
                ArrayList arrayList2 = fzVar.s1;
                ArrayList arrayList3 = fzVar.r1;
                if (i7 < arrayList3.size()) {
                    org.telegram.ui.ActionBar.r6.t(o2Var.getImageView(), org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
                    org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList3.get(i7);
                    org.telegram.ui.ActionBar.r6.V(o2Var.getTextView(), org.telegram.ui.ActionBar.k6.j5, null);
                    int i36 = voVar.g;
                    int i37 = org.telegram.messenger.qp.D8;
                    int i38 = i36 & i37;
                    o2Var.a(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(voVar.b, o2Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), voVar.c, o2Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new org.telegram.ui.Components.wz(fzVar.getContext(), i38 == 3 ? R.drawable.msg_openprofile : ((i36 & 64) == 0 || i38 != i37) ? i38 == 8 ? R.drawable.msg_channel : i38 == 4 ? R.drawable.msg_groups : i38 == 1 ? R.drawable.msg_contacts : i38 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, voVar.m), false);
                    o2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, fzVar.I0));
                    for (int i39 = 0; i39 < arrayList2.size(); i39++) {
                        if (!voVar.b(org.telegram.messenger.c.a(fzVar.a), ((Long) arrayList2.get(i39)).longValue())) {
                            r9 = false;
                        }
                    }
                    o2Var.setChecked(r9);
                    break;
                } else {
                    o2Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable4 = context2.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable5 = context2.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = o2Var.getImageView();
                    int i40 = org.telegram.ui.ActionBar.k6.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.y(imageView, drawable4, i40, null, mode2);
                    org.telegram.ui.ActionBar.r6.y(o2Var.getImageView(), drawable5, org.telegram.ui.ActionBar.k6.k7, null, mode2);
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable4, drawable5);
                    org.telegram.ui.ActionBar.r6.V(o2Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
                    o2Var.a(org.telegram.messenger.hd.M0(2131751717, null), 0, xpVar, false);
                    break;
                }
            case 4:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) obj2;
                int i41 = d1Var.f;
                View view3 = d1Var.a;
                if (i41 == 0) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view3;
                    s5Var.setTag(Integer.valueOf(i7));
                    if (i7 == sd0Var.b) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131751127, null), 0, sd0Var.G);
                        break;
                    } else if (i7 == sd0Var.r) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131749301, null), -100, sd0Var.P);
                        break;
                    } else if (i7 == sd0Var.d) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131751769, null), -100, sd0Var.I);
                        break;
                    } else if (i7 == sd0Var.c) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131750858, null), -100, sd0Var.H);
                        break;
                    } else if (i7 == sd0Var.f) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131742950, null), -100, sd0Var.J);
                        break;
                    } else if (i7 == sd0Var.e) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745948, null), -100, sd0Var.K);
                        break;
                    } else if (i7 == sd0Var.w) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131743525, null), 0, sd0Var.R);
                        break;
                    } else if (i7 == sd0Var.s) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745466, null), -100, sd0Var.Q);
                        break;
                    } else if (i7 == sd0Var.x) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131749523, null), 0, sd0Var.S);
                        break;
                    } else if (i7 == sd0Var.y) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745368, null), 0, sd0Var.U);
                        break;
                    } else if (i7 == sd0Var.h) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131750847, null), 0, sd0Var.L);
                        break;
                    } else if (i7 == sd0Var.n) {
                        s5Var.a(org.telegram.messenger.hd.M0(2131745294, null), 0, sd0Var.M);
                        break;
                    }
                } else if (i41 == 1) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view3;
                    r5Var.setTag(Integer.valueOf(i7));
                    if (i7 == sd0Var.D) {
                        r5Var.a(sd0Var.N, org.telegram.messenger.hd.M0(2131744115, null));
                        break;
                    } else if (i7 == sd0Var.E) {
                        r5Var.a(sd0Var.O, org.telegram.messenger.hd.M0(2131744116, null));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) obj2;
                int i42 = d1Var.f;
                if (i42 != 0) {
                    if (i42 == 1 && (textView = at0Var.l1) != null) {
                        textView.setText(org.telegram.messenger.hd.a0("SharingLiveLocationTitle", null, 2131745393, org.telegram.messenger.hd.G(org.telegram.messenger.sd.g(), "Chats", new Object[0])));
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.r7) d1Var.a).setDialog(org.telegram.ui.Components.at0.J0(i7 - 1));
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.nw0 nw0Var = (org.telegram.ui.Components.nw0) d1Var.a;
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) obj;
                ArrayList arrayList4 = ow0Var.x;
                String str = arrayList4 == null ? null : ((org.telegram.messenger.qi) arrayList4.get(i7)).a;
                int direction = ow0Var.getDirection();
                nw0Var.a = str;
                if (str == null || !str.startsWith("animated_")) {
                    nw0Var.setImageDrawable(org.telegram.messenger.i6.f(str));
                } else {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable6 = nw0Var.b;
                        if (drawable6 instanceof org.telegram.ui.Components.i5) {
                            if (((org.telegram.ui.Components.i5) drawable6).h() != parseLong) {
                            }
                        }
                        drawable = null;
                        try {
                            nw0Var.setImageDrawable(org.telegram.ui.Components.i5.m(org.telegram.messenger.p10.s0, parseLong, null, nw0Var.f.d()));
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
                org.telegram.ui.Components.s61 s61Var = (org.telegram.ui.Components.s61) d1Var.a;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj2;
                org.telegram.ui.Components.r61 r61Var = (org.telegram.ui.Components.r61) u61Var.h.get(i7);
                s61Var.a = r61Var;
                s61Var.setContentDescription(r61Var.b);
                s61Var.setAlpha(1.0f);
                s61Var.requestLayout();
                s61Var.setReordering(u61Var.m0 && (t61Var = u61Var.D) != null && ((org.telegram.ui.Components.n) t61Var).r(i7));
                break;
            case 8:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i43 = dataAutoDownloadActivity.f;
                org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.G;
                int i44 = d1Var.f;
                View view4 = d1Var.a;
                if (i44 == 0) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view4;
                    i11 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i7 == i11) {
                        r8Var2.setDrawCheckRipple(true);
                        r8Var2.f(org.telegram.messenger.hd.M0(2131753830, null), y5Var.g, false);
                        r8Var2.setTag(Integer.valueOf(y5Var.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6));
                        org.telegram.ui.ActionBar.r6.i(y5Var.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, r8Var2, null);
                        break;
                    }
                } else if (i44 == 2) {
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view4;
                    if (i7 == dataAutoDownloadActivity.r) {
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131753839, null));
                        break;
                    } else if (i7 == dataAutoDownloadActivity.w) {
                        n4Var2.setText(org.telegram.messenger.hd.M0(2131753808, null));
                        break;
                    }
                } else if (i44 == 3) {
                    dataAutoDownloadActivity.r0((org.telegram.ui.Components.vt0) view4);
                    break;
                } else if (i44 == 4) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view4;
                    h5Var.setDrawLine(true);
                    i12 = dataAutoDownloadActivity.photosRow;
                    if (i7 == i12) {
                        M0 = org.telegram.messenger.hd.M0(2131753817, null);
                        i15 = 1;
                    } else {
                        i13 = dataAutoDownloadActivity.videosRow;
                        if (i7 == i13) {
                            M0 = org.telegram.messenger.hd.M0(2131753806, null);
                            i15 = 4;
                        } else {
                            i14 = dataAutoDownloadActivity.storiesRow;
                            if (i7 == i14) {
                                String M03 = org.telegram.messenger.hd.M0(2131753809, null);
                                h5Var.setDrawLine(false);
                                M0 = M03;
                                i15 = -1;
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131753838, null);
                                i15 = 8;
                            }
                        }
                    }
                    if (i43 == 0) {
                        i23 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i23).n();
                    } else if (i43 == 1) {
                        i17 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i17).p();
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
                        o4 = org.telegram.messenger.z5.q(i16).o();
                    }
                    long j3 = o4.b[org.telegram.messenger.z5.x(i15)];
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
                                        sb3.append(org.telegram.messenger.hd.M0(2131753841, null));
                                    } else if (i45 == 1) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753814, null));
                                    } else if (i45 == 2) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753835, null));
                                    } else if (i45 == 3) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753842, null));
                                    }
                                    i19++;
                                }
                                i45++;
                            } else {
                                if (i19 == 4) {
                                    sb3.setLength(0);
                                    i21 = dataAutoDownloadActivity.photosRow;
                                    if (i7 == i21) {
                                        sb3.append(org.telegram.messenger.hd.M0(2131753826, null));
                                    } else {
                                        sb3.append(org.telegram.messenger.hd.a0("AutoDownloadUpToOnAllChats", null, 2131753807, org.telegram.messenger.g0.i0(j3, false, false)));
                                    }
                                } else if (i19 == 0) {
                                    sb3.append(org.telegram.messenger.hd.M0(2131753828, null));
                                } else {
                                    i20 = dataAutoDownloadActivity.photosRow;
                                    sb2 = i7 == i20 ? new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOnFor", null, 2131753825, sb3.toString())) : new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOnUpToFor", null, 2131753820, org.telegram.messenger.g0.i0(j3, false, false), sb3.toString()));
                                }
                                sb2 = sb3;
                            }
                        }
                    } else if (o4.e) {
                        sb2 = new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOn", null, 2131753827, sb3.toString()));
                        i19 = 1;
                    } else {
                        sb2 = new StringBuilder(org.telegram.messenger.hd.a0("AutoDownloadOff", null, 2131753828, sb3.toString()));
                        i19 = 0;
                    }
                    if (dataAutoDownloadActivity.h) {
                        h5Var.setChecked(i19 != 0);
                    }
                    boolean z13 = i19 != 0;
                    i22 = dataAutoDownloadActivity.storiesRow;
                    h5Var.b(M0, sb2, 0, z13, 0, true, i7 != i22, false);
                    break;
                } else if (i44 == 5) {
                    org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view4;
                    if (i7 == dataAutoDownloadActivity.x) {
                        z8Var2.setText(org.telegram.messenger.hd.M0(2131753843, null));
                        z8Var2.setFixedSize(0);
                        z8Var2.setImportantForAccessibility(1);
                        break;
                    } else if (i7 == dataAutoDownloadActivity.n) {
                        if (dataAutoDownloadActivity.r == -1) {
                            if (i43 == 0) {
                                z8Var2.setText(org.telegram.messenger.hd.M0(2131753823, null));
                            } else if (i43 == 1) {
                                z8Var2.setText(org.telegram.messenger.hd.M0(2131753818, null));
                            } else if (i43 == 2) {
                                z8Var2.setText(org.telegram.messenger.hd.M0(2131753821, null));
                            }
                            z8Var2.setImportantForAccessibility(1);
                            break;
                        } else {
                            z8Var2.setText(null);
                            z8Var2.setFixedSize(12);
                            z8Var2.setImportantForAccessibility(4);
                            break;
                        }
                    }
                }
                break;
            case 9:
                G(d1Var, i7);
                break;
            case 10:
                ee0 ee0Var = (ee0) obj2;
                int i46 = d1Var.f;
                View view5 = d1Var.a;
                if (i46 == 0) {
                    org.telegram.ui.Cells.n4 n4Var3 = (org.telegram.ui.Cells.n4) view5;
                    if (i7 == 0) {
                        n4Var3.setText(org.telegram.messenger.hd.M0(2131754270, null));
                        break;
                    }
                } else if (i46 == 1) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view5;
                    if (i7 == ee0Var.c) {
                        y8Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131754468, null), org.telegram.messenger.hd.M0(2131754467, null), true);
                        break;
                    } else if (i7 == ee0Var.d) {
                        y8Var.b(R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131745522, null), org.telegram.messenger.hd.M0(2131745521, null), true);
                        break;
                    } else if (i7 == ee0Var.e) {
                        y8Var.b(R.drawable.msg_clearcache, org.telegram.messenger.hd.M0(2131752098, null), org.telegram.messenger.hd.M0(2131752094, null), true);
                        break;
                    } else if (i7 == ee0Var.f) {
                        y8Var.b(R.drawable.msg_newphone, org.telegram.messenger.hd.M0(2131752537, null), org.telegram.messenger.hd.M0(2131752536, null), true);
                        break;
                    } else if (i7 == ee0Var.h) {
                        y8Var.b(R.drawable.msg_help, org.telegram.messenger.hd.M0(2131751783, null), org.telegram.messenger.hd.M0(2131751782, null), false);
                        break;
                    }
                } else if (i46 == 3) {
                    org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view5;
                    if (i7 == ee0Var.r) {
                        org.telegram.ui.ActionBar.r6.V(w9Var2.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                        w9Var2.b(org.telegram.messenger.hd.M0(2131748740, null), false);
                        break;
                    }
                } else if (i46 == 4) {
                    org.telegram.ui.Cells.z8 z8Var3 = (org.telegram.ui.Cells.z8) view5;
                    if (i7 == ee0Var.s) {
                        z8Var3.setText(org.telegram.messenger.hd.M0(2131748741, null));
                        break;
                    }
                }
                break;
            case 11:
                H(d1Var, i7);
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj2;
                int i47 = d1Var.f;
                View view6 = d1Var.a;
                if (i47 == 0) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view6;
                    i24 = passcodeActivity.fingerprintRow;
                    if (i7 == i24) {
                        r8Var3.f(org.telegram.messenger.hd.M0(2131743874, null), org.telegram.messenger.iz.D, false);
                        break;
                    } else if (i7 == passcodeActivity.N) {
                        r8Var3.f(org.telegram.messenger.hd.M0(2131745842, null), org.telegram.messenger.iz.A, false);
                        break;
                    } else if (i7 == passcodeActivity.K) {
                        String M04 = org.telegram.messenger.hd.M0(2131743167, null);
                        i26 = ((org.telegram.ui.ActionBar.f2) passcodeActivity).currentAccount;
                        if (org.telegram.ui.Wallet.n0.x(i26).e()) {
                            i27 = ((org.telegram.ui.ActionBar.f2) passcodeActivity).currentAccount;
                            break;
                        }
                        r9 = false;
                        r8Var3.f(M04, r9, false);
                        break;
                    } else if (i7 == passcodeActivity.J) {
                        String M05 = org.telegram.messenger.hd.M0(2131743166, null);
                        i25 = ((org.telegram.ui.ActionBar.f2) passcodeActivity).currentAccount;
                        r8Var3.f(M05, org.telegram.ui.Wallet.n0.x(i25).K(), false);
                        break;
                    }
                } else if (i47 == 1) {
                    org.telegram.ui.Cells.w9 w9Var3 = (org.telegram.ui.Cells.w9) view6;
                    i28 = passcodeActivity.changePasscodeRow;
                    if (i7 == i28) {
                        w9Var3.b(org.telegram.messenger.hd.M0(2131752544, null), true);
                        if (org.telegram.messenger.iz.s.isEmpty()) {
                            int i48 = org.telegram.ui.ActionBar.k6.E6;
                            w9Var3.setTag(Integer.valueOf(i48));
                            org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), i48, null);
                            break;
                        } else {
                            int i49 = org.telegram.ui.ActionBar.k6.G6;
                            w9Var3.setTag(Integer.valueOf(i49));
                            org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), i49, null);
                            break;
                        }
                    } else {
                        i29 = passcodeActivity.autoLockRow;
                        if (i7 == i29) {
                            int i50 = org.telegram.messenger.iz.y;
                            w9Var3.c(org.telegram.messenger.hd.M0(2131753800, null), i50 == 0 ? org.telegram.messenger.hd.a0("AutoLockDisabled", null, 2131753799, new Object[0]) : i50 < 3600 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(i50 / 60, "Minutes", new Object[0])) : i50 < 86400 ? org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G((int) Math.ceil((i50 / 60.0f) / 60.0f), "Hours", new Object[0])) : org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G((int) Math.ceil(((i50 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                            int i51 = org.telegram.ui.ActionBar.k6.G6;
                            w9Var3.setTag(Integer.valueOf(i51));
                            org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), i51, null);
                            break;
                        } else {
                            i30 = passcodeActivity.disablePasscodeRow;
                            if (i7 == i30) {
                                w9Var3.b(org.telegram.messenger.hd.M0(2131751434, null), false);
                                int i52 = org.telegram.ui.ActionBar.k6.q7;
                                w9Var3.setTag(Integer.valueOf(i52));
                                org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), i52, null);
                                break;
                            }
                        }
                    }
                } else if (i47 == 2) {
                    org.telegram.ui.Cells.z8 z8Var4 = (org.telegram.ui.Cells.z8) view6;
                    if (i7 == passcodeActivity.G) {
                        z8Var4.setText(org.telegram.messenger.hd.M0(2131747654, null));
                        z8Var4.setBackground(null);
                        z8Var4.getTextView().setGravity(1);
                        break;
                    } else if (i7 == passcodeActivity.H) {
                        z8Var4.setText(org.telegram.messenger.hd.M0(2131753797, null));
                        z8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.L) {
                        z8Var4.setText(org.telegram.messenger.hd.M0(2131743079, null));
                        z8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    } else if (i7 == passcodeActivity.O) {
                        z8Var4.setText(org.telegram.messenger.hd.M0(2131745843, null));
                        z8Var4.getTextView().setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                        break;
                    }
                } else if (i47 == 3) {
                    org.telegram.ui.Cells.n4 n4Var4 = (org.telegram.ui.Cells.n4) view6;
                    n4Var4.setHeight(46);
                    if (i7 == passcodeActivity.M) {
                        n4Var4.setText(org.telegram.messenger.hd.M0(2131745844, null));
                        break;
                    } else if (i7 == passcodeActivity.I) {
                        n4Var4.setText(org.telegram.messenger.hd.M0(2131743080, null));
                        break;
                    }
                } else if (i47 == 4) {
                    ji0 ji0Var = (ji0) view6;
                    ji0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    ji0Var.a.d();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) d1Var.a;
                mm0 mm0Var = (mm0) obj2;
                v5Var.setAlbumsCount(mm0Var.f);
                while (true) {
                    int i53 = mm0Var.f;
                    if (i32 >= i53) {
                        v5Var.requestLayout();
                        break;
                    } else {
                        int i54 = (i53 * i7) + i32;
                        if (i54 < mm0Var.d.size()) {
                            v5Var.a(i32, (org.telegram.messenger.we) mm0Var.d.get(i54));
                        } else {
                            v5Var.a(i32, null);
                        }
                        i32++;
                    }
                }
            case 14:
                I(d1Var, i7);
                break;
            case 15:
                J(d1Var, i7);
                break;
            case 16:
                K(d1Var, i7);
                break;
            case 17:
                L(d1Var, i7);
                break;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj2;
                if (d1Var.f == 0) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
                    t2Var.s2 = i7 != arrayList5.size() - 1;
                    t2Var.setDialog((org.telegram.ui.Cells.o2) arrayList5.get(i7));
                    break;
                }
                break;
            default:
                View view7 = d1Var.a;
                pg.a aVar = (pg.a) ((pg.j) obj2).E.get(i7);
                int i55 = aVar.b;
                org.telegram.ui.Components.l6 l6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = p1.g.c(i55);
                if (c10 == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) view7;
                    o1Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                    o1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    org.telegram.ui.Cells.n4 n4Var5 = (org.telegram.ui.Cells.n4) view7;
                    n4Var5.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false));
                    n4Var5.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    pg.i iVar = (pg.i) view7;
                    iVar.f = charSequence.toString();
                    iVar.d = ((Float) l6Var.get(null)).floatValue();
                    iVar.b = aVar.d;
                    iVar.c = aVar.e;
                    iVar.e = l6Var;
                    iVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public void v(v4.d1 d1Var, int i7, List list) {
        int i10;
        boolean contains;
        switch (this.c) {
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.E;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 == 5 && !list.isEmpty()) {
                    nx0 nx0Var = (nx0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i7 - proxyListActivity.n))) != nx0Var.h) {
                        nx0Var.h = contains;
                        nx0Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        nx0Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (d1Var.f != 3 || !list.contains(0)) {
                    t(d1Var, i7);
                    break;
                } else {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    i10 = proxyListActivity.useProxyRow;
                    if (i7 != i10) {
                        if (i7 == proxyListActivity.w) {
                            r8Var.setChecked(org.telegram.messenger.iz.a1);
                            break;
                        }
                    } else {
                        r8Var.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.v(d1Var, i7, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.um] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        View n4Var;
        View view;
        org.telegram.ui.Cells.r5 r5Var;
        FrameLayout frameLayout;
        View view2;
        View view3;
        View n4Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        View r8Var;
        ViewGroup viewGroup2;
        View y6Var;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        int i10 = this.c;
        int i11 = 19;
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
                    z8Var = new org.telegram.ui.Cells.n4(context);
                } else if (i7 == 1) {
                    z8Var = new org.telegram.ui.Cells.r8(context);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                    w9Var.setCanDisable(true);
                    z8Var = w9Var;
                } else {
                    z8Var = new org.telegram.ui.Cells.z8(context);
                }
                z8Var.setLayoutParams(new v4.o0(-1, -2));
                return new org.telegram.ui.Components.xi0(z8Var);
            case 1:
                Context context2 = (Context) obj2;
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj;
                boolean z9 = bnVar.n;
                org.telegram.ui.ActionBar.f6 f6Var6 = bnVar.a;
                switch (i7) {
                    case 0:
                        n4Var = new org.telegram.ui.Cells.n4((Context) obj2, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, bnVar.a);
                        break;
                    case 1:
                        View y6Var2 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var6)), org.telegram.ui.ActionBar.k6.Y0(context2, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7)).x = true;
                        view = y6Var2;
                        n4Var = view;
                        break;
                    case 2:
                        n4Var = new org.telegram.ui.Cells.z8(context2, f6Var6);
                        break;
                    case 3:
                        n4Var = new org.telegram.ui.Cells.m8(context2, f6Var6);
                        break;
                    case 4:
                    case 11:
                        org.telegram.ui.Components.wm wmVar = new org.telegram.ui.Components.wm(this, (Context) obj2, bnVar.I ? 1 : 0, bnVar.a, i7);
                        if (i7 == 11 && !z9) {
                            wmVar.setTextRight(98);
                            wmVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.um
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i14) {
                                        case 0:
                                            bn.S((bn) this.b.e, -2);
                                            break;
                                        case 1:
                                            bn.S((bn) this.b.e, -3);
                                            break;
                                        default:
                                            ((bn) this.b.e).c0(view4, (org.telegram.ui.Cells.a6) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        wmVar.c();
                        wmVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                        wmVar.b(new org.telegram.ui.Components.xm(this, wmVar, i7));
                        n4Var = wmVar;
                        break;
                    case 5:
                    default:
                        org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(this, (Context) obj2, bnVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.um
                            public final /* synthetic */ org.telegram.ui.l4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                switch (i15) {
                                    case 0:
                                        bn.S((bn) this.b.e, -2);
                                        break;
                                    case 1:
                                        bn.S((bn) this.b.e, -3);
                                        break;
                                    default:
                                        ((bn) this.b.e).c0(view4, (org.telegram.ui.Cells.a6) view4.getParent(), true);
                                        break;
                                }
                            }
                        }, bnVar.a);
                        if (!z9) {
                            zmVar.setTextRight(org.telegram.messenger.qs.W1);
                            zmVar.a().setOnClickListener(new org.telegram.ui.Components.lk(i16, this, zmVar));
                        }
                        int i17 = org.telegram.ui.ActionBar.k6.o7;
                        zmVar.setIconsColor(i17);
                        org.telegram.ui.Components.wo woVar = zmVar.r;
                        if (woVar != null) {
                            woVar.getCheckBoxBase().i(org.telegram.messenger.g0.L(6.0f));
                            CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                            float f10 = zmVar.a.e;
                            if (checkBoxBase.w != f10) {
                                checkBoxBase.w = f10;
                                checkBoxBase.b();
                            }
                        }
                        zmVar.getCheckBox().b(-1, i17, org.telegram.ui.ActionBar.k6.k7);
                        zmVar.b(new fi.h7(i12, this, zmVar));
                        zmVar.setShowNextButton(true);
                        EditTextBoldCursor textView = zmVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new nd(i15, this, zmVar));
                        textView.setOnKeyListener(new org.telegram.ui.Components.vm(zmVar, i14));
                        n4Var = zmVar;
                        break;
                    case 6:
                        n4Var = new org.telegram.ui.Cells.r8(context2, f6Var6);
                        break;
                    case 7:
                        org.telegram.ui.Components.ym ymVar = new org.telegram.ui.Components.ym(this, context2, bnVar.I ? 1 : 0);
                        ymVar.c();
                        if (!z9) {
                            ymVar.setTextRight(98);
                            ymVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.um
                                public final /* synthetic */ org.telegram.ui.l4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i16) {
                                        case 0:
                                            bn.S((bn) this.b.e, -2);
                                            break;
                                        case 1:
                                            bn.S((bn) this.b.e, -3);
                                            break;
                                        default:
                                            ((bn) this.b.e).c0(view4, (org.telegram.ui.Cells.a6) view4.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        ymVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                        ymVar.b(new fi.h7(i13, this, ymVar));
                        n4Var = ymVar;
                        break;
                    case 8:
                        View tmVar = new org.telegram.ui.Components.tm(context2, 0);
                        tmVar.setTag(-33024);
                        view = tmVar;
                        n4Var = view;
                        break;
                    case 9:
                        View ecVar = new bi.ec(15, context2, this);
                        ecVar.setTag(-33024);
                        view = ecVar;
                        n4Var = view;
                        break;
                    case 10:
                        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context2, f6Var6);
                        x5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        n4Var = x5Var;
                        break;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 2:
                return new org.telegram.ui.Components.xi0(new org.telegram.ui.Components.cz((org.telegram.ui.Components.ez) obj, (Context) obj2));
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(0, (Context) obj2, null);
                o2Var.setBackground(null);
                o2Var.setLayoutParams(new v4.o0(-1, -2));
                return new org.telegram.ui.Components.xi0(o2Var);
            case 4:
                Context context3 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.ActionBar.f6 f6Var7 = ((org.telegram.ui.Components.sd0) obj).I0;
                    org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context3);
                    s5Var.e = new m.f3(s5Var, 20);
                    TextView textView2 = new TextView(context3);
                    s5Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    s5Var.addView(textView2, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    s5Var.b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.ng, f6Var7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    s5Var.addView(textView3, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context3);
                    Paint paint = new Paint();
                    hd0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    hd0Var.b = paint2;
                    hd0Var.c = org.telegram.messenger.g0.L(16.0f);
                    hd0Var.d = 0;
                    hd0Var.e = 0.0f;
                    hd0Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    s5Var.c = hd0Var;
                    s5Var.addView(hd0Var, c8.ha.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    s5Var.setSeekBarDelegate(new org.telegram.ui.Components.ax(this, 11));
                    r5Var = s5Var;
                } else {
                    org.telegram.ui.Cells.r5 r5Var2 = new org.telegram.ui.Cells.r5(context3);
                    r5Var2.setOnClickListener(new org.telegram.ui.Components.la0(this, i13));
                    r5Var = r5Var2;
                }
                return new org.telegram.ui.Components.xi0(r5Var);
            case 5:
                Context context4 = (Context) obj2;
                org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) obj;
                if (i7 != 0) {
                    FrameLayout a4Var = new di.a4(context4, i11);
                    a4Var.setWillNotDraw(false);
                    at0Var.l1 = new TextView(context4);
                    org.telegram.ui.ActionBar.r6.V(at0Var.l1, org.telegram.ui.ActionBar.k6.J5, at0Var.I0);
                    at0Var.l1.setTextSize(1, 14.0f);
                    at0Var.l1.setGravity(17);
                    at0Var.l1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    a4Var.addView(at0Var.l1, c8.ha.c(40.0f, -1));
                    frameLayout = a4Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r7(54, context4, at0Var.I0, false);
                }
                return new org.telegram.ui.Components.xi0(frameLayout);
            case 6:
                return new org.telegram.ui.Components.xi0(new org.telegram.ui.Components.nw0((org.telegram.ui.Components.ow0) obj, ((org.telegram.ui.Components.ow0) obj2).getContext()));
            case 7:
                return new org.telegram.ui.Components.xi0(new org.telegram.ui.Components.s61((org.telegram.ui.Components.u61) obj, (Context) obj2));
            case 8:
                Context context5 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context5);
                    r8Var2.d(org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                    r8Var2.setTypeface(org.telegram.messenger.g0.o());
                    r8Var2.setHeight(56);
                    view2 = r8Var2;
                } else if (i7 == 1) {
                    view2 = new org.telegram.ui.Cells.y6(context5, (org.telegram.ui.Cells.f1) null);
                } else if (i7 == 2) {
                    view2 = new org.telegram.ui.Cells.n4(context5);
                } else if (i7 != 3) {
                    view2 = i7 != 4 ? new org.telegram.ui.Cells.z8(context5) : new org.telegram.ui.Cells.h5(context5);
                } else {
                    org.telegram.ui.Components.vt0 vt0Var = new org.telegram.ui.Components.vt0(context5, null);
                    vt0Var.setCallback(new wr(this, i13));
                    view2 = vt0Var;
                }
                return jg.g.r(view2, view2, -1, -2);
            case 9:
                Context context6 = (Context) obj2;
                View m8Var = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new org.telegram.ui.Cells.m8(context6) : new org.telegram.ui.Cells.h5(context6) : new org.telegram.ui.Cells.z8(context6) : new org.telegram.ui.Cells.r8(context6) : new org.telegram.ui.Cells.n4(context6, 22) : new org.telegram.ui.Cells.w9(context6) : new org.telegram.ui.Cells.y6(context6, (org.telegram.ui.Cells.f1) null);
                return jg.g.r(m8Var, m8Var, -1, -2);
            case 10:
                Context context7 = (Context) obj2;
                if (i7 == 0) {
                    View n4Var3 = new org.telegram.ui.Cells.n4(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var3, null);
                    view3 = n4Var3;
                } else if (i7 == 1) {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context7);
                    y8Var.setMultilineDetail(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y8Var, null);
                    view3 = y8Var;
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.Cells.y6(context7, (org.telegram.ui.Cells.f1) null);
                } else if (i7 != 3) {
                    view3 = new org.telegram.ui.Cells.z8(context7);
                } else {
                    View w9Var2 = new org.telegram.ui.Cells.w9(context7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, w9Var2, null);
                    view3 = w9Var2;
                }
                return jg.g.r(view3, view3, -1, -2);
            case 11:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context8 = (Context) obj2;
                if (i7 == 0) {
                    f6Var = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.n4(context8, f6Var);
                } else if (i7 == 1) {
                    f6Var2 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.r8(context8, f6Var2);
                } else if (i7 == 2) {
                    n4Var2 = new org.telegram.ui.Cells.y8(context8);
                } else if (i7 == 3) {
                    f6Var3 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.h5((Context) obj2, 21, 64, true, f6Var3);
                } else if (i7 == 4) {
                    n4Var2 = new org.telegram.ui.Cells.y6(context8, (org.telegram.ui.Cells.f1) null);
                } else if (i7 != 5) {
                    f6Var5 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.z8(context8, f6Var5);
                } else {
                    f6Var4 = ((org.telegram.ui.ActionBar.f2) notificationsSettingsActivity).resourceProvider;
                    n4Var2 = new org.telegram.ui.Cells.w9(0, context8, f6Var4);
                }
                return new org.telegram.ui.Components.xi0(n4Var2);
            case 12:
                Context context9 = (Context) obj2;
                if (i7 == 0) {
                    r8Var = new org.telegram.ui.Cells.r8(context9);
                } else if (i7 == 1) {
                    r8Var = new org.telegram.ui.Cells.w9(context9);
                } else if (i7 == 3) {
                    r8Var = new org.telegram.ui.Cells.n4(context9);
                } else if (i7 != 4) {
                    r8Var = new org.telegram.ui.Cells.z8(context9);
                } else {
                    r8Var = new ji0(context9);
                    r8Var.setTag(-33024);
                }
                return new org.telegram.ui.Components.xi0(r8Var);
            case 13:
                Context context10 = (Context) obj2;
                org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context10);
                v5Var.e = new Paint();
                v5Var.b = new org.telegram.messenger.we[4];
                v5Var.a = new org.telegram.ui.Cells.t5[4];
                while (i14 < 4) {
                    v5Var.a[i14] = new org.telegram.ui.Cells.t5(v5Var, context10);
                    v5Var.addView(v5Var.a[i14]);
                    v5Var.a[i14].setVisibility(4);
                    v5Var.a[i14].setTag(Integer.valueOf(i14));
                    v5Var.a[i14].setOnClickListener(new org.telegram.ui.Cells.a(v5Var, 9));
                    i14++;
                }
                v5Var.setDelegate(new li0(this, i16));
                return new org.telegram.ui.Components.xi0(v5Var);
            case 14:
                xm0 xm0Var = (xm0) obj;
                boolean z10 = xm0Var.r0;
                Context context11 = (Context) obj2;
                if (i7 == 0) {
                    org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context11, null);
                    q5Var.setDelegate(new vm0(this));
                    q5Var.getCheckFrame().setVisibility(xm0Var.T == 0 ? 0 : 8);
                    viewGroup2 = q5Var;
                } else if (i7 == 1) {
                    ViewGroup frameLayout4 = new FrameLayout(context11);
                    frameLayout4.setLayoutParams(new v4.o0(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context11, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout4.addView(radialProgressView, c8.ha.c(-1.0f, -1));
                    viewGroup2 = frameLayout4;
                } else if (i7 == 2) {
                    viewGroup2 = new org.telegram.ui.Cells.h7(1, context11, null);
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(context11, null);
                    e3Var.setForceDarkTheme(z10);
                    viewGroup2 = e3Var;
                } else {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(23, context11, true);
                    m8Var2.setLayoutParams(new v4.o0(-1, -2));
                    if (z10) {
                        org.telegram.ui.ActionBar.r6.Y(m8Var2.a, xm0Var.v0, null);
                        org.telegram.ui.ActionBar.r6.t(m8Var2.e, org.telegram.ui.ActionBar.k6.fh, null, PorterDuff.Mode.MULTIPLY);
                    }
                    viewGroup2 = m8Var2;
                }
                return new org.telegram.ui.Components.xi0(viewGroup2);
            case 15:
                Context context12 = (Context) obj2;
                org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context12);
                new Paint();
                w5Var.setWillNotDraw(false);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context12);
                w5Var.a = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                w5Var.addView(l9Var, c8.ha.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(context12);
                w5Var.b = frameLayout5;
                w5Var.addView(frameLayout5, c8.ha.e(42, 42, 53));
                bi.m5 m5Var = new bi.m5(context12);
                m5Var.d = new Path();
                m5Var.e = new float[8];
                m5Var.b = new RectF();
                m5Var.c = new Paint(1);
                w5Var.e = m5Var;
                m5Var.setWillNotDraw(false);
                m5Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
                w5Var.addView(m5Var, c8.ha.e(-1, 16, 83));
                m5Var.addView(org.telegram.messenger.camera.q.e(context12, R.drawable.ic_video), c8.ha.e(-2, -2, 19));
                TextView textView4 = new TextView(context12);
                w5Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                m5Var.addView(textView4, c8.ha.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                org.telegram.ui.Components.wo woVar2 = new org.telegram.ui.Components.wo(24, context12, null);
                w5Var.c = woVar2;
                woVar2.setDrawBackgroundAsArc(11);
                woVar2.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
                w5Var.addView(woVar2, c8.ha.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                woVar2.setVisibility(0);
                w5Var.setFocusable(true);
                frameLayout5.setOnClickListener(new g40(this, 21));
                return new org.telegram.ui.Components.xi0(w5Var);
            case 16:
                Context context13 = (Context) obj2;
                if (i7 == 0) {
                    y6Var = new org.telegram.ui.Cells.y6(context13, (org.telegram.ui.Cells.f1) null);
                } else if (i7 == 1) {
                    y6Var = new org.telegram.ui.Cells.w9(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y6Var, null);
                } else if (i7 == 2) {
                    y6Var = new org.telegram.ui.Cells.n4(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y6Var, null);
                } else if (i7 == 3) {
                    y6Var = new org.telegram.ui.Cells.r8(context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y6Var, null);
                } else if (i7 == 4) {
                    y6Var = new org.telegram.ui.Cells.z8(context13);
                } else if (i7 != 6) {
                    y6Var = new nx0((ProxyListActivity) obj, context13);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y6Var, null);
                } else {
                    y6Var = new org.telegram.ui.Components.vt0(context13, null);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, y6Var, null);
                }
                return jg.g.r(y6Var, y6Var, -1, -2);
            case 17:
                Context context14 = (Context) obj2;
                if (i7 == 0) {
                    frameLayout2 = new org.telegram.ui.Cells.n4(context14);
                } else if (i7 == 1) {
                    frameLayout2 = new org.telegram.ui.Cells.r8(context14);
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context14);
                    w9Var3.setCanDisable(true);
                    frameLayout2 = w9Var3;
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.z8(context14);
                }
                frameLayout2.setLayoutParams(new v4.o0(-1, -2));
                return new org.telegram.ui.Components.xi0(frameLayout2);
            case 18:
                Context context15 = (Context) obj2;
                View t2Var = i7 == 0 ? new org.telegram.ui.Cells.t2(context15, false) : new org.telegram.ui.Cells.t4(context15);
                t2Var.setLayoutParams(new v4.o0(-1, -2));
                return new org.telegram.ui.Components.xi0(t2Var);
            default:
                Context context16 = (Context) obj2;
                int c10 = p1.g.c(p1.g.d(3)[i7]);
                if (c10 == 1) {
                    frameLayout3 = new org.telegram.ui.Cells.n4(context16);
                } else if (c10 != 2) {
                    frameLayout3 = new org.telegram.ui.ActionBar.o1(context16, null);
                } else {
                    pg.i iVar = new pg.i(context16);
                    iVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    iVar.h = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context16);
                    iVar.a = mm0Var;
                    mm0Var.setReportChanges(true);
                    mm0Var.setDelegate(new org.telegram.ui.Components.uy(iVar, r9));
                    mm0Var.setImportantForAccessibility(2);
                    iVar.addView(mm0Var, c8.ha.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout3 = iVar;
                }
                frameLayout3.setLayoutParams(new v4.o0(-1, -2));
                return new org.telegram.ui.Components.xi0(frameLayout3);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        int i7;
        int i10 = this.c;
        Object obj = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj;
                sh.d dVar = bnVar.m1;
                boolean z9 = bnVar.n;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 != 4) {
                    if (i11 != 11) {
                        if (i11 != 5) {
                            if (i11 == 7) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setTag(1);
                                CharSequence charSequence = bnVar.P;
                                a6Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.hd.M0(2131754474, null), false);
                                a6Var.setTag(null);
                                if (!z9) {
                                    a6Var.e.b(dVar.b(-3), false);
                                }
                                org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                                break;
                            }
                        } else {
                            int b10 = d1Var.b();
                            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                            a6Var2.setTag(1);
                            a6Var2.a.a(bnVar.b0, false);
                            int i12 = b10 - bnVar.t0;
                            a6Var2.n(bnVar.K[i12], org.telegram.messenger.hd.M0(z9 ? 2131744056 : 2131747773, null), true);
                            a6Var2.setTag(null);
                            if (bnVar.k0 == b10) {
                                EditTextBoldCursor textView = a6Var2.getTextView();
                                textView.requestFocus();
                                org.telegram.messenger.g0.K3(textView);
                                bnVar.k0 = -1;
                            }
                            if (!z9) {
                                a6Var2.e.b(dVar.b(i12), false);
                            }
                            org.telegram.ui.Components.bn.P(bnVar, view, b10);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
                        a6Var3.setTag(1);
                        CharSequence charSequence2 = bnVar.O;
                        a6Var3.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.hd.M0(2131746448, null), false);
                        a6Var3.setTag(null);
                        a6Var3.e.b(dVar.b(-2), false);
                        org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.a6 a6Var4 = (org.telegram.ui.Cells.a6) view;
                    a6Var4.setTag(1);
                    CharSequence charSequence3 = bnVar.N;
                    a6Var4.n(charSequence3 != null ? charSequence3 : "", org.telegram.messenger.hd.M0(z9 ? 2131744054 : 2131746447, null), true);
                    a6Var4.setTag(null);
                    org.telegram.ui.Components.bn.P(bnVar, view, d1Var.b());
                    break;
                }
                break;
            case 9:
                if (d1Var.f == 3) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.a;
                    int b11 = d1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 != dataSettingsActivity.E) {
                        if (b11 != dataSettingsActivity.D) {
                            if (b11 != dataSettingsActivity.F) {
                                if (b11 != dataSettingsActivity.G) {
                                    if (b11 != dataSettingsActivity.J) {
                                        if (b11 == dataSettingsActivity.K) {
                                            int i13 = org.telegram.messenger.iz.a;
                                            r8Var.setChecked(org.telegram.messenger.rc.e(1024));
                                            break;
                                        }
                                    } else {
                                        int i14 = org.telegram.messenger.iz.a;
                                        r8Var.setChecked(org.telegram.messenger.rc.e(2048));
                                        break;
                                    }
                                } else {
                                    r8Var.setChecked(org.telegram.messenger.iz.D0);
                                    break;
                                }
                            } else {
                                r8Var.setChecked(org.telegram.messenger.iz.C0);
                                break;
                            }
                        } else {
                            r8Var.setChecked(org.telegram.messenger.iz.B0);
                            break;
                        }
                    } else {
                        r8Var.setChecked(org.telegram.messenger.iz.E0);
                        break;
                    }
                }
                break;
            case 16:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (d1Var.f == 3) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) d1Var.a;
                    int b12 = d1Var.b();
                    i7 = proxyListActivity.useProxyRow;
                    if (b12 != i7) {
                        if (b12 == proxyListActivity.w) {
                            r8Var2.setChecked(org.telegram.messenger.iz.a1);
                            break;
                        }
                    } else {
                        r8Var2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.g0
    public void z(v4.d1 d1Var) {
        switch (this.c) {
            case 1:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.e;
                int i7 = d1Var.f;
                if (i7 == 4 || i7 == 11 || i7 == 5) {
                    EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (bnVar.I) {
                            org.telegram.ui.Components.sm smVar = bnVar.y;
                            if (smVar != null) {
                                smVar.f();
                            }
                            bnVar.e0(true);
                        }
                        bnVar.g1 = null;
                        textView.clearFocus();
                        org.telegram.messenger.g0.v1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public l4(pg.j jVar, LaunchActivity launchActivity) {
        this.c = 19;
        this.e = jVar;
        this.d = launchActivity;
    }

    public l4(Context context) {
        this.c = 18;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.o2 o2Var = new org.telegram.ui.Cells.o2();
        o2Var.a = org.telegram.messenger.hd.M0(2131744172, null);
        o2Var.b = org.telegram.messenger.hd.M0(2131744164, null);
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
        o2Var2.a = org.telegram.messenger.hd.M0(2131744171, null);
        o2Var2.b = org.telegram.messenger.hd.M0(2131744163, null);
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
        o2Var3.a = org.telegram.messenger.hd.M0(2131744170, null);
        o2Var3.b = org.telegram.messenger.hd.M0(2131744162, null);
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
        o2Var4.a = org.telegram.messenger.hd.M0(2131744169, null);
        o2Var4.b = org.telegram.messenger.hd.M0(2131744161, null);
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
        o2Var5.a = org.telegram.messenger.hd.M0(2131744168, null);
        o2Var5.b = org.telegram.messenger.hd.M0(2131744160, null);
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
        o2Var6.a = org.telegram.messenger.hd.M0(2131744167, null);
        o2Var6.b = org.telegram.messenger.hd.M0(2131744159, null);
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
        o2Var7.a = org.telegram.messenger.hd.M0(2131744166, null);
        o2Var7.b = org.telegram.messenger.hd.M0(2131744158, null);
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
        o2Var8.a = org.telegram.messenger.hd.M0(2131744165, null);
        o2Var8.b = org.telegram.messenger.hd.M0(2131744157, null);
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
