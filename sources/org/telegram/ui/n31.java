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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n31 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.j30, ke0, te.b {
    public k0 D;
    public g31 E;
    public org.telegram.ui.Components.w8 F;
    public org.telegram.ui.Components.l9 G;
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
    public ab.b0 R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final te.a a;
    public float a0;
    public v8 b;
    public final ArrayList b0;
    public org.telegram.ui.Components.r41 c;
    public int c0;
    public org.telegram.ui.ActionBar.f5 d;
    public int d0;
    public org.telegram.ui.ActionBar.f5 e;
    public int e0;
    public f31 f;
    public boolean f0;
    public org.telegram.ui.Components.k30 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.b4 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public n31() {
        this(null);
    }

    public static boolean Z(n31 n31Var, org.telegram.ui.Components.y31 y31Var, View view) {
        Object obj = y31Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            hi.a3.n(n31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new c31(n31Var, 2));
            return true;
        }
        if (y31Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = y31Var.G;
            String str = obj2 instanceof vw0 ? ((vw0) obj2).h : obj2 instanceof org.telegram.messenger.cp ? ((org.telegram.messenger.cp) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(n31Var, view);
                H.c(R.drawable.msg_link2, org.telegram.messenger.id.M0(2131751762, null), new ax0(9, n31Var, str), false);
                H.W(n31Var.c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a0(n31 n31Var) {
        TLRPC.User a22 = org.telegram.messenger.qp.s1(n31Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(n31Var.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(n31Var.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.k30 k30Var = n31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        k30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new c31(n31Var, 0), new fi.d1(6), 0);
    }

    public static void b0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.G1, n31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(n31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.hk(b02.e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static /* synthetic */ void c0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(n31Var.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(n31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new j50(28, n31Var, tL_attachMenuBot), 66);
    }

    public static void d0(n31 n31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        n31Var.e0 = -1;
        if (tL_error == null) {
            TLRPC.User a22 = n31Var.getMessagesController().a2(Long.valueOf(n31Var.getUserConfig().e()));
            if (a22 == null) {
                a22 = n31Var.getUserConfig().f();
                if (a22 == null) {
                    return;
                } else {
                    n31Var.getMessagesController().X3(a22, false, false);
                }
            } else {
                n31Var.getUserConfig().w(a22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.qs.g2, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            a22.photo = tL_userProfilePhoto;
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
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.hc.m(n31Var.currentAccount, 1, a22));
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
            n31Var.getMessagesController().U0(a22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            n31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = n31Var.getMessagesController().b2(n31Var.getUserConfig().e());
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                n31Var.getMessagesStorage().j2(b22, false);
            }
            n31Var.m0(a22);
        }
        n31Var.s = null;
        n31Var.w = null;
        n31Var.n0(false, true);
        n31Var.getNotificationCenter().k(org.telegram.messenger.qs.r, Integer.valueOf(org.telegram.messenger.qp.C8));
        n31Var.getNotificationCenter().k(org.telegram.messenger.qs.j0, new Object[0]);
        n31Var.getUserConfig().v(true);
    }

    public static /* synthetic */ void e0(n31 n31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            n31Var.s = fileLocation;
            n31Var.w = photoSize2.location;
            n31Var.G.j(org.telegram.messenger.hc.e(fileLocation), "90_90", n31Var.F, null);
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
            n31Var.e0 = n31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new j50(29, n31Var, str));
        }
        n31Var.simpleActionBar.p().requestLayout();
    }

    public static void f0(n31 n31Var, ArrayList arrayList) {
        int i7;
        int i10 = 0;
        if (n31Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.y31.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
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
                    org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.t6.class);
                    K.l = charSequence;
                    K.G = (vw0) obj;
                    arrayList.add(K);
                    i11 = i13;
                }
                if (f31Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(2131745482, null)));
                ArrayList arrayList5 = f31Var.s;
                int size2 = arrayList5.size();
                while (i10 < size2) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    int i15 = i11 + 1;
                    CharSequence charSequence2 = (CharSequence) f31Var.n.get(i11);
                    int i16 = org.telegram.ui.Cells.t6.b;
                    org.telegram.ui.Components.y31 K2 = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.t6.class);
                    K2.l = charSequence2;
                    K2.G = (org.telegram.messenger.cp) obj2;
                    arrayList.add(K2);
                    i11 = i15;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(2131745469, null)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof vw0) {
                        vw0 vw0Var = (vw0) obj3;
                        String str = vw0Var.a;
                        int i18 = org.telegram.ui.Cells.t6.b;
                        org.telegram.ui.Components.y31 K3 = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.t6.class);
                        K3.l = str;
                        K3.G = vw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.cp) {
                        org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) obj3;
                        String str2 = cpVar.a;
                        int i19 = org.telegram.ui.Cells.t6.b;
                        org.telegram.ui.Components.y31 K4 = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.t6.class);
                        K4.l = str2;
                        K4.G = cpVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(2131745482, null)));
            int size4 = arrayList2.size();
            while (i10 < size4) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                org.telegram.messenger.cp cpVar2 = (org.telegram.messenger.cp) obj4;
                String str3 = cpVar2.a;
                int i20 = org.telegram.ui.Cells.t6.b;
                org.telegram.ui.Components.y31 K5 = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.t6.class);
                K5.l = str3;
                K5.G = cpVar2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.y31.n(n31Var.x, org.telegram.messenger.qs.S2));
        n31Var.b0.clear();
        int i21 = 0;
        while (true) {
            i7 = 4;
            if (i21 >= 4) {
                break;
            }
            if (org.telegram.messenger.p10.i(i21).p() && n31Var.currentAccount != i21) {
                n31Var.b0.add(Integer.valueOf(i21));
            }
            i21++;
        }
        int i22 = 3;
        Collections.sort(n31Var.b0, new wn0(i22));
        Set set = n31Var.getMessagesController().S3;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(l31.i(org.telegram.messenger.id.M0(2131749526, null), org.telegram.messenger.id.M0(2131749527, null), null, null, org.telegram.messenger.id.M0(2131749528, null), new d31(n31Var, i10)));
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && n31Var.getUserConfig().f() != null) {
            arrayList.add(l31.i(org.telegram.messenger.id.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), n31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752155, null), new c31(n31Var, i23)), org.telegram.messenger.id.M0(2131752153, null), new d31(n31Var, i23), bi.k7.f2(org.telegram.messenger.id.M0(2131752151, null)), new d31(n31Var, 2)));
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(l31.i(org.telegram.messenger.id.M0(2131742803, null), org.telegram.messenger.id.M0(2131742802, null), org.telegram.messenger.id.M0(2131742801, null), new d31(n31Var, i22), org.telegram.messenger.id.M0(2131742800, null), new d31(n31Var, i7)));
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        if (n31Var.b0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131745492, null)));
            for (int i24 = 0; i24 < n31Var.b0.size(); i24++) {
                int intValue = ((Integer) n31Var.b0.get(i24)).intValue();
                int i25 = h31.b;
                org.telegram.ui.Components.y31 K6 = org.telegram.ui.Components.y31.K(h31.class);
                K6.d = i24;
                K6.z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        boolean z9 = n31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z9 && ((org.telegram.messenger.h0) n31Var.getMessagesController().x7.j0.b).c) {
            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(n31Var.currentAccount);
            int i26 = org.telegram.ui.ActionBar.l6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence M0 = org.telegram.messenger.id.M0(2131743194, null);
            int i27 = org.telegram.ui.Cells.m8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.m8.b(M0);
            }
            arrayList.add(j31.i(25, 0, 0, i26, M0, null, x10.v() > 0 ? org.telegram.ui.Wallet.l0.o(x10.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        arrayList.add(j31.i(1, -14899731, -15431455, R.drawable.settings_account, org.telegram.messenger.id.M0(2131745494, null), org.telegram.messenger.id.M0(2131745493, null), null));
        arrayList.add(j31.i(2, -1007845, -1996271, R.drawable.settings_chat, org.telegram.messenger.id.M0(2131745490, null), org.telegram.messenger.id.M0(2131745489, null), null));
        arrayList.add(j31.i(3, -11154873, -14175180, R.drawable.settings_privacy, org.telegram.messenger.id.M0(2131745471, null), org.telegram.messenger.id.M0(2131745470, null), null));
        arrayList.add(j31.i(5, -765355, -2148011, R.drawable.settings_sounds, org.telegram.messenger.id.M0(2131745475, null), org.telegram.messenger.id.M0(2131745474, null), null));
        arrayList.add(j31.i(6, -11565578, -13276952, R.drawable.settings_data, org.telegram.messenger.id.M0(2131745488, null), org.telegram.messenger.id.M0(2131745487, null), null));
        arrayList.add(j31.i(7, -14899731, -15497247, R.drawable.settings_folders, org.telegram.messenger.id.M0(2131745481, null), org.telegram.messenger.id.M0(2131745480, null), null));
        arrayList.add(j31.i(8, -13451058, -14836538, R.drawable.settings_devices, org.telegram.messenger.id.M0(2131745485, null), org.telegram.messenger.id.M0(2131745484, null), null));
        arrayList.add(j31.i(9, -881871, -1940716, R.drawable.settings_power, org.telegram.messenger.id.M0(2131745473, null), org.telegram.messenger.id.M0(2131745472, null), null));
        arrayList.add(j31.i(10, -3903756, -6335009, R.drawable.settings_language, org.telegram.messenger.id.M0(2131745478, null), org.telegram.messenger.id.j0(), null));
        arrayList.add(org.telegram.ui.Components.y31.C(null));
        if (!z9 && ((org.telegram.messenger.h0) n31Var.getMessagesController().x7.j0.b).c) {
            org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(n31Var.currentAccount);
            int i28 = org.telegram.ui.ActionBar.l6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence M02 = org.telegram.messenger.id.M0(2131743194, null);
            int i29 = org.telegram.ui.Cells.m8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.m8.b(M02);
            }
            arrayList.add(j31.i(25, 0, 0, i28, M02, null, x11.v() > 0 ? org.telegram.ui.Wallet.l0.o(x11.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        if (!n31Var.getMessagesController().D3()) {
            arrayList.add(j31.i(11, -4826625, -10388225, R.drawable.settings_premium, org.telegram.messenger.id.M0(2131744231, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!n31Var.getMessagesController().j7) {
            bi.ea y10 = bi.ea.y(n31Var.currentAccount, false);
            arrayList.add(j31.i(12, -1071598, -1608430, R.drawable.settings_stars, org.telegram.messenger.id.M0(2131744215, null), null, (!y10.e || y10.p().amount <= 0) ? "" : bi.dd.M0(y10.p(), 0.85f, ' ')));
        }
        bi.ea.y(n31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        bi.ea y11 = bi.ea.y(n31Var.currentAccount, true);
        long j3 = y11.p().amount;
        String M03 = org.telegram.messenger.id.M0(2131749515, null);
        if (y11.e && j3 > 0) {
            charSequence3 = bi.dd.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(j31.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, M03, null, charSequence3));
        if (!n31Var.getMessagesController().D3()) {
            arrayList.add(j31.i(15, -765355, -2148011, R.drawable.settings_business, org.telegram.messenger.id.M0(2131744252, null), null, null));
        }
        if (!n31Var.getMessagesController().h7) {
            arrayList.add(j31.i(16, -816335, -1940716, R.drawable.settings_gift, org.telegram.messenger.id.M0(2131745639, null), null, null));
        }
        if (((org.telegram.ui.Components.y31) jg.g.i(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131745479, null)));
        arrayList.add(j31.i(17, -1007845, -1996271, R.drawable.settings_ask, org.telegram.messenger.id.M0(2131753986, null), null, null));
        arrayList.add(j31.i(18, -14965523, -15431455, R.drawable.settings_faq, org.telegram.messenger.id.M0(2131744242, null), null, null));
        arrayList.add(j31.i(23, -3903756, -6335009, R.drawable.settings_features, org.telegram.messenger.id.M0(2131744239, null), null, null));
        arrayList.add(j31.i(19, -11154873, -14175180, R.drawable.settings_policy, org.telegram.messenger.id.M0(2131746783, null), null, null));
        xi.a aVar = xi.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.y31.C(null));
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131745483, null)));
            arrayList.add(j31.i(24, -765355, -2148011, 0, org.telegram.messenger.id.M0(2131745985, null), null, null));
            arrayList.add(j31.i(26, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131753919, null), null, null));
            arrayList.add(j31.i(27, -12743701, -13996071, 0, org.telegram.messenger.id.M0(2131749330, null), null, null));
        }
        if (org.telegram.messenger.r2.a) {
            arrayList.add(org.telegram.ui.Components.y31.C(null));
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131745486, null)));
            arrayList.add(j31.i(20, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131751613, null), null, null));
            arrayList.add(j31.i(21, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131751614, null), null, null));
            arrayList.add(j31.i(22, -765355, -2148011, 0, org.telegram.messenger.id.M0(2131751650, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.y31.m(n31Var.M));
    }

    public static void h0(n31 n31Var, org.telegram.ui.Components.y31 y31Var) {
        Object obj = y31Var.G;
        int i7 = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                zc1.a(n31Var.getParentActivity(), new org.telegram.ui.Components.fx(25, n31Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.G1, n31Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (y31Var.H(h31.class)) {
            int i10 = y31Var.z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.O0(i10);
                return;
            }
            return;
        }
        int i11 = 0;
        if (y31Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = y31Var.G;
            if (obj2 instanceof vw0) {
                vw0 vw0Var = (vw0) obj2;
                org.telegram.ui.ActionBar.q4 parentLayout = n31Var.getParentLayout();
                vw0Var.b.run();
                org.telegram.messenger.g0.k3(parentLayout, vw0Var.c);
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                org.telegram.messenger.qs.f(n31Var.currentAccount).k(org.telegram.messenger.qs.c1, n31Var.f.E, ((org.telegram.messenger.cp) obj2).c);
            }
            Object obj3 = y31Var.G;
            if (obj3 != null) {
                n31Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (y31Var.d) {
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
                n31Var.k0(new bi.dd());
                break;
            case 13:
                n31Var.k0(new gi.f());
                break;
            case 15:
                n31Var.k0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                wg.f1.l1(0, org.telegram.messenger.v1.a(org.telegram.messenger.p10.s0).b());
                break;
            case 17:
                n31Var.showDialog(org.telegram.ui.Components.v4.R(n31Var, n31Var.resourceProvider));
                break;
            case 18:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                break;
            case 19:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
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
                if (!org.telegram.messenger.qp.s1(n31Var.currentAccount).v2()) {
                    vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131744238, null));
                    break;
                } else {
                    b.b(n31Var.currentAccount);
                    break;
                }
            case 24:
                n31Var.presentFragment(new az0(i11, bundle));
                break;
            case 25:
                n31Var.k0(new org.telegram.ui.Wallet.w5());
                break;
            case 26:
                n31Var.presentFragment(new az0(i7, bundle));
                break;
            case 27:
                p50 p50Var = new p50();
                p50Var.e = true;
                n31Var.presentFragment(p50Var);
                break;
        }
    }

    @Override // org.telegram.ui.ke0
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.j30
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.j30
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.Cells.b4 b4Var = this.r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.j30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.b = new v8(9, context, this);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.f0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745495, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 11));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.e5 p10 = this.simpleActionBar.p();
        org.telegram.ui.ActionBar.f5 b10 = p10.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new kg.v1(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.f5 b11 = p10.b(1, R.drawable.ic_ab_other);
        this.e = b11;
        b11.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.e.e(2, R.drawable.msg_leave, org.telegram.messenger.id.M0(2131748743, null));
        f31 f31Var = new f31(this, this, context);
        this.f = f31Var;
        f31Var.G();
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(this, new a5(this, 27), new e31(this), new e31(this));
        this.c = r41Var;
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.r41 r41Var2 = this.c;
        r41Var2.f3.r = false;
        r41Var2.r1();
        this.c.setSectionsDrawBackground(true);
        oi.a.e(this.c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.d0);
        this.c.setClipToPadding(false);
        this.c.j(new d21(this, i7));
        this.b.addView(this.c, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.b.addView(this.P, c8.ha.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(0, true, true);
        this.h = k30Var;
        k30Var.H = true;
        k30Var.a = this;
        k30Var.b = this;
        this.x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.D = k0Var;
        this.x.addView(k0Var, c8.ha.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.D.setOnClickListener(new d31(this, 5));
        c8.ka.a(this.D);
        this.x.addOnLayoutChangeListener(new og(this, i7));
        this.E = new g31(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.E.addView(this.y, c8.ha.e(90, 90, 51));
        v8 v8Var = this.b;
        v8Var.addView(this.E, v8Var.indexOfChild(this.c) + 1, c8.ha.c(-1.0f, -1));
        this.F = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.G = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.y.addView(this.G, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.r = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, c8.ha.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i10 = org.telegram.ui.ActionBar.l6.a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.l6.L(L, getThemedColor(i10));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.s6.j(frameLayout2, L2, M, null, resourceProvider);
        this.H.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i11 = org.telegram.ui.ActionBar.l6.Ci;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.l6.L(L3, getThemedColor(i11));
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i11);
        org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.s6.j(frameLayout3, L4, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(R.drawable.filled_premium_camera);
        this.I.addView(this.J, c8.ha.e(22, 22, 17));
        this.H.addView(this.I, c8.ha.c(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        v8 v8Var2 = this.b;
        v8Var2.addView(this.H, v8Var2.indexOfChild(this.E) + 1, c8.ha.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(org.telegram.messenger.g0.o());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView i12 = org.telegram.ui.Cells.f1.i(this.x, this.K, c8.ha.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = i12;
        i12.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView i13 = org.telegram.ui.Cells.f1.i(this.x, this.L, c8.ha.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = i13;
        i13.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(this.M, org.telegram.ui.ActionBar.l6.B6, getResourceProvider());
        this.M.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i14 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.ActionBar.s6.Q(textView3, org.telegram.ui.ActionBar.l6.h0(getThemedColor(i14), 2, -1), null, org.telegram.ui.ActionBar.s6.M(i14), getResourceProvider());
        this.M.setOnClickListener(new d31(this, 6));
        this.O = new View(context);
        o0(true, false);
        this.c.f3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i15 = this.mSystemInsets.b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        v8 v8Var3 = this.b;
        e31 e31Var = new e31(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(v8Var3, e31Var);
        v8 v8Var4 = this.b;
        this.fragmentView = v8Var4;
        return v8Var4;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.r41 r41Var;
        if (i7 == org.telegram.messenger.qs.y3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.r41 r41Var2 = this.c;
            if (r41Var2 != null) {
                r41Var2.f3.O(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.r) {
            m0(getUserConfig().f());
        } else {
            if (i7 != org.telegram.messenger.qs.s1 || (r41Var = this.c) == null) {
                return;
            }
            r41Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ yq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z9;
        if (this.N && (z9 = (y4Var = this.simpleActionBar).F) != this.f0) {
            this.f0 = z9;
            y4Var.setBackButtonImageAnimated(z9 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.id.M0(z9 ? 2131754878 : 2131746500, null));
        }
    }

    @Override // org.telegram.ui.ke0
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.f2 f2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.g0.Q1() || (launchActivity = LaunchActivity.G1) == null || (actionBarLayout = launchActivity.q0) == null) {
            presentFragment(f2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.d0((org.telegram.ui.ActionBar.f2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.o4 o4Var = new org.telegram.ui.ActionBar.o4(f2Var);
        o4Var.c = true;
        o4Var.g = true;
        actionBarLayout.U(o4Var);
    }

    public final void l0(float f10) {
        this.simpleActionBar.setTitlesAlpha(f10);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    public final void m0(TLRPC.User user) {
        String str;
        if (this.G != null && this.e0 == -1) {
            this.F.r(user);
            this.G.e(user, this.F);
            this.K.setText(org.telegram.messenger.t10.p(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(pf.b.c().b("+" + user.phone));
            }
            String n10 = org.telegram.messenger.t10.n(user);
            if (n10 != null) {
                sb2.append(" • @");
                sb2.append(n10);
            }
            this.L.setText(sb2);
            TextView textView = this.M;
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
                str2 = org.telegram.messenger.id.a0(null, null, 2131744210, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            textView.setText(str2);
        }
    }

    public final void n0(boolean z9, boolean z10) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z10) {
            if (z9) {
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
        if (z9) {
            this.r.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new b50(9, this, z9));
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
    public final void o0(boolean z9, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (!this.d.w()) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z11 = false;
            if (this.T == z11 || z9) {
                this.T = z11;
                valueAnimator = this.U;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.U = null;
                }
                if (z10) {
                    l0(z11 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z11 ? 1.0f : 0.0f);
                this.U = ofFloat;
                ofFloat.addUpdateListener(new jz0(this, 7));
                this.U.setInterpolator(org.telegram.ui.Components.xq.h);
                this.U.setDuration(420L);
                this.U.start();
                return;
            }
            return;
        }
        z11 = true;
        if (this.T == z11) {
        }
        this.T = z11;
        valueAnimator = this.U;
        if (valueAnimator != null) {
        }
        if (z10) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (!y4Var.F) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        y4Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.R;
        if (b0Var != null) {
            b0Var.b();
            this.R = null;
        }
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.e(), this);
        b0Var2.c(org.telegram.messenger.qs.r);
        b0Var2.c(org.telegram.messenger.qs.y3);
        b0Var2.c(org.telegram.messenger.qs.s1);
        this.R = b0Var2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        this.d0 = this.N ? org.telegram.messenger.g0.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.R;
        if (b0Var != null) {
            b0Var.b();
            this.R = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.m41 m41Var = this.c.f3;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    public final void p0() {
        if (this.E == null || this.y == null) {
            return;
        }
        float height = this.D.getHeight() / 2.0f;
        View view = this.D;
        float f10 = 1.0f;
        while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
            height += view.getY();
            f10 *= view.getAlpha();
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
        float f11 = 0.0f;
        for (View view2 = this.x; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
            f11 += view2.getY();
        }
        float paddingTop = (height - f11) + this.c.getPaddingTop();
        g31 g31Var = this.E;
        float f12 = -org.telegram.messenger.g0.L(16.0f);
        org.telegram.messenger.bs bsVar = g31Var.n;
        if (bsVar != null && bsVar.c) {
            f12 = bsVar.e.centerY();
        }
        float a10 = c8.j9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
        float max = Math.max(height, f12);
        this.Y = height;
        this.Z = paddingTop;
        this.a0 = f12;
        float L = org.telegram.messenger.g0.L(90.0f);
        float scaleX = this.D.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.E.getHiddenAvatarSizeDp()), L, a10) / L);
        float f13 = (L * scaleX) / 2.0f;
        float width = (this.E.getWidth() / 2.0f) - f13;
        if (max == this.V && scaleX == this.W && a10 == this.X && f10 == this.E.getAlpha() && width == this.y.getTranslationX()) {
            return;
        }
        this.V = max;
        this.W = scaleX;
        this.X = a10;
        this.E.setAlpha(f10);
        this.y.setScaleX(scaleX);
        this.y.setScaleY(scaleX);
        this.y.setTranslationX(width);
        float f14 = max - f13;
        this.y.setTranslationY(f14);
        this.H.setAlpha(c8.j9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
        this.H.setScaleX(scaleX);
        this.H.setScaleY(scaleX);
        this.H.setTranslationX((org.telegram.messenger.g0.L(60.0f) * scaleX) + width);
        this.H.setTranslationY((org.telegram.messenger.g0.L(60.0f) * scaleX) + f14);
        this.E.setHideProgress(1.0f - a10);
    }

    public final void q0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.ke0
    public final void v() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public n31(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, org.telegram.ui.Components.xq.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.b0 = new ArrayList();
        this.e0 = -1;
        this.f0 = true;
    }

    @Override // org.telegram.ui.Components.j30
    public final /* synthetic */ void T() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
