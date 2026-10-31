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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public String D;
    public t11 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.s6 I;
    public final org.telegram.ui.ActionBar.r6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.t0 c;
    public org.telegram.ui.Cells.b9 d;
    public org.telegram.ui.Cells.b9 e;
    public org.telegram.ui.Cells.z9 f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.b9 n;
    public org.telegram.ui.ActionBar.x1 r;
    public org.telegram.ui.Cells.p4 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public p91(org.telegram.ui.ActionBar.s6 s6Var, org.telegram.ui.ActionBar.r6 r6Var, boolean z10) {
        super(null);
        this.I = s6Var;
        this.J = r6Var;
        this.K = r6Var != null ? r6Var.r : s6Var.F;
        this.currentAccount = r6Var != null ? r6Var.t : s6Var.E;
        this.H = z10;
    }

    public static void Z(p91 p91Var, TLRPC.TL_theme tL_theme) {
        try {
            p91Var.r.dismiss();
            p91Var.r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.ActionBar.t6.I1(p91Var.I, p91Var.J, tL_theme, p91Var.currentAccount, false);
        p91Var.finishFragment();
    }

    public static void a0(p91 p91Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            p91Var.r.dismiss();
            p91Var.r = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Components.s4.e0(p91Var.currentAccount, tL_error, p91Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void b0(p91 p91Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        p91Var.y = ConnectionsManager.getInstance(p91Var.currentAccount).sendRequest(createtheme, new ul0(15, p91Var, str), 2);
    }

    public static void c0(p91 p91Var) {
        org.telegram.ui.ActionBar.s6 s6Var = p91Var.I;
        TLRPC.TL_theme tL_theme = p91Var.K;
        if (p91Var.d0(p91Var.a.getText().toString(), true) && p91Var.getParentActivity() != null) {
            if (p91Var.b.length() == 0) {
                org.telegram.ui.Components.s4.t0(p91Var, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131744202, null), null);
                return;
            }
            if (p91Var.H) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, p91Var.getParentActivity(), null);
                p91Var.r = x1Var;
                x1Var.setOnCancelListener(new o91());
                p91Var.r.show();
                String obj = p91Var.b.getText().toString();
                tL_theme.title = obj;
                s6Var.a = obj;
                s6Var.F.slug = p91Var.a.getText().toString();
                org.telegram.ui.ActionBar.t6.x1(s6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = p91Var.a.getText().toString();
            String obj3 = p91Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                p91Var.finishFragment();
                return;
            }
            p91Var.r = new org.telegram.ui.ActionBar.x1(3, p91Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(p91Var.currentAccount).sendRequest(updatetheme, new ul0(16, p91Var, updatetheme), 2);
            ConnectionsManager.getInstance(p91Var.currentAccount).bindRequestToGuid(sendRequest, p91Var.classGuid);
            p91Var.r.setOnCancelListener(new ba(p91Var, sendRequest, 8));
            p91Var.r.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.H;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748269, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 5));
        this.c = this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i10));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i11, linearLayout4, null);
        linearLayout2.addView(this.x, w7.b6.o(-1, -2));
        int i12 = 23;
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.s = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131749206, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i13 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i14, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        final int i15 = 0;
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.cd.L0(2131744201, null));
        org.telegram.ui.ActionBar.a7.w(this.b, i14, null);
        this.b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.n91
            public final /* synthetic */ p91 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (i15) {
                    case 0:
                        p91 p91Var = this.b;
                        if (i16 == 6) {
                            org.telegram.messenger.i0.v1(p91Var.b);
                            return true;
                        }
                        p91Var.getClass();
                        return false;
                    default:
                        if (i16 != 6 || (t0Var = this.b.c) == null) {
                            return false;
                        }
                        t0Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new org.telegram.ui.Components.bn(context, i12), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, w7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().U2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.w, i13, null);
        org.telegram.ui.ActionBar.a7.V(this.w, i14, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, w7.b6.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.a, i13, null);
        org.telegram.ui.ActionBar.a7.V(this.a, i14, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(org.telegram.messenger.cd.L0(2131745518, null));
        org.telegram.ui.ActionBar.a7.w(this.a, i14, null);
        this.a.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, w7.b6.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.n91
            public final /* synthetic */ p91 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (i10) {
                    case 0:
                        p91 p91Var = this.b;
                        if (i16 == 6) {
                            org.telegram.messenger.i0.v1(p91Var.b);
                            return true;
                        }
                        p91Var.getClass();
                        return false;
                    default:
                        if (i16 != 6 || (t0Var = this.b.c) == null) {
                            return false;
                        }
                        t0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new n0(this, 16));
        if (z10) {
            this.a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.e = b9Var;
        int i16 = org.telegram.ui.ActionBar.t6.b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, R.drawable.greydivider_bottom, i16);
        int i17 = 8;
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.d = b9Var2;
        b9Var2.getTextView().setMovementMethod(new org.telegram.messenger.e0(3));
        org.telegram.ui.ActionBar.a7.D(this.d.getTextView(), org.telegram.ui.ActionBar.t6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744210, null)));
        } else {
            org.telegram.ui.Cells.b9 b9Var3 = this.d;
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744169, null));
            this.G = W2;
            b9Var3.setText(W2);
        }
        linearLayout2.addView(this.d, w7.b6.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, R.drawable.greydivider, i16);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f = z9Var;
            linearLayout2.addView(z9Var, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.cd.L0(2131743825, null), false);
            linearLayout2.addView(this.h, w7.b6.o(-1, -2));
            this.h.setOnClickListener(new rv0(i17, this, context));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.n = b9Var4;
            b9Var4.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743824, null)));
            org.telegram.ui.ActionBar.a7.a0(this.n, context, R.drawable.greydivider_bottom, i16);
            linearLayout2.addView(this.n, w7.b6.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.a7.a0(this.d, context, R.drawable.greydivider_bottom, i16);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    public final boolean d0(String str, boolean z10) {
        String str2;
        t11 t11Var = this.E;
        if (t11Var != null) {
            org.telegram.messenger.i0.r(t11Var);
            this.E = null;
            this.D = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745522, null));
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745519, null), null);
                        return false;
                    }
                    e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745519, null));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745522, null), null);
                        return false;
                    }
                    e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745522, null));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745520, null), null);
                return false;
            }
            e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745520, null));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131744215, null), org.telegram.messenger.cd.L0(2131745521, null), null);
                return false;
            }
            e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745521, null));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.K;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                e0(org.telegram.ui.ActionBar.t6.w6, org.telegram.messenger.cd.a0("SetUrlAvailable", null, 2131745525, str));
                return true;
            }
            e0(org.telegram.ui.ActionBar.t6.F6, org.telegram.messenger.cd.L0(2131745524, null));
            this.D = str;
            t11 t11Var2 = new t11(8, this, str);
            this.E = t11Var2;
            org.telegram.messenger.i0.h3(t11Var2, 300L);
        }
        return true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.x1 x1Var;
        org.telegram.ui.ActionBar.x1 x1Var2;
        int i12 = org.telegram.messenger.zs.M2;
        org.telegram.ui.ActionBar.r6 r6Var = this.J;
        org.telegram.ui.ActionBar.s6 s6Var = this.I;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var2 == s6Var && r6Var2 == r6Var && (x1Var2 = this.r) != null) {
                try {
                    x1Var2.dismiss();
                    this.r = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.ui.ActionBar.t6.u(s6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.N2) {
            org.telegram.ui.ActionBar.s6 s6Var3 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var3 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var3 == s6Var && r6Var3 == r6Var && (x1Var = this.r) != null) {
                try {
                    x1Var.dismiss();
                    this.r = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
        }
    }

    public final void e0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
                return;
            } else {
                org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            org.telegram.ui.ActionBar.a7.a0(this.d, getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.t6.b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bc));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.N2);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.N2);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.vp.d1().getBoolean("view_animations", true) && this.H) {
            this.a.requestFocus();
            org.telegram.messenger.i0.J3(this.a);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.H) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.i0.J3(this.a);
    }
}
