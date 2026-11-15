package bi;

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
import org.telegram.ui.Components.ft;
import org.telegram.ui.b11;
import org.telegram.ui.f01;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u extends ft {
    public final /* synthetic */ int e2;
    public final /* synthetic */ Object f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.e2 = i7;
        this.f2 = frameLayout;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.e2) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.f2;
                drawable.setBounds(0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.0f));
                drawable.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kt
    public int e() {
        switch (this.e2) {
            case 1:
                return 3;
            case 2:
            default:
                return super.e();
            case 3:
                return 3;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e2) {
            case 2:
                if (!ch.f0.b) {
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
        switch (this.e2) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.z5) this.f2).s) {
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

    @Override // org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.e2) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.z5) this.f2).getClass();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.e2) {
            case 1:
                super.onFocusChanged(z10, i7, rect);
                ((org.telegram.ui.Cells.z5) this.f2).j(z10);
                break;
            case 2:
                if (z10) {
                    ((f01) this.f2).G.q();
                    org.telegram.messenger.g0.i3(new b11(this, 0), 200L);
                }
                super.onFocusChanged(z10, i7, rect);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kt, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.e2) {
            case 3:
                super.onSizeChanged(i7, i10, i11, i12);
                postOnAnimation(new q2.d(this, 13));
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ft, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        switch (this.e2) {
            case 1:
                if (i7 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && org.telegram.messenger.g0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
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
                    if (((org.telegram.ui.Cells.z5) this.f2).m(arrayList)) {
                    }
                }
                break;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e2) {
            case 1:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((org.telegram.ui.Cells.z5) this.f2).l(this);
                    }
                    break;
                }
                break;
            case 2:
                if (motionEvent.getAction() != 1 || !((f01) this.f2).G.u()) {
                    break;
                } else {
                    org.telegram.messenger.g0.i3(new b11(this, 1), 200L);
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        switch (this.e2) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i7);
                ((org.telegram.ui.Cells.z5) this.f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, org.telegram.ui.ActionBar.e6 e6Var, Drawable drawable) {
        super(context, e6Var);
        this.e2 = 0;
        this.f2 = drawable;
    }

    @Override // org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.e2) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.z5) this.f2).h(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
