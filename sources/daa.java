// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class daa extends d implements jm7, vn5, aj6, g94 {
    public ne6 E;
    public w9a F;
    public pc0 G;
    public bf0 H;
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
    public e7a S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fn0 a;
    public float a0;
    public w91 b;
    public float b0;
    public q7c c;
    public final ArrayList c0;
    public zja d;
    public int d0;
    public zja e;
    public int e0;
    public v9a f;
    public int f0;
    public boolean g0;
    public wn5 h;
    public AnimatorSet n;
    public sb5 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public daa(Bundle bundle) {
        super(bundle);
        this.a = new fn0(0, this, d53.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            a0();
        }
    }

    @Override // vn5
    public final void H(float f) {
        sb5 sb5Var = this.r;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(f);
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        sb5 sb5Var = this.r;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(0.0f);
    }

    @Override // vn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1((vn5) this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 6));
    }

    public final void a0() {
        rja rjaVar;
        boolean z;
        if (!this.O || (z = (rjaVar = this.simpleActionBar).G) == this.g0) {
            return;
        }
        this.g0 = z;
        rjaVar.setBackButtonImageAnimated(z ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
        this.simpleActionBar.setBackButtonContentDescription(jb6.M0(z ? 2131754878 : 2131746233, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(ArrayList arrayList) {
        byte b;
        byte b2 = 0;
        int i = 0;
        if (this.d.x()) {
            arrayList.add(c6c.D(a.getCurrentActionBarHeight()));
            v9a v9aVar = this.f;
            ArrayList arrayList2 = v9aVar.d;
            ArrayList arrayList3 = v9aVar.w;
            if (v9aVar.x) {
                ArrayList arrayList4 = v9aVar.r;
                int size = arrayList4.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    CharSequence charSequence = (CharSequence) v9aVar.n.get(i2);
                    int i5 = maa.b;
                    c6c K = c6c.K(maa.class);
                    K.m = charSequence;
                    K.H = (tq8) obj;
                    arrayList.add(K);
                    i2 = i4;
                }
                if (v9aVar.s.isEmpty()) {
                    return;
                }
                arrayList.add(c6c.r(jb6.M0(2131745216, null)));
                ArrayList arrayList5 = v9aVar.s;
                int size2 = arrayList5.size();
                while (i < size2) {
                    Object obj2 = arrayList5.get(i);
                    i++;
                    int i6 = i2 + 1;
                    CharSequence charSequence2 = (CharSequence) v9aVar.n.get(i2);
                    int i7 = maa.b;
                    c6c K2 = c6c.K(maa.class);
                    K2.m = charSequence2;
                    K2.H = (bc7) obj2;
                    arrayList.add(K2);
                    i2 = i6;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(c6c.r(jb6.M0(2131745203, null)));
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList3.get(i8);
                    i8++;
                    if (obj3 instanceof tq8) {
                        tq8 tq8Var = (tq8) obj3;
                        String str = tq8Var.a;
                        int i9 = maa.b;
                        c6c K3 = c6c.K(maa.class);
                        K3.m = str;
                        K3.H = tq8Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof bc7) {
                        bc7 bc7Var = (bc7) obj3;
                        String str2 = bc7Var.a;
                        int i10 = maa.b;
                        c6c K4 = c6c.K(maa.class);
                        K4.m = str2;
                        K4.H = bc7Var;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(c6c.r(jb6.M0(2131745216, null)));
            int size4 = arrayList2.size();
            while (b2 < size4) {
                bc7 bc7Var2 = (bc7) arrayList2.get(b2);
                String str3 = bc7Var2.a;
                int i11 = maa.b;
                c6c K5 = c6c.K(maa.class);
                K5.m = str3;
                K5.H = bc7Var2;
                arrayList.add(K5);
                b2++;
            }
            return;
        }
        arrayList.add(c6c.n(this.x, nm7.R2));
        this.c0.clear();
        int i12 = 0;
        while (true) {
            b = 4;
            if (i12 >= 4) {
                break;
            }
            if (z8c.h(i12).o() && this.currentAccount != i12) {
                this.c0.add(Integer.valueOf(i12));
            }
            i12++;
        }
        Collections.sort(this.c0, new qx7((byte) 23));
        Set set = getMessagesController().u3;
        byte b3 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(baa.i(jb6.M0(2131749300, null), jb6.M0(2131749301, null), null, null, jb6.M0(2131749302, null), new t9a(this, b2)));
            arrayList.add(c6c.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().f() != null) {
            arrayList.add(baa.i(jb6.a0(null, null, 2131752093, mlb.l(new StringBuilder("+"), getUserConfig().f().phone, r58.f())), gm.N2(jb6.M0(2131752092, null), -1, 0, new s9a(this, b3), null), jb6.M0(2131752090, null), new t9a(this, b3), wsa.k2(jb6.M0(2131752088, null)), new t9a(this, (byte) 2)));
            arrayList.add(c6c.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(baa.i(jb6.M0(2131742466, null), jb6.M0(2131742465, null), jb6.M0(2131742464, null), new t9a(this, (byte) 3), jb6.M0(2131742463, null), new t9a(this, b)));
            arrayList.add(c6c.C(null));
        }
        if (this.c0.size() > 0) {
            aq1.o(2131745226, null, arrayList);
            for (int i13 = 0; i13 < this.c0.size(); i13++) {
                int intValue = ((Integer) this.c0.get(i13)).intValue();
                int i14 = x9a.b;
                c6c K6 = c6c.K(x9a.class);
                K6.d = i13;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(c6c.C(null));
        }
        boolean z = getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z && getMessagesController().l4.n0.f) {
            c C = c.C(this.currentAccount);
            int i15 = cmb.I.o() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            String M0 = jb6.M0(2131742877, null);
            int i16 = xib.W;
            CharSequence charSequence3 = M0;
            if (ConnectionsManager.getInstance(z8c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                charSequence3 = xib.b(M0);
            }
            arrayList.add(z9a.i(25, 0, 0, i15, charSequence3, null, C.z() > 0 ? c.s(C.z(), false) : null));
            arrayList.add(c6c.C(null));
        }
        arrayList.add(z9a.i(1, -14899731, -15431455, R.drawable.settings_account, jb6.M0(2131745228, null), jb6.M0(2131745227, null), null));
        arrayList.add(z9a.i(2, -1007845, -1996271, R.drawable.settings_chat, jb6.M0(2131745224, null), jb6.M0(2131745223, null), null));
        arrayList.add(z9a.i(3, -11154873, -14175180, R.drawable.settings_privacy, jb6.M0(2131745205, null), jb6.M0(2131745204, null), null));
        arrayList.add(z9a.i(5, -765355, -2148011, R.drawable.settings_sounds, jb6.M0(2131745209, null), jb6.M0(2131745208, null), null));
        arrayList.add(z9a.i(6, -11565578, -13276952, R.drawable.settings_data, jb6.M0(2131745222, null), jb6.M0(2131745221, null), null));
        arrayList.add(z9a.i(7, -14899731, -15497247, R.drawable.settings_folders, jb6.M0(2131745215, null), jb6.M0(2131745214, null), null));
        arrayList.add(z9a.i(8, -13451058, -14836538, R.drawable.settings_devices, jb6.M0(2131745219, null), jb6.M0(2131745218, null), null));
        arrayList.add(z9a.i(9, -881871, -1940716, R.drawable.settings_power, jb6.M0(2131745207, null), jb6.M0(2131745206, null), null));
        arrayList.add(z9a.i(10, -3903756, -6335009, R.drawable.settings_language, jb6.M0(2131745212, null), jb6.j0(), null));
        arrayList.add(c6c.C(null));
        if (!z && getMessagesController().l4.n0.f) {
            c C2 = c.C(this.currentAccount);
            int i17 = cmb.I.o() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            String M02 = jb6.M0(2131742877, null);
            int i18 = xib.W;
            CharSequence charSequence4 = M02;
            if (ConnectionsManager.getInstance(z8c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                charSequence4 = xib.b(M02);
            }
            arrayList.add(z9a.i(25, 0, 0, i17, charSequence4, null, C2.z() > 0 ? c.s(C2.z(), false) : null));
            arrayList.add(c6c.C(null));
        }
        if (!getMessagesController().H3()) {
            arrayList.add(z9a.i(11, -4826625, -10388225, R.drawable.settings_premium, jb6.M0(2131743916, null), null, null));
        }
        CharSequence charSequence5 = "";
        if (getMessagesController().c5()) {
            jva v = jva.v(this.currentAccount, false);
            arrayList.add(z9a.i(12, -1071598, -1608430, R.drawable.settings_stars, jb6.M0(2131743900, null), null, (!v.e || v.m().amount <= 0) ? "" : nxa.H0(v.m(), 0.85f, ' ')));
        }
        jva.v(this.currentAccount, true).m();
        org.telegram.messenger.a.m();
        jva v2 = jva.v(this.currentAccount, true);
        long j = v2.m().amount;
        String M03 = jb6.M0(2131749289, null);
        if (v2.e && j > 0) {
            charSequence5 = nxa.H0(v2.m(), 0.85f, ' ');
        }
        arrayList.add(z9a.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, M03, null, charSequence5));
        if (!getMessagesController().H3()) {
            arrayList.add(z9a.i(15, -765355, -2148011, R.drawable.settings_business, jb6.M0(2131743937, null), null, null));
        }
        if (!getMessagesController().I3()) {
            arrayList.add(z9a.i(16, -816335, -1940716, R.drawable.settings_gift, jb6.M0(2131745373, null), null, null));
        }
        if (((c6c) b10.f(1, arrayList)).a != 7) {
            arrayList.add(c6c.C(null));
        }
        arrayList.add(c6c.u(jb6.M0(2131745213, null)));
        arrayList.add(z9a.i(17, -1007845, -1996271, R.drawable.settings_ask, jb6.M0(2131753951, null), null, null));
        arrayList.add(z9a.i(18, -14965523, -15431455, R.drawable.settings_faq, jb6.M0(2131743927, null), null, null));
        arrayList.add(z9a.i(23, -3903756, -6335009, R.drawable.settings_features, jb6.M0(2131743924, null), null, null));
        arrayList.add(z9a.i(19, -11154873, -14175180, R.drawable.settings_policy, jb6.M0(2131746518, null), null, null));
        in0 in0Var = yed.a;
        in0Var.a();
        if (in0Var.d) {
            arrayList.add(c6c.C(null));
            arrayList.add(c6c.u(jb6.M0(2131745217, null)));
            arrayList.add(z9a.i(24, -765355, -2148011, 0, jb6.M0(2131745718, null), null, null));
            arrayList.add(z9a.i(26, -11154873, -14175180, 0, jb6.M0(2131753884, null), null, null));
            arrayList.add(z9a.i(27, -12743701, -13996071, 0, jb6.M0(2131749087, null), null, null));
        }
        if (e21.a) {
            arrayList.add(c6c.C(null));
            arrayList.add(c6c.u(jb6.M0(2131745220, null)));
            arrayList.add(z9a.i(20, -11154873, -14175180, 0, jb6.M0(2131751550, null), null, null));
            arrayList.add(z9a.i(21, -11154873, -14175180, 0, jb6.M0(2131751551, null), null, null));
            arrayList.add(z9a.i(22, -765355, -2148011, 0, jb6.M0(2131751587, null), null, null));
        }
        arrayList.add(c6c.m(this.N));
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    public final /* synthetic */ void c0() {
        oc7.r1(this.currentAccount).h0(null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new w91((byte) 8, context, this);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.g0 = true;
        this.simpleActionBar.setTitle(jb6.M0(2131745229, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 14));
        this.simpleActionBar.setBackground(null);
        yja t = this.simpleActionBar.t();
        zja a = t.a(0, R.drawable.outline_header_search);
        a.N();
        byte b = 21;
        a.C0 = new q20(this, b);
        this.d = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        zja a2 = t.a(1, R.drawable.ic_ab_other);
        this.e = a2;
        a2.setContentDescription(jb6.M0(2131754838, null));
        this.e.e(2, R.drawable.msg_leave, jb6.M0(2131748500, null));
        v9a v9aVar = new v9a(this, this, context);
        this.f = v9aVar;
        v9aVar.G();
        q7c q7cVar = new q7c(this, new vh8(this, b), new u9a(this), new u9a(this));
        this.c = q7cVar;
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        q7c q7cVar2 = this.c;
        q7cVar2.g3.r = false;
        q7cVar2.r1();
        this.c.setSectionsDrawBackground(true);
        eh0.e(this.c, 0, 0, gm.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new so7(this, b));
        this.b.addView(this.c, qoe.e(-1, -1, nm7.D1));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, qoe.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, qoe.e(-1, -2, 55));
        wn5 wn5Var = new wn5(0, true, true);
        this.h = wn5Var;
        wn5Var.I = true;
        wn5Var.a = this;
        wn5Var.b = this;
        this.x = new FrameLayout(context);
        ne6 ne6Var = new ne6(b, context, this);
        this.E = ne6Var;
        this.x.addView(ne6Var, qoe.d(nm7.E1, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new t9a(this, (byte) 5));
        rve.a(this.E);
        byte b2 = 6;
        this.x.addOnLayoutChangeListener(new ol1(this, b2));
        this.F = new w9a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, qoe.e(90, 90, 51));
        w91 w91Var = this.b;
        w91Var.addView(this.F, w91Var.indexOfChild(this.c) + 1, qoe.c(-1.0f, -1));
        this.G = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.H = bf0Var;
        bf0Var.setRoundRadius(gm.L(90.0f));
        this.y.addView(this.H, qoe.c(-1.0f, -1));
        sb5 sb5Var = new sb5(this, context);
        this.r = sb5Var;
        sb5Var.setSize(gm.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, qoe.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = gm.L(32.0f);
        int i = cmb.Z6;
        ShapeDrawable K = cmb.K(L, getThemedColor(i));
        wmb M = anb.M(i);
        ylb resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        anb.j(frameLayout2, K, M, null, resourceProvider);
        this.I.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L2 = gm.L(30.0f);
        int i2 = cmb.Ei;
        ShapeDrawable K2 = cmb.K(L2, getThemedColor(i2));
        wmb M2 = anb.M(i2);
        ylb resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        anb.j(frameLayout3, K2, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(R.drawable.filled_premium_camera);
        this.J.addView(this.K, qoe.e(22, 22, 17));
        this.I.addView(this.J, qoe.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        w91 w91Var2 = this.b;
        w91Var2.addView(this.I, w91Var2.indexOfChild(this.F) + 1, qoe.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(gm.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l = wi8.l(this.x, this.L, qoe.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView l2 = wi8.l(this.x, this.M, qoe.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = l2;
        l2.setTextSize(1, 14.0f);
        anb.X(this.N, cmb.A6, getResourceProvider());
        this.N.setPadding(gm.L(21.0f), gm.L(10.0f), gm.L(21.0f), gm.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i3 = cmb.h6;
        anb.R(textView3, cmb.f0(getThemedColor(i3), 2, -1), null, anb.M(i3), getResourceProvider());
        this.N.setOnClickListener(new t9a(this, b2));
        this.P = new View(context);
        o0(true, false);
        this.c.g3.O(false);
        m0(getUserConfig().f());
        q0();
        a0();
        this.simpleActionBar.setBackground(null);
        int i4 = this.mSystemInsets.b;
        if (this.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i4;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        w91 w91Var3 = this.b;
        u9a u9aVar = new u9a(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(w91Var3, u9aVar);
        w91 w91Var4 = this.b;
        this.fragmentView = w91Var4;
        return w91Var4;
    }

    public final /* synthetic */ void d0() {
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        if (W1 == null) {
            return;
        }
        wn5 wn5Var = this.h;
        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
        wn5Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new s9a(this, (byte) 0), new g5((byte) 6), 0);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q7c q7cVar;
        if (i == nm7.A3) {
            m0(getUserConfig().f());
            q7c q7cVar2 = this.c;
            if (q7cVar2 != null) {
                q7cVar2.g3.O(true);
                return;
            }
            return;
        }
        if (i == 2) {
            m0(getUserConfig().f());
        } else {
            if (i != nm7.s1 || (q7cVar = this.c) == null) {
                return;
            }
            q7cVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f0 = -1;
        if (tL_error == null) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(getUserConfig().e()));
            if (W1 == null) {
                W1 = getUserConfig().f();
                if (W1 == null) {
                    return;
                } else {
                    getMessagesController().c4(W1, false, false);
                }
            } else {
                getUserConfig().v(W1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, nm7.f2, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : bc4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            W1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.s != null) {
                bc4.G(this.currentAccount);
                File J = bc4.J(w, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.s, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.s.volume_id);
                sb.append("_");
                String k = hg9.k(sb, this.s.local_id, "@90_90");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@90_90"), gn5.m(this.currentAccount, 1, W1));
            }
            if (x != null && str != null) {
                bc4.G(this.currentAccount);
                new File(str).renameTo(bc4.J(x, "mp4", true, true));
            } else if (w2 != null && this.w != null) {
                bc4.G(this.currentAccount);
                File J2 = bc4.J(w2, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.w, null, true, true).renameTo(J2);
            }
            getMessagesController().T0(W1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(W1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
            if (X1 != null) {
                X1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(X1, false);
            }
            m0(W1);
        }
        this.s = null;
        this.w = null;
        n0(false, true);
        getNotificationCenter().k(2, Integer.valueOf(oc7.s5));
        getNotificationCenter().k(nm7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    public final /* synthetic */ void f0(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.s = fileLocation;
            this.w = photoSize2.location;
            this.H.m(gn5.e(fileLocation), "90_90", this.G, null);
            n0(true, false);
        } else {
            if (this.s == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.f0 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jl7(this, str, (byte) 25));
        }
        this.simpleActionBar.t().requestLayout();
    }

    public final void g0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
        hs6 d0 = hs6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o77((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    public final /* synthetic */ void h0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = oc7.r1(this.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new jl7(this, tL_attachMenuBot, (byte) 24), 66);
    }

    public final void i0(c6c c6cVar) {
        Object obj = c6cVar.H;
        byte b = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                quc.a(getParentActivity(), new ts9(this, tL_attachMenuBot, (byte) 4), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (c6cVar.H(x9a.class)) {
            int i = c6cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
                return;
            }
            return;
        }
        byte b2 = 0;
        if (c6cVar.H(maa.class)) {
            Object obj2 = c6cVar.H;
            if (obj2 instanceof tq8) {
                tq8 tq8Var = (tq8) obj2;
                tk5 parentLayout = getParentLayout();
                tq8Var.b.run();
                gm.f3(parentLayout, tq8Var.c);
            } else if (obj2 instanceof bc7) {
                nm7.f(this.currentAccount).k(nm7.c1, this.f.F, ((bc7) obj2).c);
            }
            Object obj3 = c6cVar.H;
            if (obj3 != null) {
                this.f.E(obj3);
                return;
            }
            return;
        }
        switch (c6cVar.d) {
            case 1:
                k0(new UserInfoActivity());
                break;
            case 2:
                k0(new ThemeActivity(0));
                break;
            case 3:
                k0(new PrivacySettingsActivity());
                break;
            case 5:
                k0(new NotificationsSettingsActivity());
                break;
            case 6:
                k0(new DataSettingsActivity());
                break;
            case 7:
                k0(new FiltersSetupActivity());
                break;
            case 8:
                k0(new SessionsActivity(0));
                break;
            case 9:
                k0(new m86());
                break;
            case 10:
                k0(new LanguageSelectActivity());
                break;
            case 11:
                k0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                k0(new nxa());
                break;
            case 13:
                k0(new yfb());
                break;
            case 15:
                k0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                yw4.f1(false, ok0.a(z8c.t0).b());
                break;
            case 17:
                showDialog(ik.R(this, this.resourceProvider));
                break;
            case 18:
                l11.u(getParentActivity(), jb6.M0(2131743925, null));
                break;
            case 19:
                l11.u(getParentActivity(), jb6.M0(2131746516, null));
                break;
            case 20:
                ProfileActivity.p3(getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.p3(getParentActivity(), true);
                break;
            case 22:
                fc4.a();
                break;
            case 23:
                if (!oc7.r1(this.currentAccount).u2()) {
                    l11.u(getParentActivity(), jb6.M0(2131743923, null));
                    break;
                } else {
                    h5.b(this.currentAccount);
                    break;
                }
            case 24:
                presentFragment(new vn9(bundle, b2));
                break;
            case 25:
                k0(new goc());
                break;
            case 26:
                presentFragment(new vn9(bundle, b));
                break;
            case 27:
                kf5 kf5Var = new kf5();
                kf5Var.e = true;
                presentFragment(kf5Var);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    @Override // aj6
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final boolean j0(c6c c6cVar, View view) {
        Object obj = c6cVar.H;
        byte b = 1;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            wx0.l(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new s9a(this, (byte) 2));
            return true;
        }
        if (c6cVar.H(maa.class)) {
            Object obj2 = c6cVar.H;
            String str = obj2 instanceof tq8 ? ((tq8) obj2).h : obj2 instanceof bc7 ? ((bc7) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                bu5 I = bu5.I(this, view);
                I.b(R.drawable.msg_link2, jb6.M0(2131751699, null), new e6a(this, str, b), false);
                I.X(this.c.V0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    public final void k0(d dVar) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!gm.O1() || (launchActivity = LaunchActivity.H1) == null || (actionBarLayout = launchActivity.r0) == null) {
            presentFragment(dVar);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.c0((d) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.j(false, false);
        }
        qk5 qk5Var = new qk5(dVar);
        qk5Var.c = true;
        qk5Var.g = true;
        actionBarLayout.R(qk5Var);
    }

    public final void l0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final void m0(TLRPC.User user) {
        String str;
        if (this.H == null || this.f0 != -1) {
            return;
        }
        this.G.q(user);
        this.H.f(user, this.G);
        this.L.setText(m9c.r(user));
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(r58.f().e("+" + user.phone));
        }
        String p = m9c.p(user);
        if (p != null) {
            sb.append(" • @");
            sb.append(p);
        }
        this.M.setText(sb);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0);
            int i = packageInfo.versionCode;
            int i2 = i / 10;
            int i3 = i % 10;
            if (i3 == 1 || i3 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                org.telegram.messenger.a.t();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            str2 = jb6.a0(null, null, 2131743895, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z, boolean z2) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z2) {
            sb5 sb5Var = this.r;
            if (z) {
                sb5Var.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            } else {
                sb5Var.setAlpha(0.0f);
                this.r.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        sb5 sb5Var2 = this.r;
        if (z) {
            sb5Var2.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<sb5, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(sb5Var2, (Property<sb5, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new sw9((byte) 2, this, z));
        this.n.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.simpleActionBar.getHeight()) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(boolean z, boolean z2) {
        boolean z3;
        ValueAnimator valueAnimator;
        if (!this.d.x()) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z3 = false;
            if (this.U == z3 || z) {
                this.U = z3;
                valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                if (z2) {
                    l0(z3 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z3 ? 1.0f : 0.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new p29(this, (byte) 25));
                this.V.setInterpolator(d53.h);
                this.V.setDuration(420L);
                this.V.start();
                return;
            }
            return;
        }
        z3 = true;
        if (this.U == z3) {
        }
        this.U = z3;
        valueAnimator = this.V;
        if (valueAnimator != null) {
        }
        if (z2) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        rja rjaVar = this.simpleActionBar;
        if (!rjaVar.G) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        rjaVar.o(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        e7a e7aVar = this.S;
        if (e7aVar != null) {
            e7aVar.a();
            this.S = null;
        }
        e7a e7aVar2 = new e7a(nm7.e(), this);
        e7aVar2.b(2);
        e7aVar2.b(nm7.A3);
        e7aVar2.b(nm7.s1);
        this.S = e7aVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        this.e0 = this.O ? gm.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e7a e7aVar = this.S;
        if (e7aVar != null) {
            e7aVar.a();
            this.S = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        l7c l7cVar = this.c.g3;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    public final void p0() {
        if (this.F == null || this.y == null) {
            return;
        }
        float height = this.E.getHeight() / 2.0f;
        View view = this.E;
        float f = 1.0f;
        while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
            height += view.getY();
            f *= view.getAlpha();
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
        float f2 = 0.0f;
        for (View view2 = this.x; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
            f2 += view2.getY();
        }
        float paddingTop = (height - f2) + this.c.getPaddingTop();
        w9a w9aVar = this.F;
        float f3 = -gm.L(16.0f);
        yl7 yl7Var = w9aVar.n;
        if (yl7Var != null && yl7Var.c) {
            f3 = yl7Var.e.centerY();
        }
        float a = pqe.a((height - f3) / Math.max(1.0f, paddingTop - f3), 0.0f, 1.0f);
        float max = Math.max(height, f3);
        this.Z = height;
        this.a0 = paddingTop;
        this.b0 = f3;
        float L = gm.L(90.0f);
        float scaleX = this.E.getScaleX() * (gm.R1(gm.L(this.F.getHiddenAvatarSizeDp()), L, a) / L);
        float f4 = (L * scaleX) / 2.0f;
        float width = (this.F.getWidth() / 2.0f) - f4;
        if (max == this.W && scaleX == this.X && a == this.Y && f == this.F.getAlpha() && width == this.y.getTranslationX()) {
            return;
        }
        this.W = max;
        this.X = scaleX;
        this.Y = a;
        this.F.setAlpha(f);
        this.y.setScaleX(scaleX);
        this.y.setScaleY(scaleX);
        this.y.setTranslationX(width);
        float f5 = max - f4;
        this.y.setTranslationY(f5);
        this.I.setAlpha(pqe.a(gm.x1(a, 0.75f, 1.0f), 0.0f, 1.0f) * f);
        this.I.setScaleX(scaleX);
        this.I.setScaleY(scaleX);
        this.I.setTranslationX((gm.L(60.0f) * scaleX) + width);
        this.I.setTranslationY((gm.L(60.0f) * scaleX) + f5);
        this.F.setHideProgress(1.0f - a);
    }

    public final void q0() {
        this.L.setTextColor(getThemedColor(cmb.F6));
        this.M.setTextColor(getThemedColor(cmb.x6));
        this.d.V();
        int themedColor = getThemedColor(cmb.c6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // aj6
    public final void u() {
        this.c.z0(0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    @Override // aj6
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // aj6
    public final void F() {
    }

    @Override // vn5
    public final void T() {
    }

    public daa() {
        this(null);
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
