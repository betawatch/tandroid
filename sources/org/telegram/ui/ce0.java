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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ce0 extends org.telegram.ui.Components.hu0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.fs {
    public final org.telegram.ui.Cells.d2 E;
    public int F;
    public ps G;
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
    public final ae0 a;
    public boolean a0;
    public final ae0 b;
    public CancellationTokenSource b0;
    public final TextView c;
    public org.telegram.ui.ActionBar.t1 c0;
    public final org.telegram.ui.Components.gz0 d;
    public org.telegram.ui.ActionBar.t1 d0;
    public final org.telegram.ui.Components.vb0 e;
    public boolean e0;
    public final org.telegram.ui.Components.vb0 f;
    public boolean f0;
    public org.telegram.messenger.nk g0;
    public final TextView h;
    public final /* synthetic */ de0 h0;
    public final org.telegram.ui.Components.j80 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final org.telegram.ui.Cells.d2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(de0 de0Var, Context context) {
        super(context);
        int i7;
        this.h0 = de0Var;
        final int i10 = 0;
        this.F = 0;
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
        final int i11 = 1;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        i5.c.x(textView, 1, 18.0f);
        final int i12 = 2;
        textView.setText(org.telegram.messenger.gd.N0(de0Var.G == 2 ? 2131752526 : 2131742535, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.na.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new org.telegram.ui.Components.p31(29, this, context));
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.n = j80Var;
        j80Var.setText(org.telegram.messenger.gd.N0(de0Var.G == 2 ? 2131752527 : 2131744666, null));
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(17);
        j80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(j80Var, c8.na.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.gz0 gz0Var = new org.telegram.ui.Components.gz0(context);
        this.d = gz0Var;
        gz0Var.setFactory(new zd0(context, i10));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ws.e);
        gz0Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(gz0Var, c8.na.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, c8.na.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.vb0 vb0Var = new org.telegram.ui.Components.vb0(context, null);
        this.e = vb0Var;
        vb0Var.setText(org.telegram.messenger.gd.N0(2131751742, null));
        vb0Var.addView(linearLayout, c8.na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        vb0Var.setForceUseCenter(true);
        vb0Var.setFocusable(true);
        vb0Var.setContentDescription(org.telegram.messenger.gd.N0(2131751742, null));
        vb0Var.setOnFocusChangeListener(new ed(this, 9));
        addView(vb0Var, c8.na.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        vb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.kc kcVar;
                String str;
                int i13;
                int i14;
                int i15 = i12;
                ce0 ce0Var = this.b;
                switch (i15) {
                    case 0:
                        de0 de0Var2 = ce0Var.h0;
                        if (de0Var2.getParentActivity() != null) {
                            boolean z10 = !de0Var2.E;
                            de0Var2.E = z10;
                            ((org.telegram.ui.Cells.d2) view).c(z10, true);
                            if (de0Var2.E) {
                                kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                str = "SyncContactsOn";
                                i13 = 2131744045;
                                i14 = R.raw.contacts_sync_on;
                            } else {
                                kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                str = "SyncContactsOff";
                                i13 = 2131744046;
                                i14 = R.raw.contacts_sync_off;
                            }
                            org.telegram.messenger.f3.n(str, i13, kcVar, i14, 36);
                            break;
                        }
                        break;
                    case 1:
                        de0 de0Var3 = ce0Var.h0;
                        if (de0Var3.getParentActivity() != null) {
                            boolean z11 = !de0Var3.F;
                            de0Var3.F = z11;
                            ((org.telegram.ui.Cells.d2) view).c(z11, true);
                            if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                de0Var3.getConnectionsManager().switchBackend(false);
                            }
                            ce0Var.r();
                            break;
                        }
                        break;
                    default:
                        ts tsVar = new ts(ce0Var.H, true);
                        tsVar.r = new wd0(ce0Var);
                        ce0Var.h0.presentFragment(tsVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.vb0 vb0Var2 = new org.telegram.ui.Components.vb0(context, null);
        this.f = vb0Var2;
        vb0Var2.addView(linearLayout2, c8.na.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        vb0Var2.setText(org.telegram.messenger.gd.N0(2131747096, null));
        addView(vb0Var2, c8.na.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, c8.na.o(-2, -2));
        ae0 ae0Var = new ae0(this, context, i10);
        this.a = ae0Var;
        ae0Var.setInputType(3);
        ae0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ae0Var.setCursorWidth(1.5f);
        ae0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        ae0Var.setTextSize(1, 16.0f);
        ae0Var.setMaxLines(1);
        ae0Var.setGravity(19);
        ae0Var.setImeOptions(268435461);
        ae0Var.setBackground(null);
        ae0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ae0Var.setContentDescription(org.telegram.messenger.gd.N0(2131748547, null));
        linearLayout2.addView(ae0Var, c8.na.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ae0Var.addTextChangedListener(new m0(this, 12));
        ae0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.rd0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        ce0 ce0Var = this.b;
                        if (i13 != 5) {
                            ce0Var.getClass();
                            return false;
                        }
                        pd0 pd0Var = ce0Var.h0.c0;
                        if (pd0Var != null) {
                            pd0Var.h.callOnClick();
                            return true;
                        }
                        ce0Var.h(null);
                        return true;
                    default:
                        ae0 ae0Var2 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ae0Var2.requestFocus();
                        ae0Var2.setSelection(ae0Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = c8.na.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        ae0 ae0Var2 = new ae0(this, context, i11);
        this.b = ae0Var2;
        ae0Var2.setInputType(3);
        ae0Var2.setPadding(0, 0, 0, 0);
        ae0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ae0Var2.setCursorWidth(1.5f);
        ae0Var2.setTextSize(1, 16.0f);
        ae0Var2.setMaxLines(1);
        ae0Var2.setGravity(19);
        ae0Var2.setImeOptions(268435461);
        ae0Var2.setBackground(null);
        ae0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ae0Var2.setContentDescription(org.telegram.messenger.gd.N0(2131747096, null));
        linearLayout2.addView(ae0Var2, c8.na.c(36.0f, -1));
        ae0Var2.addTextChangedListener(new ar(this, i11));
        ae0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.rd0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        ce0 ce0Var = this.b;
                        if (i13 != 5) {
                            ce0Var.getClass();
                            return false;
                        }
                        pd0 pd0Var = ce0Var.h0.c0;
                        if (pd0Var != null) {
                            pd0Var.h.callOnClick();
                            return true;
                        }
                        ce0Var.h(null);
                        return true;
                    default:
                        ae0 ae0Var22 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ae0Var22.requestFocus();
                        ae0Var22.setSelection(ae0Var22.length());
                        return true;
                }
            }
        });
        if (de0Var.y && de0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 2);
            this.y = d2Var;
            d2Var.e(org.telegram.messenger.gd.N0(2131744053, "SyncContacts"), "", de0Var.E, false, false);
            addView(d2Var, c8.na.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.gd.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            d2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
                public final /* synthetic */ ce0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.kc kcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i10;
                    ce0 ce0Var = this.b;
                    switch (i15) {
                        case 0:
                            de0 de0Var2 = ce0Var.h0;
                            if (de0Var2.getParentActivity() != null) {
                                boolean z10 = !de0Var2.E;
                                de0Var2.E = z10;
                                ((org.telegram.ui.Cells.d2) view2).c(z10, true);
                                if (de0Var2.E) {
                                    kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744045;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744046;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.f3.n(str, i13, kcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            de0 de0Var3 = ce0Var.h0;
                            if (de0Var3.getParentActivity() != null) {
                                boolean z11 = !de0Var3.F;
                                de0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                    de0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ce0Var.r();
                                break;
                            }
                            break;
                        default:
                            ts tsVar = new ts(ce0Var.H, true);
                            tsVar.r = new wd0(ce0Var);
                            ce0Var.h0.presentFragment(tsVar);
                            break;
                    }
                }
            });
            i7 = 48;
        } else {
            i7 = 72;
        }
        boolean z10 = org.telegram.messenger.s2.a;
        if (de0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context, 2);
            this.E = d2Var2;
            String N0 = org.telegram.messenger.gd.N0(2131751594, null);
            boolean isTestBackend = de0Var.getConnectionsManager().isTestBackend();
            de0Var.F = isTestBackend;
            d2Var2.e(N0, "", isTestBackend, false, false);
            addView(d2Var2, c8.na.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.gd.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            i7 -= 24;
            d2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
                public final /* synthetic */ ce0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.kc kcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i11;
                    ce0 ce0Var = this.b;
                    switch (i15) {
                        case 0:
                            de0 de0Var2 = ce0Var.h0;
                            if (de0Var2.getParentActivity() != null) {
                                boolean z102 = !de0Var2.E;
                                de0Var2.E = z102;
                                ((org.telegram.ui.Cells.d2) view2).c(z102, true);
                                if (de0Var2.E) {
                                    kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744045;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    kcVar = new org.telegram.ui.Components.kc(de0Var2.a0, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744046;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.f3.n(str, i13, kcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            de0 de0Var3 = ce0Var.h0;
                            if (de0Var3.getParentActivity() != null) {
                                boolean z11 = !de0Var3.F;
                                de0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                    de0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ce0Var.r();
                                break;
                            }
                            break;
                        default:
                            ts tsVar = new ts(ce0Var.H, true);
                            tsVar.r = new wd0(ce0Var);
                            ce0Var.h0.presentFragment(tsVar);
                            break;
                    }
                }
            });
        }
        if (i7 > 0 && !org.telegram.messenger.g0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.g0.L(i7));
            addView(space, c8.na.o(-2, -2));
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
                    String i02 = org.telegram.messenger.gd.i0(2131750504, psVar.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(psVar.d, i02)) {
                        psVar.b = psVar.a;
                        psVar.a = i02;
                    }
                }
                this.H.add(0, psVar);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(psVar);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.H, Comparator$-CC.comparing(new aa.l(14)));
        try {
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(de0Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new d00(12, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.F = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            ae0 ae0Var3 = this.b;
            ae0Var3.setSelection(ae0Var3.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(org.telegram.messenger.t0.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ws.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.vb0 vb0Var = this.e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        vb0Var.b(f10, f10, true);
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.hu0
    public final void d() {
        this.N = false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        if (i7 == org.telegram.messenger.ks.l4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i13 = org.telegram.messenger.ks.J2;
        if (i7 == i13) {
            de0 de0Var = this.h0;
            i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            if (i10 == i11 && this.W) {
                this.W = false;
                i12 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                org.telegram.messenger.ks.f(i12).n(this, i13);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public final void e() {
        int i7;
        org.telegram.messenger.nk nkVar = this.g0;
        if (nkVar != null) {
            nkVar.run();
            this.g0 = null;
        }
        this.a0 = true;
        if (this.W) {
            this.W = false;
            i7 = ((org.telegram.ui.ActionBar.g2) this.h0).currentAccount;
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.b0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.c0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.c0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = this.d0;
        if (t1Var2 != null) {
            t1Var2.dismiss();
            this.d0 = null;
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131742525, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.hu0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        if (this.h0.getParentActivity() == null || this.N || this.h0.r0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        boolean z15 = org.telegram.messenger.s2.a;
        org.telegram.messenger.a8.b("sim status = " + telephonyManager.getSimState());
        int i11 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            de0.c1(this.h0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i12 = 1;
        if (!this.O) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y && !this.h0.z1() && this.h0.T.Q() > org.telegram.messenger.g0.L(20.0f)) {
                de0 de0Var = this.h0;
                de0Var.U = new qd0(this, i12);
                org.telegram.messenger.g0.v1(de0Var.fragmentView);
                return;
            }
            de0 de0Var2 = this.h0;
            Context context = this.h0.fragmentView.getContext();
            de0 de0Var3 = this.h0;
            de0Var2.c0 = new pd0(context, (ViewGroup) de0Var3.fragmentView, de0Var3.O, str2, new f(this, 21));
            pd0 pd0Var = this.h0.c0;
            pd0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new od0(pd0Var, i11));
            duration.addUpdateListener(new md0(pd0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.kr.f);
            duration.start();
            return;
        }
        this.O = false;
        pd0 pd0Var2 = this.h0.c0;
        if (pd0Var2 != null) {
            int i13 = pd0.G;
            pd0Var2.a();
        }
        boolean N1 = org.telegram.messenger.g0.N1();
        int i14 = Build.VERSION.SDK_INT;
        if (N1) {
            z12 = this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i14 < 28 || this.h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z16 = i14 < 26 || this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            de0 de0Var4 = this.h0;
            z10 = N1;
            if (de0Var4.w) {
                de0Var4.r.clear();
                if (!z12) {
                    this.h0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.h0.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.h0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z16 && i14 >= 26) {
                    this.h0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.h0.r.isEmpty()) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    if (!g12.getBoolean("firstlogin", true) && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.h0.getParentActivity().requestPermissions((String[]) this.h0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    g12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.h0.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
                    int i15 = R.raw.calls_log;
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131754271, "AllowReadCallAndLog");
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131754272, "AllowReadCall");
                        i15 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131754270, "AllowReadCallLog");
                    }
                    int i16 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(i15, 46, org.telegram.ui.ActionBar.n6.x0(null, i16, false), null);
                    alertDialog$Builder.n(i16, null);
                    de0 de0Var5 = this.h0;
                    de0Var5.h = de0Var5.showDialog(alertDialog$Builder.a);
                    this.O = true;
                    return;
                }
            }
            z11 = true;
        } else {
            z10 = N1;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        }
        if (this.F == z11) {
            this.h0.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752122, "ChooseCountry"));
            this.h0.C1(false, z11);
            return;
        }
        String str3 = "";
        String d = pf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        de0 de0Var6 = this.h0;
        if (de0Var6.G == 0 && (de0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i17 = 0; i17 < 4; i17++) {
                org.telegram.messenger.i10 i18 = org.telegram.messenger.i10.i(i17);
                if (i18.p() && PhoneNumberUtils.compare(d, i18.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i17).isTestBackend();
                    de0 de0Var7 = this.h0;
                    if (isTestBackend == de0Var7.F) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var7.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(R.string.AppName, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.gd.N0(2131754708, "AccountAlreadyLoggedIn");
                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131754693, "AccountSwitch"), new ai.n1(this, i17, 15));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747637, "OK"), null);
                        this.h0.showDialog(alertDialog$Builder2.a);
                        this.h0.C1(false, true);
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = null;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z10 && z12 && z13 && z14;
        tL_codeSettings.allow_missed_call = z10 && z12;
        boolean hasServices = org.telegram.messenger.nt.b.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.h0.m0 || TextUtils.isEmpty(org.telegram.messenger.s2.f)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList b10 = org.telegram.messenger.v0.b();
        if (b10 != null) {
            for (int i19 = 0; i19 < b10.size(); i19++) {
                if (((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    boolean z17 = org.telegram.messenger.s2.a;
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
                HashSet d12 = de0.d1(this.h0);
                if (d12.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (org.telegram.messenger.i10.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(d12).anyMatch(new i60(d, 1));
                }
            } catch (Exception e11) {
                tL_codeSettings.unknown_number = true;
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        de0 de0Var8 = this.h0;
        if (de0Var8.G == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var8).currentAccount;
            ConnectionsManager.getInstance(i7).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = org.telegram.messenger.s2.e;
            tL_auth_sendCode2.api_id = org.telegram.messenger.s2.d;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + pf.b.d(this.a.getText().toString(), false) + " " + pf.b.d(this.b.getText().toString(), false));
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        ps psVar = this.G;
        if (psVar != null) {
            bundle.putString("country", psVar.c);
        }
        this.N = true;
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(2, false);
        i61Var.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        i61Var.b = this.G;
        i61Var.c = (List) this.J.get(this.a.getText().toString());
        i10 = ((org.telegram.ui.ActionBar.g2) this.h0).currentAccount;
        this.h0.F1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new di.m7(this, bundle, d, i61Var, tL_auth_sendCode3, 10), 27), true);
    }

    @Override // org.telegram.ui.Components.hu0
    public final void j() {
        p();
        org.telegram.ui.Cells.d2 d2Var = this.y;
        if (d2Var != null) {
            d2Var.c(this.h0.E, false);
        }
        org.telegram.messenger.g0.h3(new qd0(this, 0), de0.A0);
    }

    @Override // org.telegram.ui.Components.hu0
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

    @Override // org.telegram.ui.Components.hu0
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
        de0 de0Var = this.h0;
        Activity parentActivity = de0Var.getParentActivity();
        return (this.a0 || this.N || de0Var.a != 0 || parentActivity == null || parentActivity.isFinishing()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.a.setText(((ps) this.H.get(i7)).c);
        this.L = false;
    }

    public final void p() {
        boolean z10;
        de0 de0Var;
        boolean z11;
        ps psVar;
        if (this.U || this.h0.G != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            if (org.telegram.messenger.g0.N1()) {
                int i7 = Build.VERSION.SDK_INT;
                boolean z12 = this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i7 >= 26 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z10 = false;
                    de0Var = this.h0;
                    int i10 = 2;
                    if (!de0Var.x && (!z12 || !z10)) {
                        de0Var.s.clear();
                        if (!z12) {
                            this.h0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z10 && i7 >= 26) {
                            this.h0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.h0.s.isEmpty()) {
                            return;
                        }
                        new bd0(i10, this, new ArrayList(this.h0.s)).run();
                        return;
                    }
                    this.U = true;
                    if (de0Var.y && z12 && z10) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = pf.b.d(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(d)) {
                            int i11 = 4;
                            String str = null;
                            if (d.length() > 4) {
                                while (true) {
                                    if (i11 < 1) {
                                        z11 = false;
                                        break;
                                    }
                                    String substring = d.substring(0, i11);
                                    List list = (List) this.I.get(substring);
                                    if (list == null) {
                                        psVar = null;
                                    } else if (list.size() > 1) {
                                        String string = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + substring, null);
                                        psVar = (ps) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.H;
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i12);
                                                i12++;
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
                                        str = d.substring(i11);
                                        this.a.setText(substring);
                                        z11 = true;
                                        break;
                                    }
                                    i11--;
                                }
                                if (!z11) {
                                    str = d.substring(1);
                                    this.a.setText(d.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                ae0 ae0Var = this.b;
                                ae0Var.setSelection(ae0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        ae0 ae0Var2 = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(ae0Var2, (Property<ae0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<ae0, Float>) property, 1.0f));
                        duration.start();
                        this.O = true;
                        return;
                    }
                    return;
                }
                z10 = true;
                de0Var = this.h0;
                int i102 = 2;
                if (!de0Var.x) {
                }
                this.U = true;
                if (de0Var.y) {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void q() {
        int i7;
        String str = this.S;
        ae0 ae0Var = this.b;
        String replace = ae0Var.getText() != null ? ae0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.J;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.T != -1) {
                int selectionStart = ae0Var.getSelectionStart();
                int selectionEnd = ae0Var.getSelectionEnd();
                ae0Var.setHintText((String) null);
                ae0Var.setSelection(selectionStart, selectionEnd);
                this.T = -1;
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
        if (this.T != i7) {
            String str3 = (String) ((List) hashMap.get(str)).get(i7);
            int selectionStart2 = ae0Var.getSelectionStart();
            int selectionEnd2 = ae0Var.getSelectionEnd();
            ae0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ae0Var.setSelection(Math.max(0, Math.min(ae0Var.length(), selectionStart2)), Math.max(0, Math.min(ae0Var.length(), selectionEnd2)));
            this.T = i7;
        }
    }

    public final void r() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = org.telegram.messenger.gd.E0().B != null ? org.telegram.messenger.gd.E0().B.c() : Locale.getDefault().getCountry();
        this.h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new vd0(this, 0), 10);
    }

    public final void s() {
        int i7;
        int i10;
        int i11;
        de0 de0Var = this.h0;
        if (de0Var.G != 0 || this.V || this.a0) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        int i12 = 1;
        if (!u12.l4) {
            if (this.W) {
                return;
            }
            this.W = true;
            i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            org.telegram.messenger.ks.f(i10).b(this, org.telegram.messenger.ks.J2);
            i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i11).updateDcSettings();
            return;
        }
        this.V = true;
        boolean z10 = org.telegram.messenger.s2.j;
        if (!z10 || !u12.m4) {
            t(false);
            return;
        }
        r3 r3Var = new r3(this, 13);
        if (!z10) {
            r3Var.a(Collections.EMPTY_LIST);
            return;
        }
        if (org.telegram.messenger.g9.a == null) {
            Object b10 = o9.g.c().b(db.a.class);
            kotlin.jvm.internal.j.d(b10, "firebaseApp.get(Firebase…Verification::class.java)");
            org.telegram.messenger.g9.a = (db.a) b10;
        }
        db.n nVar = (db.n) org.telegram.messenger.g9.a;
        nVar.getClass();
        db.n.b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
        db.q qVar = new db.q(hd.g.c(0, 1));
        db.d dVar = nVar.a;
        org.telegram.messenger.d1 d1Var = db.d.l;
        Log.i(d1Var.b, d1Var.b("Requesting verification support info.", new Object[0]));
        com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
        b11.d = new n6.c[]{db.j.a};
        b11.c = new a1.c(qVar, 21);
        b11.a = 37303;
        Task e10 = dVar.e(0, b11.a());
        kotlin.jvm.internal.j.d(e10, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
        Task continueWithTask = e10.continueWithTask(new a1.c(nVar, 22));
        kotlin.jvm.internal.j.d(continueWithTask, "fpnvClient.getVerificati…_SUPPORTED,\n      )\n    }");
        continueWithTask.addOnSuccessListener(new d3.b(i12), new org.telegram.messenger.d9(r3Var)).addOnFailureListener(new d3.b(i12), new org.telegram.messenger.d9(r3Var));
    }

    public final void t(final boolean z10) {
        boolean z11;
        final int i7;
        org.telegram.messenger.nk nkVar;
        de0 de0Var = this.h0;
        if (de0Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.s2.i) && !this.f0) {
            if (z10 || !this.e0) {
                this.f0 = true;
                this.e0 = true;
                final Context context = getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                final td0 td0Var = new td0(this, 0);
                if (z11) {
                    kotlin.jvm.internal.j.e(context, "context");
                    final androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 2);
                    final boolean[] zArr = new boolean[1];
                    final Runnable[] runnableArr = new Runnable[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.s2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.s2.e;
                    runnableArr[0] = new org.telegram.messenger.e9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(initpasskeylogin, new d3.b(1), new org.telegram.messenger.p10() { // from class: org.telegram.messenger.dt
                        @Override // org.telegram.messenger.p10
                        public final void a(Object obj, Object obj2) {
                            jt.a(zArr, td0Var, z10, nVar, context, i7, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 3);
                    nkVar = new org.telegram.messenger.nk(zArr, runnableArr, 1);
                } else {
                    nkVar = null;
                }
                this.g0 = nkVar;
            }
        }
    }

    public final void u(String str, ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.gd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.ry(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.a);
        setCountryButtonText(org.telegram.messenger.j6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override // org.telegram.ui.Components.hu0, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false);
        org.telegram.ui.Components.j80 j80Var = this.n;
        j80Var.setTextColor(x02);
        j80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.gz0 gz0Var = this.d;
            if (i7 >= gz0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) gz0Var.getChildAt(i7);
            textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
            i7++;
        }
        int i10 = org.telegram.ui.ActionBar.n6.H6;
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        de0.u1(imageView, x03, i11, mode);
        this.w = x03;
        int themedColor = this.h0.getThemedColor(org.telegram.ui.ActionBar.n6.i6);
        de0.v1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        ae0 ae0Var = this.a;
        ae0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.n6.l6;
        ae0Var.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.k6, false));
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        ae0 ae0Var2 = this.b;
        ae0Var2.setTextColor(x05);
        ae0Var2.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        ae0Var2.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        org.telegram.ui.Cells.d2 d2Var = this.y;
        if (d2Var != null) {
            int i14 = org.telegram.ui.ActionBar.n6.Y6;
            int i15 = org.telegram.ui.ActionBar.n6.W6;
            int i16 = org.telegram.ui.ActionBar.n6.X6;
            CheckBoxSquare checkBoxSquare = d2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i14;
                checkBoxSquare.w = i15;
                checkBoxSquare.x = i16;
                checkBoxSquare.invalidate();
            }
            d2Var.g();
        }
        org.telegram.ui.Cells.d2 d2Var2 = this.E;
        if (d2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.n6.Y6;
            int i18 = org.telegram.ui.ActionBar.n6.W6;
            int i19 = org.telegram.ui.ActionBar.n6.X6;
            CheckBoxSquare checkBoxSquare2 = d2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i17;
                checkBoxSquare2.w = i18;
                checkBoxSquare2.x = i19;
                checkBoxSquare2.invalidate();
            }
            d2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
