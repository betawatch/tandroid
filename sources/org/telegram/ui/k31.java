package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class k31 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public e31 E;
    public org.telegram.ui.Components.kj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.f4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.c Q;
    public final n7.a1 a;
    public final org.telegram.ui.ActionBar.f4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public j31 f;
    public org.telegram.ui.Components.lc0 h;
    public org.telegram.ui.Components.lc0 n;
    public org.telegram.ui.Components.lc0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public t50 w;
    public bi.n7 x;
    public org.telegram.ui.Components.w9 y;

    static {
        a0.f fVar = new a0.f(0);
        R = fVar;
        fVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        fVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        fVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        fVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        fVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        fVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        fVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        fVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        fVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        fVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        fVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        fVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        fVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        fVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        fVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        fVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        fVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        fVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        T = true;
    }

    public k31(Bundle bundle) {
        super(bundle);
        this.a = new n7.a1(this, 10);
        org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount);
        f4Var.e = "🏠";
        f4Var.c = eg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
        e4Var.a = org.telegram.ui.ActionBar.j6.N0("Blue");
        e4Var.e = 99;
        f4Var.f.add(e4Var);
        org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
        e4Var2.a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        e4Var2.e = 0;
        f4Var.f.add(e4Var2);
        this.b = f4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.lc0();
        this.J = f4Var;
        this.O = -1;
        this.Q = i0.c.e;
    }

    public static /* synthetic */ void U(k31 k31Var) {
        if (k31Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || k31Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(k31Var);
        } else {
            k31Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void V(k31 k31Var) {
        T = false;
        List list = S;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(k31Var.currentAccount).requestAllChatThemes(new z21(k31Var), true);
        } else {
            k31Var.c0(S);
        }
    }

    public static void W(k31 k31Var, boolean z10, org.telegram.ui.ActionBar.f4 f4Var, org.telegram.ui.ActionBar.e5 e5Var) {
        n7.a1 a1Var = k31Var.a;
        if (z10) {
            a1Var.b = f4Var.b(((k31) a1Var.c).currentAccount, k31Var.K ? 1 : 0);
        } else {
            a1Var.b = k31Var.J.b(((k31) a1Var.c).currentAccount, k31Var.K ? 1 : 0);
        }
        e5Var.h = new w21(k31Var, 3);
        ((ActionBarLayout) k31Var.parentLayout).f(e5Var, null);
        LinearLayout linearLayout = k31Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void X(k31 k31Var) {
        k31Var.b.n(k31Var.currentAccount);
        View view = k31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new w21(k31Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        u9.e0(p2Var.getParentActivity(), 1, new a31(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.f4 f4Var, boolean z10) {
        if (!z10) {
            return this.H;
        }
        String str = f4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) R.get(f4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.lc0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(f4Var.e, bitmap);
        }
        return bitmap;
    }

    public final void c0(List list) {
        if (list == null || list.isEmpty() || this.f == null) {
            return;
        }
        list.set(0, this.b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i10);
            f4Var.n(this.currentAccount);
            org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(f4Var);
            boolean z10 = this.K;
            rpVar.c = z10 ? 1 : 0;
            rpVar.e = b0(f4Var, z10);
            arrayList.add(rpVar);
        }
        org.telegram.ui.Components.qp qpVar = this.f.b;
        qpVar.d = arrayList;
        qpVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (eg.b.a(((org.telegram.ui.Components.rp) arrayList.get(i11)).a.c, this.J.c)) {
                    this.f.K = (org.telegram.ui.Components.rp) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        j31 j31Var = this.f;
        h31 h31Var = j31Var.F;
        h31Var.setAlpha(0.0f);
        h31Var.animate().alpha(1.0f).setDuration(150L).start();
        h31Var.setVisibility(0);
        org.telegram.ui.Components.a10 a10Var = j31Var.r;
        a10Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.yo(a10Var)).setDuration(150L).start();
        org.telegram.ui.Components.vl0 vl0Var = j31Var.y;
        vl0Var.setAlpha(0.0f);
        vl0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        if (r12 != 1) goto L46;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j3;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.g9 g9Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.g9 g9Var2;
        ImageLocation imageLocation4;
        char c10;
        String str3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.K = org.telegram.ui.ActionBar.j6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.C(-1, false);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, context, 2);
        t50 t50Var = new t50(this, context, 7);
        this.w = t50Var;
        r0Var.addView(t50Var);
        if (this.L != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
            if (user != null) {
                str = UserObject.getPublicUsername(user);
                if (str == null) {
                    str2 = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        for (int i12 = 0; i12 < privacyRules.size(); i12++) {
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                c10 = 0;
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                c10 = 1;
                                break;
                            }
                        }
                        c10 = 2;
                        if (c10 == 2) {
                            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
                            if (privacyRules2 != null && privacyRules2.size() != 0) {
                                for (int i13 = 0; i13 < privacyRules2.size(); i13++) {
                                    TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i13);
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                                        break;
                                    }
                                    if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                        break;
                                    }
                                }
                            }
                            str3 = user.phone;
                            if (str3 != null && !str3.startsWith("+")) {
                                str3 = "+".concat(str3);
                            }
                            str = str3;
                            z10 = true;
                        }
                        if (c10 != 0) {
                        }
                        str3 = user.phone;
                        if (str3 != null) {
                            str3 = "+".concat(str3);
                        }
                        str = str3;
                        z10 = true;
                    }
                    z10 = false;
                    z11 = true;
                    g9Var2 = new org.telegram.ui.Components.g9(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j3 = 0;
                    str2 = null;
                    z10 = false;
                }
                z11 = false;
                g9Var2 = new org.telegram.ui.Components.g9(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j3 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                g9Var2 = null;
                imageLocation4 = null;
                z10 = false;
                z11 = false;
            }
            imageLocation = imageLocation3;
            g9Var = g9Var2;
            imageLocation2 = imageLocation4;
        } else {
            j3 = 0;
            if (this.M == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.M))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                g9Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.g9 g9Var3 = new org.telegram.ui.Components.g9(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                g9Var = g9Var3;
                imageLocation2 = forChat;
            }
            z10 = false;
            z11 = false;
        }
        e31 e31Var = new e31(context);
        this.E = e31Var;
        e31Var.a.n(-9324972, -13856649, -6636738, -9915042);
        e31Var.invalidate();
        String q6 = str != null ? a4.a.q(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        e31 e31Var2 = this.E;
        if (str2 != null) {
            str = str2;
        }
        e31Var2.c(q6, str, z10, z11);
        e31 e31Var3 = this.E;
        e31Var3.e = new v21(this);
        r0Var.addView(e31Var3);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.F = kj0Var;
        kj0Var.setAutoRepeat(true);
        this.F.f(R.raw.plane_logo_plain, 60, 60, null);
        this.F.d();
        r0Var.addView(this.F);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.y = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        r0Var.addView(this.y, w7.a6.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", g9Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.G.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.G.setImageResource(R.drawable.ic_ab_back);
        this.G.setScaleType(ImageView.ScaleType.CENTER);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y21
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        k31 k31Var = this.b;
                        k31Var.f.s.setClickable(false);
                        k31Var.g0();
                        break;
                    default:
                        k31.U(this.b);
                        break;
                }
            }
        });
        r0Var.addView(this.G, w7.a6.c(34.0f, 34));
        this.H = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.H);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.H.getWidth(), this.H.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.H.getWidth() - r6.getWidth()) * 0.5f, (this.H.getHeight() - r6.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        j31 j31Var = new j31(this, this, getParentActivity().getWindow());
        this.f = j31Var;
        this.x = j31Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(j31Var, NotificationCenter.emojiLoaded);
        j31 j31Var2 = this.f;
        j31Var2.J = new v21(this);
        j31Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y21
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        k31 k31Var = this.b;
                        k31Var.f.s.setClickable(false);
                        k31Var.g0();
                        break;
                    default:
                        k31.U(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y21
                public final /* synthetic */ k31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        case 1:
                            k31 k31Var = this.b;
                            k31Var.f.s.setClickable(false);
                            k31Var.g0();
                            break;
                        default:
                            k31.U(this.b);
                            break;
                    }
                }
            });
        }
        r0Var.addView(this.x, w7.a6.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = r0Var;
        Utilities.themeQueue.postRunnable(new w21(this, 4), 25L);
        this.fragmentView.postDelayed(new w21(this, 5), T ? 250L : j3);
        this.N = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
        View view = this.fragmentView;
        v21 v21Var = new v21(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view, v21Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.f4 f4Var, boolean z10) {
        float f7;
        this.O = i10;
        org.telegram.ui.ActionBar.f4 f4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = f4Var;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.lc0 lc0Var = this.h;
        this.n = lc0Var;
        lc0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.lc0 lc0Var2 = new org.telegram.ui.Components.lc0();
        this.h = lc0Var2;
        lc0Var2.setCallback(this.w);
        this.h.n(e4Var.k, e4Var.l, e4Var.m, e4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.lc0 lc0Var3 = this.h;
        lc0Var3.N = true;
        org.telegram.ui.Components.lc0 lc0Var4 = this.n;
        if (lc0Var4 != null) {
            lc0Var3.h = lc0Var4.h;
        }
        this.E.a.h = lc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        int i11 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.lc0 lc0Var5 = this.h;
            lc0Var5.t(lc0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.x21
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    k31 k31Var = k31.this;
                    long i12 = k31Var.J.i(z11 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((cg.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    k31Var.e0(k31Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(Throwable th2) {
                    org.telegram.tgnet.o.a(this, th2);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.o.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new w21(this, i11), 35L);
        }
        org.telegram.ui.Components.lc0 lc0Var6 = this.h;
        lc0Var6.u(lc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f4Var.e);
        sb2.append(z11 ? "n" : "d");
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.lc0 lc0Var7 = this.h;
            lc0Var7.K = 0.0f;
            lc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new gg.t1(21, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.vv0(10, this, iArr));
            this.s.setDuration((int) (f7 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                e31 e31Var = this.E;
                e31Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                e31Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(null, (this.K ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0()).Y, this.K, !z10);
        e5Var.f = false;
        e5Var.e = true;
        e5Var.m = this.a;
        e5Var.l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new bi.g2(this, z10, f4Var2, e5Var, 27));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z10) {
                this.h.s(1.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new f21(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f7 = min;
        if ((max * 1.0f) / f7 > 1.92f) {
            max = (int) (f7 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        e31 e31Var = this.E;
        if (e31Var != null) {
            e31Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.F.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
        if (this.I != null) {
            canvas.drawBitmap(this.I, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        e31 e31Var2 = this.E;
        if (e31Var2 != null) {
            e31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new w21(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.c;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        j31 j31Var = this.f;
        j31Var.getClass();
        i31 i31Var = new i31(j31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = j31Var.a;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{j31Var.f}, i31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j31Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j31Var.y, 16, new Class[]{org.telegram.ui.Components.i21.class}, null, null, null, org.telegram.ui.ActionBar.j6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).o = j31Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        zy0 zy0Var = new zy0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, zy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, zy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f.x, 8, null, null, null, zy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.L = this.arguments.getLong("user_id");
        this.M = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        a0.f fVar;
        j31 j31Var = this.f;
        j31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(j31Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i10++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new v21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
    }
}
