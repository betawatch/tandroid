package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class iu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.z4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final /* synthetic */ int b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.c2 creationLinkDialog;
    private gu delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.g6 resourcesProvider;
    private i11 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int themedQuoteColor;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public iu(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = g6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, g6Var);
        this.themedQuoteColor = w02;
        this.quoteColor = w02;
        addTextChangedListener(new ai.u(this, 7));
        setClipToPadding(true);
    }

    public static /* synthetic */ void i(iu iuVar) {
        iuVar.creationLinkDialog = null;
        iuVar.requestFocus();
    }

    public static void j(iu iuVar, int i10, int i11, int i12, int i13) {
        Editable text = iuVar.getText();
        q11 q11Var = new q11();
        q11Var.a |= 128;
        q11Var.b = i10;
        q11Var.c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new p10(text.subSequence(i10, i11).toString(), q11Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        gu guVar = iuVar.delegate;
        if (guVar != null) {
            guVar.h();
        }
    }

    public static /* synthetic */ void k(iu iuVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = iuVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof a6) && !(characterStyle instanceof sj0)) {
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
            text.setSpan(iuVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        gu guVar = iuVar.delegate;
        if (guVar != null) {
            guVar.h();
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
        q11 q11Var = new q11();
        q11Var.a = i10;
        MediaDataController.addStyleToText(new r11(q11Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.h();
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.c2 c2Var = this.creationLinkDialog;
        if (c2Var == null || !c2Var.isShowing()) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.creationLinkDialog.dismiss();
        return true;
    }

    public s61 createUrlSpan(String str) {
        return new s61(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    public int getCurrentStyle(int i10, int i11) {
        Editable text = getText();
        int i12 = 0;
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        r11[] r11VarArr = (r11[]) text.getSpans(max, min, r11.class);
        int[] iArr = STYLE_FLAGS;
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr[i13];
            int i16 = max;
            int i17 = 1;
            while (i17 != 0 && i16 < min) {
                i17 = i12;
                int i18 = i17;
                while (i18 < r11VarArr.length) {
                    r11 r11Var = r11VarArr[i18];
                    int i19 = r11Var.b.a;
                    int i20 = i12;
                    if ((i19 & 512) != 0) {
                        i19 |= 256;
                    }
                    if ((i19 & i15) != 0) {
                        int spanStart = text.getSpanStart(r11Var);
                        int spanEnd = text.getSpanEnd(r11VarArr[i18]);
                        if (spanStart <= i16 && spanEnd > i16) {
                            i17 = 1;
                            i16 = spanEnd;
                        }
                    }
                    i18++;
                    i12 = i20;
                }
            }
            int i21 = i12;
            if (i16 >= min) {
                i14 |= i15;
            }
            i13++;
            i12 = i21;
        }
        return i14;
    }

    public boolean isNearRightCaption(int i10) {
        Layout layout = getLayout();
        return layout != null && layout.getLineCount() > 0 && (layout.getLineCount() > 1 || layout.getLineRight(0) + ((float) i10) >= ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
    }

    public final void l(r11 r11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(r11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (r11Var == null) {
            Editable text = getText();
            for (mi.h hVar : (mi.h[]) text.getSpans(i10, selectionEnd, mi.h.class)) {
                text.removeSpan(hVar);
            }
            tj0[] tj0VarArr = (tj0[]) text.getSpans(i10, selectionEnd, tj0.class);
            for (int i11 = 0; i11 < tj0VarArr.length; i11++) {
                text.removeSpan(tj0VarArr[i11]);
                text.removeSpan(tj0VarArr[i11].s);
                ki.y5 y5Var = tj0VarArr[i11].v;
                if (y5Var != null) {
                    text.removeSpan(y5Var);
                }
            }
            if (tj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.h();
        }
    }

    public void makeSelectedBold() {
        q11 q11Var = new q11();
        q11Var.a |= 1;
        l(new r11(q11Var, 0));
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
        ai.p0 p0Var = new ai.p0(this, i10, selectionEnd);
        rc rcVar = new rc(9);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        Pattern pattern = f5.a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        int e = g6Var != null ? g6Var.e(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        int e7 = g6Var != null ? g6Var.e(i12) : org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.i6;
        if (g6Var != null) {
            g6Var.e(i17);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            g6Var.e(i18);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            g6Var.e(i19);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.k6.Qh;
        if (g6Var != null) {
            g6Var.e(i20);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i20, false);
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i21 = calendar.get(1);
        qd0 qd0Var = new qd0(context, g6Var);
        qd0Var.setTextColor(e);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        qd0Var.setMinValue(1);
        qd0Var.setMaxValue(31);
        qd0Var.setWrapSelectorWheel(false);
        qd0Var.setFormatter(new e2(7));
        qd0 qd0Var2 = new qd0(context, g6Var);
        qd0Var2.setTextColor(e);
        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qd0Var2.setItemCount(5);
        qd0Var2.setMinValue(0);
        qd0Var2.setMaxValue(239);
        qd0Var2.setValue(120);
        qd0Var2.setWrapSelectorWheel(false);
        qd0Var2.setFormatter(new i2.r(calendar, i21, 5));
        qd0 qd0Var3 = new qd0(context, g6Var);
        qd0Var3.setContentDescriptionCallback(new gi.c(3));
        qd0Var3.setWrapSelectorWheel(true);
        qd0Var3.setAllItemsCount(24);
        qd0Var3.setItemCount(5);
        qd0Var3.setTextColor(e);
        qd0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var3.setMinValue(0);
        qd0Var3.setMaxValue(23);
        qd0Var3.setFormatter(new e2(8));
        qd0 qd0Var4 = new qd0(context, g6Var);
        qd0Var4.setContentDescriptionCallback(new gi.c(4));
        qd0Var4.setWrapSelectorWheel(true);
        qd0Var4.setAllItemsCount(60);
        qd0Var4.setItemCount(5);
        qd0Var4.setTextColor(e);
        qd0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        qd0Var4.setMinValue(0);
        qd0Var4.setMaxValue(59);
        qd0Var4.setValue(0);
        qd0Var4.setFormatter(new e2(9));
        calendar.setTimeInMillis(currentTimeMillis);
        qd0Var4.setValue(calendar.get(12));
        qd0Var3.setValue(calendar.get(11));
        qd0Var.setValue(calendar.get(5));
        qd0Var2.setValue(calendar.get(2) + 120);
        i11 i11Var = new i11(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        i11Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        i11Var.n(1);
        i11Var.o(e);
        i11 i11Var2 = new i11(":", 18.0f, null);
        i11Var2.q(AndroidUtilities.dp(100.0f));
        i11Var2.a();
        i11Var2.n(1);
        i11Var2.a.setColor(e);
        FrameLayout frameLayout = new FrameLayout(context);
        c4 c4Var = new c4(context, qd0Var2, qd0Var, qd0Var3, qd0Var4);
        c4Var.setOrientation(1);
        frameLayout.addView(c4Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        c4Var.addView(frameLayout2, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(e);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        ei.m5 m5Var = new ei.m5(context, i11Var2, qd0Var4, 4);
        m5Var.setOrientation(0);
        m5Var.setWeightSum(1.0f);
        c4Var.addView(m5Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ei.d dVar = new ei.d(context, g6Var, true);
        ai.t7 t7Var = new ai.t7(dVar, qd0Var, qd0Var2, qd0Var3, qd0Var4);
        m5Var.addView(qd0Var, w7.z5.l(0.2f, 0, 270));
        m5Var.addView(qd0Var2, w7.z5.l(0.4f, 0, 270));
        m5Var.addView(qd0Var3, w7.z5.l(0.2f, 0, 270));
        m5Var.addView(qd0Var4, w7.z5.l(0.2f, 0, 270));
        qd0Var.setOnValueChangedListener(t7Var);
        qd0Var2.setOnValueChangedListener(t7Var);
        qd0Var3.setOnValueChangedListener(t7Var);
        qd0Var4.setOnValueChangedListener(t7Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.f();
        c4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new z1(zArr, qd0Var, qd0Var2, qd0Var3, qd0Var4, p0Var, new int[1], b3Var));
        b3Var.b(frameLayout);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        h3Var.setOnDismissListener(new g2(1, rcVar, zArr));
        h3Var.setBackgroundColor(e7);
        h3Var.fixNavigationBar(e7);
        f5.c(dVar, qd0Var, qd0Var2, qd0Var3, qd0Var4);
    }

    public void makeSelectedItalic() {
        q11 q11Var = new q11();
        q11Var.a |= 2;
        l(new r11(q11Var, 0));
    }

    public void makeSelectedMono() {
        q11 q11Var = new q11();
        q11Var.a |= 4;
        l(new r11(q11Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        q11 q11Var = new q11();
        q11Var.a |= 256;
        l(new r11(q11Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        q11 q11Var = new q11();
        q11Var.a |= 8;
        l(new r11(q11Var, 0));
    }

    public void makeSelectedUnderline() {
        q11 q11Var = new q11();
        q11Var.a |= 16;
        l(new r11(q11Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.h();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.quoteColor == this.themedQuoteColor) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, this.resourcesProvider);
            this.themedQuoteColor = w02;
            this.quoteColor = w02;
        }
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class);
                    if (a6VarArr != null) {
                        for (a6 a6Var : a6VarArr) {
                            a6Var.applyFontMetrics(getPaint().getFontMetricsInt(), r5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    sj0[] sj0VarArr = (sj0[]) getText().getSpans(max, min, sj0.class);
                    if (sj0VarArr == null || sj0VarArr.length <= 0) {
                        tj0.a(spannableStringBuilder);
                    } else {
                        sj0[] sj0VarArr2 = (sj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sj0.class);
                        for (int i11 = 0; i11 < sj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(sj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(sj0VarArr2[i11].a);
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
                    org.telegram.ui.ActionBar.k4 k4Var = this.floatingActionMode;
                    if (k4Var != null) {
                        k4Var.finish();
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
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        for (r11 r11Var : (r11[]) text.getSpans(i11, min, r11.class)) {
            q11 q11Var = r11Var.b;
            int i14 = q11Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(r11Var);
                int spanEnd = text.getSpanEnd(r11Var);
                text.removeSpan(r11Var);
                if (spanStart < i11) {
                    text.setSpan(new r11(new q11(q11Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new r11(new q11(q11Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    q11 q11Var2 = new q11(q11Var);
                    q11Var2.a = i15;
                    text.setSpan(new r11(q11Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.h();
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

    public void setDelegate(gu guVar) {
        this.delegate = guVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new i11(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, hu huVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, huVar);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.m9(new fu(this, callback), callback));
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
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        k51 k51Var = new k51(getContext(), U != null ? U.getResourceProvider() : null);
        k51Var.a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new tv(k51Var, 26), new ud0(23));
        }
        k51Var.d0 = new du(this, i10, selectionEnd);
        k51Var.show();
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
        int c10 = tj0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new m4.s0(this, i10, selectionEnd, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, hu huVar) {
        CharSequence charSequence;
        ?? f2Var = z11 ? new org.telegram.ui.ActionBar.f2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.R = str;
        ?? frameLayout = new FrameLayout(getContext());
        final ai.t tVar = new ai.t(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        tVar.setTextSize(1, 18.0f);
        tVar.setText(str4);
        org.telegram.ui.ActionBar.r6.W(tVar, org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider);
        tVar.setHintText(str2);
        org.telegram.ui.ActionBar.r6.m(tVar, 35, org.telegram.ui.ActionBar.k6.L6, this.resourcesProvider);
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        tVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.r6.H(tVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, this.resourcesProvider);
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.requestFocus();
        tVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.r6.E(tVar, org.telegram.ui.ActionBar.k6.uf, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.m(tVar, 36, org.telegram.ui.ActionBar.k6.vf, this.resourcesProvider);
        frameLayout.addView(tVar, w7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.b1.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.k6.o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.W(textView, i10, this.resourcesProvider);
        int dp = AndroidUtilities.dp(6.0f);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.12f, w02);
        int o13 = org.telegram.ui.ActionBar.k6.o1(0.15f, w02);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o12, o13, o13);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i10);
        org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.15f, i10);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView, j02, M, M2, g6Var);
        w7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ei.s1 s1Var = new ei.s1(this, z10, tVar, str4, textView);
        textView.setOnClickListener(new ai.v0(this, tVar, s1Var, 23));
        tVar.addTextChangedListener(new ai.u(s1Var, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                tVar.setText(charSequence);
                tVar.setSelection(0, tVar.getText().length());
            }
        }
        s1Var.run();
        f2Var.o(frameLayout);
        f2Var.k(LocaleController.getString(R.string.OK), new p2(16, huVar, tVar));
        f2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = c2Var;
            c2Var.setOnDismissListener(new a1(this, 6));
            final int i11 = 0;
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.eu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            ai.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            break;
                        default:
                            ai.t tVar3 = tVar;
                            tVar3.requestFocus();
                            AndroidUtilities.showKeyboard(tVar3);
                            break;
                    }
                }
            });
            this.creationLinkDialog.r(250L);
        } else {
            final int i12 = 1;
            f2Var.p().setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.eu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            ai.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            break;
                        default:
                            ai.t tVar3 = tVar;
                            tVar3.requestFocus();
                            AndroidUtilities.showKeyboard(tVar3);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            tVar.setLayoutParams(marginLayoutParams);
        }
        tVar.setSelection(0, tVar.getText().length());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return super.startActionMode(new org.telegram.ui.Cells.m9(new fu(this, callback), callback), i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
