package org.telegram.ui.Components;

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
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class mg extends ot {
    public tc e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ot
    public final void E() {
        ng ngVar = this.f2.P3;
        if (ngVar != null) {
            ngVar.i2();
        }
    }

    @Override // org.telegram.ui.Components.ot
    public final void F() {
        ng ngVar = this.f2.P3;
        if (ngVar != null) {
            ngVar.g();
        }
    }

    public final void J(Uri uri, String str) {
        org.telegram.ui.bn bnVar = this.f2.F3;
        Utilities.e.c(new g(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), bnVar != null && bnVar.z()), 4));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar == null || bnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(0);
        if (!chatActivityEnterView.p3) {
            PhotoViewer.p1().I2(null, bnVar, chatActivityEnterView.M4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new lg(this, ffVar, file), chatActivityEnterView.F3);
        } else {
            org.telegram.messenger.g0.v1(this);
            org.telegram.messenger.g0.h3(new a9.h(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void L(qf qfVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
        if (eg0Var != null) {
            eg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && bnVar != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        t0.h hVar = (t0.h) qfVar.b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.G3;
            org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.az.T(cVar, null, null, c10, null, "image/gif", j3, gjVar, threadMessage2, null, chatActivityEnterView.L3, z10, qfVar, bnVar != null ? bnVar.Y8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.G3;
            org.telegram.messenger.gj gjVar2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.az.Y(cVar2, c11, j10, gjVar2, threadMessage, qfVar, null, z10, 0, bnVar != null ? bnVar.Y8() : null);
        }
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.H(null, true, i7, i10, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        boolean z10 = false;
        if (this.f2.b0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i10 = 4;
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i7 = 8;
                        }
                        i7 = 0;
                    } else {
                        i7 = 256;
                    }
                    if (!z10) {
                    }
                    if (z10) {
                    }
                }
                i7 = 4;
                if (!z10) {
                }
                if (z10) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i7 = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i7 = 16;
                            }
                            i7 = 0;
                        } else {
                            i7 = 0;
                            z10 = true;
                        }
                    }
                    i7 = 4;
                } else {
                    i7 = 1;
                }
                if ((!z10 || i7 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z10) {
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
                                if ((c(selectionStart, selectionEnd) & i7) == 0) {
                                    if (i7 == 4) {
                                        i10 = 49435;
                                    } else if (i7 == 16384) {
                                        i10 = 32772;
                                    } else if (i7 == 32768) {
                                        i10 = 16388;
                                    }
                                    b(i10, selectionStart, selectionEnd);
                                    a(i7, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i7, selectionStart, selectionEnd);
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
    public final org.telegram.ui.ActionBar.h6 getResourcesProvider() {
        return this.f2.M4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.C0(menu);
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
            int i7 = ChatActivityEnterView.s7;
            if (!(chatActivityEnterView.R2 != null) && !chatActivityEnterView.p7) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new c0(this, 17));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new c0(this, 17));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            chatActivityEnterView.T1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.Z1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        ng ngVar = this.f2.P3;
        if (ngVar != null) {
            ngVar.b0();
        }
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        a70 a70Var;
        gf gfVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.G();
        }
        fe feVar = chatActivityEnterView.R0;
        if (feVar == null) {
            return;
        }
        boolean z10 = (chatActivityEnterView.F3 == null || (gfVar = chatActivityEnterView.F0) == null || gfVar.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
        if (feVar.x != z10) {
            feVar.x = z10;
            feVar.invalidate();
        }
        if (z10 || (a70Var = chatActivityEnterView.V6) == null) {
            return;
        }
        a70Var.v();
        chatActivityEnterView.V6 = null;
    }

    @Override // org.telegram.ui.Components.ot, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.u4 && chatActivityEnterView.r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
                if (this.e2 == null) {
                    tc tcVar = new tc(this);
                    this.e2 = tcVar;
                    final int i7 = 0;
                    tcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.kg
                        public final /* synthetic */ mg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i7;
                            mg mgVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = mgVar.f2;
                                    int i11 = ChatActivityEnterView.s7;
                                    chatActivityEnterView2.Y1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = mgVar.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.j1();
                                    break;
                            }
                        }
                    };
                }
                tc tcVar2 = this.e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.i = false;
                tcVar2.c = 0;
                tcVar2.a(rectF);
                return this.e2.b(motionEvent);
            }
            if (chatActivityEnterView.S0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.P1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.X1(org.telegram.messenger.g0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.p4) {
                    chatActivityEnterView.j1();
                    return true;
                }
                chatActivityEnterView.Q1(false, true, false, true);
                chatActivityEnterView.b4 = true;
                final int i10 = 1;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.kg
                    public final /* synthetic */ mg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        mg mgVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = mgVar.f2;
                                int i11 = ChatActivityEnterView.s7;
                                chatActivityEnterView2.Y1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = mgVar.f2;
                                chatActivityEnterView3.b4 = false;
                                chatActivityEnterView3.j1();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.Q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.rt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.c2.getForeground() != null) {
            du0 du0Var = chatActivityEnterView.c2;
            du0Var.invalidateDrawable(du0Var.getForeground());
        }
    }
}
