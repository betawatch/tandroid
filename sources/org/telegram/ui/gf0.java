package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gf0 extends org.telegram.ui.Components.zu0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.us {
    public final org.telegram.ui.Cells.c2 D;
    public int E;
    public nt F;
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
    public org.telegram.messenger.al W;
    public final ef0 a;
    public final /* synthetic */ hf0 a0;
    public final ef0 b;
    public final TextView c;
    public final org.telegram.ui.Components.a01 d;
    public final org.telegram.ui.Components.ec0 e;
    public final org.telegram.ui.Components.ec0 f;
    public final TextView h;
    public final org.telegram.ui.Components.p80 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final org.telegram.ui.Cells.c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(hf0 hf0Var, Context context) {
        super(context);
        int i10;
        this.a0 = hf0Var;
        final int i11 = 0;
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
        this.U = false;
        this.V = false;
        final int i12 = 1;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        sc.e.t(textView, 1, 18.0f);
        final int i13 = 2;
        textView.setText(org.telegram.messenger.cd.L0(hf0Var.F == 2 ? 2131752538 : 2131742831, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView, w7.b6.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new wu(21, this, context));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.n = p80Var;
        p80Var.setText(org.telegram.messenger.cd.L0(hf0Var.F == 2 ? 2131752539 : 2131744925, null));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(p80Var, w7.b6.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.a01 a01Var = new org.telegram.ui.Components.a01(context);
        this.d = a01Var;
        a01Var.setFactory(new df0(context, i11));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.vs.e);
        a01Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(a01Var, w7.b6.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
        this.e = ec0Var;
        ec0Var.setText(org.telegram.messenger.cd.L0(2131751754, null));
        ec0Var.addView(linearLayout, w7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        ec0Var.setForceUseCenter(true);
        ec0Var.setFocusable(true);
        ec0Var.setContentDescription(org.telegram.messenger.cd.L0(2131751754, null));
        ec0Var.setOnFocusChangeListener(new od(this, 9));
        addView(ec0Var, w7.b6.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        ec0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ze0
            public final /* synthetic */ gf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                String str;
                int i14;
                int i15;
                int i16 = i13;
                gf0 gf0Var = this.b;
                switch (i16) {
                    case 0:
                        hf0 hf0Var2 = gf0Var.a0;
                        if (hf0Var2.getParentActivity() != null) {
                            boolean z10 = !hf0Var2.D;
                            hf0Var2.D = z10;
                            ((org.telegram.ui.Cells.c2) view).c(z10, true);
                            if (hf0Var2.D) {
                                ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                str = "SyncContactsOn";
                                i14 = 2131744316;
                                i15 = R.raw.contacts_sync_on;
                            } else {
                                ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                str = "SyncContactsOff";
                                i14 = 2131744317;
                                i15 = R.raw.contacts_sync_off;
                            }
                            org.telegram.messenger.m5.n(str, i14, ccVar, i15, 36);
                            break;
                        }
                        break;
                    case 1:
                        hf0 hf0Var3 = gf0Var.a0;
                        if (hf0Var3.getParentActivity() != null) {
                            boolean z11 = !hf0Var3.E;
                            hf0Var3.E = z11;
                            ((org.telegram.ui.Cells.c2) view).c(z11, true);
                            if (hf0Var3.getConnectionsManager().isTestBackend() != hf0Var3.E) {
                                hf0Var3.getConnectionsManager().switchBackend(false);
                            }
                            gf0Var.q();
                            break;
                        }
                        break;
                    default:
                        rt rtVar = new rt(gf0Var.G, true);
                        rtVar.r = new tt(gf0Var, 21);
                        gf0Var.a0.presentFragment(rtVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
        this.f = ec0Var2;
        ec0Var2.addView(linearLayout2, w7.b6.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        ec0Var2.setText(org.telegram.messenger.cd.L0(2131747306, null));
        addView(ec0Var2, w7.b6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.b6.o(-2, -2));
        ef0 ef0Var = new ef0(this, context, i11);
        this.a = ef0Var;
        ef0Var.setInputType(3);
        ef0Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        ef0Var.setCursorWidth(1.5f);
        ef0Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, 0, 0);
        ef0Var.setTextSize(1, 16.0f);
        ef0Var.setMaxLines(1);
        ef0Var.setGravity(19);
        ef0Var.setImeOptions(268435461);
        ef0Var.setBackground(null);
        ef0Var.setShowSoftInputOnFocus(org.telegram.messenger.i0.C1());
        ef0Var.setContentDescription(org.telegram.messenger.cd.L0(2131748751, null));
        linearLayout2.addView(ef0Var, w7.b6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ef0Var.addTextChangedListener(new n0(this, 12));
        ef0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ye0
            public final /* synthetic */ gf0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        gf0 gf0Var = this.b;
                        if (i14 != 5) {
                            gf0Var.getClass();
                            return false;
                        }
                        we0 we0Var = gf0Var.a0.b0;
                        if (we0Var != null) {
                            we0Var.h.callOnClick();
                            return true;
                        }
                        gf0Var.h(null);
                        return true;
                    default:
                        ef0 ef0Var2 = this.b.b;
                        if (i14 != 5) {
                            return false;
                        }
                        ef0Var2.requestFocus();
                        ef0Var2.setSelection(ef0Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = w7.b6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.i0.L(0.5f));
        linearLayout2.addView(view, k10);
        ef0 ef0Var2 = new ef0(this, context, i12);
        this.b = ef0Var2;
        ef0Var2.setInputType(3);
        ef0Var2.setPadding(0, 0, 0, 0);
        ef0Var2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        ef0Var2.setCursorWidth(1.5f);
        ef0Var2.setTextSize(1, 16.0f);
        ef0Var2.setMaxLines(1);
        ef0Var2.setGravity(19);
        ef0Var2.setImeOptions(268435461);
        ef0Var2.setBackground(null);
        ef0Var2.setShowSoftInputOnFocus(org.telegram.messenger.i0.C1());
        ef0Var2.setContentDescription(org.telegram.messenger.cd.L0(2131747306, null));
        linearLayout2.addView(ef0Var2, w7.b6.c(36.0f, -1));
        ef0Var2.addTextChangedListener(new yr(this, i12));
        ef0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ye0
            public final /* synthetic */ gf0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        gf0 gf0Var = this.b;
                        if (i14 != 5) {
                            gf0Var.getClass();
                            return false;
                        }
                        we0 we0Var = gf0Var.a0.b0;
                        if (we0Var != null) {
                            we0Var.h.callOnClick();
                            return true;
                        }
                        gf0Var.h(null);
                        return true;
                    default:
                        ef0 ef0Var22 = this.b.b;
                        if (i14 != 5) {
                            return false;
                        }
                        ef0Var22.requestFocus();
                        ef0Var22.setSelection(ef0Var22.length());
                        return true;
                }
            }
        });
        if (hf0Var.y && hf0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 2);
            this.y = c2Var;
            c2Var.e(org.telegram.messenger.cd.L0(2131744324, "SyncContacts"), "", hf0Var.D, false, false);
            addView(c2Var, w7.b6.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.cd.X && org.telegram.messenger.i0.O1()) ? 56 : 0), 0));
            c2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ze0
                public final /* synthetic */ gf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.cc ccVar;
                    String str;
                    int i14;
                    int i15;
                    int i16 = i11;
                    gf0 gf0Var = this.b;
                    switch (i16) {
                        case 0:
                            hf0 hf0Var2 = gf0Var.a0;
                            if (hf0Var2.getParentActivity() != null) {
                                boolean z10 = !hf0Var2.D;
                                hf0Var2.D = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (hf0Var2.D) {
                                    ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i14 = 2131744316;
                                    i15 = R.raw.contacts_sync_on;
                                } else {
                                    ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i14 = 2131744317;
                                    i15 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.m5.n(str, i14, ccVar, i15, 36);
                                break;
                            }
                            break;
                        case 1:
                            hf0 hf0Var3 = gf0Var.a0;
                            if (hf0Var3.getParentActivity() != null) {
                                boolean z11 = !hf0Var3.E;
                                hf0Var3.E = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (hf0Var3.getConnectionsManager().isTestBackend() != hf0Var3.E) {
                                    hf0Var3.getConnectionsManager().switchBackend(false);
                                }
                                gf0Var.q();
                                break;
                            }
                            break;
                        default:
                            rt rtVar = new rt(gf0Var.G, true);
                            rtVar.r = new tt(gf0Var, 21);
                            gf0Var.a0.presentFragment(rtVar);
                            break;
                    }
                }
            });
            i10 = 48;
        } else {
            i10 = 72;
        }
        boolean z10 = org.telegram.messenger.v2.a;
        if (hf0Var.F == 0) {
            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 2);
            this.D = c2Var2;
            String L0 = org.telegram.messenger.cd.L0(2131751607, null);
            boolean isTestBackend = hf0Var.getConnectionsManager().isTestBackend();
            hf0Var.E = isTestBackend;
            c2Var2.e(L0, "", isTestBackend, false, false);
            addView(c2Var2, w7.b6.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.cd.X && org.telegram.messenger.i0.O1()) ? 56 : 0), 0));
            i10 -= 24;
            c2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ze0
                public final /* synthetic */ gf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.cc ccVar;
                    String str;
                    int i14;
                    int i15;
                    int i16 = i12;
                    gf0 gf0Var = this.b;
                    switch (i16) {
                        case 0:
                            hf0 hf0Var2 = gf0Var.a0;
                            if (hf0Var2.getParentActivity() != null) {
                                boolean z102 = !hf0Var2.D;
                                hf0Var2.D = z102;
                                ((org.telegram.ui.Cells.c2) view2).c(z102, true);
                                if (hf0Var2.D) {
                                    ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                    str = "SyncContactsOn";
                                    i14 = 2131744316;
                                    i15 = R.raw.contacts_sync_on;
                                } else {
                                    ccVar = new org.telegram.ui.Components.cc(hf0Var2.Z, null);
                                    str = "SyncContactsOff";
                                    i14 = 2131744317;
                                    i15 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.m5.n(str, i14, ccVar, i15, 36);
                                break;
                            }
                            break;
                        case 1:
                            hf0 hf0Var3 = gf0Var.a0;
                            if (hf0Var3.getParentActivity() != null) {
                                boolean z11 = !hf0Var3.E;
                                hf0Var3.E = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (hf0Var3.getConnectionsManager().isTestBackend() != hf0Var3.E) {
                                    hf0Var3.getConnectionsManager().switchBackend(false);
                                }
                                gf0Var.q();
                                break;
                            }
                            break;
                        default:
                            rt rtVar = new rt(gf0Var.G, true);
                            rtVar.r = new tt(gf0Var, 21);
                            gf0Var.a0.presentFragment(rtVar);
                            break;
                    }
                }
            });
        }
        if (i10 > 0 && !org.telegram.messenger.i0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.i0.L(i10));
            addView(space, w7.b6.o(-2, -2));
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
                nt ntVar = new nt();
                ntVar.a = split[2];
                String str = split[0];
                ntVar.c = str;
                ntVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.cd.i0(2131750530, ntVar.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(ntVar.d, i02)) {
                        ntVar.b = ntVar.a;
                        ntVar.a = i02;
                    }
                }
                this.G.add(0, ntVar);
                List list = (List) this.H.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.H;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ntVar);
                if (split.length > 3) {
                    this.I.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        Collections.sort(this.G, Comparator$-CC.comparing(new k2.f(12)));
        try {
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        ConnectionsManager.getInstance(hf0Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new org.telegram.ui.Components.t20(24, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.E = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            ef0 ef0Var3 = this.b;
            ef0Var3.setSelection(ef0Var3.length());
        } else {
            this.a.requestFocus();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(org.telegram.messenger.w0.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.vs.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.ec0 ec0Var = this.e;
        float f7 = charSequence != null ? 1.0f : 0.0f;
        ec0Var.b(f7, f7, true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.M = false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void f() {
        org.telegram.messenger.al alVar = this.W;
        if (alVar != null) {
            alVar.run();
            this.W = null;
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131742821, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i11;
        if (this.a0.getParentActivity() == null || this.M || this.a0.p0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone");
        boolean z15 = org.telegram.messenger.v2.a;
        org.telegram.messenger.f8.b("sim status = " + telephonyManager.getSimState());
        int i12 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            hf0.a1(this.a0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i13 = 1;
        if (!this.N) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y && !this.a0.p1() && this.a0.S.Q() > org.telegram.messenger.i0.L(20.0f)) {
                hf0 hf0Var = this.a0;
                hf0Var.T = new xe0(this, i13);
                org.telegram.messenger.i0.v1(hf0Var.fragmentView);
                return;
            }
            hf0 hf0Var2 = this.a0;
            Context context = this.a0.fragmentView.getContext();
            hf0 hf0Var3 = this.a0;
            hf0Var2.b0 = new we0(context, (ViewGroup) hf0Var3.fragmentView, hf0Var3.N, str2, new e(this, 21));
            we0 we0Var = this.a0.b0;
            we0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new ve0(we0Var, i12));
            duration.addUpdateListener(new te0(we0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.gr.f);
            duration.start();
            return;
        }
        this.N = false;
        we0 we0Var2 = this.a0.b0;
        if (we0Var2 != null) {
            int i14 = we0.F;
            we0Var2.a();
        }
        boolean N1 = org.telegram.messenger.i0.N1();
        int i15 = Build.VERSION.SDK_INT;
        if (N1) {
            z12 = this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.a0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i15 < 28 || this.a0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z16 = i15 < 26 || this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            hf0 hf0Var4 = this.a0;
            z10 = N1;
            if (hf0Var4.w) {
                hf0Var4.r.clear();
                if (!z12) {
                    this.a0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.a0.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.a0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z16 && i15 >= 26) {
                    this.a0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.a0.r.isEmpty()) {
                    SharedPreferences d12 = org.telegram.messenger.vp.d1();
                    if (!d12.getBoolean("firstlogin", true) && !this.a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.a0.getParentActivity().requestPermissions((String[]) this.a0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    d12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a0.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
                    int i16 = R.raw.calls_log;
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131754274, "AllowReadCallAndLog");
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131754275, "AllowReadCall");
                        i16 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131754273, "AllowReadCallLog");
                    }
                    int i17 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(i16, 46, org.telegram.ui.ActionBar.t6.x0(null, i17, false), null);
                    alertDialog$Builder.n(i17, null);
                    hf0 hf0Var5 = this.a0;
                    hf0Var5.h = hf0Var5.showDialog(alertDialog$Builder.a);
                    this.N = true;
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
        if (this.E == z11) {
            this.a0.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752134, "ChooseCountry"));
            this.a0.s1(false, z11);
            return;
        }
        String str3 = "";
        String d = af.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        hf0 hf0Var6 = this.a0;
        if (hf0Var6.F == 0 && (hf0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i18 = 0; i18 < 4; i18++) {
                org.telegram.messenger.d20 i19 = org.telegram.messenger.d20.i(i18);
                if (i19.p() && PhoneNumberUtils.compare(d, i19.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i18).isTestBackend();
                    hf0 hf0Var7 = this.a0;
                    if (isTestBackend == hf0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hf0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.cd.L0(2131754709, "AccountAlreadyLoggedIn");
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754694, "AccountSwitch"), new i2.q(this, i18, 15));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, "OK"), null);
                        this.a0.showDialog(alertDialog$Builder2.a);
                        this.a0.s1(false, true);
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = null;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z10 && z12 && z13 && z14;
        tL_codeSettings.allow_missed_call = z10 && z12;
        boolean hasServices = org.telegram.messenger.eu.b.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.a0.l0 || TextUtils.isEmpty(org.telegram.messenger.v2.f)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList b10 = org.telegram.messenger.y0.b();
        if (b10 != null) {
            for (int i20 = 0; i20 < b10.size(); i20++) {
                if (((TLRPC.TL_auth_authorization) b10.get(i20)).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    boolean z17 = org.telegram.messenger.v2.a;
                    org.telegram.messenger.f8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i20)).future_auth_token, StandardCharsets.UTF_8)));
                    tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i20)).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("saved_tokens", 0);
        int i21 = sharedPreferences.getInt("count", 0);
        if (i21 != 0) {
            arrayList = new ArrayList();
            int i22 = 0;
            while (i22 < i21) {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i22, str3)));
                String str4 = str3;
                TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(TLdeserialize);
                }
                i22++;
                sharedPreferences = sharedPreferences2;
                str3 = str4;
            }
        }
        if (arrayList != null) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i23)).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            SharedPreferences sharedPreferences3 = org.telegram.messenger.w0.b.getSharedPreferences("saved_tokens", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences3.edit().clear().apply();
            System.currentTimeMillis();
            for (int i24 = 0; i24 < Math.min(20, arrayList.size()); i24++) {
                arrayList2.add((TLRPC.TL_auth_loggedOut) arrayList.get(i24));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putInt("count", arrayList2.size());
                for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                    SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i25)).getObjectSize());
                    ((TLRPC.TL_auth_loggedOut) arrayList2.get(i25)).serializeToStream(serializedData2);
                    edit.putString("log_out_token_" + i25, Utilities.f(serializedData2.toByteArray()));
                }
                edit.apply();
            }
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences4 = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
        sharedPreferences4.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            SharedPreferences.Editor edit2 = sharedPreferences4.edit();
            org.telegram.messenger.w0.u();
            edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
        } else {
            sharedPreferences4.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet b12 = hf0.b1(this.a0);
                if (b12.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (org.telegram.messenger.d20.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(b12).anyMatch(new g70(d, 1));
                }
            } catch (Exception e7) {
                tL_codeSettings.unknown_number = true;
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        hf0 hf0Var8 = this.a0;
        if (hf0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var8).currentAccount;
            ConnectionsManager.getInstance(i10).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = org.telegram.messenger.v2.e;
            tL_auth_sendCode2.api_id = org.telegram.messenger.v2.d;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + af.b.d(this.a.getText().toString(), false) + " " + af.b.d(this.b.getText().toString(), false));
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        nt ntVar = this.F;
        if (ntVar != null) {
            bundle.putString("country", ntVar.c);
        }
        this.M = true;
        li.k kVar = new li.k(24, false);
        kVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        kVar.b = this.F;
        kVar.c = (List) this.I.get(this.a.getText().toString());
        i11 = ((org.telegram.ui.ActionBar.k2) this.a0).currentAccount;
        this.a0.v1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new mg.z(this, bundle, d, kVar, tL_auth_sendCode3, 10), 27), true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        o();
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            c2Var.c(this.a0.D, false);
        }
        org.telegram.messenger.i0.h3(new xe0(this, 0), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
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

    public final void o() {
        boolean z10;
        hf0 hf0Var;
        boolean z11;
        nt ntVar;
        if (this.T || this.a0.F != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone");
            if (org.telegram.messenger.i0.N1()) {
                int i10 = Build.VERSION.SDK_INT;
                boolean z12 = this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i10 >= 26 && this.a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z10 = false;
                    hf0Var = this.a0;
                    if (!hf0Var.x && (!z12 || !z10)) {
                        hf0Var.s.clear();
                        if (!z12) {
                            this.a0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z10 && i10 >= 26) {
                            this.a0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.a0.s.isEmpty()) {
                            return;
                        }
                        new f70(28, this, new ArrayList(this.a0.s)).run();
                        return;
                    }
                    this.T = true;
                    if (hf0Var.y && z12 && z10) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = af.b.d(telephonyManager.getLine1Number(), false);
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
                                    List list = (List) this.H.get(substring);
                                    if (list == null) {
                                        ntVar = null;
                                    } else if (list.size() > 1) {
                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                        ntVar = (nt) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.G;
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                nt ntVar2 = (nt) obj;
                                                if (Objects.equals(ntVar2.d, string)) {
                                                    ntVar = ntVar2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        ntVar = (nt) list.get(0);
                                    }
                                    if (ntVar != null) {
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
                                ef0 ef0Var = this.b;
                                ef0Var.setSelection(ef0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        ef0 ef0Var2 = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(ef0Var2, (Property<ef0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<ef0, Float>) property, 1.0f));
                        duration.start();
                        this.N = true;
                        return;
                    }
                    return;
                }
                z10 = true;
                hf0Var = this.a0;
                if (!hf0Var.x) {
                }
                this.T = true;
                if (hf0Var.y) {
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.J) {
            this.J = false;
            return;
        }
        this.K = true;
        this.a.setText(((nt) this.G.get(i10)).c);
        this.K = false;
    }

    public final void p() {
        int i10;
        String str = this.R;
        ef0 ef0Var = this.b;
        String replace = ef0Var.getText() != null ? ef0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.I;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.S != -1) {
                int selectionStart = ef0Var.getSelectionStart();
                int selectionEnd = ef0Var.getSelectionEnd();
                ef0Var.setHintText((String) null);
                ef0Var.setSelection(selectionStart, selectionEnd);
                this.S = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i10 = 0;
            while (i10 < list.size()) {
                if (replace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = 0;
            }
        }
        if (this.S != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = ef0Var.getSelectionStart();
            int selectionEnd2 = ef0Var.getSelectionEnd();
            ef0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ef0Var.setSelection(Math.max(0, Math.min(ef0Var.length(), selectionStart2)), Math.max(0, Math.min(ef0Var.length(), selectionEnd2)));
            this.S = i10;
        }
    }

    public final void q() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = org.telegram.messenger.cd.D0().B != null ? org.telegram.messenger.cd.D0().B.c() : Locale.getDefault().getCountry();
        this.a0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new bf0(this, 0), 10);
    }

    public final void r(final boolean z10) {
        boolean z11;
        final int i10;
        org.telegram.messenger.al alVar;
        hf0 hf0Var = this.a0;
        if (hf0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.v2.i) && !this.V) {
            if (z10 || !this.U) {
                this.V = true;
                this.U = true;
                final Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                final af0 af0Var = new af0(this, 0);
                if (z11) {
                    kotlin.jvm.internal.i.e(context, "context");
                    final q2.b bVar = new q2.b(context, 1);
                    final boolean[] zArr = new boolean[1];
                    final Runnable[] runnableArr = new Runnable[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.v2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.v2.e;
                    runnableArr[0] = new org.telegram.messenger.td(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(initpasskeylogin, new a3.b(1), new org.telegram.messenger.j20() { // from class: org.telegram.messenger.vt
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            au.a(zArr, af0Var, z10, bVar, context, i10, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 1);
                    alVar = new org.telegram.messenger.al(zArr, runnableArr, 1);
                } else {
                    alVar = null;
                }
                this.W = alVar;
            }
        }
    }

    public final void s(String str, nt ntVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = org.telegram.messenger.cd.E0(ntVar.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(4), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ntVar.a);
        setCountryButtonText(org.telegram.messenger.k6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.R = str;
        this.S = -1;
        p();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.n;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.a01 a01Var = this.d;
            if (i10 >= a01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) a01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.t6.H6;
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        hf0.k1(imageView, x03, i12, mode);
        this.w = x03;
        int themedColor = this.a0.getThemedColor(org.telegram.ui.ActionBar.t6.i6);
        hf0.l1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        ef0 ef0Var = this.a;
        ef0Var.setTextColor(x04);
        int i14 = org.telegram.ui.ActionBar.t6.l6;
        ef0Var.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k6, false));
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        ef0 ef0Var2 = this.b;
        ef0Var2.setTextColor(x05);
        ef0Var2.setHintTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        ef0Var2.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            int i15 = org.telegram.ui.ActionBar.t6.Y6;
            int i16 = org.telegram.ui.ActionBar.t6.W6;
            int i17 = org.telegram.ui.ActionBar.t6.X6;
            CheckBoxSquare checkBoxSquare = c2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i15;
                checkBoxSquare.w = i16;
                checkBoxSquare.x = i17;
                checkBoxSquare.invalidate();
            }
            c2Var.g();
        }
        org.telegram.ui.Cells.c2 c2Var2 = this.D;
        if (c2Var2 != null) {
            int i18 = org.telegram.ui.ActionBar.t6.Y6;
            int i19 = org.telegram.ui.ActionBar.t6.W6;
            int i20 = org.telegram.ui.ActionBar.t6.X6;
            CheckBoxSquare checkBoxSquare2 = c2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i18;
                checkBoxSquare2.w = i19;
                checkBoxSquare2.x = i20;
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
