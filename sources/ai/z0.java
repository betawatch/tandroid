package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bi.ec;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class z0 extends r2 {
    public boolean E;
    public o0 F;
    public boolean G;
    public final t0 H;
    public int I;
    public final Paint J;
    public float K;
    public final int[] L;
    public final int[] M;
    public LinearGradient N;
    public final Paint O;
    public final Matrix P;
    public final Paint Q;
    public final RectF R;
    public final float[] S;
    public final int[] T;
    public final int[] U;
    public LinearGradient V;
    public int W;
    public int X;
    public int Y;
    public r Z;
    public long a;
    public int a0;
    public long b;
    public int b0;
    public org.telegram.ui.f c;
    public int c0;
    public t1 d;
    public float d0;
    public f1 e;
    public boolean e0;
    public FrameLayout f;
    public LinearGradient f0;
    public final Paint g0;
    public x0 h;
    public final RectF h0;
    public final int[] i0;
    public final int[] j0;
    public final int[] k0;
    public final Path l0;
    public final RectF m0;
    public float n;
    public Paint n0;
    public final v1 o0;
    public final RectF p0;
    public boolean q0;
    public float r;
    public Boolean r0;
    public float s;
    public float v;
    public float w;
    public d x;
    public boolean y;

    public z0(Bundle bundle) {
        super(bundle);
        this.H = new t0(this, 0);
        this.J = new Paint();
        this.K = Float.NaN;
        this.L = new int[2];
        this.M = new int[2];
        this.O = new Paint();
        this.P = new Matrix();
        this.Q = new Paint(1);
        this.R = new RectF();
        this.S = new float[2];
        this.T = new int[2];
        this.U = new int[2];
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.g0 = new Paint();
        this.h0 = new RectF();
        this.i0 = new int[2];
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.l0 = new Path();
        this.m0 = new RectF();
        this.o0 = new v1(0);
        this.p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void V(z0 z0Var, AnimatorSet animatorSet) {
        z0Var.h0();
        boolean z10 = !z0Var.y;
        int i10 = z0Var.currentAccount;
        z0Var.Y = i10;
        z0Var.W = NotificationCenter.getInstance(i10).setAnimationInProgress(-1, null, z10);
        z0Var.X = NotificationCenter.getGlobalInstance().setAnimationInProgress(-1, null, z10);
        animatorSet.start();
    }

    public static void W(z0 z0Var) {
        if (z0Var.getParentActivity() == null) {
            return;
        }
        zh.p1 p1Var = new zh.p1(z0Var.getParentActivity(), z0Var.currentAccount, z0Var.getUserConfig().getClientUserId(), null, null);
        if (!p1Var.u0) {
            p1Var.u0 = true;
            ec ecVar = p1Var.w0;
            if (ecVar != null && (ecVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) p1Var.w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(p1Var.w0);
                viewGroup.removeView(p1Var.w0);
                ec ecVar2 = new ec(p1Var.getContext(), MediaDataController.MAX_LINKS_COUNT, 2);
                p1Var.w0 = ecVar2;
                viewGroup.addView(ecVar2, indexOfChild, gb1.g(-1.0f, -1));
            }
            z90 z90Var = p1Var.x0;
            if (z90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                zh.u0 u0Var = p1Var.l0;
                u0Var.setText(string);
                u0Var.setBreakStrategy(2);
                z90Var.setVisibility(8);
            }
            p1Var.Y.O(false);
        }
        p1Var.show();
    }

    public static void Y(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Y(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a0(r2 r2Var) {
        y9.f0(r2Var.getParentActivity(), 1, new v0(r2Var.getCurrentAccount(), r2Var));
    }

    public static LinearGradient f0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float D = c3.h0.D(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                D = 1.0f - D;
            }
            iArr[i10] = ((int) ((D * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void X() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        Window window = parentActivity.getWindow();
        AndroidUtilities.setLightNavigationBar(parentActivity, false);
        AndroidUtilities.setLightStatusBar(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.r0 == null) {
                this.r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public final void Z() {
        t1 t1Var;
        if (this.h == null || (t1Var = this.d) == null || t1Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    public final void b0() {
        if (this.F != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.k7);
        rectF2.set(this.d.h7);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
        }
        this.d.setScanHidden(true);
        o0 o0Var = new o0(getParentActivity(), rectF, rectF2, new za.c(this, 1));
        this.F = o0Var;
        o0Var.setButtonLabel(LocaleController.getString(R.string.QrScanQr));
        o0 o0Var2 = this.F;
        o0Var2.setOnGallery(new a1.f(14, this, o0Var2));
        this.f.addView(this.F, gb1.g(-1.0f, -1));
    }

    public final void c0(float f7, float f10, boolean z10) {
        if (!z10) {
            x0 x0Var = this.h;
            if (x0Var != null && x0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            d dVar = this.x;
            if (dVar == null || dVar.getVisibility() != 0) {
                return;
            }
            this.x.setVisibility(4);
            return;
        }
        if (this.h == null) {
            if (getParentActivity() == null) {
                return;
            }
            x0 x0Var2 = new x0(this, getParentActivity(), this.currentAccount, new w0(this));
            this.h = x0Var2;
            x0Var2.setOutlineProvider(new y0(this, 0));
            this.h.setClipToOutline(true);
            d dVar2 = new d(getParentActivity(), new b6.i(this, 2));
            this.x = dVar2;
            dVar2.b = this.h;
            this.d.setOnPicksChanged(new t0(this, 1));
            this.x.setOutlineProvider(this.h.getOutlineProvider());
            this.x.setClipToOutline(true);
            this.f.addView(this.h, gb1.i(-1, -1, 48));
            Z();
            this.f.post(new t0(this, 2));
        }
        Z();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i10 = layoutParams.height;
        int i11 = layoutParams.leftMargin;
        int i12 = layoutParams.rightMargin;
        if (this.x.getParent() == null) {
            this.f.addView(this.x, gb1.i(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        if (layoutParams2.height != i10 || layoutParams2.leftMargin != i11 || layoutParams2.rightMargin != i12) {
            layoutParams2.height = i10;
            layoutParams2.leftMargin = i11;
            layoutParams2.rightMargin = i12;
            this.x.setLayoutParams(layoutParams2);
        }
        this.x.setTranslationY(f7);
        this.x.setAlpha(f10);
        this.x.invalidateOutline();
        this.x.invalidate();
        if (this.x.getVisibility() != 0) {
            this.x.setVisibility(0);
        }
        int t02 = this.d.t0();
        r1 r1Var = this.d.n;
        int i13 = t02 ^ (r1Var != null ? r1Var.h : 872415231);
        if (this.h.getTranslationY() != f7 || i13 != this.I) {
            this.h.setTranslationY(f7);
            this.I = i13;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        x0 x0Var3 = this.h;
        t1 t1Var = this.d;
        r1 r1Var2 = t1Var.n;
        int i14 = r1Var2 != null ? r1Var2.b : -16777216;
        if (i14 != t1Var.a2) {
            t1Var.a2 = i14;
            t1Var.b2 = (i0.a.f(0.13f, -1, t1.D0(0.75f, 1.3f, 0.16f, i14)) & 16777215) | (-1728053248);
        }
        x0Var3.setHeaderColor(t1Var.b2);
        if (this.h.getVisibility() != 0) {
            x0 x0Var4 = this.h;
            if (x0Var4.J) {
                x0Var4.J = false;
                x0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.q0) {
            return;
        }
        g0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void clearViews() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            this.F = null;
        }
        f1 f1Var = this.e;
        if (f1Var != null) {
            f1Var.k();
            this.e = null;
        }
        super.clearViews();
        t1 t1Var = this.d;
        if (t1Var != null) {
            t1Var.O0();
            this.d = null;
        }
        this.f = null;
        this.h = null;
        this.x = null;
        this.Z = null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ac, code lost:
    
        if (r3 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z10;
        d1 d1Var;
        long j10;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        char c10;
        String str2;
        d1 d1Var2;
        TLRPC.ShareTheme shareTheme;
        TLRPC.ShareTheme shareTheme2;
        TLRPC.ShareTheme shareTheme3;
        int i10 = this.currentAccount;
        f[] fVarArr = f.f;
        if (fVarArr[i10] == null) {
            fVarArr[i10] = new f(i10);
        }
        f fVar = fVarArr[i10];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fVar.b;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = fVar.b;
        a3.l0 l0Var = new a3.l0(this, fVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 1);
        if (fVar.d) {
            l0Var.run();
        } else {
            fVar.e.add(l0Var);
            if (!fVar.c) {
                fVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = fVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(fVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new org.telegram.messenger.a(), new e(fVar, 0));
            }
        }
        Activity parentActivity = getParentActivity();
        el0 el0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).u1 : null;
        if (el0Var != null && this.c == null) {
            org.telegram.ui.f fVar2 = new org.telegram.ui.f(el0Var, 29);
            el0Var.b.add(fVar2);
            el0Var.a();
            this.c = fVar2;
        }
        int i11 = this.currentAccount;
        long j11 = this.a;
        long j12 = this.b;
        MessagesController messagesController = MessagesController.getInstance(i11);
        String s10 = a1.g.s(new StringBuilder("https://"), messagesController.linkPrefix, "/");
        if (j11 != 0 || j12 == 0) {
            if (j11 == UserConfig.getInstance(i11).getClientUserId()) {
                str = "";
                z10 = true;
            } else {
                str = "";
                z10 = false;
            }
            TLRPC.User user = messagesController.getUser(Long.valueOf(j11));
            String publicUsername = user != null ? UserObject.getPublicUsername(user) : null;
            if (publicUsername != null) {
                j10 = 0;
                d1Var = new d1(b10.u(s10, publicUsername), publicUsername, true, false, z10, j11, z10);
            } else if (z10) {
                if (user != null && user.phone != null && (privacyRules = ContactsController.getInstance(i11).getPrivacyRules(6)) != null) {
                    int size = privacyRules.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                        i12++;
                        TLRPC.PrivacyRule privacyRule2 = privacyRule;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                            c10 = 0;
                            break;
                        }
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) {
                            break;
                        }
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            c10 = 1;
                            break;
                        }
                    }
                    c10 = 2;
                    if (c10 == 2) {
                        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(i11).getPrivacyRules(7);
                        if (privacyRules2 != null && !privacyRules2.isEmpty()) {
                            int size2 = privacyRules2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.PrivacyRule privacyRule3 = privacyRules2.get(i13);
                                i13++;
                                TLRPC.PrivacyRule privacyRule4 = privacyRule3;
                                if (!(privacyRule4 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                    if ((privacyRule4 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule4 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (user.phone.startsWith("+")) {
                            str2 = "+" + user.phone;
                        } else {
                            str2 = user.phone;
                        }
                        String str3 = str2;
                        j10 = 0;
                        d1Var = new d1(b10.u(s10, str3), str3, false, false, true, j11, true);
                    }
                    if (c10 != 0) {
                    }
                    if (user.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    j10 = 0;
                    d1Var = new d1(b10.u(s10, str32), str32, false, false, true, j11, true);
                }
                TLRPC.TL_exportedContactToken cachedContactToken = messagesController.getCachedContactToken();
                String str4 = cachedContactToken != null ? cachedContactToken.url : null;
                j10 = 0;
                d1Var = new d1(str4, user != null ? UserObject.getUserName(user) : str, false, true, true, j11, true);
            } else {
                j10 = 0;
                d1Var = new d1(s10, user != null ? UserObject.getUserName(user) : str, false, false, false, j11, false);
            }
            d1Var2 = d1Var;
        } else {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j12));
            String publicUsername2 = ChatObject.getPublicUsername(chat);
            if (publicUsername2 != null) {
                d1Var2 = new d1(b10.u(s10, publicUsername2), publicUsername2, true, false, false, -j12, ChatObject.canChangeChatInfo(chat));
                j10 = 0;
            } else {
                String str5 = chat != null ? chat.title : "";
                j10 = 0;
                d1Var2 = new d1(s10, str5, false, false, false, -j12, false);
            }
        }
        this.f = new FrameLayout(context);
        t1 t1Var = new t1(context, this.currentAccount, d1Var2.a, d1Var2.b, d1Var2.c, new rb.c(this, 1));
        this.d = t1Var;
        this.f.addView(t1Var, gb1.g(-1.0f, -1));
        this.d.setImmediateOnOpen(this.y);
        this.d.setRevealOpening(true);
        if (this.G) {
            this.d.setReveal(1.0f);
            this.f.postDelayed(this.H, 680L);
        } else if (AndroidUtilities.isTablet()) {
            t1 t1Var2 = this.d;
            t1Var2.setReveal(1.0f);
            t1Var2.T4 = false;
        } else {
            this.d.setReveal(0.0f);
        }
        this.fragmentView = this.f;
        f1 f1Var = this.e;
        if (f1Var != null) {
            f1Var.k();
        }
        int i14 = this.currentAccount;
        t1 t1Var3 = this.d;
        f1 f1Var2 = new f1(i14, t1Var3, d1Var2);
        this.e = f1Var2;
        boolean z11 = d1Var2.d;
        t1Var3.setTimerOnly(z11);
        t1Var3.setTemporaryLink(z11);
        LongSparseArray g7 = f1.g(i14);
        long j13 = d1Var2.f;
        e1 e1Var = (e1) g7.get(j13);
        if (e1Var != null) {
            shareTheme3 = e1Var.a;
        } else {
            MessagesController messagesController2 = MessagesController.getInstance(i14);
            if (j13 > j10) {
                TLRPC.UserFull userFull = messagesController2.getUserFull(j13);
                if (userFull != null) {
                    shareTheme = userFull.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                    shareTheme2 = shareTheme;
                }
                shareTheme2 = null;
            } else {
                TLRPC.ChatFull chatFull = messagesController2.getChatFull(-j13);
                if (chatFull != null) {
                    shareTheme = chatFull.share_theme;
                    if (shareTheme == null) {
                        shareTheme = new TLRPC.TL_shareThemeDefault();
                    }
                    shareTheme2 = shareTheme;
                }
                shareTheme2 = null;
            }
            shareTheme3 = shareTheme2;
        }
        if (shareTheme3 != null) {
            t1Var3.setInstantTheme(true);
            f1Var2.a(shareTheme3);
            t1Var3.setInstantTheme(false);
        }
        boolean z12 = d1Var2.g;
        t1Var3.setThemeEditable(z12);
        if (z12) {
            t1Var3.setGiftsOwner(j13);
        }
        if (d1Var2.e) {
            NotificationCenter.getInstance(i14).addObserver(f1Var2, NotificationCenter.privacyRulesUpdated);
            if (z11) {
                TLRPC.TL_exportedContactToken cachedContactToken2 = MessagesController.getInstance(i14).getCachedContactToken();
                f1Var2.r = cachedContactToken2;
                if (cachedContactToken2 == null) {
                    f1Var2.s = SystemClock.elapsedRealtime();
                    MessagesController.getInstance(i14).requestContactToken(new i(f1Var2, 2));
                } else {
                    t1Var3.setLinkExpires(cachedContactToken2.expires);
                }
            }
            f1Var2.p();
            f1Var2.f();
            f1Var2.n();
        } else {
            t1Var3.setFeeStars(j10);
            f1Var2.f();
        }
        return this.f;
    }

    public final void d0() {
        t1 t1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (t1Var = this.d) == null || t1Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.E = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap T0 = this.d.T0();
            if (T0 == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new a1.f(13, this, T0));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(String str) {
        t1 t1Var;
        if (getParentActivity() == null || (t1Var = this.d) == null || t1Var.getCurrentLink() == null) {
            return;
        }
        Bitmap T0 = this.d.T0();
        Uri bitmapShareUri = T0 != null ? AndroidUtilities.getBitmapShareUri(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (bitmapShareUri != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, LocaleController.getString(R.string.InviteByQRCode)));
        } catch (ActivityNotFoundException e) {
            FileLog.e(e);
        }
    }

    public final void g0() {
        x0 x0Var;
        if (this.q0 || (x0Var = this.h) == null) {
            return;
        }
        x tabs = x0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = w1.a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.a0 = Math.max(0, i10);
        this.b0 = Math.max(0, i10);
        this.c0 = Math.max(0, ceil - 4);
        tabs.a = new f0(1, this, tabs);
        tabs.b = new p0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.b0, i11, this.c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new y0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp || marginLayoutParams.topMargin != dp2) {
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.topMargin = dp2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        r grid = this.h.getGrid();
        this.q0 = true;
        grid.g3 = new q0(this, grid, tabs);
        grid.f3 = new r0(this, grid);
        d dVar = this.x;
        if (dVar.T != grid) {
            dVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new b(dVar, 0));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        i0();
        grid.setClipToPadding(false);
        grid.j(new u0(0, this, tabs));
        tabs.bringToFront();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        if (this.W >= 0) {
            NotificationCenter.getInstance(this.Y).onAnimationFinish(this.W);
        }
        if (this.X >= 0) {
            NotificationCenter.getGlobalInstance().onAnimationFinish(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void i0() {
        t1 t1Var;
        r rVar = this.Z;
        if (rVar == null || (t1Var = this.d) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(t1Var.I.isEmpty() ? 12.0f : 73.0f);
        if (rVar.getPaddingBottom() != dp) {
            rVar.setPadding(rVar.getPaddingLeft(), rVar.getPaddingTop(), rVar.getPaddingRight(), dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        o0 o0Var = this.F;
        if (o0Var != null) {
            if (z10) {
                o0Var.e();
            }
            return false;
        }
        t1 t1Var = this.d;
        if (t1Var != null) {
            float f7 = t1Var.k1;
            if (f7 > 0.5f || t1Var.f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        t1Var.l1 = 0.0f;
                    } else if (t1Var.f1 > 0.5f) {
                        t1Var.g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.d == null || AndroidUtilities.isTablet()) {
            return null;
        }
        this.d.setRevealOpening(z10);
        this.d.setReveal(z10 ? 0.0f : 1.0f);
        int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new g0(this, i10));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z10 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new l0(this, z10, runnable, i10));
        AndroidUtilities.runOnUIThread(new a1.f(12, this, animatorSet));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        this.b = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        Bundle bundle3 = this.arguments;
        this.y = bundle3 != null && bundle3.getBoolean("immediate") && SharedConfig.getDevicePerformanceClass() == 2;
        if (this.a == 0 && this.b == 0) {
            this.a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        h0();
        org.telegram.ui.f fVar = this.c;
        if (fVar != null) {
            el0 el0Var = (el0) fVar.b;
            if (el0Var.b.remove(fVar)) {
                el0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            this.F = null;
        }
        f1 f1Var = this.e;
        if (f1Var != null) {
            f1Var.k();
            this.e = null;
        }
        t1 t1Var = this.d;
        if (t1Var != null) {
            t1Var.O0();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.g();
            o0 o0Var2 = this.F;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(o0Var2);
            }
            if (this.F == o0Var2) {
                this.F = null;
            }
            t1 t1Var = this.d;
            if (t1Var != null) {
                t1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.r0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.r0.booleanValue());
        this.r0 = null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 4) {
            boolean z10 = iArr.length > 0 && iArr[0] == 0;
            if (this.E && z10) {
                this.E = false;
                d0();
            }
            this.E = false;
            return;
        }
        if (getParentActivity() == null || i10 != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            b0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p0(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        int i11 = R.raw.permission_request_camera;
        int i12 = y6.L5;
        alertDialog$Builder.m(i11, 72, y6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        X();
        if (getParentActivity() != null) {
            AndroidUtilities.setLightNavigationBar(getParentActivity(), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        t1 t1Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (t1Var = this.d) != null) {
            t1Var.setReveal(1.0f);
        }
        if (!z10 || z11 || this.f == null) {
            return;
        }
        float f7 = h.S;
        long j10 = 0;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.getDevicePerformanceClass() == 2) {
            j10 = Math.max(0L, Math.round(w1.b[51]) - 860);
        }
        FrameLayout frameLayout = this.f;
        t0 t0Var = this.H;
        frameLayout.removeCallbacks(t0Var);
        this.f.postDelayed(t0Var, j10 + 680);
    }
}
