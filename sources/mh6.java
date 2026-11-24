// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mh6 extends d implements jm7 {
    public static final short A0;
    public boolean E;
    public boolean F;
    public byte G;
    public String H;
    public Bundle I;
    public TLRPC.TL_auth_sentCode J;
    public boolean K;
    public final AnimatorSet[] L;
    public AnimatorSet M;
    public x0c N;
    public wp4 O;
    public wm9 P;
    public int Q;
    public final boolean[] R;
    public he S;
    public w91 T;
    public ch6 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public uv8 Y;
    public LinearLayout Z;
    public int a;
    public ne6 a0;
    public final kla[] b;
    public boolean b0;
    public d63 c;
    public bh6 c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public Runnable e0;
    public boolean f;
    public di3 f0;
    public TextView g0;
    public Dialog h;
    public boolean h0;
    public boolean i0;
    public final boolean[] j0;
    public final Runnable[] k0;
    public final boolean[] l0;
    public boolean m0;
    public Dialog n;
    public Space n0;
    public View o0;
    public boolean p0;
    public dt5 q0;
    public final ArrayList r;
    public boolean r0;
    public final ArrayList s;
    public TLRPC.TL_help_termsOfService s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public boolean x;
    public int x0;
    public boolean y;
    public boolean y0;
    public de6 z0;

    static {
        A0 = gda.o() <= 1 ? (short) 150 : (short) 100;
    }

    public mh6(int i) {
        super(null);
        this.b = new kla[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
        this.currentAccount = i;
        this.y = true;
    }

    public static void A1(d dVar, String str, in3 in3Var, boolean z) {
        List list;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131745804, null);
            heVar.U = jb6.M0(2131753690, "BannedPhoneNumber");
        } else if (in3Var == null || (list = (List) in3Var.d) == null || list.isEmpty() || ((wy2) in3Var.b) == null) {
            heVar.S = jb6.M0(2131745804, null);
            heVar.U = jb6.M0(2131748936, null);
        } else {
            Iterator it = ((List) in3Var.d).iterator();
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i) {
                    i = length;
                }
            }
            if (r58.h(str, false).length() - ((wy2) in3Var.b).c.length() < i) {
                heVar.S = jb6.M0(2131742520, null);
                heVar.U = gm.S2(jb6.a0("ShortNumberInfo", null, 2131745090, ((wy2) in3Var.b).a, (String) in3Var.c));
            } else {
                heVar.S = jb6.M0(2131745804, null);
                heVar.U = jb6.M0(2131748936, null);
            }
        }
        alertDialog$Builder.h(jb6.M0(2131753026, "BotHelp"), new ci(str, dVar, z));
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
        dVar.showDialog(heVar);
    }

    public static void E1(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        gm.A3(3.5f, view, null);
        if (z && (view instanceof gt7)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            gt7 gt7Var = (gt7) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = gt7Var.getAttachedEditText();
            qz qzVar = new qz(attachedEditText, atomicReference, false, (byte) 5);
            gt7Var.a(1.0f);
            d65 d65Var = new d65(gt7Var, view, attachedEditText, qzVar, (byte) 15);
            atomicReference.set(d65Var);
            view.postDelayed(d65Var, 2000L);
            view.setTag(R.id.timeout_callback, d65Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(qzVar);
            }
        }
    }

    public static void G1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(kt6.o(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(kt6.o(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(kt6.o(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                G1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void m1(ImageView imageView, int i, int i2, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i != i2 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
            }
        }
    }

    public static void n1(ImageView imageView, int i, int i2) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(cmb.f0(i, 1, -1));
            } else if (i != i2) {
                cmb.F1(background, i, true);
            }
        }
    }

    public static String p1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            simpleName = simpleName + exc.getMessage();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle x1(int i, boolean z) {
        try {
            Bundle bundle = new Bundle();
            Context context = a.b;
            String str = z ? "_" + i : "";
            for (Map.Entry<String, ?> entry : context.getSharedPreferences("logininfo2".concat(str), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final void B1(int i, boolean z) {
        if (this.G != 1 || i != 0) {
            this.Q = i;
            L1(true, z, false);
        } else {
            if (this.S != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            he heVar = new he(3, null, getParentActivity());
            this.S = heVar;
            heVar.j0 = false;
            heVar.show();
        }
    }

    public final void C1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        oc7.r1(this.currentAccount).M();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        z8c.h(this.currentAccount).b();
        oc7.r1(this.currentAccount).M();
        z8c.h(this.currentAccount).V = this.E;
        z8c.h(this.currentAccount).v(tL_auth_authorization.user);
        z8c.h(this.currentAccount).u(true);
        cf7 Y = cf7.Y(this.currentAccount);
        Y.a.c(new ee7(Y, true, 1 == true ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        cf7.Y(this.currentAccount).j1(arrayList, null, true, true);
        oc7.r1(this.currentAccount).c4(tL_auth_authorization.user, false, false);
        bw2 r = bw2.r(this.currentAccount);
        r.a = null;
        Utilities.e.c(new hv2(r, (byte) 0));
        Utilities.d.c(new ba7(oc7.r1(this.currentAccount), (byte) 10));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        oc7.r1(this.currentAccount).W2(true);
        oc7.r1(this.currentAccount).l3();
        oc7.r1(this.currentAccount).I(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z2 = e21.a;
            fc4.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b = p50.b();
            if (b == null) {
                b = new ArrayList();
            }
            b.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i = 0; i < Math.min(20, b.size()); i++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b.get(i));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i2)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i2)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i2, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            fc4.b("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            oc7 r1 = oc7.r1(this.currentAccount);
            r1.U1.put(0, true);
            r1.V1.put(0, true);
        }
        hs6.d0(this.currentAccount).d1("tg_placeholders_android", false, true);
        boolean z3 = tL_auth_authorization.setup_password_required;
        int i3 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            gm.k3(getParentActivity(), false);
        }
        o1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
                externalActionActivity.c.Z();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.Z();
                }
                ela elaVar = externalActionActivity.e;
                if (elaVar != null) {
                    elaVar.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.y) {
            this.y = false;
            this.p0 = true;
            ((LaunchActivity) getParentActivity()).O0(this.currentAccount, new z64((byte) 2, z));
            this.p0 = false;
            finishFragment();
            return;
        }
        if (z && z3) {
            p5c p5cVar = new p5c(6, null);
            p5cVar.H = i3;
            p5cVar.I = true;
            presentFragment(p5cVar, true);
        } else {
            Bundle l = ts2.l("afterSignup", z);
            bj6 bj6Var = new bj6();
            bj6Var.n0(l);
            presentFragment(bj6Var, true);
        }
        nm7.f(this.currentAccount).k(nm7.j0, new Object[0]);
        jb6.D0().V0(this.currentAccount, true);
        qc9.Z(true);
    }

    public final void D1() {
        if (this.R[this.K ? 1 : 0]) {
            if (this.W.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131744521, "StopLoadingTitle");
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744522, "StopLoading");
            alertDialog$Builder.j(jb6.M0(2131742897, "WaitMore"), null);
            alertDialog$Builder.g(jb6.M0(2131744530, "Stop"), new ge6(this, (byte) 0));
            showDialog(heVar);
        }
    }

    public final void F1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.q0 = new dt5(this, str, auth_sentcode, (byte) 18);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        q1(bundle, auth_sentcode, true);
    }

    public final void H1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.r0) {
            y1(false, true);
            this.r0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new cx3(this, bundle, (byte) 19), 10);
        }
    }

    public final void I1(boolean z, boolean z2) {
        if (this.b0 == z && z2) {
            return;
        }
        this.b0 = z;
        byte b = 0;
        if (gm.A1()) {
            z = false;
        }
        byte b2 = 2;
        if (!z) {
            gm.z2(getParentActivity(), this.classGuid);
            if (!z2) {
                this.c.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(vt3.e);
            this.d.addUpdateListener(new ee6(this, b));
            this.d.addListener(new oe6(this, (byte) 1));
            this.d.start();
            return;
        }
        gm.t1(this.fragmentView);
        gm.W2(getParentActivity(), this.classGuid);
        if (!z2) {
            this.c.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(d53.f);
        this.d.addUpdateListener(new ee6(this, b2));
        this.d.addListener(new oe6(this, b));
        this.d.start();
    }

    public final void J1(int i, boolean z, Bundle bundle, boolean z2) {
        byte b = 6;
        boolean z3 = i == 0 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12 || i == 17 || i == 16;
        if (i == this.a) {
            z = false;
        }
        if (z3) {
            if (i == 0) {
                this.w = true;
                this.x = true;
            }
            this.K = true;
            K1(false, z);
            L1(false, z, false);
            this.K = false;
            L1(false, z, false);
            if (!z) {
                K1(true, false);
            }
        } else {
            this.K = false;
            K1(false, z);
            L1(false, z, false);
            if (i != 8) {
                this.K = true;
            }
        }
        kla[] klaVarArr = this.b;
        if (!z) {
            this.V.setVisibility((klaVarArr[i].b() || this.y) ? 0 : 8);
            klaVarArr[this.a].setVisibility(8);
            klaVarArr[this.a].g();
            this.a = i;
            klaVarArr[i].m(bundle, false);
            klaVarArr[i].setVisibility(0);
            setParentActivityTitle(klaVarArr[i].getHeaderName());
            klaVarArr[i].j();
            I1(klaVarArr[i].a(), false);
            return;
        }
        kla klaVar = klaVarArr[this.a];
        kla klaVar2 = klaVarArr[i];
        this.a = i;
        this.V.setVisibility((klaVar2.b() || this.y) ? 0 : 8);
        klaVar2.m(bundle, false);
        setParentActivityTitle(klaVar2.getHeaderName());
        klaVar2.j();
        Point point = gm.q;
        int i2 = point.x;
        if (z2) {
            i2 = -i2;
        }
        klaVar2.setX(i2);
        klaVar2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new qx(this, z3, klaVar, b));
        Property property = View.TRANSLATION_X;
        int i3 = point.x;
        if (!z2) {
            i3 = -i3;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(klaVar, (Property<kla, Float>) property, i3), ObjectAnimator.ofFloat(klaVar2, (Property<kla, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        I1(klaVar2.a(), true);
    }

    public final void K1(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        boolean z3 = this.K;
        boolean z4 = !z3;
        boolean[] zArr = this.R;
        if (zArr[z3 ? 1 : 0] != z) {
            AnimatorSet[] animatorSetArr = this.L;
            AnimatorSet animatorSet = animatorSetArr[z3 ? 1 : 0];
            if (animatorSet != null) {
                if (z2) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.K ? 1 : 0].cancel();
            }
            boolean z5 = this.K;
            zArr[z5 ? 1 : 0] = z;
            if (!z2) {
                if (z3) {
                    return;
                }
                this.O.e(z, z2);
                return;
            }
            animatorSetArr[z5 ? 1 : 0] = new AnimatorSet();
            if (!z3) {
                this.O.e(z, z2);
            }
            animatorSetArr[this.K ? 1 : 0].addListener(new x5(this, z4, z, (byte) 4));
            int i = nm7.f2;
            if (z3) {
                timeInterpolator = null;
            } else if (z) {
                timeInterpolator = gm.F;
                i = nm7.d3;
            } else {
                timeInterpolator = gm.G;
            }
            animatorSetArr[this.K ? 1 : 0].setDuration(i);
            animatorSetArr[this.K ? 1 : 0].setInterpolator(timeInterpolator);
            animatorSetArr[this.K ? 1 : 0].start();
        }
    }

    public final void L1(boolean z, boolean z2, boolean z3) {
        boolean[] zArr = this.j0;
        if (z2 && zArr[this.K ? 1 : 0] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gm.c3(new fe6(this, z, z2, z3));
            return;
        }
        boolean z4 = this.K;
        byte b = 1;
        boolean[] zArr2 = this.l0;
        if (z3 || !z4) {
            zArr2[z4 ? 1 : 0] = false;
            zArr[z4 ? 1 : 0] = z;
        } else {
            zArr[z4 ? 1 : 0] = z;
            if (z2) {
                boolean z5 = zArr2[z4 ? 1 : 0];
                Runnable[] runnableArr = this.k0;
                if (z5) {
                    gm.r(runnableArr[z4 ? 1 : 0]);
                    zArr2[this.K ? 1 : 0] = false;
                    return;
                } else if (z) {
                    fe6 fe6Var = new fe6(this, z4 ? 1 : 0, z, z2);
                    runnableArr[z4 ? 1 : 0] = fe6Var;
                    gm.d3(fe6Var, 2000L);
                    zArr2[this.K ? 1 : 0] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!z4) {
            this.O.f(z, z2);
            return;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            this.M = new AnimatorSet();
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addListener(new jf4((byte) 12, this, z));
            ofFloat.addUpdateListener(new ee6(this, b));
            this.M.playTogether(ofFloat);
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        RadialProgressView radialProgressView = this.W;
        if (z) {
            radialProgressView.setVisibility(0);
            this.W.setScaleX(1.0f);
            this.W.setScaleY(1.0f);
            this.W.setAlpha(1.0f);
            return;
        }
        radialProgressView.setTag(null);
        this.W.setVisibility(4);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.W.setAlpha(0.0f);
    }

    public final boolean M1(View view) {
        if (s1()) {
            return true;
        }
        return gm.E3(view);
    }

    public final void N1(boolean z, boolean z2) {
        if (z == this.y0) {
            return;
        }
        de6 de6Var = this.z0;
        if (de6Var != null) {
            gm.r(de6Var);
            this.z0 = null;
        }
        this.y0 = z;
        this.X.clearAnimation();
        ImageView imageView = this.X;
        if (z2) {
            imageView.setVisibility(0);
            this.X.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new y8c((byte) 26, this, z)).start();
        } else {
            imageView.setVisibility(z ? 0 : 8);
            this.X.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public final void O1(String str, String str2, String str3) {
        if (this.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131745830, "ResetMyAccountWarningText");
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(2131745832, "ResetMyAccountWarning");
        alertDialog$Builder.j(jb6.M0(2131745831, "ResetMyAccountWarningReset"), new lu((Object) this, (Object) str, (Object) str2, (Object) str3, (byte) 14));
        alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
        showDialog(heVar);
    }

    public final void P1() {
        this.fragmentView.setBackgroundColor(cmb.w0(null, cmb.c6, false));
        ImageView imageView = this.V;
        int i = cmb.F6;
        int w0 = cmb.w0(null, i, false);
        m1(imageView, w0, this.t0, PorterDuff.Mode.SRC_ATOP);
        this.t0 = w0;
        ImageView imageView2 = this.V;
        int i2 = cmb.h6;
        int w02 = cmb.w0(null, i2, false);
        n1(imageView2, w02, this.u0);
        this.u0 = w02;
        int w03 = cmb.w0(null, i, false);
        if (w03 != this.v0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            this.v0 = w03;
        }
        ImageView imageView3 = this.X;
        int w04 = cmb.w0(null, i2, false);
        n1(imageView3, w04, this.w0);
        this.w0 = w04;
        RadialProgressView radialProgressView = this.W;
        int i3 = cmb.O9;
        radialProgressView.setProgressColor(cmb.w0(null, i3, false));
        this.O.updateColors();
        this.N.setColor(cmb.w0(null, cmb.N9, false));
        this.N.setBackgroundColor(cmb.w0(null, i3, false));
        for (kla klaVar : this.b) {
            klaVar.updateColors();
        }
        d63 d63Var = this.c;
        b63 b63Var = d63Var.a;
        int w05 = cmb.w0(null, cmb.F6, false);
        if (w05 != d63Var.s || b63Var.getColorFilter() == null) {
            d63Var.s = w05;
            b63Var.setColorFilter(w05, PorterDuff.Mode.SRC_ATOP);
        }
        int w06 = cmb.w0(null, cmb.h6, false);
        int p = on2.p(w06, 30);
        boolean z = w06 != d63Var.w;
        d63Var.w = w06;
        int i4 = 0;
        while (true) {
            View[] viewArr = d63Var.c;
            if (i4 >= viewArr.length) {
                break;
            }
            View view = viewArr[i4];
            if (view != null) {
                if (view.getBackground() == null) {
                    d63.a(i4, view);
                } else if (z) {
                    cmb.F1(view.getBackground(), w06, false);
                    cmb.F1(view.getBackground(), p, true);
                }
                if (view instanceof c63) {
                    ((c63) view).updateColors();
                }
            }
            i4++;
        }
        bh6 bh6Var = this.c0;
        if (bh6Var != null) {
            int i5 = bh6.G;
            bh6Var.b();
        }
    }

    public final void Q1(boolean z, boolean z2) {
        if (this.Y != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.x0 != connectionState || z2) {
                this.x0 = connectionState;
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                byte b = 1;
                boolean z3 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
                int i = this.x0;
                boolean z4 = i == 3 || i == 5;
                boolean z5 = i == 1 || i == 2 || i == 4;
                if (z3) {
                    this.Y.b(true, z4, z);
                    N1(true, z);
                    return;
                }
                if ((!getMessagesController().l3 || gda.v1.isEmpty()) && !z5) {
                    N1(false, z);
                    return;
                }
                this.Y.b(true, z4, z);
                if (this.y0) {
                    return;
                }
                de6 de6Var = this.z0;
                if (de6Var != null) {
                    gm.r(de6Var);
                }
                this.y0 = true;
                de6 de6Var2 = new de6(this, b);
                this.z0 = de6Var2;
                gm.d3(de6Var2, 5000L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            if (this.p0) {
                this.o0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && !this.p0) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03dc  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        kla[] klaVarArr;
        int i;
        dt5 dt5Var;
        int i2;
        View view = this.o0;
        if (view != null) {
            this.fragmentView = view;
            this.o0 = null;
            return view;
        }
        final byte b = 0;
        this.actionBar.setAddToContainer(false);
        byte b2 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, b2));
        this.K = false;
        boolean[] zArr = this.R;
        final byte b3 = 1;
        zArr[0] = true;
        zArr[1] = false;
        w91 w91Var = new w91((byte) 5, context, this);
        this.T = w91Var;
        w91Var.setDelegate(new xw0(this, b3));
        this.fragmentView = this.T;
        xd xdVar = new xd(this, context, (byte) 4);
        xdVar.setFillViewport(true);
        this.T.addView(xdVar, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        xdVar.addView(this.Z, qoe.x(-1, -2, 51));
        Space space = new Space(context);
        this.n0 = space;
        space.setMinimumHeight(gm.O1() ? 0 : gm.m);
        this.Z.addView(this.n0);
        ne6 ne6Var = new ne6(b, context, this);
        this.a0 = ne6Var;
        this.Z.addView(ne6Var, qoe.l(1.0f, -1, 0));
        d63 d63Var = new d63(context);
        this.c = d63Var;
        d63Var.setViewToFindFocus(this.a0);
        this.Z.addView(this.c, qoe.o(-1, 230));
        lh6 lh6Var = new lh6(this, context);
        kla[] klaVarArr2 = this.b;
        klaVarArr2[0] = lh6Var;
        klaVarArr2[1] = new rg6(this, context, 1);
        final byte b4 = 2;
        klaVarArr2[2] = new rg6(this, context, 2);
        klaVarArr2[3] = new rg6(this, context, 3);
        klaVarArr2[4] = new rg6(this, context, 4);
        klaVarArr2[5] = new zf6(this, context);
        klaVarArr2[6] = new if6(this, context);
        byte b5 = 7;
        klaVarArr2[7] = new sf6(this, context);
        klaVarArr2[8] = new ag6(this, context);
        klaVarArr2[9] = new ff6(this, context, 0);
        klaVarArr2[10] = new ff6(this, context, 1);
        klaVarArr2[11] = new rg6(this, context, 11);
        klaVarArr2[12] = new cg6(this, context);
        klaVarArr2[13] = new ze6(this, context, true);
        klaVarArr2[14] = new ze6(this, context, false);
        klaVarArr2[15] = new rg6(this, context, 15);
        klaVarArr2[16] = new pf6(this, context, 16);
        klaVarArr2[17] = new pf6(this, context, 17);
        int i3 = 18;
        klaVarArr2[18] = new wg6(this, context);
        int i4 = 0;
        while (i4 < klaVarArr2.length) {
            klaVarArr2[i4].setVisibility(i4 == 0 ? 0 : 8);
            this.a0.addView(klaVarArr2[i4], qoe.d(-1, -1.0f, 17, gm.O1() ? 26.0f : 18.0f, i4 != i3 ? 30.0f : 0.0f, gm.O1() ? 26.0f : 18.0f, 0.0f));
            i4++;
            i3 = 18;
        }
        Bundle x1 = this.G == 0 ? x1(this.currentAccount, this.y) : null;
        if (x1 != null && ((i2 = x1.getInt("currentViewNum", 0)) < 0 || i2 >= klaVarArr2.length)) {
            x1 = null;
        }
        if (x1 != null) {
            this.a = x1.getInt("currentViewNum", 0);
            this.E = x1.getInt("syncContacts", 1) == 1;
            int i5 = this.a;
            if (i5 < 1 || i5 > 4) {
                klaVarArr = klaVarArr2;
                if (i5 != 6) {
                    if (i5 == 7 && ((sf6) klaVarArr[7]).h == null) {
                        this.a = 0;
                        o1();
                        x1 = null;
                    }
                    wp4 wp4Var = new wp4(this.resourceProvider, context, false);
                    this.O = wp4Var;
                    wp4Var.e(zArr[0], false);
                    this.P = new wm9(this.O);
                    this.T.addView(this.O, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.O.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                        public final /* synthetic */ mh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b6 = b;
                            mh6 mh6Var = this.b;
                            switch (b6) {
                                case 0:
                                    mh6Var.D1();
                                    break;
                                case 1:
                                    if (mh6Var.onBackPressed(true)) {
                                        mh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    di3 di3Var = mh6Var.f0;
                                    if (di3Var != null) {
                                        di3Var.run();
                                    }
                                    mh6Var.finishFragment();
                                    break;
                                default:
                                    mh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    ((zna) this.P.c).b(new h20(this, b5));
                    ImageView imageView = new ImageView(context);
                    this.V = imageView;
                    imageView.setImageResource(R.drawable.ic_ab_back);
                    this.V.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                        public final /* synthetic */ mh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b6 = b3;
                            mh6 mh6Var = this.b;
                            switch (b6) {
                                case 0:
                                    mh6Var.D1();
                                    break;
                                case 1:
                                    if (mh6Var.onBackPressed(true)) {
                                        mh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    di3 di3Var = mh6Var.f0;
                                    if (di3Var != null) {
                                        di3Var.run();
                                    }
                                    mh6Var.finishFragment();
                                    break;
                                default:
                                    mh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    this.V.setContentDescription(jb6.M0(2131754878, null));
                    int L = gm.L(4.0f);
                    this.V.setPadding(L, L, L, L);
                    this.T.addView(this.V, qoe.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                    if (this.f0 != null) {
                        TextView textView = new TextView(context);
                        this.g0 = textView;
                        textView.setGravity(19);
                        this.g0.setTextSize(1, 15.0f);
                        this.g0.setLineSpacing(gm.L(2.0f), 1.0f);
                        this.g0.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                        this.g0.setText(jb6.M0(2131742480, null));
                        anb.X(this.g0, cmb.p6, null);
                        this.T.addView(this.g0, qoe.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                        this.g0.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                            public final /* synthetic */ mh6 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b6 = b4;
                                mh6 mh6Var = this.b;
                                switch (b6) {
                                    case 0:
                                        mh6Var.D1();
                                        break;
                                    case 1:
                                        if (mh6Var.onBackPressed(true)) {
                                            mh6Var.finishFragment();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        di3 di3Var = mh6Var.f0;
                                        if (di3Var != null) {
                                            di3Var.run();
                                        }
                                        mh6Var.finishFragment();
                                        break;
                                    default:
                                        mh6Var.presentFragment(new ProxyListActivity());
                                        break;
                                }
                            }
                        });
                    }
                    ImageView imageView2 = new ImageView(context);
                    this.X = imageView2;
                    uv8 uv8Var = new uv8(context);
                    this.Y = uv8Var;
                    imageView2.setImageDrawable(uv8Var);
                    final byte b6 = 3;
                    this.X.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                        public final /* synthetic */ mh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b6;
                            mh6 mh6Var = this.b;
                            switch (b62) {
                                case 0:
                                    mh6Var.D1();
                                    break;
                                case 1:
                                    if (mh6Var.onBackPressed(true)) {
                                        mh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    di3 di3Var = mh6Var.f0;
                                    if (di3Var != null) {
                                        di3Var.run();
                                    }
                                    mh6Var.finishFragment();
                                    break;
                                default:
                                    mh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    this.X.setAlpha(0.0f);
                    this.X.setVisibility(8);
                    this.T.addView(this.X, qoe.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                    Q1(false, true);
                    RadialProgressView radialProgressView = new RadialProgressView(context, null);
                    this.W = radialProgressView;
                    radialProgressView.setSize(gm.L(20.0f));
                    this.W.setAlpha(0.0f);
                    this.W.setScaleX(0.1f);
                    this.W.setScaleY(0.1f);
                    this.T.addView(this.W, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                    x0c x0cVar = new x0c(context);
                    this.N = x0cVar;
                    x0cVar.setTransformType(0);
                    this.N.setProgress(1.0f);
                    this.N.setDrawBackground(false);
                    this.O.setContentDescription(jb6.M0(2131751291, null));
                    this.O.addView(this.N, qoe.e(56, 56, 17));
                    this.O.a(this.N);
                    if (x1 != null) {
                    }
                    i = 0;
                    while (i < klaVarArr.length) {
                    }
                    this.f = false;
                    P1();
                    if (this.G == 1) {
                    }
                    dt5Var = this.q0;
                    if (dt5Var != null) {
                    }
                    return this.fragmentView;
                }
                if (((if6) klaVarArr[6]).n == null) {
                    this.a = 0;
                    o1();
                    x1 = null;
                }
                wp4 wp4Var2 = new wp4(this.resourceProvider, context, false);
                this.O = wp4Var2;
                wp4Var2.e(zArr[0], false);
                this.P = new wm9(this.O);
                this.T.addView(this.O, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.O.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b62 = b;
                        mh6 mh6Var = this.b;
                        switch (b62) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                ((zna) this.P.c).b(new h20(this, b5));
                ImageView imageView3 = new ImageView(context);
                this.V = imageView3;
                imageView3.setImageResource(R.drawable.ic_ab_back);
                this.V.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b62 = b3;
                        mh6 mh6Var = this.b;
                        switch (b62) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.V.setContentDescription(jb6.M0(2131754878, null));
                int L2 = gm.L(4.0f);
                this.V.setPadding(L2, L2, L2, L2);
                this.T.addView(this.V, qoe.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                if (this.f0 != null && !this.h0 && this.i0) {
                    TextView textView2 = new TextView(context);
                    this.g0 = textView2;
                    textView2.setGravity(19);
                    this.g0.setTextSize(1, 15.0f);
                    this.g0.setLineSpacing(gm.L(2.0f), 1.0f);
                    this.g0.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                    this.g0.setText(jb6.M0(2131742480, null));
                    anb.X(this.g0, cmb.p6, null);
                    this.T.addView(this.g0, qoe.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                    this.g0.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                        public final /* synthetic */ mh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b4;
                            mh6 mh6Var = this.b;
                            switch (b62) {
                                case 0:
                                    mh6Var.D1();
                                    break;
                                case 1:
                                    if (mh6Var.onBackPressed(true)) {
                                        mh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    di3 di3Var = mh6Var.f0;
                                    if (di3Var != null) {
                                        di3Var.run();
                                    }
                                    mh6Var.finishFragment();
                                    break;
                                default:
                                    mh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                }
                ImageView imageView22 = new ImageView(context);
                this.X = imageView22;
                uv8 uv8Var2 = new uv8(context);
                this.Y = uv8Var2;
                imageView22.setImageDrawable(uv8Var2);
                final byte b62 = 3;
                this.X.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b62;
                        mh6 mh6Var = this.b;
                        switch (b622) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.X.setAlpha(0.0f);
                this.X.setVisibility(8);
                this.T.addView(this.X, qoe.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                Q1(false, true);
                RadialProgressView radialProgressView2 = new RadialProgressView(context, null);
                this.W = radialProgressView2;
                radialProgressView2.setSize(gm.L(20.0f));
                this.W.setAlpha(0.0f);
                this.W.setScaleX(0.1f);
                this.W.setScaleY(0.1f);
                this.T.addView(this.W, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                x0c x0cVar2 = new x0c(context);
                this.N = x0cVar2;
                x0cVar2.setTransformType(0);
                this.N.setProgress(1.0f);
                this.N.setDrawBackground(false);
                this.O.setContentDescription(jb6.M0(2131751291, null));
                this.O.addView(this.N, qoe.e(56, 56, 17));
                this.O.a(this.N);
                if (x1 != null) {
                    this.f = true;
                }
                i = 0;
                while (i < klaVarArr.length) {
                    kla klaVar = klaVarArr[i];
                    if (x1 != null) {
                        if (i < 1 || i > 4) {
                            klaVar.k(x1);
                        } else if (i == this.a) {
                            klaVar.k(x1);
                        }
                    }
                    if (this.a == i) {
                        this.V.setVisibility((klaVar.b() || this.y || this.G == 2) ? 0 : 8);
                        klaVar.setVisibility(0);
                        klaVar.j();
                        I1(klaVar.a(), false);
                        this.K = false;
                        K1(i == 0 || i == 5 || i == b2 || i == 9 || i == 10 || i == 12, false);
                        if (i == 1 || i == 2 || i == 3 || i == 4) {
                            this.K = true;
                        }
                    } else if (klaVar.getVisibility() != 8) {
                        klaVar.setVisibility(8);
                        klaVar.g();
                    }
                    i++;
                    b2 = 6;
                }
                this.f = false;
                P1();
                if (this.G == 1) {
                    q1(this.I, this.J, false);
                }
                dt5Var = this.q0;
                if (dt5Var != null) {
                    this.q0 = null;
                    dt5Var.run();
                }
                return this.fragmentView;
            }
            int i6 = x1.getInt("open");
            if (i6 != 0) {
                klaVarArr = klaVarArr2;
                if (Math.abs((System.currentTimeMillis() / 1000) - i6) >= 86400) {
                    this.a = 0;
                    o1();
                    x1 = null;
                }
                wp4 wp4Var22 = new wp4(this.resourceProvider, context, false);
                this.O = wp4Var22;
                wp4Var22.e(zArr[0], false);
                this.P = new wm9(this.O);
                this.T.addView(this.O, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.O.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b;
                        mh6 mh6Var = this.b;
                        switch (b622) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                ((zna) this.P.c).b(new h20(this, b5));
                ImageView imageView32 = new ImageView(context);
                this.V = imageView32;
                imageView32.setImageResource(R.drawable.ic_ab_back);
                this.V.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b3;
                        mh6 mh6Var = this.b;
                        switch (b622) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.V.setContentDescription(jb6.M0(2131754878, null));
                int L22 = gm.L(4.0f);
                this.V.setPadding(L22, L22, L22, L22);
                this.T.addView(this.V, qoe.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                if (this.f0 != null) {
                }
                ImageView imageView222 = new ImageView(context);
                this.X = imageView222;
                uv8 uv8Var22 = new uv8(context);
                this.Y = uv8Var22;
                imageView222.setImageDrawable(uv8Var22);
                final byte b622 = 3;
                this.X.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b6222 = b622;
                        mh6 mh6Var = this.b;
                        switch (b6222) {
                            case 0:
                                mh6Var.D1();
                                break;
                            case 1:
                                if (mh6Var.onBackPressed(true)) {
                                    mh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                di3 di3Var = mh6Var.f0;
                                if (di3Var != null) {
                                    di3Var.run();
                                }
                                mh6Var.finishFragment();
                                break;
                            default:
                                mh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.X.setAlpha(0.0f);
                this.X.setVisibility(8);
                this.T.addView(this.X, qoe.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                Q1(false, true);
                RadialProgressView radialProgressView22 = new RadialProgressView(context, null);
                this.W = radialProgressView22;
                radialProgressView22.setSize(gm.L(20.0f));
                this.W.setAlpha(0.0f);
                this.W.setScaleX(0.1f);
                this.W.setScaleY(0.1f);
                this.T.addView(this.W, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                x0c x0cVar22 = new x0c(context);
                this.N = x0cVar22;
                x0cVar22.setTransformType(0);
                this.N.setProgress(1.0f);
                this.N.setDrawBackground(false);
                this.O.setContentDescription(jb6.M0(2131751291, null));
                this.O.addView(this.N, qoe.e(56, 56, 17));
                this.O.a(this.N);
                if (x1 != null) {
                }
                i = 0;
                while (i < klaVarArr.length) {
                }
                this.f = false;
                P1();
                if (this.G == 1) {
                }
                dt5Var = this.q0;
                if (dt5Var != null) {
                }
                return this.fragmentView;
            }
        }
        klaVarArr = klaVarArr2;
        wp4 wp4Var222 = new wp4(this.resourceProvider, context, false);
        this.O = wp4Var222;
        wp4Var222.e(zArr[0], false);
        this.P = new wm9(this.O);
        this.T.addView(this.O, qoe.d(56, 56.0f, (!jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: le6
            public final /* synthetic */ mh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6222 = b;
                mh6 mh6Var = this.b;
                switch (b6222) {
                    case 0:
                        mh6Var.D1();
                        break;
                    case 1:
                        if (mh6Var.onBackPressed(true)) {
                            mh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        di3 di3Var = mh6Var.f0;
                        if (di3Var != null) {
                            di3Var.run();
                        }
                        mh6Var.finishFragment();
                        break;
                    default:
                        mh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((zna) this.P.c).b(new h20(this, b5));
        ImageView imageView322 = new ImageView(context);
        this.V = imageView322;
        imageView322.setImageResource(R.drawable.ic_ab_back);
        this.V.setOnClickListener(new View.OnClickListener(this) { // from class: le6
            public final /* synthetic */ mh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6222 = b3;
                mh6 mh6Var = this.b;
                switch (b6222) {
                    case 0:
                        mh6Var.D1();
                        break;
                    case 1:
                        if (mh6Var.onBackPressed(true)) {
                            mh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        di3 di3Var = mh6Var.f0;
                        if (di3Var != null) {
                            di3Var.run();
                        }
                        mh6Var.finishFragment();
                        break;
                    default:
                        mh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.V.setContentDescription(jb6.M0(2131754878, null));
        int L222 = gm.L(4.0f);
        this.V.setPadding(L222, L222, L222, L222);
        this.T.addView(this.V, qoe.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.f0 != null) {
        }
        ImageView imageView2222 = new ImageView(context);
        this.X = imageView2222;
        uv8 uv8Var222 = new uv8(context);
        this.Y = uv8Var222;
        imageView2222.setImageDrawable(uv8Var222);
        final byte b6222 = 3;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: le6
            public final /* synthetic */ mh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b62222 = b6222;
                mh6 mh6Var = this.b;
                switch (b62222) {
                    case 0:
                        mh6Var.D1();
                        break;
                    case 1:
                        if (mh6Var.onBackPressed(true)) {
                            mh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        di3 di3Var = mh6Var.f0;
                        if (di3Var != null) {
                            di3Var.run();
                        }
                        mh6Var.finishFragment();
                        break;
                    default:
                        mh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.X.setAlpha(0.0f);
        this.X.setVisibility(8);
        this.T.addView(this.X, qoe.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        Q1(false, true);
        RadialProgressView radialProgressView222 = new RadialProgressView(context, null);
        this.W = radialProgressView222;
        radialProgressView222.setSize(gm.L(20.0f));
        this.W.setAlpha(0.0f);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.T.addView(this.W, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        x0c x0cVar222 = new x0c(context);
        this.N = x0cVar222;
        x0cVar222.setTransformType(0);
        this.N.setProgress(1.0f);
        this.N.setDrawBackground(false);
        this.O.setContentDescription(jb6.M0(2131751291, null));
        this.O.addView(this.N, qoe.e(56, 56, 17));
        this.O.a(this.N);
        if (x1 != null) {
        }
        i = 0;
        while (i < klaVarArr.length) {
        }
        this.f = false;
        P1();
        if (this.G == 1) {
        }
        dt5Var = this.q0;
        if (dt5Var != null) {
        }
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T1) {
            Q1(true, false);
            return;
        }
        if (i == nm7.s1 && this.i0) {
            oc7 messagesController = getMessagesController();
            if (messagesController.u3.contains("SETUP_LOGIN_EMAIL") || messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 9), cmb.F6, cmb.C6, cmb.G6, cmb.h6, cmb.O9, cmb.N9, cmb.j6, cmb.k6, cmb.H6, cmb.p7, cmb.x6, cmb.h7, cmb.p6, cmb.Mi, cmb.P9, cmb.o7, cmb.I6, cmb.X6, cmb.V6, cmb.W6, cmb.g5, cmb.p5, cmb.i5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.i0;
    }

    public final void o1() {
        String str;
        Context context = a.b;
        if (this.y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("logininfo2".concat(str), 0).edit();
        edit.clear();
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        zf6 zf6Var = (zf6) this.b[5];
        if (zf6Var != null) {
            zf6Var.N.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!this.i0 || this.a != 12) {
            int i = this.a;
            kla[] klaVarArr = this.b;
            if (i == 0 || (this.G == 3 && i == 12)) {
                if (z) {
                    for (kla klaVar : klaVarArr) {
                        if (klaVar != null) {
                            klaVar.f();
                        }
                    }
                    o1();
                }
                return true;
            }
            if (i == 6) {
                if (z) {
                    klaVarArr[i].d(true);
                    J1(0, true, null, true);
                    return false;
                }
            } else if (i == 7 || i == 8) {
                if (z) {
                    klaVarArr[i].d(true);
                    J1(6, true, null, true);
                }
            } else if ((i >= 1 && i <= 4) || i == 11 || i == 15) {
                if (z && klaVarArr[i].d(false)) {
                    J1(0, true, null, true);
                    return false;
                }
            } else if (i == 5) {
                if (z) {
                    ((zf6) klaVarArr[i]).x.callOnClick();
                    return false;
                }
            } else if (i == 9) {
                if (z) {
                    klaVarArr[i].d(true);
                    J1(7, true, null, true);
                    return false;
                }
            } else if (i == 10) {
                if (z) {
                    klaVarArr[i].d(true);
                    J1(9, true, null, true);
                    return false;
                }
            } else if (i == 13) {
                if (z) {
                    klaVarArr[i].d(true);
                    J1(12, true, null, true);
                    return false;
                }
            } else if (z && klaVarArr[i].d(true)) {
                J1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        I1(this.b[this.a].a(), false);
        bh6 bh6Var = this.c0;
        if (bh6Var != null) {
            int i = bh6.G;
            bh6Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        byte b = 0;
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.n) {
                ArrayList arrayList2 = this.s;
                if (arrayList2.isEmpty() || getParentActivity() == null) {
                    return;
                }
                gm.d3(new de6(this, b), 200L);
                getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.T1);
        getNotificationCenter().b(this, nm7.s1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            kla[] klaVarArr = this.b;
            if (i >= klaVarArr.length) {
                break;
            }
            kla klaVar = klaVarArr[i];
            if (klaVar != null) {
                klaVar.f();
            }
            i++;
        }
        he heVar = this.S;
        if (heVar != null) {
            heVar.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.k0) {
            if (runnable != null) {
                gm.r(runnable);
            }
        }
        getNotificationCenter().n(this, nm7.T1);
        getNotificationCenter().n(this, nm7.s1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        gm.z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        byte b = 0;
        boolean z = iArr[0] == 0;
        kla[] klaVarArr = this.b;
        if (i == 6) {
            this.w = false;
            int i2 = this.a;
            if (i2 == 0) {
                kla klaVar = klaVarArr[i2];
                ((lh6) klaVar).O = true;
                klaVar.h(null);
                return;
            }
            return;
        }
        if (i == 7) {
            this.x = false;
            int i3 = this.a;
            if (i3 == 0) {
                ((lh6) klaVarArr[i3]).p();
                return;
            }
            return;
        }
        if (i == 20) {
            if (z) {
                ((zf6) klaVarArr[5]).N.l();
            }
        } else if (i == 151 && z) {
            zf6 zf6Var = (zf6) klaVarArr[5];
            zf6Var.post(new me6(zf6Var, b));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        kla klaVar;
        int i;
        kla[] klaVarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        gm.V2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.a;
            if (i2 >= 1 && i2 <= 4) {
                kla klaVar2 = klaVarArr[i2];
                if ((klaVar2 instanceof rg6) && (i = ((rg6) klaVar2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                    klaVarArr[this.a].d(true);
                    J1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        int i3 = this.a;
        if (i3 == 0 && !this.d0 && (klaVar = klaVarArr[i3]) != null) {
            klaVar.j();
        }
        if (s1()) {
            gm.t1(this.fragmentView);
            gm.W2(getParentActivity(), this.classGuid);
        }
        int i4 = this.a;
        if (i4 < 0 || i4 >= klaVarArr.length) {
            return;
        }
        klaVarArr[i4].i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView == null || this.V == null || this.Y == null || this.X == null || this.W == null || this.O == null || this.N == null || this.c == null) {
                return;
            }
            for (kla klaVar : this.b) {
                if (klaVar == null) {
                    return;
                }
            }
            P1();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        final byte b = 1;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            J1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        final byte b2 = 0;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.r0) {
            if (!b.b.hasServices()) {
                fc4.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                H1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            B1(0, true);
            this.r0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                fc4.b("getting classic integrity with nonce = ".concat(str));
                create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new he6(this, bundle, auth_sentcode, string, z)).addOnFailureListener(new OnFailureListener(this) { // from class: ie6
                    public final /* synthetic */ mh6 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        byte b3 = b2;
                        TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                        Bundle bundle2 = bundle;
                        mh6 mh6Var = this.b;
                        switch (b3) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + mh6.p1(exc);
                                fc4.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                mh6Var.H1(bundle2, auth_sentcode2, str2);
                                break;
                            default:
                                fc4.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + mh6.p1(exc);
                                fc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                mh6Var.H1(bundle2, auth_sentcode2, str3);
                                break;
                        }
                    }
                });
                return;
            }
            ua4 ua4Var = new ua4(a.b, br9.a, null, new fgf((byte) 13));
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = e21.f;
            z3d z3dVar = ua4Var.i;
            t2e t2eVar = new t2e(z3dVar, bArr, str2);
            z3dVar.b.d(0, t2eVar);
            ydd.a(t2eVar, new cf9((Object) new cr9(), (byte) 21)).addOnSuccessListener(new he6(this, string, auth_sentcode, bundle, z)).addOnFailureListener(new OnFailureListener(this) { // from class: ie6
                public final /* synthetic */ mh6 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    byte b3 = b;
                    TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                    Bundle bundle2 = bundle;
                    mh6 mh6Var = this.b;
                    switch (b3) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + mh6.p1(exc);
                            fc4.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            mh6Var.H1(bundle2, auth_sentcode2, str22);
                            break;
                        default:
                            fc4.g(exc, true);
                            String str3 = "SAFETYNET_EXCEPTION_" + mh6.p1(exc);
                            fc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            mh6Var.H1(bundle2, auth_sentcode2, str3);
                            break;
                    }
                }
            });
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(1, z, bundle, false);
            return;
        }
        int i = auth_sentcode.timeout;
        if (i == 0) {
            boolean z2 = e21.a;
            i = 60;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            J1(3, z, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            J1(2, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(15, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            J1(11, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            J1(12, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            J1(14, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            J1(16, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            J1(17, z, bundle, false);
        }
    }

    public final HashSet r1() {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) a.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            SubscriptionManager from = SubscriptionManager.from(getParentActivity());
            int i = Build.VERSION.SDK_INT;
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                    String number = completeActiveSubscriptionInfoList.get(i2).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        return hashSet;
    }

    public final boolean s1() {
        return this.b[this.a].a() && !gm.A1();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i = 0; i <= this.a; i++) {
                kla klaVar = this.b[i];
                if (klaVar != null) {
                    klaVar.l(bundle2);
                }
            }
            Context context = a.b;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.y ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            G1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final /* synthetic */ void t1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            fc4.b("Resend firebase sms because integrity token = null");
            H1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new je6((byte) 1, this, bundle, auth_sentcode, z), 10);
    }

    public final void u1(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, cr9 cr9Var) {
        u6d u6dVar = ((k9f) ((uc9) cr9Var.a)).b;
        String str2 = u6dVar == null ? null : u6dVar.a;
        if (str2 == null) {
            fc4.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            H1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            fc4.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            H1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (!optBoolean) {
                    if (optBoolean2) {
                        fc4.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                        H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        return;
                    } else {
                        fc4.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                        H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        return;
                    }
                }
                if (optBoolean2) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new je6((byte) 0, this, bundle, auth_sentcode, z), 10);
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    fc4.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    H1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e) {
                e = e;
                fc4.g(e, true);
                fc4.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                H1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public final void v1(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        y1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                J1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            J1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            z1(jb6.M0(2131745804, null), jb6.M0(2131745848, "ResetAccountCancelledAlert"));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            z1(jb6.M0(2131745804, null), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        J1(8, true, bundle2, false);
    }

    public final void w1(String str, String str2, String str3) {
        B1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new av0(this, str, str2, str3), 10);
    }

    public final void y1(boolean z, boolean z2) {
        he heVar;
        if (this.Q != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (this.G == 1 && (heVar = this.S) != null) {
            heVar.dismiss();
            this.S = null;
        }
        L1(false, z2, false);
    }

    public final void z1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
        showDialog(heVar);
    }

    public mh6() {
        super(null);
        this.b = new kla[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
    }
}
