package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n31 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30, ke0, te.b {
    public k0 E;
    public g31 F;
    public org.telegram.ui.Components.a9 G;
    public org.telegram.ui.Components.p9 H;
    public FrameLayout I;
    public FrameLayout J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public boolean O;
    public View P;
    public View Q;
    public int R;
    public xi.e S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final te.a a;
    public float a0;
    public w8 b;
    public float b0;
    public org.telegram.ui.Components.g51 c;
    public final ArrayList c0;
    public org.telegram.ui.ActionBar.g5 d;
    public int d0;
    public org.telegram.ui.ActionBar.g5 e;
    public int e0;
    public f31 f;
    public int f0;
    public boolean g0;
    public org.telegram.ui.Components.u30 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.c4 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public n31() {
        this(null);
    }

    public static boolean Z(n31 n31Var, org.telegram.ui.Components.n41 n41Var, View view) {
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ki.t2.n(n31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new b31(n31Var, 2));
            return true;
        }
        if (n41Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = n41Var.H;
            String str = obj2 instanceof tw0 ? ((tw0) obj2).h : obj2 instanceof org.telegram.messenger.yo ? ((org.telegram.messenger.yo) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(n31Var, view);
                I.c(R.drawable.msg_link2, org.telegram.messenger.gd.N0(2131751750, null), new iy0(6, n31Var, str), false);
                I.X(n31Var.c.U0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a0(n31 n31Var) {
        TLRPC.User c22 = org.telegram.messenger.mp.u1(n31Var.currentAccount).c2(Long.valueOf(org.telegram.messenger.i10.i(n31Var.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.i10.i(n31Var.currentAccount).f();
        }
        if (c22 == null) {
            return;
        }
        org.telegram.ui.Components.u30 u30Var = n31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        u30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new b31(n31Var, 0), new hi.n1(6), 0);
    }

    public static void b0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, n31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(n31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.a;
            d02.getMessagesStorage().a.c(new org.telegram.messenger.ek(d02.e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static /* synthetic */ void c0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(n31Var.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(n31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new d31(0, n31Var, tL_attachMenuBot), 66);
    }

    public static void d0(n31 n31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        n31Var.f0 = -1;
        if (tL_error == null) {
            TLRPC.User c22 = n31Var.getMessagesController().c2(Long.valueOf(n31Var.getUserConfig().e()));
            if (c22 == null) {
                c22 = n31Var.getUserConfig().f();
                if (c22 == null) {
                    return;
                } else {
                    n31Var.getMessagesController().e4(c22, false, false);
                }
            } else {
                n31Var.getUserConfig().w(c22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.ks.g2, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            c22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && n31Var.s != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                org.telegram.messenger.w7.J(n31Var.s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n31Var.s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(n31Var.s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.fc.m(n31Var.currentAccount, 1, c22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && n31Var.w != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                org.telegram.messenger.w7.J(n31Var.w, null, true, true).renameTo(J2);
            }
            n31Var.getMessagesController().W0(c22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            n31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull d2 = n31Var.getMessagesController().d2(n31Var.getUserConfig().e());
            if (d2 != null) {
                d2.profile_photo = tL_photos_photo.photo;
                n31Var.getMessagesStorage().j2(d2, false);
            }
            n31Var.m0(c22);
        }
        n31Var.s = null;
        n31Var.w = null;
        n31Var.n0(false, true);
        n31Var.getNotificationCenter().k(org.telegram.messenger.ks.r, Integer.valueOf(org.telegram.messenger.mp.I8));
        n31Var.getNotificationCenter().k(org.telegram.messenger.ks.j0, new Object[0]);
        n31Var.getUserConfig().v(true);
    }

    public static /* synthetic */ void e0(n31 n31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            n31Var.s = fileLocation;
            n31Var.w = photoSize2.location;
            n31Var.H.j(org.telegram.messenger.fc.e(fileLocation), "90_90", n31Var.G, null);
            n31Var.n0(true, false);
        } else {
            if (n31Var.s == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i7 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i7 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            n31Var.f0 = n31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new d31(1, n31Var, str));
        }
        n31Var.simpleActionBar.t().requestLayout();
    }

    public static void f0(n31 n31Var, ArrayList arrayList) {
        int i7;
        int i10 = 0;
        if (n31Var.d.x()) {
            arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            f31 f31Var = n31Var.f;
            ArrayList arrayList2 = f31Var.d;
            ArrayList arrayList3 = f31Var.w;
            if (f31Var.x) {
                ArrayList arrayList4 = f31Var.r;
                int size = arrayList4.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    int i13 = i11 + 1;
                    CharSequence charSequence = (CharSequence) f31Var.n.get(i11);
                    int i14 = org.telegram.ui.Cells.t6.b;
                    org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                    K.m = charSequence;
                    K.H = (tw0) obj;
                    arrayList.add(K);
                    i11 = i13;
                }
                if (f31Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745286, null)));
                ArrayList arrayList5 = f31Var.s;
                int size2 = arrayList5.size();
                while (i10 < size2) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    int i15 = i11 + 1;
                    CharSequence charSequence2 = (CharSequence) f31Var.n.get(i11);
                    int i16 = org.telegram.ui.Cells.t6.b;
                    org.telegram.ui.Components.n41 K2 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                    K2.m = charSequence2;
                    K2.H = (org.telegram.messenger.yo) obj2;
                    arrayList.add(K2);
                    i11 = i15;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745273, null)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof tw0) {
                        tw0 tw0Var = (tw0) obj3;
                        String str = tw0Var.a;
                        int i18 = org.telegram.ui.Cells.t6.b;
                        org.telegram.ui.Components.n41 K3 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                        K3.m = str;
                        K3.H = tw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.yo) {
                        org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) obj3;
                        String str2 = yoVar.a;
                        int i19 = org.telegram.ui.Cells.t6.b;
                        org.telegram.ui.Components.n41 K4 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                        K4.m = str2;
                        K4.H = yoVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745286, null)));
            int size4 = arrayList2.size();
            while (i10 < size4) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) obj4;
                String str3 = yoVar2.a;
                int i20 = org.telegram.ui.Cells.t6.b;
                org.telegram.ui.Components.n41 K5 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                K5.m = str3;
                K5.H = yoVar2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.n(n31Var.x, org.telegram.messenger.ks.S2));
        n31Var.c0.clear();
        int i21 = 0;
        while (true) {
            i7 = 4;
            if (i21 >= 4) {
                break;
            }
            if (org.telegram.messenger.i10.i(i21).p() && n31Var.currentAccount != i21) {
                n31Var.c0.add(Integer.valueOf(i21));
            }
            i21++;
        }
        int i22 = 1;
        Collections.sort(n31Var.c0, new ow0(i22));
        Set set = n31Var.getMessagesController().V3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(l31.i(org.telegram.messenger.gd.N0(2131749350, null), org.telegram.messenger.gd.N0(2131749351, null), null, null, org.telegram.messenger.gd.N0(2131749352, null), new c31(n31Var, i10)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && n31Var.getUserConfig().f() != null) {
            arrayList.add(l31.i(org.telegram.messenger.gd.a0(null, null, 2131752144, org.telegram.messenger.m10.h(new StringBuilder("+"), n31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752143, null), new b31(n31Var, i22)), org.telegram.messenger.gd.N0(2131752141, null), new c31(n31Var, i22), di.f6.t2(org.telegram.messenger.gd.N0(2131752139, null)), new c31(n31Var, 2)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(l31.i(org.telegram.messenger.gd.N0(2131742532, null), org.telegram.messenger.gd.N0(2131742531, null), org.telegram.messenger.gd.N0(2131742530, null), new c31(n31Var, 3), org.telegram.messenger.gd.N0(2131742529, null), new c31(n31Var, i7)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (n31Var.c0.size() > 0) {
            i5.c.s(2131745296, null, arrayList);
            for (int i23 = 0; i23 < n31Var.c0.size(); i23++) {
                int intValue = ((Integer) n31Var.c0.get(i23)).intValue();
                int i24 = h31.b;
                org.telegram.ui.Components.n41 K6 = org.telegram.ui.Components.n41.K(h31.class);
                K6.d = i23;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        boolean z10 = n31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z10 && ((org.telegram.messenger.h0) n31Var.getMessagesController().A7.p0.b).c) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(n31Var.currentAccount);
            int i25 = org.telegram.ui.ActionBar.n6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence N0 = org.telegram.messenger.gd.N0(2131742943, null);
            int i26 = org.telegram.ui.Cells.m8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.i10.t0).getCurrentTime() - 1790679020 <= 2419200) {
                N0 = org.telegram.ui.Cells.m8.b(N0);
            }
            arrayList.add(j31.i(25, 0, 0, i25, N0, null, D.A() > 0 ? org.telegram.ui.Wallet.v0.t(D.A(), false) : null));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        arrayList.add(j31.i(1, -14899731, -15431455, R.drawable.settings_account, org.telegram.messenger.gd.N0(2131745298, null), org.telegram.messenger.gd.N0(2131745297, null), null));
        arrayList.add(j31.i(2, -1007845, -1996271, R.drawable.settings_chat, org.telegram.messenger.gd.N0(2131745294, null), org.telegram.messenger.gd.N0(2131745293, null), null));
        arrayList.add(j31.i(3, -11154873, -14175180, R.drawable.settings_privacy, org.telegram.messenger.gd.N0(2131745275, null), org.telegram.messenger.gd.N0(2131745274, null), null));
        arrayList.add(j31.i(5, -765355, -2148011, R.drawable.settings_sounds, org.telegram.messenger.gd.N0(2131745279, null), org.telegram.messenger.gd.N0(2131745278, null), null));
        arrayList.add(j31.i(6, -11565578, -13276952, R.drawable.settings_data, org.telegram.messenger.gd.N0(2131745292, null), org.telegram.messenger.gd.N0(2131745291, null), null));
        arrayList.add(j31.i(7, -14899731, -15497247, R.drawable.settings_folders, org.telegram.messenger.gd.N0(2131745285, null), org.telegram.messenger.gd.N0(2131745284, null), null));
        arrayList.add(j31.i(8, -13451058, -14836538, R.drawable.settings_devices, org.telegram.messenger.gd.N0(2131745289, null), org.telegram.messenger.gd.N0(2131745288, null), null));
        arrayList.add(j31.i(9, -881871, -1940716, R.drawable.settings_power, org.telegram.messenger.gd.N0(2131745277, null), org.telegram.messenger.gd.N0(2131745276, null), null));
        arrayList.add(j31.i(10, -3903756, -6335009, R.drawable.settings_language, org.telegram.messenger.gd.N0(2131745282, null), org.telegram.messenger.gd.j0(), null));
        arrayList.add(org.telegram.ui.Components.n41.C(null));
        if (!z10 && ((org.telegram.messenger.h0) n31Var.getMessagesController().A7.p0.b).c) {
            org.telegram.ui.Wallet.v0 D2 = org.telegram.ui.Wallet.v0.D(n31Var.currentAccount);
            int i27 = org.telegram.ui.ActionBar.n6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence N02 = org.telegram.messenger.gd.N0(2131742943, null);
            int i28 = org.telegram.ui.Cells.m8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.i10.t0).getCurrentTime() - 1790679020 <= 2419200) {
                N02 = org.telegram.ui.Cells.m8.b(N02);
            }
            arrayList.add(j31.i(25, 0, 0, i27, N02, null, D2.A() > 0 ? org.telegram.ui.Wallet.v0.t(D2.A(), false) : null));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (!n31Var.getMessagesController().K3()) {
            arrayList.add(j31.i(11, -4826625, -10388225, R.drawable.settings_premium, org.telegram.messenger.gd.N0(2131743986, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!n31Var.getMessagesController().m7) {
            di.y8 y10 = di.y8.y(n31Var.currentAccount, false);
            arrayList.add(j31.i(12, -1071598, -1608430, R.drawable.settings_stars, org.telegram.messenger.gd.N0(2131743970, null), null, (!y10.e || y10.p().amount <= 0) ? "" : di.pb.M0(y10.p(), 0.85f, ' ')));
        }
        di.y8.y(n31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        di.y8 y11 = di.y8.y(n31Var.currentAccount, true);
        long j3 = y11.p().amount;
        String N03 = org.telegram.messenger.gd.N0(2131749339, null);
        if (y11.e && j3 > 0) {
            charSequence3 = di.pb.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(j31.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, N03, null, charSequence3));
        if (!n31Var.getMessagesController().K3()) {
            arrayList.add(j31.i(15, -765355, -2148011, R.drawable.settings_business, org.telegram.messenger.gd.N0(2131744007, null), null, null));
        }
        if (!n31Var.getMessagesController().k7) {
            arrayList.add(j31.i(16, -816335, -1940716, R.drawable.settings_gift, org.telegram.messenger.gd.N0(2131745443, null), null, null));
        }
        if (((org.telegram.ui.Components.n41) i5.c.h(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745283, null)));
        arrayList.add(j31.i(17, -1007845, -1996271, R.drawable.settings_ask, org.telegram.messenger.gd.N0(2131753983, null), null, null));
        arrayList.add(j31.i(18, -14965523, -15431455, R.drawable.settings_faq, org.telegram.messenger.gd.N0(2131743997, null), null, null));
        arrayList.add(j31.i(23, -3903756, -6335009, R.drawable.settings_features, org.telegram.messenger.gd.N0(2131743994, null), null, null));
        arrayList.add(j31.i(19, -11154873, -14175180, R.drawable.settings_policy, org.telegram.messenger.gd.N0(2131746589, null), null, null));
        aj.a aVar = aj.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
            arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745287, null)));
            arrayList.add(j31.i(24, -765355, -2148011, 0, org.telegram.messenger.gd.N0(2131745789, null), null, null));
            arrayList.add(j31.i(26, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131753916, null), null, null));
            arrayList.add(j31.i(27, -12743701, -13996071, 0, org.telegram.messenger.gd.N0(2131749137, null), null, null));
        }
        if (org.telegram.messenger.s2.a) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
            arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745290, null)));
            arrayList.add(j31.i(20, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131751601, null), null, null));
            arrayList.add(j31.i(21, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131751602, null), null, null));
            arrayList.add(j31.i(22, -765355, -2148011, 0, org.telegram.messenger.gd.N0(2131751638, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.n41.m(n31Var.N));
    }

    public static void h0(n31 n31Var, org.telegram.ui.Components.n41 n41Var) {
        Object obj = n41Var.H;
        int i7 = 0;
        int i10 = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                xc1.a(n31Var.getParentActivity(), new a31(i7, n31Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.H1, n31Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (n41Var.H(h31.class)) {
            int i11 = n41Var.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
                return;
            }
            return;
        }
        if (n41Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = n41Var.H;
            if (obj2 instanceof tw0) {
                tw0 tw0Var = (tw0) obj2;
                org.telegram.ui.ActionBar.r4 parentLayout = n31Var.getParentLayout();
                tw0Var.b.run();
                org.telegram.messenger.g0.j3(parentLayout, tw0Var.c);
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                org.telegram.messenger.ks.f(n31Var.currentAccount).k(org.telegram.messenger.ks.c1, n31Var.f.F, ((org.telegram.messenger.yo) obj2).c);
            }
            Object obj3 = n41Var.H;
            if (obj3 != null) {
                n31Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (n41Var.d) {
            case 1:
                n31Var.k0(new UserInfoActivity());
                break;
            case 2:
                n31Var.k0(new ThemeActivity(0));
                break;
            case 3:
                n31Var.k0(new PrivacySettingsActivity());
                break;
            case 5:
                n31Var.k0(new NotificationsSettingsActivity());
                break;
            case 6:
                n31Var.k0(new DataSettingsActivity());
                break;
            case 7:
                n31Var.k0(new FiltersSetupActivity());
                break;
            case 8:
                n31Var.k0(new SessionsActivity(0));
                break;
            case 9:
                n31Var.k0(new y90());
                break;
            case 10:
                n31Var.k0(new LanguageSelectActivity());
                break;
            case 11:
                n31Var.k0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                n31Var.k0(new di.pb());
                break;
            case 13:
                n31Var.k0(new ii.t());
                break;
            case 15:
                n31Var.k0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                bi.f2.l1(false, org.telegram.messenger.v1.a(org.telegram.messenger.i10.t0).b());
                break;
            case 17:
                n31Var.showDialog(org.telegram.ui.Components.b5.R(n31Var, n31Var.resourceProvider));
                break;
            case 18:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                break;
            case 19:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                break;
            case 20:
                ProfileActivity.Y4(n31Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.Y4(n31Var.getParentActivity(), true);
                break;
            case 22:
                org.telegram.messenger.a8.a();
                break;
            case 23:
                if (!org.telegram.messenger.mp.u1(n31Var.currentAccount).A2()) {
                    vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743993, null));
                    break;
                } else {
                    b.b(n31Var.currentAccount);
                    break;
                }
            case 24:
                n31Var.presentFragment(new yy0(i7, bundle));
                break;
            case 25:
                n31Var.k0(new org.telegram.ui.Wallet.o6());
                break;
            case 26:
                n31Var.presentFragment(new yy0(i10, bundle));
                break;
            case 27:
                o50 o50Var = new o50();
                o50Var.e = true;
                n31Var.presentFragment(o50Var);
                break;
        }
    }

    @Override // org.telegram.ui.ke0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        org.telegram.ui.Cells.c4 c4Var = this.r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(f10);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.Cells.c4 c4Var = this.r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.b = new w8(9, context, this);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745299, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 14));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new bi.x1(this, 22);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.g5 b11 = t6.b(1, R.drawable.ic_ab_other);
        this.e = b11;
        b11.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        this.e.e(2, R.drawable.msg_leave, org.telegram.messenger.gd.N0(2131748550, null));
        f31 f31Var = new f31(this, this, context);
        this.f = f31Var;
        f31Var.G();
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(this, new a5(this, 27), new e31(this), new e31(this));
        this.c = g51Var;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.g51 g51Var2 = this.c;
        g51Var2.g3.r = false;
        g51Var2.r1();
        this.c.setSectionsDrawBackground(true);
        ri.a.e(this.c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new b21(this, i7));
        this.b.addView(this.c, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, c8.na.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, c8.na.e(-1, -2, 55));
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
        this.h = u30Var;
        u30Var.I = true;
        u30Var.a = this;
        u30Var.b = this;
        this.x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.E = k0Var;
        this.x.addView(k0Var, c8.na.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new c31(this, 5));
        c8.sa.a(this.E);
        this.x.addOnLayoutChangeListener(new ng(this, i7));
        this.F = new g31(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, c8.na.e(90, 90, 51));
        w8 w8Var = this.b;
        w8Var.addView(this.F, w8Var.indexOfChild(this.c) + 1, c8.na.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.H = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.y.addView(this.H, c8.na.c(-1.0f, -1));
        org.telegram.ui.Cells.c4 c4Var = new org.telegram.ui.Cells.c4(this, context);
        this.r = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, c8.na.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i10 = org.telegram.ui.ActionBar.n6.a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, getThemedColor(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, resourceProvider);
        this.I.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.n6.L(L3, getThemedColor(i11));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.u6.j(frameLayout3, L4, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(R.drawable.filled_premium_camera);
        this.J.addView(this.K, c8.na.e(22, 22, 17));
        this.I.addView(this.J, c8.na.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        w8 w8Var2 = this.b;
        w8Var2.addView(this.I, w8Var2.indexOfChild(this.F) + 1, c8.na.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.x, this.L, c8.na.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView m11 = org.telegram.ui.Cells.c0.m(this.x, this.M, c8.na.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = m11;
        m11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.N, org.telegram.ui.ActionBar.n6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i12 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i12), getResourceProvider());
        this.N.setOnClickListener(new c31(this, 6));
        this.P = new View(context);
        o0(true, false);
        this.c.g3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i13 = this.mSystemInsets.b;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        w8 w8Var3 = this.b;
        e31 e31Var = new e31(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(w8Var3, e31Var);
        w8 w8Var4 = this.b;
        this.fragmentView = w8Var4;
        return w8Var4;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.g51 g51Var;
        if (i7 == org.telegram.messenger.ks.A3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.g51 g51Var2 = this.c;
            if (g51Var2 != null) {
                g51Var2.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.r) {
            m0(getUserConfig().f());
        } else {
            if (i7 != org.telegram.messenger.ks.s1 || (g51Var = this.c) == null) {
                return;
            }
            g51Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.z4 z4Var;
        boolean z10;
        if (this.O && (z10 = (z4Var = this.simpleActionBar).G) != this.g0) {
            this.g0 = z10;
            z4Var.setBackButtonImageAnimated(z10 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.gd.N0(z10 ? 2131754878 : 2131746304, null));
        }
    }

    @Override // org.telegram.ui.ke0
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.g2 g2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.g0.Q1() || (launchActivity = LaunchActivity.H1) == null || (actionBarLayout = launchActivity.r0) == null) {
            presentFragment(g2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.d0((org.telegram.ui.ActionBar.g2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.p4 p4Var = new org.telegram.ui.ActionBar.p4(g2Var);
        p4Var.c = true;
        p4Var.g = true;
        actionBarLayout.U(p4Var);
    }

    public final void l0(float f10) {
        this.simpleActionBar.setTitlesAlpha(f10);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    public final void m0(TLRPC.User user) {
        String str;
        if (this.H != null && this.f0 == -1) {
            this.G.r(user);
            this.H.f(user, this.G);
            this.L.setText(org.telegram.messenger.n10.q(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(pf.b.c().b("+" + user.phone));
            }
            String o4 = org.telegram.messenger.n10.o(user);
            if (o4 != null) {
                sb2.append(" • @");
                sb2.append(o4);
            }
            this.M.setText(sb2);
            TextView textView = this.N;
            String str2 = null;
            try {
                PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                int i7 = packageInfo.versionCode;
                int i10 = i7 / 10;
                int i11 = i7 % 10;
                if (i11 == 1 || i11 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    org.telegram.messenger.t0.u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                str2 = org.telegram.messenger.gd.a0(null, null, 2131743965, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            textView.setText(str2);
        }
    }

    public final void n0(boolean z10, boolean z11) {
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
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.c4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.c4, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new b30(10, this, z10));
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
    public final void o0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        if (!this.d.x()) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.U == z12 || z10) {
                this.U = z12;
                valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                if (z11) {
                    l0(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z12 ? 1.0f : 0.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new hz0(this, 7));
                this.V.setInterpolator(org.telegram.ui.Components.kr.h);
                this.V.setDuration(420L);
                this.V.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.U == z12) {
        }
        this.U = z12;
        valueAnimator = this.V;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (!z4Var.G) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        z4Var.o(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.e(), this);
        eVar2.c(org.telegram.messenger.ks.r);
        eVar2.c(org.telegram.messenger.ks.A3);
        eVar2.c(org.telegram.messenger.ks.s1);
        this.S = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        this.e0 = this.O ? org.telegram.messenger.g0.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.b51 b51Var = this.c.g3;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    public final void p0() {
        if (this.F == null || this.y == null) {
            return;
        }
        float height = this.E.getHeight() / 2.0f;
        View view = this.E;
        float f10 = 1.0f;
        while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
            height += view.getY();
            f10 *= view.getAlpha();
            view = (View) view.getParent();
        }
        if (view != this.fragmentView || !this.E.isAttachedToWindow() || this.E.getHeight() == 0) {
            if (this.Y != 0.0f) {
                this.Y = 0.0f;
                this.F.setHideProgress(1.0f);
                this.I.setAlpha(0.0f);
                return;
            }
            return;
        }
        float f11 = 0.0f;
        for (View view2 = this.x; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
            f11 += view2.getY();
        }
        float paddingTop = (height - f11) + this.c.getPaddingTop();
        g31 g31Var = this.F;
        float f12 = -org.telegram.messenger.g0.L(16.0f);
        bi.d2 d2Var = g31Var.n;
        if (d2Var != null && d2Var.c) {
            f12 = ((RectF) d2Var.e).centerY();
        }
        float a10 = c8.m9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
        float max = Math.max(height, f12);
        this.Z = height;
        this.a0 = paddingTop;
        this.b0 = f12;
        float L = org.telegram.messenger.g0.L(90.0f);
        float scaleX = this.E.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.F.getHiddenAvatarSizeDp()), L, a10) / L);
        float f13 = (L * scaleX) / 2.0f;
        float width = (this.F.getWidth() / 2.0f) - f13;
        if (max == this.W && scaleX == this.X && a10 == this.Y && f10 == this.F.getAlpha() && width == this.y.getTranslationX()) {
            return;
        }
        this.W = max;
        this.X = scaleX;
        this.Y = a10;
        this.F.setAlpha(f10);
        this.y.setScaleX(scaleX);
        this.y.setScaleY(scaleX);
        this.y.setTranslationX(width);
        float f14 = max - f13;
        this.y.setTranslationY(f14);
        this.I.setAlpha(c8.m9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
        this.I.setScaleX(scaleX);
        this.I.setScaleY(scaleX);
        this.I.setTranslationX((org.telegram.messenger.g0.L(60.0f) * scaleX) + width);
        this.I.setTranslationY((org.telegram.messenger.g0.L(60.0f) * scaleX) + f14);
        this.F.setHideProgress(1.0f - a10);
    }

    public final void q0() {
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.G6));
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.y6));
        this.d.W();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.ke0
    public final void v() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public n31(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, org.telegram.ui.Components.kr.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
