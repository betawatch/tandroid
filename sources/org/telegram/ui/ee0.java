package org.telegram.ui;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ee0 extends org.telegram.ui.Components.xt0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.ls {
    public final org.telegram.ui.Cells.c2 D;
    public int E;
    public ps F;
    public final ArrayList G;
    public final HashMap H;
    public final HashMap I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public Toast Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final ce0 a;
    public CancellationTokenSource a0;
    public final ce0 b;
    public org.telegram.ui.ActionBar.u1 b0;
    public final TextView c;
    public org.telegram.ui.ActionBar.u1 c0;
    public final org.telegram.ui.Components.wy0 d;
    public boolean d0;
    public final org.telegram.ui.Components.lb0 e;
    public boolean e0;
    public final org.telegram.ui.Components.lb0 f;
    public org.telegram.messenger.rk f0;
    public final /* synthetic */ fe0 g0;
    public final TextView h;
    public final org.telegram.ui.Components.w70 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final org.telegram.ui.Cells.c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(fe0 fe0Var, Context context) {
        super(context);
        int i7;
        this.g0 = fe0Var;
        final int i10 = 0;
        this.E = 0;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0L;
        this.S = -1;
        this.d0 = false;
        this.e0 = false;
        final int i11 = 1;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 18.0f);
        final int i12 = 2;
        textView.setText(org.telegram.messenger.id.M0(fe0Var.F == 2 ? 2131752538 : 2131742806, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new org.telegram.ui.Components.u41(27, this, context));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.n = w70Var;
        w70Var.setText(org.telegram.messenger.id.M0(fe0Var.F == 2 ? 2131752539 : 2131744907, null));
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(w70Var, c8.ha.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0(context);
        this.d = wy0Var;
        wy0Var.setFactory(new be0(context, i10));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.js.e);
        wy0Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(wy0Var, c8.ha.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
        this.e = lb0Var;
        lb0Var.setText(org.telegram.messenger.id.M0(2131751754, null));
        lb0Var.addView(linearLayout, c8.ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        lb0Var.setForceUseCenter(true);
        lb0Var.setFocusable(true);
        lb0Var.setContentDescription(org.telegram.messenger.id.M0(2131751754, null));
        lb0Var.setOnFocusChangeListener(new fd(this, 9));
        addView(lb0Var, c8.ha.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        lb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.gc gcVar;
                String str;
                int i13;
                int i14;
                int i15 = i12;
                ee0 ee0Var = this.b;
                switch (i15) {
                    case 0:
                        fe0 fe0Var2 = ee0Var.g0;
                        if (fe0Var2.getParentActivity() != null) {
                            boolean z9 = !fe0Var2.D;
                            fe0Var2.D = z9;
                            ((org.telegram.ui.Cells.c2) view).c(z9, true);
                            if (fe0Var2.D) {
                                gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                str = "SyncContactsOn";
                                i13 = 2131744290;
                                i14 = R.raw.contacts_sync_on;
                            } else {
                                gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                str = "SyncContactsOff";
                                i13 = 2131744291;
                                i14 = R.raw.contacts_sync_off;
                            }
                            org.telegram.messenger.k5.o(str, i13, gcVar, i14, 36);
                            break;
                        }
                        break;
                    case 1:
                        fe0 fe0Var3 = ee0Var.g0;
                        if (fe0Var3.getParentActivity() != null) {
                            boolean z10 = !fe0Var3.E;
                            fe0Var3.E = z10;
                            ((org.telegram.ui.Cells.c2) view).c(z10, true);
                            if (fe0Var3.getConnectionsManager().isTestBackend() != fe0Var3.E) {
                                fe0Var3.getConnectionsManager().switchBackend(false);
                            }
                            ee0Var.r();
                            break;
                        }
                        break;
                    default:
                        ts tsVar = new ts(ee0Var.G, true);
                        tsVar.r = new zd0(ee0Var);
                        ee0Var.g0.presentFragment(tsVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.lb0 lb0Var2 = new org.telegram.ui.Components.lb0(context, null);
        this.f = lb0Var2;
        lb0Var2.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        lb0Var2.setText(org.telegram.messenger.id.M0(2131747290, null));
        addView(lb0Var2, c8.ha.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, c8.ha.o(-2, -2));
        ce0 ce0Var = new ce0(this, context, i10);
        this.a = ce0Var;
        ce0Var.setInputType(3);
        ce0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ce0Var.setCursorWidth(1.5f);
        ce0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        ce0Var.setTextSize(1, 16.0f);
        ce0Var.setMaxLines(1);
        ce0Var.setGravity(19);
        ce0Var.setImeOptions(268435461);
        ce0Var.setBackground(null);
        ce0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ce0Var.setContentDescription(org.telegram.messenger.id.M0(2131748740, null));
        linearLayout2.addView(ce0Var, c8.ha.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ce0Var.addTextChangedListener(new m0(this, 12));
        ce0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ud0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        ee0 ee0Var = this.b;
                        if (i13 != 5) {
                            ee0Var.getClass();
                            return false;
                        }
                        sd0 sd0Var = ee0Var.g0.b0;
                        if (sd0Var != null) {
                            sd0Var.h.callOnClick();
                            return true;
                        }
                        ee0Var.h(null);
                        return true;
                    default:
                        ce0 ce0Var2 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ce0Var2.requestFocus();
                        ce0Var2.setSelection(ce0Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = c8.ha.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        ce0 ce0Var2 = new ce0(this, context, i11);
        this.b = ce0Var2;
        ce0Var2.setInputType(3);
        ce0Var2.setPadding(0, 0, 0, 0);
        ce0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ce0Var2.setCursorWidth(1.5f);
        ce0Var2.setTextSize(1, 16.0f);
        ce0Var2.setMaxLines(1);
        ce0Var2.setGravity(19);
        ce0Var2.setImeOptions(268435461);
        ce0Var2.setBackground(null);
        ce0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ce0Var2.setContentDescription(org.telegram.messenger.id.M0(2131747290, null));
        linearLayout2.addView(ce0Var2, c8.ha.c(36.0f, -1));
        ce0Var2.addTextChangedListener(new ar(this, i11));
        ce0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ud0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        ee0 ee0Var = this.b;
                        if (i13 != 5) {
                            ee0Var.getClass();
                            return false;
                        }
                        sd0 sd0Var = ee0Var.g0.b0;
                        if (sd0Var != null) {
                            sd0Var.h.callOnClick();
                            return true;
                        }
                        ee0Var.h(null);
                        return true;
                    default:
                        ce0 ce0Var22 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ce0Var22.requestFocus();
                        ce0Var22.setSelection(ce0Var22.length());
                        return true;
                }
            }
        });
        if (fe0Var.y && fe0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 2);
            this.y = c2Var;
            c2Var.e(org.telegram.messenger.id.M0(2131744298, "SyncContacts"), "", fe0Var.D, false, false);
            addView(c2Var, c8.ha.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.id.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            c2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd0
                public final /* synthetic */ ee0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.gc gcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i10;
                    ee0 ee0Var = this.b;
                    switch (i15) {
                        case 0:
                            fe0 fe0Var2 = ee0Var.g0;
                            if (fe0Var2.getParentActivity() != null) {
                                boolean z9 = !fe0Var2.D;
                                fe0Var2.D = z9;
                                ((org.telegram.ui.Cells.c2) view2).c(z9, true);
                                if (fe0Var2.D) {
                                    gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744290;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744291;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, gcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            fe0 fe0Var3 = ee0Var.g0;
                            if (fe0Var3.getParentActivity() != null) {
                                boolean z10 = !fe0Var3.E;
                                fe0Var3.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (fe0Var3.getConnectionsManager().isTestBackend() != fe0Var3.E) {
                                    fe0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ee0Var.r();
                                break;
                            }
                            break;
                        default:
                            ts tsVar = new ts(ee0Var.G, true);
                            tsVar.r = new zd0(ee0Var);
                            ee0Var.g0.presentFragment(tsVar);
                            break;
                    }
                }
            });
            i7 = 48;
        } else {
            i7 = 72;
        }
        boolean z9 = org.telegram.messenger.r2.a;
        if (fe0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 2);
            this.D = c2Var2;
            String M0 = org.telegram.messenger.id.M0(2131751606, null);
            boolean isTestBackend = fe0Var.getConnectionsManager().isTestBackend();
            fe0Var.E = isTestBackend;
            c2Var2.e(M0, "", isTestBackend, false, false);
            addView(c2Var2, c8.ha.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.id.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            i7 -= 24;
            c2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd0
                public final /* synthetic */ ee0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.gc gcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i11;
                    ee0 ee0Var = this.b;
                    switch (i15) {
                        case 0:
                            fe0 fe0Var2 = ee0Var.g0;
                            if (fe0Var2.getParentActivity() != null) {
                                boolean z92 = !fe0Var2.D;
                                fe0Var2.D = z92;
                                ((org.telegram.ui.Cells.c2) view2).c(z92, true);
                                if (fe0Var2.D) {
                                    gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744290;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    gcVar = new org.telegram.ui.Components.gc(fe0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744291;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, gcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            fe0 fe0Var3 = ee0Var.g0;
                            if (fe0Var3.getParentActivity() != null) {
                                boolean z10 = !fe0Var3.E;
                                fe0Var3.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (fe0Var3.getConnectionsManager().isTestBackend() != fe0Var3.E) {
                                    fe0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ee0Var.r();
                                break;
                            }
                            break;
                        default:
                            ts tsVar = new ts(ee0Var.G, true);
                            tsVar.r = new zd0(ee0Var);
                            ee0Var.g0.presentFragment(tsVar);
                            break;
                    }
                }
            });
        }
        if (i7 > 0 && !org.telegram.messenger.g0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.g0.L(i7));
            addView(space, c8.ha.o(-2, -2));
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
                ps psVar = new ps();
                psVar.a = split[2];
                String str = split[0];
                psVar.c = str;
                psVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.id.i0(2131750521, psVar.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(psVar.d, i02)) {
                        psVar.b = psVar.a;
                        psVar.a = i02;
                    }
                }
                this.G.add(0, psVar);
                List list = (List) this.H.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.H;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(psVar);
                if (split.length > 3) {
                    this.I.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.G, Comparator$-CC.comparing(new aa.l(14)));
        try {
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(fe0Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new k50(10, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.E = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            ce0 ce0Var3 = this.b;
            ce0Var3.setSelection(ce0Var3.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(org.telegram.messenger.t0.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.js.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.lb0 lb0Var = this.e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        lb0Var.b(f10, f10, true);
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void d() {
        this.M = false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        if (i7 == org.telegram.messenger.qs.i4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i13 = org.telegram.messenger.qs.J2;
        if (i7 == i13) {
            fe0 fe0Var = this.g0;
            i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            if (i10 == i11 && this.V) {
                this.V = false;
                i12 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                org.telegram.messenger.qs.f(i12).n(this, i13);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void f() {
        int i7;
        org.telegram.messenger.rk rkVar = this.f0;
        if (rkVar != null) {
            rkVar.run();
            this.f0 = null;
        }
        this.W = true;
        if (this.V) {
            this.V = false;
            i7 = ((org.telegram.ui.ActionBar.f2) this.g0).currentAccount;
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.a0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.a0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.b0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.b0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = this.c0;
        if (u1Var2 != null) {
            u1Var2.dismiss();
            this.c0 = null;
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131742796, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        if (this.g0.getParentActivity() == null || this.M || this.g0.p0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        boolean z14 = org.telegram.messenger.r2.a;
        org.telegram.messenger.a8.b("sim status = " + telephonyManager.getSimState());
        int i11 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            fe0.c1(this.g0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i12 = 1;
        if (!this.N) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y && !this.g0.z1() && this.g0.S.Q() > org.telegram.messenger.g0.L(20.0f)) {
                fe0 fe0Var = this.g0;
                fe0Var.T = new td0(this, i12);
                org.telegram.messenger.g0.v1(fe0Var.fragmentView);
                return;
            }
            fe0 fe0Var2 = this.g0;
            Context context = this.g0.fragmentView.getContext();
            fe0 fe0Var3 = this.g0;
            fe0Var2.b0 = new sd0(context, (ViewGroup) fe0Var3.fragmentView, fe0Var3.N, str2, new f(this, 21));
            sd0 sd0Var = this.g0.b0;
            sd0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new rd0(sd0Var, i11));
            duration.addUpdateListener(new pd0(sd0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.wq.f);
            duration.start();
            return;
        }
        this.N = false;
        sd0 sd0Var2 = this.g0.b0;
        if (sd0Var2 != null) {
            int i13 = sd0.F;
            sd0Var2.a();
        }
        boolean N1 = org.telegram.messenger.g0.N1();
        int i14 = Build.VERSION.SDK_INT;
        if (N1) {
            z11 = this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z12 = this.g0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z13 = i14 < 28 || this.g0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z15 = i14 < 26 || this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            fe0 fe0Var4 = this.g0;
            z9 = N1;
            if (fe0Var4.w) {
                fe0Var4.r.clear();
                if (!z11) {
                    this.g0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    this.g0.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    this.g0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z15 && i14 >= 26) {
                    this.g0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.g0.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !this.g0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.g0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.g0.getParentActivity().requestPermissions((String[]) this.g0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.g0.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    int i15 = R.raw.calls_log;
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131754275, "AllowReadCall");
                        i15 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131754273, "AllowReadCallLog");
                    }
                    int i16 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(i15, 46, org.telegram.ui.ActionBar.m6.x0(null, i16, false), null);
                    alertDialog$Builder.n(i16, null);
                    fe0 fe0Var5 = this.g0;
                    fe0Var5.h = fe0Var5.showDialog(alertDialog$Builder.a);
                    this.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z9 = N1;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
        }
        if (this.E == z10) {
            this.g0.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752134, "ChooseCountry"));
            this.g0.C1(false, z10);
            return;
        }
        String str3 = "";
        String d = pf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        fe0 fe0Var6 = this.g0;
        if (fe0Var6.F == 0 && (fe0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i17 = 0; i17 < 4; i17++) {
                org.telegram.messenger.p10 i18 = org.telegram.messenger.p10.i(i17);
                if (i18.p() && PhoneNumberUtils.compare(d, i18.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i17).isTestBackend();
                    fe0 fe0Var7 = this.g0;
                    if (isTestBackend == fe0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fe0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131754709, "AccountAlreadyLoggedIn");
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131754694, "AccountSwitch"), new l2.q(this, i17, 13));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747831, "OK"), null);
                        this.g0.showDialog(alertDialog$Builder2.a);
                        this.g0.C1(false, true);
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = null;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z9 && z11 && z12 && z13;
        tL_codeSettings.allow_missed_call = z9 && z11;
        boolean hasServices = org.telegram.messenger.tt.b.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.g0.l0 || TextUtils.isEmpty(org.telegram.messenger.r2.f)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList b10 = org.telegram.messenger.v0.b();
        if (b10 != null) {
            for (int i19 = 0; i19 < b10.size(); i19++) {
                if (((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    boolean z16 = org.telegram.messenger.r2.a;
                    org.telegram.messenger.a8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token, StandardCharsets.UTF_8)));
                    tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens", 0);
        int i20 = sharedPreferences.getInt("count", 0);
        if (i20 != 0) {
            arrayList = new ArrayList();
            int i21 = 0;
            while (i21 < i20) {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i21, str3)));
                String str4 = str3;
                TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(TLdeserialize);
                }
                i21++;
                sharedPreferences = sharedPreferences2;
                str3 = str4;
            }
        }
        if (arrayList != null) {
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i22)).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            SharedPreferences sharedPreferences3 = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences3.edit().clear().apply();
            System.currentTimeMillis();
            for (int i23 = 0; i23 < Math.min(20, arrayList.size()); i23++) {
                arrayList2.add((TLRPC.TL_auth_loggedOut) arrayList.get(i23));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putInt("count", arrayList2.size());
                for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                    SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i24)).getObjectSize());
                    ((TLRPC.TL_auth_loggedOut) arrayList2.get(i24)).serializeToStream(serializedData2);
                    edit.putString("log_out_token_" + i24, Utilities.f(serializedData2.toByteArray()));
                }
                edit.apply();
            }
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences4 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
        sharedPreferences4.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            SharedPreferences.Editor edit2 = sharedPreferences4.edit();
            org.telegram.messenger.t0.u();
            edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
        } else {
            sharedPreferences4.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet d12 = fe0.d1(this.g0);
                if (d12.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (org.telegram.messenger.p10.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(d12).anyMatch(new l60(d, 1));
                }
            } catch (Exception e11) {
                tL_codeSettings.unknown_number = true;
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        fe0 fe0Var8 = this.g0;
        if (fe0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) fe0Var8).currentAccount;
            ConnectionsManager.getInstance(i7).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = org.telegram.messenger.r2.e;
            tL_auth_sendCode2.api_id = org.telegram.messenger.r2.d;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + pf.b.d(this.a.getText().toString(), false) + " " + pf.b.d(this.b.getText().toString(), false));
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        ps psVar = this.F;
        if (psVar != null) {
            bundle.putString("country", psVar.c);
        }
        this.M = true;
        h6.m mVar = new h6.m(29, false);
        mVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        mVar.b = this.F;
        mVar.c = (List) this.I.get(this.a.getText().toString());
        i10 = ((org.telegram.ui.ActionBar.f2) this.g0).currentAccount;
        this.g0.F1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new bi.r8(this, bundle, d, mVar, tL_auth_sendCode3, 10), 1049), true);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void j() {
        p();
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            c2Var.c(this.g0.D, false);
        }
        org.telegram.messenger.g0.i3(new td0(this, 0), fe0.y0);
    }

    @Override // org.telegram.ui.Components.xt0
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

    @Override // org.telegram.ui.Components.xt0
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
        fe0 fe0Var = this.g0;
        Activity parentActivity = fe0Var.getParentActivity();
        return (this.W || this.M || fe0Var.a != 0 || parentActivity == null || parentActivity.isFinishing()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.J) {
            this.J = false;
            return;
        }
        this.K = true;
        this.a.setText(((ps) this.G.get(i7)).c);
        this.K = false;
    }

    public final void p() {
        boolean z9;
        fe0 fe0Var;
        boolean z10;
        ps psVar;
        if (this.T || this.g0.F != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            if (org.telegram.messenger.g0.N1()) {
                int i7 = Build.VERSION.SDK_INT;
                boolean z11 = this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i7 >= 26 && this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z9 = false;
                    fe0Var = this.g0;
                    if (!fe0Var.x && (!z11 || !z9)) {
                        fe0Var.s.clear();
                        if (!z11) {
                            this.g0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z9 && i7 >= 26) {
                            this.g0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.g0.s.isEmpty()) {
                            return;
                        }
                        new tc0(6, this, new ArrayList(this.g0.s)).run();
                        return;
                    }
                    this.T = true;
                    if (fe0Var.y && z11 && z9) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = pf.b.d(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(d)) {
                            int i10 = 4;
                            String str = null;
                            if (d.length() > 4) {
                                while (true) {
                                    if (i10 < 1) {
                                        z10 = false;
                                        break;
                                    }
                                    String substring = d.substring(0, i10);
                                    List list = (List) this.H.get(substring);
                                    if (list == null) {
                                        psVar = null;
                                    } else if (list.size() > 1) {
                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                        psVar = (ps) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.G;
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                ps psVar2 = (ps) obj;
                                                if (Objects.equals(psVar2.d, string)) {
                                                    psVar = psVar2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        psVar = (ps) list.get(0);
                                    }
                                    if (psVar != null) {
                                        str = d.substring(i10);
                                        this.a.setText(substring);
                                        z10 = true;
                                        break;
                                    }
                                    i10--;
                                }
                                if (!z10) {
                                    str = d.substring(1);
                                    this.a.setText(d.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                ce0 ce0Var = this.b;
                                ce0Var.setSelection(ce0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        ce0 ce0Var2 = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(ce0Var2, (Property<ce0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<ce0, Float>) property, 1.0f));
                        duration.start();
                        this.N = true;
                        return;
                    }
                    return;
                }
                z9 = true;
                fe0Var = this.g0;
                if (!fe0Var.x) {
                }
                this.T = true;
                if (fe0Var.y) {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void q() {
        int i7;
        String str = this.R;
        ce0 ce0Var = this.b;
        String replace = ce0Var.getText() != null ? ce0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.I;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.S != -1) {
                int selectionStart = ce0Var.getSelectionStart();
                int selectionEnd = ce0Var.getSelectionEnd();
                ce0Var.setHintText((String) null);
                ce0Var.setSelection(selectionStart, selectionEnd);
                this.S = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i7 = 0;
            while (i7 < list.size()) {
                if (replace.startsWith(((String) list.get(i7)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = -1;
        if (i7 == -1) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str2 = (String) list.get(i10);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i7 = i10;
                    break;
                }
            }
            if (i7 == -1) {
                i7 = 0;
            }
        }
        if (this.S != i7) {
            String str3 = (String) ((List) hashMap.get(str)).get(i7);
            int selectionStart2 = ce0Var.getSelectionStart();
            int selectionEnd2 = ce0Var.getSelectionEnd();
            ce0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ce0Var.setSelection(Math.max(0, Math.min(ce0Var.length(), selectionStart2)), Math.max(0, Math.min(ce0Var.length(), selectionEnd2)));
            this.S = i7;
        }
    }

    public final void r() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = org.telegram.messenger.id.E0().B != null ? org.telegram.messenger.id.E0().B.c() : Locale.getDefault().getCountry();
        this.g0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new yd0(this, 0), 10);
    }

    public final void s() {
        int i7;
        int i10;
        int i11;
        fe0 fe0Var = this.g0;
        if (fe0Var.F != 0 || this.U || this.W) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        int i12 = 1;
        if (!s12.i4) {
            if (this.V) {
                return;
            }
            this.V = true;
            i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            org.telegram.messenger.qs.f(i10).b(this, org.telegram.messenger.qs.J2);
            i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            ConnectionsManager.getInstance(i11).updateDcSettings();
            return;
        }
        this.U = true;
        boolean z9 = org.telegram.messenger.r2.j;
        if (!z9 || !s12.j4) {
            t(false);
            return;
        }
        r3 r3Var = new r3(this, 12);
        if (!z9) {
            r3Var.a(Collections.EMPTY_LIST);
            return;
        }
        if (org.telegram.messenger.i9.a == null) {
            Object b10 = o9.g.c().b(db.a.class);
            kotlin.jvm.internal.j.d(b10, "firebaseApp.get(Firebase…Verification::class.java)");
            org.telegram.messenger.i9.a = (db.a) b10;
        }
        db.n nVar = (db.n) org.telegram.messenger.i9.a;
        nVar.getClass();
        db.n.b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
        db.q qVar = new db.q(hd.g.c(0, 1));
        db.d dVar = nVar.a;
        org.telegram.messenger.d1 d1Var = db.d.l;
        Log.i(d1Var.b, d1Var.b("Requesting verification support info.", new Object[0]));
        com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
        b11.d = new n6.c[]{db.j.a};
        b11.c = new a1.c(qVar, 25);
        b11.a = 37303;
        Task e10 = dVar.e(0, b11.a());
        kotlin.jvm.internal.j.d(e10, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
        Task continueWithTask = e10.continueWithTask(new a1.c(nVar, 26));
        kotlin.jvm.internal.j.d(continueWithTask, "fpnvClient.getVerificati…_SUPPORTED,\n      )\n    }");
        continueWithTask.addOnSuccessListener(new d3.b(i12), new org.telegram.messenger.e9(r3Var)).addOnFailureListener(new d3.b(i12), new org.telegram.messenger.e9(r3Var));
    }

    public final void t(final boolean z9) {
        boolean z10;
        final int i7;
        org.telegram.messenger.rk rkVar;
        fe0 fe0Var = this.g0;
        if (fe0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && (z10 = org.telegram.messenger.r2.i) && !this.e0) {
            if (z9 || !this.d0) {
                this.e0 = true;
                this.d0 = true;
                final Context context = getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                final wd0 wd0Var = new wd0(this, 0);
                if (z10) {
                    kotlin.jvm.internal.j.e(context, "context");
                    final k0.b bVar = new k0.b(context);
                    final boolean[] zArr = new boolean[1];
                    final Runnable[] runnableArr = new Runnable[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.r2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.r2.e;
                    runnableArr[0] = new org.telegram.messenger.g9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(initpasskeylogin, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.messenger.kt
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            pt.a(zArr, wd0Var, z9, bVar, context, i7, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 3);
                    rkVar = new org.telegram.messenger.rk(zArr, runnableArr, 1);
                } else {
                    rkVar = null;
                }
                this.f0 = rkVar;
            }
        }
    }

    public final void u(String str, ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.hy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.a);
        setCountryButtonText(org.telegram.messenger.i6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.R = str;
        this.S = -1;
        q();
    }

    @Override // org.telegram.ui.Components.xt0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false);
        org.telegram.ui.Components.w70 w70Var = this.n;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.wy0 wy0Var = this.d;
            if (i7 >= wy0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) wy0Var.getChildAt(i7);
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
            i7++;
        }
        int i10 = org.telegram.ui.ActionBar.m6.H6;
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        fe0.u1(imageView, x03, i11, mode);
        this.w = x03;
        int themedColor = this.g0.getThemedColor(org.telegram.ui.ActionBar.m6.i6);
        fe0.v1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        ce0 ce0Var = this.a;
        ce0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.m6.l6;
        ce0Var.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k6, false));
        int x05 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        ce0 ce0Var2 = this.b;
        ce0Var2.setTextColor(x05);
        ce0Var2.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        ce0Var2.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            int i14 = org.telegram.ui.ActionBar.m6.Y6;
            int i15 = org.telegram.ui.ActionBar.m6.W6;
            int i16 = org.telegram.ui.ActionBar.m6.X6;
            CheckBoxSquare checkBoxSquare = c2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i14;
                checkBoxSquare.w = i15;
                checkBoxSquare.x = i16;
                checkBoxSquare.invalidate();
            }
            c2Var.g();
        }
        org.telegram.ui.Cells.c2 c2Var2 = this.D;
        if (c2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.m6.Y6;
            int i18 = org.telegram.ui.ActionBar.m6.W6;
            int i19 = org.telegram.ui.ActionBar.m6.X6;
            CheckBoxSquare checkBoxSquare2 = c2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i17;
                checkBoxSquare2.w = i18;
                checkBoxSquare2.x = i19;
                checkBoxSquare2.invalidate();
            }
            c2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
