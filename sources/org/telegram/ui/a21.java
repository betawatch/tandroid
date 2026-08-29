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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class a21 extends org.telegram.ui.ActionBar.o2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public v11 A;
    public org.telegram.ui.Components.aj0 B;
    public ImageView C;
    public Bitmap D;
    public Bitmap E;
    public org.telegram.ui.ActionBar.b4 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public int K;
    public boolean L;
    public i0.b M;
    public final oc.i a;
    public final org.telegram.ui.ActionBar.b4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public z11 f;
    public org.telegram.ui.Components.yb0 h;
    public org.telegram.ui.Components.yb0 n;
    public org.telegram.ui.Components.yb0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public op0 w;
    public bg.d1 x;
    public org.telegram.ui.Components.t9 y;

    static {
        a0.f fVar = new a0.f(0);
        N = fVar;
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
        P = true;
    }

    public a21(Bundle bundle) {
        super(bundle);
        this.a = new oc.i(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.c = qf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.a = org.telegram.ui.ActionBar.g6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.a = org.telegram.ui.ActionBar.g6.N0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f.add(a4Var2);
        this.b = b4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.yb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.b.e;
    }

    public static /* synthetic */ void U(a21 a21Var) {
        if (a21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || a21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(a21Var);
        } else {
            a21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void V(a21 a21Var) {
        P = false;
        List list = O;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(a21Var.currentAccount).requestAllChatThemes(new q11(a21Var), true);
        } else {
            a21Var.c0(O);
        }
    }

    public static void W(a21 a21Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        oc.i iVar = a21Var.a;
        if (z10) {
            iVar.b = b4Var.b(((a21) iVar.c).currentAccount, a21Var.G ? 1 : 0);
        } else {
            iVar.b = a21Var.F.b(((a21) iVar.c).currentAccount, a21Var.G ? 1 : 0);
        }
        a5Var.h = new n11(a21Var, 3);
        ((ActionBarLayout) a21Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = a21Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(a21Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void X(a21 a21Var) {
        a21Var.b.n(a21Var.currentAccount);
        View view = a21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new n11(a21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.o2 o2Var) {
        r9.e0(o2Var.getParentActivity(), 1, new r11(o2Var.getCurrentAccount(), o2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (!z10) {
            return this.D;
        }
        String str = b4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.D.getWidth(), this.D.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) N.get(b4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.yb0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(b4Var.e, bitmap);
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
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(b4Var);
            boolean z10 = this.G;
            fpVar.c = z10 ? 1 : 0;
            fpVar.e = b0(b4Var, z10);
            arrayList.add(fpVar);
        }
        org.telegram.ui.Components.ep epVar = this.f.b;
        epVar.d = arrayList;
        epVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (qf.b.a(((org.telegram.ui.Components.fp) arrayList.get(i11)).a.c, this.F.c)) {
                    this.f.G = (org.telegram.ui.Components.fp) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        z11 z11Var = this.f;
        x11 x11Var = z11Var.B;
        x11Var.setAlpha(0.0f);
        x11Var.animate().alpha(1.0f).setDuration(150L).start();
        x11Var.setVisibility(0);
        org.telegram.ui.Components.p00 p00Var = z11Var.r;
        p00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.z9(p00Var)).setDuration(150L).start();
        org.telegram.ui.Components.jl0 jl0Var = z11Var.y;
        jl0Var.setAlpha(0.0f);
        jl0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c2, code lost:
    
        if (r12 != 1) goto L46;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.e9 e9Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.e9 e9Var2;
        ImageLocation imageLocation4;
        char c3;
        String str3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.G = org.telegram.ui.ActionBar.g6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.C(-1, false);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, context, 2);
        op0 op0Var = new op0(this, context, 4);
        this.w = op0Var;
        r0Var.addView(op0Var);
        if (this.H != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            if (user != null) {
                str = UserObject.getPublicUsername(user);
                if (str == null) {
                    str2 = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        for (int i12 = 0; i12 < privacyRules.size(); i12++) {
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
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
                            str3 = user.phone;
                            if (str3 != null && !str3.startsWith("+")) {
                                str3 = "+".concat(str3);
                            }
                            str = str3;
                            z10 = true;
                        }
                        if (c3 != 0) {
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
                    e9Var2 = new org.telegram.ui.Components.e9(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j10 = 0;
                    str2 = null;
                    z10 = false;
                }
                z11 = false;
                e9Var2 = new org.telegram.ui.Components.e9(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                e9Var2 = null;
                imageLocation4 = null;
                z10 = false;
                z11 = false;
            }
            imageLocation = imageLocation3;
            e9Var = e9Var2;
            imageLocation2 = imageLocation4;
        } else {
            j10 = 0;
            if (this.I == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.I))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                e9Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.e9 e9Var3 = new org.telegram.ui.Components.e9(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                e9Var = e9Var3;
                imageLocation2 = forChat;
            }
            z10 = false;
            z11 = false;
        }
        v11 v11Var = new v11(context);
        this.A = v11Var;
        v11Var.a.n(-9324972, -13856649, -6636738, -9915042);
        v11Var.invalidate();
        String o10 = str != null ? a4.w.o(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        v11 v11Var2 = this.A;
        if (str2 != null) {
            str = str2;
        }
        v11Var2.c(o10, str, z10, z11);
        v11 v11Var3 = this.A;
        v11Var3.e = new m11(this);
        r0Var.addView(v11Var3);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.B = aj0Var;
        aj0Var.setAutoRepeat(true);
        this.B.f(R.raw.plane_logo_plain, 60, 60, null);
        this.B.d();
        r0Var.addView(this.B);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.y = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        r0Var.addView(this.y, i7.f6.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", e9Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.C = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.C.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.C.setImageResource(R.drawable.ic_ab_back);
        this.C.setScaleType(ImageView.ScaleType.CENTER);
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p11
            public final /* synthetic */ a21 b;

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
                        a21 a21Var = this.b;
                        a21Var.f.s.setClickable(false);
                        a21Var.g0();
                        break;
                    default:
                        a21.U(this.b);
                        break;
                }
            }
        });
        r0Var.addView(this.C, i7.f6.c(34.0f, 34));
        this.D = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.D);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.D.getWidth(), this.D.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.D.getWidth() - r6.getWidth()) * 0.5f, (this.D.getHeight() - r6.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        z11 z11Var = new z11(this, this, getParentActivity().getWindow());
        this.f = z11Var;
        this.x = z11Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(z11Var, NotificationCenter.emojiLoaded);
        z11 z11Var2 = this.f;
        z11Var2.F = new m11(this);
        z11Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p11
            public final /* synthetic */ a21 b;

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
                        a21 a21Var = this.b;
                        a21Var.f.s.setClickable(false);
                        a21Var.g0();
                        break;
                    default:
                        a21.U(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p11
                public final /* synthetic */ a21 b;

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
                            a21 a21Var = this.b;
                            a21Var.f.s.setClickable(false);
                            a21Var.g0();
                            break;
                        default:
                            a21.U(this.b);
                            break;
                    }
                }
            });
        }
        r0Var.addView(this.x, i7.f6.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = r0Var;
        Utilities.themeQueue.postRunnable(new n11(this, 4), 25L);
        this.fragmentView.postDelayed(new n11(this, 5), P ? 250L : j10);
        this.J = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
        View view = this.fragmentView;
        m11 m11Var = new m11(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, m11Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f9;
        this.K = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.F;
        final boolean z11 = this.G;
        this.F = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f9 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f9 = 1.0f;
        }
        org.telegram.ui.Components.yb0 yb0Var = this.h;
        this.n = yb0Var;
        yb0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0();
        this.h = yb0Var2;
        yb0Var2.setCallback(this.w);
        this.h.n(a4Var.k, a4Var.l, a4Var.m, a4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.yb0 yb0Var3 = this.h;
        yb0Var3.N = true;
        org.telegram.ui.Components.yb0 yb0Var4 = this.n;
        if (yb0Var4 != null) {
            yb0Var3.h = yb0Var4.h;
        }
        this.A.a.h = yb0Var3.h;
        TLRPC.WallPaper k9 = this.F.k(z11 ? 1 : 0);
        int i11 = 2;
        if (k9 != null) {
            org.telegram.ui.Components.yb0 yb0Var5 = this.h;
            yb0Var5.t(yb0Var5.u, k9.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.o11
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    a21 a21Var = a21.this;
                    long i12 = a21Var.F.i(z11 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((of.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    a21Var.e0(a21Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
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
            Utilities.themeQueue.postRunnable(new n11(this, i11), 35L);
        }
        org.telegram.ui.Components.yb0 yb0Var6 = this.h;
        yb0Var6.u(yb0Var6.f());
        a0.f fVar = N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.e);
        sb2.append(z11 ? "n" : "d");
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.yb0 yb0Var7 = this.h;
            yb0Var7.K = 0.0f;
            yb0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new bg.b3(21, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.ok0(13, this, iArr));
            this.s.setDuration((int) (f9 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                v11 v11Var = this.A;
                v11Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                v11Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.G ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()).U, this.G, !z10);
        a5Var.f = false;
        a5Var.e = true;
        a5Var.m = this.a;
        a5Var.l = (int) (f9 * 250.0f);
        AndroidUtilities.runOnUIThread(new ag.w0(this, z10, b4Var2, a5Var, 25));
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            ofFloat.addUpdateListener(new w01(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f9 = min;
        if ((max * 1.0f) / f9 > 1.92f) {
            max = (int) (f9 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.B.getAnimatedDrawable();
        v11 v11Var = this.A;
        if (v11Var != null) {
            v11Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
        if (this.E != null) {
            canvas.drawBitmap(this.E, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.x.setVisibility(0);
        this.C.setVisibility(0);
        this.B.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        v11 v11Var2 = this.A;
        if (v11Var2 != null) {
            v11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new n11(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        z11 z11Var = this.f;
        z11Var.getClass();
        y11 y11Var = new y11(z11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = z11Var.a;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{z11Var.f}, y11Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z11Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z11Var.y, 16, new Class[]{org.telegram.ui.Components.l11.class}, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).o = z11Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        rx0 rx0Var = new rx0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, rx0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, rx0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.x, 8, null, null, null, rx0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        a0.f fVar;
        z11 z11Var = this.f;
        z11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(z11Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.D.recycle();
        this.D = null;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new m11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
