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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class bg extends ft {
    public kc e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ft
    public final void E() {
        cg cgVar = this.f2.H3;
        if (cgVar != null) {
            cgVar.i2();
        }
    }

    @Override // org.telegram.ui.Components.ft
    public final void F() {
        cg cgVar = this.f2.H3;
        if (cgVar != null) {
            cgVar.d();
        }
    }

    public final void J(Uri uri, String str) {
        org.telegram.ui.an anVar = this.f2.x3;
        Utilities.e.c(new yf(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), anVar != null && anVar.z()), 0));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar == null || anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(0);
        if (!chatActivityEnterView.h3) {
            PhotoViewer.p1().I2(null, anVar, chatActivityEnterView.E4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new ag(this, ffVar, file), chatActivityEnterView.x3);
        } else {
            org.telegram.messenger.g0.v1(this);
            org.telegram.messenger.g0.i3(new a9.h(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void L(ff ffVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
        if (bg0Var != null) {
            bg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.yc();
            return;
        }
        t0.h hVar = (t0.h) ffVar.b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.y3;
            org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.ez.T(cVar, null, null, c10, null, "image/gif", j3, gjVar, threadMessage2, null, chatActivityEnterView.D3, z10, ffVar, anVar != null ? anVar.Y8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.y3;
            org.telegram.messenger.gj gjVar2 = chatActivityEnterView.B3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.ez.Y(cVar2, c11, j10, gjVar2, threadMessage, ffVar, null, z10, 0, anVar != null ? anVar.Y8() : null);
        }
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.M(null, true, i7, i10, 0L);
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
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.f2.E4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar != null) {
            anVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.q0(menu);
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
            int i7 = ChatActivityEnterView.N6;
            if (!(chatActivityEnterView.J2 != null) && !chatActivityEnterView.K6) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.ft, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            chatActivityEnterView.H1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.N1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        cg cgVar = this.f2.H3;
        if (cgVar != null) {
            cgVar.m0();
        }
    }

    @Override // org.telegram.ui.Components.kt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        m60 m60Var;
        xe xeVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.I();
        }
        wd wdVar = chatActivityEnterView.R0;
        if (wdVar == null) {
            return;
        }
        boolean z10 = (chatActivityEnterView.x3 == null || (xeVar = chatActivityEnterView.F0) == null || xeVar.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
        if (wdVar.x != z10) {
            wdVar.x = z10;
            wdVar.invalidate();
        }
        if (z10 || (m60Var = chatActivityEnterView.t6) == null) {
            return;
        }
        m60Var.u();
        chatActivityEnterView.t6 = null;
    }

    @Override // org.telegram.ui.Components.ft, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.F2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.J2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.m4 && chatActivityEnterView.j4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.E0()) {
                if (this.e2 == null) {
                    kc kcVar = new kc(this);
                    this.e2 = kcVar;
                    final int i7 = 0;
                    kcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.zf
                        public final /* synthetic */ bg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i7;
                            bg bgVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = bgVar.f2;
                                    int i11 = ChatActivityEnterView.N6;
                                    chatActivityEnterView2.M1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = bgVar.f2;
                                    chatActivityEnterView3.T3 = false;
                                    chatActivityEnterView3.X0();
                                    break;
                            }
                        }
                    };
                }
                kc kcVar2 = this.e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                kcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                kcVar2.i = false;
                kcVar2.c = 0;
                kcVar2.a(rectF);
                return this.e2.b(motionEvent);
            }
            if (chatActivityEnterView.G0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.z2 != 0) {
                    chatActivityEnterView.D1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.L1(org.telegram.messenger.g0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.h4) {
                    chatActivityEnterView.X0();
                    return true;
                }
                chatActivityEnterView.E1(false, true, false, true);
                chatActivityEnterView.T3 = true;
                final int i10 = 1;
                org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.zf
                    public final /* synthetic */ bg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        bg bgVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = bgVar.f2;
                                int i11 = ChatActivityEnterView.N6;
                                chatActivityEnterView2.M1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = bgVar.f2;
                                chatActivityEnterView3.T3 = false;
                                chatActivityEnterView3.X0();
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
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.E0()) {
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

    @Override // org.telegram.ui.Components.kt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.U1.getForeground() != null) {
            st0 st0Var = chatActivityEnterView.U1;
            st0Var.invalidateDrawable(st0Var.getForeground());
        }
    }
}
