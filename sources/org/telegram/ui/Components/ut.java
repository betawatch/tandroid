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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class ut extends EditTextBoldCursor implements org.telegram.ui.ActionBar.x4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final /* synthetic */ int b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.d2 creationLinkDialog;
    private st delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.f6 resourcesProvider;
    private k01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public ut(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = f6Var;
        this.quoteColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sc, f6Var);
        addTextChangedListener(new dh.c(this, 6));
        setClipToPadding(true);
    }

    public static /* synthetic */ void i(ut utVar) {
        utVar.creationLinkDialog = null;
        utVar.requestFocus();
    }

    public static void j(ut utVar, int i10, int i11, int i12, int i13) {
        Editable text = utVar.getText();
        s01 s01Var = new s01();
        s01Var.a |= 128;
        s01Var.b = i10;
        s01Var.c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new i10(text.subSequence(i10, i11).toString(), s01Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        st stVar = utVar.delegate;
        if (stVar != null) {
            stVar.J();
        }
    }

    public static /* synthetic */ void k(ut utVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = utVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof u5) && !(characterStyle instanceof zi0)) {
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
            text.setSpan(utVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        st stVar = utVar.delegate;
        if (stVar != null) {
            stVar.J();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.x4
    public void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        s01 s01Var = new s01();
        s01Var.a = i10;
        MediaDataController.addStyleToText(new t01(s01Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        st stVar = this.delegate;
        if (stVar != null) {
            stVar.J();
        }
    }

    public boolean closeCreationLinkDialog(boolean z4) {
        org.telegram.ui.ActionBar.d2 d2Var = this.creationLinkDialog;
        if (d2Var == null || !d2Var.isShowing()) {
            return false;
        }
        if (!z4) {
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

    @Override // org.telegram.ui.ActionBar.x4
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
        t01[] t01VarArr = (t01[]) text.getSpans(max, min, t01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z4 = true;
            while (z4 && i14 < min) {
                z4 = false;
                for (int i15 = 0; i15 < t01VarArr.length; i15++) {
                    t01 t01Var = t01VarArr[i15];
                    int i16 = t01Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(t01Var);
                        int spanEnd = text.getSpanEnd(t01VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            i14 = spanEnd;
                            z4 = true;
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

    public final void l(t01 t01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(t01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (t01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            aj0[] aj0VarArr = (aj0[]) text.getSpans(i10, selectionEnd, aj0.class);
            for (int i11 = 0; i11 < aj0VarArr.length; i11++) {
                text.removeSpan(aj0VarArr[i11]);
                text.removeSpan(aj0VarArr[i11].s);
                va0 va0Var = aj0VarArr[i11].v;
                if (va0Var != null) {
                    text.removeSpan(va0Var);
                }
            }
            if (aj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        st stVar = this.delegate;
        if (stVar != null) {
            stVar.J();
        }
    }

    public void makeSelectedBold() {
        s01 s01Var = new s01();
        s01Var.a |= 1;
        l(new t01(s01Var, 0));
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
        lh.g0 g0Var = new lh.g0(this, i10, selectionEnd);
        mc mcVar = new mc(7);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        Pattern pattern = z4.a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        int d02 = f6Var != null ? f6Var.d0(i11) : org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        int d03 = f6Var != null ? f6Var.d0(i12) : org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.d0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.d0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.d0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.d0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.i6;
        if (f6Var != null) {
            f6Var.d0(i17);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.Sh;
        if (f6Var != null) {
            f6Var.d0(i18);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        if (f6Var != null) {
            f6Var.d0(i19);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.j6.Qh;
        if (f6Var != null) {
            f6Var.d0(i20);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i20, false);
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i21 = calendar.get(1);
        xc0 xc0Var = new xc0(context, f6Var);
        xc0Var.setTextColor(d02);
        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var.setItemCount(5);
        xc0Var.setMinValue(1);
        xc0Var.setMaxValue(31);
        xc0Var.setWrapSelectorWheel(false);
        xc0Var.setFormatter(new k2(2));
        xc0 xc0Var2 = new xc0(context, f6Var);
        xc0Var2.setTextColor(d02);
        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        xc0Var2.setItemCount(5);
        xc0Var2.setMinValue(0);
        xc0Var2.setMaxValue(239);
        xc0Var2.setValue(120);
        xc0Var2.setWrapSelectorWheel(false);
        xc0Var2.setFormatter(new gg.m2(calendar, i21, 4));
        xc0 xc0Var3 = new xc0(context, f6Var);
        xc0Var3.setContentDescriptionCallback(new org.telegram.ui.yh(2));
        xc0Var3.setWrapSelectorWheel(true);
        xc0Var3.setAllItemsCount(24);
        xc0Var3.setItemCount(5);
        xc0Var3.setTextColor(d02);
        xc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var3.setMinValue(0);
        xc0Var3.setMaxValue(23);
        int i22 = 3;
        xc0Var3.setFormatter(new k2(i22));
        xc0 xc0Var4 = new xc0(context, f6Var);
        xc0Var4.setContentDescriptionCallback(new org.telegram.ui.yh(i22));
        xc0Var4.setWrapSelectorWheel(true);
        xc0Var4.setAllItemsCount(60);
        xc0Var4.setItemCount(5);
        xc0Var4.setTextColor(d02);
        xc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        xc0Var4.setMinValue(0);
        xc0Var4.setMaxValue(59);
        xc0Var4.setValue(0);
        xc0Var4.setFormatter(new k2(4));
        calendar.setTimeInMillis(currentTimeMillis);
        xc0Var4.setValue(calendar.get(12));
        xc0Var3.setValue(calendar.get(11));
        xc0Var.setValue(calendar.get(5));
        xc0Var2.setValue(calendar.get(2) + 120);
        k01 k01Var = new k01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        k01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k01Var.a();
        k01Var.n(1);
        k01Var.o(d02);
        k01 k01Var2 = new k01(":", 18.0f, null);
        k01Var2.q(AndroidUtilities.dp(100.0f));
        k01Var2.a();
        k01Var2.n(1);
        k01Var2.a.setColor(d02);
        FrameLayout frameLayout = new FrameLayout(context);
        gg.p pVar = new gg.p(context, xc0Var2, xc0Var, xc0Var3, xc0Var4);
        pVar.setOrientation(1);
        frameLayout.addView(pVar, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        pVar.addView(frameLayout2, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(d02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        dg.k0 k0Var = new dg.k0(context, k01Var2, xc0Var4, 4);
        k0Var.setOrientation(0);
        k0Var.setWeightSum(1.0f);
        pVar.addView(k0Var, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ph.d dVar = new ph.d(context, f6Var, true);
        f1.a aVar = new f1.a(dVar, xc0Var, xc0Var2, xc0Var3, xc0Var4);
        k0Var.addView(xc0Var, k7.b6.l(0.2f, 0, 270));
        k0Var.addView(xc0Var2, k7.b6.l(0.4f, 0, 270));
        k0Var.addView(xc0Var3, k7.b6.l(0.2f, 0, 270));
        k0Var.addView(xc0Var4, k7.b6.l(0.2f, 0, 270));
        xc0Var.setOnValueChangedListener(aVar);
        xc0Var2.setOnValueChangedListener(aVar);
        xc0Var3.setOnValueChangedListener(aVar);
        xc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        pVar.addView(dVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, xc0Var, xc0Var2, xc0Var3, xc0Var4, g0Var, new int[1], b3Var));
        b3Var.b(frameLayout);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        g3Var.setOnDismissListener(new f2(1, mcVar, zArr));
        g3Var.setBackgroundColor(d03);
        g3Var.fixNavigationBar(d03);
        z4.c(dVar, xc0Var, xc0Var2, xc0Var3, xc0Var4);
    }

    public void makeSelectedItalic() {
        s01 s01Var = new s01();
        s01Var.a |= 2;
        l(new t01(s01Var, 0));
    }

    public void makeSelectedMono() {
        s01 s01Var = new s01();
        s01Var.a |= 4;
        l(new t01(s01Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        s01 s01Var = new s01();
        s01Var.a |= 256;
        l(new t01(s01Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        s01 s01Var = new s01();
        s01Var.a |= 8;
        l(new t01(s01Var, 0));
    }

    public void makeSelectedUnderline() {
        s01 s01Var = new s01();
        s01Var.a |= 16;
        l(new t01(s01Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        st stVar = this.delegate;
        if (stVar != null) {
            stVar.J();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.wt, android.widget.TextView, android.view.View
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kf.n.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                    if (u5VarArr != null) {
                        for (u5 u5Var : u5VarArr) {
                            u5Var.applyFontMetrics(getPaint().getFontMetricsInt(), l5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    zi0[] zi0VarArr = (zi0[]) getText().getSpans(max, min, zi0.class);
                    if (zi0VarArr == null || zi0VarArr.length <= 0) {
                        aj0.a(spannableStringBuilder);
                    } else {
                        zi0[] zi0VarArr2 = (zi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zi0.class);
                        for (int i11 = 0; i11 < zi0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(zi0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(zi0VarArr2[i11].a);
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
                    org.telegram.ui.ActionBar.j4 j4Var = this.floatingActionMode;
                    if (j4Var != null) {
                        j4Var.finish();
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
    public void onWindowFocusChanged(boolean z4) {
        if (Build.VERSION.SDK_INT >= 23 || z4 || !this.copyPasteShowed) {
            try {
                super.onWindowFocusChanged(z4);
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

    @Override // org.telegram.ui.ActionBar.x4
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
        for (t01 t01Var : (t01[]) text.getSpans(i11, min, t01.class)) {
            s01 s01Var = t01Var.b;
            int i14 = s01Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(t01Var);
                int spanEnd = text.getSpanEnd(t01Var);
                text.removeSpan(t01Var);
                if (spanStart < i11) {
                    text.setSpan(new t01(new s01(s01Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new t01(new s01(s01Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    s01 s01Var2 = new s01(s01Var);
                    s01Var2.a = i15;
                    text.setSpan(new t01(s01Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        st stVar = this.delegate;
        if (stVar != null) {
            stVar.J();
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z4) {
        this.allowTextEntitiesIntersection = z4;
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

    public void setDelegate(st stVar) {
        this.delegate = stVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new k01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z4, tt ttVar) {
        showInputDialog(str, str2, str3, z4, this.adaptiveCreateLinkDialog, ttVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.j9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        rt rtVar = new rt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            rtVar = new org.telegram.ui.Cells.j9(rtVar, callback);
        }
        return super.startActionMode(rtVar);
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
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        g41 g41Var = new g41(getContext(), U != null ? U.getResourceProvider() : null);
        g41Var.X = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new ev(g41Var, 25), new lh0(13));
        }
        g41Var.a0 = new pt(this, i10, selectionEnd);
        g41Var.show();
        setSelection(i10, selectionEnd);
    }

    public void makeSelectedQuote(boolean z4) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        int c3 = aj0.c(getText(), i10, selectionEnd, z4);
        if (c3 >= 0) {
            setSelection(c3);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new gg.l2(this, i10, selectionEnd, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public void showInputDialog(String str, String str2, String str3, boolean z4, boolean z10, tt ttVar) {
        CharSequence charSequence;
        ?? g2Var = z10 ? new org.telegram.ui.ActionBar.g2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.d2 d2Var = g2Var.a;
        d2Var.O = str;
        ?? frameLayout = new FrameLayout(getContext());
        lh.n nVar = new lh.n(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        nVar.setTextSize(1, 18.0f);
        nVar.setText(str4);
        nVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider));
        nVar.setHintText(str2);
        nVar.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.resourcesProvider));
        nVar.setSingleLine(true);
        nVar.setFocusable(true);
        nVar.setTransformHintToHeader(true);
        nVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, this.resourcesProvider));
        nVar.setImeOptions(6);
        nVar.setBackgroundDrawable(null);
        nVar.requestFocus();
        nVar.setPadding(0, 0, 0, 0);
        nVar.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, this.resourcesProvider));
        nVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, this.resourcesProvider));
        frameLayout.addView(nVar, k7.b6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ai.o(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.d6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, k7.b6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z4 ? 0 : 8);
        gg.j jVar = new gg.j(this, z4, nVar, str4, textView);
        textView.setOnClickListener(new dg.p(this, nVar, jVar, 23));
        nVar.addTextChangedListener(new dh.c(jVar, 7));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z4 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                nVar.setText(charSequence);
                nVar.setSelection(0, nVar.getText().length());
            }
        }
        jVar.run();
        g2Var.n(frameLayout);
        g2Var.k(LocaleController.getString(R.string.OK), new o1(18, ttVar, nVar));
        g2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            this.creationLinkDialog = d2Var;
            d2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new qt(0, nVar));
            this.creationLinkDialog.q(250L);
        } else {
            g2Var.o().setOnShowListener(new qt(1, nVar));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            nVar.setLayoutParams(marginLayoutParams);
        }
        nVar.setSelection(0, nVar.getText().length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.j9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ut] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        rt rtVar = new rt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            rtVar = new org.telegram.ui.Cells.j9(rtVar, callback);
        }
        return super.startActionMode(rtVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
