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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public by0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.x6 I;
    public final org.telegram.ui.ActionBar.w6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.w0 c;
    public org.telegram.ui.Cells.i9 d;
    public org.telegram.ui.Cells.i9 e;
    public org.telegram.ui.Cells.ka f;
    public org.telegram.ui.Cells.ga h;
    public org.telegram.ui.Cells.i9 n;
    public org.telegram.ui.ActionBar.e2 r;
    public org.telegram.ui.Cells.q4 s;
    public EditTextBoldCursor v;
    public LinearLayout w;
    public int x;
    public String y;

    public ad1(org.telegram.ui.ActionBar.x6 x6Var, org.telegram.ui.ActionBar.w6 w6Var, boolean z10) {
        super(null);
        this.I = x6Var;
        this.J = w6Var;
        this.K = w6Var != null ? w6Var.r : x6Var.F;
        this.currentAccount = w6Var != null ? w6Var.t : x6Var.E;
        this.H = z10;
    }

    public static /* synthetic */ void W(ad1 ad1Var, TLRPC.TL_theme tL_theme) {
        try {
            ad1Var.r.dismiss();
            ad1Var.r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.y6.F1(ad1Var.I, ad1Var.J, tL_theme, ad1Var.currentAccount, false);
        ad1Var.finishFragment();
    }

    public static /* synthetic */ void X(ad1 ad1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ad1Var.r.dismiss();
            ad1Var.r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.g5.e0(ad1Var.currentAccount, tL_error, ad1Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void Y(ad1 ad1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ad1Var.x = ConnectionsManager.getInstance(ad1Var.currentAccount).sendRequest(createtheme, new n71(4, ad1Var, str), 2);
    }

    public static void Z(ad1 ad1Var) {
        org.telegram.ui.ActionBar.x6 x6Var = ad1Var.I;
        TLRPC.TL_theme tL_theme = ad1Var.K;
        if (ad1Var.a0(ad1Var.a.getText().toString(), true) && ad1Var.getParentActivity() != null) {
            if (ad1Var.b.length() == 0) {
                org.telegram.ui.Components.g5.t0(ad1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            if (ad1Var.H) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ad1Var.getParentActivity(), 3, null);
                ad1Var.r = e2Var;
                e2Var.setOnCancelListener(new xc1());
                ad1Var.r.show();
                String obj = ad1Var.b.getText().toString();
                tL_theme.title = obj;
                x6Var.a = obj;
                x6Var.F.slug = ad1Var.a.getText().toString();
                org.telegram.ui.ActionBar.y6.u1(x6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = ad1Var.a.getText().toString();
            String obj3 = ad1Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                ad1Var.finishFragment();
                return;
            }
            ad1Var.r = new org.telegram.ui.ActionBar.e2(ad1Var.getParentActivity(), 3, null);
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
            int sendRequest = ConnectionsManager.getInstance(ad1Var.currentAccount).sendRequest(updatetheme, new n71(5, ad1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ad1Var.currentAccount).bindRequestToGuid(sendRequest, ad1Var.classGuid);
            ad1Var.r.setOnCancelListener(new bi.f0(ad1Var, sendRequest, 9));
            ad1Var.r.show();
        }
    }

    public final boolean a0(String str, boolean z10) {
        String str2;
        by0 by0Var = this.E;
        if (by0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(by0Var);
            this.E = null;
            this.y = null;
            if (this.x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.K;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                b0(org.telegram.ui.ActionBar.y6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            b0(org.telegram.ui.ActionBar.y6.F6, LocaleController.getString(R.string.SetUrlChecking));
            this.y = str;
            by0 by0Var2 = new by0(29, this, str);
            this.E = by0Var2;
            AndroidUtilities.runOnUIThread(by0Var2, 300L);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void b0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.Cells.i9 i9Var = this.d;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), i9Var, null);
                return;
            } else {
                org.telegram.ui.Cells.i9 i9Var2 = this.d;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), i9Var2, null);
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (!z10) {
            this.d.setBackgroundDrawable(null);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var3 = this.d;
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_top, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), i9Var3, null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.H;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 10));
        this.c = this.actionBar.l().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.w = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.w;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i11, linearLayout4, null);
        linearLayout2.addView(this.w, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
        this.s = q4Var;
        q4Var.setText(LocaleController.getString(R.string.Info));
        this.w.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor3, i13, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        final int i14 = 0;
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        org.telegram.ui.ActionBar.f7.w(this.b, i13, null);
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.w.addView(this.b, org.telegram.ui.Components.kb1.o(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wc1
            public final /* synthetic */ ad1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i15, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i14) {
                    case 0:
                        ad1 ad1Var = this.b;
                        if (i15 == 6) {
                            AndroidUtilities.hideKeyboard(ad1Var.b);
                            return true;
                        }
                        ad1Var.getClass();
                        return false;
                    default:
                        if (i15 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        this.w.addView(new org.telegram.ui.Components.vn(context, 27), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.w.addView(linearLayout5, org.telegram.ui.Components.kb1.o(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.v = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.v.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.v, i12, null);
        org.telegram.ui.ActionBar.f7.V(this.v, i13, null);
        this.v.setMaxLines(1);
        this.v.setLines(1);
        this.v.setEnabled(false);
        this.v.setBackgroundDrawable(null);
        this.v.setPadding(0, 0, 0, 0);
        this.v.setSingleLine(true);
        this.v.setInputType(163840);
        this.v.setImeOptions(6);
        linearLayout5.addView(this.v, org.telegram.ui.Components.kb1.r(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.a, i12, null);
        org.telegram.ui.ActionBar.f7.V(this.a, i13, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        org.telegram.ui.ActionBar.f7.w(this.a, i13, null);
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, org.telegram.ui.Components.kb1.r(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.wc1
            public final /* synthetic */ ad1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i15, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i10) {
                    case 0:
                        ad1 ad1Var = this.b;
                        if (i15 == 6) {
                            AndroidUtilities.hideKeyboard(ad1Var.b);
                            return true;
                        }
                        ad1Var.getClass();
                        return false;
                    default:
                        if (i15 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new zc1(this));
        if (z10) {
            this.a.setOnFocusChangeListener(new rd(this, 11));
        }
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
        this.e = i9Var;
        int i15 = R.drawable.greydivider_bottom;
        int i16 = org.telegram.ui.ActionBar.y6.b7;
        org.telegram.ui.ActionBar.f7.a0(i15, i16, context, i9Var, null);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
        this.d = i9Var2;
        i9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.yv(2));
        org.telegram.ui.ActionBar.f7.D(this.d.getTextView(), org.telegram.ui.ActionBar.y6.K6, null);
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.i9 i9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.G = replaceTags;
            i9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, org.telegram.ui.Components.kb1.r(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i16, context, this.d, null);
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, this.parentLayout, 1);
            this.f = kaVar;
            linearLayout2.addView(kaVar, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            this.h = gaVar;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
            gaVar.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, org.telegram.ui.Components.kb1.r(-1, -2));
            this.h.setOnClickListener(new zd0(20, this, context));
            org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context);
            this.n = i9Var4;
            i9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i16, context, this.n, null);
            linearLayout2.addView(this.n, org.telegram.ui.Components.kb1.r(-1, -2));
        } else {
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i16, context, this.d, null);
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.ActionBar.e2 e2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.w6 w6Var = this.J;
        org.telegram.ui.ActionBar.x6 x6Var = this.I;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) objArr[0];
            org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) objArr[1];
            if (x6Var2 == x6Var && w6Var2 == w6Var && (e2Var2 = this.r) != null) {
                try {
                    e2Var2.dismiss();
                    this.r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.y6.t(x6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.x6 x6Var3 = (org.telegram.ui.ActionBar.x6) objArr[0];
            org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) objArr[1];
            if (x6Var3 == x6Var && w6Var3 == w6Var && (e2Var = this.r) != null) {
                try {
                    e2Var.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.db));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.od));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.H) {
            this.a.requestFocus();
            AndroidUtilities.showKeyboard(this.a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.y6.G6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.H) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }
}
