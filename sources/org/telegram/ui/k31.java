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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k31 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30, ie0, te.b {
    public k0 E;
    public d31 F;
    public org.telegram.ui.Components.t8 G;
    public org.telegram.ui.Components.i9 H;
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
    public v8 b;
    public float b0;
    public org.telegram.ui.Components.u41 c;
    public final ArrayList c0;
    public org.telegram.ui.ActionBar.d5 d;
    public int d0;
    public org.telegram.ui.ActionBar.d5 e;
    public int e0;
    public c31 f;
    public int f0;
    public boolean g0;
    public org.telegram.ui.Components.m30 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.b4 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public k31() {
        this(null);
    }

    public static boolean Z(k31 k31Var, org.telegram.ui.Components.b41 b41Var, View view) {
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ki.x2.n(k31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new y21(k31Var, 2));
            return true;
        }
        if (b41Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = b41Var.G;
            String str = obj2 instanceof rw0 ? ((rw0) obj2).h : obj2 instanceof org.telegram.messenger.zo ? ((org.telegram.messenger.zo) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(k31Var, view);
                H.c(R.drawable.msg_link2, org.telegram.messenger.hd.M0(2131751762, null), new fy0(5, k31Var, str), false);
                H.W(k31Var.c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a0(k31 k31Var) {
        TLRPC.User a22 = org.telegram.messenger.np.s1(k31Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(k31Var.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(k31Var.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.m30 m30Var = k31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        m30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new y21(k31Var, 0), new hi.f1(6), 0);
    }

    public static void b0(k31 k31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, k31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(k31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.fk(b02.e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static /* synthetic */ void c0(k31 k31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(k31Var.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(k31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new a31(0, k31Var, tL_attachMenuBot), 66);
    }

    public static void d0(k31 k31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        k31Var.f0 = -1;
        if (tL_error == null) {
            TLRPC.User a22 = k31Var.getMessagesController().a2(Long.valueOf(k31Var.getUserConfig().e()));
            if (a22 == null) {
                a22 = k31Var.getUserConfig().f();
                if (a22 == null) {
                    return;
                } else {
                    k31Var.getMessagesController().X3(a22, false, false);
                }
            } else {
                k31Var.getUserConfig().w(a22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.ns.g2, false, null, false);
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
            if (w10 != null && k31Var.s != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                org.telegram.messenger.w7.J(k31Var.s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k31Var.s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(k31Var.s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.gc.m(k31Var.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && k31Var.w != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                org.telegram.messenger.w7.J(k31Var.w, null, true, true).renameTo(J2);
            }
            k31Var.getMessagesController().U0(a22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            k31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = k31Var.getMessagesController().b2(k31Var.getUserConfig().e());
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                k31Var.getMessagesStorage().j2(b22, false);
            }
            k31Var.m0(a22);
        }
        k31Var.s = null;
        k31Var.w = null;
        k31Var.n0(false, true);
        k31Var.getNotificationCenter().k(org.telegram.messenger.ns.r, Integer.valueOf(org.telegram.messenger.np.D8));
        k31Var.getNotificationCenter().k(org.telegram.messenger.ns.j0, new Object[0]);
        k31Var.getUserConfig().v(true);
    }

    public static /* synthetic */ void e0(k31 k31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            k31Var.s = fileLocation;
            k31Var.w = photoSize2.location;
            k31Var.H.j(org.telegram.messenger.gc.e(fileLocation), "90_90", k31Var.G, null);
            k31Var.n0(true, false);
        } else {
            if (k31Var.s == null) {
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
            k31Var.f0 = k31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new a31(1, k31Var, str));
        }
        k31Var.simpleActionBar.r().requestLayout();
    }

    public static void f0(k31 k31Var, ArrayList arrayList) {
        int i7;
        int i10 = 0;
        if (k31Var.d.x()) {
            arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            c31 c31Var = k31Var.f;
            ArrayList arrayList2 = c31Var.d;
            ArrayList arrayList3 = c31Var.w;
            if (c31Var.x) {
                ArrayList arrayList4 = c31Var.r;
                int size = arrayList4.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    int i13 = i11 + 1;
                    CharSequence charSequence = (CharSequence) c31Var.n.get(i11);
                    int i14 = org.telegram.ui.Cells.s6.b;
                    org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                    K.l = charSequence;
                    K.G = (rw0) obj;
                    arrayList.add(K);
                    i11 = i13;
                }
                if (c31Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745482, null)));
                ArrayList arrayList5 = c31Var.s;
                int size2 = arrayList5.size();
                while (i10 < size2) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    int i15 = i11 + 1;
                    CharSequence charSequence2 = (CharSequence) c31Var.n.get(i11);
                    int i16 = org.telegram.ui.Cells.s6.b;
                    org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                    K2.l = charSequence2;
                    K2.G = (org.telegram.messenger.zo) obj2;
                    arrayList.add(K2);
                    i11 = i15;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745469, null)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof rw0) {
                        rw0 rw0Var = (rw0) obj3;
                        String str = rw0Var.a;
                        int i18 = org.telegram.ui.Cells.s6.b;
                        org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                        K3.l = str;
                        K3.G = rw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.zo) {
                        org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) obj3;
                        String str2 = zoVar.a;
                        int i19 = org.telegram.ui.Cells.s6.b;
                        org.telegram.ui.Components.b41 K4 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                        K4.l = str2;
                        K4.G = zoVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745482, null)));
            int size4 = arrayList2.size();
            while (i10 < size4) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                org.telegram.messenger.zo zoVar2 = (org.telegram.messenger.zo) obj4;
                String str3 = zoVar2.a;
                int i20 = org.telegram.ui.Cells.s6.b;
                org.telegram.ui.Components.b41 K5 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                K5.l = str3;
                K5.G = zoVar2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.b41.n(k31Var.x, org.telegram.messenger.ns.S2));
        k31Var.c0.clear();
        int i21 = 0;
        while (true) {
            i7 = 4;
            if (i21 >= 4) {
                break;
            }
            if (org.telegram.messenger.m10.i(i21).p() && k31Var.currentAccount != i21) {
                k31Var.c0.add(Integer.valueOf(i21));
            }
            i21++;
        }
        int i22 = 2;
        Collections.sort(k31Var.c0, new qv0(i22));
        Set set = k31Var.getMessagesController().T3;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(i31.i(org.telegram.messenger.hd.M0(2131749526, null), org.telegram.messenger.hd.M0(2131749527, null), null, null, org.telegram.messenger.hd.M0(2131749528, null), new z21(k31Var, i10)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && k31Var.getUserConfig().f() != null) {
            arrayList.add(i31.i(org.telegram.messenger.hd.a0(null, null, 2131752156, org.telegram.messenger.k5.h(new StringBuilder("+"), k31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752155, null), new y21(k31Var, i23)), org.telegram.messenger.hd.M0(2131752153, null), new z21(k31Var, i23), di.c6.h2(org.telegram.messenger.hd.M0(2131752151, null)), new z21(k31Var, i22)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(i31.i(org.telegram.messenger.hd.M0(2131742803, null), org.telegram.messenger.hd.M0(2131742802, null), org.telegram.messenger.hd.M0(2131742801, null), new z21(k31Var, 3), org.telegram.messenger.hd.M0(2131742800, null), new z21(k31Var, i7)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (k31Var.c0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745492, null)));
            for (int i24 = 0; i24 < k31Var.c0.size(); i24++) {
                int intValue = ((Integer) k31Var.c0.get(i24)).intValue();
                int i25 = e31.b;
                org.telegram.ui.Components.b41 K6 = org.telegram.ui.Components.b41.K(e31.class);
                K6.d = i24;
                K6.z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        boolean z10 = k31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z10 && ((org.telegram.messenger.h0) k31Var.getMessagesController().y7.j0.b).c) {
            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(k31Var.currentAccount);
            int i26 = org.telegram.ui.ActionBar.j6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence M0 = org.telegram.messenger.hd.M0(2131743194, null);
            int i27 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.l8.b(M0);
            }
            arrayList.add(g31.i(25, 0, 0, i26, M0, null, x10.v() > 0 ? org.telegram.ui.Wallet.l0.o(x10.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        arrayList.add(g31.i(1, -14899731, -15431455, R.drawable.settings_account, org.telegram.messenger.hd.M0(2131745494, null), org.telegram.messenger.hd.M0(2131745493, null), null));
        arrayList.add(g31.i(2, -1007845, -1996271, R.drawable.settings_chat, org.telegram.messenger.hd.M0(2131745490, null), org.telegram.messenger.hd.M0(2131745489, null), null));
        arrayList.add(g31.i(3, -11154873, -14175180, R.drawable.settings_privacy, org.telegram.messenger.hd.M0(2131745471, null), org.telegram.messenger.hd.M0(2131745470, null), null));
        arrayList.add(g31.i(5, -765355, -2148011, R.drawable.settings_sounds, org.telegram.messenger.hd.M0(2131745475, null), org.telegram.messenger.hd.M0(2131745474, null), null));
        arrayList.add(g31.i(6, -11565578, -13276952, R.drawable.settings_data, org.telegram.messenger.hd.M0(2131745488, null), org.telegram.messenger.hd.M0(2131745487, null), null));
        arrayList.add(g31.i(7, -14899731, -15497247, R.drawable.settings_folders, org.telegram.messenger.hd.M0(2131745481, null), org.telegram.messenger.hd.M0(2131745480, null), null));
        arrayList.add(g31.i(8, -13451058, -14836538, R.drawable.settings_devices, org.telegram.messenger.hd.M0(2131745485, null), org.telegram.messenger.hd.M0(2131745484, null), null));
        arrayList.add(g31.i(9, -881871, -1940716, R.drawable.settings_power, org.telegram.messenger.hd.M0(2131745473, null), org.telegram.messenger.hd.M0(2131745472, null), null));
        arrayList.add(g31.i(10, -3903756, -6335009, R.drawable.settings_language, org.telegram.messenger.hd.M0(2131745478, null), org.telegram.messenger.hd.j0(), null));
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        if (!z10 && ((org.telegram.messenger.h0) k31Var.getMessagesController().y7.j0.b).c) {
            org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(k31Var.currentAccount);
            int i28 = org.telegram.ui.ActionBar.j6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence M02 = org.telegram.messenger.hd.M0(2131743194, null);
            int i29 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.l8.b(M02);
            }
            arrayList.add(g31.i(25, 0, 0, i28, M02, null, x11.v() > 0 ? org.telegram.ui.Wallet.l0.o(x11.v(), false) : null));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (!k31Var.getMessagesController().D3()) {
            arrayList.add(g31.i(11, -4826625, -10388225, R.drawable.settings_premium, org.telegram.messenger.hd.M0(2131744231, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!k31Var.getMessagesController().k7) {
            di.v8 y10 = di.v8.y(k31Var.currentAccount, false);
            arrayList.add(g31.i(12, -1071598, -1608430, R.drawable.settings_stars, org.telegram.messenger.hd.M0(2131744215, null), null, (!y10.e || y10.p().amount <= 0) ? "" : di.mb.M0(y10.p(), 0.85f, ' ')));
        }
        di.v8.y(k31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        di.v8 y11 = di.v8.y(k31Var.currentAccount, true);
        long j3 = y11.p().amount;
        String M03 = org.telegram.messenger.hd.M0(2131749515, null);
        if (y11.e && j3 > 0) {
            charSequence3 = di.mb.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(g31.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, M03, null, charSequence3));
        if (!k31Var.getMessagesController().D3()) {
            arrayList.add(g31.i(15, -765355, -2148011, R.drawable.settings_business, org.telegram.messenger.hd.M0(2131744252, null), null, null));
        }
        if (!k31Var.getMessagesController().i7) {
            arrayList.add(g31.i(16, -816335, -1940716, R.drawable.settings_gift, org.telegram.messenger.hd.M0(2131745639, null), null, null));
        }
        if (((org.telegram.ui.Components.b41) i5.c.h(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745479, null)));
        arrayList.add(g31.i(17, -1007845, -1996271, R.drawable.settings_ask, org.telegram.messenger.hd.M0(2131753986, null), null, null));
        arrayList.add(g31.i(18, -14965523, -15431455, R.drawable.settings_faq, org.telegram.messenger.hd.M0(2131744242, null), null, null));
        arrayList.add(g31.i(23, -3903756, -6335009, R.drawable.settings_features, org.telegram.messenger.hd.M0(2131744239, null), null, null));
        arrayList.add(g31.i(19, -11154873, -14175180, R.drawable.settings_policy, org.telegram.messenger.hd.M0(2131746783, null), null, null));
        aj.a aVar = aj.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745483, null)));
            arrayList.add(g31.i(24, -765355, -2148011, 0, org.telegram.messenger.hd.M0(2131745985, null), null, null));
            arrayList.add(g31.i(26, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131753919, null), null, null));
            arrayList.add(g31.i(27, -12743701, -13996071, 0, org.telegram.messenger.hd.M0(2131749330, null), null, null));
        }
        if (org.telegram.messenger.r2.a) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745486, null)));
            arrayList.add(g31.i(20, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131751613, null), null, null));
            arrayList.add(g31.i(21, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131751614, null), null, null));
            arrayList.add(g31.i(22, -765355, -2148011, 0, org.telegram.messenger.hd.M0(2131751650, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.b41.m(k31Var.N));
    }

    public static void h0(k31 k31Var, org.telegram.ui.Components.b41 b41Var) {
        Object obj = b41Var.G;
        int i7 = 0;
        int i10 = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                wc1.a(k31Var.getParentActivity(), new x21(i7, k31Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.H1, k31Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (b41Var.H(e31.class)) {
            int i11 = b41Var.z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
                return;
            }
            return;
        }
        if (b41Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = b41Var.G;
            if (obj2 instanceof rw0) {
                rw0 rw0Var = (rw0) obj2;
                org.telegram.ui.ActionBar.o4 parentLayout = k31Var.getParentLayout();
                rw0Var.b.run();
                org.telegram.messenger.g0.k3(parentLayout, rw0Var.c);
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                org.telegram.messenger.ns.f(k31Var.currentAccount).k(org.telegram.messenger.ns.c1, k31Var.f.F, ((org.telegram.messenger.zo) obj2).c);
            }
            Object obj3 = b41Var.G;
            if (obj3 != null) {
                k31Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (b41Var.d) {
            case 1:
                k31Var.k0(new UserInfoActivity());
                break;
            case 2:
                k31Var.k0(new ThemeActivity(0));
                break;
            case 3:
                k31Var.k0(new PrivacySettingsActivity());
                break;
            case 5:
                k31Var.k0(new NotificationsSettingsActivity());
                break;
            case 6:
                k31Var.k0(new DataSettingsActivity());
                break;
            case 7:
                k31Var.k0(new FiltersSetupActivity());
                break;
            case 8:
                k31Var.k0(new SessionsActivity(0));
                break;
            case 9:
                k31Var.k0(new x90());
                break;
            case 10:
                k31Var.k0(new LanguageSelectActivity());
                break;
            case 11:
                k31Var.k0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                k31Var.k0(new di.mb());
                break;
            case 13:
                k31Var.k0(new ii.f());
                break;
            case 15:
                k31Var.k0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                wg.c1.l1(0, org.telegram.messenger.v1.a(org.telegram.messenger.m10.t0).b());
                break;
            case 17:
                k31Var.showDialog(org.telegram.ui.Components.t4.R(k31Var, k31Var.resourceProvider));
                break;
            case 18:
                vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                break;
            case 19:
                vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                break;
            case 20:
                ProfileActivity.X4(k31Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.X4(k31Var.getParentActivity(), true);
                break;
            case 22:
                org.telegram.messenger.a8.a();
                break;
            case 23:
                if (!org.telegram.messenger.np.s1(k31Var.currentAccount).v2()) {
                    vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131744238, null));
                    break;
                } else {
                    b.b(k31Var.currentAccount);
                    break;
                }
            case 24:
                k31Var.presentFragment(new vy0(i7, bundle));
                break;
            case 25:
                k31Var.k0(new org.telegram.ui.Wallet.y5());
                break;
            case 26:
                k31Var.presentFragment(new vy0(i10, bundle));
                break;
            case 27:
                m50 m50Var = new m50();
                m50Var.e = true;
                k31Var.presentFragment(m50Var);
                break;
        }
    }

    @Override // org.telegram.ui.ie0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.b = new v8(9, context, this);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745495, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 12));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        org.telegram.ui.ActionBar.d5 b10 = r10.b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new kg.x1(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.d5 b11 = r10.b(1, R.drawable.ic_ab_other);
        this.e = b11;
        b11.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        this.e.e(2, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748743, null));
        c31 c31Var = new c31(this, this, context);
        this.f = c31Var;
        c31Var.G();
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new a5(this, 27), new b31(this), new b31(this));
        this.c = u41Var;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.u41 u41Var2 = this.c;
        u41Var2.g3.r = false;
        u41Var2.r1();
        this.c.setSectionsDrawBackground(true);
        ri.a.e(this.c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new y11(this, i7));
        this.b.addView(this.c, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, c8.ja.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, c8.ja.e(-1, -2, 55));
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
        this.h = m30Var;
        m30Var.I = true;
        m30Var.a = this;
        m30Var.b = this;
        this.x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.E = k0Var;
        this.x.addView(k0Var, c8.ja.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new z21(this, 5));
        c8.na.a(this.E);
        this.x.addOnLayoutChangeListener(new lg(this, i7));
        this.F = new d31(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, c8.ja.e(90, 90, 51));
        v8 v8Var = this.b;
        v8Var.addView(this.F, v8Var.indexOfChild(this.c) + 1, c8.ja.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.H = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.y.addView(this.H, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.r = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, c8.ja.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, getThemedColor(i10));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, resourceProvider);
        this.I.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.j6.L(L3, getThemedColor(i11));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.q6.j(frameLayout3, L4, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(R.drawable.filled_premium_camera);
        this.J.addView(this.K, c8.ja.e(22, 22, 17));
        this.I.addView(this.J, c8.ja.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        v8 v8Var2 = this.b;
        v8Var2.addView(this.I, v8Var2.indexOfChild(this.F) + 1, c8.ja.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView k10 = org.telegram.ui.Cells.y0.k(this.x, this.L, c8.ja.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = k10;
        k10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView k11 = org.telegram.ui.Cells.y0.k(this.x, this.M, c8.ja.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = k11;
        k11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.N, org.telegram.ui.ActionBar.j6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.q6.M(i12), getResourceProvider());
        this.N.setOnClickListener(new z21(this, 6));
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
        v8 v8Var3 = this.b;
        b31 b31Var = new b31(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(v8Var3, b31Var);
        v8 v8Var4 = this.b;
        this.fragmentView = v8Var4;
        return v8Var4;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.u41 u41Var;
        if (i7 == org.telegram.messenger.ns.y3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.u41 u41Var2 = this.c;
            if (u41Var2 != null) {
                u41Var2.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.r) {
            m0(getUserConfig().f());
        } else {
            if (i7 != org.telegram.messenger.ns.s1 || (u41Var = this.c) == null) {
                return;
            }
            u41Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.w4 w4Var;
        boolean z10;
        if (this.O && (z10 = (w4Var = this.simpleActionBar).G) != this.g0) {
            this.g0 = z10;
            w4Var.setBackButtonImageAnimated(z10 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.M0(z10 ? 2131754878 : 2131746500, null));
        }
    }

    @Override // org.telegram.ui.ie0
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.e2 e2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!org.telegram.messenger.g0.Q1() || (launchActivity = LaunchActivity.H1) == null || (actionBarLayout = launchActivity.r0) == null) {
            presentFragment(e2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.d0((org.telegram.ui.ActionBar.e2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.m4 m4Var = new org.telegram.ui.ActionBar.m4(e2Var);
        m4Var.c = true;
        m4Var.g = true;
        actionBarLayout.U(m4Var);
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
            this.L.setText(org.telegram.messenger.q10.p(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(pf.b.c().b("+" + user.phone));
            }
            String n10 = org.telegram.messenger.q10.n(user);
            if (n10 != null) {
                sb2.append(" • @");
                sb2.append(n10);
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
                str2 = org.telegram.messenger.hd.a0(null, null, 2131744210, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
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
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new z20(10, this, z10));
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
                ofFloat.addUpdateListener(new ez0(this, 7));
                this.V.setInterpolator(org.telegram.ui.Components.er.h);
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (!w4Var.G) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        w4Var.m(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ns.e(), this);
        eVar2.c(org.telegram.messenger.ns.r);
        eVar2.c(org.telegram.messenger.ns.y3);
        eVar2.c(org.telegram.messenger.ns.s1);
        this.S = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        this.e0 = this.O ? org.telegram.messenger.g0.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.p41 p41Var = this.c.g3;
        if (p41Var != null) {
            p41Var.O(false);
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
        d31 d31Var = this.F;
        float f12 = -org.telegram.messenger.g0.L(16.0f);
        org.telegram.messenger.yr yrVar = d31Var.n;
        if (yrVar != null && yrVar.c) {
            f12 = yrVar.e.centerY();
        }
        float a10 = c8.i9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
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
        this.I.setAlpha(c8.i9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
        this.I.setScaleX(scaleX);
        this.I.setScaleY(scaleX);
        this.I.setTranslationX((org.telegram.messenger.g0.L(60.0f) * scaleX) + width);
        this.I.setTranslationY((org.telegram.messenger.g0.L(60.0f) * scaleX) + f14);
        this.F.setHideProgress(1.0f - a10);
    }

    public final void q0() {
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.d.W();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public k31(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, org.telegram.ui.Components.er.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
