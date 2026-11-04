package ai;

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
import org.telegram.ui.Components.xs;
import org.telegram.ui.u01;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z extends xs {
    public final /* synthetic */ int Z1;
    public final /* synthetic */ Object a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.Z1 = i3;
        this.a2 = frameLayout;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.Z1) {
            case 0:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.a2;
                drawable.setBounds(0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.0f));
                drawable.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bt
    public int e() {
        switch (this.Z1) {
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
        switch (this.Z1) {
            case 2:
                if (!dh.d0.b) {
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
        switch (this.Z1) {
            case 1:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((org.telegram.ui.Cells.z5) this.a2).s) {
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

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.Z1) {
            case 1:
                super.onDraw(canvas);
                ((org.telegram.ui.Cells.z5) this.a2).getClass();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        switch (this.Z1) {
            case 1:
                super.onFocusChanged(z10, i3, rect);
                ((org.telegram.ui.Cells.z5) this.a2).i(z10);
                break;
            case 2:
                if (z10) {
                    ((yz0) this.a2).G.q();
                    org.telegram.messenger.g0.i3(new u01(this, 0), 200L);
                }
                super.onFocusChanged(z10, i3, rect);
                break;
            default:
                super.onFocusChanged(z10, i3, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.Z1) {
            case 3:
                super.onSizeChanged(i3, i10, i11, i12);
                postOnAnimation(new r4.u(this, 10));
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xs, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        ClipData primaryClip;
        switch (this.Z1) {
            case 1:
                if (i3 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && org.telegram.messenger.g0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
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
                    if (((org.telegram.ui.Cells.z5) this.a2).l(arrayList)) {
                    }
                }
                break;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Z1) {
            case 1:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((org.telegram.ui.Cells.z5) this.a2).k(this);
                    }
                    break;
                }
                break;
            case 2:
                if (motionEvent.getAction() != 1 || !((yz0) this.a2).G.u()) {
                    break;
                } else {
                    org.telegram.messenger.g0.i3(new u01(this, 1), 200L);
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        switch (this.Z1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback, i3);
                ((org.telegram.ui.Cells.z5) this.a2).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, org.telegram.ui.ActionBar.e6 e6Var, Drawable drawable) {
        super(context, e6Var);
        this.Z1 = 0;
        this.a2 = drawable;
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.Z1) {
            case 1:
                ActionMode startActionMode = super.startActionMode(callback);
                ((org.telegram.ui.Cells.z5) this.a2).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
