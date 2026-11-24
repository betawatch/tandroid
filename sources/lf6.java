// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import j$.util.Collection;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lf6 extends jja implements AdapterView.OnItemSelectedListener, gk7 {
    public final ag2 E;
    public byte F;
    public mx2 G;
    public final ArrayList H;
    public final HashMap I;
    public final HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public Toast R;
    public String S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final if6 a;
    public boolean a0;
    public final if6 b;
    public CancellationTokenSource b0;
    public final TextView c;
    public hd c0;
    public final ajb d;
    public hd d0;
    public final er7 e;
    public boolean e0;
    public final er7 f;
    public boolean f0;
    public v57 g0;
    public final TextView h;
    public final /* synthetic */ mf6 h0;
    public final l46 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final ag2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        this.h0 = mf6Var;
        final byte b = 0;
        this.F = (byte) 0;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.J = new HashMap();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0L;
        this.T = -1;
        this.e0 = false;
        this.f0 = false;
        final byte b2 = 1;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        ir2.t(textView, 1, 18.0f);
        final byte b3 = 2;
        textView.setText(k96.M0(mf6Var.G == 2 ? 2131752526 : 2131742543, null));
        textView.setGravity(17);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new v16(this, context, (byte) 7));
        l46 l46Var = new l46(context, null);
        this.n = l46Var;
        l46Var.setText(k96.M0(mf6Var.G == 2 ? 2131752527 : 2131744670, null));
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(17);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(l46Var, nme.t(-1, -2, 1, 32, 8, 32, 0));
        ajb ajbVar = new ajb(context);
        this.d = ajbVar;
        ajbVar.setFactory(new zj3(context, b2));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(ls3.e);
        ajbVar.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(ajbVar, nme.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, nme.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        er7 er7Var = new er7(context, null);
        this.e = er7Var;
        er7Var.setText(k96.M0(2131751742, null));
        er7Var.addView(linearLayout, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        er7Var.setForceUseCenter(true);
        er7Var.setFocusable(true);
        er7Var.setContentDescription(k96.M0(2131751742, null));
        er7Var.setOnFocusChangeListener(new ls0(this, (byte) 13));
        addView(er7Var, nme.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        er7Var.setOnClickListener(new View.OnClickListener(this) { // from class: df6
            public final /* synthetic */ lf6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u21 u21Var;
                String str;
                int i2;
                int i3;
                byte b4 = b3;
                lf6 lf6Var = this.b;
                switch (b4) {
                    case 0:
                        mf6 mf6Var2 = lf6Var.h0;
                        if (mf6Var2.getParentActivity() != null) {
                            boolean z = !mf6Var2.E;
                            mf6Var2.E = z;
                            ((ag2) view).c(z, true);
                            boolean z2 = mf6Var2.E;
                            oc6 oc6Var = mf6Var2.a0;
                            if (z2) {
                                u21Var = new u21(oc6Var, null);
                                str = "SyncContactsOn";
                                i2 = 2131744049;
                                i3 = R.raw.contacts_sync_on;
                            } else {
                                u21Var = new u21(oc6Var, null);
                                str = "SyncContactsOff";
                                i2 = 2131744050;
                                i3 = R.raw.contacts_sync_off;
                            }
                            ir2.v(str, i2, u21Var, i3, 36);
                            break;
                        }
                        break;
                    case 1:
                        mf6 mf6Var3 = lf6Var.h0;
                        if (mf6Var3.getParentActivity() != null) {
                            boolean z3 = !mf6Var3.F;
                            mf6Var3.F = z3;
                            ((ag2) view).c(z3, true);
                            if (mf6Var3.getConnectionsManager().isTestBackend() != mf6Var3.F) {
                                mf6Var3.getConnectionsManager().switchBackend(false);
                            }
                            lf6Var.r();
                            break;
                        }
                        break;
                    default:
                        qx2 qx2Var = new qx2(lf6Var.H, true);
                        qx2Var.r = new gf6(lf6Var);
                        lf6Var.h0.presentFragment(qx2Var);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        er7 er7Var2 = new er7(context, null);
        this.f = er7Var2;
        er7Var2.addView(linearLayout2, nme.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        er7Var2.setText(k96.M0(2131747097, null));
        addView(er7Var2, nme.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, nme.o(-2, -2));
        if6 if6Var = new if6(this, context, b);
        this.a = if6Var;
        if6Var.setInputType(3);
        if6Var.setCursorSize(gl.L(20.0f));
        if6Var.setCursorWidth(1.5f);
        if6Var.setPadding(gl.L(10.0f), 0, 0, 0);
        if6Var.setTextSize(1, 16.0f);
        if6Var.setMaxLines(1);
        if6Var.setGravity(19);
        if6Var.setImeOptions(268435461);
        if6Var.setBackground(null);
        if6Var.setShowSoftInputOnFocus(gl.A1());
        if6Var.setContentDescription(k96.M0(2131748548, null));
        linearLayout2.addView(if6Var, nme.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        if6Var.addTextChangedListener(new jf6(this, b));
        if6Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: cf6
            public final /* synthetic */ lf6 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b4 = b2;
                lf6 lf6Var = this.b;
                switch (b4) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        af6 af6Var = lf6Var.h0.c0;
                        if (af6Var != null) {
                            af6Var.h.callOnClick();
                        } else {
                            lf6Var.h(null);
                        }
                        return true;
                    default:
                        if6 if6Var2 = lf6Var.b;
                        if (i2 != 5) {
                            return false;
                        }
                        if6Var2.requestFocus();
                        if6Var2.setSelection(if6Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k = nme.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k.width = Math.max(2, gl.L(0.5f));
        linearLayout2.addView(view, k);
        if6 if6Var2 = new if6(this, context, b2);
        this.b = if6Var2;
        if6Var2.setInputType(3);
        if6Var2.setPadding(0, 0, 0, 0);
        if6Var2.setCursorSize(gl.L(20.0f));
        if6Var2.setCursorWidth(1.5f);
        if6Var2.setTextSize(1, 16.0f);
        if6Var2.setMaxLines(1);
        if6Var2.setGravity(19);
        if6Var2.setImeOptions(268435461);
        if6Var2.setBackground(null);
        if6Var2.setShowSoftInputOnFocus(gl.A1());
        if6Var2.setContentDescription(k96.M0(2131747097, null));
        linearLayout2.addView(if6Var2, nme.c(36.0f, -1));
        if6Var2.addTextChangedListener(new ej2(this, b2));
        if6Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: cf6
            public final /* synthetic */ lf6 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b4 = b;
                lf6 lf6Var = this.b;
                switch (b4) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        af6 af6Var = lf6Var.h0.c0;
                        if (af6Var != null) {
                            af6Var.h.callOnClick();
                        } else {
                            lf6Var.h(null);
                        }
                        return true;
                    default:
                        if6 if6Var22 = lf6Var.b;
                        if (i2 != 5) {
                            return false;
                        }
                        if6Var22.requestFocus();
                        if6Var22.setSelection(if6Var22.length());
                        return true;
                }
            }
        });
        if (mf6Var.y && mf6Var.G == 0) {
            ag2 ag2Var = new ag2(context, 2);
            this.y = ag2Var;
            ag2Var.e(k96.M0(2131744057, "SyncContacts"), "", mf6Var.E, false, false);
            addView(ag2Var, nme.t(-2, -1, 51, 16, 0, 16 + ((k96.a0 && gl.M1()) ? 56 : 0), 0));
            ag2Var.setOnClickListener(new View.OnClickListener(this) { // from class: df6
                public final /* synthetic */ lf6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u21 u21Var;
                    String str;
                    int i2;
                    int i3;
                    byte b4 = b;
                    lf6 lf6Var = this.b;
                    switch (b4) {
                        case 0:
                            mf6 mf6Var2 = lf6Var.h0;
                            if (mf6Var2.getParentActivity() != null) {
                                boolean z = !mf6Var2.E;
                                mf6Var2.E = z;
                                ((ag2) view2).c(z, true);
                                boolean z2 = mf6Var2.E;
                                oc6 oc6Var = mf6Var2.a0;
                                if (z2) {
                                    u21Var = new u21(oc6Var, null);
                                    str = "SyncContactsOn";
                                    i2 = 2131744049;
                                    i3 = R.raw.contacts_sync_on;
                                } else {
                                    u21Var = new u21(oc6Var, null);
                                    str = "SyncContactsOff";
                                    i2 = 2131744050;
                                    i3 = R.raw.contacts_sync_off;
                                }
                                ir2.v(str, i2, u21Var, i3, 36);
                                break;
                            }
                            break;
                        case 1:
                            mf6 mf6Var3 = lf6Var.h0;
                            if (mf6Var3.getParentActivity() != null) {
                                boolean z3 = !mf6Var3.F;
                                mf6Var3.F = z3;
                                ((ag2) view2).c(z3, true);
                                if (mf6Var3.getConnectionsManager().isTestBackend() != mf6Var3.F) {
                                    mf6Var3.getConnectionsManager().switchBackend(false);
                                }
                                lf6Var.r();
                                break;
                            }
                            break;
                        default:
                            qx2 qx2Var = new qx2(lf6Var.H, true);
                            qx2Var.r = new gf6(lf6Var);
                            lf6Var.h0.presentFragment(qx2Var);
                            break;
                    }
                }
            });
            i = 48;
        } else {
            i = 72;
        }
        boolean z = w01.a;
        if (mf6Var.G == 0) {
            ag2 ag2Var2 = new ag2(context, 2);
            this.E = ag2Var2;
            String M0 = k96.M0(2131751594, null);
            boolean isTestBackend = mf6Var.getConnectionsManager().isTestBackend();
            mf6Var.F = isTestBackend;
            ag2Var2.e(M0, "", isTestBackend, false, false);
            addView(ag2Var2, nme.t(-2, -1, 51, 16, 0, 16 + ((k96.a0 && gl.M1()) ? 56 : 0), 0));
            i -= 24;
            ag2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: df6
                public final /* synthetic */ lf6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u21 u21Var;
                    String str;
                    int i2;
                    int i3;
                    byte b4 = b2;
                    lf6 lf6Var = this.b;
                    switch (b4) {
                        case 0:
                            mf6 mf6Var2 = lf6Var.h0;
                            if (mf6Var2.getParentActivity() != null) {
                                boolean z2 = !mf6Var2.E;
                                mf6Var2.E = z2;
                                ((ag2) view2).c(z2, true);
                                boolean z22 = mf6Var2.E;
                                oc6 oc6Var = mf6Var2.a0;
                                if (z22) {
                                    u21Var = new u21(oc6Var, null);
                                    str = "SyncContactsOn";
                                    i2 = 2131744049;
                                    i3 = R.raw.contacts_sync_on;
                                } else {
                                    u21Var = new u21(oc6Var, null);
                                    str = "SyncContactsOff";
                                    i2 = 2131744050;
                                    i3 = R.raw.contacts_sync_off;
                                }
                                ir2.v(str, i2, u21Var, i3, 36);
                                break;
                            }
                            break;
                        case 1:
                            mf6 mf6Var3 = lf6Var.h0;
                            if (mf6Var3.getParentActivity() != null) {
                                boolean z3 = !mf6Var3.F;
                                mf6Var3.F = z3;
                                ((ag2) view2).c(z3, true);
                                if (mf6Var3.getConnectionsManager().isTestBackend() != mf6Var3.F) {
                                    mf6Var3.getConnectionsManager().switchBackend(false);
                                }
                                lf6Var.r();
                                break;
                            }
                            break;
                        default:
                            qx2 qx2Var = new qx2(lf6Var.H, true);
                            qx2Var.r = new gf6(lf6Var);
                            lf6Var.h0.presentFragment(qx2Var);
                            break;
                    }
                }
            });
        }
        if (i > 0 && !gl.M1()) {
            View space = new Space(context);
            space.setMinimumHeight(gl.L(i));
            addView(space, nme.o(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                mx2 mx2Var = new mx2();
                mx2Var.a = split[2];
                String str = split[0];
                mx2Var.c = str;
                mx2Var.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i0 = k96.i0(2131750504, mx2Var.d);
                    if (!TextUtils.isEmpty(i0) && !TextUtils.equals(mx2Var.d, i0)) {
                        mx2Var.b = mx2Var.a;
                        mx2Var.a = i0;
                    }
                }
                this.H.add(0, mx2Var);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(mx2Var);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        Collections.sort(this.H, Comparator$-CC.comparing(new xz((byte) 10)));
        try {
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        ConnectionsManager.getInstance(mf6Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new rv3(this, hashMap, (byte) 22), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.F = (byte) 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            if6 if6Var3 = this.b;
            if6Var3.setSelection(if6Var3.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(a.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(ls3.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        er7 er7Var = this.e;
        float f = charSequence != null ? 1.0f : 0.0f;
        er7Var.b(f, f, true);
    }

    @Override // jja
    public final boolean a() {
        return true;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        if (i == kk7.k4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i5 = kk7.I2;
        if (i == i5) {
            mf6 mf6Var = this.h0;
            i3 = ((d) mf6Var).currentAccount;
            if (i2 == i3 && this.W) {
                this.W = false;
                i4 = ((d) mf6Var).currentAccount;
                kk7.f(i4).n(this, i5);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override // jja
    public final void e() {
        this.N = false;
    }

    @Override // jja
    public final void f() {
        int i;
        v57 v57Var = this.g0;
        if (v57Var != null) {
            v57Var.run();
            this.g0 = null;
        }
        this.a0 = true;
        if (this.W) {
            this.W = false;
            i = ((d) this.h0).currentAccount;
            kk7.f(i).n(this, kk7.I2);
        }
        CancellationTokenSource cancellationTokenSource = this.b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.b0 = null;
        }
        hd hdVar = this.c0;
        if (hdVar != null) {
            hdVar.dismiss();
            this.c0 = null;
        }
        hd hdVar2 = this.d0;
        if (hdVar2 != null) {
            hdVar2.dismiss();
            this.d0 = null;
        }
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131742533, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jja
    public final void h(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i2;
        if (this.h0.getParentActivity() == null || this.N || this.h0.r0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        boolean z6 = w01.a;
        fa4.b("sim status = " + telephonyManager.getSimState());
        byte b = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            mf6.D1(this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        byte b2 = 1;
        if (!this.O) {
            Point point = gl.q;
            if (point.x > point.y && !this.h0.r1() && this.h0.T.Q() > gl.L(20.0f)) {
                mf6 mf6Var = this.h0;
                mf6Var.U = new bf6(this, b2);
                gl.t1(mf6Var.fragmentView);
                return;
            }
            mf6 mf6Var2 = this.h0;
            Context context = this.h0.fragmentView.getContext();
            mf6 mf6Var3 = this.h0;
            mf6Var2.c0 = new af6(context, (ViewGroup) mf6Var3.fragmentView, mf6Var3.O, str2, new pj4((Object) this, (byte) 11));
            af6 af6Var = this.h0.c0;
            af6Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new ze6(af6Var, b));
            duration.addUpdateListener(new we6(af6Var, (byte) 1));
            duration.setInterpolator(s33.f);
            duration.start();
            return;
        }
        this.O = false;
        af6 af6Var2 = this.h0.c0;
        if (af6Var2 != null) {
            int i3 = af6.G;
            af6Var2.a();
        }
        boolean L1 = gl.L1();
        if (L1) {
            z3 = this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z4 = this.h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            int i4 = Build.VERSION.SDK_INT;
            z5 = i4 < 28 || this.h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z7 = i4 < 26 || this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            mf6 mf6Var4 = this.h0;
            z = L1;
            if (mf6Var4.w) {
                mf6Var4.r.clear();
                if (!z3) {
                    this.h0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z4) {
                    this.h0.r.add("android.permission.CALL_PHONE");
                }
                if (!z5) {
                    this.h0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z7 && i4 >= 26) {
                    this.h0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.h0.r.isEmpty()) {
                    SharedPreferences c1 = na7.c1();
                    if (!c1.getBoolean("firstlogin", true) && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.h0.getParentActivity().requestPermissions((String[]) this.h0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    c1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.h0.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131751759, "Continue"), null);
                    int i5 = R.raw.calls_log;
                    if (!z3 && (!z4 || !z5)) {
                        alertDialog$Builder.a.U = k96.M0(2131754271, "AllowReadCallAndLog");
                    } else if (z4 && z5) {
                        alertDialog$Builder.a.U = k96.M0(2131754272, "AllowReadCall");
                        i5 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.U = k96.M0(2131754270, "AllowReadCallLog");
                    }
                    int i6 = bkb.K5;
                    alertDialog$Builder.l(i5, 46, bkb.w0(null, i6, false), null);
                    alertDialog$Builder.m(i6, null);
                    mf6 mf6Var5 = this.h0;
                    mf6Var5.h = mf6Var5.showDialog(alertDialog$Builder.a);
                    this.O = true;
                    return;
                }
            }
            z2 = true;
        } else {
            z = L1;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
        }
        if (this.F == z2) {
            this.h0.y1(k96.M0(2131745878, null), k96.M0(2131752122, "ChooseCountry"));
            this.h0.x1(false, z2);
            return;
        }
        String str3 = "";
        String h = p38.h("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        mf6 mf6Var6 = this.h0;
        if (mf6Var6.G == 0 && (mf6Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i7 = 0; i7 < 4; i7++) {
                y6c h2 = y6c.h(i7);
                if (h2.o() && PhoneNumberUtils.compare(h, h2.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
                    mf6 mf6Var7 = this.h0;
                    if (isTestBackend == mf6Var7.F) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mf6Var7.getParentActivity());
                        alertDialog$Builder2.a.S = k96.M0(R.string.AppName, null);
                        alertDialog$Builder2.a.U = k96.M0(2131754708, "AccountAlreadyLoggedIn");
                        alertDialog$Builder2.j(k96.M0(2131754693, "AccountSwitch"), new jh((Object) this, i7, (byte) 13));
                        alertDialog$Builder2.g(k96.M0(2131747638, "OK"), null);
                        this.h0.showDialog(alertDialog$Builder2.a);
                        this.h0.x1(false, true);
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = null;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z && z3 && z4 && z5;
        tL_codeSettings.allow_missed_call = z && z3;
        boolean hasServices = b.b.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.h0.m0 || TextUtils.isEmpty(w01.f)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList b3 = p40.b();
        if (b3 != null) {
            for (int i8 = 0; i8 < b3.size(); i8++) {
                if (((TLRPC.TL_auth_authorization) b3.get(i8)).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    boolean z8 = w01.a;
                    fa4.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b3.get(i8)).future_auth_token, StandardCharsets.UTF_8)));
                    tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b3.get(i8)).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens", 0);
        int i9 = sharedPreferences.getInt("count", 0);
        if (i9 != 0) {
            arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < i9) {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i10, str3)));
                String str4 = str3;
                TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(TLdeserialize);
                }
                i10++;
                sharedPreferences = sharedPreferences2;
                str3 = str4;
            }
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ArrayList<byte[]> arrayList2 = tL_codeSettings.logout_tokens;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    tL_codeSettings.logout_tokens = arrayList2;
                }
                arrayList2.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i11)).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            SharedPreferences sharedPreferences3 = a.b.getSharedPreferences("saved_tokens", 0);
            ArrayList arrayList3 = new ArrayList();
            sharedPreferences3.edit().clear().apply();
            System.currentTimeMillis();
            for (int i12 = 0; i12 < Math.min(20, arrayList.size()); i12++) {
                arrayList3.add((TLRPC.TL_auth_loggedOut) arrayList.get(i12));
            }
            if (arrayList3.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putInt("count", arrayList3.size());
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList3.get(i13)).getObjectSize());
                    ((TLRPC.TL_auth_loggedOut) arrayList3.get(i13)).serializeToStream(serializedData2);
                    edit.putString("log_out_token_" + i13, Utilities.f(serializedData2.toByteArray()));
                }
                edit.apply();
            }
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences4 = a.b.getSharedPreferences("mainconfig", 0);
        sharedPreferences4.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            SharedPreferences.Editor edit2 = sharedPreferences4.edit();
            a.t();
            edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
        } else {
            sharedPreferences4.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet q1 = this.h0.q1();
                if (q1.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (y6c.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(q1).anyMatch(new gx5(h, (byte) 1));
                }
            } catch (Exception e2) {
                tL_codeSettings.unknown_number = true;
                fa4.g(e2, true);
            }
        }
        mf6 mf6Var8 = this.h0;
        if (mf6Var8.G == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = h;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i = ((d) mf6Var8).currentAccount;
            ConnectionsManager.getInstance(i).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = w01.e;
            tL_auth_sendCode2.api_id = w01.d;
            tL_auth_sendCode2.phone_number = h;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + p38.h(this.a.getText().toString(), false) + " " + p38.h(this.b.getText().toString(), false));
        } catch (Exception e3) {
            fa4.g(e3, true);
            bundle.putString("ephone", "+" + h);
        }
        bundle.putString("phoneFormated", h);
        mx2 mx2Var = this.G;
        if (mx2Var != null) {
            bundle.putString("country", mx2Var.c);
        }
        this.N = true;
        xl3 xl3Var = new xl3((byte) 14, false);
        xl3Var.c = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        xl3Var.b = this.G;
        xl3Var.d = (List) this.J.get(this.a.getText().toString());
        i2 = ((d) this.h0).currentAccount;
        this.h0.A1(ConnectionsManager.getInstance(i2).sendRequest(tL_auth_sendCode3, new fn0((Object) this, (Object) bundle, (Object) h, (Object) xl3Var, (Object) tL_auth_sendCode3, (byte) 8), 27), true);
    }

    @Override // jja
    public final void j() {
        p();
        byte b = 0;
        ag2 ag2Var = this.y;
        if (ag2Var != null) {
            ag2Var.c(this.h0.E, false);
        }
        gl.e3(new bf6(this, b), mf6.A0);
    }

    @Override // jja
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.b.setText(string2);
        }
    }

    @Override // jja
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final boolean o() {
        mf6 mf6Var = this.h0;
        Activity parentActivity = mf6Var.getParentActivity();
        return (this.a0 || this.N || mf6Var.a != 0 || parentActivity == null || parentActivity.isFinishing()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.a.setText(((mx2) this.H.get(i)).c);
        this.L = false;
    }

    public final void p() {
        boolean z;
        mx2 mx2Var;
        if (this.U || this.h0.G != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
            if (gl.L1()) {
                boolean z2 = this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                int i = Build.VERSION.SDK_INT;
                byte b = 26;
                boolean z3 = i < 26 || this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                mf6 mf6Var = this.h0;
                if (mf6Var.x && (!z2 || !z3)) {
                    mf6Var.s.clear();
                    if (!z2) {
                        this.h0.s.add("android.permission.READ_PHONE_STATE");
                    }
                    if (!z3 && i >= 26) {
                        this.h0.s.add("android.permission.READ_PHONE_NUMBERS");
                    }
                    if (this.h0.s.isEmpty()) {
                        return;
                    }
                    new kz5(this, new ArrayList(this.h0.s), b).run();
                    return;
                }
                this.U = true;
                if (!mf6Var.y && z2 && z3) {
                    this.a.setAlpha(0.0f);
                    this.b.setAlpha(0.0f);
                    String h = p38.h(telephonyManager.getLine1Number(), false);
                    if (!TextUtils.isEmpty(h)) {
                        int i2 = 4;
                        String str = null;
                        if (h.length() > 4) {
                            while (true) {
                                if (i2 < 1) {
                                    z = false;
                                    break;
                                }
                                String substring = h.substring(0, i2);
                                List list = (List) this.I.get(substring);
                                if (list == null) {
                                    mx2Var = null;
                                } else if (list.size() > 1) {
                                    String string = na7.c1().getString("phone_code_last_matched_" + substring, null);
                                    mx2Var = (mx2) list.get(list.size() - 1);
                                    if (string != null) {
                                        ArrayList arrayList = this.H;
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                break;
                                            }
                                            Object obj = arrayList.get(i3);
                                            i3++;
                                            mx2 mx2Var2 = (mx2) obj;
                                            if (Objects.equals(mx2Var2.d, string)) {
                                                mx2Var = mx2Var2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    mx2Var = (mx2) list.get(0);
                                }
                                if (mx2Var != null) {
                                    str = h.substring(i2);
                                    this.a.setText(substring);
                                    z = true;
                                    break;
                                }
                                i2--;
                            }
                            if (!z) {
                                str = h.substring(1);
                                this.a.setText(h.substring(0, 1));
                            }
                        }
                        if (str != null) {
                            this.b.requestFocus();
                            this.b.setText(str);
                            if6 if6Var = this.b;
                            if6Var.setSelection(if6Var.length());
                        }
                    }
                    if (this.b.length() <= 0) {
                        this.a.setAlpha(1.0f);
                        this.b.setAlpha(1.0f);
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(300L);
                    if6 if6Var2 = this.a;
                    Property property = View.ALPHA;
                    duration.playTogether(ObjectAnimator.ofFloat(if6Var2, (Property<if6, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<if6, Float>) property, 1.0f));
                    duration.start();
                    this.O = true;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void q() {
        int i;
        String str = this.S;
        if6 if6Var = this.b;
        String replace = if6Var.getText() != null ? if6Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.J;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.T != -1) {
                int selectionStart = if6Var.getSelectionStart();
                int selectionEnd = if6Var.getSelectionEnd();
                if6Var.setHintText((String) null);
                if6Var.setSelection(selectionStart, selectionEnd);
                this.T = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i = 0;
            while (i < list.size()) {
                if (replace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        if (i == -1) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str2 = (String) list.get(i2);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i = i2;
                    break;
                }
            }
            if (i == -1) {
                i = 0;
            }
        }
        if (this.T != i) {
            String str3 = (String) ((List) hashMap.get(str)).get(i);
            int selectionStart2 = if6Var.getSelectionStart();
            int selectionEnd2 = if6Var.getSelectionEnd();
            if6Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            if6Var.setSelection(Math.max(0, Math.min(if6Var.length(), selectionStart2)), Math.max(0, Math.min(if6Var.length(), selectionEnd2)));
            this.T = i;
        }
    }

    public final void r() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = k96.D0().B != null ? k96.D0().B.c() : Locale.getDefault().getCountry();
        this.h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new ff6(this, (byte) 0), 10);
    }

    public final void s() {
        int i;
        int i2;
        int i3;
        mf6 mf6Var = this.h0;
        if (mf6Var.G != 0 || this.V || this.a0) {
            return;
        }
        i = ((d) mf6Var).currentAccount;
        na7 q1 = na7.q1(i);
        if (!q1.C3) {
            if (this.W) {
                return;
            }
            this.W = true;
            i2 = ((d) mf6Var).currentAccount;
            kk7.f(i2).a(this, kk7.I2);
            i3 = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i3).updateDcSettings();
            return;
        }
        this.V = true;
        boolean z = w01.j;
        byte b = 0;
        if (!z || !q1.D3) {
            t(false);
            return;
        }
        hj3 hj3Var = new hj3(this, (byte) 25);
        if (!z) {
            hj3Var.a(Collections.EMPTY_LIST);
            return;
        }
        yg4 yg4Var = ch4.a;
        if (yg4Var == null) {
            Object b2 = jg4.c().b(yg4.class);
            b2.getClass();
            yg4Var = (yg4) b2;
            ch4.a = yg4Var;
        }
        h0d.b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
        o0d o0dVar = new o0d(zk2.b(0, 1));
        czc czcVar = ((h0d) yg4Var).a;
        lh0 lh0Var = czc.l;
        Log.i(lh0Var.b, lh0Var.b("Requesting verification support info.", new Object[0]));
        agb b3 = bgb.b();
        b3.c = new f84[]{sdd.a};
        b3.a = new dkc(o0dVar, (byte) 14);
        b3.d = (char) 37303;
        Task e = czcVar.e(0, b3.a());
        e.getClass();
        Task continueWithTask = e.continueWithTask(new fvc());
        continueWithTask.getClass();
        continueWithTask.addOnSuccessListener(new hc(b), new zg4(hj3Var)).addOnFailureListener(new hc(b), new zg4(hj3Var));
    }

    public final void t(final boolean z) {
        boolean z2;
        final int i;
        v57 v57Var;
        mf6 mf6Var = this.h0;
        if (mf6Var.G != 0 || Build.VERSION.SDK_INT < 28 || !(z2 = w01.i) || this.f0) {
            return;
        }
        if (z || !this.e0) {
            this.f0 = true;
            this.e0 = true;
            final Context context = getContext();
            i = ((d) mf6Var).currentAccount;
            byte b = 0;
            final ef6 ef6Var = new ef6(this, b);
            if (z2) {
                context.getClass();
                final p13 p13Var = new p13(context, (byte) 0);
                final boolean[] zArr = new boolean[1];
                final Runnable[] runnableArr = new Runnable[1];
                TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                initpasskeylogin.api_id = w01.d;
                initpasskeylogin.api_hash = w01.e;
                runnableArr[0] = new gs2(i, ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new hc(b), new i8c() { // from class: ew7
                    @Override // i8c
                    public final void a(Object obj, Object obj2) {
                        iw7.b(zArr, ef6Var, z, p13Var, context, i, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                    }
                }, 8), (byte) 6);
                v57Var = new v57(zArr, runnableArr, (byte) 1);
            } else {
                v57Var = null;
            }
            this.g0 = v57Var;
        }
    }

    public final void u(String str, mx2 mx2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = k96.E0(mx2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new lx2((byte) 4), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) mx2Var.a);
        setCountryButtonText(vu3.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override // jja
    public final void updateColors() {
        this.c.setTextColor(bkb.w0(null, bkb.F6, false));
        int w0 = bkb.w0(null, bkb.C6, false);
        l46 l46Var = this.n;
        l46Var.setTextColor(w0);
        l46Var.setLinkTextColor(bkb.w0(null, bkb.Wc, false));
        int i = 0;
        while (true) {
            ajb ajbVar = this.d;
            if (i >= ajbVar.getChildCount()) {
                break;
            }
            TextView textView = (TextView) ajbVar.getChildAt(i);
            textView.setTextColor(bkb.w0(null, bkb.F6, false));
            textView.setHintTextColor(bkb.w0(null, bkb.G6, false));
            i++;
        }
        int i2 = bkb.G6;
        int w02 = bkb.w0(null, i2, false);
        int i3 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        mf6.l1(imageView, w02, i3, mode);
        this.w = w02;
        int themedColor = this.h0.getThemedColor(bkb.h6);
        mf6.m1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i4 = bkb.F6;
        this.h.setTextColor(bkb.w0(null, i4, false));
        int w03 = bkb.w0(null, i4, false);
        if6 if6Var = this.a;
        if6Var.setTextColor(w03);
        int i5 = bkb.k6;
        if6Var.setCursorColor(bkb.w0(null, i5, false));
        this.r.setBackgroundColor(bkb.w0(null, bkb.j6, false));
        int w04 = bkb.w0(null, i4, false);
        if6 if6Var2 = this.b;
        if6Var2.setTextColor(w04);
        if6Var2.setHintTextColor(bkb.w0(null, i2, false));
        if6Var2.setCursorColor(bkb.w0(null, i5, false));
        ag2 ag2Var = this.y;
        if (ag2Var != null) {
            int i6 = bkb.X6;
            int i7 = bkb.V6;
            int i8 = bkb.W6;
            CheckBoxSquare checkBoxSquare = ag2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i6;
                checkBoxSquare.w = i7;
                checkBoxSquare.x = i8;
                checkBoxSquare.invalidate();
            }
            ag2Var.g();
        }
        ag2 ag2Var2 = this.E;
        if (ag2Var2 != null) {
            int i9 = bkb.X6;
            int i10 = bkb.V6;
            int i11 = bkb.W6;
            CheckBoxSquare checkBoxSquare2 = ag2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i9;
                checkBoxSquare2.w = i10;
                checkBoxSquare2.x = i11;
                checkBoxSquare2.invalidate();
            }
            ag2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
