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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class o21 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f O;
    public static List P;
    public static boolean Q;
    public j21 B;
    public org.telegram.ui.Components.lj0 C;
    public ImageView D;
    public Bitmap E;
    public Bitmap F;
    public org.telegram.ui.ActionBar.f4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public i0.b N;
    public final n7.qa a;
    public final org.telegram.ui.ActionBar.f4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public n21 f;
    public org.telegram.ui.Components.fc0 h;
    public org.telegram.ui.Components.fc0 n;
    public org.telegram.ui.Components.fc0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public iw0 w;
    public ag.l x;
    public org.telegram.ui.Components.p9 y;

    static {
        a0.f fVar = new a0.f(0);
        O = fVar;
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
        Q = true;
    }

    public o21(Bundle bundle) {
        super(bundle);
        this.a = new n7.qa(this);
        org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount);
        f4Var.e = "🏠";
        f4Var.c = tf.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
        e4Var.a = org.telegram.ui.ActionBar.k6.N0("Blue");
        e4Var.e = 99;
        f4Var.f.add(e4Var);
        org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
        e4Var2.a = org.telegram.ui.ActionBar.k6.N0("Dark Blue");
        e4Var2.e = 0;
        f4Var.f.add(e4Var2);
        this.b = f4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.fc0();
        this.G = f4Var;
        this.L = -1;
        this.N = i0.b.e;
    }

    public static /* synthetic */ void U(o21 o21Var) {
        if (o21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || o21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(o21Var);
        } else {
            o21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void V(o21 o21Var) {
        Q = false;
        List list = P;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(o21Var.currentAccount).requestAllChatThemes(new e21(o21Var), true);
        } else {
            o21Var.c0(P);
        }
    }

    public static void W(o21 o21Var, boolean z4, org.telegram.ui.ActionBar.f4 f4Var, org.telegram.ui.ActionBar.e5 e5Var) {
        n7.qa qaVar = o21Var.a;
        if (z4) {
            qaVar.b = f4Var.b(((o21) qaVar.c).currentAccount, o21Var.H ? 1 : 0);
        } else {
            qaVar.b = o21Var.G.b(((o21) qaVar.c).currentAccount, o21Var.H ? 1 : 0);
        }
        e5Var.h = new b21(o21Var, 3);
        ((ActionBarLayout) o21Var.parentLayout).f(e5Var, null);
        LinearLayout linearLayout = o21Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.a6.b(o21Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void X(o21 o21Var) {
        o21Var.b.n(o21Var.currentAccount);
        View view = o21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new b21(o21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        v9.e0(p2Var.getParentActivity(), 1, new f21(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.f4 f4Var, boolean z4) {
        if (!z4) {
            return this.E;
        }
        String str = f4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.E.getWidth(), this.E.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) O.get(f4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.fc0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.E, 0.0f, 0.0f, (Paint) null);
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
            org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
            boolean z4 = this.H;
            lpVar.c = z4 ? 1 : 0;
            lpVar.e = b0(f4Var, z4);
            arrayList.add(lpVar);
        }
        org.telegram.ui.Components.kp kpVar = this.f.b;
        kpVar.d = arrayList;
        kpVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (tf.b.a(((org.telegram.ui.Components.lp) arrayList.get(i11)).a.c, this.G.c)) {
                    this.f.H = (org.telegram.ui.Components.lp) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        n21 n21Var = this.f;
        l21 l21Var = n21Var.C;
        l21Var.setAlpha(0.0f);
        l21Var.animate().alpha(1.0f).setDuration(150L).start();
        l21Var.setVisibility(0);
        org.telegram.ui.Components.u00 u00Var = n21Var.r;
        u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.x20(u00Var)).setDuration(150L).start();
        org.telegram.ui.Components.tl0 tl0Var = n21Var.y;
        tl0Var.setAlpha(0.0f);
        tl0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        if (r10 != 1) goto L47;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.z8 z8Var;
        boolean z4;
        boolean z10;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.z8 z8Var2;
        ImageLocation imageLocation4;
        char c3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.H = org.telegram.ui.ActionBar.k6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.C(-1, false);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, context, 2);
        iw0 iw0Var = new iw0(this, context, 2);
        this.w = iw0Var;
        r0Var.addView(iw0Var);
        long j11 = 0;
        if (this.I != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.I));
            if (user != null) {
                str = UserObject.getPublicUsername(user);
                if (str == null) {
                    str2 = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j10 = 0;
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= privacyRules.size()) {
                                j10 = j11;
                                break;
                            }
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                            j10 = j11;
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                c3 = 0;
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                c3 = 1;
                                break;
                            }
                            i12++;
                            j11 = j10;
                        }
                        c3 = 2;
                        if (c3 == 2) {
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
                            str = user.phone;
                            if (str != null && !str.startsWith("+")) {
                                str = "+".concat(str);
                            }
                            z4 = true;
                        }
                        if (c3 != 0) {
                        }
                        str = user.phone;
                        if (str != null) {
                            str = "+".concat(str);
                        }
                        z4 = true;
                    }
                    z4 = false;
                    z10 = true;
                    z8Var2 = new org.telegram.ui.Components.z8(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j10 = 0;
                    str2 = null;
                    z4 = false;
                }
                z10 = false;
                z8Var2 = new org.telegram.ui.Components.z8(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                z8Var2 = null;
                imageLocation4 = null;
                z4 = false;
                z10 = false;
            }
            imageLocation = imageLocation3;
            z8Var = z8Var2;
            imageLocation2 = imageLocation4;
        } else {
            j10 = 0;
            if (this.J == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.J))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                z8Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.z8 z8Var3 = new org.telegram.ui.Components.z8(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                z8Var = z8Var3;
                imageLocation2 = forChat;
            }
            z4 = false;
            z10 = false;
        }
        j21 j21Var = new j21(context);
        this.B = j21Var;
        j21Var.a.n(-9324972, -13856649, -6636738, -9915042);
        j21Var.invalidate();
        String p10 = str != null ? android.support.v4.media.a.p(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        j21 j21Var2 = this.B;
        if (str2 != null) {
            str = str2;
        }
        j21Var2.c(p10, str, z4, z10);
        j21 j21Var3 = this.B;
        j21Var3.e = new a21(this);
        r0Var.addView(j21Var3);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.C = lj0Var;
        lj0Var.setAutoRepeat(true);
        this.C.f(R.raw.plane_logo_plain, 60, 60, null);
        this.C.d();
        r0Var.addView(this.C);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.y = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        r0Var.addView(this.y, k7.c6.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", z8Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.D = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.D.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.D.setImageResource(R.drawable.ic_ab_back);
        this.D.setScaleType(ImageView.ScaleType.CENTER);
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d21
            public final /* synthetic */ o21 b;

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
                        o21 o21Var = this.b;
                        o21Var.f.s.setClickable(false);
                        o21Var.g0();
                        break;
                    default:
                        o21.U(this.b);
                        break;
                }
            }
        });
        r0Var.addView(this.D, k7.c6.c(34.0f, 34));
        this.E = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.E);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.E.getWidth(), this.E.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.E.getWidth() - r6.getWidth()) * 0.5f, (this.E.getHeight() - r6.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        n21 n21Var = new n21(this, this, getParentActivity().getWindow());
        this.f = n21Var;
        this.x = n21Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(n21Var, NotificationCenter.emojiLoaded);
        n21 n21Var2 = this.f;
        n21Var2.G = new a21(this);
        n21Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d21
            public final /* synthetic */ o21 b;

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
                        o21 o21Var = this.b;
                        o21Var.f.s.setClickable(false);
                        o21Var.g0();
                        break;
                    default:
                        o21.U(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d21
                public final /* synthetic */ o21 b;

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
                            o21 o21Var = this.b;
                            o21Var.f.s.setClickable(false);
                            o21Var.g0();
                            break;
                        default:
                            o21.U(this.b);
                            break;
                    }
                }
            });
        }
        r0Var.addView(this.x, k7.c6.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = r0Var;
        Utilities.themeQueue.postRunnable(new b21(this, 4), 25L);
        this.fragmentView.postDelayed(new b21(this, 5), Q ? 250L : j10);
        this.K = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K | 1028);
        }
        View view = this.fragmentView;
        a21 a21Var = new a21(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, a21Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.f4 f4Var, boolean z4) {
        float f10;
        this.L = i10;
        org.telegram.ui.ActionBar.f4 f4Var2 = this.G;
        final boolean z10 = this.H;
        this.G = f4Var;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f.get(z10 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.fc0 fc0Var = this.h;
        this.n = fc0Var;
        fc0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0();
        this.h = fc0Var2;
        fc0Var2.setCallback(this.w);
        this.h.n(e4Var.k, e4Var.l, e4Var.m, e4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.fc0 fc0Var3 = this.h;
        fc0Var3.N = true;
        org.telegram.ui.Components.fc0 fc0Var4 = this.n;
        if (fc0Var4 != null) {
            fc0Var3.h = fc0Var4.h;
        }
        this.B.a.h = fc0Var3.h;
        TLRPC.WallPaper k10 = this.G.k(z10 ? 1 : 0);
        int i11 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.fc0 fc0Var5 = this.h;
            fc0Var5.t(fc0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.G.o(z10 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.c21
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    o21 o21Var = o21.this;
                    long i12 = o21Var.G.i(z10 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((qf.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    o21Var.e0(o21Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(Throwable th2) {
                    org.telegram.tgnet.k.a(this, th2);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new b21(this, i11), 35L);
        }
        org.telegram.ui.Components.fc0 fc0Var6 = this.h;
        fc0Var6.u(fc0Var6.f());
        a0.f fVar = O;
        StringBuilder sb = new StringBuilder();
        sb.append(f4Var.e);
        sb.append(z10 ? "n" : "d");
        int[] iArr = (int[]) fVar.get(sb.toString());
        if (z4) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.fc0 fc0Var7 = this.h;
            fc0Var7.K = 0.0f;
            fc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new bg.a(22, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.fx0(9, this, iArr));
            this.s.setDuration((int) (f10 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                j21 j21Var = this.B;
                j21Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                j21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(null, (this.H ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.A0()).V, this.H, !z4);
        e5Var.f = false;
        e5Var.e = true;
        e5Var.m = this.a;
        e5Var.l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new dg.t0(this, z4, f4Var2, e5Var, 23));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z4) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z4) {
                this.h.s(1.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new j11(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f10 = min;
        if ((max * 1.0f) / f10 > 1.92f) {
            max = (int) (f10 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(8);
        this.C.getAnimatedDrawable();
        j21 j21Var = this.B;
        if (j21Var != null) {
            j21Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.C.getLeft(), this.C.getTop(), this.C.getRight(), this.C.getBottom());
        if (this.F != null) {
            canvas.drawBitmap(this.F, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.x.setVisibility(0);
        this.D.setVisibility(0);
        this.C.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        j21 j21Var2 = this.B;
        if (j21Var2 != null) {
            j21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e6) {
                e6.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new b21(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.c;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> themeDescriptions = super.getThemeDescriptions();
        n21 n21Var = this.f;
        n21Var.getClass();
        m21 m21Var = new m21(n21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = n21Var.a;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, null, null, new Drawable[]{n21Var.f}, m21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(n21Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(n21Var.y, 16, new Class[]{org.telegram.ui.Components.x11.class}, null, null, null, org.telegram.ui.ActionBar.k6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.m6) obj).o = n21Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        ey0 ey0Var = new ey0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(textView, 32, null, null, null, ey0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.m6(textView2, 4, null, null, null, ey0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.m6(this.f.x, 8, null, null, null, ey0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.m6 m6Var = themeDescriptions.get(i11);
            i11++;
            m6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.I = this.arguments.getLong("user_id");
        this.J = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        a0.f fVar;
        n21 n21Var = this.f;
        n21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(n21Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.E.recycle();
        this.E = null;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
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
            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new a21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K | 1028);
        }
    }
}
