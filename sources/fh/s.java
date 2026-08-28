package fh;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mt;
import org.telegram.ui.o51;
import org.telegram.ui.s41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends mt {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.c = i9;
        this.d = frameLayout;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.c) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.0f));
                drawable.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ot
    public int emojiCacheType() {
        switch (this.c) {
            case 1:
                return 3;
            case 2:
            default:
                return super.emojiCacheType();
            case 3:
                return 3;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.c) {
            case 2:
                if (!hg.h0.b) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.c) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.c6) this.d).s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection;
            case 2:
            default:
                return super.onCreateInputConnection(editorInfo);
            case 3:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection2;
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.c) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.c6) this.d).getClass();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        switch (this.c) {
            case 1:
                super.onFocusChanged(z10, i9, rect);
                ((org.telegram.ui.Cells.c6) this.d).i(z10);
                break;
            case 2:
                if (z10) {
                    ((s41) this.d).y.q();
                    AndroidUtilities.runOnUIThread(new o51(this, 0), 200L);
                }
                super.onFocusChanged(z10, i9, rect);
                break;
            default:
                super.onFocusChanged(z10, i9, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.c) {
            case 3:
                super.onSizeChanged(i9, i10, i11, i12);
                postOnAnimation(new pf.o1(this, 22));
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i9) {
        ClipData primaryClip;
        switch (this.c) {
            case 1:
                if (i9 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < text.length(); i10++) {
                        char charAt = text.charAt(i10);
                        if (charAt == '\n') {
                            arrayList.add(sb2.toString());
                            sb2.setLength(0);
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        arrayList.add(sb2);
                    }
                    if (((org.telegram.ui.Cells.c6) this.d).l(arrayList)) {
                    }
                }
                break;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.c) {
            case 1:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((org.telegram.ui.Cells.c6) this.d).k(this);
                    }
                    break;
                }
                break;
            case 2:
                if (motionEvent.getAction() != 1 || !((s41) this.d).y.u()) {
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new o51(this, 1), 200L);
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i9) {
        switch (this.c) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i9);
                ((org.telegram.ui.Cells.c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, org.telegram.ui.ActionBar.b6 b6Var, Drawable drawable) {
        super(context, b6Var);
        this.c = 0;
        this.d = drawable;
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.c) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
