package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o71 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public String E;
    public qv0 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.j6 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.Cells.y8 d;
    public org.telegram.ui.Cells.y8 e;
    public org.telegram.ui.Cells.z9 f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.y8 n;
    public org.telegram.ui.ActionBar.s1 r;
    public org.telegram.ui.Cells.n4 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public o71(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(null);
        this.J = j6Var;
        this.K = g6Var;
        this.L = g6Var != null ? g6Var.r : j6Var.G;
        this.currentAccount = g6Var != null ? g6Var.t : j6Var.F;
        this.I = z10;
    }

    public static void a0(o71 o71Var, TLRPC.TL_theme tL_theme) {
        try {
            o71Var.r.dismiss();
            o71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.k6.I1(o71Var.J, o71Var.K, tL_theme, o71Var.currentAccount, false);
        o71Var.finishFragment();
    }

    public static void b0(o71 o71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            o71Var.r.dismiss();
            o71Var.r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.e0(o71Var.currentAccount, tL_error, o71Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void c0(o71 o71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        o71Var.y = ConnectionsManager.getInstance(o71Var.currentAccount).sendRequest(createtheme, new m21(4, o71Var, str), 2);
    }

    public static void d0(o71 o71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = o71Var.J;
        TLRPC.TL_theme tL_theme = o71Var.L;
        if (o71Var.e0(o71Var.a.getText().toString(), true) && o71Var.getParentActivity() != null) {
            if (o71Var.b.length() == 0) {
                org.telegram.ui.Components.t4.t0(o71Var, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744187, null), null);
                return;
            }
            if (o71Var.I) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, o71Var.getParentActivity(), null);
                o71Var.r = s1Var;
                s1Var.setOnCancelListener(new n71());
                o71Var.r.show();
                String obj = o71Var.b.getText().toString();
                tL_theme.title = obj;
                j6Var.a = obj;
                j6Var.G.slug = o71Var.a.getText().toString();
                org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = o71Var.a.getText().toString();
            String obj3 = o71Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                o71Var.finishFragment();
                return;
            }
            o71Var.r = new org.telegram.ui.ActionBar.s1(3, o71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i3 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i3 | 3;
            int sendRequest = ConnectionsManager.getInstance(o71Var.currentAccount).sendRequest(updatetheme, new m21(5, o71Var, updatetheme), 2);
            ConnectionsManager.getInstance(o71Var.currentAccount).bindRequestToGuid(sendRequest, o71Var.classGuid);
            o71Var.r.setOnCancelListener(new ci.b0(o71Var, sendRequest, 8));
            o71Var.r.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i3 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748260, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 15));
        this.c = this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new fi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i10, linearLayout4, null);
        linearLayout2.addView(this.x, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.s = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131749205, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i12, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        final int i13 = 0;
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.bd.M0(2131744186, null));
        org.telegram.ui.ActionBar.r6.w(this.b, i12, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, b8.mf.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.m71
            public final /* synthetic */ o71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i13) {
                    case 0:
                        o71 o71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(o71Var.b);
                            return true;
                        }
                        o71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (q0Var = this.b.c) == null) {
                            return false;
                        }
                        q0Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new org.telegram.ui.Components.sm(context, 27), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, b8.mf.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().V2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.w, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.w, i12, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, b8.mf.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.a, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.a, i12, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(org.telegram.messenger.bd.M0(2131745511, null));
        org.telegram.ui.ActionBar.r6.w(this.a, i12, null);
        this.a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, b8.mf.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.m71
            public final /* synthetic */ o71 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i3) {
                    case 0:
                        o71 o71Var = this.b;
                        if (i14 == 6) {
                            org.telegram.messenger.g0.v1(o71Var.b);
                            return true;
                        }
                        o71Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (q0Var = this.b.c) == null) {
                            return false;
                        }
                        q0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new n0(this, 16));
        if (z10) {
            this.a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.e = y8Var;
        int i14 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_bottom, i14);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
        this.d = y8Var2;
        y8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.r6.D(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744195, null)));
        } else {
            org.telegram.ui.Cells.y8 y8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744154, null));
            this.H = X2;
            y8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, b8.mf.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, R.drawable.greydivider, i14);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f = z9Var;
            linearLayout2.addView(z9Var, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.h = v9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            v9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.bd.M0(2131743809, null), false);
            linearLayout2.addView(this.h, b8.mf.o(-1, -2));
            this.h.setOnClickListener(new hb0(20, this, context));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.n = y8Var4;
            y8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743808, null)));
            org.telegram.ui.ActionBar.r6.a0(this.n, context, R.drawable.greydivider_bottom, i14);
            linearLayout2.addView(this.n, b8.mf.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, R.drawable.greydivider_bottom, i14);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.s1 s1Var;
        org.telegram.ui.ActionBar.s1 s1Var2;
        int i11 = org.telegram.messenger.hs.M2;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        org.telegram.ui.ActionBar.j6 j6Var = this.J;
        if (i3 == i11) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (j6Var2 == j6Var && g6Var2 == g6Var && (s1Var2 = this.r) != null) {
                try {
                    s1Var2.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (j6Var3 == j6Var && g6Var3 == g6Var && (s1Var = this.r) != null) {
                try {
                    s1Var.dismiss();
                    this.r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        String str2;
        qv0 qv0Var = this.F;
        if (qv0Var != null) {
            org.telegram.messenger.g0.r(qv0Var);
            this.F = null;
            this.E = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745515, null));
                return false;
            }
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745512, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745512, null));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745515, null), null);
                        return false;
                    }
                    f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745515, null));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745513, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745513, null));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131745514, null), null);
                return false;
            }
            f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745514, null));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.L;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                f0(org.telegram.ui.ActionBar.k6.w6, org.telegram.messenger.bd.a0("SetUrlAvailable", null, 2131745518, str));
                return true;
            }
            f0(org.telegram.ui.ActionBar.k6.F6, org.telegram.messenger.bd.M0(2131745517, null));
            this.E = str;
            qv0 qv0Var2 = new qv0(20, this, str);
            this.F = qv0Var2;
            org.telegram.messenger.g0.i3(qv0Var2, 300L);
        }
        return true;
    }

    public final void f0(int i3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i3));
        this.e.setTextColorByKey(i3);
        if (z10) {
            org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bc));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.N2);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.N2);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.hp.e1().getBoolean("view_animations", true) && this.I) {
            this.a.requestFocus();
            org.telegram.messenger.g0.K3(this.a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.I) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.g0.K3(this.a);
    }
}
