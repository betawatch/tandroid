package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e51 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40, of0, fe.e {
    public l0 D;
    public x41 E;
    public org.telegram.ui.Components.r8 F;
    public org.telegram.ui.Components.g9 G;
    public FrameLayout H;
    public FrameLayout I;
    public ImageView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public boolean N;
    public View O;
    public View P;
    public int Q;
    public xa.n R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fe.b a;
    public float a0;
    public w8 b;
    public final ArrayList b0;
    public org.telegram.ui.Components.u51 c;
    public int c0;
    public org.telegram.ui.ActionBar.p5 d;
    public int d0;
    public org.telegram.ui.ActionBar.p5 e;
    public int e0;
    public v41 f;
    public boolean f0;
    public org.telegram.ui.Components.b40 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.d4 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public e51() {
        this(null);
    }

    public static boolean Y(e51 e51Var, org.telegram.ui.Components.a51 a51Var, View view) {
        Object obj = a51Var.G;
        int i10 = 1;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            xh.m2.n(e51Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new r41(e51Var, 2));
            return true;
        }
        if (a51Var.H(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = a51Var.G;
            String str = obj2 instanceof gy0 ? ((gy0) obj2).h : obj2 instanceof org.telegram.messenger.hp ? ((org.telegram.messenger.hp) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(e51Var, view);
                H.c(R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131751762, null), new t11(i10, e51Var, str), false);
                H.W(e51Var.c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void Z(e51 e51Var) {
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(e51Var.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(e51Var.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(e51Var.currentAccount).f();
        }
        if (Z1 == null) {
            return;
        }
        org.telegram.ui.Components.b40 b40Var = e51Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        b40Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new r41(e51Var, 0), new jg.z(6), 0);
    }

    public static void a0(e51 e51Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.I1, e51Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(e51Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.rk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static /* synthetic */ void b0(e51 e51Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(e51Var.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(e51Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ul0(12, e51Var, tL_attachMenuBot), 66);
    }

    public static void c0(e51 e51Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        e51Var.e0 = -1;
        if (tL_error == null) {
            TLRPC.User Z1 = e51Var.getMessagesController().Z1(Long.valueOf(e51Var.getUserConfig().e()));
            if (Z1 == null) {
                Z1 = e51Var.getUserConfig().f();
                if (Z1 == null) {
                    return;
                } else {
                    e51Var.getMessagesController().U3(Z1, false, false);
                }
            } else {
                e51Var.getUserConfig().w(Z1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.zs.g2, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.b8.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            Z1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w9 != null) {
                tL_userProfilePhoto.photo_small = w9.location;
            }
            if (w10 != null) {
                tL_userProfilePhoto.photo_big = w10.location;
            }
            if (w9 != null && e51Var.s != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                org.telegram.messenger.b8.K(e51Var.s, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e51Var.s.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, e51Var.s.local_id, "@90_90");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@90_90"), org.telegram.messenger.ic.m(e51Var.currentAccount, 1, Z1));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.b8.K(x10, "mp4", true, true));
            } else if (w10 != null && e51Var.w != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                org.telegram.messenger.b8.K(e51Var.w, null, true, true).renameTo(K2);
            }
            e51Var.getMessagesController().T0(Z1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            e51Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull a2 = e51Var.getMessagesController().a2(e51Var.getUserConfig().e());
            if (a2 != null) {
                a2.profile_photo = tL_photos_photo.photo;
                e51Var.getMessagesStorage().j2(a2, false);
            }
            e51Var.l0(Z1);
        }
        e51Var.s = null;
        e51Var.w = null;
        e51Var.m0(false, true);
        e51Var.getNotificationCenter().k(org.telegram.messenger.zs.r, Integer.valueOf(org.telegram.messenger.vp.D8));
        e51Var.getNotificationCenter().k(org.telegram.messenger.zs.j0, new Object[0]);
        e51Var.getUserConfig().v(true);
    }

    public static /* synthetic */ void d0(e51 e51Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            e51Var.s = fileLocation;
            e51Var.w = photoSize2.location;
            e51Var.G.j(org.telegram.messenger.ic.e(fileLocation), "90_90", e51Var.F, null);
            e51Var.m0(true, false);
        } else {
            if (e51Var.s == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            e51Var.e0 = e51Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ul0(13, e51Var, str));
        }
        e51Var.simpleActionBar.o().requestLayout();
    }

    public static void e0(e51 e51Var, ArrayList arrayList) {
        int i10;
        int i11 = 0;
        if (e51Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.a51.D(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
            v41 v41Var = e51Var.f;
            ArrayList arrayList2 = v41Var.d;
            ArrayList arrayList3 = v41Var.w;
            if (v41Var.x) {
                ArrayList arrayList4 = v41Var.r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) v41Var.n.get(i12);
                    int i15 = org.telegram.ui.Cells.x6.b;
                    org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                    K.l = charSequence;
                    K.G = (gy0) obj;
                    arrayList.add(K);
                    i12 = i14;
                }
                if (v41Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745500, null)));
                ArrayList arrayList5 = v41Var.s;
                int size2 = arrayList5.size();
                while (i11 < size2) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) v41Var.n.get(i12);
                    int i17 = org.telegram.ui.Cells.x6.b;
                    org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                    K2.l = charSequence2;
                    K2.G = (org.telegram.messenger.hp) obj2;
                    arrayList.add(K2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745487, null)));
                int size3 = arrayList3.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList3.get(i18);
                    i18++;
                    if (obj3 instanceof gy0) {
                        gy0 gy0Var = (gy0) obj3;
                        String str = gy0Var.a;
                        int i19 = org.telegram.ui.Cells.x6.b;
                        org.telegram.ui.Components.a51 K3 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                        K3.l = str;
                        K3.G = gy0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.hp) {
                        org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj3;
                        String str2 = hpVar.a;
                        int i20 = org.telegram.ui.Cells.x6.b;
                        org.telegram.ui.Components.a51 K4 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                        K4.l = str2;
                        K4.G = hpVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745500, null)));
            int size4 = arrayList2.size();
            while (i11 < size4) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj4;
                String str3 = hpVar2.a;
                int i21 = org.telegram.ui.Cells.x6.b;
                org.telegram.ui.Components.a51 K5 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                K5.l = str3;
                K5.G = hpVar2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.a51.n(e51Var.x, org.telegram.messenger.zs.S2));
        e51Var.b0.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (org.telegram.messenger.d20.i(i22).p() && e51Var.currentAccount != i22) {
                e51Var.b0.add(Integer.valueOf(i22));
            }
            i22++;
        }
        int i23 = 2;
        Collections.sort(e51Var.b0, new ex0(2));
        Set set = e51Var.getMessagesController().U3;
        int i24 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(c51.i(org.telegram.messenger.cd.L0(2131749535, null), org.telegram.messenger.cd.L0(2131749536, null), null, null, org.telegram.messenger.cd.L0(2131749537, null), new s41(e51Var, i11)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && e51Var.getUserConfig().f() != null) {
            arrayList.add(c51.i(org.telegram.messenger.cd.a0(null, null, 2131752156, org.telegram.messenger.m5.h(new StringBuilder("+"), e51Var.getUserConfig().f().phone, af.b.c())), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752155, null), new r41(e51Var, i24)), org.telegram.messenger.cd.L0(2131752153, null), new s41(e51Var, i24), rh.e4.g2(org.telegram.messenger.cd.L0(2131752151, null)), new s41(e51Var, i23)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(c51.i(org.telegram.messenger.cd.L0(2131742828, null), org.telegram.messenger.cd.L0(2131742827, null), org.telegram.messenger.cd.L0(2131742826, null), new s41(e51Var, 3), org.telegram.messenger.cd.L0(2131742825, null), new s41(e51Var, i10)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (e51Var.b0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745509, null)));
            for (int i25 = 0; i25 < e51Var.b0.size(); i25++) {
                int intValue = ((Integer) e51Var.b0.get(i25)).intValue();
                int i26 = y41.b;
                org.telegram.ui.Components.a51 K6 = org.telegram.ui.Components.a51.K(y41.class);
                K6.d = i25;
                K6.z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        boolean z10 = e51Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z10 && ((org.telegram.messenger.j0) e51Var.getMessagesController().y7.j0.b).c) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e51Var.currentAccount);
            int i27 = org.telegram.ui.ActionBar.t6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence L0 = org.telegram.messenger.cd.L0(2131743220, null);
            int i28 = org.telegram.ui.Cells.p8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).getCurrentTime() - 1790679020 <= 2419200) {
                L0 = org.telegram.ui.Cells.p8.b(L0);
            }
            arrayList.add(a51.i(25, 0, 0, i27, L0, null, x10.v() > 0 ? org.telegram.ui.Wallet.k0.o(x10.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        arrayList.add(a51.i(1, -14899731, -15431455, R.drawable.settings_account, org.telegram.messenger.cd.L0(2131745511, null), org.telegram.messenger.cd.L0(2131745510, null), null));
        arrayList.add(a51.i(2, -1007845, -1996271, R.drawable.settings_chat, org.telegram.messenger.cd.L0(2131745507, null), org.telegram.messenger.cd.L0(2131745506, null), null));
        arrayList.add(a51.i(3, -11154873, -14175180, R.drawable.settings_privacy, org.telegram.messenger.cd.L0(2131745489, null), org.telegram.messenger.cd.L0(2131745488, null), null));
        arrayList.add(a51.i(5, -765355, -2148011, R.drawable.settings_sounds, org.telegram.messenger.cd.L0(2131745493, null), org.telegram.messenger.cd.L0(2131745492, null), null));
        arrayList.add(a51.i(6, -11565578, -13276952, R.drawable.settings_data, org.telegram.messenger.cd.L0(2131745505, null), org.telegram.messenger.cd.L0(2131745504, null), null));
        arrayList.add(a51.i(7, -14899731, -15497247, R.drawable.settings_folders, org.telegram.messenger.cd.L0(2131745499, null), org.telegram.messenger.cd.L0(2131745498, null), null));
        arrayList.add(a51.i(8, -13451058, -14836538, R.drawable.settings_devices, org.telegram.messenger.cd.L0(2131745502, null), org.telegram.messenger.cd.L0(2131745501, null), null));
        arrayList.add(a51.i(9, -881871, -1940716, R.drawable.settings_power, org.telegram.messenger.cd.L0(2131745491, null), org.telegram.messenger.cd.L0(2131745490, null), null));
        arrayList.add(a51.i(10, -3903756, -6335009, R.drawable.settings_language, org.telegram.messenger.cd.L0(2131745496, null), org.telegram.messenger.cd.j0(), null));
        arrayList.add(org.telegram.ui.Components.a51.C(null));
        if (!z10 && ((org.telegram.messenger.j0) e51Var.getMessagesController().y7.j0.b).c) {
            org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(e51Var.currentAccount);
            int i29 = org.telegram.ui.ActionBar.t6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence L02 = org.telegram.messenger.cd.L0(2131743220, null);
            int i30 = org.telegram.ui.Cells.p8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).getCurrentTime() - 1790679020 <= 2419200) {
                L02 = org.telegram.ui.Cells.p8.b(L02);
            }
            arrayList.add(a51.i(25, 0, 0, i29, L02, null, x11.v() > 0 ? org.telegram.ui.Wallet.k0.o(x11.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (!e51Var.getMessagesController().A3()) {
            arrayList.add(a51.i(11, -4826625, -10388225, R.drawable.settings_premium, org.telegram.messenger.cd.L0(2131744256, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!e51Var.getMessagesController().k7) {
            rh.e6 y3 = rh.e6.y(e51Var.currentAccount, false);
            arrayList.add(a51.i(12, -1071598, -1608430, R.drawable.settings_stars, org.telegram.messenger.cd.L0(2131744240, null), null, (!y3.e || y3.p().amount <= 0) ? "" : rh.h8.L0(y3.p(), 0.85f, ' ')));
        }
        rh.e6.y(e51Var.currentAccount, true).p();
        org.telegram.messenger.w0.n();
        rh.e6 y10 = rh.e6.y(e51Var.currentAccount, true);
        long j10 = y10.p().amount;
        String L03 = org.telegram.messenger.cd.L0(2131749524, null);
        if (y10.e && j10 > 0) {
            charSequence3 = rh.h8.L0(y10.p(), 0.85f, ' ');
        }
        arrayList.add(a51.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, L03, null, charSequence3));
        if (!e51Var.getMessagesController().A3()) {
            arrayList.add(a51.i(15, -765355, -2148011, R.drawable.settings_business, org.telegram.messenger.cd.L0(2131744277, null), null, null));
        }
        if (!e51Var.getMessagesController().i7) {
            arrayList.add(a51.i(16, -816335, -1940716, R.drawable.settings_gift, org.telegram.messenger.cd.L0(2131745656, null), null, null));
        }
        if (((org.telegram.ui.Components.a51) i0.a.g(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745497, null)));
        arrayList.add(a51.i(17, -1007845, -1996271, R.drawable.settings_ask, org.telegram.messenger.cd.L0(2131753986, null), null, null));
        arrayList.add(a51.i(18, -14965523, -15431455, R.drawable.settings_faq, org.telegram.messenger.cd.L0(2131744267, null), null, null));
        arrayList.add(a51.i(23, -3903756, -6335009, R.drawable.settings_features, org.telegram.messenger.cd.L0(2131744264, null), null, null));
        arrayList.add(a51.i(19, -11154873, -14175180, R.drawable.settings_policy, org.telegram.messenger.cd.L0(2131746798, null), null, null));
        mi.a aVar = mi.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
            arrayList.add(org.telegram.ui.Components.a51.u("Experimental"));
            arrayList.add(a51.i(24, -765355, -2148011, 0, org.telegram.messenger.cd.L0(2131746002, null), null, null));
            arrayList.add(a51.i(26, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131753919, null), null, null));
            arrayList.add(a51.i(27, -12743701, -13996071, 0, org.telegram.messenger.cd.L0(2131749339, null), null, null));
        }
        if (org.telegram.messenger.v2.a) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745503, null)));
            arrayList.add(a51.i(20, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131751614, null), null, null));
            arrayList.add(a51.i(21, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131751615, null), null, null));
            arrayList.add(a51.i(22, -765355, -2148011, 0, org.telegram.messenger.cd.L0(2131751651, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.a51.m(e51Var.M));
    }

    public static void g0(e51 e51Var, org.telegram.ui.Components.a51 a51Var) {
        Object obj = a51Var.G;
        int i10 = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                te1.a(e51Var.getParentActivity(), new f11(i10, e51Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.I1, e51Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (a51Var.H(y41.class)) {
            int i11 = a51Var.z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
                return;
            }
            return;
        }
        int i12 = 0;
        if (a51Var.H(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = a51Var.G;
            if (obj2 instanceof gy0) {
                gy0 gy0Var = (gy0) obj2;
                org.telegram.ui.ActionBar.z4 parentLayout = e51Var.getParentLayout();
                gy0Var.b.run();
                org.telegram.messenger.i0.j3(parentLayout, gy0Var.c);
            } else if (obj2 instanceof org.telegram.messenger.hp) {
                org.telegram.messenger.zs.f(e51Var.currentAccount).k(org.telegram.messenger.zs.c1, e51Var.f.E, ((org.telegram.messenger.hp) obj2).c);
            }
            Object obj3 = a51Var.G;
            if (obj3 != null) {
                e51Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (a51Var.d) {
            case 1:
                e51Var.j0(new UserInfoActivity());
                break;
            case 2:
                e51Var.j0(new ThemeActivity(0));
                break;
            case 3:
                e51Var.j0(new PrivacySettingsActivity());
                break;
            case 5:
                e51Var.j0(new NotificationsSettingsActivity());
                break;
            case 6:
                e51Var.j0(new DataSettingsActivity());
                break;
            case 7:
                e51Var.j0(new FiltersSetupActivity());
                break;
            case 8:
                e51Var.j0(new SessionsActivity(0));
                break;
            case 9:
                e51Var.j0(new bb0());
                break;
            case 10:
                e51Var.j0(new LanguageSelectActivity());
                break;
            case 11:
                e51Var.j0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                e51Var.j0(new rh.h8());
                break;
            case 13:
                e51Var.j0(new wh.g());
                break;
            case 15:
                e51Var.j0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                mg.i2.l1(0, org.telegram.messenger.y1.a(org.telegram.messenger.d20.s0).b());
                break;
            case 17:
                e51Var.showDialog(org.telegram.ui.Components.s4.T(e51Var, e51Var.resourceProvider));
                break;
            case 18:
                gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                break;
            case 19:
                gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
                break;
            case 20:
                ProfileActivity.U4(e51Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.U4(e51Var.getParentActivity(), true);
                break;
            case 22:
                org.telegram.messenger.f8.a();
                break;
            case 23:
                if (!org.telegram.messenger.vp.r1(e51Var.currentAccount).u2()) {
                    gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131744263, null));
                    break;
                } else {
                    b.b(e51Var.currentAccount);
                    break;
                }
            case 24:
                e51Var.presentFragment(new l01(i12, bundle));
                break;
            case 25:
                e51Var.j0(new org.telegram.ui.Wallet.b6());
                break;
            case 26:
                e51Var.presentFragment(new l01(i10, bundle));
                break;
            case 27:
                l60 l60Var = new l60();
                l60Var.e = true;
                e51Var.presentFragment(l60Var);
                break;
        }
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new w8(this, context, 9);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.f0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745512, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 2));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new ag.l3(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.p5 b11 = o10.b(1, R.drawable.ic_ab_other);
        this.e = b11;
        b11.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        this.e.e(2, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131748754, null));
        v41 v41Var = new v41(this, this, context);
        this.f = v41Var;
        v41Var.G();
        int i10 = 26;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new z4(this, i10), new t41(this), new t41(this));
        this.c = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.u51 u51Var2 = this.c;
        u51Var2.f3.r = false;
        u51Var2.r1();
        this.c.setSectionsDrawBackground(true);
        ei.b.e(this.c, 0, 0, org.telegram.messenger.i0.L(12.0f), this.d0);
        this.c.setClipToPadding(false);
        this.c.j(new w41(this, 0));
        this.b.addView(this.c, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.b.addView(this.P, w7.b6.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
        this.h = b40Var;
        b40Var.H = true;
        b40Var.a = this;
        b40Var.b = this;
        this.x = new FrameLayout(context);
        l0 l0Var = new l0(this, context, i10);
        this.D = l0Var;
        this.x.addView(l0Var, w7.b6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.D.setOnClickListener(new s41(this, 5));
        w7.e6.a(this.D);
        this.x.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.u41
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                e51.this.o0();
            }
        });
        this.E = new x41(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.E.addView(this.y, w7.b6.e(90, 90, 51));
        w8 w8Var = this.b;
        w8Var.addView(this.E, w8Var.indexOfChild(this.c) + 1, w7.b6.c(-1.0f, -1));
        this.F = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.G = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(90.0f));
        this.y.addView(this.G, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.r = d4Var;
        d4Var.setSize(org.telegram.messenger.i0.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, w7.b6.c(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int L = org.telegram.messenger.i0.L(32.0f);
        int i11 = org.telegram.ui.ActionBar.t6.a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, resourceProvider);
        this.H.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int L3 = org.telegram.messenger.i0.L(30.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.t6.L(L3, getThemedColor(i12));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.a7.k(frameLayout3, L4, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(R.drawable.filled_premium_camera);
        this.I.addView(this.J, w7.b6.e(22, 22, 17));
        this.H.addView(this.I, w7.b6.c(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        w8 w8Var2 = this.b;
        w8Var2.addView(this.H, w8Var2.indexOfChild(this.E) + 1, w7.b6.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(org.telegram.messenger.i0.o());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.x, this.K, w7.b6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = l4;
        l4.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView l10 = org.telegram.ui.Cells.f1.l(this.x, this.L, w7.b6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = l10;
        l10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.M, org.telegram.ui.ActionBar.t6.B6, getResourceProvider());
        this.M.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i13 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i13), 2, -1), null, org.telegram.ui.ActionBar.a7.N(i13), getResourceProvider());
        this.M.setOnClickListener(new s41(this, 6));
        this.O = new View(context);
        n0(true, false);
        this.c.f3.O(false);
        l0(getUserConfig().f());
        p0();
        i0();
        this.simpleActionBar.setBackground(null);
        int i14 = this.mSystemInsets.b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i14;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        w8 w8Var3 = this.b;
        t41 t41Var = new t41(this);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(w8Var3, t41Var);
        w8 w8Var4 = this.b;
        this.fragmentView = w8Var4;
        return w8Var4;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.u51 u51Var;
        if (i10 == org.telegram.messenger.zs.y3) {
            l0(getUserConfig().f());
            org.telegram.ui.Components.u51 u51Var2 = this.c;
            if (u51Var2 != null) {
                u51Var2.f3.O(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.r) {
            l0(getUserConfig().f());
        } else {
            if (i10 != org.telegram.messenger.zs.s1 || (u51Var = this.c) == null) {
                return;
            }
            u51Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void i0() {
        org.telegram.ui.ActionBar.i5 i5Var;
        boolean z10;
        if (this.N && (z10 = (i5Var = this.simpleActionBar).F) != this.f0) {
            this.f0 = z10;
            i5Var.setBackButtonImageAnimated(z10 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.cd.L0(z10 ? 2131754878 : 2131746515, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0(org.telegram.ui.ActionBar.k2 k2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.i0.Q1() || (launchActivity = LaunchActivity.I1) == null || (actionBarLayout = launchActivity.s0) == null) {
            presentFragment(k2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.c0((org.telegram.ui.ActionBar.k2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.w4 w4Var = new org.telegram.ui.ActionBar.w4(k2Var);
        w4Var.c = true;
        w4Var.g = true;
        actionBarLayout.T(w4Var);
    }

    public final void k0(float f7) {
        this.simpleActionBar.setTitlesAlpha(f7);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f7);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        if (this.G != null && this.e0 == -1) {
            this.F.r(user);
            this.G.e(user, this.F);
            this.K.setText(org.telegram.messenger.h20.p(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(af.b.c().b("+" + user.phone));
            }
            String n10 = org.telegram.messenger.h20.n(user);
            if (n10 != null) {
                sb2.append(" • @");
                sb2.append(n10);
            }
            this.L.setText(sb2);
            TextView textView = this.M;
            String str2 = null;
            try {
                PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                int i10 = packageInfo.versionCode;
                int i11 = i10 / 10;
                int i12 = i10 % 10;
                if (i12 == 1 || i12 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    org.telegram.messenger.w0.u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                str2 = org.telegram.messenger.cd.a0(null, null, 2131744235, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            textView.setText(str2);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z11) {
            if (z10) {
                this.r.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            } else {
                this.r.setAlpha(0.0f);
                this.r.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        if (z10) {
            this.r.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new org.telegram.ui.Components.ha0(25, this, z10));
        this.n.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.simpleActionBar.getHeight()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        if (!this.d.w()) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.T == z12 || z10) {
                this.T = z12;
                valueAnimator = this.U;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.U = null;
                }
                if (z11) {
                    k0(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z12 ? 1.0f : 0.0f);
                this.U = ofFloat;
                ofFloat.addUpdateListener(new u01(this, 7));
                this.U.setInterpolator(org.telegram.ui.Components.gr.h);
                this.U.setDuration(420L);
                this.U.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.T == z12) {
        }
        this.T = z12;
        valueAnimator = this.U;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    public final void o0() {
        if (this.E == null || this.y == null) {
            return;
        }
        float height = this.D.getHeight() / 2.0f;
        View view = this.D;
        float f7 = 1.0f;
        while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
            height += view.getY();
            f7 *= view.getAlpha();
            view = (View) view.getParent();
        }
        if (view != this.fragmentView || !this.D.isAttachedToWindow() || this.D.getHeight() == 0) {
            if (this.X != 0.0f) {
                this.X = 0.0f;
                this.E.setHideProgress(1.0f);
                this.H.setAlpha(0.0f);
                return;
            }
            return;
        }
        float f10 = 0.0f;
        for (View view2 = this.x; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
            f10 += view2.getY();
        }
        float paddingTop = (height - f10) + this.c.getPaddingTop();
        x41 x41Var = this.E;
        float f11 = -org.telegram.messenger.i0.L(16.0f);
        org.telegram.messenger.ks ksVar = x41Var.n;
        if (ksVar != null && ksVar.c) {
            f11 = ksVar.e.centerY();
        }
        float a2 = w7.u.a((height - f11) / Math.max(1.0f, paddingTop - f11), 0.0f, 1.0f);
        float max = Math.max(height, f11);
        this.Y = height;
        this.Z = paddingTop;
        this.a0 = f11;
        float L = org.telegram.messenger.i0.L(90.0f);
        float scaleX = this.D.getScaleX() * (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(this.E.getHiddenAvatarSizeDp()), L, a2) / L);
        float f12 = (L * scaleX) / 2.0f;
        float width = (this.E.getWidth() / 2.0f) - f12;
        if (max == this.V && scaleX == this.W && a2 == this.X && f7 == this.E.getAlpha() && width == this.y.getTranslationX()) {
            return;
        }
        this.V = max;
        this.W = scaleX;
        this.X = a2;
        this.E.setAlpha(f7);
        this.y.setScaleX(scaleX);
        this.y.setScaleY(scaleX);
        this.y.setTranslationX(width);
        float f13 = max - f12;
        this.y.setTranslationY(f13);
        this.H.setAlpha(w7.u.a(org.telegram.messenger.i0.z1(a2, 0.75f, 1.0f), 0.0f, 1.0f) * f7);
        this.H.setScaleX(scaleX);
        this.H.setScaleY(scaleX);
        this.H.setTranslationX((org.telegram.messenger.i0.L(60.0f) * scaleX) + width);
        this.H.setTranslationY((org.telegram.messenger.i0.L(60.0f) * scaleX) + f13);
        this.E.setHideProgress(1.0f - a2);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (!i5Var.F) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        i5Var.j(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        xa.n nVar = this.R;
        if (nVar != null) {
            nVar.a();
            this.R = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.zs.e(), this);
        nVar2.e(org.telegram.messenger.zs.r);
        nVar2.e(org.telegram.messenger.zs.y3);
        nVar2.e(org.telegram.messenger.zs.s1);
        this.R = nVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        this.d0 = this.N ? org.telegram.messenger.i0.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.R;
        if (nVar != null) {
            nVar.a();
            this.R = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.p51 p51Var = this.c.f3;
        if (p51Var != null) {
            p51Var.O(false);
        }
    }

    public final void p0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            i0();
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    public e51(Bundle bundle) {
        super(bundle);
        this.a = new fe.b(0, this, org.telegram.ui.Components.gr.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.b0 = new ArrayList();
        this.e0 = -1;
        this.f0 = true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
