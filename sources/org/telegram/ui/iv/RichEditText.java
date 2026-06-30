package org.telegram.ui.iv;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextCaption;

/* loaded from: classes3.dex */
public class RichEditText extends EditTextCaption {
    private boolean accentHint;
    private boolean allowNewlines;
    private boolean applyingEmptyHint;
    private boolean centerEmptyHint;
    private boolean ignoreTextChange;
    private boolean insertingNewline;
    private Listener listener;
    private boolean locked;
    private final InputFilter lockingFilter;
    private long mathDownTime;
    private float mathDownX;
    private float mathDownY;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean softEnterNewline;
    private int textColorKey;
    private int touchSlop;

    public interface Listener {

        public abstract /* synthetic */ class -CC {
            public static boolean $default$onBackspaceAtStart(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static void $default$onBackspaceOnEmpty(Listener listener, RichEditText richEditText) {
            }

            public static void $default$onEnterPressed(Listener listener, RichEditText richEditText) {
            }

            public static boolean $default$onPaste(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static boolean $default$onTab(Listener listener, RichEditText richEditText, boolean z) {
                return false;
            }

            public static void $default$onTextWillChange(Listener listener, RichEditText richEditText, int i, int i2) {
            }
        }

        boolean onBackspaceAtStart(RichEditText richEditText);

        void onBackspaceOnEmpty(RichEditText richEditText);

        void onEnterPressed(RichEditText richEditText);

        void onLockedInsert(RichEditText richEditText, CharSequence charSequence);

        boolean onPaste(RichEditText richEditText);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(RichEditText richEditText);

        void onSelectionChanged(RichEditText richEditText, int i, int i2);

        boolean onTab(RichEditText richEditText, boolean z);

        void onTextChanged(RichEditText richEditText, Editable editable);

        void onTextWillChange(RichEditText richEditText, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(View view) {
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    protected void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CharSequence lambda$new$0(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.locked || this.ignoreTextChange) {
            return null;
        }
        Listener listener = this.listener;
        if (listener != null && charSequence != null && i2 > i && i3 == i4) {
            listener.onLockedInsert(this, charSequence.subSequence(i, i2));
        }
        return spanned.subSequence(i3, i4);
    }

    public void setAccentHint(boolean z) {
        if (this.accentHint == z) {
            return;
        }
        this.accentHint = z;
        updateColors();
    }

    public void setCenterEmptyHint(boolean z) {
        if (this.centerEmptyHint == z) {
            return;
        }
        this.centerEmptyHint = z;
        if (z) {
            refreshEmptyHintGravity();
        } else {
            int dp = AndroidUtilities.dp(2.0f);
            setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshEmptyHintGravity() {
        if (this.centerEmptyHint) {
            this.applyingEmptyHint = true;
            int dp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() == 0 && getWidth() > 0 && !TextUtils.isEmpty(hint)) {
                int max = Math.max(0, Math.round(((getWidth() - (dp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + dp, getPaddingTop(), dp, getPaddingBottom());
            } else {
                super.setGravity(17);
                setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
            }
            this.applyingEmptyHint = false;
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (!this.applyingEmptyHint) {
            this.centerEmptyHint = false;
        }
        super.setGravity(i);
    }

    @Override // org.telegram.ui.Components.EditTextEffects, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        refreshEmptyHintGravity();
    }

    public RichEditText(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.lockingFilter = new InputFilter() { // from class: org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence lambda$new$0;
                lambda$new$0 = RichEditText.this.lambda$new$0(charSequence, i, i2, spanned, i3, i4);
                return lambda$new$0;
            }
        };
        this.textColorKey = Theme.key_windowBackgroundWhiteBlackText;
        this.resourcesProvider = resourcesProvider;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        ActionMode.Callback callback = new ActionMode.Callback() { // from class: org.telegram.ui.iv.RichEditText.1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        };
        setCustomSelectionActionModeCallback(callback);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(callback);
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$new$1;
                lambda$new$1 = RichEditText.lambda$new$1(view);
                return lambda$new$1;
            }
        });
        setLongClickable(false);
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean lambda$new$2;
                lambda$new$2 = RichEditText.this.lambda$new$2(textView, i, keyEvent);
                return lambda$new$2;
            }
        });
        addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.iv.RichEditText.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (RichEditText.this.ignoreTextChange || RichEditText.this.listener == null) {
                    return;
                }
                RichEditText.this.listener.onTextWillChange(RichEditText.this, i2, i3);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                RichEditText.this.refreshEmptyHintGravity();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (RichEditText.this.ignoreTextChange || RichEditText.this.listener == null) {
                    return;
                }
                if (RichEditText.this.allowNewlines || RichEditText.this.insertingNewline || RichEditText.this.softEnterNewline) {
                    RichEditText.this.listener.onTextChanged(RichEditText.this, editable);
                    return;
                }
                RichEditText.this.ignoreTextChange = true;
                boolean z = false;
                for (int length = editable.length() - 1; length >= 0; length--) {
                    if (editable.charAt(length) == '\n') {
                        editable.delete(length, length + 1);
                        z = true;
                    }
                }
                RichEditText.this.ignoreTextChange = false;
                if (z) {
                    RichEditText.this.listener.onEnterPressed(RichEditText.this);
                } else {
                    RichEditText.this.listener.onTextChanged(RichEditText.this, editable);
                }
            }
        });
        updateColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
        Listener listener;
        if (i != 5 || (listener = this.listener) == null || this.allowNewlines) {
            return false;
        }
        if (this.softEnterNewline) {
            insertNewlineAtSelection();
            return true;
        }
        listener.onEnterPressed(this);
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    protected Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setAllowNewlines(boolean z) {
        this.allowNewlines = z;
    }

