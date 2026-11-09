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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class de0 extends org.telegram.ui.Components.yt0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.ls {
    public final org.telegram.ui.Cells.c2 D;
    public int E;
    public os F;
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
    public final be0 a;
    public CancellationTokenSource a0;
    public final be0 b;
    public org.telegram.ui.ActionBar.u1 b0;
    public final TextView c;
    public org.telegram.ui.ActionBar.u1 c0;
    public final org.telegram.ui.Components.xy0 d;
    public boolean d0;
    public final org.telegram.ui.Components.mb0 e;
    public boolean e0;
    public final org.telegram.ui.Components.mb0 f;
    public org.telegram.messenger.rk f0;
    public final /* synthetic */ ee0 g0;
    public final TextView h;
    public final org.telegram.ui.Components.x70 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final org.telegram.ui.Cells.c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(ee0 ee0Var, Context context) {
        super(context);
        int i7;
        this.g0 = ee0Var;
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
        textView.setText(org.telegram.messenger.id.M0(ee0Var.F == 2 ? 2131752538 : 2131742806, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new org.telegram.ui.Components.u41(27, this, context));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, null);
        this.n = x70Var;
        x70Var.setText(org.telegram.messenger.id.M0(ee0Var.F == 2 ? 2131752539 : 2131744907, null));
        x70Var.setTextSize(1, 14.0f);
        x70Var.setGravity(17);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(x70Var, c8.ha.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(context);
        this.d = xy0Var;
        xy0Var.setFactory(new ae0(context, i10));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.e);
        xy0Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(xy0Var, c8.ha.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
        this.e = mb0Var;
        mb0Var.setText(org.telegram.messenger.id.M0(2131751754, null));
        mb0Var.addView(linearLayout, c8.ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        mb0Var.setForceUseCenter(true);
        mb0Var.setFocusable(true);
        mb0Var.setContentDescription(org.telegram.messenger.id.M0(2131751754, null));
        mb0Var.setOnFocusChangeListener(new fd(this, 9));
        addView(mb0Var, c8.ha.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        mb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud0
            public final /* synthetic */ de0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.hc hcVar;
                String str;
                int i13;
                int i14;
                int i15 = i12;
                de0 de0Var = this.b;
                switch (i15) {
                    case 0:
                        ee0 ee0Var2 = de0Var.g0;
                        if (ee0Var2.getParentActivity() != null) {
                            boolean z9 = !ee0Var2.D;
                            ee0Var2.D = z9;
                            ((org.telegram.ui.Cells.c2) view).c(z9, true);
                            if (ee0Var2.D) {
                                hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                str = "SyncContactsOn";
                                i13 = 2131744290;
                                i14 = R.raw.contacts_sync_on;
                            } else {
                                hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                str = "SyncContactsOff";
                                i13 = 2131744291;
                                i14 = R.raw.contacts_sync_off;
                            }
                            org.telegram.messenger.k5.o(str, i13, hcVar, i14, 36);
                            break;
                        }
                        break;
                    case 1:
                        ee0 ee0Var3 = de0Var.g0;
                        if (ee0Var3.getParentActivity() != null) {
                            boolean z10 = !ee0Var3.E;
                            ee0Var3.E = z10;
                            ((org.telegram.ui.Cells.c2) view).c(z10, true);
                            if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.E) {
                                ee0Var3.getConnectionsManager().switchBackend(false);
                            }
                            de0Var.r();
                            break;
                        }
                        break;
                    default:
                        ss ssVar = new ss(de0Var.G, true);
                        ssVar.r = new yd0(de0Var);
                        de0Var.g0.presentFragment(ssVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
        this.f = mb0Var2;
        mb0Var2.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        mb0Var2.setText(org.telegram.messenger.id.M0(2131747290, null));
        addView(mb0Var2, c8.ha.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, c8.ha.o(-2, -2));
        be0 be0Var = new be0(this, context, i10);
        this.a = be0Var;
        be0Var.setInputType(3);
        be0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        be0Var.setCursorWidth(1.5f);
        be0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        be0Var.setTextSize(1, 16.0f);
        be0Var.setMaxLines(1);
        be0Var.setGravity(19);
        be0Var.setImeOptions(268435461);
        be0Var.setBackground(null);
        be0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        be0Var.setContentDescription(org.telegram.messenger.id.M0(2131748740, null));
        linearLayout2.addView(be0Var, c8.ha.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        be0Var.addTextChangedListener(new m0(this, 12));
        be0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.td0
            public final /* synthetic */ de0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        de0 de0Var = this.b;
                        if (i13 != 5) {
                            de0Var.getClass();
                            return false;
                        }
                        rd0 rd0Var = de0Var.g0.b0;
                        if (rd0Var != null) {
                            rd0Var.h.callOnClick();
                            return true;
                        }
                        de0Var.h(null);
                        return true;
                    default:
                        be0 be0Var2 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        be0Var2.requestFocus();
                        be0Var2.setSelection(be0Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = c8.ha.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        be0 be0Var2 = new be0(this, context, i11);
        this.b = be0Var2;
        be0Var2.setInputType(3);
        be0Var2.setPadding(0, 0, 0, 0);
        be0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        be0Var2.setCursorWidth(1.5f);
        be0Var2.setTextSize(1, 16.0f);
        be0Var2.setMaxLines(1);
        be0Var2.setGravity(19);
        be0Var2.setImeOptions(268435461);
        be0Var2.setBackground(null);
        be0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        be0Var2.setContentDescription(org.telegram.messenger.id.M0(2131747290, null));
        linearLayout2.addView(be0Var2, c8.ha.c(36.0f, -1));
        be0Var2.addTextChangedListener(new zq(this, i11));
        be0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.td0
            public final /* synthetic */ de0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        de0 de0Var = this.b;
                        if (i13 != 5) {
                            de0Var.getClass();
                            return false;
                        }
                        rd0 rd0Var = de0Var.g0.b0;
                        if (rd0Var != null) {
                            rd0Var.h.callOnClick();
                            return true;
                        }
                        de0Var.h(null);
                        return true;
                    default:
                        be0 be0Var22 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        be0Var22.requestFocus();
                        be0Var22.setSelection(be0Var22.length());
                        return true;
                }
            }
        });
        if (ee0Var.y && ee0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 2);
            this.y = c2Var;
            c2Var.e(org.telegram.messenger.id.M0(2131744298, "SyncContacts"), "", ee0Var.D, false, false);
            addView(c2Var, c8.ha.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.id.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            c2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud0
                public final /* synthetic */ de0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.hc hcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i10;
                    de0 de0Var = this.b;
                    switch (i15) {
                        case 0:
                            ee0 ee0Var2 = de0Var.g0;
                            if (ee0Var2.getParentActivity() != null) {
                                boolean z9 = !ee0Var2.D;
                                ee0Var2.D = z9;
                                ((org.telegram.ui.Cells.c2) view2).c(z9, true);
                                if (ee0Var2.D) {
                                    hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744290;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744291;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, hcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            ee0 ee0Var3 = de0Var.g0;
                            if (ee0Var3.getParentActivity() != null) {
                                boolean z10 = !ee0Var3.E;
                                ee0Var3.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.E) {
                                    ee0Var3.getConnectionsManager().switchBackend(false);
                                }
                                de0Var.r();
                                break;
                            }
                            break;
                        default:
                            ss ssVar = new ss(de0Var.G, true);
                            ssVar.r = new yd0(de0Var);
                            de0Var.g0.presentFragment(ssVar);
                            break;
                    }
                }
            });
            i7 = 48;
        } else {
            i7 = 72;
        }
        boolean z9 = org.telegram.messenger.r2.a;
        if (ee0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 2);
            this.D = c2Var2;
            String M0 = org.telegram.messenger.id.M0(2131751606, null);
            boolean isTestBackend = ee0Var.getConnectionsManager().isTestBackend();
            ee0Var.E = isTestBackend;
            c2Var2.e(M0, "", isTestBackend, false, false);
            addView(c2Var2, c8.ha.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.id.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            i7 -= 24;
            c2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud0
                public final /* synthetic */ de0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.hc hcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i11;
                    de0 de0Var = this.b;
                    switch (i15) {
                        case 0:
                            ee0 ee0Var2 = de0Var.g0;
                            if (ee0Var2.getParentActivity() != null) {
                                boolean z92 = !ee0Var2.D;
                                ee0Var2.D = z92;
                                ((org.telegram.ui.Cells.c2) view2).c(z92, true);
                                if (ee0Var2.D) {
                                    hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744290;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    hcVar = new org.telegram.ui.Components.hc(ee0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744291;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, hcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            ee0 ee0Var3 = de0Var.g0;
                            if (ee0Var3.getParentActivity() != null) {
                                boolean z10 = !ee0Var3.E;
                                ee0Var3.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.E) {
                                    ee0Var3.getConnectionsManager().switchBackend(false);
                                }
                                de0Var.r();
                                break;
                            }
                            break;
                        default:
                            ss ssVar = new ss(de0Var.G, true);
                            ssVar.r = new yd0(de0Var);
                            de0Var.g0.presentFragment(ssVar);
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
                os osVar = new os();
                osVar.a = split[2];
                String str = split[0];
                osVar.c = str;
                osVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.id.i0(2131750521, osVar.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(osVar.d, i02)) {
                        osVar.b = osVar.a;
                        osVar.a = i02;
                    }
                }
                this.G.add(0, osVar);
                List list = (List) this.H.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.H;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(osVar);
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
        ConnectionsManager.getInstance(ee0Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new j50(10, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.E = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            be0 be0Var3 = this.b;
            be0Var3.setSelection(be0Var3.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(org.telegram.messenger.t0.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.mb0 mb0Var = this.e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        mb0Var.b(f10, f10, true);
    }

    @Override // org.telegram.ui.Components.yt0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.yt0
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
            ee0 ee0Var = this.g0;
            i11 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            if (i10 == i11 && this.V) {
                this.V = false;
                i12 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                org.telegram.messenger.qs.f(i12).n(this, i13);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yt0
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

    @Override // org.telegram.ui.Components.yt0
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131742796, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.yt0
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
            ee0.c1(this.g0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i12 = 1;
        if (!this.N) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y && !this.g0.z1() && this.g0.S.Q() > org.telegram.messenger.g0.L(20.0f)) {
                ee0 ee0Var = this.g0;
                ee0Var.T = new sd0(this, i12);
                org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                return;
            }
            ee0 ee0Var2 = this.g0;
            Context context = this.g0.fragmentView.getContext();
            ee0 ee0Var3 = this.g0;
            ee0Var2.b0 = new rd0(context, (ViewGroup) ee0Var3.fragmentView, ee0Var3.N, str2, new f(this, 21));
            rd0 rd0Var = this.g0.b0;
            rd0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new qd0(rd0Var, i11));
            duration.addUpdateListener(new od0(rd0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.xq.f);
            duration.start();
            return;
        }
        this.N = false;
        rd0 rd0Var2 = this.g0.b0;
        if (rd0Var2 != null) {
            int i13 = rd0.F;
            rd0Var2.a();
        }
        boolean N1 = org.telegram.messenger.g0.N1();
        int i14 = Build.VERSION.SDK_INT;
        if (N1) {
            z11 = this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z12 = this.g0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z13 = i14 < 28 || this.g0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z15 = i14 < 26 || this.g0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ee0 ee0Var4 = this.g0;
            z9 = N1;
            if (ee0Var4.w) {
                ee0Var4.r.clear();
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
                    int i16 = org.telegram.ui.ActionBar.l6.L5;
                    alertDialog$Builder.m(i15, 46, org.telegram.ui.ActionBar.l6.x0(null, i16, false), null);
                    alertDialog$Builder.n(i16, null);
                    ee0 ee0Var5 = this.g0;
                    ee0Var5.h = ee0Var5.showDialog(alertDialog$Builder.a);
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
        ee0 ee0Var6 = this.g0;
        if (ee0Var6.F == 0 && (ee0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i17 = 0; i17 < 4; i17++) {
                org.telegram.messenger.p10 i18 = org.telegram.messenger.p10.i(i17);
                if (i18.p() && PhoneNumberUtils.compare(d, i18.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i17).isTestBackend();
                    ee0 ee0Var7 = this.g0;
                    if (isTestBackend == ee0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ee0Var7.getParentActivity());
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
                HashSet d12 = ee0.d1(this.g0);
                if (d12.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (org.telegram.messenger.p10.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(d12).anyMatch(new k60(d, 1));
                }
            } catch (Exception e11) {
                tL_codeSettings.unknown_number = true;
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        ee0 ee0Var8 = this.g0;
        if (ee0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var8).currentAccount;
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
        os osVar = this.F;
        if (osVar != null) {
            bundle.putString("country", osVar.c);
        }
        this.M = true;
        h6.m mVar = new h6.m(29, false);
        mVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        mVar.b = this.F;
        mVar.c = (List) this.I.get(this.a.getText().toString());
        i10 = ((org.telegram.ui.ActionBar.f2) this.g0).currentAccount;
        this.g0.F1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new bi.r8(this, bundle, d, mVar, tL_auth_sendCode3, 10), 1049), true);
    }

    @Override // org.telegram.ui.Components.yt0
    public final void j() {
        p();
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            c2Var.c(this.g0.D, false);
        }
        org.telegram.messenger.g0.i3(new sd0(this, 0), ee0.y0);
    }

    @Override // org.telegram.ui.Components.yt0
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

    @Override // org.telegram.ui.Components.yt0
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
        ee0 ee0Var = this.g0;
        Activity parentActivity = ee0Var.getParentActivity();
        return (this.W || this.M || ee0Var.a != 0 || parentActivity == null || parentActivity.isFinishing()) ? false : true;
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
        this.a.setText(((os) this.G.get(i7)).c);
        this.K = false;
    }

    public final void p() {
        boolean z9;
        ee0 ee0Var;
        boolean z10;
        os osVar;
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
                    ee0Var = this.g0;
                    if (!ee0Var.x && (!z11 || !z9)) {
                        ee0Var.s.clear();
                        if (!z11) {
                            this.g0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z9 && i7 >= 26) {
                            this.g0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.g0.s.isEmpty()) {
                            return;
                        }
                        new bd0(5, this, new ArrayList(this.g0.s)).run();
                        return;
                    }
                    this.T = true;
                    if (ee0Var.y && z11 && z9) {
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
                                        osVar = null;
                                    } else if (list.size() > 1) {
                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                        osVar = (os) list.get(list.size() - 1);
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
                                                os osVar2 = (os) obj;
                                                if (Objects.equals(osVar2.d, string)) {
                                                    osVar = osVar2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        osVar = (os) list.get(0);
                                    }
                                    if (osVar != null) {
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
                                be0 be0Var = this.b;
                                be0Var.setSelection(be0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        be0 be0Var2 = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(be0Var2, (Property<be0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<be0, Float>) property, 1.0f));
                        duration.start();
                        this.N = true;
                        return;
                    }
                    return;
                }
                z9 = true;
                ee0Var = this.g0;
                if (!ee0Var.x) {
                }
                this.T = true;
                if (ee0Var.y) {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void q() {
        int i7;
        String str = this.R;
        be0 be0Var = this.b;
        String replace = be0Var.getText() != null ? be0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.I;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.S != -1) {
                int selectionStart = be0Var.getSelectionStart();
                int selectionEnd = be0Var.getSelectionEnd();
                be0Var.setHintText((String) null);
                be0Var.setSelection(selectionStart, selectionEnd);
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
            int selectionStart2 = be0Var.getSelectionStart();
            int selectionEnd2 = be0Var.getSelectionEnd();
            be0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            be0Var.setSelection(Math.max(0, Math.min(be0Var.length(), selectionStart2)), Math.max(0, Math.min(be0Var.length(), selectionEnd2)));
            this.S = i7;
        }
    }

    public final void r() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = org.telegram.messenger.id.E0().B != null ? org.telegram.messenger.id.E0().B.c() : Locale.getDefault().getCountry();
        this.g0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new xd0(this, 0), 10);
    }

    public final void s() {
        int i7;
        int i10;
        int i11;
        ee0 ee0Var = this.g0;
        if (ee0Var.F != 0 || this.U || this.W) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        int i12 = 1;
        if (!s12.i4) {
            if (this.V) {
                return;
            }
            this.V = true;
            i10 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            org.telegram.messenger.qs.f(i10).b(this, org.telegram.messenger.qs.J2);
            i11 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
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
        ee0 ee0Var = this.g0;
        if (ee0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && (z10 = org.telegram.messenger.r2.i) && !this.e0) {
            if (z9 || !this.d0) {
                this.e0 = true;
                this.d0 = true;
                final Context context = getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                final vd0 vd0Var = new vd0(this, 0);
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
                            pt.a(zArr, vd0Var, z9, bVar, context, i7, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
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

    public final void u(String str, os osVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(osVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) osVar.a);
        setCountryButtonText(org.telegram.messenger.i6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.R = str;
        this.S = -1;
        q();
    }

    @Override // org.telegram.ui.Components.yt0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.D6, false);
        org.telegram.ui.Components.x70 x70Var = this.n;
        x70Var.setTextColor(x02);
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Uc, false));
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.xy0 xy0Var = this.d;
            if (i7 >= xy0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) xy0Var.getChildAt(i7);
            textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.H6, false));
            i7++;
        }
        int i10 = org.telegram.ui.ActionBar.l6.H6;
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        int i11 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        ee0.u1(imageView, x03, i11, mode);
        this.w = x03;
        int themedColor = this.g0.getThemedColor(org.telegram.ui.ActionBar.l6.i6);
        ee0.v1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i12 = org.telegram.ui.ActionBar.l6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.l6.x0(null, i12, false);
        be0 be0Var = this.a;
        be0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.l6.l6;
        be0Var.setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.k6, false));
        int x05 = org.telegram.ui.ActionBar.l6.x0(null, i12, false);
        be0 be0Var2 = this.b;
        be0Var2.setTextColor(x05);
        be0Var2.setHintTextColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        be0Var2.setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, i13, false));
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            int i14 = org.telegram.ui.ActionBar.l6.Y6;
            int i15 = org.telegram.ui.ActionBar.l6.W6;
            int i16 = org.telegram.ui.ActionBar.l6.X6;
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
            int i17 = org.telegram.ui.ActionBar.l6.Y6;
            int i18 = org.telegram.ui.ActionBar.l6.W6;
            int i19 = org.telegram.ui.ActionBar.l6.X6;
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
