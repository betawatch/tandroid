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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class bu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.w4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final /* synthetic */ int b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private zt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.e6 resourcesProvider;
    private g01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public bu(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = e6Var;
        this.quoteColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sc, e6Var);
        addTextChangedListener(new ci.i2(this, 6));
        setClipToPadding(true);
    }

    public static /* synthetic */ void i(bu buVar) {
        buVar.creationLinkDialog = null;
        buVar.requestFocus();
    }

    public static void j(bu buVar, int i10, int i11, int i12, int i13) {
        Editable text = buVar.getText();
        o01 o01Var = new o01();
        o01Var.a |= 128;
        o01Var.b = i10;
        o01Var.c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new h10(text.subSequence(i10, i11).toString(), o01Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        zt ztVar = buVar.delegate;
        if (ztVar != null) {
            ztVar.i();
        }
    }

    public static /* synthetic */ void k(bu buVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = buVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof x5) && !(characterStyle instanceof ri0)) {
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
            text.setSpan(buVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        zt ztVar = buVar.delegate;
        if (ztVar != null) {
            ztVar.i();
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
        o01 o01Var = new o01();
        o01Var.a = i10;
        MediaDataController.addStyleToText(new p01(o01Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
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

    public o51 createUrlSpan(String str) {
        return new o51(str, null);
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
        p01[] p01VarArr = (p01[]) text.getSpans(max, min, p01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < p01VarArr.length; i15++) {
                    p01 p01Var = p01VarArr[i15];
                    int i16 = p01Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(p01Var);
                        int spanEnd = text.getSpanEnd(p01VarArr[i15]);
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

    public final void l(p01 p01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(p01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (p01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            si0[] si0VarArr = (si0[]) text.getSpans(i10, selectionEnd, si0.class);
            for (int i11 = 0; i11 < si0VarArr.length; i11++) {
                text.removeSpan(si0VarArr[i11]);
                text.removeSpan(si0VarArr[i11].s);
                ii.z5 z5Var = si0VarArr[i11].v;
                if (z5Var != null) {
                    text.removeSpan(z5Var);
                }
            }
            if (si0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
        }
    }

    public void makeSelectedBold() {
        o01 o01Var = new o01();
        o01Var.a |= 1;
        l(new p01(o01Var, 0));
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
        wt wtVar = new wt(this, i10, selectionEnd);
        sh shVar = new sh(4);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        Pattern pattern = c5.a;
        if (context == null) {
            return;
        }
        int i11 = 0;
        int i12 = org.telegram.ui.ActionBar.i6.j5;
        int g02 = e6Var != null ? e6Var.g0(i12) : org.telegram.ui.ActionBar.i6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.i6.h5;
        int g03 = e6Var != null ? e6Var.g0(i13) : org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.g0(i14);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.g0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.g0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.g0(i17);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.i6;
        if (e6Var != null) {
            e6Var.g0(i18);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.i6.Sh;
        if (e6Var != null) {
            e6Var.g0(i19);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.i6.Oh;
        if (e6Var != null) {
            e6Var.g0(i20);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.i6.Qh;
        if (e6Var != null) {
            e6Var.g0(i21);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i21, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        uc0 uc0Var = new uc0(context, e6Var);
        uc0Var.setTextColor(g02);
        uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        uc0Var.setItemCount(5);
        uc0Var.setMinValue(1);
        uc0Var.setMaxValue(31);
        uc0Var.setWrapSelectorWheel(false);
        uc0Var.setFormatter(new o2(i11));
        uc0 uc0Var2 = new uc0(context, e6Var);
        uc0Var2.setTextColor(g02);
        uc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        uc0Var2.setItemCount(5);
        uc0Var2.setMinValue(0);
        uc0Var2.setMaxValue(239);
        uc0Var2.setValue(120);
        uc0Var2.setWrapSelectorWheel(false);
        uc0Var2.setFormatter(new i2.s(calendar, i22, 4));
        uc0 uc0Var3 = new uc0(context, e6Var);
        uc0Var3.setContentDescriptionCallback(new ei.c(3));
        uc0Var3.setWrapSelectorWheel(true);
        uc0Var3.setAllItemsCount(24);
        uc0Var3.setItemCount(5);
        uc0Var3.setTextColor(g02);
        uc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        uc0Var3.setMinValue(0);
        uc0Var3.setMaxValue(23);
        uc0Var3.setFormatter(new o2(1));
        uc0 uc0Var4 = new uc0(context, e6Var);
        uc0Var4.setContentDescriptionCallback(new ei.c(4));
        uc0Var4.setWrapSelectorWheel(true);
        uc0Var4.setAllItemsCount(60);
        uc0Var4.setItemCount(5);
        uc0Var4.setTextColor(g02);
        uc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        uc0Var4.setMinValue(0);
        uc0Var4.setMaxValue(59);
        uc0Var4.setValue(0);
        uc0Var4.setFormatter(new o2(2));
        calendar.setTimeInMillis(currentTimeMillis);
        uc0Var4.setValue(calendar.get(12));
        uc0Var3.setValue(calendar.get(11));
        uc0Var.setValue(calendar.get(5));
        uc0Var2.setValue(calendar.get(2) + 120);
        g01 g01Var = new g01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        g01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        g01Var.a();
        g01Var.n(1);
        g01Var.o(g02);
        g01 g01Var2 = new g01(":", 18.0f, null);
        g01Var2.q(AndroidUtilities.dp(100.0f));
        g01Var2.a();
        g01Var2.n(1);
        g01Var2.a.setColor(g02);
        FrameLayout frameLayout = new FrameLayout(context);
        a4 a4Var = new a4(context, uc0Var2, uc0Var, uc0Var3, uc0Var4);
        a4Var.setOrientation(1);
        frameLayout.addView(a4Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        a4Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(g02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new bi.d(10));
        ci.x5 x5Var = new ci.x5(context, g01Var2, uc0Var4, 4);
        x5Var.setOrientation(0);
        x5Var.setWeightSum(1.0f);
        a4Var.addView(x5Var, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(context, e6Var, true);
        ai.h6 h6Var = new ai.h6(dVar, uc0Var, uc0Var2, uc0Var3, uc0Var4);
        x5Var.addView(uc0Var, w7.x5.l(0.2f, 0, 270));
        x5Var.addView(uc0Var2, w7.x5.l(0.4f, 0, 270));
        x5Var.addView(uc0Var3, w7.x5.l(0.2f, 0, 270));
        x5Var.addView(uc0Var4, w7.x5.l(0.2f, 0, 270));
        uc0Var.setOnValueChangedListener(h6Var);
        uc0Var2.setOnValueChangedListener(h6Var);
        uc0Var3.setOnValueChangedListener(h6Var);
        uc0Var4.setOnValueChangedListener(h6Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        a4Var.addView(dVar, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new z1(zArr, uc0Var, uc0Var2, uc0Var3, uc0Var4, wtVar, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setOnDismissListener(new f2(1, shVar, zArr));
        f3Var.setBackgroundColor(g03);
        f3Var.fixNavigationBar(g03);
        c5.c(dVar, uc0Var, uc0Var2, uc0Var3, uc0Var4);
    }

    public void makeSelectedItalic() {
        o01 o01Var = new o01();
        o01Var.a |= 2;
        l(new p01(o01Var, 0));
    }

    public void makeSelectedMono() {
        o01 o01Var = new o01();
        o01Var.a |= 4;
        l(new p01(o01Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        o01 o01Var = new o01();
        o01Var.a |= 256;
        l(new p01(o01Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        o01 o01Var = new o01();
        o01Var.a |= 8;
        l(new p01(o01Var, 0));
    }

    public void makeSelectedUnderline() {
        o01 o01Var = new o01();
        o01Var.a |= 16;
        l(new p01(o01Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView, android.view.View
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
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            cVar.l(this.caption);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.a).getId() == 268435456) {
                cVar.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler), null));
            cVar.b(new s0.b(null, R.id.menu_bold, LocaleController.getString(R.string.Bold), null));
            cVar.b(new s0.b(null, R.id.menu_italic, LocaleController.getString(R.string.Italic), null));
            cVar.b(new s0.b(null, R.id.menu_mono, LocaleController.getString(R.string.Mono), null));
            cVar.b(new s0.b(null, R.id.menu_strike, LocaleController.getString(R.string.Strike), null));
            cVar.b(new s0.b(null, R.id.menu_underline, LocaleController.getString(R.string.Underline), null));
            cVar.b(new s0.b(null, R.id.menu_link, LocaleController.getString(R.string.CreateLink), null));
            cVar.b(new s0.b(null, R.id.menu_regular, LocaleController.getString(R.string.Regular), null));
            cVar.b(new s0.b(null, R.id.menu_date, LocaleController.getString(R.string.FormattedDate), null));
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
                    x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                    if (x5VarArr != null) {
                        for (x5 x5Var : x5VarArr) {
                            x5Var.applyFontMetrics(getPaint().getFontMetricsInt(), o5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    ri0[] ri0VarArr = (ri0[]) getText().getSpans(max, min, ri0.class);
                    if (ri0VarArr == null || ri0VarArr.length <= 0) {
                        si0.a(spannableStringBuilder);
                    } else {
                        ri0[] ri0VarArr2 = (ri0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ri0.class);
                        for (int i11 = 0; i11 < ri0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(ri0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(ri0VarArr2[i11].a);
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
                    org.telegram.ui.ActionBar.i4 i4Var = this.floatingActionMode;
                    if (i4Var != null) {
                        i4Var.finish();
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
        for (p01 p01Var : (p01[]) text.getSpans(i11, min, p01.class)) {
            o01 o01Var = p01Var.b;
            int i14 = o01Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(p01Var);
                int spanEnd = text.getSpanEnd(p01Var);
                text.removeSpan(p01Var);
                if (spanStart < i11) {
                    text.setSpan(new p01(new o01(o01Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new p01(new o01(o01Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    o01 o01Var2 = new o01(o01Var);
                    o01Var2.a = i15;
                    text.setSpan(new p01(o01Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
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

    public void setDelegate(zt ztVar) {
        this.delegate = ztVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new g01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, au auVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, auVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.o9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        yt ytVar = new yt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ytVar = new org.telegram.ui.Cells.o9(ytVar, callback);
        }
        return super.startActionMode(ytVar);
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
        g41 g41Var = new g41(getContext(), U != null ? U.getResourceProvider() : null);
        g41Var.a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new lv(g41Var, 25), new in0(11));
        }
        g41Var.d0 = new ut(this, i10, selectionEnd);
        g41Var.show();
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
        int c10 = si0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new vt(this, i10, selectionEnd, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, au auVar) {
        CharSequence charSequence;
        ?? e2Var = z11 ? new org.telegram.ui.ActionBar.e2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = str;
        ?? frameLayout = new FrameLayout(getContext());
        fi.o oVar = new fi.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.k6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.l6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.x5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.q3.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
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
        e2Var.k(LocaleController.getString(R.string.OK), new mf(9, auVar, oVar));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new xt(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            e2Var.o().setOnShowListener(new xt(1, oVar));
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
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.o9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        yt ytVar = new yt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ytVar = new org.telegram.ui.Cells.o9(ytVar, callback);
        }
        return super.startActionMode(ytVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
