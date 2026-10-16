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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class l31 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public g31 E;
    public org.telegram.ui.Components.bk0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.b4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final m2.t a;
    public final org.telegram.ui.ActionBar.b4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public k31 f;
    public org.telegram.ui.Components.cd0 h;
    public org.telegram.ui.Components.cd0 n;
    public org.telegram.ui.Components.cd0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public x50 w;
    public ah.v x;
    public org.telegram.ui.Components.z9 y;

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

    public l31(Bundle bundle) {
        super(bundle);
        this.a = new m2.t(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.c = gg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.a = org.telegram.ui.ActionBar.g6.O0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.a = org.telegram.ui.ActionBar.g6.O0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f.add(a4Var2);
        this.b = b4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.cd0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static /* synthetic */ void U(l31 l31Var) {
        T = false;
        List list = S;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(l31Var.currentAccount).requestAllChatThemes(new a31(l31Var), true);
        } else {
            l31Var.b0(S);
        }
    }

    public static void V(l31 l31Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        m2.t tVar = l31Var.a;
        if (z10) {
            tVar.b = b4Var.b(((l31) tVar.c).currentAccount, l31Var.K ? 1 : 0);
        } else {
            tVar.b = l31Var.J.b(((l31) tVar.c).currentAccount, l31Var.K ? 1 : 0);
        }
        a5Var.h = new x21(l31Var, 3);
        ((ActionBarLayout) l31Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = l31Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(l31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void W(l31 l31Var) {
        l31Var.b.n(l31Var.currentAccount);
        View view = l31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new x21(l31Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.m2 m2Var) {
        z9.e0(m2Var.getParentActivity(), false, 1, new c31(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (!z10) {
            return this.H;
        }
        String str = b4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) R.get(b4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.cd0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(b4Var.e, bitmap);
        }
        return bitmap;
    }

    public final void b0(List list) {
        if (list == null || list.isEmpty() || this.f == null) {
            return;
        }
        list.set(0, this.b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(b4Var);
            boolean z10 = this.K;
            ypVar.c = z10 ? 1 : 0;
            ypVar.e = a0(b4Var, z10);
            arrayList.add(ypVar);
        }
        org.telegram.ui.Components.xp xpVar = this.f.b;
        xpVar.d = arrayList;
        xpVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (gg.b.a(((org.telegram.ui.Components.yp) arrayList.get(i11)).a.c, this.J.c)) {
                    this.f.K = (org.telegram.ui.Components.yp) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        k31 k31Var = this.f;
        i31 i31Var = k31Var.F;
        i31Var.setAlpha(0.0f);
        i31Var.animate().alpha(1.0f).setDuration(150L).start();
        i31Var.setVisibility(0);
        org.telegram.ui.Components.f10 f10Var = k31Var.r;
        f10Var.animate().alpha(0.0f).setListener(new vo(f10Var)).setDuration(150L).start();
        org.telegram.ui.Components.mm0 mm0Var = k31Var.y;
        mm0Var.setAlpha(0.0f);
        mm0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void c0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f7;
        this.O = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.cd0 cd0Var = this.h;
        this.n = cd0Var;
        cd0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0();
        this.h = cd0Var2;
        cd0Var2.setCallback(this.w);
        this.h.n(a4Var.k, a4Var.l, a4Var.m, a4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.cd0 cd0Var3 = this.h;
        cd0Var3.N = true;
        org.telegram.ui.Components.cd0 cd0Var4 = this.n;
        if (cd0Var4 != null) {
            cd0Var3.h = cd0Var4.h;
        }
        this.E.a.h = cd0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        int i11 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.cd0 cd0Var5 = this.h;
            cd0Var5.t(cd0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.y21
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    l31 l31Var = l31.this;
                    long i12 = l31Var.J.i(z11 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((eg.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    l31Var.d0(l31Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(Throwable th2) {
                    org.telegram.tgnet.l.a(this, th2);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.l.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new x21(this, i11), 35L);
        }
        org.telegram.ui.Components.cd0 cd0Var6 = this.h;
        cd0Var6.u(cd0Var6.f());
        a0.f fVar = R;
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
            org.telegram.ui.Components.cd0 cd0Var7 = this.h;
            cd0Var7.K = 0.0f;
            cd0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(24, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.ql0(12, this, iArr));
            this.s.setDuration((int) (f7 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                g31 g31Var = this.E;
                g31Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                g31Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.K ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.B0()).Y, this.K, !z10);
        a5Var.f = false;
        a5Var.e = true;
        a5Var.m = this.a;
        a5Var.l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new bi.h4(this, z10, b4Var2, a5Var, 26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c0, code lost:
    
        if (r12 != 1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.k9 k9Var;
        TLRPC.Chat chat;
        org.telegram.ui.Components.k9 k9Var2;
        ImageLocation forChat;
        ImageLocation forChat2;
        LinearLayout linearLayout;
        char c10;
        String str3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.K = org.telegram.ui.ActionBar.g6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.D(-1, false);
        org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(this, context, 2);
        x50 x50Var = new x50(this, context, 7);
        this.w = x50Var;
        p0Var.addView(x50Var);
        if (this.L != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
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
                            z11 = false;
                        }
                        if (c10 != 0) {
                        }
                        str3 = user.phone;
                        if (str3 != null) {
                            str3 = "+".concat(str3);
                        }
                        str = str3;
                        z10 = true;
                        z11 = false;
                    }
                    z11 = true;
                    z10 = false;
                } else {
                    j10 = 0;
                    z10 = false;
                    z11 = false;
                    str2 = null;
                }
                k9Var2 = new org.telegram.ui.Components.k9(0, user);
                forChat = ImageLocation.getForUser(this.currentAccount, user, 1);
                forChat2 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                z10 = false;
                z11 = false;
                forChat2 = null;
                str = null;
                str2 = null;
                k9Var2 = null;
                forChat = null;
            }
        } else {
            j10 = 0;
            if (this.M == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.M))) == null) {
                z10 = false;
                z11 = false;
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                k9Var = null;
                g31 g31Var = new g31(context);
                this.E = g31Var;
                g31Var.a.n(-9324972, -13856649, -6636738, -9915042);
                g31Var.invalidate();
                String q6 = str == null ? a1.g.q(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
                g31 g31Var2 = this.E;
                if (str2 != null) {
                    str = str2;
                }
                g31Var2.c(q6, str, z10, z11);
                g31 g31Var3 = this.E;
                g31Var3.e = new w21(this);
                p0Var.addView(g31Var3);
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                this.F = bk0Var;
                bk0Var.setAutoRepeat(true);
                this.F.f(R.raw.plane_logo_plain, 60, 60, null);
                this.F.d();
                p0Var.addView(this.F);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                this.y = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
                this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
                p0Var.addView(this.y, w7.z5.e(84, 84, 51));
                this.y.m(imageLocation, "84_84", imageLocation2, "50_50", k9Var, null, 0, null);
                ImageView imageView = new ImageView(context);
                this.G = imageView;
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
                this.G.setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
                this.G.setImageResource(R.drawable.ic_ab_back);
                this.G.setScaleType(ImageView.ScaleType.CENTER);
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z21
                    public final /* synthetic */ l31 b;

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
                                l31 l31Var = this.b;
                                l31Var.f.s.setClickable(false);
                                l31Var.f0();
                                break;
                            default:
                                l31 l31Var2 = this.b;
                                if (l31Var2.getParentActivity() != null) {
                                    if (l31Var2.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        l31.e0(l31Var2);
                                        break;
                                    } else {
                                        l31Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                p0Var.addView(this.G, w7.z5.d(34.0f, 34));
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
                k31 k31Var = new k31(this, this, getParentActivity().getWindow());
                this.f = k31Var;
                this.x = k31Var.h;
                ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
                chatThemeController.preloadAllWallpaperThumbs(true);
                chatThemeController.preloadAllWallpaperThumbs(false);
                chatThemeController.preloadAllWallpaperImages(true);
                chatThemeController.preloadAllWallpaperImages(false);
                NotificationCenter.getGlobalInstance().addObserver(k31Var, NotificationCenter.emojiLoaded);
                k31 k31Var2 = this.f;
                k31Var2.J = new w21(this);
                k31Var2.n.setText(LocaleController.getString(R.string.QrCode));
                this.f.r.setViewType(17);
                this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z21
                    public final /* synthetic */ l31 b;

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
                                l31 l31Var = this.b;
                                l31Var.f.s.setClickable(false);
                                l31Var.f0();
                                break;
                            default:
                                l31 l31Var2 = this.b;
                                if (l31Var2.getParentActivity() != null) {
                                    if (l31Var2.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        l31.e0(l31Var2);
                                        break;
                                    } else {
                                        l31Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                linearLayout = this.f.v;
                if (linearLayout != null) {
                    final int i14 = 2;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z21
                        public final /* synthetic */ l31 b;

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
                                    l31 l31Var = this.b;
                                    l31Var.f.s.setClickable(false);
                                    l31Var.f0();
                                    break;
                                default:
                                    l31 l31Var2 = this.b;
                                    if (l31Var2.getParentActivity() != null) {
                                        if (l31Var2.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            l31.e0(l31Var2);
                                            break;
                                        } else {
                                            l31Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
                p0Var.addView(this.x, w7.z5.e(-1, -2, 80));
                this.h.N = true;
                this.fragmentView = p0Var;
                Utilities.themeQueue.postRunnable(new x21(this, 4), 25L);
                this.fragmentView.postDelayed(new x21(this, 5), !T ? 250L : j10);
                this.N = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
                if (getParentActivity() != null) {
                    getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
                }
                View view = this.fragmentView;
                w21 w21Var = new w21(this);
                WeakHashMap weakHashMap = r0.i0.a;
                r0.a0.i(view, w21Var);
                return this.fragmentView;
            }
            str = ChatObject.getPublicUsername(chat);
            k9Var2 = new org.telegram.ui.Components.k9(chat);
            forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
            forChat2 = ImageLocation.getForChat(this.currentAccount, chat, 0);
            z10 = false;
            z11 = false;
            str2 = null;
        }
        imageLocation = forChat2;
        k9Var = k9Var2;
        imageLocation2 = forChat;
        g31 g31Var4 = new g31(context);
        this.E = g31Var4;
        g31Var4.a.n(-9324972, -13856649, -6636738, -9915042);
        g31Var4.invalidate();
        if (str == null) {
        }
        g31 g31Var22 = this.E;
        if (str2 != null) {
        }
        g31Var22.c(q6, str, z10, z11);
        g31 g31Var32 = this.E;
        g31Var32.e = new w21(this);
        p0Var.addView(g31Var32);
        org.telegram.ui.Components.bk0 bk0Var2 = new org.telegram.ui.Components.bk0(context);
        this.F = bk0Var2;
        bk0Var2.setAutoRepeat(true);
        this.F.f(R.raw.plane_logo_plain, 60, 60, null);
        this.F.d();
        p0Var.addView(this.F);
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context);
        this.y = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        p0Var.addView(this.y, w7.z5.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", k9Var, null, 0, null);
        ImageView imageView2 = new ImageView(context);
        this.G = imageView2;
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.G.setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.G.setImageResource(R.drawable.ic_ab_back);
        this.G.setScaleType(ImageView.ScaleType.CENTER);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z21
            public final /* synthetic */ l31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        l31 l31Var = this.b;
                        l31Var.f.s.setClickable(false);
                        l31Var.f0();
                        break;
                    default:
                        l31 l31Var2 = this.b;
                        if (l31Var2.getParentActivity() != null) {
                            if (l31Var2.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                l31.e0(l31Var2);
                                break;
                            } else {
                                l31Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        p0Var.addView(this.G, w7.z5.d(34.0f, 34));
        this.H = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.H);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, this.H.getWidth(), this.H.getHeight());
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas2.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.H.getWidth() - r6.getWidth()) * 0.5f, (this.H.getHeight() - r6.getHeight()) * 0.5f, paint2);
        canvas2.setBitmap(null);
        k31 k31Var3 = new k31(this, this, getParentActivity().getWindow());
        this.f = k31Var3;
        this.x = k31Var3.h;
        ChatThemeController chatThemeController2 = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController2.preloadAllWallpaperThumbs(true);
        chatThemeController2.preloadAllWallpaperThumbs(false);
        chatThemeController2.preloadAllWallpaperImages(true);
        chatThemeController2.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(k31Var3, NotificationCenter.emojiLoaded);
        k31 k31Var22 = this.f;
        k31Var22.J = new w21(this);
        k31Var22.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z21
            public final /* synthetic */ l31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        l31 l31Var = this.b;
                        l31Var.f.s.setClickable(false);
                        l31Var.f0();
                        break;
                    default:
                        l31 l31Var2 = this.b;
                        if (l31Var2.getParentActivity() != null) {
                            if (l31Var2.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                l31.e0(l31Var2);
                                break;
                            } else {
                                l31Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout = this.f.v;
        if (linearLayout != null) {
        }
        p0Var.addView(this.x, w7.z5.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = p0Var;
        Utilities.themeQueue.postRunnable(new x21(this, 4), 25L);
        this.fragmentView.postDelayed(new x21(this, 5), !T ? 250L : j10);
        this.N = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
        }
        View view2 = this.fragmentView;
        w21 w21Var2 = new w21(this);
        WeakHashMap weakHashMap2 = r0.i0.a;
        r0.a0.i(view2, w21Var2);
        return this.fragmentView;
    }

    public final void d0(int i10, Bitmap bitmap, boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
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
        g31 g31Var = this.E;
        if (g31Var != null) {
            g31Var.d(true);
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
        g31 g31Var2 = this.E;
        if (g31Var2 != null) {
            g31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new x21(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        k31 k31Var = this.f;
        k31Var.getClass();
        j31 j31Var = new j31(k31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = k31Var.a;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{k31Var.f}, j31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k31Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k31Var.y, 16, new Class[]{org.telegram.ui.Components.w21.class}, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).o = k31Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        cz0 cz0Var = new cz0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, cz0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, cz0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.x, 8, null, null, null, cz0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.L = this.arguments.getLong("user_id");
        this.M = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        a0.f fVar;
        k31 k31Var = this.f;
        k31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(k31Var, NotificationCenter.emojiLoaded);
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                e0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new w21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
    }
}
