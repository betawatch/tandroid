package fg;

import ag.u2;
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
import bi.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jg.b1;
import li.r0;
import li.s0;
import li.v0;
import mg.c2;
import n2.u;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a6;
import org.telegram.messenger.ap;
import org.telegram.messenger.b6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bu;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dw;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.messenger.k6;
import org.telegram.messenger.nd;
import org.telegram.messenger.qi;
import org.telegram.messenger.sc;
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.l5;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.w5;
import org.telegram.ui.Cells.x5;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y5;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.Wallet.k0;
import org.telegram.ui.cz0;
import org.telegram.ui.es0;
import org.telegram.ui.f50;
import org.telegram.ui.jf0;
import org.telegram.ui.jo0;
import org.telegram.ui.l01;
import org.telegram.ui.lo0;
import org.telegram.ui.rj0;
import org.telegram.ui.tj0;
import org.telegram.ui.tt;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
import org.telegram.ui.yn0;
import s4.c1;
import s4.o0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends sk0 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object e;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.c = i10;
        this.e = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String L0;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        CharSequence charSequence;
        boolean z10;
        boolean z11;
        a6 a6Var;
        CharSequence L02;
        int i21;
        boolean z12;
        int i22;
        CharSequence charSequence2;
        int i23;
        int i24;
        int i25;
        CharSequence L03;
        int i26;
        boolean a2;
        boolean z13;
        CharSequence charSequence3;
        boolean z14;
        boolean z15;
        int i27;
        int i28;
        DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
        int i29 = c1Var.f;
        View view = c1Var.a;
        boolean z16 = true;
        int i30 = 0;
        switch (i29) {
            case 1:
                x9 x9Var = (x9) view;
                x9Var.setCanDisable(false);
                a7.V(x9Var.getTextView(), t6.G6, null);
                i11 = dataSettingsActivity.useLessDataForCallsRow;
                if (i10 != i11) {
                    i12 = dataSettingsActivity.proxyRow;
                    if (i10 != i12) {
                        i13 = dataSettingsActivity.resetDownloadRow;
                        if (i10 != i13) {
                            i14 = dataSettingsActivity.clearDraftsRow;
                            if (i10 == i14) {
                                x9Var.setIcon(0);
                                x9Var.b(cd.L0(2131746856, null), false);
                                break;
                            }
                        } else {
                            x9Var.setIcon(0);
                            x9Var.setCanDisable(true);
                            a7.V(x9Var.getTextView(), t6.p7, null);
                            x9Var.b(cd.L0(2131746128, null), false);
                            break;
                        }
                    } else {
                        x9Var.setIcon(0);
                        x9Var.b(cd.L0(2131746616, null), false);
                        break;
                    }
                } else {
                    x9Var.setIcon(0);
                    int i31 = vp.d1().getInt("VoipDataSaving", m1.c());
                    if (i31 == 0) {
                        str = null;
                        L0 = cd.L0(2131743821, null);
                    } else if (i31 == 1) {
                        str = null;
                        L0 = cd.L0(2131743820, null);
                    } else if (i31 == 2) {
                        str = null;
                        L0 = cd.L0(2131743822, null);
                    } else if (i31 != 3) {
                        L0 = null;
                        str = null;
                    } else {
                        str = null;
                        L0 = cd.L0(2131743819, null);
                    }
                    x9Var.c(cd.L0(2131743255, str), L0, dataSettingsActivity.U, true);
                    dataSettingsActivity.U = false;
                    break;
                }
                break;
            case 2:
                p4 p4Var = (p4) view;
                if (i10 != dataSettingsActivity.d) {
                    if (i10 != 0) {
                        if (i10 != dataSettingsActivity.M) {
                            if (i10 != dataSettingsActivity.O) {
                                if (i10 != dataSettingsActivity.y) {
                                    if (i10 != dataSettingsActivity.I) {
                                        if (i10 == dataSettingsActivity.R) {
                                            p4Var.setText(cd.L0(2131745935, null));
                                            break;
                                        }
                                    } else {
                                        p4Var.setText(cd.L0(2131753764, null));
                                        break;
                                    }
                                } else {
                                    p4Var.setText(cd.L0(2131744464, null));
                                    break;
                                }
                            } else {
                                p4Var.setText(cd.L0(2131746626, null));
                                break;
                            }
                        } else {
                            p4Var.setText(cd.L0(2131752596, null));
                            break;
                        }
                    } else {
                        p4Var.setText(cd.L0(2131751677, null));
                        break;
                    }
                } else {
                    p4Var.setText(cd.L0(2131753767, null));
                    break;
                }
                break;
            case 3:
                t8 t8Var = (t8) view;
                if (i10 != dataSettingsActivity.D) {
                    if (i10 != dataSettingsActivity.E) {
                        if (i10 != dataSettingsActivity.G) {
                            if (i10 != dataSettingsActivity.F) {
                                if (i10 != dataSettingsActivity.J) {
                                    if (i10 == dataSettingsActivity.K) {
                                        String L04 = cd.L0(2131753763, null);
                                        int i32 = tz.a;
                                        t8Var.f(L04, sc.e(1024), false);
                                        break;
                                    }
                                } else {
                                    String L05 = cd.L0(2131753765, null);
                                    int i33 = tz.a;
                                    t8Var.f(L05, sc.e(2048), true);
                                    break;
                                }
                            } else {
                                t8Var.f("(beta only) Stream All Videos", tz.C0, false);
                                break;
                            }
                        } else {
                            t8Var.f("(beta only) Show MKV as Video", tz.D0, true);
                            break;
                        }
                    }
                } else {
                    t8Var.f(cd.L0(2131751145, null), tz.B0, dataSettingsActivity.F != -1);
                    break;
                }
                break;
            case 4:
                b9 b9Var = (b9) view;
                if (i10 == dataSettingsActivity.H) {
                    b9Var.setText(cd.L0(2131751159, null));
                    break;
                }
                break;
            case 5:
                l5 l5Var = (l5) view;
                i15 = dataSettingsActivity.saveToGalleryPeerRow;
                if (i10 == i15) {
                    L03 = cd.L0(2131745936, null);
                    dw dwVar = js.f;
                    i27 = ((k2) dataSettingsActivity).currentAccount;
                    charSequence2 = dwVar.e(i27);
                    a2 = js.f.a();
                } else {
                    i16 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i10 == i16) {
                        L03 = cd.L0(2131745943, null);
                        dw dwVar2 = js.g;
                        i26 = ((k2) dataSettingsActivity).currentAccount;
                        charSequence2 = dwVar2.e(i26);
                        a2 = js.g.a();
                    } else {
                        i17 = dataSettingsActivity.saveToGalleryChannelsRow;
                        if (i10 == i17) {
                            CharSequence L06 = cd.L0(2131745945, null);
                            dw dwVar3 = js.h;
                            i25 = ((k2) dataSettingsActivity).currentAccount;
                            charSequence2 = dwVar3.e(i25);
                            charSequence = L06;
                            z10 = js.h.a();
                            z11 = false;
                            a6Var = null;
                            if (a6Var == null) {
                                long[] jArr = a6Var.b;
                                StringBuilder sb2 = new StringBuilder();
                                int i34 = 0;
                                boolean z17 = false;
                                int i35 = 0;
                                boolean z18 = false;
                                boolean z19 = false;
                                while (true) {
                                    int[] iArr = a6Var.a;
                                    int i36 = z16;
                                    if (i34 < iArr.length) {
                                        if (!z17 && (iArr[i34] & 1) != 0) {
                                            i35++;
                                            z17 = i36;
                                        }
                                        if (!z18 && (iArr[i34] & 4) != 0) {
                                            i35++;
                                            z18 = i36;
                                        }
                                        if (!z19 && (iArr[i34] & 8) != 0) {
                                            i35++;
                                            z19 = i36;
                                        }
                                        i34++;
                                        z16 = i36;
                                    } else {
                                        if (!a6Var.g || i35 == 0) {
                                            z15 = z17;
                                            sb2.append(cd.L0(2131748214, null));
                                        } else {
                                            if (z17) {
                                                sb2.append(cd.L0(2131753816, null));
                                            }
                                            if (z18) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(cd.L0(2131753805, null));
                                                z15 = z17;
                                                Object[] objArr = new Object[i36];
                                                objArr[0] = i0.i0(jArr[i36], i36, false);
                                                sb2.append(String.format(" (%1$s)", objArr));
                                            } else {
                                                z15 = z17;
                                            }
                                            if (z19) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(cd.L0(2131753837, null));
                                                sb2.append(String.format(" (%1$s)", i0.i0(jArr[b6.x(8)], true, false)));
                                            }
                                        }
                                        if ((z15 || z18 || z19) && z10) {
                                            i30 = 1;
                                        }
                                        charSequence3 = sb2;
                                        z13 = i30;
                                        z14 = true;
                                    }
                                }
                            } else {
                                z13 = z10;
                                charSequence3 = charSequence2;
                                z14 = true;
                            }
                            l5Var.setAnimationsEnabled(z14);
                            l5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            break;
                        } else {
                            if (i10 == dataSettingsActivity.e) {
                                L02 = cd.L0(2131742910, null);
                                i23 = ((k2) dataSettingsActivity).currentAccount;
                                z12 = b6.q(i23).M.g;
                                i24 = ((k2) dataSettingsActivity).currentAccount;
                                a6Var = b6.q(i24).n();
                            } else if (i10 == dataSettingsActivity.h) {
                                L02 = cd.L0(2131742912, null);
                                i21 = ((k2) dataSettingsActivity).currentAccount;
                                z12 = b6.q(i21).N.g;
                                i22 = ((k2) dataSettingsActivity).currentAccount;
                                a6Var = b6.q(i22).p();
                            } else {
                                CharSequence L07 = cd.L0(2131742911, null);
                                i18 = ((k2) dataSettingsActivity).currentAccount;
                                boolean z20 = b6.q(i18).O.g;
                                i19 = ((k2) dataSettingsActivity).currentAccount;
                                a6 o10 = b6.q(i19).o();
                                i20 = dataSettingsActivity.resetDownloadRow;
                                charSequence = L07;
                                z10 = z20;
                                z11 = i20 >= 0;
                                a6Var = o10;
                                charSequence2 = null;
                                if (a6Var == null) {
                                }
                                l5Var.setAnimationsEnabled(z14);
                                l5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                            }
                            charSequence = L02;
                            z10 = z12;
                            z11 = true;
                            charSequence2 = null;
                            if (a6Var == null) {
                            }
                            l5Var.setAnimationsEnabled(z14);
                            l5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                        }
                    }
                }
                charSequence = L03;
                z10 = a2;
                z11 = true;
                a6Var = null;
                if (a6Var == null) {
                }
                l5Var.setAnimationsEnabled(z14);
                l5Var.b(charSequence, charSequence3, 0, z13, 0, true, z11, false);
                break;
            case 6:
                p8 p8Var = (p8) view;
                if (i10 == dataSettingsActivity.s) {
                    if (dataSettingsActivity.W) {
                        p8Var.r(cd.L0(2131744834, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        p8Var.h(45, true, dataSettingsActivity.V);
                    } else {
                        String L08 = cd.L0(2131744834, null);
                        long j10 = dataSettingsActivity.X;
                        p8Var.r(L08, j10 <= 0 ? "" : i0.i0(j10, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                        p8Var.h(45, false, dataSettingsActivity.V);
                    }
                    dataSettingsActivity.V = false;
                } else if (i10 == dataSettingsActivity.w) {
                    i28 = ((k2) dataSettingsActivity).currentAccount;
                    uz e = uz.e(i28);
                    p8Var.r(cd.L0(2131748312, null), i0.i0(e.g(2, 6) + e.g(1, 6) + e.g(0, 6) + e.f(2, 6) + e.f(1, 6) + e.f(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                } else if (i10 == dataSettingsActivity.n) {
                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                    if (!TextUtils.isEmpty(tz.h0)) {
                        int size = dataSettingsActivity.c.size();
                        while (true) {
                            if (i30 < size) {
                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i30)).getAbsolutePath();
                                if (absolutePath2.startsWith(tz.h0)) {
                                    absolutePath = absolutePath2;
                                } else {
                                    i30++;
                                }
                            }
                        }
                    }
                    p8Var.r(cd.L0(2131744838, null), cd.L0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131749198 : 2131745857, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                }
                p8Var.setOffsetFromImage(64);
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
    private final void H(c1 c1Var, int i10) {
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
        CharSequence L0;
        ArrayList arrayList;
        int i30;
        int i31;
        CharSequence charSequence;
        ArrayList arrayList2;
        int i32;
        int i33;
        int i34;
        boolean z10;
        int i35;
        int i36;
        int i37;
        NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
        int i38 = c1Var.f;
        View view = c1Var.a;
        if (i38 == 0) {
            p4 p4Var = (p4) view;
            if (i10 == notificationsSettingsActivity.y) {
                p4Var.setText(cd.L0(2131747925, "NotificationsForChats"));
                return;
            }
            if (i10 == notificationsSettingsActivity.E) {
                p4Var.setText(cd.L0(2131749228, "InAppNotifications"));
                return;
            }
            if (i10 == notificationsSettingsActivity.K) {
                p4Var.setText(cd.L0(2131750886, "Events"));
                return;
            }
            if (i10 == notificationsSettingsActivity.M) {
                p4Var.setText(cd.L0(2131747907, "NotificationsOther"));
                return;
            }
            if (i10 == notificationsSettingsActivity.S) {
                p4Var.setText(cd.L0(2131746135, "Reset"));
                return;
            }
            if (i10 == notificationsSettingsActivity.G) {
                p4Var.setText(cd.L0(2131743305, "VoipNotificationSettings"));
                return;
            } else if (i10 == notificationsSettingsActivity.N) {
                p4Var.setText(cd.L0(2131753733, "BadgeNumber"));
                return;
            } else {
                if (i10 == notificationsSettingsActivity.r) {
                    p4Var.setText(cd.L0(2131745354, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        int i39 = 0;
        if (i38 == 1) {
            t8 t8Var = (t8) view;
            i11 = ((k2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences = vp.r1(i11).e7;
            i12 = notificationsSettingsActivity.inappSoundRow;
            if (i10 == i12) {
                t8Var.f(cd.L0(2131749224, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappVibrateRow;
            if (i10 == i13) {
                t8Var.f(cd.L0(2131749223, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPreviewRow;
            if (i10 == i14) {
                t8Var.f(cd.L0(2131749225, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i15 = notificationsSettingsActivity.inappPriorityRow;
            if (i10 == i15) {
                t8Var.g(cd.L0(2131749227, null), cd.L0(2131749226, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i16 = notificationsSettingsActivity.contactJoinedRow;
            if (i10 == i16) {
                t8Var.f(cd.L0(2131751790, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i17 = notificationsSettingsActivity.pinnedMessageRow;
            if (i10 == i17) {
                t8Var.f(cd.L0(2131747244, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i10 == notificationsSettingsActivity.P) {
                t8Var.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.w) {
                t8Var.g(cd.L0(2131747892, "NotificationsService"), cd.L0(2131747889, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().B3), true, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.x) {
                t8Var.g(cd.L0(2131747891, "NotificationsServiceConnection"), cd.L0(2131747890, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().C3), true, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i10 == i18) {
                t8Var.f(cd.L0(2131753731, "BadgeNumberShow"), notificationsSettingsActivity.getNotificationsController().R, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i10 == i19) {
                t8Var.f(cd.L0(2131753732, "BadgeNumberMutedChats"), notificationsSettingsActivity.getNotificationsController().S, true);
                return;
            }
            i20 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i10 == i20) {
                t8Var.f(cd.L0(2131753730, "BadgeNumberUnread"), notificationsSettingsActivity.getNotificationsController().T, false);
                return;
            }
            i21 = notificationsSettingsActivity.inchatSoundRow;
            if (i10 == i21) {
                t8Var.f(cd.L0(2131749222, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.H) {
                t8Var.f(cd.L0(2131743640, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i22 = notificationsSettingsActivity.accountsAllRow;
            if (i10 == i22) {
                t8Var.f(cd.L0(2131754302, "AllAccounts"), vp.e1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i38 == 2) {
            a9 a9Var = (a9) view;
            a9Var.setMultilineDetail(true);
            i23 = notificationsSettingsActivity.resetNotificationsRow;
            if (i10 == i23) {
                a9Var.a(cd.L0(2131746129, "ResetAllNotifications"), cd.L0(2131743911, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i38 != 3) {
            if (i38 != 5) {
                if (i38 != 6) {
                    return;
                }
                b9 b9Var = (b9) view;
                if (i10 == notificationsSettingsActivity.s) {
                    b9Var.setText(cd.L0(2131745353, "ShowNotificationsForInfo"));
                    return;
                }
                return;
            }
            x9 x9Var = (x9) view;
            i37 = ((k2) notificationsSettingsActivity).currentAccount;
            SharedPreferences sharedPreferences2 = vp.r1(i37).e7;
            if (i10 == notificationsSettingsActivity.I) {
                String string = sharedPreferences2.getString("CallsRingtone", cd.L0(2131751600, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = cd.L0(2131748167, "NoSound");
                }
                x9Var.c(cd.L0(2131743267, "VoipSettingsRingtone"), string, notificationsSettingsActivity.W, false);
                notificationsSettingsActivity.W = false;
                return;
            }
            if (i10 != notificationsSettingsActivity.H) {
                if (i10 == notificationsSettingsActivity.Q) {
                    int i40 = sharedPreferences2.getInt("repeat_messages", 60);
                    x9Var.c(cd.L0(2131746290, "RepeatNotifications"), i40 == 0 ? cd.L0(2131746289, "RepeatNotificationsNever") : i40 < 60 ? cd.G(i40, "Minutes", new Object[0]) : cd.G(i40 / 60, "Hours", new Object[0]), notificationsSettingsActivity.X, false);
                    notificationsSettingsActivity.X = false;
                    return;
                }
                return;
            }
            int i41 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i41 == 0) {
                x9Var.c(cd.L0(2131743640, "Vibrate"), cd.L0(2131743639, "VibrationDefault"), notificationsSettingsActivity.V, true);
            } else if (i41 == 1) {
                x9Var.c(cd.L0(2131743640, "Vibrate"), cd.L0(2131745384, "Short"), notificationsSettingsActivity.V, true);
            } else if (i41 == 2) {
                x9Var.c(cd.L0(2131743640, "Vibrate"), cd.L0(2131743638, "VibrationDisabled"), notificationsSettingsActivity.V, true);
            } else if (i41 == 3) {
                x9Var.c(cd.L0(2131743640, "Vibrate"), cd.L0(2131748734, "Long"), notificationsSettingsActivity.V, true);
            } else if (i41 == 4) {
                x9Var.c(cd.L0(2131743640, "Vibrate"), cd.L0(2131747837, "OnlyIfSilent"), notificationsSettingsActivity.V, true);
            }
            notificationsSettingsActivity.V = false;
            return;
        }
        l5 l5Var = (l5) view;
        i24 = ((k2) notificationsSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences3 = vp.r1(i24).e7;
        i25 = ((k2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i25).getCurrentTime();
        i26 = notificationsSettingsActivity.privateRow;
        if (i10 == i26) {
            L0 = cd.L0(2131747894, null);
            arrayList = notificationsSettingsActivity.d;
            i30 = sharedPreferences3.getInt("EnableAll2", 0);
            i31 = R.drawable.msg_openprofile;
        } else {
            i27 = notificationsSettingsActivity.groupRow;
            if (i10 != i27) {
                i28 = notificationsSettingsActivity.storiesRow;
                int i42 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i10 == i28) {
                    CharSequence L02 = cd.L0(2131747948, null);
                    ArrayList arrayList3 = notificationsSettingsActivity.h;
                    ArrayList arrayList4 = notificationsSettingsActivity.n;
                    if (sharedPreferences3.getBoolean("EnableAllStories", false)) {
                        i42 = 0;
                    }
                    i31 = R.drawable.msg_menu_stories;
                    charSequence = L02;
                    arrayList2 = arrayList4;
                    i30 = i42;
                    arrayList = arrayList3;
                } else {
                    i29 = notificationsSettingsActivity.reactionsRow;
                    if (i10 == i29) {
                        CharSequence L03 = cd.L0(2131747952, null);
                        i30 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i31 = R.drawable.msg_reactions;
                        charSequence = L03;
                        arrayList2 = null;
                        arrayList = null;
                    } else {
                        L0 = cd.L0(2131747937, null);
                        arrayList = notificationsSettingsActivity.f;
                        i30 = sharedPreferences3.getInt("EnableChannel2", 0);
                        i31 = R.drawable.msg_channel;
                    }
                }
                i32 = i30 >= currentTime ? 1 : 0;
                if (i32 == 0) {
                    i33 = 0;
                } else {
                    i33 = 0;
                    i39 = i30 - 31536000 >= currentTime ? 0 : 2;
                }
                StringBuilder sb2 = new StringBuilder();
                i34 = notificationsSettingsActivity.reactionsRow;
                if (i10 == i34) {
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i32 = i30 < currentTime ? 1 : i33;
                        if (i32 != 0) {
                            sb2.append(cd.L0(2131747908, "NotificationsOn"));
                        } else if (i30 - 31536000 >= currentTime) {
                            sb2.append(cd.L0(2131747910, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i33] = cd.a1(i30);
                            sb2.append(cd.a0("NotificationsOffUntil", null, 2131747909, objArr));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList.size();
                        i35 = notificationsSettingsActivity.storiesRow;
                        if (i10 == i35 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(cd.G(size, "Exception", new Object[i33]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(cd.L0(2131744287, "TapToChange"));
                    } else {
                        if (i30 > 0) {
                            sb2.append(cd.L0(2131747910, "NotificationsOff"));
                        } else {
                            sb2.append(cd.L0(2131747908, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(cd.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z10 = i32;
                } else if (i30 > 0) {
                    sb2.append(cd.L0(2131747910, "NotificationsOff"));
                    z10 = i33;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(cd.L0(2131747951, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(cd.L0(2131747950, null));
                    }
                    z10 = 1;
                }
                i36 = notificationsSettingsActivity.reactionsRow;
                l5Var.b(charSequence, sb2, i31, z10, i39, false, i10 == i36, false);
            }
            L0 = cd.L0(2131747923, null);
            arrayList = notificationsSettingsActivity.e;
            i30 = sharedPreferences3.getInt("EnableGroup2", 0);
            i31 = R.drawable.msg_groups;
        }
        charSequence = L0;
        arrayList2 = null;
        if (i30 >= currentTime) {
        }
        if (i32 == 0) {
        }
        StringBuilder sb22 = new StringBuilder();
        i34 = notificationsSettingsActivity.reactionsRow;
        if (i10 == i34) {
        }
        i36 = notificationsSettingsActivity.reactionsRow;
        l5Var.b(charSequence, sb22, i31, z10, i39, false, i10 == i36, false);
    }

    private final void I(c1 c1Var, int i10) {
        boolean P1;
        lo0 lo0Var = (lo0) this.e;
        we weVar = lo0Var.J;
        ArrayList arrayList = lo0Var.n;
        ArrayList arrayList2 = lo0Var.c;
        HashMap hashMap = lo0Var.b;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            v5 v5Var = (v5) view;
            v5Var.setItemSize(lo0Var.R);
            g9 imageView = v5Var.getImageView();
            v5Var.setTag(Integer.valueOf(i10));
            imageView.r();
            if (weVar != null) {
                ef efVar = (ef) weVar.e.get(i10);
                v5Var.d(efVar, arrayList2.size() > 1, true, false, false);
                int i12 = efVar.C;
                v5Var.b(lo0Var.e ? arrayList2.indexOf(Integer.valueOf(i12)) : -1, hashMap.containsKey(Integer.valueOf(i12)), false);
                P1 = PhotoViewer.P1(efVar.I);
            } else {
                hf hfVar = (hf) lo0Var.f.get(i10);
                v5Var.e(hfVar);
                v5Var.getVideoInfoContainer().setVisibility(4);
                v5Var.b(lo0Var.e ? arrayList2.indexOf(hfVar.B) : -1, hashMap.containsKey(hfVar.B), false);
                P1 = PhotoViewer.P1(hfVar.g());
            }
            imageView.getImageReceiver().O0(!P1, true);
            v5Var.getCheckBox().setVisibility((lo0Var.T != 0 || P1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = lo0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            ef efVar2 = (ef) weVar.e.get(i10);
            l7 l7Var = (l7) view;
            l7Var.setPhotoEntry(efVar2);
            l7Var.b(hashMap.containsKey(Integer.valueOf(efVar2.C)), false);
            l7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        p8 p8Var = (p8) view;
        if (i10 < arrayList.size()) {
            p8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            p8Var.o(R.drawable.msg_clear_recent, cd.L0(2131752067, null), false);
        }
    }

    private final void J(c1 c1Var, int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) c1Var.a;
        int L = i0.L(85.0f);
        int L2 = i10 != 0 ? i0.L(6.0f) : 0;
        b6Var.f = L;
        ep epVar = b6Var.c;
        g9 g9Var = b6Var.a;
        b1 b1Var = b6Var.e;
        b6Var.h = L2;
        ((FrameLayout.LayoutParams) b6Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) g9Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).rightMargin = L2;
        g9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof ef)) {
            if (obj instanceof hf) {
                hf hfVar = (hf) obj;
                b6Var.setTag(hfVar);
                b6Var.setImage(hfVar);
                b1Var.setVisibility(4);
                epVar.a.f(-1, true, false);
                epVar.setVisibility(0);
                return;
            }
            return;
        }
        ef efVar = (ef) obj;
        int i11 = efVar.C;
        String str = efVar.I;
        b6Var.setTag(efVar);
        b1Var.setVisibility(4);
        String str2 = efVar.c;
        if (str2 != null) {
            g9Var.h(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            g9Var.s(efVar.J, efVar.K, true);
            if (!efVar.b || efVar.d()) {
                g9Var.h("thumb://" + i11 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                b1Var.setVisibility(0);
                b6Var.d.setText(i0.g0(efVar.E, false, false));
                g9Var.h("vthumb://" + i11 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            g9Var.setImageResource(R.drawable.nophotos);
        }
        epVar.a.f(-1, true, false);
        epVar.setVisibility(0);
    }

    private final void K(c1 c1Var, int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i13 = c1Var.f;
        View view = c1Var.a;
        switch (i13) {
            case 1:
                x9 x9Var = (x9) view;
                a7.V(x9Var.getTextView(), t6.G6, null);
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    x9Var.b(cd.L0(2131754391, null), proxyListActivity.D != -1);
                    break;
                } else if (i10 == proxyListActivity.D) {
                    a7.V(x9Var.getTextView(), t6.p7, null);
                    x9Var.b(cd.L0(2131751581, null), false);
                    break;
                }
                break;
            case 2:
                p4 p4Var = (p4) view;
                if (i10 == proxyListActivity.h) {
                    p4Var.setText(cd.L0(2131746620, null));
                    break;
                }
                break;
            case 3:
                t8 t8Var = (t8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    t8Var.f(cd.L0(2131743809, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i10 == proxyListActivity.w) {
                    t8Var.f(cd.L0(2131743811, null), tz.a1, true);
                    break;
                }
                break;
            case 4:
                b9 b9Var = (b9) view;
                if (i10 == proxyListActivity.y) {
                    b9Var.setText(cd.L0(2131746618, null));
                    break;
                }
                break;
            case 5:
                cz0 cz0Var = (cz0) view;
                sz szVar = (sz) arrayList2.get(i10 - proxyListActivity.n);
                cz0Var.setProxy(szVar);
                cz0Var.setChecked(tz.B1 == szVar);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.n));
                cz0Var.h = contains;
                cz0Var.f.a(contains, false);
                cz0Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.x) {
                    yu0 yu0Var = (yu0) view;
                    ArrayList arrayList3 = new ArrayList(bu.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = cd.a0(null, null, 2131746617, arrayList3.get(i14));
                    }
                    yu0Var.setCallback(new z11(25));
                    yu0Var.b(tz.b1, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void L(c1 c1Var, int i10) {
        int i11;
        i11 = ((k2) ((l01) this.e)).currentAccount;
        boolean d = j50.d(i11);
        int i12 = c1Var.f;
        if (i12 == 0) {
            ((p4) c1Var.a).setText(i10 == 0 ? cd.L0(2131746005, null) : cd.L0(2131746009, null));
            return;
        }
        if (i12 == 1) {
            t8 t8Var = (t8) c1Var.a;
            t8Var.setEnabled(i10 == 1 || d);
            if (i10 == 1) {
                t8Var.f(cd.L0(2131746001, null), d, false);
                return;
            }
            String L0 = cd.L0(2131746008, null);
            mi.a aVar = mi.e.i;
            aVar.a();
            t8Var.f(L0, aVar.d, false);
            return;
        }
        if (i12 != 2) {
            ((b9) c1Var.a).setText(i10 == 6 ? cd.L0(2131746004, null) : cd.L0(2131746007, null));
            return;
        }
        x9 x9Var = (x9) c1Var.a;
        x9Var.setEnabled(d);
        if (i10 == 2) {
            x9Var.c(cd.L0(2131746003, null), a1.g.p(new StringBuilder(), ((v0) mi.e.e.a()).a, "p"), false, true);
            return;
        }
        if (i10 == 3) {
            String L02 = cd.L0(2131746013, null);
            r0 r0Var = (r0) mi.e.f.a();
            x9Var.c(L02, r0Var == r0.a ? cd.L0(2131746012, null) : r0Var == r0.b ? cd.L0(2131746010, null) : cd.L0(2131746011, null), false, true);
        } else if (i10 == 4) {
            x9Var.c(cd.L0(2131746006, null), a1.g.p(new StringBuilder(), ((s0) mi.e.g.a()).a, " FPS"), false, true);
        } else {
            x9Var.c(cd.L0(2131746014, null), l01.e0(mi.e.h.a()), false, false);
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
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
        switch (this.c) {
            case 0:
                return m1.j.d(3)[c1Var.f] == 1;
            case 1:
                int b10 = c1Var.b();
                if (b10 == 1) {
                    return true;
                }
                i10 = ((k2) ((l01) this.e)).currentAccount;
                return MediaController.s0(i10) && b10 == 2;
            case 2:
                int b11 = c1Var.b();
                jn jnVar = (jn) this.e;
                return b11 == jnVar.u0 || b11 == jnVar.G0 || b11 == jnVar.B0 || b11 == jnVar.F0 || b11 == jnVar.C0 || b11 == jnVar.H0 || b11 == jnVar.D0 || b11 == jnVar.E0 || b11 == jnVar.I0 || b11 == jnVar.J0 || b11 == jnVar.N0.a || b11 == jnVar.M0.a || b11 == jnVar.L0;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                return c1Var.f == 0;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                int b12 = c1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                i11 = dataAutoDownloadActivity.photosRow;
                if (b12 != i11) {
                    i12 = dataAutoDownloadActivity.videosRow;
                    if (b12 != i12) {
                        i13 = dataAutoDownloadActivity.filesRow;
                        if (b12 != i13) {
                            i14 = dataAutoDownloadActivity.storiesRow;
                            if (b12 != i14) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            case 10:
                int b13 = c1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (b13 != dataSettingsActivity.e && b13 != dataSettingsActivity.f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.s) {
                    i15 = dataSettingsActivity.useLessDataForCallsRow;
                    if (b13 != i15 && b13 != dataSettingsActivity.w) {
                        i16 = dataSettingsActivity.proxyRow;
                        if (b13 != i16) {
                            i17 = dataSettingsActivity.clearDraftsRow;
                            if (b13 != i17 && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.D && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.J && b13 != dataSettingsActivity.n) {
                                i18 = dataSettingsActivity.saveToGalleryGroupsRow;
                                if (b13 != i18) {
                                    i19 = dataSettingsActivity.saveToGalleryPeerRow;
                                    if (b13 != i19) {
                                        i20 = dataSettingsActivity.saveToGalleryChannelsRow;
                                        if (b13 != i20) {
                                            i21 = dataSettingsActivity.resetDownloadRow;
                                            if (b13 != i21) {
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
            case 11:
                int b14 = c1Var.b();
                jf0 jf0Var = (jf0) this.e;
                return b14 == jf0Var.c || b14 == jf0Var.d || b14 == jf0Var.e || b14 == jf0Var.f || b14 == jf0Var.h || b14 == jf0Var.r;
            case 12:
                int b15 = c1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                return (b15 == notificationsSettingsActivity.y || b15 == notificationsSettingsActivity.D || b15 == notificationsSettingsActivity.E || b15 == notificationsSettingsActivity.K || b15 == notificationsSettingsActivity.M || b15 == notificationsSettingsActivity.S || b15 == notificationsSettingsActivity.N || b15 == notificationsSettingsActivity.L || b15 == notificationsSettingsActivity.R || b15 == notificationsSettingsActivity.F || b15 == notificationsSettingsActivity.G || b15 == notificationsSettingsActivity.O || b15 == notificationsSettingsActivity.r || b15 == notificationsSettingsActivity.s || b15 == notificationsSettingsActivity.T || b15 == notificationsSettingsActivity.J) ? false : true;
            case 13:
                int b16 = c1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                i22 = passcodeActivity.fingerprintRow;
                if (b16 != i22) {
                    i23 = passcodeActivity.autoLockRow;
                    if (b16 != i23 && b16 != passcodeActivity.N) {
                        i24 = passcodeActivity.changePasscodeRow;
                        if (b16 != i24) {
                            i25 = passcodeActivity.disablePasscodeRow;
                            if (b16 != i25 && b16 != passcodeActivity.J && b16 != passcodeActivity.K) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            case 14:
                return true;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                return lo0Var.J != null || (!TextUtils.isEmpty(lo0Var.w) ? c1Var.b() >= lo0Var.f.size() : c1Var.f != 3);
            case 16:
                return false;
            case 17:
                int b17 = c1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                i26 = proxyListActivity.useProxyRow;
                if (b17 != i26 && b17 != proxyListActivity.w) {
                    i27 = proxyListActivity.proxyAddRow;
                    if (b17 != i27 && b17 != proxyListActivity.D && (b17 < proxyListActivity.n || b17 >= proxyListActivity.r)) {
                        return false;
                    }
                }
                return true;
            case 18:
                int b18 = c1Var.b();
                if (b18 == 1) {
                    return true;
                }
                i28 = ((k2) ((l01) this.e)).currentAccount;
                return j50.d(i28) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8);
            default:
                return c1Var.f != 1;
        }
    }

    public void E() {
        i5 i5Var;
        i5 i5Var2;
        i5 i5Var3;
        i5 i5Var4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.E.size();
        i5Var = ((k2) proxyListActivity).simpleActionBar;
        boolean s10 = i5Var.s();
        if (size <= 0) {
            if (s10) {
                i5Var2 = ((k2) proxyListActivity).simpleActionBar;
                i5Var2.r();
                int i10 = proxyListActivity.n;
                n(i10, proxyListActivity.r - i10, 2);
                return;
            }
            return;
        }
        i5Var3 = ((k2) proxyListActivity).simpleActionBar;
        i5Var3.y(size, s10);
        if (s10) {
            return;
        }
        i5Var4 = ((k2) proxyListActivity).simpleActionBar;
        i5Var4.C();
        int i11 = proxyListActivity.n;
        n(i11, proxyListActivity.r - i11, 2);
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.n;
        n(i10, proxyListActivity.r - i10, 1);
        E();
    }

    public void M(int i10) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.n;
        if (i10 < i11 || i10 >= proxyListActivity.r) {
            return;
        }
        sz szVar = (sz) proxyListActivity.F.get(i10 - i11);
        if (arrayList.contains(szVar)) {
            arrayList.remove(szVar);
        } else {
            arrayList.add(szVar);
        }
        h(i10, 1);
        E();
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((l) this.e).E.size();
            case 1:
                return 4;
            case 2:
                return ((jn) this.e).Q0;
            case 3:
                return ((org.telegram.ui.Components.tz) this.e).h.size();
            case 4:
                int size = ((org.telegram.ui.Components.uz) this.e).r1.size();
                return size < 10 ? size + 1 : size;
            case 5:
                return ((oe0) this.e).F;
            case 6:
                return nd.g() + 1;
            case 7:
                ArrayList arrayList = ((sx0) this.d).x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 8:
                return ((v71) this.e).h.size();
            case 9:
                return ((DataAutoDownloadActivity) this.e).y;
            case 10:
                return ((DataSettingsActivity) this.e).T;
            case 11:
                return ((jf0) this.e).w;
            case 12:
                return ((NotificationsSettingsActivity) this.e).U;
            case 13:
                return ((PasscodeActivity) this.e).P;
            case 14:
                if (((yn0) this.e).d != null) {
                    return (int) Math.ceil(r1.size() / r0.f);
                }
                return 0;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                we weVar = lo0Var.J;
                if (weVar != null) {
                    return weVar.e.size();
                }
                if (!lo0Var.f.isEmpty()) {
                    return lo0Var.f.size() + (!lo0Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(lo0Var.w) || lo0Var.n.isEmpty()) {
                    return 0;
                }
                return lo0Var.n.size() + 2;
            case 16:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                es0 es0Var = photoViewer.d;
                if (es0Var == null || es0Var.c() == null) {
                    return 0;
                }
                return photoViewer.d.c().size();
            case 17:
                return ((ProxyListActivity) this.e).e;
            case 18:
                return 7;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.g0
    public long c(int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.c) {
            case 3:
                i11 = ((org.telegram.ui.Components.tz) this.e).k0.get(i10);
                break;
            case 5:
                return i10;
            case 7:
                if (((sx0) this.d).x == null) {
                    return 0L;
                }
                return ((qi) r0.get(i10)).a.hashCode();
            case 8:
                i11 = ((s71) ((v71) this.e).h.get(i10)).a;
                break;
            case 15:
                return i10;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i10 == proxyListActivity.f) {
                    return -1L;
                }
                if (i10 == proxyListActivity.s) {
                    return -2L;
                }
                i12 = proxyListActivity.proxyAddRow;
                if (i10 == i12) {
                    return -3L;
                }
                i13 = proxyListActivity.useProxyRow;
                if (i10 == i13) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.D) {
                    return -8L;
                }
                if (i10 == proxyListActivity.w) {
                    return -9L;
                }
                if (i10 == proxyListActivity.x) {
                    return -10L;
                }
                if (i10 == proxyListActivity.y) {
                    return -11L;
                }
                if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
                    return -7L;
                }
                return ((sz) proxyListActivity.F.get(i10 - r1)).hashCode();
            default:
                return super.c(i10);
        }
        return i11;
    }

    @Override // s4.g0
    public int d(int i10) {
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
        int i42;
        switch (this.c) {
            case 0:
                return m1.j.c(((a) ((l) this.e).E.get(i10)).b);
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                int i43 = 1;
                if (i10 != 1) {
                    i43 = 2;
                    if (i10 != 2) {
                        return 3;
                    }
                }
                return i43;
            case 2:
                jn jnVar = (jn) this.e;
                if (i10 == jnVar.B0 || i10 == jnVar.F0 || i10 == jnVar.G0 || i10 == jnVar.C0 || i10 == jnVar.D0 || i10 == jnVar.E0 || i10 == jnVar.H0 || i10 == jnVar.M0.a || i10 == jnVar.N0.a) {
                    return 10;
                }
                if (i10 == jnVar.l0 || i10 == jnVar.s0 || i10 == jnVar.w0 || i10 == jnVar.o0) {
                    return 0;
                }
                if (i10 == jnVar.r0) {
                    return 1;
                }
                if (i10 == jnVar.v0 || i10 == jnVar.x0 || i10 == jnVar.q0 || i10 == jnVar.K0) {
                    return 2;
                }
                if (i10 == jnVar.u0 || i10 == jnVar.I0 || i10 == jnVar.L0) {
                    return 3;
                }
                if (i10 == jnVar.m0) {
                    return 4;
                }
                if (i10 == jnVar.n0) {
                    return 11;
                }
                if (i10 == jnVar.p0) {
                    return 7;
                }
                if (i10 == jnVar.y0 || i10 == jnVar.z0 || i10 == jnVar.J0) {
                    return 6;
                }
                if (i10 == jnVar.A0) {
                    return 8;
                }
                return i10 == 0 ? 9 : 5;
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                oe0 oe0Var = (oe0) this.e;
                return (i10 == oe0Var.D || i10 == oe0Var.E) ? 1 : 0;
            case 6:
                return i10 == 0 ? 1 : 0;
            case 7:
            default:
                return super.d(i10);
            case 8:
                return 0;
            case 9:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                i11 = dataAutoDownloadActivity.autoDownloadRow;
                if (i10 == i11) {
                    return 0;
                }
                if (i10 == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i10 == dataAutoDownloadActivity.r || i10 == dataAutoDownloadActivity.w) {
                    return 2;
                }
                i12 = dataAutoDownloadActivity.usageProgressRow;
                if (i10 == i12) {
                    return 3;
                }
                i13 = dataAutoDownloadActivity.photosRow;
                if (i10 != i13) {
                    i14 = dataAutoDownloadActivity.videosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.filesRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 != i16) {
                                return 5;
                            }
                        }
                    }
                }
                return 4;
            case 10:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (i10 == dataSettingsActivity.r || i10 == dataSettingsActivity.x || i10 == dataSettingsActivity.N || i10 == dataSettingsActivity.P || i10 == dataSettingsActivity.L || i10 == dataSettingsActivity.Q || i10 == dataSettingsActivity.S) {
                    return 0;
                }
                if (i10 == dataSettingsActivity.d || i10 == dataSettingsActivity.y || i10 == dataSettingsActivity.M || i10 == 0 || i10 == dataSettingsActivity.O || i10 == dataSettingsActivity.I || i10 == dataSettingsActivity.R) {
                    return 2;
                }
                if (i10 == dataSettingsActivity.E || i10 == dataSettingsActivity.D || i10 == dataSettingsActivity.F || i10 == dataSettingsActivity.G || i10 == dataSettingsActivity.J || i10 == dataSettingsActivity.K) {
                    return 3;
                }
                if (i10 == dataSettingsActivity.H) {
                    return 4;
                }
                if (i10 != dataSettingsActivity.e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f) {
                    i17 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i10 != i17) {
                        i18 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i10 != i18) {
                            i19 = dataSettingsActivity.saveToGalleryChannelsRow;
                            if (i10 != i19) {
                                return (i10 == dataSettingsActivity.s || i10 == dataSettingsActivity.w || i10 == dataSettingsActivity.n) ? 6 : 1;
                            }
                        }
                    }
                }
                return 5;
            case 11:
                jf0 jf0Var = (jf0) this.e;
                jf0Var.getClass();
                if (i10 == 0) {
                    return 0;
                }
                if (i10 == jf0Var.c || i10 == jf0Var.d || i10 == jf0Var.e || i10 == jf0Var.f || i10 == jf0Var.h) {
                    return 1;
                }
                if (i10 == jf0Var.n) {
                    return 2;
                }
                return i10 == jf0Var.r ? 3 : 4;
            case 12:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                if (i10 == notificationsSettingsActivity.K || i10 == notificationsSettingsActivity.M || i10 == notificationsSettingsActivity.S || i10 == notificationsSettingsActivity.G || i10 == notificationsSettingsActivity.N || i10 == notificationsSettingsActivity.E || i10 == notificationsSettingsActivity.y || i10 == notificationsSettingsActivity.r) {
                    return 0;
                }
                i20 = notificationsSettingsActivity.inappSoundRow;
                if (i10 != i20) {
                    i21 = notificationsSettingsActivity.inappVibrateRow;
                    if (i10 != i21 && i10 != notificationsSettingsActivity.x) {
                        i22 = notificationsSettingsActivity.inappPreviewRow;
                        if (i10 != i22) {
                            i23 = notificationsSettingsActivity.contactJoinedRow;
                            if (i10 != i23) {
                                i24 = notificationsSettingsActivity.pinnedMessageRow;
                                if (i10 != i24 && i10 != notificationsSettingsActivity.w) {
                                    i25 = notificationsSettingsActivity.badgeNumberMutedRow;
                                    if (i10 != i25) {
                                        i26 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                        if (i10 != i26) {
                                            i27 = notificationsSettingsActivity.badgeNumberShowRow;
                                            if (i10 != i27) {
                                                i28 = notificationsSettingsActivity.inappPriorityRow;
                                                if (i10 != i28) {
                                                    i29 = notificationsSettingsActivity.inchatSoundRow;
                                                    if (i10 != i29 && i10 != notificationsSettingsActivity.P) {
                                                        i30 = notificationsSettingsActivity.accountsAllRow;
                                                        if (i10 != i30) {
                                                            i31 = notificationsSettingsActivity.resetNotificationsRow;
                                                            if (i10 == i31) {
                                                                return 2;
                                                            }
                                                            i32 = notificationsSettingsActivity.privateRow;
                                                            if (i10 != i32) {
                                                                i33 = notificationsSettingsActivity.groupRow;
                                                                if (i10 != i33) {
                                                                    i34 = notificationsSettingsActivity.channelsRow;
                                                                    if (i10 != i34) {
                                                                        i35 = notificationsSettingsActivity.storiesRow;
                                                                        if (i10 != i35) {
                                                                            i36 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i10 != i36) {
                                                                                if (i10 == notificationsSettingsActivity.J || i10 == notificationsSettingsActivity.D || i10 == notificationsSettingsActivity.L || i10 == notificationsSettingsActivity.R || i10 == notificationsSettingsActivity.F || i10 == notificationsSettingsActivity.O || i10 == notificationsSettingsActivity.T) {
                                                                                    return 4;
                                                                                }
                                                                                return i10 == notificationsSettingsActivity.s ? 6 : 5;
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
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                i37 = passcodeActivity.fingerprintRow;
                if (i10 != i37 && i10 != passcodeActivity.N && i10 != passcodeActivity.K && i10 != passcodeActivity.J) {
                    i38 = passcodeActivity.changePasscodeRow;
                    if (i10 != i38) {
                        i39 = passcodeActivity.autoLockRow;
                        if (i10 != i39) {
                            i40 = passcodeActivity.disablePasscodeRow;
                            if (i10 != i40) {
                                if (i10 == passcodeActivity.H || i10 == passcodeActivity.O || i10 == passcodeActivity.G || i10 == passcodeActivity.L) {
                                    return 2;
                                }
                                if (i10 == passcodeActivity.M || i10 == passcodeActivity.I) {
                                    return 3;
                                }
                                if (i10 == 0) {
                                    return 4;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 14:
                return 0;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                if (lo0Var.Y) {
                    return 2;
                }
                if (lo0Var.J == null) {
                    if (lo0Var.f.isEmpty()) {
                        return i10 == lo0Var.n.size() ? 4 : 3;
                    }
                    if (i10 >= lo0Var.f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 16:
                return 0;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i10 == proxyListActivity.f || i10 == proxyListActivity.s) {
                    return 0;
                }
                i41 = proxyListActivity.proxyAddRow;
                if (i10 == i41 || i10 == proxyListActivity.D) {
                    return 1;
                }
                i42 = proxyListActivity.useProxyRow;
                if (i10 == i42 || i10 == proxyListActivity.w) {
                    return 3;
                }
                if (i10 == proxyListActivity.h) {
                    return 2;
                }
                if (i10 == proxyListActivity.x) {
                    return 6;
                }
                return (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) ? 4 : 5;
            case 18:
                if (i10 == 0 || i10 == 7) {
                    return 0;
                }
                if (i10 == 1 || i10 == 8) {
                    return 1;
                }
                return (i10 == 6 || i10 == 9) ? 3 : 2;
            case 19:
                return i10 == ((ArrayList) this.e).size() ? 1 : 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x026d, code lost:
    
        if (org.telegram.ui.Wallet.k0.x(r3).J() != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0675  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        String G;
        TextView textView;
        Drawable drawable;
        u71 u71Var;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence L0;
        int i16;
        int i17;
        a6 o10;
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
        int i32 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        int i33 = 0;
        boolean z11 = true;
        switch (i32) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((l) obj2).E.get(i10);
                int i34 = aVar.b;
                h6 h6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = m1.j.c(i34);
                if (c10 == 0) {
                    r1 r1Var = (r1) view;
                    r1Var.setTextColor(t6.x0(null, t6.j5, false));
                    r1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    p4 p4Var = (p4) view;
                    p4Var.setTextColor(t6.x0(null, t6.L6, false));
                    p4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    k kVar = (k) view;
                    kVar.f = charSequence.toString();
                    kVar.d = ((Float) h6Var.get(null)).floatValue();
                    kVar.b = aVar.d;
                    kVar.c = aVar.e;
                    kVar.e = h6Var;
                    kVar.invalidate();
                    break;
                }
                break;
            case 1:
                i11 = ((k2) ((l01) obj2)).currentAccount;
                boolean s02 = MediaController.s0(i11);
                int i35 = c1Var.f;
                View view2 = c1Var.a;
                if (i35 == 0) {
                    ((p4) view2).setText(cd.L0(2131753924, null));
                    break;
                } else if (i35 == 1) {
                    ((t8) view2).f(cd.L0(2131753918, null), s02, false);
                    break;
                } else if (i35 == 2) {
                    x9 x9Var = (x9) view2;
                    x9Var.setEnabled(s02);
                    x9Var.c(cd.L0(2131753922, null), cd.L0(((ki.i) mi.e.c.a()) == ki.i.b ? 2131753920 : 2131753921, null), false, false);
                    break;
                } else {
                    ((b9) view2).setText(cd.L0(2131753923, null));
                    break;
                }
            case 2:
                Context context = (Context) obj;
                jn jnVar = (jn) obj2;
                boolean z12 = jnVar.e0;
                c5.e eVar = jnVar.M0;
                c5.e eVar2 = jnVar.N0;
                p6 p6Var = jnVar.a;
                boolean z13 = jnVar.n;
                int i36 = c1Var.f;
                View view3 = c1Var.a;
                if (i36 == 0) {
                    p4 p4Var2 = (p4) view3;
                    if (i10 == jnVar.l0) {
                        p4Var2.getTextView().setGravity(19);
                        p4Var2.setText(cd.L0(z13 ? 2131744079 : 2131747180, null));
                        break;
                    } else if (i10 == jnVar.o0) {
                        p4Var2.getTextView().setGravity(19);
                        p4Var2.setText(cd.L0(2131754473, null));
                        break;
                    } else {
                        p4Var2.getTextView().setGravity((cd.X ? 5 : 3) | 16);
                        if (i10 == jnVar.s0) {
                            if (z12) {
                                p4Var2.setText(cd.L0(2131746462, null));
                                break;
                            } else {
                                p4Var2.setText(cd.L0(z13 ? 2131744097 : 2131754246, null));
                                break;
                            }
                        } else if (i10 == jnVar.w0) {
                            p4Var2.setText(cd.L0(2131745512, null));
                            break;
                        }
                    }
                } else if (i36 == 6) {
                    t8 t8Var = (t8) view3;
                    if (i10 == jnVar.y0) {
                        t8Var.f(cd.L0(2131744118, null), jnVar.f0, jnVar.z0 != -1);
                        t8Var.e(null, true);
                        break;
                    } else if (i10 == jnVar.z0) {
                        t8Var.f(cd.L0(2131744117, null), jnVar.g0, false);
                        t8Var.e(null, true);
                        break;
                    } else if (i10 == jnVar.J0) {
                        t8Var.f(cd.L0(2131747154, null), jnVar.W, false);
                        t8Var.e(null, true);
                        break;
                    }
                } else if (i36 == 2) {
                    b9 b9Var = (b9) view3;
                    b9Var.setFixedSize(0);
                    new eq(new ColorDrawable(t6.w0(t6.a7, p6Var)), t6.Y0(context, R.drawable.greydivider_bottom, t6.b7)).x = true;
                    if (i10 == jnVar.q0) {
                        b9Var.setText(cd.L0(2131754472, null));
                        break;
                    } else if (i10 == jnVar.x0) {
                        b9Var.setFixedSize(12);
                        b9Var.setText(null);
                        break;
                    } else {
                        int i37 = jnVar.J - jnVar.M;
                        if (i37 <= 0) {
                            b9Var.setText(cd.L0(z13 ? 2131744133 : 2131754469, null));
                            break;
                        } else if (z13) {
                            b9Var.setText(cd.H(',', "TodoNewTaskInfo", i37));
                            break;
                        } else if (i10 == jnVar.K0) {
                            b9Var.setText(cd.L0(2131747153, null));
                            break;
                        } else {
                            b9Var.setText(cd.a0(null, null, 2131754470, cd.G(i37, "Option", new Object[0])));
                            break;
                        }
                    }
                } else if (i36 == 3) {
                    p8 p8Var = (p8) view3;
                    if (i10 == jnVar.L0) {
                        String L02 = cd.L0(2131747160, null);
                        ArrayList arrayList = jnVar.P0;
                        if (arrayList.isEmpty()) {
                            G = cd.L0(2131745828, null);
                            z10 = false;
                        } else if (arrayList.size() == 1) {
                            z10 = false;
                            G = cd.i0(2131750530, (String) arrayList.get(0));
                        } else {
                            z10 = false;
                            G = cd.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                        }
                        p8Var.q(L02, G, z10, true);
                        break;
                    } else if (i10 == jnVar.I0) {
                        jnVar.X(p8Var, false);
                        break;
                    } else {
                        p8Var.g(-1, t6.Wl);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable3 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = t6.w0(t6.N6, p6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable3.setColorFilter(new PorterDuffColorFilter(t6.w0(t6.k7, p6Var), mode));
                        jnVar.n1 = drawable2;
                        jnVar.o1 = drawable3;
                        p8Var.p(cd.L0(z13 ? 2131744093 : 2131754471, null), new eq(drawable2, drawable3), false);
                        p8Var.x = 20;
                        p8Var.s = 58;
                        break;
                    }
                } else if (i36 == 9) {
                    view3.requestLayout();
                    break;
                } else if (i36 == 10) {
                    c6 c6Var = (c6) view3;
                    c6Var.setDivider(false);
                    if (i10 == jnVar.B0) {
                        c6Var.a(cd.L0(2131747139, null), cd.L0(2131747138, null), u30.c, R.drawable.filled_poll_view_24, !jnVar.a0);
                    } else if (i10 == jnVar.F0) {
                        c6Var.a(cd.L0(2131747164, null), cd.L0(2131747163, null), u30.f, R.drawable.filled_poll_multiple_24, jnVar.b0);
                    } else if (i10 == jnVar.D0) {
                        c6Var.a(cd.L0(2131747162, null), cd.L0(2131747161, null), u30.w, R.drawable.filled_poll_revote_24, jnVar.R);
                    } else if (i10 == jnVar.C0) {
                        c6Var.a(cd.L0(2131747166, null), cd.L0(2131747165, null), u30.s, R.drawable.filled_poll_add_24, jnVar.T);
                    } else if (i10 == jnVar.E0) {
                        c6Var.a(cd.L0(2131747137, null), cd.L0(2131747136, null), u30.h, R.drawable.filled_poll_shuffle_24, jnVar.S);
                    } else if (i10 == jnVar.G0) {
                        c6Var.a(cd.L0(2131747141, null), cd.L0(2131747140, null), u30.n, R.drawable.filled_poll_correct_24, jnVar.c0);
                    } else if (i10 == eVar2.a) {
                        c6Var.a(cd.L0(2131747152, null), cd.L0(2131747151, null), u30.e, R.drawable.filled_location, eVar2.b);
                    } else if (i10 == eVar.a) {
                        c6Var.a(cd.L0(2131747144, null), cd.L0(2131747143, null), u30.d, R.drawable.msg_folders_groups, eVar.b);
                    } else if (i10 == jnVar.H0) {
                        c6Var.a(cd.L0(2131747150, null), cd.L0(2131747149, null), u30.r, R.drawable.filled_poll_deadline_24, (jnVar.U == 0 && jnVar.V == 0) ? false : true);
                        c6Var.setDivider((jnVar.U == 0 && jnVar.V == 0) ? false : true);
                    }
                    if (i10 == jnVar.G0) {
                        c6Var.getCheckBox().a.a(z12, false);
                        break;
                    } else if (i10 == jnVar.C0) {
                        Switch checkBox = c6Var.getCheckBox();
                        if (!jnVar.c0 && !jnVar.a0) {
                            z11 = false;
                        }
                        checkBox.a.a(z11, false);
                        break;
                    } else {
                        c6Var.getCheckBox().a.a(false, false);
                        break;
                    }
                }
                break;
            case 3:
                rz rzVar = (rz) c1Var.a;
                int id2 = rzVar.b != null ? rzVar.getId() : -1;
                pz pzVar = (pz) ((org.telegram.ui.Components.tz) obj2).h.get(i10);
                rzVar.b = pzVar;
                rzVar.e = i10;
                rzVar.setContentDescription(pzVar.b);
                rzVar.requestLayout();
                boolean z14 = rzVar.n;
                pz pzVar2 = rzVar.b;
                if (z14 != (pzVar2 != null && pzVar2.g)) {
                    o5.release(rzVar, rzVar.r);
                    o5.release(rzVar, rzVar.O);
                    o5.release(rzVar, rzVar.Q);
                    o5.release(rzVar, rzVar.S);
                    if (rzVar.l0) {
                        rzVar.r = o5.update(rzVar.b.g ? 26 : 0, rzVar, rzVar.r, rzVar.s);
                        rzVar.O = o5.update(rzVar.b.g ? 26 : 0, rzVar, rzVar.O, rzVar.P);
                        rzVar.Q = o5.update(rzVar.b.g ? 26 : 0, rzVar, rzVar.Q, rzVar.R);
                        rzVar.S = o5.update(rzVar.b.g ? 26 : 0, rzVar, rzVar.S, rzVar.T);
                    }
                    rzVar.n = rzVar.b.g;
                }
                if (id2 != rzVar.getId()) {
                    rzVar.k0 = rzVar.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 4:
                Context context2 = (Context) obj;
                s2 s2Var = (s2) c1Var.a;
                org.telegram.ui.Components.uz uzVar = (org.telegram.ui.Components.uz) obj2;
                ArrayList arrayList2 = uzVar.s1;
                ArrayList arrayList3 = uzVar.r1;
                if (i10 < arrayList3.size()) {
                    a7.t(s2Var.getImageView(), t6.J5, null, PorterDuff.Mode.MULTIPLY);
                    ap apVar = (ap) arrayList3.get(i10);
                    a7.V(s2Var.getTextView(), t6.j5, null);
                    int i38 = apVar.g;
                    int i39 = vp.E8;
                    int i40 = i38 & i39;
                    s2Var.a(jj.A5(k6.m(apVar.b, s2Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), apVar.c, s2Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new k00(uzVar.getContext(), i40 == 3 ? R.drawable.msg_openprofile : ((i38 & 64) == 0 || i40 != i39) ? i40 == 8 ? R.drawable.msg_channel : i40 == 4 ? R.drawable.msg_groups : i40 == 1 ? R.drawable.msg_contacts : i40 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, apVar.m), false);
                    s2Var.getTextView().setEmojiColor(t6.w0(t6.Ci, uzVar.I0));
                    for (int i41 = 0; i41 < arrayList2.size(); i41++) {
                        if (!apVar.b(org.telegram.messenger.c.a(uzVar.a), ((Long) arrayList2.get(i41)).longValue())) {
                            z11 = false;
                        }
                    }
                    s2Var.setChecked(z11);
                    break;
                } else {
                    s2Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable4 = context2.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable5 = context2.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = s2Var.getImageView();
                    int i42 = t6.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    a7.y(imageView, drawable4, i42, null, mode2);
                    a7.y(s2Var.getImageView(), drawable5, t6.k7, null, mode2);
                    eq eqVar = new eq(drawable4, drawable5);
                    a7.V(s2Var.getTextView(), t6.q6, null);
                    s2Var.a(cd.L0(2131751717, null), 0, eqVar, false);
                    break;
                }
            case 5:
                oe0 oe0Var = (oe0) obj2;
                int i43 = c1Var.f;
                View view4 = c1Var.a;
                if (i43 == 0) {
                    x5 x5Var = (x5) view4;
                    x5Var.setTag(Integer.valueOf(i10));
                    if (i10 == oe0Var.b) {
                        x5Var.a(cd.L0(2131751127, null), 0, oe0Var.G);
                        break;
                    } else if (i10 == oe0Var.r) {
                        x5Var.a(cd.L0(2131749311, null), -100, oe0Var.P);
                        break;
                    } else if (i10 == oe0Var.d) {
                        x5Var.a(cd.L0(2131751769, null), -100, oe0Var.I);
                        break;
                    } else if (i10 == oe0Var.c) {
                        x5Var.a(cd.L0(2131750858, null), -100, oe0Var.H);
                        break;
                    } else if (i10 == oe0Var.f) {
                        x5Var.a(cd.L0(2131742975, null), -100, oe0Var.J);
                        break;
                    } else if (i10 == oe0Var.e) {
                        x5Var.a(cd.L0(2131745964, null), -100, oe0Var.K);
                        break;
                    } else if (i10 == oe0Var.w) {
                        x5Var.a(cd.L0(2131743550, null), 0, oe0Var.R);
                        break;
                    } else if (i10 == oe0Var.s) {
                        x5Var.a(cd.L0(2131745483, null), -100, oe0Var.Q);
                        break;
                    } else if (i10 == oe0Var.x) {
                        x5Var.a(cd.L0(2131749533, null), 0, oe0Var.S);
                        break;
                    } else if (i10 == oe0Var.y) {
                        x5Var.a(cd.L0(2131745385, null), 0, oe0Var.U);
                        break;
                    } else if (i10 == oe0Var.h) {
                        x5Var.a(cd.L0(2131750847, null), 0, oe0Var.L);
                        break;
                    } else if (i10 == oe0Var.n) {
                        x5Var.a(cd.L0(2131745311, null), 0, oe0Var.M);
                        break;
                    }
                } else if (i43 == 1) {
                    w5 w5Var = (w5) view4;
                    w5Var.setTag(Integer.valueOf(i10));
                    if (i10 == oe0Var.D) {
                        w5Var.a(oe0Var.N, cd.L0(2131744139, null));
                        break;
                    } else if (i10 == oe0Var.E) {
                        w5Var.a(oe0Var.O, cd.L0(2131744140, null));
                        break;
                    }
                }
                break;
            case 6:
                du0 du0Var = (du0) obj2;
                int i44 = c1Var.f;
                if (i44 != 0) {
                    if (i44 == 1 && (textView = du0Var.l1) != null) {
                        textView.setText(cd.a0("SharingLiveLocationTitle", null, 2131745410, cd.G(nd.g(), "Chats", new Object[0])));
                        break;
                    }
                } else {
                    ((v7) c1Var.a).setDialog(du0.J0(i10 - 1));
                    break;
                }
                break;
            case 7:
                rx0 rx0Var = (rx0) c1Var.a;
                sx0 sx0Var = (sx0) obj;
                ArrayList arrayList4 = sx0Var.x;
                String str = arrayList4 == null ? null : ((qi) arrayList4.get(i10)).a;
                int direction = sx0Var.getDirection();
                rx0Var.a = str;
                if (str == null || !str.startsWith("animated_")) {
                    rx0Var.setImageDrawable(k6.f(str));
                } else {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable6 = rx0Var.b;
                        if (drawable6 instanceof f5) {
                            if (((f5) drawable6).h() != parseLong) {
                            }
                        }
                        drawable = null;
                        try {
                            rx0Var.setImageDrawable(f5.m(d20.s0, parseLong, null, rx0Var.f.d()));
                        } catch (Exception unused) {
                            rx0Var.setImageDrawable(drawable);
                            if (rx0Var.d == direction) {
                                return;
                            }
                        }
                    } catch (Exception unused2) {
                        drawable = null;
                    }
                }
                if (rx0Var.d == direction) {
                    rx0Var.d = direction;
                    rx0Var.requestLayout();
                    break;
                }
                break;
            case 8:
                t71 t71Var = (t71) c1Var.a;
                v71 v71Var = (v71) obj2;
                s71 s71Var = (s71) v71Var.h.get(i10);
                t71Var.a = s71Var;
                t71Var.setContentDescription(s71Var.b);
                t71Var.setAlpha(1.0f);
                t71Var.requestLayout();
                t71Var.setReordering(v71Var.m0 && (u71Var = v71Var.D) != null && ((u) u71Var).G(i10));
                break;
            case 9:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i45 = dataAutoDownloadActivity.f;
                a6 a6Var = dataAutoDownloadActivity.G;
                int i46 = c1Var.f;
                View view5 = c1Var.a;
                if (i46 == 0) {
                    t8 t8Var2 = (t8) view5;
                    i12 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i10 == i12) {
                        t8Var2.setDrawCheckRipple(true);
                        t8Var2.f(cd.L0(2131753830, null), a6Var.g, false);
                        t8Var2.setTag(Integer.valueOf(a6Var.g ? t6.f6 : t6.e6));
                        a7.i(a6Var.g ? t6.f6 : t6.e6, t8Var2, null);
                        break;
                    }
                } else if (i46 == 2) {
                    p4 p4Var3 = (p4) view5;
                    if (i10 == dataAutoDownloadActivity.r) {
                        p4Var3.setText(cd.L0(2131753839, null));
                        break;
                    } else if (i10 == dataAutoDownloadActivity.w) {
                        p4Var3.setText(cd.L0(2131753808, null));
                        break;
                    }
                } else if (i46 == 3) {
                    dataAutoDownloadActivity.q0((yu0) view5);
                    break;
                } else if (i46 == 4) {
                    l5 l5Var = (l5) view5;
                    l5Var.setDrawLine(true);
                    i13 = dataAutoDownloadActivity.photosRow;
                    if (i10 == i13) {
                        L0 = cd.L0(2131753817, null);
                        i16 = 1;
                    } else {
                        i14 = dataAutoDownloadActivity.videosRow;
                        if (i10 == i14) {
                            L0 = cd.L0(2131753806, null);
                            i16 = 4;
                        } else {
                            i15 = dataAutoDownloadActivity.storiesRow;
                            if (i10 == i15) {
                                L0 = cd.L0(2131753809, null);
                                l5Var.setDrawLine(false);
                                i16 = -1;
                            } else {
                                L0 = cd.L0(2131753838, null);
                                i16 = 8;
                            }
                        }
                    }
                    if (i45 == 0) {
                        i24 = ((k2) dataAutoDownloadActivity).currentAccount;
                        o10 = b6.q(i24).n();
                    } else if (i45 == 1) {
                        i18 = ((k2) dataAutoDownloadActivity).currentAccount;
                        o10 = b6.q(i18).p();
                    } else {
                        i17 = ((k2) dataAutoDownloadActivity).currentAccount;
                        o10 = b6.q(i17).o();
                    }
                    long j10 = o10.b[b6.x(i16)];
                    StringBuilder sb2 = new StringBuilder();
                    i19 = dataAutoDownloadActivity.storiesRow;
                    if (i10 != i19) {
                        i20 = 0;
                        int i47 = 0;
                        while (true) {
                            int[] iArr = o10.a;
                            if (i47 < iArr.length) {
                                if ((iArr[i47] & i16) != 0) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    if (i47 == 0) {
                                        sb2.append(cd.L0(2131753841, null));
                                    } else if (i47 == 1) {
                                        sb2.append(cd.L0(2131753814, null));
                                    } else if (i47 == 2) {
                                        sb2.append(cd.L0(2131753835, null));
                                    } else if (i47 == 3) {
                                        sb2.append(cd.L0(2131753842, null));
                                    }
                                    i20++;
                                }
                                i47++;
                            } else if (i20 == 4) {
                                sb2.setLength(0);
                                i22 = dataAutoDownloadActivity.photosRow;
                                if (i10 == i22) {
                                    sb2.append(cd.L0(2131753826, null));
                                } else {
                                    sb2.append(cd.a0("AutoDownloadUpToOnAllChats", null, 2131753807, i0.i0(j10, false, false)));
                                }
                            } else if (i20 == 0) {
                                sb2.append(cd.L0(2131753828, null));
                            } else {
                                i21 = dataAutoDownloadActivity.photosRow;
                                sb2 = i10 == i21 ? new StringBuilder(cd.a0("AutoDownloadOnFor", null, 2131753825, sb2.toString())) : new StringBuilder(cd.a0("AutoDownloadOnUpToFor", null, 2131753820, i0.i0(j10, false, false), sb2.toString()));
                            }
                        }
                    } else if (o10.e) {
                        sb2 = new StringBuilder(cd.a0("AutoDownloadOn", null, 2131753827, sb2.toString()));
                        i20 = 1;
                    } else {
                        sb2 = new StringBuilder(cd.a0("AutoDownloadOff", null, 2131753828, sb2.toString()));
                        i20 = 0;
                    }
                    if (dataAutoDownloadActivity.h) {
                        l5Var.setChecked(i20 != 0);
                    }
                    boolean z15 = i20 != 0;
                    i23 = dataAutoDownloadActivity.storiesRow;
                    l5Var.b(L0, sb2, 0, z15, 0, true, i10 != i23, false);
                    break;
                } else if (i46 == 5) {
                    b9 b9Var2 = (b9) view5;
                    if (i10 == dataAutoDownloadActivity.x) {
                        b9Var2.setText(cd.L0(2131753843, null));
                        b9Var2.setFixedSize(0);
                        b9Var2.setImportantForAccessibility(1);
                        break;
                    } else if (i10 == dataAutoDownloadActivity.n) {
                        if (dataAutoDownloadActivity.r == -1) {
                            if (i45 == 0) {
                                b9Var2.setText(cd.L0(2131753823, null));
                            } else if (i45 == 1) {
                                b9Var2.setText(cd.L0(2131753818, null));
                            } else if (i45 == 2) {
                                b9Var2.setText(cd.L0(2131753821, null));
                            }
                            b9Var2.setImportantForAccessibility(1);
                            break;
                        } else {
                            b9Var2.setText(null);
                            b9Var2.setFixedSize(12);
                            b9Var2.setImportantForAccessibility(4);
                            break;
                        }
                    }
                }
                break;
            case 10:
                G(c1Var, i10);
                break;
            case 11:
                jf0 jf0Var = (jf0) obj2;
                int i48 = c1Var.f;
                View view6 = c1Var.a;
                if (i48 == 0) {
                    p4 p4Var4 = (p4) view6;
                    if (i10 == 0) {
                        p4Var4.setText(cd.L0(2131754270, null));
                        break;
                    }
                } else if (i48 == 1) {
                    a9 a9Var = (a9) view6;
                    if (i10 == jf0Var.c) {
                        a9Var.b(R.drawable.msg_contact_add, cd.L0(2131754468, null), cd.L0(2131754467, null), true);
                        break;
                    } else if (i10 == jf0Var.d) {
                        a9Var.b(R.drawable.msg_permissions, cd.L0(2131745538, null), cd.L0(2131745537, null), true);
                        break;
                    } else if (i10 == jf0Var.e) {
                        a9Var.b(R.drawable.msg_clearcache, cd.L0(2131752098, null), cd.L0(2131752094, null), true);
                        break;
                    } else if (i10 == jf0Var.f) {
                        a9Var.b(R.drawable.msg_newphone, cd.L0(2131752537, null), cd.L0(2131752536, null), true);
                        break;
                    } else if (i10 == jf0Var.h) {
                        a9Var.b(R.drawable.msg_help, cd.L0(2131751783, null), cd.L0(2131751782, null), false);
                        break;
                    }
                } else if (i48 == 3) {
                    x9 x9Var2 = (x9) view6;
                    if (i10 == jf0Var.r) {
                        a7.V(x9Var2.getTextView(), t6.p7, null);
                        x9Var2.b(cd.L0(2131748752, null), false);
                        break;
                    }
                } else if (i48 == 4) {
                    b9 b9Var3 = (b9) view6;
                    if (i10 == jf0Var.s) {
                        b9Var3.setText(cd.L0(2131748753, null));
                        break;
                    }
                }
                break;
            case 12:
                H(c1Var, i10);
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj2;
                int i49 = c1Var.f;
                View view7 = c1Var.a;
                if (i49 == 0) {
                    t8 t8Var3 = (t8) view7;
                    i25 = passcodeActivity.fingerprintRow;
                    if (i10 == i25) {
                        t8Var3.f(cd.L0(2131743898, null), tz.D, false);
                        break;
                    } else if (i10 == passcodeActivity.N) {
                        t8Var3.f(cd.L0(2131745858, null), tz.A, false);
                        break;
                    } else if (i10 == passcodeActivity.K) {
                        String L03 = cd.L0(2131743192, null);
                        i27 = ((k2) passcodeActivity).currentAccount;
                        if (k0.x(i27).e()) {
                            i28 = ((k2) passcodeActivity).currentAccount;
                            break;
                        }
                        z11 = false;
                        t8Var3.f(L03, z11, false);
                        break;
                    } else if (i10 == passcodeActivity.J) {
                        String L04 = cd.L0(2131743191, null);
                        i26 = ((k2) passcodeActivity).currentAccount;
                        t8Var3.f(L04, k0.x(i26).K(), false);
                        break;
                    }
                } else if (i49 == 1) {
                    x9 x9Var3 = (x9) view7;
                    i29 = passcodeActivity.changePasscodeRow;
                    if (i10 == i29) {
                        x9Var3.b(cd.L0(2131752544, null), true);
                        if (tz.s.isEmpty()) {
                            int i50 = t6.E6;
                            x9Var3.setTag(Integer.valueOf(i50));
                            a7.V(x9Var3.getTextView(), i50, null);
                            break;
                        } else {
                            int i51 = t6.G6;
                            x9Var3.setTag(Integer.valueOf(i51));
                            a7.V(x9Var3.getTextView(), i51, null);
                            break;
                        }
                    } else {
                        i30 = passcodeActivity.autoLockRow;
                        if (i10 == i30) {
                            int i52 = tz.y;
                            x9Var3.c(cd.L0(2131753800, null), i52 == 0 ? cd.a0("AutoLockDisabled", null, 2131753799, new Object[0]) : i52 < 3600 ? cd.a0("AutoLockInTime", null, 2131753798, cd.G(i52 / 60, "Minutes", new Object[0])) : i52 < 86400 ? cd.a0("AutoLockInTime", null, 2131753798, cd.G((int) Math.ceil((i52 / 60.0f) / 60.0f), "Hours", new Object[0])) : cd.a0("AutoLockInTime", null, 2131753798, cd.G((int) Math.ceil(((i52 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                            int i53 = t6.G6;
                            x9Var3.setTag(Integer.valueOf(i53));
                            a7.V(x9Var3.getTextView(), i53, null);
                            break;
                        } else {
                            i31 = passcodeActivity.disablePasscodeRow;
                            if (i10 == i31) {
                                x9Var3.b(cd.L0(2131751434, null), false);
                                int i54 = t6.q7;
                                x9Var3.setTag(Integer.valueOf(i54));
                                a7.V(x9Var3.getTextView(), i54, null);
                                break;
                            }
                        }
                    }
                } else if (i49 == 2) {
                    b9 b9Var4 = (b9) view7;
                    if (i10 == passcodeActivity.G) {
                        b9Var4.setText(cd.L0(2131747671, null));
                        b9Var4.setBackground(null);
                        b9Var4.getTextView().setGravity(1);
                        break;
                    } else if (i10 == passcodeActivity.H) {
                        b9Var4.setText(cd.L0(2131753797, null));
                        b9Var4.getTextView().setGravity(cd.X ? 5 : 3);
                        break;
                    } else if (i10 == passcodeActivity.L) {
                        b9Var4.setText(cd.L0(2131743104, null));
                        b9Var4.getTextView().setGravity(cd.X ? 5 : 3);
                        break;
                    } else if (i10 == passcodeActivity.O) {
                        b9Var4.setText(cd.L0(2131745859, null));
                        b9Var4.getTextView().setGravity(cd.X ? 5 : 3);
                        break;
                    }
                } else if (i49 == 3) {
                    p4 p4Var5 = (p4) view7;
                    p4Var5.setHeight(46);
                    if (i10 == passcodeActivity.M) {
                        p4Var5.setText(cd.L0(2131745860, null));
                        break;
                    } else if (i10 == passcodeActivity.I) {
                        p4Var5.setText(cd.L0(2131743105, null));
                        break;
                    }
                } else if (i49 == 4) {
                    rj0 rj0Var = (rj0) view7;
                    rj0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    rj0Var.a.d();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) c1Var.a;
                yn0 yn0Var = (yn0) obj2;
                a6Var2.setAlbumsCount(yn0Var.f);
                while (true) {
                    int i55 = yn0Var.f;
                    if (i33 >= i55) {
                        a6Var2.requestLayout();
                        break;
                    } else {
                        int i56 = (i55 * i10) + i33;
                        if (i56 < yn0Var.d.size()) {
                            a6Var2.a(i33, (we) yn0Var.d.get(i56));
                        } else {
                            a6Var2.a(i33, null);
                        }
                        i33++;
                    }
                }
            case 15:
                I(c1Var, i10);
                break;
            case 16:
                J(c1Var, i10);
                break;
            case 17:
                K(c1Var, i10);
                break;
            case 18:
                L(c1Var, i10);
                break;
            default:
                ArrayList arrayList5 = (ArrayList) obj2;
                if (c1Var.f == 0) {
                    v2 v2Var = (v2) c1Var.a;
                    v2Var.s2 = i10 != arrayList5.size() - 1;
                    v2Var.setDialog((q2) arrayList5.get(i10));
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public void v(c1 c1Var, int i10, List list) {
        int i11;
        boolean contains;
        switch (this.c) {
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.E;
                int i12 = c1Var.f;
                View view = c1Var.a;
                if (i12 == 5 && !list.isEmpty()) {
                    cz0 cz0Var = (cz0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.n))) != cz0Var.h) {
                        cz0Var.h = contains;
                        cz0Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        cz0Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (c1Var.f != 3 || !list.contains(0)) {
                    t(c1Var, i10);
                    break;
                } else {
                    t8 t8Var = (t8) view;
                    i11 = proxyListActivity.useProxyRow;
                    if (i10 != i11) {
                        if (i10 == proxyListActivity.w) {
                            t8Var.setChecked(tz.a1);
                            break;
                        }
                    } else {
                        t8Var.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.v(c1Var, i10, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [org.telegram.ui.Components.cn] */
    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int i11;
        int i12;
        View view;
        View view2;
        w5 w5Var;
        FrameLayout frameLayout3;
        View view3;
        View view4;
        View p4Var;
        p6 p6Var;
        p6 p6Var2;
        p6 p6Var3;
        p6 p6Var4;
        p6 p6Var5;
        View t8Var;
        ViewGroup viewGroup2;
        View c7Var;
        FrameLayout frameLayout4;
        int i13 = this.c;
        int i14 = 4;
        Object obj = this.e;
        int i15 = 3;
        final int i16 = 2;
        final int i17 = 1;
        Object obj2 = this.d;
        switch (i13) {
            case 0:
                Context context = (Context) obj2;
                int c10 = m1.j.c(m1.j.d(3)[i10]);
                if (c10 == 1) {
                    frameLayout = new p4(context);
                } else if (c10 != 2) {
                    frameLayout = new r1(context, null);
                } else {
                    k kVar = new k(context);
                    kVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    kVar.h = textPaint;
                    textPaint.setTextSize(i0.L(16.0f));
                    nn0 nn0Var = new nn0(context);
                    kVar.a = nn0Var;
                    nn0Var.setReportChanges(true);
                    nn0Var.setDelegate(new a6.i(kVar, 22));
                    nn0Var.setImportantForAccessibility(2);
                    kVar.addView(nn0Var, w7.b6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = kVar;
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new ck0(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                if (i10 == 0) {
                    frameLayout2 = new p4(context2);
                } else if (i10 == 1) {
                    frameLayout2 = new t8(context2);
                } else if (i10 == 2) {
                    x9 x9Var = new x9(context2);
                    x9Var.setCanDisable(true);
                    frameLayout2 = x9Var;
                } else {
                    frameLayout2 = new b9(context2);
                }
                frameLayout2.setLayoutParams(new o0(-1, -2));
                return new ck0(frameLayout2);
            case 2:
                Context context3 = (Context) obj2;
                jn jnVar = (jn) obj;
                boolean z10 = jnVar.n;
                p6 p6Var6 = jnVar.a;
                switch (i10) {
                    case 0:
                        i11 = -2;
                        view = new p4((Context) obj2, t6.L6, 21, 15, false, jnVar.a);
                        break;
                    case 1:
                        i11 = -2;
                        View c7Var2 = new c7(context3, (f1) null);
                        new eq(new ColorDrawable(t6.w0(t6.a7, p6Var6)), t6.Y0(context3, R.drawable.greydivider, t6.b7)).x = true;
                        view = c7Var2;
                        break;
                    case 2:
                        i11 = -2;
                        view = new b9(context3, p6Var6);
                        break;
                    case 3:
                        i11 = -2;
                        view = new p8(context3, p6Var6);
                        break;
                    case 4:
                    case 11:
                        i11 = -2;
                        en enVar = new en(this, (Context) obj2, jnVar.I ? 1 : 0, jnVar.a, i10);
                        if (i10 == 11 && !z10) {
                            enVar.setTextRight(98);
                            ih.e a2 = enVar.a();
                            final boolean z11 = false ? 1 : 0;
                            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                                public final /* synthetic */ fg.j b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    switch (z11) {
                                        case 0:
                                            jn.R((jn) this.b.e, -2);
                                            break;
                                        case 1:
                                            jn.R((jn) this.b.e, -3);
                                            break;
                                        default:
                                            ((jn) this.b.e).a0(view5, (org.telegram.ui.Cells.e6) view5.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        enVar.c();
                        enVar.setIconsColor(t6.o7);
                        enVar.b(new fn(this, enVar, i10));
                        view = enVar;
                        break;
                    case 5:
                    default:
                        Context context4 = (Context) obj2;
                        boolean z12 = jnVar.I;
                        ?? r42 = new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                            public final /* synthetic */ fg.j b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                switch (i16) {
                                    case 0:
                                        jn.R((jn) this.b.e, -2);
                                        break;
                                    case 1:
                                        jn.R((jn) this.b.e, -3);
                                        break;
                                    default:
                                        ((jn) this.b.e).a0(view5, (org.telegram.ui.Cells.e6) view5.getParent(), true);
                                        break;
                                }
                            }
                        };
                        p6 p6Var7 = jnVar.a;
                        i12 = -2;
                        hn hnVar = new hn(this, context4, z12 ? 1 : 0, r42, p6Var7);
                        if (!z10) {
                            hnVar.setTextRight(zs.W1);
                            hnVar.a().setOnClickListener(new ud(24, this, hnVar));
                        }
                        int i18 = t6.o7;
                        hnVar.setIconsColor(i18);
                        ep epVar = hnVar.r;
                        if (epVar != null) {
                            epVar.getCheckBoxBase().i(i0.L(6.0f));
                            CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
                            float f7 = hnVar.a.e;
                            if (checkBoxBase.w != f7) {
                                checkBoxBase.w = f7;
                                checkBoxBase.b();
                            }
                        }
                        hnVar.getCheckBox().b(-1, i18, t6.k7);
                        hnVar.b(new u2(this, hnVar, false ? 1 : 0, i14));
                        hnVar.setShowNextButton(true);
                        EditTextBoldCursor textView = hnVar.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new xd(i16, this, hnVar));
                        textView.setOnKeyListener(new dn(hnVar, false ? 1 : 0));
                        view2 = hnVar;
                        i11 = i12;
                        view = view2;
                        break;
                    case 6:
                        i11 = -2;
                        view = new t8(context3, p6Var6);
                        break;
                    case 7:
                        i11 = -2;
                        gn gnVar = new gn(this, context3, jnVar.I ? 1 : 0);
                        gnVar.c();
                        if (!z10) {
                            gnVar.setTextRight(98);
                            gnVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cn
                                public final /* synthetic */ fg.j b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    switch (i17) {
                                        case 0:
                                            jn.R((jn) this.b.e, -2);
                                            break;
                                        case 1:
                                            jn.R((jn) this.b.e, -3);
                                            break;
                                        default:
                                            ((jn) this.b.e).a0(view5, (org.telegram.ui.Cells.e6) view5.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        gnVar.setIconsColor(t6.o7);
                        gnVar.b(new u2(this, gnVar, false ? 1 : 0, 3));
                        view = gnVar;
                        break;
                    case 8:
                        i12 = -2;
                        View bnVar = new bn(context3, 0);
                        bnVar.setTag(-33024);
                        view2 = bnVar;
                        i11 = i12;
                        view = view2;
                        break;
                    case 9:
                        i12 = -2;
                        View t0Var = new t0(this, context3, 10);
                        t0Var.setTag(-33024);
                        view2 = t0Var;
                        i11 = i12;
                        view = view2;
                        break;
                    case 10:
                        i12 = -2;
                        c6 c6Var = new c6(context3, p6Var6);
                        c6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        view2 = c6Var;
                        i11 = i12;
                        view = view2;
                        break;
                }
                return sc.e.o(view, view, -1, i11);
            case 3:
                return new ck0(new rz((org.telegram.ui.Components.tz) obj, (Context) obj2));
            case 4:
                s2 s2Var = new s2(0, (Context) obj2, null);
                s2Var.setBackground(null);
                s2Var.setLayoutParams(new o0(-1, -2));
                return new ck0(s2Var);
            case 5:
                Context context5 = (Context) obj2;
                if (i10 == 0) {
                    p6 p6Var8 = ((oe0) obj).I0;
                    x5 x5Var = new x5(context5);
                    x5Var.e = new c2(x5Var, 18);
                    TextView textView2 = new TextView(context5);
                    x5Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    x5Var.addView(textView2, w7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context5);
                    x5Var.b = textView3;
                    a7.V(textView3, t6.ng, p6Var8);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    x5Var.addView(textView3, w7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    de0 de0Var = new de0(context5);
                    Paint paint = new Paint();
                    de0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    de0Var.b = paint2;
                    de0Var.c = i0.L(16.0f);
                    de0Var.d = 0;
                    de0Var.e = 0.0f;
                    de0Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    x5Var.c = de0Var;
                    x5Var.addView(de0Var, w7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    x5Var.setSeekBarDelegate(new px(this, 11));
                    w5Var = x5Var;
                } else {
                    w5 w5Var2 = new w5(context5);
                    w5Var2.setOnClickListener(new db0(this, i15));
                    w5Var = w5Var2;
                }
                return new ck0(w5Var);
            case 6:
                Context context6 = (Context) obj2;
                du0 du0Var = (du0) obj;
                if (i10 != 0) {
                    FrameLayout a5Var = new a5(context6, 23);
                    a5Var.setWillNotDraw(false);
                    du0Var.l1 = new TextView(context6);
                    a7.V(du0Var.l1, t6.J5, du0Var.I0);
                    du0Var.l1.setTextSize(1, 14.0f);
                    du0Var.l1.setGravity(17);
                    du0Var.l1.setPadding(0, 0, 0, i0.L(8.0f));
                    a5Var.addView(du0Var.l1, w7.b6.c(40.0f, -1));
                    frameLayout3 = a5Var;
                } else {
                    frameLayout3 = new v7(54, context6, du0Var.I0, false);
                }
                return new ck0(frameLayout3);
            case 7:
                return new ck0(new rx0((sx0) obj, ((sx0) obj2).getContext()));
            case 8:
                return new ck0(new t71((v71) obj, (Context) obj2));
            case 9:
                Context context7 = (Context) obj2;
                if (i10 == 0) {
                    t8 t8Var2 = new t8(context7);
                    t8Var2.d(t6.g6, t6.O6, t6.P6, t6.Q6, t6.R6);
                    t8Var2.setTypeface(i0.o());
                    t8Var2.setHeight(56);
                    view3 = t8Var2;
                } else if (i10 == 1) {
                    view3 = new c7(context7, (f1) null);
                } else if (i10 == 2) {
                    view3 = new p4(context7);
                } else if (i10 != 3) {
                    view3 = i10 != 4 ? new b9(context7) : new l5(context7);
                } else {
                    yu0 yu0Var = new yu0(context7, null);
                    yu0Var.setCallback(new tt(this, i16));
                    view3 = yu0Var;
                }
                return sc.e.o(view3, view3, -1, -2);
            case 10:
                Context context8 = (Context) obj2;
                View p8Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new p8(context8) : new l5(context8) : new b9(context8) : new t8(context8) : new p4(context8, 22) : new x9(context8) : new c7(context8, (f1) null);
                return sc.e.o(p8Var, p8Var, -1, -2);
            case 11:
                Context context9 = (Context) obj2;
                if (i10 == 0) {
                    View p4Var2 = new p4(context9);
                    a7.i(t6.d6, p4Var2, null);
                    view4 = p4Var2;
                } else if (i10 == 1) {
                    a9 a9Var = new a9(context9);
                    a9Var.setMultilineDetail(true);
                    a7.i(t6.d6, a9Var, null);
                    view4 = a9Var;
                } else if (i10 == 2) {
                    view4 = new c7(context9, (f1) null);
                } else if (i10 != 3) {
                    view4 = new b9(context9);
                } else {
                    View x9Var2 = new x9(context9);
                    a7.i(t6.d6, x9Var2, null);
                    view4 = x9Var2;
                }
                return sc.e.o(view4, view4, -1, -2);
            case 12:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context10 = (Context) obj2;
                if (i10 == 0) {
                    p6Var = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new p4(context10, p6Var);
                } else if (i10 == 1) {
                    p6Var2 = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new t8(context10, p6Var2);
                } else if (i10 == 2) {
                    p4Var = new a9(context10);
                } else if (i10 == 3) {
                    p6Var3 = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new l5(21, 64, (Context) obj2, p6Var3, true);
                } else if (i10 == 4) {
                    p4Var = new c7(context10, (f1) null);
                } else if (i10 != 5) {
                    p6Var5 = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new b9(context10, p6Var5);
                } else {
                    p6Var4 = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new x9(0, context10, p6Var4);
                }
                return new ck0(p4Var);
            case 13:
                Context context11 = (Context) obj2;
                if (i10 == 0) {
                    t8Var = new t8(context11);
                } else if (i10 == 1) {
                    t8Var = new x9(context11);
                } else if (i10 == 3) {
                    t8Var = new p4(context11);
                } else if (i10 != 4) {
                    t8Var = new b9(context11);
                } else {
                    t8Var = new rj0(context11);
                    t8Var.setTag(-33024);
                }
                return new ck0(t8Var);
            case 14:
                Context context12 = (Context) obj2;
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context12);
                a6Var.e = new Paint();
                a6Var.b = new we[4];
                a6Var.a = new y5[4];
                for (int i19 = 0; i19 < 4; i19++) {
                    a6Var.a[i19] = new y5(a6Var, context12);
                    a6Var.addView(a6Var.a[i19]);
                    a6Var.a[i19].setVisibility(4);
                    a6Var.a[i19].setTag(Integer.valueOf(i19));
                    a6Var.a[i19].setOnClickListener(new org.telegram.ui.Cells.a(a6Var, 9));
                }
                a6Var.setDelegate(new tj0(this, i17));
                return new ck0(a6Var);
            case 15:
                lo0 lo0Var = (lo0) obj;
                boolean z13 = lo0Var.r0;
                Context context13 = (Context) obj2;
                if (i10 == 0) {
                    v5 v5Var = new v5(context13, null);
                    v5Var.setDelegate(new jo0(this));
                    v5Var.getCheckFrame().setVisibility(lo0Var.T == 0 ? 0 : 8);
                    viewGroup2 = v5Var;
                } else if (i10 == 1) {
                    ViewGroup frameLayout5 = new FrameLayout(context13);
                    frameLayout5.setLayoutParams(new o0(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context13, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout5.addView(radialProgressView, w7.b6.c(-1.0f, -1));
                    viewGroup2 = frameLayout5;
                } else if (i10 == 2) {
                    viewGroup2 = new l7(1, context13, null);
                } else if (i10 != 3) {
                    g3 g3Var = new g3(context13, null);
                    g3Var.setForceDarkTheme(z13);
                    viewGroup2 = g3Var;
                } else {
                    p8 p8Var2 = new p8(23, context13, true);
                    p8Var2.setLayoutParams(new o0(-1, -2));
                    if (z13) {
                        a7.Y(p8Var2.a, lo0Var.v0, null);
                        a7.t(p8Var2.e, t6.fh, null, PorterDuff.Mode.MULTIPLY);
                    }
                    viewGroup2 = p8Var2;
                }
                return new ck0(viewGroup2);
            case 16:
                Context context14 = (Context) obj2;
                org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context14);
                new Paint();
                b6Var.setWillNotDraw(false);
                g9 g9Var = new g9(context14);
                b6Var.a = g9Var;
                g9Var.setRoundRadius(i0.L(4.0f));
                b6Var.addView(g9Var, w7.b6.c(-1.0f, -1));
                FrameLayout frameLayout6 = new FrameLayout(context14);
                b6Var.b = frameLayout6;
                b6Var.addView(frameLayout6, w7.b6.e(42, 42, 53));
                b1 b1Var = new b1(context14);
                b1Var.d = new Path();
                b1Var.c = new float[8];
                b1Var.b = new RectF();
                b1Var.e = new Paint(1);
                b6Var.e = b1Var;
                b1Var.setWillNotDraw(false);
                b1Var.setPadding(i0.L(3.0f), 0, i0.L(3.0f), 0);
                b6Var.addView(b1Var, w7.b6.e(-1, 16, 83));
                b1Var.addView(z20.e(context14, R.drawable.ic_video), w7.b6.e(-2, -2, 19));
                TextView textView4 = new TextView(context14);
                b6Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                b1Var.addView(textView4, w7.b6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                ep epVar2 = new ep(24, context14, null);
                b6Var.c = epVar2;
                epVar2.setDrawBackgroundAsArc(11);
                epVar2.b(t6.W9, t6.X9, t6.V9);
                b6Var.addView(epVar2, w7.b6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                epVar2.setVisibility(0);
                b6Var.setFocusable(true);
                frameLayout6.setOnClickListener(new f50(this, 21));
                return new ck0(b6Var);
            case 17:
                Context context15 = (Context) obj2;
                if (i10 == 0) {
                    c7Var = new c7(context15, (f1) null);
                } else if (i10 == 1) {
                    c7Var = new x9(context15);
                    a7.i(t6.d6, c7Var, null);
                } else if (i10 == 2) {
                    c7Var = new p4(context15);
                    a7.i(t6.d6, c7Var, null);
                } else if (i10 == 3) {
                    c7Var = new t8(context15);
                    a7.i(t6.d6, c7Var, null);
                } else if (i10 == 4) {
                    c7Var = new b9(context15);
                } else if (i10 != 6) {
                    c7Var = new cz0((ProxyListActivity) obj, context15);
                    a7.i(t6.d6, c7Var, null);
                } else {
                    c7Var = new yu0(context15, null);
                    a7.i(t6.d6, c7Var, null);
                }
                return sc.e.o(c7Var, c7Var, -1, -2);
            case 18:
                Context context16 = (Context) obj2;
                if (i10 == 0) {
                    frameLayout4 = new p4(context16);
                } else if (i10 == 1) {
                    frameLayout4 = new t8(context16);
                } else if (i10 == 2) {
                    x9 x9Var3 = new x9(context16);
                    x9Var3.setCanDisable(true);
                    frameLayout4 = x9Var3;
                } else {
                    frameLayout4 = new b9(context16);
                }
                frameLayout4.setLayoutParams(new o0(-1, -2));
                return new ck0(frameLayout4);
            default:
                Context context17 = (Context) obj2;
                View v2Var = i10 == 0 ? new v2(context17, false) : new v4(context17);
                v2Var.setLayoutParams(new o0(-1, -2));
                return new ck0(v2Var);
        }
    }

    @Override // s4.g0
    public void y(c1 c1Var) {
        int i10;
        int i11 = this.c;
        Object obj = this.e;
        switch (i11) {
            case 2:
                jn jnVar = (jn) obj;
                ih.g gVar = jnVar.m1;
                boolean z10 = jnVar.n;
                int i12 = c1Var.f;
                View view = c1Var.a;
                if (i12 != 4) {
                    if (i12 != 11) {
                        if (i12 != 5) {
                            if (i12 == 7) {
                                e6 e6Var = (e6) view;
                                e6Var.setTag(1);
                                CharSequence charSequence = jnVar.P;
                                e6Var.n(charSequence != null ? charSequence : "", cd.L0(2131754474, null), false);
                                e6Var.setTag(null);
                                if (!z10) {
                                    e6Var.e.b(gVar.b(-3), false);
                                }
                                jn.O(jnVar, view, c1Var.b());
                                break;
                            }
                        } else {
                            int b10 = c1Var.b();
                            e6 e6Var2 = (e6) view;
                            e6Var2.setTag(1);
                            e6Var2.a.a(jnVar.b0, false);
                            int i13 = b10 - jnVar.t0;
                            e6Var2.n(jnVar.K[i13], cd.L0(z10 ? 2131744080 : 2131747790, null), true);
                            e6Var2.setTag(null);
                            if (jnVar.k0 == b10) {
                                EditTextBoldCursor textView = e6Var2.getTextView();
                                textView.requestFocus();
                                i0.J3(textView);
                                jnVar.k0 = -1;
                            }
                            if (!z10) {
                                e6Var2.e.b(gVar.b(i13), false);
                            }
                            jn.O(jnVar, view, b10);
                            break;
                        }
                    } else {
                        e6 e6Var3 = (e6) view;
                        e6Var3.setTag(1);
                        CharSequence charSequence2 = jnVar.O;
                        e6Var3.n(charSequence2 != null ? charSequence2 : "", cd.L0(2131746464, null), false);
                        e6Var3.setTag(null);
                        e6Var3.e.b(gVar.b(-2), false);
                        jn.O(jnVar, view, c1Var.b());
                        break;
                    }
                } else {
                    e6 e6Var4 = (e6) view;
                    e6Var4.setTag(1);
                    CharSequence charSequence3 = jnVar.N;
                    e6Var4.n(charSequence3 != null ? charSequence3 : "", cd.L0(z10 ? 2131744078 : 2131746463, null), true);
                    e6Var4.setTag(null);
                    jn.O(jnVar, view, c1Var.b());
                    break;
                }
                break;
            case 10:
                if (c1Var.f == 3) {
                    t8 t8Var = (t8) c1Var.a;
                    int b11 = c1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 != dataSettingsActivity.E) {
                        if (b11 != dataSettingsActivity.D) {
                            if (b11 != dataSettingsActivity.F) {
                                if (b11 != dataSettingsActivity.G) {
                                    if (b11 != dataSettingsActivity.J) {
                                        if (b11 == dataSettingsActivity.K) {
                                            int i14 = tz.a;
                                            t8Var.setChecked(sc.e(1024));
                                            break;
                                        }
                                    } else {
                                        int i15 = tz.a;
                                        t8Var.setChecked(sc.e(2048));
                                        break;
                                    }
                                } else {
                                    t8Var.setChecked(tz.D0);
                                    break;
                                }
                            } else {
                                t8Var.setChecked(tz.C0);
                                break;
                            }
                        } else {
                            t8Var.setChecked(tz.B0);
                            break;
                        }
                    } else {
                        t8Var.setChecked(tz.E0);
                        break;
                    }
                }
                break;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (c1Var.f == 3) {
                    t8 t8Var2 = (t8) c1Var.a;
                    int b12 = c1Var.b();
                    i10 = proxyListActivity.useProxyRow;
                    if (b12 != i10) {
                        if (b12 == proxyListActivity.w) {
                            t8Var2.setChecked(tz.a1);
                            break;
                        }
                    } else {
                        t8Var2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.g0
    public void z(c1 c1Var) {
        switch (this.c) {
            case 2:
                jn jnVar = (jn) this.e;
                int i10 = c1Var.f;
                if (i10 == 4 || i10 == 11 || i10 == 5) {
                    EditTextBoldCursor textView = ((e6) c1Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (jnVar.I) {
                            an anVar = jnVar.y;
                            if (anVar != null) {
                                anVar.f();
                            }
                            jnVar.c0(true);
                        }
                        jnVar.g1 = null;
                        textView.clearFocus();
                        i0.v1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public j(l lVar, LaunchActivity launchActivity) {
        this.c = 0;
        this.e = lVar;
        this.d = launchActivity;
    }

    public j(Context context) {
        this.c = 19;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        q2 q2Var = new q2();
        q2Var.a = cd.L0(2131744196, null);
        q2Var.b = cd.L0(2131744188, null);
        q2Var.c = 0;
        q2Var.d = 0;
        q2Var.e = true;
        q2Var.f = false;
        q2Var.g = 0;
        q2Var.h = currentTimeMillis;
        q2Var.i = false;
        q2Var.j = false;
        q2Var.k = 2;
        arrayList.add(q2Var);
        q2 q2Var2 = new q2();
        q2Var2.a = cd.L0(2131744195, null);
        q2Var2.b = cd.L0(2131744187, null);
        q2Var2.c = 1;
        q2Var2.d = 2;
        q2Var2.e = false;
        q2Var2.f = false;
        q2Var2.g = 0;
        q2Var2.h = currentTimeMillis - 3600;
        q2Var2.i = false;
        q2Var2.j = false;
        q2Var2.k = -1;
        arrayList.add(q2Var2);
        q2 q2Var3 = new q2();
        q2Var3.a = cd.L0(2131744194, null);
        q2Var3.b = cd.L0(2131744186, null);
        q2Var3.c = 2;
        q2Var3.d = 3;
        q2Var3.e = false;
        q2Var3.f = true;
        q2Var3.g = 0;
        q2Var3.h = currentTimeMillis - 7200;
        q2Var3.i = false;
        q2Var3.j = true;
        q2Var3.k = -1;
        arrayList.add(q2Var3);
        q2 q2Var4 = new q2();
        q2Var4.a = cd.L0(2131744193, null);
        q2Var4.b = cd.L0(2131744185, null);
        q2Var4.c = 3;
        q2Var4.d = 0;
        q2Var4.e = false;
        q2Var4.f = false;
        q2Var4.g = 2;
        q2Var4.h = currentTimeMillis - 10800;
        q2Var4.i = false;
        q2Var4.j = false;
        q2Var4.k = -1;
        arrayList.add(q2Var4);
        q2 q2Var5 = new q2();
        q2Var5.a = cd.L0(2131744192, null);
        q2Var5.b = cd.L0(2131744184, null);
        q2Var5.c = 4;
        q2Var5.d = 0;
        q2Var5.e = false;
        q2Var5.f = false;
        q2Var5.g = 1;
        q2Var5.h = currentTimeMillis - 14400;
        q2Var5.i = false;
        q2Var5.j = false;
        q2Var5.k = 2;
        arrayList.add(q2Var5);
        q2 q2Var6 = new q2();
        q2Var6.a = cd.L0(2131744191, null);
        q2Var6.b = cd.L0(2131744183, null);
        q2Var6.c = 5;
        q2Var6.d = 0;
        q2Var6.e = false;
        q2Var6.f = false;
        q2Var6.g = 0;
        q2Var6.h = currentTimeMillis - 18000;
        q2Var6.i = false;
        q2Var6.j = false;
        q2Var6.k = -1;
        arrayList.add(q2Var6);
        q2 q2Var7 = new q2();
        q2Var7.a = cd.L0(2131744190, null);
        q2Var7.b = cd.L0(2131744182, null);
        q2Var7.c = 6;
        q2Var7.d = 0;
        q2Var7.e = false;
        q2Var7.f = false;
        q2Var7.g = 0;
        q2Var7.h = currentTimeMillis - 21600;
        q2Var7.i = true;
        q2Var7.j = false;
        q2Var7.k = -1;
        arrayList.add(q2Var7);
        q2 q2Var8 = new q2();
        q2Var8.a = cd.L0(2131744189, null);
        q2Var8.b = cd.L0(2131744181, null);
        q2Var8.c = 0;
        q2Var8.d = 0;
        q2Var8.e = false;
        q2Var8.f = false;
        q2Var8.g = 0;
        q2Var8.h = currentTimeMillis - 25200;
        q2Var8.i = true;
        q2Var8.j = false;
        q2Var8.k = -1;
        arrayList.add(q2Var8);
    }

    public j(ProxyListActivity proxyListActivity, Context context) {
        this.c = 17;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
