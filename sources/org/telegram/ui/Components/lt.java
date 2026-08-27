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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class lt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.u4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final /* synthetic */ int b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private jt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    private pz0 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public lt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = c6Var;
        this.quoteColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sc, c6Var);
        addTextChangedListener(new ch.e(this, 7));
        setClipToPadding(true);
    }

    public static /* synthetic */ void i(lt ltVar) {
        ltVar.creationLinkDialog = null;
        ltVar.requestFocus();
    }

    public static void j(lt ltVar, int i10, int i11, int i12, int i13) {
        Editable text = ltVar.getText();
        xz0 xz0Var = new xz0();
        xz0Var.a |= 128;
        xz0Var.b = i10;
        xz0Var.c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new v00(text.subSequence(i10, i11).toString(), xz0Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        jt jtVar = ltVar.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public static /* synthetic */ void k(lt ltVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = ltVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof t5) && !(characterStyle instanceof gi0)) {
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
            text.setSpan(ltVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        jt jtVar = ltVar.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        xz0 xz0Var = new xz0();
        xz0Var.a = i10;
        MediaDataController.addStyleToText(new yz0(xz0Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
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

    public t41 createUrlSpan(String str) {
        return new t41(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    @Override // org.telegram.ui.ActionBar.u4
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
        yz0[] yz0VarArr = (yz0[]) text.getSpans(max, min, yz0.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < yz0VarArr.length; i15++) {
                    yz0 yz0Var = yz0VarArr[i15];
                    int i16 = yz0Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(yz0Var);
                        int spanEnd = text.getSpanEnd(yz0VarArr[i15]);
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

    public final void l(yz0 yz0Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 < 0 || (selectionEnd = this.selectionEnd) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(yz0Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (yz0Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            hi0[] hi0VarArr = (hi0[]) text.getSpans(i10, selectionEnd, hi0.class);
            for (int i11 = 0; i11 < hi0VarArr.length; i11++) {
                text.removeSpan(hi0VarArr[i11]);
                text.removeSpan(hi0VarArr[i11].s);
                fa0 fa0Var = hi0VarArr[i11].v;
                if (fa0Var != null) {
                    text.removeSpan(fa0Var);
                }
            }
            if (hi0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public void makeSelectedBold() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 1;
        l(new yz0(xz0Var, 0));
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
        hh.h0 h0Var = new hh.h0(this, i10, selectionEnd);
        gc gcVar = new gc(8);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Pattern pattern = y4.a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        int q02 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        int q03 = c6Var != null ? c6Var.q0(i12) : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.i6;
        if (c6Var != null) {
            c6Var.q0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            c6Var.q0(i18);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            c6Var.q0(i19);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.g6.Qh;
        if (c6Var != null) {
            c6Var.q0(i20);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i20, false);
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i21 = calendar.get(1);
        fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextColor(q02);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new c2(8));
        fc0 fc0Var2 = new fc0(context, c6Var);
        fc0Var2.setTextColor(q02);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0Var2.setItemCount(5);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(239);
        fc0Var2.setValue(120);
        fc0Var2.setWrapSelectorWheel(false);
        int i22 = 3;
        fc0Var2.setFormatter(new cg.p2(calendar, i21, i22));
        fc0 fc0Var3 = new fc0(context, c6Var);
        fc0Var3.setContentDescriptionCallback(new nh.c(i22));
        fc0Var3.setWrapSelectorWheel(true);
        fc0Var3.setAllItemsCount(24);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextColor(q02);
        fc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var3.setMinValue(0);
        fc0Var3.setMaxValue(23);
        fc0Var3.setFormatter(new c2(9));
        fc0 fc0Var4 = new fc0(context, c6Var);
        fc0Var4.setContentDescriptionCallback(new nh.c(4));
        fc0Var4.setWrapSelectorWheel(true);
        fc0Var4.setAllItemsCount(60);
        fc0Var4.setItemCount(5);
        fc0Var4.setTextColor(q02);
        fc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0Var4.setMinValue(0);
        fc0Var4.setMaxValue(59);
        fc0Var4.setValue(0);
        fc0Var4.setFormatter(new c2(10));
        calendar.setTimeInMillis(currentTimeMillis);
        fc0Var4.setValue(calendar.get(12));
        fc0Var3.setValue(calendar.get(11));
        fc0Var.setValue(calendar.get(5));
        fc0Var2.setValue(calendar.get(2) + 120);
        pz0 pz0Var = new pz0(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        pz0Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pz0Var.a();
        pz0Var.n(1);
        pz0Var.o(q02);
        pz0 pz0Var2 = new pz0(":", 18.0f, null);
        pz0Var2.q(AndroidUtilities.dp(100.0f));
        pz0Var2.a();
        pz0Var2.n(1);
        pz0Var2.a.setColor(q02);
        FrameLayout frameLayout = new FrameLayout(context);
        cg.p pVar = new cg.p(context, fc0Var2, fc0Var, fc0Var3, fc0Var4);
        pVar.setOrientation(1);
        frameLayout.addView(pVar, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        pVar.addView(frameLayout2, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(q02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        lh.m5 m5Var = new lh.m5(context, pz0Var2, fc0Var4, 4);
        m5Var.setOrientation(0);
        m5Var.setWeightSum(1.0f);
        pVar.addView(m5Var, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        lh.d dVar = new lh.d(context, c6Var, true);
        f1.a aVar = new f1.a(dVar, fc0Var, fc0Var2, fc0Var3, fc0Var4);
        m5Var.addView(fc0Var, h7.z5.l(0.2f, 0, 270));
        m5Var.addView(fc0Var2, h7.z5.l(0.4f, 0, 270));
        m5Var.addView(fc0Var3, h7.z5.l(0.2f, 0, 270));
        m5Var.addView(fc0Var4, h7.z5.l(0.2f, 0, 270));
        fc0Var.setOnValueChangedListener(aVar);
        fc0Var2.setOnValueChangedListener(aVar);
        fc0Var3.setOnValueChangedListener(aVar);
        fc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        pVar.addView(dVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new y1(zArr, fc0Var, fc0Var2, fc0Var3, fc0Var4, h0Var, new int[1], z2Var));
        z2Var.b(frameLayout);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        e3Var.setOnDismissListener(new e2(1, gcVar, zArr));
        e3Var.setBackgroundColor(q03);
        e3Var.fixNavigationBar(q03);
        y4.c(dVar, fc0Var, fc0Var2, fc0Var3, fc0Var4);
    }

    public void makeSelectedItalic() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 2;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedMono() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 4;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 256;
        l(new yz0(xz0Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 8;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedUnderline() {
        xz0 xz0Var = new xz0();
        xz0Var.a |= 16;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.nt, android.widget.TextView, android.view.View
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
        } catch (Exception e9) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e9);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gf.o.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                    if (t5VarArr != null) {
                        for (t5 t5Var : t5VarArr) {
                            t5Var.applyFontMetrics(getPaint().getFontMetricsInt(), k5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    gi0[] gi0VarArr = (gi0[]) getText().getSpans(max, min, gi0.class);
                    if (gi0VarArr == null || gi0VarArr.length <= 0) {
                        hi0.a(spannableStringBuilder);
                    } else {
                        gi0[] gi0VarArr2 = (gi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gi0.class);
                        for (int i11 = 0; i11 < gi0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(gi0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(gi0VarArr2[i11].a);
                        }
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
                    if (g4Var != null) {
                        g4Var.finish();
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
            } catch (Throwable th) {
                FileLog.e(th);
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

    @Override // org.telegram.ui.ActionBar.u4
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
        for (yz0 yz0Var : (yz0[]) text.getSpans(i11, min, yz0.class)) {
            xz0 xz0Var = yz0Var.b;
            int i14 = xz0Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(yz0Var);
                int spanEnd = text.getSpanEnd(yz0Var);
                text.removeSpan(yz0Var);
                if (spanStart < i11) {
                    text.setSpan(new yz0(new xz0(xz0Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new yz0(new xz0(xz0Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    xz0 xz0Var2 = new xz0(xz0Var);
                    xz0Var2.a = i15;
                    text.setSpan(new yz0(xz0Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
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

    public void setDelegate(jt jtVar) {
        this.delegate = jtVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new pz0(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, kt ktVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, ktVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.h9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lt] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ht htVar = new ht(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            htVar = new org.telegram.ui.Cells.h9(htVar, callback);
        }
        return super.startActionMode(htVar);
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
        m31 m31Var = new m31(getContext(), U != null ? U.getResourceProvider() : null);
        m31Var.W = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new vu(m31Var, 25), new pc0(19));
        }
        m31Var.Z = new ft(this, i10, selectionEnd);
        m31Var.show();
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
        int c10 = hi0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new cg.o2(this, i10, selectionEnd, runnable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, kt ktVar) {
        CharSequence charSequence;
        ?? e2Var = z11 ? new org.telegram.ui.ActionBar.e2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.N = str;
        ?? frameLayout = new FrameLayout(getContext());
        hh.o oVar = new hh.o(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vf, this.resourcesProvider));
        frameLayout.addView(oVar, h7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        org.telegram.ui.Cells.pa.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.pa.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.g6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
        h7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, h7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        cg.j jVar = new cg.j(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new gg.f(this, oVar, jVar, 25));
        oVar.addTextChangedListener(new ch.e(jVar, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e9) {
                FileLog.e(e9);
                charSequence = null;
            }
            if (charSequence != null) {
                oVar.setText(charSequence);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        jVar.run();
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.OK), new g1(19, ktVar, oVar));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new a1(this, 5));
            this.creationLinkDialog.setOnShowListener(new gt(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            e2Var.o().setOnShowListener(new gt(1, oVar));
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
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Cells.h9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lt] */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        ht htVar = new ht(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            htVar = new org.telegram.ui.Cells.h9(htVar, callback);
        }
        return super.startActionMode(htVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
