package dh;

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
import mg.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.ut;
import org.telegram.ui.j61;
import org.telegram.ui.n51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b extends ut {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(FrameLayout frameLayout, Context context, f6 f6Var, int i10) {
        super(context, f6Var);
        this.c = i10;
        this.d = frameLayout;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.c) {
            case 1:
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

    @Override // org.telegram.ui.Components.wt
    public int emojiCacheType() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
            default:
                return super.emojiCacheType();
            case 2:
                return 3;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.c) {
            case 3:
                if (!g0.b) {
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
            case 0:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection;
            case 1:
            default:
                return super.onCreateInputConnection(editorInfo);
            case 2:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                if (((b6) this.d).s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection2;
        }
    }

    @Override // org.telegram.ui.Components.ut, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.wt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.c) {
            case 2:
                super.onDraw(canvas);
                ((b6) this.d).getClass();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.c) {
            case 2:
                super.onFocusChanged(z4, i10, rect);
                ((b6) this.d).i(z4);
                break;
            case 3:
                if (z4) {
                    ((n51) this.d).y.q();
                    AndroidUtilities.runOnUIThread(new j61(this, 0), 200L);
                }
                super.onFocusChanged(z4, i10, rect);
                break;
            default:
                super.onFocusChanged(z4, i10, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wt, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.c) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                postOnAnimation(new ag.d(this, 27));
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ut, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        switch (this.c) {
            case 2:
                if (i10 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < text.length(); i11++) {
                        char charAt = text.charAt(i11);
                        if (charAt == '\n') {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            sb.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        arrayList.add(sb);
                    }
                    if (((b6) this.d).l(arrayList)) {
                    }
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.c) {
            case 2:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((b6) this.d).k(this);
                    }
                    break;
                }
                break;
            case 3:
                if (motionEvent.getAction() != 1 || !((n51) this.d).y.u()) {
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new j61(this, 1), 200L);
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ut, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        switch (this.c) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback, i10);
                ((b6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, f6 f6Var, Drawable drawable) {
        super(context, f6Var);
        this.c = 1;
        this.d = drawable;
    }

    @Override // org.telegram.ui.Components.ut, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.c) {
            case 2:
                ActionMode startActionMode = super.startActionMode(callback);
                ((b6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
