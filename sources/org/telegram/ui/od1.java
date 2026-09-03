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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public h21 C;
    public boolean D;
    public SpannableStringBuilder E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.j6 G;
    public final org.telegram.ui.ActionBar.i6 H;
    public final TLRPC.TL_theme I;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public org.telegram.ui.ActionBar.w0 c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 e;
    public org.telegram.ui.Cells.ea f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.a9 n;
    public org.telegram.ui.ActionBar.d2 r;
    public org.telegram.ui.Components.in s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public od1(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z4) {
        super(null);
        this.G = j6Var;
        this.H = i6Var;
        this.I = i6Var != null ? i6Var.r : j6Var.C;
        this.currentAccount = i6Var != null ? i6Var.t : j6Var.B;
        this.F = z4;
    }

    public static /* synthetic */ void V(od1 od1Var, TLRPC.TL_theme tL_theme) {
        try {
            od1Var.r.dismiss();
            od1Var.r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.ActionBar.k6.C1(od1Var.G, od1Var.H, tL_theme, od1Var.currentAccount, false);
        od1Var.finishFragment();
    }

    public static /* synthetic */ void W(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            od1Var.r.dismiss();
            od1Var.r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Components.z4.f0(od1Var.currentAccount, tL_error, od1Var, updatetheme, new Object[0]);
    }

    public static /* synthetic */ void X(od1 od1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        od1Var.y = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(createtheme, new tb0(25, od1Var, str), 2);
    }

    public static void Y(od1 od1Var) {
        org.telegram.ui.ActionBar.j6 j6Var = od1Var.G;
        TLRPC.TL_theme tL_theme = od1Var.I;
        if (od1Var.Z(od1Var.a.getText().toString(), true) && od1Var.getParentActivity() != null) {
            if (od1Var.b.length() == 0) {
                org.telegram.ui.Components.z4.u0(od1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            if (od1Var.F) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
                od1Var.r = d2Var;
                d2Var.setOnCancelListener(new md1());
                od1Var.r.show();
                String obj = od1Var.b.getText().toString();
                tL_theme.title = obj;
                j6Var.a = obj;
                j6Var.C.slug = od1Var.a.getText().toString();
                org.telegram.ui.ActionBar.k6.r1(j6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String obj2 = od1Var.a.getText().toString();
            String obj3 = od1Var.b.getText().toString();
            if (str2.equals(obj2) && str4.equals(obj3)) {
                od1Var.finishFragment();
                return;
            }
            od1Var.r = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
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
            int sendRequest = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(updatetheme, new tb0(26, od1Var, updatetheme), 2);
            ConnectionsManager.getInstance(od1Var.currentAccount).bindRequestToGuid(sendRequest, od1Var.classGuid);
            od1Var.r.setOnCancelListener(new mh.v(od1Var, sendRequest, 9));
            od1Var.r.show();
        }
    }

    public final boolean Z(String str, boolean z4) {
        String str2;
        h21 h21Var = this.C;
        if (h21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h21Var);
            this.C = null;
            this.B = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (z4) {
                        org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    if (z4) {
                        org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z4) {
                org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z4) {
                org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z4) {
            TLRPC.TL_theme tL_theme = this.I;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                a0(org.telegram.ui.ActionBar.k6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            a0(org.telegram.ui.ActionBar.k6.F6, LocaleController.getString(R.string.SetUrlChecking));
            this.B = str;
            h21 h21Var2 = new h21(18, this, str);
            this.C = h21Var2;
            AndroidUtilities.runOnUIThread(h21Var2, 300L);
        }
        return true;
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z4 = this.F;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z4) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z4 = this.F;
        if (z4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 20));
        this.c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        final int i11 = 0;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        linearLayout2.addView(this.x, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.b.setBackgroundDrawable(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.b.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kd1
            public final /* synthetic */ od1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i11) {
                    case 0:
                        od1 od1Var = this.b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        org.telegram.ui.Components.in inVar = new org.telegram.ui.Components.in(context, 24);
        this.s = inVar;
        this.x.addView(inVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.x.addView(linearLayout4, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        this.w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout4.addView(this.w, k7.c6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout4.addView(this.a, k7.c6.n(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kd1
            public final /* synthetic */ od1 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i10) {
                    case 0:
                        od1 od1Var = this.b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (w0Var = this.b.c) == null) {
                            return false;
                        }
                        w0Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new nd1(this));
        if (z4) {
            this.a.setOnFocusChangeListener(new qd(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.e = a9Var;
        int i14 = R.drawable.greydivider_bottom;
        int i15 = org.telegram.ui.ActionBar.k6.b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i14, i15));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.d = a9Var2;
        a9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.mv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.K6, false));
        if (z4) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.a9 a9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.E = replaceTags;
            a9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, k7.c6.n(-1, -2));
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i15));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, this.parentLayout, 1);
            this.f = eaVar;
            linearLayout2.addView(eaVar, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.h = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, k7.c6.n(-1, -2));
            this.h.setOnClickListener(new hb0(24, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.n = a9Var4;
            a9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i15));
            linearLayout2.addView(this.n, k7.c6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i15));
        }
        TLRPC.TL_theme tL_theme = this.I;
        if (tL_theme != null) {
            this.D = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.D = false;
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.d2 d2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        org.telegram.ui.ActionBar.j6 j6Var = this.G;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var2 == j6Var && i6Var2 == i6Var && (d2Var2 = this.r) != null) {
                try {
                    d2Var2.dismiss();
                    this.r = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                org.telegram.ui.ActionBar.k6.t(j6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var3 == j6Var && i6Var3 == i6Var && (d2Var = this.r) != null) {
                try {
                    d2Var.dismiss();
                    this.r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        LinearLayout linearLayout = this.x;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.w6));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, TLObject.FLAG_28, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.a;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, TLObject.FLAG_23, null, null, null, null, i14));
        org.telegram.ui.Components.in inVar = this.s;
        Paint paint = org.telegram.ui.ActionBar.k6.k0;
        int i15 = org.telegram.ui.ActionBar.k6.d7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(inVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 1, null, org.telegram.ui.ActionBar.k6.k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.m3, org.telegram.ui.ActionBar.k6.q3}, null, org.telegram.ui.ActionBar.k6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.n3, org.telegram.ui.ActionBar.k6.r3}, null, org.telegram.ui.ActionBar.k6.dc));
        org.telegram.ui.Cells.ea eaVar = this.f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.m3.y;
        int i16 = org.telegram.ui.ActionBar.k6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, org.telegram.ui.ActionBar.k6.q3.y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.o3, org.telegram.ui.ActionBar.k6.s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.p3, org.telegram.ui.ActionBar.k6.t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        org.telegram.ui.Cells.ea eaVar2 = this.f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.o3.y;
        int i17 = org.telegram.ui.ActionBar.k6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, org.telegram.ui.ActionBar.k6.s3.y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.F) {
            this.a.requestFocus();
            AndroidUtilities.showKeyboard(this.a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 || this.F) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }
}
