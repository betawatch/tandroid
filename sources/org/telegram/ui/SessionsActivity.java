package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public bk8 Y;
    public g7a a;
    public ns9 b;
    public g24 c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public c7a r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final boolean w;
    public int x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionsActivity(int i) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.V = 0;
        this.w = i;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        new pi4(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        pha phaVar = this.simpleActionBar;
        boolean z = this.w;
        if (z) {
            phaVar.setTitle(k96.M0(2131742648, null));
        } else {
            phaVar.setTitle(k96.M0(2131751443, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 12));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new g7a(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.c = g24Var;
        g24Var.b();
        ns9 ns9Var = new ns9((byte) 2, context, this);
        this.b = ns9Var;
        ns9Var.r1();
        this.b.setLayoutManager(new zr((byte) 16, i, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        ns9 ns9Var2 = this.b;
        ns9Var2.X1 = true;
        ns9Var2.Y1 = false;
        frameLayout.addView(ns9Var2, nme.c(-1.0f, -1));
        frameLayout.addView(this.c, nme.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        this.b.setItemAnimator(gb3Var);
        this.b.setOnItemClickListener(new f09(this, (byte) 7));
        if (!z) {
            c7a c7aVar = new c7a(this, context);
            this.r = c7aVar;
            frameLayout.addView(c7aVar, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        q0();
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.t0) {
            o0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ld5.class, o5a.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        int i = bkb.o7;
        arrayList.add(new blb(this.b, 262148, new Class[]{uib.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 262148, new Class[]{uib.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.p6));
        arrayList.add(new blb(this.b, 262144, new Class[]{o5a.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (alb) null, bkb.H6));
        arrayList.add(new blb(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    public final int h0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (!this.w ? 1 : 0);
    }

    public final /* synthetic */ void i0() {
        if (!this.w) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new w6a(this, (byte) 2));
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new w6a(this, (byte) 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        if (getParentActivity() != null) {
            hd hdVar = new hd(3, null, getParentActivity());
            hdVar.j0 = false;
            hdVar.show();
            int i2 = this.K;
            ArrayList arrayList = this.d;
            if (this.w) {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i - i2);
                TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
                resetwebauthorization.hash = tL_webAuthorization.hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new ck8((Object) this, (Object) hdVar, (Object) tL_webAuthorization, (byte) 12));
                if (zArr[0]) {
                    na7.q1(this.currentAccount).t(tL_webAuthorization.bot_id);
                    return;
                }
                return;
            }
            if (i < i2 || i >= this.L) {
                tL_authorization = (TLRPC.TL_authorization) this.e.get(i - this.G);
            } else {
                tL_authorization = (TLRPC.TL_authorization) arrayList.get(i - i2);
            }
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new ck8((Object) this, (Object) hdVar, (Object) tL_authorization, (byte) 11));
        }
    }

    public final void k0(int i) {
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ArrayList arrayList;
        String M0;
        float f = 4.0f;
        byte b = 1;
        if (i == this.ttlRow) {
            if (getParentActivity() != null) {
                int i4 = this.s;
                int i5 = i4 <= 7 ? 0 : i4 <= 93 ? 1 : i4 <= 183 ? 2 : 3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M02 = k96.M0(2131745361, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M02;
                String[] strArr = {k96.G(1, "Weeks", new Object[0]), k96.G(3, "Months", new Object[0]), k96.G(6, "Months", new Object[0]), k96.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i6 = 0;
                while (i6 < 4) {
                    wy8 wy8Var = new wy8(getParentActivity(), null);
                    float f2 = f;
                    wy8Var.setPadding(gl.L(f), 0, gl.L(f2), 0);
                    wy8Var.setTag(Integer.valueOf(i6));
                    wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                    wy8Var.b(strArr[i6], i5 == i6);
                    linearLayout.addView(wy8Var);
                    wy8Var.setBackground(bkb.f0(bkb.w0(null, bkb.h6, false), 2, -1));
                    wy8Var.setOnClickListener(new b99(this, alertDialog$Builder, (byte) 8));
                    i6++;
                    f = f2;
                }
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                return;
            }
            return;
        }
        int i7 = this.terminateAllSessionsRow;
        boolean z3 = this.w;
        if (i == i7) {
            if (getParentActivity() != null) {
                ArrayList arrayList2 = this.f;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    hd hdVar2 = alertDialog$Builder2.a;
                    if (z3) {
                        hdVar2.U = k96.M0(2131754059, null);
                        hdVar2.S = k96.M0(2131743958, null);
                        M0 = k96.M0(2131751379, null);
                    } else {
                        hdVar2.U = k96.M0(2131754069, null);
                        hdVar2.S = k96.M0(2131754068, null);
                        M0 = k96.M0(2131743968, null);
                    }
                    alertDialog$Builder2.j(M0, new b7a(this, b));
                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar2);
                    TextView textView = (TextView) hdVar2.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList3 = this.f;
                int size = arrayList3.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList3.get(i8);
                    i8++;
                    TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                    if (V1 != null) {
                        String o = l7c.o(V1);
                        if (TextUtils.isEmpty(o)) {
                            spannableStringBuilder.append((CharSequence) l7c.q(V1));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) o);
                            append.setSpan(new g4c(b00.h("https://t.me/", o), (vib) null), 0, append.length(), 33);
                            spannableStringBuilder.append((CharSequence) append);
                        }
                    }
                }
                ij.f0(getParentActivity(), k96.M0(2131754068, null), k96.M0(2131754069, null), k96.V(null, null, 2131754268, spannableStringBuilder), k96.M0(2131743968, null), new a7a(this, b), this.resourceProvider, false);
                return;
            }
            return;
        }
        byte b2 = 14;
        if (i >= this.M && i < this.N) {
            if (getParentActivity() == null || (arrayList = this.f) == null || arrayList.isEmpty()) {
                return;
            }
            int i9 = i - this.M;
            new mf2(getParentActivity(), (TL_account.TL_connectedBot) this.f.get(i9), new on7(this, i9, b2), this.resourceProvider).show();
            return;
        }
        if (((i < this.K || i >= this.L) && ((i < this.G || i >= this.H) && i != this.y)) || getParentActivity() == null) {
            return;
        }
        ArrayList arrayList4 = this.d;
        if (z3) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
            boolean[] zArr = new boolean[1];
            hd hdVar3 = alertDialog$Builder3.a;
            if (z3) {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList4.get(i - this.K);
                hdVar3.U = k96.a0("TerminateWebSessionText", null, 2131743960, tL_webAuthorization.domain);
                hdVar3.S = k96.M0(2131743959, null);
                CharSequence M03 = k96.M0(2131751379, null);
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                TLRPC.User V12 = na7.q1(this.currentAccount).V1(Long.valueOf(tL_webAuthorization.bot_id));
                String k = V12 != null ? l7c.k(V12, true) : "";
                ag2 ag2Var = new ag2(getParentActivity(), 1);
                ag2Var.setBackgroundDrawable(bkb.L0(false));
                ag2Var.e(k96.a0("TerminateWebSessionStop", null, 2131743961, k), "", false, false, false);
                ag2Var.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ag2Var.setOnClickListener(new ge(zArr, (byte) 13));
                hdVar3.H = (byte) 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = M03;
            } else {
                hdVar3.U = k96.M0(2131743963, null);
                hdVar3.S = k96.M0(2131754070, null);
                charSequence = k96.M0(2131743968, null);
            }
            alertDialog$Builder3.j(charSequence, new zf(this, i, zArr, b2));
            alertDialog$Builder3.g(k96.M0(2131752577, null), null);
            showDialog(hdVar3);
            TextView textView2 = (TextView) hdVar3.c(-1);
            if (textView2 != null) {
                zkb.X(textView2, bkb.p7, null);
                return;
            }
            return;
        }
        if (i == this.y) {
            tL_authorization = this.h;
            z = true;
        } else {
            int i10 = this.K;
            tL_authorization = (i < i10 || i >= this.L) ? (TLRPC.TL_authorization) this.e.get(i - this.G) : (TLRPC.TL_authorization) arrayList4.get(i - i10);
            z = false;
        }
        if (tL_authorization != null) {
            d7a d7aVar = new d7a(this);
            n5a n5aVar = new n5a(getParentActivity(), false);
            n5aVar.S0 = true;
            Activity parentActivity = getParentActivity();
            n5aVar.l1 = tL_authorization;
            n5aVar.m1 = this;
            n5aVar.K();
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            ry8 ry8Var = new ry8(parentActivity);
            n5aVar.n1 = ry8Var;
            ry8Var.setOnClickListener(new f5a(n5aVar));
            ry8Var.setScaleType(ImageView.ScaleType.CENTER);
            linearLayout2.addView(ry8Var, nme.t(70, 70, 1, 0, 16, 0, 0));
            TextView textView3 = new TextView(parentActivity);
            ir2.t(textView3, 2, 20.0f);
            zkb.X(textView3, bkb.F6, null);
            textView3.setGravity(17);
            linearLayout2.addView(textView3, nme.t(-1, -2, 1, 21, 12, 21, 0));
            TextView textView4 = new TextView(parentActivity);
            zkb.X(textView4, bkb.x6, null);
            textView4.setTextSize(2, 13.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, nme.t(-1, -2, 1, 21, 4, 21, 21));
            textView4.setText((tL_authorization.flags & 1) != 0 ? k96.M0(2131747633, null) : k96.x(tL_authorization.date_active, true));
            StringBuilder sb = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb.append(tL_authorization.device_model);
            }
            if (sb.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(tL_authorization.system_version);
                }
            }
            textView3.setText(sb);
            String lowerCase = tL_authorization.platform.toLowerCase();
            if (lowerCase.isEmpty()) {
                lowerCase = tL_authorization.system_version.toLowerCase();
            }
            String lowerCase2 = tL_authorization.device_model.toLowerCase();
            if (lowerCase2.contains("safari")) {
                i3 = bkb.T7;
                i2 = R.raw.safari_30;
            } else if (lowerCase2.contains("edge")) {
                i3 = bkb.T7;
                i2 = R.raw.edge_30;
            } else if (lowerCase2.contains("chrome")) {
                i3 = bkb.T7;
                i2 = R.raw.chrome_30;
            } else if (lowerCase2.contains("firefox")) {
                i3 = bkb.N7;
                i2 = R.raw.firefox_30;
            } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                i2 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                i3 = bkb.T7;
                b = 0;
            } else {
                if (lowerCase.contains("ubuntu")) {
                    i3 = bkb.S7;
                    i2 = R.raw.ubuntu_30;
                } else if (lowerCase.contains("linux")) {
                    i3 = bkb.S7;
                    i2 = R.raw.linux_30;
                } else if (lowerCase.contains("ios")) {
                    i2 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                    i3 = bkb.S7;
                } else {
                    if (lowerCase.contains("windows")) {
                        i3 = bkb.R7;
                    } else if (lowerCase.contains("macos")) {
                        i3 = bkb.R7;
                        i2 = R.raw.mac_30;
                    } else if (lowerCase.contains("android")) {
                        i3 = bkb.Q7;
                        i2 = R.raw.android_30;
                    } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                        i3 = bkb.R7;
                    } else {
                        i3 = bkb.T7;
                        i2 = R.raw.chrome_30;
                    }
                    i2 = R.raw.windows_30;
                }
                b = 1;
            }
            ShapeDrawable K = bkb.K(gl.L(42.0f), bkb.w0(null, i3, false));
            vkb M = zkb.M(i3);
            ry8Var.setBackground(K);
            zkb.j(ry8Var, K, M, null, null);
            if (b != 0) {
                ry8Var.f(i2, 50, 50, new int[]{0, bkb.w0(null, i3, false)});
            } else {
                ry8Var.setImageDrawable(n5aVar.getContext().getDrawable(i2));
            }
            ly1 ly1Var = new ly1(parentActivity, false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            ((TextView) ly1Var.d).setText(sb2);
            Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
            View view = ly1Var.c;
            int i11 = bkb.l6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            zkb.x((ImageView) view, mutate, i11, null, mode);
            ((ImageView) view).setImageDrawable(mutate);
            ((TextView) ly1Var.e).setText(k96.M0(2131754219, null));
            linearLayout2.addView(ly1Var);
            if (tL_authorization.country.length() != 0) {
                ly1 ly1Var2 = new ly1(parentActivity, false);
                ((TextView) ly1Var2.d).setText(tL_authorization.country);
                Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                View view2 = ly1Var2.c;
                zkb.x((ImageView) view2, mutate2, i11, null, mode);
                ((ImageView) view2).setImageDrawable(mutate2);
                ((TextView) ly1Var2.e).setText(k96.M0(2131748565, null));
                ly1Var2.setOnClickListener(new g5a(n5aVar, tL_authorization));
                ly1Var2.setOnLongClickListener(new h5a(n5aVar, tL_authorization));
                int i12 = bkb.h6;
                ff0 f0 = bkb.f0(bkb.w0(null, i12, false), 2, -1);
                vkb M2 = zkb.M(i12);
                ly1Var2.setBackground(f0);
                zkb.j(ly1Var2, f0, null, M2, null);
                linearLayout2.addView(ly1Var2);
                ly1Var.b = true;
                ly1Var = ly1Var2;
            }
            if (tL_authorization.ip.length() != 0) {
                ly1 ly1Var3 = new ly1(parentActivity, false);
                ((TextView) ly1Var3.d).setText(tL_authorization.ip);
                Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                View view3 = ly1Var3.c;
                zkb.x((ImageView) view3, mutate3, i11, null, mode);
                ((ImageView) view3).setImageDrawable(mutate3);
                ((TextView) ly1Var3.e).setText(k96.M0(2131748910, null));
                ly1Var3.setOnClickListener(new i5a(n5aVar, tL_authorization));
                ly1Var3.setOnLongClickListener(new j5a(n5aVar, tL_authorization));
                int i13 = bkb.h6;
                ff0 f02 = bkb.f0(bkb.w0(null, i13, false), 2, -1);
                vkb M3 = zkb.M(i13);
                ly1Var3.setBackground(f02);
                zkb.j(ly1Var3, f02, null, M3, null);
                linearLayout2.addView(ly1Var3);
                z2 = true;
                ly1Var.b = true;
                ly1Var = ly1Var3;
            } else {
                z2 = true;
            }
            int i14 = tL_authorization.api_id;
            if (i14 != 2040 && i14 != 2496) {
                ly1 ly1Var4 = new ly1(parentActivity, z2);
                ((TextView) ly1Var4.d).setText(k96.M0(2131754712, null));
                Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                View view4 = ly1Var4.c;
                zkb.x((ImageView) view4, mutate4, i11, null, mode);
                ((ImageView) view4).setImageDrawable(mutate4);
                ((Switch) ly1Var4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                int i15 = bkb.h6;
                ff0 f03 = bkb.f0(bkb.w0(null, i15, false), 7, -1);
                vkb M4 = zkb.M(i15);
                ly1Var4.setBackground(f03);
                zkb.j(ly1Var4, f03, null, M4, null);
                ly1Var4.setOnClickListener(new k5a(n5aVar, ly1Var4, tL_authorization));
                ly1Var.b = true;
                ((TextView) ly1Var4.e).setText(k96.M0(2131754711, null));
                linearLayout2.addView(ly1Var4);
                ly1Var = ly1Var4;
            }
            if (tL_authorization.api_id != 22) {
                ly1 ly1Var5 = new ly1(parentActivity, true);
                ((TextView) ly1Var5.d).setText(k96.M0(2131754714, null));
                Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                View view5 = ly1Var5.c;
                zkb.x((ImageView) view5, mutate5, i11, null, mode);
                ((ImageView) view5).setImageDrawable(mutate5);
                ((Switch) ly1Var5.f).c(!tL_authorization.call_requests_disabled, false);
                int i16 = bkb.h6;
                ff0 f04 = bkb.f0(bkb.w0(null, i16, false), 7, -1);
                vkb M5 = zkb.M(i16);
                ly1Var5.setBackground(f04);
                zkb.j(ly1Var5, f04, null, M5, null);
                ly1Var5.setOnClickListener(new l5a(n5aVar, ly1Var5, tL_authorization));
                ly1Var.b = true;
                ((TextView) ly1Var5.e).setText(k96.M0(2131754713, null));
                linearLayout2.addView(ly1Var5);
            }
            if (!z) {
                TextView textView5 = new TextView(parentActivity);
                textView5.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                textView5.setGravity(17);
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(gl.o());
                textView5.setText(k96.M0(2131743964, null));
                zkb.X(textView5, bkb.Ii, null);
                int L = gl.L(24.0f);
                int i17 = bkb.ja;
                int w0 = bkb.w0(null, i17, false);
                int i18 = bkb.c6;
                int o2 = bm2.o(bkb.w0(null, i18, false), 120);
                ff0 i0 = bkb.i0(L, L, L, L, w0, o2, o2);
                vkb M6 = zkb.M(i17);
                vkb g = zkb.g(i18, 120);
                textView5.setBackground(i0);
                zkb.j(textView5, i0, M6, g, null);
                linearLayout2.addView(textView5, nme.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView5.setOnClickListener(new m5a(n5aVar, d7aVar, tL_authorization, this));
            }
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(linearLayout2);
            n5aVar.O = scrollView;
            n5aVar.show();
        }
    }

    public final /* synthetic */ void l0() {
        p31.a(this.currentAccount).b();
    }

    public final /* synthetic */ void m0(Boolean bool) {
        ArrayList arrayList;
        byte b = 1;
        if (bool != null && bool.booleanValue() && (arrayList = this.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = na7.q1(this.currentAccount).m1(((TL_account.TL_connectedBot) this.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new w6a(this, (byte) 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new w6a(this, b));
    }

    public final /* synthetic */ void n0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.n = false;
        if (tL_error == null) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            na7.q1(this.currentAccount).a4(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            q0();
        }
        g7a g7aVar = this.a;
        if (g7aVar != null) {
            g7aVar.f();
        }
        bk8 bk8Var = this.Y;
        if (bk8Var != null) {
            bk8Var.a();
        }
        int i = this.V;
        if (i > 0) {
            int i2 = i - 1;
            this.V = i2;
            if (i2 > 0) {
                gl.e3(new x6a(this, z, (byte) 0), 2500L);
            }
        }
    }

    public final void o0(final boolean z) {
        if (this.n) {
            return;
        }
        if (!z) {
            this.n = true;
        }
        if (this.w) {
            final byte b = 1;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: u6a
                public final /* synthetic */ SessionsActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            final byte b2 = 0;
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z2 = z;
                            gl.d3(new Runnable() { // from class: v6a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    boolean z3 = z2;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    SessionsActivity sessionsActivity2 = sessionsActivity;
                                    switch (b3) {
                                        case 0:
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.n = false;
                                            if (tL_error2 == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i = 0; i < size; i++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.q0();
                                                bk8 bk8Var = sessionsActivity2.Y;
                                                if (bk8Var != null) {
                                                    bk8Var.a();
                                                }
                                            }
                                            g7a g7aVar = sessionsActivity2.a;
                                            if (g7aVar != null) {
                                                g7aVar.f();
                                            }
                                            bk8 bk8Var2 = sessionsActivity2.Y;
                                            if (bk8Var2 != null) {
                                                bk8Var2.a();
                                            }
                                            int i2 = sessionsActivity2.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity2.V = i3;
                                                if (i3 > 0) {
                                                    gl.e3(new x6a(sessionsActivity2, z3, (byte) 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            sessionsActivity2.n0(tLObject2, tL_error2, z3);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b3 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z3 = z;
                            gl.d3(new Runnable() { // from class: v6a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b32 = b3;
                                    boolean z32 = z3;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    SessionsActivity sessionsActivity22 = sessionsActivity2;
                                    switch (b32) {
                                        case 0:
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.n = false;
                                            if (tL_error2 == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i = 0; i < size; i++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.q0();
                                                bk8 bk8Var = sessionsActivity22.Y;
                                                if (bk8Var != null) {
                                                    bk8Var.a();
                                                }
                                            }
                                            g7a g7aVar = sessionsActivity22.a;
                                            if (g7aVar != null) {
                                                g7aVar.f();
                                            }
                                            bk8 bk8Var2 = sessionsActivity22.Y;
                                            if (bk8Var2 != null) {
                                                bk8Var2.a();
                                            }
                                            int i2 = sessionsActivity22.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity22.V = i3;
                                                if (i3 > 0) {
                                                    gl.e3(new x6a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            sessionsActivity22.n0(tLObject2, tL_error2, z32);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            }), this.classGuid);
            return;
        }
        final byte b2 = 0;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: u6a
            public final /* synthetic */ SessionsActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (b2) {
                    case 0:
                        final byte b22 = 0;
                        final SessionsActivity sessionsActivity = this.b;
                        final boolean z2 = z;
                        gl.d3(new Runnable() { // from class: v6a
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b22;
                                boolean z32 = z2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                SessionsActivity sessionsActivity22 = sessionsActivity;
                                switch (b32) {
                                    case 0:
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error2 == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i = 0; i < size; i++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            bk8 bk8Var = sessionsActivity22.Y;
                                            if (bk8Var != null) {
                                                bk8Var.a();
                                            }
                                        }
                                        g7a g7aVar = sessionsActivity22.a;
                                        if (g7aVar != null) {
                                            g7aVar.f();
                                        }
                                        bk8 bk8Var2 = sessionsActivity22.Y;
                                        if (bk8Var2 != null) {
                                            bk8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                gl.e3(new x6a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        sessionsActivity22.n0(tLObject2, tL_error2, z32);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b3 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z3 = z;
                        gl.d3(new Runnable() { // from class: v6a
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                boolean z32 = z3;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                switch (b32) {
                                    case 0:
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error2 == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i = 0; i < size; i++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            bk8 bk8Var = sessionsActivity22.Y;
                                            if (bk8Var != null) {
                                                bk8Var.a();
                                            }
                                        }
                                        g7a g7aVar = sessionsActivity22.a;
                                        if (g7aVar != null) {
                                            g7aVar.f();
                                        }
                                        bk8 bk8Var2 = sessionsActivity22.Y;
                                        if (bk8Var2 != null) {
                                            bk8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                gl.e3(new x6a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        sessionsActivity22.n0(tLObject2, tL_error2, z32);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        c7a c7aVar = this.r;
        if (c7aVar != null) {
            c7aVar.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        byte b = 0;
        o0(false);
        if (!this.w) {
            p31.a(this.currentAccount).c(new a7a(this, b));
        }
        kk7.f(this.currentAccount).b(this, kk7.t0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.t0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        c7a c7aVar = this.r;
        if (c7aVar != null) {
            c7aVar.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        c7a c7aVar = this.r;
        if (c7aVar != null) {
            c7aVar.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        byte b = 0;
        if (iArr.length > 0 && iArr[0] == 0) {
            da1.i0(getParentActivity(), 2, new f7a(this));
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = gl.T2(k96.M0(2131746310, null));
        alertDialog$Builder.j(k96.M0(2131747107, null), new b7a(this, b));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        int i2 = bkb.K5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, bkb.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        g7a g7aVar = this.a;
        if (g7aVar != null) {
            g7aVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.X = true;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof h7a) {
                ((h7a) childAt).b.invalidate();
            }
        }
    }

    public final void p0() {
        this.W = true;
    }

    public final void q0() {
        this.S = 0;
        this.x = -1;
        this.y = -1;
        this.terminateAllSessionsRow = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.T = -1;
        this.ttlRow = -1;
        this.U = -1;
        if (!this.w && getMessagesController().k4.J0.f) {
            int i = this.S;
            this.Q = i;
            this.S = i + 2;
            this.R = i + 1;
        }
        if (this.n) {
            if (this.w) {
                return;
            }
            int i2 = this.S;
            this.x = i2;
            this.S = i2 + 2;
            this.y = i2 + 1;
            return;
        }
        if (this.h != null) {
            int i3 = this.S;
            this.x = i3;
            this.S = i3 + 2;
            this.y = i3 + 1;
        }
        if (this.e.isEmpty() && this.d.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (this.w || this.h != null) {
                int i4 = this.S;
                this.S = i4 + 1;
                this.P = i4;
            } else {
                this.P = -1;
            }
        } else {
            int i5 = this.S;
            this.terminateAllSessionsRow = i5;
            this.S = i5 + 2;
            this.E = i5 + 1;
            this.P = -1;
        }
        if (!this.e.isEmpty()) {
            int i6 = this.S;
            int i7 = i6 + 1;
            this.S = i7;
            this.F = i6;
            this.G = i7;
            int size = this.e.size() + i7;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i8 = this.S;
                int i9 = i8 + 1;
                this.S = i9;
                this.J = i8;
                this.M = i9;
                int size2 = this.f.size() + i9;
                this.N = size2;
                this.S = size2 + 1;
                this.O = size2;
            }
        } else {
            int i10 = this.S;
            this.S = i10 + 1;
            this.J = i10;
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                int i11 = this.S;
                this.M = i11;
                int size3 = this.f.size() + i11;
                this.S = size3;
                this.N = size3;
            }
            int i12 = this.S;
            this.K = i12;
            this.L = this.d.size() + i12;
            int size4 = this.d.size() + this.S;
            this.S = size4 + 1;
            this.O = size4;
        }
        if (this.s > 0) {
            int i13 = this.S;
            this.T = i13;
            this.ttlRow = i13 + 1;
            this.S = i13 + 3;
            this.U = i13 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
