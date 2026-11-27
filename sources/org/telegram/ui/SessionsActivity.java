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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public pn8 Y;
    public xaa a;
    public gw9 b;
    public b34 c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public taa r;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        new tk4(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        jla jlaVar = this.simpleActionBar;
        boolean z = this.w;
        if (z) {
            jlaVar.setTitle(ob6.M0(2131742542, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131751420, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 14));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new xaa(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.c = b34Var;
        b34Var.b();
        gw9 gw9Var = new gw9((byte) 2, context, this);
        this.b = gw9Var;
        gw9Var.s1();
        this.b.setLayoutManager(new as((byte) 16, i, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        gw9 gw9Var2 = this.b;
        gw9Var2.X1 = true;
        gw9Var2.Y1 = false;
        frameLayout.addView(gw9Var2, tre.c(-1.0f, -1));
        frameLayout.addView(this.c, tre.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        this.b.setItemAnimator(zb3Var);
        this.b.setOnItemClickListener(new t39(this, (byte) 7));
        if (!z) {
            taa taaVar = new taa(this, context);
            this.r = taaVar;
            frameLayout.addView(taaVar, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        q0();
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.u0) {
            o0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, mf5.class, g9a.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        int i = aob.p7;
        arrayList.add(new apb(this.b, 262148, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 262148, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.q6));
        arrayList.add(new apb(this.b, 262144, new Class[]{g9a.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (zob) null, aob.I6));
        arrayList.add(new apb(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (zob) null, i));
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new oaa(this, (byte) 2));
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new oaa(this, (byte) 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        if (getParentActivity() != null) {
            id idVar = new id(3, null, getParentActivity());
            idVar.j0 = false;
            idVar.show();
            int i2 = this.K;
            ArrayList arrayList = this.d;
            if (this.w) {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i - i2);
                TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
                resetwebauthorization.hash = tL_webAuthorization.hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new qn8((Object) this, (Object) idVar, (Object) tL_webAuthorization, (byte) 12));
                if (zArr[0]) {
                    uc7.s1(this.currentAccount).u(tL_webAuthorization.bot_id);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new qn8((Object) this, (Object) idVar, (Object) tL_authorization, (byte) 11));
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
                String M02 = ob6.M0(2131745281, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                String[] strArr = {ob6.G(1, "Weeks", new Object[0]), ob6.G(3, "Months", new Object[0]), ob6.G(6, "Months", new Object[0]), ob6.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i6 = 0;
                while (i6 < 4) {
                    j29 j29Var = new j29(getParentActivity(), null);
                    float f2 = f;
                    j29Var.setPadding(hl.L(f), 0, hl.L(f2), 0);
                    j29Var.setTag(Integer.valueOf(i6));
                    j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                    j29Var.b(strArr[i6], i5 == i6);
                    linearLayout.addView(j29Var);
                    j29Var.setBackground(aob.f0(aob.w0(null, aob.i6, false), 2, -1));
                    j29Var.setOnClickListener(new jy8(this, alertDialog$Builder, (byte) 11));
                    i6++;
                    f = f2;
                }
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
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
                    id idVar2 = alertDialog$Builder2.a;
                    if (z3) {
                        idVar2.U = ob6.M0(2131754055, null);
                        idVar2.S = ob6.M0(2131743852, null);
                        M0 = ob6.M0(2131751356, null);
                    } else {
                        idVar2.U = ob6.M0(2131754065, null);
                        idVar2.S = ob6.M0(2131754064, null);
                        M0 = ob6.M0(2131743862, null);
                    }
                    alertDialog$Builder2.j(M0, new raa(this, b));
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar2);
                    TextView textView = (TextView) idVar2.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
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
                    TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                    if (X1 != null) {
                        String p = lbc.p(X1);
                        if (TextUtils.isEmpty(p)) {
                            spannableStringBuilder.append((CharSequence) lbc.r(X1));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) p);
                            append.setSpan(new f8c(c00.i("https://t.me/", p), (rmb) null), 0, append.length(), 33);
                            spannableStringBuilder.append((CharSequence) append);
                        }
                    }
                }
                jj.f0(getParentActivity(), ob6.M0(2131754064, null), ob6.M0(2131754065, null), ob6.V(null, null, 2131754264, spannableStringBuilder), ob6.M0(2131743862, null), new maa(this, b), this.resourceProvider, false);
                return;
            }
            return;
        }
        byte b2 = 17;
        if (i >= this.M && i < this.N) {
            if (getParentActivity() == null || (arrayList = this.f) == null || arrayList.isEmpty()) {
                return;
            }
            int i9 = i - this.M;
            new dg2(getParentActivity(), (TL_account.TL_connectedBot) this.f.get(i9), new me7(this, i9, b2), this.resourceProvider).show();
            return;
        }
        if (((i < this.K || i >= this.L) && ((i < this.G || i >= this.H) && i != this.y)) || getParentActivity() == null) {
            return;
        }
        ArrayList arrayList4 = this.d;
        if (z3) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
            boolean[] zArr = new boolean[1];
            byte b3 = 16;
            id idVar3 = alertDialog$Builder3.a;
            if (z3) {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList4.get(i - this.K);
                idVar3.U = ob6.a0("TerminateWebSessionText", null, 2131743854, tL_webAuthorization.domain);
                idVar3.S = ob6.M0(2131743853, null);
                CharSequence M03 = ob6.M0(2131751356, null);
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                TLRPC.User X12 = uc7.s1(this.currentAccount).X1(Long.valueOf(tL_webAuthorization.bot_id));
                String k = X12 != null ? lbc.k(X12, true) : "";
                sg2 sg2Var = new sg2(getParentActivity(), 1);
                sg2Var.setBackgroundDrawable(aob.L0(false));
                sg2Var.e(ob6.a0("TerminateWebSessionStop", null, 2131743855, k), "", false, false, false);
                sg2Var.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                sg2Var.setOnClickListener(new de(zArr, (byte) 13));
                idVar3.H = (byte) 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = M03;
            } else {
                idVar3.U = ob6.M0(2131743857, null);
                idVar3.S = ob6.M0(2131754066, null);
                charSequence = ob6.M0(2131743862, null);
            }
            alertDialog$Builder3.j(charSequence, new bf(this, i, zArr, b3));
            alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
            showDialog(idVar3);
            TextView textView2 = (TextView) idVar3.c(-1);
            if (textView2 != null) {
                yob.X(textView2, aob.q7, null);
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
            uaa uaaVar = new uaa(this);
            f9a f9aVar = new f9a(getParentActivity(), false);
            f9aVar.S0 = true;
            Activity parentActivity = getParentActivity();
            f9aVar.l1 = tL_authorization;
            f9aVar.m1 = this;
            f9aVar.J();
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            e29 e29Var = new e29(parentActivity);
            f9aVar.n1 = e29Var;
            e29Var.setOnClickListener(new x8a(f9aVar));
            e29Var.setScaleType(ImageView.ScaleType.CENTER);
            linearLayout2.addView(e29Var, tre.t(70, 70, 1, 0, 16, 0, 0));
            TextView textView3 = new TextView(parentActivity);
            bs2.t(textView3, 2, 20.0f);
            yob.X(textView3, aob.G6, null);
            textView3.setGravity(17);
            linearLayout2.addView(textView3, tre.t(-1, -2, 1, 21, 12, 21, 0));
            TextView textView4 = new TextView(parentActivity);
            yob.X(textView4, aob.y6, null);
            textView4.setTextSize(2, 13.0f);
            textView4.setGravity(17);
            linearLayout2.addView(textView4, tre.t(-1, -2, 1, 21, 4, 21, 21));
            textView4.setText((tL_authorization.flags & 1) != 0 ? ob6.M0(2131747553, null) : ob6.x(tL_authorization.date_active, true));
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
                i3 = aob.U7;
                i2 = R.raw.safari_30;
            } else if (lowerCase2.contains("edge")) {
                i3 = aob.U7;
                i2 = R.raw.edge_30;
            } else if (lowerCase2.contains("chrome")) {
                i3 = aob.U7;
                i2 = R.raw.chrome_30;
            } else if (lowerCase2.contains("firefox")) {
                i3 = aob.O7;
                i2 = R.raw.firefox_30;
            } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                i2 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                i3 = aob.U7;
                b = 0;
            } else {
                if (lowerCase.contains("ubuntu")) {
                    i3 = aob.T7;
                    i2 = R.raw.ubuntu_30;
                } else if (lowerCase.contains("linux")) {
                    i3 = aob.T7;
                    i2 = R.raw.linux_30;
                } else if (lowerCase.contains("ios")) {
                    i2 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                    i3 = aob.T7;
                } else {
                    if (lowerCase.contains("windows")) {
                        i3 = aob.S7;
                    } else if (lowerCase.contains("macos")) {
                        i3 = aob.S7;
                        i2 = R.raw.mac_30;
                    } else if (lowerCase.contains("android")) {
                        i3 = aob.R7;
                        i2 = R.raw.android_30;
                    } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                        i3 = aob.S7;
                    } else {
                        i3 = aob.U7;
                        i2 = R.raw.chrome_30;
                    }
                    i2 = R.raw.windows_30;
                }
                b = 1;
            }
            ShapeDrawable K = aob.K(hl.L(42.0f), aob.w0(null, i3, false));
            uob M = yob.M(i3);
            e29Var.setBackground(K);
            yob.j(e29Var, K, M, null, null);
            if (b != 0) {
                e29Var.f(i2, 50, 50, new int[]{0, aob.w0(null, i3, false)});
            } else {
                e29Var.setImageDrawable(f9aVar.getContext().getDrawable(i2));
            }
            cz1 cz1Var = new cz1(parentActivity, false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            ((TextView) cz1Var.d).setText(sb2);
            Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
            View view = cz1Var.c;
            int i11 = aob.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            yob.x((ImageView) view, mutate, i11, null, mode);
            ((ImageView) view).setImageDrawable(mutate);
            ((TextView) cz1Var.e).setText(ob6.M0(2131754215, null));
            linearLayout2.addView(cz1Var);
            if (tL_authorization.country.length() != 0) {
                cz1 cz1Var2 = new cz1(parentActivity, false);
                ((TextView) cz1Var2.d).setText(tL_authorization.country);
                Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                View view2 = cz1Var2.c;
                yob.x((ImageView) view2, mutate2, i11, null, mode);
                ((ImageView) view2).setImageDrawable(mutate2);
                ((TextView) cz1Var2.e).setText(ob6.M0(2131748511, null));
                cz1Var2.setOnClickListener(new y8a(f9aVar, tL_authorization));
                cz1Var2.setOnLongClickListener(new z8a(f9aVar, tL_authorization));
                int i12 = aob.i6;
                hf0 f0 = aob.f0(aob.w0(null, i12, false), 2, -1);
                uob M2 = yob.M(i12);
                cz1Var2.setBackground(f0);
                yob.j(cz1Var2, f0, null, M2, null);
                linearLayout2.addView(cz1Var2);
                cz1Var.b = true;
                cz1Var = cz1Var2;
            }
            if (tL_authorization.ip.length() != 0) {
                cz1 cz1Var3 = new cz1(parentActivity, false);
                ((TextView) cz1Var3.d).setText(tL_authorization.ip);
                Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                View view3 = cz1Var3.c;
                yob.x((ImageView) view3, mutate3, i11, null, mode);
                ((ImageView) view3).setImageDrawable(mutate3);
                ((TextView) cz1Var3.e).setText(ob6.M0(2131748856, null));
                cz1Var3.setOnClickListener(new a9a(f9aVar, tL_authorization));
                cz1Var3.setOnLongClickListener(new b9a(f9aVar, tL_authorization));
                int i13 = aob.i6;
                hf0 f02 = aob.f0(aob.w0(null, i13, false), 2, -1);
                uob M3 = yob.M(i13);
                cz1Var3.setBackground(f02);
                yob.j(cz1Var3, f02, null, M3, null);
                linearLayout2.addView(cz1Var3);
                z2 = true;
                cz1Var.b = true;
                cz1Var = cz1Var3;
            } else {
                z2 = true;
            }
            int i14 = tL_authorization.api_id;
            if (i14 != 2040 && i14 != 2496) {
                cz1 cz1Var4 = new cz1(parentActivity, z2);
                ((TextView) cz1Var4.d).setText(ob6.M0(2131754708, null));
                Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                View view4 = cz1Var4.c;
                yob.x((ImageView) view4, mutate4, i11, null, mode);
                ((ImageView) view4).setImageDrawable(mutate4);
                ((Switch) cz1Var4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                int i15 = aob.i6;
                hf0 f03 = aob.f0(aob.w0(null, i15, false), 7, -1);
                uob M4 = yob.M(i15);
                cz1Var4.setBackground(f03);
                yob.j(cz1Var4, f03, null, M4, null);
                cz1Var4.setOnClickListener(new c9a(f9aVar, cz1Var4, tL_authorization));
                cz1Var.b = true;
                ((TextView) cz1Var4.e).setText(ob6.M0(2131754707, null));
                linearLayout2.addView(cz1Var4);
                cz1Var = cz1Var4;
            }
            if (tL_authorization.api_id != 22) {
                cz1 cz1Var5 = new cz1(parentActivity, true);
                ((TextView) cz1Var5.d).setText(ob6.M0(2131754710, null));
                Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                View view5 = cz1Var5.c;
                yob.x((ImageView) view5, mutate5, i11, null, mode);
                ((ImageView) view5).setImageDrawable(mutate5);
                ((Switch) cz1Var5.f).c(!tL_authorization.call_requests_disabled, false);
                int i16 = aob.i6;
                hf0 f04 = aob.f0(aob.w0(null, i16, false), 7, -1);
                uob M5 = yob.M(i16);
                cz1Var5.setBackground(f04);
                yob.j(cz1Var5, f04, null, M5, null);
                cz1Var5.setOnClickListener(new d9a(f9aVar, cz1Var5, tL_authorization));
                cz1Var.b = true;
                ((TextView) cz1Var5.e).setText(ob6.M0(2131754709, null));
                linearLayout2.addView(cz1Var5);
            }
            if (!z) {
                TextView textView5 = new TextView(parentActivity);
                textView5.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                textView5.setGravity(17);
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(hl.o());
                textView5.setText(ob6.M0(2131743858, null));
                yob.X(textView5, aob.Ji, null);
                int L = hl.L(24.0f);
                int i17 = aob.ka;
                int w0 = aob.w0(null, i17, false);
                int i18 = aob.d6;
                int o = vm2.o(aob.w0(null, i18, false), jn7.E1);
                hf0 i0 = aob.i0(L, L, L, L, w0, o, o);
                uob M6 = yob.M(i17);
                uob g = yob.g(i18, jn7.E1);
                textView5.setBackground(i0);
                yob.j(textView5, i0, M6, g, null);
                linearLayout2.addView(textView5, tre.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView5.setOnClickListener(new e9a(f9aVar, uaaVar, tL_authorization, this));
            }
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(linearLayout2);
            f9aVar.O = scrollView;
            f9aVar.show();
        }
    }

    public final /* synthetic */ void l0() {
        y31.a(this.currentAccount).b();
    }

    public final /* synthetic */ void m0(Boolean bool) {
        ArrayList arrayList;
        byte b = 1;
        if (bool != null && bool.booleanValue() && (arrayList = this.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = uc7.s1(this.currentAccount).o1(((TL_account.TL_connectedBot) this.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new oaa(this, (byte) 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new oaa(this, b));
    }

    public final /* synthetic */ void n0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.n = false;
        if (tL_error == null) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            uc7.s1(this.currentAccount).j4(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            q0();
        }
        xaa xaaVar = this.a;
        if (xaaVar != null) {
            xaaVar.f();
        }
        pn8 pn8Var = this.Y;
        if (pn8Var != null) {
            pn8Var.a();
        }
        int i = this.V;
        if (i > 0) {
            int i2 = i - 1;
            this.V = i2;
            if (i2 > 0) {
                hl.d3(new paa(this, z, (byte) 0), 2500L);
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
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: saa
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
                            hl.c3(new Runnable() { // from class: naa
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
                                                pn8 pn8Var = sessionsActivity2.Y;
                                                if (pn8Var != null) {
                                                    pn8Var.a();
                                                }
                                            }
                                            xaa xaaVar = sessionsActivity2.a;
                                            if (xaaVar != null) {
                                                xaaVar.f();
                                            }
                                            pn8 pn8Var2 = sessionsActivity2.Y;
                                            if (pn8Var2 != null) {
                                                pn8Var2.a();
                                            }
                                            int i2 = sessionsActivity2.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity2.V = i3;
                                                if (i3 > 0) {
                                                    hl.d3(new paa(sessionsActivity2, z3, (byte) 1), 2500L);
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
                            hl.c3(new Runnable() { // from class: naa
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
                                                pn8 pn8Var = sessionsActivity22.Y;
                                                if (pn8Var != null) {
                                                    pn8Var.a();
                                                }
                                            }
                                            xaa xaaVar = sessionsActivity22.a;
                                            if (xaaVar != null) {
                                                xaaVar.f();
                                            }
                                            pn8 pn8Var2 = sessionsActivity22.Y;
                                            if (pn8Var2 != null) {
                                                pn8Var2.a();
                                            }
                                            int i2 = sessionsActivity22.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity22.V = i3;
                                                if (i3 > 0) {
                                                    hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: saa
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
                        hl.c3(new Runnable() { // from class: naa
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
                                            pn8 pn8Var = sessionsActivity22.Y;
                                            if (pn8Var != null) {
                                                pn8Var.a();
                                            }
                                        }
                                        xaa xaaVar = sessionsActivity22.a;
                                        if (xaaVar != null) {
                                            xaaVar.f();
                                        }
                                        pn8 pn8Var2 = sessionsActivity22.Y;
                                        if (pn8Var2 != null) {
                                            pn8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
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
                        hl.c3(new Runnable() { // from class: naa
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
                                            pn8 pn8Var = sessionsActivity22.Y;
                                            if (pn8Var != null) {
                                                pn8Var.a();
                                            }
                                        }
                                        xaa xaaVar = sessionsActivity22.a;
                                        if (xaaVar != null) {
                                            xaaVar.f();
                                        }
                                        pn8 pn8Var2 = sessionsActivity22.Y;
                                        if (pn8Var2 != null) {
                                            pn8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        byte b = 0;
        o0(false);
        if (!this.w) {
            y31.a(this.currentAccount).c(new maa(this, b));
        }
        jn7.f(this.currentAccount).b(this, jn7.u0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.u0);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        byte b = 0;
        if (iArr.length > 0 && iArr[0] == 0) {
            la1.i0(getParentActivity(), 2, new waa(this));
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
        alertDialog$Builder.j(ob6.M0(2131747027, null), new raa(this, b));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        int i2 = aob.L5;
        alertDialog$Builder.l(R.raw.permission_request_camera, 72, aob.w0(null, i2, false), null);
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        xaa xaaVar = this.a;
        if (xaaVar != null) {
            xaaVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.X = true;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof yaa) {
                ((yaa) childAt).b.invalidate();
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
        if (!this.w && getMessagesController().k4.R0.f) {
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
