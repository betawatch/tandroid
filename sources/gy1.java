// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class gy1 extends gt3 {
    public ra1 e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.f2 = chatActivityEnterView;
    }

    @Override // gt3
    public final void E() {
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.e1();
        }
    }

    @Override // gt3
    public final void F() {
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        mu1 mu1Var = this.f2.F3;
        Utilities.e.c(new jn1(this, uri, gl.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), mu1Var != null && mu1Var.y()), (byte) 9));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var == null || mu1Var.getParentActivity() == null) {
            return;
        }
        byte b = 0;
        jm6 jm6Var = (jm6) arrayList.get(0);
        if (chatActivityEnterView.p3) {
            gl.t1(this);
            gl.d3(new ey1(this, arrayList, file, b), 100L);
        } else {
            PhotoViewer.r0().T1(null, mu1Var, chatActivityEnterView.L4);
            PhotoViewer.r0().o1(arrayList, 0, 2, false, new fy1(this, jm6Var, file), chatActivityEnterView.F3);
        }
    }

    public final void L(gi3 gi3Var, boolean z, int i, int i2) {
        k27 threadMessage;
        k27 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        j47 j47Var = chatActivityEnterView.M0;
        if (j47Var != null) {
            j47Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        bu1 bu1Var = chatActivityEnterView.L3;
        if (bu1Var != null && mu1Var != null && bu1Var.f) {
            mu1Var.ic();
            return;
        }
        fo5 fo5Var = (fo5) gi3Var.a;
        boolean hasMimeType = fo5Var.getDescription().hasMimeType("image/gif");
        j5 j5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri f = fo5Var.f();
            long j = chatActivityEnterView.G3;
            k27 k27Var = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            z3a.S(j5Var, null, null, f, null, "image/gif", j, k27Var, threadMessage2, null, chatActivityEnterView.L3, z, gi3Var, mu1Var != null ? mu1Var.Q6() : null);
        } else {
            Uri f2 = fo5Var.f();
            long j2 = chatActivityEnterView.G3;
            k27 k27Var2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            z3a.X(j5Var, f2, j2, k27Var2, threadMessage, gi3Var, null, z, 0, mu1Var != null ? mu1Var.Q6() : null);
        }
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.u(null, true, i, i2, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        boolean z = false;
        if (this.f2.b0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i2 = 4;
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i = 8;
                        }
                        i = 0;
                    } else {
                        i = 256;
                    }
                    if (!z) {
                    }
                    if (z) {
                    }
                }
                i = 4;
                if (!z) {
                }
                if (z) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i = 16;
                            }
                            i = 0;
                        } else {
                            i = 0;
                            z = true;
                        }
                    }
                    i = 4;
                } else {
                    i = 1;
                }
                if ((!z || i != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z) {
                        D(null);
                        return true;
                    }
                    if (getText() != null) {
                        int selectionStart = getSelectionStart();
                        int selectionEnd = getSelectionEnd();
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            if (selectionStart > selectionEnd) {
                                selectionEnd = selectionStart;
                                selectionStart = selectionEnd;
                            }
                            if (selectionStart < selectionEnd) {
                                if ((c(selectionStart, selectionEnd) & i) == 0) {
                                    if (i == 4) {
                                        i2 = 49435;
                                    } else if (i == 16384) {
                                        i2 = 32772;
                                    } else if (i == 32768) {
                                        i2 = 16388;
                                    }
                                    b(i2, selectionStart, selectionEnd);
                                    a(i, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i, selectionStart, selectionEnd);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final wjb getResourcesProvider() {
        return this.f2.L4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            mu1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.B0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.r7;
            if ((chatActivityEnterView.R2 != null) || chatActivityEnterView.o7) {
                au3.b(editorInfo, null);
            } else {
                au3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            }
            return ble.a(onCreateInputConnection, editorInfo, new rh1((Object) this, (byte) 12));
        } catch (Throwable th) {
            fa4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override // gt3, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.S1(lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.Y1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.B();
        }
    }

    @Override // lt3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        cs5 cs5Var;
        ex1 ex1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.r();
        }
        ew1 ew1Var = chatActivityEnterView.R0;
        if (ew1Var != null) {
            boolean z = (chatActivityEnterView.F3 == null || (ex1Var = chatActivityEnterView.F0) == null || ex1Var.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
            if (ew1Var.x != z) {
                ew1Var.x = z;
                ew1Var.invalidate();
            }
            if (z || (cs5Var = chatActivityEnterView.U6) == null) {
                return;
            }
            cs5Var.u();
            chatActivityEnterView.U6 = null;
        }
    }

    @Override // gt3, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        final byte b = 0;
        if (!chatActivityEnterView.u4 && chatActivityEnterView.r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.P0()) {
                ra1 ra1Var = this.e2;
                if (ra1Var == null) {
                    ra1Var = new ra1(this);
                    this.e2 = ra1Var;
                    ra1Var.h = new Runnable(this) { // from class: dy1
                        public final /* synthetic */ gy1 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            gy1 gy1Var = this.b;
                            switch (b2) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = gy1Var.f2;
                                    int i = ChatActivityEnterView.r7;
                                    chatActivityEnterView2.X1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = gy1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.i1();
                                    break;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                ra1Var.i = false;
                ra1Var.c = 0;
                ra1Var.a(rectF);
                return this.e2.b(motionEvent);
            }
            final byte b2 = 1;
            if (chatActivityEnterView.Q0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.O1(0, false);
                    chatActivityEnterView.V0.s(false);
                    requestFocus();
                }
                chatActivityEnterView.W1(gl.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.p4) {
                    chatActivityEnterView.i1();
                    return true;
                }
                chatActivityEnterView.P1(false, true, false, true);
                chatActivityEnterView.b4 = true;
                gl.d3(new Runnable(this) { // from class: dy1
                    public final /* synthetic */ gy1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        gy1 gy1Var = this.b;
                        switch (b22) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = gy1Var.f2;
                                int i = ChatActivityEnterView.r7;
                                chatActivityEnterView2.X1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = gy1Var.f2;
                                chatActivityEnterView3.b4 = false;
                                chatActivityEnterView3.i1();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.A0 || chatActivityEnterView.P0()) {
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = gl.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // lt3
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        cja cjaVar = this.f2.c2;
        if (cjaVar.getForeground() != null) {
            cjaVar.invalidateDrawable(cjaVar.getForeground());
        }
    }
}
