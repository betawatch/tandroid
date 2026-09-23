package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class cu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.v4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final /* synthetic */ int b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private au delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.d6 resourcesProvider;
    private f01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public cu(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = d6Var;
        this.quoteColor = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sc, d6Var);
        addTextChangedListener(new ci.i2(this, 6));
        setClipToPadding(true);
    }

    public static /* synthetic */ void i(cu cuVar) {
        cuVar.creationLinkDialog = null;
        cuVar.requestFocus();
    }

    public static void j(cu cuVar, int i10, int i11, int i12, int i13) {
        Editable text = cuVar.getText();
        n01 n01Var = new n01();
        n01Var.a |= 128;
        n01Var.b = i10;
        n01Var.c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new i10(text.subSequence(i10, i11).toString(), n01Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        au auVar = cuVar.delegate;
        if (auVar != null) {
            auVar.i();
        }
    }

    public static /* synthetic */ void k(cu cuVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = cuVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof z5) && !(characterStyle instanceof si0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i10) {
                        text.setSpan(characterStyle, spanStart, i10, 33);
                    }
                    if (spanEnd > i11) {
                        text.setSpan(characterStyle, i11, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(cuVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        au auVar = cuVar.delegate;
        if (auVar != null) {
            auVar.i();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        n01 n01Var = new n01();
        n01Var.a = i10;
        MediaDataController.addStyleToText(new o01(n01Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        au auVar = this.delegate;
        if (auVar != null) {
            auVar.i();
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = this.creationLinkDialog;
        if (b2Var == null || !b2Var.isShowing()) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.creationLinkDialog.dismiss();
        return true;
    }

    public n51 createUrlSpan(String str) {
        return new n51(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    public int getCurrentStyle(int i10, int i11) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        o01[] o01VarArr = (o01[]) text.getSpans(max, min, o01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < o01VarArr.length; i15++) {
                    o01 o01Var = o01VarArr[i15];
                    int i16 = o01Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(o01Var);
                        int spanEnd = text.getSpanEnd(o01VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            i14 = spanEnd;
                            z10 = true;
                        }
                    }
                }
            }
            if (i14 >= min) {
                i12 |= i13;
            }
        }
        return i12;
    }

    public boolean isNearRightCaption(int i10) {
        Layout layout = getLayout();
        return layout != null && layout.getLineCount() > 0 && (layout.getLineCount() > 1 || layout.getLineRight(0) + ((float) i10) >= ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
    }

    public final void l(o01 o01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(o01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (o01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            ti0[] ti0VarArr = (ti0[]) text.getSpans(i10, selectionEnd, ti0.class);
            for (int i11 = 0; i11 < ti0VarArr.length; i11++) {
                text.removeSpan(ti0VarArr[i11]);
                text.removeSpan(ti0VarArr[i11].s);
                ii.a6 a6Var = ti0VarArr[i11].v;
                if (a6Var != null) {
                    text.removeSpan(a6Var);
                }
            }
            if (ti0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        au auVar = this.delegate;
        if (auVar != null) {
            auVar.i();
        }
    }

    public void makeSelectedBold() {
        n01 n01Var = new n01();
        n01Var.a |= 1;
        l(new o01(n01Var, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        Context context = getContext();
        xt xtVar = new xt(this, i10, selectionEnd);
        th thVar = new th(4);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        Pattern pattern = e5.a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        int g02 = d6Var != null ? d6Var.g0(i11) : org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.h6.h5;
        int g03 = d6Var != null ? d6Var.g0(i12) : org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.h6.Ji;
        if (d6Var != null) {
            d6Var.g0(i13);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.h6.Ni;
        if (d6Var != null) {
            d6Var.g0(i14);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.h6.E8;
        if (d6Var != null) {
            d6Var.g0(i15);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.h6.G8;
        if (d6Var != null) {
            d6Var.g0(i16);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.h6.i6;
        if (d6Var != null) {
            d6Var.g0(i17);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.h6.Sh;
        if (d6Var != null) {
            d6Var.g0(i18);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.h6.Oh;
        if (d6Var != null) {
            d6Var.g0(i19);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.h6.Qh;
        if (d6Var != null) {
            d6Var.g0(i20);
        } else {
            org.telegram.ui.ActionBar.h6.w0(null, i20, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, d6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i21 = calendar.get(1);
        tc0 tc0Var = new tc0(context, d6Var);
        tc0Var.setTextColor(g02);
        tc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        tc0Var.setItemCount(5);
        tc0Var.setMinValue(1);
        tc0Var.setMaxValue(31);
        tc0Var.setWrapSelectorWheel(false);
        tc0Var.setFormatter(new x1(14));
        tc0 tc0Var2 = new tc0(context, d6Var);
        tc0Var2.setTextColor(g02);
        tc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        tc0Var2.setItemCount(5);
        tc0Var2.setMinValue(0);
        tc0Var2.setMaxValue(239);
        tc0Var2.setValue(120);
        tc0Var2.setWrapSelectorWheel(false);
        tc0Var2.setFormatter(new i2.s(calendar, i21, 5));
        tc0 tc0Var3 = new tc0(context, d6Var);
        tc0Var3.setContentDescriptionCallback(new ei.c(3));
        tc0Var3.setWrapSelectorWheel(true);
        tc0Var3.setAllItemsCount(24);
        tc0Var3.setItemCount(5);
        tc0Var3.setTextColor(g02);
        tc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        tc0Var3.setMinValue(0);
        tc0Var3.setMaxValue(23);
        tc0Var3.setFormatter(new x1(15));
        tc0 tc0Var4 = new tc0(context, d6Var);
        tc0Var4.setContentDescriptionCallback(new ei.c(4));
        tc0Var4.setWrapSelectorWheel(true);
        tc0Var4.setAllItemsCount(60);
        tc0Var4.setItemCount(5);
        tc0Var4.setTextColor(g02);
        tc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        tc0Var4.setMinValue(0);
        tc0Var4.setMaxValue(59);
        tc0Var4.setValue(0);
        tc0Var4.setFormatter(new x1(16));
        calendar.setTimeInMillis(currentTimeMillis);
        tc0Var4.setValue(calendar.get(12));
        tc0Var3.setValue(calendar.get(11));
        tc0Var.setValue(calendar.get(5));
        tc0Var2.setValue(calendar.get(2) + 120);
        f01 f01Var = new f01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        f01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        f01Var.n(1);
        f01Var.o(g02);
        f01 f01Var2 = new f01(":", 18.0f, null);
        f01Var2.q(AndroidUtilities.dp(100.0f));
        f01Var2.a();
        f01Var2.n(1);
        f01Var2.a.setColor(g02);
        FrameLayout frameLayout = new FrameLayout(context);
        c4 c4Var = new c4(context, tc0Var2, tc0Var, tc0Var3, tc0Var4);
        c4Var.setOrientation(1);
        frameLayout.addView(c4Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        c4Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(g02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new bi.d(10));
        ci.w5 w5Var = new ci.w5(context, f01Var2, tc0Var4, 4);
        w5Var.setOrientation(0);
        w5Var.setWeightSum(1.0f);
        c4Var.addView(w5Var, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(context, d6Var, true);
        ai.g6 g6Var = new ai.g6(dVar, tc0Var, tc0Var2, tc0Var3, tc0Var4);
        w5Var.addView(tc0Var, w7.x5.l(0.2f, 0, 270));
        w5Var.addView(tc0Var2, w7.x5.l(0.4f, 0, 270));
        w5Var.addView(tc0Var3, w7.x5.l(0.2f, 0, 270));
        w5Var.addView(tc0Var4, w7.x5.l(0.2f, 0, 270));
        tc0Var.setOnValueChangedListener(g6Var);
        tc0Var2.setOnValueChangedListener(g6Var);
        tc0Var3.setOnValueChangedListener(g6Var);
        tc0Var4.setOnValueChangedListener(g6Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        c4Var.addView(dVar, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, tc0Var, tc0Var2, tc0Var3, tc0Var4, xtVar, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setOnDismissListener(new g2(1, thVar, zArr));
        f3Var.setBackgroundColor(g03);
        f3Var.fixNavigationBar(g03);
        e5.c(dVar, tc0Var, tc0Var2, tc0Var3, tc0Var4);
    }

    public void makeSelectedItalic() {
        n01 n01Var = new n01();
        n01Var.a |= 2;
        l(new o01(n01Var, 0));
    }

    public void makeSelectedMono() {
        n01 n01Var = new n01();
        n01Var.a |= 4;
        l(new o01(n01Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        n01 n01Var = new n01();
        n01Var.a |= 256;
        l(new o01(n01Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        n01 n01Var = new n01();
        n01Var.a |= 8;
        l(new o01(n01Var, 0));
    }

    public void makeSelectedUnderline() {
        n01 n01Var = new n01();
        n01Var.a |= 16;
        l(new o01(n01Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        au auVar = this.delegate;
        if (auVar != null) {
            auVar.i();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.eu, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        canvas.save();
        canvas.translate(0.0f, this.offsetY);
        super.onDraw(canvas);
        try {
            if (this.captionLayout != null && this.userNameLength == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.hintColor);
                canvas.save();
                canvas.translate(this.xOffset, this.yOffset);
                this.captionLayout.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.rightText == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.rightText.c(layout.getLineRight(0), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, this.hintColor, canvas2);
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            dVar.l(this.caption);
        }
        ArrayList d = dVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.a).getId() == 268435456) {
                dVar.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(null, R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler), null));
            dVar.b(new s0.c(null, R.id.menu_bold, LocaleController.getString(R.string.Bold), null));
            dVar.b(new s0.c(null, R.id.menu_italic, LocaleController.getString(R.string.Italic), null));
            dVar.b(new s0.c(null, R.id.menu_mono, LocaleController.getString(R.string.Mono), null));
            dVar.b(new s0.c(null, R.id.menu_strike, LocaleController.getString(R.string.Strike), null));
            dVar.b(new s0.c(null, R.id.menu_underline, LocaleController.getString(R.string.Underline), null));
            dVar.b(new s0.c(null, R.id.menu_link, LocaleController.getString(R.string.CreateLink), null));
            dVar.b(new s0.c(null, R.id.menu_regular, LocaleController.getString(R.string.Regular), null));
            dVar.b(new s0.c(null, R.id.menu_date, LocaleController.getString(R.string.FormattedDate), null));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int indexOf;
        try {
            this.isInitLineCount = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i10, i11);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str == null || str.length() <= 0) {
            return;
        }
        Editable text = getText();
        if (text.length() <= 1 || text.charAt(0) != '@' || (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        CharSequence subSequence = text.subSequence(0, indexOf + 1);
        int ceil = (int) Math.ceil(paint.measureText(text, 0, r13));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.userNameLength = subSequence.length();
        int i12 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.caption, paint, i12, TextUtils.TruncateAt.END);
        this.xOffset = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.captionLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
            }
            this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                    if (z5VarArr != null) {
                        for (z5 z5Var : z5VarArr) {
                            z5Var.applyFontMetrics(getPaint().getFontMetricsInt(), q5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    si0[] si0VarArr = (si0[]) getText().getSpans(max, min, si0.class);
                    if (si0VarArr == null || si0VarArr.length <= 0) {
                        ti0.a(spannableStringBuilder);
                    } else {
                        si0[] si0VarArr2 = (si0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), si0.class);
                        for (int i11 = 0; i11 < si0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(si0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(si0VarArr2[i11].a);
                        }
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.h4 h4Var = this.floatingActionMode;
                    if (h4Var != null) {
                        h4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                }
                if (i10 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (Build.VERSION.SDK_INT >= 23 || z10 || !this.copyPasteShowed) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return performMenuAction(i10) || super.performAccessibilityAction(i10, bundle);
    }

    public boolean performMenuAction(int i10) {
        if (i10 == R.id.menu_regular) {
            makeSelectedRegular();
            return true;
        }
        if (i10 == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        }
        if (i10 == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        }
        if (i10 == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        }
        if (i10 == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        }
        if (i10 == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        }
        if (i10 == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        }
        if (i10 == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        }
        if (i10 == R.id.menu_quote) {
            makeSelectedQuote();
            return true;
        }
        if (i10 == R.id.menu_date) {
            makeSelectedDate();
            return true;
        }
        if (i10 != R.id.menu_translate) {
            return false;
        }
        translateSelected();
        return true;
    }

    public void removeStyle(int i10, int i11, int i12) {
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12) {
            return;
        }
        int min = Math.min(i12, text.length());
        int i13 = i10 & 256;
        if (i13 != 0) {
            i10 |= 512;
        }
        for (o01 o01Var : (o01[]) text.getSpans(i11, min, o01.class)) {
            n01 n01Var = o01Var.b;
            int i14 = n01Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(o01Var);
                int spanEnd = text.getSpanEnd(o01Var);
                text.removeSpan(o01Var);
                if (spanStart < i11) {
                    text.setSpan(new o01(new n01(n01Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new o01(new n01(n01Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    n01 n01Var2 = new n01(n01Var);
                    n01Var2.a = i15;
                    text.setSpan(new o01(n01Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        au auVar = this.delegate;
        if (auVar != null) {
            auVar.i();
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.allowTextEntitiesIntersection = z10;
    }

    public void setCaption(String str) {
        String str2 = this.caption;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.caption;
        if (str3 == null || !str3.equals(str)) {
            this.caption = str;
            if (str != null) {
                this.caption = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(au auVar) {
        this.delegate = auVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new f01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, bu buVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, buVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.p9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.cu] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        zt ztVar = new zt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ztVar = new org.telegram.ui.Cells.p9(ztVar, callback);
        }
        return super.startActionMode(ztVar);
    }

    public void toggleStyleForSelection(int i10) {
        if (getText() == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            return;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        if (selectionStart >= selectionEnd) {
            return;
        }
        if ((getCurrentStyle(selectionStart, selectionEnd) & i10) != 0) {
            removeStyle(i10, selectionStart, selectionEnd);
            return;
        }
        int i11 = 4;
        if (i10 == 4) {
            i11 = 49435;
        } else if (i10 == 16384) {
            i11 = 32772;
        } else if (i10 == 32768) {
            i11 = LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        }
        removeStyle(i11, selectionStart, selectionEnd);
        addStyle(i10, selectionStart, selectionEnd);
    }

    public void translateSelected() {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        CharSequence subSequence = getText().subSequence(i10, selectionEnd);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        f41 f41Var = new f41(getContext(), U != null ? U.getResourceProvider() : null);
        f41Var.a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new mv(f41Var, 25), new xc0(25));
        }
        f41Var.d0 = new vt(this, i10, selectionEnd);
        f41Var.show();
        setSelection(i10, selectionEnd);
    }

    public void makeSelectedQuote(boolean z10) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        int c10 = ti0.c(getText(), i10, selectionEnd, z10);
        if (c10 >= 0) {
            setSelection(c10);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl(Runnable runnable) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new wt(this, i10, selectionEnd, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, bu buVar) {
        CharSequence charSequence;
        ?? e2Var = z11 ? new org.telegram.ui.ActionBar.e2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = str;
        ?? frameLayout = new FrameLayout(getContext());
        fi.o oVar = new fi.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k6, this.resourcesProvider), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, this.resourcesProvider), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.x5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.q3.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.h6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.z5.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.x5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ci.u1 u1Var = new ci.u1(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new ai.d0(this, oVar, u1Var, 20));
        oVar.addTextChangedListener(new ci.i2(u1Var, 7));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                oVar.setText(charSequence);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        u1Var.run();
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.OK), new b3(10, buVar, oVar));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new yt(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            e2Var.o().setOnShowListener(new yt(1, oVar));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            oVar.setLayoutParams(marginLayoutParams);
        }
        oVar.setSelection(0, oVar.getText().length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.p9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.cu] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        zt ztVar = new zt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ztVar = new org.telegram.ui.Cells.p9(ztVar, callback);
        }
        return super.startActionMode(ztVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