    public void setSoftEnterNewline(boolean z) {
        this.softEnterNewline = z;
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        InputMethodManager inputMethodManager;
        boolean z = getInputType() != i;
        super.setInputType(i);
        if (z && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setTextSilently(CharSequence charSequence) {
        this.ignoreTextChange = true;
        setText(charSequence);
        setSelection(length());
        this.ignoreTextChange = false;
    }

    public void deleteToEndSilently(int i) {
        Editable text = getText();
        if (text == null || i < 0 || i >= text.length()) {
            return;
        }
        this.ignoreTextChange = true;
        text.delete(i, text.length());
        this.ignoreTextChange = false;
    }

    public void appendSilently(CharSequence charSequence) {
        Editable text = getText();
        if (text == null || charSequence == null || charSequence.length() == 0) {
            return;
        }
        this.ignoreTextChange = true;
        text.append(charSequence);
        this.ignoreTextChange = false;
    }

    public void setTextColorKey(int i) {
        this.textColorKey = i;
        updateColors();
    }

    public void updateColors() {
        setTextColor(Theme.getColor(this.textColorKey, this.resourcesProvider));
        setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
        setHintTextColor(this.accentHint ? Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), 0.5f) : Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider));
        setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        setHandlesColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider));
    }

    public void setLocked(boolean z) {
        boolean z2;
        if (this.locked == z) {
            return;
        }
        this.locked = z;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (filters[i] == this.lockingFilter) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && !z2) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = this.lockingFilter;
            setFilters(inputFilterArr);
        }
        setCursorVisible(!z);
    }

    public void requestEditFocus() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRequestWindowFocusable(this, true);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MathSpan mathSpanAt;
        if (motionEvent.getAction() == 0 && this.listener != null && isEnabled() && isFocusable()) {
            this.listener.onRequestWindowFocusable(this, true);
        }
        if (!this.locked) {
            if (motionEvent.getAction() == 0) {
                this.mathDownX = motionEvent.getX();
                this.mathDownY = motionEvent.getY();
                this.mathDownTime = motionEvent.getEventTime();
            } else if (motionEvent.getAction() == 1) {
                if (this.touchSlop == 0) {
                    this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                }
                float x = motionEvent.getX() - this.mathDownX;
                float y = motionEvent.getY() - this.mathDownY;
                float f = (x * x) + (y * y);
                int i = this.touchSlop;
                if (f <= i * i && motionEvent.getEventTime() - this.mathDownTime < ViewConfiguration.getLongPressTimeout() && (mathSpanAt = mathSpanAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    openMathEditor(mathSpanAt);
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private MathSpan mathSpanAt(float f, float f2) {
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0) {
            int lineForVertical = layout.getLineForVertical((int) ((f2 - getTotalPaddingTop()) + getScrollY()));
            float totalPaddingLeft = (f - getTotalPaddingLeft()) + getScrollX();
            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                for (MathSpan mathSpan : (MathSpan[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), MathSpan.class)) {
                    int spanStart = text.getSpanStart(mathSpan);
                    int spanEnd = text.getSpanEnd(mathSpan);
                    if (spanStart >= 0 && spanEnd >= 0) {
                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                            return mathSpan;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void openMathEditor(final MathSpan mathSpan) {
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), mathSpan.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditText.this.lambda$openMathEditor$3(mathSpan, (String) obj);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openMathEditor$3(MathSpan mathSpan, String str) {
        MathSpan create;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Editable text = getText();
        int spanStart = text.getSpanStart(mathSpan);
        int spanEnd = text.getSpanEnd(mathSpan);
        if (spanStart < 0 || spanEnd < 0 || (create = MathSpan.create(str, getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) == null) {
            return;
        }
        boolean z = this.locked;
        if (z) {
            setLocked(false);
        }
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(create, 0, 1, 33);
        int max = Math.max(0, Math.min(spanStart, length()));
        text.replace(max, Math.max(max, Math.min(spanEnd, length())), spannableString);
        setSelection(Math.min(max + 1, length()));
        if (z) {
            setLocked(true);
        }
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Listener listener;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (listener = this.listener) != null) {
                listener.onTab(this, keyEvent.isShiftPressed());
            }
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 66 || keyCode == 160) && this.listener != null && !this.allowNewlines) {
            if (keyEvent.getAction() == 0) {
                boolean z = (keyEvent.getFlags() & 2) != 0;
                if (this.softEnterNewline && (z || keyEvent.isShiftPressed())) {
                    insertNewlineAtSelection();
                } else {
                    this.listener.onEnterPressed(this);
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && this.listener != null) {
            if (length() == 0) {
                this.listener.onBackspaceOnEmpty(this);
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.listener.onBackspaceAtStart(this)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void insertNewlineAtSelection() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.insertingNewline = true;
        getText().replace(max, max2, "\n");
        this.insertingNewline = false;
        setSelection(max + 1);
    }

    @Override // org.telegram.ui.Components.EditTextCaption, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        Listener listener;
        Listener listener2;
        if (i == 16908319 && (listener2 = this.listener) != null && listener2.onSelectAll(this)) {
            return true;
        }
        if (i == 16908322 && (listener = this.listener) != null && listener.onPaste(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextEffects, android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSelectionChanged(this, i, i2);
        }
    }

    @Override // org.telegram.ui.Components.EditTextCaption, org.telegram.ui.ActionBar.FloatingToolbar.StyleDelegate
    public int getCurrentStyle(int i, int i2) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i)) < (min = Math.min(i2, text.length()))) {
            return RichTextStyle.stylesFullyCovering(text, max, min);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextCaption, org.telegram.ui.ActionBar.FloatingToolbar.StyleDelegate
    public void addStyle(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        RichTextStyle.setStyle(text, i2, min, i, true);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.EditTextCaption, org.telegram.ui.ActionBar.FloatingToolbar.StyleDelegate
    public void removeStyle(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        RichTextStyle.setStyle(text, i2, min, i, false);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }
}
