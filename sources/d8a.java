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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d8a extends d implements gk7, vl5, zg6, x74 {
    public oc6 E;
    public w7a F;
    public pb0 G;
    public be0 H;
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
    public wtc S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fm0 a;
    public float a0;
    public n81 b;
    public float b0;
    public q5c c;
    public final ArrayList c0;
    public xha d;
    public int d0;
    public xha e;
    public int e0;
    public v7a f;
    public int f0;
    public boolean g0;
    public wl5 h;
    public AnimatorSet n;
    public u95 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public d8a(Bundle bundle) {
        super(bundle);
        this.a = new fm0(0, this, s33.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.c0 = new ArrayList();
        this.f0 = -1;
        this.g0 = true;
    }

    @Override // zg6
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // vl5
    public final void H(float f) {
        u95 u95Var = this.r;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        u95 u95Var = this.r;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(0.0f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.c3(new ph1((vl5) this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 6));
    }

    public final void Z() {
        pha phaVar;
        boolean z;
        if (!this.O || (z = (phaVar = this.simpleActionBar).G) == this.g0) {
            return;
        }
        this.g0 = z;
        phaVar.setBackButtonImageAnimated(z ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
        this.simpleActionBar.setBackButtonContentDescription(k96.M0(z ? 2131754878 : 2131746307, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(ArrayList arrayList) {
        byte b;
        byte b2 = 0;
        int i = 0;
        if (this.d.x()) {
            arrayList.add(c4c.D(a.getCurrentActionBarHeight()));
            v7a v7aVar = this.f;
            ArrayList arrayList2 = v7aVar.d;
            ArrayList arrayList3 = v7aVar.w;
            if (v7aVar.x) {
                ArrayList arrayList4 = v7aVar.r;
                int size = arrayList4.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    CharSequence charSequence = (CharSequence) v7aVar.n.get(i2);
                    int i5 = m8a.b;
                    c4c K = c4c.K(m8a.class);
                    K.m = charSequence;
                    K.H = (so8) obj;
                    arrayList.add(K);
                    i2 = i4;
                }
                if (v7aVar.s.isEmpty()) {
                    return;
                }
                arrayList.add(c4c.r(k96.M0(2131745290, null)));
                ArrayList arrayList5 = v7aVar.s;
                int size2 = arrayList5.size();
                while (i < size2) {
                    Object obj2 = arrayList5.get(i);
                    i++;
                    int i6 = i2 + 1;
                    CharSequence charSequence2 = (CharSequence) v7aVar.n.get(i2);
                    int i7 = m8a.b;
                    c4c K2 = c4c.K(m8a.class);
                    K2.m = charSequence2;
                    K2.H = (aa7) obj2;
                    arrayList.add(K2);
                    i2 = i6;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(c4c.r(k96.M0(2131745277, null)));
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList3.get(i8);
                    i8++;
                    if (obj3 instanceof so8) {
                        so8 so8Var = (so8) obj3;
                        String str = so8Var.a;
                        int i9 = m8a.b;
                        c4c K3 = c4c.K(m8a.class);
                        K3.m = str;
                        K3.H = so8Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof aa7) {
                        aa7 aa7Var = (aa7) obj3;
                        String str2 = aa7Var.a;
                        int i10 = m8a.b;
                        c4c K4 = c4c.K(m8a.class);
                        K4.m = str2;
                        K4.H = aa7Var;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(c4c.r(k96.M0(2131745290, null)));
            int size4 = arrayList2.size();
            while (b2 < size4) {
                aa7 aa7Var2 = (aa7) arrayList2.get(b2);
                String str3 = aa7Var2.a;
                int i11 = m8a.b;
                c4c K5 = c4c.K(m8a.class);
                K5.m = str3;
                K5.H = aa7Var2;
                arrayList.add(K5);
                b2++;
            }
            return;
        }
        arrayList.add(c4c.n(this.x, kk7.R2));
        this.c0.clear();
        int i12 = 0;
        while (true) {
            b = 4;
            if (i12 >= 4) {
                break;
            }
            if (y6c.h(i12).o() && this.currentAccount != i12) {
                this.c0.add(Integer.valueOf(i12));
            }
            i12++;
        }
        Collections.sort(this.c0, new fx7((byte) 22));
        Set set = getMessagesController().u3;
        byte b3 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(b8a.i(k96.M0(2131749351, null), k96.M0(2131749352, null), null, null, k96.M0(2131749353, null), new s7a(this, b2)));
            arrayList.add(c4c.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().f() != null) {
            arrayList.add(b8a.i(k96.a0(null, null, 2131752144, yjb.k(new StringBuilder("+"), getUserConfig().f().phone, p38.f())), gl.N2(k96.M0(2131752143, null), -1, 0, new r7a(this, b3), null), k96.M0(2131752141, null), new s7a(this, b3), vqa.k2(k96.M0(2131752139, null)), new s7a(this, (byte) 2)));
            arrayList.add(c4c.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(b8a.i(k96.M0(2131742540, null), k96.M0(2131742539, null), k96.M0(2131742538, null), new s7a(this, (byte) 3), k96.M0(2131742537, null), new s7a(this, b)));
            arrayList.add(c4c.C(null));
        }
        if (this.c0.size() > 0) {
            oo1.o(2131745300, null, arrayList);
            for (int i13 = 0; i13 < this.c0.size(); i13++) {
                int intValue = ((Integer) this.c0.get(i13)).intValue();
                int i14 = x7a.b;
                c4c K6 = c4c.K(x7a.class);
                K6.d = i13;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(c4c.C(null));
        }
        boolean z = getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z && getMessagesController().k4.n0.f) {
            c C = c.C(this.currentAccount);
            int i15 = bkb.I.o() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            String M0 = k96.M0(2131742951, null);
            int i16 = wgb.W;
            CharSequence charSequence3 = M0;
            if (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                charSequence3 = wgb.b(M0);
            }
            arrayList.add(z7a.i(25, 0, 0, i15, charSequence3, null, C.z() > 0 ? c.s(C.z(), false) : null));
            arrayList.add(c4c.C(null));
        }
        arrayList.add(z7a.i(1, -14899731, -15431455, R.drawable.settings_account, k96.M0(2131745302, null), k96.M0(2131745301, null), null));
        arrayList.add(z7a.i(2, -1007845, -1996271, R.drawable.settings_chat, k96.M0(2131745298, null), k96.M0(2131745297, null), null));
        arrayList.add(z7a.i(3, -11154873, -14175180, R.drawable.settings_privacy, k96.M0(2131745279, null), k96.M0(2131745278, null), null));
        arrayList.add(z7a.i(5, -765355, -2148011, R.drawable.settings_sounds, k96.M0(2131745283, null), k96.M0(2131745282, null), null));
        arrayList.add(z7a.i(6, -11565578, -13276952, R.drawable.settings_data, k96.M0(2131745296, null), k96.M0(2131745295, null), null));
        arrayList.add(z7a.i(7, -14899731, -15497247, R.drawable.settings_folders, k96.M0(2131745289, null), k96.M0(2131745288, null), null));
        arrayList.add(z7a.i(8, -13451058, -14836538, R.drawable.settings_devices, k96.M0(2131745293, null), k96.M0(2131745292, null), null));
        arrayList.add(z7a.i(9, -881871, -1940716, R.drawable.settings_power, k96.M0(2131745281, null), k96.M0(2131745280, null), null));
        arrayList.add(z7a.i(10, -3903756, -6335009, R.drawable.settings_language, k96.M0(2131745286, null), k96.j0(), null));
        arrayList.add(c4c.C(null));
        if (!z && getMessagesController().k4.n0.f) {
            c C2 = c.C(this.currentAccount);
            int i17 = bkb.I.o() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            String M02 = k96.M0(2131742951, null);
            int i18 = wgb.W;
            CharSequence charSequence4 = M02;
            if (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - 1790679020 <= 2419200) {
                charSequence4 = wgb.b(M02);
            }
            arrayList.add(z7a.i(25, 0, 0, i17, charSequence4, null, C2.z() > 0 ? c.s(C2.z(), false) : null));
            arrayList.add(c4c.C(null));
        }
        if (!getMessagesController().F3()) {
            arrayList.add(z7a.i(11, -4826625, -10388225, R.drawable.settings_premium, k96.M0(2131743990, null), null, null));
        }
        CharSequence charSequence5 = "";
        if (getMessagesController().a5()) {
            gta v = gta.v(this.currentAccount, false);
            arrayList.add(z7a.i(12, -1071598, -1608430, R.drawable.settings_stars, k96.M0(2131743974, null), null, (!v.e || v.m().amount <= 0) ? "" : jva.G0(v.m(), 0.85f, ' ')));
        }
        gta.v(this.currentAccount, true).m();
        org.telegram.messenger.a.m();
        gta v2 = gta.v(this.currentAccount, true);
        long j = v2.m().amount;
        String M03 = k96.M0(2131749340, null);
        if (v2.e && j > 0) {
            charSequence5 = jva.G0(v2.m(), 0.85f, ' ');
        }
        arrayList.add(z7a.i(13, -14965523, -15431455, R.drawable.filled_gram_earnings, M03, null, charSequence5));
        if (!getMessagesController().F3()) {
            arrayList.add(z7a.i(15, -765355, -2148011, R.drawable.settings_business, k96.M0(2131744011, null), null, null));
        }
        if (!getMessagesController().G3()) {
            arrayList.add(z7a.i(16, -816335, -1940716, R.drawable.settings_gift, k96.M0(2131745447, null), null, null));
        }
        if (((c4c) b00.f(1, arrayList)).a != 7) {
            arrayList.add(c4c.C(null));
        }
        arrayList.add(c4c.u(k96.M0(2131745287, null)));
        arrayList.add(z7a.i(17, -1007845, -1996271, R.drawable.settings_ask, k96.M0(2131753983, null), null, null));
        arrayList.add(z7a.i(18, -14965523, -15431455, R.drawable.settings_faq, k96.M0(2131744001, null), null, null));
        arrayList.add(z7a.i(23, -3903756, -6335009, R.drawable.settings_features, k96.M0(2131743998, null), null, null));
        arrayList.add(z7a.i(19, -11154873, -14175180, R.drawable.settings_policy, k96.M0(2131746592, null), null, null));
        im0 im0Var = wcd.a;
        im0Var.a();
        if (im0Var.d) {
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131745291, null)));
            arrayList.add(z7a.i(24, -765355, -2148011, 0, k96.M0(2131745792, null), null, null));
            arrayList.add(z7a.i(26, -11154873, -14175180, 0, k96.M0(2131753916, null), null, null));
            arrayList.add(z7a.i(27, -12743701, -13996071, 0, k96.M0(2131749138, null), null, null));
        }
        if (w01.a) {
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131745294, null)));
            arrayList.add(z7a.i(20, -11154873, -14175180, 0, k96.M0(2131751601, null), null, null));
            arrayList.add(z7a.i(21, -11154873, -14175180, 0, k96.M0(2131751602, null), null, null));
            arrayList.add(z7a.i(22, -765355, -2148011, 0, k96.M0(2131751638, null), null, null));
        }
        arrayList.add(c4c.m(this.N));
    }

    public final /* synthetic */ void b0() {
        na7.q1(this.currentAccount).h0(null);
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    public final /* synthetic */ void c0() {
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
        if (V1 == null) {
            V1 = y6c.h(this.currentAccount).f();
        }
        if (V1 == null) {
            return;
        }
        wl5 wl5Var = this.h;
        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
        wl5Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new r7a(this, (byte) 0), new g5((byte) 6), 0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new n81((byte) 8, context, this);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.g0 = true;
        this.simpleActionBar.setTitle(k96.M0(2131745303, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 13));
        this.simpleActionBar.setBackground(null);
        wha t = this.simpleActionBar.t();
        xha a = t.a(0, R.drawable.outline_header_search);
        a.N();
        byte b = 21;
        a.C0 = new q10(this, b);
        this.d = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        xha a2 = t.a(1, R.drawable.ic_ab_other);
        this.e = a2;
        a2.setContentDescription(k96.M0(2131754838, null));
        this.e.e(2, R.drawable.msg_leave, k96.M0(2131748551, null));
        v7a v7aVar = new v7a(this, this, context);
        this.f = v7aVar;
        v7aVar.G();
        q5c q5cVar = new q5c(this, new tf8(this, b), new u7a(this), new u7a(this));
        this.c = q5cVar;
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        q5c q5cVar2 = this.c;
        q5cVar2.g3.r = false;
        q5cVar2.r1();
        this.c.setSectionsDrawBackground(true);
        dg0.e(this.c, 0, 0, gl.L(12.0f), this.e0);
        this.c.setClipToPadding(false);
        this.c.j(new n58(this, (byte) 20));
        this.b.addView(this.c, nme.e(-1, -1, kk7.D1));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.b.addView(this.Q, nme.e(-1, 0, 48));
        this.b.addView(this.simpleActionBar, nme.e(-1, -2, 55));
        wl5 wl5Var = new wl5(0, true, true);
        this.h = wl5Var;
        wl5Var.I = true;
        wl5Var.a = this;
        wl5Var.b = this;
        this.x = new FrameLayout(context);
        oc6 oc6Var = new oc6(b, context, this);
        this.E = oc6Var;
        this.x.addView(oc6Var, nme.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new s7a(this, (byte) 5));
        ote.a(this.E);
        byte b2 = 6;
        this.x.addOnLayoutChangeListener(new gk1(this, b2));
        this.F = new w7a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        this.F.addView(this.y, nme.e(90, 90, 51));
        n81 n81Var = this.b;
        n81Var.addView(this.F, n81Var.indexOfChild(this.c) + 1, nme.c(-1.0f, -1));
        this.G = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.H = be0Var;
        be0Var.setRoundRadius(gl.L(90.0f));
        this.y.addView(this.H, nme.c(-1.0f, -1));
        u95 u95Var = new u95(this, context);
        this.r = u95Var;
        u95Var.setSize(gl.L(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.y.addView(this.r, nme.c(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = gl.L(32.0f);
        int i = bkb.Z6;
        ShapeDrawable K = bkb.K(L, getThemedColor(i));
        vkb M = zkb.M(i);
        wjb resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        zkb.j(frameLayout2, K, M, null, resourceProvider);
        this.I.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L2 = gl.L(30.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K2 = bkb.K(L2, getThemedColor(i2));
        vkb M2 = zkb.M(i2);
        wjb resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        zkb.j(frameLayout3, K2, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(R.drawable.filled_premium_camera);
        this.J.addView(this.K, nme.e(22, 22, 17));
        this.I.addView(this.J, nme.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        n81 n81Var2 = this.b;
        n81Var2.addView(this.I, n81Var2.indexOfChild(this.F) + 1, nme.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(gl.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l = ug8.l(this.x, this.L, nme.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = l;
        l.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView l2 = ug8.l(this.x, this.M, nme.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = l2;
        l2.setTextSize(1, 14.0f);
        zkb.X(this.N, bkb.A6, getResourceProvider());
        this.N.setPadding(gl.L(21.0f), gl.L(10.0f), gl.L(21.0f), gl.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i3 = bkb.h6;
        zkb.R(textView3, bkb.f0(getThemedColor(i3), 2, -1), null, zkb.M(i3), getResourceProvider());
        this.N.setOnClickListener(new s7a(this, b2));
        this.P = new View(context);
        n0(true, false);
        this.c.g3.O(false);
        l0(getUserConfig().f());
        p0();
        Z();
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
        n0(true, false);
        n81 n81Var3 = this.b;
        u7a u7aVar = new u7a(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(n81Var3, u7aVar);
        n81 n81Var4 = this.b;
        this.fragmentView = n81Var4;
        return n81Var4;
    }

    public final void d0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f0 = -1;
        if (tL_error == null) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(getUserConfig().e()));
            if (V1 == null) {
                V1 = getUserConfig().f();
                if (V1 == null) {
                    return;
                } else {
                    getMessagesController().a4(V1, false, false);
                }
            } else {
                getUserConfig().v(V1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = ba4.w(arrayList, kk7.f2, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : ba4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            V1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.s != null) {
                ba4.G(this.currentAccount);
                File J = ba4.J(w, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.s, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.s.volume_id);
                sb.append("_");
                String l = de9.l(sb, this.s.local_id, "@90_90");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fl5.z().O(l, de9.l(sb2, w.location.local_id, "@90_90"), gl5.m(this.currentAccount, 1, V1));
            }
            if (x != null && str != null) {
                ba4.G(this.currentAccount);
                new File(str).renameTo(ba4.J(x, "mp4", true, true));
            } else if (w2 != null && this.w != null) {
                ba4.G(this.currentAccount);
                File J2 = ba4.J(w2, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.w, null, true, true).renameTo(J2);
            }
            getMessagesController().S0(V1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(V1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
            if (W1 != null) {
                W1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(W1, false);
            }
            l0(V1);
        }
        this.s = null;
        this.w = null;
        m0(false, true);
        getNotificationCenter().k(2, Integer.valueOf(na7.q5));
        getNotificationCenter().k(kk7.i0, new Object[0]);
        getUserConfig().u(true);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q5c q5cVar;
        if (i == kk7.z3) {
            l0(getUserConfig().f());
            q5c q5cVar2 = this.c;
            if (q5cVar2 != null) {
                q5cVar2.g3.O(true);
                return;
            }
            return;
        }
        if (i == 2) {
            l0(getUserConfig().f());
        } else {
            if (i != kk7.r1 || (q5cVar = this.c) == null) {
                return;
            }
            q5cVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final /* synthetic */ void e0(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.s = fileLocation;
            this.w = photoSize2.location;
            this.H.m(gl5.e(fileLocation), "90_90", this.G, null);
            m0(true, false);
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
            this.f0 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new hj7(this, str, (byte) 25));
        }
        this.simpleActionBar.t().requestLayout();
    }

    public final void f0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
        hq6 d0 = hq6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o57((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final /* synthetic */ void g0(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hj7(this, tL_attachMenuBot, (byte) 24), 66);
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void h0(c4c c4cVar) {
        Object obj = c4cVar.H;
        byte b = 1;
        Bundle bundle = null;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                psc.a(getParentActivity(), new nu9(this, tL_attachMenuBot, (byte) 3), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.H1, this.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (c4cVar.H(x7a.class)) {
            int i = c4cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
                return;
            }
            return;
        }
        byte b2 = 0;
        if (c4cVar.H(m8a.class)) {
            Object obj2 = c4cVar.H;
            if (obj2 instanceof so8) {
                so8 so8Var = (so8) obj2;
                ui5 parentLayout = getParentLayout();
                so8Var.b.run();
                gl.f3(parentLayout, so8Var.c);
            } else if (obj2 instanceof aa7) {
                kk7.f(this.currentAccount).k(kk7.b1, this.f.F, ((aa7) obj2).c);
            }
            Object obj3 = c4cVar.H;
            if (obj3 != null) {
                this.f.E(obj3);
                return;
            }
            return;
        }
        switch (c4cVar.d) {
            case 1:
                j0(new UserInfoActivity());
                break;
            case 2:
                j0(new ThemeActivity(0));
                break;
            case 3:
                j0(new PrivacySettingsActivity());
                break;
            case 5:
                j0(new NotificationsSettingsActivity());
                break;
            case 6:
                j0(new DataSettingsActivity());
                break;
            case 7:
                j0(new FiltersSetupActivity());
                break;
            case 8:
                j0(new SessionsActivity(0));
                break;
            case 9:
                j0(new m66());
                break;
            case 10:
                j0(new LanguageSelectActivity());
                break;
            case 11:
                j0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                j0(new jva());
                break;
            case 13:
                j0(new ydb());
                break;
            case 15:
                j0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                xu4.f1(false, oj0.a(y6c.t0).b());
                break;
            case 17:
                showDialog(ij.R(this, this.resourceProvider));
                break;
            case 18:
                d01.t(getParentActivity(), k96.M0(2131743999, null));
                break;
            case 19:
                d01.t(getParentActivity(), k96.M0(2131746590, null));
                break;
            case 20:
                ProfileActivity.l3(getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.l3(getParentActivity(), true);
                break;
            case 22:
                fa4.a();
                break;
            case 23:
                if (!na7.q1(this.currentAccount).t2()) {
                    d01.t(getParentActivity(), k96.M0(2131743997, null));
                    break;
                } else {
                    h5.b(this.currentAccount);
                    break;
                }
            case 24:
                presentFragment(new vl9(bundle, b2));
                break;
            case 25:
                j0(new hmc());
                break;
            case 26:
                presentFragment(new vl9(bundle, b));
                break;
            case 27:
                md5 md5Var = new md5();
                md5Var.e = true;
                presentFragment(md5Var);
                break;
        }
    }

    public final boolean i0(c4c c4cVar, View view) {
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ow0.l(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new r7a(this, (byte) 2));
            return true;
        }
        if (c4cVar.H(m8a.class)) {
            Object obj2 = c4cVar.H;
            String str = obj2 instanceof so8 ? ((so8) obj2).h : obj2 instanceof aa7 ? ((aa7) obj2).c : null;
            if (!TextUtils.isEmpty(str)) {
                cs5 I = cs5.I(this, view);
                I.b(R.drawable.msg_link2, k96.M0(2131751750, null), new tj9(this, str, (byte) 29), false);
                I.X(this.c.V0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    @Override // zg6
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(d dVar) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!gl.O1() || (launchActivity = LaunchActivity.H1) == null || (actionBarLayout = launchActivity.r0) == null) {
            presentFragment(dVar);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.c0((d) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.j(false, false);
        }
        ri5 ri5Var = new ri5(dVar);
        ri5Var.c = true;
        ri5Var.g = true;
        actionBarLayout.R(ri5Var);
    }

    public final void k0(float f) {
        this.simpleActionBar.setTitlesAlpha(f);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        if (this.H == null || this.f0 != -1) {
            return;
        }
        this.G.q(user);
        this.H.f(user, this.G);
        this.L.setText(l7c.r(user));
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(p38.f().e("+" + user.phone));
        }
        String p = l7c.p(user);
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
            str2 = k96.a0(null, null, 2131743969, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        textView.setText(str2);
    }

    public final void m0(boolean z, boolean z2) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z2) {
            u95 u95Var = this.r;
            if (z) {
                u95Var.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            } else {
                u95Var.setAlpha(0.0f);
                this.r.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        u95 u95Var2 = this.r;
        if (z) {
            u95Var2.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<u95, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(u95Var2, (Property<u95, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new pu9((byte) 2, this, z));
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
    public final void n0(boolean z, boolean z2) {
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
                    k0(z3 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z3 ? 1.0f : 0.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new x89(this, (byte) 23));
                this.V.setInterpolator(s33.h);
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

    public final void o0() {
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
        w7a w7aVar = this.F;
        float f3 = -gl.L(16.0f);
        vj7 vj7Var = w7aVar.n;
        if (vj7Var != null && vj7Var.c) {
            f3 = vj7Var.e.centerY();
        }
        float a = moe.a((height - f3) / Math.max(1.0f, paddingTop - f3), 0.0f, 1.0f);
        float max = Math.max(height, f3);
        this.Z = height;
        this.a0 = paddingTop;
        this.b0 = f3;
        float L = gl.L(90.0f);
        float scaleX = this.E.getScaleX() * (gl.R1(gl.L(this.F.getHiddenAvatarSizeDp()), L, a) / L);
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
        this.I.setAlpha(moe.a(gl.x1(a, 0.75f, 1.0f), 0.0f, 1.0f) * f);
        this.I.setScaleX(scaleX);
        this.I.setScaleY(scaleX);
        this.I.setTranslationX((gl.L(60.0f) * scaleX) + width);
        this.I.setTranslationY((gl.L(60.0f) * scaleX) + f5);
        this.F.setHideProgress(1.0f - a);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        pha phaVar = this.simpleActionBar;
        if (!phaVar.G) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        phaVar.n(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        wtc wtcVar = this.S;
        if (wtcVar != null) {
            wtcVar.a();
            this.S = null;
        }
        wtc wtcVar2 = new wtc(kk7.e(), this);
        wtcVar2.b(2);
        wtcVar2.b(kk7.z3);
        wtcVar2.b(kk7.r1);
        this.S = wtcVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        this.e0 = this.O ? gl.L(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wtc wtcVar = this.S;
        if (wtcVar != null) {
            wtcVar.a();
            this.S = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        l5c l5cVar = this.c.g3;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            Z();
        }
    }

    public final void p0() {
        this.L.setTextColor(getThemedColor(bkb.F6));
        this.M.setTextColor(getThemedColor(bkb.x6));
        this.d.V();
        int themedColor = getThemedColor(bkb.c6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // zg6
    public final void v() {
        this.c.z0(0);
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    @Override // vl5
    public final void T() {
    }

    public d8a() {
        this(null);
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
